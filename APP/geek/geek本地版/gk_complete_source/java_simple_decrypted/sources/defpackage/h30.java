package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public final class h30 {
    public final p30[] a;
    public final Matrix[] b;
    public final Matrix[] c;
    public final PointF d;
    public final Path e;
    public final Path f;
    public final p30 g;
    public final float[] h;
    public final float[] i;
    public final Path j;
    public final Path k;
    public final boolean l;

    public h30() {
        this.a = new p30[4];
        this.b = new Matrix[4];
        this.c = new Matrix[4];
        this.d = new PointF();
        this.e = new Path();
        this.f = new Path();
        this.g = new p30();
        this.h = new float[2];
        this.i = new float[2];
        this.j = new Path();
        this.k = new Path();
        this.l = true;
        int r1 = 0;
    L3:
        if (r1 >= 4) goto L5;
        this.a[r1] = new p30();
        this.b[r1] = new Matrix();
        this.c[r1] = new Matrix();
        r1 = r1 + 1;
        goto L3
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(f30 r22, float r23, RectF r24, l0 r25, Path r26) {
        r26.rewind();
        Path r5 = this.e;
        r5.rewind();
        Path r6 = this.f;
        r6.rewind();
        r6.addRect(r24, Path.Direction.CW);
        int r8 = 0;
    L3:
        Matrix[] r9 = this.c;
        float[] r12 = this.h;
        int r13 = 4;
        p30[] r14 = this.a;
        Matrix[] r15 = this.b;
        char r16 = 0;
        if (r8 >= 4) goto L30;
        if (r8 == 1) goto L11;
        if (r8 == 2) goto L10;
        if (r8 == 3) goto L9;
        de r132 = r22.f;
    L12:
        if (r8 == 1) goto L18;
        if (r8 == 2) goto L17;
        if (r8 == 3) goto L16;
        ip r11 = r22.b;
    L19:
        p30 r10 = r14[r8];
        r11.getClass();
        r11.w(r10, r23, r132.a(r24));
        int r102 = r8 + 1;
        float r112 = (r102 % 4) * 90;
        r15[r8].reset();
        PointF r133 = this.d;
        if (r8 != 1) goto L22;
        int r17 = r8;
        r133.set(r24.right, r24.bottom);
    L29:
        r15[r17].setTranslate(r133.x, r133.y);
        r15[r17].preRotate(r112);
        p30 r7 = r14[r17];
        r12[0] = r7.b;
        r12[1] = r7.c;
        r15[r17].mapPoints(r12);
        r9[r17].reset();
        r9[r17].setTranslate(r12[0], r12[1]);
        r9[r17].preRotate(r112);
        r8 = r102;
        goto L3
    L22:
        if (r8 != 2) goto L24;
        r17 = r8;
        r133.set(r24.left, r24.bottom);
        goto L29
    L24:
        if (r8 == 3) goto L26;
        r17 = r8;
        r133.set(r24.right, r24.top);
        goto L29
    L26:
        r17 = r8;
        r133.set(r24.left, r24.top);
        goto L29
    L16:
        r11 = r22.a;
        goto L19
    L17:
        r11 = r22.d;
        goto L19
    L18:
        r11 = r22.c;
        goto L19
    L9:
        r132 = r22.e;
        goto L12
    L10:
        r132 = r22.h;
        goto L12
    L11:
        r132 = r22.g;
        goto L12
    L30:
        int r72 = 0;
    L31:
        if (r72 >= r13) goto L70;
        p30 r82 = r14[r72];
        r82.getClass();
        r12[r16] = 0.0f;
        r12[1] = r82.a;
        r15[r72].mapPoints(r12);
        if (r72 != 0) goto L35;
        r26.moveTo(r12[r16], r12[1]);
    L36:
        r14[r72].b(r15[r72], r26);
        if (r25 == null) goto L39;
        p30 r83 = r14[r72];
        Matrix r113 = r15[r72];
        eu r134 = (eu) r25.b;
        float r232 = 0.0f;
        BitSet r103 = r134.d;
        r83.getClass();
        r103.set(r72, r16);
        o30[] r2 = r134.b;
        r83.a(r83.e);
        r2[r72] = new i30(new ArrayList(r83.g), new Matrix(r113));
    L40:
        int r27 = r72 + 1;
        int r84 = r27 % 4;
        p30 r104 = r14[r72];
        r12[0] = r104.b;
        r12[1] = r104.c;
        r15[r72].mapPoints(r12);
        p30 r105 = r14[r84];
        r105.getClass();
        float[] r114 = this.i;
        r114[0] = r232;
        r114[1] = r105.a;
        r15[r84].mapPoints(r114);
        Matrix[] r135 = r9;
        p30[] r19 = r14;
        float r92 = Math.max(((float) Math.hypot(r12[0] - r114[0], r12[1] - r114[1])) - 0.001f, r232);
        p30 r106 = r19[r72];
        r12[0] = r106.b;
        r12[1] = r106.c;
        r15[r72].mapPoints(r12);
        if (r72 != 1) goto L43;
    L45:
        Math.abs(r24.centerX() - r12[0]);
    L46:
        p30 r115 = this.g;
        r115.d(0.0f, 270.0f, 0.0f);
        if (r72 != 1) goto L49;
        vh r142 = r22.k;
    L56:
        r142.getClass();
        r115.c(r92, 0.0f);
        Path r93 = this.j;
        r93.reset();
        r115.b(r135[r72], r93);
        if (this.l == false) goto L65;
        if (b(r93, r72) == false) goto L61;
    L64:
        r93.op(r93, r6, Path.Op.DIFFERENCE);
        r12[0] = 0.0f;
        r12[1] = r115.a;
        r135[r72].mapPoints(r12);
        r5.moveTo(r12[0], r12[1]);
        r115.b(r135[r72], r5);
    L66:
        if (r25 == null) goto L68;
        Matrix r85 = r135[r72];
        eu r94 = (eu) r25.b;
        char r136 = 0;
        r94.d.set(r72 + 4, false);
        o30[] r95 = r94.c;
        r115.a(r115.e);
        r95[r72] = new i30(new ArrayList(r115.g), new Matrix(r85));
    L69:
        r72 = r27;
        r16 = r136;
        r14 = r19;
        r9 = r135;
        r13 = 4;
        goto L31
    L68:
        r136 = 0;
        goto L69
    L61:
        if (b(r93, r84) == true) goto L64;
    L65:
        r115.b(r135[r72], r26);
        goto L66
    L49:
        if (r72 != 2) goto L51;
        r142 = r22.l;
        goto L56
    L51:
        if (r72 == 3) goto L53;
        r142 = r22.j;
        goto L56
    L53:
        r142 = r22.i;
        goto L56
    L43:
        if (r72 == 3) goto L45;
        Math.abs(r24.centerY() - r12[1]);
        goto L46
    L39:
        r232 = 0.0f;
        goto L40
    L35:
        r26.lineTo(r12[r16], r12[1]);
        goto L36
    L70:
        r26.close();
        r5.close();
        if (r5.isEmpty() == true) goto L82;
        r26.op(r5, Path.Op.UNION);
        return;
    }

    public final boolean b(Path r4, int r5) {
        Path r0 = this.k;
        r0.reset();
        this.a[r5].b(this.b[r5], r0);
        RectF r52 = new RectF();
        r4.computeBounds(r52, true);
        r0.computeBounds(r52, true);
        r4.op(r0, Path.Op.INTERSECT);
        r4.computeBounds(r52, true);
        if (r52.isEmpty() == true) goto L5;
    L11:
        return true;
    L5:
        if (r52.width() > 1.0f) goto L7;
        return false;
    L7:
        if (r52.height() > 1.0f) goto L11;
        return false;
    }
}
