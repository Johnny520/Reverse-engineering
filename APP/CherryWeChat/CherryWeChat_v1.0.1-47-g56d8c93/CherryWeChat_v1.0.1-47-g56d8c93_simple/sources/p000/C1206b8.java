package p000;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: b8 */
/* JADX INFO: loaded from: classes.dex */
public final class C1206b8 implements InterfaceC0972Wk {

    /* JADX INFO: renamed from: a */
    public ScrollView f4131a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f4132b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f4133c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f4134d;

    /* JADX INFO: renamed from: e */
    public int f4135e;

    /* JADX INFO: renamed from: f */
    public int f4136f;

    public C1206b8() {
        this.f4133c = new ArrayList();
        C0867U7 r0 = ViewOnClickListenerC0996X7.f3170f;
        this.f4134d = AbstractC0295Gu.m619l();
        this.f4135e = -1;
        this.f4136f = -1;
    }

    /* JADX INFO: renamed from: a */
    public static List m2325a() {
        return AbstractC2496sa.m4977b0(new String[]{AbstractC0295Gu.m625r(-89335319754805L), AbstractC0295Gu.m625r(-89893665503285L), AbstractC0295Gu.m625r(-89902255437877L), AbstractC0295Gu.m625r(-89910845372469L), AbstractC0295Gu.m625r(-89919435307061L), AbstractC0295Gu.m625r(-89928025241653L), AbstractC0295Gu.m625r(-89936615176245L), AbstractC0295Gu.m625r(-89945205110837L), AbstractC0295Gu.m625r(-89953795045429L)});
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-90147068573749L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity r1, int r2, int r3, Intent r4) {
        AbstractC0295Gu.m625r(-89635967465525L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity r13) {
        AbstractC0295Gu.m625r(-89550068119605L);
        ScrollView r2 = new ScrollView(r13);
        r2.setBackgroundColor(r13.getColor(R.color.colorBackground));
        r2.setVerticalScrollBarEnabled(false);
        r2.setOverScrollMode(2);
        r2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f4131a = r2;
        LinearLayout r22 = new LinearLayout(r13);
        r22.setOrientation(1);
        r22.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r22.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        ScrollView r8 = this.f4131a;
        ScrollView r82 = r8;
        if (r8 != null) goto L5;
        AbstractC0295Gu.m625r(-89588722825269L);
        r82 = null;
    L5:
        r82.addView(r22);
        LinearLayout r83 = new LinearLayout(r13);
        r83.setOrientation(0);
        r83.setGravity(16);
        LinearLayout.LayoutParams r6 = new LinearLayout.LayoutParams(-1, -2);
        r6.bottomMargin = AbstractC0295Gu.m616i(12);
        r83.setLayoutParams(r6);
        TextView r62 = new TextView(r13);
        AbstractC0213Ey.m414l(-89073326749749L, r62, 13.0f);
        r62.setTextColor(r13.getColor(R.color.textSummary));
        LinearLayout.LayoutParams r9 = new LinearLayout.LayoutParams(0, -2);
        r9.weight = 1.0f;
        r62.setLayoutParams(r9);
        r83.addView(r62);
        int r3 = r13.getColor(R.color.colorPrimary);
        TextView r63 = new TextView(r13);
        r63.setText(AbstractC0295Gu.m625r(-89111981455413L));
        r63.setTextSize(13.0f);
        r63.setTextColor(r3);
        r63.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(6));
        GradientDrawable r0 = new GradientDrawable();
        r0.setColor(Color.argb(26, Color.red(r3), Color.green(r3), Color.blue(r3)));
        r0.setCornerRadius(AbstractC0295Gu.m616i(14));
        r63.setBackground(r0);
        r63.setOnClickListener(new ViewOnClickListenerC2176l5(1, this, r13));
        r83.addView(r63);
        r22.addView(r83);
        LinearLayout r02 = new LinearLayout(r13);
        r02.setOrientation(1);
        GradientDrawable r32 = new GradientDrawable();
        r32.setColor(r13.getColor(R.color.cardBackground));
        r32.setCornerRadius(AbstractC0295Gu.m616i(12));
        r32.setStroke(AbstractC0295Gu.m616i(1), r13.getColor(R.color.cardStroke));
        r02.setBackground(r32);
        r02.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r02.setClipToOutline(true);
        r22.addView(r02);
        LinearLayout r1 = new LinearLayout(r13);
        r1.setOrientation(1);
        this.f4132b = r1;
        r02.addView(r1);
        m2326e(r13);
    }

