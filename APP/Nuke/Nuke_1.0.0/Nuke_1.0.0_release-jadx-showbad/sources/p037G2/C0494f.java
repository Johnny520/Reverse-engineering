package p037G2;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p061L2.C0981u;
import p112W2.InterfaceC1599a;
import p256w0.InterfaceC3388a;

/* JADX INFO: renamed from: G2.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0494f implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1531d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC1599a f1532e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0494f(InterfaceC1599a interfaceC1599a, int i5) {
        this.f1531d = i5;
        this.f1532e = interfaceC1599a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f1531d) {
            case 0:
                this.f1532e.mo6a();
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                this.f1532e.mo6a();
                break;
            case 2:
                this.f1532e.mo6a();
                break;
            case 3:
                float fFloatValue = ((Number) this.f1532e.mo6a()).floatValue();
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                if (fFloatValue > 1.0f) {
                    fFloatValue = 1.0f;
                }
                return Float.valueOf(fFloatValue);
            case 4:
                try {
                    return (List) this.f1532e.mo6a();
                } catch (SSLPeerUnverifiedException unused) {
                    return C0981u.f3047d;
                }
            default:
                this.f1532e.mo6a();
                break;
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0494f(InterfaceC3388a interfaceC3388a, int i5, InterfaceC1599a interfaceC1599a) {
        this.f1531d = 0;
        this.f1532e = interfaceC1599a;
    }

    public /* synthetic */ C0494f(InterfaceC3388a interfaceC3388a, InterfaceC1599a interfaceC1599a) {
        this.f1531d = 1;
        this.f1532e = interfaceC1599a;
    }
}
