package p341x3;

import af.C0081d;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p000a.AbstractC0000a;
import p099h.Hchat.R;
import p359y3.AbstractC5992a;

/* JADX INFO: renamed from: x3.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5688a {

    /* JADX INFO: renamed from: d */
    public static volatile C5688a f23144d;

    /* JADX INFO: renamed from: e */
    public static final Object f23145e = new Object();

    /* JADX INFO: renamed from: c */
    public final Context f23148c;

    /* JADX INFO: renamed from: b */
    public final HashSet f23147b = new HashSet();

    /* JADX INFO: renamed from: a */
    public final HashMap f23146a = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5688a(Context context) {
        this.f23148c = context.getApplicationContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C5688a m10241c(Context context) {
        if (f23144d == null) {
            synchronized (f23145e) {
                try {
                    if (f23144d == null) {
                        f23144d = new C5688a(context);
                    }
                } finally {
                }
            }
        }
        return f23144d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m10242a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f23148c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f23147b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC5689b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m10243b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e6) {
                throw new C0081d(e6);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Object m10243b(Class cls, HashSet hashSet) {
        boolean zBooleanValue;
        Object objMo507b;
        HashMap map = this.f23146a;
        if (Build.VERSION.SDK_INT >= 29) {
            zBooleanValue = AbstractC5992a.m10730a();
        } else {
            try {
                if (AbstractC0000a.f2i == null) {
                    AbstractC0000a.f1h = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    AbstractC0000a.f2i = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                zBooleanValue = ((Boolean) AbstractC0000a.f2i.invoke(null, Long.valueOf(AbstractC0000a.f1h))).booleanValue();
            } catch (Exception e6) {
                if (e6 instanceof InvocationTargetException) {
                    Throwable cause = e6.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    }
                    throw new RuntimeException(cause);
                }
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e6);
                zBooleanValue = false;
            }
        }
        if (zBooleanValue) {
            try {
                AbstractC0000a.m80o(cls.getSimpleName());
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objMo507b = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC5689b interfaceC5689b = (InterfaceC5689b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo506a = interfaceC5689b.mo506a();
                if (!listMo506a.isEmpty()) {
                    for (Class cls2 : listMo506a) {
                        if (!map.containsKey(cls2)) {
                            m10243b(cls2, hashSet);
                        }
                    }
                }
                objMo507b = interfaceC5689b.mo507b(this.f23148c);
                hashSet.remove(cls);
                map.put(cls, objMo507b);
            } catch (Throwable th3) {
                throw new C0081d(th3);
            }
        }
        Trace.endSection();
        return objMo507b;
    }
}
