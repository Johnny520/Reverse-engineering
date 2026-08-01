package p032c5;

import bsh.C1259t2;
import p309v5.C8835q;

/* JADX INFO: renamed from: c5.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1334h extends AbstractC1347u {

    /* JADX INFO: renamed from: b */
    public final C1350x f3980b;

    public C1334h(C1350x c1350x) {
        super("InnerClasses");
        try {
            if (c1350x.m33927c()) {
                throw new C8835q("innerClasses.isMutable()");
            }
            this.f3980b = c1350x;
        } catch (NullPointerException unused) {
            C1259t2.m5095a("innerClasses == null");
            throw null;
        }
    }

    @Override // p094g5.InterfaceC2518a
    /* JADX INFO: renamed from: a */
    public int mo5336a() {
        return (this.f3980b.size() * 8) + 8;
    }

    /* JADX INFO: renamed from: b */
    public C1350x m5348b() {
        return this.f3980b;
    }
}
