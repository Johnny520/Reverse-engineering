package androidx.compose.p001ui.input.nestedscroll;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2646;
import androidx.compose.p001ui.node.InterfaceC2599;
import androidx.compose.runtime.collection.C2059;
import kotlin.AbstractC6017;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7387;
import p128.C8158;
import p221.C8731;
import p226.AbstractC8765;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2451 extends AbstractC2961 implements InterfaceC2599, InterfaceC2455 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC2455 f5074;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final String f5075;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C2451 f5076;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public C2454 f5077;

    public C2451(InterfaceC2455 interfaceC2455, C2454 c2454) {
        this.f5074 = interfaceC2455;
        this.f5077 = c2454 == null ? new C2454() : c2454;
        this.f5075 = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // androidx.compose.p001ui.input.nestedscroll.InterfaceC2455
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final long mo3546(int i, long j) {
        C2451 c2451M3548 = this.f6624 ? m3548() : null;
        long jMo3546 = c2451M3548 != null ? c2451M3548.mo3546(i, j) : 0L;
        return C8158.m13084(jMo3546, this.f5074.mo3546(i, C8158.m13085(j, jMo3546)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final InterfaceC6233 m3547() {
        C2451 c2451M3548 = m3548();
        InterfaceC6233 interfaceC6233M3547 = c2451M3548 != null ? c2451M3548.m3547() : null;
        if (interfaceC6233M3547 != null && AbstractC6231.m11054(interfaceC6233M3547)) {
            return interfaceC6233M3547;
        }
        InterfaceC6233 interfaceC6233 = this.f5077.f5080;
        if (interfaceC6233 != null) {
            return interfaceC6233;
        }
        C6755.m11870("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public final C2451 m3548() {
        C2646 c2646;
        InterfaceC2599 interfaceC2599 = null;
        if (!this.f6624) {
            return null;
        }
        if (!this.f6637.f6624) {
            AbstractC8765.m13982("visitAncestors called on an unattached node");
        }
        AbstractC2961 abstractC2961 = this.f6637.f6629;
        C2583 c2583M3906 = AbstractC2620.m3906(this);
        loop0: while (true) {
            if (c2583M3906 == null) {
                break;
            }
            if ((c2583M3906.f5439.f5628.f6630 & 262144) != 0) {
                while (abstractC2961 != null) {
                    if ((abstractC2961.f6636 & 262144) != 0) {
                        AbstractC2961 abstractC2961M3899 = abstractC2961;
                        C2059 c2059 = null;
                        while (abstractC2961M3899 != null) {
                            if (abstractC2961M3899 instanceof InterfaceC2599) {
                                InterfaceC2599 interfaceC25992 = (InterfaceC2599) abstractC2961M3899;
                                if (AbstractC5227.m9466(this.f5075, interfaceC25992.mo1919()) && C2451.class == interfaceC25992.getClass()) {
                                    interfaceC2599 = interfaceC25992;
                                    break loop0;
                                }
                            }
                            if ((abstractC2961M3899.f6636 & 262144) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                int i = 0;
                                for (AbstractC2961 abstractC29612 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29612 != null; abstractC29612 = abstractC29612.f6633) {
                                    if ((abstractC29612.f6636 & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            abstractC2961M3899 = abstractC29612;
                                        } else {
                                            if (c2059 == null) {
                                                c2059 = new C2059(0, new AbstractC2961[16]);
                                            }
                                            if (abstractC2961M3899 != null) {
                                                c2059.m2607(abstractC2961M3899);
                                                abstractC2961M3899 = null;
                                            }
                                            c2059.m2607(abstractC29612);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            abstractC2961M3899 = AbstractC2620.m3899(c2059);
                        }
                    }
                    abstractC2961 = abstractC2961.f6629;
                }
            }
            c2583M3906 = c2583M3906.m3816();
            abstractC2961 = (c2583M3906 == null || (c2646 = c2583M3906.f5439) == null) ? null : c2646.f5629;
        }
        return (C2451) interfaceC2599;
    }

    @Override // androidx.compose.p001ui.input.nestedscroll.InterfaceC2455
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public final long mo1814(long j, long j2, int i) {
        long jMo1814 = this.f5074.mo1814(j, j2, i);
        C2451 c2451M3548 = this.f6624 ? m3548() : null;
        return C8158.m13084(jMo1814, c2451M3548 != null ? c2451M3548.mo1814(C8158.m13084(j, jMo1814), C8158.m13085(j2, jMo1814), i) : 0L);
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰 */
    public final void mo1686() {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        AbstractC2620.m3895(this, new InterfaceC7387() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt$findNearestAttachedAncestor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p068.InterfaceC7387
            public final Boolean invoke(InterfaceC2599 interfaceC2599) {
                boolean z;
                if (((AbstractC2961) interfaceC2599).f6637.f6624) {
                    ref$ObjectRef.element = interfaceC2599;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        C2451 c2451 = (C2451) ((InterfaceC2599) ref$ObjectRef.element);
        this.f5076 = c2451;
        C2454 c2454 = this.f5077;
        c2454.f5082 = c2451;
        if (c2454.f5083 == this) {
            c2454.f5083 = null;
        }
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public final void mo1661() {
        C2454 c2454 = this.f5077;
        c2454.f5083 = this;
        c2454.f5082 = null;
        this.f5076 = null;
        c2454.f5081 = new NestedScrollNode$updateDispatcherFields$1(this);
        this.f5077.f5080 = m4427();
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2599
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Object mo1919() {
        return this.f5075;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p001ui.input.nestedscroll.InterfaceC2455
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo3549(long j, InterfaceC5189 interfaceC5189) {
        NestedScrollNode$onPreFling$1 nestedScrollNode$onPreFling$1;
        long j2;
        long j3;
        if (interfaceC5189 instanceof NestedScrollNode$onPreFling$1) {
            nestedScrollNode$onPreFling$1 = (NestedScrollNode$onPreFling$1) interfaceC5189;
            int i = nestedScrollNode$onPreFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPreFling$1.label = i - Integer.MIN_VALUE;
            } else {
                nestedScrollNode$onPreFling$1 = new NestedScrollNode$onPreFling$1(this, interfaceC5189);
            }
        }
        Object objMo3549 = nestedScrollNode$onPreFling$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nestedScrollNode$onPreFling$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objMo3549);
            C2451 c2451M3548 = this.f6624 ? m3548() : null;
            if (c2451M3548 == null) {
                j2 = 0;
                InterfaceC2455 interfaceC2455 = this.f5074;
                long jM13908 = C8731.m13908(j, j2);
                nestedScrollNode$onPreFling$1.J$0 = j2;
                nestedScrollNode$onPreFling$1.label = 2;
                objMo3549 = interfaceC2455.mo3549(jM13908, nestedScrollNode$onPreFling$1);
                if (objMo3549 != coroutineSingletons) {
                    j3 = j2;
                    return new C8731(C8731.m13907(j3, ((C8731) objMo3549).f22216));
                }
                return coroutineSingletons;
            }
            nestedScrollNode$onPreFling$1.J$0 = j;
            nestedScrollNode$onPreFling$1.label = 1;
            objMo3549 = c2451M3548.mo3549(j, nestedScrollNode$onPreFling$1);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = nestedScrollNode$onPreFling$1.J$0;
                AbstractC6017.m10769(objMo3549);
                return new C8731(C8731.m13907(j3, ((C8731) objMo3549).f22216));
            }
            j = nestedScrollNode$onPreFling$1.J$0;
            AbstractC6017.m10769(objMo3549);
        }
        j2 = ((C8731) objMo3549).f22216;
        InterfaceC2455 interfaceC24552 = this.f5074;
        long jM139082 = C8731.m13908(j, j2);
        nestedScrollNode$onPreFling$1.J$0 = j2;
        nestedScrollNode$onPreFling$1.label = 2;
        objMo3549 = interfaceC24552.mo3549(jM139082, nestedScrollNode$onPreFling$1);
        if (objMo3549 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // androidx.compose.p001ui.input.nestedscroll.InterfaceC2455
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1815(long j, long j2, ContinuationImpl continuationImpl) {
        NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$1;
        long j3;
        long j4;
        long j5;
        long j6;
        if (continuationImpl instanceof NestedScrollNode$onPostFling$1) {
            nestedScrollNode$onPostFling$1 = (NestedScrollNode$onPostFling$1) continuationImpl;
            int i = nestedScrollNode$onPostFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollNode$onPostFling$1.label = i - Integer.MIN_VALUE;
            } else {
                nestedScrollNode$onPostFling$1 = new NestedScrollNode$onPostFling$1(this, continuationImpl);
            }
        }
        NestedScrollNode$onPostFling$1 nestedScrollNode$onPostFling$12 = nestedScrollNode$onPostFling$1;
        Object objMo1815 = nestedScrollNode$onPostFling$12.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nestedScrollNode$onPostFling$12.label;
        C2451 c2451M3548 = null;
        if (i2 == 0) {
            AbstractC6017.m10769(objMo1815);
            InterfaceC2455 interfaceC2455 = this.f5074;
            nestedScrollNode$onPostFling$12.J$0 = j;
            nestedScrollNode$onPostFling$12.J$1 = j2;
            nestedScrollNode$onPostFling$12.label = 1;
            objMo1815 = interfaceC2455.mo1815(j, j2, nestedScrollNode$onPostFling$12);
            if (objMo1815 != coroutineSingletons) {
                j3 = j2;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j6 = nestedScrollNode$onPostFling$12.J$0;
            AbstractC6017.m10769(objMo1815);
            j5 = ((C8731) objMo1815).f22216;
            j4 = j6;
            return new C8731(C8731.m13907(j4, j5));
        }
        long j7 = nestedScrollNode$onPostFling$12.J$1;
        long j8 = nestedScrollNode$onPostFling$12.J$0;
        AbstractC6017.m10769(objMo1815);
        j3 = j7;
        j = j8;
        j4 = ((C8731) objMo1815).f22216;
        boolean z = this.f6624;
        if (!z) {
            c2451M3548 = this.f5076;
        } else if (z) {
            c2451M3548 = m3548();
        }
        InterfaceC2455 interfaceC24552 = c2451M3548;
        if (interfaceC24552 == null) {
            j5 = 0;
            return new C8731(C8731.m13907(j4, j5));
        }
        long jM13907 = C8731.m13907(j, j4);
        long jM13908 = C8731.m13908(j3, j4);
        nestedScrollNode$onPostFling$12.J$0 = j4;
        nestedScrollNode$onPostFling$12.label = 2;
        objMo1815 = interfaceC24552.mo1815(jM13907, jM13908, nestedScrollNode$onPostFling$12);
        if (objMo1815 != coroutineSingletons) {
            j6 = j4;
            j5 = ((C8731) objMo1815).f22216;
            j4 = j6;
            return new C8731(C8731.m13907(j4, j5));
        }
        return coroutineSingletons;
    }
}
