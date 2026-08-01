package p016C3;

import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import nuke.data.cipher.NativeCrypto;
import p000A.C0073m;
import p013C0.C0236c;
import p041H0.C0630y0;
import p049I2.SharedPreferencesC0796n;
import p050I3.AbstractC0808h;
import p061L2.C0971k;
import p062L3.C0990d;
import p088R1.C1198H;
import p117X2.AbstractC1665j;
import p191k4.C2475a;
import p214o3.InterfaceC2798a;
import p227r.C2981c0;
import p242t3.AbstractC3214c;
import p242t3.C3213b;
import p242t3.C3216e;
import p242t3.C3219h;
import p242t3.EnumC3212a;
import p248u3.C3338b;
import p248u3.C3343g;
import p248u3.EnumC3345i;

/* JADX INFO: renamed from: C3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0245b {

    /* JADX INFO: renamed from: a */
    public final SharedPreferencesC0796n f819a;

    /* JADX INFO: renamed from: b */
    public final C3219h f820b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f821c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f822d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap.KeySetView f823e;

    public C0245b(SharedPreferencesC0796n sharedPreferencesC0796n) {
        this.f819a = sharedPreferencesC0796n;
        C3213b c3213b = AbstractC3214c.f9996d;
        AbstractC1665j.m2985e(c3213b, "from");
        C3216e c3216e = c3213b.f9997a;
        boolean z5 = c3216e.f10001b;
        String str = c3216e.f10002c;
        String str2 = c3216e.f10003d;
        EnumC3212a enumC3212a = c3216e.f10005f;
        boolean z6 = c3216e.f10004e;
        C2475a c2475a = c3213b.f9998b;
        boolean z7 = c3216e.f10006g;
        if (!AbstractC1665j.m2981a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        C3216e c3216e2 = new C3216e(true, z5, str, str2, z6, enumC3212a, z7);
        AbstractC1665j.m2985e(c2475a, "module");
        this.f820b = new C3219h(c3216e2, c2475a);
        this.f821c = new ConcurrentHashMap();
        this.f822d = new ConcurrentHashMap();
        this.f823e = ConcurrentHashMap.newKeySet();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m447a(String str, boolean z5) {
        AbstractC1665j.m2985e(str, "key");
        String strM449c = m449c(str);
        if (strM449c != null) {
            Boolean bool = strM449c.equals("true") ? Boolean.TRUE : strM449c.equals("false") ? Boolean.FALSE : null;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return z5;
    }

    /* JADX INFO: renamed from: b */
    public final Object m448b(String str, InterfaceC2798a interfaceC2798a, C0990d c0990d) {
        String strM449c = m449c(str);
        if (strM449c == null) {
            return c0990d;
        }
        C3219h c3219h = this.f820b;
        c3219h.getClass();
        AbstractC1665j.m2985e(c3219h, "json");
        AbstractC1665j.m2985e(strM449c, "source");
        C0630y0 c0630y0 = new C0630y0(strM449c, c3219h.f9997a);
        Object objMo5426e = new C3343g(c3219h, EnumC3345i.f10398f, c0630y0, interfaceC2798a.mo1486e()).mo5426e(interfaceC2798a);
        if (c0630y0.m1069e() == 10) {
            return objMo5426e;
        }
        C0630y0.m1064l(c0630y0, "Expected EOF after parsing, but had " + ((String) c0630y0.f2004g).charAt(c0630y0.f1999b - 1) + " instead", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final String m449c(String str) {
        ConcurrentHashMap concurrentHashMap = this.f821c;
        String str2 = (String) concurrentHashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        AtomicBoolean atomicBoolean = AbstractC0808h.f2594a;
        if (AbstractC1665j.m2981a(Looper.myLooper(), Looper.getMainLooper())) {
            if (this.f823e.add(str)) {
                AbstractC0808h.m1409c("confRefresh", new C0073m(1, this, str));
            }
            return null;
        }
        ConcurrentHashMap concurrentHashMap2 = this.f822d;
        String strConfKeyName = (String) concurrentHashMap2.get(str);
        if (strConfKeyName == null) {
            AbstractC1665j.m2985e(str, "key");
            strConfKeyName = NativeCrypto.INSTANCE.confKeyName(str);
            concurrentHashMap2.put(str, strConfKeyName);
        }
        String string = this.f819a.getString(strConfKeyName, null);
        if (string == null) {
            return null;
        }
        String strConfDecrypt = NativeCrypto.INSTANCE.confDecrypt(string);
        concurrentHashMap.put(str, strConfDecrypt);
        return strConfDecrypt;
    }

    /* JADX INFO: renamed from: d */
    public final void m450d(String str, Object obj, InterfaceC2798a interfaceC2798a) {
        char[] cArr;
        AbstractC1665j.m2985e(interfaceC2798a, "serializer");
        C3219h c3219h = this.f820b;
        c3219h.getClass();
        C0236c c0236c = new C0236c(6);
        C3338b c3338b = C3338b.f10383f;
        synchronized (c3338b) {
            C0971k c0971k = (C0971k) c3338b.f9814e;
            cArr = null;
            char[] cArr2 = (char[]) (c0971k.isEmpty() ? null : c0971k.removeLast());
            if (cArr2 != null) {
                c3338b.f9813d -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        c0236c.f794f = cArr;
        try {
            new C2981c0(new C1198H(c0236c), c3219h, EnumC3345i.f10398f, new C2981c0[EnumC3345i.f10403k.mo1974a()]).mo5179c(interfaceC2798a, obj);
            String string = c0236c.toString();
            c0236c.m418g();
            m451e(str, string);
        } catch (Throwable th) {
            c0236c.m418g();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m451e(String str, String str2) {
        this.f821c.put(str, str2);
        AtomicBoolean atomicBoolean = AbstractC0808h.f2594a;
        if (AbstractC1665j.m2981a(Looper.myLooper(), Looper.getMainLooper())) {
            AbstractC0808h.m1409c("confPut", new C0244a(this, str, str2, 0));
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.f822d;
        String strConfKeyName = (String) concurrentHashMap.get(str);
        if (strConfKeyName == null) {
            AbstractC1665j.m2985e(str, "key");
            strConfKeyName = NativeCrypto.INSTANCE.confKeyName(str);
            concurrentHashMap.put(str, strConfKeyName);
        }
        AbstractC1665j.m2985e(str2, "plainText");
        this.f819a.putString(strConfKeyName, NativeCrypto.INSTANCE.confEncrypt(str2));
    }
}
