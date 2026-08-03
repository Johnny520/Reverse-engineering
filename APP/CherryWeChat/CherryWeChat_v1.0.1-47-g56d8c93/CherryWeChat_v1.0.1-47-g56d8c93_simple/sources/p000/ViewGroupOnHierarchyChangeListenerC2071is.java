package p000;

import android.view.View;
import android.view.ViewGroup;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: is */
/* JADX INFO: loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC2071is implements ViewGroup.OnHierarchyChangeListener {
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View r2, View r3) {
        if (r3 == null) goto L5;
        r3.setBackground(null);
        r3.setTag(R.id.tag_view_bg_ban, Object.class);
        return;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View r1, View r2) {
    }
}
