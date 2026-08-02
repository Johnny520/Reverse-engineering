package p000;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xr0 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13142h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ xm0 f13143i;

    public /* synthetic */ xr0(xm0 xm0Var, int i) {
        this.f13142h = i;
        this.f13143i = xm0Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f13142h;
        xm0 xm0Var = this.f13143i;
        switch (i) {
            case 0:
                try {
                    return (List) xm0Var.mo6a();
                } catch (SSLPeerUnverifiedException unused) {
                    return be0.f819h;
                }
            default:
                float fFloatValue = ((Number) xm0Var.mo6a()).floatValue();
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                if (fFloatValue > 1.0f) {
                    fFloatValue = 1.0f;
                }
                return Float.valueOf(fFloatValue);
        }
    }
}
