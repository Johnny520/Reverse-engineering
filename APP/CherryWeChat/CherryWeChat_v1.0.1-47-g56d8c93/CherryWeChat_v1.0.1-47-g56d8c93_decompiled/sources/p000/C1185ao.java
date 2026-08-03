package p000;

import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ao */
/* JADX INFO: loaded from: classes.dex */
public final class C1185ao extends AbstractC0760Rn {

    /* JADX INFO: renamed from: a */
    public final boolean f4062a;

    /* JADX INFO: renamed from: b */
    public C1414fh f4063b;

    /* JADX INFO: renamed from: c */
    public EnumC0675Pn f4064c;

    /* JADX INFO: renamed from: d */
    public final WeakReference f4065d;

    /* JADX INFO: renamed from: e */
    public int f4066e;

    /* JADX INFO: renamed from: f */
    public boolean f4067f;

    /* JADX INFO: renamed from: g */
    public boolean f4068g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f4069h;

    /* JADX INFO: renamed from: i */
    public final C1115Zy f4070i;

    public C1185ao(InterfaceC1061Yn interfaceC1061Yn) {
        new AtomicReference();
        this.f4062a = true;
        this.f4063b = new C1414fh();
        EnumC0675Pn enumC0675Pn = EnumC0675Pn.f2148b;
        this.f4064c = enumC0675Pn;
        this.f4069h = new ArrayList();
        this.f4065d = new WeakReference(interfaceC1061Yn);
        this.f4070i = new C1115Zy(enumC0675Pn);
    }

    @Override // p000.AbstractC0760Rn
    /* JADX INFO: renamed from: a */
    public final void mo1555a(InterfaceC1018Xn interfaceC1018Xn) {
        InterfaceC0889Un c1366ed;
        Object obj;
        InterfaceC1061Yn interfaceC1061Yn;
        m2275d("addObserver");
        EnumC0675Pn enumC0675Pn = this.f4064c;
        EnumC0675Pn enumC0675Pn2 = EnumC0675Pn.f2147a;
        if (enumC0675Pn != enumC0675Pn2) {
            enumC0675Pn2 = EnumC0675Pn.f2148b;
        }
        C1104Zn c1104Zn = new C1104Zn();
        HashMap map = AbstractC1272co.f4333a;
        boolean z = interfaceC1018Xn instanceof InterfaceC0889Un;
        boolean z2 = interfaceC1018Xn instanceof DefaultLifecycleObserver;
        int i = 2;
        Object obj2 = null;
        if (z && z2) {
            c1366ed = new C1366ed(i, (DefaultLifecycleObserver) interfaceC1018Xn, (InterfaceC0889Un) interfaceC1018Xn);
        } else if (z2) {
            c1366ed = new C1366ed(i, (DefaultLifecycleObserver) interfaceC1018Xn, obj2);
        } else if (z) {
            c1366ed = (InterfaceC0889Un) interfaceC1018Xn;
        } else {
            Class<?> cls = interfaceC1018Xn.getClass();
            if (AbstractC1272co.m2411b(cls) == 2) {
                List list = (List) AbstractC1272co.f4334b.get(cls);
                if (list.size() == 1) {
                    AbstractC1272co.m2410a((Constructor) list.get(0), interfaceC1018Xn);
                    throw null;
                }
                int size = list.size();
                InterfaceC2462rj[] interfaceC2462rjArr = new InterfaceC2462rj[size];
                if (size > 0) {
                    AbstractC1272co.m2410a((Constructor) list.get(0), interfaceC1018Xn);
                    throw null;
                }
                c1366ed = new C1297cv(i, interfaceC2462rjArr);
            } else {
                c1366ed = new C1366ed(interfaceC1018Xn);
            }
        }
        c1104Zn.f3497b = c1366ed;
        c1104Zn.f3496a = enumC0675Pn2;
        C1414fh c1414fh = this.f4063b;
        C0898Uw c0898UwMo1943a = c1414fh.mo1943a(interfaceC1018Xn);
        if (c0898UwMo1943a != null) {
            obj = c0898UwMo1943a.f2792b;
        } else {
            HashMap map2 = c1414fh.f4996e;
            C0898Uw c0898Uw = new C0898Uw(interfaceC1018Xn, c1104Zn);
            c1414fh.f3272d++;
            C0898Uw c0898Uw2 = c1414fh.f3270b;
            if (c0898Uw2 == null) {
                c1414fh.f3269a = c0898Uw;
                c1414fh.f3270b = c0898Uw;
            } else {
                c0898Uw2.f2793c = c0898Uw;
                c0898Uw.f2794d = c0898Uw2;
                c1414fh.f3270b = c0898Uw;
            }
            map2.put(interfaceC1018Xn, c0898Uw);
            obj = null;
        }
        if (((C1104Zn) obj) == null && (interfaceC1061Yn = (InterfaceC1061Yn) this.f4065d.get()) != null) {
            i = (this.f4066e != 0 || this.f4067f) ? 1 : 0;
            EnumC0675Pn enumC0675PnM2274c = m2274c(interfaceC1018Xn);
            this.f4066e++;
            while (c1104Zn.f3496a.compareTo(enumC0675PnM2274c) < 0 && this.f4063b.f4996e.containsKey(interfaceC1018Xn)) {
                EnumC0675Pn enumC0675Pn3 = c1104Zn.f3496a;
                ArrayList arrayList = this.f4069h;
                arrayList.add(enumC0675Pn3);
                C0546Mn c0546Mn = EnumC0632On.Companion;
                EnumC0675Pn enumC0675Pn4 = c1104Zn.f3496a;
                c0546Mn.getClass();
                int iOrdinal = enumC0675Pn4.ordinal();
                EnumC0632On enumC0632On = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : EnumC0632On.ON_RESUME : EnumC0632On.ON_START : EnumC0632On.ON_CREATE;
                if (enumC0632On == null) {
                    throw new IllegalStateException("no event up from " + c1104Zn.f3496a);
                }
                c1104Zn.m2028a(interfaceC1061Yn, enumC0632On);
                arrayList.remove(arrayList.size() - 1);
                enumC0675PnM2274c = m2274c(interfaceC1018Xn);
            }
            if (i == 0) {
                m2278g();
            }
            this.f4066e--;
        }
    }

