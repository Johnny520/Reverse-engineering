package yyds;

import android.app.Dialog;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.app.CustomRecyclerView;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛱᛵᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0135 implements InterfaceC2289, InterfaceC2768, InterfaceC0017, InterfaceC2504, InterfaceC1685, InterfaceC0503, InterfaceC1434, InterfaceC2172, InterfaceC1352, InterfaceC1454 {

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static Dialog f835;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f840;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C0135 f839 = new C0135(0);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final /* synthetic */ C0135 f836 = new C0135(2);

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C0135 f838 = new C0135(3);

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final C0135 f837 = new C0135(4);

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final C0135 f834 = new C0135(5);

    public C0135(View view) {
        this.f840 = 25;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static byte[] m589(List list) {
        C1507 c1507 = new C1507();
        for (String str : m601(list)) {
            c1507.m3036(str.length());
            c1507.m3019(str);
        }
        return c1507.m3023(c1507.f7087);
    }

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public static final void m590(C0947 c0947, Context context, TextView textView, int i, String str, int i2) {
        boolean z = c0947.f4410 == i;
        textView.setText(str + ' ' + i2);
        textView.setBackgroundResource(z ? R.drawable.bg_ward_filter_chip_selected : R.drawable.bg_ward_filter_normal);
        textView.setTextColor(context.getColor(z ? R.color.douyin_primary : R.color.secondary_text));
        textView.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public static final void m591(C0172 c0172, C0947 c0947, C0172 c01722, C0947 c09472, C2133 c2133, final C2770 c2770, final boolean z) {
        if (AbstractC0473.m1313(c2770.f13509) || AbstractC1544.m3188(c2770.f13509, AbstractC2328.m4341(-983512723915630L))) {
            String str = (String) c0172.f997;
            final int i = c0947.f4410;
            String str2 = (String) c01722.f997;
            final int i2 = c09472.f4410;
            c2133.m4061(str, 0, Integer.MAX_VALUE, i, str2, new InterfaceC1549(i2, c2770, i, z) { // from class: yyds.ᛷᲁᛴᛵ

                /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
                public final /* synthetic */ int f8342;

                /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
                public final /* synthetic */ int f8343;

                /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
                public final /* synthetic */ boolean f8344;

                /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
                public final /* synthetic */ C2770 f8345;

                @Override // yyds.InterfaceC1549
                /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                public final native Object mo371(Object obj);
            });
            return;
        }
        synchronized (C1867.f9402) {
            C1867.m3650(AbstractC2328.m4341(-549162681271150L));
        }
        Map map = C2609.f12814;
        String str3 = c2770.f13518;
        String strM4341 = z ? c2770.f13509 : AbstractC2328.m4341(-983525608817518L);
        AbstractC2328.m4341(-538734500676462L);
        C2609.m4689(str3, strM4341, null, null);
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static void m592(Context context, InterfaceC2266 interfaceC2266) {
        AbstractC2328.m4341(-981756082291566L);
        AbstractC2328.m4341(-981790442029934L);
        C2701.f13261.getClass();
        C2701.m4807(context);
        Dialog dialog = new Dialog(context, android.R.style.Theme.Translucent.NoTitleBar);
        View viewInflate = AbstractC1115.m2309(context).inflate(R.layout.category_manager_dialog_layout, (ViewGroup) null, false);
        int i = R.id.btnAddCategory;
        if (((TextView) AbstractC1741.m3479(viewInflate, R.id.btnAddCategory)) != null) {
            if (((EditText) AbstractC1741.m3479(viewInflate, R.id.etNewCategory)) == null) {
                i = R.id.etNewCategory;
            } else if (((ImageView) AbstractC1741.m3479(viewInflate, R.id.ivCloseCategoryManager)) != null) {
                int i2 = R.id.layoutCategorySortHint;
                LinearLayout linearLayout = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.layoutCategorySortHint);
                if (linearLayout != null) {
                    i2 = R.id.layoutEmptyCategories;
                    LinearLayout linearLayout2 = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.layoutEmptyCategories);
                    if (linearLayout2 != null) {
                        i2 = R.id.rvCategories;
                        CustomRecyclerView customRecyclerView = (CustomRecyclerView) AbstractC1741.m3479(viewInflate, R.id.rvCategories);
                        if (customRecyclerView != null) {
                            i2 = R.id.tvCategoryCount;
                            TextView textView = (TextView) AbstractC1741.m3479(viewInflate, R.id.tvCategoryCount);
                            if (textView != null) {
                                LinearLayout linearLayout3 = (LinearLayout) viewInflate;
                                C0052 c0052 = new C0052(linearLayout3, linearLayout, linearLayout2, customRecyclerView, textView);
                                AbstractC2328.m4341(-981876341375854L);
                                AbstractC2328.m4341(-981932175950702L);
                                dialog.setContentView(linearLayout3);
                                Window window = dialog.getWindow();
                                if (window != null) {
                                    window.setGravity(80);
                                    window.setLayout(-1, (int) (((double) context.getResources().getDisplayMetrics().heightPixels) * 0.85d));
                                    window.setWindowAnimations(android.R.style.Animation.InputMethod);
                                }
                                ImageView imageView = (ImageView) linearLayout3.findViewById(R.id.ivCloseCategoryManager);
                                if (imageView != null) {
                                    imageView.setOnClickListener(new ViewOnClickListenerC1393(dialog, 15));
                                }
                                AbstractC2328.m4341(-981988010525550L);
                                AbstractC2328.m4341(-982043845100398L);
                                AbstractC2328.m4341(-982138334380910L);
                                customRecyclerView.setLayoutManager(new LinearLayoutManager(1));
                                new C1877(new C0448(new C1417(), context, interfaceC2266)).m3666(customRecyclerView);
                                m599(context, c0052, customRecyclerView, linearLayout2, linearLayout, interfaceC2266);
                                EditText editText = (EditText) linearLayout3.findViewById(R.id.etNewCategory);
                                TextView textView2 = (TextView) linearLayout3.findViewById(R.id.btnAddCategory);
                                textView2.setOnClickListener(new ViewOnClickListenerC1977(editText, context, interfaceC2266, c0052, customRecyclerView, linearLayout2, linearLayout, 2));
                                editText.setOnEditorActionListener(new C1031(textView2, 1));
                                dialog.show();
                                return;
                            }
                        }
                    }
                }
                i = i2;
            } else {
                i = R.id.ivCloseCategoryManager;
            }
        }
        C0188.m789(AbstractC2328.m4341(-1739701845918574L).concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public static final void m593(TextView textView, C0172 c0172, TextView textView2, TextView textView3, TextView textView4, C0947 c0947, Context context) {
        m590(c0947, context, textView, 0, AbstractC2328.m4341(-982396032418670L), ((C1404) c0172.f997).f6639);
        m590(c0947, context, textView2, 1, AbstractC2328.m4341(-982408917320558L), ((C1404) c0172.f997).f6640);
        m590(c0947, context, textView3, 2, AbstractC2328.m4341(-982421802222446L), ((C1404) c0172.f997).f6641);
        m590(c0947, context, textView4, 3, AbstractC2328.m4341(-982434687124334L), ((C1404) c0172.f997).f6642);
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static void m594(Context context, String str, String str2, String str3, String str4, InterfaceC1549 interfaceC1549, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        int i2 = (i & 32) != 0 ? R.drawable.douyin_button_primary : R.drawable.bg_category_button_danger;
        Dialog dialog = new Dialog(context);
        View viewInflate = AbstractC1115.m2309(context).inflate(R.layout.category_action_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tvCategoryActionMessage);
        EditText editText = (EditText) viewInflate.findViewById(R.id.etCategoryActionName);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.btnCategoryActionConfirm);
        ((TextView) viewInflate.findViewById(R.id.tvCategoryActionTitle)).setText(str);
        if (str2 == null || AbstractC0473.m1313(str2)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str2);
            textView.setVisibility(0);
        }
        if (str3 == null) {
            editText.setVisibility(8);
        } else {
            editText.setText(str3);
            editText.setSelection(str3.length());
            editText.setVisibility(0);
        }
        textView2.setText(str4);
        textView2.setBackgroundResource(i2);
        ((TextView) viewInflate.findViewById(R.id.btnCategoryActionCancel)).setOnClickListener(new ViewOnClickListenerC1393(dialog, 13));
        textView2.setOnClickListener(new ViewOnClickListenerC1192(editText, interfaceC1549, dialog, 27));
        editText.setOnEditorActionListener(new C1031(textView2, 0));
        dialog.setContentView(viewInflate);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        dialog.show();
        int i3 = context.getResources().getDisplayMetrics().widthPixels;
        float f = context.getResources().getDisplayMetrics().density;
        int iMin = Math.min(i3 - ((int) (40.0f * f)), (int) (360.0f * f));
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setLayout(iMin, -2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0151 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m595(LinearLayout linearLayout, C0947 c0947, C0172 c0172, C0172 c01722, Context context, C0485 c0485, C0172 c01723) throws Throwable {
        long j;
        String strM4341;
        Context context2 = context;
        linearLayout.removeAllViews();
        C0947 c09472 = c0947;
        Throwable th = null;
        List listSingletonList = Collections.singletonList(new Pair(null, Integer.valueOf(c09472.f4410)));
        C0172 c01724 = c0172;
        Iterable<C2236> iterable = (Iterable) c01724.f997;
        ArrayList arrayList = new ArrayList(AbstractC0055.m419(iterable, 10));
        for (C2236 c2236 : iterable) {
            arrayList.add(new Pair(c2236.f11039, Integer.valueOf(c2236.f11040)));
        }
        int i = 0;
        for (Object obj : AbstractC1595.m3284(listSingletonList, arrayList)) {
            int i2 = i + 1;
            if (i < 0) {
                Throwable th2 = th;
                AbstractC2725.m4853();
                throw th2;
            }
            Pair pair = (Pair) obj;
            String str = (String) pair.component1();
            int iIntValue = ((Number) pair.component2()).intValue();
            boolean zM3188 = AbstractC1544.m3188(c01722.f997, str);
            if (str == null) {
                j = -982383147516782L;
            } else if (AbstractC0473.m1313(str)) {
                j = -982365967647598L;
            } else {
                strM4341 = str;
                Throwable th3 = th;
                TextView textView = new TextView(context2);
                textView.setText(strM4341 + ' ' + iIntValue);
                textView.setGravity(17);
                textView.setIncludeFontPadding(false);
                textView.setMinHeight(((Number) c0485.mo371(28)).intValue());
                textView.setSingleLine();
                textView.setTextSize(2, 13.0f);
                textView.setPadding(((Number) c0485.mo371(14)).intValue(), ((Number) c0485.mo371(5)).intValue(), ((Number) c0485.mo371(14)).intValue(), ((Number) c0485.mo371(5)).intValue());
                textView.setBackgroundResource(!zM3188 ? R.drawable.bg_ward_filter_chip_selected : R.drawable.bg_ward_filter_normal);
                textView.setTextColor(context2.getColor(!zM3188 ? R.color.douyin_primary : R.color.secondary_text));
                textView.setOnClickListener(new ViewOnClickListenerC1815(c01722, str, c01723, linearLayout, c09472, c01724, context2, c0485));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (i <= 0) {
                    layoutParams.leftMargin = ((Number) c0485.mo371(8)).intValue();
                }
                linearLayout.addView(textView, layoutParams);
                c09472 = c0947;
                c01724 = c0172;
                context2 = context;
                i = i2;
                th = th3;
            }
            strM4341 = AbstractC2328.m4341(j);
            Throwable th32 = th;
            TextView textView2 = new TextView(context2);
            textView2.setText(strM4341 + ' ' + iIntValue);
            textView2.setGravity(17);
            textView2.setIncludeFontPadding(false);
            textView2.setMinHeight(((Number) c0485.mo371(28)).intValue());
            textView2.setSingleLine();
            textView2.setTextSize(2, 13.0f);
            textView2.setPadding(((Number) c0485.mo371(14)).intValue(), ((Number) c0485.mo371(5)).intValue(), ((Number) c0485.mo371(14)).intValue(), ((Number) c0485.mo371(5)).intValue());
            textView2.setBackgroundResource(!zM3188 ? R.drawable.bg_ward_filter_chip_selected : R.drawable.bg_ward_filter_normal);
            textView2.setTextColor(context2.getColor(!zM3188 ? R.color.douyin_primary : R.color.secondary_text));
            textView2.setOnClickListener(new ViewOnClickListenerC1815(c01722, str, c01723, linearLayout, c09472, c01724, context2, c0485));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            if (i <= 0) {
            }
            linearLayout.addView(textView2, layoutParams2);
            c09472 = c0947;
            c01724 = c0172;
            context2 = context;
            i = i2;
            th = th32;
        }
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public static final void m596(C0947 c0947, C2133 c2133, C0172 c0172, C0172 c01722, C0947 c09472, C0172 c01723, TextView textView, TextView textView2, TextView textView3, TextView textView4, Context context, C0947 c09473, C0172 c01724, C0172 c01725, LinearLayout linearLayout, C0485 c0485) {
        int i = c0947.f4410 + 1;
        c0947.f4410 = i;
        String str = (String) c0172.f997;
        C1279 c1279 = new C1279(i, c0947, c01723, textView, textView2, textView3, textView4, c09472, context);
        AbstractC2328.m4341(-1140420764140398L);
        AbstractC2328.m4341(-1140455123878766L);
        C2454 c2454 = (C2454) c2133.f10553;
        AbstractC2071.m3959(c2454, null, new C1647(c2133, str, c1279, (InterfaceC0274) null, 12), 3);
        String str2 = (String) c0172.f997;
        int i2 = c09472.f4410;
        C1279 c12792 = new C1279(i, c0947, c09473, c01724, c01722, c01725, context, linearLayout, c0485);
        AbstractC2328.m4341(-1140493778584430L);
        AbstractC2328.m4341(-1140528138322798L);
        AbstractC2071.m3959(c2454, null, new C1112(c2133, str2, i2, c12792, (InterfaceC0274) null), 3);
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static int m597(Context context, int i) {
        return (int) (i * context.getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static GradientDrawable m598(int i, float f, Integer num) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(f);
        if (num != null) {
            gradientDrawable.setStroke(AbstractC1426.m2904(1), num.intValue());
        }
        return gradientDrawable;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [yyds.ᛵᛸᛵᛲ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [yyds.ᛵᛸᛵᛲ] */
    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static final void m599(final Context context, final C0052 c0052, final CustomRecyclerView customRecyclerView, final LinearLayout linearLayout, final LinearLayout linearLayout2, final InterfaceC2266 interfaceC2266) {
        C1239.f5669.getClass();
        ArrayList arrayListM2527 = C1239.m2527(context);
        ((TextView) c0052.f551).setText(arrayListM2527.size() + AbstractC2328.m4341(-984921473188718L));
        if (arrayListM2527.isEmpty()) {
            customRecyclerView.setVisibility(8);
            linearLayout.setVisibility(0);
            linearLayout2.setVisibility(8);
            return;
        }
        customRecyclerView.setVisibility(0);
        linearLayout.setVisibility(8);
        linearLayout2.setVisibility(0);
        final int i = 0;
        ?? r0 = new InterfaceC1549() { // from class: yyds.ᛵᛸᛵᛲ
            @Override // yyds.InterfaceC1549
            /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
            public final native Object mo371(Object obj);
        };
        final int i2 = 1;
        customRecyclerView.setAdapter(new C1761(context, arrayListM2527, r0, new InterfaceC1549() { // from class: yyds.ᛵᛸᛵᛲ
            @Override // yyds.InterfaceC1549
            /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
            public final native Object mo371(Object obj);
        }));
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static final void m600(EnumMap enumMap, EnumC0868 enumC0868) {
        C1532 c1532 = (C1532) enumMap.get(enumC0868);
        if (c1532 == null) {
            return;
        }
        TextView textView = c1532.f7368;
        TextView textView2 = c1532.f7367;
        ImageView imageView = c1532.f7366;
        C0561 c0561 = C0561.f2672;
        Resources resources = imageView.getResources();
        AbstractC2328.m4341(-156465231463278L);
        Drawable drawableM1411 = C0561.m1411(resources, enumC0868);
        imageView.setImageDrawable(drawableM1411);
        boolean zM1408 = C0561.m1408(enumC0868);
        boolean z = drawableM1411 != null;
        textView2.setText(AbstractC2328.m4341(zM1408 ? -156542540874606L : -156559720743790L));
        textView2.setVisibility(z ? 8 : 0);
        textView.setText(z ? AbstractC2328.m4341(-156572605645678L) : zM1408 ? AbstractC2328.m4341(-156589785514862L) : AbstractC2328.m4341(-156611260351342L));
        textView.setTextColor(textView.getContext().getColor(z ? R.color.douyin_primary : R.color.secondary_text));
        c1532.f7364.setAlpha(zM1408 ? 1.0f : 0.45f);
        LinearLayout linearLayout = c1532.f7365;
        StringBuilder sb = new StringBuilder(enumC0868.f3984);
        sb.append(AbstractC2328.m4341(-156624145253230L));
        sb.append(AbstractC2328.m4341(zM1408 ? -156641325122414L : -156692864729966L));
        linearLayout.setContentDescription(sb.toString());
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static ArrayList m601(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC0940) obj) != EnumC0940.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0055.m419(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC0940) it.next()).f4332);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static final void m602(C0947 c0947, TextView textView, Context context, TextView textView2, C2133 c2133, TextView textView3, CustomRecyclerView customRecyclerView, CustomRecyclerView customRecyclerView2, LinearLayout linearLayout, int i) {
        C2454 c2454 = (C2454) c2133.f10553;
        c0947.f4410 = i;
        InterfaceC0274 interfaceC0274 = null;
        if (i == 0) {
            textView.setBackgroundResource(R.drawable.bg_ward_filter_selected);
            textView.setTextColor(context.getResources().getColor(R.color.white, null));
            textView2.setBackgroundResource(R.drawable.bg_ward_filter_normal);
            textView2.setTextColor(context.getResources().getColor(R.color.secondary_text, null));
            C1584 c1584 = new C1584(textView3, c2133, context, customRecyclerView, customRecyclerView2, linearLayout);
            AbstractC2328.m4341(-1140236080546670L);
            AbstractC2071.m3959(c2454, null, new C0219(c2133, c1584, interfaceC0274, 17), 3);
            return;
        }
        textView2.setBackgroundResource(R.drawable.bg_ward_filter_selected);
        textView2.setTextColor(context.getResources().getColor(R.color.white, null));
        textView.setBackgroundResource(R.drawable.bg_ward_filter_normal);
        textView.setTextColor(context.getResources().getColor(R.color.secondary_text, null));
        C1785 c1785 = new C1785(textView3, context, customRecyclerView2, customRecyclerView, linearLayout);
        AbstractC2328.m4341(-1140656987341678L);
        AbstractC2071.m3959(c2454, null, new C0219(c2133, c1785, interfaceC0274, 18), 3);
    }

    @Override // yyds.InterfaceC1454
    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public void mo603(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // yyds.InterfaceC2768
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public InterfaceC0894 mo382(C0644 c0644) {
        switch (this.f840) {
            case 5:
                return C1739.f8787;
            default:
                return new C1739(1);
        }
    }

    @Override // yyds.InterfaceC1434
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public Object mo384() {
        return new C1264();
    }

    @Override // yyds.InterfaceC2504
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Object mo604(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }

    @Override // yyds.InterfaceC2504
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public Class mo605() {
        return ByteBuffer.class;
    }

    @Override // yyds.InterfaceC1454
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public void mo606(MediaExtractor mediaExtractor, Object obj) throws IOException {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    @Override // yyds.InterfaceC2172
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public InterfaceC0732 mo607(String str) {
        return C1720.f8706;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public void m608(InterfaceC1212 interfaceC1212, Object obj) {
        C2770 c2770 = (C2770) obj;
        AbstractC2328.m4341(-301828399596398L);
        AbstractC2328.m4341(-301871349269358L);
        String str = c2770.f13510;
        interfaceC1212.mo434(1, str);
        interfaceC1212.mo434(2, c2770.f13511);
        interfaceC1212.mo434(3, c2770.f13516);
        interfaceC1212.mo434(4, c2770.f13518);
        interfaceC1212.mo434(5, c2770.f13509);
        interfaceC1212.mo434(6, c2770.f13517);
        interfaceC1212.mo435(7, c2770.f13512);
        interfaceC1212.mo435(8, c2770.f13507);
        String str2 = c2770.f13508;
        if (str2 == null) {
            interfaceC1212.mo432(9);
        } else {
            interfaceC1212.mo434(9, str2);
        }
        String str3 = c2770.f13515;
        if (str3 == null) {
            interfaceC1212.mo432(10);
        } else {
            interfaceC1212.mo434(10, str3);
        }
        String str4 = c2770.f13513;
        if (str4 == null) {
            interfaceC1212.mo432(11);
        } else {
            interfaceC1212.mo434(11, str4);
        }
        String str5 = c2770.f13514;
        if (str5 == null) {
            interfaceC1212.mo432(12);
        } else {
            interfaceC1212.mo434(12, str5);
        }
        interfaceC1212.mo434(13, str);
    }

    @Override // yyds.InterfaceC0503
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean mo609(String str) {
        return true;
    }

    @Override // yyds.InterfaceC1685
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public void mo610(Object obj) {
        ((List) obj).clear();
    }

    @Override // yyds.InterfaceC0017
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public void mo611(ArrayList arrayList) {
        AbstractC2328.m4341(-133083429503854L);
        AbstractC2328.m4341(-133134969111406L);
        arrayList.isEmpty();
    }

    public /* synthetic */ C0135(int i) {
        this.f840 = i;
    }

    public C0135(DialogInterfaceOnCancelListenerC2238 dialogInterfaceOnCancelListenerC2238) {
        this.f840 = 12;
    }
}
