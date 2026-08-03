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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2734xx(Context context) {
        super(context, null, 0);
        AbstractC0295Gu.m625r(-494488174721077L);
        setOrientation(1);
        setMinimumHeight(AbstractC0295Gu.m616i(70));
        setPadding(0, AbstractC0295Gu.m616i(8), 0, AbstractC0295Gu.m616i(8));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(context);
        textView.setTextSize(16.0f);
        textView.setTextColor(context.getColor(R.color.textTitle));
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388627));
        this.f9336b = textView;
        frameLayout.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(14.0f);
        textView2.setTextColor(context.getColor(R.color.textSummary));
        textView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388629));
        this.f9338d = textView2;
        frameLayout.addView(textView2);
        addView(frameLayout);
        TextView textView3 = new TextView(context);
        textView3.setTextSize(14.0f);
        textView3.setVisibility(8);
        textView3.setTextColor(context.getColor(R.color.textSummary));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = AbstractC0295Gu.m616i(2);
        textView3.setLayoutParams(layoutParams);
        this.f9337c = textView3;
        addView(textView3);
        SeekBar seekBar = new SeekBar(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = AbstractC0295Gu.m616i(4);
        seekBar.setLayoutParams(layoutParams2);
        seekBar.setMax(100);
        seekBar.setOnSeekBarChangeListener(new C2691wx(this));
        this.f9339e = seekBar;
        addView(seekBar);
    }

    /* JADX INFO: renamed from: a */
    public final void m5299a(int i) {
        String string;
        InterfaceC1416fj interfaceC1416fj = this.f9340f;
        if (interfaceC1416fj == null || (string = (String) interfaceC1416fj.mo90g(Integer.valueOf(i))) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('%');
            string = sb.toString();
        }
        this.f9338d.setText(string);
    }

    public final void setKey(String str) {
        AbstractC0295Gu.m625r(-492873267017781L);
        this.f9335a = str;
    }

    public final void setMax(int i) {
        this.f9339e.setMax(i);
    }

    public final void setOnValueChangedListener(InterfaceC1416fj interfaceC1416fj) {
        AbstractC0295Gu.m625r(-492993526102069L);
        this.f9341g = interfaceC1416fj;
    }

    public final void setProgress(int i) {
        this.f9339e.setProgress(i);
        m5299a(i);
    }

    public final void setSummary(String str) {
        AbstractC0295Gu.m625r(-492916216690741L);
        TextView textView = this.f9337c;
        textView.setVisibility(0);
        textView.setText(str);
    }

    public final void setTitle(String str) {
        AbstractC0295Gu.m625r(-492890446886965L);
        this.f9336b.setText(str);
    }

    public final void setValueFormatter(InterfaceC1416fj interfaceC1416fj) {
        AbstractC0295Gu.m625r(-492950576429109L);
        this.f9340f = interfaceC1416fj;
        m5299a(this.f9339e.getProgress());
    }
}
