package androidx.compose.ui.platform;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.channels.InterfaceC5207;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {64}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5207 $channel;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(InterfaceC5207 interfaceC5207, InterfaceC4357<? super GlobalSnapshotManager$ensureStarted$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$channel = interfaceC5207;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new GlobalSnapshotManager$ensureStarted$1(this.$channel, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((GlobalSnapshotManager$ensureStarted$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 != r3) goto L18
            java.lang.Object r1 = r7.L$1
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r1 = (kotlinx.coroutines.channels.InterfaceC5212) r1
            java.lang.Object r4 = r7.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r4 = (kotlinx.coroutines.channels.InterfaceC5199) r4
            kotlin.AbstractC5185.m10210(r8)     // Catch: java.lang.Throwable -> L16
            goto L37
        L16:
            r7 = move-exception
            goto L6e
        L18:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r2
        L1e:
            kotlin.AbstractC5185.m10210(r8)
            kotlinx.coroutines.channels.飘花落叶言子楪苏世兰哲 r4 = r7.$channel
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r8 = r4.iterator()     // Catch: java.lang.Throwable -> L16
        L27:
            r7.L$0 = r4     // Catch: java.lang.Throwable -> L16
            r7.L$1 = r8     // Catch: java.lang.Throwable -> L16
            r7.label = r3     // Catch: java.lang.Throwable -> L16
            r1 = r8
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r1 = (kotlinx.coroutines.channels.C5191) r1     // Catch: java.lang.Throwable -> L16
            java.lang.Object r8 = r1.m10264(r7)     // Catch: java.lang.Throwable -> L16
            if (r8 != r0) goto L37
            return r0
        L37:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L16
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L16
            if (r8 == 0) goto L68
            r8 = r1
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r8 = (kotlinx.coroutines.channels.C5191) r8     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r8.m10262()     // Catch: java.lang.Throwable -> L16
            kotlin.飘花落叶言子楪兰苏哲世 r1 = (kotlin.C5176) r1     // Catch: java.lang.Throwable -> L16
            java.util.concurrent.atomic.AtomicBoolean r1 = androidx.compose.ui.platform.AbstractC1915.f5659     // Catch: java.lang.Throwable -> L16
            r5 = 0
            r1.set(r5)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = androidx.compose.runtime.snapshots.AbstractC1280.f3745     // Catch: java.lang.Throwable -> L16
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L16
            androidx.compose.runtime.snapshots.飘花落叶言子楪世苏哲兰 r6 = androidx.compose.runtime.snapshots.AbstractC1280.f3752     // Catch: java.lang.Throwable -> L65
            androidx.collection.飘花落叶言子世兰楪哲苏 r6 = r6.f3697     // Catch: java.lang.Throwable -> L65
            if (r6 == 0) goto L5e
            boolean r6 = r6.m872()     // Catch: java.lang.Throwable -> L65
            if (r6 != r3) goto L5e
            r5 = r3
        L5e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            if (r5 == 0) goto L27
            androidx.compose.runtime.snapshots.AbstractC1280.m2263()     // Catch: java.lang.Throwable -> L16
            goto L27
        L65:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r7     // Catch: java.lang.Throwable -> L16
        L68:
            r4.mo10256(r2)
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5176.f14739
            return r7
        L6e:
            throw r7     // Catch: java.lang.Throwable -> L6f
        L6f:
            r8 = move-exception
            kotlinx.coroutines.channels.AbstractC5205.m10278(r4, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
