package Yue;

import Yue.C8321;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.google.android.material.color.utilities.Contrast;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: renamed from: Yue.ۥۣۡۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@C8321.InterfaceC8324
public class C6596 extends ViewGroup {

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int[] f16948 = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int[] f16949 = {R.attr.textAllCaps};

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final float f16950 = 0.6f;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int f16951 = 16;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C8321 f16952;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public TextView f16953;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public TextView f16954;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public TextView f16955;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f16956;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public float f16957;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f16958;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f16959;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean f16960;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean f16961;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final C1023 f16962;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public WeakReference<AbstractC6594> f16963;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public int f16964;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public int f16965;

    /* JADX INFO: renamed from: Yue.ۥۣۡۥۨ$ۥ */
    public class C1023 extends DataSetObserver implements C8321.InterfaceC8329, C8321.InterfaceC8328 {

        /* JADX INFO: renamed from: ۥ */
        public int f2160;

        public C1023() {
        }

        @Override // Yue.C8321.InterfaceC8328
        public void onAdapterChanged(C8321 c8321, AbstractC6594 abstractC6594, AbstractC6594 abstractC65942) {
            C6596.this.m3056(abstractC6594, abstractC65942);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            C6596 c6596 = C6596.this;
            c6596.m20934(c6596.f16952.getCurrentItem(), C6596.this.f16952.getAdapter());
            C6596 c65962 = C6596.this;
            float f = c65962.f16957;
            if (f < 0.0f) {
                f = 0.0f;
            }
            c65962.mo20933(c65962.f16952.getCurrentItem(), f, true);
        }

        @Override // Yue.C8321.InterfaceC8329
        public void onPageScrollStateChanged(int i) {
            this.f2160 = i;
        }

        @Override // Yue.C8321.InterfaceC8329
        public void onPageScrolled(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            C6596.this.mo20933(i, f, false);
        }

        @Override // Yue.C8321.InterfaceC8329
        public void onPageSelected(int i) {
            if (this.f2160 == 0) {
                C6596 c6596 = C6596.this;
                c6596.m20934(c6596.f16952.getCurrentItem(), C6596.this.f16952.getAdapter());
                C6596 c65962 = C6596.this;
                float f = c65962.f16957;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                c65962.mo20933(c65962.f16952.getCurrentItem(), f, true);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۥۨ$ۥ۟ */
    public static class C1024 extends SingleLineTransformationMethod {

        /* JADX INFO: renamed from: ۥ */
        public Locale f2162;

        public C1024(Context context) {
            this.f2162 = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f2162);
            }
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6596(@InterfaceC6391 Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new C1024(textView.getContext()));
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f16958;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof C8321)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        C8321 c8321 = (C8321) parent;
        AbstractC6594 adapter = c8321.getAdapter();
        c8321.m27779(this.f16962);
        c8321.m4302(this.f16962);
        this.f16952 = c8321;
        WeakReference<AbstractC6594> weakReference = this.f16963;
        m3056(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C8321 c8321 = this.f16952;
        if (c8321 != null) {
            m3056(c8321.getAdapter(), null);
            this.f16952.m27779(null);
            this.f16952.m27771(this.f16962);
            this.f16952 = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f16952 != null) {
            float f = this.f16957;
            if (f < 0.0f) {
                f = 0.0f;
            }
            mo20933(this.f16956, f, true);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iMax;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int size = View.MeasureSpec.getSize(i);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (size * 0.2f), -2);
        this.f16953.measure(childMeasureSpec2, childMeasureSpec);
        this.f16954.measure(childMeasureSpec2, childMeasureSpec);
        this.f16955.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i2);
        } else {
            iMax = Math.max(getMinHeight(), this.f16954.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i2, this.f16954.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f16960) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i) {
        this.f16959 = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@InterfaceC4885(from = 0.0d, m1796to = Contrast.RATIO_MIN) float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.f16964 = i;
        int i2 = (i << 24) | (this.f16965 & C8273.f24691);
        this.f16953.setTextColor(i2);
        this.f16955.setTextColor(i2);
    }

    public void setTextColor(@InterfaceC3897 int i) {
        this.f16965 = i;
        this.f16954.setTextColor(i);
        int i2 = (this.f16964 << 24) | (this.f16965 & C8273.f24691);
        this.f16953.setTextColor(i2);
        this.f16955.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.f16958 = i;
        requestLayout();
    }

