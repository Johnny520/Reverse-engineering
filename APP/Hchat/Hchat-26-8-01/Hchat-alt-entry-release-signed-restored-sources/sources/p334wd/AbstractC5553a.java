package p334wd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;

/* JADX INFO: renamed from: wd.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5553a {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2844b f22655a = AbstractC2846d.m6274b(AbstractC5553a.class);

    /* JADX INFO: renamed from: b */
    public static final Pattern f22656b = Pattern.compile("classes([1-9]\\d*)\\.dex");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m9965a(String str) {
        if ("classes.dex".equals(str)) {
            return 1;
        }
        try {
            Matcher matcher = f22656b.matcher(str);
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                if (!strGroup.equals("1")) {
                    return Integer.parseInt(strGroup);
                }
            }
            return -1;
        } catch (Exception e6) {
            f22655a.mo6266t("Failed to parse source classes index", e6);
            return -1;
        }
    }
}
