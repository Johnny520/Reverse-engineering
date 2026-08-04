package yyds;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.app.CustomCardView;
import com.p000ss.android.ugc.aweme.yyds.R;
import com.p000ss.android.ugc.awemes.MainActivity;
import com.p000ss.android.ugc.awemes.WardDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᲈᛷᛲᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2696 implements Runnable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f13247;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f13248;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f13249;

    public /* synthetic */ RunnableC2696(Runnable runnable, ExecutorC2250 executorC2250) {
        this.f13248 = 12;
        this.f13247 = runnable;
        this.f13249 = executorC2250;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0344 A[PHI: r11
  0x0344: PHI (r11v3 int) = (r11v1 int), (r11v4 int), (r11v5 int), (r11v6 int) binds: [B:42:0x0158, B:44:0x0163, B:46:0x016e, B:48:0x0179] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ExecutorC2250 executorC2250;
        Object c2658;
        C2617 c2617;
        FrameLayout frameLayout;
        int i = 2;
        switch (this.f13248) {
            case 0:
                executorC2250 = (ExecutorC2250) this.f13249;
                try {
                    ((Runnable) this.f13247).run();
                    return;
                } finally {
                }
            case 1:
                ((InterfaceC1549) this.f13249).mo371((Bitmap) this.f13247);
                return;
            case 2:
                ViewGroup viewGroup = (ViewGroup) ((ViewGroup) this.f13249).findViewById(((Integer) this.f13247).intValue());
                if (viewGroup != null) {
                    viewGroup.setBackground(null);
                }
                if (viewGroup != null) {
                    viewGroup.setBackgroundColor(0);
                }
                if (viewGroup != null) {
                    viewGroup.post(new RunnableC2682(viewGroup, i));
                    return;
                }
                return;
            case 3:
                Context context = (Context) this.f13249;
                ScrollView scrollView = (ScrollView) this.f13247;
                int i2 = (int) (r1.heightPixels * 0.5f);
                float f = context.getResources().getDisplayMetrics().density;
                int iM1487 = AbstractC0598.m1487(i2, (int) (180.0f * f), (int) (500.0f * f));
                ViewGroup.LayoutParams layoutParams = scrollView.getLayoutParams();
                layoutParams.height = iM1487;
                scrollView.setLayoutParams(layoutParams);
                return;
            case 4:
                C1628 c1628 = (C1628) this.f13249;
                if (AbstractC1544.m3188(c1628.m3329().f12479, (String) this.f13247)) {
                    c1628.m3329().f12487 = false;
                    if (c1628.m3329().f12490 != null) {
                        c1628.m3329().f12480 = true;
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ViewGroup viewGroup2 = (ViewGroup) this.f13249;
                EnumC0868 enumC0868 = (EnumC0868) this.f13247;
                C2153 c2153 = C2153.f10615;
                try {
                    Map map = C2153.f10614;
                    AbstractC2328.m4341(-820355506275182L);
                    synchronized (map) {
                        c2617 = (C2617) map.get(viewGroup2);
                    }
                    if (c2617 != null) {
                        if (c2617.f12865 != enumC0868) {
                            c2617 = null;
                        }
                        if (c2617 != null) {
                            c2153.getClass();
                            C2153.m4104(viewGroup2, c2617, true);
                        }
                    }
                    c2658 = C2746.f13459;
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                Throwable thM4249 = C2248.m4249(c2658);
                if (thM4249 != null) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-820381276078958L) + enumC0868, thM4249);
                    return;
                }
                return;
            case 6:
                C0634 c0634 = (C0634) this.f13249;
                C0912 c0912 = (C0912) this.f13247;
                int[] iArr = new int[2];
                c0634.f3054.getLocationOnScreen(iArr);
                c0912.m2024(iArr[0], iArr[1]);
                return;
            case 7:
                MainActivity mainActivity = (MainActivity) this.f13249;
                C1416 c1416 = (C1416) this.f13247;
                List list = MainActivity.f451;
                if (mainActivity.isFinishing() || mainActivity.isDestroyed()) {
                    return;
                }
                mainActivity.f468 = c1416;
                mainActivity.m318();
                return;
            case 8:
                Object obj = this.f13249;
                View view = (View) this.f13247;
                C2466.f12181.getClass();
                C2466.m4503(obj, view, null);
                return;
            case 9:
                ((C1849) this.f13249).m3614((Typeface) this.f13247);
                return;
            case 10:
                FrameLayout frameLayout2 = (FrameLayout) this.f13249;
                Context context2 = (Context) this.f13247;
                frameLayout2.removeAllViews();
                C1509.f7142.getClass();
                int iM3098 = C1509.m3098();
                int i3 = iM3098 == 4 ? R.layout.quadrant_selector : R.layout.quadrant_selector_nine;
                C2701.f13261.getClass();
                C2701.m4807(context2);
                View viewInflate = AbstractC1115.m2309(context2).inflate(i3, (ViewGroup) frameLayout2, false);
                frameLayout2.addView(viewInflate);
                C0668 c0668 = C1509.f7161;
                InterfaceC1989[] interfaceC1989Arr = C1509.f7179;
                ArrayList arrayList = new ArrayList(AbstractC0473.m1296((String) c0668.m1579(interfaceC1989Arr[94]), new String[]{AbstractC2328.m4341(-121529967477614L)}, 6));
                ArrayList arrayList2 = new ArrayList(AbstractC0473.m1296((String) C1509.f7285.m1579(interfaceC1989Arr[93]), new String[]{AbstractC2328.m4341(-121538557412206L)}, 6));
                int i4 = R.id.bottom_right_long_text;
                int i5 = R.id.bottom_right_long;
                if (iM3098 == 4) {
                    LinearLayout linearLayout = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.bottom_left_double);
                    if (linearLayout != null) {
                        TextView textView = (TextView) AbstractC1741.m3479(viewInflate, R.id.bottom_left_double_text);
                        if (textView != null) {
                            LinearLayout linearLayout2 = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.bottom_left_long);
                            if (linearLayout2 != null) {
                                TextView textView2 = (TextView) AbstractC1741.m3479(viewInflate, R.id.bottom_left_long_text);
                                if (textView2 != null) {
                                    LinearLayout linearLayout3 = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.bottom_right_double);
                                    if (linearLayout3 != null) {
                                        TextView textView3 = (TextView) AbstractC1741.m3479(viewInflate, R.id.bottom_right_double_text);
                                        if (textView3 != null) {
                                            LinearLayout linearLayout4 = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.bottom_right_long);
                                            if (linearLayout4 != null) {
                                                TextView textView4 = (TextView) AbstractC1741.m3479(viewInflate, R.id.bottom_right_long_text);
                                                if (textView4 != null) {
                                                    i4 = R.id.card_detail;
                                                    if (((CustomCardView) AbstractC1741.m3479(viewInflate, R.id.card_detail)) != null) {
                                                        i4 = R.id.card_share;
                                                        if (((CustomCardView) AbstractC1741.m3479(viewInflate, R.id.card_share)) != null) {
                                                            i4 = R.id.card_user;
                                                            if (((CustomCardView) AbstractC1741.m3479(viewInflate, R.id.card_user)) != null) {
                                                                LinearLayout linearLayout5 = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.top_left_double);
                                                                if (linearLayout5 != null) {
                                                                    TextView textView5 = (TextView) AbstractC1741.m3479(viewInflate, R.id.top_left_double_text);
                                                                    if (textView5 != null) {
                                                                        LinearLayout linearLayout6 = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.top_left_long);
                                                                        if (linearLayout6 != null) {
                                                                            TextView textView6 = (TextView) AbstractC1741.m3479(viewInflate, R.id.top_left_long_text);
                                                                            if (textView6 != null) {
                                                                                LinearLayout linearLayout7 = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.top_right_double);
                                                                                if (linearLayout7 != null) {
                                                                                    TextView textView7 = (TextView) AbstractC1741.m3479(viewInflate, R.id.top_right_double_text);
                                                                                    if (textView7 != null) {
                                                                                        frameLayout = frameLayout2;
                                                                                        LinearLayout linearLayout8 = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.top_right_long);
                                                                                        if (linearLayout8 != null) {
                                                                                            TextView textView8 = (TextView) AbstractC1741.m3479(viewInflate, R.id.top_right_long_text);
                                                                                            if (textView8 != null) {
                                                                                                AbstractC2328.m4341(-121547147346798L);
                                                                                                Pair[] pairArr = C0524.f2521;
                                                                                                ArrayList arrayList3 = new ArrayList(pairArr.length);
                                                                                                for (Pair pair : pairArr) {
                                                                                                    arrayList3.add((String) pair.getFirst());
                                                                                                }
                                                                                                Pair[] pairArr2 = C0066.f598;
                                                                                                ArrayList arrayList4 = new ArrayList(pairArr2.length);
                                                                                                for (Pair pair2 : pairArr2) {
                                                                                                    arrayList4.add((String) pair2.getFirst());
                                                                                                }
                                                                                                List listM4854 = AbstractC2725.m4854(new Pair(textView6, linearLayout6), new Pair(textView5, linearLayout5), new Pair(textView8, linearLayout8), new Pair(textView7, linearLayout7), new Pair(textView2, linearLayout2), new Pair(textView, linearLayout), new Pair(textView4, linearLayout4), new Pair(textView3, linearLayout3));
                                                                                                ArrayList<C2214> arrayList5 = new ArrayList(AbstractC0055.m419(listM4854, 10));
                                                                                                int i6 = 0;
                                                                                                for (Object obj2 : listM4854) {
                                                                                                    int i7 = i6 + 1;
                                                                                                    if (i6 < 0) {
                                                                                                        AbstractC2725.m4853();
                                                                                                        throw null;
                                                                                                    }
                                                                                                    Pair pair3 = (Pair) obj2;
                                                                                                    Object objComponent1 = pair3.component1();
                                                                                                    AbstractC2328.m4341(-121031751271278L);
                                                                                                    TextView textView9 = (TextView) objComponent1;
                                                                                                    Object objComponent2 = pair3.component2();
                                                                                                    AbstractC2328.m4341(-121100470748014L);
                                                                                                    LinearLayout linearLayout9 = (LinearLayout) objComponent2;
                                                                                                    final boolean z = i6 % 2 == 0;
                                                                                                    final int i8 = 0;
                                                                                                    arrayList5.add(new C2214(z ? arrayList : arrayList2, z ? arrayList3 : arrayList4, textView9, linearLayout9, i6 / 2, new InterfaceC1549(i8, z) { // from class: yyds.ᛷᲈᲁᛸ

                                                                                                        /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
                                                                                                        public final /* synthetic */ int f8620;

                                                                                                        /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
                                                                                                        public final /* synthetic */ boolean f8621;

                                                                                                        @Override // yyds.InterfaceC1549
                                                                                                        /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                                                                                                        public final native Object mo371(Object obj3);
                                                                                                    }));
                                                                                                    i6 = i7;
                                                                                                }
                                                                                                for (C2214 c2214 : arrayList5) {
                                                                                                    C0947 c0947 = new C0947();
                                                                                                    int i9 = Integer.parseInt((String) c2214.f10951.get(c2214.f10950));
                                                                                                    c0947.f4410 = i9;
                                                                                                    c2214.f10953.setText((CharSequence) c2214.f10952.get(i9));
                                                                                                    c2214.f10955.setOnClickListener(new ViewOnClickListenerC1374(c0947, 18, c2214));
                                                                                                }
                                                                                            } else {
                                                                                                i5 = R.id.top_right_long_text;
                                                                                            }
                                                                                        } else {
                                                                                            i5 = R.id.top_right_long;
                                                                                        }
                                                                                    } else {
                                                                                        i5 = R.id.top_right_double_text;
                                                                                    }
                                                                                } else {
                                                                                    i5 = R.id.top_right_double;
                                                                                }
                                                                            } else {
                                                                                i5 = R.id.top_left_long_text;
                                                                            }
                                                                        } else {
                                                                            i5 = R.id.top_left_long;
                                                                        }
                                                                    } else {
                                                                        i5 = R.id.top_left_double_text;
                                                                    }
                                                                } else {
                                                                    i5 = R.id.top_left_double;
                                                                }
                                                            } else {
                                                                i5 = i4;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            i5 = R.id.bottom_right_double_text;
                                        }
                                    } else {
                                        i5 = R.id.bottom_right_double;
                                    }
                                } else {
                                    i5 = R.id.bottom_left_long_text;
                                }
                            } else {
                                i5 = R.id.bottom_left_long;
                            }
                        } else {
                            i5 = R.id.bottom_left_double_text;
                        }
                    } else {
                        i5 = R.id.bottom_left_double;
                    }
                    C0188.m789(AbstractC2328.m4341(-1749949637886830L).concat(viewInflate.getResources().getResourceName(i5)));
                    return;
                }
                frameLayout = frameLayout2;
                Pair[] pairArr3 = C0524.f2521;
                ArrayList arrayList6 = new ArrayList(pairArr3.length);
                for (Pair pair4 : pairArr3) {
                    arrayList6.add((String) pair4.getFirst());
                }
                Pair[] pairArr4 = C0066.f598;
                ArrayList arrayList7 = new ArrayList(pairArr4.length);
                for (Pair pair5 : pairArr4) {
                    arrayList7.add((String) pair5.getFirst());
                }
                List listM48542 = AbstractC2725.m4854(new Pair(viewInflate.findViewById(R.id.top_left_long_text), viewInflate.findViewById(R.id.top_left_long)), new Pair(viewInflate.findViewById(R.id.top_left_double_text), viewInflate.findViewById(R.id.top_left_double)), new Pair(viewInflate.findViewById(R.id.top_center_long_text), viewInflate.findViewById(R.id.top_center_long)), new Pair(viewInflate.findViewById(R.id.top_center_double_text), viewInflate.findViewById(R.id.top_center_double)), new Pair(viewInflate.findViewById(R.id.top_right_long_text), viewInflate.findViewById(R.id.top_right_long)), new Pair(viewInflate.findViewById(R.id.top_right_double_text), viewInflate.findViewById(R.id.top_right_double)), new Pair(viewInflate.findViewById(R.id.middle_left_long_text), viewInflate.findViewById(R.id.middle_left_long)), new Pair(viewInflate.findViewById(R.id.middle_left_double_text), viewInflate.findViewById(R.id.middle_left_double)), new Pair(viewInflate.findViewById(R.id.middle_center_long_text), viewInflate.findViewById(R.id.middle_center_long)), new Pair(viewInflate.findViewById(R.id.middle_center_double_text), viewInflate.findViewById(R.id.middle_center_double)), new Pair(viewInflate.findViewById(R.id.middle_right_long_text), viewInflate.findViewById(R.id.middle_right_long)), new Pair(viewInflate.findViewById(R.id.middle_right_double_text), viewInflate.findViewById(R.id.middle_right_double)), new Pair(viewInflate.findViewById(R.id.bottom_left_long_text), viewInflate.findViewById(R.id.bottom_left_long)), new Pair(viewInflate.findViewById(R.id.bottom_left_double_text), viewInflate.findViewById(R.id.bottom_left_double)), new Pair(viewInflate.findViewById(R.id.bottom_center_long_text), viewInflate.findViewById(R.id.bottom_center_long)), new Pair(viewInflate.findViewById(R.id.bottom_center_double_text), viewInflate.findViewById(R.id.bottom_center_double)), new Pair(viewInflate.findViewById(R.id.bottom_right_long_text), viewInflate.findViewById(R.id.bottom_right_long)), new Pair(viewInflate.findViewById(R.id.bottom_right_double_text), viewInflate.findViewById(R.id.bottom_right_double)));
                ArrayList<C2214> arrayList8 = new ArrayList(AbstractC0055.m419(listM48542, 10));
                int i10 = 0;
                for (Object obj3 : listM48542) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC2725.m4853();
                        throw null;
                    }
                    Pair pair6 = (Pair) obj3;
                    Object objComponent12 = pair6.component1();
                    AbstractC2328.m4341(-121293744276334L);
                    TextView textView10 = (TextView) objComponent12;
                    Object objComponent22 = pair6.component2();
                    AbstractC2328.m4341(-121362463753070L);
                    LinearLayout linearLayout10 = (LinearLayout) objComponent22;
                    final boolean z2 = i10 % 2 == 0;
                    ArrayList arrayList9 = z2 ? arrayList : arrayList2;
                    final int i12 = 1;
                    arrayList8.add(new C2214(arrayList9, z2 ? arrayList6 : arrayList7, textView10, linearLayout10, i10 / 2, new InterfaceC1549(i12, z2) { // from class: yyds.ᛷᲈᲁᛸ

                        /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
                        public final /* synthetic */ int f8620;

                        /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
                        public final /* synthetic */ boolean f8621;

                        @Override // yyds.InterfaceC1549
                        /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
                        public final native Object mo371(Object obj32);
                    }));
                    i10 = i11;
                }
                for (C2214 c22142 : arrayList8) {
                    C0947 c09472 = new C0947();
                    int i13 = Integer.parseInt((String) c22142.f10951.get(c22142.f10950));
                    c09472.f4410 = i13;
                    c22142.f10953.setText((CharSequence) c22142.f10952.get(i13));
                    c22142.f10955.setOnClickListener(new ViewOnClickListenerC1192(c09472, c22142, context2, 18));
                }
                FrameLayout frameLayout3 = frameLayout;
                frameLayout3.setAlpha(0.0f);
                frameLayout3.animate().alpha(1.0f).setDuration(500L).setInterpolator(new DecelerateInterpolator()).start();
                return;
            case 11:
                Toast.makeText((Context) this.f13249, (String) this.f13247, 0).show();
                return;
            case 12:
                Runnable runnable = (Runnable) this.f13247;
                executorC2250 = (ExecutorC2250) this.f13249;
                try {
                    runnable.run();
                    return;
                } finally {
                }
            case 13:
                C2531 c2531 = (C2531) this.f13249;
                C0912 c09122 = (C0912) this.f13247;
                int[] iArr2 = new int[2];
                ((LinearLayout) c2531.f12463).getLocationOnScreen(iArr2);
                c09122.m2024(iArr2[0], iArr2[1]);
                return;
            case 14:
                ((C2683) this.f13249).m4781((View) this.f13247);
                return;
            default:
                WardDatabase wardDatabase = (WardDatabase) this.f13249;
                List list2 = (List) this.f13247;
                wardDatabase.mo344().m1082();
                if (list2.isEmpty()) {
                    return;
                }
                C0380 c0380Mo344 = wardDatabase.mo344();
                c0380Mo344.getClass();
                AbstractC2328.m4341(-1372984653284206L);
                AbstractC1960.m3776(c0380Mo344.f1954, new C2713(c0380Mo344, list2));
                return;
        }
    }

    public /* synthetic */ RunnableC2696(Object obj, int i, Object obj2) {
        this.f13248 = i;
        this.f13249 = obj;
        this.f13247 = obj2;
    }
}
