
package com.abc.board.model.controller;

import com.abc.board.model.dto.CommentDTO;
import com.abc.board.model.dto.PostDTO;
import com.abc.board.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/posts")
public class PostRestfulController {

    private final BoardService boardService;

    public PostRestfulController(BoardService boardService) {
        this.boardService = boardService;
    }

    // 전체 게시글 조회
    @GetMapping
    public ResponseEntity<List<PostDTO>> getPostList() {
        List<PostDTO> posts = boardService.findAllPosts();
        return ResponseEntity.ok(posts);
    }

//    // 특정 게시글 조회 (댓글 포함)
//    @GetMapping("/{postId}")
//    public ResponseEntity<PostDTO> getPostDetail(@PathVariable int postId) {
//        PostDTO post = boardService.findOnePost(postId);
//        List<CommentDTO> comments = boardService.findCommentsByPostId(postId);
//        post.setComments(comments); // PostDTO에 comments 필드가 있다고 가정
//        return ResponseEntity.ok(post);
//    }
//
//    // 게시글 등록
//    @PostMapping
//    public ResponseEntity<PostDTO> createPost(@RequestBody PostDTO postDTO) {
//        boardService.addPost(postDTO);
//        return ResponseEntity.ok(postDTO);
//    }
//
//    // 게시글 수정
//    @PutMapping("/{postId}")
//    public ResponseEntity<PostDTO> updatePost(@PathVariable int postId, @RequestBody PostDTO postDTO) {
//        postDTO.setId(postId); // PostDTO에 id 필드 있다고 가정
//        boardService.updatePost(postDTO);
//        return ResponseEntity.ok(postDTO);
//    }
//
//    // 게시글 삭제
//    @DeleteMapping("/{postId}")
//    public ResponseEntity<Void> deletePost(@PathVariable int postId) {
//        PostDTO postDTO = new PostDTO();
//        postDTO.setId(postId);
//        boardService.deletePost(postDTO);
//        return ResponseEntity.noContent().build();
//    }
}
