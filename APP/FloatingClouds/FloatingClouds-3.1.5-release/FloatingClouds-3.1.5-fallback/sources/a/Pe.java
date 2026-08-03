package a;

/* JADX INFO: loaded from: classes.dex */
public class Pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f212a;
    public java.nio.ByteBuffer b;
    public int c;
    public int d;
    public final a.AbstractC0054ag e;

    public Pe() {
            r1 = this;
            r1.<init>()
            a.bg r0 = a.AbstractC0054ag.f405a
            if (r0 != 0) goto Le
            a.bg r0 = new a.bg
            r0.<init>()
            a.AbstractC0054ag.f405a = r0
        Le:
            a.bg r0 = a.AbstractC0054ag.f405a
            r1.e = r0
            return
    }

    public final int a(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.b
            int r0 = r0.getInt(r2)
            int r0 = r0 + r2
            return r0
    }

    public final int b(int r3) {
            r2 = this;
            int r0 = r2.d
            if (r3 >= r0) goto Le
            java.nio.ByteBuffer r0 = r2.b
            int r1 = r2.c
            int r1 = r1 + r3
            short r3 = r0.getShort(r1)
            return r3
        Le:
            r3 = 0
            return r3
    }

    public final void c(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.b = r2
            if (r2 == 0) goto L16
            r0.f212a = r1
            int r2 = r2.getInt(r1)
            int r1 = r1 - r2
            r0.c = r1
            java.nio.ByteBuffer r2 = r0.b
            short r1 = r2.getShort(r1)
            r0.d = r1
            return
        L16:
            r1 = 0
            r0.f212a = r1
            r0.c = r1
            r0.d = r1
            return
    }

    public final java.lang.String d(int r4) {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.b
            int r1 = r0.getInt(r4)
            int r1 = r1 + r4
            int r4 = r0.getInt(r1)
            int r1 = r1 + 4
            a.ag r2 = r3.e
            java.lang.String r4 = r2.a(r0, r1, r4)
            return r4
    }

    public final int e(int r2) {
            r1 = this;
            int r0 = r1.f212a
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = r1.b
            int r0 = r0.getInt(r2)
            int r0 = r0 + r2
            int r0 = r0 + 4
            return r0
    }

    public final int f(int r2) {
            r1 = this;
            int r0 = r1.f212a
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = r1.b
            int r0 = r0.getInt(r2)
            int r0 = r0 + r2
            java.nio.ByteBuffer r2 = r1.b
            int r2 = r2.getInt(r0)
            return r2
    }
}
