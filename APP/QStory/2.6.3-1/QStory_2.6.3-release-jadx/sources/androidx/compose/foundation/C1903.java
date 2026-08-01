package androidx.compose.foundation;

import android.text.Layout;
import androidx.appcompat.app.C0960;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.C2445;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2339;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2341;
import androidx.compose.p001ui.node.C2593;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2888;
import androidx.compose.p001ui.text.C2899;
import java.io.Serializable;
import kotlin.C6008;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7387;
import p128.C8157;
import p211.AbstractC8663;
import p228.C8773;
import p228.C8780;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1903 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3513;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Serializable f3514;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ long f3515;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f3516;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3517 = 1;

    public /* synthetic */ C1903(long j, float[] fArr, Ref$IntRef ref$IntRef, Ref$FloatRef ref$FloatRef) {
        this.f3515 = j;
        this.f3516 = fArr;
        this.f3514 = ref$IntRef;
        this.f3513 = ref$FloatRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        long j;
        C6008 c6008;
        float[] fArr;
        int i;
        float fM13988;
        float fM139882;
        int i2 = this.f3517;
        C6008 c60082 = C6008.f15084;
        Object obj2 = this.f3513;
        Serializable serializable = this.f3514;
        Object obj3 = this.f3516;
        switch (i2) {
            case 0:
                C8157 c8157 = (C8157) obj3;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) serializable;
                long j2 = this.f3515;
                C2442 c2442 = (C2442) obj2;
                C2593 c2593 = (C2593) ((InterfaceC2341) obj);
                c2593.m3871();
                float f = c8157.f19885;
                float f2 = c8157.f19884;
                C2342 c2342 = c2593.f5521;
                ((C0960) c2342.f4629.f664).m991(f, f2);
                try {
                    InterfaceC2339.m3259(c2593, (C2445) ref$ObjectRef.element, j2, 0L, 0.0f, c2442, 0, 890);
                    return c60082;
                } finally {
                    ((C0960) c2342.f4629.f664).m991(-f, -f2);
                }
            default:
                float[] fArr2 = (float[]) obj3;
                Ref$IntRef ref$IntRef = (Ref$IntRef) serializable;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj2;
                C2899 c2899 = (C2899) obj;
                int i3 = c2899.f6466;
                C2888 c2888 = c2899.f6467;
                int iM4310 = c2899.f6465;
                long j3 = this.f3515;
                int iM4317 = i3 > C2869.m4317(j3) ? c2899.f6466 : C2869.m4317(j3);
                if (iM4310 >= C2869.m4310(j3)) {
                    iM4310 = C2869.m4310(j3);
                }
                long jM4330 = AbstractC2882.m4330(c2899.m4358(iM4317), c2899.m4358(iM4310));
                int i4 = ref$IntRef.element;
                C8780 c8780 = c2888.f6431;
                int iM43172 = C2869.m4317(jM4330);
                int iM43102 = C2869.m4310(jM4330);
                Layout layout = c8780.f22346;
                int length = layout.getText().length();
                if (iM43172 < 0) {
                    AbstractC8663.m13757("startOffset must be > 0");
                }
                if (iM43172 >= length) {
                    AbstractC8663.m13757("startOffset must be less than text length");
                }
                if (iM43102 <= iM43172) {
                    AbstractC8663.m13757("endOffset must be greater than startOffset");
                }
                if (iM43102 > length) {
                    AbstractC8663.m13757("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i4 < (iM43102 - iM43172) * 4) {
                    AbstractC8663.m13757("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iM43172);
                int lineForOffset2 = layout.getLineForOffset(iM43102 - 1);
                C8773 c8773 = new C8773(c8780);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        j = jM4330;
                        int iM13998 = c8780.m13998(lineForOffset);
                        int iMax = Math.max(iM43172, lineStart);
                        int iMin = Math.min(iM43102, iM13998);
                        float fM14005 = c8780.m14005(lineForOffset);
                        float fM13999 = c8780.m13999(lineForOffset);
                        c6008 = c60082;
                        fArr = fArr2;
                        boolean z = false;
                        boolean z2 = layout.getParagraphDirection(lineForOffset) == 1;
                        int i5 = i4;
                        int i6 = iMax;
                        while (i6 < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(i6);
                            if (!z2 || zIsRtlCharAt) {
                                if (z2 && zIsRtlCharAt) {
                                    z = false;
                                    float fM139883 = c8773.m13988(i6, false, false, false);
                                    i = iMin;
                                    fM13988 = c8773.m13988(i6 + 1, true, true, false);
                                    fM139882 = fM139883;
                                } else {
                                    i = iMin;
                                    z = false;
                                    if (z2 || !zIsRtlCharAt) {
                                        fM13988 = c8773.m13988(i6, false, false, false);
                                        fM139882 = c8773.m13988(i6 + 1, true, true, false);
                                    } else {
                                        fM139882 = c8773.m13988(i6, false, false, true);
                                        fM13988 = c8773.m13988(i6 + 1, true, true, true);
                                    }
                                }
                                fArr[i5] = fM13988;
                                fArr[i5 + 1] = fM14005;
                                fArr[i5 + 2] = fM139882;
                                fArr[i5 + 3] = fM13999;
                                i5 += 4;
                                i6++;
                                iMin = i;
                            } else {
                                fM13988 = c8773.m13988(i6, z, z, true);
                                i = iMin;
                                fM139882 = c8773.m13988(i6 + 1, true, true, true);
                            }
                            z = false;
                            fArr[i5] = fM13988;
                            fArr[i5 + 1] = fM14005;
                            fArr[i5 + 2] = fM139882;
                            fArr[i5 + 3] = fM13999;
                            i5 += 4;
                            i6++;
                            iMin = i;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            jM4330 = j;
                            i4 = i5;
                            c60082 = c6008;
                            fArr2 = fArr;
                        }
                    }
                } else {
                    j = jM4330;
                    c6008 = c60082;
                    fArr = fArr2;
                }
                int iM4311 = (C2869.m4311(j) * 4) + ref$IntRef.element;
                for (int i7 = ref$IntRef.element; i7 < iM4311; i7 += 4) {
                    int i8 = i7 + 1;
                    float f3 = fArr[i8];
                    float f4 = ref$FloatRef.element;
                    fArr[i8] = f3 + f4;
                    int i9 = i7 + 3;
                    fArr[i9] = fArr[i9] + f4;
                }
                ref$IntRef.element = iM4311;
                ref$FloatRef.element = c2888.m4340() + ref$FloatRef.element;
                return c6008;
        }
    }

    public /* synthetic */ C1903(C8157 c8157, Ref$ObjectRef ref$ObjectRef, long j, C2442 c2442) {
        this.f3516 = c8157;
        this.f3514 = ref$ObjectRef;
        this.f3515 = j;
        this.f3513 = c2442;
    }
}
