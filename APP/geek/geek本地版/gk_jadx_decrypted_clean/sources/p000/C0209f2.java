package p000;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: f2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0209f2 implements InterfaceC0802v0 {

    /* JADX INFO: renamed from: a */
    public final int f1871a;

    /* JADX INFO: renamed from: b */
    public final Object f1872b;

    public C0209f2(Context context) {
        int iM1250h = DialogC0246g2.m1250h(context, 0);
        this.f1872b = new C0053b2(new ContextThemeWrapper(context, DialogC0246g2.m1250h(context, iM1250h)));
        this.f1871a = iM1250h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX INFO: renamed from: a */
    public DialogC0246g2 m1133a() {
        C0053b2 c0053b2 = (C0053b2) this.f1872b;
        DialogC0246g2 dialogC0246g2 = new DialogC0246g2(c0053b2.f715a, this.f1871a);
        View view = c0053b2.f719e;
        C0172e2 c0172e2 = dialogC0246g2.f2009f;
        if (view != null) {
            c0172e2.f1674n = view;
        } else {
            CharSequence charSequence = c0053b2.f718d;
            if (charSequence != null) {
                c0172e2.f1664d = charSequence;
                TextView textView = c0172e2.f1672l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0053b2.f717c;
            if (drawable != null) {
                c0172e2.f1670j = drawable;
                ImageView imageView = c0172e2.f1671k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0172e2.f1671k.setImageDrawable(drawable);
                }
            }
        }
        if (c0053b2.f721g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0053b2.f716b.inflate(c0172e2.f1678r, (ViewGroup) null);
            int i = c0053b2.f723i ? c0172e2.f1679s : c0172e2.f1680t;
            Object obj = c0053b2.f721g;
            ?? c0136d2 = obj;
            if (obj == null) {
                c0136d2 = new C0136d2(c0053b2.f715a, i, R.id.text1, null);
            }
            c0172e2.f1675o = c0136d2;
            c0172e2.f1676p = c0053b2.f724j;
            if (c0053b2.f722h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0003a2(c0053b2, c0172e2));
            }
            if (c0053b2.f723i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0172e2.f1665e = alertController$RecycleListView;
        }
        dialogC0246g2.setCancelable(true);
        dialogC0246g2.setCanceledOnTouchOutside(true);
        dialogC0246g2.setOnCancelListener(null);
        dialogC0246g2.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0461lu dialogInterfaceOnKeyListenerC0461lu = c0053b2.f720f;
        if (dialogInterfaceOnKeyListenerC0461lu != null) {
            dialogC0246g2.setOnKeyListener(dialogInterfaceOnKeyListenerC0461lu);
        }
        return dialogC0246g2;
    }

    @Override // p000.InterfaceC0802v0
    /* JADX INFO: renamed from: c */
    public boolean mo1134c(View view) {
        ((BottomSheetBehavior) this.f1872b).m716B(this.f1871a);
        return true;
    }

    public C0209f2(int i, C0265gl[] c0265glArr) {
        this.f1871a = i;
        this.f1872b = c0265glArr;
    }

    public C0209f2(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f1872b = bottomSheetBehavior;
        this.f1871a = i;
    }
}
