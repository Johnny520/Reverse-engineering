package p087s;

import android.graphics.drawable.Icon;
import android.net.Uri;

/* JADX INFO: renamed from: s.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0964c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m2147a(Object obj) {
        return ((Icon) obj).getResId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m2148b(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static int m2149c(Object obj) {
        return ((Icon) obj).getType();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static Uri m2150d(Object obj) {
        return ((Icon) obj).getUri();
    }
}
