package p000;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: xx */
/* JADX INFO: loaded from: classes.dex */
public final class C2734xx extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public String f9335a;

    /* JADX INFO: renamed from: b */
    public final TextView f9336b;

    /* JADX INFO: renamed from: c */
    public final TextView f9337c;

    /* JADX INFO: renamed from: d */
    public final TextView f9338d;

    /* JADX INFO: renamed from: e */
    public final SeekBar f9339e;

    /* JADX INFO: renamed from: f */
    public InterfaceC1416fj f9340f;

    /* JADX INFO: renamed from: g */
    public InterfaceC1416fj f9341g;

    public C2734xx(Context r10) {
        AbstractC0295Gu.m625r(-494488174721077L);
        super(r10, null, 0);
        setOrientation(1);
        setMinimumHeight(AbstractC0295Gu.m616i(70));
        setPadding(0, AbstractC0295Gu.m616i(8), 0, AbstractC0295Gu.m616i(8));
        FrameLayout r1 = new FrameLayout(r10);
        r1.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView r2 = new TextView(r10);
        r2.setTextSize(16.0f);
        r2.setTextColor(r10.getColor(R.color.textTitle));
        r2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388627));
        this.f9336b = r2;
        r1.addView(r2);
        TextView r22 = new TextView(r10);
        r22.setTextSize(14.0f);
        r22.setTextColor(r10.getColor(R.color.textSummary));
        r22.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388629));
        this.f9338d = r22;
        r1.addView(r22);
        addView(r1);
        TextView r12 = new TextView(r10);
        r12.setTextSize(14.0f);
        r12.setVisibility(8);
        r12.setTextColor(r10.getColor(R.color.textSummary));
        LinearLayout.LayoutParams r0 = new LinearLayout.LayoutParams(-1, -2);
        r0.topMargin = AbstractC0295Gu.m616i(2);
        r12.setLayoutParams(r0);
        this.f9337c = r12;
        addView(r12);
        SeekBar r02 = new SeekBar(r10);
        LinearLayout.LayoutParams r102 = new LinearLayout.LayoutParams(-1, -2);
        r102.topMargin = AbstractC0295Gu.m616i(4);
        r02.setLayoutParams(r102);
        r02.setMax(100);
        r02.setOnSeekBarChangeListener(new C2691wx(this));
        this.f9339e = r02;
        addView(r02);
    }

    /* JADX INFO: renamed from: a */
    public final void m5299a(int r3) {
        InterfaceC1416fj r0 = this.f9340f;
        if (r0 == null) goto L7;
        String r02 = (String) r0.mo90g(Integer.valueOf(r3));
        if (r02 == null) goto L7;
    L8:
        this.f9338d.setText(r02);
        return;
    L7:
        StringBuilder r03 = new StringBuilder();
        r03.append(r3);
        r03.append('%');
        r02 = r03.toString();
        goto L8
    }

    public final void setKey(String r3) {
        AbstractC0295Gu.m625r(-492873267017781L);
        this.f9335a = r3;
    }

    public final void setMax(int r2) {
        this.f9339e.setMax(r2);
    }

    public final void setOnValueChangedListener(InterfaceC1416fj r3) {
        AbstractC0295Gu.m625r(-492993526102069L);
        this.f9341g = r3;
    }

    public final void setProgress(int r2) {
        this.f9339e.setProgress(r2);
        m5299a(r2);
    }

    public final void setSummary(String r3) {
        AbstractC0295Gu.m625r(-492916216690741L);
        TextView r1 = this.f9337c;
        r1.setVisibility(0);
        r1.setText(r3);
    }

    public final void setTitle(String r3) {
        AbstractC0295Gu.m625r(-492890446886965L);
        this.f9336b.setText(r3);
    }

    public final void setValueFormatter(InterfaceC1416fj r3) {
        AbstractC0295Gu.m625r(-492950576429109L);
        this.f9340f = r3;
        m5299a(this.f9339e.getProgress());
    }
}
