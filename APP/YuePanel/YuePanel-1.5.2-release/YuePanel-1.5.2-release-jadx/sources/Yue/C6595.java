package Yue;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: Yue.ۥۣۡۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6595 extends C6596 {

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final String f16922 = "PagerTabStrip";

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final int f16923 = 3;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final int f16924 = 6;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final int f16925 = 16;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final int f16926 = 32;

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final int f16927 = 64;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final int f16928 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final int f16929 = 32;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public int f16930;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public int f16931;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public int f16932;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public int f16933;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public int f16934;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public int f16935;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final Paint f16936;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final Rect f16937;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public int f16938;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public boolean f16939;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public boolean f16940;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f16941;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f16942;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public float f16943;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public float f16944;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public int f16945;

    /* JADX INFO: renamed from: Yue.ۥۣۡۥۧ$ۥ */
    public class ViewOnClickListenerC1021 implements View.OnClickListener {
        public ViewOnClickListenerC1021() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C6595.this.f16952.setCurrentItem(r2.getCurrentItem() - 1);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۥۧ$ۥ۟ */
    public class ViewOnClickListenerC1022 implements View.OnClickListener {
        public ViewOnClickListenerC1022() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C8321 c8321 = C6595.this.f16952;
            c8321.setCurrentItem(c8321.getCurrentItem() + 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6595(@InterfaceC6391 Context context) {
        this(context, null);
    }

    public boolean getDrawFullUnderline() {
        return this.f16939;
    }

    @Override // Yue.C6596
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f16934);
    }

    @InterfaceC3897
    public int getTabIndicatorColor() {
        return this.f16930;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f16954.getLeft() - this.f16935;
        int right = this.f16954.getRight() + this.f16935;
        int i = height - this.f16931;
        this.f16936.setColor((this.f16938 << 24) | (this.f16930 & C8273.f24691));
        float f = height;
        canvas.drawRect(left, i, right, f, this.f16936);
        if (this.f16939) {
            this.f16936.setColor((this.f16930 & C8273.f24691) | C8273.f24692);
            canvas.drawRect(getPaddingLeft(), height - this.f16941, getWidth() - getPaddingRight(), f, this.f16936);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f16942) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f16943 = x;
            this.f16944 = y;
            this.f16942 = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x - this.f16943) > this.f16945 || Math.abs(y - this.f16944) > this.f16945)) {
                this.f16942 = true;
            }
        } else if (x < this.f16954.getLeft() - this.f16935) {
            C8321 c8321 = this.f16952;
            c8321.setCurrentItem(c8321.getCurrentItem() - 1);
        } else if (x > this.f16954.getRight() + this.f16935) {
            C8321 c83212 = this.f16952;
            c83212.setCurrentItem(c83212.getCurrentItem() + 1);
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(@InterfaceC3897 int i) {
        super.setBackgroundColor(i);
        if (this.f16940) {
            return;
        }
        this.f16939 = (i & C8273.f24692) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f16940) {
            return;
        }
        this.f16939 = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC4525 int i) {
        super.setBackgroundResource(i);
        if (this.f16940) {
            return;
        }
        this.f16939 = i == 0;
    }

    public void setDrawFullUnderline(boolean z) {
        this.f16939 = z;
        this.f16940 = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.f16932;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(@InterfaceC3897 int i) {
        this.f16930 = i;
        this.f16936.setColor(i);
        invalidate();
    }

    public void setTabIndicatorColorResource(@InterfaceC3906 int i) {
        setTabIndicatorColor(C4187.m12060(getContext(), i));
    }

    @Override // Yue.C6596
    public void setTextSpacing(int i) {
        int i2 = this.f16933;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    @Override // Yue.C6596
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo20933(int i, float f, boolean z) {
        Rect rect = this.f16937;
        int height = getHeight();
        int left = this.f16954.getLeft() - this.f16935;
        int right = this.f16954.getRight() + this.f16935;
        int i2 = height - this.f16931;
        rect.set(left, i2, right, height);
        super.mo20933(i, f, z);
        this.f16938 = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f16954.getLeft() - this.f16935, i2, this.f16954.getRight() + this.f16935, height);
        invalidate(rect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6595(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f16936 = paint;
        this.f16937 = new Rect();
        this.f16938 = 255;
        this.f16939 = false;
        this.f16940 = false;
        int i = this.f16965;
        this.f16930 = i;
        paint.setColor(i);
        float f = context.getResources().getDisplayMetrics().density;
        this.f16931 = (int) ((3.0f * f) + 0.5f);
        this.f16932 = (int) ((6.0f * f) + 0.5f);
        this.f16933 = (int) (64.0f * f);
        this.f16935 = (int) ((16.0f * f) + 0.5f);
        this.f16941 = (int) ((1.0f * f) + 0.5f);
        this.f16934 = (int) ((f * 32.0f) + 0.5f);
        this.f16945 = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f16953.setFocusable(true);
        this.f16953.setOnClickListener(new ViewOnClickListenerC1021());
        this.f16955.setFocusable(true);
        this.f16955.setOnClickListener(new ViewOnClickListenerC1022());
        if (getBackground() == null) {
            this.f16939 = true;
        }
    }
}
