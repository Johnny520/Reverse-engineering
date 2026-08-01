package p000;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p001mr.elaris.AbstractC0169w;
import com.p001mr.elaris.HookEntry;
import java.io.File;

/* JADX INFO: renamed from: se */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0459se implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f865a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f866b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Activity f867c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ClassLoader f868d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0410pd f869e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnClickListenerC0459se(Activity activity, ClassLoader classLoader, C0410pd c0410pd, C0193e2 c0193e2) {
        this.f865a = 2;
        this.f867c = activity;
        this.f868d = classLoader;
        this.f869e = c0410pd;
        this.f866b = c0193e2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        Uri uriBuildDocumentUri;
        File externalStoragePublicDirectory;
        C0515w6 c0515w6M246H0;
        switch (this.f865a) {
            case 0:
                try {
                    ((Dialog) this.f866b).dismiss();
                    break;
                } catch (Throwable unused) {
                }
                AbstractC0260i5.m559P1(this.f867c, this.f868d, this.f869e);
                break;
            case 1:
                try {
                    ((Dialog) this.f866b).dismiss();
                    break;
                } catch (Throwable unused2) {
                }
                Activity activity = this.f867c;
                ClassLoader classLoader = this.f868d;
                C0410pd c0410pd = this.f869e;
                if (activity == null) {
                    AbstractC0169w.m276W0(activity, "未识别当前聊天");
                } else {
                    AbstractC0169w.m267S();
                    AbstractC0169w.f178r = new C0540y(classLoader, c0410pd);
                    Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                    intent.addFlags(195);
                    try {
                        c0515w6M246H0 = AbstractC0169w.m246H0(activity);
                    } catch (Throwable unused3) {
                    }
                    if (c0515w6M246H0 != null) {
                        uriBuildDocumentUri = (Uri) c0515w6M246H0.f998b;
                        if (uriBuildDocumentUri == null) {
                            try {
                                externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                                if (externalStoragePublicDirectory == null) {
                                    externalStoragePublicDirectory = Environment.getExternalStorageDirectory();
                                }
                            } catch (Throwable unused4) {
                            }
                            if (externalStoragePublicDirectory != null) {
                                String str = "primary";
                                String strReplace = externalStoragePublicDirectory.getAbsolutePath().replace('\\', '/');
                                String strReplace2 = Environment.getExternalStorageDirectory().getAbsolutePath().replace('\\', '/');
                                if (strReplace.startsWith(strReplace2)) {
                                    strReplace = strReplace.substring(strReplace2.length());
                                }
                                while (strReplace.startsWith("/")) {
                                    strReplace = strReplace.substring(1);
                                }
                                if (strReplace.length() != 0) {
                                    str = "primary:" + strReplace;
                                }
                                uriBuildDocumentUri = DocumentsContract.buildDocumentUri("com.android.externalstorage.documents", str);
                            } else {
                                uriBuildDocumentUri = null;
                            }
                        }
                        break;
                    }
                    if (uriBuildDocumentUri != null) {
                        intent.putExtra("android.provider.extra.INITIAL_URI", uriBuildDocumentUri);
                    }
                    try {
                        activity.startActivityForResult(intent, 8216);
                        AbstractC0169w.m276W0(activity, "请选择系统允许的最高层目录，授权将覆盖该目录及全部子目录");
                    } catch (Throwable th) {
                        AbstractC0169w.f178r = null;
                        AbstractC0169w.m276W0(activity, "无法打开目录授权");
                        HookEntry.log("local voice tree picker failed: " + th.getClass().getSimpleName() + ": " + AbstractC0169w.m242F0(th.getMessage()));
                        return;
                    }
                }
                break;
            default:
                final Activity activity2 = this.f867c;
                final ClassLoader classLoader2 = this.f868d;
                final C0410pd c0410pd2 = this.f869e;
                final C0193e2 c0193e2 = (C0193e2) this.f866b;
                final EditText editText = new EditText(activity2);
                editText.setSingleLine(true);
                editText.setHint("表情名称（可选）");
                editText.setInputType(1);
                editText.setTextSize(16.0f);
                editText.setPadding(AbstractC0225g2.m421g(activity2, 12.0f), 0, AbstractC0225g2.m421g(activity2, 12.0f), 0);
                editText.setBackground(AbstractC0225g2.m428n(Color.rgb(245, 246, 249), AbstractC0225g2.m421g(activity2, 9.0f), Color.rgb(225, 229, 236), AbstractC0225g2.m421g(activity2, 1.0f)));
                final EditText editText2 = new EditText(activity2);
                editText2.setSingleLine(true);
                editText2.setHint("文件夹（可选）");
                editText2.setInputType(1);
                editText2.setTextSize(16.0f);
                editText2.setPadding(AbstractC0225g2.m421g(activity2, 12.0f), 0, AbstractC0225g2.m421g(activity2, 12.0f), 0);
                editText2.setBackground(AbstractC0225g2.m428n(Color.rgb(245, 246, 249), AbstractC0225g2.m421g(activity2, 9.0f), Color.rgb(225, 229, 236), AbstractC0225g2.m421g(activity2, 1.0f)));
                if (!"__uncategorized__".equals(c0193e2.f222i)) {
                    editText2.setText(AbstractC0260i5.m532G1(c0193e2.f222i));
                }
                C0540y c0540yM416b = AbstractC0225g2.m416b(activity2, "上传公开表情", "审核通过后，所有 Elaris 用户都可以看到并发送。");
                final Dialog dialog = (Dialog) c0540yM416b.f1082b;
                LinearLayout linearLayout = (LinearLayout) c0540yM416b.f1081a;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, AbstractC0225g2.m421g(activity2, 48.0f));
                layoutParams.topMargin = AbstractC0225g2.m421g(activity2, 12.0f);
                linearLayout.addView(editText, layoutParams);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, AbstractC0225g2.m421g(activity2, 48.0f));
                layoutParams2.topMargin = AbstractC0225g2.m421g(activity2, 8.0f);
                linearLayout.addView(editText2, layoutParams2);
                LinearLayout linearLayout2 = new LinearLayout(activity2);
                linearLayout2.setGravity(16);
                TextView textViewM420f = AbstractC0225g2.m420f(activity2, "取消");
                TextView textViewM420f2 = AbstractC0225g2.m420f(activity2, "选择图片");
                linearLayout2.addView(textViewM420f, new LinearLayout.LayoutParams(0, AbstractC0225g2.m421g(activity2, 42.0f), 1.0f));
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, AbstractC0225g2.m421g(activity2, 42.0f), 1.0f);
                layoutParams3.leftMargin = AbstractC0225g2.m421g(activity2, 10.0f);
                linearLayout2.addView(textViewM420f2, layoutParams3);
                linearLayout.addView(linearLayout2, AbstractC0225g2.m417c(activity2));
                textViewM420f.setOnClickListener(new ViewOnClickListenerC0414q1(dialog, 1));
                textViewM420f2.setOnClickListener(new View.OnClickListener(activity2, classLoader2, c0410pd2, c0193e2, editText, editText2, dialog) { // from class: t1

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ Activity f874a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C0193e2 f875b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ EditText f876c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ EditText f877d;

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ Dialog f878e;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    {
                        this.f875b = c0193e2;
                        this.f876c = editText;
                        this.f877d = editText2;
                        this.f878e = dialog;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Activity activity3 = this.f874a;
                        C0193e2 c0193e22 = this.f875b;
                        EditText editText3 = this.f876c;
                        EditText editText4 = this.f877d;
                        Dialog dialog2 = this.f878e;
                        AbstractC0225g2.f298h = new C0209f2(activity3, c0193e22, editText3.getText() == null ? "" : editText3.getText().toString(), editText4.getText() != null ? editText4.getText().toString() : "");
                        Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                        intent2.addCategory("android.intent.category.OPENABLE");
                        intent2.setType("image/*");
                        intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/jpeg", "image/png", "image/gif", "image/webp"});
                        try {
                            dialog2.dismiss();
                            activity3.startActivityForResult(intent2, 8279);
                        } catch (Throwable unused5) {
                            AbstractC0225g2.f298h = null;
                            AbstractC0225g2.m427m(c0193e22, "无法打开图片选择器");
                        }
                    }
                });
                AbstractC0225g2.m430p(dialog, activity2);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0459se(Dialog dialog, Activity activity, ClassLoader classLoader, C0410pd c0410pd, int i) {
        this.f865a = i;
        this.f866b = dialog;
        this.f867c = activity;
        this.f868d = classLoader;
        this.f869e = c0410pd;
    }
}
