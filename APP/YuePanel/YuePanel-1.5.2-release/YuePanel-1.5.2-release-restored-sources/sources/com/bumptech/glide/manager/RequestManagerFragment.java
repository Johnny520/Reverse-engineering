package com.bumptech.glide.manager;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.app.Fragment;
import com.bumptech.glide.RequestManager;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RequestManagerFragment extends Fragment {
    @InterfaceC6490
    @Deprecated
    public RequestManager getRequestManager() {
        return null;
    }

    @InterfaceC6391
    @Deprecated
    public RequestManagerTreeNode getRequestManagerTreeNode() {
        return new RequestManagerTreeNode() { // from class: com.bumptech.glide.manager.RequestManagerFragment.1
            @Override // com.bumptech.glide.manager.RequestManagerTreeNode
            @InterfaceC6391
            public Set<RequestManager> getDescendants() {
                return Collections.emptySet();
            }
        };
    }

    @Deprecated
    public void setRequestManager(@InterfaceC6490 RequestManager requestManager) {
    }
}
