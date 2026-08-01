package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", f = "AndroidTextInputSession.android.kt", l = {87}, m = "platformSpecificTextInputSession", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2(InterfaceC4357<? super AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2> interfaceC4357) {
        super(interfaceC4357);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r0.result = r1
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r2
            r0.label = r1
            boolean r1 = r0 instanceof androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2
            if (r1 == 0) goto L1d
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L1d
            int r1 = r1 - r2
            r0.label = r1
            goto L23
        L1d:
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 r1 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2
            r1.<init>(r0)
            r0 = r1
        L23:
            java.lang.Object r1 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r0.label
            r4 = 1
            if (r3 == 0) goto L39
            if (r3 == r4) goto L35
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r0)
        L33:
            r2 = 0
            goto L5c
        L35:
            kotlin.AbstractC5185.m10210(r1)
            goto L58
        L39:
            kotlin.AbstractC5185.m10210(r1)
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 r5 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3
            r17 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.label = r4
            java.lang.Object r0 = kotlinx.coroutines.AbstractC5399.m10507(r5, r0)
            if (r0 != r2) goto L58
            goto L5c
        L58:
            io.ktor.util.C4211.m8602()
            goto L33
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
