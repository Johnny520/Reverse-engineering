package yyds;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᲁᲇᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2352 implements InterfaceC0911 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f11539;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public boolean f11540;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public final C1000 f11541;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f11542;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C2045 f11543;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final ViewOnTouchListenerC1550 f11545;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public AdapterView.OnItemClickListener f11547;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public boolean f11548;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final Handler f11549;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public View f11550;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public boolean f11554;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public boolean f11555;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final RunnableC1073 f11557;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Context f11558;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public C0957 f11559;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public ListAdapter f11561;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public Rect f11562;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int f11560 = -2;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f11551 = -2;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final int f11556 = 1002;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int f11538 = 0;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final int f11546 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final C0457 f11553 = new C0457(this);

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final RunnableC1073 f11552 = new RunnableC1073(this, 0);

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final Rect f11544 = new Rect();

    public AbstractC2352(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        int i2 = 1;
        this.f11557 = new RunnableC1073(this, i2);
        this.f11545 = new ViewOnTouchListenerC1550(i2, this);
        this.f11558 = context;
        this.f11549 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1592.f8096, i, 0);
        this.f11539 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f11542 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f11554 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C1000 c1000 = new C1000(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1592.f8108, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            c1000.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c1000.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC1367.m2767(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f11541 = c1000;
        c1000.setInputMethodMode(1);
    }

    @Override // yyds.InterfaceC0911
    public final void dismiss() {
        C1000 c1000 = this.f11541;
        c1000.dismiss();
        c1000.setContentView(null);
        this.f11543 = null;
        this.f11549.removeCallbacks(this.f11557);
    }

    @Override // yyds.InterfaceC0911
    public final void show() {
        int i;
        int paddingBottom;
        C2045 c2045;
        C2045 c20452 = this.f11543;
        Context context = this.f11558;
        C1000 c1000 = this.f11541;
        if (c20452 == null) {
            C2045 c2045Mo4370 = mo4370(context, !this.f11548);
            this.f11543 = c2045Mo4370;
            c2045Mo4370.setAdapter(this.f11561);
            this.f11543.setOnItemClickListener(this.f11547);
            this.f11543.setFocusable(true);
            this.f11543.setFocusableInTouchMode(true);
            this.f11543.setOnItemSelectedListener(new C0630(0, this));
            this.f11543.setOnScrollListener(this.f11553);
            c1000.setContentView(this.f11543);
        }
        Drawable background = c1000.getBackground();
        Rect rect = this.f11544;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f11554) {
                this.f11542 = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iM1469 = AbstractC0589.m1469(c1000, this.f11550, this.f11542, c1000.getInputMethodMode() == 2);
        int i3 = this.f11560;
        if (i3 == -1) {
            paddingBottom = iM1469 + i;
        } else {
            int i4 = this.f11551;
            int iM3914 = this.f11543.m3914(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iM1469);
            paddingBottom = iM3914 + (iM3914 > 0 ? this.f11543.getPaddingBottom() + this.f11543.getPaddingTop() + i : 0);
        }
        boolean z = c1000.getInputMethodMode() == 2;
        c1000.setWindowLayoutType(this.f11556);
        if (!c1000.isShowing()) {
            int width = this.f11551;
            if (width == -1) {
                width = -1;
            } else if (width == -2) {
                width = this.f11550.getWidth();
            }
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = paddingBottom;
            }
            c1000.setWidth(width);
            c1000.setHeight(i3);
            AbstractC1666.m3409(c1000, true);
            c1000.setOutsideTouchable(true);
            c1000.setTouchInterceptor(this.f11545);
            if (this.f11540) {
                c1000.setOverlapAnchor(this.f11555);
            }
            AbstractC1666.m3408(c1000, this.f11562);
            c1000.showAsDropDown(this.f11550, this.f11539, this.f11542, this.f11538);
            this.f11543.setSelection(-1);
            if ((!this.f11548 || this.f11543.isInTouchMode()) && (c2045 = this.f11543) != null) {
                c2045.setListSelectionHidden(true);
                c2045.requestLayout();
            }
            if (this.f11548) {
                return;
            }
            this.f11549.post(this.f11552);
            return;
        }
        View view = this.f11550;
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        if (view.isAttachedToWindow()) {
            int width2 = this.f11551;
            if (width2 == -1) {
                width2 = -1;
            } else if (width2 == -2) {
                width2 = this.f11550.getWidth();
            }
            if (i3 == -1) {
                i3 = z ? paddingBottom : -1;
                int i5 = this.f11551;
                if (z) {
                    c1000.setWidth(i5 == -1 ? -1 : 0);
                    c1000.setHeight(0);
                } else {
                    c1000.setWidth(i5 == -1 ? -1 : 0);
                    c1000.setHeight(-1);
                }
            } else if (i3 == -2) {
                i3 = paddingBottom;
            }
            c1000.setOutsideTouchable(true);
            View view2 = this.f11550;
            int i6 = width2;
            int i7 = this.f11539;
            int i8 = this.f11542;
            int i9 = i6 < 0 ? -1 : i6;
            if (i3 < 0) {
                i3 = -1;
            }
            c1000.update(view2, i7, i8, i9, i3);
        }
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public void mo2569(ListAdapter listAdapter) {
        C0957 c0957 = this.f11559;
        if (c0957 == null) {
            this.f11559 = new C0957(1, this);
        } else {
            ListAdapter listAdapter2 = this.f11561;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0957);
            }
        }
        this.f11561 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f11559);
        }
        C2045 c2045 = this.f11543;
        if (c2045 != null) {
            c2045.setAdapter(this.f11561);
        }
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m4368(int i) {
        this.f11542 = i;
        this.f11554 = true;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m4369(Drawable drawable) {
        this.f11541.setBackgroundDrawable(drawable);
    }

    @Override // yyds.InterfaceC0911
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo1515() {
        return this.f11541.isShowing();
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public C2045 mo4370(Context context, boolean z) {
        return new C2045(context, z);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int m4371() {
        return this.f11539;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final int m4372() {
        if (this.f11554) {
            return this.f11542;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m4373(int i) {
        this.f11539 = i;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Drawable m4374() {
        return this.f11541.getBackground();
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final void m4375(int i) {
        Drawable background = this.f11541.getBackground();
        if (background == null) {
            this.f11551 = i;
            return;
        }
        Rect rect = this.f11544;
        background.getPadding(rect);
        this.f11551 = rect.left + rect.right + i;
    }

    @Override // yyds.InterfaceC0911
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final C2045 mo1522() {
        return this.f11543;
    }
}