    @Override // p000.AbstractC0760Rn
    /* JADX INFO: renamed from: b */
    public final void mo1556b(InterfaceC1018Xn interfaceC1018Xn) {
        m2275d("removeObserver");
        this.f4063b.mo1944b(interfaceC1018Xn);
    }

    /* JADX INFO: renamed from: c */
    public final EnumC0675Pn m2274c(InterfaceC1018Xn interfaceC1018Xn) {
        C1104Zn c1104Zn;
        HashMap map = this.f4063b.f4996e;
        C0898Uw c0898Uw = map.containsKey(interfaceC1018Xn) ? ((C0898Uw) map.get(interfaceC1018Xn)).f2794d : null;
        EnumC0675Pn enumC0675Pn = (c0898Uw == null || (c1104Zn = (C1104Zn) c0898Uw.f2792b) == null) ? null : c1104Zn.f3496a;
        ArrayList arrayList = this.f4069h;
        EnumC0675Pn enumC0675Pn2 = arrayList.isEmpty() ? null : (EnumC0675Pn) arrayList.get(arrayList.size() - 1);
        EnumC0675Pn enumC0675Pn3 = this.f4064c;
        if (enumC0675Pn == null || enumC0675Pn.compareTo(enumC0675Pn3) >= 0) {
            enumC0675Pn = enumC0675Pn3;
        }
        return (enumC0675Pn2 == null || enumC0675Pn2.compareTo(enumC0675Pn) >= 0) ? enumC0675Pn : enumC0675Pn2;
    }