    /* JADX INFO: renamed from: ۥ */
    public void m3055(int i, float f) {
        this.f16953.setTextSize(i, f);
        this.f16954.setTextSize(i, f);
        this.f16955.setTextSize(i, f);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m3056(AbstractC6594 abstractC6594, AbstractC6594 abstractC65942) {
        if (abstractC6594 != null) {
            abstractC6594.m20932(this.f16962);
            this.f16963 = null;
        }
        if (abstractC65942 != null) {
            abstractC65942.m20928(this.f16962);
            this.f16963 = new WeakReference<>(abstractC65942);
        }
        C8321 c8321 = this.f16952;
        if (c8321 != null) {
            this.f16956 = -1;
            this.f16957 = -1.0f;
            m20934(c8321.getCurrentItem(), abstractC65942);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m20934(int i, AbstractC6594 abstractC6594) {
        int iM20922 = abstractC6594 != null ? abstractC6594.m20922() : 0;
        this.f16960 = true;
        CharSequence charSequenceM20924 = null;
        this.f16953.setText((i < 1 || abstractC6594 == null) ? null : abstractC6594.m20924(i - 1));
        this.f16954.setText((abstractC6594 == null || i >= iM20922) ? null : abstractC6594.m20924(i));
        int i2 = i + 1;
        if (i2 < iM20922 && abstractC6594 != null) {
            charSequenceM20924 = abstractC6594.m20924(i2);
        }
        this.f16955.setText(charSequenceM20924);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f16953.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f16954.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f16955.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f16956 = i;
        if (!this.f16961) {
            mo20933(i, this.f16957, false);
        }
        this.f16960 = false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo20933(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.f16956) {
            m20934(i, this.f16952.getAdapter());
        } else if (!z && f == this.f16957) {
            return;
        }
        this.f16961 = true;
        int measuredWidth = this.f16953.getMeasuredWidth();
        int measuredWidth2 = this.f16954.getMeasuredWidth();
        int measuredWidth3 = this.f16955.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (i8 * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = this.f16953.getBaseline();
        int baseline2 = this.f16954.getBaseline();
        int baseline3 = this.f16955.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = iMax - baseline;
        int i12 = iMax - baseline2;
        int i13 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(this.f16953.getMeasuredHeight() + i11, this.f16954.getMeasuredHeight() + i12), this.f16955.getMeasuredHeight() + i13);
        int i14 = this.f16959 & 112;
        if (i14 == 16) {
            i2 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        } else {
            if (i14 != 80) {
                i3 = i11 + paddingTop;
                i4 = i12 + paddingTop;
                i5 = paddingTop + i13;
                TextView textView = this.f16954;
                textView.layout(i9, i4, i10, textView.getMeasuredHeight() + i4);
                int iMin = Math.min(paddingLeft, (i9 - this.f16958) - measuredWidth);
                TextView textView2 = this.f16953;
                textView2.layout(iMin, i3, measuredWidth + iMin, textView2.getMeasuredHeight() + i3);
                int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f16958);
                TextView textView3 = this.f16955;
                textView3.layout(iMax3, i5, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
                this.f16957 = f;
                this.f16961 = false;
            }
            i2 = (height - paddingBottom) - iMax2;
        }
        i3 = i11 + i2;
        i4 = i12 + i2;
        i5 = i2 + i13;
        TextView textView4 = this.f16954;
        textView4.layout(i9, i4, i10, textView4.getMeasuredHeight() + i4);
        int iMin2 = Math.min(paddingLeft, (i9 - this.f16958) - measuredWidth);
        TextView textView22 = this.f16953;
        textView22.layout(iMin2, i3, measuredWidth + iMin2, textView22.getMeasuredHeight() + i3);
        int iMax32 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.f16958);
        TextView textView32 = this.f16955;
        textView32.layout(iMax32, i5, iMax32 + measuredWidth3, textView32.getMeasuredHeight() + i5);
        this.f16957 = f;
        this.f16961 = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6596(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16956 = -1;
        this.f16957 = -1.0f;
        this.f16962 = new C1023();
        TextView textView = new TextView(context);
        this.f16953 = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f16954 = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f16955 = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f16948);
        boolean z = false;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            C7759.m24676(this.f16953, resourceId);
            C7759.m24676(this.f16954, resourceId);
            C7759.m24676(this.f16955, resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            m3055(0, dimensionPixelSize);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            this.f16953.setTextColor(color);
            this.f16954.setTextColor(color);
            this.f16955.setTextColor(color);
        }
        this.f16959 = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.f16965 = this.f16954.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        TextView textView4 = this.f16953;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.f16954.setEllipsize(truncateAt);
        this.f16955.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f16949);
            z = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f16953);
            setSingleLineAllCaps(this.f16954);
            setSingleLineAllCaps(this.f16955);
        } else {
            this.f16953.setSingleLine();
            this.f16954.setSingleLine();
            this.f16955.setSingleLine();
        }
        this.f16958 = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
