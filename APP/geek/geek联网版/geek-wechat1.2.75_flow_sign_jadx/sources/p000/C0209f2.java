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
public final class C0209f2 implements InterfaceC0801v0 {

    /* JADX INFO: renamed from: a */
    public final int f1721a;

    /* JADX INFO: renamed from: b */
    public final Object f1722b;

    public C0209f2(Context context) {
        int iM1123h = DialogC0246g2.m1123h(context, 0);
        this.f1722b = new C0053b2(new ContextThemeWrapper(context, DialogC0246g2.m1123h(context, iM1123h)));
        this.f1721a = iM1123h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX INFO: renamed from: a */
    public DialogC0246g2 m1071a() {
        C0053b2 c0053b2 = (C0053b2) this.f1722b;
        DialogC0246g2 dialogC0246g2 = new DialogC0246g2(c0053b2.f655a, this.f1721a);
        View view = c0053b2.f659e;
        C0172e2 c0172e2 = dialogC0246g2.f1862f;
        if (view != null) {
            c0172e2.f1478n = view;
        } else {
            CharSequence charSequence = c0053b2.f658d;
            if (charSequence != null) {
                c0172e2.f1468d = charSequence;
                TextView textView = c0172e2.f1476l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0053b2.f657c;
            if (drawable != null) {
                c0172e2.f1474j = drawable;
                ImageView imageView = c0172e2.f1475k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0172e2.f1475k.setImageDrawable(drawable);
                }
            }
        }
        if (c0053b2.f661g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0053b2.f656b.inflate(c0172e2.f1482r, (ViewGroup) null);
            int i = c0053b2.f663i ? c0172e2.f1483s : c0172e2.f1484t;
            Object obj = c0053b2.f661g;
            ?? c0136d2 = obj;
            if (obj == null) {
                c0136d2 = new C0136d2(c0053b2.f655a, i, R.id.text1, null);
            }
            c0172e2.f1479o = c0136d2;
            c0172e2.f1480p = c0053b2.f664j;
            if (c0053b2.f662h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0003a2(c0053b2, c0172e2));
            }
            if (c0053b2.f663i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0172e2.f1469e = alertController$RecycleListView;
        }
        dialogC0246g2.setCancelable(true);
        dialogC0246g2.setCanceledOnTouchOutside(true);
        dialogC0246g2.setOnCancelListener(null);
        dialogC0246g2.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0683ru dialogInterfaceOnKeyListenerC0683ru = c0053b2.f660f;
        if (dialogInterfaceOnKeyListenerC0683ru != null) {
            dialogC0246g2.setOnKeyListener(dialogInterfaceOnKeyListenerC0683ru);
        }
        return dialogC0246g2;
    }

    @Override // p000.InterfaceC0801v0
    /* JADX INFO: renamed from: d */
    public boolean mo1072d(View view) {
        ((BottomSheetBehavior) this.f1722b).m674B(this.f1721a);
        return true;
    }

    public C0209f2(int i, C0338il[] c0338ilArr) {
        this.f1721a = i;
        this.f1722b = c0338ilArr;
    }

    public C0209f2(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f1722b = bottomSheetBehavior;
        this.f1721a = i;
    }
}
