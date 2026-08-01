package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.Ref$FloatRef;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0533 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1551;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1552;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f1553;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1554;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1555;

    public /* synthetic */ C0533(Ref$FloatRef ref$FloatRef, C0554 c0554, InterfaceC0557 interfaceC0557, C0555 c0555) {
        this.f1555 = 2;
        this.f1553 = ref$FloatRef;
        this.f1554 = c0554;
        this.f1551 = interfaceC0557;
        this.f1552 = c0555;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    @Override // p052.InterfaceC6558
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f1555
            java.lang.Object r1 = r5.f1552
            java.lang.Object r2 = r5.f1551
            java.lang.Object r3 = r5.f1554
            java.lang.Object r5 = r5.f1553
            switch(r0) {
                case 0: goto L6a;
                case 1: goto L5b;
                default: goto Ld;
            }
        Ld:
            kotlin.jvm.internal.Ref$FloatRef r5 = (kotlin.jvm.internal.Ref$FloatRef) r5
            androidx.compose.foundation.gestures.飘花落叶言子苏哲世兰楪 r3 = (androidx.compose.foundation.gestures.C0554) r3
            androidx.compose.foundation.gestures.飘花落叶言子苏哲兰楪世 r2 = (androidx.compose.foundation.gestures.InterfaceC0557) r2
            androidx.compose.foundation.gestures.飘花落叶言子苏哲世楪兰 r1 = (androidx.compose.foundation.gestures.C0555) r1
            androidx.compose.animation.core.飘花落叶言子楪苏世兰哲 r6 = (androidx.compose.animation.core.C0345) r6
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r0 = r6.f1183
            androidx.compose.runtime.飘花落叶言子哲苏兰世楪 r0 = (androidx.compose.runtime.AbstractC1347) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r4 = r5.element
            float r0 = r0 - r4
            boolean r4 = androidx.compose.foundation.gestures.AbstractC0521.m1297(r0)
            if (r4 != 0) goto L43
            float r2 = r3.m1349(r2, r0)
            float r2 = r0 - r2
            boolean r2 = androidx.compose.foundation.gestures.AbstractC0521.m1297(r2)
            if (r2 != 0) goto L3e
            r6.m1046()
            goto L58
        L3e:
            float r2 = r5.element
            float r2 = r2 + r0
            r5.element = r2
        L43:
            float r5 = r5.element
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Object r5 = r1.invoke(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L58
            r6.m1046()
        L58:
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5176.f14739
            return r5
        L5b:
            kotlin.jvm.internal.Ref$FloatRef r5 = (kotlin.jvm.internal.Ref$FloatRef) r5
            androidx.compose.foundation.gestures.飘花落叶言子哲楪世苏兰 r3 = (androidx.compose.foundation.gestures.InterfaceC0507) r3
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref$FloatRef) r1
            androidx.compose.foundation.gestures.飘花落叶言子楪兰哲世苏 r2 = (androidx.compose.foundation.gestures.C0526) r2
            androidx.compose.animation.core.飘花落叶言子楪苏世兰哲 r6 = (androidx.compose.animation.core.C0345) r6
            kotlin.飘花落叶言子楪兰苏哲世 r5 = androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2.m1188(r5, r3, r1, r2, r6)
            return r5
        L6a:
            androidx.compose.foundation.gestures.飘花落叶言子楪兰世哲苏 r5 = (androidx.compose.foundation.gestures.C0524) r5
            androidx.compose.foundation.gestures.飘花落叶言子兰世苏楪哲 r3 = (androidx.compose.foundation.gestures.C0487) r3
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r1 = (kotlinx.coroutines.InterfaceC5452) r1
            androidx.compose.foundation.gestures.飘花落叶言子苏哲兰楪世 r2 = (androidx.compose.foundation.gestures.InterfaceC0557) r2
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            kotlin.飘花落叶言子楪兰苏哲世 r5 = androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2.AnonymousClass1.m1186(r5, r3, r1, r2, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C0533.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ C0533(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f1555 = i;
        this.f1553 = obj;
        this.f1554 = obj2;
        this.f1552 = obj3;
        this.f1551 = obj4;
    }
}
