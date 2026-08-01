package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j4 extends defpackage.jl {
    public final /* synthetic */ defpackage.s4 j;
    public final /* synthetic */ defpackage.v4 k;

    public j4(defpackage.v4 r1, defpackage.v4 r2, defpackage.s4 r3) {
            r0 = this;
            r0.k = r1
            r0.j = r3
            r0.<init>(r2)
            return
    }

    @Override // defpackage.jl
    public final defpackage.r30 b() {
            r1 = this;
            s4 r0 = r1.j
            return r0
    }

    @Override // defpackage.jl
    public final boolean c() {
            r3 = this;
            v4 r0 = r3.k
            u4 r1 = r0.getInternalPopup()
            boolean r1 = r1.b()
            if (r1 != 0) goto L19
            u4 r1 = r0.f
            int r2 = defpackage.m4.b(r0)
            int r0 = defpackage.m4.a(r0)
            r1.e(r2, r0)
        L19:
            r0 = 1
            return r0
    }
}
