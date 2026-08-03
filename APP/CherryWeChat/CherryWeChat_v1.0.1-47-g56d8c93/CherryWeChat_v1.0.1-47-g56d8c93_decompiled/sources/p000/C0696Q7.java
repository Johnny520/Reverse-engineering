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

    public /* synthetic */ C0696Q7(ArrayList arrayList, Context context, int i) {
        this.f2238a = i;
        this.f2239b = arrayList;
        this.f2240c = context;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final int getItemCount() {
        switch (this.f2238a) {
        }
        return this.f2239b.size();
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final void onBindViewHolder(AbstractC1166o abstractC1166o, final int i) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        View view;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        View view2;
        ImageView imageView;
        Bitmap bitmapDecodeFile;
        ImageView imageView2;
        ImageView imageView3;
        switch (this.f2238a) {
            case 0:
                AbstractC0295Gu.m625r(-252806070007861L);
                View view3 = abstractC1166o.itemView;
                AbstractC0295Gu.m625r(-252836134778933L);
                LinearLayout linearLayout = (LinearLayout) view3;
                ArrayList arrayList = this.f2239b;
                C0610O7 c0610o7 = (C0610O7) arrayList.get(i);
                View childAt = linearLayout.getChildAt(1);
                AbstractC0295Gu.m625r(-252565551839285L);
                ((TextView) childAt).setText(c0610o7.f1955b);
                View childAt2 = linearLayout.getChildAt(2);
                AbstractC0295Gu.m625r(-251178277402677L);
                C1030Xz c1030Xz = (C1030Xz) childAt2;
                c1030Xz.setChecked(c0610o7.f1956c);
                c1030Xz.setOnCheckedChangeListener(new C2240mk(1, abstractC1166o, arrayList));
                break;
            case 1:
                AbstractC0295Gu.m625r(-25825638348853L);
                View view4 = abstractC1166o.itemView;
                AbstractC0295Gu.m625r(-25305947306037L);
                View childAt3 = ((LinearLayout) view4).getChildAt(1);
                AbstractC0295Gu.m625r(-26134875994165L);
                TextView textView7 = (TextView) childAt3;
                C2220m6 c2220m6 = C0276Gb.f894g;
                EnumC0319Hb enumC0319Hb = (EnumC0319Hb) this.f2239b.get(i);
                c2220m6.getClass();
                AbstractC0295Gu.m625r(-494926261385269L);
                String str = (String) C2220m6.m4466j().get(enumC0319Hb);
                if (str == null) {
                    str = enumC0319Hb.f1054a;
                }
                textView7.setText(str);
                break;
            default:
                AbstractC0295Gu.m625r(-85628762978357L);
                Object obj = this.f2239b.get(i);
                AbstractC0295Gu.m625r(-85658827749429L);
                final C0097CA c0097ca = (C0097CA) obj;
                AbstractC0295Gu.m625r(-84842783963189L);
                final C0976Wo c0976Wo = ((C0847To) abstractC1166o).f2692a;
                TextView textView8 = c0976Wo.f3060f;
                ImageView imageView4 = c0976Wo.f3056b;
                TextView textView9 = c0976Wo.f3061g;
                AbstractC0295Gu.m625r(-83906481092661L);
                String str2 = c0097ca.f227e;
                String str3 = c0097ca.f228f;
                try {
                    if (str3.length() == 0) {
                        if (imageView4 == null) {
                            AbstractC0295Gu.m625r(-83949430765621L);
                            imageView3 = null;
                        } else {
                            imageView3 = imageView4;
                        }
                        C0183EA.f539a.getClass();
                        imageView3.setImageBitmap(C0183EA.m375c());
                    } else {
                        File file = new File(str3);
                        if (file.exists()) {
                            String absolutePath = file.getAbsolutePath();
                            AbstractC0295Gu.m625r(-83992380438581L);
                            AbstractC0295Gu.m625r(-779729837750325L);
                            try {
                                bitmapDecodeFile = BitmapFactory.decodeFile(absolutePath);
                            } catch (Exception e) {
                                e.printStackTrace();
                                bitmapDecodeFile = null;
                            }
                            if (imageView4 == null) {
                                AbstractC0295Gu.m625r(-84082574751797L);
                                imageView2 = null;
                            } else {
                                imageView2 = imageView4;
                            }
                            imageView2.setImageBitmap(bitmapDecodeFile);
                        } else {
                            if (imageView4 == null) {
                                AbstractC0295Gu.m625r(-83575768610869L);
                                imageView = null;
                            } else {
                                imageView = imageView4;
                            }
                            C0183EA.f539a.getClass();
                            imageView.setImageBitmap(C0183EA.m375c());
                        }
                    }
                } catch (Exception unused) {
                    if (imageView4 == null) {
                        AbstractC0295Gu.m625r(-83618718283829L);
                        imageView4 = null;
                    }
                    C0183EA.f539a.getClass();
                    imageView4.setImageBitmap(C0183EA.m375c());
                }
                TextView textView10 = c0976Wo.f3057c;
                if (textView10 == null) {
                    AbstractC0295Gu.m625r(-83661667956789L);
                    textView10 = null;
                }
                textView10.setText(c0097ca.f224b);
                TextView textView11 = c0976Wo.f3058d;
                if (textView11 == null) {
                    AbstractC0295Gu.m625r(-83704617629749L);
                    textView11 = null;
                }
                textView11.setText(c0097ca.f225c);
                TextView textView12 = c0976Wo.f3059e;
                if (textView12 == null) {
                    AbstractC0295Gu.m625r(-83756157237301L);
                    textView12 = null;
                }
                textView12.setText("v" + c0097ca.f226d);
                if (textView8 == null) {
                    AbstractC0295Gu.m625r(-83811991812149L);
                    textView = null;
                } else {
                    textView = textView8;
                }
                textView.setText(str2);
                if (textView8 == null) {
                    AbstractC0295Gu.m625r(-84434762070069L);
                    textView8 = null;
                }
                textView8.setVisibility(str2.length() > 0 ? 0 : 8);
                C0183EA.f539a.getClass();
                boolean zM1134a = AbstractC0585Nj.m1134a(c0097ca.f223a, C0183EA.m373a());
                c0976Wo.setOnLongClickListener(new View.OnLongClickListener(i, c0976Wo, c0097ca) { // from class: Uo

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ C0976Wo f2784a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C0097CA f2785b;

                    {
                        this.f2784a = c0976Wo;
                        this.f2785b = c0097ca;
                    }

                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view5) {
                        Context context;
                        long j;
                        C0976Wo c0976Wo2 = this.f2784a;
                        c0976Wo2.getClass();
                        C0097CA c0097ca2 = this.f2785b;
                        String str4 = c0097ca2.f223a;
                        if (AbstractC0585Nj.m1134a(str4, AbstractC0295Gu.m625r(-84370337560629L))) {
                            context = c0976Wo2.getContext();
                            j = -84378927495221L;
                        } else {
                            C0183EA.f539a.getClass();
                            if (!AbstractC0585Nj.m1134a(str4, C0183EA.m373a())) {
                                Context context2 = c0976Wo2.getContext();
                                AbstractC0295Gu.m625r(-82819854366773L);
                                C1456gf.m2801S(context2, AbstractC0295Gu.m625r(-82888573843509L), AbstractC0295Gu.m625r(-82910048679989L) + c0097ca2.f224b + AbstractC0295Gu.m625r(-82948703385653L), new DialogInterfaceOnClickListenerC0933Vo(0, c0976Wo2, c0097ca2), false);
                                return true;
                            }
                            context = c0976Wo2.getContext();
                            j = -82768314759221L;
                        }
                        AbstractC0213Ey.m413k(j, context, 0);
                        return true;
                    }
                });
                if (!zM1134a) {
                    if (textView9 == null) {
                        AbstractC0295Gu.m625r(-84142704293941L);
                        textView2 = null;
                    } else {
                        textView2 = textView9;
                    }
                    textView2.setText(AbstractC0295Gu.m625r(-84185653966901L));
                    if (textView9 == null) {
                        AbstractC0295Gu.m625r(-84198538868789L);
                        textView3 = null;
                    } else {
                        textView3 = textView9;
                    }
                    textView3.setEnabled(true);
                    if (textView9 == null) {
                        AbstractC0295Gu.m625r(-84241488541749L);
                        view = null;
                    } else {
                        view = textView9;
                    }
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(c0976Wo.getContext().getColor(R.color.buttonPrimary));
                    gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(16));
                    view.setBackground(gradientDrawable);
                    if (textView9 == null) {
                        AbstractC0295Gu.m625r(-84284438214709L);
                        textView4 = null;
                    } else {
                        textView4 = textView9;
                    }
                    textView4.setTextColor(c0976Wo.getContext().getColor(R.color.buttonTextPrimary));
                    if (textView9 == null) {
                        AbstractC0295Gu.m625r(-84327387887669L);
                        textView9 = null;
                    }
                    textView9.setOnClickListener(new ViewOnClickListenerC2176l5(13, c0976Wo, c0097ca));
                } else {
                    if (textView9 == null) {
                        AbstractC0295Gu.m625r(-84507776514101L);
                        textView5 = null;
                    } else {
                        textView5 = textView9;
                    }
                    textView5.setText(AbstractC0295Gu.m625r(-84550726187061L));
                    if (textView9 == null) {
                        AbstractC0295Gu.m625r(-84563611088949L);
                        textView6 = null;
                    } else {
                        textView6 = textView9;
                    }
                    textView6.setEnabled(false);
                    if (textView9 == null) {
                        AbstractC0295Gu.m625r(-84606560761909L);
                        view2 = null;
                    } else {
                        view2 = textView9;
                    }
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setColor(c0976Wo.getContext().getColor(R.color.buttonSecondary));
                    gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(16));
                    gradientDrawable2.setStroke(AbstractC0295Gu.m616i(1), c0976Wo.getContext().getColor(R.color.cardStroke));
                    view2.setBackground(gradientDrawable2);
                    if (textView9 == null) {
                        AbstractC0295Gu.m625r(-84649510434869L);
                        textView9 = null;
                    }
                    textView9.setTextColor(c0976Wo.getContext().getColor(R.color.buttonTextSecondary));
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final AbstractC1166o onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (this.f2238a) {
            case 0:
                AbstractC0295Gu.m625r(-252767415302197L);
                Context context = (Context) this.f2240c;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.setMinimumHeight(AbstractC0295Gu.m616i(52));
                linearLayout.setPadding(AbstractC0295Gu.m616i(14), 0, AbstractC0295Gu.m616i(14), 0);
                linearLayout.setBackgroundColor(context.getColor(R.color.cardBackground));
                linearLayout.setLayoutParams(new C2431qv(-1, -2));
                TextView textView = new TextView(context);
                AbstractC0213Ey.m414l(-252797480073269L, textView, 20.0f);
                textView.setTextColor(context.getColor(R.color.textSummary));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMarginEnd(AbstractC0295Gu.m616i(12));
                textView.setLayoutParams(layoutParams);
                linearLayout.addView(textView);
                TextView textView2 = new TextView(context);
                textView2.setTextSize(15.0f);
                textView2.setTextColor(context.getColor(R.color.textTitle));
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
                layoutParams2.weight = 1.0f;
                textView2.setLayoutParams(layoutParams2);
                linearLayout.addView(textView2);
                View c1030Xz = new C1030Xz(context);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(40), AbstractC0295Gu.m616i(25));
                layoutParams3.gravity = 16;
                linearLayout.addView(c1030Xz, layoutParams3);
                return new C0653P7(linearLayout);
            case 1:
                AbstractC0295Gu.m625r(-25786983643189L);
                Context context2 = (Context) this.f2240c;
                LinearLayout linearLayout2 = new LinearLayout(context2);
                linearLayout2.setOrientation(0);
                linearLayout2.setGravity(16);
                linearLayout2.setMinimumHeight(AbstractC0295Gu.m616i(52));
                linearLayout2.setPadding(AbstractC0295Gu.m616i(14), 0, AbstractC0295Gu.m616i(14), 0);
                linearLayout2.setBackgroundColor(context2.getColor(R.color.cardBackground));
                linearLayout2.setLayoutParams(new C2431qv(-1, -2));
                TextView textView3 = new TextView(context2);
                AbstractC0213Ey.m414l(-25817048414261L, textView3, 20.0f);
                textView3.setTextColor(context2.getColor(R.color.textSummary));
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams4.setMarginEnd(AbstractC0295Gu.m616i(12));
                textView3.setLayoutParams(layoutParams4);
                linearLayout2.addView(textView3);
                TextView textView4 = new TextView(context2);
                textView4.setTextSize(15.0f);
                textView4.setTextColor(context2.getColor(R.color.textTitle));
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2);
                layoutParams5.weight = 1.0f;
                textView4.setLayoutParams(layoutParams5);
                linearLayout2.addView(textView4);
                return new C0653P7(linearLayout2);
            default:
                AbstractC0295Gu.m625r(-85529978730549L);
                Context context3 = viewGroup.getContext();
                AbstractC0295Gu.m625r(-85560043501621L);
                return new C0847To(new C0976Wo(context3, (C0693Q4) this.f2240c));
        }
    }

    public C0696Q7(ArrayList arrayList, C0693Q4 c0693q4) {
        this.f2238a = 2;
        AbstractC0295Gu.m625r(-84885733636149L);
        AbstractC0295Gu.m625r(-84920093374517L);
        this.f2239b = arrayList;
        this.f2240c = c0693q4;
    }
}
