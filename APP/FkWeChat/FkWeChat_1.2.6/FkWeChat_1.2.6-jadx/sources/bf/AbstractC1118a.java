package bf;

import org.luckypray.dexkit.DexKitBridge;
import p024b9.AbstractC1043k;
import p376zd.C10010p0;

/* JADX INFO: renamed from: bf.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1118a {

    /* JADX INFO: renamed from: a */
    public final DexKitBridge f3417a;

    /* JADX INFO: renamed from: b */
    public final int f3418b;

    /* JADX INFO: renamed from: c */
    public final int f3419c;

    public /* synthetic */ AbstractC1118a(DexKitBridge dexKitBridge, int i10, int i11, int i12, AbstractC1043k abstractC1043k) {
        this(dexKitBridge, (i12 & 2) != 0 ? -1 : i10, (i12 & 4) != 0 ? -1 : i11);
    }

    /* JADX INFO: renamed from: a */
    public final long m4017a() {
        int i10 = this.f3418b;
        if (i10 >= 0) {
            return m4018b(this.f3419c, i10);
        }
        C10010p0.m38820a("not has id");
        return 0L;
    }

    /* JADX INFO: renamed from: b */
    public final long m4018b(int i10, int i11) {
        return ((long) i11) | (((long) i10) << 32);
    }

    public AbstractC1118a(DexKitBridge dexKitBridge, int i10, int i11) {
        dexKitBridge.getClass();
        this.f3417a = dexKitBridge;
        this.f3418b = i10;
        this.f3419c = i11;
    }
}
