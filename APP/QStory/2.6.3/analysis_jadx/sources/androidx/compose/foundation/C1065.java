package androidx.compose.foundation;

import android.text.Layout;
import androidx.appcompat.app.C0113;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.C1610;
import androidx.compose.ui.graphics.drawscope.C1507;
import androidx.compose.ui.graphics.drawscope.InterfaceC1504;
import androidx.compose.ui.graphics.drawscope.InterfaceC1506;
import androidx.compose.ui.node.C1758;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2054;
import androidx.compose.ui.text.C2065;
import java.io.Serializable;
import kotlin.C5176;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6558;
import p112.C7328;
import p195.AbstractC7834;
import p212.C7944;
import p212.C7951;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1065 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3168;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Serializable f3169;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ long f3170;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f3171;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3172 = 1;

    public /* synthetic */ C1065(long j, float[] fArr, Ref$IntRef ref$IntRef, Ref$FloatRef ref$FloatRef) {
        this.f3170 = j;
        this.f3171 = fArr;
        this.f3169 = ref$IntRef;
        this.f3168 = ref$FloatRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        long j;
        C5176 c5176;
        float[] fArr;
        int i;
        float fM13429;
        float fM134292;
        int i2 = this.f3172;
        C5176 c51762 = C5176.f14739;
        Object obj2 = this.f3168;
        Serializable serializable = this.f3169;
        Object obj3 = this.f3171;
        switch (i2) {
            case 0:
                C7328 c7328 = (C7328) obj3;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) serializable;
                long j2 = this.f3170;
                C1607 c1607 = (C1607) obj2;
                C1758 c1758 = (C1758) ((InterfaceC1506) obj);
                c1758.m3311();
                float f = c7328.f19540;
                float f2 = c7328.f19539;
                C1507 c1507 = c1758.f5176;
                ((C0113) c1507.f4284.f319).m431(f, f2);
                try {
                    InterfaceC1504.m2699(c1758, (C1610) ref$ObjectRef.element, j2, 0L, 0.0f, c1607, 0, 890);
                    return c51762;
                } finally {
                    ((C0113) c1507.f4284.f319).m431(-f, -f2);
                }
            default:
                float[] fArr2 = (float[]) obj3;
                Ref$IntRef ref$IntRef = (Ref$IntRef) serializable;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj2;
                C2065 c2065 = (C2065) obj;
                int i3 = c2065.f6121;
                C2054 c2054 = c2065.f6122;
                int iM3750 = c2065.f6120;
                long j3 = this.f3170;
                int iM3757 = i3 > C2035.m3757(j3) ? c2065.f6121 : C2035.m3757(j3);
                if (iM3750 >= C2035.m3750(j3)) {
                    iM3750 = C2035.m3750(j3);
                }
                long jM3770 = AbstractC2048.m3770(c2065.m3798(iM3757), c2065.m3798(iM3750));
                int i4 = ref$IntRef.element;
                C7951 c7951 = c2054.f6086;
                int iM37572 = C2035.m3757(jM3770);
                int iM37502 = C2035.m3750(jM3770);
                Layout layout = c7951.f22001;
                int length = layout.getText().length();
                if (iM37572 < 0) {
                    AbstractC7834.m13198("startOffset must be > 0");
                }
                if (iM37572 >= length) {
                    AbstractC7834.m13198("startOffset must be less than text length");
                }
                if (iM37502 <= iM37572) {
                    AbstractC7834.m13198("endOffset must be greater than startOffset");
                }
                if (iM37502 > length) {
                    AbstractC7834.m13198("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i4 < (iM37502 - iM37572) * 4) {
                    AbstractC7834.m13198("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iM37572);
                int lineForOffset2 = layout.getLineForOffset(iM37502 - 1);
                C7944 c7944 = new C7944(c7951);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        j = jM3770;
                        int iM13439 = c7951.m13439(lineForOffset);
                        int iMax = Math.max(iM37572, lineStart);
                        int iMin = Math.min(iM37502, iM13439);
                        float fM13446 = c7951.m13446(lineForOffset);
                        float fM13440 = c7951.m13440(lineForOffset);
                        c5176 = c51762;
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
                                    float fM134293 = c7944.m13429(i6, false, false, false);
                                    i = iMin;
                                    fM13429 = c7944.m13429(i6 + 1, true, true, false);
                                    fM134292 = fM134293;
                                } else {
                                    i = iMin;
                                    z = false;
                                    if (z2 || !zIsRtlCharAt) {
                                        fM13429 = c7944.m13429(i6, false, false, false);
                                        fM134292 = c7944.m13429(i6 + 1, true, true, false);
                                    } else {
                                        fM134292 = c7944.m13429(i6, false, false, true);
                                        fM13429 = c7944.m13429(i6 + 1, true, true, true);
                                    }
                                }
                                fArr[i5] = fM13429;
                                fArr[i5 + 1] = fM13446;
                                fArr[i5 + 2] = fM134292;
                                fArr[i5 + 3] = fM13440;
                                i5 += 4;
                                i6++;
                                iMin = i;
                            } else {
                                fM13429 = c7944.m13429(i6, z, z, true);
                                i = iMin;
                                fM134292 = c7944.m13429(i6 + 1, true, true, true);
                            }
                            z = false;
                            fArr[i5] = fM13429;
                            fArr[i5 + 1] = fM13446;
                            fArr[i5 + 2] = fM134292;
                            fArr[i5 + 3] = fM13440;
                            i5 += 4;
                            i6++;
                            iMin = i;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            jM3770 = j;
                            i4 = i5;
                            c51762 = c5176;
                            fArr2 = fArr;
                        }
                    }
                } else {
                    j = jM3770;
                    c5176 = c51762;
                    fArr = fArr2;
                }
                int iM3751 = (C2035.m3751(j) * 4) + ref$IntRef.element;
                for (int i7 = ref$IntRef.element; i7 < iM3751; i7 += 4) {
                    int i8 = i7 + 1;
                    float f3 = fArr[i8];
                    float f4 = ref$FloatRef.element;
                    fArr[i8] = f3 + f4;
                    int i9 = i7 + 3;
                    fArr[i9] = fArr[i9] + f4;
                }
                ref$IntRef.element = iM3751;
                ref$FloatRef.element = c2054.m3780() + ref$FloatRef.element;
                return c5176;
        }
    }

    public /* synthetic */ C1065(C7328 c7328, Ref$ObjectRef ref$ObjectRef, long j, C1607 c1607) {
        this.f3171 = c7328;
        this.f3169 = ref$ObjectRef;
        this.f3170 = j;
        this.f3168 = c1607;
    }
}
