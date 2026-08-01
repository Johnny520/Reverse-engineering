package p179m2;

import java.util.Arrays;
import p024b9.C1062t0;

/* JADX INFO: renamed from: m2.j2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4861j2 {
    /* JADX INFO: renamed from: a */
    public static final String m19406a(Object obj, String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('@');
        C1062t0 c1062t0 = C1062t0.f3215a;
        sb2.append(String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
        return sb2.toString();
    }
}
