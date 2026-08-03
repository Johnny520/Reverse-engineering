package p242q8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import p125i8.C2002f;
import p125i8.C2005i;

/* JADX INFO: renamed from: q8.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3463r {

    /* JADX INFO: renamed from: a */
    public final Context f11231a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3463r(Context context, C2002f c2002f) {
        this.f11231a = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Intent[] m7266a(String str) {
        Intent launchIntentForPackage;
        Intent intent;
        Context context = this.f11231a;
        try {
            launchIntentForPackage = new Intent();
            try {
                launchIntentForPackage.setComponent(new ComponentName(context.getPackageName(), "com.tencent.mm.ui.LauncherUI"));
                launchIntentForPackage.addFlags(872415232);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            launchIntentForPackage = null;
        }
        if (launchIntentForPackage == null) {
            try {
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(872415232);
                }
            } catch (Throwable unused3) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            intent = null;
        } else {
            try {
                intent = new Intent();
                try {
                    intent.setComponent(new ComponentName(context.getPackageName(), "com.tencent.mm.ui.chatting.ChattingUI"));
                    intent.putExtra("Chat_User", str);
                    intent.putExtra("Chat_Mode", 1);
                    intent.putExtra("finish_direct", true);
                    intent.addFlags(603979776);
                } catch (Throwable unused4) {
                }
            } catch (Throwable unused5) {
                intent = null;
            }
        }
        if (launchIntentForPackage != null && intent != null) {
            return new Intent[]{launchIntentForPackage, intent};
        }
        if (intent != null) {
            return new Intent[]{intent};
        }
        if (launchIntentForPackage != null) {
            return new Intent[]{launchIntentForPackage};
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m7267b(String str) {
        C2005i.m4939f("[WeChatNotifyApi] ".concat(str));
    }
}
