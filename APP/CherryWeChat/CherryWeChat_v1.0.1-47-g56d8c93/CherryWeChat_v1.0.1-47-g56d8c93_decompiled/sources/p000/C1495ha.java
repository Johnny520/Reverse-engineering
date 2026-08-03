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

    public C1495ha(int i) {
        this.f5264a = i;
        switch (i) {
            case 1:
                this.f5272i = new ArrayList();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: a */
    public void m2858a(String str) {
        ?? r0;
        if (this.f5272i.isEmpty()) {
            C0183EA.f539a.getClass();
            this.f5272i = C0183EA.f543e;
        }
        if (str.length() == 0) {
            r0 = this.f5272i;
        } else {
            ?? r02 = this.f5272i;
            ArrayList arrayList = new ArrayList();
            for (Object obj : r02) {
                C0054BA c0054ba = (C0054BA) obj;
                if (!AbstractC2564tz.m5051L(c0054ba.f121b, str, true) && !AbstractC2564tz.m5051L(c0054ba.f122c, str, true)) {
                    ArrayList arrayList2 = c0054ba.f126g;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            if (AbstractC2564tz.m5051L(((C0140DA) it.next()).f365b, str, true)) {
                            }
                        }
                    }
                }
                arrayList.add(obj);
            }
            r0 = arrayList;
        }
        C1258ca c1258ca = (C1258ca) this.f5271h;
        if (c1258ca != null) {
            AbstractC0295Gu.m625r(-101460012431413L);
            ArrayList arrayList3 = (ArrayList) c1258ca.f4264d;
            arrayList3.clear();
            arrayList3.addAll(r0);
            LinkedHashMap linkedHashMap = c1258ca.f4262b;
            linkedHashMap.clear();
            Iterator it2 = AbstractC2496sa.m4975Z(arrayList3).iterator();
            while (true) {
                C0200El c0200El = (C0200El) it2;
                if (!c0200El.f605c) {
                    break;
                } else {
                    linkedHashMap.put(Integer.valueOf(c0200El.nextInt()), Boolean.FALSE);
                }
            }
            c1258ca.notifyDataSetChanged();
        }
        int size = r0.size();
        if (str.length() == 0) {
            TextView textView = this.f5269f;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            TextView textView2 = this.f5269f;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.f5269f;
            if (textView3 != null) {
                textView3.setText(AbstractC0295Gu.m625r(-101253854001205L) + size + AbstractC0295Gu.m625r(-101271033870389L));
            }
        }
        m2862h(r0.isEmpty(), str.length() > 0);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        long j;
        switch (this.f5264a) {
            case 0:
                j = -101365523150901L;
                break;
            default:
                j = -83189221554229L;
                break;
        }
        AbstractC0295Gu.m625r(j);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity activity, int i, int i2, Intent intent) {
        long j;
        switch (this.f5264a) {
            case 0:
                j = -101404177856565L;
                break;
            default:
                j = -83227876259893L;
                break;
        }
        AbstractC0295Gu.m625r(j);
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.List] */
    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity activity) {
        switch (this.f5264a) {
            case 0:
                AbstractC0295Gu.m625r(-101563091646517L);
                String strM625r = AbstractC0295Gu.m625r(-101601746352181L);
                boolean z = false;
                Object[] objArr = {0, AbstractC0295Gu.m625r(-101679055763509L), new MenuItemOnMenuItemClickListenerC0429Jz(this, activity)};
                AbstractC0295Gu.m625r(-578325936338997L);
                XposedHelpers.callMethod(activity, strM625r, Arrays.copyOf(objArr, 3));
                C0987Wz c0987Wz = new C0987Wz(activity);
                c0987Wz.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                c0987Wz.setColorSchemeColors(activity.getColor(R.color.colorPrimary), activity.getColor(R.color.colorSuccess), activity.getColor(R.color.colorInfo));
                c0987Wz.setOnRefreshListener(new C0698Q9(0, this, activity));
                this.f5270g = c0987Wz;
                LinearLayout linearLayout = new LinearLayout(activity);
                linearLayout.setOrientation(1);
                linearLayout.setBackgroundColor(activity.getColor(R.color.colorBackground));
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                linearLayout.setPadding(0, AbstractC0295Gu.m616i(12), 0, AbstractC0295Gu.m616i(12));
                this.f5265b = linearLayout;
                this.f5270g.addView(linearLayout);
                LinearLayout linearLayout2 = new LinearLayout(activity);
                linearLayout2.setOrientation(0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
                linearLayout2.setLayoutParams(layoutParams);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(activity.getColor(R.color.cardBackground));
                gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(24));
                gradientDrawable.setStroke(AbstractC0295Gu.m616i(1), activity.getColor(R.color.cardStroke));
                linearLayout2.setBackground(gradientDrawable);
                linearLayout2.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12));
                linearLayout2.setGravity(16);
                ImageView imageView = new ImageView(activity);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
                layoutParams2.setMarginEnd(AbstractC0295Gu.m616i(12));
                imageView.setLayoutParams(layoutParams2);
                imageView.setImageResource(R.drawable.ic_search);
                imageView.setColorFilter(activity.getColor(R.color.textSecondary));
                linearLayout2.addView(imageView);
                EditText editText = new EditText(activity);
                editText.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                editText.setHint(AbstractC0295Gu.m625r(-101691940665397L));
                editText.setHintTextColor(activity.getColor(R.color.textSecondary));
                editText.setTextColor(activity.getColor(R.color.textTitle));
                editText.setTextSize(16.0f);
                editText.setBackground(null);
                editText.setSingleLine(true);
                editText.setImeOptions(3);
                editText.addTextChangedListener(new C1351e5(1, this));
                this.f5267d = editText;
                linearLayout2.addView(editText);
                ImageView imageView2 = new ImageView(activity);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
                layoutParams3.setMarginStart(AbstractC0295Gu.m616i(12));
                imageView2.setLayoutParams(layoutParams3);
                imageView2.setImageResource(R.drawable.ic_clear);
                imageView2.setColorFilter(activity.getColor(R.color.textSecondary));
                imageView2.setVisibility(8);
                imageView2.setOnClickListener(new ViewOnClickListenerC2176l5(2, this, imageView2));
                linearLayout2.addView(imageView2);
                EditText editText2 = this.f5267d;
                if (editText2 != null) {
                    editText2.addTextChangedListener(new C1363ea(imageView2, 0));
                }
                this.f5265b.addView(linearLayout2);
                TextView textView = new TextView(activity);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams4.setMargins(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
                textView.setLayoutParams(layoutParams4);
                textView.setTextSize(14.0f);
                textView.setTextColor(activity.getColor(R.color.textSecondary));
                textView.setVisibility(8);
                this.f5269f = textView;
                this.f5265b.addView(textView);
                LinearLayout linearLayout3 = new LinearLayout(activity);
                linearLayout3.setOrientation(1);
                linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                linearLayout3.setGravity(17);
                linearLayout3.setPadding(AbstractC0295Gu.m616i(32), 0, AbstractC0295Gu.m616i(32), 0);
                linearLayout3.setVisibility(8);
                ImageView imageView3 = new ImageView(activity);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(80), AbstractC0295Gu.m616i(80));
                layoutParams5.bottomMargin = AbstractC0295Gu.m616i(16);
                imageView3.setLayoutParams(layoutParams5);
                imageView3.setImageResource(R.drawable.ic_search);
                imageView3.setColorFilter(activity.getColor(R.color.textSecondary));
                imageView3.setAlpha(0.5f);
                linearLayout3.addView(imageView3);
                TextView textView2 = new TextView(activity);
                AbstractC0213Ey.m414l(-101210904328245L, textView2, 16.0f);
                textView2.setTextColor(activity.getColor(R.color.textSecondary));
                textView2.setGravity(17);
                textView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                linearLayout3.addView(textView2);
                this.f5268e = linearLayout3;
                this.f5265b.addView(linearLayout3);
                RecyclerView recyclerView = new RecyclerView(activity);
                recyclerView.setId(View.generateViewId());
                recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                recyclerView.setOverScrollMode(2);
                recyclerView.setPadding(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), 0);
                recyclerView.addItemDecoration(new C1320da(0));
                this.f5266c = recyclerView;
                this.f5265b.addView(recyclerView);
                C0183EA.f539a.getClass();
                ArrayList arrayList = C0183EA.f543e;
                this.f5272i = arrayList;
                C1258ca c1258ca = new C1258ca(activity, new ArrayList(arrayList));
                this.f5271h = c1258ca;
                RecyclerView recyclerView2 = this.f5266c;
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(c1258ca);
                }
                m2862h(this.f5272i.isEmpty(), false);
                C1036Y4 c1036y4 = C1036Y4.f3308a;
                C0740R9 c0740r9 = new C0740R9(this, z, activity, 0);
                C0740R9 c0740r92 = new C0740R9(this, z, activity, 1);
                c1036y4.getClass();
                C1036Y4.m1982a(activity, c0740r9, c0740r92, true);
                break;
            default:
                AbstractC0295Gu.m625r(-83386790049845L);
                C0987Wz c0987Wz2 = new C0987Wz(activity);
                c0987Wz2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                c0987Wz2.setColorSchemeColors(activity.getColor(R.color.colorPrimary), activity.getColor(R.color.colorSuccess), activity.getColor(R.color.colorInfo));
                c0987Wz2.setOnRefreshListener(new C0698Q9(2, this, activity));
                this.f5270g = c0987Wz2;
                LinearLayout linearLayout4 = new LinearLayout(activity);
                linearLayout4.setOrientation(1);
                linearLayout4.setBackgroundColor(activity.getColor(R.color.colorBackground));
                linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                linearLayout4.setPadding(0, AbstractC0295Gu.m616i(12), 0, AbstractC0295Gu.m616i(12));
                this.f5265b = linearLayout4;
                this.f5270g.addView(linearLayout4);
                LinearLayout linearLayout5 = new LinearLayout(activity);
                linearLayout5.setOrientation(0);
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams6.setMargins(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
                linearLayout5.setLayoutParams(layoutParams6);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(linearLayout5.getContext().getColor(R.color.cardBackground));
                gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(24));
                gradientDrawable2.setStroke(AbstractC0295Gu.m616i(1), linearLayout5.getContext().getColor(R.color.cardStroke));
                linearLayout5.setBackground(gradientDrawable2);
                linearLayout5.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12));
                linearLayout5.setGravity(16);
                ImageView imageView4 = new ImageView(linearLayout5.getContext());
                LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
                layoutParams7.setMarginEnd(AbstractC0295Gu.m616i(12));
                imageView4.setLayoutParams(layoutParams7);
                imageView4.setImageResource(R.drawable.ic_search);
                imageView4.setColorFilter(imageView4.getContext().getColor(R.color.textSecondary));
                linearLayout5.addView(imageView4);
                EditText editText3 = new EditText(linearLayout5.getContext());
                editText3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                editText3.setHint(AbstractC0295Gu.m625r(-83425444755509L));
                editText3.setHintTextColor(editText3.getContext().getColor(R.color.textSecondary));
                editText3.setTextColor(editText3.getContext().getColor(R.color.textTitle));
                editText3.setTextSize(16.0f);
                editText3.setBackground(null);
                editText3.setSingleLine(true);
                editText3.setImeOptions(3);
                editText3.addTextChangedListener(new C1351e5(4, this));
                this.f5267d = editText3;
                linearLayout5.addView(editText3);
                ImageView imageView5 = new ImageView(linearLayout5.getContext());
                LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
                layoutParams8.setMarginStart(AbstractC0295Gu.m616i(12));
                imageView5.setLayoutParams(layoutParams8);
                imageView5.setImageResource(R.drawable.ic_clear);
                imageView5.setColorFilter(imageView5.getContext().getColor(R.color.textSecondary));
                imageView5.setVisibility(8);
                imageView5.setOnClickListener(new ViewOnClickListenerC2176l5(12, this, imageView5));
                linearLayout5.addView(imageView5);
                EditText editText4 = this.f5267d;
                if (editText4 != null) {
                    editText4.addTextChangedListener(new C1363ea(imageView5, 1));
                }
                this.f5265b.addView(linearLayout5);
                LinearLayout linearLayout6 = new LinearLayout(activity);
                linearLayout6.setOrientation(0);
                LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams9.setMargins(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), 0);
                linearLayout6.setLayoutParams(layoutParams9);
                linearLayout6.setGravity(16);
                ImageView imageView6 = new ImageView(linearLayout6.getContext());
                LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
                layoutParams10.setMarginEnd(AbstractC0295Gu.m616i(8));
                imageView6.setLayoutParams(layoutParams10);
                imageView6.setImageResource(R.drawable.ic_info);
                imageView6.setColorFilter(imageView6.getContext().getColor(R.color.textSecondary));
                imageView6.setClickable(true);
                imageView6.setFocusable(true);
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setShape(1);
                gradientDrawable3.setColor(imageView6.getContext().getColor(R.color.buttonSecondary));
                imageView6.setBackground(gradientDrawable3);
                imageView6.setPadding(AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(4));
                imageView6.setOnClickListener(new ViewOnClickListenerC0094C7(this, activity, 1));
                linearLayout6.addView(imageView6);
                TextView textView3 = new TextView(linearLayout6.getContext());
                textView3.setText(AbstractC0295Gu.m625r(-83494164232245L));
                textView3.setTextSize(12.0f);
                textView3.setTextColor(textView3.getContext().getColor(R.color.textSecondary));
                textView3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                textView3.setClickable(true);
                textView3.setFocusable(true);
                textView3.setOnClickListener(new ViewOnClickListenerC0094C7(this, activity, 2));
                linearLayout6.addView(textView3);
                this.f5265b.addView(linearLayout6);
                TextView textView4 = new TextView(activity);
                LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams11.setMargins(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
                textView4.setLayoutParams(layoutParams11);
                textView4.setTextSize(14.0f);
                textView4.setTextColor(textView4.getContext().getColor(R.color.textSecondary));
                textView4.setVisibility(8);
                this.f5269f = textView4;
                this.f5265b.addView(textView4);
                LinearLayout linearLayout7 = new LinearLayout(activity);
                linearLayout7.setOrientation(1);
                linearLayout7.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                linearLayout7.setGravity(17);
                linearLayout7.setPadding(AbstractC0295Gu.m616i(32), 0, AbstractC0295Gu.m616i(32), 0);
                linearLayout7.setVisibility(8);
                ImageView imageView7 = new ImageView(linearLayout7.getContext());
                LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(80), AbstractC0295Gu.m616i(80));
                layoutParams12.bottomMargin = AbstractC0295Gu.m616i(16);
                imageView7.setLayoutParams(layoutParams12);
                imageView7.setImageResource(R.drawable.ic_search);
                imageView7.setColorFilter(imageView7.getContext().getColor(R.color.textSecondary));
                imageView7.setAlpha(0.5f);
                linearLayout7.addView(imageView7);
                TextView textView5 = new TextView(linearLayout7.getContext());
                textView5.setText(AbstractC0295Gu.m625r(-83034602731573L));
                textView5.setTextSize(16.0f);
                textView5.setTextColor(textView5.getContext().getColor(R.color.textSecondary));
                textView5.setGravity(17);
                textView5.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                linearLayout7.addView(textView5);
                this.f5268e = linearLayout7;
                this.f5265b.addView(linearLayout7);
                RecyclerView recyclerView3 = new RecyclerView(activity);
                recyclerView3.setId(View.generateViewId());
                recyclerView3.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                recyclerView3.setLayoutManager(new LinearLayoutManager(1));
                recyclerView3.setOverScrollMode(2);
                recyclerView3.setPadding(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), 0);
                recyclerView3.addItemDecoration(new C1320da(1));
                this.f5266c = recyclerView3;
                this.f5265b.addView(recyclerView3);
                C0183EA.f539a.getClass();
                ArrayList arrayListM381i = C0183EA.m381i();
                this.f5272i = arrayListM381i;
                C0696Q7 c0696q7 = new C0696Q7(arrayListM381i, new C0693Q4(4, this));
                this.f5271h = c0696q7;
                RecyclerView recyclerView4 = this.f5266c;
                if (recyclerView4 != null) {
                    recyclerView4.setAdapter(c0696q7);
                }
                m2863i(((ArrayList) this.f5272i).isEmpty(), false);
                m2860f(activity, false);
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m2859e(String str) {
        ArrayList arrayList;
        if (((ArrayList) this.f5272i).isEmpty()) {
            C0183EA.f539a.getClass();
            this.f5272i = C0183EA.m381i();
        }
        if (str.length() == 0) {
            C0183EA.f539a.getClass();
            arrayList = new ArrayList(C0183EA.m381i());
        } else {
            ArrayList arrayList2 = (ArrayList) this.f5272i;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                C0097CA c0097ca = (C0097CA) obj;
                if (AbstractC2564tz.m5051L(c0097ca.f224b, str, true) || AbstractC2564tz.m5051L(c0097ca.f225c, str, true) || AbstractC2564tz.m5051L(c0097ca.f227e, str, true)) {
                    arrayList3.add(obj);
                }
            }
            arrayList = arrayList3;
        }
        C0696Q7 c0696q7 = (C0696Q7) this.f5271h;
        if (c0696q7 != null) {
            AbstractC0295Gu.m625r(-85697482455093L);
            ArrayList arrayList4 = c0696q7.f2239b;
            arrayList4.clear();
            arrayList4.addAll(arrayList);
            c0696q7.notifyDataSetChanged();
        }
        int size = arrayList.size();
        if (str.length() == 0) {
            TextView textView = this.f5269f;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            TextView textView2 = this.f5269f;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = this.f5269f;
            if (textView3 != null) {
                textView3.setText(AbstractC0295Gu.m625r(-83077552404533L) + size + AbstractC0295Gu.m625r(-83094732273717L));
            }
        }
        m2863i(arrayList.isEmpty(), str.length() > 0);
    }

    /* JADX INFO: renamed from: f */
    public void m2860f(Activity activity, boolean z) {
        String strM625r;
        Editable text;
        C0183EA.f539a.getClass();
        this.f5272i = C0183EA.m381i();
        EditText editText = this.f5267d;
        if (editText == null || (text = editText.getText()) == null || (strM625r = text.toString()) == null) {
            strM625r = AbstractC0295Gu.m625r(-81643033327669L);
        }
        m2859e(strM625r);
        C0987Wz c0987Wz = this.f5270g;
        if (c0987Wz != null) {
            c0987Wz.setRefreshing(false);
        }
        if (z) {
            Toast.makeText(activity, AbstractC0295Gu.m625r(-81647328294965L), 0).show();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m2861g() {
        String strM625r;
        Editable text;
        C0183EA.f539a.getClass();
        this.f5272i = C0183EA.f543e;
        EditText editText = this.f5267d;
        if (editText == null || (text = editText.getText()) == null || (strM625r = text.toString()) == null) {
            strM625r = AbstractC0295Gu.m625r(-102014063212597L);
        }
        m2858a(strM625r);
    }

    @Override // p000.InterfaceC0972Wk
    public final View getContentView() {
        switch (this.f5264a) {
        }
        return this.f5270g;
    }

    @Override // p000.InterfaceC0972Wk
    public final String getTitle() {
        switch (this.f5264a) {
            case 0:
                return AbstractC0295Gu.m625r(-101992588376117L);
            default:
                return AbstractC0295Gu.m625r(-83266530965557L);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m2862h(boolean z, boolean z2) {
        if (!z) {
            LinearLayout linearLayout = this.f5268e;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            RecyclerView recyclerView = this.f5266c;
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f5268e;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        RecyclerView recyclerView2 = this.f5266c;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f5268e;
        View childAt = linearLayout3 != null ? linearLayout3.getChildAt(1) : null;
        TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
        if (textView != null) {
            textView.setText(z2 ? AbstractC0295Gu.m625r(-101292508706869L) : AbstractC0295Gu.m625r(-101335458379829L));
        }
    }

    /* JADX INFO: renamed from: i */
    public void m2863i(boolean z, boolean z2) {
        if (!z) {
            LinearLayout linearLayout = this.f5268e;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            RecyclerView recyclerView = this.f5266c;
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f5268e;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        RecyclerView recyclerView2 = this.f5266c;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f5268e;
        View childAt = linearLayout3 != null ? linearLayout3.getChildAt(1) : null;
        TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
        if (textView != null) {
            textView.setText(z2 ? AbstractC0295Gu.m625r(-83116207110197L) : AbstractC0295Gu.m625r(-83159156783157L));
        }
    }
}
