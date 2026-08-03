package Yue;

import android.os.PersistableBundle;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥۡۤ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nPersistableBundle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,155:1\n13579#2,2:156\n*S KotlinDebug\n*F\n+ 1 PersistableBundle.kt\nandroidx/core/os/PersistableBundleKt\n*L\n35#1:156,2\n*E\n"})
public final class C6658 {
    @InterfaceC6399
    @InterfaceC7113(21)
    /* JADX INFO: renamed from: ۥ */
    public static final PersistableBundle m3137() {
        return C6656.m3133(0);
    }

    @InterfaceC6399
    @InterfaceC7113(21)
    /* JADX INFO: renamed from: ۥ۟ */
    public static final PersistableBundle m3138(@InterfaceC6399 C6599<String, ? extends Object>... c6599Arr) {
        PersistableBundle persistableBundleM3133 = C6656.m3133(c6599Arr.length);
        for (C6599<String, ? extends Object> c6599 : c6599Arr) {
            C6656.m3134(persistableBundleM3133, c6599.m3062(), c6599.m3063());
        }
        return persistableBundleM3133;
    }

    @InterfaceC6399
    @InterfaceC7113(21)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final PersistableBundle m21277(@InterfaceC6399 Map<String, ? extends Object> map) {
        PersistableBundle persistableBundleM3133 = C6656.m3133(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            C6656.m3134(persistableBundleM3133, entry.getKey(), entry.getValue());
        }
        return persistableBundleM3133;
    }
}
