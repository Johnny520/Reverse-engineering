package yyds;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.C0038;
import com.p000ss.android.ugc.awemes.MainActivity;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛲᛳᛵᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0309 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f1618;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f1619;

    public /* synthetic */ RunnableC0309(int i, Object obj) {
        this.f1618 = i;
        this.f1619 = obj;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    private final void m975() {
        C1903 c1903 = (C1903) this.f1619;
        synchronized (c1903.f9628) {
            try {
                if (c1903.f9627 == null) {
                    return;
                }
                try {
                    C2685 c2685M3686 = c1903.m3686();
                    int i = c2685M3686.f13152;
                    if (i == 2) {
                        synchronized (c1903.f9628) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                    }
                    try {
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        Typeface typefaceM2238 = AbstractC1046.m2238(c1903.f9630, new C2685[]{c2685M3686}, 0);
                        MappedByteBuffer mappedByteBufferM3957 = AbstractC2071.m3957(c1903.f9630, c2685M3686.f13149);
                        if (mappedByteBufferM3957 == null || typefaceM2238 == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        try {
                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                            C0299 c0299 = new C0299(typefaceM2238, AbstractC2408.m4451(mappedByteBufferM3957));
                            Trace.endSection();
                            synchronized (c1903.f9628) {
                                try {
                                    AbstractC0476 abstractC0476 = c1903.f9627;
                                    if (abstractC0476 != null) {
                                        abstractC0476.mo1334(c0299);
                                    }
                                } finally {
                                }
                            }
                            c1903.m3685();
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (c1903.f9628) {
                        try {
                            AbstractC0476 abstractC04762 = c1903.f9627;
                            if (abstractC04762 != null) {
                                abstractC04762.mo1333(th2);
                            }
                            c1903.m3685();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Field field;
        Object c2658;
        Class cls;
        Integer numM1693;
        Integer numM16932;
        EnumC2097 enumC2097;
        C2535 c2535M3329;
        Pair pair = null;
        switch (this.f1618) {
            case 0:
                ViewOnTouchListenerC0565 viewOnTouchListenerC0565 = (ViewOnTouchListenerC0565) this.f1619;
                viewOnTouchListenerC0565.m1436();
                viewOnTouchListenerC0565.m1437();
                viewOnTouchListenerC0565.m1435();
                return;
            case 1:
                ViewOnTouchListenerC0565 viewOnTouchListenerC05652 = ((ViewOnLayoutChangeListenerC1679) this.f1619).f8566;
                viewOnTouchListenerC05652.m1436();
                viewOnTouchListenerC05652.m1437();
                viewOnTouchListenerC05652.m1435();
                return;
            case 2:
                ArrayList<Pair> arrayList = (ArrayList) this.f1619;
                Method method = C1332.f6166;
                if (method == null || (field = C1332.f6163) == null) {
                    return;
                }
                for (Pair pair2 : arrayList) {
                    Object objComponent1 = pair2.component1();
                    C2533 c2533 = (C2533) pair2.component2();
                    C1332 c1332 = C1332.f6157;
                    Comment commentM2725 = C1332.m2725(objComponent1);
                    if (AbstractC1544.m3188(commentM2725 != null ? C1332.m2734(commentM2725.cid) : null, c2533.f12472)) {
                        try {
                            field.setInt(objComponent1, c2533.f12473);
                            Object obj = c2533.f12474.get();
                            Object objM2738 = (obj == null || (cls = C1332.f6153) == null) ? null : C1332.m2738(obj, cls);
                            if (obj != null && objM2738 == objComponent1) {
                                method.invoke(obj, Integer.valueOf(c2533.f12473));
                            }
                            c2658 = C2746.f13459;
                        } catch (Throwable th) {
                            c2658 = new C2658(th);
                        }
                        Throwable thM4249 = C2248.m4249(c2658);
                        if (thM4249 != null) {
                            C2336.f11496.m4355(AbstractC2328.m4341(-795831243015022L), thM4249);
                        }
                    }
                }
                return;
            case 3:
                DialogC0194.m820((DialogC0194) this.f1619);
                return;
            case 4:
                C0093 c0093 = (C0093) this.f1619;
                C0912 c0912 = c0093.f700;
                FrameLayout frameLayout = c0093.f706;
                if (c0912 == null || c0093.f703) {
                    return;
                }
                c0093.f703 = true;
                int width = frameLayout.getWidth();
                if (width < 1) {
                    width = 1;
                }
                int height = frameLayout.getHeight();
                if (height < 1) {
                    height = 1;
                }
                Rect rectM501 = c0093.m501();
                C1509.f7142.getClass();
                String string = AbstractC0473.m1314((String) C1509.f7249.m1579(C1509.f7179[114])).toString();
                if (string.length() != 0) {
                    List listM1296 = AbstractC0473.m1296(string, new String[]{AbstractC2328.m4341(-217934803403630L)}, 6);
                    if (listM1296.size() == 2 && (numM1693 = AbstractC0733.m1693(AbstractC0473.m1314((String) listM1296.get(0)).toString())) != null && (numM16932 = AbstractC0733.m1693(AbstractC0473.m1314((String) listM1296.get(1)).toString())) != null) {
                        pair = new Pair(numM1693, numM16932);
                    }
                }
                Pair pairM500 = c0093.m500(pair != null ? ((Number) pair.getFirst()).intValue() : rectM501.left + ((rectM501.width() - width) / 2), pair != null ? ((Number) pair.getSecond()).intValue() : ((rectM501.height() - height) / 2) + rectM501.top, width, height);
                c0912.m2024(((Number) pairM500.component1()).intValue(), ((Number) pairM500.component2()).intValue());
                return;
            case 5:
                ((InterfaceC2266) this.f1619).mo731();
                return;
            case 6:
                EnumC2097 enumC20972 = (EnumC2097) this.f1619;
                C1784.f9012.remove(enumC20972);
                C1784.f9011.getClass();
                LinkedHashSet<ViewGroup> linkedHashSet = new LinkedHashSet();
                Map map = C1784.f8997;
                AbstractC2328.m4341(-1006971835286382L);
                synchronized (map) {
                    AbstractC2328.m4341(-1007019079926638L);
                    for (Map.Entry entry : map.entrySet()) {
                        ViewGroup viewGroup = (ViewGroup) entry.getKey();
                        if (((EnumC2097) entry.getValue()) == enumC20972) {
                            linkedHashSet.add(viewGroup);
                        }
                        break;
                    }
                }
                Map map2 = C1784.f9001;
                AbstractC2328.m4341(-1007066324566894L);
                synchronized (map2) {
                    try {
                        AbstractC2328.m4341(-1007092094370670L);
                        for (Map.Entry entry2 : map2.entrySet()) {
                            ViewGroup viewGroup2 = (ViewGroup) entry2.getKey();
                            C1628 c1628 = (C1628) ((WeakReference) entry2.getValue()).get();
                            if (((c1628 == null || (c2535M3329 = c1628.m3329()) == null) ? null : c2535M3329.f12483) == enumC20972) {
                                linkedHashSet.add(viewGroup2);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                for (ViewGroup viewGroup3 : linkedHashSet) {
                    Map map3 = C1784.f8997;
                    AbstractC2328.m4341(-1007117864174446L);
                    synchronized (map3) {
                        enumC2097 = (EnumC2097) map3.get(viewGroup3);
                    }
                    if (enumC2097 == null) {
                        AbstractC2328.m4341(-1007165108814702L);
                        synchronized (map3) {
                            AbstractC2328.m4341(-1007212353454958L);
                            map3.put(viewGroup3, enumC20972);
                        }
                        enumC2097 = enumC20972;
                    }
                    C1784.f9011.m3567(viewGroup3, enumC2097, true, true);
                }
                return;
            case 7:
                ((C1178) this.f1619).mo731();
                return;
            case 8:
                m975();
                return;
            case 9:
                ((C2307) this.f1619).mo731();
                return;
            case 10:
                ImageView imageView = (ImageView) this.f1619;
                List list = MainActivity.f451;
                imageView.setRotation(imageView.getRotation() % 360.0f);
                return;
            case 11:
                LinearLayout linearLayout = (LinearLayout) this.f1619;
                linearLayout.setAlpha(0.0f);
                linearLayout.setScaleX(0.88f);
                linearLayout.setScaleY(0.88f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(linearLayout, AbstractC2328.m4341(-192538661782382L), 0.0f, 1.0f), ObjectAnimator.ofFloat(linearLayout, AbstractC2328.m4341(-192564431586158L), 0.88f, 1.0f), ObjectAnimator.ofFloat(linearLayout, AbstractC2328.m4341(-192594496357230L), 0.88f, 1.0f));
                animatorSet.setDuration(180L);
                animatorSet.setInterpolator(new DecelerateInterpolator(2.0f));
                animatorSet.start();
                return;
            case 12:
                ((HorizontalScrollView) this.f1619).fullScroll(66);
                return;
            case 13:
                AbstractC0342 abstractC0342 = (AbstractC0342) this.f1619;
                AbstractFragmentC1695 abstractFragmentC1695 = abstractC0342.f1788;
                if (!abstractFragmentC1695.isAdded() || abstractFragmentC1695.isRemoving() || AbstractC0879.m1968(abstractFragmentC1695.getActivity())) {
                    return;
                }
                C0119 c0119 = abstractC0342.f1792;
                abstractC0342.f1792 = null;
                if (c0119 != null) {
                    ((C0805) c0119.f812).getClass();
                    ((RunnableC2282) c0119.f810).run();
                }
                abstractC0342.f1793 = true;
                abstractFragmentC1695.m3446();
                return;
            case 14:
                ((C1633) this.f1619).m3332();
                return;
            case 15:
                C0910 c0910 = (C0910) this.f1619;
                C0038 c0038 = c0910.f4139;
                if (c0910.f4145 == 0) {
                    c0910.f4141 = true;
                    c0038.m127(EnumC0637.ON_PAUSE);
                }
                if (c0910.f4143 == 0 && c0910.f4141) {
                    c0038.m127(EnumC0637.ON_STOP);
                    c0910.f4144 = true;
                    return;
                }
                return;
            case 16:
                ((C0302) this.f1619).m967(EnumC0676.f3220, 0L);
                return;
            case 17:
                C1186 c1186 = (C1186) this.f1619;
                C1624 c1624 = c1186.f5431;
                if (c1624 != null) {
                    c1624.m3327();
                }
                c1186.f5431 = null;
                return;
            default:
                ((RunnableC0678) this.f1619).f3228.m2039();
                return;
        }
    }
}
