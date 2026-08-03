package com.bumptech.glide.manager;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.RequestManager;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SupportRequestManagerFragment extends Fragment {
    @InterfaceC6490
    @Deprecated
    public RequestManager getRequestManager() {
        return null;
    }

    @InterfaceC6391
    @Deprecated
    public RequestManagerTreeNode getRequestManagerTreeNode() {
        return new EmptyRequestManagerTreeNode();
    }

    @Deprecated
    public void setRequestManager(@InterfaceC6490 RequestManager requestManager) {
    }
}
