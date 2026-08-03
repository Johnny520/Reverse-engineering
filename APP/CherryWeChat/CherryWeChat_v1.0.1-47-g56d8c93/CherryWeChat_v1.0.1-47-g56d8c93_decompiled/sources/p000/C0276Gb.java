package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.cherrywechat.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: Gb */
/* JADX INFO: loaded from: classes.dex */
public final class C0276Gb extends LinearLayout {

    /* JADX INFO: renamed from: g */
    public static final C2220m6 f894g;

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f895a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1416fj f896b;

    /* JADX INFO: renamed from: c */
    public EnumC1400fA f897c;

    /* JADX INFO: renamed from: d */
    public EnumC0319Hb f898d;

    /* JADX INFO: renamed from: e */
    public int f899e;

    /* JADX INFO: renamed from: f */
    public int f900f;

    static {
        AbstractC0295Gu.m625r(-495815319615541L);
        AbstractC0295Gu.m625r(-495415887657013L);
        AbstractC0295Gu.m625r(-495557621577781L);
        AbstractC0295Gu.m625r(-495583391381557L);
        AbstractC0295Gu.m625r(-494050088056885L);
        f894g = new C2220m6(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0276Gb(Context context) {
        EnumC0319Hb enumC0319HbValueOf;
        super(context);
        AbstractC0295Gu.m625r(-494960621123637L);
        this.f895a = new LinkedHashMap();
        this.f897c = EnumC1400fA.f4966b;
        this.f898d = EnumC0319Hb.f1047b;
        this.f899e = -16268960;
        this.f900f = context.getColor(R.color.textSummary);
        setOrientation(1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setGravity(16);
        linearLayout.setPadding(AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8));
        f894g.getClass();
        for (EnumC0319Hb enumC0319Hb : C2220m6.m4467k()) {
            C2621vC c2621vC = new C2621vC(context);
            AbstractC0295Gu.m625r(-494926261385269L);
            String str = (String) C2220m6.m4466j().get(enumC0319Hb);
            if (str == null) {
                str = enumC0319Hb.f1054a;
            }
            c2621vC.setText(str);
            c2621vC.setGravity(17);
            c2621vC.setTextSize(14.0f);
            c2621vC.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8));
            c2621vC.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            int i = this.f899e;
            c2621vC.f9102c.setColor(i);
            c2621vC.f9103d.setColor((i & 16777215) | 855638016);
            c2621vC.invalidate();
            c2621vC.setOnClickListener(new ViewOnClickListenerC2176l5(5, enumC0319Hb, this));
            this.f895a.put(enumC0319Hb, c2621vC);
            linearLayout.addView(c2621vC, new LinearLayout.LayoutParams(0, -2, 1.0f));
        }
        addView(linearLayout);
        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
        try {
            enumC0319HbValueOf = EnumC0319Hb.valueOf(AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-496824636930101L), AbstractC0295Gu.m625r(-496974960785461L)));
        } catch (IllegalArgumentException unused) {
            enumC0319HbValueOf = EnumC0319Hb.f1047b;
        }
        this.f898d = enumC0319HbValueOf;
        m558a(enumC0319HbValueOf);
    }

    /* JADX INFO: renamed from: a */
    public final void m558a(EnumC0319Hb enumC0319Hb) {
        AbstractC0295Gu.m625r(-495020750665781L);
        this.f898d = enumC0319Hb;
        for (Map.Entry entry : this.f895a.entrySet()) {
            EnumC0319Hb enumC0319Hb2 = (EnumC0319Hb) entry.getKey();
            TextView textView = (TextView) entry.getValue();
            boolean z = enumC0319Hb2 == enumC0319Hb;
            textView.setTextColor(z ? this.f899e : this.f900f);
            textView.setAlpha(z ? 1.0f : 0.7f);
            int iOrdinal = this.f897c.ordinal();
            if (iOrdinal == 0) {
                if (textView instanceof C2621vC) {
                    C2621vC c2621vC = (C2621vC) textView;
                    c2621vC.f9100a = z;
                    c2621vC.invalidate();
                }
                textView.setBackground(null);
            } else {
                if (iOrdinal != 1) {
                    throw new C0232Fa();
                }
                if (textView instanceof C2621vC) {
                    C2621vC c2621vC2 = (C2621vC) textView;
                    c2621vC2.f9100a = false;
                    c2621vC2.invalidate();
                    c2621vC2.f9101b = z;
                    c2621vC2.invalidate();
                }
                textView.setBackground(null);
            }
        }
    }

    public final EnumC0319Hb getCurrentSelectedType() {
        return this.f898d;
    }

    public final void setOnTabSelectedListener(InterfaceC1416fj interfaceC1416fj) {
        AbstractC0295Gu.m625r(-495626341054517L);
        this.f896b = interfaceC1416fj;
    }

    public final void setSelectedColor(int i) {
        if (i == 0) {
            return;
        }
        this.f899e = i;
        for (TextView textView : this.f895a.values()) {
            if (textView instanceof C2621vC) {
                C2621vC c2621vC = (C2621vC) textView;
                c2621vC.f9102c.setColor(i);
                c2621vC.f9103d.setColor((16777215 & i) | 855638016);
                c2621vC.invalidate();
            }
        }
        m558a(this.f898d);
    }

    public final void setTabStyle(EnumC1400fA enumC1400fA) {
        AbstractC0295Gu.m625r(-494994980862005L);
        this.f897c = enumC1400fA;
        m558a(this.f898d);
    }

    public final void setUnselectedColor(int i) {
        if (i != 0) {
            this.f900f = i;
            m558a(this.f898d);
        }
    }
}
