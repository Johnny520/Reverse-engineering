package p000;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.OvershootInterpolator;
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
    public final ArrayList f4133c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f4134d;

    /* JADX INFO: renamed from: e */
    public int f4135e;

    /* JADX INFO: renamed from: f */
    public int f4136f;

    public C1206b8() {
        C0867U7 c0867u7 = ViewOnClickListenerC0996X7.f3170f;
        this.f4134d = AbstractC0295Gu.m619l();
        this.f4135e = -1;
        this.f4136f = -1;
    }

    /* JADX INFO: renamed from: a */
    public static List m2325a() {
        return AbstractC2496sa.m4977b0(AbstractC0295Gu.m625r(-89335319754805L), AbstractC0295Gu.m625r(-89893665503285L), AbstractC0295Gu.m625r(-89902255437877L), AbstractC0295Gu.m625r(-89910845372469L), AbstractC0295Gu.m625r(-89919435307061L), AbstractC0295Gu.m625r(-89928025241653L), AbstractC0295Gu.m625r(-89936615176245L), AbstractC0295Gu.m625r(-89945205110837L), AbstractC0295Gu.m625r(-89953795045429L));
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-90147068573749L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity activity, int i, int i2, Intent intent) {
        AbstractC0295Gu.m625r(-89635967465525L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity activity) {
        AbstractC0295Gu.m625r(-89550068119605L);
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setBackgroundColor(activity.getColor(R.color.colorBackground));
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setOverScrollMode(2);
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f4131a = scrollView;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        ScrollView scrollView2 = this.f4131a;
        ScrollView scrollView3 = scrollView2;
        if (scrollView2 == null) {
            AbstractC0295Gu.m625r(-89588722825269L);
            scrollView3 = null;
        }
        scrollView3.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = AbstractC0295Gu.m616i(12);
        linearLayout2.setLayoutParams(layoutParams);
        TextView textView = new TextView(activity);
        AbstractC0213Ey.m414l(-89073326749749L, textView, 13.0f);
        textView.setTextColor(activity.getColor(R.color.textSummary));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        textView.setLayoutParams(layoutParams2);
        linearLayout2.addView(textView);
        int color = activity.getColor(R.color.colorPrimary);
        TextView textView2 = new TextView(activity);
        textView2.setText(AbstractC0295Gu.m625r(-89111981455413L));
        textView2.setTextSize(13.0f);
        textView2.setTextColor(color);
        textView2.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(6), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(6));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.argb(26, Color.red(color), Color.green(color), Color.blue(color)));
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(14));
        textView2.setBackground(gradientDrawable);
        textView2.setOnClickListener(new ViewOnClickListenerC2176l5(1, this, activity));
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(1);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(activity.getColor(R.color.cardBackground));
        gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(12));
        gradientDrawable2.setStroke(AbstractC0295Gu.m616i(1), activity.getColor(R.color.cardStroke));
        linearLayout3.setBackground(gradientDrawable2);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout3.setClipToOutline(true);
        linearLayout.addView(linearLayout3);
        LinearLayout linearLayout4 = new LinearLayout(activity);
        linearLayout4.setOrientation(1);
        this.f4132b = linearLayout4;
        linearLayout3.addView(linearLayout4);
        m2326e(activity);
    }

    /* JADX INFO: renamed from: e */
    public final void m2326e(Activity activity) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f4133c;
        arrayList2.clear();
        LinearLayout linearLayout = this.f4132b;
        if (linearLayout == null) {
            AbstractC0295Gu.m625r(-89197880801333L);
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        String string = AbstractC0599Nx.f1939a.getString(AbstractC0295Gu.m625r(-839416998262837L), AbstractC0295Gu.m625r(-838935961925685L));
        int length = string.length();
        ArrayList arrayList3 = this.f4134d;
        if (length == 0) {
            C0286Gl c0286GlM4975Z = AbstractC2496sa.m4975Z(arrayList3);
            arrayList = new ArrayList(AbstractC2539ta.m5019d0(c0286GlM4975Z, 10));
            Iterator it = c0286GlM4975Z.iterator();
            while (true) {
                C0200El c0200El = (C0200El) it;
                if (!c0200El.f605c) {
                    break;
                } else {
                    arrayList.add(String.valueOf(c0200El.nextInt()));
                }
            }
        } else {
            List listM5065Z = AbstractC2564tz.m5065Z(string, new String[]{AbstractC0295Gu.m625r(-89326729820213L)}, 6);
            arrayList = new ArrayList();
            for (Object obj : listM5065Z) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
        }
        List<String> listM2325a = arrayList.isEmpty() ? m2325a() : arrayList;
        List listM4908r0 = AbstractC2453ra.m4908r0(AbstractC2496sa.m4975Z(arrayList3));
        ArrayList arrayList4 = new ArrayList();
        for (String str : listM2325a) {
            if (listM4908r0.contains(Integer.valueOf(Integer.parseInt(str))) && !arrayList4.contains(str)) {
                arrayList4.add(str);
            }
        }
        Iterator it2 = listM4908r0.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            if (!arrayList4.contains(String.valueOf(iIntValue))) {
                arrayList4.add(String.valueOf(iIntValue));
            }
        }
        int size = arrayList4.size();
        for (int i = 0; i < size; i++) {
            int i2 = Integer.parseInt((String) arrayList4.get(i));
            C2629ve c2629ve = new C2629ve(activity);
            c2629ve.setTitle(((C0867U7) arrayList3.get(i2)).f2737a);
            c2629ve.setChecked(arrayList.contains(String.valueOf(i2)));
            c2629ve.setTag(Integer.valueOf(i2));
            final int i3 = 0;
            c2629ve.setOnCheckedChangeListener(new InterfaceC1416fj(this) { // from class: Y7

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1206b8 f3317b;

                {
                    this.f3317b = this;
                }

                @Override // p000.InterfaceC1416fj
                /* JADX INFO: renamed from: g */
                public final Object mo90g(Object obj2) {
                    switch (i3) {
                        case 0:
                            ((Boolean) obj2).booleanValue();
                            this.f3317b.m2327f();
                            break;
                        case 1:
                            C2629ve c2629ve2 = (C2629ve) obj2;
                            AbstractC0295Gu.m625r(-89743341647925L);
                            C1206b8 c1206b8 = this.f3317b;
                            c1206b8.getClass();
                            ArrayList<C2629ve> arrayList5 = c1206b8.f4133c;
                            int iIndexOf = arrayList5.indexOf(c2629ve2);
                            c1206b8.f4135e = iIndexOf;
                            c1206b8.f4136f = iIndexOf;
                            for (C2629ve c2629ve3 : arrayList5) {
                                if (AbstractC0585Nj.m1134a(c2629ve3, c2629ve2)) {
                                    c2629ve3.animate().scaleX(1.02f).scaleY(1.02f).setDuration(150L).start();
                                } else {
                                    c2629ve3.animate().alpha(0.5f).setDuration(150L).start();
                                }
                            }
                            break;
                        default:
                            C2629ve c2629ve4 = (C2629ve) obj2;
                            AbstractC0295Gu.m625r(-89846420863029L);
                            final C1206b8 c1206b82 = this.f3317b;
                            final int i4 = c1206b82.f4135e;
                            final int i5 = c1206b82.f4136f;
                            c2629ve4.animate().translationY((i5 - i4) * AbstractC0295Gu.m616i(50)).scaleX(1.0f).scaleY(1.0f).setDuration(280L).setInterpolator(new OvershootInterpolator(0.8f)).withEndAction(new Runnable() { // from class: a8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i6 = i4;
                                    int i7 = i5;
                                    C1206b8 c1206b83 = c1206b82;
                                    if (i6 != i7) {
                                        ArrayList arrayList6 = c1206b83.f4133c;
                                        if (i6 != i7) {
                                            Object obj3 = arrayList6.get(i6);
                                            AbstractC0295Gu.m625r(-89962384980021L);
                                            C2629ve c2629ve5 = (C2629ve) obj3;
                                            arrayList6.remove(i6);
                                            LinearLayout linearLayout2 = c1206b83.f4132b;
                                            LinearLayout linearLayout3 = null;
                                            if (linearLayout2 == null) {
                                                AbstractC0295Gu.m625r(-90001039685685L);
                                                linearLayout2 = null;
                                            }
                                            linearLayout2.removeViewAt(i6);
                                            arrayList6.add(i7, c2629ve5);
                                            LinearLayout linearLayout4 = c1206b83.f4132b;
                                            if (linearLayout4 == null) {
                                                AbstractC0295Gu.m625r(-90065464195125L);
                                            } else {
                                                linearLayout3 = linearLayout4;
                                            }
                                            linearLayout3.addView(c2629ve5, i7);
                                        }
                                    }
                                    for (C2629ve c2629ve6 : c1206b83.f4133c) {
                                        c2629ve6.setTranslationY(0.0f);
                                        c2629ve6.setAlpha(1.0f);
                                        c2629ve6.setScaleX(1.0f);
                                        c2629ve6.setScaleY(1.0f);
                                        c2629ve6.setDragging(false);
                                    }
                                    c1206b83.f4135e = -1;
                                    c1206b83.f4136f = -1;
                                    c1206b83.m2327f();
                                }
                            }).start();
                            for (C2629ve c2629ve5 : c1206b82.f4133c) {
                                if (!AbstractC0585Nj.m1134a(c2629ve5, c2629ve4)) {
                                    c2629ve5.animate().alpha(1.0f).setDuration(200L).start();
                                }
                            }
                            break;
                    }
                    return C0829TC.f2620a;
                }
            });
            final int i4 = 1;
            c2629ve.setOnDragStartListener(new InterfaceC1416fj(this) { // from class: Y7

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1206b8 f3317b;

                {
                    this.f3317b = this;
                }

                @Override // p000.InterfaceC1416fj
                /* JADX INFO: renamed from: g */
                public final Object mo90g(Object obj2) {
                    switch (i4) {
                        case 0:
                            ((Boolean) obj2).booleanValue();
                            this.f3317b.m2327f();
                            break;
                        case 1:
                            C2629ve c2629ve2 = (C2629ve) obj2;
                            AbstractC0295Gu.m625r(-89743341647925L);
                            C1206b8 c1206b8 = this.f3317b;
                            c1206b8.getClass();
                            ArrayList<C2629ve> arrayList5 = c1206b8.f4133c;
                            int iIndexOf = arrayList5.indexOf(c2629ve2);
                            c1206b8.f4135e = iIndexOf;
                            c1206b8.f4136f = iIndexOf;
                            for (C2629ve c2629ve3 : arrayList5) {
                                if (AbstractC0585Nj.m1134a(c2629ve3, c2629ve2)) {
                                    c2629ve3.animate().scaleX(1.02f).scaleY(1.02f).setDuration(150L).start();
                                } else {
                                    c2629ve3.animate().alpha(0.5f).setDuration(150L).start();
                                }
                            }
                            break;
                        default:
                            C2629ve c2629ve4 = (C2629ve) obj2;
                            AbstractC0295Gu.m625r(-89846420863029L);
                            final C1206b8 c1206b82 = this.f3317b;
                            final int i42 = c1206b82.f4135e;
                            final int i5 = c1206b82.f4136f;
                            c2629ve4.animate().translationY((i5 - i42) * AbstractC0295Gu.m616i(50)).scaleX(1.0f).scaleY(1.0f).setDuration(280L).setInterpolator(new OvershootInterpolator(0.8f)).withEndAction(new Runnable() { // from class: a8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i6 = i42;
                                    int i7 = i5;
                                    C1206b8 c1206b83 = c1206b82;
                                    if (i6 != i7) {
                                        ArrayList arrayList6 = c1206b83.f4133c;
                                        if (i6 != i7) {
                                            Object obj3 = arrayList6.get(i6);
                                            AbstractC0295Gu.m625r(-89962384980021L);
                                            C2629ve c2629ve5 = (C2629ve) obj3;
                                            arrayList6.remove(i6);
                                            LinearLayout linearLayout2 = c1206b83.f4132b;
                                            LinearLayout linearLayout3 = null;
                                            if (linearLayout2 == null) {
                                                AbstractC0295Gu.m625r(-90001039685685L);
                                                linearLayout2 = null;
                                            }
                                            linearLayout2.removeViewAt(i6);
                                            arrayList6.add(i7, c2629ve5);
                                            LinearLayout linearLayout4 = c1206b83.f4132b;
                                            if (linearLayout4 == null) {
                                                AbstractC0295Gu.m625r(-90065464195125L);
                                            } else {
                                                linearLayout3 = linearLayout4;
                                            }
                                            linearLayout3.addView(c2629ve5, i7);
                                        }
                                    }
                                    for (C2629ve c2629ve6 : c1206b83.f4133c) {
                                        c2629ve6.setTranslationY(0.0f);
                                        c2629ve6.setAlpha(1.0f);
                                        c2629ve6.setScaleX(1.0f);
                                        c2629ve6.setScaleY(1.0f);
                                        c2629ve6.setDragging(false);
                                    }
                                    c1206b83.f4135e = -1;
                                    c1206b83.f4136f = -1;
                                    c1206b83.m2327f();
                                }
                            }).start();
                            for (C2629ve c2629ve5 : c1206b82.f4133c) {
                                if (!AbstractC0585Nj.m1134a(c2629ve5, c2629ve4)) {
                                    c2629ve5.animate().alpha(1.0f).setDuration(200L).start();
                                }
                            }
                            break;
                    }
                    return C0829TC.f2620a;
                }
            });
            c2629ve.setOnDragMoveListener(new C1082Z7(0, this));
            final int i5 = 2;
            c2629ve.setOnDragEndListener(new InterfaceC1416fj(this) { // from class: Y7

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1206b8 f3317b;

                {
                    this.f3317b = this;
                }

                @Override // p000.InterfaceC1416fj
                /* JADX INFO: renamed from: g */
                public final Object mo90g(Object obj2) {
                    switch (i5) {
                        case 0:
                            ((Boolean) obj2).booleanValue();
                            this.f3317b.m2327f();
                            break;
                        case 1:
                            C2629ve c2629ve2 = (C2629ve) obj2;
                            AbstractC0295Gu.m625r(-89743341647925L);
                            C1206b8 c1206b8 = this.f3317b;
                            c1206b8.getClass();
                            ArrayList<C2629ve> arrayList5 = c1206b8.f4133c;
                            int iIndexOf = arrayList5.indexOf(c2629ve2);
                            c1206b8.f4135e = iIndexOf;
                            c1206b8.f4136f = iIndexOf;
                            for (C2629ve c2629ve3 : arrayList5) {
                                if (AbstractC0585Nj.m1134a(c2629ve3, c2629ve2)) {
                                    c2629ve3.animate().scaleX(1.02f).scaleY(1.02f).setDuration(150L).start();
                                } else {
                                    c2629ve3.animate().alpha(0.5f).setDuration(150L).start();
                                }
                            }
                            break;
                        default:
                            C2629ve c2629ve4 = (C2629ve) obj2;
                            AbstractC0295Gu.m625r(-89846420863029L);
                            final C1206b8 c1206b82 = this.f3317b;
                            final int i42 = c1206b82.f4135e;
                            final int i52 = c1206b82.f4136f;
                            c2629ve4.animate().translationY((i52 - i42) * AbstractC0295Gu.m616i(50)).scaleX(1.0f).scaleY(1.0f).setDuration(280L).setInterpolator(new OvershootInterpolator(0.8f)).withEndAction(new Runnable() { // from class: a8
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i6 = i42;
                                    int i7 = i52;
                                    C1206b8 c1206b83 = c1206b82;
                                    if (i6 != i7) {
                                        ArrayList arrayList6 = c1206b83.f4133c;
                                        if (i6 != i7) {
                                            Object obj3 = arrayList6.get(i6);
                                            AbstractC0295Gu.m625r(-89962384980021L);
                                            C2629ve c2629ve5 = (C2629ve) obj3;
                                            arrayList6.remove(i6);
                                            LinearLayout linearLayout2 = c1206b83.f4132b;
                                            LinearLayout linearLayout3 = null;
                                            if (linearLayout2 == null) {
                                                AbstractC0295Gu.m625r(-90001039685685L);
                                                linearLayout2 = null;
                                            }
                                            linearLayout2.removeViewAt(i6);
                                            arrayList6.add(i7, c2629ve5);
                                            LinearLayout linearLayout4 = c1206b83.f4132b;
                                            if (linearLayout4 == null) {
                                                AbstractC0295Gu.m625r(-90065464195125L);
                                            } else {
                                                linearLayout3 = linearLayout4;
                                            }
                                            linearLayout3.addView(c2629ve5, i7);
                                        }
                                    }
                                    for (C2629ve c2629ve6 : c1206b83.f4133c) {
                                        c2629ve6.setTranslationY(0.0f);
                                        c2629ve6.setAlpha(1.0f);
                                        c2629ve6.setScaleX(1.0f);
                                        c2629ve6.setScaleY(1.0f);
                                        c2629ve6.setDragging(false);
                                    }
                                    c1206b83.f4135e = -1;
                                    c1206b83.f4136f = -1;
                                    c1206b83.m2327f();
                                }
                            }).start();
                            for (C2629ve c2629ve5 : c1206b82.f4133c) {
                                if (!AbstractC0585Nj.m1134a(c2629ve5, c2629ve4)) {
                                    c2629ve5.animate().alpha(1.0f).setDuration(200L).start();
                                }
                            }
                            break;
                    }
                    return C0829TC.f2620a;
                }
            });
            arrayList2.add(c2629ve);
            LinearLayout linearLayout2 = this.f4132b;
            if (linearLayout2 == null) {
                AbstractC0295Gu.m625r(-89262305310773L);
                linearLayout2 = null;
            }
            linearLayout2.addView(c2629ve);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2327f() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f4133c) {
            C1030Xz c1030Xz = ((C2629ve) obj).f9122a;
            if (c1030Xz != null ? c1030Xz.f3294a : false) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC2539ta.m5019d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C2629ve) it.next()).getTag().toString());
        }
        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1175d(AbstractC2453ra.m4901k0(arrayList2, AbstractC0295Gu.m625r(-90129888704565L), null, null, null, 62));
        ViewOnClickListenerC0996X7 viewOnClickListenerC0996X7 = AbstractC0828TB.f2613e;
        if (viewOnClickListenerC0996X7 != null) {
            viewOnClickListenerC0996X7.m1890c();
        }
    }

    @Override // p000.InterfaceC0972Wk
    public final View getContentView() {
        ScrollView scrollView = this.f4131a;
        if (scrollView != null) {
            return scrollView;
        }
        AbstractC0295Gu.m625r(-89674622171189L);
        return null;
    }

    @Override // p000.InterfaceC0972Wk
    public final String getTitle() {
        return AbstractC0295Gu.m625r(-89708981909557L);
    }
}
