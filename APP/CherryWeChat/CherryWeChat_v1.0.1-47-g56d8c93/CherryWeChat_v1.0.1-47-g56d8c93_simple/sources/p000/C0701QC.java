package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1160i;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.github.cherrywechat.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: QC */
/* JADX INFO: loaded from: classes.dex */
public final class C0701QC implements InterfaceC0972Wk {

    /* JADX INFO: renamed from: a */
    public LinearLayout f2254a;

    /* JADX INFO: renamed from: b */
    public C0987Wz f2255b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f2256c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f2257d;

    /* JADX INFO: renamed from: e */
    public EditText f2258e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f2259f;

    /* JADX INFO: renamed from: g */
    public C1258ca f2260g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f2261h;

    /* JADX INFO: renamed from: i */
    public long f2262i;

    /* JADX INFO: renamed from: j */
    public boolean f2263j;

    /* JADX INFO: renamed from: k */
    public EnumC0142DC f2264k;

    /* JADX INFO: renamed from: l */
    public final LinkedHashMap f2265l;

    /* JADX INFO: renamed from: m */
    public List f2266m;

    /* JADX INFO: renamed from: n */
    public List f2267n;

    /* JADX INFO: renamed from: o */
    public EnumC0486LC f2268o;

    public C0701QC() {
        this.f2264k = EnumC0142DC.f370b;
        this.f2265l = new LinkedHashMap();
        C0452Kf r0 = C0452Kf.f1484a;
        this.f2266m = r0;
        this.f2267n = r0;
        this.f2268o = EnumC0486LC.f1596c;
    }

