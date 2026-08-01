package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.AbstractC5361;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5201 extends AbstractC5361 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f14788;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C5190 f14789;

    public C5201(long j, C5201 c5201, C5190 c5190, int i) {
        super(j, c5201, i);
        this.f14789 = c5190;
        this.f14788 = new AtomicReferenceArray(AbstractC5189.f14751 * 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m10265(int i, Object obj) {
        this.f14788.set((i * 2) + 1, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m10266(int i, Object obj) {
        this.f14788.set(i * 2, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        m10266(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // kotlinx.coroutines.internal.AbstractC5361
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo10267(int r5, kotlin.coroutines.InterfaceC4360 r6) {
        /*
            r4 = this;
            int r6 = kotlinx.coroutines.channels.AbstractC5189.f14751
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.f14788
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.m10268(r5)
            boolean r1 = r6 instanceof kotlinx.coroutines.InterfaceC5412
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r2 = r4.f14789
            r3 = 0
            if (r1 != 0) goto L50
            boolean r1 = r6 instanceof kotlinx.coroutines.channels.C5198
            if (r1 == 0) goto L21
            goto L50
        L21:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r1 = kotlinx.coroutines.channels.AbstractC5189.f14765
            if (r6 == r1) goto L47
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r1 = kotlinx.coroutines.channels.AbstractC5189.f14762
            if (r6 != r1) goto L2a
            goto L47
        L2a:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r1 = kotlinx.coroutines.channels.AbstractC5189.f14761
            if (r6 == r1) goto L11
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r1 = kotlinx.coroutines.channels.AbstractC5189.f14747
            if (r6 != r1) goto L33
            goto L11
        L33:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r4 = kotlinx.coroutines.channels.AbstractC5189.f14764
            if (r6 == r4) goto L6a
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r4 = kotlinx.coroutines.channels.AbstractC5189.f14749
            if (r6 != r4) goto L3c
            goto L6a
        L3c:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r4 = kotlinx.coroutines.channels.AbstractC5189.f14763
            if (r6 != r4) goto L41
            goto L6a
        L41:
            java.lang.String r4 = "unexpected state: "
            io.ktor.util.C4211.m8592(r6, r4)
            return
        L47:
            r4.m10266(r5, r3)
            if (r0 == 0) goto L6a
            r2.getClass()
            return
        L50:
            if (r0 == 0) goto L55
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r1 = kotlinx.coroutines.channels.AbstractC5189.f14765
            goto L57
        L55:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r1 = kotlinx.coroutines.channels.AbstractC5189.f14762
        L57:
            boolean r6 = r4.m10270(r6, r5, r1)
            if (r6 == 0) goto L11
            r4.m10266(r5, r3)
            r6 = r0 ^ 1
            r4.m10269(r5, r6)
            if (r0 == 0) goto L6a
            r2.getClass()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5201.mo10267(int, kotlin.coroutines.飘花落叶言子楪苏世兰哲):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object m10268(int i) {
        return this.f14788.get((i * 2) + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m10269(int i, boolean z) {
        if (z) {
            C5190 c5190 = this.f14789;
            c5190.getClass();
            c5190.m10225((this.f14944 * ((long) AbstractC5189.f14751)) + ((long) i));
        }
        m10387();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean m10270(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f14788;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    @Override // kotlinx.coroutines.internal.AbstractC5361
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int mo10271() {
        return AbstractC5189.f14751;
    }
}
