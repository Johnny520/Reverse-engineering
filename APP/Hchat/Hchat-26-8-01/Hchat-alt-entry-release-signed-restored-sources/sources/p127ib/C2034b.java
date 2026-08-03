package p127ib;

import android.content.Context;
import android.content.SharedPreferences;
import okhttp3.HttpUrl;
import p218og.AbstractC3149m;
import p300ub.AbstractC4302b;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: ib.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2034b {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f6870a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2034b(Context context, int i9) {
        switch (i9) {
            case 1:
                this.f6870a = AbstractC4302b.m8640c(context, "Hchat_group_nickname_color_config");
                break;
            case 2:
                this.f6870a = AbstractC4302b.m8640c(context, "Hchat_member_title_config");
                break;
            default:
                this.f6870a = AbstractC4302b.m8640c(context, "settings_entry");
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m4987a(String str, String str2) {
        String string = str != null ? AbstractC3149m.m6703R0(str).toString() : null;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string2 = str2 != null ? AbstractC3149m.m6703R0(str2).toString() : null;
        if (string2 == null) {
            string2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return (string.length() == 0 || string2.length() == 0) ? HttpUrl.FRAGMENT_ENCODE_SET : AbstractC4855en.m9264h(string, "_", string2);
    }
}
