package kotlinx.coroutines.channels;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.jvm.internal.AbstractC4396;
import kotlinx.coroutines.selects.InterfaceC5368;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5206 extends C5190 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final BufferOverflow f14793;

    public C5206(int i, BufferOverflow bufferOverflow) {
        super(i);
        this.f14793 = bufferOverflow;
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            C0276.m849(AbstractC4396.f12975.mo8917(C5190.class).getSimpleName(), "This implementation does not support suspension for senders, use ", " instead");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        C5925.m11314(AbstractC0053.m162(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        return r8;
     */
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10284(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            kotlinx.coroutines.channels.BufferOverflow r1 = r15.f14793
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST
            kotlin.飘花落叶言子楪兰苏哲世 r8 = kotlin.C5176.f14739
            if (r1 != r2) goto L17
            java.lang.Object r0 = super.mo8436(r16)
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.C5210
            if (r1 == 0) goto L16
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.C5209
            if (r1 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r0
        L17:
            kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪兰哲世苏 r6 = kotlinx.coroutines.channels.AbstractC5189.f14749
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.C5190.f14776
            java.lang.Object r1 = r1.get(r15)
            kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏 r1 = (kotlinx.coroutines.channels.C5201) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.C5190.f14778
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.m10235(r2, r7)
            int r9 = kotlinx.coroutines.channels.AbstractC5189.f14751
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.f14944
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            kotlinx.coroutines.channels.飘花落叶言子楪哲世兰苏 r2 = r15.m10254(r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r0 = r15.m10246()
            kotlinx.coroutines.channels.飘花落叶言子楪苏兰世哲 r1 = new kotlinx.coroutines.channels.飘花落叶言子楪苏兰世哲
            r1.<init>(r0)
            return r1
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = kotlinx.coroutines.channels.C5190.m10223(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb5
            r3 = 1
            if (r12 == r3) goto Lb4
            r3 = 2
            r13 = 0
            if (r12 == r3) goto L8f
            r2 = 3
            if (r12 == r2) goto L89
            r2 = 4
            if (r12 == r2) goto L72
            r2 = 5
            if (r12 == r2) goto L6e
            goto L21
        L6e:
            r1.m10357()
            goto L21
        L72:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.C5190.f14779
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7f
            r1.m10357()
        L7f:
            java.lang.Throwable r0 = r15.m10246()
            kotlinx.coroutines.channels.飘花落叶言子楪苏兰世哲 r1 = new kotlinx.coroutines.channels.飘花落叶言子楪苏兰世哲
            r1.<init>(r0)
            return r1
        L89:
            java.lang.String r0 = "unexpected"
            top.suzhelan.qstory.hook.item.C5925.m11311(r0)
            return r13
        L8f:
            if (r7 == 0) goto L9e
            r1.m10387()
            java.lang.Throwable r0 = r15.m10246()
            kotlinx.coroutines.channels.飘花落叶言子楪苏兰世哲 r1 = new kotlinx.coroutines.channels.飘花落叶言子楪苏兰世哲
            r1.<init>(r0)
            return r1
        L9e:
            boolean r3 = r6 instanceof kotlinx.coroutines.InterfaceC5412
            if (r3 == 0) goto La5
            r13 = r6
            kotlinx.coroutines.飘花落叶言子哲世兰苏楪 r13 = (kotlinx.coroutines.InterfaceC5412) r13
        La5:
            if (r13 == 0) goto Lac
            int r12 = r2 + r9
            r13.mo10263(r1, r12)
        Lac:
            long r3 = r1.f14944
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.m10261(r3)
        Lb4:
            return r8
        Lb5:
            r1.m10357()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C5206.m10284(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.C5190
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final void mo10232(InterfaceC5368 interfaceC5368, Object obj) {
        Object objM10284 = m10284(obj, false);
        if (!(objM10284 instanceof C5210)) {
            interfaceC5368.mo10411(C5176.f14739);
        } else if (objM10284 instanceof C5209) {
            interfaceC5368.mo10411(AbstractC5189.f14763);
        } else {
            C5925.m11311("unreachable");
        }
    }

    @Override // kotlinx.coroutines.channels.C5190, kotlinx.coroutines.channels.InterfaceC5200
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final Object mo8433(Object obj, InterfaceC4357 interfaceC4357) throws Throwable {
        if (m10284(obj, true) instanceof C5209) {
            throw m10246();
        }
        return C5176.f14739;
    }

    @Override // kotlinx.coroutines.channels.C5190
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final boolean mo10240() {
        return this.f14793 == BufferOverflow.DROP_OLDEST;
    }

    @Override // kotlinx.coroutines.channels.C5190, kotlinx.coroutines.channels.InterfaceC5200
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final Object mo8436(Object obj) {
        return m10284(obj, false);
    }
}
