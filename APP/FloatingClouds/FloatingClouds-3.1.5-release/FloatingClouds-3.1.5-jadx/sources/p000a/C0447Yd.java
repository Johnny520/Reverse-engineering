package p000a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: renamed from: a.Yd */
/* JADX INFO: loaded from: classes.dex */
public final class C0447Yd {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public float f1663a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public float f1664b;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public float f1665c;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public float f1666d;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public float f1667e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f1668f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final ArrayList f1669g = new ArrayList();

    /* JADX INFO: renamed from: a.Yd$a */
    public static class a extends f {

        /* JADX INFO: renamed from: c */
        public final c f1670c;

        public a(c cVar) {
            this.f1670c = cVar;
        }

        @Override // p000a.C0447Yd.f
        /* JADX INFO: renamed from: a */
        public final void mo1074a(Matrix matrix, C0375Ud c0375Ud, int i, Canvas canvas) {
            c cVar = this.f1670c;
            float f = cVar.f1679f;
            float f2 = cVar.f1680g;
            RectF rectF = new RectF(cVar.f1675b, cVar.f1676c, cVar.f1677d, cVar.f1678e);
            c0375Ud.getClass();
            boolean z = f2 < 0.0f;
            Path path = c0375Ud.f1408g;
            int[] iArr = C0375Ud.f1400k;
            if (z) {
                iArr[0] = 0;
                iArr[1] = c0375Ud.f1407f;
                iArr[2] = c0375Ud.f1406e;
                iArr[3] = c0375Ud.f1405d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f3 = -i;
                rectF.inset(f3, f3);
                iArr[0] = 0;
                iArr[1] = c0375Ud.f1405d;
                iArr[2] = c0375Ud.f1406e;
                iArr[3] = c0375Ud.f1407f;
            }
            float fWidth = rectF.width() / 2.0f;
            if (fWidth <= 0.0f) {
                return;
            }
            float f4 = 1.0f - (i / fWidth);
            float[] fArr = C0375Ud.f1401l;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = c0375Ud.f1403b;
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, c0375Ud.f1409h);
            }
            canvas.drawArc(rectF, f, f2, true, paint);
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: a.Yd$b */
    public static class b extends f {

        /* JADX INFO: renamed from: c */
        public final d f1671c;

        /* JADX INFO: renamed from: d */
        public final float f1672d;

        /* JADX INFO: renamed from: e */
        public final float f1673e;

        public b(d dVar, float f, float f2) {
            this.f1671c = dVar;
            this.f1672d = f;
            this.f1673e = f2;
        }

        @Override // p000a.C0447Yd.f
        /* JADX INFO: renamed from: a */
        public final void mo1074a(Matrix matrix, C0375Ud c0375Ud, int i, Canvas canvas) {
            d dVar = this.f1671c;
            float f = dVar.f1682c;
            float f2 = this.f1673e;
            float f3 = dVar.f1681b;
            float f4 = this.f1672d;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
            Matrix matrix2 = this.f1685a;
            matrix2.set(matrix);
            matrix2.preTranslate(f4, f2);
            matrix2.preRotate(m1108b());
            c0375Ud.getClass();
            rectF.bottom += i;
            rectF.offset(0.0f, -i);
            int[] iArr = C0375Ud.f1398i;
            iArr[0] = c0375Ud.f1407f;
            iArr[1] = c0375Ud.f1406e;
            iArr[2] = c0375Ud.f1405d;
            Paint paint = c0375Ud.f1404c;
            float f5 = rectF.left;
            paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C0375Ud.f1399j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }

        /* JADX INFO: renamed from: b */
        public final float m1108b() {
            d dVar = this.f1671c;
            return (float) Math.toDegrees(Math.atan((dVar.f1682c - this.f1673e) / (dVar.f1681b - this.f1672d)));
        }
    }

    /* JADX INFO: renamed from: a.Yd$c */
    public static class c extends e {

        /* JADX INFO: renamed from: h */
        public static final RectF f1674h = new RectF();

        /* JADX INFO: renamed from: b */
        @Deprecated
        public final float f1675b;

        /* JADX INFO: renamed from: c */
        @Deprecated
        public final float f1676c;

        /* JADX INFO: renamed from: d */
        @Deprecated
        public final float f1677d;

        /* JADX INFO: renamed from: e */
        @Deprecated
        public final float f1678e;

        /* JADX INFO: renamed from: f */
        @Deprecated
        public float f1679f;

        /* JADX INFO: renamed from: g */
        @Deprecated
        public float f1680g;

        public c(float f, float f2, float f3, float f4) {
            this.f1675b = f;
            this.f1676c = f2;
            this.f1677d = f3;
            this.f1678e = f4;
        }

        @Override // p000a.C0447Yd.e
        /* JADX INFO: renamed from: a */
        public final void mo1109a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f1683a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f1674h;
            rectF.set(this.f1675b, this.f1676c, this.f1677d, this.f1678e);
            path.arcTo(rectF, this.f1679f, this.f1680g, false);
            path.transform(matrix);
        }
    }

    /* JADX INFO: renamed from: a.Yd$d */
    public static class d extends e {

        /* JADX INFO: renamed from: b */
        public float f1681b;

        /* JADX INFO: renamed from: c */
        public float f1682c;

        @Override // p000a.C0447Yd.e
        /* JADX INFO: renamed from: a */
        public final void mo1109a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f1683a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f1681b, this.f1682c);
            path.transform(matrix);
        }
    }

    /* JADX INFO: renamed from: a.Yd$e */
    public static abstract class e {

        /* JADX INFO: renamed from: a */
        public final Matrix f1683a = new Matrix();

        /* JADX INFO: renamed from: a */
        public abstract void mo1109a(Matrix matrix, Path path);
    }

    /* JADX INFO: renamed from: a.Yd$f */
    public static abstract class f {

        /* JADX INFO: renamed from: b */
        public static final Matrix f1684b = new Matrix();

        /* JADX INFO: renamed from: a */
        public final Matrix f1685a = new Matrix();

        /* JADX INFO: renamed from: a */
        public abstract void mo1074a(Matrix matrix, C0375Ud c0375Ud, int i, Canvas canvas);
    }

    public C0447Yd() {
        m1107d(0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final void m1104a(float f2) {
        float f3 = this.f1666d;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.f1664b;
        float f6 = this.f1665c;
        c cVar = new c(f5, f6, f5, f6);
        cVar.f1679f = this.f1666d;
        cVar.f1680g = f4;
        this.f1669g.add(new a(cVar));
        this.f1666d = f2;
    }

    /* JADX INFO: renamed from: b */
    public final void m1105b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f1668f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((e) arrayList.get(i)).mo1109a(matrix, path);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1106c(float f2, float f3) {
        d dVar = new d();
        dVar.f1681b = f2;
        dVar.f1682c = f3;
        this.f1668f.add(dVar);
        b bVar = new b(dVar, this.f1664b, this.f1665c);
        float fM1108b = bVar.m1108b() + 270.0f;
        float fM1108b2 = bVar.m1108b() + 270.0f;
        m1104a(fM1108b);
        this.f1669g.add(bVar);
        this.f1666d = fM1108b2;
        this.f1664b = f2;
        this.f1665c = f3;
    }

    /* JADX INFO: renamed from: d */
    public final void m1107d(float f2, float f3, float f4) {
        this.f1663a = f2;
        this.f1664b = 0.0f;
        this.f1665c = f2;
        this.f1666d = f3;
        this.f1667e = (f3 + f4) % 360.0f;
        this.f1668f.clear();
        this.f1669g.clear();
    }
}
