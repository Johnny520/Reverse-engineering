package com.bumptech.glide.manager;

import Yue.InterfaceC6391;
import com.bumptech.glide.RequestManager;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class EmptyRequestManagerTreeNode implements RequestManagerTreeNode {
    @Override // com.bumptech.glide.manager.RequestManagerTreeNode
    @InterfaceC6391
    public Set<RequestManager> getDescendants() {
        return Collections.emptySet();
    }
}
