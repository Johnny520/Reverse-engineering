package p180m3;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: m3.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4961v {

    /* JADX INFO: renamed from: a */
    public final int f15090a;

    /* JADX INFO: renamed from: b */
    public final boolean f15091b;

    /* JADX INFO: renamed from: c */
    public final boolean f15092c;

    /* JADX INFO: renamed from: d */
    public final boolean f15093d;

    /* JADX INFO: renamed from: e */
    public final boolean f15094e;

    /* JADX INFO: renamed from: f */
    public final boolean f15095f;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ C4961v(boolean r2, boolean r3, boolean r4, p180m3.EnumC4962w r5, boolean r6, boolean r7, int r8, p024b9.AbstractC1043k r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 0
        L5:
            r9 = r8 & 2
            r0 = 1
            if (r9 == 0) goto Lb
            r3 = r0
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = r0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            m3.w r5 = p180m3.EnumC4962w.f15096q
        L16:
            r9 = r8 & 16
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p180m3.C4961v.<init>(boolean, boolean, boolean, m3.w, boolean, boolean, int, b9.k):void");
    }

    /* JADX INFO: renamed from: a */
    public final boolean m20047a() {
        return this.f15092c;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m20048b() {
        return this.f15093d;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m20049c() {
        return this.f15094e;
    }

    /* JADX INFO: renamed from: d */
    public final int m20050d() {
        return this.f15090a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m20051e() {
        return this.f15091b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4961v)) {
            return false;
        }
        C4961v c4961v = (C4961v) obj;
        return this.f15090a == c4961v.f15090a && this.f15091b == c4961v.f15091b && this.f15092c == c4961v.f15092c && this.f15093d == c4961v.f15093d && this.f15094e == c4961v.f15094e && this.f15095f == c4961v.f15095f;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m20052f() {
        return this.f15095f;
    }

    public int hashCode() {
        return (((((((((this.f15090a * 31) + Boolean.hashCode(this.f15091b)) * 31) + Boolean.hashCode(this.f15092c)) * 31) + Boolean.hashCode(this.f15093d)) * 31) + Boolean.hashCode(this.f15094e)) * 31) + Boolean.hashCode(this.f15095f);
    }

    public /* synthetic */ C4961v(boolean z10, boolean z11, boolean z12, boolean z13, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? true : z13);
    }

    public C4961v(boolean z10, boolean z11, boolean z12, boolean z13) {
        this(z10, z11, z12, EnumC4962w.f15096q, true, z13);
    }

    public C4961v(int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f15090a = i10;
        this.f15091b = z10;
        this.f15092c = z11;
        this.f15093d = z12;
        this.f15094e = z13;
        this.f15095f = z14;
    }

    public C4961v(boolean z10, boolean z11, boolean z12, EnumC4962w enumC4962w, boolean z13, boolean z14) {
        this(z10, z11, z12, enumC4962w, z13, z14, false);
    }

    public C4961v(boolean z10, boolean z11, boolean z12, EnumC4962w enumC4962w, boolean z13, boolean z14, boolean z15) {
        this(AbstractC4942c.m19964h(z10, enumC4962w, z14), enumC4962w == EnumC4962w.f15096q, z11, z12, z13, z15);
    }
}
