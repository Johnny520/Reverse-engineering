package p076P;

import android.graphics.Matrix;
import android.graphics.Path;
import me.dartcv.nuke.BuildConfig;
import p029F0.AbstractC0389a0;
import p029F0.AbstractC0391b0;
import p056K2.C0891q;
import p092S0.C1263a;
import p092S0.C1279q;
import p096T0.C1410j;
import p112W2.InterfaceC1601c;
import p120Y0.AbstractC1732a;
import p127Z2.AbstractC1784a;
import p211o0.C2750i;

/* JADX INFO: renamed from: P.I */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1063I implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3312d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f3313e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f3314f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3315g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1063I(int i5, int i6, int i7, Object obj) {
        this.f3312d = i7;
        this.f3313e = obj;
        this.f3314f = i5;
        this.f3315g = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f3312d) {
            case 0:
                AbstractC0389a0.m658i((AbstractC0389a0) obj, (AbstractC0391b0) this.f3313e, AbstractC1784a.m3200N((this.f3314f - r0.f1206d) / 2.0f), AbstractC1784a.m3200N((this.f3315g - r0.f1207e) / 2.0f));
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC0389a0.m658i((AbstractC0389a0) obj, (AbstractC0391b0) this.f3313e, this.f3314f, this.f3315g);
                break;
            case 2:
                AbstractC0389a0.m658i((AbstractC0389a0) obj, (AbstractC0391b0) this.f3313e, this.f3314f, this.f3315g);
                break;
            default:
                C2750i c2750i = (C2750i) this.f3313e;
                C1279q c1279q = (C1279q) obj;
                C1263a c1263a = c1279q.f4595a;
                int iM2374d = c1279q.m2374d(this.f3314f);
                int iM2374d2 = c1279q.m2374d(this.f3315g);
                CharSequence charSequence = c1263a.f4549e;
                if (iM2374d < 0 || iM2374d > iM2374d2 || iM2374d2 > charSequence.length()) {
                    AbstractC1732a.m3085a("start(" + iM2374d + ") or end(" + iM2374d2 + ") is out of range [0.." + charSequence.length() + "], or start > end!");
                }
                Path path = new Path();
                C1410j c1410j = c1263a.f4548d;
                c1410j.f5044f.getSelectionPath(iM2374d, iM2374d2, path);
                int i5 = c1410j.f5046h;
                if (i5 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i5);
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c1279q.f4600f)) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                c2750i.f8742a.addPath(path, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0));
                break;
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C1063I(int i5, int i6, AbstractC0391b0 abstractC0391b0) {
        this.f3312d = 0;
        this.f3314f = i5;
        this.f3313e = abstractC0391b0;
        this.f3315g = i6;
    }
}
