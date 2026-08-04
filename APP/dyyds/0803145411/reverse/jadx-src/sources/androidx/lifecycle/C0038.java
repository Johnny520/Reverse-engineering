package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import yyds.AbstractC2104;
import yyds.AbstractC2353;
import yyds.C0188;
import yyds.C0500;
import yyds.C1461;
import yyds.C1702;
import yyds.C1798;
import yyds.C2201;
import yyds.C2598;
import yyds.C2704;
import yyds.EnumC0637;
import yyds.EnumC1464;
import yyds.InterfaceC0623;
import yyds.InterfaceC0657;
import yyds.InterfaceC0679;
import yyds.InterfaceC2159;
import yyds.InterfaceC2345;

/* JADX INFO: renamed from: androidx.lifecycle.ᛲᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0038 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f311;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public C2201 f312;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public EnumC1464 f313;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final ArrayList f314;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final WeakReference f315;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f316;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f317;

    public C0038(InterfaceC2345 interfaceC2345) {
        new AtomicReference();
        this.f312 = new C2201();
        this.f313 = EnumC1464.f6971;
        this.f314 = new ArrayList();
        this.f315 = new WeakReference(interfaceC2345);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r11.f316 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m120() {
        EnumC1464 enumC1464;
        EnumC1464 enumC14642;
        InterfaceC2345 interfaceC2345 = (InterfaceC2345) this.f315.get();
        if (interfaceC2345 == null) {
            C0188.m800("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            C2201 c2201 = this.f312;
            if (c2201.f2167 == 0 || ((enumC1464 = ((C0500) c2201.f2166.f12796).f2437) == (enumC14642 = ((C0500) c2201.f2168.f12796).f2437) && this.f313 == enumC14642)) {
                break;
            }
            this.f316 = false;
            int iCompareTo = this.f313.compareTo(enumC1464);
            ArrayList arrayList = this.f314;
            if (iCompareTo < 0) {
                C2201 c22012 = this.f312;
                C1702 c1702 = new C1702(c22012.f2168, c22012.f2166, 1);
                c22012.f2165.put(c1702, Boolean.FALSE);
                while (c1702.hasNext() && !this.f316) {
                    Map.Entry entry = (Map.Entry) c1702.next();
                    InterfaceC0623 interfaceC0623 = (InterfaceC0623) entry.getKey();
                    C0500 c0500 = (C0500) entry.getValue();
                    while (c0500.f2437.compareTo(this.f313) > 0 && !this.f316 && this.f312.f10859.containsKey(interfaceC0623)) {
                        C1461 c1461 = EnumC0637.Companion;
                        EnumC1464 enumC14643 = c0500.f2437;
                        c1461.getClass();
                        int iOrdinal = enumC14643.ordinal();
                        EnumC0637 enumC0637 = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : EnumC0637.ON_PAUSE : EnumC0637.ON_STOP : EnumC0637.ON_DESTROY;
                        if (enumC0637 == null) {
                            C0188.m796(c0500.f2437, "no event down from ");
                            return;
                        } else {
                            arrayList.add(enumC0637.m1528());
                            c0500.m1349(interfaceC2345, enumC0637);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            }
            C2598 c2598 = this.f312.f2168;
            if (!this.f316 && c2598 != null && this.f313.compareTo(((C0500) c2598.f12796).f2437) > 0) {
                C2201 c22013 = this.f312;
                C2704 c2704 = new C2704(c22013);
                c22013.f2165.put(c2704, Boolean.FALSE);
                while (c2704.hasNext() && !this.f316) {
                    Map.Entry entry2 = (Map.Entry) c2704.next();
                    InterfaceC0623 interfaceC06232 = (InterfaceC0623) entry2.getKey();
                    C0500 c05002 = (C0500) entry2.getValue();
                    while (c05002.f2437.compareTo(this.f313) < 0 && !this.f316 && this.f312.f10859.containsKey(interfaceC06232)) {
                        arrayList.add(c05002.f2437);
                        C1461 c14612 = EnumC0637.Companion;
                        EnumC1464 enumC14644 = c05002.f2437;
                        c14612.getClass();
                        int iOrdinal2 = enumC14644.ordinal();
                        EnumC0637 enumC06372 = iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : EnumC0637.ON_RESUME : EnumC0637.ON_START : EnumC0637.ON_CREATE;
                        if (enumC06372 == null) {
                            C0188.m796(c05002.f2437, "no event up from ");
                            return;
                        } else {
                            c05002.m1349(interfaceC2345, enumC06372);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m121(EnumC1464 enumC1464) {
        EnumC1464 enumC14642 = this.f313;
        if (enumC14642 == enumC1464) {
            return;
        }
        EnumC1464 enumC14643 = EnumC1464.f6971;
        EnumC1464 enumC14644 = EnumC1464.f6969;
        if (enumC14642 == enumC14643 && enumC1464 == enumC14644) {
            StringBuilder sb = new StringBuilder("no event down from ");
            sb.append(this.f313);
            Object obj = this.f315.get();
            sb.append(" in component ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.f313 = enumC1464;
        if (this.f311 || this.f317 != 0) {
            this.f316 = true;
            return;
        }
        this.f311 = true;
        m120();
        this.f311 = false;
        if (this.f313 == enumC14644) {
            this.f312 = new C2201();
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m122(InterfaceC0623 interfaceC0623) {
        InterfaceC0657 reflectiveGenericLifecycleObserver;
        Object obj;
        InterfaceC2345 interfaceC2345;
        m125("addObserver");
        EnumC1464 enumC1464 = this.f313;
        EnumC1464 enumC14642 = EnumC1464.f6969;
        if (enumC1464 != enumC14642) {
            enumC14642 = EnumC1464.f6971;
        }
        C0500 c0500 = new C0500();
        HashMap map = AbstractC2353.f11563;
        boolean z = interfaceC0623 instanceof InterfaceC0657;
        boolean z2 = interfaceC0623 instanceof InterfaceC2159;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC2159) interfaceC0623, (InterfaceC0657) interfaceC0623);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC2159) interfaceC0623, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (InterfaceC0657) interfaceC0623;
        } else {
            Class<?> cls = interfaceC0623.getClass();
            if (AbstractC2353.m4377(cls) == 2) {
                List list = (List) AbstractC2353.f11564.get(cls);
                if (list.size() == 1) {
                    AbstractC2353.m4376((Constructor) list.get(0), interfaceC0623);
                    throw null;
                }
                int size = list.size();
                InterfaceC0679[] interfaceC0679Arr = new InterfaceC0679[size];
                if (size > 0) {
                    AbstractC2353.m4376((Constructor) list.get(0), interfaceC0623);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0679Arr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC0623);
            }
        }
        c0500.f2438 = reflectiveGenericLifecycleObserver;
        c0500.f2437 = enumC14642;
        C2201 c2201 = this.f312;
        C2598 c2598Mo1181 = c2201.mo1181(interfaceC0623);
        if (c2598Mo1181 != null) {
            obj = c2598Mo1181.f12796;
        } else {
            HashMap map2 = c2201.f10859;
            C2598 c2598 = new C2598(interfaceC0623, c0500);
            c2201.f2167++;
            C2598 c25982 = c2201.f2168;
            if (c25982 == null) {
                c2201.f2166 = c2598;
                c2201.f2168 = c2598;
            } else {
                c25982.f12793 = c2598;
                c2598.f12795 = c25982;
                c2201.f2168 = c2598;
            }
            map2.put(interfaceC0623, c2598);
            obj = null;
        }
        if (((C0500) obj) == null && (interfaceC2345 = (InterfaceC2345) this.f315.get()) != null) {
            boolean z3 = this.f317 != 0 || this.f311;
            EnumC1464 enumC1464M123 = m123(interfaceC0623);
            this.f317++;
            while (c0500.f2437.compareTo(enumC1464M123) < 0 && this.f312.f10859.containsKey(interfaceC0623)) {
                EnumC1464 enumC14643 = c0500.f2437;
                ArrayList arrayList = this.f314;
                arrayList.add(enumC14643);
                C1461 c1461 = EnumC0637.Companion;
                EnumC1464 enumC14644 = c0500.f2437;
                c1461.getClass();
                int iOrdinal = enumC14644.ordinal();
                EnumC0637 enumC0637 = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : EnumC0637.ON_RESUME : EnumC0637.ON_START : EnumC0637.ON_CREATE;
                if (enumC0637 == null) {
                    C0188.m796(c0500.f2437, "no event up from ");
                    return;
                } else {
                    c0500.m1349(interfaceC2345, enumC0637);
                    arrayList.remove(arrayList.size() - 1);
                    enumC1464M123 = m123(interfaceC0623);
                }
            }
            if (!z3) {
                m120();
            }
            this.f317--;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final EnumC1464 m123(InterfaceC0623 interfaceC0623) {
        HashMap map = this.f312.f10859;
        C2598 c2598 = map.containsKey(interfaceC0623) ? ((C2598) map.get(interfaceC0623)).f12795 : null;
        EnumC1464 enumC1464 = c2598 != null ? ((C0500) c2598.f12796).f2437 : null;
        ArrayList arrayList = this.f314;
        EnumC1464 enumC14642 = arrayList.isEmpty() ? null : (EnumC1464) arrayList.get(arrayList.size() - 1);
        EnumC1464 enumC14643 = this.f313;
        if (enumC1464 == null || enumC1464.compareTo(enumC14643) >= 0) {
            enumC1464 = enumC14643;
        }
        return (enumC14642 == null || enumC14642.compareTo(enumC1464) >= 0) ? enumC1464 : enumC14642;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m124(EnumC1464 enumC1464) {
        m125("setCurrentState");
        m121(enumC1464);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m125(String str) {
        C1798.m3577().getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC2104.m4014("Method ", str, " must be called on the main thread").toString());
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m126(InterfaceC0623 interfaceC0623) {
        m125("removeObserver");
        this.f312.mo1182(interfaceC0623);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m127(EnumC0637 enumC0637) {
        m125("handleLifecycleEvent");
        m121(enumC0637.m1528());
    }
}
