package androidx.compose.p001ui.platform;

import androidx.collection.C1082;
import androidx.compose.runtime.snapshots.AbstractC2115;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.C6023;
import kotlinx.coroutines.channels.InterfaceC6031;
import kotlinx.coroutines.channels.InterfaceC6039;
import kotlinx.coroutines.channels.InterfaceC6044;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", m556f = "GlobalSnapshotManager.android.kt", m557l = {64}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6039 $channel;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(InterfaceC6039 interfaceC6039, InterfaceC5189<? super GlobalSnapshotManager$ensureStarted$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$channel = interfaceC6039;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new GlobalSnapshotManager$ensureStarted$1(this.$channel, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((GlobalSnapshotManager$ensureStarted$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[Catch: all -> 0x0016, TryCatch #1 {all -> 0x0016, blocks: (B:6:0x0012, B:17:0x0037, B:19:0x003f, B:20:0x0050, B:26:0x005e, B:14:0x0027, B:28:0x0061, B:30:0x0066, B:31:0x0067, B:13:0x0023, B:21:0x0051, B:23:0x0057), top: B:40:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0034 -> B:17:0x0037). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC6031 interfaceC6031;
        ?? it;
        InterfaceC6044 interfaceC6044;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                interfaceC6031 = this.$channel;
                it = interfaceC6031.iterator();
                this.L$0 = interfaceC6031;
                this.L$1 = it;
                this.label = 1;
                C6023 c6023 = (C6023) it;
                obj = c6023.m10823(this);
                interfaceC6044 = c6023;
                if (obj == coroutineSingletons) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                InterfaceC6044 interfaceC60442 = (InterfaceC6044) this.L$1;
                interfaceC6031 = (InterfaceC6031) this.L$0;
                AbstractC6017.m10769(obj);
                interfaceC6044 = interfaceC60442;
                if (((Boolean) obj).booleanValue()) {
                    it = (C6023) interfaceC6044;
                    boolean z = false;
                    AbstractC2750.f6004.set(false);
                    synchronized (AbstractC2115.f4090) {
                        C1082 c1082 = AbstractC2115.f4097.f4042;
                        if (c1082 != null && c1082.m1432()) {
                            z = true;
                        }
                    }
                    if (z) {
                        AbstractC2115.m2823();
                    }
                    this.L$0 = interfaceC6031;
                    this.L$1 = it;
                    this.label = 1;
                    C6023 c60232 = (C6023) it;
                    obj = c60232.m10823(this);
                    interfaceC6044 = c60232;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        interfaceC6031.mo10815(null);
                        return C6008.f15084;
                    }
                }
            }
        } finally {
        }
    }
}
