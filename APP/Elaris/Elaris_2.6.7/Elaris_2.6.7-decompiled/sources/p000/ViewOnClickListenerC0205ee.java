package p000;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p001mr.elaris.AbstractC0169w;
import com.p001mr.elaris.HookEntry;
import java.io.File;

/* JADX INFO: renamed from: ee */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0205ee implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Dialog f237a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f238b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0515w6 f239c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ClassLoader f240d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0410pd f241e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0347n9 f242f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnClickListenerC0205ee(Dialog dialog, Activity activity, C0515w6 c0515w6, ClassLoader classLoader, C0410pd c0410pd, C0347n9 c0347n9) {
        this.f237a = dialog;
        this.f238b = activity;
        this.f239c = c0515w6;
        this.f240d = classLoader;
        this.f241e = c0410pd;
        this.f242f = c0347n9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        Dialog dialog;
        try {
            this.f237a.dismiss();
        } catch (Throwable unused) {
        }
        C0515w6 c0515w6 = this.f239c;
        Activity activity = this.f238b;
        AbstractC0169w.m290d(activity, c0515w6);
        if (activity != null) {
            C0347n9 c0347n9 = this.f242f;
            File file = c0347n9.f592a;
            if (!c0347n9.f599h && ((file != null && file.exists() && file.isFile()) || c0347n9.f593b != null)) {
                if (!AbstractC0169w.m291d0(c0347n9.f594c, c0347n9.f596e)) {
                    AbstractC0169w.m276W0(activity, "请选择 QQ 语音或可解码的音频文件");
                    return;
                }
                Activity applicationContext = activity.getApplicationContext() == null ? activity : activity.getApplicationContext();
                Handler handler = new Handler(Looper.getMainLooper());
                C0507ve c0507ve = new C0507ve();
                int iHotReloadGeneration = HookEntry.hotReloadGeneration();
                if (activity.isFinishing() || activity.isDestroyed()) {
                    i = 1;
                    dialog = null;
                } else {
                    Dialog dialog2 = new Dialog(activity);
                    try {
                        dialog2.requestWindowFeature(1);
                    } catch (Throwable unused2) {
                    }
                    AbstractC0486u9.m1051d(dialog2);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(AbstractC0169w.m322t(activity, 18.0f), AbstractC0169w.m322t(activity, 16.0f), AbstractC0169w.m322t(activity, 18.0f), AbstractC0169w.m322t(activity, 14.0f));
                    linearLayout.setBackground(AbstractC0169w.m307l0(activity));
                    TextView textView = new TextView(activity);
                    textView.setText("语音处理");
                    textView.setTextColor(AbstractC0486u9.m1045G(activity));
                    textView.setTextSize(17.0f);
                    Typeface typeface = Typeface.DEFAULT_BOLD;
                    textView.setTypeface(typeface);
                    linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
                    TextView textView2 = new TextView(activity);
                    textView2.setText("正在处理语音，可取消");
                    textView2.setTextColor(AbstractC0486u9.m1043E(activity));
                    textView2.setTextSize(13.0f);
                    textView2.setPadding(0, AbstractC0169w.m322t(activity, 8.0f), 0, AbstractC0169w.m322t(activity, 12.0f));
                    linearLayout.addView(textView2, new LinearLayout.LayoutParams(-1, -2));
                    TextView textView3 = new TextView(activity);
                    textView3.setText("取消");
                    textView3.setGravity(17);
                    textView3.setTextColor(AbstractC0486u9.m1050c(activity));
                    textView3.setTypeface(typeface);
                    textView3.setBackground(AbstractC0169w.m301i0(activity));
                    textView3.setOnClickListener(new ViewOnClickListenerC0019b2(c0507ve, dialog2, 2));
                    linearLayout.addView(textView3, new LinearLayout.LayoutParams(-1, AbstractC0169w.m322t(activity, 36.0f)));
                    dialog2.setContentView(linearLayout);
                    try {
                        dialog2.show();
                        Window window = dialog2.getWindow();
                        if (window != null) {
                            window.setBackgroundDrawableResource(R.color.transparent);
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            attributes.width = Math.max(AbstractC0169w.m322t(activity, 250.0f), Math.min(AbstractC0169w.m322t(activity, 390.0f), activity.getResources().getDisplayMetrics().widthPixels - AbstractC0169w.m322t(activity, 60.0f)));
                            attributes.height = -2;
                            attributes.dimAmount = 0.4f;
                            window.setAttributes(attributes);
                        }
                        dialog = dialog2;
                        i = 1;
                    } catch (Throwable unused3) {
                        i = 1;
                        dialog = null;
                    }
                }
                boolean[] zArr = new boolean[i];
                zArr[0] = false;
                if (dialog != null) {
                    dialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC0336me(zArr, c0507ve, 0));
                }
                new Thread(new RunnableC0352ne(applicationContext, c0347n9, c0507ve, handler, iHotReloadGeneration, activity, this.f240d, this.f241e, zArr, dialog), "Elaris-LocalVoiceSend").start();
                return;
            }
        }
        AbstractC0169w.m276W0(activity, "本地语音读取失败");
    }
}
