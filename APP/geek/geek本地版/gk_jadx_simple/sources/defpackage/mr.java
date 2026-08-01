package defpackage;

import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public abstract class mr {
    public static boolean a(ListView r0, int r1) {
        return r0.canScrollList(r1);
    }

    public static void b(ListView r0, int r1) {
        r0.scrollListBy(r1);
    }
}
