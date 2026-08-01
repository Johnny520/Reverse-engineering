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
import kotlin.C5176;
import kotlin.collections.AbstractC4339;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6558;
import p205.C7906;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
    public final void mo1119() {
        this.f1378 = -9223372034707292160L;
    }

    @Override // androidx.compose.ui.node.InterfaceC1773
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC1657 mo1102(InterfaceC1653 interfaceC1653, InterfaceC1655 interfaceC1655, long j) {
        final long j2;
        final AbstractC1724 abstractC1724Mo3055 = interfaceC1655.mo3055(j);
        if (interfaceC1653.mo1497()) {
            j2 = (((long) abstractC1724Mo3055.f4999) << 32) | (((long) abstractC1724Mo3055.f4997) & 4294967295L);
        } else {
            C0354 c0354 = this.f1377;
            int i = abstractC1724Mo3055.f4999;
            if (c0354 == null) {
                j2 = (((long) i) << 32) | (((long) abstractC1724Mo3055.f4997) & 4294967295L);
                this.f1378 = j2;
            } else {
                final long j3 = (((long) abstractC1724Mo3055.f4997) & 4294967295L) | (((long) i) << 32);
                C0355 c0355M1059 = c0354.m1059(new InterfaceC6558() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p052.InterfaceC6558
                    public final InterfaceC0311 invoke(InterfaceC0353 interfaceC0353) {
                        long j4;
                        InterfaceC0311 interfaceC0311;
                        boolean zM8907 = AbstractC4395.m8907(interfaceC0353.mo1057(), this.this$0.f1379.mo1057());
                        C0422 c0422 = this.this$0;
                        if (zM8907) {
                            j4 = j3;
                            if (!C7906.m13357(c0422.f1378, -9223372034707292160L)) {
                                j4 = c0422.f1378;
                            }
                        } else {
                            InterfaceC1333 interfaceC1333 = (InterfaceC1333) c0422.f1379.f1368.m757(interfaceC0353.mo1057());
                            j4 = interfaceC1333 != null ? ((C7906) interfaceC1333.getValue()).f21879 : 0L;
                        }
                        InterfaceC1333 interfaceC13332 = (InterfaceC1333) this.this$0.f1379.f1368.m757(interfaceC0353.mo1056());
                        long j5 = interfaceC13332 != null ? ((C7906) interfaceC13332.getValue()).f21879 : 0L;
                        C0438 c0438 = (C0438) this.this$0.f1380.getValue();
                        return (c0438 == null || (interfaceC0311 = (InterfaceC0311) c0438.f1399.invoke(new C7906(j4), new C7906(j5))) == null) ? AbstractC0330.m1014(0.0f, 400.0f, null, 5) : interfaceC0311;
                    }
                }, new InterfaceC6558() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p052.InterfaceC6558
                    public /* synthetic */ Object invoke(Object obj) {
                        return new C7906(m892invokeYEO4UFw(obj));
                    }

                    /* JADX INFO: renamed from: invoke-YEO4UFw, reason: not valid java name */
                    public final long m892invokeYEO4UFw(Object obj) {
                        boolean zM8907 = AbstractC4395.m8907(obj, this.this$0.f1379.mo1057());
                        C0422 c0422 = this.this$0;
                        if (zM8907) {
                            return C7906.m13357(c0422.f1378, -9223372034707292160L) ? j3 : c0422.f1378;
                        }
                        InterfaceC1333 interfaceC1333 = (InterfaceC1333) c0422.f1379.f1368.m757(obj);
                        if (interfaceC1333 != null) {
                            return ((C7906) interfaceC1333.getValue()).f21879;
                        }
                        return 0L;
                    }
                });
                this.f1379.f1367 = c0355M1059;
                j2 = ((C7906) c0355M1059.getValue()).f21879;
                this.f1378 = ((C7906) c0355M1059.getValue()).f21879;
            }
        }
        return interfaceC1653.mo1495((int) (j2 >> 32), (int) (4294967295L & j2), AbstractC4339.m8776(), new InterfaceC6558() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(AbstractC1708 abstractC1708) {
                InterfaceC2118 interfaceC2118 = this.this$0.f1379.f1370;
                AbstractC1724 abstractC1724 = abstractC1724Mo3055;
                AbstractC1708.m3134(abstractC1708, abstractC1724Mo3055, interfaceC2118.mo3859((((long) abstractC1724.f4999) << 32) | (((long) abstractC1724.f4997) & 4294967295L), j2, LayoutDirection.Ltr));
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC1708) obj);
                return C5176.f14739;
            }
        });
    }
}
