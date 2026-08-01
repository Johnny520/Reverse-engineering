package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p001mr.elaris.AbstractC0169w;
import com.p001mr.elaris.HookEntry;
import java.io.File;
import java.util.Locale;

/* JADX INFO: renamed from: he */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0253he implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f356a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EditText f357b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Activity f358c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0347n9 f359d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Dialog f360e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ClassLoader f361f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0410pd f362g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Dialog f363h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ TextView f364i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ LinearLayout f365j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0515w6[] f366k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int[] f367l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnClickListenerC0253he(String str, EditText editText, Activity activity, C0347n9 c0347n9, Dialog dialog, ClassLoader classLoader, C0410pd c0410pd, Dialog dialog2, TextView textView, LinearLayout linearLayout, C0515w6[] c0515w6Arr, int[] iArr) {
        this.f356a = str;
        this.f357b = editText;
        this.f358c = activity;
        this.f359d = c0347n9;
        this.f360e = dialog;
        this.f361f = classLoader;
        this.f362g = c0410pd;
        this.f363h = dialog2;
        this.f364i = textView;
        this.f365j = linearLayout;
        this.f366k = c0515w6Arr;
        this.f367l = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0130, code lost:
    
        if (r0.renameTo(r7) != false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        String strConcat;
        String str;
        String str2;
        EditText editText = this.f357b;
        String str3 = "";
        String string = editText.getText() == null ? "" : editText.getText().toString();
        String str4 = this.f356a;
        String strM328w = AbstractC0169w.m328w(str4);
        String strTrim = (string == null ? "" : string.trim()).replace('\n', ' ').replace('\r', ' ').trim();
        if (strTrim.length() != 0) {
            if (strM328w.length() > 0) {
                Locale locale = Locale.US;
                if (strTrim.toLowerCase(locale).endsWith(strM328w.toLowerCase(locale))) {
                    strTrim = strTrim.substring(0, strTrim.length() - strM328w.length()).trim();
                }
            }
            strConcat = strTrim.length() == 0 ? "" : strTrim.concat(strM328w);
        }
        int length = strConcat.length();
        Activity activity = this.f358c;
        if (length == 0) {
            AbstractC0169w.m276W0(activity, "文件名不能为空");
            return;
        }
        if (strConcat.length() != 0 && !".".equals(strConcat) && !"..".equals(strConcat)) {
            for (int i = 0; i < strConcat.length(); i++) {
                char cCharAt = strConcat.charAt(i);
                if (cCharAt >= ' ' && cCharAt != '/' && cCharAt != '\\' && cCharAt != ':' && cCharAt != '*' && cCharAt != '?' && cCharAt != '\"' && cCharAt != '<' && cCharAt != '>' && cCharAt != '|') {
                }
            }
            if (!AbstractC0169w.m284a0(AbstractC0169w.m328w(strConcat))) {
                AbstractC0169w.m276W0(activity, "请保留原音频后缀");
                return;
            }
            if (strConcat.equals(str4)) {
                AbstractC0169w.m276W0(activity, "文件名未改变");
                return;
            }
            if (activity != null) {
                C0347n9 c0347n9 = this.f359d;
                Uri uri = c0347n9.f593b;
                File file = c0347n9.f592a;
                if (strConcat.length() != 0) {
                    if (file != null && file.exists() && file.isFile()) {
                        try {
                            File parentFile = file.getParentFile();
                            if (parentFile != null && parentFile.exists() && parentFile.isDirectory()) {
                                File file2 = new File(parentFile, strConcat);
                                if (file2.exists()) {
                                    str3 = "同名文件已存在";
                                }
                            }
                        } catch (Throwable th) {
                            HookEntry.log("local voice rename file failed: " + th.getClass().getSimpleName() + ": " + AbstractC0169w.m242F0(th.getMessage()));
                        }
                        str = "重命名失败";
                    } else {
                        str = "";
                    }
                    if (uri != null) {
                        ContentResolver contentResolver = activity.getContentResolver();
                        try {
                        } catch (SecurityException unused) {
                            str2 = "没有重命名权限，请重新授权目录";
                            str3 = str2;
                        } catch (Throwable th2) {
                            HookEntry.log("local voice rename document failed: " + th2.getClass().getSimpleName() + ": " + AbstractC0169w.m242F0(th2.getMessage()));
                        }
                        if (!DocumentsContract.isDocumentUri(activity, uri)) {
                            try {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("_display_name", strConcat);
                                if (contentResolver.update(uri, contentValues, null, null) <= 0) {
                                }
                            } catch (SecurityException unused2) {
                                str2 = "没有重命名权限";
                                str3 = str2;
                            } catch (Throwable th3) {
                                HookEntry.log("local voice rename media failed: " + th3.getClass().getSimpleName() + ": " + AbstractC0169w.m242F0(th3.getMessage()));
                                if (str.length() <= 0) {
                                }
                            }
                        } else if (DocumentsContract.renameDocument(contentResolver, uri, strConcat) == null) {
                            str3 = "重命名失败";
                        }
                    } else if (str.length() <= 0) {
                        str3 = str;
                    } else {
                        str2 = "此文件暂不支持重命名";
                        str3 = str2;
                    }
                }
            }
            if (str3.length() > 0) {
                AbstractC0169w.m276W0(activity, str3);
                return;
            }
            this.f360e.dismiss();
            AbstractC0169w.m276W0(activity, "已重命名");
            AbstractC0169w.m240E0(this.f362g, this.f358c, this.f363h, this.f365j, this.f364i, this.f361f, this.f367l, this.f366k);
            return;
        }
        AbstractC0169w.m276W0(activity, "文件名不合法");
    }
}
