package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: cc */
/* JADX INFO: loaded from: classes.dex */
public final class C0099cc {

    /* JADX INFO: renamed from: b */
    public final C0592pc f945b;

    /* JADX INFO: renamed from: c */
    public final int f946c;

    /* JADX INFO: renamed from: d */
    public C0099cc f947d;

    /* JADX INFO: renamed from: g */
    public a40 f950g;

    /* JADX INFO: renamed from: a */
    public HashSet f944a = null;

    /* JADX INFO: renamed from: e */
    public int f948e = 0;

    /* JADX INFO: renamed from: f */
    public int f949f = -1;

    public C0099cc(C0592pc c0592pc, int i) {
        this.f945b = c0592pc;
        this.f946c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m659a(C0099cc c0099cc, int i) {
        m660b(c0099cc, i, -1, false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m660b(C0099cc c0099cc, int i, int i2, boolean z) {
        if (c0099cc == null) {
            m666h();
            return true;
        }
        if (!z && !m665g(c0099cc)) {
            return false;
        }
        this.f947d = c0099cc;
        if (c0099cc.f944a == null) {
            c0099cc.f944a = new HashSet();
        }
        this.f947d.f944a.add(this);
        if (i > 0) {
            this.f948e = i;
        } else {
            this.f948e = 0;
        }
        this.f949f = i2;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final int m661c() {
        C0099cc c0099cc;
        if (this.f945b.f3845V == 8) {
            return 0;
        }
        int i = this.f949f;
        return (i <= -1 || (c0099cc = this.f947d) == null || c0099cc.f945b.f3845V != 8) ? this.f948e : i;
    }

    /* JADX INFO: renamed from: d */
    public final C0099cc m662d() {
        int i = this.f946c;
        int iM2775t = z30.m2775t(i);
        C0592pc c0592pc = this.f945b;
        switch (iM2775t) {
            case Base64.DEFAULT /* 0 */:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case Base64.NO_PADDING /* 1 */:
                return c0592pc.f3878z;
            case Base64.NO_WRAP /* 2 */:
                return c0592pc.f3824A;
            case 3:
                return c0592pc.f3876x;
            case 4:
                return c0592pc.f3877y;
            default:
                throw new AssertionError(z30.m2774s(i));
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m663e() {
        HashSet hashSet = this.f944a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0099cc) it.next()).m662d().m664f()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m664f() {
        return this.f947d != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005e A[RETURN] */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m665g(p000.C0099cc r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L5
            goto L60
        L5:
            pc r1 = r9.f945b
            int r9 = r9.f946c
            r2 = 6
            int r3 = r8.f946c
            r4 = 1
            if (r9 != r3) goto L1c
            if (r3 != r2) goto L5e
            boolean r9 = r1.f3875w
            if (r9 == 0) goto L60
            pc r9 = r8.f945b
            boolean r9 = r9.f3875w
            if (r9 != 0) goto L5e
            goto L60
        L1c:
            int r5 = p000.z30.m2775t(r3)
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
            java.lang.String r0 = p000.z30.m2774s(r3)
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
            boolean r1 = r1 instanceof p000.C0268go
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
            boolean r1 = r1 instanceof p000.C0268go
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C0099cc.m665g(cc):boolean");
    }

    /* JADX INFO: renamed from: h */
    public final void m666h() {
        HashSet hashSet;
        C0099cc c0099cc = this.f947d;
        if (c0099cc != null && (hashSet = c0099cc.f944a) != null) {
            hashSet.remove(this);
        }
        this.f947d = null;
        this.f948e = 0;
        this.f949f = -1;
    }

    /* JADX INFO: renamed from: i */
    public final void m667i() {
        a40 a40Var = this.f950g;
        if (a40Var == null) {
            this.f950g = new a40(1);
        } else {
            a40Var.m13c();
        }
    }

    public final String toString() {
        return this.f945b.f3846W + ":" + z30.m2774s(this.f946c);
    }
}
