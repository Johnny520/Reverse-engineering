package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1158g;
import androidx.recyclerview.widget.AbstractC1166o;
import io.github.cherrywechat.R;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: Q7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0696Q7 extends AbstractC1158g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2238a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f2239b;

    /* JADX INFO: renamed from: c */
    public final Object f2240c;

    public /* synthetic */ C0696Q7(ArrayList r1, Context r2, int r3) {
        this.f2238a = r3;
        this.f2239b = r1;
        this.f2240c = r2;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final int getItemCount() {
        switch(this.f2238a) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return this.f2239b.size();
    L7:
        return this.f2239b.size();
    L9:
        return this.f2239b.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final void onBindViewHolder(AbstractC1166o r11, final int r12) {
        switch(this.f2238a) {
            case 0: goto L92;
            case 1: goto L87;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-85628762978357L);
        Object r0 = this.f2239b.get(r12);
        AbstractC0295Gu.m625r(-85658827749429L);
        final C0097CA r02 = (C0097CA) r0;
        AbstractC0295Gu.m625r(-84842783963189L);
        final C0976Wo r112 = ((C0847To) r11).f2692a;
        TextView r2 = r112.f3060f;
        ImageView r3 = r112.f3056b;
        TextView r4 = r112.f3061g;
        AbstractC0295Gu.m625r(-83906481092661L);
        String r5 = r02.f227e;
        String r6 = r02.f228f;
    L27:
        if (r3 != null) goto L29;
        AbstractC0295Gu.m625r(-83618718283829L);
        r3 = null;
    L29:
        C0183EA.f539a.getClass();
        r3.setImageBitmap(C0183EA.m375c());
    L30:
        TextView r32 = r112.f3057c;
        if (r32 != null) goto L33;
        AbstractC0295Gu.m625r(-83661667956789L);
        r32 = null;
    L33:
        r32.setText(r02.f224b);
        TextView r33 = r112.f3058d;
        if (r33 != null) goto L36;
        AbstractC0295Gu.m625r(-83704617629749L);
        r33 = null;
    L36:
        r33.setText(r02.f225c);
        TextView r34 = r112.f3059e;
        if (r34 != null) goto L39;
        AbstractC0295Gu.m625r(-83756157237301L);
        r34 = null;
    L39:
        r34.setText("v" + r02.f226d);
        if (r2 != null) goto L42;
        AbstractC0295Gu.m625r(-83811991812149L);
        TextView r35 = null;
    L43:
        r35.setText(r5);
        if (r2 != null) goto L47;
        AbstractC0295Gu.m625r(-84434762070069L);
        r2 = null;
    L47:
        if (r5.length() <= 0) goto L49;
        int r36 = 0;
    L50:
        r2.setVisibility(r36);
        C0183EA.f539a.getClass();
        boolean r22 = AbstractC0585Nj.m1134a(r02.f223a, C0183EA.m373a());
        r112.setOnLongClickListener(new ViewOnLongClickListenerC0890Uo(r12, r112, r02));
        if (r22 == false) goto L67;
        if (r4 != null) goto L54;
        AbstractC0295Gu.m625r(-84507776514101L);
        TextView r03 = null;
    L55:
        r03.setText(AbstractC0295Gu.m625r(-84550726187061L));
        if (r4 != null) goto L58;
        AbstractC0295Gu.m625r(-84563611088949L);
        TextView r04 = null;
    L59:
        r04.setEnabled(false);
        if (r4 != null) goto L62;
        AbstractC0295Gu.m625r(-84606560761909L);
        View r05 = null;
    L63:
        GradientDrawable r23 = new GradientDrawable();
        r23.setColor(r112.getContext().getColor(R.color.buttonSecondary));
        r23.setCornerRadius(AbstractC0295Gu.m616i(16));
        r23.setStroke(AbstractC0295Gu.m616i(1), r112.getContext().getColor(R.color.cardStroke));
        r05.setBackground(r23);
        if (r4 != null) goto L66;
        AbstractC0295Gu.m625r(-84649510434869L);
        r4 = null;
    L66:
        r4.setTextColor(r112.getContext().getColor(R.color.buttonTextSecondary));
        return;
    L62:
        r05 = r4;
        goto L63
    L58:
        r04 = r4;
        goto L59
    L54:
        r03 = r4;
        goto L55
    L67:
        if (r4 != null) goto L69;
        AbstractC0295Gu.m625r(-84142704293941L);
        TextView r24 = null;
    L70:
        r24.setText(AbstractC0295Gu.m625r(-84185653966901L));
        if (r4 != null) goto L73;
        AbstractC0295Gu.m625r(-84198538868789L);
        TextView r25 = null;
    L74:
        r25.setEnabled(true);
        if (r4 != null) goto L77;
        AbstractC0295Gu.m625r(-84241488541749L);
        View r122 = null;
    L78:
        GradientDrawable r26 = new GradientDrawable();
        r26.setColor(r112.getContext().getColor(R.color.buttonPrimary));
        r26.setCornerRadius(AbstractC0295Gu.m616i(16));
        r122.setBackground(r26);
        if (r4 != null) goto L81;
        AbstractC0295Gu.m625r(-84284438214709L);
        TextView r123 = null;
    L82:
        r123.setTextColor(r112.getContext().getColor(R.color.buttonTextPrimary));
        if (r4 != null) goto L85;
        AbstractC0295Gu.m625r(-84327387887669L);
        r4 = null;
    L85:
        r4.setOnClickListener(new ViewOnClickListenerC2176l5(13, r112, r02));
        return;
    L81:
        r123 = r4;
        goto L82
    L77:
        r122 = r4;
        goto L78
    L73:
        r25 = r4;
        goto L74
    L69:
        r24 = r4;
        goto L70
    L49:
        r36 = 8;
        goto L50
    L42:
        r35 = r2;
        goto L43
    L6:
        if (r6.length() != 0) goto L11;
        if (r3 != null) goto L9;
        AbstractC0295Gu.m625r(-83949430765621L);     // Catch: Exception -> L27
        ImageView r62 = null;
    L10:
        C0183EA.f539a.getClass();     // Catch: Exception -> L27
        r62.setImageBitmap(C0183EA.m375c());     // Catch: Exception -> L27
        goto L30
    L9:
        r62 = r3;
        goto L10
    L11:
        File r8 = new File(r6);     // Catch: Exception -> L27
        if (r8.exists() == false) goto L22;
        String r63 = r8.getAbsolutePath();     // Catch: Exception -> L27
        AbstractC0295Gu.m625r(-83992380438581L);     // Catch: Exception -> L27
        AbstractC0295Gu.m625r(-779729837750325L);     // Catch: Exception -> L27
        Bitmap r64 = BitmapFactory.decodeFile(r63);     // Catch: Exception -> L16
    L18:
        if (r3 != null) goto L20;
        AbstractC0295Gu.m625r(-84082574751797L);     // Catch: Exception -> L27
        ImageView r82 = null;
    L21:
        r82.setImageBitmap(r64);     // Catch: Exception -> L27
        goto L30
    L20:
        r82 = r3;
        goto L21
    L16:
        e = move-exception;
        e.printStackTrace();     // Catch: Exception -> L27
        r64 = null;
        goto L18
    L22:
        if (r3 != null) goto L24;
        AbstractC0295Gu.m625r(-83575768610869L);     // Catch: Exception -> L27
        ImageView r65 = null;
    L25:
        C0183EA.f539a.getClass();     // Catch: Exception -> L27
        r65.setImageBitmap(C0183EA.m375c());     // Catch: Exception -> L27
        goto L30
    L24:
        r65 = r3;
        goto L25
    L87:
        AbstractC0295Gu.m625r(-25825638348853L);
        View r113 = r11.itemView;
        AbstractC0295Gu.m625r(-25305947306037L);
        View r114 = ((LinearLayout) r113).getChildAt(1);
        AbstractC0295Gu.m625r(-26134875994165L);
        TextView r115 = (TextView) r114;
        C2220m6 r06 = C0276Gb.f894g;
        EnumC0319Hb r124 = (EnumC0319Hb) this.f2239b.get(r12);
        r06.getClass();
        AbstractC0295Gu.m625r(-494926261385269L);
        String r07 = (String) C2220m6.m4466j().get(r124);
        if (r07 != null) goto L90;
        r07 = r124.f1054a;
    L90:
        r115.setText(r07);
        return;
    L92:
        AbstractC0295Gu.m625r(-252806070007861L);
        View r08 = r11.itemView;
        AbstractC0295Gu.m625r(-252836134778933L);
        LinearLayout r09 = (LinearLayout) r08;
        ArrayList r1 = this.f2239b;
        C0610O7 r125 = (C0610O7) r1.get(r12);
        View r27 = r09.getChildAt(1);
        AbstractC0295Gu.m625r(-252565551839285L);
        ((TextView) r27).setText(r125.f1955b);
        View r010 = r09.getChildAt(2);
        AbstractC0295Gu.m625r(-251178277402677L);
        C1030Xz r011 = (C1030Xz) r010;
        r011.setChecked(r125.f1956c);
        r011.setOnCheckedChangeListener(new C2240mk(1, r11, r1));
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final AbstractC1166o onCreateViewHolder(ViewGroup r8, int r9) {
        switch(this.f2238a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-85529978730549L);
        Context r82 = r8.getContext();
        AbstractC0295Gu.m625r(-85560043501621L);
        return new C0847To(new C0976Wo(r82, (C0693Q4) this.f2240c));
    L6:
        AbstractC0295Gu.m625r(-25786983643189L);
        Context r92 = (Context) this.f2240c;
        LinearLayout r83 = new LinearLayout(r92);
        r83.setOrientation(0);
        r83.setGravity(16);
        r83.setMinimumHeight(AbstractC0295Gu.m616i(52));
        r83.setPadding(AbstractC0295Gu.m616i(14), 0, AbstractC0295Gu.m616i(14), 0);
        r83.setBackgroundColor(r92.getColor(R.color.cardBackground));
        r83.setLayoutParams(new C2431qv(-1, -2));
        TextView r1 = new TextView(r92);
        AbstractC0213Ey.m414l(-25817048414261L, r1, 20.0f);
        r1.setTextColor(r92.getColor(R.color.textSummary));
        LinearLayout.LayoutParams r2 = new LinearLayout.LayoutParams(-2, -2);
        r2.setMarginEnd(AbstractC0295Gu.m616i(12));
        r1.setLayoutParams(r2);
        r83.addView(r1);
        TextView r12 = new TextView(r92);
        r12.setTextSize(15.0f);
        r12.setTextColor(r92.getColor(R.color.textTitle));
        LinearLayout.LayoutParams r93 = new LinearLayout.LayoutParams(0, -2);
        r93.weight = 1.0f;
        r12.setLayoutParams(r93);
        r83.addView(r12);
        return new C0653P7(r83);
    L8:
        AbstractC0295Gu.m625r(-252767415302197L);
        Context r94 = (Context) this.f2240c;
        LinearLayout r84 = new LinearLayout(r94);
        r84.setOrientation(0);
        r84.setGravity(16);
        r84.setMinimumHeight(AbstractC0295Gu.m616i(52));
        r84.setPadding(AbstractC0295Gu.m616i(14), 0, AbstractC0295Gu.m616i(14), 0);
        r84.setBackgroundColor(r94.getColor(R.color.cardBackground));
        r84.setLayoutParams(new C2431qv(-1, -2));
        TextView r22 = new TextView(r94);
        AbstractC0213Ey.m414l(-252797480073269L, r22, 20.0f);
        r22.setTextColor(r94.getColor(R.color.textSummary));
        LinearLayout.LayoutParams r3 = new LinearLayout.LayoutParams(-2, -2);
        r3.setMarginEnd(AbstractC0295Gu.m616i(12));
        r22.setLayoutParams(r3);
        r84.addView(r22);
        TextView r23 = new TextView(r94);
        r23.setTextSize(15.0f);
        r23.setTextColor(r94.getColor(R.color.textTitle));
        LinearLayout.LayoutParams r32 = new LinearLayout.LayoutParams(0, -2);
        r32.weight = 1.0f;
        r23.setLayoutParams(r32);
        r84.addView(r23);
        View r0 = new C1030Xz(r94);
        LinearLayout.LayoutParams r95 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(40), AbstractC0295Gu.m616i(25));
        r95.gravity = 16;
        r84.addView(r0, r95);
        return new C0653P7(r84);
    }

    public C0696Q7(ArrayList r3, C0693Q4 r4) {
        this.f2238a = 2;
        AbstractC0295Gu.m625r(-84885733636149L);
        AbstractC0295Gu.m625r(-84920093374517L);
        this.f2239b = r3;
        this.f2240c = r4;
    }
}
