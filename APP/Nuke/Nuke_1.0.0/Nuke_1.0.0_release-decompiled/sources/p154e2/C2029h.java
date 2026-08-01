package p154e2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Trace;
import android.util.Log;
import com.bumptech.glide.AbstractC1924f;
import com.bumptech.glide.ComponentCallbacks2C1921c;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import p000A.C0038T0;
import p000A.EnumC0052b0;
import p007B0.AbstractC0208v;
import p007B0.C0211y;
import p029F0.C0363A;
import p058L.C0920W;
import p058L.C0946r;
import p058L.C0949u;
import p058L.EnumC0937i;
import p068N1.C1013c;
import p088R1.C1213n;
import p092S0.C1259L;
import p097T1.C1416e;
import p115X0.C1646u;
import p128a.AbstractC1785a;
import p186k.C2433o;
import p195l2.InterfaceC2504h;

/* JADX INFO: renamed from: e2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2029h implements InterfaceC2504h {

    /* JADX INFO: renamed from: h */
    public static volatile C2029h f6760h;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6761d;

    /* JADX INFO: renamed from: e */
    public boolean f6762e;

    /* JADX INFO: renamed from: f */
    public Object f6763f;

    /* JADX INFO: renamed from: g */
    public final Object f6764g;

    public C2029h() {
        this.f6761d = 5;
        this.f6763f = Collections.newSetFromMap(new WeakHashMap());
        this.f6764g = new HashSet();
    }

    /* JADX INFO: renamed from: b */
    public static String m3723b(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    /* JADX INFO: renamed from: a */
    public boolean m3724a(long j5) {
        Object obj;
        List list = (List) ((C0038T0) this.f6764g).f169e;
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (AbstractC0208v.m315e(((C0211y) obj).f729a, j5)) {
                break;
            }
            i5++;
        }
        C0211y c0211y = (C0211y) obj;
        if (c0211y != null) {
            return c0211y.f736h;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p224q2.InterfaceC2924o m3725c(p252v2.C3352a r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p154e2.C2029h.m3725c(v2.a, boolean):q2.o");
    }

    /* JADX INFO: renamed from: d */
    public EnumC0937i m3726d() {
        C0946r c0946r = (C0946r) this.f6764g;
        int i5 = c0946r.f2975b;
        int i6 = c0946r.f2976c;
        return i5 < i6 ? EnumC0937i.f2937e : i5 > i6 ? EnumC0937i.f2936d : EnumC0937i.f2938f;
    }

    /* JADX INFO: renamed from: e */
    public void m3727e() {
        if (this.f6762e || ((HashSet) this.f6764g).isEmpty()) {
            return;
        }
        C1013c c1013c = (C1013c) this.f6763f;
        C1213n c1213n = (C1213n) c1013c.f3130c;
        boolean z5 = false;
        c1013c.f3128a = ((ConnectivityManager) c1213n.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) c1213n.get()).registerDefaultNetworkCallback((C2028g) c1013c.f3131d);
            z5 = true;
        } catch (RuntimeException e5) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e5);
            }
        }
        this.f6762e = z5;
    }

    /* JADX INFO: renamed from: f */
    public void m3728f() {
        if (this.f6762e) {
            C0920W.m1927b((C0920W) this.f6764g, (C1259L) this.f6763f);
        }
    }

    /* JADX INFO: renamed from: g */
    public long m3729g(C1646u c1646u, long j5, boolean z5, C0363A c0363a) {
        C0920W c0920w = (C0920W) this.f6764g;
        long jM1928c = C0920W.m1928c(c0920w, c1646u, j5, z5, false, c0363a, false);
        if (!C1259L.m2333a(jM1928c, (C1259L) this.f6763f)) {
            this.f6762e = false;
        }
        c0920w.m1942q(C1259L.m2335c(jM1928c) ? EnumC0052b0.f213f : EnumC0052b0.f212e);
        return jM1928c;
    }

    @Override // p195l2.InterfaceC2504h
    public Object get() {
        if (this.f6762e) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        AbstractC1924f.m3494c("Glide registry");
        this.f6762e = true;
        try {
            return AbstractC1924f.m3497i((ComponentCallbacks2C1921c) this.f6763f, (ArrayList) this.f6764g);
        } finally {
            this.f6762e = false;
            Trace.endSection();
        }
    }

    public String toString() {
        switch (this.f6761d) {
            case 2:
                return "SingleSelectionLayout(isStartHandle=" + this.f6762e + ", crossed=" + m3726d() + ", info=\n\t" + ((C0946r) this.f6764g) + ')';
            case 3:
            case 4:
            default:
                return super.toString();
            case 5:
                return super.toString() + "{numRequests=" + ((Set) this.f6763f).size() + ", isPaused=" + this.f6762e + "}";
            case 6:
                return ((Map) this.f6763f).toString();
        }
    }

    public C2029h(C2433o c2433o, C0038T0 c0038t0) {
        this.f6761d = 1;
        this.f6763f = c2433o;
        this.f6764g = c0038t0;
    }

    public C2029h(Map map, boolean z5, List list) {
        this.f6761d = 6;
        this.f6763f = map;
        this.f6762e = z5;
        this.f6764g = list;
    }

    public C2029h(Context context) {
        this.f6761d = 0;
        this.f6764g = new HashSet();
        this.f6763f = new C1013c(new C1213n(new C1416e(context, 9)), new C2026e(this));
    }

    public C2029h(ComponentCallbacks2C1921c componentCallbacks2C1921c, ArrayList arrayList, AbstractC1785a abstractC1785a) {
        this.f6761d = 4;
        this.f6763f = componentCallbacks2C1921c;
        this.f6764g = arrayList;
    }

    public C2029h(boolean z5, C0949u c0949u, C0946r c0946r) {
        this.f6761d = 2;
        this.f6762e = z5;
        this.f6763f = c0949u;
        this.f6764g = c0946r;
    }

    public C2029h(C0920W c0920w) {
        this.f6761d = 3;
        this.f6764g = c0920w;
        this.f6762e = true;
    }
}