    /* JADX INFO: renamed from: d */
    public final void m2275d(String str) {
        if (this.f4062a) {
            C0005A4.m2X().f3f.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC2374ph.m4814k("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2276e(EnumC0632On enumC0632On) {
        m2275d("handleLifecycleEvent");
        m2277f(enumC0632On.m1254a());
    }

    /* JADX INFO: renamed from: f */
    public final void m2277f(EnumC0675Pn enumC0675Pn) {
        EnumC0675Pn enumC0675Pn2 = this.f4064c;
        if (enumC0675Pn2 == enumC0675Pn) {
            return;
        }
        EnumC0675Pn enumC0675Pn3 = EnumC0675Pn.f2148b;
        EnumC0675Pn enumC0675Pn4 = EnumC0675Pn.f2147a;
        if (enumC0675Pn2 == enumC0675Pn3 && enumC0675Pn == enumC0675Pn4) {
            throw new IllegalStateException(("no event down from " + this.f4064c + " in component " + this.f4065d.get()).toString());
        }
        this.f4064c = enumC0675Pn;
        if (this.f4067f || this.f4066e != 0) {
            this.f4068g = true;
            return;
        }
        this.f4067f = true;
        m2278g();
        this.f4067f = false;
        if (this.f4064c == enumC0675Pn4) {
            this.f4063b = new C1414fh();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r11.f4068g = false;
        r11.f4070i.m2031D(r11.f4064c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2278g() {
        EnumC0675Pn enumC0675Pn;
        EnumC0675Pn enumC0675Pn2;
        InterfaceC1061Yn interfaceC1061Yn = (InterfaceC1061Yn) this.f4065d.get();
        if (interfaceC1061Yn == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C1414fh c1414fh = this.f4063b;
            if (c1414fh.f3272d == 0 || ((enumC0675Pn = ((C1104Zn) c1414fh.f3269a.f2792b).f3496a) == (enumC0675Pn2 = ((C1104Zn) c1414fh.f3270b.f2792b).f3496a) && this.f4064c == enumC0675Pn2)) {
                break;
            }
            this.f4068g = false;
            int iCompareTo = this.f4064c.compareTo(enumC0675Pn);
            ArrayList arrayList = this.f4069h;
            if (iCompareTo < 0) {
                C1414fh c1414fh2 = this.f4063b;
                C0855Tw c0855Tw = new C0855Tw(c1414fh2.f3270b, c1414fh2.f3269a, 1);
                c1414fh2.f3271c.put(c0855Tw, Boolean.FALSE);
                while (c0855Tw.hasNext() && !this.f4068g) {
                    Map.Entry entry = (Map.Entry) c0855Tw.next();
                    InterfaceC1018Xn interfaceC1018Xn = (InterfaceC1018Xn) entry.getKey();
                    C1104Zn c1104Zn = (C1104Zn) entry.getValue();
                    while (c1104Zn.f3496a.compareTo(this.f4064c) > 0 && !this.f4068g && this.f4063b.f4996e.containsKey(interfaceC1018Xn)) {
                        C0546Mn c0546Mn = EnumC0632On.Companion;
                        EnumC0675Pn enumC0675Pn3 = c1104Zn.f3496a;
                        c0546Mn.getClass();
                        int iOrdinal = enumC0675Pn3.ordinal();
                        EnumC0632On enumC0632On = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : EnumC0632On.ON_PAUSE : EnumC0632On.ON_STOP : EnumC0632On.ON_DESTROY;
                        if (enumC0632On == null) {
                            throw new IllegalStateException("no event down from " + c1104Zn.f3496a);
                        }
                        arrayList.add(enumC0632On.m1254a());
                        c1104Zn.m2028a(interfaceC1061Yn, enumC0632On);
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
            }
            C0898Uw c0898Uw = this.f4063b.f3270b;
            if (!this.f4068g && c0898Uw != null && this.f4064c.compareTo(((C1104Zn) c0898Uw.f2792b).f3496a) > 0) {
                C1414fh c1414fh3 = this.f4063b;
                c1414fh3.getClass();
                C0941Vw c0941Vw = new C0941Vw(c1414fh3);
                c1414fh3.f3271c.put(c0941Vw, Boolean.FALSE);
                while (c0941Vw.hasNext() && !this.f4068g) {
                    Map.Entry entry2 = (Map.Entry) c0941Vw.next();
                    InterfaceC1018Xn interfaceC1018Xn2 = (InterfaceC1018Xn) entry2.getKey();
                    C1104Zn c1104Zn2 = (C1104Zn) entry2.getValue();
                    while (c1104Zn2.f3496a.compareTo(this.f4064c) < 0 && !this.f4068g && this.f4063b.f4996e.containsKey(interfaceC1018Xn2)) {
                        arrayList.add(c1104Zn2.f3496a);
                        C0546Mn c0546Mn2 = EnumC0632On.Companion;
                        EnumC0675Pn enumC0675Pn4 = c1104Zn2.f3496a;
                        c0546Mn2.getClass();
                        int iOrdinal2 = enumC0675Pn4.ordinal();
                        EnumC0632On enumC0632On2 = iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : EnumC0632On.ON_RESUME : EnumC0632On.ON_START : EnumC0632On.ON_CREATE;
                        if (enumC0632On2 == null) {
                            throw new IllegalStateException("no event up from " + c1104Zn2.f3496a);
                        }
                        c1104Zn2.m2028a(interfaceC1061Yn, enumC0632On2);
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
            }
        }
    }
}
