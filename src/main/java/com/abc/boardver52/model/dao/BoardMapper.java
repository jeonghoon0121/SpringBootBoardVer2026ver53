package com.abc.boardver52.model.dao;


import com.abc.boardver52.model.dto.BoardDTO;
import com.abc.boardver52.model.dto.CommentDTO;
import com.abc.boardver52.model.dto.PostDTO;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface BoardMapper {
    List<BoardDTO> findAllBoards();
    List<PostDTO> findAllPosts();
    List<CommentDTO> findAllComments();
    BoardDTO findOneBoard(int boardId);
    PostDTO findOnePost(int postId);
    CommentDTO findOneComment(int commentId);

    void addNewPost(PostDTO postDTO);
    void updatePost(PostDTO postDTO);
    void deletePost(PostDTO postDTO);

    void addComment(CommentDTO commentDTO);
    void updateComment(CommentDTO commentDTO);
    void deleteComment(CommentDTO commentDTO);

}
