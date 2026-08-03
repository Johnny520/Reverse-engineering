package p000;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.AbstractC1158g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import de.robv.android.xposed.XposedHelpers;
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ha */
/* JADX INFO: loaded from: classes.dex */
public final class C1495ha implements InterfaceC0972Wk {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5264a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f5265b;

    /* JADX INFO: renamed from: c */
    public RecyclerView f5266c;

    /* JADX INFO: renamed from: d */
    public EditText f5267d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f5268e;

    /* JADX INFO: renamed from: f */
    public TextView f5269f;

    /* JADX INFO: renamed from: g */
    public C0987Wz f5270g;

    /* JADX INFO: renamed from: h */
    public AbstractC1158g f5271h;

    /* JADX INFO: renamed from: i */
    public Object f5272i;

    public C1495ha(int r1) {
        this.f5264a = r1;
        switch(r1) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        this.f5272i = new ArrayList();
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: a */
    public void m2858a(String r9) {
        if (this.f5272i.isEmpty() == false) goto L5;
        C0183EA.f539a.getClass();
        this.f5272i = C0183EA.f543e;
    L5:
        boolean r1 = true;
        if (r9.length() != 0) goto L8;
        ?? r0 = this.f5272i;
    L27:
        C1258ca r2 = (C1258ca) this.f5271h;
        if (r2 == null) goto L34;
        AbstractC0295Gu.m625r(-101460012431413L);
        ArrayList r3 = (ArrayList) r2.f4264d;
        r3.clear();
        r3.addAll(r0);
        LinkedHashMap r4 = r2.f4262b;
        r4.clear();
        Iterator r32 = AbstractC2496sa.m4975Z(r3).iterator();
    L30:
        C0200El r5 = (C0200El) r32;
        if (r5.f605c == false) goto L33;
        r4.put(Integer.valueOf(r5.nextInt()), Boolean.FALSE);
        goto L30
    L33:
        r2.notifyDataSetChanged();
    L34:
        int r22 = r0.size();
        if (r9.length() != 0) goto L39;
        TextView r23 = this.f5269f;
        if (r23 == null) goto L45;
        r23.setVisibility(8);
    L45:
        boolean r02 = r0.isEmpty();
        if (r9.length() > 0) goto L49;
        r1 = false;
    L49:
        m2862h(r02, r1);
        return;
    L39:
        TextView r33 = this.f5269f;
        if (r33 == null) goto L42;
        r33.setVisibility(0);
    L42:
        TextView r34 = this.f5269f;
        if (r34 == null) goto L45;
        r34.setText(AbstractC0295Gu.m625r(-101253854001205L) + r22 + AbstractC0295Gu.m625r(-101271033870389L));
        goto L45
    L8:
        ?? r03 = this.f5272i;
        ArrayList r24 = new ArrayList();
        Iterator r04 = r03.iterator();
    L10:
        if (r04.hasNext() == false) goto L26;
        Object r35 = r04.next();
        C0054BA r42 = (C0054BA) r35;
        if (AbstractC2564tz.m5051L(r42.f121b, r9, true) == true) goto L25;
        if (AbstractC2564tz.m5051L(r42.f122c, r9, true) == true) goto L25;
        ArrayList r43 = r42.f126g;
        if (r43 == null) goto L20;
        if (r43.isEmpty() == true) goto L10;
    L20:
        Iterator r44 = r43.iterator();
    L22:
        if (r44.hasNext() == false) goto L10;
        if (AbstractC2564tz.m5051L(((C0140DA) r44.next()).f365b, r9, true) == false) goto L22;
    L25:
        r24.add(r35);
        goto L10
    L26:
        r0 = r24;
        goto L27
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        switch(this.f5264a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        long r0 = -83189221554229L;
    L5:
        AbstractC0295Gu.m625r(r0);
        return;
    L7:
        r0 = -101365523150901L;
        goto L5
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity r1, int r2, int r3, Intent r4) {
        switch(this.f5264a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        long r12 = -83227876259893L;
    L5:
        AbstractC0295Gu.m625r(r12);
        return;
    L7:
        r12 = -101404177856565L;
        goto L5
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.List] */
    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity r21) {
        switch(this.f5264a) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-83386790049845L);
        C0987Wz r5 = new C0987Wz(r21);
        r5.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r5.setColorSchemeColors(new int[]{r21.getColor(R.color.colorPrimary), r21.getColor(R.color.colorSuccess), r21.getColor(R.color.colorInfo)});
        r5.setOnRefreshListener(new C0698Q9(2, this, r21));
        this.f5270g = r5;
        LinearLayout r52 = new LinearLayout(r21);
        r52.setOrientation(1);
        r52.setBackgroundColor(r21.getColor(R.color.colorBackground));
        r52.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r52.setPadding(0, AbstractC0295Gu.m616i(12), 0, AbstractC0295Gu.m616i(12));
        this.f5265b = r52;
        this.f5270g.addView(r52);
        LinearLayout r53 = new LinearLayout(r21);
        r53.setOrientation(0);
        LinearLayout.LayoutParams r9 = new LinearLayout.LayoutParams(-1, -2);
        r9.setMargins(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        r53.setLayoutParams(r9);
        GradientDrawable r7 = new GradientDrawable();
        r7.setColor(r53.getContext().getColor(R.color.cardBackground));
        r7.setCornerRadius(AbstractC0295Gu.m616i(24));
        r7.setStroke(AbstractC0295Gu.m616i(1), r53.getContext().getColor(R.color.cardStroke));
        r53.setBackground(r7);
        r53.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12));
        r53.setGravity(16);
        ImageView r72 = new ImageView(r53.getContext());
        LinearLayout.LayoutParams r92 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        r92.setMarginEnd(AbstractC0295Gu.m616i(12));
        r72.setLayoutParams(r92);
        r72.setImageResource(R.drawable.ic_search);
        r72.setColorFilter(r72.getContext().getColor(R.color.textSecondary));
        r53.addView(r72);
        EditText r73 = new EditText(r53.getContext());
        r73.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        r73.setHint(AbstractC0295Gu.m625r(-83425444755509L));
        r73.setHintTextColor(r73.getContext().getColor(R.color.textSecondary));
        r73.setTextColor(r73.getContext().getColor(R.color.textTitle));
        r73.setTextSize(16.0f);
        r73.setBackground(null);
        r73.setSingleLine(true);
        r73.setImeOptions(3);
        r73.addTextChangedListener(new C1351e5(4, this));
        this.f5267d = r73;
        r53.addView(r73);
        ImageView r74 = new ImageView(r53.getContext());
        LinearLayout.LayoutParams r93 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        r93.setMarginStart(AbstractC0295Gu.m616i(12));
        r74.setLayoutParams(r93);
        r74.setImageResource(R.drawable.ic_clear);
        r74.setColorFilter(r74.getContext().getColor(R.color.textSecondary));
        r74.setVisibility(8);
        r74.setOnClickListener(new ViewOnClickListenerC2176l5(12, this, r74));
        r53.addView(r74);
        EditText r6 = this.f5267d;
        if (r6 == null) goto L7;
        r6.addTextChangedListener(new C1363ea(r74, 1));
    L7:
        this.f5265b.addView(r53);
        LinearLayout r54 = new LinearLayout(r21);
        r54.setOrientation(0);
        LinearLayout.LayoutParams r62 = new LinearLayout.LayoutParams(-1, -2);
        r62.setMargins(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), 0);
        r54.setLayoutParams(r62);
        r54.setGravity(16);
        ImageView r63 = new ImageView(r54.getContext());
        LinearLayout.LayoutParams r75 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        r75.setMarginEnd(AbstractC0295Gu.m616i(8));
        r63.setLayoutParams(r75);
        r63.setImageResource(R.drawable.ic_info);
        r63.setColorFilter(r63.getContext().getColor(R.color.textSecondary));
        r63.setClickable(true);
        r63.setFocusable(true);
        GradientDrawable r8 = new GradientDrawable();
        r8.setShape(1);
        r8.setColor(r63.getContext().getColor(R.color.buttonSecondary));
        r63.setBackground(r8);
        r63.setPadding(AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(4));
        r63.setOnClickListener(new ViewOnClickListenerC0094C7(this, r21, 1));
        r54.addView(r63);
        TextView r4 = new TextView(r54.getContext());
        r4.setText(AbstractC0295Gu.m625r(-83494164232245L));
        r4.setTextSize(12.0f);
        r4.setTextColor(r4.getContext().getColor(R.color.textSecondary));
        r4.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        r4.setClickable(true);
        r4.setFocusable(true);
        r4.setOnClickListener(new ViewOnClickListenerC0094C7(this, r21, 2));
        r54.addView(r4);
        this.f5265b.addView(r54);
        TextView r42 = new TextView(r21);
        LinearLayout.LayoutParams r55 = new LinearLayout.LayoutParams(-2, -2);
        r55.setMargins(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        r42.setLayoutParams(r55);
        r42.setTextSize(14.0f);
        r42.setTextColor(r42.getContext().getColor(R.color.textSecondary));
        r42.setVisibility(8);
        this.f5269f = r42;
        this.f5265b.addView(r42);
        LinearLayout r43 = new LinearLayout(r21);
        r43.setOrientation(1);
        r43.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r43.setGravity(17);
        r43.setPadding(AbstractC0295Gu.m616i(32), 0, AbstractC0295Gu.m616i(32), 0);
        r43.setVisibility(8);
        ImageView r3 = new ImageView(r43.getContext());
        LinearLayout.LayoutParams r64 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(80), AbstractC0295Gu.m616i(80));
        r64.bottomMargin = AbstractC0295Gu.m616i(16);
        r3.setLayoutParams(r64);
        r3.setImageResource(R.drawable.ic_search);
        r3.setColorFilter(r3.getContext().getColor(R.color.textSecondary));
        r3.setAlpha(0.5f);
        r43.addView(r3);
        TextView r2 = new TextView(r43.getContext());
        r2.setText(AbstractC0295Gu.m625r(-83034602731573L));
        r2.setTextSize(16.0f);
        r2.setTextColor(r2.getContext().getColor(R.color.textSecondary));
        r2.setGravity(17);
        r2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        r43.addView(r2);
        this.f5268e = r43;
        this.f5265b.addView(r43);
        RecyclerView r22 = new RecyclerView(r21);
        r22.setId(View.generateViewId());
        r22.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r22.setLayoutManager(new LinearLayoutManager(1));
        r22.setOverScrollMode(2);
        r22.setPadding(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), 0);
        r22.addItemDecoration(new C1320da(1));
        this.f5266c = r22;
        this.f5265b.addView(r22);
        C0183EA.f539a.getClass();
        ArrayList r23 = C0183EA.m381i();
        this.f5272i = r23;
        C0696Q7 r32 = new C0696Q7(r23, new C0693Q4(4, this));
        this.f5271h = r32;
        RecyclerView r24 = this.f5266c;
        if (r24 == null) goto L10;
        r24.setAdapter(r32);
    L10:
        m2863i(((ArrayList) this.f5272i).isEmpty(), false);
        m2860f(r21, false);
        return;
    L12:
        AbstractC0295Gu.m625r(-101563091646517L);
        String r44 = AbstractC0295Gu.m625r(-101601746352181L);
        boolean r56 = false;
        Object[] r65 = {0, AbstractC0295Gu.m625r(-101679055763509L), new MenuItemOnMenuItemClickListenerC0429Jz(this, r21)};
        AbstractC0295Gu.m625r(-578325936338997L);
        XposedHelpers.callMethod(r21, r44, Arrays.copyOf(r65, 3));
        C0987Wz r45 = new C0987Wz(r21);
        r45.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r45.setColorSchemeColors(new int[]{r21.getColor(R.color.colorPrimary), r21.getColor(R.color.colorSuccess), r21.getColor(R.color.colorInfo)});
        r45.setOnRefreshListener(new C0698Q9(0, this, r21));
        this.f5270g = r45;
        LinearLayout r46 = new LinearLayout(r21);
        r46.setOrientation(1);
        r46.setBackgroundColor(r21.getColor(R.color.colorBackground));
        r46.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r46.setPadding(0, AbstractC0295Gu.m616i(12), 0, AbstractC0295Gu.m616i(12));
        this.f5265b = r46;
        this.f5270g.addView(r46);
        LinearLayout r47 = new LinearLayout(r21);
        r47.setOrientation(0);
        LinearLayout.LayoutParams r10 = new LinearLayout.LayoutParams(-1, -2);
        r10.setMargins(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        r47.setLayoutParams(r10);
        GradientDrawable r82 = new GradientDrawable();
        r82.setColor(r21.getColor(R.color.cardBackground));
        r82.setCornerRadius(AbstractC0295Gu.m616i(24));
        r82.setStroke(AbstractC0295Gu.m616i(1), r21.getColor(R.color.cardStroke));
        r47.setBackground(r82);
        r47.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12));
        r47.setGravity(16);
        ImageView r83 = new ImageView(r21);
        LinearLayout.LayoutParams r102 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        r102.setMarginEnd(AbstractC0295Gu.m616i(12));
        r83.setLayoutParams(r102);
        r83.setImageResource(R.drawable.ic_search);
        r83.setColorFilter(r21.getColor(R.color.textSecondary));
        r47.addView(r83);
        EditText r84 = new EditText(r21);
        r84.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        r84.setHint(AbstractC0295Gu.m625r(-101691940665397L));
        r84.setHintTextColor(r21.getColor(R.color.textSecondary));
        r84.setTextColor(r21.getColor(R.color.textTitle));
        r84.setTextSize(16.0f);
        r84.setBackground(null);
        r84.setSingleLine(true);
        r84.setImeOptions(3);
        r84.addTextChangedListener(new C1351e5(1, this));
        this.f5267d = r84;
        r47.addView(r84);
        ImageView r76 = new ImageView(r21);
        LinearLayout.LayoutParams r85 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        r85.setMarginStart(AbstractC0295Gu.m616i(12));
        r76.setLayoutParams(r85);
        r76.setImageResource(R.drawable.ic_clear);
        r76.setColorFilter(r21.getColor(R.color.textSecondary));
        r76.setVisibility(8);
        r76.setOnClickListener(new ViewOnClickListenerC2176l5(2, this, r76));
        r47.addView(r76);
        EditText r86 = this.f5267d;
        if (r86 == null) goto L15;
        r86.addTextChangedListener(new C1363ea(r76, 0));
    L15:
        this.f5265b.addView(r47);
        TextView r48 = new TextView(r21);
        LinearLayout.LayoutParams r77 = new LinearLayout.LayoutParams(-2, -2);
        r77.setMargins(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        r48.setLayoutParams(r77);
        r48.setTextSize(14.0f);
        r48.setTextColor(r21.getColor(R.color.textSecondary));
        r48.setVisibility(8);
        this.f5269f = r48;
        this.f5265b.addView(r48);
        LinearLayout r49 = new LinearLayout(r21);
        r49.setOrientation(1);
        r49.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r49.setGravity(17);
        r49.setPadding(AbstractC0295Gu.m616i(32), 0, AbstractC0295Gu.m616i(32), 0);
        r49.setVisibility(8);
        ImageView r33 = new ImageView(r21);
        LinearLayout.LayoutParams r87 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(80), AbstractC0295Gu.m616i(80));
        r87.bottomMargin = AbstractC0295Gu.m616i(16);
        r33.setLayoutParams(r87);
        r33.setImageResource(R.drawable.ic_search);
        r33.setColorFilter(r21.getColor(R.color.textSecondary));
        r33.setAlpha(0.5f);
        r49.addView(r33);
        TextView r25 = new TextView(r21);
        AbstractC0213Ey.m414l(-101210904328245L, r25, 16.0f);
        r25.setTextColor(r21.getColor(R.color.textSecondary));
        r25.setGravity(17);
        r25.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        r49.addView(r25);
        this.f5268e = r49;
        this.f5265b.addView(r49);
        RecyclerView r26 = new RecyclerView(r21);
        r26.setId(View.generateViewId());
        r26.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r26.setLayoutManager(new LinearLayoutManager(1));
        r26.setOverScrollMode(2);
        r26.setPadding(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), 0);
        r26.addItemDecoration(new C1320da(0));
        this.f5266c = r26;
        this.f5265b.addView(r26);
        C0183EA.f539a.getClass();
        ArrayList r27 = C0183EA.f543e;
        this.f5272i = r27;
        C1258ca r34 = new C1258ca(r21, new ArrayList(r27));
        this.f5271h = r34;
        RecyclerView r28 = this.f5266c;
        if (r28 == null) goto L18;
        r28.setAdapter(r34);
    L18:
        m2862h(this.f5272i.isEmpty(), false);
        C1036Y4 r29 = C1036Y4.f3308a;
        C0740R9 r35 = new C0740R9(this, r56, r21, 0);
        C0740R9 r410 = new C0740R9(this, r56, r21, 1);
        r29.getClass();
        C1036Y4.m1982a(r21, r35, r410, true);
    }

    /* JADX INFO: renamed from: e */
    public void m2859e(String r9) {
        if (((ArrayList) this.f5272i).isEmpty() == false) goto L5;
        C0183EA.f539a.getClass();
        this.f5272i = C0183EA.m381i();
    L5:
        boolean r1 = true;
        if (r9.length() != 0) goto L8;
        C0183EA.f539a.getClass();
        ArrayList r0 = new ArrayList(C0183EA.m381i());
    L19:
        C0696Q7 r2 = (C0696Q7) this.f5271h;
        if (r2 == null) goto L22;
        AbstractC0295Gu.m625r(-85697482455093L);
        ArrayList r3 = r2.f2239b;
        r3.clear();
        r3.addAll(r0);
        r2.notifyDataSetChanged();
    L22:
        int r22 = r0.size();
        if (r9.length() != 0) goto L27;
        TextView r23 = this.f5269f;
        if (r23 == null) goto L33;
        r23.setVisibility(8);
    L33:
        boolean r02 = r0.isEmpty();
        if (r9.length() > 0) goto L37;
        r1 = false;
    L37:
        m2863i(r02, r1);
        return;
    L27:
        TextView r32 = this.f5269f;
        if (r32 == null) goto L30;
        r32.setVisibility(0);
    L30:
        TextView r33 = this.f5269f;
        if (r33 == null) goto L33;
        r33.setText(AbstractC0295Gu.m625r(-83077552404533L) + r22 + AbstractC0295Gu.m625r(-83094732273717L));
        goto L33
    L8:
        ArrayList r03 = (ArrayList) this.f5272i;
        ArrayList r24 = new ArrayList();
        Iterator r04 = r03.iterator();
    L10:
        if (r04.hasNext() == false) goto L18;
        Object r34 = r04.next();
        C0097CA r4 = (C0097CA) r34;
        if (AbstractC2564tz.m5051L(r4.f224b, r9, true) == true) goto L17;
        if (AbstractC2564tz.m5051L(r4.f225c, r9, true) == true) goto L17;
        if (AbstractC2564tz.m5051L(r4.f227e, r9, true) == false) goto L10;
    L17:
        r24.add(r34);
        goto L10
    L18:
        r0 = r24;
        goto L19
    }

    /* JADX INFO: renamed from: f */
    public void m2860f(Activity r5, boolean r6) {
        C0183EA.f539a.getClass();
        this.f5272i = C0183EA.m381i();
        EditText r0 = this.f5267d;
        if (r0 == null) goto L8;
        Editable r02 = r0.getText();
        if (r02 == null) goto L8;
        String r03 = r02.toString();
        if (r03 == null) goto L8;
    L9:
        m2859e(r03);
        C0987Wz r04 = this.f5270g;
        if (r04 == null) goto L12;
        r04.setRefreshing(false);
    L12:
        if (r6 == false) goto L15;
        Toast.makeText(r5, AbstractC0295Gu.m625r(-81647328294965L), 0).show();
        return;
    L15:
        return;
    L8:
        r03 = AbstractC0295Gu.m625r(-81643033327669L);
        goto L9
    }

    /* JADX INFO: renamed from: g */
    public void m2861g() {
        C0183EA.f539a.getClass();
        this.f5272i = C0183EA.f543e;
        EditText r0 = this.f5267d;
        if (r0 == null) goto L8;
        Editable r02 = r0.getText();
        if (r02 == null) goto L8;
        String r03 = r02.toString();
        if (r03 == null) goto L8;
    L9:
        m2858a(r03);
        return;
    L8:
        r03 = AbstractC0295Gu.m625r(-102014063212597L);
        goto L9
    }

    @Override // p000.InterfaceC0972Wk
    public final View getContentView() {
        switch(this.f5264a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f5270g;
    L7:
        return this.f5270g;
    }

    @Override // p000.InterfaceC0972Wk
    public final String getTitle() {
        switch(this.f5264a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return AbstractC0295Gu.m625r(-83266530965557L);
    L7:
        return AbstractC0295Gu.m625r(-101992588376117L);
    }

    /* JADX INFO: renamed from: h */
    public void m2862h(boolean r3, boolean r4) {
        if (r3 == false) goto L23;
        LinearLayout r32 = this.f5268e;
        if (r32 == null) goto L7;
        r32.setVisibility(0);
    L7:
        RecyclerView r33 = this.f5266c;
        if (r33 == null) goto L10;
        r33.setVisibility(8);
    L10:
        LinearLayout r34 = this.f5268e;
        TextView r0 = null;
        if (r34 == null) goto L13;
        View r35 = r34.getChildAt(1);
    L15:
        if ((r35 instanceof TextView) == false) goto L17;
        r0 = (TextView) r35;
    L17:
        if (r0 == null) goto L30;
        if (r4 == false) goto L20;
        String r36 = AbstractC0295Gu.m625r(-101292508706869L);
    L21:
        r0.setText(r36);
        return;
    L20:
        r36 = AbstractC0295Gu.m625r(-101335458379829L);
        goto L21
    L30:
        return;
    L13:
        r35 = null;
        goto L15
    L23:
        LinearLayout r37 = this.f5268e;
        if (r37 == null) goto L26;
        r37.setVisibility(8);
    L26:
        RecyclerView r38 = this.f5266c;
        if (r38 == null) goto L31;
        r38.setVisibility(0);
        return;
    }

    /* JADX INFO: renamed from: i */
    public void m2863i(boolean r3, boolean r4) {
        if (r3 == false) goto L23;
        LinearLayout r32 = this.f5268e;
        if (r32 == null) goto L7;
        r32.setVisibility(0);
    L7:
        RecyclerView r33 = this.f5266c;
        if (r33 == null) goto L10;
        r33.setVisibility(8);
    L10:
        LinearLayout r34 = this.f5268e;
        TextView r0 = null;
        if (r34 == null) goto L13;
        View r35 = r34.getChildAt(1);
    L15:
        if ((r35 instanceof TextView) == false) goto L17;
        r0 = (TextView) r35;
    L17:
        if (r0 == null) goto L30;
        if (r4 == false) goto L20;
        String r36 = AbstractC0295Gu.m625r(-83116207110197L);
    L21:
        r0.setText(r36);
        return;
    L20:
        r36 = AbstractC0295Gu.m625r(-83159156783157L);
        goto L21
    L30:
        return;
    L13:
        r35 = null;
        goto L15
    L23:
        LinearLayout r37 = this.f5268e;
        if (r37 == null) goto L26;
        r37.setVisibility(8);
    L26:
        RecyclerView r38 = this.f5266c;
        if (r38 == null) goto L31;
        r38.setVisibility(0);
        return;
    }
}
