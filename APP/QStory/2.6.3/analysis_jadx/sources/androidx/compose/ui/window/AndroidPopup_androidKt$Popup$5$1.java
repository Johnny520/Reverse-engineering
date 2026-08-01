package androidx.compose.ui.window;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", f = "AndroidPopup.android.kt", l = {496}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class AndroidPopup_androidKt$Popup$5$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C2097 $popupLayout;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$5$1(C2097 c2097, InterfaceC4357<? super AndroidPopup_androidKt$Popup$5$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$popupLayout = c2097;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        AndroidPopup_androidKt$Popup$5$1 androidPopup_androidKt$Popup$5$1 = new AndroidPopup_androidKt$Popup$5$1(this.$popupLayout, interfaceC4357);
        androidPopup_androidKt$Popup$5$1.L$0 = obj;
        return androidPopup_androidKt$Popup$5$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((AndroidPopup_androidKt$Popup$5$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0044 -> B:16:0x0047). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 != r3) goto L12
            java.lang.Object r1 = r9.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r1 = (kotlinx.coroutines.InterfaceC5401) r1
            kotlin.AbstractC5185.m10210(r10)
            goto L47
        L12:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r9)
            return r2
        L18:
            kotlin.AbstractC5185.m10210(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r10 = (kotlinx.coroutines.InterfaceC5401) r10
            r1 = r10
        L20:
            boolean r10 = kotlinx.coroutines.AbstractC5399.m10495(r1)
            if (r10 == 0) goto L6c
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1 r10 = new p052.InterfaceC6558() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.1
                static {
                    /*
                        androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1) androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.1.INSTANCE androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.AnonymousClass1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.AnonymousClass1.<init>():void");
                }

                @Override // p052.InterfaceC6558
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
                    /*
                        r2 = this;
                        java.lang.Number r3 = (java.lang.Number) r3
                        long r0 = r3.longValue()
                        r2.invoke(r0)
                        kotlin.飘花落叶言子楪兰苏哲世 r2 = kotlin.C5176.f14739
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
                }

                public final void invoke(long r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.AnonymousClass1.invoke(long):void");
                }
            }
            r9.L$0 = r1
            r9.label = r3
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r4 = r9.getContext()
            androidx.compose.ui.platform.飘花落叶言子苏兰世哲楪 r5 = androidx.compose.ui.platform.C1907.f5622
            kotlin.coroutines.飘花落叶言子楪世兰哲苏 r4 = r4.get(r5)
            if (r4 != 0) goto L68
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r4 = r9.getContext()
            androidx.compose.runtime.飘花落叶言子世兰楪苏哲 r4 = androidx.compose.runtime.AbstractC1367.m2492(r4)
            java.lang.Object r10 = r4.mo2305(r10, r9)
            if (r10 != r0) goto L47
            return r0
        L47:
            androidx.compose.ui.window.飘花落叶言子楪兰世哲苏 r10 = r9.$popupLayout
            int[] r4 = r10.f6207
            boolean r5 = r10.isAttachedToWindow()
            if (r5 != 0) goto L52
            goto L20
        L52:
            r5 = 0
            r6 = r4[r5]
            r7 = r4[r3]
            android.view.View r8 = r10.f6217
            r8.getLocationOnScreen(r4)
            r5 = r4[r5]
            if (r6 != r5) goto L64
            r4 = r4[r3]
            if (r7 == r4) goto L20
        L64:
            r10.m3844()
            goto L20
        L68:
            com.alibaba.fastjson2.C2942.m6394()
            return r2
        L6c:
            kotlin.飘花落叶言子楪兰苏哲世 r9 = kotlin.C5176.f14739
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
