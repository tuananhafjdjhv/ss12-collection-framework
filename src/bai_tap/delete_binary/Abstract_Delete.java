package bai_tap.delete_binary;

import thuc_hanh.tim_kiem_nhi_phan.TreeNode;

public abstract class Abstract_Delete<E> implements Tree_Delete<E> {
   public abstract TreeNode_Delete<E> delete(E e);
}
