package p126ia;

import android.content.SharedPreferences;
import okhttp3.HttpUrl;
import p085fg.InterfaceC1220a;
import p117i0.AbstractC1874r;
import p218og.AbstractC3149m;

/* JADX INFO: renamed from: ia.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2024r implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6846g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f6847h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2024r(SharedPreferences sharedPreferences) {
        this.f6846g = 2;
        this.f6847h = sharedPreferences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f6846g) {
            case 0:
                SharedPreferences sharedPreferences = this.f6847h;
                String str = HttpUrl.FRAGMENT_ENCODE_SET;
                String string = sharedPreferences.getString("fake_like_menu_text", HttpUrl.FRAGMENT_ENCODE_SET);
                if (string != null) {
                    str = string;
                }
                String string2 = AbstractC3149m.m6703R0(str).toString();
                return string2.length() == 0 ? "伪集赞[H]" : string2;
            case 1:
                SharedPreferences sharedPreferences2 = this.f6847h;
                String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                String string3 = sharedPreferences2.getString("fake_comment_menu_text", HttpUrl.FRAGMENT_ENCODE_SET);
                if (string3 != null) {
                    str2 = string3;
                }
                String string4 = AbstractC3149m.m6703R0(str2).toString();
                return string4.length() == 0 ? "伪评论[H]" : string4;
            default:
                SharedPreferences sharedPreferences3 = this.f6847h;
                String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                String string5 = sharedPreferences3.getString("audio_transform_last_talker", HttpUrl.FRAGMENT_ENCODE_SET);
                if (string5 != null) {
                    str3 = string5;
                }
                return AbstractC1874r.m4639u(str3);
        }
    }

    public /* synthetic */ C2024r(C2027u c2027u, SharedPreferences sharedPreferences, int i9) {
        this.f6846g = i9;
        this.f6847h = sharedPreferences;
    }
}
