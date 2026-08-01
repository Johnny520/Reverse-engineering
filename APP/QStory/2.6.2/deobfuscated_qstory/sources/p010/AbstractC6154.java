package p010;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.material.ripple.RunnableC1107;
import com.bumptech.glide.AbstractC3056;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6154 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Toast f16772;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static RunnableC1107 f16773;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static WeakReference f16774;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Handler f16775 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m11561(Object obj) {
        f16775.post(new RunnableC6155(String.valueOf(obj), 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m11562(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static LinearLayout m11563(Context context, String str) {
        boolean z = (context.getResources().getConfiguration().uiMode & 48) == 32;
        String strM6668 = AbstractC3056.m6668(z ? -3937646929253762471L : -3937646963613500839L);
        String strM66682 = AbstractC3056.m6668(z ? -3937646860534285735L : -3937646894894024103L);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        int iM11562 = m11562(context, 18.0f);
        int iM115622 = m11562(context, 12.0f);
        linearLayout.setPadding(iM11562, iM115622, iM11562, iM115622);
        int iM115623 = m11562(context, 12.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(strM6668));
        gradientDrawable.setCornerRadius(iM115623);
        gradientDrawable.setShape(0);
        linearLayout.setBackground(gradientDrawable);
        TextView textView = new TextView(context);
        textView.setTextColor(Color.parseColor(strM66682));
        textView.setTextSize(14.5f);
        textView.setText(str);
        textView.setGravity(17);
        linearLayout.addView(textView);
        return linearLayout;
    }
}
