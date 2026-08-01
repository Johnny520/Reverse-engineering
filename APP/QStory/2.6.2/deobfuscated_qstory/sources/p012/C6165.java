package p012;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p017.AbstractC6238;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6165 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f16804;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f16805 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC6167 f16806;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f16807;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f16808;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6164 f16809;

    public C6165(C6164 c6164, String str) {
        this.f16809 = c6164;
        this.f16808 = str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m11590(C6165 c6165, String str, InterfaceC6542 interfaceC6542) {
        c6165.getClass();
        str.getClass();
        interfaceC6542.getClass();
        c6165.m11593(new C6166(str, interfaceC6542), 0L);
    }

    public final String toString() {
        return this.f16808;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m11591() {
        C6164 c6164 = this.f16809;
        TimeZone timeZone = AbstractC6238.f17190;
        synchronized (c6164) {
            this.f16807 = true;
            if (m11594()) {
                this.f16809.m11588(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m11592(p012.AbstractC6167 r12, long r13, boolean r15) {
        /*
            r11 = this;
            飘花落叶言世兰楪哲子苏.飘花落叶言子楪世哲兰苏 r0 = r11.f16809
            java.util.logging.Logger r0 = r0.f16798
            r12.getClass()
            飘花落叶言世兰楪哲子苏.飘花落叶言子楪世哲苏兰 r1 = r12.f16813
            r2 = 0
            if (r1 != r11) goto Ld
            goto L11
        Ld:
            if (r1 != 0) goto L88
            r12.f16813 = r11
        L11:
            long r3 = java.lang.System.nanoTime()
            long r5 = r3 + r13
            java.util.ArrayList r1 = r11.f16805
            int r7 = r1.indexOf(r12)
            r8 = -1
            if (r7 == r8) goto L37
            long r9 = r12.f16812
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 > 0) goto L34
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r0.isLoggable(r13)
            if (r13 == 0) goto L87
            java.lang.String r13 = "already scheduled"
            kotlin.reflect.jvm.internal.types.AbstractC4921.m9887(r0, r12, r11, r13)
            return r2
        L34:
            r1.remove(r7)
        L37:
            r12.f16812 = r5
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            boolean r7 = r0.isLoggable(r7)
            if (r7 == 0) goto L5d
            if (r15 == 0) goto L4f
            long r5 = r5 - r3
            java.lang.String r15 = kotlin.reflect.jvm.internal.types.AbstractC4921.m9899(r5)
            java.lang.String r5 = "run again after "
            java.lang.String r15 = r5.concat(r15)
            goto L5a
        L4f:
            long r5 = r5 - r3
            java.lang.String r15 = kotlin.reflect.jvm.internal.types.AbstractC4921.m9899(r5)
            java.lang.String r5 = "scheduled after "
            java.lang.String r15 = r5.concat(r15)
        L5a:
            kotlin.reflect.jvm.internal.types.AbstractC4921.m9887(r0, r12, r11, r15)
        L5d:
            java.util.Iterator r11 = r1.iterator()
            r15 = r2
        L62:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r11.next()
            飘花落叶言世兰楪哲子苏.飘花落叶言子楪世苏哲兰 r0 = (p012.AbstractC6167) r0
            long r5 = r0.f16812
            long r5 = r5 - r3
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 <= 0) goto L76
            goto L7a
        L76:
            int r15 = r15 + 1
            goto L62
        L79:
            r15 = r8
        L7a:
            if (r15 != r8) goto L80
            int r15 = r1.size()
        L80:
            r1.add(r15, r12)
            if (r15 != 0) goto L87
            r11 = 1
            return r11
        L87:
            return r2
        L88:
            java.lang.String r11 = "task is in multiple queues"
            top.suzhelan.qstory.hook.item.C5919.m11250(r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p012.C6165.m11592(飘花落叶言世兰楪哲子苏.飘花落叶言子楪世苏哲兰, long, boolean):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11593(AbstractC6167 abstractC6167, long j) {
        abstractC6167.getClass();
        synchronized (this.f16809) {
            if (!this.f16807) {
                if (m11592(abstractC6167, j, false)) {
                    this.f16809.m11588(this);
                }
                return;
            }
            boolean z = abstractC6167.f16814;
            Logger logger = this.f16809.f16798;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC4921.m9887(logger, abstractC6167, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC4921.m9887(logger, abstractC6167, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m11594() {
        AbstractC6167 abstractC6167 = this.f16806;
        if (abstractC6167 != null && abstractC6167.f16814) {
            this.f16804 = true;
        }
        ArrayList arrayList = this.f16805;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((AbstractC6167) arrayList.get(size)).f16814) {
                Logger logger = this.f16809.f16798;
                AbstractC6167 abstractC61672 = (AbstractC6167) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC4921.m9887(logger, abstractC61672, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }
}
