package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: Sx */
/* JADX INFO: loaded from: classes.dex */
public final class C0813Sx {

    /* JADX INFO: renamed from: a */
    public final C1195ay[] f2567a;

    /* JADX INFO: renamed from: b */
    public final Matrix[] f2568b;

    /* JADX INFO: renamed from: c */
    public final Matrix[] f2569c;

    /* JADX INFO: renamed from: d */
    public final PointF f2570d;

    /* JADX INFO: renamed from: e */
    public final Path f2571e;

    /* JADX INFO: renamed from: f */
    public final Path f2572f;

    /* JADX INFO: renamed from: g */
    public final C1195ay f2573g;

    /* JADX INFO: renamed from: h */
    public final float[] f2574h;

    /* JADX INFO: renamed from: i */
    public final float[] f2575i;

    /* JADX INFO: renamed from: j */
    public final Path f2576j;

    /* JADX INFO: renamed from: k */
    public final Path f2577k;

    /* JADX INFO: renamed from: l */
    public final boolean f2578l;

    public C0813Sx() {
        this.f2567a = new C1195ay[4];
        this.f2568b = new Matrix[4];
        this.f2569c = new Matrix[4];
        this.f2570d = new PointF();
        this.f2571e = new Path();
        this.f2572f = new Path();
        this.f2573g = new C1195ay();
        this.f2574h = new float[2];
        this.f2575i = new float[2];
        this.f2576j = new Path();
        this.f2577k = new Path();
        this.f2578l = true;
        int r1 = 0;
    L3:
        if (r1 >= 4) goto L5;
        this.f2567a[r1] = new C1195ay();
        this.f2568b[r1] = new Matrix();
        this.f2569c[r1] = new Matrix();
        r1 = r1 + 1;
        goto L3
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m1615a(C0728Qx r21, float[] r22, float r23, RectF r24, C0892Uq r25, Path r26) {
        r26.rewind();
        Path r5 = this.f2571e;
        r5.rewind();
        Path r6 = this.f2572f;
        r6.rewind();
        r6.addRect(r24, Path.Direction.CW);
        int r8 = 0;
    L3:
        Matrix[] r9 = this.f2569c;
        float[] r12 = this.f2574h;
        int r13 = 4;
        C1195ay[] r14 = this.f2567a;
        Matrix[] r15 = this.f2568b;
        char r16 = 0;
        if (r8 >= 4) goto L33;
        if (r22 != null) goto L13;
        if (r8 == 1) goto L12;
        if (r8 == 2) goto L11;
        if (r8 == 3) goto L10;
        InterfaceC1006Xb r132 = r21.f2329f;
    L14:
        if (r8 == 1) goto L21;
        if (r8 != 2) goto L17;
        AbstractC0828TB r11 = r21.f2327d;
    L22:
        C1195ay r10 = r14[r8];
        r11.getClass();
        r11.mo1382k(r10, r23, r132.mo1563a(r24));
        int r102 = r8 + 1;
        float r112 = (r102 % 4) * 90;
        r15[r8].reset();
        PointF r133 = this.f2570d;
        if (r8 != 1) goto L25;
        int r17 = r8;
        r133.set(r24.right, r24.bottom);
    L32:
        r15[r17].setTranslate(r133.x, r133.y);
        r15[r17].preRotate(r112);
        C1195ay r7 = r14[r17];
        r12[0] = r7.f4098b;
        r12[1] = r7.f4099c;
        r15[r17].mapPoints(r12);
        r9[r17].reset();
        r9[r17].setTranslate(r12[0], r12[1]);
        r9[r17].preRotate(r112);
        r8 = r102;
        goto L3
    L25:
        if (r8 != 2) goto L27;
        r17 = r8;
        r133.set(r24.left, r24.bottom);
        goto L32
    L27:
        if (r8 == 3) goto L29;
        r17 = r8;
        r133.set(r24.right, r24.top);
        goto L32
    L29:
        r17 = r8;
        r133.set(r24.left, r24.top);
        goto L32
    L17:
        if (r8 == 3) goto L19;
        r11 = r21.f2325b;
        goto L22
    L19:
        r11 = r21.f2324a;
        goto L22
    L21:
        r11 = r21.f2326c;
        goto L22
    L10:
        r132 = r21.f2328e;
        goto L14
    L11:
        r132 = r21.f2331h;
        goto L14
    L12:
        r132 = r21.f2330g;
        goto L14
    L13:
        r132 = new C2704x9(r22[r8]);
        goto L14
    L33:
        int r72 = 0;
    L34:
        if (r72 >= r13) goto L73;
        C1195ay r82 = r14[r72];
        r82.getClass();
        r12[r16] = 0.0f;
        r12[1] = r82.f4097a;
        r15[r72].mapPoints(r12);
        if (r72 != 0) goto L38;
        r26.moveTo(r12[r16], r12[1]);
    L39:
        r14[r72].m2310b(r15[r72], r26);
        if (r25 == null) goto L42;
        C1195ay r83 = r14[r72];
        Matrix r113 = r15[r72];
        C1021Xq r134 = r25.f2786a;
        float r222 = 0.0f;
        BitSet r103 = r134.f3244e;
        r83.getClass();
        r103.set(r72, r16);
        AbstractC1114Zx[] r2 = r134.f3242c;
        r83.m2309a(r83.f4101e);
        r2[r72] = new C0856Tx(new ArrayList(r83.f4103g), new Matrix(r113));
    L43:
        int r27 = r72 + 1;
        int r84 = r27 % 4;
        C1195ay r104 = r14[r72];
        r12[0] = r104.f4098b;
        r12[1] = r104.f4099c;
        r15[r72].mapPoints(r12);
        C1195ay r105 = r14[r84];
        r105.getClass();
        float[] r114 = this.f2575i;
        r114[0] = r222;
        r114[1] = r105.f4097a;
        r15[r84].mapPoints(r114);
        Matrix[] r135 = r9;
        C1195ay[] r19 = r14;
        float r92 = Math.max(((float) Math.hypot(r12[0] - r114[0], r12[1] - r114[1])) - 0.001f, r222);
        C1195ay r106 = r19[r72];
        r12[0] = r106.f4098b;
        r12[1] = r106.f4099c;
        r15[r72].mapPoints(r12);
        if (r72 != 1) goto L46;
    L48:
        Math.abs(r24.centerX() - r12[0]);
    L49:
        C1195ay r115 = this.f2573g;
        r115.m2312d(0.0f, 270.0f, 0.0f);
        if (r72 != 1) goto L52;
        C1456gf r142 = r21.f2334k;
    L59:
        r142.getClass();
        r115.m2311c(r92, 0.0f);
        Path r93 = this.f2576j;
        r93.reset();
        r115.m2310b(r135[r72], r93);
        if (this.f2578l == false) goto L68;
        if (m1616b(r93, r72) == false) goto L64;
    L67:
        r93.op(r93, r6, Path.Op.DIFFERENCE);
        r12[0] = 0.0f;
        r12[1] = r115.f4097a;
        r135[r72].mapPoints(r12);
        r5.moveTo(r12[0], r12[1]);
        r115.m2310b(r135[r72], r5);
    L69:
        if (r25 == null) goto L71;
        Matrix r85 = r135[r72];
        C1021Xq r94 = r25.f2786a;
        char r136 = 0;
        r94.f3244e.set(r72 + 4, false);
        AbstractC1114Zx[] r95 = r94.f3243d;
        r115.m2309a(r115.f4101e);
        r95[r72] = new C0856Tx(new ArrayList(r115.f4103g), new Matrix(r85));
    L72:
        r9 = r135;
        r72 = r27;
        r16 = r136;
        r14 = r19;
        r13 = 4;
        goto L34
    L71:
        r136 = 0;
        goto L72
    L64:
        if (m1616b(r93, r84) == true) goto L67;
    L68:
        r115.m2310b(r135[r72], r26);
        goto L69
    L52:
        if (r72 != 2) goto L54;
        r142 = r21.f2335l;
        goto L59
    L54:
        if (r72 == 3) goto L56;
        r142 = r21.f2333j;
        goto L59
    L56:
        r142 = r21.f2332i;
        goto L59
    L46:
        if (r72 == 3) goto L48;
        Math.abs(r24.centerY() - r12[1]);
        goto L49
    L42:
        r222 = 0.0f;
        goto L43
    L38:
        r26.lineTo(r12[r16], r12[1]);
        goto L39
    L73:
        r26.close();
        r5.close();
        if (r5.isEmpty() == true) goto L85;
        r26.op(r5, Path.Op.UNION);
        return;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1616b(Path r4, int r5) {
        Path r0 = this.f2577k;
        r0.reset();
        this.f2567a[r5].m2310b(this.f2568b[r5], r0);
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
