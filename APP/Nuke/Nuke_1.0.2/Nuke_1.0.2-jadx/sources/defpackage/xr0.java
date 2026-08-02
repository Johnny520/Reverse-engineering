package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xr0 implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ xm0 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ xr0(xm0 xm0Var, int i) {
        this.h = i;
        this.i = xm0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.h;
        xm0 xm0Var = this.i;
        switch (i) {
            case 0:
                try {
                    return (List) xm0Var.a();
                } catch (SSLPeerUnverifiedException unused) {
                    return be0.h;
                }
            default:
                float fFloatValue = ((Number) xm0Var.a()).floatValue();
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
