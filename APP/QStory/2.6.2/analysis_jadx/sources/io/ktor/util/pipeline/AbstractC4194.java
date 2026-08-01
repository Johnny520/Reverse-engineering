package io.ktor.util.pipeline;

import io.ktor.util.AbstractC4216;
import io.ktor.util.C4203;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6550;
import p053.AbstractC6560;
import p253.AbstractC8189;

/* JADX INFO: renamed from: io.ktor.util.pipeline.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4194 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C4191 f12661;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f12662;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f12663;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f12664;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4203 f12665 = AbstractC4216.m8637(true);
    private volatile /* synthetic */ Object _interceptors = null;

    public AbstractC4194(C4191... c4191Arr) {
        this.f12663 = AbstractC8189.m13657(Arrays.copyOf(c4191Arr, c4191Arr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4195 m8582(C4191 c4191) {
        ArrayList arrayList = this.f12663;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == c4191) {
                C4195 c4195 = new C4195(c4191, C4201.f12685);
                arrayList.set(i, c4195);
                return c4195;
            }
            if (obj instanceof C4195) {
                C4195 c41952 = (C4195) obj;
                if (c41952.f12670 == c4191) {
                    return c41952;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m8583(AbstractC4194 abstractC4194) {
        ArrayList arrayList = this.f12663;
        if (abstractC4194.f12663.isEmpty()) {
            return true;
        }
        int i = 0;
        if (!arrayList.isEmpty()) {
            return false;
        }
        ArrayList arrayList2 = abstractC4194.f12663;
        int iM13673 = AbstractC8189.m13673(arrayList2);
        if (iM13673 >= 0) {
            while (true) {
                Object obj = arrayList2.get(i);
                if (obj instanceof C4191) {
                    arrayList.add(obj);
                } else if (obj instanceof C4195) {
                    C4195 c4195 = (C4195) obj;
                    C4191 c4191 = c4195.f12670;
                    AbstractC6560 abstractC6560 = c4195.f12669;
                    c4195.f12667 = true;
                    arrayList.add(new C4195(c4191, abstractC6560, c4195.f12668));
                }
                if (i == iM13673) {
                    break;
                }
                i++;
            }
        }
        this.f12664 += abstractC4194.f12664;
        this._interceptors = abstractC4194.m8588();
        this.f12662 = true;
        this.f12661 = null;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m8584(Object obj, Object obj2, InterfaceC4356 interfaceC4356) {
        InterfaceC4359 context = interfaceC4356.getContext();
        List listM8588 = m8588();
        boolean zMo8468 = mo8468();
        obj.getClass();
        obj2.getClass();
        context.getClass();
        return ((AbstractC4192.f12659 || zMo8468) ? new C4196(obj, listM8588, obj2, context) : new C4200(obj2, obj, listM8588)).mo8579(obj2, interfaceC4356);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m8585(C4191 c4191, C4191 c41912) throws InvalidPhaseException {
        c4191.getClass();
        c41912.getClass();
        if (m8591(c41912)) {
            return;
        }
        int iM8590 = m8590(c4191);
        if (iM8590 != -1) {
            this.f12663.add(iM8590, new C4195(c41912, new C4197(c4191)));
        } else {
            throw new InvalidPhaseException("Phase " + c4191 + " was not registered for this pipeline");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m8586(C4191 c4191, C4191 c41912) throws InvalidPhaseException {
        AbstractC6560 abstractC6560;
        C4191 c41913;
        c4191.getClass();
        c41912.getClass();
        if (m8591(c41912)) {
            return;
        }
        int iM8590 = m8590(c4191);
        if (iM8590 == -1) {
            throw new InvalidPhaseException("Phase " + c4191 + " was not registered for this pipeline");
        }
        int i = iM8590 + 1;
        ArrayList arrayList = this.f12663;
        int iM13673 = AbstractC8189.m13673(arrayList);
        if (i <= iM13673) {
            while (true) {
                Object obj = arrayList.get(i);
                C4195 c4195 = obj instanceof C4195 ? (C4195) obj : null;
                if (c4195 != null && (abstractC6560 = c4195.f12669) != null) {
                    C4198 c4198 = abstractC6560 instanceof C4198 ? (C4198) abstractC6560 : null;
                    if (c4198 != null && (c41913 = c4198.f12676) != null && c41913 == c4191) {
                        iM8590 = i;
                    }
                    if (i == iM13673) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    break;
                }
            }
        }
        arrayList.add(iM8590 + 1, new C4195(c41912, new C4198(c4191)));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8587(io.ktor.util.pipeline.AbstractC4194 r8) throws io.ktor.util.pipeline.InvalidPhaseException {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.pipeline.AbstractC4194.m8587(io.ktor.util.pipeline.飘花落叶言子楪世哲苏兰):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m8588() {
        /*
            r9 = this;
            java.lang.Object r0 = r9._interceptors
            java.util.List r0 = (java.util.List) r0
            r1 = 1
            if (r0 != 0) goto L74
            int r0 = r9.f12664
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L17
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
            r9._interceptors = r0
            r9.f12662 = r2
            r9.f12661 = r3
            goto L74
        L17:
            java.util.ArrayList r4 = r9.f12663
            if (r0 != r1) goto L4b
            int r0 = p253.AbstractC8189.m13673(r4)
            if (r0 < 0) goto L4b
            r5 = r2
        L22:
            java.lang.Object r6 = r4.get(r5)
            boolean r7 = r6 instanceof io.ktor.util.pipeline.C4195
            if (r7 == 0) goto L2d
            io.ktor.util.pipeline.飘花落叶言子楪世苏兰哲 r6 = (io.ktor.util.pipeline.C4195) r6
            goto L2e
        L2d:
            r6 = r3
        L2e:
            if (r6 != 0) goto L31
            goto L46
        L31:
            java.util.List r7 = r6.f12668
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L46
            java.util.List r0 = r6.f12668
            r6.f12667 = r1
            r9._interceptors = r0
            r9.f12662 = r2
            io.ktor.util.pipeline.飘花落叶言子楪世兰哲苏 r0 = r6.f12670
            r9.f12661 = r0
            goto L74
        L46:
            if (r5 == r0) goto L4b
            int r5 = r5 + 1
            goto L22
        L4b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r5 = p253.AbstractC8189.m13673(r4)
            if (r5 < 0) goto L6e
            r6 = r2
        L57:
            java.lang.Object r7 = r4.get(r6)
            boolean r8 = r7 instanceof io.ktor.util.pipeline.C4195
            if (r8 == 0) goto L62
            io.ktor.util.pipeline.飘花落叶言子楪世苏兰哲 r7 = (io.ktor.util.pipeline.C4195) r7
            goto L63
        L62:
            r7 = r3
        L63:
            if (r7 != 0) goto L66
            goto L69
        L66:
            r7.m8592(r0)
        L69:
            if (r6 == r5) goto L6e
            int r6 = r6 + 1
            goto L57
        L6e:
            r9._interceptors = r0
            r9.f12662 = r2
            r9.f12661 = r3
        L74:
            r9.f12662 = r1
            java.lang.Object r9 = r9._interceptors
            java.util.List r9 = (java.util.List) r9
            r9.getClass()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.pipeline.AbstractC4194.m8588():java.util.List");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m8589(C4191 c4191, InterfaceC6550 interfaceC6550) throws InvalidPhaseException {
        c4191.getClass();
        C4195 c4195M8582 = m8582(c4191);
        if (c4195M8582 == null) {
            throw new InvalidPhaseException("Phase " + c4191 + " was not registered for this pipeline");
        }
        List list = (List) this._interceptors;
        if (!this.f12663.isEmpty() && list != null && !this.f12662 && AbstractC4387.m8903(list)) {
            if (AbstractC4394.m8917(this.f12661, c4191)) {
                list.add(interfaceC6550);
            } else if (c4191 == AbstractC4343.m8811(this.f12663) || m8590(c4191) == AbstractC8189.m13673(this.f12663)) {
                C4195 c4195M85822 = m8582(c4191);
                c4195M85822.getClass();
                if (c4195M85822.f12667) {
                    c4195M85822.f12668 = AbstractC4343.m8799(c4195M85822.f12668);
                    c4195M85822.f12667 = false;
                }
                c4195M85822.f12668.add(interfaceC6550);
                list.add(interfaceC6550);
            }
            this.f12664++;
            return;
        }
        if (c4195M8582.f12667) {
            c4195M8582.f12668 = AbstractC4343.m8799(c4195M8582.f12668);
            c4195M8582.f12667 = false;
        }
        c4195M8582.f12668.add(interfaceC6550);
        this.f12664++;
        this._interceptors = null;
        this.f12662 = false;
        this.f12661 = null;
        mo8545();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m8590(C4191 c4191) {
        ArrayList arrayList = this.f12663;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == c4191 || ((obj instanceof C4195) && ((C4195) obj).f12670 == c4191)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m8591(C4191 c4191) {
        ArrayList arrayList = this.f12663;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == c4191) {
                return true;
            }
            if ((obj instanceof C4195) && ((C4195) obj).f12670 == c4191) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract boolean mo8468();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo8545() {
    }
}
