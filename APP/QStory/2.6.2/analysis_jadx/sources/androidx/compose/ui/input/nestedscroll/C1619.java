package androidx.compose.ui.input.nestedscroll;

import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6542;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1619 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public InterfaceC5400 f4734;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC6542 f4735 = new InterfaceC6542() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1
        {
            super(0);
        }

        @Override // p052.InterfaceC6542
        public final InterfaceC5400 invoke() {
            return this.this$0.f4734;
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C1616 f4736;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C1616 f4737;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC5400 m2981() {
        InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.f4735.invoke();
        if (interfaceC5400 != null) {
            return interfaceC5400;
        }
        C5919.m11250("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long m2982(int i, long j) {
        C1616 c1616 = this.f4737;
        C1616 c1616M2978 = c1616 != null ? c1616.m2978() : null;
        if (c1616M2978 != null) {
            return c1616M2978.mo2976(i, j);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2983(long r6, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            kotlin.AbstractC5184.m10206(r8)
            goto L44
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r3
        L2e:
            kotlin.AbstractC5184.m10206(r8)
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世兰苏哲 r5 = r5.f4737
            if (r5 == 0) goto L39
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世兰苏哲 r3 = r5.m2978()
        L39:
            if (r3 == 0) goto L49
            r0.label = r4
            java.lang.Object r8 = r3.mo2979(r6, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r8 = (p205.C7901) r8
            long r5 = r8.f21874
            goto L4b
        L49:
            r5 = 0
        L4b:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r7 = new 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.C1619.m2983(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m2984(long j, long j2, int i) {
        C1616 c1616 = this.f4737;
        C1616 c1616M2978 = c1616 != null ? c1616.m2978() : null;
        if (c1616M2978 != null) {
            return c1616M2978.mo1244(j, j2, i);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2985(long r9, long r11, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L14
            r0 = r13
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r13 = r0
            goto L1a
        L14:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r0 = r13.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r13.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            kotlin.AbstractC5184.m10206(r0)
            goto L6e
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r8)
            return r3
        L33:
            kotlin.AbstractC5184.m10206(r0)
            goto L55
        L37:
            kotlin.AbstractC5184.m10206(r0)
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世兰苏哲 r0 = r8.f4737
            if (r0 == 0) goto L43
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世兰苏哲 r0 = r0.m2978()
            goto L44
        L43:
            r0 = r3
        L44:
            r6 = 0
            if (r0 != 0) goto L5a
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世兰苏哲 r8 = r8.f4736
            if (r8 == 0) goto L72
            r13.label = r5
            java.lang.Object r0 = r8.mo1245(r9, r11, r13)
            if (r0 != r1) goto L55
            goto L6d
        L55:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r0 = (p205.C7901) r0
            long r6 = r0.f21874
            goto L72
        L5a:
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世兰苏哲 r8 = r8.f4737
            if (r8 == 0) goto L62
            androidx.compose.ui.input.nestedscroll.飘花落叶言子楪世兰苏哲 r3 = r8.m2978()
        L62:
            r8 = r3
            if (r8 == 0) goto L72
            r13.label = r4
            java.lang.Object r0 = r8.mo1245(r9, r11, r13)
            if (r0 != r1) goto L6e
        L6d:
            return r1
        L6e:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r0 = (p205.C7901) r0
            long r6 = r0.f21874
        L72:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r8 = new 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.C1619.m2985(long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
