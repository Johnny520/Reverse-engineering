package p000;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kc0 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3075d = 1;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Context f3076e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f3077f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ kc0(Context context, String str) {
        this.f3076e = context;
        this.f3077f = str;
    }

    /* JADX DEBUG: Class process forced to load method for inline: zc0.z(android.content.Context, java.lang.String):na1 */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        int i = this.f3075d;
        String str = this.f3077f;
        Context context = this.f3076e;
        switch (i) {
            case 0:
                return zc0.m5502P(str, context);
            default:
                return zc0.m5563r0(context, str);
        }
    }

    public /* synthetic */ kc0(String str, Context context) {
        this.f3077f = str;
        this.f3076e = context;
    }
}
