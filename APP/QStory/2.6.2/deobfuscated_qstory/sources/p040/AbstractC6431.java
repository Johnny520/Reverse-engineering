package p040;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.foundation.lazy.layout.C0707;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.client.plugins.AbstractC3932;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC5543;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5561;
import p027.DialogC6300;
import p175.AbstractC7738;

/* JADX INFO: renamed from: 飘花落叶言世哲苏兰楪子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6431 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String f17619;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f17622 = AbstractC3932.m8313().concat("/Voice/");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AtomicLong f17621 = new AtomicLong();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final AtomicBoolean f17620 = new AtomicBoolean();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ScrollView m11934(final Dialog dialog, final Context context, final String str) {
        String str2 = f17622;
        f17620.set(str.equals(new File(str2).getAbsolutePath()) || str.equals(str2));
        final File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        f17619 = file.getParent();
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(15.0f);
        gradientDrawable.setAlpha(200);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            gradientDrawable.setPadding(30, 15, 15, 15);
        }
        gradientDrawable.setStroke(2, context.getColor(R.color.___res_0x24060483));
        final GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(15.0f);
        gradientDrawable2.setAlpha(200);
        if (i >= 29) {
            gradientDrawable2.setPadding(30, 15, 15, 15);
        }
        gradientDrawable2.setStroke(2, context.getColor(R.color.___res_0x2406047e));
        ScrollView scrollView = (ScrollView) LayoutInflater.from(context).inflate(R.layout.send_voice_layout, (ViewGroup) null);
        final LinearLayout linearLayout = (LinearLayout) scrollView.findViewById(R.id.send_voice_layout);
        linearLayout.post(new Runnable() { // from class: 飘花落叶言世哲苏兰楪子.飘花落叶言子楪世哲苏兰
            @Override // java.lang.Runnable
            public final void run() {
                final Context context2 = context;
                TextView textView = new TextView(context2);
                textView.setText("\u4e0a\u4e00\u7ea7:" + AbstractC6431.f17619);
                textView.setTextColor(Color.parseColor("#000000"));
                textView.setTextSize(10.0f);
                final Dialog dialog2 = dialog;
                textView.setOnClickListener(new ViewOnClickListenerC5561(dialog2, 7, context2));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(30, 10, 15, 5);
                LinearLayout linearLayout2 = linearLayout;
                linearLayout2.addView(textView, layoutParams);
                File file2 = file;
                List<File> listAsList = Arrays.asList(file2.listFiles());
                listAsList.sort(new C0707(7));
                boolean z = true;
                for (final File file3 : listAsList) {
                    if (!file3.getAbsolutePath().equals(file2.getAbsolutePath())) {
                        TextView textView2 = new TextView(context2);
                        textView2.setText(file3.getName());
                        textView2.setTextColor(Color.parseColor("#80000000"));
                        textView2.setPadding(30, 15, 15, 15);
                        textView2.setTextSize(20.0f);
                        final String str3 = str;
                        textView2.setOnLongClickListener(new View.OnLongClickListener() { // from class: 飘花落叶言世哲苏兰楪子.飘花落叶言子楪世哲兰苏
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                Activity activityM13031 = AbstractC7738.m13031();
                                DialogC6300 dialogC6300 = new DialogC6300(activityM13031);
                                RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(activityM13031).inflate(R.layout.save_voice_layout, (ViewGroup) null, false);
                                TextView textView3 = (TextView) relativeLayout.findViewById(R.id.save_voice_title);
                                textView3.setText("\u5220\u9664\u6b64\u6587\u4ef6");
                                textView3.setTextColor(activityM13031.getColor(R.color.____res_0x2406048a));
                                EditText editText = (EditText) relativeLayout.findViewById(R.id.voice_name);
                                File file4 = file3;
                                editText.setText(file4.getName());
                                editText.addTextChangedListener(new C6432(editText, file4, dialogC6300));
                                Button button = (Button) relativeLayout.findViewById(R.id.yes_save_voice);
                                button.setText("\u5220\u9664");
                                button.setOnClickListener(new ViewOnClickListenerC5561(file4, dialogC6300));
                                Button button2 = (Button) relativeLayout.findViewById(R.id.save_voice_close);
                                button2.setText("\u91cd\u547d\u540d");
                                button2.setOnClickListener(new ViewOnClickListenerC5543(editText, file4, dialogC6300));
                                dialogC6300.setContentView(relativeLayout);
                                final Dialog dialog3 = dialog2;
                                final Context context3 = context2;
                                final String str4 = str3;
                                dialogC6300.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: 飘花落叶言世哲苏兰楪子.飘花落叶言子楪世兰苏哲
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        Context context4 = context3;
                                        String str5 = str4;
                                        Dialog dialog4 = dialog3;
                                        dialog4.setContentView(AbstractC6431.m11934(dialog4, context4, str5));
                                    }
                                });
                                dialogC6300.show();
                                return true;
                            }
                        });
                        if (file3.isDirectory()) {
                            textView2.setBackground(gradientDrawable);
                        }
                        if (file3.isFile()) {
                            textView2.setBackground(gradientDrawable2);
                        }
                        textView2.setOnClickListener(new ViewOnClickListenerC5543(file3, dialog2, context2));
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams2.setMargins(10, z ? 15 : 10, 10, 5);
                        linearLayout2.addView(textView2, layoutParams2);
                        z = false;
                    }
                }
                if (z) {
                    TextView textView3 = new TextView(context2);
                    textView3.setText("\u5f53\u524d\u76ee\u5f55\u65e0\u6587\u4ef6");
                    textView3.setTextColor(Color.parseColor("#80000000"));
                    textView3.setTextSize(20.0f);
                    textView3.setGravity(17);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams3.setMargins(30, 30, 15, 5);
                    linearLayout2.addView(textView3, layoutParams3);
                }
            }
        });
        f17621.set(file.lastModified());
        return scrollView;
    }
}
