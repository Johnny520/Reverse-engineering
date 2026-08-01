package defpackage;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public abstract class hh {
    public static boolean a(AbsListView r0) {
        return r0.isSelectedChildViewEnabled();
    }

    public static void b(AbsListView r0, boolean r1) {
        r0.setSelectedChildViewEnabled(r1);
    }
}
