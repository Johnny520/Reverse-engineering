package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.cherrywechat.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: Gb */
/* JADX INFO: loaded from: classes.dex */
public final class C0276Gb extends LinearLayout {

    /* JADX INFO: renamed from: g */
    public static final C2220m6 f894g = null;

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

    public C0276Gb(Context r12) {
        AbstractC0295Gu.m625r(-494960621123637L);
        super(r12);
        this.f895a = new LinkedHashMap();
        this.f897c = EnumC1400fA.f4966b;
        this.f898d = EnumC0319Hb.f1047b;
        this.f899e = -16268960;
        this.f900f = r12.getColor(R.color.textSummary);
        setOrientation(1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        LinearLayout r0 = new LinearLayout(r12);
        r0.setOrientation(0);
        r0.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r0.setGravity(16);
        r0.setPadding(AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8));
        f894g.getClass();
        Iterator r4 = C2220m6.m4467k().iterator();
    L4:
        if (r4.hasNext() == false) goto L9;
        EnumC0319Hb r5 = (EnumC0319Hb) r4.next();
        C2621vC r6 = new C2621vC(r12);
        AbstractC0295Gu.m625r(-494926261385269L);
        String r7 = (String) C2220m6.m4466j().get(r5);
        if (r7 != null) goto L8;
        r7 = r5.f1054a;
    L8:
        r6.setText(r7);
        r6.setGravity(17);
        r6.setTextSize(14.0f);
        r6.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8));
        r6.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        int r72 = this.f899e;
        r6.f9102c.setColor(r72);
        Paint r8 = r6.f9103d;
        r8.setColor((r72 & 16777215) | 855638016);
        r6.invalidate();
        r6.setOnClickListener(new ViewOnClickListenerC2176l5(5, r5, this));
        this.f895a.put(r5, r6);
        r0.addView(r6, new LinearLayout.LayoutParams(0, -2, 1.0f));
        goto L4
    L9:
        addView(r0);
        SharedPreferences r122 = AbstractC0599Nx.f1939a;
        EnumC0319Hb r123 = EnumC0319Hb.valueOf(AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-496824636930101L), AbstractC0295Gu.m625r(-496974960785461L)));     // Catch: IllegalArgumentException -> L12
    L13:
        this.f898d = r123;
        m558a(r123);
        return;
    L12:
        r123 = EnumC0319Hb.f1047b;
        goto L13
    }

    /* JADX INFO: renamed from: a */
    public final void m558a(EnumC0319Hb r8) {
        AbstractC0295Gu.m625r(-495020750665781L);
        this.f898d = r8;
        Iterator r0 = this.f895a.entrySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L29;
        Map.Entry r1 = (Map.Entry) r0.next();
        EnumC0319Hb r2 = (EnumC0319Hb) r1.getKey();
        TextView r12 = (TextView) r1.getValue();
        if (r2 != r8) goto L8;
        boolean r22 = true;
    L9:
        if (r22 == false) goto L11;
        int r5 = this.f899e;
    L12:
        r12.setTextColor(r5);
        if (r22 == false) goto L15;
        float r52 = 1.0f;
    L16:
        r12.setAlpha(r52);
        int r53 = this.f897c.ordinal();
        if (r53 != 0) goto L18;
        if ((r12 instanceof C2621vC) == false) goto L28;
        C2621vC r3 = (C2621vC) r12;
        r3.f9100a = r22;
        r3.invalidate();
    L28:
        r12.setBackground(null);
        goto L4
    L18:
        if (r53 != 1) goto L24;
        if ((r12 instanceof C2621vC) == false) goto L22;
        C2621vC r4 = (C2621vC) r12;
        r4.f9100a = false;
        r4.invalidate();
        r4.f9101b = r22;
        r4.invalidate();
    L22:
        r12.setBackground(null);
        goto L4
    L24:
        throw new C0232Fa();
    L15:
        r52 = 0.7f;
        goto L16
    L11:
        r5 = this.f900f;
        goto L12
    L8:
        r22 = false;
        goto L9
    }

    public final EnumC0319Hb getCurrentSelectedType() {
        return this.f898d;
    }

    public final void setOnTabSelectedListener(InterfaceC1416fj r3) {
        AbstractC0295Gu.m625r(-495626341054517L);
        this.f896b = r3;
    }

    public final void setSelectedColor(int r6) {
        if (r6 != 0) goto L4;
        return;
    L4:
        this.f899e = r6;
        Iterator r0 = this.f895a.values().iterator();
    L6:
        if (r0.hasNext() == false) goto L10;
        TextView r1 = (TextView) r0.next();
        if ((r1 instanceof C2621vC) == false) goto L6;
        C2621vC r12 = (C2621vC) r1;
        r12.f9102c.setColor(r6);
        r12.f9103d.setColor((16777215 & r6) | 855638016);
        r12.invalidate();
        goto L6
    L10:
        m558a(this.f898d);
    }

    public final void setTabStyle(EnumC1400fA r3) {
        AbstractC0295Gu.m625r(-494994980862005L);
        this.f897c = r3;
        m558a(this.f898d);
    }

    public final void setUnselectedColor(int r1) {
        if (r1 == 0) goto L5;
        this.f900f = r1;
        m558a(this.f898d);
        return;
    }
}
