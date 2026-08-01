package androidx.compose.p001ui.input.nestedscroll;

import kotlin.AbstractC6017;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7372;
import p221.C8731;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2454 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC6233 f5080;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC7372 f5081 = new InterfaceC7372() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        {
            super(0);
        }

        @Override // p068.InterfaceC7372
        public final InterfaceC6233 invoke() {
            return this.this$0.f5080;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2451 f5082;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C2451 f5083;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6233 m3551() {
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.f5081.invoke();
        if (interfaceC6233 != null) {
            return interfaceC6233;
        }
        C6755.m11870("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long m3552(int i, long j) {
        C2451 c2451 = this.f5083;
        C2451 c2451M3548 = c2451 != null ? c2451.m3548() : null;
        if (c2451M3548 != null) {
            return c2451M3548.mo3546(i, j);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3553(long j, ContinuationImpl continuationImpl) {
        NestedScrollDispatcher$dispatchPreFling$1 nestedScrollDispatcher$dispatchPreFling$1;
        long j2;
        if (continuationImpl instanceof NestedScrollDispatcher$dispatchPreFling$1) {
            nestedScrollDispatcher$dispatchPreFling$1 = (NestedScrollDispatcher$dispatchPreFling$1) continuationImpl;
            int i = nestedScrollDispatcher$dispatchPreFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPreFling$1.label = i - Integer.MIN_VALUE;
            } else {
                nestedScrollDispatcher$dispatchPreFling$1 = new NestedScrollDispatcher$dispatchPreFling$1(this, continuationImpl);
            }
        }
        Object objMo3549 = nestedScrollDispatcher$dispatchPreFling$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nestedScrollDispatcher$dispatchPreFling$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objMo3549);
            C2451 c2451 = this.f5083;
            C2451 c2451M3548 = c2451 != null ? c2451.m3548() : null;
            if (c2451M3548 == null) {
                j2 = 0;
                return new C8731(j2);
            }
            nestedScrollDispatcher$dispatchPreFling$1.label = 1;
            objMo3549 = c2451M3548.mo3549(j, nestedScrollDispatcher$dispatchPreFling$1);
            if (objMo3549 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(objMo3549);
        }
        j2 = ((C8731) objMo3549).f22216;
        return new C8731(j2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m3554(long j, long j2, int i) {
        C2451 c2451 = this.f5083;
        C2451 c2451M3548 = c2451 != null ? c2451.m3548() : null;
        if (c2451M3548 != null) {
            return c2451M3548.mo1814(j, j2, i);
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3555(long j, long j2, ContinuationImpl continuationImpl) {
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$1;
        long j3;
        if (continuationImpl instanceof NestedScrollDispatcher$dispatchPostFling$1) {
            nestedScrollDispatcher$dispatchPostFling$1 = (NestedScrollDispatcher$dispatchPostFling$1) continuationImpl;
            int i = nestedScrollDispatcher$dispatchPostFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nestedScrollDispatcher$dispatchPostFling$1.label = i - Integer.MIN_VALUE;
            } else {
                nestedScrollDispatcher$dispatchPostFling$1 = new NestedScrollDispatcher$dispatchPostFling$1(this, continuationImpl);
            }
        }
        NestedScrollDispatcher$dispatchPostFling$1 nestedScrollDispatcher$dispatchPostFling$12 = nestedScrollDispatcher$dispatchPostFling$1;
        Object objMo1815 = nestedScrollDispatcher$dispatchPostFling$12.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nestedScrollDispatcher$dispatchPostFling$12.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objMo1815);
            C2451 c2451 = this.f5083;
            j3 = 0;
            if ((c2451 != null ? c2451.m3548() : null) == null) {
                C2451 c24512 = this.f5082;
                if (c24512 != null) {
                    nestedScrollDispatcher$dispatchPostFling$12.label = 1;
                    objMo1815 = c24512.mo1815(j, j2, nestedScrollDispatcher$dispatchPostFling$12);
                }
            } else {
                C2451 c24513 = this.f5083;
                C2451 c2451M3548 = c24513 != null ? c24513.m3548() : null;
                if (c2451M3548 != null) {
                    nestedScrollDispatcher$dispatchPostFling$12.label = 2;
                    objMo1815 = c2451M3548.mo1815(j, j2, nestedScrollDispatcher$dispatchPostFling$12);
                }
            }
        } else if (i2 == 1) {
            AbstractC6017.m10769(objMo1815);
            j3 = ((C8731) objMo1815).f22216;
        } else {
            if (i2 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(objMo1815);
            j3 = ((C8731) objMo1815).f22216;
        }
        return new C8731(j3);
    }
}
