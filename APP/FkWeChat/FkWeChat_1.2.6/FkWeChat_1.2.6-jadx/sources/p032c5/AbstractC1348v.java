package p032c5;

import bsh.C1259t2;
import p045d5.C1893o;
import p309v5.C8835q;

/* JADX INFO: renamed from: c5.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1348v extends AbstractC1347u {

    /* JADX INFO: renamed from: b */
    public final C1893o f3988b;

    public AbstractC1348v(String str, C1893o c1893o) {
        super(str);
        try {
            if (c1893o.m33927c()) {
                throw new C8835q("localVariables.isMutable()");
            }
            this.f3988b = c1893o;
        } catch (NullPointerException unused) {
            C1259t2.m5095a("localVariables == null");
            throw null;
        }
    }

    @Override // p094g5.InterfaceC2518a
    /* JADX INFO: renamed from: a */
    public final int mo5336a() {
        return (this.f3988b.size() * 10) + 8;
    }

    /* JADX INFO: renamed from: b */
    public final C1893o m5354b() {
        return this.f3988b;
    }
}
