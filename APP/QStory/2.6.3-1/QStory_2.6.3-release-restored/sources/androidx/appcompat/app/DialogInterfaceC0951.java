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
import androidx.activity.DialogC0890;
import androidx.core.view.AbstractC3100;
import androidx.core.view.AbstractC3103;
import androidx.core.view.InterfaceC3089;
import androidx.core.widget.NestedScrollView;
import com.android.p002dx.p005io.Opcodes;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.WeakHashMap;
import p208.AbstractC8639;
import p208.InterfaceC8640;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC0951 extends DialogC0890 implements DialogInterface, InterfaceC0943 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public LayoutInflaterFactory2C0915 f631;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C0918 f632;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C0953 f633;

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.appcompat.app.飘花落叶言子世哲苏楪兰] */
    public DialogInterfaceC0951(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iM891 = m891(contextThemeWrapper, i);
        if (iM891 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(C0328R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iM891;
        }
        super(contextThemeWrapper, i2);
        this.f632 = new InterfaceC3089() { // from class: androidx.appcompat.app.飘花落叶言子世哲苏楪兰
            @Override // androidx.core.view.InterfaceC3089
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f569.m894(keyEvent);
            }
        };
        AbstractC0941 abstractC0941M893 = m893();
        if (iM891 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(C0328R.attr.dialogTheme, typedValue2, true);
            iM891 = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C0915) abstractC0941M893).f540 = iM891;
        abstractC0941M893.mo788();
        this.f633 = new C0953(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m891(Context context, int i) {
        if (((i >>> 24) & Opcodes.CONST_METHOD_TYPE) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0328R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.DialogC0890, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m661();
        LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = (LayoutInflaterFactory2C0915) m893();
        layoutInflaterFactory2C0915.m794();
        ((ViewGroup) layoutInflaterFactory2C0915.f505.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0915.f512.m881(layoutInflaterFactory2C0915.f513.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m893().mo787();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC3100.m4786(this.f632, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = (LayoutInflaterFactory2C0915) m893();
        layoutInflaterFactory2C0915.m794();
        return layoutInflaterFactory2C0915.f513.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        m893().mo789();
    }

    @Override // androidx.activity.DialogC0890, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        m892(bundle);
        C0953 c0953 = this.f633;
        c0953.f640.setContentView(c0953.f649);
        Context context = c0953.f641;
        Window window = c0953.f639;
        View viewFindViewById2 = window.findViewById(C0328R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(C0328R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(C0328R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(C0328R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(C0328R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View viewFindViewById6 = viewGroup.findViewById(C0328R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(C0328R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(C0328R.id.buttonPanel);
        ViewGroup viewGroupM896 = C0953.m896(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM8962 = C0953.m896(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM8963 = C0953.m896(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(C0328R.id.scrollView);
        c0953.f657 = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0953.f657.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM8962.findViewById(R.id.message);
        c0953.f648 = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c0953.f657.removeView(c0953.f648);
            if (c0953.f637 != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0953.f657.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(c0953.f657);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(c0953.f637, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupM8962.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupM8963.findViewById(R.id.button1);
        c0953.f636 = button;
        ViewOnClickListenerC0933 viewOnClickListenerC0933 = c0953.f644;
        button.setOnClickListener(viewOnClickListenerC0933);
        boolean zIsEmpty = TextUtils.isEmpty(null);
        Button button2 = c0953.f636;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText((CharSequence) null);
            c0953.f636.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupM8963.findViewById(R.id.button2);
        c0953.f654 = button3;
        button3.setOnClickListener(viewOnClickListenerC0933);
        boolean zIsEmpty2 = TextUtils.isEmpty(null);
        Button button4 = c0953.f654;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText((CharSequence) null);
            c0953.f654.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupM8963.findViewById(R.id.button3);
        c0953.f653 = button5;
        button5.setOnClickListener(viewOnClickListenerC0933);
        boolean zIsEmpty3 = TextUtils.isEmpty(null);
        Button button6 = c0953.f653;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText((CharSequence) null);
            c0953.f653.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0328R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = c0953.f636;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = c0953.f654;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = c0953.f653;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupM8963.setVisibility(8);
        }
        if (c0953.f647 != null) {
            viewGroupM896.addView(c0953.f647, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(C0328R.id.title_template).setVisibility(8);
        } else {
            c0953.f655 = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(c0953.f638) || !c0953.f645) {
                window.findViewById(C0328R.id.title_template).setVisibility(8);
                c0953.f655.setVisibility(8);
                viewGroupM896.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(C0328R.id.alertTitle);
                c0953.f656 = textView2;
                textView2.setText(c0953.f638);
                Drawable drawable = c0953.f658;
                if (drawable != null) {
                    c0953.f655.setImageDrawable(drawable);
                } else {
                    c0953.f656.setPadding(c0953.f655.getPaddingLeft(), c0953.f655.getPaddingTop(), c0953.f655.getPaddingRight(), c0953.f655.getPaddingBottom());
                    c0953.f655.setVisibility(8);
                }
            }
        }
        boolean z = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupM896 == null || viewGroupM896.getVisibility() == 8) ? 0 : 1;
        boolean z2 = viewGroupM8963.getVisibility() != 8;
        if (!z2 && (viewFindViewById = viewGroupM8962.findViewById(C0328R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = c0953.f657;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = c0953.f637 != null ? viewGroupM896.findViewById(C0328R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM8962.findViewById(C0328R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0953.f637;
        if (alertController$RecycleListView != null && (!z2 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f463, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f462);
        }
        if (!z) {
            View view = c0953.f637;
            if (view == null) {
                view = c0953.f657;
            }
            if (view != null) {
                int i3 = z2 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(C0328R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(C0328R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = AbstractC3103.f6939;
                view.setScrollIndicators(i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupM8962.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupM8962.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0953.f637;
        if (alertController$RecycleListView2 == null || (listAdapter = c0953.f651) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c0953.f652;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f633.f657;
        if (nestedScrollView == null || !nestedScrollView.m4862(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f633.f657;
        if (nestedScrollView == null || !nestedScrollView.m4862(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.activity.DialogC0890, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = (LayoutInflaterFactory2C0915) m893();
        layoutInflaterFactory2C0915.m777();
        AbstractC0935 abstractC0935 = layoutInflaterFactory2C0915.f510;
        if (abstractC0935 != null) {
            abstractC0935.mo735(false);
        }
    }

    @Override // androidx.appcompat.app.InterfaceC0943
    public final AbstractC8639 onWindowStartingSupportActionMode(InterfaceC8640 interfaceC8640) {
        return null;
    }

    @Override // androidx.activity.DialogC0890, android.app.Dialog
    public final void setContentView(int i) {
        m661();
        m893().mo800(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        m893().mo803(getContext().getString(i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m892(Bundle bundle) {
        m893().mo790();
        super.onCreate(bundle);
        m893().mo788();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC0941 m893() {
        if (this.f631 == null) {
            ExecutorC0938 executorC0938 = AbstractC0941.f620;
            this.f631 = new LayoutInflaterFactory2C0915(getContext(), getWindow(), this, this);
        }
        return this.f631;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m894(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m895(CharSequence charSequence) {
        super.setTitle(charSequence);
        m893().mo803(charSequence);
    }

    @Override // androidx.activity.DialogC0890, android.app.Dialog
    public final void setContentView(View view) {
        m661();
        m893().mo804(view);
    }

    @Override // androidx.activity.DialogC0890, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m661();
        m893().mo802(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        m895(charSequence);
        C0953 c0953 = this.f633;
        c0953.f638 = charSequence;
        TextView textView = c0953.f656;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.InterfaceC0943
    public final void onSupportActionModeFinished(AbstractC8639 abstractC8639) {
    }

    @Override // androidx.appcompat.app.InterfaceC0943
    public final void onSupportActionModeStarted(AbstractC8639 abstractC8639) {
    }
}
