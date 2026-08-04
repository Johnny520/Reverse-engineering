package yyds;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.NativeUtil;
import com.p000ss.android.ugc.aweme.yyds.R;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: yyds.ᛱᛵᛱᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C0119 implements InterfaceC1749, InterfaceC0396, InterfaceC0306, InterfaceC2614, InterfaceC1095 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Object f810;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f811;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object f812;

    public C0119(String str, String str2, String str3) {
        this.f811 = 16;
        AbstractC2328.m4341(-755991126377326L);
        AbstractC2328.m4341(-756012601213806L);
        AbstractC2328.m4341(-756051255919470L);
        C2174 c2174 = new C2174(str, str2, str3);
        AbstractC2328.m4341(-755961061606254L);
        this.f812 = c2174;
        this.f810 = new C0078(new C0824(19));
        C0526 c0526M550 = m550();
        C1284 c1284 = c0526M550.f2527;
        c1284.getClass();
        C2787 c2787 = new C2787();
        c2787.f13619 = c1284.f5903;
        c2787.f13623 = c1284.f5895;
        AbstractC1432.m2928(c1284.f5907, c2787.f13635);
        AbstractC1432.m2928(c1284.f5919, c2787.f13638);
        c2787.f13617 = c1284.f5922;
        c2787.f13637 = c1284.f5901;
        c2787.f13627 = c1284.f5921;
        c2787.f13616 = c1284.f5897;
        c2787.f13633 = c1284.f5900;
        c2787.f13630 = c1284.f5917;
        c2787.f13631 = c1284.f5914;
        c2787.f13614 = c1284.f5915;
        c2787.f13612 = c1284.f5898;
        c2787.f13621 = c1284.f5896;
        c2787.f13636 = c1284.f5905;
        c2787.f13626 = c1284.f5920;
        c2787.f13622 = c1284.f5910;
        c2787.f13634 = c1284.f5906;
        c2787.f13620 = c1284.f5918;
        c2787.f13629 = c1284.f5904;
        c2787.f13628 = c1284.f5913;
        c2787.f13625 = c1284.f5912;
        c2787.f13618 = c1284.f5909;
        c2787.f13639 = c1284.f5902;
        c2787.f13624 = c1284.f5923;
        c2787.f13615 = c1284.f5908;
        c2787.f13632 = c1284.f5899;
        c2787.f13611 = c1284.f5916;
        C2133 c2133 = new C2133(10, false);
        c2133.f10555 = c2174.f10657;
        c2133.f10553 = c2174.f10658;
        c2787.f13613 = c2133;
        c0526M550.f2527 = new C1284(c2787);
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public static final void m532(C0172 c0172, C2531 c2531, int i, C1467 c1467) {
        Window window;
        View decorView;
        ViewOverlay overlay;
        Activity topActivity = ActivityStack.getTopActivity();
        int i2 = c1467.f6979;
        String str = c1467.f6978;
        View viewM3299 = AbstractC0024.m3299(i2);
        if (topActivity == null || viewM3299 == null) {
            AbstractC1960.m3789(AbstractC2328.m4341(-201978999898990L).concat(str));
            return;
        }
        AbstractC2328.m4341(-195197246538606L);
        AbstractC2328.m4341(-195235901244270L);
        if (viewM3299.isAttachedToWindow() && viewM3299.getWidth() > 0 && viewM3299.getHeight() > 0 && (window = topActivity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            if (viewM3299.getGlobalVisibleRect(rect) && !rect.isEmpty() && decorView.getGlobalVisibleRect(rect2)) {
                int color = topActivity.getColor(R.color.douyin_primary);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(AbstractC1426.m2904(8));
                gradientDrawable.setColor((16777215 & color) | 436207616);
                gradientDrawable.setStroke(AbstractC1426.m2904(2), color);
                int i3 = rect.left;
                int i4 = rect2.left;
                int i5 = rect.top;
                int i6 = rect2.top;
                gradientDrawable.setBounds(i3 - i4, i5 - i6, rect.right - i4, rect.bottom - i6);
                GradientDrawable gradientDrawable2 = AbstractC0598.f2827;
                if (gradientDrawable2 != null) {
                    View view = AbstractC0598.f2826;
                    if (view != null && (overlay = view.getOverlay()) != null) {
                        overlay.remove(gradientDrawable2);
                    }
                    AbstractC0598.f2827 = null;
                    AbstractC0598.f2826 = null;
                }
                decorView.getOverlay().add(gradientDrawable);
                AbstractC0598.f2826 = decorView;
                AbstractC0598.f2827 = gradientDrawable;
                c0172.f997 = c1467.f6975;
                m537(c2531, c0172, i);
                return;
            }
        }
        AbstractC1960.m3789(AbstractC2328.m4341(-202013359637358L).concat(str));
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static String m533(String str, boolean z) {
        String strM1598 = AbstractC0692.m1598(AbstractC0692.m1598(AbstractC0692.m1598(AbstractC0692.m1598(AbstractC0692.m1598(AbstractC0692.m1598(AbstractC0692.m1598(str, AbstractC2328.m4341(-757202307154798L), AbstractC2328.m4341(-757210897089390L)), AbstractC2328.m4341(-757228076958574L), AbstractC2328.m4341(-757236666893166L)), AbstractC2328.m4341(-757253846762350L), AbstractC2328.m4341(-757262436696942L)), AbstractC2328.m4341(-757279616566126L), AbstractC2328.m4341(-757288206500718L)), AbstractC2328.m4341(-757305386369902L), AbstractC2328.m4341(-757313976304494L)), AbstractC2328.m4341(-757331156173678L), AbstractC2328.m4341(-757339746108270L)), AbstractC2328.m4341(-757356925977454L), AbstractC2328.m4341(-757365515912046L));
        String strM15982 = AbstractC0692.m1598(Pattern.compile(AbstractC2328.m4341(-757382695781230L)).matcher(strM1598).replaceAll(AbstractC2328.m4341(-757408465585006L)), AbstractC2328.m4341(-757417055519598L), AbstractC2328.m4341(-757429940421486L));
        return z ? AbstractC0473.m1315(strM15982, AbstractC2328.m4341(-757447120290670L)).concat("/") : AbstractC0473.m1315(strM15982, AbstractC2328.m4341(-757455710225262L));
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static C2623 m534(String str, InterfaceC0845... interfaceC0845Arr) {
        try {
            C0394 c0394 = new C0394(str);
            c0394.m1121();
            if (str.charAt(0) != '$' && str.charAt(0) != '@') {
                c0394 = new C0394("$.".concat(str));
                c0394.m1121();
            }
            if (c0394.m1123('.')) {
                m538("Path must not end with a '.' or '..'");
                throw null;
            }
            return new C0119(c0394, 1, new LinkedList(Arrays.asList(interfaceC0845Arr))).m545();
        } catch (Exception e) {
            if (e instanceof C2569) {
                throw ((C2569) e);
            }
            throw new C2569(e);
        }
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public static final void m535(C0172 c0172, C2531 c2531, C0172 c01722, Context context, int i) {
        List listSingletonList;
        ViewOverlay overlay;
        C2531 c25312 = c2531;
        C2256.f11106.getClass();
        C1125 c1125 = new C1125(new C2722(AbstractC1529.m3163(new C0558(1, AbstractC0606.f19), new C2200(2)), new C2200(3), 0), new C2200(4));
        C1300 c1300 = new C1300(24);
        ArrayList arrayListM3162 = AbstractC1529.m3162(c1125);
        AbstractC0405.m1162(arrayListM3162, c1300);
        Iterator it = arrayListM3162.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                listSingletonList = arrayList;
            } else {
                listSingletonList = Collections.singletonList(next);
            }
        } else {
            listSingletonList = C1860.f9345;
        }
        c0172.f997 = listSingletonList;
        boolean zIsEmpty = listSingletonList.isEmpty();
        ScrollView scrollView = (ScrollView) c25312.f12464;
        LinearLayout linearLayout = (LinearLayout) c25312.f12465;
        AbstractC2328.m4341(-202232402969454L);
        scrollView.setVisibility(!zIsEmpty ? 0 : 8);
        LinearLayout linearLayout2 = (LinearLayout) c25312.f12462;
        AbstractC2328.m4341(-202301122446190L);
        linearLayout2.setVisibility(zIsEmpty ? 0 : 8);
        if (zIsEmpty) {
            c01722.f997 = null;
            linearLayout.removeAllViews();
            GradientDrawable gradientDrawable = AbstractC0598.f2827;
            if (gradientDrawable != null) {
                View view = AbstractC0598.f2826;
                if (view != null && (overlay = view.getOverlay()) != null) {
                    overlay.remove(gradientDrawable);
                }
                AbstractC0598.f2827 = null;
                AbstractC0598.f2826 = null;
            }
        } else {
            Iterable iterable = (Iterable) c0172.f997;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                c01722.f997 = null;
            } else {
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    if (((C1467) it2.next()).f6975.equals(c01722.f997)) {
                        break;
                    }
                }
                c01722.f997 = null;
            }
        }
        linearLayout.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        for (C1467 c1467 : (Iterable) c0172.f997) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_video_menu_preview, (ViewGroup) linearLayout, false);
            int i2 = R.id.btn_toggle_visibility;
            TextView textView = (TextView) AbstractC1741.m3479(viewInflate, R.id.btn_toggle_visibility);
            if (textView != null) {
                i2 = R.id.layout_item_state;
                if (((LinearLayout) AbstractC1741.m3479(viewInflate, R.id.layout_item_state)) != null) {
                    i2 = R.id.seekbar_alpha;
                    SeekBar seekBar = (SeekBar) AbstractC1741.m3479(viewInflate, R.id.seekbar_alpha);
                    if (seekBar != null) {
                        i2 = R.id.tv_alpha_value;
                        TextView textView2 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_alpha_value);
                        if (textView2 != null) {
                            i2 = R.id.tv_menu_class;
                            TextView textView3 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_menu_class);
                            if (textView3 != null) {
                                i2 = R.id.tv_menu_meta;
                                TextView textView4 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_menu_meta);
                                if (textView4 != null) {
                                    i2 = R.id.tv_menu_name;
                                    TextView textView5 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_menu_name);
                                    if (textView5 != null) {
                                        i2 = R.id.tv_menu_status;
                                        TextView textView6 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_menu_status);
                                        if (textView6 != null) {
                                            TextView textView7 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_menu_visibility);
                                            if (textView7 != null) {
                                                RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                                                C0103 c0103 = new C0103(relativeLayout, textView, seekBar, textView2, textView3, textView4, textView5, textView6, textView7);
                                                AbstractC2328.m4341(-202176568394606L);
                                                relativeLayout.setTag(c1467);
                                                relativeLayout.setTag(R.id.tv_menu_status, c0103);
                                                C2256 c2256 = C2256.f11106;
                                                boolean zEquals = c1467.f6975.equals(c01722.f997);
                                                c2256.getClass();
                                                C2256.m4255(c0103, c1467, zEquals, i);
                                                relativeLayout.setOnClickListener(new ViewOnClickListenerC0867(c01722, c25312, context, i));
                                                textView.setOnClickListener(new ViewOnClickListenerC2796(c0103, c01722, c25312, context, i));
                                                seekBar.setOnSeekBarChangeListener(new C1430(c0103, context, c01722, i));
                                                linearLayout.addView(relativeLayout);
                                                c25312 = c2531;
                                            } else {
                                                i2 = R.id.tv_menu_visibility;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C0188.m789(AbstractC2328.m4341(-1741625991267182L).concat(viewInflate.getResources().getResourceName(i2)));
            return;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public static final void m536(C0172 c0172, C0172 c01722, C2531 c2531, int i, int i2) {
        if (((List) c0172.f997).isEmpty()) {
            AbstractC1960.m3789(AbstractC2328.m4341(-202043424408430L));
            return;
        }
        Iterator it = ((List) c0172.f997).iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else if (((C1467) it.next()).f6975.equals(c01722.f997)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1) {
            m532(c01722, c2531, i, (C1467) ((List) c0172.f997).get(i2 < 0 ? AbstractC2725.m4850((List) c0172.f997) : 0));
            return;
        }
        int i4 = i3 + i2;
        if (i4 < 0) {
            AbstractC1960.m3789(AbstractC2328.m4341(-202077784146798L));
        } else if (i4 > AbstractC2725.m4850((List) c0172.f997)) {
            AbstractC1960.m3789(AbstractC2328.m4341(-202107848917870L));
        } else {
            m532(c01722, c2531, i, (C1467) ((List) c0172.f997).get(i4));
        }
    }

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public static final void m537(C2531 c2531, C0172 c0172, int i) {
        LinearLayout linearLayout = (LinearLayout) c2531.f12465;
        int childCount = linearLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = linearLayout.getChildAt(i2);
            Object tag = childAt.getTag(R.id.tv_menu_status);
            C0103 c0103 = tag instanceof C0103 ? (C0103) tag : null;
            if (c0103 != null) {
                Object tag2 = childAt.getTag();
                C1467 c1467 = tag2 instanceof C1467 ? (C1467) tag2 : null;
                if (c1467 != null) {
                    C2256 c2256 = C2256.f11106;
                    boolean zEquals = c1467.f6975.equals(c0172.f997);
                    c2256.getClass();
                    C2256.m4255(c0103, c1467, zEquals, i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static void m538(String str) {
        throw new C2569(str);
    }

    public String toString() {
        switch (this.f811) {
            case 3:
                String str = "[ ";
                if (((C0972) this.f812) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C0972) this.f812).f4461[i] + " ";
                    }
                }
                return str + "] " + ((C0972) this.f812);
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public void m539(int i) {
        int[] iArr = (int[]) this.f812;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f812 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f812 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f812;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public void m540(AbstractC0185 abstractC0185) {
        C2010 c2010 = (C2010) this.f810;
        int iM3887 = c2010.m3887() - 1;
        while (true) {
            if (iM3887 < 0) {
                break;
            }
            if (abstractC0185 == c2010.m3883(iM3887)) {
                Object[] objArr = c2010.f10066;
                Object obj = objArr[iM3887];
                Object obj2 = AbstractC0902.f4114;
                if (obj != obj2) {
                    objArr[iM3887] = obj2;
                    c2010.f10067 = true;
                }
            } else {
                iM3887--;
            }
        }
        C2229 c2229 = (C2229) ((C0988) this.f812).remove(abstractC0185);
        if (c2229 != null) {
            c2229.f11025 = 0;
            c2229.f11026 = null;
            c2229.f11027 = null;
            C2229.f11024.mo1557(c2229);
        }
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public void m541() {
        int[] iArr = (int[]) this.f812;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f810 = null;
    }

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public void m542(AbstractC0185 abstractC0185) {
        C2229 c2229 = (C2229) ((C0988) this.f812).get(abstractC0185);
        if (c2229 == null) {
            return;
        }
        c2229.f11025 &= -2;
    }

    @Override // yyds.InterfaceC2614
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public void mo543() {
        C0839 c0839 = (C0839) this.f812;
        synchronized (c0839) {
            c0839.f3863 = c0839.f3865.length;
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public void m544(int i, int i2) {
        int[] iArr = (int[]) this.f812;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m539(i3);
        int[] iArr2 = (int[]) this.f812;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f812, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f810;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0618 c0618 = (C0618) ((ArrayList) this.f810).get(size);
            int i4 = c0618.f2986;
            if (i4 >= i) {
                c0618.f2986 = i4 + i2;
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public C2623 m545() {
        int i;
        char cM1118;
        C0394 c0394 = (C0394) this.f810;
        while (true) {
            i = 13;
            if (!c0394.m1117(c0394.f2030) || ((cM1118 = c0394.m1118()) != ' ' && cM1118 != '\t' && cM1118 != '\n' && cM1118 != '\r')) {
                break;
            }
            c0394.m1128(1);
        }
        char cM11182 = c0394.m1118();
        if (!(cM11182 == '$' || cM11182 == '@')) {
            throw new C2569("Path must start with '$' or '@'");
        }
        C2771 c2771 = new C2771(c0394.m1118());
        if (!c0394.m1126()) {
            c0394.m1128(1);
            if (c0394.m1118() != '.' && c0394.m1118() != '[') {
                m538("Illegal character at position " + c0394.f2030 + " expected '.' or '['");
                throw null;
            }
            m564(new C2014(i, c2771));
        }
        return new C2623(c2771, c2771.f13519.equals("$"));
    }

    @Override // yyds.InterfaceC0306
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public void mo546(Object obj) {
        C1419 c1419 = (C1419) this.f810;
        C1199 c1199 = (C1199) this.f812;
        C1199 c11992 = c1419.f6705;
        if (c11992 == null || c11992 != c1199) {
            return;
        }
        C1419 c14192 = (C1419) this.f810;
        C1199 c11993 = (C1199) this.f812;
        C2340 c2340 = c14192.f6709.f4595;
        if (obj == null || !c2340.m4360(c11993.f5473.mo513())) {
            RunnableC1650 runnableC1650 = c14192.f6711;
            InterfaceC1410 interfaceC1410 = c11993.f5472;
            InterfaceC0724 interfaceC0724 = c11993.f5473;
            runnableC1650.mo2883(interfaceC1410, obj, interfaceC0724, interfaceC0724.mo513(), c14192.f6706);
            return;
        }
        c14192.f6708 = obj;
        RunnableC1650 runnableC16502 = c14192.f6711;
        runnableC16502.f8422 = 2;
        C2028 c2028 = runnableC16502.f8411;
        (c2028.f10107 ? c2028.f10121 : c2028.f10110).execute(runnableC16502);
    }

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public LinearLayoutManager m547() {
        AbstractC2551 layoutManager = ((C1213) this.f812).getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager.f343 == 1) {
                return linearLayoutManager;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public void m548(int i) {
        View decorView = ((Window) this.f810).getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // yyds.InterfaceC1095
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void mo549() {
        ViewOverlay overlay;
        AbstractC2328.m4341(-201884510618478L);
        GradientDrawable gradientDrawable = AbstractC0598.f2827;
        if (gradientDrawable == null) {
            return;
        }
        View view = AbstractC0598.f2826;
        if (view != null && (overlay = view.getOverlay()) != null) {
            overlay.remove(gradientDrawable);
        }
        AbstractC0598.f2827 = null;
        AbstractC0598.f2826 = null;
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public C0526 m550() {
        return (C0526) ((C0078) this.f810).getValue();
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public Object m551(String str, String str2, boolean z, AbstractC1320 abstractC1320) {
        C1206 c1206 = AbstractC0221.f1238;
        return AbstractC2071.m3955(ExecutorC2482.f12272, new C2464(this, str2, str, z, null), abstractC1320);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public void m552(AbstractC0185 abstractC0185, C2292 c2292) {
        C0988 c0988 = (C0988) this.f812;
        C2229 c2229M4232 = (C2229) c0988.get(abstractC0185);
        if (c2229M4232 == null) {
            c2229M4232 = C2229.m4232();
            c0988.put(abstractC0185, c2229M4232);
        }
        c2229M4232.f11027 = c2292;
        c2229M4232.f11025 |= 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m553(AbstractC1320 abstractC1320) throws Throwable {
        C2232 c2232;
        if (abstractC1320 instanceof C2232) {
            c2232 = (C2232) abstractC1320;
            int i = c2232.f11030;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2232.f11030 = i - Integer.MIN_VALUE;
            } else {
                c2232 = new C2232(this, abstractC1320);
            }
        }
        Object objM3955 = c2232.f11032;
        int i2 = c2232.f11030;
        InterfaceC0274 interfaceC0274 = null;
        if (i2 == 0) {
            AbstractC1544.m3189(objM3955);
            C1206 c1206 = AbstractC0221.f1238;
            ExecutorC2482 executorC2482 = ExecutorC2482.f12272;
            C0853 c0853 = new C0853(this, interfaceC0274, 18);
            c2232.f11030 = 1;
            objM3955 = AbstractC2071.m3955(executorC2482, c0853, c2232);
            EnumC1765 enumC1765 = EnumC1765.f8858;
            if (objM3955 == enumC1765) {
                return enumC1765;
            }
        } else {
            if (i2 != 1) {
                C0188.m800(AbstractC2328.m4341(-756175809971054L));
                return null;
            }
            AbstractC1544.m3189(objM3955);
        }
        AbstractC2328.m4341(-756102795527022L);
        return objM3955;
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public String m554(InterfaceC1410 interfaceC1410) {
        String str;
        synchronized (((C2170) this.f812)) {
            str = (String) ((C2170) this.f812).m4134(interfaceC1410);
        }
        if (str == null) {
            C2129 c2129 = (C2129) ((C0644) this.f810).mo1548();
            try {
                interfaceC1410.mo1227(c2129.f10525);
                byte[] bArrDigest = c2129.f10525.digest();
                char[] cArr = AbstractC0181.f1024;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i * 2;
                        char[] cArr2 = AbstractC0181.f1023;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((C0644) this.f810).mo1557(c2129);
            }
        }
        synchronized (((C2170) this.f812)) {
            ((C2170) this.f812).m4135(interfaceC1410, str);
        }
        return str;
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public View m555(int i, int i2, int i3, int i4) {
        View viewM4614;
        C1556 c1556 = (C1556) this.f810;
        C1831 c1831 = (C1831) this.f812;
        int iM3591 = c1831.m3591();
        int iM3590 = c1831.m3590();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (c1831.f9190) {
                case 0:
                    viewM4614 = c1831.f9191.m4614(i);
                    break;
                default:
                    viewM4614 = c1831.f9191.m4614(i);
                    break;
            }
            int iM3589 = c1831.m3589(viewM4614);
            int iM3588 = c1831.m3588(viewM4614);
            c1556.f7926 = iM3591;
            c1556.f7927 = iM3590;
            c1556.f7928 = iM3589;
            c1556.f7924 = iM3588;
            if (i3 != 0) {
                c1556.f7925 = i3;
                if (c1556.m3205()) {
                    return viewM4614;
                }
            }
            if (i4 != 0) {
                c1556.f7925 = i4;
                if (c1556.m3205()) {
                    view = viewM4614;
                }
            }
            i += i5;
        }
        return view;
    }

    @Override // yyds.InterfaceC1095
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public void mo556() {
        ViewOverlay overlay;
        AbstractC2328.m4341(-201931755258734L);
        GradientDrawable gradientDrawable = AbstractC0598.f2827;
        if (gradientDrawable == null) {
            return;
        }
        View view = AbstractC0598.f2826;
        if (view != null && (overlay = view.getOverlay()) != null) {
            overlay.remove(gradientDrawable);
        }
        AbstractC0598.f2827 = null;
        AbstractC0598.f2826 = null;
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public synchronized ArrayList m557(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f812).iterator();
        while (it.hasNext()) {
            List<C2430> list = (List) ((HashMap) this.f810).get((String) it.next());
            if (list != null) {
                for (C2430 c2430 : list) {
                    if ((c2430.f11986.isAssignableFrom(cls) && cls2.isAssignableFrom(c2430.f11987)) && !arrayList.contains(c2430.f11987)) {
                        arrayList.add(c2430.f11987);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public void mo558() {
        Window window = (Window) this.f810;
        if (window == null) {
            ((WindowInsetsController) this.f812).setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        m548(2048);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4096);
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public synchronized List m559(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.f812).contains(str)) {
                ((ArrayList) this.f812).add(str);
            }
            arrayList = (List) ((HashMap) this.f810).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.f810).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m560(String str, String str2, AbstractC1320 abstractC1320) throws Throwable {
        C1286 c1286;
        if (abstractC1320 instanceof C1286) {
            c1286 = (C1286) abstractC1320;
            int i = c1286.f5927;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1286.f5927 = i - Integer.MIN_VALUE;
            } else {
                c1286 = new C1286(this, abstractC1320);
            }
        }
        Object objM551 = c1286.f5924;
        int i2 = c1286.f5927;
        if (i2 == 0) {
            AbstractC1544.m3189(objM551);
            c1286.f5928 = str;
            c1286.f5926 = str2;
            c1286.f5927 = 1;
            objM551 = m551(str, str2, true, c1286);
            Object obj = EnumC1765.f8858;
            if (objM551 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C0188.m800(AbstractC2328.m4341(-756562357027694L));
                return null;
            }
            str2 = c1286.f5926;
            str = c1286.f5928;
            AbstractC1544.m3189(objM551);
        }
        boolean zBooleanValue = ((Boolean) objM551).booleanValue();
        C2746 c2746 = C2746.f13459;
        if (zBooleanValue) {
            return c2746;
        }
        String strM533 = m533(((C2174) this.f812).f10656 + '/' + str2 + '/' + str + '/', true);
        C2336.f11496.m4354(AbstractC2328.m4341(-756399148270446L).concat(strM533));
        try {
            C0526 c0526M550 = m550();
            c0526M550.getClass();
            C1633 c1633 = new C1633();
            c1633.m3334(strM533);
            c1633.m3335("MKCOL", null);
            C2098 c2098 = new C2098(c1633);
            C1284 c1284 = c0526M550.f2527;
            c1284.getClass();
            AbstractC0024.m3294(new C2729(c1284, c2098).m4863());
            return c2746;
        } catch (C1185 e) {
            if (e.f5424 != 405) {
                throw e;
            }
            C2336.f11496.m4354(AbstractC2328.m4341(-756446392910702L).concat(strM533));
            return c2746;
        }
    }

    @Override // yyds.InterfaceC0396
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public boolean mo561(Object obj) {
        switch (this.f811) {
            case 8:
                C2189 c2189 = (C2189) this.f810;
                C1762 c1762 = (C1762) this.f812;
                return c2189.m4181(obj, c1762.f8845, c1762.f8846, c1762);
            default:
                C0197 c0197 = (C0197) this.f810;
                C0989 c0989 = ((C1762) this.f812).f8846;
                c0989.f4503.getClass();
                if (!(obj instanceof Map)) {
                    return false;
                }
                if (c0197.mo829() && !(c0197.m3900() && c0989.f4505.contains(EnumC0445.f2269))) {
                    return c0989.f4503.m393(obj).containsAll(c0197.f1164);
                }
                return true;
        }
    }

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public C2292 m562(AbstractC0185 abstractC0185, int i) {
        C2229 c2229;
        C2292 c2292;
        C0988 c0988 = (C0988) this.f812;
        int iM2174 = c0988.m2174(abstractC0185);
        if (iM2174 >= 0 && (c2229 = (C2229) c0988.m2171(iM2174)) != null) {
            int i2 = c2229.f11025;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c2229.f11025 = i3;
                if (i == 4) {
                    c2292 = c2229.f11026;
                } else if (i == 8) {
                    c2292 = c2229.f11027;
                } else {
                    C0188.m798("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    c0988.mo1163(iM2174);
                    c2229.f11025 = 0;
                    c2229.f11026 = null;
                    c2229.f11027 = null;
                    C2229.f11024.mo1557(c2229);
                }
                return c2292;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public void m563(int i, int i2) {
        int[] iArr = (int[]) this.f812;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m539(i3);
        int[] iArr2 = (int[]) this.f812;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f812;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f810;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0618 c0618 = (C0618) ((ArrayList) this.f810).get(size);
            int i4 = c0618.f2986;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f810).remove(size);
                } else {
                    c0618.f2986 = i4 - i2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0780 A[ORIG_RETURN, RETURN] */
    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m564(C2014 c2014) {
        int i;
        int iM1114;
        int iM11142;
        int iM1122;
        char c;
        int iM11143;
        char cM1115;
        int i2;
        char cM11152;
        int i3;
        boolean z;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        C1869 c1869;
        C0394 c0394 = (C0394) this.f810;
        CharSequence charSequence = (CharSequence) c0394.f2032;
        char cM1118 = c0394.m1118();
        if (cM1118 == '*') {
            if (m571(c2014)) {
                return;
            }
            m538("Could not parse token starting at position " + c0394.f2030);
            throw null;
        }
        int i8 = 1;
        if (cM1118 == '.') {
            if (c0394.m1120('.') && c0394.m1117(c0394.f2030 + 1) && charSequence.charAt(c0394.f2030 + 1) == '.') {
                c2014.m3891(new C0973());
                c0394.m1128(2);
            } else {
                if (!c0394.m1117(c0394.f2030 + 1)) {
                    throw new C2569("Path must not end with a '.");
                }
                c0394.m1128(1);
            }
            if (!c0394.m1120('.')) {
                m564(c2014);
                return;
            }
            throw new C2569("Character '.' on position " + c0394.f2030 + " is not valid.");
        }
        char c2 = '\"';
        char c3 = ' ';
        if (cM1118 == '[') {
            if (c0394.m1120('[') && ((cM11152 = c0394.m1115(c0394.f2030)) == '\'' || cM11152 == '\"')) {
                ArrayList arrayList2 = new ArrayList();
                int i9 = c0394.f2030 + 1;
                int i10 = i9;
                boolean z4 = false;
                int i11 = 0;
                boolean z5 = false;
                boolean z6 = false;
                while (true) {
                    if (!c0394.m1117(i9)) {
                        break;
                    }
                    char cCharAt = charSequence.charAt(i9);
                    if (z4) {
                        z4 = false;
                    } else if ('\\' == cCharAt) {
                        z4 = true;
                    } else if (cCharAt == ']' && !z5) {
                        if (z6) {
                            m538("Found empty property at index " + i9);
                            throw null;
                        }
                    } else if (cCharAt != cM11152) {
                        if (cCharAt == ',' && !z5) {
                            if (z6) {
                                m538("Found empty property at index " + i9);
                                throw null;
                            }
                            z6 = true;
                        }
                        i9++;
                    } else if (z5) {
                        char cM11153 = c0394.m1115(i9);
                        if (cM11153 != ']' && cM11153 != ',') {
                            m538("Property must be separated by comma or Property must be terminated close square bracket at index " + i9);
                            throw null;
                        }
                        arrayList2.add(AbstractC0902.m2009(charSequence.subSequence(i10, i9).toString()));
                        i11 = i9;
                        z5 = false;
                    } else {
                        i10 = i9 + 1;
                        z6 = false;
                        z5 = true;
                    }
                    i9++;
                }
                if (z5) {
                    m538("Property has not been closed - missing closing " + cM11152);
                    throw null;
                }
                int iM11144 = c0394.m1114(']', i11);
                if (iM11144 == -1) {
                    m538("Property has not been closed - missing closing ]");
                    throw null;
                }
                c0394.f2030 = iM11144 + 1;
                c2014.m3891(new C0197(arrayList2, cM11152));
                if (c0394.m1126()) {
                    return;
                }
                m564(c2014);
                return;
            }
            if (c0394.m1120('[')) {
                char cM11154 = c0394.m1115(c0394.f2030);
                if (Character.isDigit(cM11154) || cM11154 == '-' || cM11154 == ':') {
                    int i12 = c0394.f2030 + 1;
                    int i13 = i12;
                    while (true) {
                        if (c0394.m1125(i13)) {
                            i13 = -1;
                            break;
                        } else if (charSequence.charAt(i13) == ']') {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    if (i13 != -1) {
                        String strTrim = charSequence.subSequence(i12, i13).toString().trim();
                        if (!"*".equals(strTrim)) {
                            for (int i14 = 0; i14 < strTrim.length(); i14++) {
                                char cCharAt2 = strTrim.charAt(i14);
                                if (Character.isDigit(cCharAt2) || cCharAt2 == ',' || cCharAt2 == '-' || cCharAt2 == ':' || cCharAt2 == ' ') {
                                }
                            }
                            if (strTrim.contains(":")) {
                                for (int i15 = 0; i15 < strTrim.length(); i15++) {
                                    char cCharAt3 = strTrim.charAt(i15);
                                    if (!Character.isDigit(cCharAt3) && cCharAt3 != '-' && cCharAt3 != ':') {
                                        throw new C2569("Failed to parse SliceOperation: ".concat(strTrim));
                                    }
                                }
                                String[] strArrSplit = strTrim.split(":");
                                Integer numValueOf = (strArrSplit.length <= 0 || strArrSplit[0].equals("")) ? null : Integer.valueOf(Integer.parseInt(strArrSplit[0]));
                                Integer numValueOf2 = (strArrSplit.length <= 1 || strArrSplit[1].equals("")) ? null : Integer.valueOf(Integer.parseInt(strArrSplit[1]));
                                if (numValueOf != null && numValueOf2 == null) {
                                    i2 = 1;
                                } else if (numValueOf != null) {
                                    i2 = 3;
                                } else {
                                    if (numValueOf2 == null) {
                                        throw new C2569("Failed to parse SliceOperation: ".concat(strTrim));
                                    }
                                    i2 = 2;
                                }
                                c2014.m3891(new C1136(new C1607(numValueOf, numValueOf2, i2)));
                            } else {
                                Pattern pattern = C0667.f3166;
                                for (int i16 = 0; i16 < strTrim.length(); i16++) {
                                    char cCharAt4 = strTrim.charAt(i16);
                                    if (!Character.isDigit(cCharAt4) && cCharAt4 != ',') {
                                        if (cCharAt4 != ' ' && cCharAt4 != '-') {
                                            throw new C2569("Failed to parse ArrayIndexOperation: ".concat(strTrim));
                                        }
                                    }
                                }
                                String[] strArrSplit2 = C0667.f3166.split(strTrim, -1);
                                ArrayList arrayList3 = new ArrayList(strArrSplit2.length);
                                for (String str : strArrSplit2) {
                                    try {
                                        arrayList3.add(Integer.valueOf(Integer.parseInt(str)));
                                    } catch (Exception e) {
                                        throw new C2569("Failed to parse token in ArrayIndexOperation: " + str, e);
                                    }
                                }
                                c2014.m3891(new C2300(new C0667(arrayList3)));
                            }
                            c0394.f2030 = i13 + 1;
                            if (c0394.m1126()) {
                                return;
                            }
                            m564(c2014);
                            return;
                        }
                    }
                }
            }
            if (m571(c2014)) {
                return;
            }
            if (!(c0394.m1120('[') || c0394.m1113('?', c0394.f2030)) || (iM1114 = c0394.m1114('?', (i = c0394.f2030))) == -1 || (iM11142 = c0394.m1114('(', iM1114)) == -1 || (iM1122 = c0394.m1122(iM11142, '(', ')', true)) == -1) {
                c = ']';
            } else {
                c = ']';
                if (c0394.m1113(']', iM1122)) {
                    int iM11145 = c0394.m1114(']', iM1122) + 1;
                    String string = charSequence.subSequence(i, iM11145).toString();
                    C0711 c0711 = new C0711();
                    C0394 c03942 = new C0394(string);
                    c0711.f3354 = c03942;
                    c03942.m1121();
                    if (!c03942.m1120('[') || !c03942.m1123(']')) {
                        throw new C2569("Filter must start with '[' and end with ']'. ".concat(string));
                    }
                    c03942.m1128(1);
                    c03942.f2031--;
                    c03942.m1121();
                    if (!c03942.m1120('?')) {
                        throw new C2569("Filter must start with '[?' and end with ']'. ".concat(string));
                    }
                    c03942.m1128(1);
                    c03942.m1121();
                    if (!c03942.m1120('(') || !c03942.m1123(')')) {
                        throw new C2569("Filter must start with '[?(' and end with ')]'. ".concat(string));
                    }
                    try {
                        AbstractC2703 abstractC2703M1631 = c0711.m1631();
                        c03942.m1127();
                        if (c03942.m1117(c03942.f2030)) {
                            throw new C2569(String.format("Expected end of filter expression instead of: %s", string.subSequence(c03942.f2030, c03942.f2031 + 1)));
                        }
                        c2014.m3891(new C2189(new C1205(abstractC2703M1631)));
                        c0394.f2030 = iM11145;
                        if (c0394.m1126()) {
                            return;
                        }
                        m564(c2014);
                        return;
                    } catch (C2569 e2) {
                        throw e2;
                    } catch (Exception unused) {
                        throw new C2569("Failed to parse filter: " + c03942 + ", error on position: " + c03942.f2030 + ", char: " + c03942.m1118());
                    }
                }
            }
            LinkedList linkedList = (LinkedList) this.f812;
            if (c0394.m1120('[') && (iM11143 = c0394.m1114('?', c0394.f2030)) != -1 && ((cM1115 = c0394.m1115(iM11143)) == c || cM1115 == ',')) {
                int i17 = c0394.f2030 + 1;
                int i18 = i17;
                while (true) {
                    if (c0394.m1125(i18)) {
                        i18 = -1;
                        break;
                    } else {
                        if (charSequence.charAt(i18) == c) {
                            break;
                        }
                        i18++;
                        c = ']';
                    }
                }
                if (i18 != -1) {
                    String string2 = charSequence.subSequence(i17, i18).toString();
                    String[] strArrSplit3 = string2.split(",");
                    if (linkedList.size() < strArrSplit3.length) {
                        throw new C2569("Not enough predicates supplied for filter [" + string2 + "] at position " + c0394.f2030);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int length = strArrSplit3.length;
                    for (int i19 = 0; i19 < length; i19++) {
                        String str2 = strArrSplit3[i19];
                        String strTrim2 = str2 != null ? str2.trim() : null;
                        if (!"?".equals(strTrim2 == null ? "" : strTrim2)) {
                            C0188.m805(strTrim2, "Expected '?' but found ");
                            return;
                        }
                        arrayList4.add((InterfaceC0845) linkedList.pop());
                    }
                    c2014.m3891(new C2189(arrayList4));
                    c0394.f2030 = i18 + 1;
                    if (c0394.m1126()) {
                        return;
                    }
                    m564(c2014);
                    return;
                }
            }
            m538("Could not parse token starting at position " + c0394.f2030 + ". Expected ?, ', 0-9, * ");
            throw null;
        }
        if (c0394.m1120('[') || c0394.m1120('*') || c0394.m1120('.') || c0394.m1120(' ')) {
            m538("Could not parse token starting at position " + c0394.f2030);
            throw null;
        }
        int i20 = c0394.f2030;
        int i21 = i20;
        while (c0394.m1117(i21)) {
            char cCharAt5 = charSequence.charAt(i21);
            if (cCharAt5 == ' ') {
                throw new C2569(AbstractC0897.m1989(c0394.f2030, "Use bracket notion ['my prop'] if your property contains blank characters. position: "));
            }
            if (cCharAt5 == '.' || cCharAt5 == '[') {
                i3 = i21;
                break;
            } else {
                if (cCharAt5 == '(') {
                    i3 = i21;
                    z = true;
                    break;
                }
                i21++;
            }
        }
        i3 = 0;
        z = false;
        if (i3 == 0) {
            i3 = c0394.f2031 + 1;
        }
        if (z) {
            int i22 = i21 + 1;
            int i23 = 1;
            for (int i24 = i22; i24 < c0394.f2031 + 1; i24++) {
                if (charSequence.charAt(i24) == ')') {
                    i23--;
                } else if (charSequence.charAt(i24) == '(') {
                    i23++;
                }
                if (i23 == 0) {
                    break;
                }
            }
            if (i23 != 0) {
                throw new C2569(AbstractC2104.m4014("Arguments to function: '", charSequence.subSequence(i20, i3).toString(), "' are not closed properly."));
            }
            if (!c0394.m1117(i22)) {
                z2 = z;
                c0394.f2030 = i21;
            } else {
                if (charSequence.charAt(i22) != ')') {
                    c0394.f2030 = i3 + 1;
                    String string3 = charSequence.subSequence(i20, i3).toString();
                    ArrayList arrayList5 = new ArrayList();
                    StringBuilder sb = new StringBuilder();
                    int i25 = 1;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = 0;
                    int i30 = 0;
                    char c4 = 0;
                    while (c0394.m1117(c0394.f2030) && i27 == 0) {
                        char cM11182 = c0394.m1118();
                        c0394.m1128(i8);
                        if (i26 == 0) {
                            if (cM11182 == c3 || cM11182 == '\t' || cM11182 == '\n' || cM11182 == '\r') {
                                i8 = 1;
                                c3 = ' ';
                            } else if (cM11182 == '{' || Character.isDigit(cM11182) || c2 == cM11182 || '-' == cM11182) {
                                i26 = 1;
                            } else if (cM11182 == '$' || cM11182 == '@') {
                                i26 = 2;
                            }
                        }
                        if (cM11182 == c2) {
                            z3 = z;
                            i30 = (c4 == '\\' || i30 <= 0) ? i30 + 1 : i30 - 1;
                        } else if (cM11182 == ',') {
                            i5 = i25;
                            if (i30 == 0 && i28 == 0 && i29 == 0) {
                                if (i5 == 0 || ')' != cM11182) {
                                    i6 = 1;
                                    if (1 == i5) {
                                    }
                                } else {
                                    i6 = 1;
                                }
                                i27 = i5 != 0 ? i6 : 0;
                                if (i26 != 0) {
                                    int iM4012 = AbstractC2104.m4012(i26);
                                    if (iM4012 == 0) {
                                        z3 = z;
                                        i7 = i5;
                                        c1869 = new C1869();
                                        c1869.f9411 = Boolean.FALSE;
                                        c1869.f9408 = 1;
                                    } else if (iM4012 != i6) {
                                        z3 = z;
                                        i7 = i5;
                                        c1869 = null;
                                    } else {
                                        z3 = z;
                                        i7 = i5;
                                        C2623 c2623M545 = new C0119(new C0394(sb.toString()), 1, new LinkedList()).m545();
                                        c1869 = new C1869();
                                        c1869.f9411 = Boolean.FALSE;
                                        c1869.f9409 = c2623M545;
                                        c1869.f9408 = 2;
                                    }
                                    if (c1869 != null) {
                                        arrayList5.add(c1869);
                                    }
                                    sb.delete(0, sb.length());
                                    i4 = i7;
                                    i26 = 0;
                                    if (i26 != 0 && (cM11182 != ',' || i28 != 0 || i29 != 0 || 1 != i4)) {
                                        sb.append(cM11182);
                                    }
                                    c4 = cM11182;
                                    i25 = i4;
                                    z = z3;
                                    i8 = 1;
                                    c3 = ' ';
                                    c2 = '\"';
                                }
                            }
                            z3 = z;
                            i25 = i5;
                        } else {
                            if (cM11182 == '[') {
                                i29++;
                            } else if (cM11182 == ']') {
                                if (i29 == 0) {
                                    throw new C2569(AbstractC0897.m1989(c0394.f2030, "Unexpected close bracket ']' at character position: "));
                                }
                                i29--;
                            } else if (cM11182 == '{') {
                                i28++;
                            } else if (cM11182 == '}') {
                                if (i28 == 0) {
                                    throw new C2569(AbstractC0897.m1989(c0394.f2030, "Unexpected close brace '}' at character position: "));
                                }
                                i28--;
                            } else if (cM11182 == '(') {
                                i25++;
                            } else if (cM11182 == ')') {
                                i25--;
                                if (i25 < 0 || c4 == '(') {
                                    sb.append(cM11182);
                                }
                                i5 = i25;
                                if (i30 == 0) {
                                    if (i5 == 0) {
                                        i6 = 1;
                                        if (1 == i5) {
                                            if (i5 != 0) {
                                            }
                                            if (i26 != 0) {
                                            }
                                        }
                                    }
                                }
                                z3 = z;
                                i25 = i5;
                            }
                            z3 = z;
                        }
                        i4 = i25;
                        if (i26 != 0) {
                            sb.append(cM11182);
                        }
                        c4 = cM11182;
                        i25 = i4;
                        z = z3;
                        i8 = 1;
                        c3 = ' ';
                        c2 = '\"';
                    }
                    z2 = z;
                    if (i28 != 0 || i25 != 0 || i29 != 0) {
                        throw new C2569(AbstractC2104.m4014("Arguments to function: '", string3, "' are not closed properly."));
                    }
                    arrayList = arrayList5;
                    String string4 = charSequence.subSequence(i20, i3).toString();
                    if (z2) {
                        c2014.m3891(new C0197(Collections.singletonList(string4), '\''));
                    } else {
                        c2014.m3891(new C0281(string4, arrayList));
                    }
                    if (c0394.m1126()) {
                        m564(c2014);
                        return;
                    }
                    return;
                }
                z2 = z;
                c0394.f2030 = i22;
            }
        } else {
            z2 = z;
            c0394.f2030 = i3;
        }
        arrayList = null;
        String string42 = charSequence.subSequence(i20, i3).toString();
        if (z2) {
        }
        if (c0394.m1126()) {
        }
    }

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public void mo565(boolean z) {
        Window window = (Window) this.f810;
        if (window != null) {
            if (!z) {
                m548(16);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                return;
            }
        }
        WindowInsetsController windowInsetsController = (WindowInsetsController) this.f812;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(16, 16);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public int m566() {
        Rect rect = (Rect) this.f810;
        C1213 c1213 = (C1213) this.f812;
        if (c1213.getChildCount() == 0) {
            return 0;
        }
        C1213.m2414(rect, c1213.getChildAt(0));
        return rect.height();
    }

    @Override // yyds.InterfaceC0306
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public void mo567(Exception exc) {
        C1419 c1419 = (C1419) this.f810;
        C1199 c1199 = (C1199) this.f812;
        C1199 c11992 = c1419.f6705;
        if (c11992 == null || c11992 != c1199) {
            return;
        }
        C1419 c14192 = (C1419) this.f810;
        C1199 c11993 = (C1199) this.f812;
        RunnableC1650 runnableC1650 = c14192.f6711;
        C0440 c0440 = c14192.f6706;
        InterfaceC0724 interfaceC0724 = c11993.f5473;
        runnableC1650.mo2884(c0440, exc, interfaceC0724, interfaceC0724.mo513());
    }

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public void mo568(boolean z) {
        Window window = (Window) this.f810;
        if (window != null) {
            if (!z) {
                m548(8192);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                return;
            }
        }
        WindowInsetsController windowInsetsController = (WindowInsetsController) this.f812;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(8, 8);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // yyds.InterfaceC2614
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public void mo569(Bitmap bitmap, InterfaceC2587 interfaceC2587) throws IOException {
        IOException iOException = ((C1716) this.f810).f8699;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC2587.mo1856(bitmap);
            throw iOException;
        }
    }

    @Override // yyds.InterfaceC1095
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public void mo570(final C0912 c0912) {
        AbstractC2328.m4341(-201764251534190L);
        final C0172 c0172 = new C0172();
        c0172.f997 = C1860.f9345;
        final C0172 c01722 = new C0172();
        Context context = (Context) this.f812;
        final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        final WindowManager.LayoutParams layoutParams = c0912.f4149;
        AbstractC2328.m4341(-201794316305262L);
        final int color = context.getColor(R.color.douyin_primary);
        final C2531 c2531 = (C2531) this.f810;
        ((LinearLayout) c2531.f12463).post(new RunnableC2696(c2531, 13, c0912));
        final C0508 c0508 = new C0508();
        final C0508 c05082 = new C0508();
        final C0947 c0947 = new C0947();
        final C0947 c09472 = new C0947();
        final int i = 1;
        ((FrameLayout) c2531.f12460).setOnTouchListener(new View.OnTouchListener() { // from class: yyds.ᲁᛲᲀᲈ
            static {
                NativeUtil.classesInit0(192);
            }

            @Override // android.view.View.OnTouchListener
            public final native boolean onTouch(View view, MotionEvent motionEvent);
        });
        final int i2 = 2;
        ((ImageView) c2531.f12461).setOnClickListener(new View.OnClickListener() { // from class: yyds.ᛵᛵᲁᛱ
            static {
                NativeUtil.classesInit0(122);
            }

            @Override // android.view.View.OnClickListener
            public final native void onClick(View view);
        });
        ((TextView) c2531.f12467).setOnClickListener(new ViewOnClickListenerC1602(c0172, c2531, c01722, (Context) this.f812, color));
        TextView textView = c2531.f12468;
        final Context context2 = (Context) this.f812;
        final int i3 = 0;
        textView.setOnClickListener(new View.OnClickListener(c0172, c01722, c2531, context2, color, i3) { // from class: yyds.ᛴᛴᲁᲁ

            /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
            public final /* synthetic */ C0172 f3875;

            /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
            public final /* synthetic */ int f3876;

            /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
            public final /* synthetic */ int f3877;

            /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
            public final /* synthetic */ C2531 f3878;

            /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
            public final /* synthetic */ C0172 f3879;

            static {
                NativeUtil.classesInit0(44);
            }

            {
                this.f3877 = i3;
                this.f3876 = color;
            }

            @Override // android.view.View.OnClickListener
            public final native void onClick(View view);
        });
        TextView textView2 = c2531.f12466;
        final Context context3 = (Context) this.f812;
        final int i4 = 1;
        textView2.setOnClickListener(new View.OnClickListener(c0172, c01722, c2531, context3, color, i4) { // from class: yyds.ᛴᛴᲁᲁ

            /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
            public final /* synthetic */ C0172 f3875;

            /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
            public final /* synthetic */ int f3876;

            /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
            public final /* synthetic */ int f3877;

            /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
            public final /* synthetic */ C2531 f3878;

            /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
            public final /* synthetic */ C0172 f3879;

            static {
                NativeUtil.classesInit0(44);
            }

            {
                this.f3877 = i4;
                this.f3876 = color;
            }

            @Override // android.view.View.OnClickListener
            public final native void onClick(View view);
        });
        m535(c0172, c2531, c01722, context, color);
    }

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public boolean m571(C2014 c2014) {
        C0394 c0394 = (C0394) this.f810;
        boolean zM1120 = c0394.m1120('[');
        if (zM1120 && !c0394.m1113('*', c0394.f2030)) {
            return false;
        }
        if (!c0394.m1120('*') && c0394.m1125(c0394.f2030 + 1)) {
            return false;
        }
        if (zM1120) {
            int iM1114 = c0394.m1114('*', c0394.f2030);
            if (!c0394.m1113(']', iM1114)) {
                throw new C2569(AbstractC0897.m1989(iM1114 + 1, "Expected wildcard token to end with ']' on position "));
            }
            c0394.f2030 = c0394.m1114(']', iM1114) + 1;
        } else {
            c0394.m1128(1);
        }
        c2014.m3891(new C2046());
        if (!c0394.m1126()) {
            m564(c2014);
        }
        return true;
    }

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public boolean m572(View view) {
        C1556 c1556 = (C1556) this.f810;
        C1831 c1831 = (C1831) this.f812;
        int iM3591 = c1831.m3591();
        int iM3590 = c1831.m3590();
        int iM3589 = c1831.m3589(view);
        int iM3588 = c1831.m3588(view);
        c1556.f7926 = iM3591;
        c1556.f7927 = iM3590;
        c1556.f7928 = iM3589;
        c1556.f7924 = iM3588;
        c1556.f7925 = 24579;
        return c1556.m3205();
    }

    public /* synthetic */ C0119(Object obj, int i, Object obj2) {
        this.f811 = i;
        this.f810 = obj;
        this.f812 = obj2;
    }

    public C0119(int i) {
        this.f811 = i;
        switch (i) {
            case 7:
                this.f812 = new C2170(1000L);
                this.f810 = AbstractC2217.m4205(10, new C0469(23));
                break;
            case 11:
                break;
            case 15:
                this.f812 = new C0988(0);
                this.f810 = new C2010();
                break;
            default:
                this.f812 = new ArrayList();
                this.f810 = new HashMap();
                break;
        }
    }

    public /* synthetic */ C0119(int i, Object obj, Object obj2, boolean z) {
        this.f811 = i;
        this.f812 = obj;
        this.f810 = obj2;
    }

    public C0119(LinearLayout linearLayout, Button button, Button button2, EditText editText) {
        this.f811 = 4;
        this.f812 = button2;
        this.f810 = editText;
    }

    public C0119(C2020 c2020) {
        this.f811 = 3;
        this.f810 = c2020;
    }

    public C0119(C1213 c1213) {
        this.f811 = 5;
        this.f810 = new Rect();
        this.f812 = c1213;
    }

    public C0119(C1831 c1831) {
        this.f811 = 14;
        this.f812 = c1831;
        C1556 c1556 = new C1556();
        c1556.f7925 = 0;
        this.f810 = c1556;
    }

    public C0119(C0805 c0805, Activity activity, List list, RunnableC2282 runnableC2282) {
        this.f811 = 2;
        this.f812 = c0805;
        this.f810 = runnableC2282;
    }

    public C0119(Window window, C0135 c0135) {
        this.f811 = 17;
        this.f812 = window.getInsetsController();
        this.f810 = window;
    }
}
