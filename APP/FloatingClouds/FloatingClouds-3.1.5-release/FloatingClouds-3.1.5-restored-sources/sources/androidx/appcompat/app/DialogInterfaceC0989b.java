package androidx.appcompat.app;

import android.R;
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
import androidx.appcompat.C0983R;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.DialogInterfaceOnKeyListenerC0999g;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import p000a.C0181Jg;
import p000a.C0866ug;
import p000a.DialogC0416X0;

/* JADX INFO: renamed from: androidx.appcompat.app.b */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC0989b extends DialogC0416X0 implements DialogInterface {

    /* JADX INFO: renamed from: f */
    public final AlertController f3690f;

    /* JADX INFO: renamed from: androidx.appcompat.app.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final AlertController.C0985b f3691a;

        /* JADX INFO: renamed from: b */
        public final int f3692b;

        public a(Context context) {
            int iM2297f = DialogInterfaceC0989b.m2297f(context, 0);
            this.f3691a = new AlertController.C0985b(new ContextThemeWrapper(context, DialogInterfaceC0989b.m2297f(context, iM2297f)));
            this.f3692b = iM2297f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v1, types: [android.widget.ListAdapter] */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX INFO: renamed from: a */
        public final DialogInterfaceC0989b m2298a() {
            AlertController.C0985b c0985b = this.f3691a;
            DialogInterfaceC0989b dialogInterfaceC0989b = new DialogInterfaceC0989b(c0985b.f3677a, this.f3692b);
            View view = c0985b.f3681e;
            AlertController alertController = dialogInterfaceC0989b.f3690f;
            if (view != null) {
                alertController.f3664n = view;
            } else {
                CharSequence charSequence = c0985b.f3680d;
                if (charSequence != null) {
                    alertController.f3654d = charSequence;
                    TextView textView = alertController.f3662l;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = c0985b.f3679c;
                if (drawable != null) {
                    alertController.f3660j = drawable;
                    ImageView imageView = alertController.f3661k;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f3661k.setImageDrawable(drawable);
                    }
                }
            }
            if (c0985b.f3683g != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) c0985b.f3678b.inflate(alertController.f3668r, (ViewGroup) null);
                int i = c0985b.f3685i ? alertController.f3669s : alertController.f3670t;
                Object obj = c0985b.f3683g;
                ?? c0987d = obj;
                if (obj == null) {
                    c0987d = new AlertController.C0987d(c0985b.f3677a, i, R.id.text1, null);
                }
                alertController.f3665o = c0987d;
                alertController.f3666p = c0985b.f3686j;
                if (c0985b.f3684h != null) {
                    recycleListView.setOnItemClickListener(new C0988a(c0985b, alertController));
                }
                if (c0985b.f3685i) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f3655e = recycleListView;
            }
            dialogInterfaceC0989b.setCancelable(true);
            dialogInterfaceC0989b.setCanceledOnTouchOutside(true);
            dialogInterfaceC0989b.setOnCancelListener(null);
            dialogInterfaceC0989b.setOnDismissListener(null);
            DialogInterfaceOnKeyListenerC0999g dialogInterfaceOnKeyListenerC0999g = c0985b.f3682f;
            if (dialogInterfaceOnKeyListenerC0999g != null) {
                dialogInterfaceC0989b.setOnKeyListener(dialogInterfaceOnKeyListenerC0999g);
            }
            return dialogInterfaceC0989b;
        }
    }

    public DialogInterfaceC0989b(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, m2297f(contextThemeWrapper, i));
        this.f3690f = new AlertController(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: f */
    public static int m2297f(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0983R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p000a.DialogC0416X0, p000a.DialogC0078E3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f3690f;
        alertController.f3652b.setContentView(alertController.f3667q);
        int i2 = C0983R.id.parentPanel;
        Window window = alertController.f3653c;
        View viewFindViewById2 = window.findViewById(i2);
        View viewFindViewById3 = viewFindViewById2.findViewById(C0983R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(C0983R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(C0983R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(C0983R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(C0983R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(C0983R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(C0983R.id.buttonPanel);
        ViewGroup viewGroupM2296a = AlertController.m2296a(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM2296a2 = AlertController.m2296a(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM2296a3 = AlertController.m2296a(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(C0983R.id.scrollView);
        alertController.f3659i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f3659i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM2296a2.findViewById(R.id.message);
        alertController.f3663m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            alertController.f3659i.removeView(alertController.f3663m);
            if (alertController.f3655e != null) {
                ViewGroup viewGroup2 = (ViewGroup) alertController.f3659i.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(alertController.f3659i);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(alertController.f3655e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupM2296a2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupM2296a3.findViewById(R.id.button1);
        alertController.f3656f = button;
        AlertController.ViewOnClickListenerC0984a viewOnClickListenerC0984a = alertController.f3673w;
        button.setOnClickListener(viewOnClickListenerC0984a);
        if (TextUtils.isEmpty(null)) {
            alertController.f3656f.setVisibility(8);
            i = 0;
        } else {
            alertController.f3656f.setText((CharSequence) null);
            alertController.f3656f.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupM2296a3.findViewById(R.id.button2);
        alertController.f3657g = button2;
        button2.setOnClickListener(viewOnClickListenerC0984a);
        if (TextUtils.isEmpty(null)) {
            alertController.f3657g.setVisibility(8);
        } else {
            alertController.f3657g.setText((CharSequence) null);
            alertController.f3657g.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupM2296a3.findViewById(R.id.button3);
        alertController.f3658h = button3;
        button3.setOnClickListener(viewOnClickListenerC0984a);
        if (TextUtils.isEmpty(null)) {
            alertController.f3658h.setVisibility(8);
        } else {
            alertController.f3658h.setText((CharSequence) null);
            alertController.f3658h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        alertController.f3651a.getTheme().resolveAttribute(C0983R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = alertController.f3656f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = alertController.f3657g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = alertController.f3658h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupM2296a3.setVisibility(8);
        }
        if (alertController.f3664n != null) {
            viewGroupM2296a.addView(alertController.f3664n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(C0983R.id.title_template).setVisibility(8);
        } else {
            alertController.f3661k = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(alertController.f3654d) || !alertController.f3671u) {
                window.findViewById(C0983R.id.title_template).setVisibility(8);
                alertController.f3661k.setVisibility(8);
                viewGroupM2296a.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(C0983R.id.alertTitle);
                alertController.f3662l = textView2;
                textView2.setText(alertController.f3654d);
                Drawable drawable = alertController.f3660j;
                if (drawable != null) {
                    alertController.f3661k.setImageDrawable(drawable);
                } else {
                    alertController.f3662l.setPadding(alertController.f3661k.getPaddingLeft(), alertController.f3661k.getPaddingTop(), alertController.f3661k.getPaddingRight(), alertController.f3661k.getPaddingBottom());
                    alertController.f3661k.setVisibility(8);
                }
            }
        }
        boolean z = viewGroup.getVisibility() != 8;
        int i3 = (viewGroupM2296a == null || viewGroupM2296a.getVisibility() == 8) ? 0 : 1;
        boolean z2 = viewGroupM2296a3.getVisibility() != 8;
        if (!z2 && (viewFindViewById = viewGroupM2296a2.findViewById(C0983R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i3 != 0) {
            NestedScrollView nestedScrollView2 = alertController.f3659i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = alertController.f3655e != null ? viewGroupM2296a.findViewById(C0983R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM2296a2.findViewById(C0983R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f3655e;
        if (recycleListView != null && (!z2 || i3 == 0)) {
            recycleListView.setPadding(recycleListView.getPaddingLeft(), i3 != 0 ? recycleListView.getPaddingTop() : recycleListView.f3674a, recycleListView.getPaddingRight(), z2 ? recycleListView.getPaddingBottom() : recycleListView.f3675b);
        }
        if (!z) {
            View view = alertController.f3655e;
            if (view == null) {
                view = alertController.f3659i;
            }
            if (view != null) {
                int i4 = (z2 ? 2 : 0) | i3;
                View viewFindViewById11 = window.findViewById(C0983R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(C0983R.id.scrollIndicatorDown);
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                C0866ug.e.m2038d(view, i4, 3);
                if (viewFindViewById11 != null) {
                    viewGroupM2296a2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM2296a2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.f3655e;
        if (recycleListView2 == null || (listAdapter = alertController.f3665o) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i5 = alertController.f3666p;
        if (i5 > -1) {
            recycleListView2.setItemChecked(i5, true);
            recycleListView2.setSelection(i5);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f3690f.f3659i;
        if (nestedScrollView == null || !nestedScrollView.m2484d(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f3690f.f3659i;
        if (nestedScrollView == null || !nestedScrollView.m2484d(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // p000a.DialogC0416X0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f3690f;
        alertController.f3654d = charSequence;
        TextView textView = alertController.f3662l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
