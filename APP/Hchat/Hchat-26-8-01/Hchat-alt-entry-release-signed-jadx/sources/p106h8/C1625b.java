package p106h8;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.HttpUrl;
import p089g1.C1275d;
import p210o8.C3080d;

/* JADX INFO: renamed from: h8.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1625b {

    /* JADX INFO: renamed from: a */
    public final C3080d f5321a;

    /* JADX INFO: renamed from: b */
    public final C1624a f5322b;

    /* JADX INFO: renamed from: c */
    public final C1275d f5323c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArrayList f5324d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e */
    public volatile boolean f5325e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1625b(C3080d c3080d, C1624a c1624a, C1275d c1275d) {
        this.f5321a = c3080d;
        this.f5322b = c1624a;
        this.f5323c = c1275d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m4149a(ContentValues contentValues, String str) {
        Long asLong = null;
        if (contentValues != null && !TextUtils.isEmpty(str) && contentValues.containsKey(str)) {
            try {
                asLong = contentValues.getAsLong(str);
            } catch (Throwable unused) {
            }
        }
        if (asLong != null) {
            return asLong.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m4150b(ContentValues contentValues, String str) {
        Object obj;
        return (contentValues == null || TextUtils.isEmpty(str) || !contentValues.containsKey(str) || (obj = contentValues.get(str)) == null) ? HttpUrl.FRAGMENT_ENCODE_SET : String.valueOf(obj);
    }
}
