package p105V;

import me.dartcv.nuke.BuildConfig;
import p029F0.C0417o0;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1183h;
import p112W2.InterfaceC1603e;
import p143c3.C1906h;
import p186k.C2425g;

/* JADX INFO: renamed from: V.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1485g extends AbstractC1183h implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f5184f;

    /* JADX INFO: renamed from: g */
    public long[] f5185g;

    /* JADX INFO: renamed from: h */
    public int f5186h;

    /* JADX INFO: renamed from: i */
    public int f5187i;

    /* JADX INFO: renamed from: j */
    public int f5188j;

    /* JADX INFO: renamed from: k */
    public int f5189k;

    /* JADX INFO: renamed from: l */
    public long f5190l;

    /* JADX INFO: renamed from: m */
    public int f5191m;

    /* JADX INFO: renamed from: n */
    public /* synthetic */ Object f5192n;

    /* JADX INFO: renamed from: o */
    public Object f5193o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f5194p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1485g(Object obj, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f5184f = i5;
        this.f5194p = obj;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        C1906h c1906h = (C1906h) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f5184f) {
        }
        return ((C1485g) mo7n(interfaceC1046d, c1906h)).mo8p(C0891q.f2780a);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f5184f) {
            case 0:
                C1485g c1485g = new C1485g((C1486h) this.f5194p, interfaceC1046d, 0);
                c1485g.f5192n = obj;
                return c1485g;
            case BuildConfig.VERSION_CODE /* 1 */:
                C1485g c1485g2 = new C1485g((C2425g) this.f5194p, interfaceC1046d, 1);
                c1485g2.f5192n = obj;
                return c1485g2;
            case 2:
                C1485g c1485g3 = new C1485g((C2425g) this.f5194p, interfaceC1046d, 2);
                c1485g3.f5192n = obj;
                return c1485g3;
            default:
                C1485g c1485g4 = new C1485g((C0417o0) this.f5194p, interfaceC1046d, 3);
                c1485g4.f5192n = obj;
                return c1485g4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0280  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0059 -> B:23:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:16:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0075 -> B:20:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f5 -> B:46:0x0139). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f7 -> B:39:0x0108). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0111 -> B:43:0x0130). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x018f -> B:69:0x01e2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0191 -> B:62:0x01a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01ac -> B:66:0x01d9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x023a -> B:92:0x027e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x023c -> B:85:0x024d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0256 -> B:89:0x0275). Please report as a decompilation issue!!! */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p105V.C1485g.mo8p(java.lang.Object):java.lang.Object");
    }
}
