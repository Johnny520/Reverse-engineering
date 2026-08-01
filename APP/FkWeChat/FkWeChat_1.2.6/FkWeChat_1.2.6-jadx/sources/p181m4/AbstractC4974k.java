package p181m4;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: m4.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4974k {
    /* JADX INFO: renamed from: a */
    public static Bundle m20079a(Bundle bundle) {
        bundle.getClass();
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public static final void m20080b(Bundle bundle, Bundle bundle2) {
        bundle2.getClass();
        bundle.putAll(bundle2);
    }

    /* JADX INFO: renamed from: c */
    public static final void m20081c(Bundle bundle, String str, Bundle bundle2) {
        str.getClass();
        bundle2.getClass();
        bundle.putBundle(str, bundle2);
    }

    /* JADX INFO: renamed from: d */
    public static final void m20082d(Bundle bundle, String str, List list) {
        str.getClass();
        list.getClass();
        bundle.putStringArrayList(str, AbstractC4975l.m20084a(list));
    }

    /* JADX INFO: renamed from: e */
    public static final void m20083e(Bundle bundle, String str) {
        str.getClass();
        bundle.remove(str);
    }
}
