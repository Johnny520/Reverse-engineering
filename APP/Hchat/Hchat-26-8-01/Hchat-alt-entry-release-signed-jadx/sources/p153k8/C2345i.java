package p153k8;

import android.content.ContentValues;
import android.text.TextUtils;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.HttpUrl;
import p003a2.C0014a;
import p096g8.C1360a;
import p096g8.C1364e;
import p125i8.C2002f;
import p125i8.C2005i;
import p210o8.C3080d;

/* JADX INFO: renamed from: k8.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2345i {

    /* JADX INFO: renamed from: a */
    public final C3080d f7693a;

    /* JADX INFO: renamed from: b */
    public final C2355s f7694b;

    /* JADX INFO: renamed from: c */
    public final C1360a f7695c;

    /* JADX INFO: renamed from: d */
    public final C2002f f7696d;

    /* JADX INFO: renamed from: e */
    public final CopyOnWriteArrayList f7697e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f */
    public volatile boolean f7698f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2345i(C3080d c3080d, C2355s c2355s, C1360a c1360a, C2002f c2002f) {
        this.f7693a = c3080d;
        this.f7694b = c2355s;
        this.f7695c = c1360a;
        this.f7696d = c2002f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static long m5604c(ContentValues contentValues, String str) {
        Long asLong = null;
        if (contentValues != null && !TextUtils.isEmpty(str) && contentValues.containsKey(str)) {
            try {
                asLong = contentValues.getAsLong(str);
            } catch (Throwable unused) {
            }
        }
        if (asLong != null) {
            return asLong.longValue();
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m5605d(ContentValues contentValues, String str) {
        Object obj;
        return (contentValues == null || TextUtils.isEmpty(str) || !contentValues.containsKey(str) || (obj = contentValues.get(str)) == null) ? HttpUrl.FRAGMENT_ENCODE_SET : String.valueOf(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m5606a() {
        C3080d c3080d;
        if (!this.f7698f && (c3080d = this.f7693a) != null) {
            c3080d.m6549g(new C1364e(this, 6));
            this.f7698f = true;
            if (this.f7696d != null) {
                C2005i.m4939f("[WeChatMessageChangeApi] ".concat("消息变更监听已安装"));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m5607b() {
        C3080d c3080d = this.f7693a;
        return c3080d != null && c3080d.m6548f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C0014a m5608e(InterfaceC2344h interfaceC2344h) {
        this.f7697e.addIfAbsent(interfaceC2344h);
        return new C0014a(22);
    }
}
