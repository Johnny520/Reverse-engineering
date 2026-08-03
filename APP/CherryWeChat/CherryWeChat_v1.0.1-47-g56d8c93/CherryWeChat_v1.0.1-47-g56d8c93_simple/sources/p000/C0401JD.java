package p000;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: renamed from: JD */
/* JADX INFO: loaded from: classes.dex */
public final class C0401JD {

    /* JADX INFO: renamed from: p */
    public static final Matrix f1349p = null;

    /* JADX INFO: renamed from: a */
    public final Path f1350a;

    /* JADX INFO: renamed from: b */
    public final Path f1351b;

    /* JADX INFO: renamed from: c */
    public final Matrix f1352c;

    /* JADX INFO: renamed from: d */
    public Paint f1353d;

    /* JADX INFO: renamed from: e */
    public Paint f1354e;

    /* JADX INFO: renamed from: f */
    public PathMeasure f1355f;

    /* JADX INFO: renamed from: g */
    public final C0272GD f1356g;

    /* JADX INFO: renamed from: h */
    public float f1357h;

    /* JADX INFO: renamed from: i */
    public float f1358i;

    /* JADX INFO: renamed from: j */
    public float f1359j;

    /* JADX INFO: renamed from: k */
    public float f1360k;

    /* JADX INFO: renamed from: l */
    public int f1361l;

    /* JADX INFO: renamed from: m */
    public String f1362m;

    /* JADX INFO: renamed from: n */
    public Boolean f1363n;

    /* JADX INFO: renamed from: o */
    public final C0521M4 f1364o;

    static {
        f1349p = new Matrix();
    }

