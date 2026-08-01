package p000;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: nl */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0516nl implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4288d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f4289e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0516nl(String str, int i) {
        this.f4288d = i;
        this.f4289e = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f4288d;
        na1 na1Var = na1.f4229a;
        String str = this.f4289e;
        switch (i) {
            case 0:
                u40[] u40VarArr = d01.f923a;
                e01 e01Var = b01.f325d;
                u40 u40Var = d01.f923a[2];
                ((f01) obj).mo17a(e01Var, str);
                return na1Var;
            case 1:
                f01 f01Var = (f01) obj;
                u40[] u40VarArr2 = d01.f923a;
                f01Var.mo17a(b01.f322a, o30.m2782v(str));
                d01.m620a(f01Var, 5);
                return na1Var;
            case 2:
                return C0745sz.m4115v(str, (Bitmap) obj);
            default:
                return C0745sz.m4114t(str, (Bitmap) obj);
        }
    }
}
