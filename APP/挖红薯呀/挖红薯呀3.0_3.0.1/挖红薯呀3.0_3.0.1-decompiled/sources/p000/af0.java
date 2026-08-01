package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class af0 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f146d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Context f147e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f148f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f149g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f150h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SharedPreferences f151i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ af0(Context context, SharedPreferences sharedPreferences, int i, int i2, int i3, int i4) {
        this.f146d = i4;
        this.f147e = context;
        this.f148f = i;
        this.f149g = i2;
        this.f150h = i3;
        this.f151i = sharedPreferences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        switch (this.f146d) {
            case 0:
                return vf0.m4677s2(this.f147e, this.f148f, this.f149g, this.f150h, this.f151i);
            default:
                return vf0.m4687u2(this.f147e, this.f148f, this.f149g, this.f150h, this.f151i);
        }
    }
}
