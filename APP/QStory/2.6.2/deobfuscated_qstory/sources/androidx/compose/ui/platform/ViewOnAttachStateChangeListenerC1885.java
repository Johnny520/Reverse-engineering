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
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.List;
import kotlin.C5175;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.coroutines.channels.AbstractC5204;
import kotlinx.coroutines.channels.C5189;
import p052.InterfaceC6542;
import p052.InterfaceC6550;
import p052.InterfaceC6557;
import p112.C7326;
import p112.C7327;
import p155.C7606;
import p193.C7827;
import p205.C7904;
import p207.AbstractC7913;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1885 extends C2246 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static final C0247 f5505 = AbstractC0270.m834(R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31);

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final C7827 f5506;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final C0246 f5507;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final C0248 f5508;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final C0248 f5509;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final String f5510;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final String f5511;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C0246 f5512;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final C0245 f5513;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C5189 f5514;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C0275 f5515;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C1887 f5516;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f5517;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f5518;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C7606 f5519;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public C7606 f5520;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f5521;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f5522;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C1883 f5523;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public Integer f5524;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f5525;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C0282 f5526;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C0282 f5527;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C0246 f5528;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C0246 f5529;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1884 f5531;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public long f5532;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public List f5533;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AccessibilityManager f5535;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public boolean f5536;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public C1872 f5537;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final ArrayList f5538;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final InterfaceC6557 f5539;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final C0248 f5540;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final RunnableC1882 f5541;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f5530 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC6557 f5534 = new InterfaceC6557() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1
        {
            super(1);
        }

        @Override // p052.InterfaceC6557
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(this.this$0.f5531.getParent().requestSendAccessibilityEvent(this.this$0.f5531, accessibilityEvent));
        }
    };

    public ViewOnAttachStateChangeListenerC1885(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884) {
        this.f5531 = viewTreeObserverOnGlobalLayoutListenerC1884;
        Object systemService = viewTreeObserverOnGlobalLayoutListenerC1884.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.f5535 = (AccessibilityManager) systemService;
        this.f5532 = 100L;
        new Handler(Looper.getMainLooper());
        this.f5523 = new C1883(this);
        this.f5522 = Integer.MIN_VALUE;
        this.f5521 = Integer.MIN_VALUE;
        this.f5529 = new C0246();
        this.f5528 = new C0246();
        this.f5527 = new C0282(0);
        this.f5526 = new C0282(0);
        this.f5525 = -1;
        this.f5515 = new C0275(0);
        this.f5514 = AbstractC5204.m10278(1, 6, null);
        this.f5517 = true;
        C0246 c0246 = AbstractC0273.f978;
        c0246.getClass();
        this.f5512 = c0246;
        this.f5513 = new C0245();
        this.f5509 = new C0248();
        this.f5508 = new C0248();
        this.f5511 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f5510 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f5506 = new C7827(0);
        this.f5507 = new C0246();
        this.f5537 = new C1872(viewTreeObserverOnGlobalLayoutListenerC1884.getSemanticsOwner().m3641(), c0246);
        int i = AbstractC0280.f988;
        this.f5540 = new C0248();
        viewTreeObserverOnGlobalLayoutListenerC1884.addOnAttachStateChangeListener(this);
        this.f5541 = new RunnableC1882(this, 1);
        this.f5538 = new ArrayList();
        this.f5539 = new InterfaceC6557() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            {
                super(1);
            }

            public final void invoke(C1876 c1876) {
                ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC1885 = this.this$0;
                C0247 c0247 = ViewOnAttachStateChangeListenerC1885.f5505;
                viewOnAttachStateChangeListenerC1885.getClass();
                if (c1876.f5382.contains(c1876)) {
                    C1803 snapshotObserver = viewOnAttachStateChangeListenerC1885.f5531.getSnapshotObserver();
                    snapshotObserver.f5273.m2236(c1876, viewOnAttachStateChangeListenerC1885.f5539, new AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1(c1876, viewOnAttachStateChangeListenerC1885));
                }
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C1876) obj);
                return C5175.f14739;
            }
        };
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static Region m3545(AbstractC1581 abstractC1581, float f, float f2) {
        if (abstractC1581 instanceof C1586) {
            C1586 c1586 = (C1586) abstractC1581;
            C7327 c7327M12495 = c1586.mo2859().m12495(f, f2);
            Region region = new Region(new Rect((int) (c7327M12495.f19545 + 0.0f), (int) (c7327M12495.f19544 + 0.0f), (int) (c7327M12495.f19543 + 0.0f), (int) (c7327M12495.f19542 + 0.0f)));
            Region region2 = new Region();
            C1614 c1614 = c1586.f4672;
            if (c1614 instanceof C1614) {
                Path path = c1614.f4724;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            C5919.m11247("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static CharSequence m3546(CharSequence charSequence) {
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
    public static Rect m3547(AbstractC1581 abstractC1581, float f, float f2) {
        if (!(abstractC1581 instanceof C1585) && !(abstractC1581 instanceof C1576)) {
            return null;
        }
        C7327 c7327Mo2859 = abstractC1581.mo2859();
        return new Rect((int) (c7327Mo2859.f19545 + f), (int) (c7327Mo2859.f19544 + f2), (int) (c7327Mo2859.f19543 + f), (int) (c7327Mo2859.f19542 + f2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static float[] m3548(AbstractC1581 abstractC1581) {
        if (!(abstractC1581 instanceof C1576)) {
            return null;
        }
        C7326 c7326 = ((C1576) abstractC1581).f4655;
        long j = c7326.f19539;
        long j2 = c7326.f19540;
        long j3 = c7326.f19533;
        long j4 = c7326.f19534;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final boolean m3549(C1958 c1958) {
        InterfaceC6542 interfaceC6542 = c1958.f5781;
        if (((Number) interfaceC6542.invoke()).floatValue() < ((Number) c1958.f5780.invoke()).floatValue()) {
            return true;
        }
        ((Number) interfaceC6542.invoke()).floatValue();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final boolean m3550(C1958 c1958) {
        InterfaceC6542 interfaceC6542 = c1958.f5781;
        if (((Number) interfaceC6542.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) interfaceC6542.invoke()).floatValue();
        ((Number) c1958.f5780.invoke()).floatValue();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m3551(ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC1885, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        viewOnAttachStateChangeListenerC1885.m3557(i, i2, num, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static String m3552(C1953 c1953) {
        C2068 c2068;
        if (c1953 != null) {
            C1956 c1956 = c1953.f5768;
            C0236 c0236 = c1956.f5778;
            C1947 c1947 = AbstractC1943.f5733;
            if (c0236.m751(c1947)) {
                return AbstractC7913.m13383((List) c1956.m3661(c1947), ",", null, 62);
            }
            C1947 c19472 = AbstractC1943.f5725;
            if (c0236.m751(c19472)) {
                C2068 c20682 = (C2068) AbstractC1957.m3663(c1956, c19472);
                if (c20682 != null) {
                    return c20682.f6128;
                }
            } else {
                List list = (List) AbstractC1957.m3663(c1956, AbstractC1943.f5717);
                if (list != null && (c2068 = (C2068) AbstractC4343.m8830(list)) != null) {
                    return c2068.f6128;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final boolean m3553(C1958 c1958, float f) {
        InterfaceC6542 interfaceC6542 = c1958.f5781;
        if (f >= 0.0f || ((Number) interfaceC6542.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) interfaceC6542.invoke()).floatValue() < ((Number) c1958.f5780.invoke()).floatValue();
        }
        return true;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.f5533 = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.f5533 = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.f5535;
        if (accessibilityManager.isEnabled()) {
            this.f5533 = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f5531.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.f5541);
        AccessibilityManager accessibilityManager = this.f5535;
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
    public final void m3554() {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewOnAttachStateChangeListenerC1885.m3554():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final boolean m3555(C1953 c1953, int i, int i2, boolean z) {
        String strM3552;
        C1956 c1956 = c1953.f5768;
        int i3 = c1953.f5766;
        C1947 c1947 = AbstractC1959.f5810;
        if (c1956.f5778.m751(c1947) && AbstractC1916.m3609(c1953)) {
            InterfaceC6550 interfaceC6550 = (InterfaceC6550) ((C1941) c1953.f5768.m3661(c1947)).f5705;
            if (interfaceC6550 != null) {
                return ((Boolean) interfaceC6550.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.f5525) && (strM3552 = m3552(c1953)) != null) {
            if (i < 0 || i != i2 || i2 > strM3552.length()) {
                i = -1;
            }
            this.f5525 = i;
            boolean z2 = strM3552.length() > 0;
            m3558(m3576(m3560(i3), z2 ? Integer.valueOf(this.f5525) : null, z2 ? Integer.valueOf(this.f5525) : null, z2 ? Integer.valueOf(strM3552.length()) : null, strM3552));
            m3564(i3);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final Rect m3556(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f5531;
        long jM3528 = viewTreeObserverOnGlobalLayoutListenerC1884.m3528(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jM35282 = viewTreeObserverOnGlobalLayoutListenerC1884.m3528((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jM3528 >> 32);
        int i2 = (int) (jM35282 >> 32);
        int i3 = (int) (jM3528 & 4294967295L);
        int i4 = (int) (jM35282 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final boolean m3557(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !m3570()) {
            return false;
        }
        AccessibilityEvent accessibilityEventM3575 = m3575(i, i2);
        if (num != null) {
            accessibilityEventM3575.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventM3575.setContentDescription(AbstractC7913.m13383(list, ",", null, 62));
        }
        return m3558(accessibilityEventM3575);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final boolean m3558(AccessibilityEvent accessibilityEvent) {
        if (!m3570()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f5518 = true;
        }
        try {
            return ((Boolean) this.f5534.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f5518 = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3559(androidx.compose.ui.semantics.C1953 r20, androidx.compose.ui.platform.C1872 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = androidx.collection.AbstractC0274.f979
            androidx.collection.飘花落叶言子世楪兰哲苏 r3 = new androidx.collection.飘花落叶言子世楪兰哲苏
            r3.<init>()
            r4 = 4
            java.util.List r5 = androidx.compose.ui.semantics.C1953.m3642(r4, r1)
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r6 = r1.f5769
            int r7 = r5.size()
            r8 = 0
            r9 = r8
        L1a:
            if (r9 >= r7) goto L40
            java.lang.Object r10 = r5.get(r9)
            androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世 r10 = (androidx.compose.ui.semantics.C1953) r10
            androidx.collection.飘花落叶言子楪哲世兰苏 r11 = r0.m3567()
            int r10 = r10.f5766
            boolean r11 = r11.m833(r10)
            if (r11 == 0) goto L3d
            androidx.collection.飘花落叶言子世楪兰哲苏 r11 = r2.f5377
            boolean r11 = r11.m783(r10)
            if (r11 != 0) goto L3a
            r0.m3568(r6)
            return
        L3a:
            r3.m784(r10)
        L3d:
            int r9 = r9 + 1
            goto L1a
        L40:
            androidx.collection.飘花落叶言子世楪兰哲苏 r2 = r2.f5377
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
            boolean r15 = r3.m783(r15)
            if (r15 != 0) goto L80
            r0.m3568(r6)
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
            java.util.List r1 = androidx.compose.ui.semantics.C1953.m3642(r4, r1)
            int r2 = r1.size()
        L93:
            if (r8 >= r2) goto Lb9
            java.lang.Object r3 = r1.get(r8)
            androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世 r3 = (androidx.compose.ui.semantics.C1953) r3
            androidx.collection.飘花落叶言子世楪兰苏哲 r4 = r0.f5507
            int r5 = r3.f5766
            java.lang.Object r4 = r4.m832(r5)
            androidx.compose.ui.platform.飘花落叶言子哲苏世楪兰 r4 = (androidx.compose.ui.platform.C1872) r4
            if (r4 == 0) goto Lb6
            androidx.collection.飘花落叶言子楪哲世兰苏 r5 = r0.m3567()
            int r6 = r3.f5766
            boolean r5 = r5.m833(r6)
            if (r5 == 0) goto Lb6
            r0.m3559(r3, r4)
        Lb6:
            int r8 = r8 + 1
            goto L93
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewOnAttachStateChangeListenerC1885.m3559(androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世, androidx.compose.ui.platform.飘花落叶言子哲苏世楪兰):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final int m3560(int i) {
        if (i == this.f5531.getSemanticsOwner().m3641().f5766) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m3561(C1748 c1748) {
        if (c1748.m3233() && !this.f5531.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(c1748)) {
            int i = c1748.f5122;
            C1958 c1958 = (C1958) this.f5529.m832(i);
            C1958 c19582 = (C1958) this.f5528.m832(i);
            if (c1958 == null && c19582 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventM3575 = m3575(i, 4096);
            if (c1958 != null) {
                accessibilityEventM3575.setScrollX((int) ((Number) c1958.f5781.invoke()).floatValue());
                accessibilityEventM3575.setMaxScrollX((int) ((Number) c1958.f5780.invoke()).floatValue());
            }
            if (c19582 != null) {
                accessibilityEventM3575.setScrollY((int) ((Number) c19582.f5781.invoke()).floatValue());
                accessibilityEventM3575.setMaxScrollY((int) ((Number) c19582.f5780.invoke()).floatValue());
            }
            m3558(accessibilityEventM3575);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m3562(C1748 c1748, C0245 c0245) {
        C1956 c1956M3244;
        C1748 c1748M3605;
        if (c1748.m3233() && !this.f5531.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(c1748)) {
            if (!c1748.f5093.m3418(8)) {
                c1748 = AbstractC1916.m3605(c1748, new InterfaceC6557() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                    @Override // p052.InterfaceC6557
                    public final Boolean invoke(C1748 c17482) {
                        return Boolean.valueOf(c17482.f5093.m3418(8));
                    }
                });
            }
            if (c1748 == null || (c1956M3244 = c1748.m3244()) == null) {
                return;
            }
            if (!c1956M3244.f5777 && (c1748M3605 = AbstractC1916.m3605(c1748, new InterfaceC6557() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1
                @Override // p052.InterfaceC6557
                public final Boolean invoke(C1748 c17482) {
                    C1956 c1956M32442 = c17482.m3244();
                    boolean z = false;
                    if (c1956M32442 != null && c1956M32442.f5777) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            })) != null) {
                c1748 = c1748M3605;
            }
            int i = c1748.f5122;
            if (c0245.m784(i)) {
                m3551(this, m3560(i), 2048, 1, 8);
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
    public final void m3563(androidx.collection.AbstractC0269 r59) {
        /*
            Method dump skipped, instruction units count: 1696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewOnAttachStateChangeListenerC1885.m3563(androidx.collection.飘花落叶言子楪哲世兰苏):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m3564(int i) {
        C1887 c1887 = this.f5516;
        if (c1887 != null) {
            C1953 c1953 = c1887.f5548;
            if (i != c1953.f5766) {
                return;
            }
            if (SystemClock.uptimeMillis() - c1887.f5543 <= 1000) {
                AccessibilityEvent accessibilityEventM3575 = m3575(m3560(c1953.f5766), 131072);
                accessibilityEventM3575.setFromIndex(c1887.f5545);
                accessibilityEventM3575.setToIndex(c1887.f5544);
                accessibilityEventM3575.setAction(c1887.f5547);
                accessibilityEventM3575.setMovementGranularity(c1887.f5546);
                accessibilityEventM3575.getText().add(m3552(c1953));
                m3558(accessibilityEventM3575);
            }
        }
        this.f5516 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m3565(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventM3575 = m3575(m3560(i), 32);
        accessibilityEventM3575.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventM3575.getText().add(str);
        }
        m3558(accessibilityEventM3575);
    }

    @Override // androidx.core.view.C2246
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5851 mo3566(View view) {
        return this.f5523;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC0269 m3567() {
        if (this.f5517) {
            this.f5517 = false;
            ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f5531;
            this.f5512 = AbstractC1957.m3667(viewTreeObserverOnGlobalLayoutListenerC1884.getSemanticsOwner(), new InterfaceC6557() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1
                @Override // p052.InterfaceC6557
                public final Boolean invoke(C1953 c1953) {
                    C1956 c1956M3657 = c1953.m3657();
                    return Boolean.valueOf(c1956M3657.f5778.m751(AbstractC1943.f5718));
                }
            });
            if (m3570()) {
                final C0246 c0246 = this.f5512;
                final Resources resources = viewTreeObserverOnGlobalLayoutListenerC1884.getContext().getResources();
                C0248 c0248 = this.f5509;
                c0248.m800();
                C0248 c02482 = this.f5508;
                c02482.m800();
                C1950 c1950 = (C1950) c0246.m832(-1);
                C1953 c1953 = c1950 != null ? c1950.f5760 : null;
                c1953.getClass();
                ArrayList arrayListM3630 = AbstractC1933.m3630(c1953, new InterfaceC6557() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$1
                    {
                        super(1);
                    }

                    @Override // p052.InterfaceC6557
                    public final Boolean invoke(C1953 c19532) {
                        return Boolean.valueOf(c0246.m833(c19532.f5766));
                    }
                }, new InterfaceC6557() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p052.InterfaceC6557
                    public final Boolean invoke(C1953 c19532) {
                        return Boolean.valueOf(AbstractC1916.m3608(c19532, resources));
                    }
                }, AbstractC8189.m13660(c1953));
                int i = 1;
                int size = arrayListM3630.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((C1953) arrayListM3630.get(i - 1)).f5766;
                        int i3 = ((C1953) arrayListM3630.get(i)).f5766;
                        c0248.m795(i2, i3);
                        c02482.m795(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.f5512;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m3568(C1748 c1748) {
        if (this.f5515.add(c1748)) {
            this.f5514.mo8445(C5175.f14739);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0073 A[LOOP:0: B:4:0x0014->B:36:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076 A[EDGE_INSN: B:47:0x0076->B:37:0x0076 BREAK  A[LOOP:0: B:4:0x0014->B:36:0x0073], SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p112.C7327 m3569(androidx.compose.ui.semantics.C1953 r10, android.graphics.Rect r11, androidx.compose.ui.graphics.InterfaceC1569 r12) {
        /*
            r9 = this;
            androidx.compose.ui.platform.飘花落叶言子楪兰苏哲世 r0 = new androidx.compose.ui.platform.飘花落叶言子楪兰苏哲世
            r0.<init>(r12)
            androidx.compose.ui.node.飘花落叶言子世楪兰哲苏 r10 = r10.f5769
            androidx.compose.ui.node.飘花落叶言子苏楪哲世兰 r12 = r10.f5093
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r12 = r12.f5282
            int r1 = r12.f6284
            r1 = r1 & 8
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L76
        L14:
            if (r12 == 0) goto L76
            int r1 = r12.f6290
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
            r6.mo1284(r0)
            boolean r6 = r0.f5550
            if (r6 == 0) goto L68
            r2 = r1
            goto L76
        L30:
            int r6 = r1.f6290
            r6 = r6 & 8
            if (r6 == 0) goto L68
            boolean r6 = r1 instanceof androidx.compose.ui.node.AbstractC1788
            if (r6 == 0) goto L68
            r6 = r1
            androidx.compose.ui.node.飘花落叶言子楪苏哲兰世 r6 = (androidx.compose.ui.node.AbstractC1788) r6
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r6 = r6.f5225
            r7 = r4
        L40:
            if (r6 == 0) goto L65
            int r8 = r6.f6290
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
            r5.m2037(r1)
            r1 = r2
        L5f:
            r5.m2037(r6)
        L62:
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r6 = r6.f6287
            goto L40
        L65:
            if (r7 != r3) goto L68
            goto L1e
        L68:
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r1 = androidx.compose.ui.node.AbstractC1785.m3329(r5)
            goto L1e
        L6d:
            int r1 = r12.f6284
            r1 = r1 & 8
            if (r1 == 0) goto L76
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r12 = r12.f6287
            goto L14
        L76:
            androidx.compose.ui.node.飘花落叶言子哲楪世苏兰 r2 = (androidx.compose.ui.node.InterfaceC1761) r2
            if (r2 == 0) goto Lb9
            r12 = r2
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r12 = (androidx.compose.ui.AbstractC2128) r12
            androidx.compose.ui.飘花落叶言子楪哲苏世兰 r12 = r12.f6291
            boolean r12 = r12.f6278
            if (r12 != r3) goto Lb9
            androidx.compose.ui.node.飘花落叶言子苏世楪哲兰 r10 = androidx.compose.ui.node.AbstractC1785.m3339(r2)
            androidx.compose.ui.layout.飘花落叶言子楪兰苏哲世 r12 = androidx.compose.ui.layout.AbstractC1670.m3103(r10)
            飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰 r10 = r12.mo3079(r10, r4)
            float r12 = r10.f19545
            float r0 = r10.f19544
            float r1 = r10.f19543
            float r10 = r10.f19542
            android.graphics.Rect r9 = r9.m3556(r12, r0, r1, r10)
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
            androidx.compose.ui.node.飘花落叶言子苏楪哲世兰 r9 = r10.f5093
            androidx.compose.ui.node.飘花落叶言子苏世楪哲兰 r9 = r9.f5284
            飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰 r9 = androidx.compose.ui.layout.AbstractC1670.m3089(r9, r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewOnAttachStateChangeListenerC1885.m3569(androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世, android.graphics.Rect, androidx.compose.ui.graphics.飘花落叶言子世兰楪哲苏):飘花落叶言子世哲兰楪苏.飘花落叶言子楪世哲苏兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean m3570() {
        AccessibilityManager accessibilityManager = this.f5535;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f5533;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.f5533 = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m3571() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m3570()) {
                m3559(this.f5531.getSemanticsOwner().m3641(), this.f5537);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                m3563(m3567());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    m3554();
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
    public final boolean m3572(boolean r22, int r23, long r24) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewOnAttachStateChangeListenerC1885.m3572(boolean, int, long):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int m3573(C1953 c1953) {
        C1956 c1956 = c1953.f5768;
        if (!c1956.f5778.m751(AbstractC1943.f5733)) {
            C1947 c1947 = AbstractC1943.f5724;
            if (c1956.f5778.m751(c1947)) {
                return (int) (((C2035) c1956.m3661(c1947)).f6003 & 4294967295L);
            }
        }
        return this.f5525;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int m3574(C1953 c1953) {
        C1956 c1956 = c1953.f5768;
        if (!c1956.f5778.m751(AbstractC1943.f5733)) {
            C1947 c1947 = AbstractC1943.f5724;
            if (c1956.f5778.m751(c1947)) {
                return (int) (((C2035) c1956.m3661(c1947)).f6003 >> 32);
            }
        }
        return this.f5525;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final AccessibilityEvent m3575(int i, int i2) {
        C1950 c1950;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f5531;
        accessibilityEventObtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC1884.getContext().getPackageName());
        accessibilityEventObtain.setSource(viewTreeObserverOnGlobalLayoutListenerC1884, i);
        if (m3570() && (c1950 = (C1950) m3567().m832(i)) != null) {
            C1953 c1953 = c1950.f5760;
            accessibilityEventObtain.setPassword(c1953.f5768.f5778.m751(AbstractC1943.f5712));
            boolean zM8917 = AbstractC4394.m8917(AbstractC1957.m3663(c1953.f5768, AbstractC1943.f5744), Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                AbstractC2296.m4305(accessibilityEventObtain, zM8917);
            }
        }
        return accessibilityEventObtain;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AccessibilityEvent m3576(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventM3575 = m3575(i, 8192);
        if (num != null) {
            accessibilityEventM3575.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventM3575.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventM3575.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventM3575.getText().add(charSequence);
        }
        return accessibilityEventM3575;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Rect m3577(C1950 c1950) {
        C7904 c7904 = c1950.f5759;
        return m3556(c7904.f21881, c7904.f21880, c7904.f21879, c7904.f21878);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0103, code lost:
    
        if (kotlinx.coroutines.AbstractC5398.m10495(r5, r2) == r3) goto L50;
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
    public final java.lang.Object m3578(kotlin.coroutines.jvm.internal.ContinuationImpl r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewOnAttachStateChangeListenerC1885.m3578(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m3579(int i, C7606 c7606, String str, Bundle bundle) {
        C1953 c1953;
        InterfaceC1569 interfaceC1569;
        int i2;
        int i3;
        AccessibilityNodeInfo accessibilityNodeInfo = c7606.f20635;
        C1950 c1950 = (C1950) m3567().m832(i);
        if (c1950 == null || (c1953 = c1950.f5760) == null) {
            return;
        }
        C1748 c1748 = c1953.f5769;
        C1956 c1956 = c1953.f5768;
        C0236 c0236 = c1956.f5778;
        String strM3552 = m3552(c1953);
        if (AbstractC4394.m8917(str, this.f5511)) {
            int iM797 = this.f5509.m797(i);
            if (iM797 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM797);
                return;
            }
            return;
        }
        if (AbstractC4394.m8917(str, this.f5510)) {
            int iM7972 = this.f5508.m797(i);
            if (iM7972 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM7972);
                return;
            }
            return;
        }
        boolean zM751 = c0236.m751(AbstractC1959.f5792);
        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f5531;
        if (zM751 && bundle != null && AbstractC4394.m8917(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i5 > 0 && i4 >= 0) {
                if (i4 < (strM3552 != null ? strM3552.length() : Integer.MAX_VALUE)) {
                    C2033 c2033M3612 = AbstractC1916.m3612(c1956);
                    if (c2033M3612 == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i6 = 0;
                    while (i6 < i5) {
                        int i7 = i4 + i6;
                        RectF rectF = null;
                        if (i7 >= c2033M3612.f5990.f5996.f6128.length()) {
                            arrayList.add(null);
                            i2 = i4;
                            i3 = i5;
                        } else {
                            C7327 c7327M3734 = c2033M3612.m3734(i7);
                            AbstractC1794 abstractC1794M3645 = c1953.m3645();
                            long jMo3066 = 0;
                            if (abstractC1794M3645 != null) {
                                if (!abstractC1794M3645.mo3272().f6278) {
                                    abstractC1794M3645 = null;
                                }
                                if (abstractC1794M3645 != null) {
                                    jMo3066 = abstractC1794M3645.mo3066(0L);
                                }
                            }
                            C7327 c7327M12497 = c7327M3734.m12497(jMo3066);
                            C7327 c7327M3656 = c1953.m3656();
                            C7327 c7327M12490 = c7327M12497.m12496(c7327M3656) ? c7327M12497.m12490(c7327M3656) : null;
                            if (c7327M12490 != null) {
                                long jM3528 = viewTreeObserverOnGlobalLayoutListenerC1884.m3528((((long) Float.floatToRawIntBits(c7327M12490.f19544)) & 4294967295L) | (((long) Float.floatToRawIntBits(c7327M12490.f19545)) << 32));
                                long jM35282 = viewTreeObserverOnGlobalLayoutListenerC1884.m3528((((long) Float.floatToRawIntBits(c7327M12490.f19542)) & 4294967295L) | (((long) Float.floatToRawIntBits(c7327M12490.f19543)) << 32));
                                int i8 = (int) (jM3528 >> 32);
                                i2 = i4;
                                i3 = i5;
                                int i9 = (int) (jM35282 >> 32);
                                int i10 = (int) (jM3528 & 4294967295L);
                                int i11 = (int) (jM35282 & 4294967295L);
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
        C1947 c1947 = AbstractC1943.f5719;
        if (c0236.m751(c1947) && bundle != null && AbstractC4394.m8917(str, "androidx.compose.ui.semantics.testTag")) {
            String str2 = (String) AbstractC1957.m3663(c1956, c1947);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (AbstractC4394.m8917(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, c1953.f5766);
            return;
        }
        if (AbstractC4394.m8917(str, "androidx.compose.ui.semantics.shapeType")) {
            InterfaceC1569 interfaceC15692 = (InterfaceC1569) AbstractC1957.m3663(c1956, AbstractC1943.f5709);
            if (interfaceC15692 != null) {
                Rect rect = new Rect();
                c7606.m12802(rect);
                C7327 c7327M3569 = m3569(c1953, rect, interfaceC15692);
                float f = c7327M3569.f19544;
                float f2 = c7327M3569.f19545;
                AbstractC1581 abstractC1581Mo1912 = interfaceC15692.mo1912(c7327M3569.m12492(), c1748.f5099, viewTreeObserverOnGlobalLayoutListenerC1884.getDensity());
                if (abstractC1581Mo1912 instanceof C1585) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m3547(abstractC1581Mo1912, f2, f));
                    return;
                } else if (abstractC1581Mo1912 instanceof C1576) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m3547(abstractC1581Mo1912, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", m3548(abstractC1581Mo1912));
                    return;
                } else if (!(abstractC1581Mo1912 instanceof C1586)) {
                    C4210.m8621();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", m3545(abstractC1581Mo1912, f2, f));
                    return;
                }
            }
            return;
        }
        if (AbstractC4394.m8917(str, "androidx.compose.ui.semantics.shapeRect")) {
            InterfaceC1569 interfaceC15693 = (InterfaceC1569) AbstractC1957.m3663(c1956, AbstractC1943.f5709);
            if (interfaceC15693 != null) {
                Rect rect2 = new Rect();
                c7606.m12802(rect2);
                C7327 c7327M35692 = m3569(c1953, rect2, interfaceC15693);
                Rect rectM3547 = m3547(interfaceC15693.mo1912(c7327M35692.m12492(), c1748.f5099, viewTreeObserverOnGlobalLayoutListenerC1884.getDensity()), c7327M35692.f19545, c7327M35692.f19544);
                if (rectM3547 != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectM3547);
                    return;
                }
                return;
            }
            return;
        }
        if (AbstractC4394.m8917(str, "androidx.compose.ui.semantics.shapeCorners")) {
            InterfaceC1569 interfaceC15694 = (InterfaceC1569) AbstractC1957.m3663(c1956, AbstractC1943.f5709);
            if (interfaceC15694 != null) {
                Rect rect3 = new Rect();
                c7606.m12802(rect3);
                float[] fArrM3548 = m3548(interfaceC15694.mo1912(m3569(c1953, rect3, interfaceC15694).m12492(), c1748.f5099, viewTreeObserverOnGlobalLayoutListenerC1884.getDensity()));
                if (fArrM3548 != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrM3548);
                    return;
                }
                return;
            }
            return;
        }
        if (!AbstractC4394.m8917(str, "androidx.compose.ui.semantics.shapeRegion") || (interfaceC1569 = (InterfaceC1569) AbstractC1957.m3663(c1956, AbstractC1943.f5709)) == null) {
            return;
        }
        Rect rect4 = new Rect();
        c7606.m12802(rect4);
        C7327 c7327M35693 = m3569(c1953, rect4, interfaceC1569);
        Region regionM3545 = m3545(interfaceC1569.mo1912(c7327M35693.m12492(), c1748.f5099, viewTreeObserverOnGlobalLayoutListenerC1884.getDensity()), c7327M35693.f19545, c7327M35693.f19544);
        if (regionM3545 != null) {
            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionM3545);
        }
    }
}
