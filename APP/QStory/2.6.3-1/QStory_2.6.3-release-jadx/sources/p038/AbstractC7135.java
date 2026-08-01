package p038;

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
import androidx.compose.foundation.lazy.layout.C1548;
import com.bumptech.glide.AbstractC3887;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.client.plugins.AbstractC4765;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC6375;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC6392;
import p044.DialogC7148;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世哲兰子楪苏.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7135 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String f17758;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f17761 = AbstractC4765.m8874().concat(AbstractC9234.m14532("喵呜喵呜呜呜喵喵~喵喵呜喵喵喵呜呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵喵呜~喵呜喵喵呜呜呜喵"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final AtomicLong f17760 = new AtomicLong();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final AtomicBoolean f17759 = new AtomicBoolean();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ScrollView m12386(final Dialog dialog, final Context context, final String str) {
        String str2 = f17761;
        f17759.set(str.equals(new File(str2).getAbsolutePath()) || str.equals(str2));
        final File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        f17758 = file.getParent();
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(15.0f);
        gradientDrawable.setAlpha(200);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            gradientDrawable.setPadding(30, 15, 15, 15);
        }
        gradientDrawable.setStroke(2, context.getColor(C0328R.color.___res_0x24060483));
        final GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(15.0f);
        gradientDrawable2.setAlpha(200);
        if (i >= 29) {
            gradientDrawable2.setPadding(30, 15, 15, 15);
        }
        gradientDrawable2.setStroke(2, context.getColor(C0328R.color.___res_0x2406047e));
        ScrollView scrollView = (ScrollView) LayoutInflater.from(context).inflate(C0328R.layout.send_voice_layout, (ViewGroup) null);
        final LinearLayout linearLayout = (LinearLayout) scrollView.findViewById(C0328R.id.send_voice_layout);
        linearLayout.post(new Runnable() { // from class: 飘花落叶言世哲兰子楪苏.飘花落叶言子楪世兰苏哲
            @Override // java.lang.Runnable
            public final void run() {
                final Context context2 = context;
                TextView textView = new TextView(context2);
                textView.setText(AbstractC9234.m14531(562) + AbstractC7135.f17758);
                textView.setTextColor(Color.parseColor(AbstractC9234.m14532("喵呜喵呜喵喵喵喵~喵呜喵喵喵呜喵呜~喵呜喵喵呜喵呜喵~喵呜喵呜呜喵喵喵~喵呜喵呜喵呜喵呜~喵呜喵呜呜呜喵喵~喵呜喵呜喵喵喵呜")));
                textView.setTextSize(10.0f);
                final Dialog dialog2 = dialog;
                textView.setOnClickListener(new ViewOnClickListenerC6392(dialog2, 2, context2));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(30, 10, 15, 5);
                LinearLayout linearLayout2 = linearLayout;
                linearLayout2.addView(textView, layoutParams);
                File file2 = file;
                List<File> listAsList = Arrays.asList(file2.listFiles());
                listAsList.sort(new C1548(6));
                boolean z = true;
                for (final File file3 : listAsList) {
                    if (!file3.getAbsolutePath().equals(file2.getAbsolutePath())) {
                        TextView textView2 = new TextView(context2);
                        textView2.setText(file3.getName());
                        textView2.setTextColor(Color.parseColor(AbstractC9234.m14531(563)));
                        textView2.setPadding(30, 15, 15, 15);
                        textView2.setTextSize(20.0f);
                        final String str3 = str;
                        textView2.setOnLongClickListener(new View.OnLongClickListener() { // from class: 飘花落叶言世哲兰子楪苏.飘花落叶言子楪世兰哲苏
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                Activity activityM7213 = AbstractC3887.m7213();
                                DialogC7148 dialogC7148 = new DialogC7148(activityM7213);
                                RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(activityM7213).inflate(C0328R.layout.save_voice_layout, (ViewGroup) null, false);
                                TextView textView3 = (TextView) relativeLayout.findViewById(C0328R.id.save_voice_title);
                                textView3.setText(AbstractC9234.m14531(559));
                                textView3.setTextColor(activityM7213.getColor(C0328R.color.____res_0x2406048a));
                                EditText editText = (EditText) relativeLayout.findViewById(C0328R.id.voice_name);
                                File file4 = file3;
                                editText.setText(file4.getName());
                                editText.addTextChangedListener(new C7134(editText, file4, dialogC7148));
                                Button button = (Button) relativeLayout.findViewById(C0328R.id.yes_save_voice);
                                button.setText(AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵呜~呜呜喵呜呜喵呜喵~呜喵喵喵喵喵喵呜~呜呜呜呜呜呜喵喵~呜呜喵喵呜喵喵喵"));
                                button.setOnClickListener(new ViewOnClickListenerC6392(file4, dialogC7148));
                                Button button2 = (Button) relativeLayout.findViewById(C0328R.id.save_voice_close);
                                button2.setText(AbstractC9234.m14531(560));
                                button2.setOnClickListener(new ViewOnClickListenerC6375(editText, file4, dialogC7148));
                                dialogC7148.setContentView(relativeLayout);
                                final Dialog dialog3 = dialog2;
                                final Context context3 = context2;
                                final String str4 = str3;
                                dialogC7148.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: 飘花落叶言世哲兰子楪苏.飘花落叶言子楪苏世哲兰
                                    @Override // android.content.DialogInterface.OnDismissListener
                                    public final void onDismiss(DialogInterface dialogInterface) {
                                        Context context4 = context3;
                                        String str5 = str4;
                                        Dialog dialog4 = dialog3;
                                        dialog4.setContentView(AbstractC7135.m12386(dialog4, context4, str5));
                                    }
                                });
                                dialogC7148.show();
                                return true;
                            }
                        });
                        if (file3.isDirectory()) {
                            textView2.setBackground(gradientDrawable);
                        }
                        if (file3.isFile()) {
                            textView2.setBackground(gradientDrawable2);
                        }
                        textView2.setOnClickListener(new ViewOnClickListenerC6375(file3, dialog2, context2));
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams2.setMargins(10, z ? 15 : 10, 10, 5);
                        linearLayout2.addView(textView2, layoutParams2);
                        z = false;
                    }
                }
                if (z) {
                    TextView textView3 = new TextView(context2);
                    textView3.setText(AbstractC9234.m14531(564));
                    textView3.setTextColor(Color.parseColor(AbstractC9234.m14531(563)));
                    textView3.setTextSize(20.0f);
                    textView3.setGravity(17);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams3.setMargins(30, 30, 15, 5);
                    linearLayout2.addView(textView3, layoutParams3);
                }
            }
        });
        f17760.set(file.lastModified());
        return scrollView;
    }
}
