package Yue;

import java.io.Closeable;
import java.util.Map;
import org.slf4j.impl.StaticMDCBinder;
import org.slf4j.spi.MDCAdapter;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5897 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f1763 = "http://www.slf4j.org/codes.html#null_MDCA";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f1764 = "http://www.slf4j.org/codes.html#no_static_mdc_binder";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static MDCAdapter f14617;

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۤۡ$ۥ۟ */
    public static class C0896 implements Closeable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final String f14618;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C5897.m18280(this.f14618);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0896(String str) {
            this.f14618 = str;
        }
    }

    static {
        try {
            f14617 = m2566();
        } catch (Exception e) {
            C8157.m26828("MDC binding unsuccessful.", e);
        } catch (NoClassDefFoundError e2) {
            f14617 = new C6342();
            String message = e2.getMessage();
            if (message == null || !message.contains("StaticMDCBinder")) {
                throw e2;
            }
            C8157.m26827("Failed to load class \"org.slf4j.impl.StaticMDCBinder\".");
            C8157.m26827("Defaulting to no-operation MDCAdapter implementation.");
            C8157.m26827("See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.");
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static MDCAdapter m2566() throws NoClassDefFoundError {
        try {
            return StaticMDCBinder.getSingleton().getMDCA();
        } catch (NoSuchMethodError unused) {
            return StaticMDCBinder.SINGLETON.getMDCA();
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m2567() {
        MDCAdapter mDCAdapter = f14617;
        if (mDCAdapter == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter.clear();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String m18275(String str) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        MDCAdapter mDCAdapter = f14617;
        if (mDCAdapter != null) {
            return mDCAdapter.get(str);
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Map<String, String> m18276() {
        MDCAdapter mDCAdapter = f14617;
        if (mDCAdapter != null) {
            return mDCAdapter.mo587();
        }
        throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static MDCAdapter m18277() {
        return f14617;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m18278(String str, String str2) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        MDCAdapter mDCAdapter = f14617;
        if (mDCAdapter == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter.put(str, str2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static C0896 m18279(String str, String str2) throws IllegalArgumentException {
        m18278(str, str2);
        return new C0896(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m18280(String str) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        MDCAdapter mDCAdapter = f14617;
        if (mDCAdapter == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter.remove(str);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m18281(Map<String, String> map) {
        MDCAdapter mDCAdapter = f14617;
        if (mDCAdapter == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter.mo586(map);
    }
}
