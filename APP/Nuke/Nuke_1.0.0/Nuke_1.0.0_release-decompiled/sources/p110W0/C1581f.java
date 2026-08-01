package p110W0;

import com.bumptech.glide.AbstractC1926h;
import p000A.C0038T0;
import p000A.C0049a;
import p000A.C0066i0;
import p002A1.C0115D;
import p074O2.C1052j;
import p128a.AbstractC1785a;
import p130a1.AbstractC1795h;
import p160f3.AbstractC2162v;
import p160f3.C2140i0;
import p166g3.C2187d;

/* JADX INFO: renamed from: W0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1581f implements InterfaceC1580e {

    /* JADX INFO: renamed from: a */
    public final C0115D f5492a;

    /* JADX INFO: renamed from: b */
    public final C1576a f5493b;

    /* JADX INFO: renamed from: c */
    public final C0038T0 f5494c;

    /* JADX INFO: renamed from: d */
    public final C1584i f5495d;

    /* JADX INFO: renamed from: e */
    public final C0066i0 f5496e;

    public C1581f(C0115D c0115d, C1576a c1576a) {
        C0038T0 c0038t0 = AbstractC1582g.f5497a;
        C0038T0 c0038t02 = AbstractC1582g.f5497a;
        C1584i c1584i = new C1584i();
        C1583h c1583h = C1584i.f5498a;
        C2187d c2187d = AbstractC1795h.f6130a;
        c1583h.getClass();
        AbstractC2162v.m3979a(AbstractC1785a.m3254o(c1583h, c2187d).mo1168m(C1052j.f3286d).mo1168m(new C2140i0(null)));
        C0066i0 c0066i0 = new C0066i0(25);
        this.f5492a = c0115d;
        this.f5493b = c1576a;
        this.f5494c = c0038t0;
        this.f5495d = c1584i;
        this.f5496e = c0066i0;
        new C0049a(15, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0 A[Catch: Exception -> 0x00a8, TRY_ENTER, TryCatch #1 {Exception -> 0x00a8, blocks: (B:25:0x0042, B:27:0x0055, B:30:0x005a, B:32:0x005e, B:38:0x0077, B:55:0x00a0, B:56:0x00a7, B:34:0x0067, B:35:0x0069, B:36:0x006c, B:37:0x0072), top: B:64:0x0042 }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p110W0.C1594s m2853a(p110W0.C1593r r7) {
        /*
            r6 = this;
            A.T0 r0 = r6.f5494c
            java.lang.Object r1 = r0.f169e
            W0.b r1 = (p110W0.C1577b) r1
            monitor-enter(r1)
            java.lang.Object r2 = r0.f170f     // Catch: java.lang.Throwable -> L3c
            k.q r2 = (p186k.C2435q) r2     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r2.m4326a(r7)     // Catch: java.lang.Throwable -> L3c
            W0.s r2 = (p110W0.C1594s) r2     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L41
            boolean r3 = r2.f5521e     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L19
            monitor-exit(r1)
            return r2
        L19:
            java.lang.Object r2 = r0.f170f     // Catch: java.lang.Throwable -> L3c
            k.q r2 = (p186k.C2435q) r2     // Catch: java.lang.Throwable -> L3c
            k4.a r3 = r2.f7863c     // Catch: java.lang.Throwable -> L3c
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L3c
            Y1.n r4 = r2.f7862b     // Catch: java.lang.Throwable -> L36
            r4.getClass()     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r4.f6028e     // Catch: java.lang.Throwable -> L36
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4     // Catch: java.lang.Throwable -> L36
            java.lang.Object r4 = r4.remove(r7)     // Catch: java.lang.Throwable -> L36
            if (r4 == 0) goto L38
            int r5 = r2.f7864d     // Catch: java.lang.Throwable -> L36
            int r5 = r5 + (-1)
            r2.f7864d = r5     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            r7 = move-exception
            goto L3f
        L38:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3c
            W0.s r4 = (p110W0.C1594s) r4     // Catch: java.lang.Throwable -> L3c
            goto L41
        L3c:
            r7 = move-exception
            goto Lb1
        L3f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3c
            throw r7     // Catch: java.lang.Throwable -> L3c
        L41:
            monitor-exit(r1)
            W0.i r1 = r6.f5495d     // Catch: java.lang.Exception -> La8
            r1.getClass()     // Catch: java.lang.Exception -> La8
            W0.q r1 = r7.f5515a     // Catch: java.lang.Exception -> La8
            A.i0 r2 = r6.f5496e     // Catch: java.lang.Exception -> La8
            java.lang.Object r2 = r2.f297e     // Catch: java.lang.Exception -> La8
            W0.b r2 = (p110W0.C1577b) r2     // Catch: java.lang.Exception -> La8
            int r3 = r7.f5517c     // Catch: java.lang.Exception -> La8
            W0.l r4 = r7.f5516b     // Catch: java.lang.Exception -> La8
            if (r1 == 0) goto L67
            boolean r5 = r1 instanceof p110W0.C1578c     // Catch: java.lang.Exception -> La8
            if (r5 == 0) goto L5a
            goto L67
        L5a:
            boolean r5 = r1 instanceof p110W0.C1589n     // Catch: java.lang.Exception -> La8
            if (r5 == 0) goto L65
            W0.n r1 = (p110W0.C1589n) r1     // Catch: java.lang.Exception -> La8
            android.graphics.Typeface r1 = r2.m2851r(r1, r4, r3)     // Catch: java.lang.Exception -> La8
            goto L77
        L65:
            r1 = 0
            goto L7d
        L67:
            int r1 = r2.f5491d     // Catch: java.lang.Exception -> La8
            switch(r1) {
                case 2: goto L72;
                default: goto L6c;
            }     // Catch: java.lang.Exception -> La8
        L6c:
            r1 = 0
            android.graphics.Typeface r1 = p110W0.C1577b.m2847q(r1, r4, r3)     // Catch: java.lang.Exception -> La8
            goto L77
        L72:
            r1 = 0
            android.graphics.Typeface r1 = p110W0.C1577b.m2846o(r1, r4, r3)     // Catch: java.lang.Exception -> La8
        L77:
            W0.s r2 = new W0.s     // Catch: java.lang.Exception -> La8
            r2.<init>(r1)     // Catch: java.lang.Exception -> La8
            r1 = r2
        L7d:
            if (r1 == 0) goto La0
            java.lang.Object r2 = r0.f169e
            W0.b r2 = (p110W0.C1577b) r2
            monitor-enter(r2)
            java.lang.Object r3 = r0.f170f     // Catch: java.lang.Throwable -> L9a
            k.q r3 = (p186k.C2435q) r3     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r3 = r3.m4326a(r7)     // Catch: java.lang.Throwable -> L9a
            if (r3 != 0) goto L9c
            boolean r3 = r1.f5521e     // Catch: java.lang.Throwable -> L9a
            if (r3 == 0) goto L9c
            java.lang.Object r0 = r0.f170f     // Catch: java.lang.Throwable -> L9a
            k.q r0 = (p186k.C2435q) r0     // Catch: java.lang.Throwable -> L9a
            r0.m4327b(r7, r1)     // Catch: java.lang.Throwable -> L9a
            goto L9c
        L9a:
            r7 = move-exception
            goto L9e
        L9c:
            monitor-exit(r2)
            return r1
        L9e:
            monitor-exit(r2)
            throw r7
        La0:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> La8
            java.lang.String r0 = "Could not load font"
            r7.<init>(r0)     // Catch: java.lang.Exception -> La8
            throw r7     // Catch: java.lang.Exception -> La8
        La8:
            r7 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not load font"
            r0.<init>(r1, r7)
            throw r0
        Lb1:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p110W0.C1581f.m2853a(W0.r):W0.s");
    }

    /* JADX INFO: renamed from: b */
    public final C1594s m2854b(AbstractC1592q abstractC1592q, C1587l c1587l, int i5, int i6) {
        C1576a c1576a = this.f5493b;
        c1576a.getClass();
        int i7 = c1576a.f5490d;
        C1587l c1587l2 = (i7 == 0 || i7 == Integer.MAX_VALUE) ? c1587l : new C1587l(AbstractC1926h.m3568k(c1587l.f5507d + i7, 1, 1000));
        this.f5492a.getClass();
        return m2853a(new C1593r(abstractC1592q, c1587l2, i5, i6, null));
    }
}
