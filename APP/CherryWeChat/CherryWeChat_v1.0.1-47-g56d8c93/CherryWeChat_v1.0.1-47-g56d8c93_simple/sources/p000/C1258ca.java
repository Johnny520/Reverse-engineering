package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1158g;
import androidx.recyclerview.widget.AbstractC1166o;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import io.github.cherrywechat.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: ca */
/* JADX INFO: loaded from: classes.dex */
public final class C1258ca extends AbstractC1158g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4261a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f4262b;

    /* JADX INFO: renamed from: c */
    public final Object f4263c;

    /* JADX INFO: renamed from: d */
    public List f4264d;

    public C1258ca(Activity r3, ArrayList r4) {
        this.f4261a = 0;
        AbstractC0295Gu.m625r(-103014790592565L);
        AbstractC0295Gu.m625r(-103049150330933L);
        this.f4263c = r3;
        this.f4264d = r4;
        this.f4262b = new LinkedHashMap();
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final int getItemCount() {
        switch(this.f4261a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f4264d.size();
    L7:
        return ((ArrayList) this.f4264d).size();
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public int getItemViewType(int r3) {
        switch(this.f4261a) {
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return super.getItemViewType(r3);
    L7:
        if (AbstractC0585Nj.m1134a(((C0185EC) this.f4264d.get(r3)).f549a, AbstractC0295Gu.m625r(-487289809532981L)) == false) goto L9;
        return 4;
    L9:
        int r32 = ((C0701QC) this.f4263c).f2264k.ordinal();
        if (r32 != 0) goto L12;
        return 3;
    L12:
        if (r32 == 1) goto L19;
        return 2;
    L19:
        return 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final void onBindViewHolder(AbstractC1166o r29, int r30) {
        switch(this.f4261a) {
            case 0: goto L167;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-487654881753141L);
        C0185EC r2 = (C0185EC) this.f4264d.get(r30);
        if ((r29 instanceof C0013AC) == false) goto L55;
        AbstractC0295Gu.m625r(-487362823977013L);
        C1505hk r6 = ((C0013AC) r29).f17a;
        r6.getClass();
        AbstractC0295Gu.m625r(-71850507892789L);
        double r12 = r2.f559k;
        AbstractC0295Gu.m625r(-71876277696565L);
        AbstractC0295Gu.m625r(-71949292140597L);
        AbstractC0295Gu.m625r(-71494025607221L);
        AbstractC0295Gu.m625r(-71519795410997L);
        EnumC0099CC r9 = r2.f567s;
        Objects.toString(r9);
        AbstractC0295Gu.m625r(-71562745083957L);
        r6.f5338b.setText(r2.f551c);
        r6.f5339c.setText(r2.f552d);
        ImageView r11 = r6.f5337a;
        String r0 = r2.f554f;
        String r8 = r2.f555g;
        if (r0.length() <= 0) goto L15;
        C0357IC.f1218a.getClass();
        AbstractC0295Gu.m625r(-802123797231669L);
        Bitmap r82 = (Bitmap) C0357IC.f1221d.get(r0);
        if (r82 != null) goto L11;
    L13:
        ((C1193aw) ((C1193aw) ((C1193aw) ((C1193aw) ComponentCallbacks2C1273a.m2415d(r11).m2833n(r0).m5311e(C0922Vd.f2878b)).m5309b()).m5316k()).m5312f(R.drawable.ic_theme)).m2299B(new C1461gk(0, r2)).m2298A(r11);
    L28:
        TextView r02 = r6.f5342f;
        if (r12 <= 0.0d) goto L31;
        String r83 = "¥" + r12;
    L32:
        r02.setText(r83);
        TextView r84 = r6.f5340d;
        int r10 = r9.ordinal();
        if (r10 == 1) goto L39;
        if (r10 == 3) goto L38;
        if (r10 == 4) goto L37;
        r84.setVisibility(8);
    L40:
        TextView r03 = r6.f5341e;
        AbstractC0295Gu.m625r(-72344429131829L);
        AbstractC0295Gu.m625r(-72417443575861L);
        AbstractC0295Gu.m625r(-72022306584629L);
        AbstractC0295Gu.m625r(-72048076388405L);
        Objects.toString(r9);
        AbstractC0295Gu.m625r(-72091026061365L);
        int r7 = r9.ordinal();
        if (r7 == 0) goto L52;
        if (r7 == 1) goto L51;
        if (r7 == 3) goto L50;
        if (r7 == 4) goto L49;
        AbstractC0295Gu.m625r(-72224170047541L);
        AbstractC0295Gu.m625r(-70647917049909L);
        AbstractC0295Gu.m625r(-70750996265013L);
        if (r2.f568t == false) goto L48;
        AbstractC0295Gu.m625r(-70828305676341L);
        AbstractC0295Gu.m625r(-70901320120373L);
        r03.setText(AbstractC0295Gu.m625r(-70446053586997L));
        r03.setTextColor(r6.getContext().getColor(R.color.buttonTextSecondary));
        GradientDrawable r4 = new GradientDrawable();
        r4.setCornerRadius(AbstractC0295Gu.m616i(12));
        r4.setColor(r6.getContext().getColor(R.color.buttonSecondary));
        r4.setStroke(AbstractC0295Gu.m616i(1), r6.getContext().getColor(R.color.cardStroke));
        r03.setBackground(r4);
        r03.setOnClickListener(null);
    L53:
        r6.setOnClickListener(new ViewOnClickListenerC1268ck(r2, r6));
        return;
    L48:
        AbstractC0295Gu.m625r(-70463233456181L);
        AbstractC0295Gu.m625r(-70536247900213L);
        r03.setText(AbstractC0295Gu.m625r(-70630737180725L));
        r03.setTextColor(r6.getContext().getColor(R.color.buttonTextPrimary));
        GradientDrawable r42 = new GradientDrawable();
        r42.setCornerRadius(AbstractC0295Gu.m616i(12));
        r42.setColor(r6.getContext().getColor(R.color.buttonPrimary));
        r03.setBackground(r42);
        r03.setOnClickListener(new ViewOnClickListenerC1268ck(r6, r2, 4));
        goto L53
    L49:
        r03.setText(AbstractC0295Gu.m625r(-72206990178357L));
        r03.setTextColor(r6.getContext().getColor(R.color.buttonTextSecondary));
        GradientDrawable r43 = new GradientDrawable();
        r43.setCornerRadius(AbstractC0295Gu.m616i(12));
        r43.setColor(r6.getContext().getColor(R.color.buttonSecondary));
        r43.setStroke(AbstractC0295Gu.m616i(1), r6.getContext().getColor(R.color.cardStroke));
        r03.setBackground(r43);
        r03.setOnClickListener(null);
        goto L53
    L50:
        r03.setText(AbstractC0295Gu.m625r(-72194105276469L));
        r03.setTextColor(r6.getContext().getColor(R.color.buttonTextPrimary));
        GradientDrawable r44 = new GradientDrawable();
        r44.setCornerRadius(AbstractC0295Gu.m616i(12));
        r44.setColor(r6.getContext().getColor(R.color.buttonPrimary));
        r03.setBackground(r44);
        r03.setOnClickListener(new ViewOnClickListenerC1268ck(r6, r2, 3));
        goto L53
    L51:
        r03.setText(AbstractC0295Gu.m625r(-72181220374581L));
        r03.setTextColor(r6.getContext().getColor(R.color.buttonTextPrimary));
        GradientDrawable r45 = new GradientDrawable();
        r45.setCornerRadius(AbstractC0295Gu.m616i(12));
        r45.setColor(r6.getContext().getColor(R.color.buttonPrimary));
        r03.setBackground(r45);
        r03.setOnClickListener(new ViewOnClickListenerC1268ck(r6, r2, 2));
        goto L53
    L52:
        r03.setText(AbstractC0295Gu.m625r(-72168335472693L));
        r03.setTextColor(r6.getContext().getColor(R.color.buttonTextPrimary));
        GradientDrawable r46 = new GradientDrawable();
        r46.setCornerRadius(AbstractC0295Gu.m616i(12));
        r46.setColor(r6.getContext().getColor(R.color.buttonPrimary));
        r03.setBackground(r46);
        r03.setOnClickListener(new ViewOnClickListenerC1268ck(r6, r2, 1));
        goto L53
    L37:
        r84.setText(AbstractC0295Gu.m625r(-71743133710389L));
        r84.setTextColor(r6.getContext().getColor(android.R.color.white));
        GradientDrawable r72 = new GradientDrawable();
        r72.setCornerRadius(AbstractC0295Gu.m616i(8));
        r72.setColor(r6.getContext().getColor(R.color.colorPrimary));
        r84.setBackground(r72);
        r84.setVisibility(0);
        goto L40
    L38:
        r84.setText(AbstractC0295Gu.m625r(-72310069393461L));
        r84.setTextColor(r6.getContext().getColor(android.R.color.white));
        GradientDrawable r73 = new GradientDrawable();
        r73.setCornerRadius(AbstractC0295Gu.m616i(8));
        r73.setColor(r6.getContext().getColor(R.color.colorSuccess));
        r84.setBackground(r73);
        r84.setVisibility(0);
        goto L40
    L39:
        r84.setText(AbstractC0295Gu.m625r(-72327249262645L));
        r84.setTextColor(r6.getContext().getColor(android.R.color.white));
        GradientDrawable r74 = new GradientDrawable();
        r74.setCornerRadius(AbstractC0295Gu.m616i(8));
        r74.setColor(r6.getContext().getColor(R.color.colorInfo));
        r84.setBackground(r74);
        r84.setVisibility(0);
        goto L40
    L31:
        r83 = AbstractC0295Gu.m625r(-71640054495285L);
        goto L32
    L11:
        if (r82.isRecycled() == true) goto L13;
        r11.setImageBitmap(r82);
        goto L28
    L15:
        if (r8.length() > 0) goto L211;
        C0183EA.f539a.getClass();
        r11.setImageBitmap(C0183EA.m375c());
        goto L28
    L211:
        File r04 = new File(r8);     // Catch: Exception -> L26
        if (r04.exists() == false) goto L24;
        String r05 = r04.getAbsolutePath();     // Catch: Exception -> L26
        AbstractC0295Gu.m625r(-71652939397173L);     // Catch: Exception -> L26
        AbstractC0295Gu.m625r(-779729837750325L);     // Catch: Exception -> L26
        Bitmap r06 = BitmapFactory.decodeFile(r05);     // Catch: Exception -> L21
    L23:
        r11.setImageBitmap(r06);     // Catch: Exception -> L26
        goto L28
    L21:
        e = move-exception;
        e.printStackTrace();     // Catch: Exception -> L26
        r06 = null;
        goto L23
    L24:
        C0183EA.f539a.getClass();     // Catch: Exception -> L26
        r11.setImageBitmap(C0183EA.m375c());     // Catch: Exception -> L26
    L26:
        C0183EA.f539a.getClass();
        r11.setImageBitmap(C0183EA.m375c());
        goto L28
    L55:
        if ((r29 instanceof C2793zC) == false) goto L129;
        AbstractC0295Gu.m625r(-488964846778421L);
        C0625Og r62 = ((C2793zC) r29).f9461a;
        C1258ca r85 = r62.f1989a;
        TextView r92 = r62.f1997i;
        ImageView r112 = r62.f1995g;
        LinearLayout r122 = r62.f1996h;
        LinearLayout r13 = r62.f1990b;
        AbstractC0295Gu.m625r(-99763500349493L);
        String r14 = r2.f549a;
        r62.f1998j = r2;
        r62.f1992d.setText(r2.f551c);
        r62.f1993e.setText(AbstractC0295Gu.m625r(-98140002711605L) + r2.f552d);
        ImageView r47 = r62.f1991c;
        String r07 = r2.f554f;
        String r15 = r2.f555g;
        if (r07.length() <= 0) goto L60;
        ((C1193aw) ((C1193aw) ((C1193aw) ComponentCallbacks2C1273a.m2415d(r47).m2833n(r07).m5309b()).m5316k()).m5312f(R.drawable.ic_theme)).m2298A(r47);
    L73:
        TextView r48 = r62.f1994f;
        AbstractC0295Gu.m625r(-98255966828597L);
        AbstractC0295Gu.m625r(-98328981272629L);
        AbstractC0295Gu.m625r(-97959614085173L);
        AbstractC0295Gu.m625r(-97985383888949L);
        Objects.toString(r2.f567s);
        AbstractC0295Gu.m625r(-98028333561909L);
        if (AbstractC0585Nj.m1134a(r14, AbstractC0295Gu.m625r(-98105642973237L)) == true) goto L76;
        AbstractC0295Gu.m625r(-98560909506613L);
        AbstractC0295Gu.m625r(-98633923950645L);
        r48.setVisibility(8);
    L82:
        boolean r08 = r2.f558j.isEmpty();
        if (r2.f564p.length() <= 0) goto L85;
        boolean r49 = true;
    L86:
        boolean r5 = AbstractC0585Nj.m1134a(r14, AbstractC0295Gu.m625r(-98157182580789L));
        if (r08 == false) goto L89;
        if (r49 == true) goto L89;
    L92:
        if (r5 == true) goto L96;
        if (r08 == false) goto L96;
        if (r49 == true) goto L96;
    L97:
        r13.setOnClickListener(new ViewOnClickListenerC1477h(5, r62));
        r13.setClickable(true);
        r13.setFocusable(true);
    L99:
        if (r08 == false) goto L101;
        if (r49 == true) goto L101;
    L105:
        if (r5 == true) goto L114;
        r112.setVisibility(0);
        r92.setVisibility(8);
        r85.getClass();
        AbstractC0295Gu.m625r(-487684946524213L);
        Boolean r09 = (Boolean) r85.f4262b.get(r14);
        if (r09 == null) goto L109;
        boolean r113 = r09.booleanValue();
    L110:
        r62.m1217c(r113);
        if (r113 == false) goto L113;
        r62.m1216b(r2);
        return;
    L113:
        r122.setVisibility(8);
        r122.removeAllViews();
        return;
    L109:
        r113 = false;
        goto L110
    L114:
        r112.setVisibility(8);
        r92.setVisibility(8);
        r122.setVisibility(8);
        r122.removeAllViews();
        return;
    L101:
        if (r5 == false) goto L115;
        if (r08 == false) goto L115;
        if (r49 == false) goto L105;
    L115:
        if (r5 == false) goto L120;
        if (r08 == false) goto L120;
        if (r49 == true) goto L120;
        int r75 = 8;
    L121:
        r112.setVisibility(r75);
        r85.getClass();
        AbstractC0295Gu.m625r(-487684946524213L);
        Boolean r010 = (Boolean) r85.f4262b.get(r14);
        if (r010 == null) goto L124;
        boolean r114 = r010.booleanValue();
    L125:
        r62.m1217c(r114);
        if (r114 == false) goto L128;
        r62.m1216b(r2);
        return;
    L128:
        r122.setVisibility(8);
        r122.removeAllViews();
        return;
    L124:
        r114 = false;
    L120:
        r75 = 0;
    L96:
        r13.setOnClickListener(null);
        r13.setClickable(false);
        r13.setFocusable(false);
        ColorStateList r102 = ColorStateList.valueOf(r62.getContext().getColor(R.color.colorPrimary) & 100663295);
        GradientDrawable r152 = new GradientDrawable();
        r152.setCornerRadius(AbstractC0295Gu.m616i(12));
        r13.setBackground(new RippleDrawable(r102, null, r152));
    L89:
        if (r5 == false) goto L97;
        if (r08 == false) goto L97;
        if (r49 == true) goto L97;
    L85:
        r49 = false;
        goto L86
    L76:
        if (r2.f568t == false) goto L79;
        AbstractC0295Gu.m625r(-98114232907829L);
        AbstractC0295Gu.m625r(-98737003165749L);
        r48.setText(AbstractC0295Gu.m625r(-98878737086517L));
        r48.setTextColor(r62.getContext().getColor(R.color.buttonTextSecondary));
        GradientDrawable r103 = new GradientDrawable();
        r103.setCornerRadius(AbstractC0295Gu.m616i(16));
        r103.setColor(r62.getContext().getColor(R.color.buttonSecondary));
        r103.setStroke(AbstractC0295Gu.m616i(1), r62.getContext().getColor(R.color.cardStroke));
        r48.setBackground(r103);
        r48.setOnClickListener(null);
    L80:
        r48.setVisibility(0);
        goto L82
    L79:
        AbstractC0295Gu.m625r(-98895916955701L);
        AbstractC0295Gu.m625r(-98419175585845L);
        r48.setText(AbstractC0295Gu.m625r(-98548024604725L));
        r48.setTextColor(r62.getContext().getColor(R.color.buttonTextPrimary));
        GradientDrawable r52 = new GradientDrawable();
        r52.setCornerRadius(AbstractC0295Gu.m616i(16));
        r52.setColor(r62.getContext().getColor(R.color.buttonPrimary));
        r48.setBackground(r52);
        r48.setOnClickListener(new ViewOnClickListenerC0453Kg(r62, r2, 0));
        goto L80
    L60:
        if (r15.length() > 0) goto L205;
        C0183EA.f539a.getClass();
        r47.setImageBitmap(C0183EA.m375c());
        goto L73
    L205:
        File r011 = new File(r15);     // Catch: Exception -> L71
        if (r011.exists() == false) goto L69;
        String r012 = r011.getAbsolutePath();     // Catch: Exception -> L71
        AbstractC0295Gu.m625r(-98165772515381L);     // Catch: Exception -> L71
        AbstractC0295Gu.m625r(-779729837750325L);     // Catch: Exception -> L71
        Bitmap r013 = BitmapFactory.decodeFile(r012);     // Catch: Exception -> L66
    L68:
        r47.setImageBitmap(r013);     // Catch: Exception -> L71
        goto L73
    L66:
        e = move-exception;
        e.printStackTrace();     // Catch: Exception -> L71
        r013 = null;
        goto L68
    L69:
        C0183EA.f539a.getClass();     // Catch: Exception -> L71
        r47.setImageBitmap(C0183EA.m375c());     // Catch: Exception -> L71
    L71:
        C0183EA.f539a.getClass();
        r47.setImageBitmap(C0183EA.m375c());
        goto L73
    L129:
        int r3 = 8;
        if ((r29 instanceof C2750yC) == false) goto L133;
        AbstractC0295Gu.m625r(-488917602138165L);
        ((C2750yC) r29).f9381a.getClass();
        AbstractC0295Gu.m625r(-100489349822517L);
        return;
    L133:
        if ((r29 instanceof C0056BC) == false) goto L222;
        AbstractC0295Gu.m625r(-487135190710325L);
        C0461Ko r410 = ((C0056BC) r29).f130a;
        r410.getClass();
        AbstractC0295Gu.m625r(-87170656237621L);
        String r014 = r2.f554f;
        AbstractC0295Gu.m625r(-87196426041397L);
        AbstractC0295Gu.m625r(-87269440485429L);
        AbstractC0295Gu.m625r(-87363929765941L);
        AbstractC0295Gu.m625r(-87389699569717L);
        EnumC0099CC r53 = r2.f567s;
        Objects.toString(r53);
        AbstractC0295Gu.m625r(-86882893428789L);
        r410.f1503c.setText(r2.f551c);
        r410.f1504d.setText(r2.f552d);
        r410.f1506f.setText("v" + r2.f557i);
        TextView r63 = r410.f1505e;
        String r86 = r2.f553e;
        r63.setText(r86);
        if (r86.length() <= 0) goto L137;
        r3 = 0;
    L137:
        r63.setVisibility(r3);
        ImageView r32 = r410.f1502b;
        String r64 = r2.f555g;
        if (r014.length() <= 0) goto L141;
        ((C1193aw) ((C1193aw) ((C1193aw) ComponentCallbacks2C1273a.m2415d(r32).m2833n(r014).m5309b()).m5316k()).m5312f(R.drawable.ic_theme)).m2298A(r32);
    L154:
        TextView r015 = r410.f1507g;
        int r33 = r53.ordinal();
        if (r33 == 1) goto L161;
        if (r33 == 3) goto L160;
        if (r33 == 4) goto L159;
        r015.setText(AbstractC0295Gu.m625r(-87101936760885L));
    L162:
        AbstractC0295Gu.m625r(-87106231728181L);
        AbstractC0295Gu.m625r(-87729001986101L);
        AbstractC0295Gu.m625r(-87883620808757L);
        AbstractC0295Gu.m625r(-87909390612533L);
        Objects.toString(r53);
        AbstractC0295Gu.m625r(-87952340285493L);
        if (r2.f568t == false) goto L165;
        AbstractC0295Gu.m625r(-87479893882933L);
        AbstractC0295Gu.m625r(-87552908326965L);
        r410.m910b(r2, true);
        return;
    L165:
        AbstractC0295Gu.m625r(-86088324479029L);
        AbstractC0295Gu.m625r(-86161338923061L);
        r410.m910b(r2, false);
        return;
    L159:
        r015.setText(AbstractC0295Gu.m625r(-87050397153333L));
        r015.setTextColor(r410.getContext().getColor(R.color.colorPrimary));
        goto L162
    L160:
        r015.setText(AbstractC0295Gu.m625r(-87067577022517L));
        r015.setTextColor(r410.getContext().getColor(R.color.colorSuccess));
        goto L162
    L161:
        r015.setText(AbstractC0295Gu.m625r(-87084756891701L));
        r015.setTextColor(r410.getContext().getColor(R.color.colorInfo));
        goto L162
    L141:
        if (r64.length() > 0) goto L208;
        C0183EA.f539a.getClass();
        r32.setImageBitmap(C0183EA.m375c());
        goto L154
    L208:
        File r016 = new File(r64);     // Catch: Exception -> L152
        if (r016.exists() == false) goto L150;
        String r017 = r016.getAbsolutePath();     // Catch: Exception -> L152
        AbstractC0295Gu.m625r(-86960202840117L);     // Catch: Exception -> L152
        AbstractC0295Gu.m625r(-779729837750325L);     // Catch: Exception -> L152
        Bitmap r93 = BitmapFactory.decodeFile(r017);     // Catch: Exception -> L147
    L149:
        r32.setImageBitmap(r93);     // Catch: Exception -> L152
        goto L154
    L147:
        e = move-exception;
        e.printStackTrace();     // Catch: Exception -> L152
        r93 = null;
        goto L149
    L150:
        C0183EA.f539a.getClass();     // Catch: Exception -> L152
        r32.setImageBitmap(C0183EA.m375c());     // Catch: Exception -> L152
    L152:
        C0183EA.f539a.getClass();
        r32.setImageBitmap(C0183EA.m375c());
        goto L154
    L222:
        return;
    L167:
        final C1215ba r132 = (C1215ba) r29;
        AbstractC0295Gu.m625r(-101533026875445L);
        final C0054BA r142 = (C0054BA) ((ArrayList) this.f4264d).get(r30);
        AbstractC0295Gu.m625r(-102654013339701L);
        ArrayList r76 = r142.f126g;
        LinearLayout r153 = r132.f4149a;
        r153.removeAllViews();
        final C1258ca r123 = r132.f4150b;
        Context r94 = (Context) r123.f4263c;
        LinkedHashMap r104 = r123.f4262b;
        LinearLayout r87 = new LinearLayout(r94);
        r87.setOrientation(1);
        r87.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout r115 = new LinearLayout(r87.getContext());
        r115.setOrientation(1);
        r115.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout r018 = new LinearLayout(r115.getContext());
        r018.setOrientation(0);
        r018.setGravity(16);
        r018.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout r1 = new LinearLayout(r018.getContext());
        r1.setOrientation(1);
        r1.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        LinearLayout r22 = new LinearLayout(r1.getContext());
        r22.setOrientation(0);
        r22.setGravity(16);
        TextView r34 = new TextView(r22.getContext());
        r34.setText(r142.f121b);
        r34.setTextSize(16.0f);
        r34.setTextColor(r34.getContext().getColor(R.color.textTitle));
        r34.setTypeface(Typeface.DEFAULT_BOLD);
        r22.addView(r34);
        String r35 = r142.f123d;
        if (r35.length() <= 0) goto L170;
        TextView r54 = new TextView(r22.getContext());
        r54.setText(AbstractC0295Gu.m625r(-102679783143477L));
        r54.setTextSize(10.0f);
        String r25 = r35;
        r54.setTextColor(r54.getContext().getColor(android.R.color.black));
        GradientDrawable r36 = new GradientDrawable();
        r36.setCornerRadius(AbstractC0295Gu.m616i(5));
        Integer r26 = 4;
        r36.setColor(r54.getContext().getColor(android.R.color.holo_orange_light));
        r54.setBackground(r36);
        ArrayList r27 = r76;
        r54.setPadding(AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(2), AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(2));
        LinearLayout.LayoutParams r37 = new LinearLayout.LayoutParams(-2, -2);
        r37.setMarginStart(AbstractC0295Gu.m616i(8));
        r54.setLayoutParams(r37);
        r22.addView(r54);
    L171:
        r1.addView(r22);
        TextView r23 = new TextView(r1.getContext());
        r23.setText(AbstractC0295Gu.m625r(-102696963012661L) + r142.f122c);
        float r38 = 14.0f;
        r23.setTextSize(14.0f);
        r23.setTextColor(r23.getContext().getColor(R.color.textSummary));
        r23.setPadding(0, AbstractC0295Gu.m616i(r26), 0, 0);
        r1.addView(r23);
        r018.addView(r1);
        if (r27.isEmpty() == true) goto L174;
    L175:
        ImageView r16 = new ImageView(r018.getContext());
        r16.setImageResource(R.drawable.ic_expand);
        r16.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24)));
        Object r24 = r104.get(Integer.valueOf(r132.getAdapterPosition()));
        Boolean r411 = Boolean.TRUE;
        float r55 = 0.0f;
        if (AbstractC0585Nj.m1134a(r24, r411) == false) goto L178;
        float r28 = 180.0f;
    L179:
        r16.setRotation(r28);
        ViewPropertyAnimator r210 = r16.animate();
        if (AbstractC0585Nj.m1134a(r104.get(Integer.valueOf(r132.getAdapterPosition())), r411) == false) goto L182;
        r55 = 180.0f;
    L182:
        r210.rotation(r55).setDuration(500).start();
        r16.setOnClickListener(new ViewOnClickListenerC2176l5(3, r123, r132));
        r018.addView(r16);
    L183:
        r115.addView(r018);
        r87.addView(r115);
        r153.addView(r87);
        boolean r019 = r27.isEmpty();
        if (r25.length() <= 0) goto L186;
        boolean r17 = true;
    L187:
        if (r019 == false) goto L190;
        if (r17 == true) goto L190;
        return;
    L190:
        if (AbstractC0585Nj.m1134a(r104.get(Integer.valueOf(r132.getAdapterPosition())), Boolean.TRUE) == true) goto L192;
        return;
    L192:
        if (r17 == false) goto L194;
        LinearLayout r18 = new LinearLayout(r94);
        r18.setOrientation(0);
        r18.setGravity(16);
        LinearLayout.LayoutParams r412 = new LinearLayout.LayoutParams(-1, -2);
        r412.topMargin = AbstractC0295Gu.m616i(r26);
        r412.bottomMargin = AbstractC0295Gu.m616i(r26);
        r18.setLayoutParams(r412);
        LinearLayout r413 = new LinearLayout(r18.getContext());
        r413.setOrientation(1);
        r413.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView r56 = new TextView(r413.getContext());
        r56.setText(AbstractC0295Gu.m625r(-102714142881845L));
        r56.setTextSize(14.0f);
        r56.setTextColor(r56.getContext().getColor(R.color.textTitle));
        r413.addView(r56);
        r18.addView(r413);
        TextView r414 = new TextView(r18.getContext());
        r414.setText(AbstractC0295Gu.m625r(-102748502620213L));
        r414.setTextSize(13.0f);
        r414.setTextColor(r414.getContext().getColor(R.color.buttonTextPrimary));
        GradientDrawable r57 = new GradientDrawable();
        r57.setCornerRadius(AbstractC0295Gu.m616i(8));
        r57.setColor(r414.getContext().getColor(R.color.buttonPrimary));
        r414.setBackground(r57);
        r414.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(6));
        r414.setMinWidth(AbstractC0295Gu.m616i(50));
        r414.setGravity(17);
        r414.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        r414.setOnClickListener(new ViewOnClickListenerC2176l5(4, r414, r142));
        r18.addView(r414);
        r153.addView(r18);
    L194:
        if (r019 == true) goto L225;
        Iterator r020 = r27.iterator();
    L197:
        if (r020.hasNext() == false) goto L226;
        final C0140DA r105 = (C0140DA) r020.next();
        LinearLayout r19 = new LinearLayout(r94);
        r19.setOrientation(0);
        r19.setGravity(16);
        LinearLayout.LayoutParams r58 = new LinearLayout.LayoutParams(-1, -2);
        r58.topMargin = AbstractC0295Gu.m616i(r26);
        r58.bottomMargin = AbstractC0295Gu.m616i(r26);
        r19.setLayoutParams(r58);
        LinearLayout r59 = new LinearLayout(r19.getContext());
        r59.setOrientation(1);
        r59.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView r77 = new TextView(r59.getContext());
        r77.setText(r105.f365b);
        r77.setTextSize(r38);
        r77.setTextColor(r77.getContext().getColor(R.color.textTitle));
        r59.addView(r77);
        r19.addView(r59);
        Context r510 = r19.getContext();
        AbstractC0295Gu.m625r(-102761387522101L);
        final C2414qe r116 = new C2414qe(r510);
        r116.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        Context r511 = r94;
        C0183EA r172 = C0183EA.f539a;
        String r39 = r105.f364a;
        r172.getClass();
        final File r95 = new File(C0183EA.m378f(r39));
        if (r95.exists() == false) goto L202;
        r116.setText(AbstractC0295Gu.m625r(-102280351184949L));
        r116.setBackgroundColor(r116.getContext().getColor(android.R.color.holo_red_light));
    L203:
        r116.setOnClickListener(new ViewOnClickListenerC0869U9(r95, r105, r116, r123, r132, r142));
        r19.addView(r116);
        r153.addView(r19);
        r94 = r511;
        r38 = 14.0f;
        goto L197
    L202:
        r116.setText(AbstractC0295Gu.m625r(-102293236086837L));
        r116.setBackgroundColor(r116.getContext().getColor(R.color.buttonPrimary));
        goto L203
    L226:
        return;
    L225:
        return;
    L186:
        r17 = false;
        goto L187
    L178:
        r28 = 0.0f;
        goto L179
    L174:
        if (r25.length() <= 0) goto L183;
    L170:
        r25 = r35;
        r26 = 4;
        r27 = r76;
        goto L171
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final AbstractC1166o onCreateViewHolder(ViewGroup r4, int r5) {
        switch(this.f4261a) {
            case 0: goto L15;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-487349939075125L);
        if (r5 != 1) goto L7;
        Context r42 = r4.getContext();
        AbstractC0295Gu.m625r(-487929759660085L);
        return new C0013AC(new C1505hk(r42));
    L7:
        if (r5 != 3) goto L9;
        Context r43 = r4.getContext();
        AbstractC0295Gu.m625r(-487998479136821L);
        return new C2793zC(new C0625Og(r43, this));
    L9:
        if (r5 == 4) goto L11;
        Context r44 = r4.getContext();
        AbstractC0295Gu.m625r(-488135918090293L);
        return new C0056BC(this, new C0461Ko(r44));
    L11:
        Context r45 = r4.getContext();
        AbstractC0295Gu.m625r(-488067198613557L);
        return new C2750yC(new C2717xg(r45, (C0701QC) this.f4263c));
    L15:
        AbstractC0295Gu.m625r(-101502962104373L);
        C0780S6 r46 = new C0780S6((Context) this.f4263c);
        r46.setRadius(AbstractC0295Gu.m616i(12));
        r46.setCardElevation(0.0f);
        r46.setUseCompatPadding(true);
        r46.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return new C1215ba(this, r46);
    }

    public C1258ca(C0701QC r3) {
        this.f4261a = 1;
        AbstractC0295Gu.m625r(-487160960514101L);
        AbstractC0295Gu.m625r(-487199615219765L);
        this.f4263c = r3;
        this.f4264d = C0452Kf.f1484a;
        this.f4262b = new LinkedHashMap();
    }
}
