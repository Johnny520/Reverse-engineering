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

    public C2629ve(Activity r10) {
        AbstractC0295Gu.m625r(-494586958968885L);
        super(r10, null, 0);
        Paint r0 = new Paint(1);
        this.f9128g = r0;
        Paint r3 = new Paint(1);
        this.f9129h = r3;
        this.f9130i = new Handler(Looper.getMainLooper());
        this.f9131j = ViewConfiguration.getLongPressTimeout();
        this.f9135n = new RunnableC0562N2(9, this);
        setMinimumHeight(AbstractC0295Gu.m616i(50));
        setBackgroundColor(0);
        int r4 = r10.getColor(R.color.colorPrimary);
        r0.setColor(Color.argb(25, Color.red(r4), Color.green(r4), Color.blue(r4)));
        Paint.Style r42 = Paint.Style.FILL;
        r0.setStyle(r42);
        r3.setColor(Color.argb(25, 0, 0, 0));
        r3.setStyle(r42);
        ImageView r02 = new ImageView(r10);
        r02.setImageResource(R.drawable.ic_drag_handle);
        r02.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        r02.setColorFilter(r10.getColor(R.color.textSummary));
        FrameLayout.LayoutParams r32 = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24));
        r32.gravity = 8388629;
        r32.rightMargin = AbstractC0295Gu.m616i(8);
        r02.setLayoutParams(r32);
        addView(r02);
        C1030Xz r03 = new C1030Xz(r10);
        r03.setOnCheckedChangeListener(new C2479s(2, this));
        this.f9122a = r03;
        FrameLayout.LayoutParams r33 = new FrameLayout.LayoutParams(AbstractC0295Gu.m616i(40), AbstractC0295Gu.m616i(25));
        setId(android.R.id.icon);
        r33.gravity = 8388629;
        addView(r03, r33);
        LinearLayout r04 = new LinearLayout(r10);
        r04.setOrientation(1);
        FrameLayout.LayoutParams r2 = new FrameLayout.LayoutParams(-2, -2);
        r2.gravity = 8388627;
        r2.leftMargin = AbstractC0295Gu.m616i(8);
        r2.rightMargin = AbstractC0295Gu.m616i(80);
        r04.setLayoutParams(r2);
        addView(r04);
        TextView r22 = new TextView(r10);
        r22.setTextSize(16.0f);
        r22.setTextColor(r10.getColor(R.color.textTitle));
        this.f9123b = r22;
        r04.addView(r22);
        TextView r23 = new TextView(r10);
        r23.setTextSize(14.0f);
        r23.setVisibility(8);
        r23.setTextColor(r10.getColor(R.color.textSummary));
        this.f9124c = r23;
        r04.addView(r23);
        setOnTouchListener(new ViewOnTouchListenerC2586ue(0, this));
    }

    @Override // android.view.View
    public final void onDraw(Canvas r9) {
        AbstractC0295Gu.m625r(-494621318707253L);
        super.onDraw(r9);
        if (this.f9125d == true) goto L5;
        return;
    L5:
        if (this.f9127f <= 0.0f) goto L9;
        float r1 = AbstractC0295Gu.m616i(12);
        r9.drawRoundRect(new RectF(AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(3), getWidth() - AbstractC0295Gu.m616i(4), getHeight() + AbstractC0295Gu.m616i(2)), r1, r1, this.f9129h);
        r9.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), r1, r1, this.f9128g);
        return;
    }

    public final void setChecked(boolean r2) {
        C1030Xz r0 = this.f9122a;
        if (r0 == null) goto L6;
        r0.setChecked(r2);
        return;
    }

    public final void setDragging(boolean r1) {
        this.f9125d = r1;
        if (r1 == true) goto L5;
        this.f9127f = 0.0f;
    L5:
        invalidate();
    }

    public final void setOnCheckedChangeListener(InterfaceC1416fj r3) {
        AbstractC0295Gu.m625r(-494711513020469L);
        this.f9136o = r3;
    }

    public final void setOnDragEndListener(InterfaceC1416fj r3) {
        AbstractC0295Gu.m625r(-494277721323573L);
        this.f9134m = r3;
    }

    public final void setOnDragMoveListener(Function2 r3) {
        AbstractC0295Gu.m625r(-494239066617909L);
        this.f9133l = r3;
    }

    public final void setOnDragStartListener(InterfaceC1416fj r3) {
        AbstractC0295Gu.m625r(-494750167726133L);
        this.f9132k = r3;
    }

    public final void setSummary(String r3) {
        AbstractC0295Gu.m625r(-494677153282101L);
        TextView r0 = this.f9124c;
        if (r0 == null) goto L5;
        r0.setVisibility(0);
    L5:
        if (r0 == null) goto L8;
        r0.setText(r3);
        return;
    }

    public final void setTitle(String r3) {
        AbstractC0295Gu.m625r(-494651383478325L);
        TextView r0 = this.f9123b;
        if (r0 == null) goto L6;
        r0.setText(r3);
        return;
    }
}
