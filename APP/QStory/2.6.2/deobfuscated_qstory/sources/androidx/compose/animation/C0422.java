package androidx.compose.animation;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0354;
import androidx.compose.animation.core.C0355;
import androidx.compose.animation.core.InterfaceC0311;
import androidx.compose.animation.core.InterfaceC0353;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.InterfaceC2118;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1724;
import androidx.compose.ui.layout.InterfaceC1653;
import androidx.compose.ui.layout.InterfaceC1655;
import androidx.compose.ui.layout.InterfaceC1657;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.C5175;
import kotlin.collections.AbstractC4338;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6557;
import p205.C7905;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0422 extends AbstractC0381 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C0354 f1377;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public long f1378;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C0419 f1379;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public InterfaceC1395 f1380;

    @Override // androidx.compose.ui.AbstractC2128
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public final void mo1118() {
        this.f1378 = -9223372034707292160L;
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1101(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        final long j2;
        final AbstractC1724 abstractC1724Mo3045 = interfaceC1655.mo3045(j);
        if (interfaceC1653.mo1487()) {
            j2 = (((long) abstractC1724Mo3045.f4998) << 32) | (((long) abstractC1724Mo3045.f4996) & 4294967295L);
        } else {
            C0354 c0354 = this.f1377;
            int i = abstractC1724Mo3045.f4998;
            if (c0354 == null) {
                j2 = (((long) i) << 32) | (((long) abstractC1724Mo3045.f4996) & 4294967295L);
                this.f1378 = j2;
            } else {
                final long j3 = (((long) abstractC1724Mo3045.f4996) & 4294967295L) | (((long) i) << 32);
                C0355 c0355M1058 = c0354.m1058(new InterfaceC6557() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p052.InterfaceC6557
                    public final InterfaceC0311 invoke(InterfaceC0353 interfaceC0353) {
                        long j4;
                        InterfaceC0311 interfaceC0311;
                        boolean zM8917 = AbstractC4394.m8917(interfaceC0353.mo1056(), this.this$0.f1379.mo1056());
                        C0422 c0422 = this.this$0;
                        if (zM8917) {
                            j4 = j3;
                            if (!C7905.m13329(c0422.f1378, -9223372034707292160L)) {
                                j4 = c0422.f1378;
                            }
                        } else {
                            InterfaceC1333 interfaceC1333 = (InterfaceC1333) c0422.f1379.f1368.m756(interfaceC0353.mo1056());
                            j4 = interfaceC1333 != null ? ((C7905) interfaceC1333.getValue()).f21882 : 0L;
                        }
                        InterfaceC1333 interfaceC13332 = (InterfaceC1333) this.this$0.f1379.f1368.m756(interfaceC0353.mo1055());
                        long j5 = interfaceC13332 != null ? ((C7905) interfaceC13332.getValue()).f21882 : 0L;
                        C0438 c0438 = (C0438) this.this$0.f1380.getValue();
                        return (c0438 == null || (interfaceC0311 = (InterfaceC0311) c0438.f1399.invoke(new C7905(j4), new C7905(j5))) == null) ? AbstractC0330.m1013(0.0f, 400.0f, null, 5) : interfaceC0311;
                    }
                }, new InterfaceC6557() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p052.InterfaceC6557
                    public /* synthetic */ Object invoke(Object obj) {
                        return new C7905(m891invokeYEO4UFw(obj));
                    }

                    /* JADX INFO: renamed from: invoke-YEO4UFw, reason: not valid java name */
                    public final long m891invokeYEO4UFw(Object obj) {
                        boolean zM8917 = AbstractC4394.m8917(obj, this.this$0.f1379.mo1056());
                        C0422 c0422 = this.this$0;
                        if (zM8917) {
                            return C7905.m13329(c0422.f1378, -9223372034707292160L) ? j3 : c0422.f1378;
                        }
                        InterfaceC1333 interfaceC1333 = (InterfaceC1333) c0422.f1379.f1368.m756(obj);
                        if (interfaceC1333 != null) {
                            return ((C7905) interfaceC1333.getValue()).f21882;
                        }
                        return 0L;
                    }
                });
                this.f1379.f1367 = c0355M1058;
                j2 = ((C7905) c0355M1058.getValue()).f21882;
                this.f1378 = ((C7905) c0355M1058.getValue()).f21882;
            }
        }
        return interfaceC1653.mo1485((int) (j2 >> 32), (int) (4294967295L & j2), AbstractC4338.m8781(), new InterfaceC6557() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(AbstractC1708 abstractC1708) {
                InterfaceC2118 interfaceC2118 = this.this$0.f1379.f1370;
                AbstractC1724 abstractC1724 = abstractC1724Mo3045;
                AbstractC1708.m3124(abstractC1708, abstractC1724Mo3045, interfaceC2118.mo3849((((long) abstractC1724.f4998) << 32) | (((long) abstractC1724.f4996) & 4294967295L), j2, LayoutDirection.Ltr));
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1708) obj);
                return C5175.f14739;
            }
        });
    }
}
