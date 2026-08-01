package p000;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.ImageDecoder;
import android.graphics.Typeface;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.p001mr.elaris.AbstractC0169w;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;

/* JADX INFO: renamed from: a2 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLongClickListenerC0003a2 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f10c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnLongClickListenerC0003a2(Object obj, Object obj2, int i) {
        this.f8a = i;
        this.f9b = obj;
        this.f10c = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0143  */
    @Override // android.view.View.OnLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onLongClick(View view) {
        Activity activity;
        int i = this.f8a;
        Object obj = this.f10c;
        Object obj2 = this.f9b;
        switch (i) {
            case 0:
                if (HookEntry.runtimeBool(Prefs.KEY_CLOUD_STICKER_PANEL)) {
                    Activity activity2 = null;
                    Context context = view == null ? null : view.getContext();
                    while (context instanceof ContextWrapper) {
                        if (context instanceof Activity) {
                            activity2 = (Activity) context;
                            if (activity2 == null) {
                                activity2 = HookEntry.topActivity();
                            }
                            activity = activity2;
                            if (activity != null) {
                                C0410pd c0410pdM316q = AbstractC0169w.m316q(activity, (ViewGroup) obj);
                                ClassLoader classLoader = (ClassLoader) obj2;
                                Dialog dialog = new Dialog(activity);
                                LinearLayout linearLayout = new LinearLayout(activity);
                                linearLayout.setOrientation(1);
                                linearLayout.setPadding(AbstractC0225g2.m421g(activity, 14.0f), AbstractC0225g2.m421g(activity, 12.0f), AbstractC0225g2.m421g(activity, 14.0f), AbstractC0225g2.m421g(activity, 12.0f));
                                linearLayout.setBackground(AbstractC0225g2.m428n(-1, AbstractC0225g2.m421g(activity, 16.0f), 0, 0));
                                LinearLayout linearLayout2 = new LinearLayout(activity);
                                linearLayout2.setGravity(16);
                                TextView textViewM431q = AbstractC0225g2.m431q(activity, "云端表情", 19, Color.rgb(23, 25, 30));
                                textViewM431q.setTypeface(Typeface.DEFAULT_BOLD);
                                linearLayout2.addView(textViewM431q, new LinearLayout.LayoutParams(0, -2, 1.0f));
                                TextView textViewM420f = AbstractC0225g2.m420f(activity, "上传");
                                linearLayout2.addView(textViewM420f, new LinearLayout.LayoutParams(AbstractC0225g2.m421g(activity, 64.0f), AbstractC0225g2.m421g(activity, 36.0f)));
                                linearLayout.addView(linearLayout2);
                                LinearLayout linearLayout3 = new LinearLayout(activity);
                                linearLayout3.setGravity(16);
                                linearLayout3.setPadding(0, AbstractC0225g2.m421g(activity, 8.0f), 0, AbstractC0225g2.m421g(activity, 6.0f));
                                EditText editText = new EditText(activity);
                                editText.setSingleLine(true);
                                editText.setHint("搜索表情");
                                editText.setTextSize(15.0f);
                                editText.setPadding(AbstractC0225g2.m421g(activity, 12.0f), 0, AbstractC0225g2.m421g(activity, 12.0f), 0);
                                editText.setBackground(AbstractC0225g2.m428n(Color.rgb(245, 246, 249), AbstractC0225g2.m421g(activity, 9.0f), 0, 0));
                                linearLayout3.addView(editText, new LinearLayout.LayoutParams(0, AbstractC0225g2.m421g(activity, 38.0f), 1.0f));
                                TextView textViewM420f2 = AbstractC0225g2.m420f(activity, "搜索");
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0225g2.m421g(activity, 62.0f), AbstractC0225g2.m421g(activity, 38.0f));
                                layoutParams.leftMargin = AbstractC0225g2.m421g(activity, 8.0f);
                                linearLayout3.addView(textViewM420f2, layoutParams);
                                linearLayout.addView(linearLayout3);
                                HorizontalScrollView horizontalScrollView = new HorizontalScrollView(activity);
                                horizontalScrollView.setHorizontalScrollBarEnabled(false);
                                LinearLayout linearLayout4 = new LinearLayout(activity);
                                linearLayout4.setOrientation(0);
                                linearLayout4.setGravity(16);
                                horizontalScrollView.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
                                linearLayout.addView(horizontalScrollView, new LinearLayout.LayoutParams(-1, AbstractC0225g2.m421g(activity, 38.0f)));
                                TextView textViewM431q2 = AbstractC0225g2.m431q(activity, c0410pdM316q == null ? "未识别当前会话，可浏览但无法发送" : "正在加载", 13, Color.rgb(108, 112, 122));
                                textViewM431q2.setPadding(0, 0, 0, AbstractC0225g2.m421g(activity, 8.0f));
                                linearLayout.addView(textViewM431q2);
                                ScrollView scrollView = new ScrollView(activity);
                                GridLayout gridLayout = new GridLayout(activity);
                                gridLayout.setColumnCount(5);
                                gridLayout.setAlignmentMode(0);
                                scrollView.addView(gridLayout, new FrameLayout.LayoutParams(-1, -2));
                                linearLayout.addView(scrollView, new LinearLayout.LayoutParams(-1, AbstractC0225g2.m421g(activity, 280.0f)));
                                dialog.setContentView(linearLayout);
                                Window window = dialog.getWindow();
                                if (window != null) {
                                    window.setBackgroundDrawableResource(R.color.transparent);
                                    WindowManager.LayoutParams attributes = window.getAttributes();
                                    attributes.width = Math.min(AbstractC0225g2.m421g(activity, 398.0f), activity.getResources().getDisplayMetrics().widthPixels - AbstractC0225g2.m421g(activity, 36.0f));
                                    attributes.height = -2;
                                    attributes.gravity = 17;
                                    window.setAttributes(attributes);
                                }
                                C0193e2 c0193e2 = new C0193e2(dialog, activity, classLoader, c0410pdM316q, gridLayout, linearLayout4, textViewM431q2);
                                textViewM420f2.setOnClickListener(new ViewOnClickListenerC0019b2(c0193e2, editText, 0));
                                textViewM420f.setOnClickListener(new ViewOnClickListenerC0459se(activity, classLoader, c0410pdM316q, c0193e2));
                                dialog.show();
                                AbstractC0225g2.m424j(c0193e2, "");
                                break;
                            }
                        } else {
                            Context baseContext = ((ContextWrapper) context).getBaseContext();
                            if (baseContext == context) {
                                if (context instanceof Activity) {
                                    activity2 = (Activity) context;
                                }
                                if (activity2 == null) {
                                }
                                activity = activity2;
                                if (activity != null) {
                                }
                            } else {
                                context = baseContext;
                            }
                        }
                    }
                    if (context instanceof Activity) {
                    }
                    if (activity2 == null) {
                    }
                    activity = activity2;
                    if (activity != null) {
                    }
                }
                break;
            default:
                final C0193e2 c0193e22 = (C0193e2) obj2;
                final C0307l1 c0307l1 = (C0307l1) obj;
                Activity activity3 = c0193e22.f215b;
                String str = c0307l1.f508b;
                if (str.isEmpty()) {
                    str = "表情预览";
                }
                C0540y c0540yM416b = AbstractC0225g2.m416b(activity3, str, "正在加载");
                final Dialog dialog2 = (Dialog) c0540yM416b.f1082b;
                LinearLayout linearLayout5 = (LinearLayout) c0540yM416b.f1081a;
                final TextView textView = (TextView) linearLayout5.getChildAt(1);
                final ImageView imageView = new ImageView(activity3);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setBackground(AbstractC0225g2.m428n(Color.rgb(244, 245, 248), AbstractC0225g2.m421g(activity3, 10.0f), 0, 0));
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, AbstractC0225g2.m421g(activity3, 250.0f));
                layoutParams2.topMargin = AbstractC0225g2.m421g(activity3, 12.0f);
                linearLayout5.addView(imageView, layoutParams2);
                LinearLayout linearLayout6 = new LinearLayout(activity3);
                linearLayout6.setGravity(16);
                TextView textViewM420f3 = AbstractC0225g2.m420f(activity3, "举报");
                TextView textViewM420f4 = AbstractC0225g2.m420f(activity3, "关闭");
                TextView textViewM420f5 = AbstractC0225g2.m420f(activity3, "发送");
                linearLayout6.addView(textViewM420f3, new LinearLayout.LayoutParams(0, AbstractC0225g2.m421g(activity3, 42.0f), 1.0f));
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, AbstractC0225g2.m421g(activity3, 42.0f), 1.0f);
                layoutParams3.leftMargin = AbstractC0225g2.m421g(activity3, 8.0f);
                linearLayout6.addView(textViewM420f4, layoutParams3);
                if (c0193e22.f217d != null) {
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, AbstractC0225g2.m421g(activity3, 42.0f), 1.0f);
                    layoutParams4.leftMargin = AbstractC0225g2.m421g(activity3, 8.0f);
                    linearLayout6.addView(textViewM420f5, layoutParams4);
                }
                linearLayout5.addView(linearLayout6, AbstractC0225g2.m417c(activity3));
                textViewM420f4.setOnClickListener(new ViewOnClickListenerC0414q1(dialog2, 2));
                textViewM420f5.setOnClickListener(new ViewOnClickListenerC0430r1(dialog2, c0193e22, c0307l1, 1));
                textViewM420f3.setOnClickListener(new ViewOnClickListenerC0430r1(dialog2, c0193e22, c0307l1, 2));
                dialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: v1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        Drawable drawable = imageView.getDrawable();
                        if (drawable instanceof AnimatedImageDrawable) {
                            ((AnimatedImageDrawable) drawable).stop();
                        }
                    }
                });
                AbstractC0225g2.m430p(dialog2, activity3);
                final int iM421g = AbstractC0225g2.m421g(activity3, 250.0f);
                AbstractC0225g2.f293c.execute(new Runnable() { // from class: w1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0193e2 c0193e23 = c0193e22;
                        C0307l1 c0307l12 = c0307l1;
                        final int i2 = iM421g;
                        final Dialog dialog3 = dialog2;
                        final TextView textView2 = textView;
                        final ImageView imageView2 = imageView;
                        Handler handler = AbstractC0225g2.f294d;
                        try {
                            final Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(AbstractC0260i5.m581X(c0193e23.f215b, c0307l12)), new ImageDecoder.OnHeaderDecodedListener() { // from class: x1
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                                    int iMax = Math.max(1, imageInfo.getSize().getWidth());
                                    int iMax2 = Math.max(1, imageInfo.getSize().getHeight());
                                    float f = i2;
                                    float f2 = iMax;
                                    float f3 = iMax2;
                                    float fMin = Math.min(f / f2, f / f3);
                                    imageDecoder.setTargetSize(Math.max(1, Math.round(f2 * fMin)), Math.max(1, Math.round(f3 * fMin)));
                                }
                            });
                            handler.post(new Runnable() { // from class: o1
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (dialog3.isShowing()) {
                                        TextView textView3 = textView2;
                                        textView3.setText("");
                                        textView3.setVisibility(8);
                                        ImageView imageView3 = imageView2;
                                        Drawable drawable = drawableDecodeDrawable;
                                        imageView3.setImageDrawable(drawable);
                                        if (drawable instanceof AnimatedImageDrawable) {
                                            AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) drawable;
                                            animatedImageDrawable.setRepeatCount(-1);
                                            animatedImageDrawable.start();
                                        }
                                    }
                                }
                            });
                        } catch (Throwable th) {
                            handler.post(new Runnable() { // from class: p1
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (dialog3.isShowing()) {
                                        textView2.setText(AbstractC0225g2.m425k(th));
                                    }
                                }
                            });
                        }
                    }
                });
                break;
        }
        return true;
    }
}
