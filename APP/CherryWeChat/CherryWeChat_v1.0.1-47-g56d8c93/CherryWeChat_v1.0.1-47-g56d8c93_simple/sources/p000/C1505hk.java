package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: hk */
/* JADX INFO: loaded from: classes.dex */
public final class C1505hk extends FrameLayout {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f5336g = 0;

    /* JADX INFO: renamed from: a */
    public final ImageView f5337a;

    /* JADX INFO: renamed from: b */
    public final TextView f5338b;

    /* JADX INFO: renamed from: c */
    public final TextView f5339c;

    /* JADX INFO: renamed from: d */
    public final TextView f5340d;

    /* JADX INFO: renamed from: e */
    public final TextView f5341e;

    /* JADX INFO: renamed from: f */
    public final TextView f5342f;

    public C1505hk(Context r17) {
        AbstractC0295Gu.m625r(-71816148154421L);
        super(r17);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        GradientDrawable r2 = new GradientDrawable();
        r2.setColor(r17.getColor(R.color.cardBackground));
        r2.setCornerRadius(AbstractC0295Gu.m616i(16));
        r2.setStroke(AbstractC0295Gu.m616i(1), r17.getColor(R.color.cardStroke));
        setBackground(r2);
        setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(12));
        LinearLayout r7 = new LinearLayout(r17);
        r7.setOrientation(1);
        r7.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ImageView r8 = new ImageView(r17);
        r8.setLayoutParams(new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(120)));
        r8.setScaleType(ImageView.ScaleType.CENTER_CROP);
        GradientDrawable r9 = new GradientDrawable();
        r9.setCornerRadius(AbstractC0295Gu.m616i(8));
        r9.setColor(r17.getColor(R.color.iconBackground));
        r8.setBackground(r9);
        this.f5337a = r8;
        r7.addView(r8);
        TextView r82 = new TextView(r17);
        FrameLayout.LayoutParams r92 = new FrameLayout.LayoutParams(-2, -2);
        r92.gravity = 8388661;
        r92.setMargins(0, AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8), 0);
        r82.setLayoutParams(r92);
        r82.setTextSize(10.0f);
        r82.setPadding(AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(2), AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(2));
        GradientDrawable r5 = new GradientDrawable();
        r5.setCornerRadius(AbstractC0295Gu.m616i(8));
        r82.setBackground(r5);
        r82.setVisibility(8);
        this.f5340d = r82;
        addView(r82);
        TextView r52 = new TextView(r17);
        LinearLayout.LayoutParams r83 = new LinearLayout.LayoutParams(-1, -2);
        r83.topMargin = AbstractC0295Gu.m616i(8);
        r52.setLayoutParams(r83);
        r52.setTextSize(14.0f);
        r52.setTypeface(Typeface.DEFAULT_BOLD);
        r52.setTextColor(r17.getColor(R.color.textTitle));
        r52.setMaxLines(1);
        TextUtils.TruncateAt r10 = TextUtils.TruncateAt.END;
        r52.setEllipsize(r10);
        this.f5338b = r52;
        r7.addView(r52);
        TextView r53 = new TextView(r17);
        LinearLayout.LayoutParams r12 = new LinearLayout.LayoutParams(-1, -2);
        r12.topMargin = AbstractC0295Gu.m616i(2);
        r53.setLayoutParams(r12);
        r53.setTextSize(12.0f);
        r53.setTextColor(r17.getColor(R.color.textSummary));
        r53.setMaxLines(1);
        r53.setEllipsize(r10);
        this.f5339c = r53;
        r7.addView(r53);
        LinearLayout r54 = new LinearLayout(r17);
        r54.setOrientation(0);
        LinearLayout.LayoutParams r102 = new LinearLayout.LayoutParams(-1, -2);
        r102.topMargin = AbstractC0295Gu.m616i(8);
        r54.setLayoutParams(r102);
        r54.setGravity(16);
        TextView r3 = new TextView(r17);
        r3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        r3.setTextSize(12.0f);
        r3.setTextColor(r17.getColor(R.color.textTitle));
        this.f5342f = r3;
        r54.addView(r3);
        TextView r32 = new TextView(r17);
        r32.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(60), -2));
        r32.setTextSize(12.0f);
        r32.setGravity(17);
        r32.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(6));
        r32.setMinWidth(AbstractC0295Gu.m616i(60));
        GradientDrawable r1 = new GradientDrawable();
        r1.setCornerRadius(AbstractC0295Gu.m616i(12));
        r32.setBackground(r1);
        this.f5341e = r32;
        r54.addView(r32);
        r7.addView(r54);
        addView(r7);
    }

    /* JADX INFO: renamed from: a */
    public static final void m2880a(C1505hk r2, C0185EC r3) {
        r2.getClass();
        C0357IC r0 = C0357IC.f1218a;
        String r32 = r3.f549a;
        EnumC0099CC r1 = EnumC0099CC.f234b;
        r0.getClass();
        C0357IC.m794f(r32, r1);
        TextView r22 = r2.f5341e;
        r22.setText(AbstractC0295Gu.m625r(-71287867177013L));
        r22.setEnabled(true);
    }

    /* JADX INFO: renamed from: b */
    public final void m2881b(C0185EC r7) {
        if (r7.f568t == false) goto L6;
        AbstractC0213Ey.m413k(-71300752078901L, getContext(), 0);
        return;
    L6:
        C0183EA r0 = C0183EA.f539a;
        String r2 = r7.f549a;
        r0.getClass();
        if (C0183EA.m379g(r2) == true) goto L10;
        AbstractC0213Ey.m413k(-71335111817269L, getContext(), 0);
        return;
    L10:
        Context r02 = getContext();
        AbstractC0295Gu.m625r(-71365176588341L);
        C1456gf.m2801S(r02, AbstractC0295Gu.m625r(-71433896065077L), AbstractC0295Gu.m625r(-71455370901557L) + r7.f551c + AbstractC0295Gu.m625r(-70939974826037L), new DialogInterfaceOnClickListenerC1330dk(r7, this), false);
    }
}
