package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.C1224;

/* JADX INFO: renamed from: androidx.compose.ui.focus.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1468 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1224 f4169 = new C1224(0, new InterfaceC1473[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1468 f4168 = new C1468();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1468 f4167 = new C1468();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1468 f4166 = new C1468();

    /* JADX WARN: Code restructure failed: missing block: B:69:0x004b, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m2622(androidx.compose.ui.focus.C1468 r12) {
        /*
            r12.getClass()
            androidx.compose.ui.focus.飘花落叶言子楪兰世哲苏 r0 = androidx.compose.ui.focus.C1468.f4168
            java.lang.String r1 = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"
            if (r12 == r0) goto Lc3
            androidx.compose.ui.focus.飘花落叶言子楪兰世哲苏 r0 = androidx.compose.ui.focus.C1468.f4167
            if (r12 == r0) goto Lbf
            androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲 r12 = r12.f4169
            int r0 = r12.f3519
            if (r0 != 0) goto L1b
            java.lang.String r12 = "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r12)
            return
        L1b:
            java.lang.Object[] r12 = r12.f3520
            r1 = 0
            r2 = r1
        L1f:
            if (r2 >= r0) goto Lbe
            r3 = r12[r2]
            androidx.compose.ui.focus.飘花落叶言子楪兰苏哲世 r3 = (androidx.compose.ui.focus.InterfaceC1473) r3
            r4 = r3
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r4 = (androidx.compose.ui.AbstractC2128) r4
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r4 = r4.f6291
            boolean r4 = r4.f6278
            if (r4 != 0) goto L33
            java.lang.String r4 = "visitChildren called on an unattached node"
            p210.AbstractC7935.m13395(r4)
        L33:
            androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲 r4 = new androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲
            r5 = 16
            androidx.compose.ui.飘花落叶言子楪哲苏世兰[] r6 = new androidx.compose.ui.AbstractC2128[r5]
            r4.<init>(r1, r6)
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r3 = (androidx.compose.ui.AbstractC2128) r3
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r3 = r3.f6291
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r6 = r3.f6287
            if (r6 != 0) goto L48
            androidx.compose.ui.node.AbstractC1785.m3332(r4, r3)
            goto L4b
        L48:
            r4.m2037(r6)
        L4b:
            int r3 = r4.f3519
            if (r3 == 0) goto Lba
            int r3 = r3 + (-1)
            java.lang.Object r3 = r4.m2043(r3)
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r3 = (androidx.compose.ui.AbstractC2128) r3
            int r6 = r3.f6284
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 != 0) goto L61
            androidx.compose.ui.node.AbstractC1785.m3332(r4, r3)
            goto L4b
        L61:
            if (r3 == 0) goto L4b
            int r6 = r3.f6290
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto Lb7
            r6 = 0
            r7 = r6
        L6b:
            if (r3 == 0) goto L4b
            boolean r8 = r3 instanceof androidx.compose.ui.focus.C1452
            if (r8 == 0) goto L7b
            androidx.compose.ui.focus.飘花落叶言子世楪兰苏哲 r3 = (androidx.compose.ui.focus.C1452) r3
            r8 = 7
            boolean r3 = r3.m2586(r8)
            if (r3 == 0) goto Lb2
            goto Lba
        L7b:
            int r8 = r3.f6290
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto Lb2
            boolean r8 = r3 instanceof androidx.compose.ui.node.AbstractC1788
            if (r8 == 0) goto Lb2
            r8 = r3
            androidx.compose.ui.node.飘花落叶言子楪苏哲兰世 r8 = (androidx.compose.ui.node.AbstractC1788) r8
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r8 = r8.f5225
            r9 = r1
        L8b:
            r10 = 1
            if (r8 == 0) goto Laf
            int r11 = r8.f6290
            r11 = r11 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto Lac
            int r9 = r9 + 1
            if (r9 != r10) goto L9a
            r3 = r8
            goto Lac
        L9a:
            if (r7 != 0) goto La3
            androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲 r7 = new androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲
            androidx.compose.ui.飘花落叶言子楪哲苏世兰[] r10 = new androidx.compose.ui.AbstractC2128[r5]
            r7.<init>(r1, r10)
        La3:
            if (r3 == 0) goto La9
            r7.m2037(r3)
            r3 = r6
        La9:
            r7.m2037(r8)
        Lac:
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r8 = r8.f6287
            goto L8b
        Laf:
            if (r9 != r10) goto Lb2
            goto L6b
        Lb2:
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r3 = androidx.compose.ui.node.AbstractC1785.m3329(r7)
            goto L6b
        Lb7:
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r3 = r3.f6287
            goto L61
        Lba:
            int r2 = r2 + 1
            goto L1f
        Lbe:
            return
        Lbf:
            top.suzhelan.qstory.hook.item.C5919.m11250(r1)
            return
        Lc3:
            top.suzhelan.qstory.hook.item.C5919.m11250(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.C1468.m2622(androidx.compose.ui.focus.飘花落叶言子楪兰世哲苏):void");
    }
}
