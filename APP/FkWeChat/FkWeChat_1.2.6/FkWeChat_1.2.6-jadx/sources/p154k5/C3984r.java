package p154k5;

import bsh.C1259t2;
import p239q5.C6267r;
import p239q5.C6268s;
import p239q5.C6269t;
import p239q5.C6274y;
import p280t5.AbstractC8125p;

/* JADX INFO: renamed from: k5.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3984r extends AbstractC3973g0 {

    /* JADX INFO: renamed from: e */
    public final C6269t f11735e;

    public C3984r(C6274y c6274y, C6269t c6269t) {
        super(c6274y);
        if (c6269t != null) {
            this.f11735e = c6269t;
        } else {
            C1259t2.m5095a("locals == null");
            throw null;
        }
    }

    /* JADX INFO: renamed from: A */
    public C6269t m15861A() {
        return this.f11735e;
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: a */
    public String mo15678a() {
        return this.f11735e.toString();
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: s */
    public String mo15680s(boolean z10) {
        int size = this.f11735e.size();
        int iM24794z = this.f11735e.m24794z();
        StringBuilder sb2 = new StringBuilder((size * 40) + 100);
        sb2.append("local-snapshot");
        for (int i10 = 0; i10 < iM24794z; i10++) {
            C6267r c6267rM24792x = this.f11735e.m24792x(i10);
            if (c6267rM24792x != null) {
                sb2.append("\n  ");
                sb2.append(C3985s.m15862B(c6267rM24792x));
            }
        }
        return sb2.toString();
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: v */
    public AbstractC3976j mo15784v(AbstractC8125p abstractC8125p) {
        return new C3984r(m15777m(), abstractC8125p.m31445d(this.f11735e));
    }

    @Override // p154k5.AbstractC3973g0, p154k5.AbstractC3976j
    /* JADX INFO: renamed from: x */
    public AbstractC3976j mo15748x(int i10) {
        return new C3984r(m15777m(), this.f11735e.m24790G(i10));
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: y */
    public AbstractC3976j mo15681y(C6268s c6268s) {
        return new C3984r(m15777m(), this.f11735e);
    }
}
