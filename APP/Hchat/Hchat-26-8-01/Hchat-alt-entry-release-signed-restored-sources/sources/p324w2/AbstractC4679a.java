package p324w2;

import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.HttpUrl;
import p119i2.C1946q;

/* JADX INFO: renamed from: w2.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4679a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m9170a(List list, String str, C1946q c1946q, int i9) {
        if ((i9 & 1) != 0) {
            str = ", ";
        }
        int i10 = i9 & 2;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        String str3 = i10 != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : "[\n\t";
        if ((i9 & 4) == 0) {
            str2 = "\n]";
        }
        if ((i9 & 32) != 0) {
            c1946q = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str3);
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            i11++;
            if (i11 > 1) {
                sb2.append((CharSequence) str);
            }
            if (c1946q != null) {
                sb2.append((CharSequence) c1946q.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) str2);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final Void m9171b(String str) {
        throw new NoSuchElementException(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m9172c(String str) {
        throw new UnsupportedOperationException(str);
    }
}
