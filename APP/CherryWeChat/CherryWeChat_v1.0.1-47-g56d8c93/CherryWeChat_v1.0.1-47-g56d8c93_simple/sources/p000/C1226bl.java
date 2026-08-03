package p000;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import androidx.constraintlayout.utils.widget.ImageFilterView;

/* JADX INFO: renamed from: bl */
/* JADX INFO: loaded from: classes.dex */
public final class C1226bl {

    /* JADX INFO: renamed from: a */
    public float[] f4183a;

    /* JADX INFO: renamed from: b */
    public ColorMatrix f4184b;

    /* JADX INFO: renamed from: c */
    public ColorMatrix f4185c;

    /* JADX INFO: renamed from: d */
    public float f4186d;

    /* JADX INFO: renamed from: e */
    public float f4187e;

    /* JADX INFO: renamed from: f */
    public float f4188f;

    /* JADX INFO: renamed from: g */
    public float f4189g;

    /* JADX INFO: renamed from: a */
    public final void m2353a(ImageFilterView r37) {
        float[] r1 = this.f4183a;
        ColorMatrix r2 = this.f4185c;
        ColorMatrix r3 = this.f4184b;
        r3.reset();
        float r4 = this.f4187e;
        boolean r26 = true;
        if (r4 == 1.0f) goto L5;
        float r6 = 1.0f - r4;
        float r28 = 0.2999f * r6;
        float r29 = 0.587f * r6;
        float r62 = r6 * 0.114f;
        r1[0] = r28 + r4;
        r1[1] = r29;
        r1[2] = r62;
        r1[3] = 0.0f;
        r1[4] = 0.0f;
        r1[5] = r28;
        r1[6] = r29 + r4;
        r1[7] = r62;
        r1[8] = 0.0f;
        r1[9] = 0.0f;
        r1[10] = r28;
        r1[11] = r29;
        r1[12] = r62 + r4;
        r1[13] = 0.0f;
        r1[14] = 0.0f;
        r1[15] = 0.0f;
        r1[16] = 0.0f;
        r1[17] = 0.0f;
        r1[18] = 1.0f;
        r1[19] = 0.0f;
        r3.set(r1);
        boolean r42 = true;
    L6:
        float r63 = this.f4188f;
        if (r63 == 1.0f) goto L9;
        r2.setScale(r63, r63, r63, 1.0f);
        r3.postConcat(r2);
        r42 = true;
    L9:
        float r64 = this.f4189g;
        if (r64 != 1.0f) goto L12;
        float r31 = 1.0f;
        char r282 = 18;
        char r33 = 17;
        char r65 = 16;
        char r34 = 15;
        char r292 = 14;
        char r35 = '\r';
    L27:
        float r5 = this.f4186d;
        if (r5 == r31) goto L30;
        r1[0] = r5;
        r1[1] = 0.0f;
        r1[2] = 0.0f;
        r1[3] = 0.0f;
        r1[4] = 0.0f;
        r1[5] = 0.0f;
        r1[6] = r5;
        r1[7] = 0.0f;
        r1[8] = 0.0f;
        r1[9] = 0.0f;
        r1[10] = 0.0f;
        r1[11] = 0.0f;
        r1[12] = r5;
        r1[r35] = 0.0f;
        r1[r292] = 0.0f;
        r1[r34] = 0.0f;
        r1[r65] = 0.0f;
        r1[r33] = 0.0f;
        r1[r282] = r31;
        r1[19] = 0.0f;
        r2.set(r1);
        r3.postConcat(r2);
    L31:
        if (r26 == false) goto L34;
        r37.setColorFilter(new ColorMatrixColorFilter(r3));
        return;
    L34:
        r37.clearColorFilter();
        return;
    L30:
        r26 = r42;
        goto L31
    L12:
        if (r64 > 0.0f) goto L14;
        r64 = 0.01f;
    L14:
        float r43 = (5000.0f / r64) / 100.0f;
        r31 = 1.0f;
        if (r43 <= 66.0f) goto L17;
        float r32 = 66.0f;
        r282 = 18;
        r33 = 17;
        double r8 = r43 - 60.0f;
        r65 = 16;
        r34 = 15;
        float r10 = ((float) Math.pow(r8, -0.13320475816726685d)) * 329.69873f;
        char r11 = 14;
        r35 = '\r';
        float r82 = ((float) Math.pow(r8, 0.07551485300064087d)) * 288.12216f;
    L19:
        if (r43 < r32) goto L21;
        char r9 = r11;
        float r322 = 305.0448f;
        float r44 = 255.0f;
    L25:
        float r102 = Math.min(255.0f, Math.max(r10, 0.0f));
        float r83 = Math.min(255.0f, Math.max(r82, 0.0f));
        float r45 = Math.min(255.0f, Math.max(r44, 0.0f));
        float r112 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
        r292 = r9;
        float r92 = (((float) Math.log(40.0f)) * 138.51773f) - r322;
        float r103 = Math.min(255.0f, Math.max(255.0f, 0.0f));
        float r113 = Math.min(255.0f, Math.max(r112, 0.0f));
        float r46 = r45 / Math.min(255.0f, Math.max(r92, 0.0f));
        r1[0] = r102 / r103;
        r1[1] = 0.0f;
        r1[2] = 0.0f;
        r1[3] = 0.0f;
        r1[4] = 0.0f;
        r1[5] = 0.0f;
        r1[6] = r83 / r113;
        r1[7] = 0.0f;
        r1[8] = 0.0f;
        r1[9] = 0.0f;
        r1[10] = 0.0f;
        r1[11] = 0.0f;
        r1[12] = r46;
        r1[r35] = 0.0f;
        r1[r292] = 0.0f;
        r1[r34] = 0.0f;
        r1[r65] = 0.0f;
        r1[r33] = 0.0f;
        r1[r282] = 1.0f;
        r1[19] = 0.0f;
        r2.set(r1);
        r3.postConcat(r2);
        r42 = true;
        goto L27
    L21:
        if (r43 <= 19.0f) goto L23;
        r9 = r11;
        r322 = 305.0448f;
        r44 = (((float) Math.log(r43 - 10.0f)) * 138.51773f) - 305.0448f;
        goto L25
    L23:
        r9 = r11;
        r322 = 305.0448f;
        r44 = 0.0f;
        goto L25
    L17:
        r32 = 66.0f;
        r282 = 18;
        r33 = 17;
        r65 = 16;
        r34 = 15;
        r11 = 14;
        r35 = '\r';
        r82 = (((float) Math.log(r43)) * 99.4708f) - 161.11957f;
        r10 = 255.0f;
        goto L19
    L5:
        r42 = false;
        goto L6
    }
}
