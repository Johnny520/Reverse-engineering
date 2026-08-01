package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.bumptech.glide.AbstractC3054;
import java.lang.reflect.Method;
import p188.AbstractC7772;
import p190.InterfaceC7776;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C0182 implements InterfaceC7776 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final Method f707;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final Method f708;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final C0134 f709;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final Handler f711;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public boolean f712;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public Rect f713;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public View f714;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C0184 f715;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f718;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f719;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public AdapterView.OnItemSelectedListener f724;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public AdapterView.OnItemClickListener f725;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f729;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f730;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f731;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ListAdapter f732;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C0177 f733;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f734;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f727 = -2;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f726 = -2;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int f728 = 1002;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f717 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final int f716 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final RunnableC0183 f723 = new RunnableC0183(this, 1);

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final ViewOnTouchListenerC0179 f722 = new ViewOnTouchListenerC0179(this, 0);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C0180 f721 = new C0180(this);

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final RunnableC0183 f720 = new RunnableC0183(this, 0);

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final Rect f710 = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f708 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f707 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public C0182(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.f734 = context;
        this.f711 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC7772.f21103, i, i2);
        this.f730 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f731 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f729 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0134 c0134 = new C0134(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC7772.f21094, i, i2);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            c0134.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c0134.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC3054.m6607(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f709 = c0134;
        c0134.setInputMethodMode(1);
    }

    @Override // p190.InterfaceC7776
    public final void dismiss() {
        C0134 c0134 = this.f709;
        c0134.dismiss();
        c0134.setContentView(null);
        this.f733 = null;
        this.f711.removeCallbacks(this.f723);
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f709.setOnDismissListener(onDismissListener);
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f725 = onItemClickListener;
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f724 = onItemSelectedListener;
    }

    @Override // p190.InterfaceC7776
    public final void show() {
        int i;
        int paddingBottom;
        C0177 c0177;
        C0177 c01772 = this.f733;
        Context context = this.f734;
        C0134 c0134 = this.f709;
        if (c01772 == null) {
            C0177 c0177Mo624 = mo624(context, !this.f712);
            this.f733 = c0177Mo624;
            c0177Mo624.setAdapter(this.f732);
            this.f733.setOnItemClickListener(this.f725);
            this.f733.setFocusable(true);
            this.f733.setFocusableInTouchMode(true);
            this.f733.setOnItemSelectedListener(new C0165(this));
            this.f733.setOnScrollListener(this.f721);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f724;
            if (onItemSelectedListener != null) {
                this.f733.setOnItemSelectedListener(onItemSelectedListener);
            }
            c0134.setContentView(this.f733);
        }
        Drawable background = c0134.getBackground();
        Rect rect = this.f710;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f729) {
                this.f731 = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iM615 = AbstractC0161.m615(c0134, this.f714, this.f731, c0134.getInputMethodMode() == 2);
        int i3 = this.f727;
        if (i3 == -1) {
            paddingBottom = iM615 + i;
        } else {
            int i4 = this.f726;
            int iM641 = this.f733.m641(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iM615);
            paddingBottom = iM641 + (iM641 > 0 ? this.f733.getPaddingBottom() + this.f733.getPaddingTop() + i : 0);
        }
        boolean z = c0134.getInputMethodMode() == 2;
        c0134.setWindowLayoutType(this.f728);
        if (c0134.isShowing()) {
            if (this.f714.isAttachedToWindow()) {
                int width = this.f726;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f714.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.f726;
                    if (z) {
                        c0134.setWidth(i5 == -1 ? -1 : 0);
                        c0134.setHeight(0);
                    } else {
                        c0134.setWidth(i5 == -1 ? -1 : 0);
                        c0134.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                c0134.setOutsideTouchable(true);
                int i6 = width;
                View view = this.f714;
                int i7 = this.f730;
                int i8 = this.f731;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                c0134.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.f726;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f714.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        c0134.setWidth(width2);
        c0134.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f708;
            if (method != null) {
                try {
                    method.invoke(c0134, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC0162.m616(c0134, true);
        }
        c0134.setOutsideTouchable(true);
        c0134.setTouchInterceptor(this.f722);
        if (this.f718) {
            c0134.setOverlapAnchor(this.f719);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f707;
            if (method2 != null) {
                try {
                    method2.invoke(c0134, this.f713);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            AbstractC0162.m617(c0134, this.f713);
        }
        c0134.showAsDropDown(this.f714, this.f730, this.f731, this.f717);
        this.f733.setSelection(-1);
        if ((!this.f712 || this.f733.isInTouchMode()) && (c0177 = this.f733) != null) {
            c0177.setListSelectionHidden(true);
            c0177.requestLayout();
        }
        if (this.f712) {
            return;
        }
        this.f711.post(this.f720);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Drawable m642() {
        return this.f709.getBackground();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m643(int i) {
        this.f730 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m644() {
        return this.f730;
    }

    @Override // p190.InterfaceC7776
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo645() {
        return this.f709.isShowing();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public C0177 mo624(Context context, boolean z) {
        return new C0177(context, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public void mo513(ListAdapter listAdapter) {
        C0184 c0184 = this.f715;
        if (c0184 == null) {
            this.f715 = new C0184(this);
        } else {
            ListAdapter listAdapter2 = this.f732;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0184);
            }
        }
        this.f732 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f715);
        }
        C0177 c0177 = this.f733;
        if (c0177 != null) {
            c0177.setAdapter(this.f732);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m646(int i) {
        Drawable background = this.f709.getBackground();
        if (background == null) {
            this.f726 = i;
            return;
        }
        Rect rect = this.f710;
        background.getPadding(rect);
        this.f726 = rect.left + rect.right + i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m647(int i) {
        this.f731 = i;
        this.f729 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m648(Drawable drawable) {
        this.f709.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int m649() {
        if (this.f729) {
            return this.f731;
        }
        return 0;
    }

    @Override // p190.InterfaceC7776
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C0177 mo650() {
        return this.f733;
    }
}