    /* JADX INFO: renamed from: e */
    public final void m2326e(Activity r12) {
        ArrayList r0 = this.f4133c;
        r0.clear();
        LinearLayout r1 = this.f4132b;
        if (r1 != null) goto L5;
        AbstractC0295Gu.m625r(-89197880801333L);
        r1 = null;
    L5:
        r1.removeAllViews();
        String r13 = AbstractC0599Nx.f1939a.getString(AbstractC0295Gu.m625r(-839416998262837L), AbstractC0295Gu.m625r(-838935961925685L));
        int r3 = r13.length();
        ArrayList r4 = this.f4134d;
        if (r3 != 0) goto L11;
        C0286Gl r14 = AbstractC2496sa.m4975Z(r4);
        ArrayList r32 = new ArrayList(AbstractC2539ta.m5019d0(r14, 10));
        Iterator r15 = r14.iterator();
    L8:
        C0200El r5 = (C0200El) r15;
        if (r5.f605c == false) goto L18;
        r32.add(String.valueOf(r5.nextInt()));
    L18:
        if (r32.isEmpty() == false) goto L20;
        List r16 = m2325a();
    L21:
        List r52 = AbstractC2453ra.m4908r0(AbstractC2496sa.m4975Z(r4));
        ArrayList r6 = new ArrayList();
        Iterator r17 = r16.iterator();
    L23:
        if (r17.hasNext() == false) goto L29;
        String r7 = (String) r17.next();
        if (r52.contains(Integer.valueOf(Integer.parseInt(r7))) == false) goto L23;
        if (r6.contains(r7) == true) goto L23;
        r6.add(r7);
        goto L23
    L29:
        Iterator r18 = r52.iterator();
    L31:
        if (r18.hasNext() == false) goto L35;
        int r53 = ((Number) r18.next()).intValue();
        if (r6.contains(String.valueOf(r53)) == true) goto L31;
        r6.add(String.valueOf(r53));
        goto L31
    L35:
        int r19 = r6.size();
        int r54 = 0;
    L36:
        if (r54 >= r19) goto L41;
        int r72 = Integer.parseInt((String) r6.get(r54));
        C2629ve r8 = new C2629ve(r12);
        r8.setTitle(((C0867U7) r4.get(r72)).f2737a);
        r8.setChecked(r32.contains(String.valueOf(r72)));
        r8.setTag(Integer.valueOf(r72));
        final int r9 = 0;
        r8.setOnCheckedChangeListener(new C1039Y7(this, r9));
        final int r92 = 1;
        r8.setOnDragStartListener(new C1039Y7(this, r92));
        r8.setOnDragMoveListener(new C1082Z7(0, this));
        final int r93 = 2;
        r8.setOnDragEndListener(new C1039Y7(this, r93));
        r0.add(r8);
        LinearLayout r73 = this.f4132b;
        if (r73 != null) goto L40;
        AbstractC0295Gu.m625r(-89262305310773L);
        r73 = null;
    L40:
        r73.addView(r8);
        r54 = r54 + 1;
        goto L36
    L41:
        return;
    L20:
        r16 = r32;
        goto L21
    L11:
        List r110 = AbstractC2564tz.m5065Z(r13, new String[]{AbstractC0295Gu.m625r(-89326729820213L)}, 6);
        r32 = new ArrayList();
        Iterator r111 = r110.iterator();
    L13:
        if (r111.hasNext() == false) goto L18;
        Object r55 = r111.next();
        if (((String) r55).length() <= 0) goto L13;
        r32.add(r55);
        goto L13
    }

    /* JADX INFO: renamed from: f */
    public final void m2327f() {
        ArrayList r0 = new ArrayList();
        Iterator r1 = this.f4133c.iterator();
    L4:
        if (r1.hasNext() == false) goto L11;
        Object r2 = r1.next();
        C1030Xz r3 = ((C2629ve) r2).f9122a;
        if (r3 == null) goto L8;
        boolean r32 = r3.f3294a;
    L9:
        if (r32 == false) goto L4;
        r0.add(r2);
        goto L4
    L8:
        r32 = false;
        goto L9
    L11:
        ArrayList r4 = new ArrayList(AbstractC2539ta.m5019d0(r0, 10));
        Iterator r02 = r0.iterator();
    L13:
        if (r02.hasNext() == false) goto L15;
        r4.add(((C2629ve) r02.next()).getTag().toString());
        goto L13
    L15:
        SharedPreferences r03 = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1175d(AbstractC2453ra.m4901k0(r4, AbstractC0295Gu.m625r(-90129888704565L), null, null, null, 62));
        ViewOnClickListenerC0996X7 r04 = AbstractC0828TB.f2613e;
        if (r04 == null) goto L25;
        r04.m1890c();
        return;
    }

    @Override // p000.InterfaceC0972Wk
    public final View getContentView() {
        ScrollView r0 = this.f4131a;
        if (r0 != null) goto L6;
        AbstractC0295Gu.m625r(-89674622171189L);
        return null;
    L6:
        return r0;
    }

    @Override // p000.InterfaceC0972Wk
    public final String getTitle() {
        return AbstractC0295Gu.m625r(-89708981909557L);
    }
}
