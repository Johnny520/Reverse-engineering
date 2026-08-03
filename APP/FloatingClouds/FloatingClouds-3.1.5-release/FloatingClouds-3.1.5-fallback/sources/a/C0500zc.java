package a;

/* JADX INFO: renamed from: a.zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0500zc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f779a = 0;
    public static final int b = 0;

    static {
            int r0 = androidx.customview.poolingcontainer.R.id.pooling_container_listener_holder_tag
            a.C0500zc.f779a = r0
            int r0 = androidx.customview.poolingcontainer.R.id.is_pooling_container_tag
            a.C0500zc.b = r0
            return
    }

    public static final void a(android.view.View r3) {
            java.lang.String r0 = "<this>"
            a.C0193i9.e(r3, r0)
            a.Cg r0 = new a.Cg
            r1 = 0
            r0.<init>(r3, r1)
            a.Qd r3 = new a.Qd
            r3.<init>()
            a.a4 r0 = a.C0435w1.j(r3, r3, r0)
            r3.d = r0
        L16:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r0 = r3.next()
            android.view.View r0 = (android.view.View) r0
            int r1 = a.C0500zc.f779a
            java.lang.Object r2 = r0.getTag(r1)
            a.Bc r2 = (a.Bc) r2
            if (r2 != 0) goto L34
            a.Bc r2 = new a.Bc
            r2.<init>()
            r0.setTag(r1, r2)
        L34:
            java.util.ArrayList<a.Ac> r0 = r2.f31a
            int r1 = a.C0294o3.c0(r0)
        L3a:
            r2 = -1
            if (r2 >= r1) goto L16
            java.lang.Object r2 = r0.get(r1)
            a.Ac r2 = (a.Ac) r2
            r2.a()
            int r1 = r1 + (-1)
            goto L3a
        L49:
            return
    }
}