    /* JADX INFO: renamed from: a */
    public static final void m1430a(C0701QC r6) {
        List r0 = r6.f2266m;
        int r2 = 0;
        if (r0 != null) goto L5;
    L7:
        Iterator r02 = r0.iterator();
        int r3 = 0;
    L9:
        if (r02.hasNext() == false) goto L21;
        EnumC0099CC r4 = ((C0185EC) r02.next()).f567s;
        if (r4 == EnumC0099CC.f234b) goto L16;
        if (r4 == EnumC0099CC.f236d) goto L16;
        if (r4 != EnumC0099CC.f237e) goto L9;
    L16:
        r3 = r3 + 1;
        if (r3 >= 0) goto L9;
        throw new ArithmeticException("Count overflow has happened.");
    L21:
        List r62 = r6.f2266m;
        if (r62 != null) goto L24;
    L26:
        Iterator r63 = r62.iterator();
    L28:
        if (r63.hasNext() == false) goto L51;
        if (((C0185EC) r63.next()).f567s != EnumC0099CC.f237e) goto L28;
        r2 = r2 + 1;
        if (r2 >= 0) goto L28;
        throw new ArithmeticException("Count overflow has happened.");
    L51:
        return;
    L24:
        if (r62.isEmpty() == false) goto L26;
        return;
    L5:
        if (r0.isEmpty() == false) goto L7;
        goto L7
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-464419108681781L);
        C0357IC.f1218a.getClass();
        AbstractC0295Gu.m625r(-802634898339893L);
        C0357IC.f1220c.remove(this);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity r1, int r2, int r3, Intent r4) {
        AbstractC0295Gu.m625r(-464457763387445L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity r22) {
        AbstractC0295Gu.m625r(-484867447978037L);
        C0357IC.f1218a.getClass();
        AbstractC0295Gu.m625r(-802596243634229L);
        ArrayList r2 = C0357IC.f1220c;
        if (r2.contains(this) == true) goto L5;
        r2.add(this);
    L5:
        FrameLayout r23 = new FrameLayout(r22);
        r23.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r23.setBackgroundColor(r22.getColor(R.color.colorBackground));
        this.f2256c = r23;
        C0987Wz r24 = new C0987Wz(r22);
        FrameLayout.LayoutParams r5 = new FrameLayout.LayoutParams(-1, -1);
        r5.bottomMargin = AbstractC0295Gu.m616i(80);
        r24.setLayoutParams(r5);
        r24.setColorSchemeColors(new int[]{r22.getColor(R.color.colorPrimary), r22.getColor(R.color.colorSuccess), r22.getColor(R.color.colorInfo)});
        r24.setOnRefreshListener(new C2464rl(this, r22));
        this.f2255b = r24;
        LinearLayout r25 = new LinearLayout(r22);
        r25.setOrientation(1);
        r25.setBackgroundColor(r22.getColor(R.color.colorBackground));
        r25.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        int r11 = 0;
        r25.setPadding(0, AbstractC0295Gu.m616i(12), 0, AbstractC0295Gu.m616i(12));
        this.f2254a = r25;
        this.f2255b.addView(r25);
        this.f2256c.addView(this.f2255b);
        LinearLayout r9 = new LinearLayout(r22);
        r9.setOrientation(0);
        LinearLayout.LayoutParams r10 = new LinearLayout.LayoutParams(-1, -2);
        r10.setMargins(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        r9.setLayoutParams(r10);
        GradientDrawable r4 = new GradientDrawable();
        r4.setColor(r22.getColor(R.color.cardBackground));
        r4.setCornerRadius(AbstractC0295Gu.m616i(24));
        r4.setStroke(AbstractC0295Gu.m616i(1), r22.getColor(R.color.cardStroke));
        r9.setBackground(r4);
        r9.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12));
        r9.setGravity(16);
        ImageView r42 = new ImageView(r22);
        LinearLayout.LayoutParams r52 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        r52.setMarginEnd(AbstractC0295Gu.m616i(12));
        r42.setLayoutParams(r52);
        r42.setImageResource(R.drawable.ic_search);
        r42.setColorFilter(r22.getColor(R.color.textSecondary));
        r9.addView(r42);
        EditText r43 = new EditText(r22);
        r43.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        r43.setHint(AbstractC0295Gu.m625r(-484356346869813L));
        r43.setHintTextColor(r22.getColor(R.color.textSecondary));
        r43.setTextColor(r22.getColor(R.color.textTitle));
        r43.setTextSize(16.0f);
        r43.setBackground(null);
        r43.setSingleLine(true);
        r43.setImeOptions(3);
        r43.addTextChangedListener(new C1351e5(5, this));
        this.f2258e = r43;
        r9.addView(r43);
        ImageView r44 = new ImageView(r22);
        LinearLayout.LayoutParams r53 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        r53.setMarginStart(AbstractC0295Gu.m616i(12));
        r44.setLayoutParams(r53);
        r44.setImageResource(R.drawable.ic_clear);
        r44.setColorFilter(r22.getColor(R.color.textSecondary));
        r44.setVisibility(8);
        r44.setOnClickListener(new ViewOnClickListenerC2176l5(21, this, r44));
        r9.addView(r44);
        EditText r54 = this.f2258e;
        if (r54 == null) goto L8;
        r54.addTextChangedListener(new C1363ea(r44, 2));
    L8:
        LinearLayout r45 = new LinearLayout(r22);
        r45.setOrientation(0);
        LinearLayout.LayoutParams r55 = new LinearLayout.LayoutParams(0, -2);
        r55.weight = 1.0f;
        r55.setMarginStart(AbstractC0295Gu.m616i(12));
        r45.addView(r9, r55);
        ImageView r56 = new ImageView(r22);
        LinearLayout.LayoutParams r6 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(30), AbstractC0295Gu.m616i(30));
        r6.setMarginStart(AbstractC0295Gu.m616i(12));
        r6.setMarginEnd(AbstractC0295Gu.m616i(12));
        r6.gravity = 16;
        r56.setLayoutParams(r6);
        r56.setImageResource(R.drawable.ic_drag_handle);
        r56.setColorFilter(r22.getColor(R.color.textSecondary));
        r56.setOnClickListener(new ViewOnClickListenerC2176l5(22, this, r22));
        r45.addView(r56);
        this.f2254a.addView(r45);
        TextView r26 = new TextView(r22);
        LinearLayout.LayoutParams r3 = new LinearLayout.LayoutParams(-1, -2);
        r3.setMargins(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        r26.setLayoutParams(r3);
        r26.setTextSize(12.0f);
        r26.setTextColor(r22.getColor(R.color.textSecondary));
        r26.setGravity(17);
        r26.setVisibility(8);
        this.f2254a.addView(r26);
        LinearLayout r27 = new LinearLayout(r22);
        r27.setOrientation(1);
        r27.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r27.setGravity(17);
        r27.setPadding(AbstractC0295Gu.m616i(32), 0, AbstractC0295Gu.m616i(32), 0);
        r27.setVisibility(8);
        ImageView r57 = new ImageView(r22);
        LinearLayout.LayoutParams r62 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(80), AbstractC0295Gu.m616i(80));
        r62.bottomMargin = AbstractC0295Gu.m616i(16);
        r57.setLayoutParams(r62);
        r57.setImageResource(R.drawable.ic_search);
        r57.setColorFilter(r22.getColor(R.color.textSecondary));
        r57.setAlpha(0.5f);
        r27.addView(r57);
        TextView r58 = new TextView(r22);
        AbstractC0213Ey.m414l(-465617404557365L, r58, 16.0f);
        r58.setTextColor(r22.getColor(R.color.textSecondary));
        r58.setGravity(17);
        r27.addView(r58);
        this.f2261h = r27;
        this.f2254a.addView(r27);
        RecyclerView r28 = new RecyclerView(r22);
        r28.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r28.setOverScrollMode(2);
        r28.setPadding(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), 0);
        r28.addItemDecoration(new C1320da(3));
        this.f2259f = r28;
        C1258ca r29 = new C1258ca(this);
        this.f2260g = r29;
        this.f2259f.setAdapter(r29);
        this.f2254a.addView(this.f2259f);
        m1435i();
        FrameLayout r210 = this.f2256c;
        LinearLayout r63 = new LinearLayout(r22);
        r63.setOrientation(0);
        FrameLayout.LayoutParams r7 = new FrameLayout.LayoutParams(-1, AbstractC0295Gu.m616i(72));
        r7.gravity = 80;
        r63.setLayoutParams(r7);
        r63.setBackgroundColor(r22.getColor(R.color.cardBackground));
        r63.setGravity(16);
        r63.setPadding(AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8));
        r63.setElevation(AbstractC0295Gu.m616i(8));
        this.f2257d = r63;
        View r64 = new View(r22);
        FrameLayout.LayoutParams r72 = new FrameLayout.LayoutParams(-1, AbstractC0295Gu.m616i(1));
        r72.gravity = 80;
        r72.bottomMargin = AbstractC0295Gu.m616i(72);
        r64.setLayoutParams(r72);
        r64.setBackgroundColor(r22.getColor(R.color.cardStroke));
        r210.addView(r64);
        EnumC0142DC[] r65 = EnumC0142DC.values();
        int r73 = r65.length;
        int r8 = 0;
    L9:
        if (r8 >= r73) goto L18;
        EnumC0142DC r92 = r65[r8];
        LinearLayout r13 = new LinearLayout(r22);
        r13.setOrientation(1);
        r13.setGravity(17);
        r13.setLayoutParams(new LinearLayout.LayoutParams(r11, -1, 1.0f));
        r13.setPadding(AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(6));
        ImageView r112 = new ImageView(r22);
        LinearLayout.LayoutParams r12 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24));
        r12.gravity = 1;
        r112.setLayoutParams(r12);
        int r122 = r92.ordinal();
        if (r122 == 0) goto L16;
        if (r122 != 1) goto L15;
        int r123 = R.drawable.ic_store;
    L17:
        r112.setImageResource(r123);
        r112.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        r13.addView(r112);
        TextView r113 = new TextView(r22);
        r113.setText(r92.f372a);
        r113.setTextSize(12.0f);
        r113.setGravity(17);
        LinearLayout.LayoutParams r124 = new LinearLayout.LayoutParams(-2, -2);
        r124.topMargin = AbstractC0295Gu.m616i(4);
        r113.setLayoutParams(r124);
        r113.setMaxLines(1);
        r13.addView(r113);
        r13.setOnClickListener(new ViewOnClickListenerC2176l5(23, this, r92));
        View r114 = r13.getChildAt(1);
        AbstractC0295Gu.m625r(-484596865038389L);
        this.f2265l.put(r92, (TextView) r114);
        this.f2257d.addView(r13);
        r8 = r8 + 1;
        r11 = 0;
        goto L9
    L15:
        throw new C0232Fa();
    L16:
        r123 = R.drawable.ic_my_themes;
        goto L17
    L18:
        r210.addView(this.f2257d);
        m1436j();
        m1433g(r22);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX INFO: renamed from: e */
    public final void m1431e(String r32) {
        C0357IC r2 = C0357IC.f1218a;
        EnumC0142DC r3 = this.f2264k;
        r2.getClass();
        AbstractC0295Gu.m625r(-803481006897205L);
        int r22 = r3.ordinal();
        int r33 = 8;
        int r4 = 0;
        if (r22 == 0) goto L14;
        if (r22 != 1) goto L13;
        List r23 = C0357IC.f1219b;
        ArrayList r6 = new ArrayList();
        Iterator r24 = r23.iterator();
    L7:
        if (r24.hasNext() == false) goto L11;
        Object r7 = r24.next();
        if (((C0185EC) r7).f567s != EnumC0099CC.f233a) goto L7;
        r6.add(r7);
        goto L7
    L11:
        List r25 = AbstractC2453ra.m4904n0(r6, new C0963Wb(r33));
    L47:
        AbstractC0295Gu.m625r(-803420877355061L);
        AbstractC0295Gu.m625r(-801857509259317L);
        AbstractC0295Gu.m625r(-801926228736053L);
        r25.size();
        AbstractC0295Gu.m625r(-801960588474421L);
        C0357IC.f1218a.getClass();
        AbstractC0295Gu.m625r(-801745840109621L);
        AbstractC0295Gu.m625r(-801771609913397L);
        if (AbstractC2564tz.m5059T(r32) == false) goto L50;
        ?? r62 = r25;
    L71:
        int r1 = this.f2268o.ordinal();
        if (r1 == 0) goto L83;
        int r72 = 12;
        if (r1 == 1) goto L82;
        int r9 = 13;
        if (r1 == 3) goto L81;
        ?? r63 = r62;
        if (r1 != 4) goto L84;
        r63 = AbstractC2453ra.m4904n0(r62, new C0963Wb(r9));
    L84:
        ?? r64 = r63;
        if (this.f2264k != EnumC0142DC.f370b) goto L109;
        ArrayList r12 = new ArrayList(r63);
        AbstractC2711xa.m5283e0(r12, new C0556Mx(14));
        Iterator r65 = r25.iterator();
    L87:
        Object r8 = null;
        if (r65.hasNext() == false) goto L92;
        Object r73 = r65.next();
        if (AbstractC0585Nj.m1134a(((C0185EC) r73).f549a, AbstractC0295Gu.m625r(-464273079793717L)) == false) goto L87;
    L93:
        C0185EC r74 = (C0185EC) r73;
        Iterator r26 = r25.iterator();
    L95:
        if (r26.hasNext() == false) goto L99;
        Object r66 = r26.next();
        if (AbstractC0585Nj.m1134a(((C0185EC) r66).f549a, AbstractC0295Gu.m625r(-464333209335861L)) == false) goto L95;
        r8 = r66;
    L99:
        C0185EC r82 = (C0185EC) r8;
        if (r74 == null) goto L106;
        r12.add(0, r74);
        if (r82 != null) goto L104;
    L108:
        r64 = r12;
        goto L109
    L104:
        if (AbstractC0585Nj.m1134a(r82.f549a, r74.f549a) == true) goto L108;
        r12.add(1, r82);
        goto L108
    L106:
        if (r82 == null) goto L108;
        r12.add(0, r82);
        goto L108
    L92:
        r73 = null;
    L109:
        this.f2267n = r64;
        C1258ca r13 = this.f2260g;
        if (r13 == null) goto L120;
        AbstractC0295Gu.m625r(-487246859860021L);
        List r27 = r13.f4264d;
        r13.f4264d = r64;
        if (r27.isEmpty() == false) goto L114;
    L119:
        r13.notifyDataSetChanged();
        goto L120
    L114:
        if (r64.isEmpty() == true) goto L119;
        if (Math.abs(r27.size() - r64.size()) > 10) goto L119;
        r13.notifyDataSetChanged();
    L120:
        boolean r14 = this.f2267n.isEmpty();
        LinearLayout r28 = this.f2261h;
        if (r28 == null) goto L126;
        if (r14 == false) goto L124;
        int r5 = 0;
    L125:
        r28.setVisibility(r5);
        goto L126
    L124:
        r5 = 8;
    L126:
        RecyclerView r29 = this.f2259f;
        if (r29 == null) goto L163;
        if (r14 == true) goto L131;
        r33 = 0;
    L131:
        r29.setVisibility(r33);
        return;
    L163:
        return;
    L81:
        r63 = AbstractC2453ra.m4904n0(r62, new C0060Ba(r4, new InterfaceC1416fj[]{new C0556Mx(r72), new C0556Mx(r9)}));
        goto L84
    L82:
        r63 = AbstractC2453ra.m4904n0(r62, new C0963Wb(r72));
        goto L84
    L83:
        r63 = AbstractC2453ra.m4904n0(r62, new C0963Wb(11));
        goto L84
    L50:
        r62 = new ArrayList();
        Iterator r75 = r25.iterator();
    L52:
        if (r75.hasNext() == false) goto L71;
        Object r83 = r75.next();
        C0185EC r92 = (C0185EC) r83;
        if (AbstractC0585Nj.m1134a(r92.f549a, AbstractC0295Gu.m625r(-801801674684469L)) == true) goto L56;
        if (AbstractC2564tz.m5051L(r92.f551c, r32, true) == true) goto L70;
        if (AbstractC2564tz.m5051L(r92.f552d, r32, true) == true) goto L70;
        if (AbstractC2564tz.m5051L(r92.f553e, r32, true) == false) goto L52;
    L70:
        r62.add(r83);
        goto L52
    L56:
        if (AbstractC2564tz.m5051L(r32, AbstractC0295Gu.m625r(-802411560040501L), true) == true) goto L70;
        if (AbstractC2564tz.m5051L(r32, AbstractC0295Gu.m625r(-802424444942389L), true) == true) goto L70;
        if (AbstractC2564tz.m5051L(r32, AbstractC0295Gu.m625r(-802437329844277L), true) == true) goto L70;
        if (AbstractC2564tz.m5051L(r32, AbstractC0295Gu.m625r(-802445919778869L), true) == false) goto L52;
    L13:
        throw new C0232Fa();
    L14:
        List r210 = C0357IC.f1219b;
        ArrayList r67 = new ArrayList();
        Iterator r211 = r210.iterator();
    L16:
        if (r211.hasNext() == false) goto L46;
        Object r76 = r211.next();
        C0185EC r84 = (C0185EC) r76;
        String r93 = r84.f550b;
        EnumC0099CC r10 = r84.f567s;
        if (AbstractC0585Nj.m1134a(r93, AbstractC0295Gu.m625r(-803498186766389L)) == false) goto L20;
    L23:
        boolean r85 = true;
    L25:
        if (r10 == EnumC0099CC.f234b) goto L33;
        if (r10 == EnumC0099CC.f235c) goto L33;
        if (r10 == EnumC0099CC.f236d) goto L33;
        if (r10 == EnumC0099CC.f237e) goto L33;
    L37:
        boolean r94 = false;
    L38:
        if (r85 == true) goto L42;
        if (r94 == true) goto L42;
        boolean r86 = false;
    L43:
        AbstractC0295Gu.m625r(-803523956570165L);
        AbstractC0295Gu.m625r(-803609855916085L);
        AbstractC0295Gu.m625r(-803648510621749L);
        AbstractC0295Gu.m625r(-803674280425525L);
        AbstractC0295Gu.m625r(-803721525065781L);
        Objects.toString(r10);
        AbstractC0295Gu.m625r(-803214718924853L);
        AbstractC0295Gu.m625r(-803283438401589L);
        AbstractC0295Gu.m625r(-803347862911029L);
        if (r86 == false) goto L16;
        r67.add(r76);
    L42:
        r86 = true;
    L33:
        if (r93.length() <= 0) goto L37;
        if (r93.equals(AbstractC0295Gu.m625r(-803515366635573L)) == true) goto L37;
        r94 = true;
        goto L38
    L20:
        if (AbstractC0585Nj.m1134a(r84.f549a, AbstractC0295Gu.m625r(-803506776700981L)) == true) goto L23;
        r85 = false;
        goto L25
    L46:
        List r212 = AbstractC2453ra.m4904n0(r67, new C0963Wb(9));
        String r77 = AbstractC0295Gu.m625r(-801982063310901L);
        String r87 = AbstractC0295Gu.m625r(-802042192853045L);
        String r95 = AbstractC0295Gu.m625r(-801552566581301L);
        String r102 = AbstractC0295Gu.m625r(-801574041417781L);
        String r11 = AbstractC0295Gu.m625r(-801625581025333L);
        String r122 = AbstractC0295Gu.m625r(-801698595469365L);
        String r132 = AbstractC0295Gu.m625r(-801702890436661L);
        String r15 = AbstractC0295Gu.m625r(-801707185403957L);
        String r21 = AbstractC0295Gu.m625r(-801724365273141L);
        String r222 = AbstractC0295Gu.m625r(-801728660240437L);
        String r232 = AbstractC0295Gu.m625r(-801732955207733L);
        String r242 = AbstractC0295Gu.m625r(-801737250175029L);
        String r252 = AbstractC0295Gu.m625r(-801741545142325L);
        EnumC0099CC r262 = EnumC0099CC.f233a;
        C0452Kf r142 = C0452Kf.f1484a;
        List r68 = Collections.singletonList(new C0185EC(r77, r87, r95, r102, r11, r122, r132, r142, r15, r142, 0.0d, false, 0, r21, r222, r232, r242, r252, r262, false, 0, 2101248, 0));
        ArrayList r78 = new ArrayList(r212.size() + r68.size());
        r78.addAll(r68);
        r78.addAll(r212);
        r25 = r78;
        goto L47
    }

    /* JADX INFO: renamed from: f */
    public final Activity m1432f() {
        LinearLayout r0 = this.f2254a;
        if (r0 == null) goto L5;
        Context r02 = r0.getContext();
    L6:
        AbstractC0295Gu.m625r(-465673239132213L);
        return (Activity) r02;
    L5:
        r02 = null;
        goto L6
    }

    /* JADX INFO: renamed from: g */
    public final void m1433g(Activity r5) {
        AbstractC0295Gu.m625r(-466184340240437L);
        C1498hd r0 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C1417fk(this, r5, null, 4), 3);
    }

    @Override // p000.InterfaceC0972Wk
    public final View getContentView() {
        return this.f2256c;
    }

    @Override // p000.InterfaceC0972Wk
    public final String getTitle() {
        return AbstractC0295Gu.m625r(-464496418093109L);
    }

    /* JADX INFO: renamed from: h */
    public final void m1434h() {
        C1456gf.m2798P(m1432f(), AbstractC0295Gu.m625r(-464088396199989L), AbstractC0295Gu.m625r(-464109871036469L), AbstractC0295Gu.m625r(-464990339332149L), new C1017Xm(18, this));
    }

    /* JADX INFO: renamed from: i */
    public final void m1435i() {
        int r0 = this.f2264k.ordinal();
        if (r0 == 0) goto L8;
        if (r0 != 1) goto L7;
        this.f2259f.getContext();
        AbstractC1160i r02 = new GridLayoutManager();
    L9:
        this.f2259f.setLayoutManager(r02);
        return;
    L7:
        throw new C0232Fa();
    L8:
        this.f2259f.getContext();
        r02 = new LinearLayoutManager(1);
        goto L9
    }

    /* JADX INFO: renamed from: j */
    public final void m1436j() {
        Iterator r0 = this.f2265l.entrySet().iterator();
    L4:
        if (r0.hasNext() == false) goto L21;
        Map.Entry r1 = (Map.Entry) r0.next();
        EnumC0142DC r2 = (EnumC0142DC) r1.getKey();
        TextView r12 = (TextView) r1.getValue();
        if (r2 != this.f2264k) goto L8;
        boolean r22 = true;
    L9:
        ViewParent r3 = r12.getParent();
        AbstractC0295Gu.m625r(-465638879393845L);
        final LinearLayout r32 = (LinearLayout) r3;
        View r4 = r32.getChildAt(0);
        AbstractC0295Gu.m625r(-465368296454197L);
        ImageView r42 = (ImageView) r4;
        r32.clearAnimation();
        r32.animate().cancel();
        Context r5 = r12.getContext();
        int r6 = R.color.textSecondary;
        if (r22 == false) goto L12;
        int r8 = R.color.colorPrimary;
    L13:
        r12.setTextColor(r5.getColor(r8));
        Context r13 = r42.getContext();
        if (r22 == false) goto L16;
        r6 = R.color.colorPrimary;
    L16:
        r42.setColorFilter(r13.getColor(r6));
        r32.setBackground(null);
        if (r22 == false) goto L19;
        final float r14 = 1.05f;
    L20:
        r32.animate().scaleX(r14).scaleY(r14).setDuration(150).setInterpolator(new DecelerateInterpolator()).withEndAction(new RunnableC0400JC(r32, r14)).start();
        goto L4
    L19:
        r14 = 1.0f;
        goto L20
    L12:
        r8 = R.color.textSecondary;
        goto L13
    L8:
        r22 = false;
        goto L9
    }
}
