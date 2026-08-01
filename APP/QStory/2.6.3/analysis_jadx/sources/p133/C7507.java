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
import p251.AbstractC8175;

/* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7507 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Object f20370 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static volatile C7507 f20371;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Context f20372;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashSet f20373 = new HashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f20374 = new HashMap();

    public C7507(Context context) {
        this.f20372 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C7507 m12725(Context context) {
        if (f20371 == null) {
            synchronized (f20370) {
                try {
                    if (f20371 == null) {
                        f20371 = new C7507(context);
                    }
                } finally {
                }
            }
        }
        return f20371;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m12726(Class cls, HashSet hashSet) {
        Object objMo4324;
        HashMap map = this.f20374;
        if (AbstractC8175.m13637()) {
            try {
                AbstractC8175.m13651(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objMo4324 = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC7506 interfaceC7506 = (InterfaceC7506) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo4325 = interfaceC7506.mo4325();
                if (!listMo4325.isEmpty()) {
                    for (Class cls2 : listMo4325) {
                        if (!map.containsKey(cls2)) {
                            m12726(cls2, hashSet);
                        }
                    }
                }
                objMo4324 = interfaceC7506.mo4324(this.f20372);
                hashSet.remove(cls);
                map.put(cls, objMo4324);
            } catch (Throwable th) {
                throw new StartupException(th);
            }
        }
        return objMo4324;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12727(Bundle bundle) {
        HashSet hashSet;
        String string = this.f20372.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f20373;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC7506.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m12726((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }
}
