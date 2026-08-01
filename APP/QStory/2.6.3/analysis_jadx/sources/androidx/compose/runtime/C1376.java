package androidx.compose.runtime;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.lazy.layout.C0734;
import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.InterfaceC4361;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1376 implements InterfaceC1304 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0734 f3981 = new C0734();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1304 f3982;

    public C1376(InterfaceC1304 interfaceC1304) {
        this.f3982 = interfaceC1304;
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final Object fold(Object obj, InterfaceC6554 interfaceC6554) {
        return AbstractC0455.m1167(this, obj, interfaceC6554);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4354 get(InterfaceC4361 interfaceC4361) {
        return AbstractC0455.m1171(this, interfaceC4361);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4360 minusKey(InterfaceC4361 interfaceC4361) {
        return AbstractC0455.m1146(this, interfaceC4361);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4360 plus(InterfaceC4360 interfaceC4360) {
        return AbstractC0455.m1154(interfaceC4360, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.runtime.InterfaceC1304
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo2305(p052.InterfaceC6558 r8, kotlin.coroutines.InterfaceC4357 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = (androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 r0 = new androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            kotlin.AbstractC5185.m10210(r9)
            return r9
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r3
        L31:
            java.lang.Object r8 = r0.L$0
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r8 = (p052.InterfaceC6558) r8
            kotlin.AbstractC5185.m10210(r9)
            goto L79
        L39:
            kotlin.AbstractC5185.m10210(r9)
            androidx.compose.foundation.lazy.layout.飘花落叶言子苏楪哲世兰 r9 = r7.f3981
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r2 = r9.f2071
            monitor-enter(r2)
            boolean r6 = r9.f2072     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r2)
            if (r6 == 0) goto L4d
            kotlin.飘花落叶言子楪兰苏哲世 r9 = kotlin.C5176.f14739
            goto L76
        L4d:
            kotlinx.coroutines.飘花落叶言子楪苏兰世哲 r2 = new kotlinx.coroutines.飘花落叶言子楪苏兰世哲
            kotlin.coroutines.飘花落叶言子楪世哲苏兰 r6 = androidx.window.area.AbstractC2567.m5064(r0)
            r2.<init>(r5, r6)
            r2.m10543()
            java.lang.Object r5 = r9.f2071
            monitor-enter(r5)
            java.lang.Object r6 = r9.f2070     // Catch: java.lang.Throwable -> L87
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L87
            r6.add(r2)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r5)
            androidx.compose.runtime.飘花落叶言子世哲苏兰楪 r5 = new androidx.compose.runtime.飘花落叶言子世哲苏兰楪
            r6 = 0
            r5.<init>(r9, r6, r2)
            r2.m10541(r5)
            java.lang.Object r9 = r2.m10540()
            if (r9 != r1) goto L74
            goto L76
        L74:
            kotlin.飘花落叶言子楪兰苏哲世 r9 = kotlin.C5176.f14739
        L76:
            if (r9 != r1) goto L79
            goto L85
        L79:
            androidx.compose.runtime.飘花落叶言子世兰楪苏哲 r7 = r7.f3982
            r0.L$0 = r3
            r0.label = r4
            java.lang.Object r7 = r7.mo2305(r8, r0)
            if (r7 != r1) goto L86
        L85:
            return r1
        L86:
            return r7
        L87:
            r7 = move-exception
            monitor-exit(r5)
            throw r7
        L8a:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1376.mo2305(飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }
}
