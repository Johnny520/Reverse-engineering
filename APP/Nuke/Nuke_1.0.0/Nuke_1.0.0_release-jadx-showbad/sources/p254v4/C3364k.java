package p254v4;

import org.luckypray.dexkit.DexKitBridge;
import p032F3.AbstractC0453a;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: v4.k */
/* JADX INFO: loaded from: classes.dex */
public final class C3364k extends AbstractC1666k implements InterfaceC1599a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f10446e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DexKitBridge f10447f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3365l f10448g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f10449h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3364k(DexKitBridge dexKitBridge, C3365l c3365l, int i5, int i6) {
        super(0);
        this.f10446e = i6;
        this.f10447f = dexKitBridge;
        this.f10448g = c3365l;
        this.f10449h = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i5 = this.f10446e;
        int i6 = this.f10449h;
        C3365l c3365l = this.f10448g;
        DexKitBridge dexKitBridge = this.f10447f;
        switch (i5) {
            case 0:
                return (C3362i) dexKitBridge.m5006D(new long[]{AbstractC0453a.m738c(i6, c3365l.f10450e)}).first();
            default:
                return (C3362i) dexKitBridge.m5006D(new long[]{AbstractC0453a.m738c(i6, c3365l.f10453h)}).first();
        }
    }
}
