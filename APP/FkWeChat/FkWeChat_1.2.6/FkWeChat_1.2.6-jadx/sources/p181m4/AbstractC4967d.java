package p181m4;

import android.os.Bundle;
import java.util.List;
import java.util.Map;
import p185m8.AbstractC5107t0;
import p215oc.C5706c;

/* JADX INFO: renamed from: m4.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4967d {
    /* JADX INFO: renamed from: a */
    public static Bundle m20058a(Bundle bundle) {
        bundle.getClass();
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m20059b(Bundle bundle, String str) {
        str.getClass();
        return bundle.containsKey(str);
    }

    /* JADX INFO: renamed from: c */
    public static final Bundle m20060c(Bundle bundle, String str) {
        str.getClass();
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        AbstractC4968e.m20065a(str);
        C5706c.m23089a();
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final Bundle m20061d(Bundle bundle, String str) {
        str.getClass();
        return bundle.getBundle(str);
    }

    /* JADX INFO: renamed from: e */
    public static final List m20062e(Bundle bundle, String str) {
        str.getClass();
        return bundle.getStringArrayList(str);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m20063f(Bundle bundle) {
        return bundle.isEmpty();
    }

    /* JADX INFO: renamed from: g */
    public static final Map m20064g(Bundle bundle) {
        Map mapM20762d = AbstractC5107t0.m20762d(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            mapM20762d.put(str, bundle.get(str));
        }
        return AbstractC5107t0.m20760b(mapM20762d);
    }
}
