package androidx.compose.animation;

import androidx.compose.animation.core.C1185;
import androidx.compose.animation.core.C1203;
import androidx.compose.animation.core.InterfaceC1204;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.colorspace.AbstractC2325;
import androidx.compose.p001ui.graphics.colorspace.C2324;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1255 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC7387 f1702 = new InterfaceC7387() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1
        @Override // p068.InterfaceC7387
        public final InterfaceC1204 invoke(final AbstractC2325 abstractC2325) {
            return new C1203(new InterfaceC7387() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.1
                @Override // p068.InterfaceC7387
                public /* synthetic */ Object invoke(Object obj) {
                    return m1456invoke8_81llA(((C2434) obj).f5045);
                }

                /* JADX INFO: renamed from: invoke-8_81llA, reason: not valid java name */
                public final C1185 m1456invoke8_81llA(long j) {
                    long jM3511 = C2434.m3511(j, C2324.f4565);
                    return new C1185(C2434.m3508(jM3511), C2434.m3512(jM3511), C2434.m3513(jM3511), C2434.m3507(jM3511));
                }
            }, new InterfaceC7387() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.2
                {
                    super(1);
                }

                @Override // p068.InterfaceC7387
                public /* synthetic */ Object invoke(Object obj) {
                    return new C2434(m1457invokevNxB06k((C1185) obj));
                }

                /* JADX INFO: renamed from: invoke-vNxB06k, reason: not valid java name */
                public final long m1457invokevNxB06k(C1185 c1185) {
                    float f = c1185.f1490;
                    if (f < 0.0f) {
                        f = 0.0f;
                    }
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                    float f2 = c1185.f1489;
                    if (f2 < -0.5f) {
                        f2 = -0.5f;
                    }
                    if (f2 > 0.5f) {
                        f2 = 0.5f;
                    }
                    float f3 = c1185.f1488;
                    float f4 = f3 >= -0.5f ? f3 : -0.5f;
                    float f5 = f4 <= 0.5f ? f4 : 0.5f;
                    float f6 = c1185.f1491;
                    float f7 = f6 >= 0.0f ? f6 : 0.0f;
                    return C2434.m3511(AbstractC2416.m3443(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, C2324.f4565), abstractC2325);
                }
            });
        }
    };
}
