package p252;

import io.ktor.http.BadContentTypeFormatException;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;
import org.slf4j.Marker;
import p050.AbstractC7173;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8942 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ C8942 f22756 = new C8942();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ C8942 f22755 = new C8942();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8954 m14141(String str) {
        if (AbstractC5976.m10731(str)) {
            return C8954.f22769;
        }
        C8952 c8952 = (C8952) AbstractC5176.m9367(AbstractC7173.m12435(str));
        String str2 = c8952.f22767;
        List list = c8952.f22766;
        int iM10730 = AbstractC5976.m10730(str2, '/', 0, 6);
        if (iM10730 == -1) {
            if (AbstractC5227.m9466(AbstractC5976.m10714(str2).toString(), Marker.ANY_MARKER)) {
                return C8954.f22769;
            }
            throw new BadContentTypeFormatException(str);
        }
        String string = AbstractC5976.m10714(str2.substring(0, iM10730)).toString();
        if (string.length() == 0) {
            throw new BadContentTypeFormatException(str);
        }
        String string2 = AbstractC5976.m10714(str2.substring(iM10730 + 1)).toString();
        if (AbstractC5976.m10722(string, ' ') || AbstractC5976.m10722(string2, ' ')) {
            throw new BadContentTypeFormatException(str);
        }
        if (string2.length() == 0 || AbstractC5976.m10722(string2, '/')) {
            throw new BadContentTypeFormatException(str);
        }
        return new C8954(string, string2, list);
    }
}
