package p000;

import android.app.Activity;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import com.p001mr.elaris.HookEntry;

/* JADX INFO: renamed from: l6 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0312l6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f519a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f520b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f521c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f522d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f523e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f524f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0312l6(Activity activity, String str, String str2, String str3, String str4, String str5) {
        this.f519a = activity;
        this.f520b = str;
        this.f521c = str2;
        this.f522d = str3;
        this.f523e = str4;
        this.f524f = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (p000.AbstractC0451s6.m935T(r1, r2, p000.AbstractC0451s6.m959i0(r0, r2), r14.f521c, 0, p000.AbstractC0451s6.m937V()).length() > 0) goto L24;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Activity activity = this.f519a;
        EditText editTextM984v = AbstractC0451s6.m984v(activity);
        Editable text = editTextM984v == null ? null : editTextM984v.getText();
        String string = text == null ? "" : text.toString();
        int length = string.length();
        String str = this.f522d;
        String str2 = this.f524f;
        if (length != 0 && string.indexOf(64) >= 0 && !TextUtils.equals(this.f520b, string)) {
            if (AbstractC0366oc.m770a(text) == null) {
                String str3 = this.f522d;
            }
            StringBuilder sb = new StringBuilder("group action success type=艾特 source=");
            String str4 = this.f523e;
            sb.append(str4);
            sb.append(" groupUin=");
            sb.append(str2);
            sb.append(" targetUin=");
            sb.append(str);
            HookEntry.log(sb.toString());
            AbstractC0260i5.m579W0(str2, str, "avatar-action", "艾特, source=".concat(str4));
            return;
        }
        StringBuilder sb2 = new StringBuilder("group action failed type=艾特 reason=native mention not inserted groupUin=");
        sb2.append(str2);
        sb2.append(" targetUin=");
        sb2.append(str);
        sb2.append(" probe=");
        StringBuilder sb3 = new StringBuilder("input=");
        sb3.append(editTextM984v == null ? "null" : editTextM984v.getClass().getName());
        sb3.append(", text=");
        sb3.append(AbstractC0451s6.m967m0(text));
        String str5 = this.f522d;
        String str6 = this.f521c;
        if (text != null) {
            sb3.append(", spans=");
            StringBuilder sb4 = new StringBuilder();
            try {
                int i = 0;
                for (Object obj : text.getSpans(0, Math.min(text.length(), 160), Object.class)) {
                    if (obj != null) {
                        int i2 = i + 1;
                        if (i > 0) {
                            sb4.append('|');
                        }
                        sb4.append(obj.getClass().getName());
                        sb4.append('@');
                        sb4.append(text.getSpanStart(obj));
                        sb4.append('-');
                        sb4.append(text.getSpanEnd(obj));
                        if (AbstractC0451s6.m930O(obj, str5, "", str6)) {
                            sb4.append(":mention");
                        }
                        if (i2 >= 8) {
                            break;
                        } else {
                            i = i2;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            sb3.append(sb4.length() == 0 ? "none" : AbstractC0451s6.m967m0(sb4.toString()));
        } else {
            sb3.append(", spans=none");
        }
        sb3.append(", nativeState=");
        sb3.append(AbstractC0451s6.m935T(editTextM984v, str5, "", str6, 0, AbstractC0451s6.m937V()));
        sb2.append(AbstractC0451s6.m967m0(sb3.toString()));
        HookEntry.log(sb2.toString());
        AbstractC0451s6.m991y0("未找到 QQ 原生艾特入口");
    }
}
