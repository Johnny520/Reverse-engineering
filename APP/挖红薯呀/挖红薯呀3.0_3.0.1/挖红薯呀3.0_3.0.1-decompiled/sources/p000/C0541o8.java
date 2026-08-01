package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.luckypray.dexkit.C0587R;

/* JADX INFO: renamed from: o8 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0541o8 {

    /* JADX INFO: renamed from: d */
    public static volatile C0541o8 f4478d;

    /* JADX INFO: renamed from: e */
    public static final Object f4479e = new Object();

    /* JADX INFO: renamed from: a */
    public Object f4480a;

    /* JADX INFO: renamed from: b */
    public Object f4481b;

    /* JADX INFO: renamed from: c */
    public Object f4482c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0541o8(int i) {
        switch (i) {
            case 3:
                this.f4480a = new C0910x1(8);
                this.f4481b = new C0910x1(8);
                this.f4482c = new C0910x1(8);
                break;
            case 7:
                long[] jArr = dy0.f1212a;
                this.f4480a = new jh0();
                break;
            case 9:
                this.f4480a = new AtomicReference(rd0.f5375n);
                this.f4481b = new Object();
                break;
            case 11:
                this.f4480a = new WeakHashMap();
                this.f4481b = new WeakHashMap();
                this.f4482c = new WeakHashMap();
                break;
            default:
                this.f4482c = new jo0(21);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static C0541o8 m2796g(Context context) {
        if (f4478d == null) {
            synchronized (f4479e) {
                try {
                    if (f4478d == null) {
                        C0541o8 c0541o8 = new C0541o8();
                        c0541o8.f4482c = context.getApplicationContext();
                        c0541o8.f4481b = new HashSet();
                        c0541o8.f4480a = new HashMap();
                        f4478d = c0541o8;
                    }
                } finally {
                }
            }
        }
        return f4478d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m2797a(b60 b60Var, w30 w30Var) {
        C0910x1 c0910x1 = (C0910x1) this.f4480a;
        C0910x1 c0910x12 = (C0910x1) this.f4481b;
        C0910x1 c0910x13 = (C0910x1) this.f4482c;
        int iOrdinal = w30Var.ordinal();
        if (iOrdinal == 0) {
            c0910x1.m5066e(b60Var);
            c0910x13.m5066e(b60Var);
            return;
        }
        if (iOrdinal == 1) {
            c0910x12.m5066e(b60Var);
            c0910x13.m5066e(b60Var);
            return;
        }
        if (iOrdinal == 2) {
            if (b60Var.f413l != null) {
                c0910x13.m5066e(b60Var);
                return;
            } else {
                c0910x1.m5066e(b60Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            C0921xc.m5129j();
        } else if (b60Var.f413l != null) {
            c0910x13.m5066e(b60Var);
        } else {
            c0910x12.m5066e(b60Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public boolean m2798b(b60 b60Var) {
        return !(b60Var.f413l == null) && (((h31) ((C0910x1) this.f4480a).f7232e).contains(b60Var) || ((h31) ((C0910x1) this.f4481b).f7232e).contains(b60Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m2799c(Bundle bundle) {
        HashSet hashSet = (HashSet) this.f4481b;
        String string = ((Context) this.f4482c).getString(C0587R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (t10.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m2800d((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C0725sg(e);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public Object m2800d(Class cls, HashSet hashSet) {
        Object objMo190b;
        HashMap map = (HashMap) this.f4480a;
        if (r81.m3428a()) {
            try {
                g60.m1208g(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objMo190b = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                t10 t10Var = (t10) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo189a = t10Var.mo189a();
                if (!listMo189a.isEmpty()) {
                    for (Class cls2 : listMo189a) {
                        if (!map.containsKey(cls2)) {
                            m2800d(cls2, hashSet);
                        }
                    }
                }
                objMo190b = t10Var.mo190b((Context) this.f4482c);
                hashSet.remove(cls);
                map.put(cls, objMo190b);
            } catch (Throwable th) {
                throw new C0725sg(th);
            }
        }
        return objMo190b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public Object m2801e() {
        long jM4266g = u50.m4266g();
        if (jM4266g == c81.f736a) {
            return this.f4482c;
        }
        z71 z71Var = (z71) ((AtomicReference) this.f4480a).get();
        int iM5457a = z71Var.m5457a(jM4266g);
        if (iM5457a >= 0) {
            return z71Var.f7829c[iM5457a];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public InterfaceC0051bd m2802f() {
        return ((C0125dd) this.f4482c).f1052d.f789c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public long m2803h() {
        return ((C0125dd) this.f4482c).f1052d.f790d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public boolean m2804i(CharSequence charSequence, int i, int i2, y91 y91Var) {
        if ((y91Var.f7588c & 3) == 0) {
            C0930xl c0930xl = (C0930xl) this.f4482c;
            fe0 fe0VarM5225b = y91Var.m5225b();
            int iM925a = fe0VarM5225b.m925a(8);
            if (iM925a != 0) {
                ((ByteBuffer) fe0VarM5225b.f1423g).getShort(iM925a + fe0VarM5225b.f1420d);
            }
            c0930xl.getClass();
            ThreadLocal threadLocal = C0930xl.f7367b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean zHasGlyph = c0930xl.f7368a.hasGlyph(sb.toString());
            int i3 = y91Var.f7588c & 4;
            y91Var.f7588c = zHasGlyph ? i3 | 2 : i3 | 1;
        }
        return (y91Var.f7588c & 3) == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public boolean m2805j() {
        return !(((h31) ((C0910x1) this.f4480a).f7232e).isEmpty() && ((h31) ((C0910x1) this.f4482c).f7232e).isEmpty() && ((h31) ((C0910x1) this.f4481b).f7232e).isEmpty());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public boolean m2806k() {
        if (((w31) this.f4480a).getValue() != this.f4482c) {
            return true;
        }
        C0541o8 c0541o8 = (C0541o8) this.f4481b;
        return c0541o8 != null && c0541o8.m2806k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public Object m2807l(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC0973yr interfaceC0973yr) {
        int i4;
        char c;
        C0029as c0029as = new C0029as((he0) ((C0948y2) this.f4481b).f7493f);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zMo612g = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (iCharCount < i2 && i5 < i3 && zMo612g) {
                SparseArray sparseArray = c0029as.f250c.f2221a;
                he0 he0Var = sparseArray == null ? null : (he0) sparseArray.get(iCodePointAt);
                if (c0029as.f248a == 2) {
                    if (he0Var != null) {
                        c0029as.f250c = he0Var;
                        c0029as.f253f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            c0029as.m199a();
                        } else if (iCodePointAt != 65039) {
                            he0 he0Var2 = c0029as.f250c;
                            if (he0Var2.f2222b != null) {
                                if (c0029as.f253f != 1) {
                                    c0029as.f251d = he0Var2;
                                    c0029as.m199a();
                                } else if (c0029as.m200b()) {
                                    c0029as.f251d = c0029as.f250c;
                                    c0029as.m199a();
                                } else {
                                    c0029as.m199a();
                                }
                                c = 3;
                            } else {
                                c0029as.m199a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (he0Var == null) {
                    c0029as.m199a();
                    c = 1;
                } else {
                    c0029as.f248a = 2;
                    c0029as.f250c = he0Var;
                    c0029as.f253f = 1;
                    c = 2;
                }
                c0029as.f252e = iCodePointAt;
                if (c == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z || !m2804i(charSequence, i4, iCharCount, c0029as.f251d.f2222b)) {
                        zMo612g = interfaceC0973yr.mo612g(charSequence, i4, iCharCount, c0029as.f251d.f2222b);
                        i5++;
                    }
                }
            }
            break loop0;
        }
        if (c0029as.f248a == 2 && c0029as.f250c.f2222b != null && ((c0029as.f253f > 1 || c0029as.m200b()) && i5 < i3 && zMo612g && (z || !m2804i(charSequence, i4, iCharCount, c0029as.f250c.f2222b)))) {
            interfaceC0973yr.mo612g(charSequence, i4, iCharCount, c0029as.f250c.f2222b);
        }
        return interfaceC0973yr.mo608a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public void m2808m(Object obj) {
        long jM4266g = u50.m4266g();
        if (jM4266g == c81.f736a) {
            this.f4482c = obj;
            return;
        }
        synchronized (this.f4481b) {
            z71 z71Var = (z71) ((AtomicReference) this.f4480a).get();
            int iM5457a = z71Var.m5457a(jM4266g);
            if (iM5457a < 0) {
                ((AtomicReference) this.f4480a).set(z71Var.m5458b(jM4266g, obj));
            } else {
                z71Var.f7829c[iM5457a] = obj;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public void m2809n(InterfaceC0051bd interfaceC0051bd) {
        ((C0125dd) this.f4482c).f1052d.f789c = interfaceC0051bd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public void m2810o(InterfaceC0968ym interfaceC0968ym) {
        ((C0125dd) this.f4482c).f1052d.f787a = interfaceC0968ym;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public void m2811p(k50 k50Var) {
        ((C0125dd) this.f4482c).f1052d.f788b = k50Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public void m2812q(long j) {
        ((C0125dd) this.f4482c).f1052d.f790d = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public void m2813r() {
        jh0 jh0Var = (jh0) this.f4480a;
        String str = (String) this.f4481b;
        List list = (List) jh0Var.m1705k(str);
        if (list != null) {
            list.remove((InterfaceC0298hw) this.f4482c);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        jh0Var.m1707m(str, list);
    }

    public /* synthetic */ C0541o8(Object obj, Object obj2, Object obj3) {
        this.f4480a = obj;
        this.f4481b = obj2;
        this.f4482c = obj3;
    }

    public C0541o8(ba1 ba1Var, C0541o8 c0541o8) {
        this.f4480a = ba1Var;
        this.f4481b = c0541o8;
        this.f4482c = ba1Var.f482d;
    }
}
