package p265s1;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import p055e.AbstractC1960a;
import p265s1.AbstractC7105l3;
import p265s1.AbstractC7110m3;

/* JADX INFO: renamed from: s1.q0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7127q0 {

    /* JADX INFO: renamed from: s1.q0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23641a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f23642b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f23643c;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f23641a = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f23642b = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f23643c = iArr3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC7134r2 m28093a() {
        return new C7122p0();
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC7134r2 m28094b(Paint paint) {
        return new C7122p0(paint);
    }

    /* JADX INFO: renamed from: c */
    public static final float m28095c(Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    /* JADX INFO: renamed from: d */
    public static final long m28096d(Paint paint) {
        return AbstractC7138s1.m28198b(paint.getColor());
    }

    /* JADX INFO: renamed from: e */
    public static final int m28097e(Paint paint) {
        return !paint.isFilterBitmap() ? AbstractC7054b2.f23487a.m27769b() : AbstractC7054b2.f23487a.m27768a();
    }

    /* JADX INFO: renamed from: f */
    public static final int m28098f(Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i10 = strokeCap == null ? -1 : a.f23642b[strokeCap.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? AbstractC7105l3.f23607a.m27996a() : AbstractC7105l3.f23607a.m27998c() : AbstractC7105l3.f23607a.m27997b() : AbstractC7105l3.f23607a.m27996a();
    }

    /* JADX INFO: renamed from: g */
    public static final int m28099g(Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : a.f23643c[strokeJoin.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? AbstractC7110m3.f23617a.m28010b() : AbstractC7110m3.f23617a.m28011c() : AbstractC7110m3.f23617a.m28009a() : AbstractC7110m3.f23617a.m28010b();
    }

    /* JADX INFO: renamed from: h */
    public static final float m28100h(Paint paint) {
        return paint.getStrokeMiter();
    }

    /* JADX INFO: renamed from: i */
    public static final float m28101i(Paint paint) {
        return paint.getStrokeWidth();
    }

    /* JADX INFO: renamed from: j */
    public static final Paint m28102j() {
        return new Paint(7);
    }

    /* JADX INFO: renamed from: k */
    public static final void m28103k(Paint paint, float f10) {
        paint.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    /* JADX INFO: renamed from: l */
    public static final void m28104l(Paint paint, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            C7150u3.f23682a.m28229a(paint, i10);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AbstractC7062d0.m27778b(i10)));
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m28105m(Paint paint, long j10) {
        paint.setColor(AbstractC7138s1.m28205i(j10));
    }

    /* JADX INFO: renamed from: n */
    public static final void m28106n(Paint paint, AbstractC7133r1 abstractC7133r1) {
        paint.setColorFilter(abstractC7133r1 != null ? AbstractC7077g0.m27879b(abstractC7133r1) : null);
    }

    /* JADX INFO: renamed from: o */
    public static final void m28107o(Paint paint, int i10) {
        paint.setFilterBitmap(!AbstractC7054b2.m27765d(i10, AbstractC7054b2.f23487a.m27769b()));
    }

    /* JADX INFO: renamed from: p */
    public static final void m28108p(Paint paint, InterfaceC7149u2 interfaceC7149u2) {
        AbstractC1960a.m7104a(interfaceC7149u2);
        paint.setPathEffect(null);
    }

    /* JADX INFO: renamed from: q */
    public static final void m28109q(Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    /* JADX INFO: renamed from: r */
    public static final void m28110r(Paint paint, int i10) {
        AbstractC7105l3.a aVar = AbstractC7105l3.f23607a;
        paint.setStrokeCap(AbstractC7105l3.m27993e(i10, aVar.m27998c()) ? Paint.Cap.SQUARE : AbstractC7105l3.m27993e(i10, aVar.m27997b()) ? Paint.Cap.ROUND : AbstractC7105l3.m27993e(i10, aVar.m27996a()) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* JADX INFO: renamed from: s */
    public static final void m28111s(Paint paint, int i10) {
        AbstractC7110m3.a aVar = AbstractC7110m3.f23617a;
        paint.setStrokeJoin(AbstractC7110m3.m28006e(i10, aVar.m28010b()) ? Paint.Join.MITER : AbstractC7110m3.m28006e(i10, aVar.m28009a()) ? Paint.Join.BEVEL : AbstractC7110m3.m28006e(i10, aVar.m28011c()) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    /* JADX INFO: renamed from: t */
    public static final void m28112t(Paint paint, float f10) {
        paint.setStrokeMiter(f10);
    }

    /* JADX INFO: renamed from: u */
    public static final void m28113u(Paint paint, float f10) {
        paint.setStrokeWidth(f10);
    }

    /* JADX INFO: renamed from: v */
    public static final void m28114v(Paint paint, int i10) {
        paint.setStyle(AbstractC7139s2.m28209d(i10, AbstractC7139s2.f23669a.m28211b()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
