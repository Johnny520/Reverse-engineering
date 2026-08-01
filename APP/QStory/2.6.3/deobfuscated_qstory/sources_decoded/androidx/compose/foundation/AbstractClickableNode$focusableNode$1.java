package androidx.compose.foundation;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class AbstractClickableNode$focusableNode$1 extends FunctionReferenceImpl implements InterfaceC6558 {
    public AbstractClickableNode$focusableNode$1(Object obj) {
        super(1, obj, AbstractC1054.class, "onFocusChange", "onFocusChange(Z)V", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(boolean r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r0 = r0.receiver
            androidx.compose.foundation.飘花落叶言子楪世苏兰哲 r0 = (androidx.compose.foundation.AbstractC1054) r0
            androidx.collection.飘花落叶言子世苏哲楪兰 r1 = r0.f3117
            if (r19 == 0) goto Le
            r0.m1967()
            return
        Le:
            androidx.compose.foundation.interaction.飘花落叶言子楪苏兰哲世 r2 = r0.f3129
            r3 = 0
            if (r2 == 0) goto L71
            java.lang.Object[] r2 = r1.f927
            long[] r4 = r1.f929
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 3
            if (r5 < 0) goto L61
            r8 = 0
        L1e:
            r9 = r4[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L5c
            int r11 = r8 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L38:
            if (r13 >= r11) goto L5a
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L56
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰 r14 = (androidx.compose.foundation.interaction.C0575) r14
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r15 = r0.m3867()
            androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1 r7 = new androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1
            r7.<init>(r0, r14, r3)
            kotlinx.coroutines.AbstractC5399.m10477(r15, r3, r3, r7, r6)
        L56:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L5a:
            if (r11 != r12) goto L61
        L5c:
            if (r8 == r5) goto L61
            int r8 = r8 + 1
            goto L1e
        L61:
            androidx.compose.foundation.interaction.飘花落叶言子楪哲苏世兰 r2 = r0.f3114
            if (r2 == 0) goto L71
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r4 = r0.m3867()
            androidx.compose.foundation.AbstractClickableNode$onFocusChange$2$1 r5 = new androidx.compose.foundation.AbstractClickableNode$onFocusChange$2$1
            r5.<init>(r0, r2, r3)
            kotlinx.coroutines.AbstractC5399.m10477(r4, r3, r3, r5, r6)
        L71:
            r1.m817()
            r0.f3114 = r3
            r0.mo1928()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$focusableNode$1.invoke(boolean):void");
    }

    @Override // p052.InterfaceC6558
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C5176.f14739;
    }
}
