package p061e;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.p055lu.wxmask272.R;
import java.util.WeakHashMap;
import p099y.AbstractC1039C;
import p099y.AbstractC1048L;

/* JADX INFO: renamed from: e.h */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC0532h extends AbstractDialogC0547w implements DialogInterface {

    /* JADX INFO: renamed from: f */
    public final C0530f f1748f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DialogInterfaceC0532h(ContextThemeWrapper contextThemeWrapper, int i2) {
        super(contextThemeWrapper, m1070h(contextThemeWrapper, i2));
        this.f1748f = new C0530f(getContext(), this, getWindow());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static int m1070h(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061e.AbstractDialogC0547w, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i2;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        C0530f c0530f = this.f1748f;
        c0530f.f1724b.setContentView(c0530f.f1739q);
        Window window = c0530f.f1725c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupM1068a = C0530f.m1068a(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM1068a2 = C0530f.m1068a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM1068a3 = C0530f.m1068a(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0530f.f1731i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0530f.f1731i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM1068a2.findViewById(android.R.id.message);
        c0530f.f1735m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c0530f.f1731i.removeView(c0530f.f1735m);
            if (c0530f.f1727e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0530f.f1731i.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(c0530f.f1731i);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(c0530f.f1727e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupM1068a2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupM1068a3.findViewById(android.R.id.button1);
        c0530f.f1728f = button;
        ViewOnClickListenerC0525a viewOnClickListenerC0525a = c0530f.f1745w;
        button.setOnClickListener(viewOnClickListenerC0525a);
        if (TextUtils.isEmpty(null)) {
            c0530f.f1728f.setVisibility(8);
            i2 = 0;
        } else {
            c0530f.f1728f.setText((CharSequence) null);
            c0530f.f1728f.setVisibility(0);
            i2 = 1;
        }
        Button button2 = (Button) viewGroupM1068a3.findViewById(android.R.id.button2);
        c0530f.f1729g = button2;
        button2.setOnClickListener(viewOnClickListenerC0525a);
        if (TextUtils.isEmpty(null)) {
            c0530f.f1729g.setVisibility(8);
        } else {
            c0530f.f1729g.setText((CharSequence) null);
            c0530f.f1729g.setVisibility(0);
            i2 |= 2;
        }
        Button button3 = (Button) viewGroupM1068a3.findViewById(android.R.id.button3);
        c0530f.f1730h = button3;
        button3.setOnClickListener(viewOnClickListenerC0525a);
        if (TextUtils.isEmpty(null)) {
            c0530f.f1730h.setVisibility(8);
        } else {
            c0530f.f1730h.setText((CharSequence) null);
            c0530f.f1730h.setVisibility(0);
            i2 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0530f.f1723a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i2 == 1) {
                Button button4 = c0530f.f1728f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i2 == 2) {
                Button button5 = c0530f.f1729g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i2 == 4) {
                Button button6 = c0530f.f1730h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i2 == 0) {
            viewGroupM1068a3.setVisibility(8);
        }
        if (c0530f.f1736n != null) {
            viewGroupM1068a.addView(c0530f.f1736n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0530f.f1733k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0530f.f1726d) || !c0530f.f1743u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0530f.f1733k.setVisibility(8);
                viewGroupM1068a.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0530f.f1734l = textView2;
                textView2.setText(c0530f.f1726d);
                Drawable drawable = c0530f.f1732j;
                if (drawable != null) {
                    c0530f.f1733k.setImageDrawable(drawable);
                } else {
                    c0530f.f1734l.setPadding(c0530f.f1733k.getPaddingLeft(), c0530f.f1733k.getPaddingTop(), c0530f.f1733k.getPaddingRight(), c0530f.f1733k.getPaddingBottom());
                    c0530f.f1733k.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i3 = (viewGroupM1068a == null || viewGroupM1068a.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupM1068a3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupM1068a2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i3 != 0) {
            NestedScrollView nestedScrollView2 = c0530f.f1731i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = c0530f.f1727e != null ? viewGroupM1068a.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM1068a2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0530f.f1727e;
        if (alertController$RecycleListView != null && (!z3 || i3 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i3 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f913b, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f914c);
        }
        if (!z2) {
            View view = c0530f.f1727e;
            if (view == null) {
                view = c0530f.f1731i;
            }
            if (view != null) {
                int i4 = (z3 ? 2 : 0) | i3;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = AbstractC1048L.f3662a;
                AbstractC1039C.m2255d(view, i4, 3);
                if (viewFindViewById11 != null) {
                    viewGroupM1068a2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM1068a2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0530f.f1727e;
        if (alertController$RecycleListView2 == null || (listAdapter = c0530f.f1737o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i5 = c0530f.f1738p;
        if (i5 > -1) {
            alertController$RecycleListView2.setItemChecked(i5, true);
            alertController$RecycleListView2.setSelection(i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1748f.f1731i;
        if (nestedScrollView == null || !nestedScrollView.m721j(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1748f.f1731i;
        if (nestedScrollView == null || !nestedScrollView.m721j(keyEvent)) {
            return super.onKeyUp(i2, keyEvent);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061e.AbstractDialogC0547w, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C0530f c0530f = this.f1748f;
        c0530f.f1726d = charSequence;
        TextView textView = c0530f.f1734l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
