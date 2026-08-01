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
import java.lang.ref.WeakReference;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏楪哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6185 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static Toast f17009;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static RunnableC1107 f17010;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static WeakReference f17011;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Handler f17012 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m11592(Object obj) {
        f17012.post(new RunnableC6186(String.valueOf(obj), 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m11593(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static LinearLayout m11594(Context context, String str) {
        boolean z = (context.getResources().getConfiguration().uiMode & 48) == 32;
        String strM13973 = AbstractC8405.m13973(z ? "喵呜喵呜喵喵喵喵~喵呜喵喵喵呜喵喵~喵喵呜呜呜呜呜呜~喵呜喵呜呜喵喵呜~喵喵呜喵喵喵喵喵~喵呜喵呜呜呜喵呜~喵喵呜喵喵呜喵喵" : "喵呜喵呜喵喵喵喵~喵喵呜呜喵喵呜呜~喵喵呜呜呜呜喵喵~喵喵呜喵呜呜呜喵~喵喵呜喵喵喵呜呜~喵喵呜喵呜喵呜喵~喵喵呜喵喵呜呜呜");
        String strM139732 = AbstractC8405.m13973(z ? "喵呜喵呜喵喵喵喵~喵喵呜呜喵喵喵喵~喵呜喵喵呜喵呜喵~喵喵呜喵呜呜喵呜~喵呜喵呜喵呜喵呜~喵喵呜喵呜喵喵呜~喵呜喵呜喵喵喵呜" : "喵呜喵呜喵喵喵喵~喵呜喵喵喵呜呜喵~喵呜喵喵呜喵喵呜~喵呜喵呜呜喵呜呜~喵呜喵呜喵呜呜喵~喵呜喵呜呜呜呜呜~喵呜喵呜喵喵呜喵");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        int iM11593 = m11593(context, 18.0f);
        int iM115932 = m11593(context, 12.0f);
        linearLayout.setPadding(iM11593, iM115932, iM11593, iM115932);
        int iM115933 = m11593(context, 12.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(strM13973));
        gradientDrawable.setCornerRadius(iM115933);
        gradientDrawable.setShape(0);
        linearLayout.setBackground(gradientDrawable);
        TextView textView = new TextView(context);
        textView.setTextColor(Color.parseColor(strM139732));
        textView.setTextSize(14.5f);
        textView.setText(str);
        textView.setGravity(17);
        linearLayout.addView(textView);
        return linearLayout;
    }
}
