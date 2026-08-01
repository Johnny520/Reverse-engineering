package p088s0;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.LruCache;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p055lu.wxmask.bean.MaskItemBean;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.C0033f;
import p001A0.RunnableC0040m;
import p001A0.RunnableC0045r;
import p003B0.AbstractC0055a;
import p011F0.AbstractC0123k;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p069i.C0709q1;
import p069i.C0716t;
import p079n0.AbstractC0774b;
import p079n0.C0773a;
import p086r0.ViewOnClickListenerC0837F1;
import p086r0.ViewOnClickListenerC0948v0;
import p086r0.ViewOnLongClickListenerC0888b0;
import p102z0.AbstractC1126i;
import p102z0.AbstractC1129l;
import p102z0.C1124g;

/* JADX INFO: renamed from: s0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0985g extends AbstractC0774b {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f3525c = 0;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3526d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0985g(C0716t c0716t) {
        String str;
        String str2;
        this.f3526d = c0716t;
        c0716t.getClass();
        boolean z2 = AbstractC1126i.f3786a;
        Map mapM2431g = C1124g.m2431g();
        Map mapM2430f = C1124g.m2430f();
        List listM276r0 = AbstractC0123k.m276r0(AbstractC0123k.m281w0(C1124g.m2432h()), new C0033f(20, new C0033f(19, c0716t)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = listM276r0.iterator();
        while (true) {
            String str3 = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str4 = (String) next;
            String str5 = (String) mapM2430f.get(str4);
            str5 = (str5 == null || AbstractC0307q.m534d0(str5)) ? null : str5;
            String str6 = (String) mapM2431g.get(str4);
            if (str6 != null && !AbstractC0307q.m534d0(str6) && !C0716t.m1356m(str6)) {
                str3 = str6;
            }
            if (str5 != null) {
                str4 = str5;
            } else if (str3 != null) {
                str4 = str3;
            }
            Object arrayList = linkedHashMap.get(str4);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str4, arrayList);
            }
            ((List) arrayList).add(next);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            List list = (List) ((Map.Entry) it2.next()).getValue();
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    str = null;
                    break;
                }
                str = (String) mapM2431g.get((String) it3.next());
                if (str == null || AbstractC0307q.m534d0(str) || C0716t.m1356m(str)) {
                    str = null;
                }
                if (str != null) {
                    break;
                }
            }
            String str7 = "";
            str = str == null ? "" : str;
            Iterator it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    str2 = null;
                    break;
                }
                str2 = (String) mapM2430f.get((String) it4.next());
                if (str2 == null || AbstractC0307q.m534d0(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    break;
                }
            }
            if (str2 != null) {
                str7 = str2;
            }
            arrayList2.add(new C0993o(str, str7, list));
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2596b;
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p079n0.AbstractC0774b
    /* JADX INFO: renamed from: a */
    public final void mo1429a(C0773a c0773a, int i2, ViewGroup viewGroup) {
        int i3;
        int iArgb;
        int i4 = -15292005;
        Object obj = this.f3526d;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2596b;
        switch (this.f3525c) {
            case 0:
                MaskItemBean maskItemBean = (MaskItemBean) copyOnWriteArrayList.get(i2);
                if (c0773a instanceof C0983e) {
                    String tagName = maskItemBean.getTagName();
                    if (AbstractC0307q.m534d0(tagName)) {
                        tagName = maskItemBean.getMaskId();
                    }
                    C0709q1 c0709q1 = (C0709q1) obj;
                    c0709q1.getClass();
                    boolean zM534d0 = AbstractC0307q.m534d0(maskItemBean.getTagName());
                    ExecutorService executorService = (ExecutorService) c0709q1.f2399e;
                    AtomicBoolean atomicBoolean = (AtomicBoolean) c0709q1.f2401g;
                    if ((zM534d0 || AbstractC0307q.m534d0(maskItemBean.getAvatarUrl())) && !atomicBoolean.get()) {
                        executorService.execute(new RunnableC0040m(maskItemBean, c0709q1, 11));
                    }
                    C0983e c0983e = (C0983e) c0773a;
                    LruCache lruCache = AbstractC1129l.f3803a;
                    String strM2454d = AbstractC1129l.m2454d(maskItemBean.getMaskId());
                    if (strM2454d == null) {
                        strM2454d = AbstractC0299i.m507C0(maskItemBean.getAvatarUrl()).toString();
                    }
                    FrameLayout frameLayout = c0983e.f3519c;
                    frameLayout.setTag(strM2454d);
                    int i5 = i2 % 2;
                    Activity activity = (Activity) c0709q1.f2396b;
                    if (i5 == 0) {
                        AbstractC0503h.m974J(activity);
                    } else {
                        AbstractC0503h.m974J(activity);
                        i4 = -12812566;
                    }
                    frameLayout.setBackground(C0709q1.m1343b(c0709q1, i4, AbstractC0055a.m101b(8)));
                    String strM506B0 = AbstractC0299i.m506B0(1, tagName);
                    if (AbstractC0307q.m534d0(strM506B0)) {
                        strM506B0 = "友";
                    }
                    TextView textView = c0983e.f3521e;
                    textView.setText(strM506B0);
                    textView.setVisibility(0);
                    ImageView imageView = c0983e.f3520d;
                    imageView.setVisibility(8);
                    if (!AbstractC0307q.m534d0(strM2454d)) {
                        Bitmap bitmap = (Bitmap) ((C0984f) c0709q1.f2400f).get(strM2454d);
                        if (bitmap != null) {
                            imageView.setImageBitmap(bitmap);
                            imageView.setVisibility(0);
                            textView.setVisibility(8);
                        } else if (!atomicBoolean.get()) {
                            executorService.execute(new RunnableC0045r(c0709q1, strM2454d, c0983e, 13));
                        }
                    }
                    c0983e.f3522f.setText(tagName);
                    c0983e.f3523g.setText(AbstractC0174d.m352h("微信ID：", maskItemBean.getMaskId()));
                }
                break;
            case 1:
                C0987i c0987i = (C0987i) copyOnWriteArrayList.get(i2);
                if (c0773a instanceof C0988j) {
                    String str = c0987i.f3531a;
                    C0990l c0990l = (C0990l) obj;
                    c0990l.getClass();
                    boolean zM2194f = C0990l.m2194f(str);
                    C0988j c0988j = (C0988j) c0773a;
                    String str2 = c0987i.f3532b;
                    String strM506B02 = AbstractC0299i.m506B0(1, str2);
                    if (AbstractC0307q.m534d0(strM506B02)) {
                        strM506B02 = "#";
                    }
                    TextView textView2 = c0988j.f3542e;
                    textView2.setText(strM506B02);
                    LruCache lruCache2 = AbstractC1129l.f3803a;
                    String str3 = c0987i.f3531a;
                    String strM2454d2 = AbstractC1129l.m2454d(str3);
                    if (strM2454d2 == null) {
                        strM2454d2 = AbstractC0299i.m507C0(c0987i.f3539i).toString();
                    }
                    c0988j.f3540c.setTag(strM2454d2);
                    textView2.setVisibility(0);
                    ImageView imageView2 = c0988j.f3541d;
                    imageView2.setVisibility(8);
                    if (!AbstractC0307q.m534d0(strM2454d2)) {
                        Bitmap bitmap2 = (Bitmap) c0990l.f3554g.get(strM2454d2);
                        if (bitmap2 != null) {
                            imageView2.setImageBitmap(bitmap2);
                            imageView2.setVisibility(0);
                            textView2.setVisibility(8);
                        } else if (!c0990l.f3555h.get()) {
                            c0990l.f3553f.execute(new RunnableC0045r(c0990l, strM2454d2, c0988j, 14));
                        }
                    }
                    c0988j.f3543f.setText(str2);
                    String strM352h = c0987i.f3533c;
                    if (zM2194f) {
                        strM352h = AbstractC0174d.m352h("已设置本地头像 · ", strM352h);
                    }
                    c0988j.f3544g.setText(strM352h);
                    boolean zContainsKey = c0990l.f3550c.containsKey(str3);
                    String str4 = zContainsKey ? "已添加" : "添加";
                    TextView textView3 = c0988j.f3545h;
                    textView3.setText(str4);
                    if (c0990l.f3561n != null) {
                        textView3.setText(zM2194f ? "管理" : c0990l.f3549b);
                    }
                    Activity activity2 = c0990l.f3548a;
                    if (zContainsKey && c0990l.f3561n == null) {
                        i3 = AbstractC0503h.m974J(activity2).f3504g;
                    } else {
                        AbstractC0503h.m974J(activity2);
                        i3 = -15292005;
                    }
                    textView3.setTextColor(i3);
                    if (zContainsKey && c0990l.f3561n == null) {
                        iArgb = AbstractC0503h.m974J(c0990l.f3548a).f3502e;
                    } else {
                        AbstractC0503h.m974J(c0990l.f3548a);
                        iArgb = Color.argb(30, Color.red(-15292005), Color.green(-15292005), Color.blue(-15292005));
                    }
                    textView3.setBackground(C0990l.m2195g(c0990l, iArgb, AbstractC0055a.m101b(18), null));
                    textView3.setOnClickListener(new ViewOnClickListenerC0837F1(c0990l, c0987i, 3));
                }
                break;
            default:
                C0993o c0993o = (C0993o) copyOnWriteArrayList.get(i2);
                if (c0773a instanceof C0994p) {
                    C0994p c0994p = (C0994p) c0773a;
                    C0716t c0716t = (C0716t) obj;
                    if (i2 % 2 == 0) {
                        AbstractC0503h.m974J((Activity) c0716t.f2417a);
                        i4 = -2466443;
                    } else {
                        AbstractC0503h.m974J((Activity) c0716t.f2417a);
                    }
                    GradientDrawable gradientDrawableM1357o = C0716t.m1357o(c0716t, i4, AbstractC0055a.m101b(8), null, 8);
                    TextView textView4 = c0994p.f3571c;
                    textView4.setBackground(gradientDrawableM1357o);
                    String str5 = c0993o.f3569b;
                    if (AbstractC0307q.m534d0(str5)) {
                        str5 = "无文字内容";
                    }
                    c0994p.f3573e.setText(str5);
                    String str6 = c0993o.f3570c;
                    c0994p.f3574f.setText(!AbstractC0307q.m534d0(str6) ? "点击查看大图，长按可恢复" : "长按可恢复");
                    if (AbstractC0307q.m534d0(str6)) {
                        str6 = null;
                    }
                    File file = str6 != null ? new File(str6) : null;
                    ImageView imageView3 = c0994p.f3572d;
                    if (file != null && file.exists()) {
                        imageView3.setImageBitmap(BitmapFactory.decodeFile(file.getAbsolutePath()));
                        imageView3.setVisibility(0);
                        textView4.setVisibility(8);
                    } else {
                        imageView3.setImageDrawable(null);
                        imageView3.setVisibility(8);
                        textView4.setVisibility(0);
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p079n0.AbstractC0774b
    /* JADX INFO: renamed from: b */
    public final C0773a mo1430b(ViewGroup viewGroup) {
        switch (this.f3525c) {
            case 0:
                C0709q1 c0709q1 = (C0709q1) this.f3526d;
                FrameLayout frameLayout = new FrameLayout((Activity) c0709q1.f2396b);
                frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                frameLayout.setMinimumHeight(AbstractC0055a.m101b(88));
                frameLayout.setPadding(AbstractC0055a.m101b(24), AbstractC0055a.m101b(12), AbstractC0055a.m101b(24), AbstractC0055a.m101b(12));
                Activity activity = (Activity) c0709q1.f2396b;
                frameLayout.setBackgroundColor(AbstractC0503h.m974J(activity).f3501d);
                GradientDrawable gradientDrawable = new GradientDrawable();
                float f = 0;
                gradientDrawable.setCornerRadius(f);
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(0);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(ColorStateList.valueOf(-1));
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(f);
                Drawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(866822826), gradientDrawable, gradientDrawable2);
                frameLayout.setClickable(true);
                frameLayout.setBackground(rippleDrawable);
                FrameLayout frameLayout2 = new FrameLayout(activity);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC0055a.m101b(46), AbstractC0055a.m101b(46));
                layoutParams.gravity = 8388627;
                frameLayout2.setLayoutParams(layoutParams);
                ImageView imageView = new ImageView(frameLayout2.getContext());
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setVisibility(8);
                frameLayout2.addView(imageView);
                TextView textView = new TextView(frameLayout2.getContext());
                textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                textView.setGravity(17);
                textView.setTextColor(-1);
                Typeface typeface = Typeface.DEFAULT_BOLD;
                textView.setTypeface(typeface);
                textView.setTextSize(2, 18.0f);
                frameLayout2.addView(textView);
                frameLayout.addView(frameLayout2);
                LinearLayout linearLayout = new LinearLayout(activity);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams2.gravity = 16;
                layoutParams2.setMarginStart(AbstractC0055a.m101b(62));
                layoutParams2.setMarginEnd(AbstractC0055a.m101b(72));
                linearLayout.setLayoutParams(layoutParams2);
                linearLayout.setOrientation(1);
                TextView textView2 = new TextView(linearLayout.getContext());
                textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                textView2.setTextColor(AbstractC0503h.m974J(activity).f3503f);
                textView2.setTextSize(2, 12.5f);
                linearLayout.addView(textView2);
                TextView textView3 = new TextView(linearLayout.getContext());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams3.topMargin = AbstractC0055a.m101b(4);
                textView3.setLayoutParams(layoutParams3);
                textView3.setTextColor(AbstractC0503h.m974J(activity).f3504g);
                textView3.setTextSize(2, 9.5f);
                linearLayout.addView(textView3);
                frameLayout.addView(linearLayout);
                LinearLayout linearLayout2 = new LinearLayout(activity);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams4.gravity = 8388629;
                linearLayout2.setLayoutParams(layoutParams4);
                linearLayout2.setOrientation(0);
                linearLayout2.setGravity(17);
                C0977K c0977kM974J = AbstractC0503h.m974J(activity);
                TextView textView4 = new TextView(activity);
                textView4.setText("移除");
                textView4.setTypeface(typeface);
                textView4.setTextColor(c0977kM974J.f3504g);
                textView4.setTextSize(2, 13.0f);
                textView4.setPadding(AbstractC0055a.m101b(10), AbstractC0055a.m101b(7), AbstractC0055a.m101b(10), AbstractC0055a.m101b(7));
                textView4.setBackground(C0709q1.m1343b(c0709q1, AbstractC0503h.m974J(activity).f3502e, AbstractC0055a.m101b(16)));
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams5.setMarginStart(AbstractC0055a.m101b(6));
                textView4.setLayoutParams(layoutParams5);
                textView4.setOnClickListener(new ViewOnClickListenerC0837F1(c0709q1, frameLayout, 1));
                linearLayout2.addView(textView4);
                frameLayout.addView(linearLayout2);
                C0983e c0983e = new C0983e(frameLayout, frameLayout2, imageView, textView, textView2, textView3);
                int i2 = 2;
                frameLayout.setOnClickListener(new ViewOnClickListenerC0837F1(c0983e, c0709q1, i2));
                frameLayout.setOnLongClickListener(new ViewOnLongClickListenerC0888b0(c0709q1, c0983e, i2));
                return c0983e;
            case 1:
                C0990l c0990l = (C0990l) this.f3526d;
                FrameLayout frameLayout3 = new FrameLayout(c0990l.f3548a);
                frameLayout3.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                frameLayout3.setMinimumHeight(AbstractC0055a.m101b(76));
                frameLayout3.setPadding(AbstractC0055a.m101b(24), AbstractC0055a.m101b(10), AbstractC0055a.m101b(24), AbstractC0055a.m101b(10));
                Activity activity2 = c0990l.f3548a;
                frameLayout3.setBackgroundColor(AbstractC0503h.m974J(activity2).f3501d);
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                float f2 = 0;
                gradientDrawable3.setCornerRadius(f2);
                gradientDrawable3.setShape(0);
                gradientDrawable3.setColor(0);
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setColor(ColorStateList.valueOf(-1));
                gradientDrawable4.setShape(0);
                gradientDrawable4.setCornerRadius(f2);
                Drawable rippleDrawable2 = new RippleDrawable(ColorStateList.valueOf(866822826), gradientDrawable3, gradientDrawable4);
                frameLayout3.setClickable(true);
                frameLayout3.setBackground(rippleDrawable2);
                FrameLayout frameLayout4 = new FrameLayout(frameLayout3.getContext());
                FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(AbstractC0055a.m101b(42), AbstractC0055a.m101b(42));
                layoutParams6.gravity = 8388627;
                frameLayout4.setLayoutParams(layoutParams6);
                AbstractC0503h.m974J(activity2);
                frameLayout4.setBackground(C0990l.m2195g(c0990l, -15292005, AbstractC0055a.m101b(8), null));
                ImageView imageView2 = new ImageView(frameLayout4.getContext());
                imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView2.setVisibility(8);
                frameLayout4.addView(imageView2);
                TextView textView5 = new TextView(frameLayout4.getContext());
                textView5.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                textView5.setGravity(17);
                textView5.setTextColor(-1);
                Typeface typeface2 = Typeface.DEFAULT_BOLD;
                textView5.setTypeface(typeface2);
                textView5.setTextSize(2, 17.0f);
                frameLayout4.addView(textView5);
                frameLayout3.addView(frameLayout4);
                LinearLayout linearLayout3 = new LinearLayout(frameLayout3.getContext());
                FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams7.gravity = 16;
                layoutParams7.setMarginStart(AbstractC0055a.m101b(58));
                layoutParams7.setMarginEnd(AbstractC0055a.m101b(82));
                linearLayout3.setLayoutParams(layoutParams7);
                linearLayout3.setOrientation(1);
                TextView textView6 = new TextView(linearLayout3.getContext());
                textView6.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                textView6.setSingleLine(true);
                textView6.setTextColor(AbstractC0503h.m974J(activity2).f3503f);
                textView6.setTextSize(2, 14.0f);
                linearLayout3.addView(textView6);
                TextView textView7 = new TextView(linearLayout3.getContext());
                LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams8.topMargin = AbstractC0055a.m101b(4);
                textView7.setLayoutParams(layoutParams8);
                textView7.setSingleLine(true);
                textView7.setTextColor(AbstractC0503h.m974J(activity2).f3504g);
                textView7.setTextSize(2, 10.0f);
                linearLayout3.addView(textView7);
                frameLayout3.addView(linearLayout3);
                TextView textView8 = new TextView(frameLayout3.getContext());
                FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(AbstractC0055a.m101b(72), AbstractC0055a.m101b(36));
                layoutParams9.gravity = 8388629;
                textView8.setLayoutParams(layoutParams9);
                textView8.setGravity(17);
                textView8.setTypeface(typeface2);
                textView8.setTextSize(2, 14.0f);
                frameLayout3.addView(textView8);
                C0988j c0988j = new C0988j(frameLayout3, frameLayout4, imageView2, textView5, textView6, textView7, textView8);
                frameLayout3.setOnClickListener(new ViewOnClickListenerC0948v0(c0990l, this, c0988j, 2));
                return c0988j;
            default:
                C0716t c0716t = (C0716t) this.f3526d;
                FrameLayout frameLayout5 = new FrameLayout((Activity) c0716t.f2417a);
                frameLayout5.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                frameLayout5.setMinimumHeight(AbstractC0055a.m101b(118));
                frameLayout5.setPadding(AbstractC0055a.m101b(24), AbstractC0055a.m101b(12), AbstractC0055a.m101b(24), AbstractC0055a.m101b(12));
                Activity activity3 = (Activity) c0716t.f2417a;
                frameLayout5.setBackgroundColor(AbstractC0503h.m974J(activity3).f3501d);
                GradientDrawable gradientDrawable5 = new GradientDrawable();
                float f3 = 0;
                gradientDrawable5.setCornerRadius(f3);
                gradientDrawable5.setShape(0);
                gradientDrawable5.setColor(0);
                GradientDrawable gradientDrawable6 = new GradientDrawable();
                gradientDrawable6.setColor(ColorStateList.valueOf(-1));
                gradientDrawable6.setShape(0);
                gradientDrawable6.setCornerRadius(f3);
                Drawable rippleDrawable3 = new RippleDrawable(ColorStateList.valueOf(866822826), gradientDrawable5, gradientDrawable6);
                frameLayout5.setClickable(true);
                frameLayout5.setBackground(rippleDrawable3);
                TextView textView9 = new TextView(activity3);
                FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(AbstractC0055a.m101b(82), AbstractC0055a.m101b(82));
                layoutParams10.gravity = 8388627;
                textView9.setLayoutParams(layoutParams10);
                textView9.setGravity(17);
                textView9.setText("圈");
                textView9.setTextColor(-1);
                Typeface typeface3 = Typeface.DEFAULT_BOLD;
                textView9.setTypeface(typeface3);
                textView9.setTextSize(2, 18.0f);
                AbstractC0503h.m974J(activity3);
                textView9.setBackground(C0716t.m1357o(c0716t, -2466443, AbstractC0055a.m101b(8), null, 8));
                frameLayout5.addView(textView9);
                ImageView imageView3 = new ImageView(activity3);
                FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(AbstractC0055a.m101b(82), AbstractC0055a.m101b(82));
                layoutParams11.gravity = 8388627;
                imageView3.setLayoutParams(layoutParams11);
                imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView3.setBackground(C0716t.m1357o(c0716t, AbstractC0503h.m974J(activity3).f3502e, AbstractC0055a.m101b(8), Integer.valueOf(AbstractC0503h.m974J(activity3).f3506i), 8));
                frameLayout5.addView(imageView3);
                LinearLayout linearLayout4 = new LinearLayout(activity3);
                FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams12.gravity = 16;
                layoutParams12.setMarginStart(AbstractC0055a.m101b(98));
                layoutParams12.setMarginEnd(AbstractC0055a.m101b(72));
                linearLayout4.setLayoutParams(layoutParams12);
                linearLayout4.setOrientation(1);
                TextView textView10 = new TextView(linearLayout4.getContext());
                textView10.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                textView10.setTextColor(AbstractC0503h.m974J(activity3).f3503f);
                textView10.setTextSize(2, 12.5f);
                linearLayout4.addView(textView10);
                TextView textView11 = new TextView(linearLayout4.getContext());
                LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams13.topMargin = AbstractC0055a.m101b(4);
                textView11.setLayoutParams(layoutParams13);
                textView11.setTextColor(AbstractC0503h.m974J(activity3).f3504g);
                textView11.setTextSize(2, 9.5f);
                textView11.setMaxLines(2);
                linearLayout4.addView(textView11);
                frameLayout5.addView(linearLayout4);
                TextView textView12 = new TextView(activity3);
                FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams14.gravity = 8388629;
                textView12.setLayoutParams(layoutParams14);
                textView12.setText("恢复");
                textView12.setTypeface(typeface3);
                AbstractC0503h.m974J(activity3);
                textView12.setTextColor(-15292005);
                textView12.setTextSize(2, 15.0f);
                textView12.setPadding(AbstractC0055a.m101b(14), AbstractC0055a.m101b(8), AbstractC0055a.m101b(14), AbstractC0055a.m101b(8));
                AbstractC0503h.m974J(activity3);
                textView12.setBackground(C0716t.m1357o(c0716t, Color.argb(30, Color.red(-15292005), Color.green(-15292005), Color.blue(-15292005)), AbstractC0055a.m101b(18), null, 8));
                textView12.setOnClickListener(new ViewOnClickListenerC0837F1(c0716t, frameLayout5, 4));
                frameLayout5.addView(textView12);
                C0994p c0994p = new C0994p(frameLayout5, textView9, imageView3, textView10, textView11);
                frameLayout5.setOnClickListener(new ViewOnClickListenerC0837F1(c0716t, c0994p, 5));
                frameLayout5.setOnLongClickListener(new ViewOnLongClickListenerC0888b0(c0716t, c0994p, 3));
                return c0994p;
        }
    }

    public C0985g(C0709q1 c0709q1) {
        this.f3526d = c0709q1;
        boolean z2 = AbstractC1126i.f3786a;
        ArrayList<MaskItemBean> arrayListM2433i = C1124g.m2433i();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (MaskItemBean maskItemBean : arrayListM2433i) {
            linkedHashMap.put(maskItemBean.getMaskId(), maskItemBean);
        }
        Collection collectionValues = linkedHashMap.values();
        AbstractC0223g.m417d(collectionValues, "<get-values>(...)");
        List listM281w0 = AbstractC0123k.m281w0(collectionValues);
        CopyOnWriteArrayList copyOnWriteArrayList = this.f2596b;
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(listM281w0);
    }

    public C0985g(C0990l c0990l) {
        this.f3526d = c0990l;
    }
}
