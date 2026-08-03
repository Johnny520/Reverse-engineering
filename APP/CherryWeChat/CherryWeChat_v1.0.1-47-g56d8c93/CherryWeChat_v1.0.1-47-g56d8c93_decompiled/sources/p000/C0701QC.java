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
import java.util.Collection;
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
    public EnumC0142DC f2264k = EnumC0142DC.f370b;

    /* JADX INFO: renamed from: l */
    public final LinkedHashMap f2265l = new LinkedHashMap();

    /* JADX INFO: renamed from: m */
    public List f2266m;

    /* JADX INFO: renamed from: n */
    public List f2267n;

    /* JADX INFO: renamed from: o */
    public EnumC0486LC f2268o;

    public C0701QC() {
        C0452Kf c0452Kf = C0452Kf.f1484a;
        this.f2266m = c0452Kf;
        this.f2267n = c0452Kf;
        this.f2268o = EnumC0486LC.f1596c;
    }

    /* JADX INFO: renamed from: a */
    public static final void m1430a(C0701QC c0701qc) {
        List list = c0701qc.f2266m;
        int i = 0;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                EnumC0099CC enumC0099CC = ((C0185EC) it.next()).f567s;
                if (enumC0099CC == EnumC0099CC.f234b || enumC0099CC == EnumC0099CC.f236d || enumC0099CC == EnumC0099CC.f237e) {
                    i2++;
                    if (i2 < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
        }
        List list2 = c0701qc.f2266m;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((C0185EC) it2.next()).f567s == EnumC0099CC.f237e && (i = i + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        }
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
    public final void mo1338c(Activity activity, int i, int i2, Intent intent) {
        AbstractC0295Gu.m625r(-464457763387445L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity activity) {
        int i;
        AbstractC0295Gu.m625r(-484867447978037L);
        C0357IC.f1218a.getClass();
        AbstractC0295Gu.m625r(-802596243634229L);
        ArrayList arrayList = C0357IC.f1220c;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(activity.getColor(R.color.colorBackground));
        this.f2256c = frameLayout;
        C0987Wz c0987Wz = new C0987Wz(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.bottomMargin = AbstractC0295Gu.m616i(80);
        c0987Wz.setLayoutParams(layoutParams);
        c0987Wz.setColorSchemeColors(activity.getColor(R.color.colorPrimary), activity.getColor(R.color.colorSuccess), activity.getColor(R.color.colorInfo));
        c0987Wz.setOnRefreshListener(new C2464rl(this, activity));
        this.f2255b = c0987Wz;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(activity.getColor(R.color.colorBackground));
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        int i2 = 0;
        linearLayout.setPadding(0, AbstractC0295Gu.m616i(12), 0, AbstractC0295Gu.m616i(12));
        this.f2254a = linearLayout;
        this.f2255b.addView(linearLayout);
        this.f2256c.addView(this.f2255b);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        linearLayout2.setLayoutParams(layoutParams2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(activity.getColor(R.color.cardBackground));
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(24));
        gradientDrawable.setStroke(AbstractC0295Gu.m616i(1), activity.getColor(R.color.cardStroke));
        linearLayout2.setBackground(gradientDrawable);
        linearLayout2.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12));
        linearLayout2.setGravity(16);
        ImageView imageView = new ImageView(activity);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        layoutParams3.setMarginEnd(AbstractC0295Gu.m616i(12));
        imageView.setLayoutParams(layoutParams3);
        imageView.setImageResource(R.drawable.ic_search);
        imageView.setColorFilter(activity.getColor(R.color.textSecondary));
        linearLayout2.addView(imageView);
        EditText editText = new EditText(activity);
        editText.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        editText.setHint(AbstractC0295Gu.m625r(-484356346869813L));
        editText.setHintTextColor(activity.getColor(R.color.textSecondary));
        editText.setTextColor(activity.getColor(R.color.textTitle));
        editText.setTextSize(16.0f);
        editText.setBackground(null);
        editText.setSingleLine(true);
        editText.setImeOptions(3);
        editText.addTextChangedListener(new C1351e5(5, this));
        this.f2258e = editText;
        linearLayout2.addView(editText);
        ImageView imageView2 = new ImageView(activity);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        layoutParams4.setMarginStart(AbstractC0295Gu.m616i(12));
        imageView2.setLayoutParams(layoutParams4);
        imageView2.setImageResource(R.drawable.ic_clear);
        imageView2.setColorFilter(activity.getColor(R.color.textSecondary));
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new ViewOnClickListenerC2176l5(21, this, imageView2));
        linearLayout2.addView(imageView2);
        EditText editText2 = this.f2258e;
        if (editText2 != null) {
            editText2.addTextChangedListener(new C1363ea(imageView2, 2));
        }
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.setMarginStart(AbstractC0295Gu.m616i(12));
        linearLayout3.addView(linearLayout2, layoutParams5);
        ImageView imageView3 = new ImageView(activity);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(30), AbstractC0295Gu.m616i(30));
        layoutParams6.setMarginStart(AbstractC0295Gu.m616i(12));
        layoutParams6.setMarginEnd(AbstractC0295Gu.m616i(12));
        layoutParams6.gravity = 16;
        imageView3.setLayoutParams(layoutParams6);
        imageView3.setImageResource(R.drawable.ic_drag_handle);
        imageView3.setColorFilter(activity.getColor(R.color.textSecondary));
        imageView3.setOnClickListener(new ViewOnClickListenerC2176l5(22, this, activity));
        linearLayout3.addView(imageView3);
        this.f2254a.addView(linearLayout3);
        TextView textView = new TextView(activity);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams7.setMargins(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        textView.setLayoutParams(layoutParams7);
        textView.setTextSize(12.0f);
        textView.setTextColor(activity.getColor(R.color.textSecondary));
        textView.setGravity(17);
        textView.setVisibility(8);
        this.f2254a.addView(textView);
        LinearLayout linearLayout4 = new LinearLayout(activity);
        linearLayout4.setOrientation(1);
        linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout4.setGravity(17);
        linearLayout4.setPadding(AbstractC0295Gu.m616i(32), 0, AbstractC0295Gu.m616i(32), 0);
        linearLayout4.setVisibility(8);
        ImageView imageView4 = new ImageView(activity);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(80), AbstractC0295Gu.m616i(80));
        layoutParams8.bottomMargin = AbstractC0295Gu.m616i(16);
        imageView4.setLayoutParams(layoutParams8);
        imageView4.setImageResource(R.drawable.ic_search);
        imageView4.setColorFilter(activity.getColor(R.color.textSecondary));
        imageView4.setAlpha(0.5f);
        linearLayout4.addView(imageView4);
        TextView textView2 = new TextView(activity);
        AbstractC0213Ey.m414l(-465617404557365L, textView2, 16.0f);
        textView2.setTextColor(activity.getColor(R.color.textSecondary));
        textView2.setGravity(17);
        linearLayout4.addView(textView2);
        this.f2261h = linearLayout4;
        this.f2254a.addView(linearLayout4);
        RecyclerView recyclerView = new RecyclerView(activity);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.setOverScrollMode(2);
        recyclerView.setPadding(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), 0);
        recyclerView.addItemDecoration(new C1320da(3));
        this.f2259f = recyclerView;
        C1258ca c1258ca = new C1258ca(this);
        this.f2260g = c1258ca;
        this.f2259f.setAdapter(c1258ca);
        this.f2254a.addView(this.f2259f);
        m1435i();
        FrameLayout frameLayout2 = this.f2256c;
        LinearLayout linearLayout5 = new LinearLayout(activity);
        linearLayout5.setOrientation(0);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, AbstractC0295Gu.m616i(72));
        layoutParams9.gravity = 80;
        linearLayout5.setLayoutParams(layoutParams9);
        linearLayout5.setBackgroundColor(activity.getColor(R.color.cardBackground));
        linearLayout5.setGravity(16);
        linearLayout5.setPadding(AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8));
        linearLayout5.setElevation(AbstractC0295Gu.m616i(8));
        this.f2257d = linearLayout5;
        View view = new View(activity);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, AbstractC0295Gu.m616i(1));
        layoutParams10.gravity = 80;
        layoutParams10.bottomMargin = AbstractC0295Gu.m616i(72);
        view.setLayoutParams(layoutParams10);
        view.setBackgroundColor(activity.getColor(R.color.cardStroke));
        frameLayout2.addView(view);
        EnumC0142DC[] enumC0142DCArrValues = EnumC0142DC.values();
        int length = enumC0142DCArrValues.length;
        int i3 = 0;
        while (i3 < length) {
            EnumC0142DC enumC0142DC = enumC0142DCArrValues[i3];
            LinearLayout linearLayout6 = new LinearLayout(activity);
            linearLayout6.setOrientation(1);
            linearLayout6.setGravity(17);
            linearLayout6.setLayoutParams(new LinearLayout.LayoutParams(i2, -1, 1.0f));
            linearLayout6.setPadding(AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(6));
            ImageView imageView5 = new ImageView(activity);
            LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24));
            layoutParams11.gravity = 1;
            imageView5.setLayoutParams(layoutParams11);
            int iOrdinal = enumC0142DC.ordinal();
            if (iOrdinal == 0) {
                i = R.drawable.ic_my_themes;
            } else {
                if (iOrdinal != 1) {
                    throw new C0232Fa();
                }
                i = R.drawable.ic_store;
            }
            imageView5.setImageResource(i);
            imageView5.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            linearLayout6.addView(imageView5);
            TextView textView3 = new TextView(activity);
            textView3.setText(enumC0142DC.f372a);
            textView3.setTextSize(12.0f);
            textView3.setGravity(17);
            LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams12.topMargin = AbstractC0295Gu.m616i(4);
            textView3.setLayoutParams(layoutParams12);
            textView3.setMaxLines(1);
            linearLayout6.addView(textView3);
            linearLayout6.setOnClickListener(new ViewOnClickListenerC2176l5(23, this, enumC0142DC));
            View childAt = linearLayout6.getChildAt(1);
            AbstractC0295Gu.m625r(-484596865038389L);
            this.f2265l.put(enumC0142DC, (TextView) childAt);
            this.f2257d.addView(linearLayout6);
            i3++;
            i2 = 0;
        }
        frameLayout2.addView(this.f2257d);
        m1436j();
        m1433g(activity);
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
    public final void m1431e(String str) {
        List listM4904n0;
        ?? arrayList;
        ?? M4904n0;
        Object obj;
        Object next;
        C0357IC c0357ic = C0357IC.f1218a;
        EnumC0142DC enumC0142DC = this.f2264k;
        c0357ic.getClass();
        AbstractC0295Gu.m625r(-803481006897205L);
        int iOrdinal = enumC0142DC.ordinal();
        int i = 0;
        if (iOrdinal == 0) {
            List list = C0357IC.f1219b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                C0185EC c0185ec = (C0185EC) obj2;
                String str2 = c0185ec.f550b;
                EnumC0099CC enumC0099CC = c0185ec.f567s;
                boolean z = (AbstractC0585Nj.m1134a(str2, AbstractC0295Gu.m625r(-803498186766389L)) || AbstractC0585Nj.m1134a(c0185ec.f549a, AbstractC0295Gu.m625r(-803506776700981L))) || ((enumC0099CC == EnumC0099CC.f234b || enumC0099CC == EnumC0099CC.f235c || enumC0099CC == EnumC0099CC.f236d || enumC0099CC == EnumC0099CC.f237e) && str2.length() > 0 && !str2.equals(AbstractC0295Gu.m625r(-803515366635573L)));
                AbstractC0295Gu.m625r(-803523956570165L);
                AbstractC0295Gu.m625r(-803609855916085L);
                AbstractC0295Gu.m625r(-803648510621749L);
                AbstractC0295Gu.m625r(-803674280425525L);
                AbstractC0295Gu.m625r(-803721525065781L);
                Objects.toString(enumC0099CC);
                AbstractC0295Gu.m625r(-803214718924853L);
                AbstractC0295Gu.m625r(-803283438401589L);
                AbstractC0295Gu.m625r(-803347862911029L);
                if (z) {
                    arrayList2.add(obj2);
                }
            }
            List listM4904n02 = AbstractC2453ra.m4904n0(arrayList2, new C0963Wb(9));
            String strM625r = AbstractC0295Gu.m625r(-801982063310901L);
            String strM625r2 = AbstractC0295Gu.m625r(-802042192853045L);
            String strM625r3 = AbstractC0295Gu.m625r(-801552566581301L);
            String strM625r4 = AbstractC0295Gu.m625r(-801574041417781L);
            String strM625r5 = AbstractC0295Gu.m625r(-801625581025333L);
            String strM625r6 = AbstractC0295Gu.m625r(-801698595469365L);
            String strM625r7 = AbstractC0295Gu.m625r(-801702890436661L);
            String strM625r8 = AbstractC0295Gu.m625r(-801707185403957L);
            String strM625r9 = AbstractC0295Gu.m625r(-801724365273141L);
            String strM625r10 = AbstractC0295Gu.m625r(-801728660240437L);
            String strM625r11 = AbstractC0295Gu.m625r(-801732955207733L);
            String strM625r12 = AbstractC0295Gu.m625r(-801737250175029L);
            String strM625r13 = AbstractC0295Gu.m625r(-801741545142325L);
            EnumC0099CC enumC0099CC2 = EnumC0099CC.f233a;
            C0452Kf c0452Kf = C0452Kf.f1484a;
            List listSingletonList = Collections.singletonList(new C0185EC(strM625r, strM625r2, strM625r3, strM625r4, strM625r5, strM625r6, strM625r7, c0452Kf, strM625r8, c0452Kf, 0.0d, false, 0, strM625r9, strM625r10, strM625r11, strM625r12, strM625r13, enumC0099CC2, false, 0, 2101248, 0));
            ArrayList arrayList3 = new ArrayList(listM4904n02.size() + listSingletonList.size());
            arrayList3.addAll(listSingletonList);
            arrayList3.addAll(listM4904n02);
            listM4904n0 = arrayList3;
        } else {
            if (iOrdinal != 1) {
                throw new C0232Fa();
            }
            List list2 = C0357IC.f1219b;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : list2) {
                if (((C0185EC) obj3).f567s == EnumC0099CC.f233a) {
                    arrayList4.add(obj3);
                }
            }
            listM4904n0 = AbstractC2453ra.m4904n0(arrayList4, new C0963Wb(i));
        }
        AbstractC0295Gu.m625r(-803420877355061L);
        AbstractC0295Gu.m625r(-801857509259317L);
        AbstractC0295Gu.m625r(-801926228736053L);
        listM4904n0.size();
        AbstractC0295Gu.m625r(-801960588474421L);
        C0357IC.f1218a.getClass();
        AbstractC0295Gu.m625r(-801745840109621L);
        AbstractC0295Gu.m625r(-801771609913397L);
        if (AbstractC2564tz.m5059T(str)) {
            arrayList = listM4904n0;
        } else {
            arrayList = new ArrayList();
            for (Object obj4 : listM4904n0) {
                C0185EC c0185ec2 = (C0185EC) obj4;
                if (AbstractC0585Nj.m1134a(c0185ec2.f549a, AbstractC0295Gu.m625r(-801801674684469L))) {
                    if (AbstractC2564tz.m5051L(str, AbstractC0295Gu.m625r(-802411560040501L), true) || AbstractC2564tz.m5051L(str, AbstractC0295Gu.m625r(-802424444942389L), true) || AbstractC2564tz.m5051L(str, AbstractC0295Gu.m625r(-802437329844277L), true) || AbstractC2564tz.m5051L(str, AbstractC0295Gu.m625r(-802445919778869L), true)) {
                        arrayList.add(obj4);
                    }
                } else if (AbstractC2564tz.m5051L(c0185ec2.f551c, str, true) || AbstractC2564tz.m5051L(c0185ec2.f552d, str, true) || AbstractC2564tz.m5051L(c0185ec2.f553e, str, true)) {
                    arrayList.add(obj4);
                }
            }
        }
        int iOrdinal2 = this.f2268o.ordinal();
        if (iOrdinal2 != 0) {
            int i2 = 12;
            if (iOrdinal2 != 1) {
                int i3 = 13;
                if (iOrdinal2 != 3) {
                    M4904n0 = arrayList;
                    if (iOrdinal2 == 4) {
                        M4904n0 = AbstractC2453ra.m4904n0(arrayList, new C0963Wb(i3));
                    }
                } else {
                    M4904n0 = AbstractC2453ra.m4904n0(arrayList, new C0060Ba(i, new InterfaceC1416fj[]{new C0556Mx(i2), new C0556Mx(i3)}));
                }
            } else {
                M4904n0 = AbstractC2453ra.m4904n0(arrayList, new C0963Wb(i2));
            }
        } else {
            M4904n0 = AbstractC2453ra.m4904n0(arrayList, new C0963Wb(11));
        }
        ?? r6 = M4904n0;
        if (this.f2264k == EnumC0142DC.f370b) {
            ArrayList arrayList5 = new ArrayList((Collection) M4904n0);
            AbstractC2711xa.m5283e0(arrayList5, new C0556Mx(14));
            Iterator it = listM4904n0.iterator();
            while (true) {
                obj = null;
                if (it.hasNext()) {
                    next = it.next();
                    if (AbstractC0585Nj.m1134a(((C0185EC) next).f549a, AbstractC0295Gu.m625r(-464273079793717L))) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C0185EC c0185ec3 = (C0185EC) next;
            Iterator it2 = listM4904n0.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (AbstractC0585Nj.m1134a(((C0185EC) next2).f549a, AbstractC0295Gu.m625r(-464333209335861L))) {
                    obj = next2;
                    break;
                }
            }
            C0185EC c0185ec4 = (C0185EC) obj;
            if (c0185ec3 != null) {
                arrayList5.add(0, c0185ec3);
                if (c0185ec4 != null && !AbstractC0585Nj.m1134a(c0185ec4.f549a, c0185ec3.f549a)) {
                    arrayList5.add(1, c0185ec4);
                }
            } else if (c0185ec4 != null) {
                arrayList5.add(0, c0185ec4);
            }
            r6 = arrayList5;
        }
        this.f2267n = r6;
        C1258ca c1258ca = this.f2260g;
        if (c1258ca != null) {
            AbstractC0295Gu.m625r(-487246859860021L);
            List list3 = c1258ca.f4264d;
            c1258ca.f4264d = r6;
            if (list3.isEmpty() || r6.isEmpty() || Math.abs(list3.size() - r6.size()) > 10) {
                c1258ca.notifyDataSetChanged();
            } else {
                c1258ca.notifyDataSetChanged();
            }
        }
        boolean zIsEmpty = this.f2267n.isEmpty();
        LinearLayout linearLayout = this.f2261h;
        if (linearLayout != null) {
            linearLayout.setVisibility(zIsEmpty ? 0 : 8);
        }
        RecyclerView recyclerView = this.f2259f;
        if (recyclerView != null) {
            recyclerView.setVisibility(zIsEmpty ? 8 : 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public final Activity m1432f() {
        LinearLayout linearLayout = this.f2254a;
        Context context = linearLayout != null ? linearLayout.getContext() : null;
        AbstractC0295Gu.m625r(-465673239132213L);
        return (Activity) context;
    }

    /* JADX INFO: renamed from: g */
    public final void m1433g(Activity activity) {
        AbstractC0295Gu.m625r(-466184340240437L);
        C1498hd c1498hd = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C1417fk(this, activity, null, 4), 3);
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
        AbstractC1160i linearLayoutManager;
        int iOrdinal = this.f2264k.ordinal();
        if (iOrdinal == 0) {
            this.f2259f.getContext();
            linearLayoutManager = new LinearLayoutManager(1);
        } else {
            if (iOrdinal != 1) {
                throw new C0232Fa();
            }
            this.f2259f.getContext();
            linearLayoutManager = new GridLayoutManager();
        }
        this.f2259f.setLayoutManager(linearLayoutManager);
    }

    /* JADX INFO: renamed from: j */
    public final void m1436j() {
        for (Map.Entry entry : this.f2265l.entrySet()) {
            EnumC0142DC enumC0142DC = (EnumC0142DC) entry.getKey();
            TextView textView = (TextView) entry.getValue();
            boolean z = enumC0142DC == this.f2264k;
            ViewParent parent = textView.getParent();
            AbstractC0295Gu.m625r(-465638879393845L);
            final LinearLayout linearLayout = (LinearLayout) parent;
            View childAt = linearLayout.getChildAt(0);
            AbstractC0295Gu.m625r(-465368296454197L);
            ImageView imageView = (ImageView) childAt;
            linearLayout.clearAnimation();
            linearLayout.animate().cancel();
            Context context = textView.getContext();
            int i = R.color.textSecondary;
            textView.setTextColor(context.getColor(z ? R.color.colorPrimary : R.color.textSecondary));
            Context context2 = imageView.getContext();
            if (z) {
                i = R.color.colorPrimary;
            }
            imageView.setColorFilter(context2.getColor(i));
            linearLayout.setBackground(null);
            final float f = z ? 1.05f : 1.0f;
            linearLayout.animate().scaleX(f).scaleY(f).setDuration(150L).setInterpolator(new DecelerateInterpolator()).withEndAction(new Runnable() { // from class: JC
                @Override // java.lang.Runnable
                public final void run() {
                    LinearLayout linearLayout2 = linearLayout;
                    float f2 = f;
                    linearLayout2.setScaleX(f2);
                    linearLayout2.setScaleY(f2);
                }
            }).start();
        }
    }
}
