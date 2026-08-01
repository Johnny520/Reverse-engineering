package p018;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import net.bytebuddy.pool.TypePool;
import org.slf4j.Marker;
import p029.AbstractC7055;
import p269.AbstractC9019;

/* JADX INFO: renamed from: 飘花落叶言世兰哲楪子苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6915 implements HostnameVerifier {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6915 f16984 = new C6915();

    /* JADX WARN: Removed duplicated region for block: B:63:0x00f9  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m12000(String str, X509Certificate x509Certificate) {
        boolean zEquals;
        int length;
        str.getClass();
        if (AbstractC7055.f17504.matches(str)) {
            String strM12248 = AbstractC7055.m12248(str);
            List listM12001 = m12001(x509Certificate, 7);
            if (listM12001 == null || !listM12001.isEmpty()) {
                Iterator it = listM12001.iterator();
                while (it.hasNext()) {
                    if (AbstractC5227.m9466(strM12248, AbstractC7055.m12248((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (str.length() == ((int) AbstractC9019.m14239(str))) {
            Locale locale = Locale.US;
            locale.getClass();
            str = str.toLowerCase(locale);
            str.getClass();
        }
        List<String> listM120012 = m12001(x509Certificate, 2);
        if (listM120012 == null || !listM120012.isEmpty()) {
            for (String lowerCase : listM120012) {
                if (str.length() != 0 && !AbstractC5971.m10698(str, ".", false) && !str.endsWith("..") && lowerCase != null && lowerCase.length() != 0 && !AbstractC5971.m10698(lowerCase, ".", false) && !lowerCase.endsWith("..")) {
                    String strConcat = !str.endsWith(".") ? str.concat(".") : str;
                    if (!lowerCase.endsWith(".")) {
                        lowerCase = lowerCase.concat(".");
                    }
                    if (lowerCase.length() == ((int) AbstractC9019.m14239(lowerCase))) {
                        Locale locale2 = Locale.US;
                        locale2.getClass();
                        lowerCase = lowerCase.toLowerCase(locale2);
                        lowerCase.getClass();
                    }
                    if (!AbstractC5976.m10735(lowerCase, Marker.ANY_MARKER, false)) {
                        zEquals = strConcat.equals(lowerCase);
                    } else if (!AbstractC5971.m10698(lowerCase, "*.", false) || AbstractC5976.m10730(lowerCase, TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH, 1, 4) != -1 || strConcat.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                        zEquals = false;
                    } else {
                        String strSubstring = lowerCase.substring(1);
                        if (strConcat.endsWith(strSubstring) && ((length = strConcat.length() - strSubstring.length()) <= 0 || AbstractC5976.m10724(strConcat, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, length - 1, 4) == -1)) {
                            zEquals = true;
                        }
                    }
                    if (zEquals) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static List m12001(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return EmptyList.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && AbstractC5227.m9466(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return EmptyList.INSTANCE;
        }
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        str.getClass();
        sSLSession.getClass();
        if (str.length() == ((int) AbstractC9019.m14239(str))) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                certificate.getClass();
                return m12000(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
