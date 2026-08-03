package p089x0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.abc.core.runtime.AbstractC0805P;
import java.util.ArrayList;
import java.util.BitSet;
import p006D.C0095d;

/* JADX INFO: renamed from: x0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1129m {

    /* JADX INFO: renamed from: a */
    public final C1137u[] f4360a;

    /* JADX INFO: renamed from: b */
    public final Matrix[] f4361b;

    /* JADX INFO: renamed from: c */
    public final Matrix[] f4362c;

    /* JADX INFO: renamed from: d */
    public final PointF f4363d;

    /* JADX INFO: renamed from: e */
    public final Path f4364e;

    /* JADX INFO: renamed from: f */
    public final Path f4365f;

    /* JADX INFO: renamed from: g */
    public final C1137u f4366g;

    /* JADX INFO: renamed from: h */
    public final float[] f4367h;

    /* JADX INFO: renamed from: i */
    public final float[] f4368i;

    /* JADX INFO: renamed from: j */
    public final Path f4369j;

    /* JADX INFO: renamed from: k */
    public final Path f4370k;

    /* JADX INFO: renamed from: l */
    public final boolean f4371l;

    public C1129m() {
        this.f4360a = new C1137u[4];
        this.f4361b = new Matrix[4];
        this.f4362c = new Matrix[4];
        this.f4363d = new PointF();
        this.f4364e = new Path();
        this.f4365f = new Path();
        this.f4366g = new C1137u();
        this.f4367h = new float[2];
        this.f4368i = new float[2];
        this.f4369j = new Path();
        this.f4370k = new Path();
        this.f4371l = true;
        int r1 = 0;
    L3:
        if (r1 >= 4) goto L5;
        this.f4360a[r1] = new C1137u();
        this.f4361b[r1] = new Matrix();
        this.f4362c[r1] = new Matrix();
        r1 = r1 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: a */
    public final void m2661a(C1127k r21, float r22, RectF r23, C0095d r24, Path r25) {
        C1129m r02 = this;
        r25.rewind();
        Path r5 = r02.f4364e;
        r5.rewind();
        Path r6 = r02.f4365f;
        r6.rewind();
        r6.addRect(r23, Path.Direction.CW);
        int r8 = 0;
    L3:
        int r10 = 4;
        Matrix[] r11 = r02.f4362c;
        float[] r14 = r02.f4367h;
        Matrix[] r15 = r02.f4361b;
        C1137u[] r7 = r02.f4360a;
        if (r8 >= 4) goto L30;
        if (r8 == 1) goto L11;
        if (r8 == 2) goto L10;
        if (r8 == 3) goto L9;
        InterfaceC1119c r102 = r21.f4352f;
    L12:
        if (r8 == 1) goto L18;
        if (r8 == 2) goto L17;
        if (r8 == 3) goto L16;
        AbstractC0805P r13 = r21.f4348b;
    L19:
        C1137u r12 = r7[r8];
        r13.getClass();
        r13.mo2074s(r12, r22, r102.mo2634a(r23));
        int r103 = r8 + 1;
        float r122 = (r103 % 4) * 90;
        r15[r8].reset();
        PointF r132 = r02.f4363d;
        if (r8 != 1) goto L22;
        int r17 = r103;
        r132.set(r23.right, r23.bottom);
    L29:
        r15[r8].setTranslate(r132.x, r132.y);
        r15[r8].preRotate(r122);
        C1137u r72 = r7[r8];
        r14[0] = r72.f4392c;
        r14[1] = r72.f4393d;
        r15[r8].mapPoints(r14);
        r11[r8].reset();
        r11[r8].setTranslate(r14[0], r14[1]);
        r11[r8].preRotate(r122);
        r8 = r17;
        goto L3
    L22:
        if (r8 != 2) goto L24;
        r17 = r103;
        r132.set(r23.left, r23.bottom);
        goto L29
    L24:
        if (r8 == 3) goto L26;
        r17 = r103;
        r132.set(r23.right, r23.top);
        goto L29
    L26:
        r17 = r103;
        r132.set(r23.left, r23.top);
        goto L29
    L16:
        r13 = r21.f4347a;
        goto L19
    L17:
        r13 = r21.f4350d;
        goto L19
    L18:
        r13 = r21.f4349c;
        goto L19
    L9:
        r102 = r21.f4351e;
        goto L12
    L10:
        r102 = r21.f4354h;
        goto L12
    L11:
        r102 = r21.f4353g;
        goto L12
    L30:
        int r82 = 0;
    L31:
        if (r82 >= r10) goto L69;
        C1137u r9 = r7[r82];
        r14[0] = r9.f4390a;
        r14[1] = r9.f4391b;
        r15[r82].mapPoints(r14);
        if (r82 != 0) goto L35;
        r25.moveTo(r14[0], r14[1]);
    L36:
        r7[r82].m2667b(r15[r82], r25);
        if (r24 == null) goto L39;
        C1137u r92 = r7[r82];
        Matrix r104 = r15[r82];
        C1123g r123 = (C1123g) r24.f251b;
        BitSet r133 = r123.f4315d;
        r92.getClass();
        r133.set(r82, false);
        r92.m2666a(r92.f4395f);
        r123.f4313b[r82] = new C1130n(new ArrayList(r92.f4397h), new Matrix(r104));
    L39:
        int r105 = r82 + 1;
        int r2 = r105 % 4;
        C1137u r93 = r7[r82];
        r14[0] = r93.f4392c;
        r14[1] = r93.f4393d;
        r15[r82].mapPoints(r14);
        C1137u r94 = r7[r2];
        float r124 = r94.f4390a;
        float[] r134 = r02.f4368i;
        r134[0] = r124;
        r134[1] = r94.f4391b;
        r15[r2].mapPoints(r134);
        float r95 = Math.max(((float) Math.hypot(r14[0] - r134[0], r14[1] - r134[1])) - 0.001f, 0.0f);
        C1137u r125 = r7[r82];
        r14[0] = r125.f4392c;
        r14[1] = r125.f4393d;
        r15[r82].mapPoints(r14);
        if (r82 != 1) goto L42;
    L44:
        Math.abs(r23.centerX() - r14[0]);
    L45:
        C1137u r135 = r02.f4366g;
        r135.m2669d(0.0f, 270.0f, 0.0f);
        if (r82 != 1) goto L48;
        C1121e r126 = r21.f4357k;
    L55:
        r126.getClass();
        r135.m2668c(r95, 0.0f);
        Path r96 = r02.f4369j;
        r96.reset();
        r135.m2667b(r11[r82], r96);
        if (r02.f4371l == false) goto L64;
        if (r02.m2662b(r96, r82) == false) goto L60;
    L63:
        r96.op(r96, r6, Path.Op.DIFFERENCE);
        r14[0] = r135.f4390a;
        r14[1] = r135.f4391b;
        r11[r82].mapPoints(r14);
        r5.moveTo(r14[0], r14[1]);
        r135.m2667b(r11[r82], r5);
    L65:
        if (r24 == null) goto L68;
        Matrix r26 = r11[r82];
        C1123g r97 = (C1123g) r24.f251b;
        r97.f4315d.set(r82 + 4, false);
        r135.m2666a(r135.f4395f);
        r97.f4314c[r82] = new C1130n(new ArrayList(r135.f4397h), new Matrix(r26));
    L68:
        r10 = 4;
        r02 = this;
        r82 = r105;
        goto L31
    L60:
        if (r02.m2662b(r96, r2) == true) goto L63;
    L64:
        r135.m2667b(r11[r82], r25);
        goto L65
    L48:
        if (r82 != 2) goto L50;
        r126 = r21.f4358l;
        goto L55
    L50:
        if (r82 == 3) goto L52;
        r126 = r21.f4356j;
        goto L55
    L52:
        r126 = r21.f4355i;
        goto L55
    L42:
        if (r82 == 3) goto L44;
        Math.abs(r23.centerY() - r14[1]);
        goto L45
    L35:
        r25.lineTo(r14[0], r14[1]);
        goto L36
    L69:
        r25.close();
        r5.close();
        if (r5.isEmpty() == true) goto L81;
        r25.op(r5, Path.Op.UNION);
        return;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2662b(Path r4, int r5) {
        Path r02 = this.f4370k;
        r02.reset();
        this.f4360a[r5].m2667b(this.f4361b[r5], r02);
        RectF r52 = new RectF();
        r4.computeBounds(r52, true);
        r02.computeBounds(r52, true);
        r4.op(r02, Path.Op.INTERSECT);
        r4.computeBounds(r52, true);
        if (r52.isEmpty() == true) goto L5;
        return true;
    L5:
        if (r52.width() > 1.0f) goto L7;
    L9:
        return false;
    L7:
        if (r52.height() <= 1.0f) goto L9;
        return true;
    }
}
