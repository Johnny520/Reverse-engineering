package p182m5;

import bsh.C1259t2;
import p254r5.C6496e0;

/* JADX INFO: renamed from: m5.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5029z extends AbstractC4979a0 {

    /* JADX INFO: renamed from: r */
    public final C6496e0 f15303r;

    public AbstractC5029z(C6496e0 c6496e0) {
        if (c6496e0 != null) {
            this.f15303r = c6496e0;
        } else {
            C1259t2.m5095a("type == null");
            throw null;
        }
    }

    @Override // p182m5.AbstractC4982b0
    /* JADX INFO: renamed from: a */
    public void mo20090a(C5009p c5009p) {
        c5009p.m20260u().m20313u(this.f15303r);
    }

    /* JADX INFO: renamed from: n */
    public final C6496e0 m20317n() {
        return this.f15303r;
    }
}
