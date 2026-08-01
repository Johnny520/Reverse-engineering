package p032c5;

import bsh.C1259t2;
import p225p5.C5956d;
import p309v5.C8835q;

/* JADX INFO: renamed from: c5.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1349w extends AbstractC1347u {

    /* JADX INFO: renamed from: b */
    public final C5956d f3989b;

    /* JADX INFO: renamed from: c */
    public final int f3990c;

    public AbstractC1349w(String str, C5956d c5956d, int i10) {
        super(str);
        try {
            if (c5956d.m33927c()) {
                throw new C8835q("parameterAnnotations.isMutable()");
            }
            this.f3989b = c5956d;
            this.f3990c = i10;
        } catch (NullPointerException unused) {
            C1259t2.m5095a("parameterAnnotations == null");
            throw null;
        }
    }

    @Override // p094g5.InterfaceC2518a
    /* JADX INFO: renamed from: a */
    public final int mo5336a() {
        return this.f3990c + 6;
    }

    /* JADX INFO: renamed from: b */
    public final C5956d m5355b() {
        return this.f3989b;
    }
}
