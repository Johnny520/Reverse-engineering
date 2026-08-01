package com.google.gson.internal;

import com.google.gson.AbstractC3250;
import com.google.gson.C3252;
import p260.C8245;

/* JADX INFO: renamed from: com.google.gson.internal.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3222 extends AbstractC3250 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final /* synthetic */ C3221 f10870;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C8245 f10871;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ C3252 f10872;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ boolean f10873;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ boolean f10874;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public volatile AbstractC3250 f10875;

    public C3222(C3221 c3221, boolean z, boolean z2, C3252 c3252, C8245 c8245) {
        this.f10870 = c3221;
        this.f10874 = z;
        this.f10873 = z2;
        this.f10872 = c3252;
        this.f10871 = c8245;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082 A[SYNTHETIC] */
    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo7335(p259.C8243 r11, java.lang.Object r12) {
        /*
            r10 = this;
            boolean r0 = r10.f10873
            if (r0 == 0) goto L8
            r11.m13762()
            return
        L8:
            com.google.gson.飘花落叶言子楪哲苏兰世 r0 = r10.f10875
            if (r0 != 0) goto L91
            com.google.gson.飘花落叶言子楪苏世哲兰 r0 = r10.f10872
            com.google.gson.internal.飘花落叶言子楪世兰苏哲 r1 = r10.f10870
            飘花落叶言楪哲世子苏兰.飘花落叶言子楪世苏哲兰 r2 = r10.f10871
            飘花落叶言楪哲子苏世兰.飘花落叶言子楪苏兰哲世 r3 = r0.f10937
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap r4 = r3.f22958
            飘花落叶言楪哲子苏世兰.飘花落叶言子楪苏兰世哲 r5 = p271.C8323.f22957
            r6 = 1
            if (r1 != r5) goto L1f
            goto L60
        L1f:
            java.lang.Class r5 = r2.f22816
            java.lang.Object r7 = r4.get(r5)
            com.google.gson.飘花落叶言子楪哲兰世苏 r7 = (com.google.gson.InterfaceC3248) r7
            if (r7 == 0) goto L2c
            if (r7 != r1) goto L61
            goto L60
        L2c:
            java.lang.Class<飘花落叶言楪哲子世兰苏.飘花落叶言子楪世苏哲兰> r7 = p267.InterfaceC8265.class
            java.lang.annotation.Annotation r7 = r5.getAnnotation(r7)
            飘花落叶言楪哲子世兰苏.飘花落叶言子楪世苏哲兰 r7 = (p267.InterfaceC8265) r7
            if (r7 != 0) goto L37
            goto L61
        L37:
            java.lang.Class r7 = r7.value()
            java.lang.Class<com.google.gson.飘花落叶言子楪哲兰世苏> r8 = com.google.gson.InterfaceC3248.class
            boolean r8 = r8.isAssignableFrom(r7)
            if (r8 != 0) goto L44
            goto L61
        L44:
            飘花落叶言楪世苏兰哲子.飘花落叶言子楪哲兰世苏 r8 = r3.f22959
            飘花落叶言楪哲世子苏兰.飘花落叶言子楪世苏哲兰 r9 = new 飘花落叶言楪哲世子苏兰.飘花落叶言子楪世苏哲兰
            r9.<init>(r7)
            com.google.gson.internal.飘花落叶言子楪苏兰哲世 r7 = r8.m13520(r9, r6)
            java.lang.Object r7 = r7.mo4472()
            com.google.gson.飘花落叶言子楪哲兰世苏 r7 = (com.google.gson.InterfaceC3248) r7
            java.lang.Object r4 = r4.putIfAbsent(r5, r7)
            com.google.gson.飘花落叶言子楪哲兰世苏 r4 = (com.google.gson.InterfaceC3248) r4
            if (r4 == 0) goto L5e
            r7 = r4
        L5e:
            if (r7 != r1) goto L61
        L60:
            r1 = r3
        L61:
            java.util.List r3 = r0.f10936
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L68:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L82
            java.lang.Object r5 = r3.next()
            com.google.gson.飘花落叶言子楪哲兰世苏 r5 = (com.google.gson.InterfaceC3248) r5
            if (r4 != 0) goto L7a
            if (r5 != r1) goto L68
            r4 = r6
            goto L68
        L7a:
            com.google.gson.飘花落叶言子楪哲苏兰世 r5 = r5.mo7334(r0, r2)
            if (r5 == 0) goto L68
            r0 = r5
            goto L88
        L82:
            if (r4 != 0) goto L8b
            com.google.gson.飘花落叶言子楪哲苏兰世 r0 = r0.m7353(r2)
        L88:
            r10.f10875 = r0
            goto L91
        L8b:
            java.lang.String r10 = "GSON cannot serialize or deserialize "
            io.ktor.util.C4210.m8614(r2, r10)
            return
        L91:
            r0.mo7335(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C3222.mo7335(飘花落叶言楪哲世子兰苏.飘花落叶言子楪世苏兰哲, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083 A[SYNTHETIC] */
    @Override // com.google.gson.AbstractC3250
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo7336(p259.C8244 r12) throws java.io.IOException {
        /*
            r11 = this;
            boolean r0 = r11.f10874
            r1 = 0
            if (r0 == 0) goto L9
            r12.m13793()
            return r1
        L9:
            com.google.gson.飘花落叶言子楪哲苏兰世 r0 = r11.f10875
            if (r0 != 0) goto L92
            com.google.gson.飘花落叶言子楪苏世哲兰 r0 = r11.f10872
            com.google.gson.internal.飘花落叶言子楪世兰苏哲 r2 = r11.f10870
            飘花落叶言楪哲世子苏兰.飘花落叶言子楪世苏哲兰 r3 = r11.f10871
            飘花落叶言楪哲子苏世兰.飘花落叶言子楪苏兰哲世 r4 = r0.f10937
            r4.getClass()
            java.util.concurrent.ConcurrentHashMap r5 = r4.f22958
            飘花落叶言楪哲子苏世兰.飘花落叶言子楪苏兰世哲 r6 = p271.C8323.f22957
            r7 = 1
            if (r2 != r6) goto L20
            goto L61
        L20:
            java.lang.Class r6 = r3.f22816
            java.lang.Object r8 = r5.get(r6)
            com.google.gson.飘花落叶言子楪哲兰世苏 r8 = (com.google.gson.InterfaceC3248) r8
            if (r8 == 0) goto L2d
            if (r8 != r2) goto L62
            goto L61
        L2d:
            java.lang.Class<飘花落叶言楪哲子世兰苏.飘花落叶言子楪世苏哲兰> r8 = p267.InterfaceC8265.class
            java.lang.annotation.Annotation r8 = r6.getAnnotation(r8)
            飘花落叶言楪哲子世兰苏.飘花落叶言子楪世苏哲兰 r8 = (p267.InterfaceC8265) r8
            if (r8 != 0) goto L38
            goto L62
        L38:
            java.lang.Class r8 = r8.value()
            java.lang.Class<com.google.gson.飘花落叶言子楪哲兰世苏> r9 = com.google.gson.InterfaceC3248.class
            boolean r9 = r9.isAssignableFrom(r8)
            if (r9 != 0) goto L45
            goto L62
        L45:
            飘花落叶言楪世苏兰哲子.飘花落叶言子楪哲兰世苏 r9 = r4.f22959
            飘花落叶言楪哲世子苏兰.飘花落叶言子楪世苏哲兰 r10 = new 飘花落叶言楪哲世子苏兰.飘花落叶言子楪世苏哲兰
            r10.<init>(r8)
            com.google.gson.internal.飘花落叶言子楪苏兰哲世 r8 = r9.m13520(r10, r7)
            java.lang.Object r8 = r8.mo4472()
            com.google.gson.飘花落叶言子楪哲兰世苏 r8 = (com.google.gson.InterfaceC3248) r8
            java.lang.Object r5 = r5.putIfAbsent(r6, r8)
            com.google.gson.飘花落叶言子楪哲兰世苏 r5 = (com.google.gson.InterfaceC3248) r5
            if (r5 == 0) goto L5f
            r8 = r5
        L5f:
            if (r8 != r2) goto L62
        L61:
            r2 = r4
        L62:
            java.util.List r4 = r0.f10936
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L69:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L83
            java.lang.Object r6 = r4.next()
            com.google.gson.飘花落叶言子楪哲兰世苏 r6 = (com.google.gson.InterfaceC3248) r6
            if (r5 != 0) goto L7b
            if (r6 != r2) goto L69
            r5 = r7
            goto L69
        L7b:
            com.google.gson.飘花落叶言子楪哲苏兰世 r6 = r6.mo7334(r0, r3)
            if (r6 == 0) goto L69
            r0 = r6
            goto L89
        L83:
            if (r5 != 0) goto L8c
            com.google.gson.飘花落叶言子楪哲苏兰世 r0 = r0.m7353(r3)
        L89:
            r11.f10875 = r0
            goto L92
        L8c:
            java.lang.String r11 = "GSON cannot serialize or deserialize "
            io.ktor.util.C4210.m8614(r3, r11)
            return r1
        L92:
            java.lang.Object r11 = r0.mo7336(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C3222.mo7336(飘花落叶言楪哲世子兰苏.飘花落叶言子楪世苏哲兰):java.lang.Object");
    }
}
