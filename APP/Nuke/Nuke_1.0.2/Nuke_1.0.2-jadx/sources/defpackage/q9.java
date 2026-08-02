package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q9 {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q9(f31 f31Var) {
        this.a = 1;
        this.c = f31Var;
        this.d = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.e = iArr;
        this.b = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(int i, int i2, r72 r72Var) {
        int i3 = r72Var.h;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static r72 d(r72 r72Var) {
        if (r72Var == null || r72Var.i.a() != o43.w) {
            return r72Var;
        }
        return r72.e(r72Var.h, o43.B);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(int i, int i2) {
        int i3;
        r72 r72Var;
        int[] iArr = (int[]) this.e;
        boolean z = iArr == null;
        if (i != 0 || z) {
            if (i < 0) {
                c80.j("shouldn't happen");
                return;
            }
            if (z || i2 >= iArr.length) {
                int i4 = i2 + 1;
                t72 t72Var = new t72(i4);
                int[] iArr2 = new int[i4];
                Arrays.fill(iArr2, -1);
                if (!z) {
                    t72 t72Var2 = (t72) this.d;
                    int length = t72Var2.i.length;
                    for (int i5 = 0; i5 < length; i5++) {
                        r72 r72VarE = t72Var2.e(i5);
                        if (r72VarE != null) {
                            r72[] r72VarArr = t72Var.i;
                            t72Var.d();
                            if (r72VarE != null) {
                                t72Var.j = -1;
                                try {
                                    int i6 = r72VarE.h;
                                    r72VarArr[i6] = r72VarE;
                                    if (i6 > 0 && (r72Var = r72VarArr[i6 - 1]) != null && r72Var.d() == 2) {
                                        r72VarArr[i3] = null;
                                    }
                                    if (r72VarE.d() == 2) {
                                        r72VarArr[i6 + 1] = null;
                                    }
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    s.j("spec.getReg() out of range");
                                }
                            } else {
                                um2.f("spec == null");
                            }
                        }
                    }
                    int[] iArr3 = (int[]) this.e;
                    System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                }
                this.d = t72Var;
                this.e = iArr2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(int i, int i2, r72 r72Var) {
        if (i2 == 1) {
            c80.j("shouldn't happen");
            return;
        }
        int i3 = ((int[]) this.e)[r72Var.h];
        Object obj = this.c;
        if (i3 >= 0) {
            ((ac1) ((ArrayList) obj).get(i3)).getClass();
            if (i == 0) {
                throw null;
            }
        }
        int i4 = r72Var.h;
        r72 r72VarD = d(r72Var);
        a(i, i4);
        if (((int[]) this.e)[i4] >= 0) {
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            size--;
        }
        t72 t72Var = (t72) this.d;
        t72Var.getClass();
        try {
            t72Var.i[r72VarD.h] = null;
            t72Var.j = -1;
            arrayList.set(size, null);
            this.b++;
            for (int i5 = size - 1; i5 >= 0; i5--) {
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            s.j("bogus reg");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String e() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.d)[i2];
            if (obj instanceof yo2) {
                yo2 yo2Var = (yo2) obj;
                boolean zL = t11.l(yo2Var.c(), yv2.h);
                int[] iArr = (int[]) this.e;
                if (!zL) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(yo2Var.e(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.e)[i2]);
                    sb.append("]");
                }
            } else if (obj == gd3.z) {
                sb.append("[<debug info disabled>]");
            } else if (obj != sn.L) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int f() {
        Paint.Cap strokeCap = ((Paint) this.c).getStrokeCap();
        int i = strokeCap == null ? -1 : r9.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int g() {
        Paint.Join strokeJoin = ((Paint) this.c).getStrokeJoin();
        int i = strokeJoin == null ? -1 : r9.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void h() {
        int i = this.b * 2;
        this.d = Arrays.copyOf((Object[]) this.d, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        mg.e0((int[]) this.e, iArr, 0, 0, 14);
        this.e = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void i(float f) {
        ((Paint) this.c).setAlpha((int) Math.rint(f * 255.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void j(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        Paint paint = (Paint) this.c;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(t11.T(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(t11.W(i)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void k(long j) {
        ((Paint) this.c).setColor(sp0.j0(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void l(cl clVar) {
        this.e = clVar;
        ((Paint) this.c).setColorFilter(clVar != null ? clVar.a : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void m(int i) {
        ((Paint) this.c).setFilterBitmap(!(i == 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void n(Shader shader) {
        this.d = shader;
        ((Paint) this.c).setShader(shader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void o(int i) {
        ((Paint) this.c).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void p(int i) {
        ((Paint) this.c).setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void q(float f) {
        ((Paint) this.c).setStrokeWidth(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void r(int i) {
        ((Paint) this.c).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.a) {
            case 1:
                return e();
            default:
                return super.toString();
        }
    }

    public q9(Paint paint) {
        this.a = 0;
        this.c = paint;
        this.b = 3;
    }

    public q9(int i) {
        this.a = 2;
        this.c = new ArrayList(i);
        this.b = 0;
        this.d = null;
        this.e = null;
    }
}
