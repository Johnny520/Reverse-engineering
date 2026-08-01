package p032c5;

import bsh.C1259t2;
import p225p5.C5955c;
import p309v5.C8835q;

/* JADX INFO: renamed from: c5.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1346t extends AbstractC1347u {

    /* JADX INFO: renamed from: b */
    public final C5955c f3985b;

    /* JADX INFO: renamed from: c */
    public final int f3986c;

    public AbstractC1346t(String str, C5955c c5955c, int i10) {
        super(str);
        try {
            if (c5955c.m33927c()) {
                throw new C8835q("annotations.isMutable()");
            }
            this.f3985b = c5955c;
            this.f3986c = i10;
        } catch (NullPointerException unused) {
            C1259t2.m5095a("annotations == null");
            throw null;
        }
    }

    @Override // p094g5.InterfaceC2518a
    /* JADX INFO: renamed from: a */
    public final int mo5336a() {
        return this.f3986c + 6;
    }

    /* JADX INFO: renamed from: b */
    public final C5955c m5353b() {
        return this.f3985b;
    }
}
