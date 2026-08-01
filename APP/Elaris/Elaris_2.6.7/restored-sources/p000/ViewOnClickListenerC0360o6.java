package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import com.p001mr.elaris.HookEntry;
import java.util.Locale;

/* JADX INFO: renamed from: o6 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0360o6 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f634a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Dialog f635b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f636c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Activity f637d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f638e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f639f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f640g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f641h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f642i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnClickListenerC0360o6(Activity activity, Dialog dialog, Context context, View view, String str, String str2, String str3, String str4) {
        this.f635b = dialog;
        this.f636c = context;
        this.f637d = activity;
        this.f638e = view;
        this.f639f = str;
        this.f640g = str2;
        this.f641h = str3;
        this.f642i = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        long jM645p1;
        int i = this.f634a;
        Dialog dialog = this.f635b;
        Object obj = this.f642i;
        switch (i) {
            case 0:
                try {
                    dialog.dismiss();
                    break;
                } catch (Throwable unused) {
                }
                AbstractC0451s6.m942a(this.f636c, this.f637d, this.f638e, this.f639f, this.f640g, this.f641h, (String) obj, "艾特", 0L);
                break;
            default:
                EditText editText = (EditText) obj;
                String string = editText.getText() == null ? "" : editText.getText().toString();
                if (string == null) {
                    jM645p1 = -1;
                } else {
                    String strReplace = string.trim().toLowerCase(Locale.US).replace(" ", "");
                    if (strReplace.length() != 0) {
                        jM645p1 = (strReplace.endsWith("秒") || strReplace.endsWith("s")) ? AbstractC0260i5.m645p1(strReplace.substring(0, strReplace.length() - 1)) : strReplace.endsWith("分钟") ? AbstractC0260i5.m541J1(AbstractC0260i5.m645p1(strReplace.substring(0, strReplace.length() - 2)), 60L) : (strReplace.endsWith("分") || strReplace.endsWith("m")) ? AbstractC0260i5.m541J1(AbstractC0260i5.m645p1(strReplace.substring(0, strReplace.length() - 1)), 60L) : strReplace.endsWith("小时") ? AbstractC0260i5.m541J1(AbstractC0260i5.m645p1(strReplace.substring(0, strReplace.length() - 2)), 3600L) : (strReplace.endsWith("时") || strReplace.endsWith("h")) ? AbstractC0260i5.m541J1(AbstractC0260i5.m645p1(strReplace.substring(0, strReplace.length() - 1)), 3600L) : (strReplace.endsWith("天") || strReplace.endsWith("日")) ? AbstractC0260i5.m541J1(AbstractC0260i5.m645p1(strReplace.substring(0, strReplace.length() - 1)), 86400L) : strReplace.endsWith("days") ? AbstractC0260i5.m541J1(AbstractC0260i5.m645p1(strReplace.substring(0, strReplace.length() - 4)), 86400L) : strReplace.endsWith("day") ? AbstractC0260i5.m541J1(AbstractC0260i5.m645p1(strReplace.substring(0, strReplace.length() - 3)), 86400L) : strReplace.endsWith("d") ? AbstractC0260i5.m541J1(AbstractC0260i5.m645p1(strReplace.substring(0, strReplace.length() - 1)), 86400L) : AbstractC0260i5.m645p1(strReplace);
                    }
                }
                long j = jM645p1;
                if (j >= 1 && j <= 2592000) {
                    try {
                        dialog.dismiss();
                        break;
                    } catch (Throwable unused2) {
                    }
                    HookEntry.log("group action mute custom seconds=" + j);
                    AbstractC0451s6.m942a(this.f636c, this.f637d, this.f638e, this.f639f, this.f640g, this.f641h, "", "禁言", j);
                } else {
                    try {
                        editText.setError("请输入 1 到 2592000 秒，或 1 到 30 天");
                        break;
                    } catch (Throwable unused3) {
                    }
                    HookEntry.log("group action failed type=禁言 reason=bad custom duration raw=" + string + " seconds=" + j);
                }
                break;
        }
    }

    public ViewOnClickListenerC0360o6(EditText editText, Dialog dialog, Context context, Activity activity, View view, String str, String str2, String str3) {
        this.f642i = editText;
        this.f635b = dialog;
        this.f636c = context;
        this.f637d = activity;
        this.f638e = view;
        this.f639f = str;
        this.f640g = str2;
        this.f641h = str3;
    }
}
