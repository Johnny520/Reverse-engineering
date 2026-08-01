package p315vd;

import android.content.Context;
import android.content.Intent;
import java.util.List;
import me.yun.fkwechat.core.config.AppConfig;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p084fd.AbstractC2424d;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: vd.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8923c {

    /* JADX INFO: renamed from: a */
    public static final C8923c f29532a = new C8923c();

    /* JADX INFO: renamed from: a */
    public static final void m34260a(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        try {
            String strM8746s = AbstractC2424d.m8746s(str, str2);
            if (strM8746s == null) {
                strM8746s = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            List listM8738k = AbstractC2424d.m8738k(str);
            if (listM8738k == null) {
                listM8738k = AbstractC5114x.m20800o();
            }
            boolean zM3842c = AbstractC1061t.m3842c(AbstractC5081g0.m20578l0(listM8738k), str2);
            String strM8747t = AbstractC2424d.m8747t(str2);
            if (strM8747t == null) {
                strM8747t = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            String strM8745r = AbstractC2424d.m8745r(str2);
            if (strM8745r == null) {
                strM8745r = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            Intent intent = new Intent();
            intent.setClassName(AppConfig.APP_PACKAGE, "com.tencent.mm.plugin.profile.ui.ContactInfoUI");
            intent.putExtra("Contact_Mobile_MD5", _UrlKt.FRAGMENT_ENCODE_SET);
            intent.putExtra("Contact_User", str2);
            intent.putExtra("Contact_ChatRoomId", str);
            intent.putExtra("room_name", str);
            intent.putExtra("Is_RoomOwner", zM3842c);
            intent.putExtra("Contact_RoomNickname", strM8746s);
            intent.putExtra("Contact_RemarkName", strM8747t);
            intent.putExtra("Contact_Nick", strM8745r);
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 8);
            intent.putExtra("Contact_Scene", 14);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e10) {
            AbstractC8924d.m34264d("JumpUtils", "拉起个人资料页发生异常", e10);
        }
    }
}
