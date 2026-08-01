package androidx.compose.animation;

import androidx.compose.animation.core.C0339;
import androidx.compose.animation.core.C0357;
import androidx.compose.animation.core.InterfaceC0358;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.colorspace.AbstractC1490;
import androidx.compose.ui.graphics.colorspace.C1489;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0409 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC6558 f1357 = new InterfaceC6558() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1
        @Override // p052.InterfaceC6558
        public final InterfaceC0358 invoke(final AbstractC1490 abstractC1490) {
            return new C0357(new InterfaceC6558() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.1
                @Override // p052.InterfaceC6558
                public /* synthetic */ Object invoke(Object obj) {
                    return m896invoke8_81llA(((C1599) obj).f4700);
                }

                /* JADX INFO: renamed from: invoke-8_81llA, reason: not valid java name */
                public final C0339 m896invoke8_81llA(long j) {
                    long jM2951 = C1599.m2951(j, C1489.f4220);
                    return new C0339(C1599.m2948(jM2951), C1599.m2952(jM2951), C1599.m2953(jM2951), C1599.m2947(jM2951));
                }
            }, new InterfaceC6558() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.2
                {
                    super(1);
                }

                @Override // p052.InterfaceC6558
                public /* synthetic */ Object invoke(Object obj) {
                    return new C1599(m897invokevNxB06k((C0339) obj));
                }

                /* JADX INFO: renamed from: invoke-vNxB06k, reason: not valid java name */
                public final long m897invokevNxB06k(C0339 c0339) {
                    float f = c0339.f1145;
                    if (f < 0.0f) {
                        f = 0.0f;
                    }
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                    float f2 = c0339.f1144;
                    if (f2 < -0.5f) {
                        f2 = -0.5f;
                    }
                    if (f2 > 0.5f) {
                        f2 = 0.5f;
                    }
                    float f3 = c0339.f1143;
                    float f4 = f3 >= -0.5f ? f3 : -0.5f;
                    float f5 = f4 <= 0.5f ? f4 : 0.5f;
                    float f6 = c0339.f1146;
                    float f7 = f6 >= 0.0f ? f6 : 0.0f;
                    return C1599.m2951(AbstractC1581.m2883(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, C1489.f4220), abstractC1490);
                }
            });
        }
    };
}
