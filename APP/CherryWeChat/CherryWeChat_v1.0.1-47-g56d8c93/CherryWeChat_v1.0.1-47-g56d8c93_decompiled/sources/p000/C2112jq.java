package p000;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;
import io.github.cherrywechat.R;
import io.github.cherrywechat.network.model.AdListData;
import io.github.cherrywechat.network.model.AnnouncementItem;
import io.github.cherrywechat.network.model.AnnouncementsWrapper;
import io.github.cherrywechat.network.model.ApiResponse;
import io.github.cherrywechat.network.model.RawAdItem;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: jq */
/* JADX INFO: loaded from: classes.dex */
public final class C2112jq extends LinearLayout implements InterfaceC0972Wk {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f7429e = 0;

    /* JADX INFO: renamed from: a */
    public List f7430a;

    /* JADX INFO: renamed from: b */
    public final Banner f7431b;

    /* JADX INFO: renamed from: c */
    public final LinearLayout f7432c;

    /* JADX INFO: renamed from: d */
    public final LinearLayout f7433d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v22, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v19, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r1v20, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r21v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object, jq] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v27, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r9v10, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    public C2112jq(Context context) {
        super(context);
        AbstractC0295Gu.m625r(-826231448664117L);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(60), AbstractC0295Gu.m616i(60)));
        TextView textView = new TextView(context);
        textView.setText(C1456gf.m2793K());
        textView.setTextSize(18.0f);
        textView.setTextColor(context.getColor(R.color.textTitle));
        Integer num = 16;
        textView.setGravity(16);
        List listM4977b0 = AbstractC2496sa.m4977b0(new C1379eq(10, AbstractC0295Gu.m625r(-826265808402485L), R.color.colorPrimary, AbstractC0295Gu.m625r(-825737527425077L), R.drawable.ic_theme), new C1379eq(2, AbstractC0295Gu.m625r(-825771887163445L), R.color.colorWarning, AbstractC0295Gu.m625r(-825793361999925L), R.drawable.ic_star), new C1379eq(4, AbstractC0295Gu.m625r(-825823426770997L), R.color.colorError, AbstractC0295Gu.m625r(-825844901607477L), R.drawable.ic_favorite), new C1379eq(6, AbstractC0295Gu.m625r(-825874966378549L), R.color.importIconColorDark, AbstractC0295Gu.m625r(-825896441215029L), R.drawable.ic_info));
        this.f7430a = C0452Kf.f1484a;
        setOrientation(1);
        setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        setBackground(new ColorDrawable(getContext().getColor(R.color.colorBackground)));
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        scrollView.setFillViewport(true);
        scrollView.setOverScrollMode(2);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setHorizontalScrollBarEnabled(false);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f7433d = linearLayout;
        scrollView.addView(linearLayout);
        addView(scrollView);
        ?? linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(num));
        gradientDrawable.setColor(getContext().getColor(R.color.colorForeground));
        linearLayout2.setBackground(gradientDrawable);
        imageView.setImageDrawable(C1456gf.m2790H());
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(imageView.getContext().getColor(R.color.colorPrimary));
        imageView.setBackground(gradientDrawable2);
        imageView.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        imageView.setClipToOutline(true);
        textView.setTextSize(17.0f);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        textView.setTextColor(textView.getContext().getColor(R.color.textTitle));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = AbstractC0295Gu.m616i(0);
        layoutParams.topMargin = AbstractC0295Gu.m616i(0);
        textView.setLayoutParams(layoutParams);
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = AbstractC0295Gu.m616i(8);
        layoutParams2.leftMargin = AbstractC0295Gu.m616i(0);
        linearLayout3.setLayoutParams(layoutParams2);
        linearLayout3.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8));
        linearLayout3.setClickable(true);
        linearLayout3.setFocusable(true);
        linearLayout3.setOnClickListener(new ViewOnClickListenerC2176l5(17, linearLayout3, (Object) this));
        TextView textView2 = new TextView(getContext());
        textView2.setText(C1456gf.m2791I());
        textView2.setTextSize(14.0f);
        textView2.setTextColor(textView2.getContext().getColor(R.color.textTitle));
        textView2.setGravity(17);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setTypeface(typeface);
        linearLayout3.addView(textView2);
        LinearLayout linearLayout4 = new LinearLayout(getContext());
        linearLayout4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
        layoutParams3.leftMargin = AbstractC0295Gu.m616i(num);
        layoutParams3.weight = 1.0f;
        linearLayout4.setLayoutParams(layoutParams3);
        linearLayout4.addView(textView);
        linearLayout4.addView(linearLayout3);
        ImageView imageView2 = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24));
        layoutParams4.leftMargin = AbstractC0295Gu.m616i(12);
        imageView2.setLayoutParams(layoutParams4);
        imageView2.setImageResource(R.drawable.ic_info);
        imageView2.setColorFilter(imageView2.getContext().getColor(R.color.textSummary));
        imageView2.setAlpha(0.7f);
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setClickable(true);
        imageView2.setFocusable(true);
        imageView2.setBackground(m4307j());
        imageView2.setPadding(AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(4));
        imageView2.setOnClickListener(new ViewOnClickListenerC1477h(6, this));
        linearLayout2.addView(imageView);
        linearLayout2.addView(linearLayout4);
        linearLayout2.addView(imageView2);
        LinearLayout linearLayout5 = this.f7433d;
        ?? r1 = linearLayout5;
        if (linearLayout5 == null) {
            AbstractC0295Gu.m625r(-825999520430133L);
            r1 = 0;
        }
        r1.addView(linearLayout2);
        LinearLayout linearLayout6 = new LinearLayout(getContext());
        linearLayout6.setOrientation(1);
        linearLayout6.setVisibility(8);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(160));
        layoutParams5.topMargin = AbstractC0295Gu.m616i(20);
        linearLayout6.setLayoutParams(layoutParams5);
        AbstractC0295Gu.m616i(4);
        linearLayout6.setBackground(m4305h());
        linearLayout6.setClipToOutline(true);
        this.f7432c = linearLayout6;
        Banner banner = new Banner(getContext());
        banner.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        banner.setAdapter(new C1467gq(banner, this.f7430a));
        banner.setIndicator(new CircleIndicator(banner.getContext()));
        banner.setLoopTime(3000L);
        banner.isAutoLoop(true);
        banner.setOnBannerListener(new C2464rl(1, (Object) this));
        this.f7431b = banner;
        LinearLayout linearLayout7 = this.f7432c;
        if (linearLayout7 == null) {
            AbstractC0295Gu.m625r(-826437607094325L);
            linearLayout7 = null;
        }
        Banner banner2 = this.f7431b;
        if (banner2 == null) {
            AbstractC0295Gu.m625r(-826484851734581L);
            banner2 = null;
        }
        linearLayout7.addView(banner2);
        LinearLayout linearLayout8 = this.f7433d;
        if (linearLayout8 == null) {
            AbstractC0295Gu.m625r(-826514916505653L);
            linearLayout8 = null;
        }
        LinearLayout linearLayout9 = this.f7432c;
        if (linearLayout9 == null) {
            AbstractC0295Gu.m625r(-824938663508021L);
            linearLayout9 = null;
        }
        linearLayout8.addView(linearLayout9);
        ?? linearLayout10 = new LinearLayout(getContext());
        linearLayout10.setOrientation(1);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.topMargin = AbstractC0295Gu.m616i(20);
        linearLayout10.setLayoutParams(layoutParams6);
        Iterator it = listM4977b0.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2496sa.m4978c0();
                throw null;
            }
            C1379eq c1379eq = (C1379eq) next;
            ?? linearLayout11 = new LinearLayout(getContext());
            linearLayout11.setOrientation(0);
            linearLayout11.setGravity(16);
            linearLayout11.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            Iterator it2 = it;
            linearLayout11.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(num), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(num));
            linearLayout11.setBackground(m4305h());
            linearLayout11.setClipToOutline(true);
            linearLayout11.setClickable(true);
            linearLayout11.setFocusable(true);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, m4307j());
            stateListDrawable.addState(new int[0], m4305h());
            linearLayout11.setBackground(stateListDrawable);
            linearLayout11.setOnClickListener(new ViewOnClickListenerC2176l5(16, c1379eq, (Object) this));
            ImageView imageView3 = new ImageView(linearLayout11.getContext());
            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(32), AbstractC0295Gu.m616i(32));
            layoutParams7.setMarginEnd(AbstractC0295Gu.m616i(num));
            imageView3.setLayoutParams(layoutParams7);
            imageView3.setImageResource(c1379eq.f4922e);
            imageView3.setColorFilter(imageView3.getContext().getColor(c1379eq.f4920c));
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
            imageView3.setScaleType(scaleType);
            linearLayout11.addView(imageView3);
            ?? linearLayout12 = new LinearLayout(linearLayout11.getContext());
            linearLayout12.setOrientation(1);
            Integer num2 = num;
            LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(0, -2);
            layoutParams8.weight = 1.0f;
            linearLayout12.setLayoutParams(layoutParams8);
            TextView textView3 = new TextView(linearLayout12.getContext());
            textView3.setText(c1379eq.f4919b);
            textView3.setTextSize(16.0f);
            textView3.setTextColor(textView3.getContext().getColor(R.color.textTitle));
            textView3.setTypeface(Typeface.DEFAULT_BOLD);
            linearLayout12.addView(textView3);
            TextView textView4 = new TextView(linearLayout12.getContext());
            textView4.setText(c1379eq.f4921d);
            textView4.setTextSize(12.0f);
            textView4.setTextColor(textView4.getContext().getColor(R.color.textSummary));
            LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams9.topMargin = AbstractC0295Gu.m616i(4);
            textView4.setLayoutParams(layoutParams9);
            linearLayout12.addView(textView4);
            linearLayout11.addView(linearLayout12);
            ImageView imageView4 = new ImageView(linearLayout11.getContext());
            imageView4.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24)));
            imageView4.setImageResource(R.drawable.ic_arrow_right);
            imageView4.setColorFilter(imageView4.getContext().getColor(R.color.textSummary));
            imageView4.setAlpha(0.7f);
            imageView4.setScaleType(scaleType);
            linearLayout11.addView(imageView4);
            linearLayout10.addView(linearLayout11);
            if (i < listM4977b0.size() - 1) {
                View view = new View(getContext());
                view.setLayoutParams(new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(12)));
                linearLayout10.addView(view);
            }
            i = i2;
            num = num2;
            it = it2;
        }
        InterfaceC0190Eb interfaceC0190Eb = null;
        LinearLayout linearLayout13 = this.f7433d;
        ?? r2 = linearLayout13;
        if (linearLayout13 == null) {
            AbstractC0295Gu.m625r(-825131937036341L);
            r2 = 0;
        }
        r2.addView(linearLayout10);
        ?? linearLayout14 = new LinearLayout(getContext());
        linearLayout14.setOrientation(1);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams10.topMargin = AbstractC0295Gu.m616i(40);
        layoutParams10.bottomMargin = AbstractC0295Gu.m616i(20);
        linearLayout14.setLayoutParams(layoutParams10);
        linearLayout14.setGravity(17);
        TextView textView5 = new TextView(getContext());
        textView5.setText(AbstractC0295Gu.m625r(-824655195666485L));
        textView5.setTextSize(14.0f);
        textView5.setTextColor(textView5.getContext().getColor(R.color.textSummary));
        textView5.setGravity(17);
        Typeface typeface2 = Typeface.DEFAULT;
        textView5.setTypeface(typeface2);
        TextView textView6 = new TextView(getContext());
        AbstractC0213Ey.m414l(-824796929587253L, textView6, 12.0f);
        textView6.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-824878533965877L)));
        textView6.setGravity(17);
        textView6.setTypeface(typeface2);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams11.topMargin = AbstractC0295Gu.m616i(8);
        textView6.setLayoutParams(layoutParams11);
        linearLayout14.addView(textView5);
        linearLayout14.addView(textView6);
        LinearLayout linearLayout15 = this.f7433d;
        ?? r22 = linearLayout15;
        if (linearLayout15 == null) {
            AbstractC0295Gu.m625r(-825462649518133L);
            r22 = 0;
        }
        r22.addView(linearLayout14);
        C1498hd c1498hd = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C1423fq(this, interfaceC0190Eb, 1), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List m4301a(C2112jq c2112jq, String str) {
        Object objM4550a;
        AdListData adListData;
        List<RawAdItem> items;
        C1304d1 c1304d1;
        C0452Kf c0452Kf = C0452Kf.f1484a;
        try {
            try {
                C0029Am c0029Am = AbstractC2809zm.f9524a;
                c0029Am.getClass();
                objM4550a = c0029Am.m4550a(ApiResponse.Companion.serializer(AdListData.Companion.serializer()), str);
            } catch (Exception e) {
                AbstractC0295Gu.m625r(-826622290688053L);
                AbstractC0425Jv.m881a(ApiResponse.class).m445b();
                AbstractC0295Gu.m625r(-826738254805045L);
                e.getMessage();
                objM4550a = null;
            }
            ApiResponse apiResponse = (ApiResponse) objM4550a;
            if (apiResponse != null && apiResponse.getCode() == 0 && (adListData = (AdListData) apiResponse.getData()) != null && (items = adListData.getItems()) != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AbstractC0295Gu.m625r(-826755434674229L), Locale.getDefault());
                ArrayList arrayList = new ArrayList();
                for (RawAdItem rawAdItem : items) {
                    if (rawAdItem.getStatus() != 1 || rawAdItem.getImageUrl().length() == 0 || rawAdItem.getLinkUrl().length() == 0) {
                        c1304d1 = null;
                    } else {
                        try {
                            String endTime = rawAdItem.getEndTime();
                            if (endTime != null && endTime.length() != 0 && !endTime.equals(AbstractC0295Gu.m625r(-826291578206261L))) {
                                Date date = simpleDateFormat.parse(endTime);
                                if ((date != null ? date.getTime() : 0L) <= jCurrentTimeMillis) {
                                }
                            }
                        } catch (Exception unused) {
                        }
                        c1304d1 = new C1304d1(rawAdItem.getId(), rawAdItem.getImageUrl(), rawAdItem.getLinkUrl(), rawAdItem.getSortOrder());
                    }
                    if (c1304d1 != null) {
                        arrayList.add(c1304d1);
                    }
                }
                return AbstractC2453ra.m4904n0(arrayList, new C0963Wb(5));
            }
            return c0452Kf;
        } catch (Exception e2) {
            e2.printStackTrace();
            return c0452Kf;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final List m4302e(C2112jq c2112jq, String str) {
        Object objM4550a;
        AnnouncementsWrapper announcementsWrapper;
        List<AnnouncementItem> data;
        C0452Kf c0452Kf = C0452Kf.f1484a;
        try {
            try {
                C0029Am c0029Am = AbstractC2809zm.f9524a;
                c0029Am.getClass();
                objM4550a = c0029Am.m4550a(ApiResponse.Companion.serializer(AnnouncementsWrapper.Companion.serializer()), str);
            } catch (Exception e) {
                AbstractC0295Gu.m625r(-823611518613557L);
                AbstractC0425Jv.m881a(ApiResponse.class).m445b();
                AbstractC0295Gu.m625r(-823727482730549L);
                e.getMessage();
                objM4550a = null;
            }
            ApiResponse apiResponse = (ApiResponse) objM4550a;
            if (apiResponse != null && apiResponse.getCode() == 0 && (announcementsWrapper = (AnnouncementsWrapper) apiResponse.getData()) != null && (data = announcementsWrapper.getData()) != null) {
                ArrayList arrayList = new ArrayList(AbstractC2539ta.m5019d0(data, 10));
                for (AnnouncementItem announcementItem : data) {
                    String id = announcementItem.getId();
                    String title = announcementItem.getTitle();
                    String content = announcementItem.getContent();
                    String type = announcementItem.getType();
                    boolean zIsPopup = announcementItem.isPopup();
                    boolean canClose = announcementItem.getCanClose();
                    String targetUsers = announcementItem.getTargetUsers();
                    List<String> betaUserList = announcementItem.getBetaUserList();
                    arrayList.add(new C1335dq(id, title, content, type, zIsPopup, canClose, targetUsers, betaUserList == null ? c0452Kf : betaUserList));
                }
                return arrayList;
            }
            return c0452Kf;
        } catch (Exception e2) {
            e2.printStackTrace();
            return c0452Kf;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m4303f(C2112jq c2112jq, C1335dq c1335dq, C1389f c1389f) {
        Context context = c2112jq.getContext();
        AbstractC0295Gu.m625r(-823744662599733L);
        ScrollView scrollView = new ScrollView(c2112jq.getContext());
        scrollView.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16));
        TextView textView = new TextView(c2112jq.getContext());
        textView.setText(c1335dq.f4811c);
        textView.setTextSize(15.0f);
        textView.setTextColor(textView.getContext().getColor(R.color.textSummary));
        textView.setLineSpacing(8.0f, 1.0f);
        scrollView.addView(textView);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(c2112jq.getContext(), android.R.style.Theme.Material.Light.Dialog.Alert).setTitle(c1335dq.f4810b).setView(scrollView).setPositiveButton(AbstractC0295Gu.m625r(-824543526516789L), (DialogInterface.OnClickListener) null).setNegativeButton(AbstractC0295Gu.m625r(-824556411418677L), new DialogInterfaceOnClickListenerC0536Md(2, (Activity) context)).setCancelable(false).create();
        alertDialogCreate.show();
        TextView textView2 = (TextView) alertDialogCreate.findViewById(android.R.id.title);
        if (textView2 != null) {
            textView2.setTextSize(18.0f);
            textView2.setTextColor(textView2.getContext().getColor(R.color.textTitle));
            textView2.setTypeface(Typeface.DEFAULT_BOLD);
            textView2.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16));
        }
        Button button = alertDialogCreate.getButton(-1);
        if (button != null) {
            button.setTextColor(button.getContext().getColor(R.color.colorPrimary));
            button.setTextSize(16.0f);
            button.setAllCaps(false);
        }
        Button button2 = alertDialogCreate.getButton(-2);
        if (button2 != null) {
            button2.setTextColor(button2.getContext().getColor(R.color.colorError));
            button2.setTextSize(16.0f);
            button2.setAllCaps(false);
        }
        Window window = alertDialogCreate.getWindow();
        if (window != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(window.getContext().getColor(R.color.colorForeground));
            gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(16));
            window.setBackgroundDrawable(gradientDrawable);
            window.setLayout((int) (((double) window.getContext().getResources().getDisplayMetrics().widthPixels) * 0.9d), (int) (((double) window.getContext().getResources().getDisplayMetrics().heightPixels) * 0.7d));
            window.setDimAmount(0.5f);
        }
        Button button3 = alertDialogCreate.getButton(-1);
        button3.setEnabled(false);
        button3.setText(AbstractC0295Gu.m625r(-824569296320565L));
        C0339Hv c0339Hv = new C0339Hv();
        c0339Hv.f1147a = 3;
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new RunnableC2069iq(c0339Hv, button3, handler, alertDialogCreate, c1389f), 1000L);
    }

    /* JADX INFO: renamed from: g */
    public static int m4304g(int i, float f) {
        return Color.argb((int) (255 * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-823907871356981L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity activity, int i, int i2, Intent intent) {
        AbstractC0295Gu.m625r(-823946526062645L);
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity activity) {
        AbstractC0295Gu.m625r(-823869216651317L);
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0562N2(19, this), 500L);
    }

    @Override // p000.InterfaceC0972Wk
    public View getContentView() {
        return this;
    }

    @Override // p000.InterfaceC0972Wk
    public String getTitle() {
        return AbstractC0295Gu.m625r(-823985180768309L);
    }

    public int getViewId() {
        return 2;
    }

    /* JADX INFO: renamed from: h */
    public final GradientDrawable m4305h() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(getContext().getColor(R.color.colorForeground));
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(16));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: i */
    public final LinearLayout m4306i(String str, String str2, String str3, int i, String str4, InterfaceC0884Ui interfaceC0884Ui) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(linearLayout.getContext().getColor(R.color.colorForeground));
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(16));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(20));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = AbstractC0295Gu.m616i(14);
        linearLayout.setLayoutParams(layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setGravity(17);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(52), AbstractC0295Gu.m616i(52)));
        int iM4304g = m4304g(i, 0.15f);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(iM4304g);
        gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(14));
        linearLayout2.setBackground(gradientDrawable2);
        TextView textView = new TextView(linearLayout2.getContext());
        textView.setText(str);
        textView.setTextSize(26.0f);
        textView.setGravity(17);
        linearLayout2.addView(textView);
        linearLayout.addView(linearLayout2);
        LinearLayout linearLayout3 = new LinearLayout(linearLayout.getContext());
        linearLayout3.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.setMarginStart(AbstractC0295Gu.m616i(16));
        linearLayout3.setLayoutParams(layoutParams2);
        TextView textView2 = new TextView(linearLayout3.getContext());
        textView2.setText(str2);
        textView2.setTextSize(16.0f);
        textView2.setTextColor(textView2.getContext().getColor(R.color.textTitle));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView2.setTypeface(typeface);
        linearLayout3.addView(textView2);
        TextView textView3 = new TextView(linearLayout3.getContext());
        textView3.setText(str3);
        textView3.setTextSize(14.0f);
        textView3.setTextColor(textView3.getContext().getColor(R.color.textSummary));
        textView3.setPadding(0, AbstractC0295Gu.m616i(4), 0, 0);
        linearLayout3.addView(textView3);
        linearLayout.addView(linearLayout3);
        TextView textView4 = new TextView(linearLayout.getContext());
        textView4.setText(str4);
        textView4.setTextSize(14.0f);
        textView4.setTypeface(typeface);
        textView4.setTextColor(i);
        textView4.setGravity(17);
        int iM4304g2 = m4304g(i, 0.12f);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(m4304g(i, 0.2f));
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(iM4304g2);
        gradientDrawable3.setCornerRadius(AbstractC0295Gu.m616i(20));
        gradientDrawable3.setStroke(AbstractC0295Gu.m616i(1), m4304g(i, 0.3f));
        textView4.setBackground(new RippleDrawable(colorStateListValueOf, gradientDrawable3, null));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        layoutParams3.setMarginStart(AbstractC0295Gu.m616i(16));
        textView4.setLayoutParams(layoutParams3);
        textView4.setPadding(AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(10), AbstractC0295Gu.m616i(20), AbstractC0295Gu.m616i(10));
        textView4.setClickable(true);
        textView4.setFocusable(true);
        textView4.setOnClickListener(new ViewOnClickListenerC0462Kp(1, interfaceC0884Ui));
        linearLayout.addView(textView4);
        linearLayout.setBackground(new RippleDrawable(ColorStateList.valueOf(520093696), linearLayout.getBackground(), null));
        linearLayout.setClickable(true);
        return linearLayout;
    }

    /* JADX INFO: renamed from: j */
    public final RippleDrawable m4307j() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(getContext().getColor(R.color.rippleColor));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(20));
        return new RippleDrawable(colorStateListValueOf, null, gradientDrawable);
    }

    /* JADX INFO: renamed from: k */
    public final void m4308k(String str) {
        try {
            Context context = getContext();
            AbstractC0295Gu.m625r(-821382430586933L);
            C1456gf.m2803U(context, str);
        } catch (Exception unused) {
            AbstractC0213Ey.m413k(-821451150063669L, getContext(), 0);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4309l(final ArrayList arrayList, final int i) {
        if (i >= arrayList.size()) {
            return;
        }
        C1335dq c1335dq = (C1335dq) arrayList.get(i);
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setText(c1335dq.f4810b);
        textView.setTextSize(16.0f);
        textView.setTextColor(textView.getContext().getColor(R.color.textTitle));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        textView.setPadding(0, 0, 0, AbstractC0295Gu.m616i(8));
        linearLayout.addView(textView);
        TextView textView2 = new TextView(getContext());
        textView2.setText(c1335dq.f4811c);
        textView2.setTextSize(14.0f);
        textView2.setTextColor(textView2.getContext().getColor(R.color.textSummary));
        textView2.setLineSpacing(6.0f, 1.0f);
        textView2.setPadding(0, 0, 0, AbstractC0295Gu.m616i(16));
        textView2.setTextIsSelectable(true);
        linearLayout.addView(textView2);
        scrollView.addView(linearLayout);
        AlertDialog.Builder view = new AlertDialog.Builder(getContext(), android.R.style.Theme.Material.Light.Dialog.Alert).setTitle(AbstractC0295Gu.m625r(-824599361091637L)).setView(scrollView);
        if (c1335dq.f4814f) {
            view.setPositiveButton(AbstractC0295Gu.m625r(-824612245993525L), new DialogInterfaceOnClickListenerC0536Md(1, c1335dq));
            view.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: aq
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f4072a.m4309l(arrayList, i + 1);
                }
            });
        } else {
            view.setCancelable(false);
            view.setOnDismissListener(new DialogInterfaceOnDismissListenerC0824T7(1, this));
        }
        final AlertDialog alertDialogCreate = view.create();
        if (i < arrayList.size() - 1) {
            view.setNegativeButton(AbstractC0295Gu.m625r(-824633720830005L), new DialogInterface.OnClickListener() { // from class: bq
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    alertDialogCreate.dismiss();
                    this.m4309l(arrayList, i + 1);
                }
            });
        }
        alertDialogCreate.show();
        TextView textView3 = (TextView) alertDialogCreate.findViewById(android.R.id.title);
        if (textView3 != null) {
            textView3.setTextSize(18.0f);
            textView3.setTextColor(textView3.getContext().getColor(R.color.textTitle));
            textView3.setTypeface(typeface);
            textView3.setPadding(AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(24), AbstractC0295Gu.m616i(16));
        }
        Button button = alertDialogCreate.getButton(-1);
        if (button != null) {
            button.setTextColor(button.getContext().getColor(R.color.colorPrimary));
            button.setTextSize(16.0f);
            button.setAllCaps(false);
        }
        Window window = alertDialogCreate.getWindow();
        if (window != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(window.getContext().getColor(R.color.colorForeground));
            gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(16));
            window.setBackgroundDrawable(gradientDrawable);
            window.setLayout((int) (((double) window.getContext().getResources().getDisplayMetrics().widthPixels) * 0.85d), -2);
            window.setDimAmount(0.5f);
        }
    }
}
