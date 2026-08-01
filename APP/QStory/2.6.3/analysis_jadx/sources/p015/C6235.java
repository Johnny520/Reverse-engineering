package p015;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p011.C6208;
import p013.AbstractC6230;
import p052.InterfaceC6543;
import p251.AbstractC8175;

/* JADX INFO: renamed from: 飘花落叶言世兰楪苏哲子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6235 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f17186;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f17187 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC6236 f17188;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f17189;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17190;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6234 f17191;

    public C6235(C6234 c6234, String str) {
        this.f17191 = c6234;
        this.f17190 = str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m11712(C6235 c6235, String str, InterfaceC6543 interfaceC6543) {
        c6235.getClass();
        str.getClass();
        interfaceC6543.getClass();
        c6235.m11715(new C6208(str, interfaceC6543), 0L);
    }

    public final String toString() {
        return this.f17190;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m11713() {
        C6234 c6234 = this.f17191;
        TimeZone timeZone = AbstractC6230.f17167;
        synchronized (c6234) {
            this.f17189 = true;
            if (m11716()) {
                this.f17191.m11710(this);
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
    public final boolean m11714(p015.AbstractC6236 r12, long r13, boolean r15) {
        /*
            r11 = this;
            飘花落叶言世兰楪苏哲子.飘花落叶言子楪世哲苏兰 r0 = r11.f17191
            java.util.logging.Logger r0 = r0.f17180
            r12.getClass()
            飘花落叶言世兰楪苏哲子.飘花落叶言子楪世苏兰哲 r1 = r12.f17193
            r2 = 0
            if (r1 != r11) goto Ld
            goto L11
        Ld:
            if (r1 != 0) goto L88
            r12.f17193 = r11
        L11:
            long r3 = java.lang.System.nanoTime()
            long r5 = r3 + r13
            java.util.ArrayList r1 = r11.f17187
            int r7 = r1.indexOf(r12)
            r8 = -1
            if (r7 == r8) goto L37
            long r9 = r12.f17192
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 > 0) goto L34
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r0.isLoggable(r13)
            if (r13 == 0) goto L87
            java.lang.String r13 = "already scheduled"
            p251.AbstractC8175.m13630(r0, r12, r11, r13)
            return r2
        L34:
            r1.remove(r7)
        L37:
            r12.f17192 = r5
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            boolean r7 = r0.isLoggable(r7)
            if (r7 == 0) goto L5d
            if (r15 == 0) goto L4f
            long r5 = r5 - r3
            java.lang.String r15 = p251.AbstractC8175.m13643(r5)
            java.lang.String r5 = "run again after "
            java.lang.String r15 = r5.concat(r15)
            goto L5a
        L4f:
            long r5 = r5 - r3
            java.lang.String r15 = p251.AbstractC8175.m13643(r5)
            java.lang.String r5 = "scheduled after "
            java.lang.String r15 = r5.concat(r15)
        L5a:
            p251.AbstractC8175.m13630(r0, r12, r11, r15)
        L5d:
            java.util.Iterator r11 = r1.iterator()
            r15 = r2
        L62:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r11.next()
            飘花落叶言世兰楪苏哲子.飘花落叶言子楪世苏哲兰 r0 = (p015.AbstractC6236) r0
            long r5 = r0.f17192
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
            top.suzhelan.qstory.hook.item.C5925.m11311(r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p015.C6235.m11714(飘花落叶言世兰楪苏哲子.飘花落叶言子楪世苏哲兰, long, boolean):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11715(AbstractC6236 abstractC6236, long j) {
        abstractC6236.getClass();
        synchronized (this.f17191) {
            if (!this.f17189) {
                if (m11714(abstractC6236, j, false)) {
                    this.f17191.m11710(this);
                }
                return;
            }
            boolean z = abstractC6236.f17194;
            Logger logger = this.f17191.f17180;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC8175.m13630(logger, abstractC6236, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC8175.m13630(logger, abstractC6236, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m11716() {
        AbstractC6236 abstractC6236 = this.f17188;
        if (abstractC6236 != null && abstractC6236.f17194) {
            this.f17186 = true;
        }
        ArrayList arrayList = this.f17187;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((AbstractC6236) arrayList.get(size)).f17194) {
                Logger logger = this.f17191.f17180;
                AbstractC6236 abstractC62362 = (AbstractC6236) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    AbstractC8175.m13630(logger, abstractC62362, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }
}
