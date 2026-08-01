package p236;

import io.ktor.http.BadContentTypeFormatException;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5144;
import org.slf4j.Marker;
import p034.AbstractC6344;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8113 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ C8113 f22411 = new C8113();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ C8113 f22410 = new C8113();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8125 m13582(String str) {
        if (AbstractC5144.m10172(str)) {
            return C8125.f22424;
        }
        C8123 c8123 = (C8123) AbstractC4344.m8808(AbstractC6344.m11876(str));
        String str2 = c8123.f22422;
        List list = c8123.f22421;
        int iM10171 = AbstractC5144.m10171(str2, '/', 0, 6);
        if (iM10171 == -1) {
            if (AbstractC4395.m8907(AbstractC5144.m10155(str2).toString(), Marker.ANY_MARKER)) {
                return C8125.f22424;
            }
            throw new BadContentTypeFormatException(str);
        }
        String string = AbstractC5144.m10155(str2.substring(0, iM10171)).toString();
        if (string.length() == 0) {
            throw new BadContentTypeFormatException(str);
        }
        String string2 = AbstractC5144.m10155(str2.substring(iM10171 + 1)).toString();
        if (AbstractC5144.m10163(string, ' ') || AbstractC5144.m10163(string2, ' ')) {
            throw new BadContentTypeFormatException(str);
        }
        if (string2.length() == 0 || AbstractC5144.m10163(string2, '/')) {
            throw new BadContentTypeFormatException(str);
        }
        return new C8125(string, string2, list);
    }
}
