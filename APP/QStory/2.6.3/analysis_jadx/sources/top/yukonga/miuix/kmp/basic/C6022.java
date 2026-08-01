package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC1349;
import androidx.compose.ui.input.nestedscroll.InterfaceC1620;
import p112.C7329;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6022 implements InterfaceC1620 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C6026 f16445;

    public C6022(C6026 c6026) {
        this.f16445 = c6026;
    }

    @Override // androidx.compose.ui.input.nestedscroll.InterfaceC1620
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final long mo2986(int i, long j) {
        C6026 c6026 = this.f16445;
        C6034 c6034 = c6026.f16457;
        if (!((Boolean) c6026.f16454.invoke()).booleanValue()) {
            return 0L;
        }
        int i2 = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i2) > 0.0f) {
            return 0L;
        }
        float fM11395 = c6034.m11395();
        c6034.m11394(Float.intBitsToFloat(i2) + c6034.m11395());
        if (fM11395 == c6034.m11395()) {
            return 0L;
        }
        return C7329.m12530(j, 0.0f, 2);
    }

    @Override // androidx.compose.ui.input.nestedscroll.InterfaceC1620
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public final long mo1254(long j, long j2, int i) {
        C6026 c6026 = this.f16445;
        C6034 c6034 = c6026.f16457;
        if (!((Boolean) c6026.f16454.invoke()).booleanValue()) {
            return 0L;
        }
        int i2 = (int) (j & 4294967295L);
        ((AbstractC1349) c6034.f16483).m2435(Float.intBitsToFloat(i2) + ((AbstractC1349) c6034.f16483).m2434());
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i3) < 0.0f || Float.intBitsToFloat(i2) < 0.0f) {
            float fM11395 = c6034.m11395();
            c6034.m11394(Float.intBitsToFloat(i2) + c6034.m11395());
            return (((long) Float.floatToRawIntBits(c6034.m11395() - fM11395)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
        }
        if (Float.intBitsToFloat(i3) <= 0.0f) {
            return 0L;
        }
        float fM113952 = c6034.m11395();
        c6034.m11394(Float.intBitsToFloat(i3) + c6034.m11395());
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c6034.m11395() - fM113952)) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // androidx.compose.ui.input.nestedscroll.InterfaceC1620
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1255(long r9, long r11, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r8 = this;
            top.yukonga.miuix.kmp.basic.飘花落叶言子楪哲苏世兰 r0 = r8.f16445
            top.yukonga.miuix.kmp.basic.飘花落叶言子苏世楪哲兰 r1 = r0.f16457
            boolean r2 = r13 instanceof top.yukonga.miuix.kmp.basic.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1
            if (r2 == 0) goto L18
            r2 = r13
            top.yukonga.miuix.kmp.basic.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 r2 = (top.yukonga.miuix.kmp.basic.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.label = r3
        L16:
            r13 = r2
            goto L1e
        L18:
            top.yukonga.miuix.kmp.basic.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 r2 = new top.yukonga.miuix.kmp.basic.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1
            r2.<init>(r8, r13)
            goto L16
        L1e:
            java.lang.Object r2 = r13.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r13.label
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L41
            if (r4 == r6) goto L39
            if (r4 != r5) goto L32
            long r8 = r13.J$3
            kotlin.AbstractC5185.m10210(r2)
            goto L7f
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r8)
            r8 = 0
            return r8
        L39:
            long r11 = r13.J$1
            long r9 = r13.J$0
            kotlin.AbstractC5185.m10210(r2)
            goto L61
        L41:
            kotlin.AbstractC5185.m10210(r2)
            float r2 = p205.C7902.m13350(r11)
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L54
            androidx.compose.runtime.飘花落叶言子苏楪哲世兰 r2 = r1.f16483
            androidx.compose.runtime.飘花落叶言子哲苏楪世兰 r2 = (androidx.compose.runtime.AbstractC1349) r2
            r2.m2435(r4)
        L54:
            r13.J$0 = r9
            r13.J$1 = r11
            r13.label = r6
            java.lang.Object r2 = super.mo1255(r9, r11, r13)
            if (r2 != r3) goto L61
            goto L7d
        L61:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r2 = (p205.C7902) r2
            long r6 = r2.f21871
            float r8 = p205.C7902.m13350(r11)
            androidx.compose.animation.core.飘花落叶言子楪兰世苏哲 r2 = r0.f16455
            androidx.compose.animation.core.飘花落叶言子世兰苏楪哲 r0 = r0.f16456
            r13.J$0 = r9
            r13.J$1 = r11
            r13.J$2 = r6
            r13.J$3 = r6
            r13.label = r5
            java.lang.Object r2 = top.yukonga.miuix.kmp.basic.AbstractC6032.m11391(r1, r8, r2, r0, r13)
            if (r2 != r3) goto L7e
        L7d:
            return r3
        L7e:
            r8 = r6
        L7f:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r2 = (p205.C7902) r2
            long r10 = r2.f21871
            long r8 = p205.C7902.m13348(r8, r10)
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r10 = new 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世
            r10.<init>(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.basic.C6022.mo1255(long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
