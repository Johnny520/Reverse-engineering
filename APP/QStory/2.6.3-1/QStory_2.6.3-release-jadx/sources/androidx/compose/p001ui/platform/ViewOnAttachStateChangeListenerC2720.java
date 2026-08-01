package androidx.compose.p001ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.activity.AbstractC0900;
import androidx.collection.AbstractC1116;
import androidx.collection.AbstractC1117;
import androidx.collection.AbstractC1120;
import androidx.collection.AbstractC1121;
import androidx.collection.AbstractC1127;
import androidx.collection.AbstractC1132;
import androidx.collection.AbstractC1137;
import androidx.collection.C1082;
import androidx.collection.C1083;
import androidx.collection.C1092;
import androidx.collection.C1093;
import androidx.collection.C1094;
import androidx.collection.C1095;
import androidx.collection.C1122;
import androidx.collection.C1129;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2411;
import androidx.compose.p001ui.graphics.C2420;
import androidx.compose.p001ui.graphics.C2421;
import androidx.compose.p001ui.graphics.C2449;
import androidx.compose.p001ui.graphics.InterfaceC2404;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2638;
import androidx.compose.p001ui.node.InterfaceC2596;
import androidx.compose.p001ui.node.InterfaceC2622;
import androidx.compose.p001ui.semantics.AbstractC2768;
import androidx.compose.p001ui.semantics.AbstractC2778;
import androidx.compose.p001ui.semantics.AbstractC2792;
import androidx.compose.p001ui.semantics.AbstractC2794;
import androidx.compose.p001ui.semantics.C2776;
import androidx.compose.p001ui.semantics.C2782;
import androidx.compose.p001ui.semantics.C2785;
import androidx.compose.p001ui.semantics.C2788;
import androidx.compose.p001ui.semantics.C2789;
import androidx.compose.p001ui.semantics.C2791;
import androidx.compose.p001ui.semantics.C2793;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.runtime.collection.C2059;
import androidx.core.view.C3079;
import androidx.core.widget.AbstractC3129;
import com.alibaba.fastjson2.C3775;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.protobuf.DescriptorProtos$Edition;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.InterfaceC6000;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6022;
import kotlinx.coroutines.channels.C6023;
import kotlinx.coroutines.channels.InterfaceC6044;
import p050.AbstractC7176;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7387;
import p128.C8156;
import p128.C8157;
import p128.C8158;
import p171.C8436;
import p209.C8657;
import p221.C8734;
import p223.AbstractC8743;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2720 extends C3079 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static final C1094 f5851 = AbstractC1117.m1395(C0328R.id.accessibility_custom_action_0, C0328R.id.accessibility_custom_action_1, C0328R.id.accessibility_custom_action_2, C0328R.id.accessibility_custom_action_3, C0328R.id.accessibility_custom_action_4, C0328R.id.accessibility_custom_action_5, C0328R.id.accessibility_custom_action_6, C0328R.id.accessibility_custom_action_7, C0328R.id.accessibility_custom_action_8, C0328R.id.accessibility_custom_action_9, C0328R.id.accessibility_custom_action_10, C0328R.id.accessibility_custom_action_11, C0328R.id.accessibility_custom_action_12, C0328R.id.accessibility_custom_action_13, C0328R.id.accessibility_custom_action_14, C0328R.id.accessibility_custom_action_15, C0328R.id.accessibility_custom_action_16, C0328R.id.accessibility_custom_action_17, C0328R.id.accessibility_custom_action_18, C0328R.id.accessibility_custom_action_19, C0328R.id.accessibility_custom_action_20, C0328R.id.accessibility_custom_action_21, C0328R.id.accessibility_custom_action_22, C0328R.id.accessibility_custom_action_23, C0328R.id.accessibility_custom_action_24, C0328R.id.accessibility_custom_action_25, C0328R.id.accessibility_custom_action_26, C0328R.id.accessibility_custom_action_27, C0328R.id.accessibility_custom_action_28, C0328R.id.accessibility_custom_action_29, C0328R.id.accessibility_custom_action_30, C0328R.id.accessibility_custom_action_31);

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final C8657 f5852;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final C1093 f5853;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final C1095 f5854;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final C1095 f5855;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final String f5856;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final String f5857;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C1093 f5858;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C1092 f5859;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C6022 f5860;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C1122 f5861;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C2722 f5862;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f5863;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f5864;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C8436 f5865;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public C8436 f5866;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f5867;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f5868;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C2718 f5869;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public Integer f5870;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f5871;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C1129 f5872;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C1129 f5873;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C1093 f5874;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C1093 f5875;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC2719 f5877;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public long f5878;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public List f5879;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AccessibilityManager f5881;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public boolean f5882;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C2707 f5883;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final ArrayList f5884;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final InterfaceC7387 f5885;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final C1095 f5886;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final RunnableC2717 f5887;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f5876 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC7387 f5880 = new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1
        {
            super(1);
        }

        @Override // p068.InterfaceC7387
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(this.this$0.f5877.getParent().requestSendAccessibilityEvent(this.this$0.f5877, accessibilityEvent));
        }
    };

    public ViewOnAttachStateChangeListenerC2720(ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719) {
        this.f5877 = viewTreeObserverOnGlobalLayoutListenerC2719;
        Object systemService = viewTreeObserverOnGlobalLayoutListenerC2719.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.f5881 = (AccessibilityManager) systemService;
        this.f5878 = 100L;
        new Handler(Looper.getMainLooper());
        this.f5869 = new C2718(this);
        this.f5868 = Integer.MIN_VALUE;
        this.f5867 = Integer.MIN_VALUE;
        this.f5875 = new C1093();
        this.f5874 = new C1093();
        this.f5873 = new C1129(0);
        this.f5872 = new C1129(0);
        this.f5871 = -1;
        this.f5861 = new C1122(0);
        this.f5860 = AbstractC6037.m10841(1, 6, null);
        this.f5863 = true;
        C1093 c1093 = AbstractC1120.f1323;
        c1093.getClass();
        this.f5858 = c1093;
        this.f5859 = new C1092();
        this.f5855 = new C1095();
        this.f5854 = new C1095();
        this.f5857 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f5856 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f5852 = new C8657(0);
        this.f5853 = new C1093();
        this.f5883 = new C2707(viewTreeObserverOnGlobalLayoutListenerC2719.getSemanticsOwner().m4211(), c1093);
        int i = AbstractC1127.f1333;
        this.f5886 = new C1095();
        viewTreeObserverOnGlobalLayoutListenerC2719.addOnAttachStateChangeListener(this);
        this.f5887 = new RunnableC2717(this, 1);
        this.f5884 = new ArrayList();
        this.f5885 = new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            {
                super(1);
            }

            public final void invoke(C2711 c2711) {
                ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC2720 = this.this$0;
                C1094 c1094 = ViewOnAttachStateChangeListenerC2720.f5851;
                viewOnAttachStateChangeListenerC2720.getClass();
                if (c2711.f5728.contains(c2711)) {
                    C2638 snapshotObserver = viewOnAttachStateChangeListenerC2720.f5877.getSnapshotObserver();
                    snapshotObserver.f5619.m2806(c2711, viewOnAttachStateChangeListenerC2720.f5885, new C0195xa0354dde(c2711, viewOnAttachStateChangeListenerC2720));
                }
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C2711) obj);
                return C6008.f15084;
            }
        };
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static Region m4115(AbstractC2416 abstractC2416, float f, float f2) {
        if (abstractC2416 instanceof C2421) {
            C2421 c2421 = (C2421) abstractC2416;
            C8157 c8157M13081 = c2421.mo3429().m13081(f, f2);
            Region region = new Region(new Rect((int) (c8157M13081.f19885 + 0.0f), (int) (c8157M13081.f19884 + 0.0f), (int) (c8157M13081.f19883 + 0.0f), (int) (c8157M13081.f19882 + 0.0f)));
            Region region2 = new Region();
            C2449 c2449 = c2421.f5018;
            if (c2449 instanceof C2449) {
                Path path = c2449.f5070;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            C6755.m11867("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static CharSequence m4116(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(DescriptorProtos$Edition.EDITION_99999_TEST_ONLY_VALUE)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static Rect m4117(AbstractC2416 abstractC2416, float f, float f2) {
        if (!(abstractC2416 instanceof C2420) && !(abstractC2416 instanceof C2411)) {
            return null;
        }
        C8157 c8157Mo3429 = abstractC2416.mo3429();
        return new Rect((int) (c8157Mo3429.f19885 + f), (int) (c8157Mo3429.f19884 + f2), (int) (c8157Mo3429.f19883 + f), (int) (c8157Mo3429.f19882 + f2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static float[] m4118(AbstractC2416 abstractC2416) {
        if (!(abstractC2416 instanceof C2411)) {
            return null;
        }
        C8156 c8156 = ((C2411) abstractC2416).f5001;
        long j = c8156.f19879;
        long j2 = c8156.f19880;
        long j3 = c8156.f19873;
        long j4 = c8156.f19874;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final boolean m4119(C2793 c2793) {
        InterfaceC7372 interfaceC7372 = c2793.f6127;
        if (((Number) interfaceC7372.invoke()).floatValue() < ((Number) c2793.f6126.invoke()).floatValue()) {
            return true;
        }
        ((Number) interfaceC7372.invoke()).floatValue();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final boolean m4120(C2793 c2793) {
        InterfaceC7372 interfaceC7372 = c2793.f6127;
        if (((Number) interfaceC7372.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) interfaceC7372.invoke()).floatValue();
        ((Number) c2793.f6126.invoke()).floatValue();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m4121(ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC2720, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        viewOnAttachStateChangeListenerC2720.m4127(i, i2, num, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static String m4122(C2788 c2788) {
        C2902 c2902;
        if (c2788 != null) {
            C2791 c2791 = c2788.f6114;
            C1083 c1083 = c2791.f6124;
            C2782 c2782 = AbstractC2778.f6079;
            if (c1083.m1312(c2782)) {
                return AbstractC8743.m13970((List) c2791.m4231(c2782), ",", null, 62);
            }
            C2782 c27822 = AbstractC2778.f6071;
            if (c1083.m1312(c27822)) {
                C2902 c29022 = (C2902) AbstractC2792.m4233(c2791, c27822);
                if (c29022 != null) {
                    return c29022.f6474;
                }
            } else {
                List list = (List) AbstractC2792.m4233(c2791, AbstractC2778.f6063);
                if (list != null && (c2902 = (C2902) AbstractC5176.m9374(list)) != null) {
                    return c2902.f6474;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final boolean m4123(C2793 c2793, float f) {
        InterfaceC7372 interfaceC7372 = c2793.f6127;
        if (f >= 0.0f || ((Number) interfaceC7372.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) interfaceC7372.invoke()).floatValue() < ((Number) c2793.f6126.invoke()).floatValue();
        }
        return true;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.f5879 = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.f5879 = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.f5881;
        if (accessibilityManager.isEnabled()) {
            this.f5879 = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f5877.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.f5887);
        AccessibilityManager accessibilityManager = this.f5881;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0139, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0143, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0145, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4124() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        int iNumberOfTrailingZeros;
        char c2;
        C1092 c1092 = new C1092();
        C1092 c10922 = this.f5859;
        int[] iArr = c10922.f1246;
        long[] jArr3 = c10922.f1247;
        int length = jArr3.length - 2;
        C1093 c1093 = this.f5853;
        int i3 = 8;
        if (length >= 0) {
            int i4 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i4];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j5 & 255) < 128) {
                            int i7 = iArr[(i4 << 3) + i6];
                            c2 = c3;
                            C2785 c2785 = (C2785) m4137().m1393(i7);
                            C2788 c2788 = c2785 != null ? c2785.f6106 : null;
                            if (c2788 != null) {
                                if (!c2788.f6114.f6124.m1312(AbstractC2778.f6076)) {
                                    c1092.m1345(i7);
                                    C2707 c2707 = (C2707) c1093.m1393(i7);
                                    m4135(i7, 32, c2707 != null ? (String) AbstractC2792.m4233(c2707.f5724, AbstractC2778.f6076) : null);
                                }
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i6++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i4 == length) {
                    break;
                } else {
                    i4++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = c1092.f1246;
        long[] jArr4 = c1092.f1247;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i8 = 0;
            while (true) {
                long j6 = jArr4[i8];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j6 & j2) < j) {
                            int i11 = iArr2[(i8 << 3) + i10];
                            int iHashCode = Integer.hashCode(i11) * (-862048943);
                            int i12 = iHashCode ^ (iHashCode << 16);
                            int i13 = i12 & 127;
                            int i14 = c10922.f1245;
                            int i15 = (i12 >>> 7) & i14;
                            i = i3;
                            int i16 = 0;
                            while (true) {
                                long[] jArr5 = c10922.f1247;
                                int i17 = i15 >> 3;
                                jArr2 = jArr4;
                                int i18 = (i15 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i17] >>> i18) | ((jArr5[i17 + 1] << (64 - i18)) & ((-i18) >> 63));
                                int i19 = i14;
                                long j8 = (((long) i13) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (true) {
                                    if (j9 == 0) {
                                        break;
                                    }
                                    iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j9) >> 3)) & i19;
                                    int i20 = i19;
                                    if (c10922.f1246[iNumberOfTrailingZeros] == i11) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i19 = i20;
                                }
                                i16 += 8;
                                i15 = (i15 + i16) & i2;
                                jArr4 = jArr2;
                                i14 = i2;
                                j6 = j4;
                            }
                            int i21 = iNumberOfTrailingZeros;
                            if (i21 >= 0) {
                                c10922.m1340(i21);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i3;
                        }
                        j6 = j4 >> i;
                        i10++;
                        i3 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i9 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i8 == length2) {
                    break;
                }
                i8++;
                jArr4 = jArr;
                i3 = 8;
            }
        }
        c1093.m1349();
        AbstractC1116 abstractC1116M4137 = m4137();
        int[] iArr3 = abstractC1116M4137.f1318;
        Object[] objArr = abstractC1116M4137.f1317;
        long[] jArr6 = abstractC1116M4137.f1319;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i22 = 0;
            while (true) {
                long j10 = jArr6[i22];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i23 = 8 - ((~(i22 - length3)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & j2) < j) {
                            int i25 = (i22 << 3) + i24;
                            int i26 = iArr3[i25];
                            C2788 c27882 = ((C2785) objArr[i25]).f6106;
                            C2791 c2791 = c27882.f6114;
                            C2782 c2782 = AbstractC2778.f6076;
                            if (c2791.f6124.m1312(c2782) && c10922.m1345(i26)) {
                                m4135(i26, 16, (String) c27882.f6114.m4231(c2782));
                            }
                            c1093.m1350(i26, new C2707(c27882, m4137()));
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length3) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.f5883 = new C2707(this.f5877.getSemanticsOwner().m4211(), m4137());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final boolean m4125(C2788 c2788, int i, int i2, boolean z) {
        String strM4122;
        C2791 c2791 = c2788.f6114;
        int i3 = c2788.f6112;
        C2782 c2782 = AbstractC2794.f6156;
        if (c2791.f6124.m1312(c2782) && AbstractC2751.m4179(c2788)) {
            InterfaceC7380 interfaceC7380 = (InterfaceC7380) ((C2776) c2788.f6114.m4231(c2782)).f6051;
            if (interfaceC7380 != null) {
                return ((Boolean) interfaceC7380.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.f5871) && (strM4122 = m4122(c2788)) != null) {
            if (i < 0 || i != i2 || i2 > strM4122.length()) {
                i = -1;
            }
            this.f5871 = i;
            boolean z2 = strM4122.length() > 0;
            m4128(m4146(m4130(i3), z2 ? Integer.valueOf(this.f5871) : null, z2 ? Integer.valueOf(this.f5871) : null, z2 ? Integer.valueOf(strM4122.length()) : null, strM4122));
            m4134(i3);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final Rect m4126(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = this.f5877;
        long jM4098 = viewTreeObserverOnGlobalLayoutListenerC2719.m4098(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jM40982 = viewTreeObserverOnGlobalLayoutListenerC2719.m4098((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jM4098 >> 32);
        int i2 = (int) (jM40982 >> 32);
        int i3 = (int) (jM4098 & 4294967295L);
        int i4 = (int) (jM40982 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final boolean m4127(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !m4140()) {
            return false;
        }
        AccessibilityEvent accessibilityEventM4145 = m4145(i, i2);
        if (num != null) {
            accessibilityEventM4145.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventM4145.setContentDescription(AbstractC8743.m13970(list, ",", null, 62));
        }
        return m4128(accessibilityEventM4145);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final boolean m4128(AccessibilityEvent accessibilityEvent) {
        if (!m4140()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f5864 = true;
        }
        try {
            return ((Boolean) this.f5880.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f5864 = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4129(C2788 c2788, C2707 c2707) {
        int[] iArr = AbstractC1121.f1324;
        C1092 c1092 = new C1092();
        List listM4212 = C2788.m4212(4, c2788);
        C2583 c2583 = c2788.f6115;
        int size = listM4212.size();
        for (int i = 0; i < size; i++) {
            C2788 c27882 = (C2788) listM4212.get(i);
            AbstractC1116 abstractC1116M4137 = m4137();
            int i2 = c27882.f6112;
            if (abstractC1116M4137.m1394(i2)) {
                if (!c2707.f5723.m1344(i2)) {
                    m4138(c2583);
                    return;
                }
                c1092.m1345(i2);
            }
        }
        C1092 c10922 = c2707.f5723;
        int[] iArr2 = c10922.f1246;
        long[] jArr = c10922.f1247;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !c1092.m1344(iArr2[(i3 << 3) + i5])) {
                            m4138(c2583);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listM42122 = C2788.m4212(4, c2788);
        int size2 = listM42122.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C2788 c27883 = (C2788) listM42122.get(i6);
            C2707 c27072 = (C2707) this.f5853.m1393(c27883.f6112);
            if (c27072 != null && m4137().m1394(c27883.f6112)) {
                m4129(c27883, c27072);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int m4130(int i) {
        if (i == this.f5877.getSemanticsOwner().m4211().f6112) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m4131(C2583 c2583) {
        if (c2583.m3803() && !this.f5877.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(c2583)) {
            int i = c2583.f5468;
            C2793 c2793 = (C2793) this.f5875.m1393(i);
            C2793 c27932 = (C2793) this.f5874.m1393(i);
            if (c2793 == null && c27932 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventM4145 = m4145(i, 4096);
            if (c2793 != null) {
                accessibilityEventM4145.setScrollX((int) ((Number) c2793.f6127.invoke()).floatValue());
                accessibilityEventM4145.setMaxScrollX((int) ((Number) c2793.f6126.invoke()).floatValue());
            }
            if (c27932 != null) {
                accessibilityEventM4145.setScrollY((int) ((Number) c27932.f6127.invoke()).floatValue());
                accessibilityEventM4145.setMaxScrollY((int) ((Number) c27932.f6126.invoke()).floatValue());
            }
            m4128(accessibilityEventM4145);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m4132(C2583 c2583, C1092 c1092) {
        C2791 c2791M3814;
        C2583 c2583M4175;
        if (c2583.m3803() && !this.f5877.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(c2583)) {
            if (!c2583.f5439.m3988(8)) {
                c2583 = AbstractC2751.m4175(c2583, new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                    @Override // p068.InterfaceC7387
                    public final Boolean invoke(C2583 c25832) {
                        return Boolean.valueOf(c25832.f5439.m3988(8));
                    }
                });
            }
            if (c2583 == null || (c2791M3814 = c2583.m3814()) == null) {
                return;
            }
            if (!c2791M3814.f6123 && (c2583M4175 = AbstractC2751.m4175(c2583, new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1
                @Override // p068.InterfaceC7387
                public final Boolean invoke(C2583 c25832) {
                    C2791 c2791M38142 = c25832.m3814();
                    boolean z = false;
                    if (c2791M38142 != null && c2791M38142.f6123) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            })) != null) {
                c2583 = c2583M4175;
            }
            int i = c2583.f5468;
            if (c1092.m1345(i)) {
                m4121(this, m4130(i), 2048, 1, 8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x04da A[PHI: r37
  0x04da: PHI (r37v8 int) = (r37v7 int), (r37v7 int), (r37v7 int), (r37v7 int), (r37v7 int), (r37v9 int) binds: [B:190:0x04e3, B:195:0x04f0, B:198:0x04ff, B:205:0x050b, B:202:0x0506, B:187:0x04d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159  */
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4133(AbstractC1116 abstractC1116) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        Integer num2;
        int i2;
        int i3;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        Integer num4;
        int i7;
        C2788 c2788;
        int i8;
        int i9;
        C2791 c2791;
        int i10;
        int i11;
        C1083 c1083;
        int i12;
        C1083 c10832;
        C2583 c2583;
        int i13;
        int i14;
        C1083 c10833;
        Integer num5;
        ArrayList arrayList3;
        long j;
        int i15;
        C2788 c27882;
        int i16;
        C1083 c10834;
        C2583 c25832;
        Integer num6;
        int i17;
        C2791 c27912;
        int i18;
        int i19;
        C2711 c2711;
        boolean z;
        C2782 c2782;
        C2711 c27112;
        int i20;
        InterfaceC6000 interfaceC6000;
        int i21;
        String str;
        C2791 c27913;
        int i22;
        int i23;
        int i24;
        AccessibilityEvent accessibilityEventM4146;
        AbstractC1116 abstractC11162 = abstractC1116;
        Integer num7 = 64;
        ArrayList arrayList4 = this.f5884;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = abstractC11162.f1318;
        long[] jArr3 = abstractC11162.f1319;
        int i25 = 2;
        int length = jArr3.length - 2;
        int i26 = 0;
        Integer num8 = 0;
        if (length < 0) {
            return;
        }
        int i27 = 0;
        while (true) {
            long j2 = jArr3[i27];
            int i28 = i25;
            int i29 = length;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i30 = 8;
                int i31 = 8 - ((~(i27 - i29)) >>> 31);
                long j3 = j2;
                int i32 = i26;
                while (i32 < i31) {
                    if ((j3 & 255) < 128) {
                        int i33 = iArr3[(i27 << 3) + i32];
                        C2707 c2707 = (C2707) this.f5853.m1393(i33);
                        if (c2707 == null) {
                            i3 = i32;
                            num3 = num7;
                            arrayList2 = arrayList5;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i4 = i31;
                            i5 = i26;
                            i6 = i27;
                            num4 = num8;
                            i7 = i30;
                        } else {
                            C2791 c27914 = c2707.f5724;
                            C1083 c10835 = c27914.f6124;
                            C2785 c2785 = (C2785) abstractC11162.m1393(i33);
                            int i34 = i30;
                            C2788 c27883 = c2785 != null ? c2785.f6106 : null;
                            if (c27883 == null) {
                                throw AbstractC0900.m699("no value for specified key");
                            }
                            C2583 c25833 = c27883.f6115;
                            C2791 c27915 = c27883.f6114;
                            iArr2 = iArr3;
                            int i35 = c27883.f6112;
                            jArr2 = jArr3;
                            C1083 c10836 = c27915.f6124;
                            i6 = i27;
                            Object[] objArr = c10836.f1225;
                            Object[] objArr2 = c10836.f1224;
                            long[] jArr4 = c10836.f1226;
                            i3 = i32;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                int i36 = i35;
                                C1083 c10837 = c10836;
                                int i37 = 0;
                                i10 = 0;
                                while (true) {
                                    long j4 = jArr4[i37];
                                    C2583 c25834 = c25833;
                                    i4 = i31;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i38 = 8 - ((~(i37 - length2)) >>> 31);
                                        int i39 = 0;
                                        while (i39 < i38) {
                                            if ((j4 & 255) < 128) {
                                                int i40 = (i37 << 3) + i39;
                                                Object obj = objArr[i40];
                                                int i41 = length2;
                                                Object obj2 = objArr2[i40];
                                                j = j4;
                                                C2782 c27822 = (C2782) obj;
                                                C2782 c27823 = AbstractC2778.f6085;
                                                if (AbstractC5227.m9466(c27822, c27823)) {
                                                    i15 = i39;
                                                } else {
                                                    i15 = i39;
                                                    if (!AbstractC5227.m9466(c27822, AbstractC2778.f6082)) {
                                                        i16 = i37;
                                                        z = false;
                                                    }
                                                    if (z && AbstractC5227.m9466(obj2, AbstractC2792.m4233(c27914, c27822))) {
                                                        num5 = num7;
                                                        arrayList3 = arrayList5;
                                                        c27882 = c27883;
                                                        c10834 = c10837;
                                                        c25832 = c25834;
                                                        num6 = num8;
                                                        i17 = i33;
                                                        c27912 = c27914;
                                                        i18 = i36;
                                                        i19 = i41;
                                                        c10833 = c10835;
                                                    } else {
                                                        c2782 = AbstractC2778.f6076;
                                                        if (AbstractC5227.m9466(c27822, c2782)) {
                                                            int i42 = i34;
                                                            if (AbstractC5227.m9466(c27822, AbstractC2778.f6078)) {
                                                                m4121(this, m4130(i33), 2048, num7, i42);
                                                                m4121(this, m4130(i33), 2048, num8, i42);
                                                            } else if (AbstractC5227.m9466(c27822, AbstractC2778.f6059)) {
                                                                m4121(this, m4130(i33), 2048, 8192, 8);
                                                                m4121(this, m4130(i33), 2048, num8, 8);
                                                            } else if (AbstractC5227.m9466(c27822, AbstractC2778.f6061)) {
                                                                m4121(this, m4130(i33), 2048, 3072, 8);
                                                            } else if (AbstractC5227.m9466(c27822, AbstractC2778.f6077)) {
                                                                m4121(this, m4130(i33), 2048, num7, 8);
                                                                m4121(this, m4130(i33), 2048, num8, 8);
                                                            } else {
                                                                C2782 c27824 = AbstractC2778.f6068;
                                                                arrayList3 = arrayList5;
                                                                if (AbstractC5227.m9466(c27822, c27824)) {
                                                                    C2789 c2789 = (C2789) AbstractC2792.m4233(c27915, AbstractC2778.f6066);
                                                                    if (c2789 == null || c2789.f6118 != 4) {
                                                                        c27882 = c27883;
                                                                        c25832 = c25834;
                                                                        m4121(this, m4130(i33), 2048, num7, 8);
                                                                        m4121(this, m4130(i33), 2048, num8, 8);
                                                                    } else if (AbstractC5227.m9466(AbstractC2792.m4233(c27915, c27824), Boolean.TRUE)) {
                                                                        AccessibilityEvent accessibilityEventM4145 = m4145(m4130(i33), 4);
                                                                        c25832 = c25834;
                                                                        C2788 c27884 = new C2788(c27883.f6117, true, c25832, c27915);
                                                                        List list = (List) AbstractC2792.m4233(c27884.m4227(), AbstractC2778.f6079);
                                                                        String strM13970 = list != null ? AbstractC8743.m13970(list, ",", null, 62) : null;
                                                                        List list2 = (List) AbstractC2792.m4233(c27884.m4227(), AbstractC2778.f6063);
                                                                        c27882 = c27883;
                                                                        String strM139702 = list2 != null ? AbstractC8743.m13970(list2, ",", null, 62) : null;
                                                                        if (strM13970 != null) {
                                                                            accessibilityEventM4145.setContentDescription(strM13970);
                                                                        }
                                                                        if (strM139702 != null) {
                                                                            accessibilityEventM4145.getText().add(strM139702);
                                                                        }
                                                                        m4128(accessibilityEventM4145);
                                                                    } else {
                                                                        c27882 = c27883;
                                                                        c25832 = c25834;
                                                                        m4121(this, m4130(i33), 2048, num8, 8);
                                                                    }
                                                                } else {
                                                                    c27882 = c27883;
                                                                    c25832 = c25834;
                                                                    if (AbstractC5227.m9466(c27822, AbstractC2778.f6079)) {
                                                                        int iM4130 = m4130(i33);
                                                                        obj2.getClass();
                                                                        m4127(iM4130, 2048, 4, (List) obj2);
                                                                    } else {
                                                                        C2782 c27825 = AbstractC2778.f6071;
                                                                        String str2 = "";
                                                                        if (AbstractC5227.m9466(c27822, c27825)) {
                                                                            c10834 = c10837;
                                                                            if (c10834.m1312(AbstractC2794.f6153)) {
                                                                                C2902 c2902 = (C2902) AbstractC2792.m4233(c27914, c27825);
                                                                                if (c2902 == null) {
                                                                                    c2902 = "";
                                                                                }
                                                                                CharSequence charSequence = (C2902) AbstractC2792.m4233(c27915, c27825);
                                                                                if (charSequence == null) {
                                                                                    charSequence = "";
                                                                                }
                                                                                CharSequence charSequenceM4116 = m4116(charSequence);
                                                                                int length3 = c2902.length();
                                                                                int length4 = charSequence.length();
                                                                                Integer num9 = num8;
                                                                                int i43 = length3 > length4 ? length4 : length3;
                                                                                c27913 = c27914;
                                                                                int i44 = 0;
                                                                                while (true) {
                                                                                    i23 = i43;
                                                                                    if (i44 >= i43) {
                                                                                        num5 = num7;
                                                                                        break;
                                                                                    }
                                                                                    num5 = num7;
                                                                                    if (c2902.charAt(i44) != charSequence.charAt(i44)) {
                                                                                        break;
                                                                                    }
                                                                                    i44++;
                                                                                    i43 = i23;
                                                                                    num7 = num5;
                                                                                }
                                                                                int i45 = 0;
                                                                                while (true) {
                                                                                    if (i45 >= i23 - i44) {
                                                                                        i24 = i45;
                                                                                        break;
                                                                                    }
                                                                                    i24 = i45;
                                                                                    if (c2902.charAt((length3 - 1) - i45) != charSequence.charAt((length4 - 1) - i24)) {
                                                                                        break;
                                                                                    } else {
                                                                                        i45 = i24 + 1;
                                                                                    }
                                                                                }
                                                                                int i46 = (length3 - i24) - i44;
                                                                                int i47 = (length4 - i24) - i44;
                                                                                C2782 c27826 = AbstractC2778.f6058;
                                                                                boolean zM1312 = c10835.m1312(c27826);
                                                                                boolean zM13122 = c10834.m1312(c27826);
                                                                                boolean zM13123 = c10835.m1312(AbstractC2778.f6071);
                                                                                boolean z2 = zM13123 && !zM1312 && zM13122;
                                                                                boolean z3 = zM13123 && zM1312 && !zM13122;
                                                                                if (z2 || z3) {
                                                                                    int iM41302 = m4130(i33);
                                                                                    Integer numValueOf = Integer.valueOf(length4);
                                                                                    i17 = i33;
                                                                                    i22 = i41;
                                                                                    num8 = num9;
                                                                                    c10833 = c10835;
                                                                                    accessibilityEventM4146 = m4146(iM41302, num8, num9, numValueOf, charSequenceM4116);
                                                                                } else {
                                                                                    AccessibilityEvent accessibilityEventM41452 = m4145(m4130(i33), 16);
                                                                                    accessibilityEventM41452.setFromIndex(i44);
                                                                                    accessibilityEventM41452.setRemovedCount(i46);
                                                                                    accessibilityEventM41452.setAddedCount(i47);
                                                                                    accessibilityEventM41452.setBeforeText(c2902);
                                                                                    accessibilityEventM41452.getText().add(charSequenceM4116);
                                                                                    i17 = i33;
                                                                                    accessibilityEventM4146 = accessibilityEventM41452;
                                                                                    i22 = i41;
                                                                                    num8 = num9;
                                                                                    c10833 = c10835;
                                                                                }
                                                                                accessibilityEventM4146.setClassName("android.widget.EditText");
                                                                                m4128(accessibilityEventM4146);
                                                                                if (z2 || z3) {
                                                                                    long j5 = ((C2869) c27915.m4231(AbstractC2778.f6070)).f6349;
                                                                                    accessibilityEventM4146.setFromIndex((int) (j5 >> 32));
                                                                                    accessibilityEventM4146.setToIndex((int) (j5 & 4294967295L));
                                                                                    m4128(accessibilityEventM4146);
                                                                                }
                                                                            } else {
                                                                                i17 = i33;
                                                                                c27913 = c27914;
                                                                                num5 = num7;
                                                                                i22 = i41;
                                                                                c10833 = c10835;
                                                                                m4121(this, m4130(i17), 2048, Integer.valueOf(i28), 8);
                                                                            }
                                                                            i19 = i22;
                                                                            c27912 = c27913;
                                                                            num6 = num8;
                                                                            i18 = i36;
                                                                        } else {
                                                                            i17 = i33;
                                                                            num5 = num7;
                                                                            c10834 = c10837;
                                                                            i19 = i41;
                                                                            c27912 = c27914;
                                                                            c10833 = c10835;
                                                                            C2782 c27827 = AbstractC2778.f6070;
                                                                            if (AbstractC5227.m9466(c27822, c27827)) {
                                                                                C2902 c29022 = (C2902) AbstractC2792.m4233(c27915, c27825);
                                                                                if (c29022 != null && (str = c29022.f6474) != null) {
                                                                                    str2 = str;
                                                                                }
                                                                                long j6 = ((C2869) c27915.m4231(c27827)).f6349;
                                                                                num6 = num8;
                                                                                m4128(m4146(m4130(i17), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str2.length()), m4116(str2)));
                                                                                i18 = i36;
                                                                                m4134(i18);
                                                                                i19 = i19;
                                                                            } else {
                                                                                num6 = num8;
                                                                                i18 = i36;
                                                                                if (AbstractC5227.m9466(c27822, c27823) || AbstractC5227.m9466(c27822, AbstractC2778.f6082)) {
                                                                                    m4138(c25832);
                                                                                    int size = arrayList4.size();
                                                                                    int i48 = 0;
                                                                                    while (true) {
                                                                                        if (i48 >= size) {
                                                                                            c27112 = null;
                                                                                            break;
                                                                                        } else {
                                                                                            if (((C2711) arrayList4.get(i48)).f5730 == i17) {
                                                                                                c27112 = (C2711) arrayList4.get(i48);
                                                                                                break;
                                                                                            }
                                                                                            i48++;
                                                                                        }
                                                                                    }
                                                                                    c27112.getClass();
                                                                                    c27112.f5725 = (C2793) AbstractC2792.m4233(c27915, c27823);
                                                                                    c27112.f5727 = (C2793) AbstractC2792.m4233(c27915, AbstractC2778.f6082);
                                                                                    if (c27112.f5728.contains(c27112)) {
                                                                                        this.f5877.getSnapshotObserver().f5619.m2806(c27112, this.f5885, new C0195xa0354dde(c27112, this));
                                                                                    }
                                                                                } else if (AbstractC5227.m9466(c27822, AbstractC2778.f6095)) {
                                                                                    obj2.getClass();
                                                                                    if (((Boolean) obj2).booleanValue()) {
                                                                                        i21 = 8;
                                                                                        m4128(m4145(m4130(i18), 8));
                                                                                    } else {
                                                                                        i21 = 8;
                                                                                    }
                                                                                    m4121(this, m4130(i18), 2048, num6, i21);
                                                                                } else {
                                                                                    C2782 c27828 = AbstractC2794.f6142;
                                                                                    if (AbstractC5227.m9466(c27822, c27828)) {
                                                                                        List list3 = (List) c27915.m4231(c27828);
                                                                                        List list4 = (List) AbstractC2792.m4233(c27912, c27828);
                                                                                        if (list4 != null) {
                                                                                            C1082 c1082 = AbstractC1132.f1342;
                                                                                            C1082 c10822 = new C1082();
                                                                                            if (list3.size() > 0) {
                                                                                                list3.get(0).getClass();
                                                                                                C3775.m6954();
                                                                                                return;
                                                                                            }
                                                                                            C1082 c10823 = new C1082();
                                                                                            if (list4.size() > 0) {
                                                                                                list4.get(0).getClass();
                                                                                                C3775.m6954();
                                                                                                return;
                                                                                            }
                                                                                            i10 = !c10822.equals(c10823) ? 1 : 0;
                                                                                        } else {
                                                                                            i20 = 1;
                                                                                            if (!list3.isEmpty()) {
                                                                                                i10 = i20;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        i20 = 1;
                                                                                        if (obj2 instanceof C2776) {
                                                                                            C2776 c2776 = (C2776) obj2;
                                                                                            Object objM4233 = AbstractC2792.m4233(c27912, c27822);
                                                                                            if (c2776 != objM4233) {
                                                                                                if (objM4233 instanceof C2776) {
                                                                                                    String str3 = c2776.f6052;
                                                                                                    C2776 c27762 = (C2776) objM4233;
                                                                                                    InterfaceC6000 interfaceC60002 = c27762.f6051;
                                                                                                    if (AbstractC5227.m9466(str3, c27762.f6052) && (((interfaceC6000 = c2776.f6051) != null || interfaceC60002 == null) && (interfaceC6000 == null || interfaceC60002 != null))) {
                                                                                                    }
                                                                                                }
                                                                                                i10 = i20;
                                                                                            }
                                                                                            i10 = 0;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                num6 = num8;
                                                                i17 = i33;
                                                                num5 = num7;
                                                                i18 = i36;
                                                                c10834 = c10837;
                                                                i19 = i41;
                                                                c27912 = c27914;
                                                                c10833 = c10835;
                                                            }
                                                        } else {
                                                            obj2.getClass();
                                                            String str4 = (String) obj2;
                                                            boolean zM13124 = c10835.m1312(c2782);
                                                            int i49 = i34;
                                                            if (zM13124) {
                                                                m4135(i33, i49, str4);
                                                            }
                                                        }
                                                        num5 = num7;
                                                        arrayList3 = arrayList5;
                                                        c27882 = c27883;
                                                        c10834 = c10837;
                                                        c25832 = c25834;
                                                        num6 = num8;
                                                        i17 = i33;
                                                        c27912 = c27914;
                                                        i18 = i36;
                                                        i19 = i41;
                                                        c10833 = c10835;
                                                    }
                                                }
                                                int size2 = arrayList5.size();
                                                i16 = i37;
                                                int i50 = 0;
                                                while (true) {
                                                    if (i50 >= size2) {
                                                        c2711 = null;
                                                        break;
                                                    }
                                                    int i51 = size2;
                                                    if (((C2711) arrayList5.get(i50)).f5730 == i33) {
                                                        c2711 = (C2711) arrayList5.get(i50);
                                                        break;
                                                    } else {
                                                        i50++;
                                                        size2 = i51;
                                                    }
                                                }
                                                if (c2711 != null) {
                                                    z = false;
                                                } else {
                                                    c2711 = new C2711(i33, arrayList4);
                                                    z = true;
                                                }
                                                arrayList4.add(c2711);
                                                if (z) {
                                                    c2782 = AbstractC2778.f6076;
                                                    if (AbstractC5227.m9466(c27822, c2782)) {
                                                    }
                                                    num5 = num7;
                                                    arrayList3 = arrayList5;
                                                    c27882 = c27883;
                                                    c10834 = c10837;
                                                    c25832 = c25834;
                                                    num6 = num8;
                                                    i17 = i33;
                                                    c27912 = c27914;
                                                    i18 = i36;
                                                    i19 = i41;
                                                    c10833 = c10835;
                                                }
                                            } else {
                                                c10833 = c10835;
                                                num5 = num7;
                                                arrayList3 = arrayList5;
                                                j = j4;
                                                i15 = i39;
                                                c27882 = c27883;
                                                i16 = i37;
                                                c10834 = c10837;
                                                c25832 = c25834;
                                                num6 = num8;
                                                i17 = i33;
                                                c27912 = c27914;
                                                i18 = i36;
                                                i19 = length2;
                                            }
                                            j4 = j >> 8;
                                            i34 = 8;
                                            i36 = i18;
                                            length2 = i19;
                                            num8 = num6;
                                            c25834 = c25832;
                                            i33 = i17;
                                            c10837 = c10834;
                                            c27883 = c27882;
                                            i37 = i16;
                                            c10835 = c10833;
                                            arrayList5 = arrayList3;
                                            i39 = i15 + 1;
                                            c27914 = c27912;
                                            num7 = num5;
                                        }
                                        c1083 = c10835;
                                        num3 = num7;
                                        arrayList2 = arrayList5;
                                        c2788 = c27883;
                                        i12 = i37;
                                        c10832 = c10837;
                                        c2583 = c25834;
                                        i5 = 0;
                                        i8 = 1;
                                        num4 = num8;
                                        i9 = i33;
                                        c2791 = c27914;
                                        i13 = i36;
                                        i14 = length2;
                                        if (i38 != i34) {
                                            break;
                                        }
                                    } else {
                                        c1083 = c10835;
                                        num3 = num7;
                                        arrayList2 = arrayList5;
                                        c2788 = c27883;
                                        i12 = i37;
                                        c10832 = c10837;
                                        c2583 = c25834;
                                        i5 = 0;
                                        i8 = 1;
                                        num4 = num8;
                                        i9 = i33;
                                        c2791 = c27914;
                                        i13 = i36;
                                        i14 = length2;
                                    }
                                    int i52 = i12;
                                    if (i52 == i14) {
                                        break;
                                    }
                                    i36 = i13;
                                    c27914 = c2791;
                                    num8 = num4;
                                    c25833 = c2583;
                                    c10837 = c10832;
                                    i31 = i4;
                                    c10835 = c1083;
                                    arrayList5 = arrayList2;
                                    num7 = num3;
                                    i34 = 8;
                                    i37 = i52 + 1;
                                    length2 = i14;
                                    i33 = i9;
                                    c27883 = c2788;
                                }
                            } else {
                                num3 = num7;
                                arrayList2 = arrayList5;
                                i4 = i31;
                                c2788 = c27883;
                                i5 = 0;
                                i8 = 1;
                                num4 = num8;
                                i9 = i33;
                                c2791 = c27914;
                                i10 = 0;
                            }
                            if (i10 == 0) {
                                Iterator it = c2791.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i11 = i5;
                                        break;
                                    }
                                    if (!c2788.m4227().f6124.m1312((C2782) ((Map.Entry) it.next()).getKey())) {
                                        i11 = i8;
                                        break;
                                    }
                                }
                                i10 = i11;
                            }
                            if (i10 != 0) {
                                i7 = 8;
                                m4121(this, m4130(i9), 2048, num4, 8);
                            } else {
                                i7 = 8;
                            }
                        }
                    }
                    j3 >>= i7;
                    i32 = i3 + 1;
                    abstractC11162 = abstractC1116;
                    i26 = i5;
                    num8 = num4;
                    i30 = i7;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i27 = i6;
                    i31 = i4;
                    arrayList5 = arrayList2;
                    num7 = num3;
                }
                num = num7;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i26;
                int i53 = i27;
                num2 = num8;
                if (i31 != i30) {
                    return;
                } else {
                    i2 = i53;
                }
            } else {
                num = num7;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i26;
                num2 = num8;
                i2 = i27;
            }
            if (i2 == i29) {
                return;
            }
            i27 = i2 + 1;
            abstractC11162 = abstractC1116;
            length = i29;
            i26 = i;
            num8 = num2;
            i25 = i28;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            num7 = num;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m4134(int i) {
        C2722 c2722 = this.f5862;
        if (c2722 != null) {
            C2788 c2788 = c2722.f5894;
            if (i != c2788.f6112) {
                return;
            }
            if (SystemClock.uptimeMillis() - c2722.f5889 <= 1000) {
                AccessibilityEvent accessibilityEventM4145 = m4145(m4130(c2788.f6112), 131072);
                accessibilityEventM4145.setFromIndex(c2722.f5891);
                accessibilityEventM4145.setToIndex(c2722.f5890);
                accessibilityEventM4145.setAction(c2722.f5893);
                accessibilityEventM4145.setMovementGranularity(c2722.f5892);
                accessibilityEventM4145.getText().add(m4122(c2788));
                m4128(accessibilityEventM4145);
            }
        }
        this.f5862 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m4135(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventM4145 = m4145(m4130(i), 32);
        accessibilityEventM4145.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventM4145.getText().add(str);
        }
        m4128(accessibilityEventM4145);
    }

    @Override // androidx.core.view.C3079
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6686 mo4136(View view) {
        return this.f5869;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC1116 m4137() {
        if (this.f5863) {
            this.f5863 = false;
            ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = this.f5877;
            this.f5858 = AbstractC2792.m4237(viewTreeObserverOnGlobalLayoutListenerC2719.getSemanticsOwner(), new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1
                @Override // p068.InterfaceC7387
                public final Boolean invoke(C2788 c2788) {
                    C2791 c2791M4227 = c2788.m4227();
                    return Boolean.valueOf(c2791M4227.f6124.m1312(AbstractC2778.f6064));
                }
            });
            if (m4140()) {
                final C1093 c1093 = this.f5858;
                final Resources resources = viewTreeObserverOnGlobalLayoutListenerC2719.getContext().getResources();
                C1095 c1095 = this.f5855;
                c1095.m1361();
                C1095 c10952 = this.f5854;
                c10952.m1361();
                C2785 c2785 = (C2785) c1093.m1393(-1);
                C2788 c2788 = c2785 != null ? c2785.f6106 : null;
                c2788.getClass();
                ArrayList arrayListM4200 = AbstractC2768.m4200(c2788, new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$1
                    {
                        super(1);
                    }

                    @Override // p068.InterfaceC7387
                    public final Boolean invoke(C2788 c27882) {
                        return Boolean.valueOf(c1093.m1394(c27882.f6112));
                    }
                }, new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p068.InterfaceC7387
                    public final Boolean invoke(C2788 c27882) {
                        return Boolean.valueOf(AbstractC2751.m4178(c27882, resources));
                    }
                }, AbstractC7176.m12487(c2788));
                int i = 1;
                int size = arrayListM4200.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((C2788) arrayListM4200.get(i - 1)).f6112;
                        int i3 = ((C2788) arrayListM4200.get(i)).f6112;
                        c1095.m1356(i2, i3);
                        c10952.m1356(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.f5858;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m4138(C2583 c2583) {
        if (this.f5861.add(c2583)) {
            this.f5860.mo8995(C6008.f15084);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0073 A[LOOP:0: B:4:0x0014->B:36:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076 A[EDGE_INSN: B:47:0x0076->B:37:0x0076 BREAK  A[LOOP:0: B:4:0x0014->B:36:0x0073], SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C8157 m4139(C2788 c2788, Rect rect, InterfaceC2404 interfaceC2404) {
        C2723 c2723 = new C2723(interfaceC2404);
        C2583 c2583 = c2788.f6115;
        AbstractC2961 abstractC2961 = c2583.f5439.f5628;
        InterfaceC2622 interfaceC2622 = null;
        if ((abstractC2961.f6630 & 8) != 0) {
            loop0: while (true) {
                if (abstractC2961 == null) {
                    break;
                }
                if ((abstractC2961.f6636 & 8) != 0) {
                    AbstractC2961 abstractC2961M3899 = abstractC2961;
                    C2059 c2059 = null;
                    while (abstractC2961M3899 != null) {
                        if (abstractC2961M3899 instanceof InterfaceC2596) {
                            ((InterfaceC2596) abstractC2961M3899).mo1854(c2723);
                            if (c2723.f5896) {
                                interfaceC2622 = abstractC2961M3899;
                                break loop0;
                            }
                        } else if ((abstractC2961M3899.f6636 & 8) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                            int i = 0;
                            for (AbstractC2961 abstractC29612 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29612 != null; abstractC29612 = abstractC29612.f6633) {
                                if ((abstractC29612.f6636 & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        abstractC2961M3899 = abstractC29612;
                                    } else {
                                        if (c2059 == null) {
                                            c2059 = new C2059(0, new AbstractC2961[16]);
                                        }
                                        if (abstractC2961M3899 != null) {
                                            c2059.m2607(abstractC2961M3899);
                                            abstractC2961M3899 = null;
                                        }
                                        c2059.m2607(abstractC29612);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC2961M3899 = AbstractC2620.m3899(c2059);
                    }
                    if ((abstractC2961.f6630 & 8) != 0) {
                        break;
                    }
                    abstractC2961 = abstractC2961.f6633;
                } else if ((abstractC2961.f6630 & 8) != 0) {
                }
            }
        }
        InterfaceC2622 interfaceC26222 = (InterfaceC2596) interfaceC2622;
        if (interfaceC26222 == null || !((AbstractC2961) interfaceC26222).f6637.f6624) {
            return AbstractC2505.m3659(c2583.f5439.f5630, false);
        }
        AbstractC2629 abstractC2629M3909 = AbstractC2620.m3909(interfaceC26222);
        C8157 c8157Mo3649 = AbstractC2505.m3673(abstractC2629M3909).mo3649(abstractC2629M3909, false);
        Rect rectM4126 = m4126(c8157Mo3649.f19885, c8157Mo3649.f19884, c8157Mo3649.f19883, c8157Mo3649.f19882);
        float f = rectM4126.left - rect.left;
        float f2 = rectM4126.top - rect.top;
        return new C8157(f, f2, rectM4126.width() + f, rectM4126.height() + f2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean m4140() {
        AccessibilityManager accessibilityManager = this.f5881;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f5879;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.f5879 = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m4141() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m4140()) {
                m4129(this.f5877.getSemanticsOwner().m4211(), this.f5883);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                m4133(m4137());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    m4124();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4142(boolean z, int i, long j) {
        C2782 c2782;
        int i2;
        C2793 c2793;
        if (AbstractC5227.m9466(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            AbstractC1116 abstractC1116M4137 = m4137();
            if (!C8158.m13087(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    c2782 = AbstractC2778.f6082;
                } else {
                    if (z) {
                        C5043.m9170();
                        return false;
                    }
                    c2782 = AbstractC2778.f6085;
                }
                Object[] objArr = abstractC1116M4137.f1317;
                long[] jArr = abstractC1116M4137.f1319;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    C2785 c2785 = (C2785) objArr[(i3 << 3) + i6];
                                    C8734 c8734 = c2785.f6105;
                                    float f = c8734.f22223;
                                    i2 = i4;
                                    float f2 = c8734.f22222;
                                    float f3 = c8734.f22221;
                                    float f4 = c8734.f22220;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if (((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) && (c2793 = (C2793) AbstractC2792.m4233(c2785.f6106.f6114, c2782)) != null) {
                                        InterfaceC7372 interfaceC7372 = c2793.f6127;
                                        if (i < 0) {
                                            if (((Number) interfaceC7372.invoke()).floatValue() > 0.0f) {
                                                z2 = true;
                                            }
                                        } else if (((Number) interfaceC7372.invoke()).floatValue() < ((Number) c2793.f6126.invoke()).floatValue()) {
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int m4143(C2788 c2788) {
        C2791 c2791 = c2788.f6114;
        if (!c2791.f6124.m1312(AbstractC2778.f6079)) {
            C2782 c2782 = AbstractC2778.f6070;
            if (c2791.f6124.m1312(c2782)) {
                return (int) (((C2869) c2791.m4231(c2782)).f6349 & 4294967295L);
            }
        }
        return this.f5871;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int m4144(C2788 c2788) {
        C2791 c2791 = c2788.f6114;
        if (!c2791.f6124.m1312(AbstractC2778.f6079)) {
            C2782 c2782 = AbstractC2778.f6070;
            if (c2791.f6124.m1312(c2782)) {
                return (int) (((C2869) c2791.m4231(c2782)).f6349 >> 32);
            }
        }
        return this.f5871;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final AccessibilityEvent m4145(int i, int i2) {
        C2785 c2785;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = this.f5877;
        accessibilityEventObtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC2719.getContext().getPackageName());
        accessibilityEventObtain.setSource(viewTreeObserverOnGlobalLayoutListenerC2719, i);
        if (m4140() && (c2785 = (C2785) m4137().m1393(i)) != null) {
            C2788 c2788 = c2785.f6106;
            accessibilityEventObtain.setPassword(c2788.f6114.f6124.m1312(AbstractC2778.f6058));
            boolean zM9466 = AbstractC5227.m9466(AbstractC2792.m4233(c2788.f6114, AbstractC2778.f6090), Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                AbstractC3129.m4875(accessibilityEventObtain, zM9466);
            }
        }
        return accessibilityEventObtain;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AccessibilityEvent m4146(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventM4145 = m4145(i, 8192);
        if (num != null) {
            accessibilityEventM4145.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventM4145.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventM4145.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventM4145.getText().add(charSequence);
        }
        return accessibilityEventM4145;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Rect m4147(C2785 c2785) {
        C8734 c8734 = c2785.f6105;
        return m4126(c8734.f22223, c8734.f22222, c8734.f22221, c8734.f22220);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0103, code lost:
    
        if (kotlinx.coroutines.AbstractC6231.m11058(r5, r2) == r3) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:13:0x0034, B:24:0x0064, B:28:0x0078, B:30:0x0080, B:32:0x008b, B:34:0x0091, B:35:0x00a0, B:37:0x00a8, B:20:0x004e, B:23:0x0055), top: B:58:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0103 -> B:51:0x0106). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4148(ContinuationImpl continuationImpl) throws Throwable {
        C0192x3d3eeeed c0192x3d3eeeed;
        C1122 c1122;
        C1092 c1092;
        C1092 c10922;
        InterfaceC6044 interfaceC6044;
        int i;
        long j;
        InterfaceC6044 c6023;
        Object objM10823;
        if (continuationImpl instanceof C0192x3d3eeeed) {
            c0192x3d3eeeed = (C0192x3d3eeeed) continuationImpl;
            int i2 = c0192x3d3eeeed.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0192x3d3eeeed.label = i2 - Integer.MIN_VALUE;
            } else {
                c0192x3d3eeeed = new C0192x3d3eeeed(this, continuationImpl);
            }
        }
        Object obj = c0192x3d3eeeed.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = c0192x3d3eeeed.label;
        C1122 c11222 = this.f5861;
        try {
            if (i3 == 0) {
                AbstractC6017.m10769(obj);
                c1092 = new C1092();
                C6022 c6022 = this.f5860;
                c6022.getClass();
                c6023 = new C6023(c6022);
                c0192x3d3eeeed.L$0 = c1092;
                c0192x3d3eeeed.L$1 = c6023;
                c0192x3d3eeeed.label = 1;
                C6023 c60232 = (C6023) c6023;
                objM10823 = c60232.m10823(c0192x3d3eeeed);
                if (objM10823 != coroutineSingletons) {
                }
            } else if (i3 == 1) {
                InterfaceC6044 interfaceC60442 = (InterfaceC6044) c0192x3d3eeeed.L$1;
                c10922 = (C1092) c0192x3d3eeeed.L$0;
                AbstractC6017.m10769(obj);
                interfaceC6044 = interfaceC60442;
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i3 != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                InterfaceC6044 interfaceC60443 = (InterfaceC6044) c0192x3d3eeeed.L$1;
                c10922 = (C1092) c0192x3d3eeeed.L$0;
                AbstractC6017.m10769(obj);
                char c = 2;
                c1122 = c11222;
                InterfaceC6044 interfaceC60444 = interfaceC60443;
                c1092 = c10922;
                c11222 = c1122;
                c6023 = interfaceC60444;
                c0192x3d3eeeed.L$0 = c1092;
                c0192x3d3eeeed.L$1 = c6023;
                c0192x3d3eeeed.label = 1;
                C6023 c602322 = (C6023) c6023;
                objM10823 = c602322.m10823(c0192x3d3eeeed);
                if (objM10823 != coroutineSingletons) {
                    return coroutineSingletons;
                }
                c10922 = c1092;
                obj = objM10823;
                interfaceC6044 = c602322;
                if (((Boolean) obj).booleanValue()) {
                    c11222.clear();
                    return C6008.f15084;
                }
                C6023 c60233 = (C6023) interfaceC6044;
                c60233.m10821();
                if (m4140()) {
                    int i4 = c11222.f1326;
                    for (int i5 = 0; i5 < i4; i5++) {
                        C2583 c2583 = (C2583) c11222.f1325[i5];
                        m4132(c2583, c10922);
                        m4131(c2583);
                    }
                    c10922.f1244 = 0;
                    long[] jArr = c10922.f1247;
                    if (jArr != AbstractC1137.f1352) {
                        try {
                            AbstractC5179.m9392(-9187201950435737472L, jArr);
                            long[] jArr2 = c10922.f1247;
                            i = c10922.f1245;
                            int i6 = i >> 3;
                            jArr2[i6] = ((~j) & jArr2[i6]) | j;
                        } catch (Throwable th) {
                            th = th;
                            c1122.clear();
                            throw th;
                        }
                        j = 255 << ((i & 7) << 3);
                        c1122 = c11222;
                    } else {
                        c1122 = c11222;
                    }
                    c10922.f1243 = AbstractC1137.m1446(c10922.f1245) - c10922.f1244;
                    Handler handler = this.f5877.getHandler();
                    if (!this.f5882 && handler != null) {
                        this.f5882 = true;
                        handler.post(this.f5887);
                    }
                } else {
                    c1122 = c11222;
                }
                c1122.clear();
                this.f5875.m1349();
                this.f5874.m1349();
                long j2 = this.f5878;
                c0192x3d3eeeed.L$0 = c10922;
                c0192x3d3eeeed.L$1 = c60233;
                c = 2;
                c0192x3d3eeeed.label = 2;
                interfaceC60444 = c60233;
            }
        } catch (Throwable th2) {
            th = th2;
            c1122 = c11222;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m4149(int i, C8436 c8436, String str, Bundle bundle) {
        C2788 c2788;
        InterfaceC2404 interfaceC2404;
        int i2;
        int i3;
        AccessibilityNodeInfo accessibilityNodeInfo = c8436.f20975;
        C2785 c2785 = (C2785) m4137().m1393(i);
        if (c2785 == null || (c2788 = c2785.f6106) == null) {
            return;
        }
        C2583 c2583 = c2788.f6115;
        C2791 c2791 = c2788.f6114;
        C1083 c1083 = c2791.f6124;
        String strM4122 = m4122(c2788);
        if (AbstractC5227.m9466(str, this.f5857)) {
            int iM1358 = this.f5855.m1358(i);
            if (iM1358 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM1358);
                return;
            }
            return;
        }
        if (AbstractC5227.m9466(str, this.f5856)) {
            int iM13582 = this.f5854.m1358(i);
            if (iM13582 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM13582);
                return;
            }
            return;
        }
        boolean zM1312 = c1083.m1312(AbstractC2794.f6138);
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = this.f5877;
        if (zM1312 && bundle != null && AbstractC5227.m9466(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i5 > 0 && i4 >= 0) {
                if (i4 < (strM4122 != null ? strM4122.length() : Integer.MAX_VALUE)) {
                    C2867 c2867M4182 = AbstractC2751.m4182(c2791);
                    if (c2867M4182 == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i6 = 0;
                    while (i6 < i5) {
                        int i7 = i4 + i6;
                        RectF rectF = null;
                        if (i7 >= c2867M4182.f6336.f6342.f6474.length()) {
                            arrayList.add(null);
                            i2 = i4;
                            i3 = i5;
                        } else {
                            C8157 c8157M4304 = c2867M4182.m4304(i7);
                            AbstractC2629 abstractC2629M4215 = c2788.m4215();
                            long jMo3636 = 0;
                            if (abstractC2629M4215 != null) {
                                if (!abstractC2629M4215.mo3842().f6624) {
                                    abstractC2629M4215 = null;
                                }
                                if (abstractC2629M4215 != null) {
                                    jMo3636 = abstractC2629M4215.mo3636(0L);
                                }
                            }
                            C8157 c8157M13083 = c8157M4304.m13083(jMo3636);
                            C8157 c8157M4226 = c2788.m4226();
                            C8157 c8157M13076 = c8157M13083.m13082(c8157M4226) ? c8157M13083.m13076(c8157M4226) : null;
                            if (c8157M13076 != null) {
                                long jM4098 = viewTreeObserverOnGlobalLayoutListenerC2719.m4098((((long) Float.floatToRawIntBits(c8157M13076.f19884)) & 4294967295L) | (((long) Float.floatToRawIntBits(c8157M13076.f19885)) << 32));
                                long jM40982 = viewTreeObserverOnGlobalLayoutListenerC2719.m4098((((long) Float.floatToRawIntBits(c8157M13076.f19882)) & 4294967295L) | (((long) Float.floatToRawIntBits(c8157M13076.f19883)) << 32));
                                int i8 = (int) (jM4098 >> 32);
                                i2 = i4;
                                i3 = i5;
                                int i9 = (int) (jM40982 >> 32);
                                int i10 = (int) (jM4098 & 4294967295L);
                                int i11 = (int) (jM40982 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.min(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11)));
                            } else {
                                i2 = i4;
                                i3 = i5;
                            }
                            arrayList.add(rectF);
                        }
                        i6++;
                        i4 = i2;
                        i5 = i3;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        C2782 c2782 = AbstractC2778.f6065;
        if (c1083.m1312(c2782) && bundle != null && AbstractC5227.m9466(str, "androidx.compose.ui.semantics.testTag")) {
            String str2 = (String) AbstractC2792.m4233(c2791, c2782);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (AbstractC5227.m9466(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, c2788.f6112);
            return;
        }
        if (AbstractC5227.m9466(str, "androidx.compose.ui.semantics.shapeType")) {
            InterfaceC2404 interfaceC24042 = (InterfaceC2404) AbstractC2792.m4233(c2791, AbstractC2778.f6055);
            if (interfaceC24042 != null) {
                Rect rect = new Rect();
                c8436.m13390(rect);
                C8157 c8157M4139 = m4139(c2788, rect, interfaceC24042);
                float f = c8157M4139.f19884;
                float f2 = c8157M4139.f19885;
                AbstractC2416 abstractC2416Mo2482 = interfaceC24042.mo2482(c8157M4139.m13078(), c2583.f5445, viewTreeObserverOnGlobalLayoutListenerC2719.getDensity());
                if (abstractC2416Mo2482 instanceof C2420) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m4117(abstractC2416Mo2482, f2, f));
                    return;
                } else if (abstractC2416Mo2482 instanceof C2411) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m4117(abstractC2416Mo2482, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", m4118(abstractC2416Mo2482));
                    return;
                } else if (!(abstractC2416Mo2482 instanceof C2421)) {
                    C5043.m9170();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", m4115(abstractC2416Mo2482, f2, f));
                    return;
                }
            }
            return;
        }
        if (AbstractC5227.m9466(str, "androidx.compose.ui.semantics.shapeRect")) {
            InterfaceC2404 interfaceC24043 = (InterfaceC2404) AbstractC2792.m4233(c2791, AbstractC2778.f6055);
            if (interfaceC24043 != null) {
                Rect rect2 = new Rect();
                c8436.m13390(rect2);
                C8157 c8157M41392 = m4139(c2788, rect2, interfaceC24043);
                Rect rectM4117 = m4117(interfaceC24043.mo2482(c8157M41392.m13078(), c2583.f5445, viewTreeObserverOnGlobalLayoutListenerC2719.getDensity()), c8157M41392.f19885, c8157M41392.f19884);
                if (rectM4117 != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectM4117);
                    return;
                }
                return;
            }
            return;
        }
        if (AbstractC5227.m9466(str, "androidx.compose.ui.semantics.shapeCorners")) {
            InterfaceC2404 interfaceC24044 = (InterfaceC2404) AbstractC2792.m4233(c2791, AbstractC2778.f6055);
            if (interfaceC24044 != null) {
                Rect rect3 = new Rect();
                c8436.m13390(rect3);
                float[] fArrM4118 = m4118(interfaceC24044.mo2482(m4139(c2788, rect3, interfaceC24044).m13078(), c2583.f5445, viewTreeObserverOnGlobalLayoutListenerC2719.getDensity()));
                if (fArrM4118 != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrM4118);
                    return;
                }
                return;
            }
            return;
        }
        if (!AbstractC5227.m9466(str, "androidx.compose.ui.semantics.shapeRegion") || (interfaceC2404 = (InterfaceC2404) AbstractC2792.m4233(c2791, AbstractC2778.f6055)) == null) {
            return;
        }
        Rect rect4 = new Rect();
        c8436.m13390(rect4);
        C8157 c8157M41393 = m4139(c2788, rect4, interfaceC2404);
        Region regionM4115 = m4115(interfaceC2404.mo2482(c8157M41393.m13078(), c2583.f5445, viewTreeObserverOnGlobalLayoutListenerC2719.getDensity()), c8157M41393.f19885, c8157M41393.f19884);
        if (regionM4115 != null) {
            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionM4115);
        }
    }
}
