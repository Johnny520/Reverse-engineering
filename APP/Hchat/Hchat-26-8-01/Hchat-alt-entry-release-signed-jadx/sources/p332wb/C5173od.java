package p332wb;

import android.content.SharedPreferences;
import okhttp3.HttpUrl;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p129ig.AbstractC2043a;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;
import tf.C4173t;

/* JADX INFO: renamed from: wb.od */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5173od implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19372g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f19373h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f19374i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5173od(SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f19372g = i9;
        this.f19373h = sharedPreferences;
        this.f19374i = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f19372g) {
            case 0:
                this.f19373h.edit().putFloat("round_avatar_radius_factor", AbstractC2043a.m5018X(AbstractC3754e0.m7907q(((Number) this.f19374i.getValue()).floatValue(), 0.1f, 0.5f) * 100.0f) / 100.0f).apply();
                break;
            case 1:
                this.f19373h.edit().putFloat("text_voice_speech_rate", ((Number) this.f19374i.getValue()).floatValue()).apply();
                break;
            case 2:
                SharedPreferences sharedPreferences = this.f19373h;
                String str = HttpUrl.FRAGMENT_ENCODE_SET;
                String string = sharedPreferences.getString("logs", HttpUrl.FRAGMENT_ENCODE_SET);
                if (string != null) {
                    str = string;
                }
                this.f19374i.setValue(str);
                break;
            case 3:
                this.f19373h.edit().remove("logs").apply();
                this.f19374i.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                break;
            case 4:
                SharedPreferences sharedPreferences2 = this.f19373h;
                String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                String string2 = sharedPreferences2.getString("logs", HttpUrl.FRAGMENT_ENCODE_SET);
                if (string2 != null) {
                    str2 = string2;
                }
                this.f19374i.setValue(str2);
                break;
            case 5:
                this.f19373h.edit().remove("logs").apply();
                this.f19374i.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                break;
            case 6:
                SharedPreferences sharedPreferences3 = this.f19373h;
                C4173t c4173t = C4173t.f13710g;
                AbstractC4955ho.m9429R6(sharedPreferences3, c4173t);
                this.f19374i.setValue(c4173t);
                break;
            case 7:
                SharedPreferences sharedPreferences4 = this.f19373h;
                String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                String string3 = sharedPreferences4.getString("comment_logs", HttpUrl.FRAGMENT_ENCODE_SET);
                if (string3 != null) {
                    str3 = string3;
                }
                this.f19374i.setValue(str3);
                break;
            case 8:
                this.f19373h.edit().remove("comment_logs").apply();
                this.f19374i.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                break;
            default:
                AbstractC4855en.m9269m(this.f19374i, Boolean.FALSE, this.f19373h, "agent_history_gesture_hint", false);
                break;
        }
        return C3967n.f12976a;
    }
}
