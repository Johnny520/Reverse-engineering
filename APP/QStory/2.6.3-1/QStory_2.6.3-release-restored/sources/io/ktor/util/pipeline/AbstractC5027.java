package io.ktor.util.pipeline;

import io.ktor.util.AbstractC5049;
import io.ktor.util.C5036;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p050.AbstractC7176;
import p068.InterfaceC7380;

/* JADX INFO: renamed from: io.ktor.util.pipeline.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5027 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C5024 f13010;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f13011;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f13012;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f13013;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5036 f13014 = AbstractC5049.m9186(true);
    private volatile /* synthetic */ Object _interceptors = null;

    public AbstractC5027(C5024... c5024Arr) {
        this.f13012 = AbstractC7176.m12475(Arrays.copyOf(c5024Arr, c5024Arr.length));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5028 m9131(C5024 c5024) {
        ArrayList arrayList = this.f13012;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == c5024) {
                C5028 c5028 = new C5028(c5024, C5034.f13034);
                arrayList.set(i, c5028);
                return c5028;
            }
            if (obj instanceof C5028) {
                C5028 c50282 = (C5028) obj;
                if (c50282.f13019 == c5024) {
                    return c50282;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m9132(AbstractC5027 abstractC5027) {
        ArrayList arrayList = this.f13012;
        if (abstractC5027.f13012.isEmpty()) {
            return true;
        }
        int i = 0;
        if (!arrayList.isEmpty()) {
            return false;
        }
        ArrayList arrayList2 = abstractC5027.f13012;
        int iM12460 = AbstractC7176.m12460(arrayList2);
        if (iM12460 >= 0) {
            while (true) {
                Object obj = arrayList2.get(i);
                if (obj instanceof C5024) {
                    arrayList.add(obj);
                } else if (obj instanceof C5028) {
                    C5028 c5028 = (C5028) obj;
                    C5024 c5024 = c5028.f13019;
                    AbstractC5754 abstractC5754 = c5028.f13018;
                    c5028.f13016 = true;
                    arrayList.add(new C5028(c5024, abstractC5754, c5028.f13017));
                }
                if (i == iM12460) {
                    break;
                }
                i++;
            }
        }
        this.f13013 += abstractC5027.f13013;
        this._interceptors = abstractC5027.m9137();
        this.f13011 = true;
        this.f13010 = null;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m9133(Object obj, Object obj2, InterfaceC5189 interfaceC5189) {
        InterfaceC5192 context = interfaceC5189.getContext();
        List listM9137 = m9137();
        boolean zMo9017 = mo9017();
        obj.getClass();
        obj2.getClass();
        context.getClass();
        return ((AbstractC5025.f13008 || zMo9017) ? new C5029(obj, listM9137, obj2, context) : new C5033(obj2, obj, listM9137)).mo9128(obj2, interfaceC5189);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m9134(C5024 c5024, C5024 c50242) throws InvalidPhaseException {
        c5024.getClass();
        c50242.getClass();
        if (m9140(c50242)) {
            return;
        }
        int iM9139 = m9139(c5024);
        if (iM9139 != -1) {
            this.f13012.add(iM9139, new C5028(c50242, new C5030(c5024)));
        } else {
            throw new InvalidPhaseException("Phase " + c5024 + " was not registered for this pipeline");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m9135(C5024 c5024, C5024 c50242) throws InvalidPhaseException {
        AbstractC5754 abstractC5754;
        C5024 c50243;
        c5024.getClass();
        c50242.getClass();
        if (m9140(c50242)) {
            return;
        }
        int iM9139 = m9139(c5024);
        if (iM9139 == -1) {
            throw new InvalidPhaseException("Phase " + c5024 + " was not registered for this pipeline");
        }
        int i = iM9139 + 1;
        ArrayList arrayList = this.f13012;
        int iM12460 = AbstractC7176.m12460(arrayList);
        if (i <= iM12460) {
            while (true) {
                Object obj = arrayList.get(i);
                C5028 c5028 = obj instanceof C5028 ? (C5028) obj : null;
                if (c5028 != null && (abstractC5754 = c5028.f13018) != null) {
                    C5031 c5031 = abstractC5754 instanceof C5031 ? (C5031) abstractC5754 : null;
                    if (c5031 != null && (c50243 = c5031.f13025) != null && c50243 == c5024) {
                        iM9139 = i;
                    }
                    if (i == iM12460) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    break;
                }
            }
        }
        arrayList.add(iM9139 + 1, new C5028(c50242, new C5031(c5024)));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9136(AbstractC5027 abstractC5027) throws InvalidPhaseException {
        Object obj;
        abstractC5027.getClass();
        if (m9132(abstractC5027)) {
            return;
        }
        abstractC5027.getClass();
        ArrayList arrayListM9345 = AbstractC5176.m9345(abstractC5027.f13012);
        while (!arrayListM9345.isEmpty()) {
            Iterator it = arrayListM9345.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C5024 c5024 = next instanceof C5024 ? (C5024) next : null;
                if (c5024 == null) {
                    next.getClass();
                    c5024 = ((C5028) next).f13019;
                }
                if (m9140(c5024)) {
                    it.remove();
                } else {
                    if (next == c5024) {
                        obj = C5034.f13034;
                    } else {
                        next.getClass();
                        obj = ((C5028) next).f13018;
                    }
                    if (obj instanceof C5034) {
                        c5024.getClass();
                        if (!m9140(c5024)) {
                            this.f13012.add(c5024);
                        }
                    } else if (obj instanceof C5030) {
                        C5024 c50242 = ((C5030) obj).f13024;
                        if (m9140(c50242)) {
                            m9134(c50242, c5024);
                        } else if (obj instanceof C5031) {
                            m9135(((C5031) obj).f13025, c5024);
                        }
                    }
                    it.remove();
                }
            }
        }
        if (this.f13013 == 0) {
            this._interceptors = abstractC5027.m9137();
            this.f13011 = true;
            this.f13010 = null;
        } else {
            this._interceptors = null;
            this.f13011 = false;
            this.f13010 = null;
        }
        for (Object obj2 : abstractC5027.f13012) {
            C5024 c50243 = obj2 instanceof C5024 ? (C5024) obj2 : null;
            if (c50243 == null) {
                obj2.getClass();
                c50243 = ((C5028) obj2).f13019;
            }
            if (obj2 instanceof C5028) {
                C5028 c5028 = (C5028) obj2;
                if (!c5028.f13017.isEmpty()) {
                    C5028 c5028M9131 = m9131(c50243);
                    c5028M9131.getClass();
                    if (!c5028.f13017.isEmpty()) {
                        if (c5028M9131.f13017.isEmpty()) {
                            c5028.f13016 = true;
                            c5028M9131.f13017 = c5028.f13017;
                            c5028M9131.f13016 = true;
                        } else {
                            if (c5028M9131.f13016) {
                                c5028M9131.f13017 = AbstractC5176.m9345(c5028M9131.f13017);
                                c5028M9131.f13016 = false;
                            }
                            c5028.m9141(c5028M9131.f13017);
                        }
                    }
                    this.f13013 = c5028.f13017.size() + this.f13013;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m9137() {
        int iM12460;
        int iM124602;
        if (((List) this._interceptors) == null) {
            int i = this.f13013;
            if (i == 0) {
                this._interceptors = EmptyList.INSTANCE;
                this.f13011 = false;
                this.f13010 = null;
            } else {
                ArrayList arrayList = this.f13012;
                if (i != 1 || (iM124602 = AbstractC7176.m12460(arrayList)) < 0) {
                    ArrayList arrayList2 = new ArrayList();
                    iM12460 = AbstractC7176.m12460(arrayList);
                    if (iM12460 >= 0) {
                        int i2 = 0;
                        while (true) {
                            Object obj = arrayList.get(i2);
                            C5028 c5028 = obj instanceof C5028 ? (C5028) obj : null;
                            if (c5028 != null) {
                                c5028.m9141(arrayList2);
                            }
                            if (i2 == iM12460) {
                                break;
                            }
                            i2++;
                        }
                    }
                    this._interceptors = arrayList2;
                    this.f13011 = false;
                    this.f13010 = null;
                } else {
                    int i3 = 0;
                    while (true) {
                        Object obj2 = arrayList.get(i3);
                        C5028 c50282 = obj2 instanceof C5028 ? (C5028) obj2 : null;
                        if (c50282 != null && !c50282.f13017.isEmpty()) {
                            List list = c50282.f13017;
                            c50282.f13016 = true;
                            this._interceptors = list;
                            this.f13011 = false;
                            this.f13010 = c50282.f13019;
                            break;
                        }
                        if (i3 == iM124602) {
                            break;
                        }
                        i3++;
                    }
                    ArrayList arrayList22 = new ArrayList();
                    iM12460 = AbstractC7176.m12460(arrayList);
                    if (iM12460 >= 0) {
                    }
                    this._interceptors = arrayList22;
                    this.f13011 = false;
                    this.f13010 = null;
                }
            }
        }
        this.f13011 = true;
        List list2 = (List) this._interceptors;
        list2.getClass();
        return list2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m9138(C5024 c5024, InterfaceC7380 interfaceC7380) throws InvalidPhaseException {
        c5024.getClass();
        C5028 c5028M9131 = m9131(c5024);
        if (c5028M9131 == null) {
            throw new InvalidPhaseException("Phase " + c5024 + " was not registered for this pipeline");
        }
        List list = (List) this._interceptors;
        if (!this.f13012.isEmpty() && list != null && !this.f13011 && AbstractC5220.m9452(list)) {
            if (AbstractC5227.m9466(this.f13010, c5024)) {
                list.add(interfaceC7380);
            } else if (c5024 == AbstractC5176.m9367(this.f13012) || m9139(c5024) == AbstractC7176.m12460(this.f13012)) {
                C5028 c5028M91312 = m9131(c5024);
                c5028M91312.getClass();
                if (c5028M91312.f13016) {
                    c5028M91312.f13017 = AbstractC5176.m9345(c5028M91312.f13017);
                    c5028M91312.f13016 = false;
                }
                c5028M91312.f13017.add(interfaceC7380);
                list.add(interfaceC7380);
            }
            this.f13013++;
            return;
        }
        if (c5028M9131.f13016) {
            c5028M9131.f13017 = AbstractC5176.m9345(c5028M9131.f13017);
            c5028M9131.f13016 = false;
        }
        c5028M9131.f13017.add(interfaceC7380);
        this.f13013++;
        this._interceptors = null;
        this.f13011 = false;
        this.f13010 = null;
        mo9094();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m9139(C5024 c5024) {
        ArrayList arrayList = this.f13012;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == c5024 || ((obj instanceof C5028) && ((C5028) obj).f13019 == c5024)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m9140(C5024 c5024) {
        ArrayList arrayList = this.f13012;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == c5024) {
                return true;
            }
            if ((obj instanceof C5028) && ((C5028) obj).f13019 == c5024) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract boolean mo9017();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo9094() {
    }
}
