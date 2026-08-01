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
import kotlin.C5175;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6557;
import p112.C7327;
import p195.AbstractC7833;
import p212.C7943;
import p212.C7950;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1065 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f3167;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Serializable f3168;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ long f3169;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f3170;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3171 = 1;

    public /* synthetic */ C1065(long j, float[] fArr, Ref$IntRef ref$IntRef, Ref$FloatRef ref$FloatRef) {
        this.f3169 = j;
        this.f3170 = fArr;
        this.f3168 = ref$IntRef;
        this.f3167 = ref$FloatRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        long j;
        C5175 c5175;
        float[] fArr;
        int i;
        float fM13401;
        float fM134012;
        int i2 = this.f3171;
        C5175 c51752 = C5175.f14739;
        Object obj2 = this.f3167;
        Serializable serializable = this.f3168;
        Object obj3 = this.f3170;
        switch (i2) {
            case 0:
                C7327 c7327 = (C7327) obj3;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) serializable;
                long j2 = this.f3169;
                C1607 c1607 = (C1607) obj2;
                C1758 c1758 = (C1758) ((InterfaceC1506) obj);
                c1758.m3301();
                float f = c7327.f19545;
                float f2 = c7327.f19544;
                C1507 c1507 = c1758.f5175;
                ((C0113) c1507.f4283.f319).m430(f, f2);
                try {
                    InterfaceC1504.m2689(c1758, (C1610) ref$ObjectRef.element, j2, 0L, 0.0f, c1607, 0, 890);
                    return c51752;
                } finally {
                    ((C0113) c1507.f4283.f319).m430(-f, -f2);
                }
            default:
                float[] fArr2 = (float[]) obj3;
                Ref$IntRef ref$IntRef = (Ref$IntRef) serializable;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj2;
                C2065 c2065 = (C2065) obj;
                int i3 = c2065.f6120;
                C2054 c2054 = c2065.f6121;
                int iM3740 = c2065.f6119;
                long j3 = this.f3169;
                int iM3747 = i3 > C2035.m3747(j3) ? c2065.f6120 : C2035.m3747(j3);
                if (iM3740 >= C2035.m3740(j3)) {
                    iM3740 = C2035.m3740(j3);
                }
                long jM3760 = AbstractC2048.m3760(c2065.m3788(iM3747), c2065.m3788(iM3740));
                int i4 = ref$IntRef.element;
                C7950 c7950 = c2054.f6085;
                int iM37472 = C2035.m3747(jM3760);
                int iM37402 = C2035.m3740(jM3760);
                Layout layout = c7950.f22004;
                int length = layout.getText().length();
                if (iM37472 < 0) {
                    AbstractC7833.m13170("startOffset must be > 0");
                }
                if (iM37472 >= length) {
                    AbstractC7833.m13170("startOffset must be less than text length");
                }
                if (iM37402 <= iM37472) {
                    AbstractC7833.m13170("endOffset must be greater than startOffset");
                }
                if (iM37402 > length) {
                    AbstractC7833.m13170("endOffset must be smaller or equal to text length");
                }
                if (fArr2.length - i4 < (iM37402 - iM37472) * 4) {
                    AbstractC7833.m13170("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iM37472);
                int lineForOffset2 = layout.getLineForOffset(iM37402 - 1);
                C7943 c7943 = new C7943(c7950);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        j = jM3760;
                        int iM13411 = c7950.m13411(lineForOffset);
                        int iMax = Math.max(iM37472, lineStart);
                        int iMin = Math.min(iM37402, iM13411);
                        float fM13418 = c7950.m13418(lineForOffset);
                        float fM13412 = c7950.m13412(lineForOffset);
                        c5175 = c51752;
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
                                    float fM134013 = c7943.m13401(i6, false, false, false);
                                    i = iMin;
                                    fM13401 = c7943.m13401(i6 + 1, true, true, false);
                                    fM134012 = fM134013;
                                } else {
                                    i = iMin;
                                    z = false;
                                    if (z2 || !zIsRtlCharAt) {
                                        fM13401 = c7943.m13401(i6, false, false, false);
                                        fM134012 = c7943.m13401(i6 + 1, true, true, false);
                                    } else {
                                        fM134012 = c7943.m13401(i6, false, false, true);
                                        fM13401 = c7943.m13401(i6 + 1, true, true, true);
                                    }
                                }
                                fArr[i5] = fM13401;
                                fArr[i5 + 1] = fM13418;
                                fArr[i5 + 2] = fM134012;
                                fArr[i5 + 3] = fM13412;
                                i5 += 4;
                                i6++;
                                iMin = i;
                            } else {
                                fM13401 = c7943.m13401(i6, z, z, true);
                                i = iMin;
                                fM134012 = c7943.m13401(i6 + 1, true, true, true);
                            }
                            z = false;
                            fArr[i5] = fM13401;
                            fArr[i5 + 1] = fM13418;
                            fArr[i5 + 2] = fM134012;
                            fArr[i5 + 3] = fM13412;
                            i5 += 4;
                            i6++;
                            iMin = i;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            jM3760 = j;
                            i4 = i5;
                            c51752 = c5175;
                            fArr2 = fArr;
                        }
                    }
                } else {
                    j = jM3760;
                    c5175 = c51752;
                    fArr = fArr2;
                }
                int iM3741 = (C2035.m3741(j) * 4) + ref$IntRef.element;
                for (int i7 = ref$IntRef.element; i7 < iM3741; i7 += 4) {
                    int i8 = i7 + 1;
                    float f3 = fArr[i8];
                    float f4 = ref$FloatRef.element;
                    fArr[i8] = f3 + f4;
                    int i9 = i7 + 3;
                    fArr[i9] = fArr[i9] + f4;
                }
                ref$IntRef.element = iM3741;
                ref$FloatRef.element = c2054.m3770() + ref$FloatRef.element;
                return c5175;
        }
    }

    public /* synthetic */ C1065(C7327 c7327, Ref$ObjectRef ref$ObjectRef, long j, C1607 c1607) {
        this.f3170 = c7327;
        this.f3168 = ref$ObjectRef;
        this.f3169 = j;
        this.f3167 = c1607;
    }
}
