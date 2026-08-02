package p000;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: q9 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0611q9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8828a;

    /* JADX INFO: renamed from: b */
    public int f8829b;

    /* JADX INFO: renamed from: c */
    public final Object f8830c;

    /* JADX INFO: renamed from: d */
    public Object f8831d;

    /* JADX INFO: renamed from: e */
    public Object f8832e;

    public C0611q9(f31 f31Var) {
        this.f8828a = 1;
        this.f8830c = f31Var;
        this.f8831d = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.f8832e = iArr;
        this.f8829b = -1;
    }

    /* JADX INFO: renamed from: b */
    public static void m4085b(int i, int i2, r72 r72Var) {
        int i3 = r72Var.f9419h;
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        if (i2 == 0) {
            throw new NullPointerException("disposition == null");
        }
        try {
            throw new NullPointerException("spec.getLocalItem() == null");
        } catch (NullPointerException unused) {
            throw new NullPointerException("spec == null");
        }
    }

    /* JADX INFO: renamed from: d */
    public static r72 m4086d(r72 r72Var) {
        if (r72Var == null || r72Var.f9420i.mo22a() != o43.f7517w) {
            return r72Var;
        }
        return r72.m4399e(r72Var.f9419h, o43.f7486B);
    }

    /* JADX INFO: renamed from: a */
    public void m4087a(int i, int i2) {
        int i3;
        r72 r72Var;
        int[] iArr = (int[]) this.f8832e;
        boolean z = iArr == null;
        if (i != 0 || z) {
            if (i < 0) {
                c80.m667j("shouldn't happen");
                return;
            }
            if (z || i2 >= iArr.length) {
                int i4 = i2 + 1;
                t72 t72Var = new t72(i4);
                int[] iArr2 = new int[i4];
                Arrays.fill(iArr2, -1);
                if (!z) {
                    t72 t72Var2 = (t72) this.f8831d;
                    int length = t72Var2.f10593i.length;
                    for (int i5 = 0; i5 < length; i5++) {
                        r72 r72VarM5129e = t72Var2.m5129e(i5);
                        if (r72VarM5129e != null) {
                            r72[] r72VarArr = t72Var.f10593i;
                            t72Var.m5707d();
                            if (r72VarM5129e != null) {
                                t72Var.f10594j = -1;
                                try {
                                    int i6 = r72VarM5129e.f9419h;
                                    r72VarArr[i6] = r72VarM5129e;
                                    if (i6 > 0 && (r72Var = r72VarArr[i6 - 1]) != null && r72Var.m4400d() == 2) {
                                        r72VarArr[i3] = null;
                                    }
                                    if (r72VarM5129e.m4400d() == 2) {
                                        r72VarArr[i6 + 1] = null;
                                    }
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    C0676s.m4651j("spec.getReg() out of range");
                                }
                            } else {
                                um2.m5516f("spec == null");
                            }
                        }
                    }
                    int[] iArr3 = (int[]) this.f8832e;
                    System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                }
                this.f8831d = t72Var;
                this.f8832e = iArr2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m4088c(int i, int i2, r72 r72Var) {
        if (i2 == 1) {
            c80.m667j("shouldn't happen");
            return;
        }
        int i3 = ((int[]) this.f8832e)[r72Var.f9419h];
        Object obj = this.f8830c;
        if (i3 >= 0) {
            ((ac1) ((ArrayList) obj).get(i3)).getClass();
            if (i == 0) {
                throw null;
            }
        }
        int i4 = r72Var.f9419h;
        r72 r72VarM4086d = m4086d(r72Var);
        m4087a(i, i4);
        if (((int[]) this.f8832e)[i4] >= 0) {
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            size--;
        }
        t72 t72Var = (t72) this.f8831d;
        t72Var.getClass();
        try {
            t72Var.f10593i[r72VarM4086d.f9419h] = null;
            t72Var.f10594j = -1;
            arrayList.set(size, null);
            this.f8829b++;
            for (int i5 = size - 1; i5 >= 0; i5--) {
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            C0676s.m4651j("bogus reg");
        }
    }

    /* JADX INFO: renamed from: e */
    public String m4089e() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f8829b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.f8831d)[i2];
            if (obj instanceof yo2) {
                yo2 yo2Var = (yo2) obj;
                boolean zM5086l = t11.m5086l(yo2Var.mo251c(), yv2.f13633h);
                int[] iArr = (int[]) this.f8832e;
                if (!zM5086l) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(yo2Var.mo253e(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f8832e)[i2]);
                    sb.append("]");
                }
            } else if (obj == gd3.f3448z) {
                sb.append("[<debug info disabled>]");
            } else if (obj != C0700sn.f10208L) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public int m4090f() {
        Paint.Cap strokeCap = ((Paint) this.f8830c).getStrokeCap();
        int i = strokeCap == null ? -1 : AbstractC0648r9.f9441a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: g */
    public int m4091g() {
        Paint.Join strokeJoin = ((Paint) this.f8830c).getStrokeJoin();
        int i = strokeJoin == null ? -1 : AbstractC0648r9.f9442b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: h */
    public void m4092h() {
        int i = this.f8829b * 2;
        this.f8831d = Arrays.copyOf((Object[]) this.f8831d, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        AbstractC0460mg.m3090e0((int[]) this.f8832e, iArr, 0, 0, 14);
        this.f8832e = iArr;
    }

    /* JADX INFO: renamed from: i */
    public void m4093i(float f) {
        ((Paint) this.f8830c).setAlpha((int) Math.rint(f * 255.0f));
    }

    /* JADX INFO: renamed from: j */
    public void m4094j(int i) {
        if (this.f8829b == i) {
            return;
        }
        this.f8829b = i;
        Paint paint = (Paint) this.f8830c;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(t11.m5068T(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(t11.m5071W(i)));
        }
    }

    /* JADX INFO: renamed from: k */
    public void m4095k(long j) {
        ((Paint) this.f8830c).setColor(sp0.m4947j0(j));
    }

    /* JADX INFO: renamed from: l */
    public void m4096l(C0095cl c0095cl) {
        this.f8832e = c0095cl;
        ((Paint) this.f8830c).setColorFilter(c0095cl != null ? c0095cl.f1606a : null);
    }

    /* JADX INFO: renamed from: m */
    public void m4097m(int i) {
        ((Paint) this.f8830c).setFilterBitmap(!(i == 0));
    }

    /* JADX INFO: renamed from: n */
    public void m4098n(Shader shader) {
        this.f8831d = shader;
        ((Paint) this.f8830c).setShader(shader);
    }

    /* JADX INFO: renamed from: o */
    public void m4099o(int i) {
        ((Paint) this.f8830c).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* JADX INFO: renamed from: p */
    public void m4100p(int i) {
        ((Paint) this.f8830c).setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    /* JADX INFO: renamed from: q */
    public void m4101q(float f) {
        ((Paint) this.f8830c).setStrokeWidth(f);
    }

    /* JADX INFO: renamed from: r */
    public void m4102r(int i) {
        ((Paint) this.f8830c).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public String toString() {
        switch (this.f8828a) {
            case 1:
                return m4089e();
            default:
                return super.toString();
        }
    }

    public C0611q9(Paint paint) {
        this.f8828a = 0;
        this.f8830c = paint;
        this.f8829b = 3;
    }

    public C0611q9(int i) {
        this.f8828a = 2;
        this.f8830c = new ArrayList(i);
        this.f8829b = 0;
        this.f8831d = null;
        this.f8832e = null;
    }
}
