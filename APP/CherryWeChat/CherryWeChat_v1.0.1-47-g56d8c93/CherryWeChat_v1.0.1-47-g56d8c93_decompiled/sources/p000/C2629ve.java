package p000;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.cherrywechat.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: ve */
/* JADX INFO: loaded from: classes.dex */
public final class C2629ve extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final C1030Xz f9122a;

    /* JADX INFO: renamed from: b */
    public final TextView f9123b;

    /* JADX INFO: renamed from: c */
    public final TextView f9124c;

    /* JADX INFO: renamed from: d */
    public boolean f9125d;

    /* JADX INFO: renamed from: e */
    public float f9126e;

    /* JADX INFO: renamed from: f */
    public float f9127f;

    /* JADX INFO: renamed from: g */
    public final Paint f9128g;

    /* JADX INFO: renamed from: h */
    public final Paint f9129h;

    /* JADX INFO: renamed from: i */
    public final Handler f9130i;

    /* JADX INFO: renamed from: j */
    public final long f9131j;

    /* JADX INFO: renamed from: k */
    public InterfaceC1416fj f9132k;

    /* JADX INFO: renamed from: l */
    public Function2 f9133l;

    /* JADX INFO: renamed from: m */
    public InterfaceC1416fj f9134m;

    /* JADX INFO: renamed from: n */
    public final RunnableC0562N2 f9135n;

    /* JADX INFO: renamed from: o */
    public InterfaceC1416fj f9136o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2629ve(Activity activity) {
        super(activity, null, 0);
        AbstractC0295Gu.m625r(-494586958968885L);
        Paint paint = new Paint(1);
        this.f9128g = paint;
        Paint paint2 = new Paint(1);
        this.f9129h = paint2;
        this.f9130i = new Handler(Looper.getMainLooper());
        this.f9131j = ViewConfiguration.getLongPressTimeout();
        this.f9135n = new RunnableC0562N2(9, this);
        setMinimumHeight(AbstractC0295Gu.m616i(50));
        setBackgroundColor(0);
        int color = activity.getColor(R.color.colorPrimary);
        paint.setColor(Color.argb(25, Color.red(color), Color.green(color), Color.blue(color)));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setColor(Color.argb(25, 0, 0, 0));
        paint2.setStyle(style);
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(R.drawable.ic_drag_handle);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setColorFilter(activity.getColor(R.color.textSummary));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24));
        layoutParams.gravity = 8388629;
        layoutParams.rightMargin = AbstractC0295Gu.m616i(8);
        imageView.setLayoutParams(layoutParams);
        addView(imageView);
        C1030Xz c1030Xz = new C1030Xz(activity);
        c1030Xz.setOnCheckedChangeListener(new C2479s(2, this));
        this.f9122a = c1030Xz;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(40), AbstractC0295Gu.m616i(25));
        setId(android.R.id.icon);
        layoutParams2.gravity = 8388629;
        addView(c1030Xz, layoutParams2);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388627;
        layoutParams3.leftMargin = AbstractC0295Gu.m616i(8);
        layoutParams3.rightMargin = AbstractC0295Gu.m616i(80);
        linearLayout.setLayoutParams(layoutParams3);
        addView(linearLayout);
        TextView textView = new TextView(activity);
        textView.setTextSize(16.0f);
        textView.setTextColor(activity.getColor(R.color.textTitle));
        this.f9123b = textView;
        linearLayout.addView(textView);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(14.0f);
        textView2.setVisibility(8);
        textView2.setTextColor(activity.getColor(R.color.textSummary));
        this.f9124c = textView2;
        linearLayout.addView(textView2);
        setOnTouchListener(new ViewOnTouchListenerC2586ue(0, this));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC0295Gu.m625r(-494621318707253L);
        super.onDraw(canvas);
        if (!this.f9125d || this.f9127f <= 0.0f) {
            return;
        }
        float fM616i = AbstractC0295Gu.m616i(12);
        canvas.drawRoundRect(new RectF(AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(3), getWidth() - AbstractC0295Gu.m616i(4), getHeight() + AbstractC0295Gu.m616i(2)), fM616i, fM616i, this.f9129h);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), fM616i, fM616i, this.f9128g);
    }

    public final void setChecked(boolean z) {
        C1030Xz c1030Xz = this.f9122a;
        if (c1030Xz != null) {
            c1030Xz.setChecked(z);
        }
    }

    public final void setDragging(boolean z) {
        this.f9125d = z;
        if (!z) {
            this.f9127f = 0.0f;
        }
        invalidate();
    }

    public final void setOnCheckedChangeListener(InterfaceC1416fj interfaceC1416fj) {
        AbstractC0295Gu.m625r(-494711513020469L);
        this.f9136o = interfaceC1416fj;
    }

    public final void setOnDragEndListener(InterfaceC1416fj interfaceC1416fj) {
        AbstractC0295Gu.m625r(-494277721323573L);
        this.f9134m = interfaceC1416fj;
    }

    public final void setOnDragMoveListener(Function2 function2) {
        AbstractC0295Gu.m625r(-494239066617909L);
        this.f9133l = function2;
    }

    public final void setOnDragStartListener(InterfaceC1416fj interfaceC1416fj) {
        AbstractC0295Gu.m625r(-494750167726133L);
        this.f9132k = interfaceC1416fj;
    }

    public final void setSummary(String str) {
        AbstractC0295Gu.m625r(-494677153282101L);
        TextView textView = this.f9124c;
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setTitle(String str) {
        AbstractC0295Gu.m625r(-494651383478325L);
        TextView textView = this.f9123b;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
