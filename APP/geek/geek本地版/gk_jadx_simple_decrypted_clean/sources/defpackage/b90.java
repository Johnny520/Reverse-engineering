package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b90 {
    public static final Matrix p = null;
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final y80 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final n6 o;

    static {
        p = new Matrix();
    }

    public b90() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new n6();
        this.g = new y80();
        this.a = new Path();
        this.b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(y80 r21, Matrix r22, Canvas r23, int r24, int r25) {
        Matrix r1 = r21.a;
        ArrayList r6 = r21.b;
        r1.set(r22);
        Matrix r2 = r21.a;
        r2.preConcat(r21.j);
        r23.save();
        char r7 = 0;
        int r8 = 0;
    L4:
        if (r8 >= r6.size()) goto L80;
        z80 r0 = (z80) r6.get(r8);
        if ((r0 instanceof y80) == false) goto L10;
        a((y80) r0, r2, r23, r24, r25);
    L8:
        int r18 = r8;
    L79:
        r8 = r18 + 1;
        r7 = 0;
        goto L4
    L10:
        if ((r0 instanceof a90) == false) goto L8;
        a90 r02 = (a90) r0;
        float r5 = r24 / this.j;
        float r10 = r25 / this.k;
        float r11 = Math.min(r5, r10);
        Matrix r12 = this.c;
        r12.set(r2);
        r12.postScale(r5, r10);
        float[] r52 = {0.0f, 1.0f, 1.0f, 0.0f};
        r2.mapVectors(r52);
        float r102 = (float) Math.hypot(r52[r7], r52[1]);
        boolean r17 = r7;
        r18 = r8;
        float r72 = (float) Math.hypot(r52[2], r52[3]);
        float r82 = (r52[r17 ? 1 : 0] * r52[3]) - (r52[1] * r52[2]);
        float r53 = Math.max(r102, r72);
        if (r53 <= 0.0f) goto L14;
        float r83 = Math.abs(r82) / r53;
    L16:
        if (r83 == 0.0f) goto L79;
        Path r54 = this.a;
        r54.reset();
        ox[] r103 = r02.a;
        if (r103 == null) goto L21;
        ox.b(r103, r54);
    L21:
        Path r104 = this.b;
        r104.reset();
        if ((r02 instanceof w80) == true) goto L24;
        x80 r03 = (x80) r02;
        float r112 = r03.i;
        if (r112 == 0.0f) goto L31;
    L32:
        float r13 = r03.k;
        float r113 = (r112 + r13) % 1.0f;
        float r15 = (r03.j + r13) % 1.0f;
        if (this.f != null) goto L35;
        this.f = new PathMeasure();
    L35:
        this.f.setPath(r54, r17);
        float r132 = this.f.getLength();
        float r114 = r113 * r132;
        float r152 = r15 * r132;
        r54.reset();
        if (r114 <= r152) goto L38;
        this.f.getSegment(r114, r132, r54, true);
        float r133 = 0.0f;
        this.f.getSegment(0.0f, r152, r54, true);
    L39:
        r54.rLineTo(r133, r133);
    L40:
        r104.addPath(r54, r12);
        z3 r55 = r03.f;
        if (((Shader) r55.b) != null) goto L46;
        if (r55.a != 0) goto L46;
        float r19 = 255.0f;
        int r16 = 16777215;
    L59:
        z3 r56 = r03.d;
        if (((Shader) r56.b) != null) goto L65;
        if (r56.a == 0) goto L79;
    L65:
        if (this.d != null) goto L67;
        Paint r73 = new Paint(1);
        this.d = r73;
        r73.setStyle(Paint.Style.STROKE);
    L67:
        Paint r74 = this.d;
        Paint.Join r115 = r03.m;
        if (r115 == null) goto L70;
        r74.setStrokeJoin(r115);
    L70:
        Paint.Cap r116 = r03.l;
        if (r116 == null) goto L73;
        r74.setStrokeCap(r116);
    L73:
        r74.setStrokeMiter(r03.n);
        Shader r117 = (Shader) r56.b;
        if (r117 == null) goto L76;
        r117.setLocalMatrix(r12);
        r74.setShader(r117);
        r74.setAlpha(Math.round(r03.g * r19));
    L77:
        r74.setColorFilter(null);
        r74.setStrokeWidth(r03.e * (r11 * r83));
        r23.drawPath(r104, r74);
        goto L79
    L76:
        r74.setShader(null);
        r74.setAlpha(255);
        int r57 = r56.a;
        float r118 = r03.g;
        PorterDuff.Mode r122 = e90.j;
        r74.setColor((r57 & r16) | (((int) (Color.alpha(r57) * r118)) << 24));
    L46:
        if (this.e != null) goto L48;
        r16 = 16777215;
        Paint r75 = new Paint(1);
        this.e = r75;
        r75.setStyle(Paint.Style.FILL);
    L49:
        Paint r76 = this.e;
        Shader r119 = (Shader) r55.b;
        if (r119 == null) goto L52;
        r119.setLocalMatrix(r12);
        r76.setShader(r119);
        r76.setAlpha(Math.round(r03.h * 255.0f));
        r19 = 255.0f;
    L53:
        r76.setColorFilter(null);
        if (r03.c != 0) goto L56;
        Path.FillType r58 = Path.FillType.WINDING;
    L57:
        r104.setFillType(r58);
        r23.drawPath(r104, r76);
        goto L59
    L56:
        r58 = Path.FillType.EVEN_ODD;
        goto L57
    L52:
        r76.setShader(null);
        r76.setAlpha(255);
        int r59 = r55.a;
        float r1110 = r03.h;
        PorterDuff.Mode r192 = e90.j;
        r19 = 255.0f;
        r76.setColor((r59 & r16) | (((int) (Color.alpha(r59) * r1110)) << 24));
        goto L53
    L48:
        r16 = 16777215;
        goto L49
    L38:
        r133 = 0.0f;
        this.f.getSegment(r114, r152, r54, true);
        goto L39
    L31:
        if (r03.j == 1.0f) goto L40;
    L24:
        if (r02.c != 0) goto L26;
        Path.FillType r04 = Path.FillType.WINDING;
    L27:
        r104.setFillType(r04);
        r104.addPath(r54, r12);
        r23.clipPath(r104);
        goto L79
    L26:
        r04 = Path.FillType.EVEN_ODD;
        goto L27
    L14:
        r83 = 0.0f;
        goto L16
    L80:
        r23.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float r2) {
        setRootAlpha((int) (r2 * 255.0f));
    }

    public void setRootAlpha(int r1) {
        this.l = r1;
    }

    public b90(b90 r4) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        n6 r0 = new n6();
        this.o = r0;
        this.g = new y80(r4.g, r0);
        this.a = new Path(r4.a);
        this.b = new Path(r4.b);
        this.h = r4.h;
        this.i = r4.i;
        this.j = r4.j;
        this.k = r4.k;
        this.l = r4.l;
        this.m = r4.m;
        String r1 = r4.m;
        if (r1 == null) goto L5;
        r0.put(r1, this);
    L5:
        this.n = r4.n;
    }
}
