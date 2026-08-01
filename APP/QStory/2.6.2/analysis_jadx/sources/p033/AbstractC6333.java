package p033;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.RunnableC0099;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import com.bumptech.glide.C3060;
import com.bumptech.glide.C3061;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.bumptech.glide.ComponentCallbacks2C3063;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.util.C3763;
import com.lxj.xpopup.core.C3783;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5561;
import p035.AbstractC6340;

/* JADX INFO: renamed from: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6333 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C6327 f17447;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String f17448 = AbstractC3056.m6668(-3937561979095614887L);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m11886(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m11887(Context context) {
        AbstractC3065.m6858(context);
        C6327 c6327 = new C6327(new C3763(context, 1));
        f17447 = c6327;
        C3783 c3783 = new C3783();
        c3783.f11809 = true;
        c6327.popupInfo = c3783;
        c6327.show();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m11888(Context context, String str, String str2) {
        f17448 = AbstractC3056.m6668(-3937561979095614887L);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.emo_pre_save, (ViewGroup) null);
        final ImageView imageView = (ImageView) linearLayout.findViewById(R.id.emo_pre_container);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        C6329 c6329 = new C6329();
        c6329.f17441 = str;
        c6329.f17443 = 2;
        c6329.f17442 = str2.toUpperCase(Locale.ROOT);
        if (str.startsWith(AbstractC3056.m6668(-3937561291900847527L))) {
            AbstractC6324.f17427.submit(new RunnableC0099(c6329, 11, new RunnableC0099(c6329, 12, imageView)));
        } else {
            c6329.f17444 = str;
            ((C3061) ComponentCallbacks2C3057.m6720(AbstractC6340.f17460).m6754(new File(c6329.f17444)).m6554()).m6744(imageView);
        }
        ArrayList<String> arrayListM11884 = AbstractC6328.m11884();
        RadioGroup radioGroup = (RadioGroup) linearLayout.findViewById(R.id.emo_pre_list_choser);
        for (String str3 : arrayListM11884) {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setText(str3);
            radioButton.setTextSize(16.0f);
            radioButton.setTextColor(context.getResources().getColor(R.color.font_plugin, null));
            radioButton.setOnCheckedChangeListener(new C6323(str3, 0));
            radioGroup.addView(radioButton);
        }
        ((Button) linearLayout.findViewById(R.id.createNew)).setOnClickListener(new ViewOnClickListenerC5561(context, 3, radioGroup));
        new AlertDialog.Builder(context, m11886(context) ? 2 : 3).setTitle(AbstractC3056.m6668(-3937590257160291751L)).setView(linearLayout).setNeutralButton(AbstractC3056.m6668(-3937590175555913127L), new DialogInterfaceOnClickListenerC6322(c6329, str2)).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: 飘花落叶言世哲楪兰子苏.飘花落叶言子楪世兰苏哲
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ComponentCallbacks2C3063 componentCallbacks2C3063M6720 = ComponentCallbacks2C3057.m6720(AbstractC6340.f17460);
                componentCallbacks2C3063M6720.getClass();
                componentCallbacks2C3063M6720.m6750(new C3060(imageView));
            }
        }).show();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11889(ArrayList arrayList, ArrayList arrayList2, Activity activity) {
        new AlertDialog.Builder(activity, m11886(activity) ? 2 : 3).setTitle(AbstractC3056.m6668(-3937590154081076647L)).setItems((CharSequence[]) arrayList2.toArray(new String[0]), new DialogInterfaceOnClickListenerC6320(arrayList, arrayList2, activity, 0)).setOnDismissListener(new DialogInterfaceOnDismissListenerC6330(0)).show();
    }
}
