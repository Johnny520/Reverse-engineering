package p211o0;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import java.util.Arrays;
import me.dartcv.nuke.BuildConfig;
import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;
import p225q3.C2936g;
import p225q3.InterfaceC2933d;
import p242t3.C3216e;
import p248u3.C3342f;

/* JADX INFO: renamed from: o0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2748g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8735a;

    /* JADX INFO: renamed from: b */
    public int f8736b;

    /* JADX INFO: renamed from: c */
    public final Object f8737c;

    /* JADX INFO: renamed from: d */
    public Object f8738d;

    /* JADX INFO: renamed from: e */
    public Object f8739e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2748g(C3216e c3216e) {
        this.f8735a = 1;
        this.f8737c = c3216e;
        this.f8738d = new Object[8];
        int[] iArr = new int[8];
        for (int i5 = 0; i5 < 8; i5++) {
            iArr[i5] = -1;
        }
        this.f8739e = iArr;
        this.f8736b = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public String m4863a() {
        StringBuilder sb = new StringBuilder("$");
        int i5 = this.f8736b + 1;
        for (int i6 = 0; i6 < i5; i6++) {
            Object obj = ((Object[]) this.f8738d)[i6];
            if (obj instanceof InterfaceC2933d) {
                InterfaceC2933d interfaceC2933d = (InterfaceC2933d) obj;
                if (!AbstractC1665j.m2981a(interfaceC2933d.mo5132c(), C2936g.f9257i)) {
                    int i7 = ((int[]) this.f8739e)[i6];
                    if (i7 >= 0) {
                        sb.append(".");
                        sb.append(interfaceC2933d.mo5134e(i7));
                    }
                } else if (((int[]) this.f8739e)[i6] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f8739e)[i6]);
                    sb.append("]");
                }
            } else if (obj == C3342f.f10389a) {
                sb.append("[<debug info disabled>]");
            } else if (obj != C3342f.f10390b) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public int m4864b() {
        Paint.Cap strokeCap = ((Paint) this.f8737c).getStrokeCap();
        int i5 = strokeCap == null ? -1 : AbstractC2749h.f8740a[strokeCap.ordinal()];
        if (i5 == 1) {
            return 0;
        }
        if (i5 != 2) {
            return i5 != 3 ? 0 : 2;
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public int m4865c() {
        Paint.Join strokeJoin = ((Paint) this.f8737c).getStrokeJoin();
        int i5 = strokeJoin == null ? -1 : AbstractC2749h.f8741b[strokeJoin.ordinal()];
        if (i5 == 1) {
            return 0;
        }
        if (i5 != 2) {
            return i5 != 3 ? 0 : 1;
        }
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m4866d() {
        int i5 = this.f8736b * 2;
        Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f8738d, i5);
        AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
        this.f8738d = objArrCopyOf;
        int[] iArr = new int[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            iArr[i6] = -1;
        }
        AbstractC0972l.m1994R((int[]) this.f8739e, iArr, 0, 0, 14);
        this.f8739e = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m4867e(float f2) {
        ((Paint) this.f8737c).setAlpha((int) Math.rint(f2 * 255.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public void m4868f(int i5) {
        if (this.f8736b == i5) {
            return;
        }
        this.f8736b = i5;
        Paint paint = (Paint) this.f8737c;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(AbstractC2767z.m4948s(i5));
        } else {
            paint.setXfermode(new PorterDuffXfermode(AbstractC2767z.m4928A(i5)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public void m4869g(long j5) {
        ((Paint) this.f8737c).setColor(AbstractC2767z.m4952w(j5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public void m4870h(C2753l c2753l) {
        this.f8739e = c2753l;
        ((Paint) this.f8737c).setColorFilter(c2753l != null ? c2753l.f8746a : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public void m4871i(int i5) {
        ((Paint) this.f8737c).setFilterBitmap(!(i5 == 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public void m4872j(Shader shader) {
        this.f8738d = shader;
        ((Paint) this.f8737c).setShader(shader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public void m4873k(int i5) {
        ((Paint) this.f8737c).setStrokeCap(i5 == 2 ? Paint.Cap.SQUARE : i5 == 1 ? Paint.Cap.ROUND : i5 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public void m4874l(int i5) {
        ((Paint) this.f8737c).setStrokeJoin(i5 == 0 ? Paint.Join.MITER : i5 == 2 ? Paint.Join.BEVEL : i5 == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public void m4875m(float f2) {
        ((Paint) this.f8737c).setStrokeWidth(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public void m4876n(int i5) {
        ((Paint) this.f8737c).setStyle(i5 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f8735a) {
            case BuildConfig.VERSION_CODE /* 1 */:
                return m4863a();
            default:
                return super.toString();
        }
    }

    public C2748g(Paint paint) {
        this.f8735a = 0;
        this.f8737c = paint;
        this.f8736b = 3;
    }
}
