package androidx.compose.ui.platform;

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
import androidx.collection.AbstractC0269;
import androidx.collection.AbstractC0270;
import androidx.collection.AbstractC0273;
import androidx.collection.AbstractC0280;
import androidx.collection.C0236;
import androidx.collection.C0245;
import androidx.collection.C0246;
import androidx.collection.C0247;
import androidx.collection.C0248;
import androidx.collection.C0275;
import androidx.collection.C0282;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1576;
import androidx.compose.ui.graphics.C1585;
import androidx.compose.ui.graphics.C1586;
import androidx.compose.ui.graphics.C1614;
import androidx.compose.ui.graphics.InterfaceC1569;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1803;
import androidx.compose.ui.semantics.AbstractC1933;
import androidx.compose.ui.semantics.AbstractC1943;
import androidx.compose.ui.semantics.AbstractC1957;
import androidx.compose.ui.semantics.AbstractC1959;
import androidx.compose.ui.semantics.C1941;
import androidx.compose.ui.semantics.C1947;
import androidx.compose.ui.semantics.C1950;
import androidx.compose.ui.semantics.C1953;
import androidx.compose.ui.semantics.C1956;
import androidx.compose.ui.semantics.C1958;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2068;
import androidx.core.view.C2246;
import androidx.core.widget.AbstractC2296;
import com.davemorrissey.labs.subscaleview.R;
import com.google.protobuf.DescriptorProtos$Edition;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.List;
import kotlin.C5176;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.channels.AbstractC5205;
import kotlinx.coroutines.channels.C5190;
import p034.AbstractC6347;
import p052.InterfaceC6543;
import p052.InterfaceC6551;
import p052.InterfaceC6558;
import p112.C7327;
import p112.C7328;
import p155.C7607;
import p193.C7828;
import p205.C7905;
import p207.AbstractC7914;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1885 extends C2246 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static final C0247 f5506 = AbstractC0270.m835(R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31);

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final C7828 f5507;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final C0246 f5508;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final C0248 f5509;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final C0248 f5510;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final String f5511;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final String f5512;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C0246 f5513;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C0245 f5514;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C5190 f5515;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C0275 f5516;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C1887 f5517;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f5518;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f5519;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C7607 f5520;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public C7607 f5521;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f5522;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f5523;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C1883 f5524;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public Integer f5525;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f5526;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C0282 f5527;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C0282 f5528;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C0246 f5529;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C0246 f5530;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1884 f5532;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public long f5533;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public List f5534;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AccessibilityManager f5536;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public boolean f5537;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C1872 f5538;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final ArrayList f5539;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final InterfaceC6558 f5540;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final C0248 f5541;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final RunnableC1882 f5542;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f5531 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC6558 f5535 = new InterfaceC6558() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1
        {
            super(1);
        }

        @Override // p052.InterfaceC6558
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(this.this$0.f5532.getParent().requestSendAccessibilityEvent(this.this$0.f5532, accessibilityEvent));
        }
    };

    public ViewOnAttachStateChangeListenerC1885(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884) {
        this.f5532 = viewTreeObserverOnGlobalLayoutListenerC1884;
        Object systemService = viewTreeObserverOnGlobalLayoutListenerC1884.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.f5536 = (AccessibilityManager) systemService;
        this.f5533 = 100L;
        new Handler(Looper.getMainLooper());
        this.f5524 = new C1883(this);
        this.f5523 = Integer.MIN_VALUE;
        this.f5522 = Integer.MIN_VALUE;
        this.f5530 = new C0246();
        this.f5529 = new C0246();
        this.f5528 = new C0282(0);
        this.f5527 = new C0282(0);
        this.f5526 = -1;
        this.f5516 = new C0275(0);
        this.f5515 = AbstractC5205.m10282(1, 6, null);
        this.f5518 = true;
        C0246 c0246 = AbstractC0273.f978;
        c0246.getClass();
        this.f5513 = c0246;
        this.f5514 = new C0245();
        this.f5510 = new C0248();
        this.f5509 = new C0248();
        this.f5512 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f5511 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f5507 = new C7828(0);
        this.f5508 = new C0246();
        this.f5538 = new C1872(viewTreeObserverOnGlobalLayoutListenerC1884.getSemanticsOwner().m3651(), c0246);
        int i = AbstractC0280.f988;
        this.f5541 = new C0248();
        viewTreeObserverOnGlobalLayoutListenerC1884.addOnAttachStateChangeListener(this);
        this.f5542 = new RunnableC1882(this, 1);
        this.f5539 = new ArrayList();
        this.f5540 = new InterfaceC6558() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            {
                super(1);
            }

            public final void invoke(C1876 c1876) {
                ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC1885 = this.this$0;
                C0247 c0247 = ViewOnAttachStateChangeListenerC1885.f5506;
                viewOnAttachStateChangeListenerC1885.getClass();
                if (c1876.f5383.contains(c1876)) {
                    C1803 snapshotObserver = viewOnAttachStateChangeListenerC1885.f5532.getSnapshotObserver();
                    snapshotObserver.f5274.m2246(c1876, viewOnAttachStateChangeListenerC1885.f5540, new AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(c1876, viewOnAttachStateChangeListenerC1885));
                }
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C1876) obj);
                return C5176.f14739;
            }
        };
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static Region m3555(AbstractC1581 abstractC1581, float f, float f2) {
        if (abstractC1581 instanceof C1586) {
            C1586 c1586 = (C1586) abstractC1581;
            C7328 c7328M12522 = c1586.mo2869().m12522(f, f2);
            Region region = new Region(new Rect((int) (c7328M12522.f19540 + 0.0f), (int) (c7328M12522.f19539 + 0.0f), (int) (c7328M12522.f19538 + 0.0f), (int) (c7328M12522.f19537 + 0.0f)));
            Region region2 = new Region();
            C1614 c1614 = c1586.f4673;
            if (c1614 instanceof C1614) {
                Path path = c1614.f4725;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            C5925.m11308("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static CharSequence m3556(CharSequence charSequence) {
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
    public static Rect m3557(AbstractC1581 abstractC1581, float f, float f2) {
        if (!(abstractC1581 instanceof C1585) && !(abstractC1581 instanceof C1576)) {
            return null;
        }
        C7328 c7328Mo2869 = abstractC1581.mo2869();
        return new Rect((int) (c7328Mo2869.f19540 + f), (int) (c7328Mo2869.f19539 + f2), (int) (c7328Mo2869.f19538 + f), (int) (c7328Mo2869.f19537 + f2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static float[] m3558(AbstractC1581 abstractC1581) {
        if (!(abstractC1581 instanceof C1576)) {
            return null;
        }
        C7327 c7327 = ((C1576) abstractC1581).f4656;
        long j = c7327.f19534;
        long j2 = c7327.f19535;
        long j3 = c7327.f19528;
        long j4 = c7327.f19529;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final boolean m3559(C1958 c1958) {
        InterfaceC6543 interfaceC6543 = c1958.f5782;
        if (((Number) interfaceC6543.invoke()).floatValue() < ((Number) c1958.f5781.invoke()).floatValue()) {
            return true;
        }
        ((Number) interfaceC6543.invoke()).floatValue();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final boolean m3560(C1958 c1958) {
        InterfaceC6543 interfaceC6543 = c1958.f5782;
        if (((Number) interfaceC6543.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) interfaceC6543.invoke()).floatValue();
        ((Number) c1958.f5781.invoke()).floatValue();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m3561(ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC1885, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        viewOnAttachStateChangeListenerC1885.m3567(i, i2, num, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static String m3562(C1953 c1953) {
        C2068 c2068;
        if (c1953 != null) {
            C1956 c1956 = c1953.f5769;
            C0236 c0236 = c1956.f5779;
            C1947 c1947 = AbstractC1943.f5734;
            if (c0236.m752(c1947)) {
                return AbstractC7914.m13411((List) c1956.m3671(c1947), ",", null, 62);
            }
            C1947 c19472 = AbstractC1943.f5726;
            if (c0236.m752(c19472)) {
                C2068 c20682 = (C2068) AbstractC1957.m3673(c1956, c19472);
                if (c20682 != null) {
                    return c20682.f6129;
                }
            } else {
                List list = (List) AbstractC1957.m3673(c1956, AbstractC1943.f5718);
                if (list != null && (c2068 = (C2068) AbstractC4344.m8815(list)) != null) {
                    return c2068.f6129;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final boolean m3563(C1958 c1958, float f) {
        InterfaceC6543 interfaceC6543 = c1958.f5782;
        if (f >= 0.0f || ((Number) interfaceC6543.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) interfaceC6543.invoke()).floatValue() < ((Number) c1958.f5781.invoke()).floatValue();
        }
        return true;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.f5534 = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.f5534 = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.f5536;
        if (accessibilityManager.isEnabled()) {
            this.f5534 = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f5532.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.f5542);
        AccessibilityManager accessibilityManager = this.f5536;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3564() {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewOnAttachStateChangeListenerC1885.m3564():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final boolean m3565(C1953 c1953, int i, int i2, boolean z) {
        String strM3562;
        C1956 c1956 = c1953.f5769;
        int i3 = c1953.f5767;
        C1947 c1947 = AbstractC1959.f5811;
        if (c1956.f5779.m752(c1947) && AbstractC1916.m3619(c1953)) {
            InterfaceC6551 interfaceC6551 = (InterfaceC6551) ((C1941) c1953.f5769.m3671(c1947)).f5706;
            if (interfaceC6551 != null) {
                return ((Boolean) interfaceC6551.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.f5526) && (strM3562 = m3562(c1953)) != null) {
            if (i < 0 || i != i2 || i2 > strM3562.length()) {
                i = -1;
            }
            this.f5526 = i;
            boolean z2 = strM3562.length() > 0;
            m3568(m3586(m3570(i3), z2 ? Integer.valueOf(this.f5526) : null, z2 ? Integer.valueOf(this.f5526) : null, z2 ? Integer.valueOf(strM3562.length()) : null, strM3562));
            m3574(i3);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final Rect m3566(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f5532;
        long jM3538 = viewTreeObserverOnGlobalLayoutListenerC1884.m3538(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jM35382 = viewTreeObserverOnGlobalLayoutListenerC1884.m3538((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jM3538 >> 32);
        int i2 = (int) (jM35382 >> 32);
        int i3 = (int) (jM3538 & 4294967295L);
        int i4 = (int) (jM35382 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final boolean m3567(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !m3580()) {
            return false;
        }
        AccessibilityEvent accessibilityEventM3585 = m3585(i, i2);
        if (num != null) {
            accessibilityEventM3585.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventM3585.setContentDescription(AbstractC7914.m13411(list, ",", null, 62));
        }
        return m3568(accessibilityEventM3585);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final boolean m3568(AccessibilityEvent accessibilityEvent) {
        if (!m3580()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f5519 = true;
        }
        try {
            return ((Boolean) this.f5535.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f5519 = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3569(androidx.compose.ui.semantics.C1953 r20, androidx.compose.ui.platform.C1872 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = androidx.collection.AbstractC0274.f979
            androidx.collection.飘花落叶言子世楪兰哲苏 r3 = new androidx.collection.飘花落叶言子世楪兰哲苏
            r3.<init>()
            r4 = 4
            java.util.List r5 = androidx.compose.ui.semantics.C1953.m3652(r4, r1)
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r6 = r1.f5770
            int r7 = r5.size()
            r8 = 0
            r9 = r8
        L1a:
            if (r9 >= r7) goto L40
            java.lang.Object r10 = r5.get(r9)
            androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世 r10 = (androidx.compose.ui.semantics.C1953) r10
            androidx.collection.飘花落叶言子楪哲世兰苏 r11 = r0.m3577()
            int r10 = r10.f5767
            boolean r11 = r11.m834(r10)
            if (r11 == 0) goto L3d
            androidx.collection.飘花落叶言子世楪兰哲苏 r11 = r2.f5378
            boolean r11 = r11.m784(r10)
            if (r11 != 0) goto L3a
            r0.m3578(r6)
            return
        L3a:
            r3.m785(r10)
        L3d:
            int r9 = r9 + 1
            goto L1a
        L40:
            androidx.collection.飘花落叶言子世楪兰哲苏 r2 = r2.f5378
            int[] r5 = r2.f901
            long[] r2 = r2.f902
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8b
            r9 = r8
        L4c:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L86
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L66:
            if (r14 >= r12) goto L84
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L80
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.m784(r15)
            if (r15 != 0) goto L80
            r0.m3578(r6)
            return
        L80:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L66
        L84:
            if (r12 != r13) goto L8b
        L86:
            if (r9 == r7) goto L8b
            int r9 = r9 + 1
            goto L4c
        L8b:
            java.util.List r1 = androidx.compose.ui.semantics.C1953.m3652(r4, r1)
            int r2 = r1.size()
        L93:
            if (r8 >= r2) goto Lb9
            java.lang.Object r3 = r1.get(r8)
            androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世 r3 = (androidx.compose.ui.semantics.C1953) r3
            androidx.collection.飘花落叶言子世楪兰苏哲 r4 = r0.f5508
            int r5 = r3.f5767
            java.lang.Object r4 = r4.m833(r5)
            androidx.compose.ui.platform.飘花落叶言子哲苏世楪兰 r4 = (androidx.compose.ui.platform.C1872) r4
            if (r4 == 0) goto Lb6
            androidx.collection.飘花落叶言子楪哲世兰苏 r5 = r0.m3577()
            int r6 = r3.f5767
            boolean r5 = r5.m834(r6)
            if (r5 == 0) goto Lb6
            r0.m3569(r3, r4)
        Lb6:
            int r8 = r8 + 1
            goto L93
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewOnAttachStateChangeListenerC1885.m3569(androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世, androidx.compose.ui.platform.飘花落叶言子哲苏世楪兰):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int m3570(int i) {
        if (i == this.f5532.getSemanticsOwner().m3651().f5767) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m3571(C1748 c1748) {
        if (c1748.m3243() && !this.f5532.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(c1748)) {
            int i = c1748.f5123;
            C1958 c1958 = (C1958) this.f5530.m833(i);
            C1958 c19582 = (C1958) this.f5529.m833(i);
            if (c1958 == null && c19582 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventM3585 = m3585(i, 4096);
            if (c1958 != null) {
                accessibilityEventM3585.setScrollX((int) ((Number) c1958.f5782.invoke()).floatValue());
                accessibilityEventM3585.setMaxScrollX((int) ((Number) c1958.f5781.invoke()).floatValue());
            }
            if (c19582 != null) {
                accessibilityEventM3585.setScrollY((int) ((Number) c19582.f5782.invoke()).floatValue());
                accessibilityEventM3585.setMaxScrollY((int) ((Number) c19582.f5781.invoke()).floatValue());
            }
            m3568(accessibilityEventM3585);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m3572(C1748 c1748, C0245 c0245) {
        C1956 c1956M3254;
        C1748 c1748M3615;
        if (c1748.m3243() && !this.f5532.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(c1748)) {
            if (!c1748.f5094.m3428(8)) {
                c1748 = AbstractC1916.m3615(c1748, new InterfaceC6558() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                    @Override // p052.InterfaceC6558
                    public final Boolean invoke(C1748 c17482) {
                        return Boolean.valueOf(c17482.f5094.m3428(8));
                    }
                });
            }
            if (c1748 == null || (c1956M3254 = c1748.m3254()) == null) {
                return;
            }
            if (!c1956M3254.f5778 && (c1748M3615 = AbstractC1916.m3615(c1748, new InterfaceC6558() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1
                @Override // p052.InterfaceC6558
                public final Boolean invoke(C1748 c17482) {
                    C1956 c1956M32542 = c17482.m3254();
                    boolean z = false;
                    if (c1956M32542 != null && c1956M32542.f5778) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            })) != null) {
                c1748 = c1748M3615;
            }
            int i = c1748.f5123;
            if (c0245.m785(i)) {
                m3561(this, m3570(i), 2048, 1, 8);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3573(androidx.collection.AbstractC0269 r59) {
        /*
            Method dump skipped, instruction units count: 1696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewOnAttachStateChangeListenerC1885.m3573(androidx.collection.飘花落叶言子楪哲世兰苏):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m3574(int i) {
        C1887 c1887 = this.f5517;
        if (c1887 != null) {
            C1953 c1953 = c1887.f5549;
            if (i != c1953.f5767) {
                return;
            }
            if (SystemClock.uptimeMillis() - c1887.f5544 <= 1000) {
                AccessibilityEvent accessibilityEventM3585 = m3585(m3570(c1953.f5767), 131072);
                accessibilityEventM3585.setFromIndex(c1887.f5546);
                accessibilityEventM3585.setToIndex(c1887.f5545);
                accessibilityEventM3585.setAction(c1887.f5548);
                accessibilityEventM3585.setMovementGranularity(c1887.f5547);
                accessibilityEventM3585.getText().add(m3562(c1953));
                m3568(accessibilityEventM3585);
            }
        }
        this.f5517 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m3575(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventM3585 = m3585(m3570(i), 32);
        accessibilityEventM3585.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventM3585.getText().add(str);
        }
        m3568(accessibilityEventM3585);
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5856 mo3576(View view) {
        return this.f5524;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC0269 m3577() {
        if (this.f5518) {
            this.f5518 = false;
            ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f5532;
            this.f5513 = AbstractC1957.m3677(viewTreeObserverOnGlobalLayoutListenerC1884.getSemanticsOwner(), new InterfaceC6558() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1
                @Override // p052.InterfaceC6558
                public final Boolean invoke(C1953 c1953) {
                    C1956 c1956M3667 = c1953.m3667();
                    return Boolean.valueOf(c1956M3667.f5779.m752(AbstractC1943.f5719));
                }
            });
            if (m3580()) {
                final C0246 c0246 = this.f5513;
                final Resources resources = viewTreeObserverOnGlobalLayoutListenerC1884.getContext().getResources();
                C0248 c0248 = this.f5510;
                c0248.m801();
                C0248 c02482 = this.f5509;
                c02482.m801();
                C1950 c1950 = (C1950) c0246.m833(-1);
                C1953 c1953 = c1950 != null ? c1950.f5761 : null;
                c1953.getClass();
                ArrayList arrayListM3640 = AbstractC1933.m3640(c1953, new InterfaceC6558() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$1
                    {
                        super(1);
                    }

                    @Override // p052.InterfaceC6558
                    public final Boolean invoke(C1953 c19532) {
                        return Boolean.valueOf(c0246.m834(c19532.f5767));
                    }
                }, new InterfaceC6558() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p052.InterfaceC6558
                    public final Boolean invoke(C1953 c19532) {
                        return Boolean.valueOf(AbstractC1916.m3618(c19532, resources));
                    }
                }, AbstractC6347.m11928(c1953));
                int i = 1;
                int size = arrayListM3640.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((C1953) arrayListM3640.get(i - 1)).f5767;
                        int i3 = ((C1953) arrayListM3640.get(i)).f5767;
                        c0248.m796(i2, i3);
                        c02482.m796(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.f5513;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m3578(C1748 c1748) {
        if (this.f5516.add(c1748)) {
            this.f5515.mo8436(C5176.f14739);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0073 A[LOOP:0: B:4:0x0014->B:36:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076 A[EDGE_INSN: B:47:0x0076->B:37:0x0076 BREAK  A[LOOP:0: B:4:0x0014->B:36:0x0073], SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p112.C7328 m3579(androidx.compose.ui.semantics.C1953 r10, android.graphics.Rect r11, androidx.compose.ui.graphics.InterfaceC1569 r12) {
        /*
            r9 = this;
            androidx.compose.ui.platform.飘花落叶言子楪兰苏哲世 r0 = new androidx.compose.ui.platform.飘花落叶言子楪兰苏哲世
            r0.<init>(r12)
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r10 = r10.f5770
            androidx.compose.ui.node.飘花落叶言子苏楪哲世兰 r12 = r10.f5094
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r12 = r12.f5283
            int r1 = r12.f6285
            r1 = r1 & 8
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L76
        L14:
            if (r12 == 0) goto L76
            int r1 = r12.f6291
            r1 = r1 & 8
            if (r1 == 0) goto L6d
            r1 = r12
            r5 = r2
        L1e:
            if (r1 == 0) goto L6d
            boolean r6 = r1 instanceof androidx.compose.ui.node.InterfaceC1761
            if (r6 == 0) goto L30
            r6 = r1
            androidx.compose.ui.node.飘花落叶言子哲楪世苏兰 r6 = (androidx.compose.ui.node.InterfaceC1761) r6
            r6.mo1294(r0)
            boolean r6 = r0.f5551
            if (r6 == 0) goto L68
            r2 = r1
            goto L76
        L30:
            int r6 = r1.f6291
            r6 = r6 & 8
            if (r6 == 0) goto L68
            boolean r6 = r1 instanceof androidx.compose.ui.node.AbstractC1788
            if (r6 == 0) goto L68
            r6 = r1
            androidx.compose.ui.node.飘花落叶言子楪苏哲兰世 r6 = (androidx.compose.ui.node.AbstractC1788) r6
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r6 = r6.f5226
            r7 = r4
        L40:
            if (r6 == 0) goto L65
            int r8 = r6.f6291
            r8 = r8 & 8
            if (r8 == 0) goto L62
            int r7 = r7 + 1
            if (r7 != r3) goto L4e
            r1 = r6
            goto L62
        L4e:
            if (r5 != 0) goto L59
            androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲 r5 = new androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲
            r8 = 16
            androidx.compose.ui.飘花落叶言子楪哲苏世兰[] r8 = new androidx.compose.ui.AbstractC2128[r8]
            r5.<init>(r4, r8)
        L59:
            if (r1 == 0) goto L5f
            r5.m2047(r1)
            r1 = r2
        L5f:
            r5.m2047(r6)
        L62:
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r6 = r6.f6288
            goto L40
        L65:
            if (r7 != r3) goto L68
            goto L1e
        L68:
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r1 = androidx.compose.ui.node.AbstractC1785.m3339(r5)
            goto L1e
        L6d:
            int r1 = r12.f6285
            r1 = r1 & 8
            if (r1 == 0) goto L76
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r12 = r12.f6288
            goto L14
        L76:
            androidx.compose.ui.node.飘花落叶言子哲楪世苏兰 r2 = (androidx.compose.ui.node.InterfaceC1761) r2
            if (r2 == 0) goto Lb9
            r12 = r2
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r12 = (androidx.compose.ui.AbstractC2128) r12
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r12 = r12.f6292
            boolean r12 = r12.f6279
            if (r12 != r3) goto Lb9
            androidx.compose.ui.node.飘花落叶言子苏世楪哲兰 r10 = androidx.compose.ui.node.AbstractC1785.m3349(r2)
            androidx.compose.ui.layout.飘花落叶言子楪兰苏哲世 r12 = androidx.compose.ui.layout.AbstractC1670.m3113(r10)
            飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰 r10 = r12.mo3089(r10, r4)
            float r12 = r10.f19540
            float r0 = r10.f19539
            float r1 = r10.f19538
            float r10 = r10.f19537
            android.graphics.Rect r9 = r9.m3566(r12, r0, r1, r10)
            int r10 = r9.left
            int r12 = r11.left
            int r10 = r10 - r12
            float r10 = (float) r10
            int r12 = r9.top
            int r11 = r11.top
            int r12 = r12 - r11
            float r11 = (float) r12
            飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰 r12 = new 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰
            int r0 = r9.width()
            float r0 = (float) r0
            float r0 = r0 + r10
            int r9 = r9.height()
            float r9 = (float) r9
            float r9 = r9 + r11
            r12.<init>(r10, r11, r0, r9)
            return r12
        Lb9:
            androidx.compose.ui.node.飘花落叶言子苏楪哲世兰 r9 = r10.f5094
            androidx.compose.ui.node.飘花落叶言子苏世楪哲兰 r9 = r9.f5285
            飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰 r9 = androidx.compose.ui.layout.AbstractC1670.m3099(r9, r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewOnAttachStateChangeListenerC1885.m3579(androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世, android.graphics.Rect, androidx.compose.ui.graphics.飘花落叶言子世兰楪哲苏):飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean m3580() {
        AccessibilityManager accessibilityManager = this.f5536;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f5534;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.f5534 = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m3581() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m3580()) {
                m3569(this.f5532.getSemanticsOwner().m3651(), this.f5538);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                m3573(m3577());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    m3564();
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3582(boolean r22, int r23, long r24) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewOnAttachStateChangeListenerC1885.m3582(boolean, int, long):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int m3583(C1953 c1953) {
        C1956 c1956 = c1953.f5769;
        if (!c1956.f5779.m752(AbstractC1943.f5734)) {
            C1947 c1947 = AbstractC1943.f5725;
            if (c1956.f5779.m752(c1947)) {
                return (int) (((C2035) c1956.m3671(c1947)).f6004 & 4294967295L);
            }
        }
        return this.f5526;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int m3584(C1953 c1953) {
        C1956 c1956 = c1953.f5769;
        if (!c1956.f5779.m752(AbstractC1943.f5734)) {
            C1947 c1947 = AbstractC1943.f5725;
            if (c1956.f5779.m752(c1947)) {
                return (int) (((C2035) c1956.m3671(c1947)).f6004 >> 32);
            }
        }
        return this.f5526;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final AccessibilityEvent m3585(int i, int i2) {
        C1950 c1950;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f5532;
        accessibilityEventObtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC1884.getContext().getPackageName());
        accessibilityEventObtain.setSource(viewTreeObserverOnGlobalLayoutListenerC1884, i);
        if (m3580() && (c1950 = (C1950) m3577().m833(i)) != null) {
            C1953 c1953 = c1950.f5761;
            accessibilityEventObtain.setPassword(c1953.f5769.f5779.m752(AbstractC1943.f5713));
            boolean zM8907 = AbstractC4395.m8907(AbstractC1957.m3673(c1953.f5769, AbstractC1943.f5745), Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                AbstractC2296.m4315(accessibilityEventObtain, zM8907);
            }
        }
        return accessibilityEventObtain;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AccessibilityEvent m3586(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventM3585 = m3585(i, 8192);
        if (num != null) {
            accessibilityEventM3585.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventM3585.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventM3585.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventM3585.getText().add(charSequence);
        }
        return accessibilityEventM3585;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Rect m3587(C1950 c1950) {
        C7905 c7905 = c1950.f5760;
        return m3566(c7905.f21878, c7905.f21877, c7905.f21876, c7905.f21875);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0103, code lost:
    
        if (kotlinx.coroutines.AbstractC5399.m10499(r5, r2) == r3) goto L50;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3588(kotlin.coroutines.jvm.internal.ContinuationImpl r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewOnAttachStateChangeListenerC1885.m3588(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m3589(int i, C7607 c7607, String str, Bundle bundle) {
        C1953 c1953;
        InterfaceC1569 interfaceC1569;
        int i2;
        int i3;
        AccessibilityNodeInfo accessibilityNodeInfo = c7607.f20630;
        C1950 c1950 = (C1950) m3577().m833(i);
        if (c1950 == null || (c1953 = c1950.f5761) == null) {
            return;
        }
        C1748 c1748 = c1953.f5770;
        C1956 c1956 = c1953.f5769;
        C0236 c0236 = c1956.f5779;
        String strM3562 = m3562(c1953);
        if (AbstractC4395.m8907(str, this.f5512)) {
            int iM798 = this.f5510.m798(i);
            if (iM798 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM798);
                return;
            }
            return;
        }
        if (AbstractC4395.m8907(str, this.f5511)) {
            int iM7982 = this.f5509.m798(i);
            if (iM7982 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM7982);
                return;
            }
            return;
        }
        boolean zM752 = c0236.m752(AbstractC1959.f5793);
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f5532;
        if (zM752 && bundle != null && AbstractC4395.m8907(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i5 > 0 && i4 >= 0) {
                if (i4 < (strM3562 != null ? strM3562.length() : Integer.MAX_VALUE)) {
                    C2033 c2033M3622 = AbstractC1916.m3622(c1956);
                    if (c2033M3622 == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i6 = 0;
                    while (i6 < i5) {
                        int i7 = i4 + i6;
                        RectF rectF = null;
                        if (i7 >= c2033M3622.f5991.f5997.f6129.length()) {
                            arrayList.add(null);
                            i2 = i4;
                            i3 = i5;
                        } else {
                            C7328 c7328M3744 = c2033M3622.m3744(i7);
                            AbstractC1794 abstractC1794M3655 = c1953.m3655();
                            long jMo3076 = 0;
                            if (abstractC1794M3655 != null) {
                                if (!abstractC1794M3655.mo3282().f6279) {
                                    abstractC1794M3655 = null;
                                }
                                if (abstractC1794M3655 != null) {
                                    jMo3076 = abstractC1794M3655.mo3076(0L);
                                }
                            }
                            C7328 c7328M12524 = c7328M3744.m12524(jMo3076);
                            C7328 c7328M3666 = c1953.m3666();
                            C7328 c7328M12517 = c7328M12524.m12523(c7328M3666) ? c7328M12524.m12517(c7328M3666) : null;
                            if (c7328M12517 != null) {
                                long jM3538 = viewTreeObserverOnGlobalLayoutListenerC1884.m3538((((long) Float.floatToRawIntBits(c7328M12517.f19539)) & 4294967295L) | (((long) Float.floatToRawIntBits(c7328M12517.f19540)) << 32));
                                long jM35382 = viewTreeObserverOnGlobalLayoutListenerC1884.m3538((((long) Float.floatToRawIntBits(c7328M12517.f19537)) & 4294967295L) | (((long) Float.floatToRawIntBits(c7328M12517.f19538)) << 32));
                                int i8 = (int) (jM3538 >> 32);
                                i2 = i4;
                                i3 = i5;
                                int i9 = (int) (jM35382 >> 32);
                                int i10 = (int) (jM3538 & 4294967295L);
                                int i11 = (int) (jM35382 & 4294967295L);
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
        C1947 c1947 = AbstractC1943.f5720;
        if (c0236.m752(c1947) && bundle != null && AbstractC4395.m8907(str, "androidx.compose.ui.semantics.testTag")) {
            String str2 = (String) AbstractC1957.m3673(c1956, c1947);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (AbstractC4395.m8907(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, c1953.f5767);
            return;
        }
        if (AbstractC4395.m8907(str, "androidx.compose.ui.semantics.shapeType")) {
            InterfaceC1569 interfaceC15692 = (InterfaceC1569) AbstractC1957.m3673(c1956, AbstractC1943.f5710);
            if (interfaceC15692 != null) {
                Rect rect = new Rect();
                c7607.m12831(rect);
                C7328 c7328M3579 = m3579(c1953, rect, interfaceC15692);
                float f = c7328M3579.f19539;
                float f2 = c7328M3579.f19540;
                AbstractC1581 abstractC1581Mo1922 = interfaceC15692.mo1922(c7328M3579.m12519(), c1748.f5100, viewTreeObserverOnGlobalLayoutListenerC1884.getDensity());
                if (abstractC1581Mo1922 instanceof C1585) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m3557(abstractC1581Mo1922, f2, f));
                    return;
                } else if (abstractC1581Mo1922 instanceof C1576) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m3557(abstractC1581Mo1922, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", m3558(abstractC1581Mo1922));
                    return;
                } else if (!(abstractC1581Mo1922 instanceof C1586)) {
                    C4211.m8611();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", m3555(abstractC1581Mo1922, f2, f));
                    return;
                }
            }
            return;
        }
        if (AbstractC4395.m8907(str, "androidx.compose.ui.semantics.shapeRect")) {
            InterfaceC1569 interfaceC15693 = (InterfaceC1569) AbstractC1957.m3673(c1956, AbstractC1943.f5710);
            if (interfaceC15693 != null) {
                Rect rect2 = new Rect();
                c7607.m12831(rect2);
                C7328 c7328M35792 = m3579(c1953, rect2, interfaceC15693);
                Rect rectM3557 = m3557(interfaceC15693.mo1922(c7328M35792.m12519(), c1748.f5100, viewTreeObserverOnGlobalLayoutListenerC1884.getDensity()), c7328M35792.f19540, c7328M35792.f19539);
                if (rectM3557 != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectM3557);
                    return;
                }
                return;
            }
            return;
        }
        if (AbstractC4395.m8907(str, "androidx.compose.ui.semantics.shapeCorners")) {
            InterfaceC1569 interfaceC15694 = (InterfaceC1569) AbstractC1957.m3673(c1956, AbstractC1943.f5710);
            if (interfaceC15694 != null) {
                Rect rect3 = new Rect();
                c7607.m12831(rect3);
                float[] fArrM3558 = m3558(interfaceC15694.mo1922(m3579(c1953, rect3, interfaceC15694).m12519(), c1748.f5100, viewTreeObserverOnGlobalLayoutListenerC1884.getDensity()));
                if (fArrM3558 != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrM3558);
                    return;
                }
                return;
            }
            return;
        }
        if (!AbstractC4395.m8907(str, "androidx.compose.ui.semantics.shapeRegion") || (interfaceC1569 = (InterfaceC1569) AbstractC1957.m3673(c1956, AbstractC1943.f5710)) == null) {
            return;
        }
        Rect rect4 = new Rect();
        c7607.m12831(rect4);
        C7328 c7328M35793 = m3579(c1953, rect4, interfaceC1569);
        Region regionM3555 = m3555(interfaceC1569.mo1922(c7328M35793.m12519(), c1748.f5100, viewTreeObserverOnGlobalLayoutListenerC1884.getDensity()), c7328M35793.f19540, c7328M35793.f19539);
        if (regionM3555 != null) {
            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionM3555);
        }
    }
}
