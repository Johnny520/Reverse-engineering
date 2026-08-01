package p061e;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import p068h.DialogInterfaceOnKeyListenerC0595n;
import p093v.C1023h;

/* JADX INFO: renamed from: e.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0531g {

    /* JADX INFO: renamed from: a */
    public final int f1746a;

    /* JADX INFO: renamed from: b */
    public final Object f1747b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0531g(Context context) {
        int iM1070h = DialogInterfaceC0532h.m1070h(context, 0);
        this.f1747b = new C0527c(new ContextThemeWrapper(context, DialogInterfaceC0532h.m1070h(context, iM1070h)));
        this.f1746a = iM1070h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX INFO: renamed from: a */
    public DialogInterfaceC0532h m1069a() {
        C0527c c0527c = (C0527c) this.f1747b;
        DialogInterfaceC0532h dialogInterfaceC0532h = new DialogInterfaceC0532h(c0527c.f1712a, this.f1746a);
        View view = c0527c.f1716e;
        C0530f c0530f = dialogInterfaceC0532h.f1748f;
        if (view != null) {
            c0530f.f1736n = view;
        } else {
            CharSequence charSequence = c0527c.f1715d;
            if (charSequence != null) {
                c0530f.f1726d = charSequence;
                TextView textView = c0530f.f1734l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0527c.f1714c;
            if (drawable != null) {
                c0530f.f1732j = drawable;
                ImageView imageView = c0530f.f1733k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0530f.f1733k.setImageDrawable(drawable);
                }
            }
        }
        if (c0527c.f1718g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0527c.f1713b.inflate(c0530f.f1740r, (ViewGroup) null);
            int i2 = c0527c.f1720i ? c0530f.f1741s : c0530f.f1742t;
            Object obj = c0527c.f1718g;
            ?? c0529e = obj;
            if (obj == null) {
                c0529e = new C0529e(c0527c.f1712a, i2, R.id.text1, null);
            }
            c0530f.f1737o = c0529e;
            c0530f.f1738p = c0527c.f1721j;
            if (c0527c.f1719h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0526b(c0527c, c0530f));
            }
            if (c0527c.f1720i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0530f.f1727e = alertController$RecycleListView;
        }
        dialogInterfaceC0532h.setCancelable(true);
        dialogInterfaceC0532h.setCanceledOnTouchOutside(true);
        dialogInterfaceC0532h.setOnCancelListener(null);
        dialogInterfaceC0532h.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC0595n dialogInterfaceOnKeyListenerC0595n = c0527c.f1717f;
        if (dialogInterfaceOnKeyListenerC0595n != null) {
            dialogInterfaceC0532h.setOnKeyListener(dialogInterfaceOnKeyListenerC0595n);
        }
        return dialogInterfaceC0532h;
    }

    public C0531g(int i2, C1023h[] c1023hArr) {
        this.f1746a = i2;
        this.f1747b = c1023hArr;
    }
}
