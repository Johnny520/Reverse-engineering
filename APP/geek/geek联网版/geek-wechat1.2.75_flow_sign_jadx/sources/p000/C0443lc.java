package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: lc */
/* JADX INFO: loaded from: classes.dex */
public final class C0443lc {

    /* JADX INFO: renamed from: b */
    public final C0925yc f2991b;

    /* JADX INFO: renamed from: c */
    public final int f2992c;

    /* JADX INFO: renamed from: d */
    public C0443lc f2993d;

    /* JADX INFO: renamed from: g */
    public h40 f2996g;

    /* JADX INFO: renamed from: a */
    public HashSet f2990a = null;

    /* JADX INFO: renamed from: e */
    public int f2994e = 0;

    /* JADX INFO: renamed from: f */
    public int f2995f = -1;

    public C0443lc(C0925yc c0925yc, int i) {
        this.f2991b = c0925yc;
        this.f2992c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m1751a(C0443lc c0443lc, int i) {
        m1752b(c0443lc, i, -1, false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1752b(C0443lc c0443lc, int i, int i2, boolean z) {
        if (c0443lc == null) {
            m1758h();
            return true;
        }
        if (!z && !m1757g(c0443lc)) {
            return false;
        }
        this.f2993d = c0443lc;
        if (c0443lc.f2990a == null) {
            c0443lc.f2990a = new HashSet();
        }
        this.f2993d.f2990a.add(this);
        if (i > 0) {
            this.f2994e = i;
        } else {
            this.f2994e = 0;
        }
        this.f2995f = i2;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final int m1753c() {
        C0443lc c0443lc;
        if (this.f2991b.f5392V == 8) {
            return 0;
        }
        int i = this.f2995f;
        return (i <= -1 || (c0443lc = this.f2993d) == null || c0443lc.f2991b.f5392V != 8) ? this.f2994e : i;
    }

    /* JADX INFO: renamed from: d */
    public final C0443lc m1754d() {
        int i = this.f2992c;
        int iM1158u = g40.m1158u(i);
        C0925yc c0925yc = this.f2991b;
        switch (iM1158u) {
            case Base64.DEFAULT /* 0 */:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case Base64.NO_PADDING /* 1 */:
                return c0925yc.f5425z;
            case Base64.NO_WRAP /* 2 */:
                return c0925yc.f5371A;
            case 3:
                return c0925yc.f5423x;
            case 4:
                return c0925yc.f5424y;
            default:
                throw new AssertionError(g40.m1157t(i));
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1755e() {
        HashSet hashSet = this.f2990a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0443lc) it.next()).m1754d().m1756f()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1756f() {
        return this.f2993d != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005e A[RETURN] */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1757g(p000.C0443lc r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L5
            goto L60
        L5:
            yc r1 = r9.f2991b
            int r9 = r9.f2992c
            r2 = 6
            int r3 = r8.f2992c
            r4 = 1
            if (r9 != r3) goto L1c
            if (r3 != r2) goto L5e
            boolean r9 = r1.f5422w
            if (r9 == 0) goto L60
            yc r9 = r8.f2991b
            boolean r9 = r9.f5422w
            if (r9 != 0) goto L5e
            goto L60
        L1c:
            int r5 = p000.g40.m1158u(r3)
            r6 = 8
            r7 = 9
            switch(r5) {
                case 0: goto L60;
                case 1: goto L4c;
                case 2: goto L38;
                case 3: goto L4c;
                case 4: goto L38;
                case 5: goto L60;
                case 6: goto L31;
                case 7: goto L60;
                case 8: goto L60;
                default: goto L27;
            }
        L27:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.String r0 = p000.g40.m1157t(r3)
            r9.<init>(r0)
            throw r9
        L31:
            if (r9 == r2) goto L60
            if (r9 == r6) goto L60
            if (r9 == r7) goto L60
            goto L5e
        L38:
            r2 = 3
            if (r9 == r2) goto L41
            r2 = 5
            if (r9 != r2) goto L3f
            goto L41
        L3f:
            r2 = r0
            goto L42
        L41:
            r2 = r4
        L42:
            boolean r1 = r1 instanceof p000.C0418ko
            if (r1 == 0) goto L4b
            if (r2 != 0) goto L5e
            if (r9 != r7) goto L60
            goto L5e
        L4b:
            return r2
        L4c:
            r2 = 2
            if (r9 == r2) goto L55
            r2 = 4
            if (r9 != r2) goto L53
            goto L55
        L53:
            r2 = r0
            goto L56
        L55:
            r2 = r4
        L56:
            boolean r1 = r1 instanceof p000.C0418ko
            if (r1 == 0) goto L5f
            if (r2 != 0) goto L5e
            if (r9 != r6) goto L60
        L5e:
            return r4
        L5f:
            return r2
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0443lc.m1757g(lc):boolean");
    }

    /* JADX INFO: renamed from: h */
    public final void m1758h() {
        HashSet hashSet;
        C0443lc c0443lc = this.f2993d;
        if (c0443lc != null && (hashSet = c0443lc.f2990a) != null) {
            hashSet.remove(this);
        }
        this.f2993d = null;
        this.f2994e = 0;
        this.f2995f = -1;
    }

    /* JADX INFO: renamed from: i */
    public final void m1759i() {
        h40 h40Var = this.f2996g;
        if (h40Var == null) {
            this.f2996g = new h40(1);
        } else {
            h40Var.m1353c();
        }
    }

    public final String toString() {
        return this.f2991b.f5393W + ":" + g40.m1157t(this.f2992c);
    }
}
