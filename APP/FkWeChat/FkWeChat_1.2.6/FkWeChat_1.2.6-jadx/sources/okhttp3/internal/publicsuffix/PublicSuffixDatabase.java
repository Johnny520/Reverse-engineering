package okhttp3.internal.publicsuffix;

import java.net.IDN;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p299ub.AbstractC8621f0;
import p299ub.C8614c;
import p376zd.C10003m;
import sb.AbstractC7294t;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m16758d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", _UrlKt.FRAGMENT_ENCODE_SET, "publicSuffixList", "Lokhttp3/internal/publicsuffix/PublicSuffixList;", "<init>", "(Lokhttp3/internal/publicsuffix/PublicSuffixList;)V", "getEffectiveTldPlusOne", _UrlKt.FRAGMENT_ENCODE_SET, "domain", "splitDomain", _UrlKt.FRAGMENT_ENCODE_SET, "findMatchingRule", "domainLabels", "Companion", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    private final PublicSuffixList publicSuffixList;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final C10003m WILDCARD_LABEL = C10003m.f33582t.m38795e(42);
    private static final List<String> PREVAILING_RULE = AbstractC5112w.m20789e("*");
    private static PublicSuffixDatabase instance = new PublicSuffixDatabase(PublicSuffixList_androidKt.getDefault(PublicSuffixList.INSTANCE));

    public PublicSuffixDatabase(PublicSuffixList publicSuffixList) {
        publicSuffixList.getClass();
        this.publicSuffixList = publicSuffixList;
    }

    private final List<String> findMatchingRule(List<String> domainLabels) {
        String str;
        String strBinarySearch;
        String str2;
        List<String> listM20800o;
        List<String> listM20800o2;
        this.publicSuffixList.ensureLoaded();
        int size = domainLabels.size();
        C10003m[] c10003mArr = new C10003m[size];
        for (int i10 = 0; i10 < size; i10++) {
            c10003mArr[i10] = C10003m.f33582t.m38794d(domainLabels.get(i10));
        }
        int i11 = 0;
        while (true) {
            str = null;
            if (i11 >= size) {
                strBinarySearch = null;
                break;
            }
            strBinarySearch = INSTANCE.binarySearch(this.publicSuffixList.getBytes(), c10003mArr, i11);
            if (strBinarySearch != null) {
                break;
            }
            i11++;
        }
        if (size > 1) {
            C10003m[] c10003mArr2 = (C10003m[]) c10003mArr.clone();
            int length = c10003mArr2.length - 1;
            for (int i12 = 0; i12 < length; i12++) {
                c10003mArr2[i12] = WILDCARD_LABEL;
                String strBinarySearch2 = INSTANCE.binarySearch(this.publicSuffixList.getBytes(), c10003mArr2, i12);
                if (strBinarySearch2 != null) {
                    str2 = strBinarySearch2;
                    break;
                }
            }
            str2 = null;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            int i13 = size - 1;
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    break;
                }
                String strBinarySearch3 = INSTANCE.binarySearch(this.publicSuffixList.getExceptionBytes(), c10003mArr, i14);
                if (strBinarySearch3 != null) {
                    str = strBinarySearch3;
                    break;
                }
                i14++;
            }
        }
        if (str != null) {
            return AbstractC8621f0.m33111R0("!".concat(str), new char[]{'.'}, false, 0, 6, null);
        }
        if (strBinarySearch == null && str2 == null) {
            return PREVAILING_RULE;
        }
        if (strBinarySearch == null || (listM20800o = AbstractC8621f0.m33111R0(strBinarySearch, new char[]{'.'}, false, 0, 6, null)) == null) {
            listM20800o = AbstractC5114x.m20800o();
        }
        if (str2 == null || (listM20800o2 = AbstractC8621f0.m33111R0(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            listM20800o2 = AbstractC5114x.m20800o();
        }
        return listM20800o.size() > listM20800o2.size() ? listM20800o : listM20800o2;
    }

    private final List<String> splitDomain(String domain) {
        List<String> listM33111R0 = AbstractC8621f0.m33111R0(domain, new char[]{'.'}, false, 0, 6, null);
        return AbstractC1061t.m3842c(AbstractC5081g0.m20587u0(listM33111R0), _UrlKt.FRAGMENT_ENCODE_SET) ? AbstractC5081g0.m20567e0(listM33111R0, 1) : listM33111R0;
    }

    public final String getEffectiveTldPlusOne(String domain) {
        int size;
        int size2;
        domain.getClass();
        String unicode = IDN.toUnicode(domain);
        unicode.getClass();
        List<String> listSplitDomain = splitDomain(unicode);
        List<String> listFindMatchingRule = findMatchingRule(listSplitDomain);
        if (listSplitDomain.size() == listFindMatchingRule.size() && listFindMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (listFindMatchingRule.get(0).charAt(0) == '!') {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size();
        } else {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size() + 1;
        }
        return AbstractC7294t.m28899G(AbstractC7294t.m28914x(AbstractC5081g0.m20555Y(splitDomain(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m16758d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "Lzd/m;", _UrlKt.FRAGMENT_ENCODE_SET, "labels", _UrlKt.FRAGMENT_ENCODE_SET, "labelIndex", _UrlKt.FRAGMENT_ENCODE_SET, "binarySearch", "(Lzd/m;[Lzd/m;I)Ljava/lang/String;", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "()Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "Ll8/i0;", "resetForTests$okhttp", "resetForTests", "WILDCARD_LABEL", "Lzd/m;", _UrlKt.FRAGMENT_ENCODE_SET, "PREVAILING_RULE", "Ljava/util/List;", _UrlKt.FRAGMENT_ENCODE_SET, "EXCEPTION_MARKER", "C", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(C10003m c10003m, C10003m[] c10003mArr, int i10) {
            int i11;
            int iAnd;
            boolean z10;
            int iAnd2;
            int iM38765G = c10003m.m38765G();
            int i12 = 0;
            while (i12 < iM38765G) {
                int i13 = (i12 + iM38765G) / 2;
                while (i13 > -1 && c10003m.m38777j(i13) != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (c10003m.m38777j(i11) == 10) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z11) {
                        iAnd = 46;
                        z10 = false;
                    } else {
                        boolean z12 = z11;
                        iAnd = _UtilCommonKt.and(c10003mArr[i17].m38777j(i18), 255);
                        z10 = z12;
                    }
                    iAnd2 = iAnd - _UtilCommonKt.and(c10003m.m38777j(i14 + i19), 255);
                    if (iAnd2 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (c10003mArr[i17].m38765G() != i18) {
                        z11 = z10;
                    } else {
                        if (i17 == c10003mArr.length - 1) {
                            break;
                        }
                        i17++;
                        z11 = true;
                        i18 = -1;
                    }
                }
                if (iAnd2 >= 0) {
                    if (iAnd2 <= 0) {
                        int i20 = i16 - i19;
                        int iM38765G2 = c10003mArr[i17].m38765G() - i18;
                        int length = c10003mArr.length;
                        for (int i21 = i17 + 1; i21 < length; i21++) {
                            iM38765G2 += c10003mArr[i21].m38765G();
                        }
                        if (iM38765G2 >= i20) {
                            if (iM38765G2 <= i20) {
                                return c10003m.mo38768J(i14, i16 + i14).mo38767I(C8614c.f28652b);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                iM38765G = i13;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        public final void resetForTests$okhttp() {
            PublicSuffixDatabase.instance = new PublicSuffixDatabase(PublicSuffixList_androidKt.getDefault(PublicSuffixList.INSTANCE));
        }

        private Companion() {
        }
    }
}
