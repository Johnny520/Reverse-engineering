package io.ktor.util.pipeline;

import io.ktor.util.AbstractC4217;
import io.ktor.util.C4204;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p034.AbstractC6347;
import p052.InterfaceC6551;

/* JADX INFO: renamed from: io.ktor.util.pipeline.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4195 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C4192 f12665;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f12666;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f12667;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f12668;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4204 f12669 = AbstractC4217.m8627(true);
    private volatile /* synthetic */ Object _interceptors = null;

    public AbstractC4195(C4192... c4192Arr) {
        this.f12667 = AbstractC6347.m11916(Arrays.copyOf(c4192Arr, c4192Arr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4196 m8572(C4192 c4192) {
        ArrayList arrayList = this.f12667;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == c4192) {
                C4196 c4196 = new C4196(c4192, C4202.f12689);
                arrayList.set(i, c4196);
                return c4196;
            }
            if (obj instanceof C4196) {
                C4196 c41962 = (C4196) obj;
                if (c41962.f12674 == c4192) {
                    return c41962;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m8573(AbstractC4195 abstractC4195) {
        ArrayList arrayList = this.f12667;
        if (abstractC4195.f12667.isEmpty()) {
            return true;
        }
        int i = 0;
        if (!arrayList.isEmpty()) {
            return false;
        }
        ArrayList arrayList2 = abstractC4195.f12667;
        int iM11901 = AbstractC6347.m11901(arrayList2);
        if (iM11901 >= 0) {
            while (true) {
                Object obj = arrayList2.get(i);
                if (obj instanceof C4192) {
                    arrayList.add(obj);
                } else if (obj instanceof C4196) {
                    C4196 c4196 = (C4196) obj;
                    C4192 c4192 = c4196.f12674;
                    AbstractC4922 abstractC4922 = c4196.f12673;
                    c4196.f12671 = true;
                    arrayList.add(new C4196(c4192, abstractC4922, c4196.f12672));
                }
                if (i == iM11901) {
                    break;
                }
                i++;
            }
        }
        this.f12668 += abstractC4195.f12668;
        this._interceptors = abstractC4195.m8578();
        this.f12666 = true;
        this.f12665 = null;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m8574(Object obj, Object obj2, InterfaceC4357 interfaceC4357) {
        InterfaceC4360 context = interfaceC4357.getContext();
        List listM8578 = m8578();
        boolean zMo8458 = mo8458();
        obj.getClass();
        obj2.getClass();
        context.getClass();
        return ((AbstractC4193.f12663 || zMo8458) ? new C4197(obj, listM8578, obj2, context) : new C4201(obj2, obj, listM8578)).mo8569(obj2, interfaceC4357);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m8575(C4192 c4192, C4192 c41922) throws InvalidPhaseException {
        c4192.getClass();
        c41922.getClass();
        if (m8581(c41922)) {
            return;
        }
        int iM8580 = m8580(c4192);
        if (iM8580 != -1) {
            this.f12667.add(iM8580, new C4196(c41922, new C4198(c4192)));
        } else {
            throw new InvalidPhaseException("Phase " + c4192 + " was not registered for this pipeline");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m8576(C4192 c4192, C4192 c41922) throws InvalidPhaseException {
        AbstractC4922 abstractC4922;
        C4192 c41923;
        c4192.getClass();
        c41922.getClass();
        if (m8581(c41922)) {
            return;
        }
        int iM8580 = m8580(c4192);
        if (iM8580 == -1) {
            throw new InvalidPhaseException("Phase " + c4192 + " was not registered for this pipeline");
        }
        int i = iM8580 + 1;
        ArrayList arrayList = this.f12667;
        int iM11901 = AbstractC6347.m11901(arrayList);
        if (i <= iM11901) {
            while (true) {
                Object obj = arrayList.get(i);
                C4196 c4196 = obj instanceof C4196 ? (C4196) obj : null;
                if (c4196 != null && (abstractC4922 = c4196.f12673) != null) {
                    C4199 c4199 = abstractC4922 instanceof C4199 ? (C4199) abstractC4922 : null;
                    if (c4199 != null && (c41923 = c4199.f12680) != null && c41923 == c4192) {
                        iM8580 = i;
                    }
                    if (i == iM11901) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    break;
                }
            }
        }
        arrayList.add(iM8580 + 1, new C4196(c41922, new C4199(c4192)));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8577(io.ktor.util.pipeline.AbstractC4195 r8) throws io.ktor.util.pipeline.InvalidPhaseException {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.pipeline.AbstractC4195.m8577(io.ktor.util.pipeline.飘花落叶言子楪世哲苏兰):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m8578() {
        /*
            r9 = this;
            java.lang.Object r0 = r9._interceptors
            java.util.List r0 = (java.util.List) r0
            r1 = 1
            if (r0 != 0) goto L74
            int r0 = r9.f12668
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L17
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
            r9._interceptors = r0
            r9.f12666 = r2
            r9.f12665 = r3
            goto L74
        L17:
            java.util.ArrayList r4 = r9.f12667
            if (r0 != r1) goto L4b
            int r0 = p034.AbstractC6347.m11901(r4)
            if (r0 < 0) goto L4b
            r5 = r2
        L22:
            java.lang.Object r6 = r4.get(r5)
            boolean r7 = r6 instanceof io.ktor.util.pipeline.C4196
            if (r7 == 0) goto L2d
            io.ktor.util.pipeline.飘花落叶言子楪世苏兰哲 r6 = (io.ktor.util.pipeline.C4196) r6
            goto L2e
        L2d:
            r6 = r3
        L2e:
            if (r6 != 0) goto L31
            goto L46
        L31:
            java.util.List r7 = r6.f12672
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L46
            java.util.List r0 = r6.f12672
            r6.f12671 = r1
            r9._interceptors = r0
            r9.f12666 = r2
            io.ktor.util.pipeline.飘花落叶言子楪世兰哲苏 r0 = r6.f12674
            r9.f12665 = r0
            goto L74
        L46:
            if (r5 == r0) goto L4b
            int r5 = r5 + 1
            goto L22
        L4b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r5 = p034.AbstractC6347.m11901(r4)
            if (r5 < 0) goto L6e
            r6 = r2
        L57:
            java.lang.Object r7 = r4.get(r6)
            boolean r8 = r7 instanceof io.ktor.util.pipeline.C4196
            if (r8 == 0) goto L62
            io.ktor.util.pipeline.飘花落叶言子楪世苏兰哲 r7 = (io.ktor.util.pipeline.C4196) r7
            goto L63
        L62:
            r7 = r3
        L63:
            if (r7 != 0) goto L66
            goto L69
        L66:
            r7.m8582(r0)
        L69:
            if (r6 == r5) goto L6e
            int r6 = r6 + 1
            goto L57
        L6e:
            r9._interceptors = r0
            r9.f12666 = r2
            r9.f12665 = r3
        L74:
            r9.f12666 = r1
            java.lang.Object r9 = r9._interceptors
            java.util.List r9 = (java.util.List) r9
            r9.getClass()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.pipeline.AbstractC4195.m8578():java.util.List");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m8579(C4192 c4192, InterfaceC6551 interfaceC6551) throws InvalidPhaseException {
        c4192.getClass();
        C4196 c4196M8572 = m8572(c4192);
        if (c4196M8572 == null) {
            throw new InvalidPhaseException("Phase " + c4192 + " was not registered for this pipeline");
        }
        List list = (List) this._interceptors;
        if (!this.f12667.isEmpty() && list != null && !this.f12666 && AbstractC4388.m8893(list)) {
            if (AbstractC4395.m8907(this.f12665, c4192)) {
                list.add(interfaceC6551);
            } else if (c4192 == AbstractC4344.m8808(this.f12667) || m8580(c4192) == AbstractC6347.m11901(this.f12667)) {
                C4196 c4196M85722 = m8572(c4192);
                c4196M85722.getClass();
                if (c4196M85722.f12671) {
                    c4196M85722.f12672 = AbstractC4344.m8786(c4196M85722.f12672);
                    c4196M85722.f12671 = false;
                }
                c4196M85722.f12672.add(interfaceC6551);
                list.add(interfaceC6551);
            }
            this.f12668++;
            return;
        }
        if (c4196M8572.f12671) {
            c4196M8572.f12672 = AbstractC4344.m8786(c4196M8572.f12672);
            c4196M8572.f12671 = false;
        }
        c4196M8572.f12672.add(interfaceC6551);
        this.f12668++;
        this._interceptors = null;
        this.f12666 = false;
        this.f12665 = null;
        mo8535();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m8580(C4192 c4192) {
        ArrayList arrayList = this.f12667;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == c4192 || ((obj instanceof C4196) && ((C4196) obj).f12674 == c4192)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m8581(C4192 c4192) {
        ArrayList arrayList = this.f12667;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == c4192) {
                return true;
            }
            if ((obj instanceof C4196) && ((C4196) obj).f12674 == c4192) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract boolean mo8458();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo8535() {
    }
}
