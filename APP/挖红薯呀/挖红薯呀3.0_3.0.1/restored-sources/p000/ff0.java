package p000;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ff0 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1710d = 2;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f1711e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Context f1712f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1713g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1714h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f1715i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1716j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ff0(Context context, int i, int i2, int i3, int i4, Dialog dialog) {
        this.f1712f = context;
        this.f1713g = i;
        this.f1714h = i2;
        this.f1715i = i3;
        this.f1716j = i4;
        this.f1711e = dialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f1710d;
        Object obj2 = this.f1711e;
        switch (i) {
            case 0:
                return vf0.m4622h2(this.f1712f, (SharedPreferences) obj2, this.f1713g, this.f1714h, this.f1715i, this.f1716j, (LinearLayout) obj);
            case 1:
                return vf0.m4667q2((SharedPreferences) obj2, this.f1712f, this.f1713g, this.f1714h, this.f1715i, this.f1716j, (LinearLayout) obj);
            default:
                return vf0.m4702x2(this.f1712f, this.f1713g, this.f1714h, this.f1715i, this.f1716j, (Dialog) obj2, (LinearLayout) obj);
        }
    }

    public /* synthetic */ ff0(Context context, SharedPreferences sharedPreferences, int i, int i2, int i3, int i4) {
        this.f1712f = context;
        this.f1711e = sharedPreferences;
        this.f1713g = i;
        this.f1714h = i2;
        this.f1715i = i3;
        this.f1716j = i4;
    }

    public /* synthetic */ ff0(SharedPreferences sharedPreferences, Context context, int i, int i2, int i3, int i4) {
        this.f1711e = sharedPreferences;
        this.f1712f = context;
        this.f1713g = i;
        this.f1714h = i2;
        this.f1715i = i3;
        this.f1716j = i4;
    }
}
