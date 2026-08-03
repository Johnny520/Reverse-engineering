package Yue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5783 implements InterfaceC5784 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Locale[] f14378 = new Locale[0];

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Locale f14379 = new Locale("en", "XA");

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Locale f14380 = new Locale("ar", "XB");

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Locale f14381 = C5782.m2447("en-Latn");

    /* JADX INFO: renamed from: ۥ */
    public final Locale[] f1682;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6391
    public final String f1683;

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۦۦ$ۥ */
    @InterfaceC7113(21)
    public static class C0867 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static String m2454(Locale locale) {
            return locale.getScript();
        }
    }

    public C5783(@InterfaceC6391 Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f1682 = f14378;
            this.f1683 = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale == null) {
                throw new NullPointerException("list[" + i + "] is null");
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                m17921(sb, locale2);
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f1682 = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f1683 = sb.toString();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static String m17918(Locale locale) {
        String strM2454 = C0867.m2454(locale);
        return !strM2454.isEmpty() ? strM2454 : "";
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m17919(Locale locale) {
        return f14379.equals(locale) || f14380.equals(locale);
    }

    @InterfaceC5459(from = 0, m2228to = 1)
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static int m17920(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || m17919(locale) || m17919(locale2)) {
            return 0;
        }
        String strM17918 = m17918(locale);
        if (!strM17918.isEmpty()) {
            return strM17918.equals(m17918(locale2)) ? 1 : 0;
        }
        String country = locale.getCountry();
        return (country.isEmpty() || country.equals(locale2.getCountry())) ? 1 : 0;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m17921(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append(SignatureVisitor.SUPER);
        sb.append(locale.getCountry());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5783)) {
            return false;
        }
        Locale[] localeArr = ((C5783) obj).f1682;
        if (this.f1682.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f1682;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    @Override // Yue.InterfaceC5784
    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f1682;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f1682) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // Yue.InterfaceC5784
    public boolean isEmpty() {
        return this.f1682.length == 0;
    }

    @Override // Yue.InterfaceC5784
    public int size() {
        return this.f1682.length;
    }

    @InterfaceC6391
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f1682;
            if (i >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i]);
            if (i < this.f1682.length - 1) {
                sb.append(',');
            }
            i++;
        }
    }

    @Override // Yue.InterfaceC5784
    /* JADX INFO: renamed from: ۥ */
    public int mo2452(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f1682;
            if (i >= localeArr.length) {
                return -1;
            }
            if (localeArr[i].equals(locale)) {
                return i;
            }
            i++;
        }
    }

    @Override // Yue.InterfaceC5784
    /* JADX INFO: renamed from: ۥ۟ */
    public String mo2453() {
        return this.f1683;
    }

    @Override // Yue.InterfaceC5784
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Object mo17922() {
        return null;
    }

    @Override // Yue.InterfaceC5784
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Locale mo17923(@InterfaceC6391 String[] strArr) {
        return m17924(Arrays.asList(strArr), false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Locale m17924(Collection<String> collection, boolean z) {
        int iM17925 = m17925(collection, z);
        if (iM17925 == -1) {
            return null;
        }
        return this.f1682[iM17925];
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001e  */
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m17925(Collection<String> collection, boolean z) {
        int iM17926;
        Locale[] localeArr = this.f1682;
        if (localeArr.length == 1) {
            return 0;
        }
        if (localeArr.length == 0) {
            return -1;
        }
        if (z) {
            iM17926 = m17926(f14381);
            if (iM17926 == 0) {
                return 0;
            }
            if (iM17926 >= Integer.MAX_VALUE) {
            }
        } else {
            iM17926 = Integer.MAX_VALUE;
        }
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            int iM179262 = m17926(C5782.m2447(it.next()));
            if (iM179262 == 0) {
                return 0;
            }
            if (iM179262 < iM17926) {
                iM17926 = iM179262;
            }
        }
        if (iM17926 == Integer.MAX_VALUE) {
            return 0;
        }
        return iM17926;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int m17926(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f1682;
            if (i >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (m17920(locale, localeArr[i]) > 0) {
                return i;
            }
            i++;
        }
    }
}
