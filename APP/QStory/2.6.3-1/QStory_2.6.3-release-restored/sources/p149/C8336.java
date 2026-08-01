package p149;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.StartupException;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p267.AbstractC9004;

/* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8336 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Object f20715 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static volatile C8336 f20716;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Context f20717;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashSet f20718 = new HashSet();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f20719 = new HashMap();

    public C8336(Context context) {
        this.f20717 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C8336 m13284(Context context) {
        if (f20716 == null) {
            synchronized (f20715) {
                try {
                    if (f20716 == null) {
                        f20716 = new C8336(context);
                    }
                } finally {
                }
            }
        }
        return f20716;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m13285(Class cls, HashSet hashSet) {
        Object objMo4884;
        HashMap map = this.f20719;
        if (AbstractC9004.m14196()) {
            try {
                AbstractC9004.m14210(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objMo4884 = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC8335 interfaceC8335 = (InterfaceC8335) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo4885 = interfaceC8335.mo4885();
                if (!listMo4885.isEmpty()) {
                    for (Class cls2 : listMo4885) {
                        if (!map.containsKey(cls2)) {
                            m13285(cls2, hashSet);
                        }
                    }
                }
                objMo4884 = interfaceC8335.mo4884(this.f20717);
                hashSet.remove(cls);
                map.put(cls, objMo4884);
            } catch (Throwable th) {
                throw new StartupException(th);
            }
        }
        return objMo4884;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13286(Bundle bundle) {
        HashSet hashSet;
        String string = this.f20717.getString(C0328R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f20718;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC8335.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m13285((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }
}
