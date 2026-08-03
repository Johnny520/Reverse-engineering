package a;

/* JADX INFO: loaded from: classes.dex */
public class Qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f233a;
    public int b;
    public int c;
    public java.lang.Object d;

    public Qe() {
            r1 = this;
            r1.<init>()
            a.n9 r0 = a.C0282n9.f600a
            if (r0 != 0) goto Le
            a.n9 r0 = new a.n9
            r0.<init>()
            a.C0282n9.f600a = r0
        Le:
            return
    }

    public int a(int r3) {
            r2 = this;
            int r0 = r2.c
            if (r3 >= r0) goto L10
            java.lang.Object r0 = r2.d
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r1 = r2.b
            int r1 = r1 + r3
            short r3 = r0.getShort(r1)
            return r3
        L10:
            r3 = 0
            return r3
    }

    public void b() {
            r4 = this;
            int r0 = r4.c
            java.lang.Object r1 = r4.d
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getTop()
            int r3 = r4.f233a
            int r2 = r2 - r3
            int r0 = r0 - r2
            java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
            r1.offsetTopAndBottom(r0)
            int r0 = r1.getLeft()
            int r2 = r4.b
            int r0 = r0 - r2
            int r0 = 0 - r0
            r1.offsetLeftAndRight(r0)
            return
    }
}
