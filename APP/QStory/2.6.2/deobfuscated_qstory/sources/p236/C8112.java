package p236;

import io.ktor.http.BadContentTypeFormatException;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import kotlin.text.AbstractC5143;
import org.slf4j.Marker;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8112 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ C8112 f22413 = new C8112();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ C8112 f22412 = new C8112();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8124 m13553(String str) throws BadContentTypeFormatException {
        if (AbstractC5143.m10164(str)) {
            return C8124.f22426;
        }
        C8122 c8122 = (C8122) AbstractC4343.m8811(AbstractC4921.m9883(str));
        String str2 = c8122.f22424;
        List list = c8122.f22423;
        int iM10151 = AbstractC5143.m10151(str2, '/', 0, 6);
        if (iM10151 == -1) {
            if (AbstractC4394.m8917(AbstractC5143.m10150(str2).toString(), Marker.ANY_MARKER)) {
                return C8124.f22426;
            }
            throw new BadContentTypeFormatException(str);
        }
        String string = AbstractC5143.m10150(str2.substring(0, iM10151)).toString();
        if (string.length() == 0) {
            throw new BadContentTypeFormatException(str);
        }
        String string2 = AbstractC5143.m10150(str2.substring(iM10151 + 1)).toString();
        if (AbstractC5143.m10172(string, ' ') || AbstractC5143.m10172(string2, ' ')) {
            throw new BadContentTypeFormatException(str);
        }
        if (string2.length() == 0 || AbstractC5143.m10172(string2, '/')) {
            throw new BadContentTypeFormatException(str);
        }
        return new C8124(string, string2, list);
    }
}
