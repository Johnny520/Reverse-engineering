package p154k5;

import bsh.C1259t2;
import p239q5.C6267r;
import p239q5.C6268s;
import p239q5.C6274y;
import p280t5.AbstractC8125p;

/* JADX INFO: renamed from: k5.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3985s extends AbstractC3973g0 {

    /* JADX INFO: renamed from: e */
    public final C6267r f11736e;

    public C3985s(C6274y c6274y, C6267r c6267r) {
        super(c6274y);
        if (c6267r != null) {
            this.f11736e = c6267r;
        } else {
            C1259t2.m5095a("local == null");
            throw null;
        }
    }

    /* JADX INFO: renamed from: B */
    public static String m15862B(C6267r c6267r) {
        return c6267r.m24741E() + ' ' + c6267r.m24752p().toString() + ": " + c6267r.m24755u().mo6828g();
    }

    /* JADX INFO: renamed from: A */
    public C6267r m15863A() {
        return this.f11736e;
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: a */
    public String mo15678a() {
        return this.f11736e.toString();
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: s */
    public String mo15680s(boolean z10) {
        return "local-start " + m15862B(this.f11736e);
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: v */
    public AbstractC3976j mo15784v(AbstractC8125p abstractC8125p) {
        return new C3985s(m15777m(), abstractC8125p.mo31331b(this.f11736e));
    }

    @Override // p154k5.AbstractC3973g0, p154k5.AbstractC3976j
    /* JADX INFO: renamed from: x */
    public AbstractC3976j mo15748x(int i10) {
        return new C3985s(m15777m(), this.f11736e.m24744I(i10));
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: y */
    public AbstractC3976j mo15681y(C6268s c6268s) {
        return new C3985s(m15777m(), this.f11736e);
    }
}
