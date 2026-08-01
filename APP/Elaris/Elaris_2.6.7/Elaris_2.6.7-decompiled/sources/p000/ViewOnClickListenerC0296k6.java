package p000;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import com.p001mr.elaris.HookEntry;

/* JADX INFO: renamed from: k6 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0296k6 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ EditText f492a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Dialog f493b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Activity f494c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f495d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f496e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnClickListenerC0296k6(EditText editText, Dialog dialog, Activity activity, String str, String str2) {
        this.f492a = editText;
        this.f493b = dialog;
        this.f494c = activity;
        this.f495d = str;
        this.f496e = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText = this.f492a;
        String strTrim = editText.getText() == null ? "" : editText.getText().toString().trim();
        try {
            this.f493b.dismiss();
        } catch (Throwable unused) {
        }
        Activity activity = this.f494c;
        String str = this.f495d;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    String str2 = this.f496e;
                    if (str2 != null && str2.length() != 0) {
                        ClassLoader classLoaderM922H = AbstractC0451s6.m922H(activity);
                        String strM959i0 = AbstractC0451s6.m959i0(activity, str2);
                        if (strM959i0.length() != 0 && !strM959i0.startsWith("u_")) {
                            if (!AbstractC0451s6.m971o0(activity, classLoaderM922H, str, strM959i0, strTrim)) {
                                HookEntry.log("group action failed type=设置头衔 reason=oidb submit unresolved groupUin=" + str + " targetUin=" + strM959i0);
                                AbstractC0451s6.m991y0("未找到 QQ 头衔提交接口");
                                return;
                            }
                            String strM974q = AbstractC0451s6.m974q(activity);
                            int length = 0;
                            boolean z = strM974q.length() > 0 && strM974q.equals(strM959i0);
                            StringBuilder sb = new StringBuilder("group action submitted type=设置头衔 groupUin=");
                            sb.append(str);
                            sb.append(" targetUin=");
                            sb.append(strM959i0);
                            sb.append(" titleLen=");
                            sb.append(strTrim == null ? 0 : strTrim.length());
                            sb.append(" targetSelf=");
                            sb.append(z);
                            HookEntry.log(sb.toString());
                            StringBuilder sb2 = new StringBuilder("设置头衔, titleLen=");
                            if (strTrim != null) {
                                length = strTrim.length();
                            }
                            sb2.append(length);
                            AbstractC0260i5.m579W0(str, strM959i0, "avatar-action", sb2.toString());
                            AbstractC0451s6.m991y0("已提交头衔设置");
                            return;
                        }
                        HookEntry.log("group action failed type=设置头衔 reason=member uin unresolved target=".concat(str2));
                        AbstractC0451s6.m991y0("未获取到成员 QQ 号");
                        return;
                    }
                    HookEntry.log("group action failed type=设置头衔 reason=missing targetUin");
                    AbstractC0451s6.m991y0("未获取到成员 UID");
                    return;
                }
            } catch (Throwable th) {
                Throwable thM913C0 = AbstractC0451s6.m913C0(th);
                AbstractC0000a.m3d(thM913C0, new StringBuilder("group action failed type=设置头衔 reason="), ": ");
                AbstractC0260i5.m588Z0(str, "member-title-action", thM913C0);
                return;
            }
        }
        HookEntry.log("group action failed type=设置头衔 reason=missing groupUin");
        AbstractC0451s6.m991y0("未获取到群号");
    }
}