    public C0401JD() {
        this.f1352c = new Matrix();
        this.f1357h = 0.0f;
        this.f1358i = 0.0f;
        this.f1359j = 0.0f;
        this.f1360k = 0.0f;
        this.f1361l = 255;
        this.f1362m = null;
        this.f1363n = null;
        this.f1364o = new C0521M4(0);
        this.f1356g = new C0272GD();
        this.f1350a = new Path();
        this.f1351b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m836a(C0272GD r21, Matrix r22, Canvas r23, int r24, int r25) {
        Matrix r1 = r21.f879a;
        ArrayList r6 = r21.f880b;
        r1.set(r22);
        Matrix r2 = r21.f879a;
        r2.preConcat(r21.f888j);
        r23.save();
        char r7 = 0;
        int r8 = 0;
    L4:
        if (r8 >= r6.size()) goto L80;
        AbstractC0315HD r0 = (AbstractC0315HD) r6.get(r8);
        if ((r0 instanceof C0272GD) == false) goto L10;
        m836a((C0272GD) r0, r2, r23, r24, r25);
    L8:
        int r18 = r8;
    L79:
        r8 = r18 + 1;
        r7 = 0;
        goto L4
    L10:
        if ((r0 instanceof AbstractC0358ID) == false) goto L8;
        AbstractC0358ID r02 = (AbstractC0358ID) r0;
        float r5 = r24 / this.f1359j;
        float r10 = r25 / this.f1360k;
        float r11 = Math.min(r5, r10);
        Matrix r12 = this.f1352c;
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
        Path r54 = this.f1350a;
        r54.reset();
        C0552Mt[] r103 = r02.f1222a;
        if (r103 == null) goto L21;
        C0552Mt.m1095b(r103, r54);
    L21:
        Path r104 = this.f1351b;
        r104.reset();
        if ((r02 instanceof C0186ED) == true) goto L24;
        C0229FD r03 = (C0229FD) r02;
        float r112 = r03.f677i;
        if (r112 == 0.0f) goto L31;
    L32:
        float r13 = r03.f679k;
        float r113 = (r112 + r13) % 1.0f;
        float r15 = (r03.f678j + r13) % 1.0f;
        if (this.f1355f != null) goto L35;
        this.f1355f = new PathMeasure();
    L35:
        this.f1355f.setPath(r54, r17);
        float r132 = this.f1355f.getLength();
        float r114 = r113 * r132;
        float r152 = r15 * r132;
        r54.reset();
        if (r114 <= r152) goto L38;
        this.f1355f.getSegment(r114, r132, r54, true);
        float r133 = 0.0f;
        this.f1355f.getSegment(0.0f, r152, r54, true);
    L39:
        r54.rLineTo(r133, r133);
    L40:
        r104.addPath(r54, r12);
        C0477L3 r55 = r03.f674f;
        if (((Shader) r55.f1575c) != null) goto L46;
        if (r55.f1574b != 0) goto L46;
        float r19 = 255.0f;
        int r16 = 16777215;
    L59:
        C0477L3 r56 = r03.f672d;
        if (((Shader) r56.f1575c) != null) goto L65;
        if (r56.f1574b == 0) goto L79;
    L65:
        if (this.f1353d != null) goto L67;
        Paint r73 = new Paint(1);
        this.f1353d = r73;
        r73.setStyle(Paint.Style.STROKE);
    L67:
        Paint r74 = this.f1353d;
        Paint.Join r115 = r03.f681m;
        if (r115 == null) goto L70;
        r74.setStrokeJoin(r115);
    L70:
        Paint.Cap r116 = r03.f680l;
        if (r116 == null) goto L73;
        r74.setStrokeCap(r116);
    L73:
        r74.setStrokeMiter(r03.f682n);
        Shader r117 = (Shader) r56.f1575c;
        if (r117 == null) goto L76;
        r117.setLocalMatrix(r12);
        r74.setShader(r117);
        r74.setAlpha(Math.round(r03.f675g * r19));
    L77:
        r74.setColorFilter(null);
        r74.setStrokeWidth(r03.f673e * (r11 * r83));
        r23.drawPath(r104, r74);
        goto L79
    L76:
        r74.setShader(null);
        r74.setAlpha(255);
        int r57 = r56.f1574b;
        float r118 = r03.f675g;
        PorterDuff.Mode r122 = C0530MD.f1726j;
        r74.setColor((r57 & r16) | (((int) (Color.alpha(r57) * r118)) << 24));
    L46:
        if (this.f1354e != null) goto L48;
        r16 = 16777215;
        Paint r75 = new Paint(1);
        this.f1354e = r75;
        r75.setStyle(Paint.Style.FILL);
    L49:
        Paint r76 = this.f1354e;
        Shader r119 = (Shader) r55.f1575c;
        if (r119 == null) goto L52;
        r119.setLocalMatrix(r12);
        r76.setShader(r119);
        r76.setAlpha(Math.round(r03.f676h * 255.0f));
        r19 = 255.0f;
    L53:
        r76.setColorFilter(null);
        if (r03.f1224c != 0) goto L56;
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
        int r59 = r55.f1574b;
        float r1110 = r03.f676h;
        PorterDuff.Mode r192 = C0530MD.f1726j;
        r19 = 255.0f;
        r76.setColor((r59 & r16) | (((int) (Color.alpha(r59) * r1110)) << 24));
        goto L53
    L48:
        r16 = 16777215;
        goto L49
    L38:
        r133 = 0.0f;
        this.f1355f.getSegment(r114, r152, r54, true);
        goto L39
    L31:
        if (r03.f678j == 1.0f) goto L40;
    L24:
        if (r02.f1224c != 0) goto L26;
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
        return this.f1361l;
    }

    public void setAlpha(float r2) {
        setRootAlpha((int) (r2 * 255.0f));
    }

    public void setRootAlpha(int r1) {
        this.f1361l = r1;
    }

    public C0401JD(C0401JD r4) {
        this.f1352c = new Matrix();
        this.f1357h = 0.0f;
        this.f1358i = 0.0f;
        this.f1359j = 0.0f;
        this.f1360k = 0.0f;
        this.f1361l = 255;
        this.f1362m = null;
        this.f1363n = null;
        C0521M4 r0 = new C0521M4(0);
        this.f1364o = r0;
        this.f1356g = new C0272GD(r4.f1356g, r0);
        this.f1350a = new Path(r4.f1350a);
        this.f1351b = new Path(r4.f1351b);
        this.f1357h = r4.f1357h;
        this.f1358i = r4.f1358i;
        this.f1359j = r4.f1359j;
        this.f1360k = r4.f1360k;
        this.f1361l = r4.f1361l;
        this.f1362m = r4.f1362m;
        String r1 = r4.f1362m;
        if (r1 == null) goto L5;
        r0.put(r1, this);
    L5:
        this.f1363n = r4.f1363n;
    }
}
