package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ia0 {
    public static final java.util.ArrayList d = null;
    public java.util.WeakHashMap a;
    public android.util.SparseArray b;
    public java.lang.ref.WeakReference c;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            defpackage.ia0.d = r0
            return
    }

    public final android.view.View a(android.view.View r4) {
            r3 = this;
            java.util.WeakHashMap r0 = r3.a
            if (r0 == 0) goto L49
            boolean r0 = r0.containsKey(r4)
            if (r0 != 0) goto Lb
            goto L49
        Lb:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L28
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r0.getChildCount()
            int r1 = r1 + (-1)
        L18:
            if (r1 < 0) goto L28
            android.view.View r2 = r0.getChildAt(r1)
            android.view.View r2 = r3.a(r2)
            if (r2 == 0) goto L25
            return r2
        L25:
            int r1 = r1 + (-1)
            goto L18
        L28:
            r0 = 2131296652(0x7f09018c, float:1.8211227E38)
            java.lang.Object r4 = r4.getTag(r0)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L49
            int r0 = r4.size()
            int r0 = r0 + (-1)
            if (r0 >= 0) goto L3c
            goto L49
        L3c:
            java.lang.Object r4 = r4.get(r0)
            r4.getClass()
            java.lang.ClassCastException r4 = new java.lang.ClassCastException
            r4.<init>()
            throw r4
        L49:
            r4 = 0
            return r4
    }
}
