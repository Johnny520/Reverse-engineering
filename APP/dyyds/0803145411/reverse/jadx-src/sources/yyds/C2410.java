package yyds;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.NativeUtil;
import com.p000ss.android.ugc.aweme.yyds.R;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.ugc.aweme.ImageUrlStruct;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: yyds.ᲇᛲᲇᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2410 implements InterfaceC1549 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f11846;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f11847;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f11848;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f11849;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f11850;

    public /* synthetic */ C2410(C2673 c2673, C1417 c1417, C0172 c0172, C0299 c0299) {
        this.f11848 = 4;
        this.f11846 = c1417;
        this.f11850 = c0172;
        this.f11849 = c2673;
        this.f11847 = c0299;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020f A[Catch: all -> 0x0200, TRY_LEAVE, TryCatch #0 {all -> 0x0200, blocks: (B:98:0x01f5, B:105:0x0205, B:107:0x020b, B:109:0x020f), top: B:321:0x01f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0224 A[PHI: r0
  0x0224: PHI (r0v138 android.app.Dialog) = (r0v22 android.app.Dialog), (r0v32 android.app.Dialog) binds: [B:117:0x0222, B:122:0x022f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0399 A[Catch: all -> 0x038a, TRY_LEAVE, TryCatch #6 {all -> 0x038a, blocks: (B:164:0x037f, B:171:0x038f, B:173:0x0395, B:175:0x0399), top: B:334:0x037f }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ea  */
    @Override // yyds.InterfaceC1549
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo371(Object obj) {
        final Object obj2;
        Object objM1376;
        Object c2658;
        Object obj3;
        Object c26582;
        boolean z;
        Dialog dialogM4411;
        Object obj4;
        final Object obj5;
        final Dialog dialog;
        final Object c26583;
        Object objInvoke;
        Object c26584;
        boolean z2;
        Boolean bool;
        Object obj6;
        Boolean boolValueOf;
        boolean zBooleanValue;
        View viewFindViewWithTag;
        View viewFindViewWithTag2;
        View viewM3479;
        C2746 c2746;
        Aweme aweme;
        Integer num;
        String strM4687;
        Object c26585;
        Object next;
        Object obj7;
        int i = this.f11848;
        final int i2 = 3;
        C2746 c27462 = C2746.f13459;
        boolean z3 = true;
        c2235M3386 = null;
        C2235 c2235M3386 = null;
        Object obj8 = this.f11847;
        Object obj9 = this.f11849;
        Object obj10 = this.f11850;
        Object obj11 = this.f11846;
        switch (i) {
            case 0:
                C1417 c1417 = (C1417) obj11;
                EditText editText = (EditText) obj9;
                View view = (View) obj8;
                Integer num2 = (Integer) obj;
                ((C0912) obj10).m2025();
                if (num2 != null) {
                    String strM4000 = AbstractC2104.m4000(new Object[]{Integer.valueOf(num2.intValue() & 16777215)}, 1, AbstractC2328.m4341(-170088867726190L), -170114637529966L);
                    C1509.f7142.getClass();
                    AbstractC2328.m4341(-26602600301422L);
                    C1509.f7237.m1581(C1509.f7179[69], strM4000);
                    c1417.f6702 = true;
                    editText.setText(strM4000);
                    c1417.f6702 = false;
                    C0644.m1541(view);
                    C1435.m2931(C1435.f6790);
                }
                break;
            case 1:
                Method method = (Method) obj10;
                Field field = (Field) obj11;
                Field field2 = (Field) obj9;
                Method method2 = (Method) obj8;
                C0488 c0488 = (C0488) obj;
                C2369 c2369 = C2369.f11673;
                AbstractC2328.m4341(-946240997720942L);
                C1509.f7142.getClass();
                if (((Boolean) C1509.f7123.m1579(C1509.f7179[123])).booleanValue()) {
                    Object obj12 = c0488.f2407;
                    ViewGroup viewGroup = obj12 instanceof ViewGroup ? (ViewGroup) obj12 : null;
                    if (viewGroup != null && (obj2 = c0488.f2405) != null) {
                        int i3 = AbstractC2293.f11258;
                        C1189 c1189M3892 = AbstractC0476.m1327(obj2).m3892();
                        c1189M3892.f5455 = AbstractC2328.m4341(-946309717197678L);
                        c1189M3892.m4478();
                        C0536 c0536 = (C0536) AbstractC1595.m3281(c1189M3892.mo736());
                        if (c0536 != null && (objM1376 = c0536.m1376(new Object[0])) != null) {
                            c2369.getClass();
                            if (method != null) {
                                try {
                                    if (!method.getDeclaringClass().isAssignableFrom(obj2.getClass())) {
                                        method = null;
                                    }
                                    Object objInvoke2 = method != null ? method.invoke(obj2, null) : null;
                                    c2658 = objInvoke2;
                                } catch (Throwable th) {
                                    c2658 = new C2658(th);
                                }
                                if (c2658 instanceof C2658) {
                                    c2658 = null;
                                }
                                if (field == null) {
                                    obj3 = null;
                                    c26582 = !(obj3 instanceof Dialog) ? (Dialog) obj3 : null;
                                    z = c26582 instanceof C2658;
                                    Object obj13 = c26582;
                                    if (z) {
                                        obj13 = null;
                                    }
                                    dialogM4411 = (Dialog) obj13;
                                    if (dialogM4411 == null && (c2658 == null || (dialogM4411 = C2369.m4411(c2658)) == null)) {
                                        final int i4 = 5;
                                        obj4 = obj2;
                                        obj5 = objM1376;
                                        dialogM4411 = (Dialog) AbstractC1529.m3161(AbstractC1529.m3164(AbstractC1529.m3164(AbstractC1529.m3157(AbstractC1529.m3160(new C2722(AbstractC1529.m3159(obj2.getClass(), new C0583(26)), new C0583(27), 2), new C0583(29)), new C0673(0)), new InterfaceC1549() { // from class: yyds.ᛴᲈᛶᲇ
                                            static {
                                                NativeUtil.classesInit0(98);
                                            }

                                            @Override // yyds.InterfaceC1549
                                            /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                                            public final native Object mo371(Object obj14);
                                        }), new C2635(1, c2369, C2369.class, AbstractC2328.m4341(-998025418408814L), AbstractC2328.m4341(-998072663049070L), 0, 12)));
                                    } else {
                                        obj4 = obj2;
                                        obj5 = objM1376;
                                    }
                                    dialog = dialogM4411;
                                    if (dialog != null) {
                                        C2336.f11496.m4354(AbstractC2328.m4341(-946627544777582L).concat(obj4.getClass().getName()));
                                    } else {
                                        final Aweme aweme2 = (Aweme) AbstractC0145.m671(obj5, AbstractC2328.m4341(-946803638436718L));
                                        if (aweme2 != null) {
                                            C2701 c2701 = C2701.f13261;
                                            String strM4341 = AbstractC2328.m4341(-946984027063150L);
                                            c2701.getClass();
                                            Integer num3 = (Integer) C2701.m4794(aweme2, strM4341);
                                            final Context context = dialog.getContext();
                                            AbstractC2328.m4341(-947039861637998L);
                                            C2701.m4807(context);
                                            if (field2 != null) {
                                                try {
                                                    if (!field2.getDeclaringClass().isInstance(obj5)) {
                                                        field2 = null;
                                                    }
                                                    Object obj14 = field2 != null ? field2.get(obj5) : null;
                                                    c26583 = obj14;
                                                } catch (Throwable th2) {
                                                    c26583 = new C2658(th2);
                                                }
                                                if (c26583 instanceof C2658) {
                                                    c26583 = null;
                                                }
                                                if (c26583 == null) {
                                                    Field[] declaredFields = obj5.getClass().getDeclaredFields();
                                                    AbstractC2328.m4341(-944780708840302L);
                                                    final int i5 = 4;
                                                    C1119 c1119 = new C1119(AbstractC1529.m3164(AbstractC1529.m3157(AbstractC2070.m3935(declaredFields), new C0583(25)), new InterfaceC1549() { // from class: yyds.ᛴᲈᛶᲇ
                                                        static {
                                                            NativeUtil.classesInit0(98);
                                                        }

                                                        @Override // yyds.InterfaceC1549
                                                        /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                                                        public final native Object mo371(Object obj142);
                                                    }));
                                                    while (true) {
                                                        if (c1119.hasNext()) {
                                                            c26583 = c1119.next();
                                                            try {
                                                                c26585 = Boolean.valueOf(c26583.toString().startsWith(AbstractC2328.m4341(-944879493088110L)));
                                                            } catch (Throwable th3) {
                                                                c26585 = new C2658(th3);
                                                            }
                                                            Boolean bool2 = Boolean.FALSE;
                                                            boolean z4 = c26585 instanceof C2658;
                                                            Object obj15 = c26585;
                                                            if (z4) {
                                                                obj15 = bool2;
                                                            }
                                                            if (((Boolean) obj15).booleanValue()) {
                                                            }
                                                        } else {
                                                            c26583 = null;
                                                        }
                                                    }
                                                }
                                                if (method2 == null) {
                                                    objInvoke = null;
                                                    c26584 = !(objInvoke instanceof Boolean) ? (Boolean) objInvoke : null;
                                                    z2 = c26584 instanceof C2658;
                                                    Object obj16 = c26584;
                                                    if (z2) {
                                                        obj16 = null;
                                                    }
                                                    bool = (Boolean) obj16;
                                                    if (bool == null) {
                                                        zBooleanValue = bool.booleanValue();
                                                    } else if (c26583 == null) {
                                                        boolValueOf = null;
                                                        if (boolValueOf == null) {
                                                            zBooleanValue = boolValueOf.booleanValue();
                                                        } else {
                                                            zBooleanValue = (context.getResources().getConfiguration().uiMode & 48) == 32;
                                                            C2336.f11496.m4354(AbstractC2328.m4341(-944574550410094L) + c26583 + AbstractC2328.m4341(-944746349101934L) + zBooleanValue);
                                                        }
                                                    } else {
                                                        Field[] declaredFields2 = c26583.getClass().getDeclaredFields();
                                                        AbstractC2328.m4341(-945059881714542L);
                                                        C0497 c0497M3164 = AbstractC1529.m3164(AbstractC1529.m3163(AbstractC2070.m3935(declaredFields2), new C0583(24)), new InterfaceC1549() { // from class: yyds.ᛴᲈᛶᲇ
                                                            static {
                                                                NativeUtil.classesInit0(98);
                                                            }

                                                            @Override // yyds.InterfaceC1549
                                                            /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                                                            public final native Object mo371(Object obj142);
                                                        });
                                                        C1094 c1094 = C1094.f5060;
                                                        C1119 c11192 = new C1119(c0497M3164);
                                                        while (true) {
                                                            if (c11192.hasNext()) {
                                                                obj6 = c1094.get(c11192.next());
                                                                String str = (String) obj6;
                                                                if (AbstractC1544.m3188(str, AbstractC2328.m4341(-945158665962350L)) || AbstractC1544.m3188(str, AbstractC2328.m4341(-945180140798830L))) {
                                                                }
                                                            } else {
                                                                obj6 = null;
                                                            }
                                                        }
                                                        String str2 = (String) obj6;
                                                        if (str2 != null) {
                                                            boolValueOf = Boolean.valueOf(str2.equals(AbstractC2328.m4341(-945205910602606L)));
                                                        }
                                                        if (boolValueOf == null) {
                                                        }
                                                    }
                                                    C2701.f13261.getClass();
                                                    LayoutInflater layoutInflaterFrom = LayoutInflater.from(C2701.m4796(context, zBooleanValue));
                                                    viewFindViewWithTag = viewGroup.findViewWithTag(AbstractC2328.m4341(-947108581114734L));
                                                    if (viewFindViewWithTag != null) {
                                                        viewGroup.removeView(viewFindViewWithTag);
                                                    }
                                                    viewFindViewWithTag2 = viewGroup.findViewWithTag(AbstractC2328.m4341(-947293264708462L));
                                                    if (viewFindViewWithTag2 != null) {
                                                        viewGroup.removeView(viewFindViewWithTag2);
                                                    }
                                                    View viewInflate = layoutInflaterFrom.inflate(R.layout.long_press_dialog_layout, viewGroup, false);
                                                    viewInflate.setTag(AbstractC2328.m4341(-947477948302190L));
                                                    viewGroup.addView(viewInflate, 0);
                                                    List list = aweme2.images;
                                                    View viewInflate2 = layoutInflaterFrom.inflate(R.layout.long_press_photo_layout, viewGroup, false);
                                                    viewInflate2.setTag(AbstractC2328.m4341(-947662631895918L));
                                                    int i6 = R.id.divider;
                                                    viewM3479 = AbstractC1741.m3479(viewInflate2, R.id.divider);
                                                    if (viewM3479 != null) {
                                                        i6 = R.id.live;
                                                        ImageView imageView = (ImageView) AbstractC1741.m3479(viewInflate2, R.id.live);
                                                        if (imageView != null) {
                                                            i6 = R.id.llWard;
                                                            LinearLayout linearLayout = (LinearLayout) AbstractC1741.m3479(viewInflate2, R.id.llWard);
                                                            if (linearLayout != null) {
                                                                LinearLayout linearLayout2 = (LinearLayout) AbstractC1741.m3479(viewInflate2, R.id.llWardList);
                                                                if (linearLayout2 != null) {
                                                                    TextView textView = (TextView) AbstractC1741.m3479(viewInflate2, R.id.save);
                                                                    if (textView != null) {
                                                                        LinearLayout linearLayout3 = (LinearLayout) AbstractC1741.m3479(viewInflate2, R.id.save_emoji);
                                                                        if (linearLayout3 != null) {
                                                                            ImageView imageView2 = (ImageView) AbstractC1741.m3479(viewInflate2, R.id.video);
                                                                            if (imageView2 != null) {
                                                                                c2746 = c27462;
                                                                                ImageView imageView3 = (ImageView) AbstractC1741.m3479(viewInflate2, R.id.ward_icon);
                                                                                if (imageView3 == null) {
                                                                                    i6 = R.id.ward_icon;
                                                                                } else if (((TextView) AbstractC1741.m3479(viewInflate2, R.id.ward_list_text_view)) != null) {
                                                                                    TextView textView2 = (TextView) AbstractC1741.m3479(viewInflate2, R.id.ward_text_view);
                                                                                    if (textView2 != null) {
                                                                                        AbstractC2328.m4341(-947847315489646L);
                                                                                        viewGroup.addView(viewInflate2, 1);
                                                                                        linearLayout3.setVisibility(8);
                                                                                        viewM3479.setVisibility(8);
                                                                                        C2133 c2133M3850 = C2133.f10546.m3850(context);
                                                                                        String str3 = aweme2.aid;
                                                                                        AbstractC2328.m4341(-947890265162606L);
                                                                                        final boolean zM4054 = c2133M3850.m4054(str3, AbstractC2328.m4341(-947907445031790L));
                                                                                        textView2.setText(AbstractC2328.m4341(zM4054 ? -947920329933678L : -947941804770158L));
                                                                                        AbstractC2328.m4341(-947963279606638L);
                                                                                        if (zM4054) {
                                                                                            imageView3.setImageResource(R.drawable.diaoxie);
                                                                                        } else {
                                                                                            imageView3.setImageResource(R.drawable.dihua);
                                                                                        }
                                                                                        final int i7 = 1;
                                                                                        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: yyds.ᛶᛶᛴᲈ
                                                                                            static {
                                                                                                NativeUtil.classesInit0(60);
                                                                                            }

                                                                                            @Override // android.view.View.OnClickListener
                                                                                            public final native void onClick(View view2);
                                                                                        });
                                                                                        final int i8 = 1;
                                                                                        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: yyds.ᛵᲀᛱᛳ
                                                                                            static {
                                                                                                NativeUtil.classesInit0(82);
                                                                                            }

                                                                                            @Override // android.view.View.OnClickListener
                                                                                            public final native void onClick(View view2);
                                                                                        });
                                                                                        if (num3 == null || num3.intValue() < 0 || list == null || list.isEmpty()) {
                                                                                            aweme = aweme2;
                                                                                        } else {
                                                                                            try {
                                                                                                linearLayout3.setVisibility(0);
                                                                                                viewM3479.setVisibility(0);
                                                                                                ImageUrlStruct imageUrlStruct = (ImageUrlStruct) list.get(num3.intValue());
                                                                                                if (list.size() > 1) {
                                                                                                    textView.setText(AbstractC2328.m4341(-948001934312302L) + (num3.intValue() + 1) + AbstractC2328.m4341(-948019114181486L));
                                                                                                } else {
                                                                                                    textView.setText(AbstractC2328.m4341(-948036294050670L));
                                                                                                }
                                                                                                List list2 = imageUrlStruct.urlList;
                                                                                                ArrayList arrayList = new ArrayList();
                                                                                                for (Object obj17 : list2) {
                                                                                                    String str4 = (String) obj17;
                                                                                                    if (AbstractC0473.m1301(str4, AbstractC2328.m4341(-948057768887150L), false) || AbstractC0473.m1301(str4, AbstractC2328.m4341(-948083538690926L), false) || AbstractC0473.m1301(str4, AbstractC2328.m4341(-948105013527406L), false)) {
                                                                                                        arrayList.add(obj17);
                                                                                                    }
                                                                                                }
                                                                                                if (!arrayList.isEmpty()) {
                                                                                                    list2 = arrayList;
                                                                                                }
                                                                                                if (list2.isEmpty()) {
                                                                                                    Map map = C2609.f12814;
                                                                                                    strM4687 = C2609.m4687(imageUrlStruct.video);
                                                                                                } else {
                                                                                                    strM4687 = (String) AbstractC1595.m3280(list2);
                                                                                                }
                                                                                                textView.setVisibility(0);
                                                                                                final String str5 = strM4687;
                                                                                                try {
                                                                                                    aweme = aweme2;
                                                                                                    try {
                                                                                                        textView.setOnClickListener(new ViewOnClickListenerC0257(dialog, context, str5, aweme2, 12));
                                                                                                        Map map2 = C2609.f12814;
                                                                                                        List listM4683 = C2609.m4683(imageUrlStruct.video);
                                                                                                        if (listM4683 == null || listM4683.isEmpty()) {
                                                                                                            imageView2.setVisibility(8);
                                                                                                            imageView.setVisibility(8);
                                                                                                        } else {
                                                                                                            final String strM46872 = C2609.m4687(imageUrlStruct.video);
                                                                                                            imageView2.setVisibility(0);
                                                                                                            imageView.setVisibility(0);
                                                                                                            final int i9 = 1;
                                                                                                            imageView.setOnClickListener(new View.OnClickListener() { // from class: yyds.ᛳᛱᛱᛷ
                                                                                                                static {
                                                                                                                    NativeUtil.classesInit0(30);
                                                                                                                }

                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final native void onClick(View view2);
                                                                                                            });
                                                                                                            imageView2.setOnClickListener(new ViewOnClickListenerC0211(dialog, context, strM46872, 2));
                                                                                                        }
                                                                                                    } catch (Exception e) {
                                                                                                        e = e;
                                                                                                        C2336.f11496.m4355(AbstractC2328.m4341(-948130783331182L), e);
                                                                                                    }
                                                                                                } catch (Exception e2) {
                                                                                                    e = e2;
                                                                                                    aweme = aweme2;
                                                                                                }
                                                                                            } catch (Exception e3) {
                                                                                                e = e3;
                                                                                                aweme = aweme2;
                                                                                            }
                                                                                        }
                                                                                        ((LinearLayout) viewInflate.findViewById(R.id.music_view)).setOnClickListener(new ViewOnClickListenerC0344(dialog, context, aweme, 2));
                                                                                        LinearLayout linearLayout4 = (LinearLayout) viewInflate.findViewById(R.id.video_view);
                                                                                        if (aweme.awemeType == 68 || (num = aweme.duration) == null || num.intValue() <= 0) {
                                                                                            linearLayout4.setVisibility(8);
                                                                                        } else {
                                                                                            linearLayout4.setVisibility(0);
                                                                                            linearLayout4.setOnClickListener(new ViewOnClickListenerC0344(dialog, context, aweme, 3));
                                                                                        }
                                                                                        LinearLayout linearLayout5 = (LinearLayout) viewInflate.findViewById(R.id.image_view);
                                                                                        linearLayout5.setOnClickListener(new ViewOnClickListenerC0344(context, aweme, dialog));
                                                                                        LinearLayout linearLayout6 = (LinearLayout) viewInflate.findViewById(R.id.info_view);
                                                                                        linearLayout6.setOnClickListener(new ViewOnClickListenerC0344(dialog, context, aweme, 1));
                                                                                        linearLayout6.setOnLongClickListener(new ViewOnLongClickListenerC1733(aweme, 3, dialog));
                                                                                        List list3 = aweme.images;
                                                                                        if (list3 == null || list3.isEmpty()) {
                                                                                            linearLayout5.setVisibility(8);
                                                                                        }
                                                                                        final int i10 = 2;
                                                                                        ((LinearLayout) viewInflate.findViewById(R.id.setting_view)).setOnClickListener(new View.OnClickListener() { // from class: yyds.ᛶᛶᛴᲈ
                                                                                            static {
                                                                                                NativeUtil.classesInit0(60);
                                                                                            }

                                                                                            @Override // android.view.View.OnClickListener
                                                                                            public final native void onClick(View view2);
                                                                                        });
                                                                                    } else {
                                                                                        i6 = R.id.ward_text_view;
                                                                                    }
                                                                                } else {
                                                                                    i6 = R.id.ward_list_text_view;
                                                                                }
                                                                            } else {
                                                                                i6 = R.id.video;
                                                                            }
                                                                        } else {
                                                                            i6 = R.id.save_emoji;
                                                                        }
                                                                    } else {
                                                                        i6 = R.id.save;
                                                                    }
                                                                } else {
                                                                    i6 = R.id.llWardList;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    C0188.m789(AbstractC2328.m4341(-1743039035507566L).concat(viewInflate2.getResources().getResourceName(i6)));
                                                    break;
                                                } else if (c26583 != null) {
                                                    try {
                                                        if (!method2.getDeclaringClass().isInstance(c26583)) {
                                                            method2 = null;
                                                        }
                                                        if (method2 != null) {
                                                            objInvoke = method2.invoke(c26583, null);
                                                        }
                                                        if (!(objInvoke instanceof Boolean)) {
                                                        }
                                                    } catch (Throwable th4) {
                                                        c26584 = new C2658(th4);
                                                    }
                                                    z2 = c26584 instanceof C2658;
                                                    Object obj162 = c26584;
                                                    if (z2) {
                                                    }
                                                    bool = (Boolean) obj162;
                                                    if (bool == null) {
                                                    }
                                                    C2701.f13261.getClass();
                                                    LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(C2701.m4796(context, zBooleanValue));
                                                    viewFindViewWithTag = viewGroup.findViewWithTag(AbstractC2328.m4341(-947108581114734L));
                                                    if (viewFindViewWithTag != null) {
                                                    }
                                                    viewFindViewWithTag2 = viewGroup.findViewWithTag(AbstractC2328.m4341(-947293264708462L));
                                                    if (viewFindViewWithTag2 != null) {
                                                    }
                                                    View viewInflate3 = layoutInflaterFrom2.inflate(R.layout.long_press_dialog_layout, viewGroup, false);
                                                    viewInflate3.setTag(AbstractC2328.m4341(-947477948302190L));
                                                    viewGroup.addView(viewInflate3, 0);
                                                    List list4 = aweme2.images;
                                                    View viewInflate22 = layoutInflaterFrom2.inflate(R.layout.long_press_photo_layout, viewGroup, false);
                                                    viewInflate22.setTag(AbstractC2328.m4341(-947662631895918L));
                                                    int i62 = R.id.divider;
                                                    viewM3479 = AbstractC1741.m3479(viewInflate22, R.id.divider);
                                                    if (viewM3479 != null) {
                                                    }
                                                    C0188.m789(AbstractC2328.m4341(-1743039035507566L).concat(viewInflate22.getResources().getResourceName(i62)));
                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                    }
                                    c2746 = c27462;
                                    break;
                                } else if (c2658 != null) {
                                    try {
                                        if (!field.getDeclaringClass().isInstance(c2658)) {
                                            field = null;
                                        }
                                        if (field != null) {
                                            obj3 = field.get(c2658);
                                        }
                                        if (!(obj3 instanceof Dialog)) {
                                        }
                                    } catch (Throwable th5) {
                                        c26582 = new C2658(th5);
                                    }
                                    z = c26582 instanceof C2658;
                                    Object obj132 = c26582;
                                    if (z) {
                                    }
                                    dialogM4411 = (Dialog) obj132;
                                    if (dialogM4411 == null) {
                                        final int i42 = 5;
                                        obj4 = obj2;
                                        obj5 = objM1376;
                                        dialogM4411 = (Dialog) AbstractC1529.m3161(AbstractC1529.m3164(AbstractC1529.m3164(AbstractC1529.m3157(AbstractC1529.m3160(new C2722(AbstractC1529.m3159(obj2.getClass(), new C0583(26)), new C0583(27), 2), new C0583(29)), new C0673(0)), new InterfaceC1549() { // from class: yyds.ᛴᲈᛶᲇ
                                            static {
                                                NativeUtil.classesInit0(98);
                                            }

                                            @Override // yyds.InterfaceC1549
                                            /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                                            public final native Object mo371(Object obj142);
                                        }), new C2635(1, c2369, C2369.class, AbstractC2328.m4341(-998025418408814L), AbstractC2328.m4341(-998072663049070L), 0, 12)));
                                        dialog = dialogM4411;
                                        if (dialog != null) {
                                        }
                                        c2746 = c27462;
                                    }
                                }
                                break;
                            }
                        }
                    }
                } else {
                    c2746 = c27462;
                }
                break;
            case 2:
                InterfaceC0477 interfaceC0477 = (InterfaceC0477) obj11;
                C0903 c0903 = (C0903) obj9;
                String str6 = (String) obj8;
                if ((obj10 instanceof Collection) && ((Collection) obj10).isEmpty()) {
                    obj10 = null;
                }
                if (obj10 != null) {
                    boolean zBooleanValue2 = ((Boolean) interfaceC0477.mo511(obj10, obj)).booleanValue();
                    if (c0903.f4118 != 3 && AbstractC2104.m4012(AbstractC2003.f10026) <= 0) {
                        String strM1061 = AbstractC0364.m1061(obj10);
                        String str7 = "[FILTER] [" + (zBooleanValue2 ? "HIT" : "MISS") + "] " + str6 + ": " + (strM1061 != null ? AbstractC0692.m1598(strM1061.toString(), " (Kotlin reflection is not available)", "") : null) + " [RESOLVED] " + (obj != null ? AbstractC0692.m1598(obj.toString(), " (Kotlin reflection is not available)", "") : null);
                        if (AbstractC2104.m4012(AbstractC2003.f10026) <= AbstractC2104.m4012(1)) {
                            AbstractC2003.f10025.getClass();
                            if (((Boolean) AbstractC2003.f10024.getValue()).booleanValue()) {
                                Log.d("KavaRef", str7, null);
                            } else {
                                ((InterfaceC0732) AbstractC2003.f10023.getValue()).mo1686(str7);
                            }
                        }
                    }
                    z3 = zBooleanValue2;
                }
                break;
            case 3:
                Method method3 = (Method) obj10;
                Method method4 = (Method) obj11;
                Method method5 = (Method) obj9;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj8;
                C0488 c04882 = (C0488) obj;
                AbstractC2328.m4341(-904777383445358L);
                C0813 c0813 = C0813.f3738;
                LinkedHashSet linkedHashSetM3095 = C1509.m3095(C1509.f7142);
                c0813.getClass();
                C0919 c0919M1876 = C0813.m1876(linkedHashSetM3095);
                if (!c0919M1876.m2037()) {
                    Iterator it = c04882.f2406.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (next instanceof Uri) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    Uri uri = next instanceof Uri ? (Uri) next : null;
                    C0813.f3738.getClass();
                    if (C0813.m1879(uri)) {
                        C0979.m2124(method3, method4, method5, atomicBoolean, c04882.f2407, c0919M1876, null);
                    }
                }
                break;
            default:
                C1417 c14172 = (C1417) obj11;
                C0172 c0172 = (C0172) obj10;
                C2673 c2673 = (C2673) obj9;
                C0299 c0299 = (C0299) obj8;
                String str8 = (String) obj;
                c14172.f6702 = false;
                C1664.f8513.getClass();
                C1101 c1101M3404 = C1664.m3404();
                if (c1101M3404 != null && (obj7 = c1101M3404.f5066.get()) != null) {
                    c2235M3386 = C1664.m3386(obj7, false);
                }
                if (c2235M3386 != null) {
                    AbstractC1917.m3697(c0172, c2673, c0299, c14172, c2235M3386);
                }
                if (str8 != null) {
                    AbstractC1960.m3789(str8);
                }
                break;
        }
        return c27462;
    }

    public /* synthetic */ C2410(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f11848 = i;
        this.f11850 = obj;
        this.f11846 = obj2;
        this.f11849 = obj3;
        this.f11847 = obj4;
    }
}
