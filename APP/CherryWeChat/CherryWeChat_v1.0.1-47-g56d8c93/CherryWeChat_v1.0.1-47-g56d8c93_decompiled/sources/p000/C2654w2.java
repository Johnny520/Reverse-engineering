package p000;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: renamed from: w2 */
/* JADX INFO: loaded from: classes.dex */
public class C2654w2 {

    /* JADX INFO: renamed from: a */
    public final C2482s2 f9188a;

    /* JADX INFO: renamed from: b */
    public final int f9189b;

    public C2654w2(Context context) {
        this(context, DialogInterfaceC2697x2.m5271e(context, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public DialogInterfaceC2697x2 create() {
        C2482s2 c2482s2 = this.f9188a;
        DialogInterfaceC2697x2 dialogInterfaceC2697x2 = new DialogInterfaceC2697x2(c2482s2.f8718a, this.f9189b);
        View view = c2482s2.f8722e;
        C2611v2 c2611v2 = dialogInterfaceC2697x2.f9274f;
        if (view != null) {
            c2611v2.f9054v = view;
        } else {
            CharSequence charSequence = c2482s2.f8721d;
            if (charSequence != null) {
                c2611v2.f9036d = charSequence;
                TextView textView = c2611v2.f9052t;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c2482s2.f8720c;
            if (drawable != null) {
                c2611v2.f9050r = drawable;
                ImageView imageView = c2611v2.f9051s;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c2611v2.f9051s.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c2482s2.f8723f;
        if (charSequence2 != null) {
            c2611v2.m5121c(-1, charSequence2, c2482s2.f8724g);
        }
        CharSequence charSequence3 = c2482s2.f8725h;
        if (charSequence3 != null) {
            c2611v2.m5121c(-2, charSequence3, c2482s2.f8726i);
        }
        if (c2482s2.f8728k != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c2482s2.f8719b.inflate(c2611v2.f9058z, (ViewGroup) null);
            int i = c2482s2.f8731n ? c2611v2.f9028A : c2611v2.f9029B;
            Object obj = c2482s2.f8728k;
            ?? c2568u2 = obj;
            if (obj == null) {
                c2568u2 = new C2568u2(c2482s2.f8718a, i, R.id.text1, null);
            }
            c2611v2.f9055w = c2568u2;
            c2611v2.f9056x = c2482s2.f8732o;
            if (c2482s2.f8729l != null) {
                alertController$RecycleListView.setOnItemClickListener(new C2439r2(c2482s2, c2611v2));
            }
            if (c2482s2.f8731n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c2611v2.f9037e = alertController$RecycleListView;
        }
        View view2 = c2482s2.f8730m;
        if (view2 != null) {
            c2611v2.f9038f = view2;
            c2611v2.f9039g = false;
        }
        dialogInterfaceC2697x2.setCancelable(true);
        dialogInterfaceC2697x2.setCanceledOnTouchOutside(true);
        dialogInterfaceC2697x2.setOnCancelListener(null);
        dialogInterfaceC2697x2.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC2247mr dialogInterfaceOnKeyListenerC2247mr = c2482s2.f8727j;
        if (dialogInterfaceOnKeyListenerC2247mr != null) {
            dialogInterfaceC2697x2.setOnKeyListener(dialogInterfaceOnKeyListenerC2247mr);
        }
        return dialogInterfaceC2697x2;
    }

    public Context getContext() {
        return this.f9188a.f8718a;
    }

    public C2654w2 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        C2482s2 c2482s2 = this.f9188a;
        c2482s2.f8725h = c2482s2.f8718a.getText(i);
        c2482s2.f8726i = onClickListener;
        return this;
    }

    public C2654w2 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        C2482s2 c2482s2 = this.f9188a;
        c2482s2.f8723f = c2482s2.f8718a.getText(i);
        c2482s2.f8724g = onClickListener;
        return this;
    }

    public C2654w2 setTitle(CharSequence charSequence) {
        this.f9188a.f8721d = charSequence;
        return this;
    }

    public C2654w2 setView(View view) {
        this.f9188a.f8730m = view;
        return this;
    }

    public C2654w2(Context context, int i) {
        this.f9188a = new C2482s2(new ContextThemeWrapper(context, DialogInterfaceC2697x2.m5271e(context, i)));
        this.f9189b = i;
    }
}
