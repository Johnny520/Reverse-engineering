package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.AbstractC5360;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5200 extends AbstractC5360 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f14788;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C5189 f14789;

    public C5200(long j, C5200 c5200, C5189 c5189, int i) {
        super(j, c5200, i);
        this.f14789 = c5189;
        this.f14788 = new AtomicReferenceArray(AbstractC5188.f14751 * 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m10261(int i, Object obj) {
        this.f14788.set((i * 2) + 1, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m10262(int i, Object obj) {
        this.f14788.set(i * 2, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        m10262(r5, null);
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
    @Override // kotlinx.coroutines.internal.AbstractC5360
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo10263(int r5, kotlin.coroutines.InterfaceC4359 r6) {
        /*
            r4 = this;
            int r6 = kotlinx.coroutines.channels.AbstractC5188.f14751
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
            java.lang.Object r6 = r4.m10264(r5)
            boolean r1 = r6 instanceof kotlinx.coroutines.InterfaceC5411
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r2 = r4.f14789
            r3 = 0
            if (r1 != 0) goto L50
            boolean r1 = r6 instanceof kotlinx.coroutines.channels.C5197
            if (r1 == 0) goto L21
            goto L50
        L21:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r1 = kotlinx.coroutines.channels.AbstractC5188.f14765
            if (r6 == r1) goto L47
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r1 = kotlinx.coroutines.channels.AbstractC5188.f14762
            if (r6 != r1) goto L2a
            goto L47
        L2a:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r1 = kotlinx.coroutines.channels.AbstractC5188.f14761
            if (r6 == r1) goto L11
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r1 = kotlinx.coroutines.channels.AbstractC5188.f14747
            if (r6 != r1) goto L33
            goto L11
        L33:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r4 = kotlinx.coroutines.channels.AbstractC5188.f14764
            if (r6 == r4) goto L6a
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r4 = kotlinx.coroutines.channels.AbstractC5188.f14749
            if (r6 != r4) goto L3c
            goto L6a
        L3c:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r4 = kotlinx.coroutines.channels.AbstractC5188.f14763
            if (r6 != r4) goto L41
            goto L6a
        L41:
            java.lang.String r4 = "unexpected state: "
            io.ktor.util.C4210.m8602(r6, r4)
            return
        L47:
            r4.m10262(r5, r3)
            if (r0 == 0) goto L6a
            r2.getClass()
            return
        L50:
            if (r0 == 0) goto L55
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r1 = kotlinx.coroutines.channels.AbstractC5188.f14765
            goto L57
        L55:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r1 = kotlinx.coroutines.channels.AbstractC5188.f14762
        L57:
            boolean r6 = r4.m10266(r6, r5, r1)
            if (r6 == 0) goto L11
            r4.m10262(r5, r3)
            r6 = r0 ^ 1
            r4.m10265(r5, r6)
            if (r0 == 0) goto L6a
            r2.getClass()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5200.mo10263(int, kotlin.coroutines.飘花落叶言子楪苏世兰哲):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object m10264(int i) {
        return this.f14788.get((i * 2) + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m10265(int i, boolean z) {
        if (z) {
            C5189 c5189 = this.f14789;
            c5189.getClass();
            c5189.m10221((this.f14944 * ((long) AbstractC5188.f14751)) + ((long) i));
        }
        m10383();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean m10266(Object obj, int i, Object obj2) {
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

    @Override // kotlinx.coroutines.internal.AbstractC5360
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int mo10267() {
        return AbstractC5188.f14751;
    }
}
