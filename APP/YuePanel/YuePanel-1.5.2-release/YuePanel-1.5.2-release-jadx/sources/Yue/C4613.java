package Yue;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4613 {

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۦۢ$ۥ */
    @InterfaceC7113(34)
    public static class C0452 {
        @InterfaceC6391
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static Set<int[]> m1567() {
            return C0453.m1568();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۦۢ$ۥ۟ */
    public static class C0453 {
        @InterfaceC6391
        @SuppressLint({"BanUncheckedReflection"})
        /* JADX INFO: renamed from: ۥ */
        public static Set<int[]> m1568() {
            try {
                Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
                if (objInvoke == null) {
                    return Collections.emptySet();
                }
                Set<int[]> set = (Set) objInvoke;
                Iterator<int[]> it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        return Collections.emptySet();
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.emptySet();
            }
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static Set<int[]> m1566() {
        return Build.VERSION.SDK_INT >= 34 ? C0452.m1567() : C0453.m1568();
    }
}
