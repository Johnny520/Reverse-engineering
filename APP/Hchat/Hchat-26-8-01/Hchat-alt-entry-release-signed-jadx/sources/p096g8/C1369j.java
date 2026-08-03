package p096g8;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.HttpUrl;
import p089g1.C1275d;
import p210o8.C3080d;

/* JADX INFO: renamed from: g8.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1369j {

    /* JADX INFO: renamed from: a */
    public final C3080d f4549a;

    /* JADX INFO: renamed from: b */
    public final C1368i f4550b;

    /* JADX INFO: renamed from: c */
    public final C1275d f4551c;

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArrayList f4552d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e */
    public volatile boolean f4553e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1369j(C3080d c3080d, C1368i c1368i, C1275d c1275d) {
        this.f4549a = c3080d;
        this.f4550b = c1368i;
        this.f4551c = c1275d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m3738a(ContentValues contentValues, String str) {
        Object obj;
        return (contentValues == null || TextUtils.isEmpty(str) || !contentValues.containsKey(str) || (obj = contentValues.get(str)) == null) ? HttpUrl.FRAGMENT_ENCODE_SET : String.valueOf(obj);
    }
}
