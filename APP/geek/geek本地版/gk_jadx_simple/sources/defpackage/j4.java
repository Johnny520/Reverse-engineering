package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j4 extends jl {
    public final /* synthetic */ s4 j;
    public final /* synthetic */ v4 k;

    public j4(v4 r1, v4 r2, s4 r3) {
        this.k = r1;
        this.j = r3;
        super(r2);
    }

    @Override // defpackage.jl
    public final r30 b() {
        return this.j;
    }

    @Override // defpackage.jl
    public final boolean c() {
        v4 r0 = this.k;
        if (r0.getInternalPopup().b() == true) goto L7;
        r0.f.e(m4.b(r0), m4.a(r0));
        return true;
    L7:
        return true;
    }
}
