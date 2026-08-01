package p133;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.StartupException;
import com.davemorrissey.labs.subscaleview.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC6087;

/* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7506 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Object f20375 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static volatile C7506 f20376;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Context f20377;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashSet f20378 = new HashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f20379 = new HashMap();

    public C7506(Context context) {
        this.f20377 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C7506 m12696(Context context) {
        if (f20376 == null) {
            synchronized (f20375) {
                try {
                    if (f20376 == null) {
                        f20376 = new C7506(context);
                    }
                } finally {
                }
            }
        }
        return f20376;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m12697(Class cls, HashSet hashSet) {
        Object objMo4314;
        HashMap map = this.f20379;
        if (AbstractC6087.m11396()) {
            try {
                AbstractC6087.m11401(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objMo4314 = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC7505 interfaceC7505 = (InterfaceC7505) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo4315 = interfaceC7505.mo4315();
                if (!listMo4315.isEmpty()) {
                    for (Class cls2 : listMo4315) {
                        if (!map.containsKey(cls2)) {
                            m12697(cls2, hashSet);
                        }
                    }
                }
                objMo4314 = interfaceC7505.mo4314(this.f20377);
                hashSet.remove(cls);
                map.put(cls, objMo4314);
            } catch (Throwable th) {
                throw new StartupException(th);
            }
        }
        return objMo4314;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12698(Bundle bundle) {
        HashSet hashSet;
        String string = this.f20377.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f20378;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC7505.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m12697((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }
}
