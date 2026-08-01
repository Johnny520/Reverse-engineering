package androidx.appcompat.app;

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
import androidx.activity.DialogC0043;
import androidx.core.view.AbstractC2267;
import androidx.core.view.AbstractC2270;
import androidx.core.view.InterfaceC2256;
import androidx.core.widget.NestedScrollView;
import com.android.dx.io.Opcodes;
import com.davemorrissey.labs.subscaleview.R;
import java.util.WeakHashMap;
import p192.AbstractC7810;
import p192.InterfaceC7811;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC0104 extends DialogC0043 implements DialogInterface, InterfaceC0096 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public LayoutInflaterFactory2C0068 f286;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C0071 f287;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C0106 f288;

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.appcompat.app.飘花落叶言子世哲苏楪兰] */
    public DialogInterfaceC0104(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iM331 = m331(contextThemeWrapper, i);
        if (iM331 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iM331;
        }
        super(contextThemeWrapper, i2);
        this.f287 = new InterfaceC2256() { // from class: androidx.appcompat.app.飘花落叶言子世哲苏楪兰
            @Override // androidx.core.view.InterfaceC2256
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f224.m334(keyEvent);
            }
        };
        AbstractC0094 abstractC0094M333 = m333();
        if (iM331 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iM331 = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C0068) abstractC0094M333).f195 = iM331;
        abstractC0094M333.mo228();
        this.f288 = new C0106(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m331(Context context, int i) {
        if (((i >>> 24) & Opcodes.CONST_METHOD_TYPE) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.DialogC0043, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m101();
        LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = (LayoutInflaterFactory2C0068) m333();
        layoutInflaterFactory2C0068.m234();
        ((ViewGroup) layoutInflaterFactory2C0068.f160.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0068.f167.m321(layoutInflaterFactory2C0068.f168.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m333().mo227();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC2267.m4226(this.f287, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = (LayoutInflaterFactory2C0068) m333();
        layoutInflaterFactory2C0068.m234();
        return layoutInflaterFactory2C0068.f168.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        m333().mo229();
    }

    @Override // androidx.activity.DialogC0043, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        m332(bundle);
        C0106 c0106 = this.f288;
        c0106.f295.setContentView(c0106.f304);
        Context context = c0106.f296;
        Window window = c0106.f294;
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
        ViewGroup viewGroupM336 = C0106.m336(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM3362 = C0106.m336(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM3363 = C0106.m336(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0106.f312 = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0106.f312.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM3362.findViewById(android.R.id.message);
        c0106.f303 = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c0106.f312.removeView(c0106.f303);
            if (c0106.f292 != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0106.f312.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(c0106.f312);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(c0106.f292, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupM3362.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupM3363.findViewById(android.R.id.button1);
        c0106.f291 = button;
        ViewOnClickListenerC0086 viewOnClickListenerC0086 = c0106.f299;
        button.setOnClickListener(viewOnClickListenerC0086);
        boolean zIsEmpty = TextUtils.isEmpty(null);
        Button button2 = c0106.f291;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText((CharSequence) null);
            c0106.f291.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupM3363.findViewById(android.R.id.button2);
        c0106.f309 = button3;
        button3.setOnClickListener(viewOnClickListenerC0086);
        boolean zIsEmpty2 = TextUtils.isEmpty(null);
        Button button4 = c0106.f309;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText((CharSequence) null);
            c0106.f309.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupM3363.findViewById(android.R.id.button3);
        c0106.f308 = button5;
        button5.setOnClickListener(viewOnClickListenerC0086);
        boolean zIsEmpty3 = TextUtils.isEmpty(null);
        Button button6 = c0106.f308;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText((CharSequence) null);
            c0106.f308.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = c0106.f291;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = c0106.f309;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = c0106.f308;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupM3363.setVisibility(8);
        }
        if (c0106.f302 != null) {
            viewGroupM336.addView(c0106.f302, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0106.f310 = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0106.f293) || !c0106.f300) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0106.f310.setVisibility(8);
                viewGroupM336.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0106.f311 = textView2;
                textView2.setText(c0106.f293);
                Drawable drawable = c0106.f313;
                if (drawable != null) {
                    c0106.f310.setImageDrawable(drawable);
                } else {
                    c0106.f311.setPadding(c0106.f310.getPaddingLeft(), c0106.f310.getPaddingTop(), c0106.f310.getPaddingRight(), c0106.f310.getPaddingBottom());
                    c0106.f310.setVisibility(8);
                }
            }
        }
        boolean z = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupM336 == null || viewGroupM336.getVisibility() == 8) ? 0 : 1;
        boolean z2 = viewGroupM3363.getVisibility() != 8;
        if (!z2 && (viewFindViewById = viewGroupM3362.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = c0106.f312;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = c0106.f292 != null ? viewGroupM336.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM3362.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0106.f292;
        if (alertController$RecycleListView != null && (!z2 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f118, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f117);
        }
        if (!z) {
            View view = c0106.f292;
            if (view == null) {
                view = c0106.f312;
            }
            if (view != null) {
                int i3 = z2 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = AbstractC2270.f6594;
                view.setScrollIndicators(i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupM3362.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM3362.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0106.f292;
        if (alertController$RecycleListView2 == null || (listAdapter = c0106.f306) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c0106.f307;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f288.f312;
        if (nestedScrollView == null || !nestedScrollView.m4302(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f288.f312;
        if (nestedScrollView == null || !nestedScrollView.m4302(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.activity.DialogC0043, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = (LayoutInflaterFactory2C0068) m333();
        layoutInflaterFactory2C0068.m217();
        AbstractC0088 abstractC0088 = layoutInflaterFactory2C0068.f165;
        if (abstractC0088 != null) {
            abstractC0088.mo175(false);
        }
    }

    @Override // androidx.appcompat.app.InterfaceC0096
    public final AbstractC7810 onWindowStartingSupportActionMode(InterfaceC7811 interfaceC7811) {
        return null;
    }

    @Override // androidx.activity.DialogC0043, android.app.Dialog
    public final void setContentView(int i) {
        m101();
        m333().mo240(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        m333().mo243(getContext().getString(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m332(Bundle bundle) {
        m333().mo230();
        super.onCreate(bundle);
        m333().mo228();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC0094 m333() {
        if (this.f286 == null) {
            ExecutorC0091 executorC0091 = AbstractC0094.f275;
            this.f286 = new LayoutInflaterFactory2C0068(getContext(), getWindow(), this, this);
        }
        return this.f286;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m334(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m335(CharSequence charSequence) {
        super.setTitle(charSequence);
        m333().mo243(charSequence);
    }

    @Override // androidx.activity.DialogC0043, android.app.Dialog
    public final void setContentView(View view) {
        m101();
        m333().mo244(view);
    }

    @Override // androidx.activity.DialogC0043, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m101();
        m333().mo242(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        m335(charSequence);
        C0106 c0106 = this.f288;
        c0106.f293 = charSequence;
        TextView textView = c0106.f311;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.InterfaceC0096
    public final void onSupportActionModeFinished(AbstractC7810 abstractC7810) {
    }

    @Override // androidx.appcompat.app.InterfaceC0096
    public final void onSupportActionModeStarted(AbstractC7810 abstractC7810) {
    }
}
