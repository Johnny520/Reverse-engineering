package androidx.compose.p001ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.GestureDetector;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0923;
import androidx.appcompat.app.C0960;
import androidx.appcompat.app.RunnableC0909;
import androidx.appcompat.app.RunnableC0946;
import androidx.appcompat.widget.C0984;
import androidx.collection.AbstractC1120;
import androidx.collection.AbstractC1132;
import androidx.collection.AbstractC1134;
import androidx.collection.C1082;
import androidx.collection.C1083;
import androidx.collection.C1089;
import androidx.collection.C1091;
import androidx.collection.C1092;
import androidx.collection.C1093;
import androidx.collection.C1110;
import androidx.compose.animation.core.C1171;
import androidx.compose.foundation.lazy.C1589;
import androidx.compose.foundation.text.selection.AbstractC1759;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.C2960;
import androidx.compose.p001ui.autofill.AbstractC2247;
import androidx.compose.p001ui.autofill.AbstractC2252;
import androidx.compose.p001ui.autofill.C2242;
import androidx.compose.p001ui.autofill.C2248;
import androidx.compose.p001ui.autofill.C2253;
import androidx.compose.p001ui.autofill.InterfaceC2238;
import androidx.compose.p001ui.contentcapture.ViewOnAttachStateChangeListenerC2256;
import androidx.compose.p001ui.draganddrop.ViewOnDragListenerC2263;
import androidx.compose.p001ui.focus.AbstractC2294;
import androidx.compose.p001ui.focus.AbstractC2316;
import androidx.compose.p001ui.focus.C2287;
import androidx.compose.p001ui.focus.C2299;
import androidx.compose.p001ui.focus.C2312;
import androidx.compose.p001ui.focus.C2313;
import androidx.compose.p001ui.focus.FocusStateImpl;
import androidx.compose.p001ui.focus.InterfaceC2318;
import androidx.compose.p001ui.focus.InterfaceC2319;
import androidx.compose.p001ui.focus.InterfaceC2320;
import androidx.compose.p001ui.graphics.C2422;
import androidx.compose.p001ui.graphics.C2426;
import androidx.compose.p001ui.graphics.C2430;
import androidx.compose.p001ui.graphics.C2437;
import androidx.compose.p001ui.graphics.InterfaceC2418;
import androidx.compose.p001ui.input.pointer.C2464;
import androidx.compose.p001ui.input.pointer.C2466;
import androidx.compose.p001ui.input.pointer.C2469;
import androidx.compose.p001ui.input.pointer.C2471;
import androidx.compose.p001ui.input.pointer.C2472;
import androidx.compose.p001ui.input.pointer.C2483;
import androidx.compose.p001ui.input.pointer.InterfaceC2476;
import androidx.compose.p001ui.input.pointer.InterfaceC2480;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2560;
import androidx.compose.p001ui.layout.C2499;
import androidx.compose.p001ui.layout.C2556;
import androidx.compose.p001ui.layout.RunnableC2536;
import androidx.compose.p001ui.modifier.C2569;
import androidx.compose.p001ui.node.AbstractC2577;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.node.C2573;
import androidx.compose.p001ui.node.C2578;
import androidx.compose.p001ui.node.C2581;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.p001ui.node.C2586;
import androidx.compose.p001ui.node.C2591;
import androidx.compose.p001ui.node.C2593;
import androidx.compose.p001ui.node.C2597;
import androidx.compose.p001ui.node.C2613;
import androidx.compose.p001ui.node.C2615;
import androidx.compose.p001ui.node.C2638;
import androidx.compose.p001ui.node.C2646;
import androidx.compose.p001ui.node.InterfaceC2632;
import androidx.compose.p001ui.node.InterfaceC2633;
import androidx.compose.p001ui.node.InterfaceC2636;
import androidx.compose.p001ui.node.InterfaceC2637;
import androidx.compose.p001ui.node.InterfaceC2640;
import androidx.compose.p001ui.node.InterfaceC2641;
import androidx.compose.p001ui.node.Invalidation;
import androidx.compose.p001ui.node.LayoutNode$UsageByParent;
import androidx.compose.p001ui.scrollcapture.C2763;
import androidx.compose.p001ui.semantics.AbstractC2778;
import androidx.compose.p001ui.semantics.AbstractC2792;
import androidx.compose.p001ui.semantics.AbstractC2794;
import androidx.compose.p001ui.semantics.C2772;
import androidx.compose.p001ui.semantics.C2776;
import androidx.compose.p001ui.semantics.C2785;
import androidx.compose.p001ui.semantics.C2786;
import androidx.compose.p001ui.semantics.C2788;
import androidx.compose.p001ui.semantics.C2791;
import androidx.compose.p001ui.semantics.InterfaceC2784;
import androidx.compose.p001ui.spatial.C2796;
import androidx.compose.p001ui.spatial.C2801;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.font.InterfaceC2825;
import androidx.compose.p001ui.text.font.InterfaceC2830;
import androidx.compose.p001ui.text.input.C2834;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.p001ui.text.input.C2848;
import androidx.compose.p001ui.text.input.C2851;
import androidx.compose.p001ui.text.input.C2855;
import androidx.compose.p001ui.text.input.C2859;
import androidx.compose.p001ui.text.input.InputConnectionC2846;
import androidx.compose.p001ui.text.input.InterfaceC2854;
import androidx.compose.p001ui.text.input.InterfaceInputConnectionC2852;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.p001ui.viewinterop.AbstractC2909;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2197;
import androidx.compose.runtime.InterfaceC2187;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.snapshots.AbstractC2109;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.snapshots.AbstractC2121;
import androidx.compose.runtime.snapshots.C2102;
import androidx.compose.runtime.snapshots.C2110;
import androidx.core.os.C3011;
import androidx.core.os.C3015;
import androidx.core.view.AbstractC3103;
import androidx.lifecycle.AbstractC3235;
import androidx.lifecycle.C3244;
import androidx.lifecycle.C3256;
import androidx.lifecycle.C3259;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.InterfaceC3242;
import androidx.lifecycle.InterfaceC3254;
import bsh.C3466;
import com.alibaba.fastjson2.C3775;
import com.android.p002dx.p005io.Opcodes;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.protobuf.DescriptorProtos$Edition;
import io.ktor.util.C5043;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.InterfaceC6001;
import kotlin.NotImplementedError;
import kotlin.collections.C5183;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlinx.coroutines.InterfaceC6233;
import p050.AbstractC7176;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p124.InterfaceC8146;
import p126.C8150;
import p126.C8151;
import p126.InterfaceC8149;
import p127.C8152;
import p127.C8154;
import p127.InterfaceC8153;
import p128.C8157;
import p130.C8164;
import p130.InterfaceC8162;
import p133.AbstractC8179;
import p176.C8466;
import p183.C8542;
import p210.C8661;
import p210.C8662;
import p221.C8727;
import p221.InterfaceC8725;
import p223.AbstractC8743;
import p226.AbstractC8765;
import p269.AbstractC9019;
import top.linl.dexparser.bean.DexMap;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2719 extends ViewGroup implements InterfaceC2636, InterfaceC2632, InterfaceC3242, InterfaceC2640, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, InterfaceC2319 {

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public static final C1091 f5757 = new C1091();

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    public static RunnableC2733 f5758;

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public static Class f5759;

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public static Method f5760;

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public static Method f5761;

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public static Method f5762;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public C1091 f5763;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public boolean f5764;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final C2426 f5765;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final C2730 f5766;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final C1091 f5767;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final C2253 f5768;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC2720 f5769;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public ViewOnAttachStateChangeListenerC2256 f5770;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C1093 f5771;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C2583 f5772;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final C2786 f5773;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C2796 f5774;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final ViewOnDragListenerC2263 f5775;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public InterfaceC5192 f5776;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C2313 f5777;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final View f5778;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC2230 f5779;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final RunnableC2732 f5780;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final RunnableC2536 f5781;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C2656 f5782;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C2437 f5783;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C2197 f5784;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC2230 f5785;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C2700 f5786;

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public final C2729 f5787;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final InterfaceC2649 f5788;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final InterfaceC7372 f5789;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final C2763 f5790;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public View f5791;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public boolean f5792;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public boolean f5793;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final InterfaceC8146 f5794;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final C8152 f5795;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final InterfaceC2825 f5796;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public C2736 f5797;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final InterfaceC2230 f5798;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public final InterfaceC2230 f5799;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public final RunnableC0909 f5800;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final RunnableC2732 f5801;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public float f5802;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public float f5803;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final C2743 f5804;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public boolean f5805;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final C2197 f5806;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final InterfaceC2230 f5807;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public C2848 f5808;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final AtomicReference f5809;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public InterfaceC7387 f5810;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public C2834 f5811;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public long f5812;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public MotionEvent f5813;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final C1091 f5814;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public final C0923 f5815;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final C2569 f5816;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final C2668 f5817;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C2593 f5818;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C8151 f5819;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public InterfaceC8162 f5820;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C5183 f5821;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC2704 f5822;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C2705 f5823;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f5824;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f5825;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC2230 f5826;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public boolean f5827;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final C2638 f5828;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final C2734 f5829;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final C2735 f5830;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public boolean f5831;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final C2242 f5832;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public long f5833;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final float[] f5834;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public long f5835;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public boolean f5836;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final float[] f5837;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final float[] f5838;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final C2578 f5839;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public boolean f5840;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final int[] f5841;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public long f5842;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public C2652 f5843;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public C8727 f5844;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final C2483 f5845;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public boolean f5846;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final C2197 f5847;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final C1171 f5848;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final C1589 f5849;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final InterfaceC2230 f5850;

    public ViewTreeObserverOnGlobalLayoutListenerC2719(Context context, C2738 c2738) {
        super(context);
        this.f5826 = AbstractC2202.m3034(c2738);
        this.f5824 = 9205357640488583168L;
        int i = 1;
        this.f5825 = true;
        this.f5818 = c2738.f5953;
        this.f5820 = C8164.f19892;
        this.f5821 = new C5183();
        this.f5780 = new RunnableC2732(this, 0);
        this.f5779 = AbstractC2202.m3035(AbstractC7176.m12463(context), C2188.f4264);
        this.f5777 = new C2313(this, this);
        this.f5776 = c2738.f5943.mo2894();
        new AndroidComposeView$dragAndDropManager$1(this);
        this.f5775 = new ViewOnDragListenerC2263();
        this.f5786 = new C2700();
        this.f5785 = AbstractC2202.m3034(Boolean.FALSE);
        this.f5784 = AbstractC2202.m3056(new InterfaceC7372() { // from class: androidx.compose.ui.platform.AndroidComposeView$derivedIsAttached$2
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final Boolean invoke() {
                Boolean bool = (Boolean) ((AbstractC2182) this.this$0.f5785).getValue();
                bool.booleanValue();
                return bool;
            }
        });
        this.f5783 = c2738.f5945;
        this.f5782 = c2738.f5952;
        this.f5781 = new RunnableC2536();
        C2583 c2583 = new C2583(3);
        c2583.m3831(C2556.f5338);
        c2583.m3835(getDensity());
        c2583.m3829(getViewConfiguration());
        c2583.m3830(new C2726(this).mo4426(((C2313) getFocusOwner()).f4533).mo4426(getDragAndDropManager().f4452));
        this.f5772 = c2583;
        C1093 c1093 = AbstractC1120.f1323;
        this.f5771 = new C1093();
        m4113getLayoutNodes();
        this.f5774 = new C2796(this);
        this.f5773 = new C2786(getRoot(), new C2772(), m4113getLayoutNodes());
        ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC2720 = new ViewOnAttachStateChangeListenerC2720(this);
        this.f5769 = viewOnAttachStateChangeListenerC2720;
        this.f5770 = new ViewOnAttachStateChangeListenerC2256(this, new AndroidComposeView$contentCaptureManager$1(this));
        this.f5766 = c2738.f5961;
        this.f5765 = new C2426(this);
        this.f5768 = new C2253();
        this.f5767 = new C1091();
        this.f5845 = new C2483();
        C2583 root = getRoot();
        C1589 c1589 = new C1589();
        c1589.f2500 = root;
        c1589.f2499 = new C2466(root.f5439.f5631);
        c1589.f2498 = new C0960(23);
        c1589.f2497 = new C2615();
        this.f5849 = c1589;
        this.f5850 = AbstractC2202.m3034(new Configuration(context.getResources().getConfiguration()));
        this.f5847 = AbstractC2202.m3056(new InterfaceC7372() { // from class: androidx.compose.ui.platform.AndroidComposeView$localeList$2
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final C8661 invoke() {
                LocaleList locales = this.this$0.getConfiguration().getLocales();
                C3011 c3011 = new C3011(new C3015(locales));
                if (locales.isEmpty()) {
                    c3011 = new C3011(new C3015(LocaleList.getDefault()));
                }
                C3015 c3015 = c3011.f6798;
                int size = c3015.f6800.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Locale locale = c3015.f6800.get(i2);
                    locale.getClass();
                    arrayList.add(new C8662(locale));
                }
                return new C8661(arrayList);
            }
        });
        this.f5848 = new C1171(this, getAutofillTree());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw AbstractC0900.m699("Autofill service could not be located.");
        }
        this.f5832 = new C2242(new C0960(autofillManager, 19), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.f5830 = c2738.f5959;
        this.f5829 = c2738.f5951;
        this.f5828 = new C2638(new AndroidComposeView$snapshotObserver$1(this));
        this.f5839 = new C2578(getRoot());
        this.f5842 = 9223372034707292159L;
        this.f5841 = new int[]{0, 0};
        float[] fArrM3467 = C2422.m3467();
        this.f5837 = fArrM3467;
        this.f5838 = C2422.m3467();
        this.f5834 = C2422.m3467();
        this.f5833 = -1L;
        this.f5835 = 9187343241974906880L;
        this.f5807 = AbstractC2202.m3034(null);
        this.f5806 = AbstractC2202.m3056(new InterfaceC7372() { // from class: androidx.compose.ui.platform.AndroidComposeView$viewTreeOwners$2
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final AbstractC2724 invoke() {
                this.this$0.get_viewTreeOwners();
                return null;
            }
        });
        this.f5809 = new AtomicReference(null);
        this.f5796 = c2738.f5950;
        this.f5799 = c2738.f5954;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = AbstractC2316.f4547;
        LayoutDirection layoutDirection2 = layoutDirection != 0 ? layoutDirection != 1 ? null : LayoutDirection.Rtl : LayoutDirection.Ltr;
        this.f5798 = AbstractC2202.m3034(layoutDirection2 == null ? LayoutDirection.Ltr : layoutDirection2);
        this.f5794 = c2738.f5955;
        this.f5795 = new C8152(isInTouchMode() ? 1 : 2);
        this.f5816 = new C2569(this);
        this.f5817 = new C2668(this);
        this.f5815 = new C0923(9);
        this.f5814 = new C1091();
        this.f5800 = new RunnableC0909(this, 4);
        this.f5801 = new RunnableC2732(this, i);
        this.f5804 = new C2743(context, new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidComposeView$indirectPointerNavigationGestureDetector$1
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* synthetic */ Object invoke(Object obj) {
                m3991invoke3ESFkO8(((C2299) obj).f4506);
                return C6008.f15084;
            }

            /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final void m3991invoke3ESFkO8(int i2) {
                ((C2313) this.this$0.getFocusOwner()).m3207(i2, false);
            }
        });
        this.f5789 = new InterfaceC7372() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3992invoke() {
                MotionEvent motionEvent = this.this$0.f5813;
                if (motionEvent != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 7 || actionMasked == 9) {
                        this.this$0.f5812 = SystemClock.uptimeMillis();
                        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = this.this$0;
                        viewTreeObserverOnGlobalLayoutListenerC2719.post(viewTreeObserverOnGlobalLayoutListenerC2719.f5800);
                    }
                }
            }

            @Override // p068.InterfaceC7372
            public /* bridge */ /* synthetic */ Object invoke() {
                m3992invoke();
                return C6008.f15084;
            }
        };
        int i2 = Build.VERSION.SDK_INT;
        this.f5788 = i2 < 29 ? new C2650(fArrM3467) : new C2755();
        addOnAttachStateChangeListener(this.f5770);
        setWillNotDraw(false);
        setFocusable(true);
        C2672.f5684.m4032(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        AbstractC3103.m4804(this, viewOnAttachStateChangeListenerC2720);
        setOnDragListener(getDragAndDropManager());
        getRoot().m3809(this);
        if (i2 >= 29) {
            C2665.f5667.m4023(this);
        }
        if (m4075()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(C0328R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.f5778 = view;
            addView(view, -1);
        }
        this.f5790 = i2 >= 31 ? new C2763() : null;
        this.f5787 = new C2729(this);
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.f5784.getValue()).booleanValue();
    }

    private final C2834 getLegacyTextInputServiceAndroid() {
        C2834 c2834 = this.f5811;
        if (c2834 != null) {
            return c2834;
        }
        C2834 c28342 = new C2834(getView(), this);
        this.f5811 = c28342;
        return c28342;
    }

    private final C2738 get_composeViewContext() {
        return (C2738) ((AbstractC2182) this.f5826).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC2724 get_viewTreeOwners() {
        AbstractC0900.m697(((AbstractC2182) this.f5807).getValue());
        return null;
    }

    private final void setAttached(boolean z) {
        ((AbstractC2182) this.f5785).setValue(Boolean.valueOf(z));
    }

    private void setDensity(InterfaceC8725 interfaceC8725) {
        ((AbstractC2182) this.f5779).setValue(interfaceC8725);
    }

    private void setFontFamilyResolver(InterfaceC2830 interfaceC2830) {
        this.f5799.setValue(interfaceC2830);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        ((AbstractC2182) this.f5798).setValue(layoutDirection);
    }

    private final void set_composeViewContext(C2738 c2738) {
        ((AbstractC2182) this.f5826).setValue(c2738);
    }

    private final void set_viewTreeOwners(AbstractC2724 abstractC2724) {
        ((AbstractC2182) this.f5807).setValue(abstractC2724);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m4073(ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iM1358;
        ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC2720 = viewTreeObserverOnGlobalLayoutListenerC2719.f5769;
        if (AbstractC5227.m9466(str, viewOnAttachStateChangeListenerC2720.f5857)) {
            int iM13582 = viewOnAttachStateChangeListenerC2720.f5855.m1358(i);
            if (iM13582 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM13582);
                return;
            }
            return;
        }
        if (!AbstractC5227.m9466(str, viewOnAttachStateChangeListenerC2720.f5856) || (iM1358 = viewOnAttachStateChangeListenerC2720.f5854.m1358(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iM1358);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m4074(C2583 c2583) {
        c2583.m3795();
        C2059 c2059M3799 = c2583.m3799();
        Object[] objArr = c2059M3799.f3866;
        int i = c2059M3799.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            m4074((C2583) objArr[i2]);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m4075() {
        return Build.VERSION.SDK_INT >= 35;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static boolean m4076(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !C2691.f5708.m4043(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m4077(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC2719) {
                ((ViewTreeObserverOnGlobalLayoutListenerC2719) childAt).m4101();
            } else if (childAt instanceof ViewGroup) {
                m4077((ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static long m4078(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode == 1073741824) {
            long j = size;
            return j | (j << 32);
        }
        C3466.m5901();
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static View m4079(View view, int i) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (AbstractC5227.m9466(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewM4079 = m4079(viewGroup.getChildAt(i2), i);
                    if (viewM4079 != null) {
                        return viewM4079;
                    }
                }
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        C2287 c2287 = ((C2313) getFocusOwner()).f4535;
        if (!c2287.f6624) {
            return;
        }
        if (!c2287.f6637.f6624) {
            AbstractC8765.m13982("visitSubtreeIf called on an unattached node");
        }
        C2059 c2059 = new C2059(0, new AbstractC2961[16]);
        AbstractC2961 abstractC2961 = c2287.f6637;
        AbstractC2961 abstractC29612 = abstractC2961.f6633;
        if (abstractC29612 == null) {
            AbstractC2620.m3902(c2059, abstractC2961);
        } else {
            c2059.m2607(abstractC29612);
        }
        while (true) {
            int i3 = c2059.f3865;
            if (i3 == 0) {
                return;
            }
            AbstractC2961 abstractC29613 = (AbstractC2961) c2059.m2613(i3 - 1);
            if ((abstractC29613.f6630 & 1024) != 0) {
                for (AbstractC2961 abstractC29614 = abstractC29613; abstractC29614 != null && abstractC29614.f6624; abstractC29614 = abstractC29614.f6633) {
                    if ((abstractC29614.f6636 & 1024) != 0) {
                        AbstractC2961 abstractC2961M3899 = abstractC29614;
                        C2059 c20592 = null;
                        while (abstractC2961M3899 != null) {
                            if (abstractC2961M3899 instanceof C2287) {
                                C2287 c22872 = (C2287) abstractC2961M3899;
                                if (c22872.f6624 && c22872.m3160().f4525) {
                                    super.addFocusables(arrayList, i, i2);
                                    C2287 c22873 = ((C2313) getFocusOwner()).f4535;
                                    if (c22873.f6624) {
                                        if (!c22873.f6637.f6624) {
                                            AbstractC8765.m13982("visitSubtreeIf called on an unattached node");
                                        }
                                        C2059 c20593 = new C2059(0, new AbstractC2961[16]);
                                        AbstractC2961 abstractC29615 = c22873.f6637;
                                        AbstractC2961 abstractC29616 = abstractC29615.f6633;
                                        if (abstractC29616 == null) {
                                            AbstractC2620.m3902(c20593, abstractC29615);
                                        } else {
                                            c20593.m2607(abstractC29616);
                                        }
                                        while (true) {
                                            int i4 = c20593.f3865;
                                            if (i4 == 0) {
                                                break;
                                            }
                                            AbstractC2961 abstractC29617 = (AbstractC2961) c20593.m2613(i4 - 1);
                                            if ((abstractC29617.f6630 & 1024) != 0) {
                                                for (AbstractC2961 abstractC29618 = abstractC29617; abstractC29618 != null && abstractC29618.f6624; abstractC29618 = abstractC29618.f6633) {
                                                    if ((abstractC29618.f6636 & 1024) != 0) {
                                                        AbstractC2961 abstractC2961M38992 = abstractC29618;
                                                        C2059 c20594 = null;
                                                        while (abstractC2961M38992 != null) {
                                                            if (abstractC2961M38992 instanceof C2287) {
                                                                C2287 c22874 = (C2287) abstractC2961M38992;
                                                                if (c22874.f6624) {
                                                                    C2312 c2312M3160 = c22874.m3160();
                                                                    if (c22874.f6624 && !c22874.f4492 && c2312M3160.f4525) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((abstractC2961M38992.f6636 & 1024) != 0 && (abstractC2961M38992 instanceof AbstractC2623)) {
                                                                int i5 = 0;
                                                                for (AbstractC2961 abstractC29619 = ((AbstractC2623) abstractC2961M38992).f5571; abstractC29619 != null; abstractC29619 = abstractC29619.f6633) {
                                                                    if ((abstractC29619.f6636 & 1024) != 0) {
                                                                        i5++;
                                                                        if (i5 == 1) {
                                                                            abstractC2961M38992 = abstractC29619;
                                                                        } else {
                                                                            if (c20594 == null) {
                                                                                c20594 = new C2059(0, new AbstractC2961[16]);
                                                                            }
                                                                            if (abstractC2961M38992 != null) {
                                                                                c20594.m2607(abstractC2961M38992);
                                                                                abstractC2961M38992 = null;
                                                                            }
                                                                            c20594.m2607(abstractC29619);
                                                                        }
                                                                    }
                                                                }
                                                                if (i5 == 1) {
                                                                }
                                                            }
                                                            abstractC2961M38992 = AbstractC2620.m3899(c20594);
                                                        }
                                                    }
                                                }
                                            }
                                            AbstractC2620.m3902(c20593, abstractC29617);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((abstractC2961M3899.f6636 & 1024) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                int i6 = 0;
                                for (AbstractC2961 abstractC296110 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC296110 != null; abstractC296110 = abstractC296110.f6633) {
                                    if ((abstractC296110.f6636 & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            abstractC2961M3899 = abstractC296110;
                                        } else {
                                            if (c20592 == null) {
                                                c20592 = new C2059(0, new AbstractC2961[16]);
                                            }
                                            if (abstractC2961M3899 != null) {
                                                c20592.m2607(abstractC2961M3899);
                                                abstractC2961M3899 = null;
                                            }
                                            c20592.m2607(abstractC296110);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            abstractC2961M3899 = AbstractC2620.m3899(c20592);
                        }
                    }
                }
            }
            AbstractC2620.m3902(c2059, abstractC29613);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        C2791 c2791M3814;
        InterfaceC7387 interfaceC7387;
        InterfaceC7387 interfaceC73872;
        C2242 c2242 = this.f5832;
        if (c2242 != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                InterfaceC2784 interfaceC2784 = (InterfaceC2784) c2242.f4413.f6108.m1393(iKeyAt);
                if (interfaceC2784 != null && (c2791M3814 = ((C2583) interfaceC2784).m3814()) != null) {
                    C2776 c2776 = (C2776) AbstractC2792.m4233(c2791M3814, AbstractC2794.f6152);
                    if (c2776 != null && (interfaceC73872 = (InterfaceC7387) c2776.f6051) != null) {
                    }
                    C2776 c27762 = (C2776) AbstractC2792.m4233(c2791M3814, AbstractC2794.f6151);
                    if (c27762 != null && (interfaceC7387 = (InterfaceC7387) c27762.f6051) != null) {
                    }
                }
            }
        }
        C1171 c1171 = this.f5848;
        if (c1171 != null) {
            C2253 c2253 = (C2253) c1171.f1441;
            if (c2253.f4426.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (c2253.f4426.get(Integer.valueOf(iKeyAt2)) != null) {
                        C3775.m6954();
                        return;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f5769.m4142(false, i, this.f5824);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f5769.m4142(true, i, this.f5824);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C1091 c1091 = this.f5767;
        if (!isAttachedToWindow()) {
            m4074(getRoot());
        }
        m4102(true);
        AbstractC2115.m2840().mo2769();
        this.f5764 = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            C2437 c2437 = this.f5783;
            C2430 c2430 = c2437.f5048;
            Canvas canvas2 = c2430.f5035;
            c2430.f5035 = canvas;
            getRoot().m3827(c2430, null);
            c2437.f5048.f5035 = canvas2;
            if (c1091.m1438()) {
                int i = c1091.f1349;
                for (int i2 = 0; i2 < i; i2++) {
                    ((C2746) ((InterfaceC2641) c1091.m1441(i2))).m4173();
                }
            }
            int i3 = AbstractC2680.f5697;
            c1091.m1339();
            this.f5764 = false;
            Trace.endSection();
            C1091 c10912 = this.f5763;
            if (c10912 != null) {
                c1091.m1334(c10912);
                c10912.m1339();
            }
            if (m4075()) {
                AbstractC2654.m4012(this, this.f5802);
                View view = this.f5778;
                if (view != null) {
                    AbstractC2654.m4012(view, this.f5803);
                    if (!Float.isNaN(this.f5803)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.f5802 = Float.NaN;
                this.f5803 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:321:0x04e6 A[PHI: r5
  0x04e6: PHI (r5v65 ??) = (r5v86 ??), (r5v87 ??), (r5v88 ??) binds: [B:302:0x04a7, B:304:0x04ab, B:319:0x04df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x06c3 A[PHI: r4
  0x06c3: PHI (r4v28 ??) = (r4v66 ??), (r4v67 ??), (r4v68 ??) binds: [B:437:0x0688, B:439:0x068c, B:454:0x06be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r3v41, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r4v50, types: [androidx.compose.ui.飘花落叶言子楪哲苏世兰] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69, types: [androidx.compose.runtime.collection.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r5v82 */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r6v46 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
        int i;
        String str;
        int i2;
        C0984 c0984;
        String str2;
        long jValueAt;
        C8151 c8151;
        long j;
        long j2;
        int i3;
        char c;
        int i4;
        long jFloatToRawIntBits;
        InterfaceC8149 interfaceC8149;
        C2646 c2646;
        boolean z;
        ?? r3;
        C2646 c26462;
        ?? M3899;
        InterfaceC8149 interfaceC81492;
        boolean z2;
        int size;
        int size2;
        C2646 c26463;
        boolean z3;
        ?? r4;
        C2646 c26464;
        ?? M38992;
        boolean z4;
        C2725 c2725;
        int size3;
        C2646 c26465;
        boolean z5;
        AbstractC2961 abstractC2961M3899;
        C2646 c26466;
        if (this.f5805) {
            RunnableC2732 runnableC2732 = this.f5801;
            removeCallbacks(runnableC2732);
            if (motionEvent.getActionMasked() == 8) {
                this.f5805 = false;
            } else {
                runnableC2732.run();
            }
        }
        if (m4076(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        String str3 = "visitAncestors called on an unattached node";
        int actionIndex = -1;
        int i5 = 1;
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (m4108(motionEvent) & 4) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            motionEvent.getAxisValue(26);
            getContext();
            viewConfiguration.getScaledVerticalScrollFactor();
            getContext();
            viewConfiguration.getScaledHorizontalScrollFactor();
            motionEvent.getEventTime();
            motionEvent.getDeviceId();
            InterfaceC2318 focusOwner = getFocusOwner();
            InterfaceC7372 interfaceC7372 = new InterfaceC7372() { // from class: androidx.compose.ui.platform.AndroidComposeView$handleRotaryEvent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p068.InterfaceC7372
                public final Boolean invoke() {
                    return Boolean.valueOf(super/*android.view.View*/.dispatchGenericMotionEvent(motionEvent));
                }
            };
            C2313 c2313 = (C2313) focusOwner;
            if (c2313.f4534.f4541) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            C2287 c2287M3167 = AbstractC2294.m3167(c2313.f4535);
            if (c2287M3167 != null) {
                if (!c2287M3167.f6637.f6624) {
                    AbstractC8765.m13982("visitAncestors called on an unattached node");
                }
                AbstractC2961 abstractC2961 = c2287M3167.f6637;
                C2583 c2583M3906 = AbstractC2620.m3906(c2287M3167);
                loop0: while (true) {
                    if (c2583M3906 == null) {
                        abstractC2961M3899 = null;
                        break;
                    }
                    if ((c2583M3906.f5439.f5628.f6630 & 16384) != 0) {
                        while (abstractC2961 != null) {
                            if ((abstractC2961.f6636 & 16384) != 0) {
                                abstractC2961M3899 = abstractC2961;
                                C2059 c2059 = null;
                                while (abstractC2961M3899 != null) {
                                    if (abstractC2961M3899 instanceof C2725) {
                                        break loop0;
                                    }
                                    if ((abstractC2961M3899.f6636 & 16384) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                        int i6 = 0;
                                        for (AbstractC2961 abstractC29612 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29612 != null; abstractC29612 = abstractC29612.f6633) {
                                            if ((abstractC29612.f6636 & 16384) != 0) {
                                                i6++;
                                                if (i6 == 1) {
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
                                        if (i6 == 1) {
                                        }
                                    }
                                    abstractC2961M3899 = AbstractC2620.m3899(c2059);
                                }
                            }
                            abstractC2961 = abstractC2961.f6629;
                        }
                    }
                    c2583M3906 = c2583M3906.m3816();
                    abstractC2961 = (c2583M3906 == null || (c26466 = c2583M3906.f5439) == null) ? null : c26466.f5629;
                }
                c2725 = (C2725) abstractC2961M3899;
            } else {
                c2725 = null;
            }
            if (c2725 != null) {
                C2725 c27252 = c2725;
                if (!c27252.f6637.f6624) {
                    AbstractC8765.m13982("visitAncestors called on an unattached node");
                }
                AbstractC2961 abstractC29613 = c27252.f6637.f6629;
                C2583 c2583M39062 = AbstractC2620.m3906(c2725);
                ArrayList arrayList = null;
                while (c2583M39062 != null) {
                    if ((c2583M39062.f5439.f5628.f6630 & 16384) != 0) {
                        while (abstractC29613 != null) {
                            if ((abstractC29613.f6636 & 16384) != 0) {
                                AbstractC2961 abstractC2961M38992 = abstractC29613;
                                C2059 c20592 = null;
                                while (abstractC2961M38992 != null) {
                                    if (abstractC2961M38992 instanceof C2725) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(abstractC2961M38992);
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z5 && (abstractC2961M38992.f6636 & 16384) != 0 && (abstractC2961M38992 instanceof AbstractC2623)) {
                                        int i7 = 0;
                                        for (AbstractC2961 abstractC29614 = ((AbstractC2623) abstractC2961M38992).f5571; abstractC29614 != null; abstractC29614 = abstractC29614.f6633) {
                                            if ((abstractC29614.f6636 & 16384) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    abstractC2961M38992 = abstractC29614;
                                                } else {
                                                    if (c20592 == null) {
                                                        c20592 = new C2059(0, new AbstractC2961[16]);
                                                    }
                                                    if (abstractC2961M38992 != null) {
                                                        c20592.m2607(abstractC2961M38992);
                                                        abstractC2961M38992 = null;
                                                    }
                                                    c20592.m2607(abstractC29614);
                                                }
                                            }
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    abstractC2961M38992 = AbstractC2620.m3899(c20592);
                                }
                            }
                            abstractC29613 = abstractC29613.f6629;
                        }
                    }
                    c2583M39062 = c2583M39062.m3816();
                    abstractC29613 = (c2583M39062 == null || (c26465 = c2583M39062.f5439) == null) ? null : c26465.f5629;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i8 = size3 - 1;
                        ((C2725) arrayList.get(size3)).getClass();
                        if (i8 < 0) {
                            break;
                        }
                        size3 = i8;
                    }
                }
                AbstractC2961 abstractC2961M38993 = c27252.f6637;
                C2059 c20593 = null;
                while (abstractC2961M38993 != null) {
                    if (abstractC2961M38993 instanceof C2725) {
                    } else if ((abstractC2961M38993.f6636 & 16384) != 0 && (abstractC2961M38993 instanceof AbstractC2623)) {
                        int i9 = 0;
                        for (AbstractC2961 abstractC29615 = ((AbstractC2623) abstractC2961M38993).f5571; abstractC29615 != null; abstractC29615 = abstractC29615.f6633) {
                            if ((abstractC29615.f6636 & 16384) != 0) {
                                i9++;
                                if (i9 == 1) {
                                    abstractC2961M38993 = abstractC29615;
                                } else {
                                    if (c20593 == null) {
                                        c20593 = new C2059(0, new AbstractC2961[16]);
                                    }
                                    if (abstractC2961M38993 != null) {
                                        c20593.m2607(abstractC2961M38993);
                                        abstractC2961M38993 = null;
                                    }
                                    c20593.m2607(abstractC29615);
                                }
                            }
                        }
                        if (i9 == 1) {
                        }
                    }
                    abstractC2961M38993 = AbstractC2620.m3899(c20593);
                }
                if (!((Boolean) interfaceC7372.invoke()).booleanValue()) {
                    AbstractC2961 abstractC2961M38994 = c27252.f6637;
                    C2059 c20594 = null;
                    while (abstractC2961M38994 != null) {
                        if (abstractC2961M38994 instanceof C2725) {
                        } else if ((abstractC2961M38994.f6636 & 16384) != 0 && (abstractC2961M38994 instanceof AbstractC2623)) {
                            int i10 = 0;
                            for (AbstractC2961 abstractC29616 = ((AbstractC2623) abstractC2961M38994).f5571; abstractC29616 != null; abstractC29616 = abstractC29616.f6633) {
                                if ((abstractC29616.f6636 & 16384) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        abstractC2961M38994 = abstractC29616;
                                    } else {
                                        if (c20594 == null) {
                                            c20594 = new C2059(0, new AbstractC2961[16]);
                                        }
                                        if (abstractC2961M38994 != null) {
                                            c20594.m2607(abstractC2961M38994);
                                            abstractC2961M38994 = null;
                                        }
                                        c20594.m2607(abstractC29616);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        abstractC2961M38994 = AbstractC2620.m3899(c20594);
                    }
                    if (arrayList != null) {
                        int size4 = arrayList.size();
                        for (int i11 = 0; i11 < size4; i11++) {
                            ((C2725) arrayList.get(i11)).getClass();
                        }
                    }
                }
            }
        }
        if (!motionEvent.isFromSource(2097152)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        C8151 c81512 = this.f5819;
        C2483 c2483 = this.f5845;
        C1110 c1110 = c2483.f5181;
        SparseLongArray sparseLongArray = c2483.f5184;
        int actionMasked = motionEvent.getActionMasked();
        c2483.m3604(motionEvent);
        if (actionMasked == 3) {
            sparseLongArray.clear();
            c2483.f5183.clear();
            str = "visitAncestors called on an unattached node";
            i = 16;
            c0984 = null;
        } else {
            c2483.m3605(motionEvent);
            if (actionMasked == 1) {
                actionIndex = 0;
            } else if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
            boolean z6 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
            i = 16;
            int pointerCount = motionEvent.getPointerCount();
            ArrayList arrayList2 = new ArrayList(pointerCount);
            int i12 = 0;
            while (i12 < pointerCount) {
                int pointerId = motionEvent.getPointerId(i12);
                int i13 = i5;
                int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
                if (iIndexOfKey >= 0) {
                    str2 = str3;
                    jValueAt = sparseLongArray.valueAt(iIndexOfKey);
                    c8151 = c81512;
                } else {
                    str2 = str3;
                    jValueAt = c2483.f5185;
                    c8151 = c81512;
                    c2483.f5185 = jValueAt + 1;
                    sparseLongArray.put(pointerId, jValueAt);
                }
                C2483 c24832 = c2483;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getX(i12))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY(i12))) & 4294967295L);
                ?? r32 = i12 != actionIndex ? i13 : 0;
                C2464 c2464 = (C2464) c1110.m1386(jValueAt);
                if (i12 == actionIndex) {
                    c1110.m1382(jValueAt);
                    j = jValueAt;
                    j2 = 2147483647L;
                    c = ' ';
                    i3 = Opcodes.MAX_VALUE;
                } else {
                    if (z6) {
                        j2 = 2147483647L;
                        i3 = Opcodes.MAX_VALUE;
                        j = jValueAt;
                        c1110.m1383(new C2464(1 | ((motionEvent.getEventTime() & 2147483647L) << i13) | (((long) ((((short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L))) & 65535) | (((short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32))) << 16))) << 32)), j);
                    } else {
                        j = jValueAt;
                        j2 = 2147483647L;
                        i3 = Opcodes.MAX_VALUE;
                    }
                    c = ' ';
                }
                long eventTime = motionEvent.getEventTime();
                long j3 = j2;
                float pressure = motionEvent.getPressure(i12);
                int i14 = i3;
                int i15 = actionIndex;
                long eventTime2 = c2464 != null ? (c2464.f5107 >> i13) & j3 : motionEvent.getEventTime();
                if (c2464 != null) {
                    i4 = i15;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits((short) (r5 & i14))) & 4294967295L) | (((long) Float.floatToRawIntBits((short) (((int) (c2464.f5107 >>> c)) >>> 16))) << c);
                } else {
                    i4 = i15;
                    jFloatToRawIntBits = jFloatToRawIntBits2;
                }
                arrayList2.add(new C8150(j, eventTime, jFloatToRawIntBits2, r32, pressure, eventTime2, jFloatToRawIntBits, c2464 != null ? (c2464.f5107 & 1) != 0 ? i13 : 0 : 0));
                i12++;
                c2483 = c24832;
                i5 = i13;
                str3 = str2;
                c81512 = c8151;
                actionIndex = i4;
            }
            C8151 c81513 = c81512;
            str = str3;
            int i16 = i5;
            c2483.m3601(motionEvent);
            if (c81513 != null) {
                i2 = c81513.f19869;
            } else {
                if (!motionEvent.isFromSource(2097152)) {
                    C6755.m11869("MotionEvent must be a touch navigation source");
                    return false;
                }
                InputDevice device = motionEvent.getDevice();
                if (device != null) {
                    InputDevice.MotionRange motionRange = device.getMotionRange(0);
                    InputDevice.MotionRange motionRange2 = device.getMotionRange(i16);
                    if (motionRange == null || motionRange2 != null) {
                        if (motionRange2 == null || motionRange != null) {
                            if (motionRange != null && motionRange2 != null) {
                                float range = motionRange.getRange();
                                float range2 = motionRange2.getRange();
                                if (range <= range2 || (range2 != 0.0f && range / range2 < 5.0f)) {
                                    if (range2 <= range || (range != 0.0f && range2 / range < 5.0f)) {
                                    }
                                }
                                i2 = 1;
                            }
                            i2 = 0;
                        }
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                } else {
                    i2 = 0;
                }
            }
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 2 || actionMasked != 5) {
            }
            c0984 = new C0984(arrayList2, i2, motionEvent);
        }
        C2743 c2743 = this.f5804;
        if (c0984 == null) {
            C2287 c2287M3203 = ((C2313) getFocusOwner()).m3203();
            if (c2287M3203 != null) {
                if (!c2287M3203.f6637.f6624) {
                    AbstractC8765.m13982(str);
                }
                AbstractC2961 abstractC29617 = c2287M3203.f6637;
                C2583 c2583M39063 = AbstractC2620.m3906(c2287M3203);
                loop26: while (true) {
                    if (c2583M39063 == null) {
                        r3 = 0;
                        break;
                    }
                    int i17 = 2097152;
                    if ((c2583M39063.f5439.f5628.f6630 & 2097152) != 0) {
                        while (abstractC29617 != null) {
                            if ((abstractC29617.f6636 & i17) != 0) {
                                r3 = abstractC29617;
                                ?? r42 = 0;
                                while (r3 != 0) {
                                    if (r3 instanceof InterfaceC8149) {
                                        break loop26;
                                    }
                                    ?? c20595 = r42;
                                    if ((r3.f6636 & i17) != 0) {
                                        c20595 = r42;
                                        if (r3 instanceof AbstractC2623) {
                                            AbstractC2961 abstractC29618 = ((AbstractC2623) r3).f5571;
                                            int i18 = 0;
                                            M3899 = r3;
                                            c20595 = r42;
                                            while (abstractC29618 != null) {
                                                if ((abstractC29618.f6636 & i17) != 0) {
                                                    i18++;
                                                    c20595 = c20595;
                                                    if (i18 == 1) {
                                                        M3899 = abstractC29618;
                                                    } else {
                                                        if (c20595 == 0) {
                                                            c20595 = new C2059(0, new AbstractC2961[16]);
                                                        }
                                                        if (M3899 != 0) {
                                                            c20595.m2607(M3899);
                                                            M3899 = 0;
                                                        }
                                                        c20595.m2607(abstractC29618);
                                                    }
                                                }
                                                abstractC29618 = abstractC29618.f6633;
                                                i17 = 2097152;
                                                M3899 = M3899;
                                                c20595 = c20595;
                                            }
                                            c20595 = c20595;
                                            if (i18 != 1) {
                                                M3899 = AbstractC2620.m3899(c20595);
                                            }
                                        }
                                    }
                                    i17 = 2097152;
                                    r3 = M3899;
                                    r42 = c20595;
                                }
                            }
                            abstractC29617 = abstractC29617.f6629;
                            i17 = 2097152;
                        }
                    }
                    c2583M39063 = c2583M39063.m3816();
                    abstractC29617 = (c2583M39063 == null || (c26462 = c2583M39063.f5439) == null) ? null : c26462.f5629;
                }
                interfaceC8149 = (InterfaceC8149) r3;
            } else {
                interfaceC8149 = null;
            }
            if (interfaceC8149 != null) {
                AbstractC2961 abstractC29619 = (AbstractC2961) interfaceC8149;
                if (!abstractC29619.f6637.f6624) {
                    AbstractC8765.m13982(str);
                }
                AbstractC2961 abstractC296110 = abstractC29619.f6637.f6629;
                C2583 c2583M39064 = AbstractC2620.m3906(interfaceC8149);
                ArrayList arrayList3 = null;
                while (c2583M39064 != null) {
                    int i19 = 2097152;
                    if ((c2583M39064.f5439.f5628.f6630 & 2097152) != 0) {
                        while (abstractC296110 != null) {
                            if ((abstractC296110.f6636 & i19) != 0) {
                                AbstractC2961 abstractC2961M38995 = abstractC296110;
                                C2059 c20596 = null;
                                while (abstractC2961M38995 != null) {
                                    if (abstractC2961M38995 instanceof InterfaceC8149) {
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(abstractC2961M38995);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z) {
                                        if ((abstractC2961M38995.f6636 & 2097152) != 0 && (abstractC2961M38995 instanceof AbstractC2623)) {
                                            int i20 = 0;
                                            for (AbstractC2961 abstractC296111 = ((AbstractC2623) abstractC2961M38995).f5571; abstractC296111 != null; abstractC296111 = abstractC296111.f6633) {
                                                if ((abstractC296111.f6636 & 2097152) != 0) {
                                                    i20++;
                                                    if (i20 == 1) {
                                                        abstractC2961M38995 = abstractC296111;
                                                    } else {
                                                        if (c20596 == null) {
                                                            c20596 = new C2059(0, new AbstractC2961[16]);
                                                        }
                                                        if (abstractC2961M38995 != null) {
                                                            c20596.m2607(abstractC2961M38995);
                                                            abstractC2961M38995 = null;
                                                        }
                                                        c20596.m2607(abstractC296111);
                                                    }
                                                }
                                            }
                                            if (i20 == 1) {
                                            }
                                        }
                                    }
                                    abstractC2961M38995 = AbstractC2620.m3899(c20596);
                                }
                            }
                            i19 = 2097152;
                            abstractC296110 = abstractC296110.f6629;
                        }
                    }
                    c2583M39064 = c2583M39064.m3816();
                    abstractC296110 = (c2583M39064 == null || (c2646 = c2583M39064.f5439) == null) ? null : c2646.f5629;
                }
                interfaceC8149.mo1794();
                if (arrayList3 != null) {
                    int size5 = arrayList3.size();
                    for (int i21 = 0; i21 < size5; i21++) {
                        ((InterfaceC8149) arrayList3.get(i21)).mo1794();
                    }
                }
            }
            c2743.f5970 = 0;
            c2743.f5971 = true;
            return true;
        }
        C2313 c23132 = (C2313) getFocusOwner();
        if (c23132.f4534.f4541) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
        } else {
            C2287 c2287M32032 = c23132.m3203();
            if (c2287M32032 != null) {
                if (!c2287M32032.f6637.f6624) {
                    AbstractC8765.m13982(str);
                }
                AbstractC2961 abstractC296112 = c2287M32032.f6637;
                C2583 c2583M39065 = AbstractC2620.m3906(c2287M32032);
                loop14: while (true) {
                    if (c2583M39065 == null) {
                        r4 = 0;
                        break;
                    }
                    int i22 = 2097152;
                    if ((c2583M39065.f5439.f5628.f6630 & 2097152) != 0) {
                        while (abstractC296112 != null) {
                            if ((abstractC296112.f6636 & i22) != 0) {
                                r4 = abstractC296112;
                                ?? r5 = 0;
                                while (r4 != 0) {
                                    if (r4 instanceof InterfaceC8149) {
                                        break loop14;
                                    }
                                    ?? c20597 = r5;
                                    if ((r4.f6636 & i22) != 0) {
                                        c20597 = r5;
                                        if (r4 instanceof AbstractC2623) {
                                            AbstractC2961 abstractC296113 = ((AbstractC2623) r4).f5571;
                                            int i23 = 0;
                                            M38992 = r4;
                                            c20597 = r5;
                                            while (abstractC296113 != null) {
                                                if ((abstractC296113.f6636 & i22) != 0) {
                                                    i23++;
                                                    c20597 = c20597;
                                                    if (i23 == 1) {
                                                        M38992 = abstractC296113;
                                                    } else {
                                                        if (c20597 == 0) {
                                                            c20597 = new C2059(0, new AbstractC2961[i]);
                                                        }
                                                        if (M38992 != 0) {
                                                            c20597.m2607(M38992);
                                                            M38992 = 0;
                                                        }
                                                        c20597.m2607(abstractC296113);
                                                    }
                                                }
                                                abstractC296113 = abstractC296113.f6633;
                                                i = 16;
                                                i22 = 2097152;
                                                M38992 = M38992;
                                                c20597 = c20597;
                                            }
                                            c20597 = c20597;
                                            if (i23 != 1) {
                                                M38992 = AbstractC2620.m3899(c20597);
                                            }
                                        }
                                    }
                                    i = 16;
                                    i22 = 2097152;
                                    r4 = M38992;
                                    r5 = c20597;
                                }
                            }
                            abstractC296112 = abstractC296112.f6629;
                            i = 16;
                            i22 = 2097152;
                        }
                    }
                    c2583M39065 = c2583M39065.m3816();
                    abstractC296112 = (c2583M39065 == null || (c26464 = c2583M39065.f5439) == null) ? null : c26464.f5629;
                    i = 16;
                }
                interfaceC81492 = (InterfaceC8149) r4;
            } else {
                interfaceC81492 = null;
            }
            if (interfaceC81492 != null) {
                AbstractC2961 abstractC296114 = (AbstractC2961) interfaceC81492;
                if (!abstractC296114.f6637.f6624) {
                    AbstractC8765.m13982(str);
                }
                AbstractC2961 abstractC296115 = abstractC296114.f6637.f6629;
                C2583 c2583M39066 = AbstractC2620.m3906(interfaceC81492);
                ArrayList arrayList4 = null;
                while (c2583M39066 != null) {
                    int i24 = 2097152;
                    if ((c2583M39066.f5439.f5628.f6630 & 2097152) != 0) {
                        while (abstractC296115 != null) {
                            if ((abstractC296115.f6636 & i24) != 0) {
                                AbstractC2961 abstractC2961M38996 = abstractC296115;
                                C2059 c20598 = null;
                                while (abstractC2961M38996 != null) {
                                    if (abstractC2961M38996 instanceof InterfaceC8149) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(abstractC2961M38996);
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (z3) {
                                        int i25 = 2097152;
                                        if ((abstractC2961M38996.f6636 & 2097152) != 0 && (abstractC2961M38996 instanceof AbstractC2623)) {
                                            AbstractC2961 abstractC296116 = ((AbstractC2623) abstractC2961M38996).f5571;
                                            int i26 = 0;
                                            while (abstractC296116 != null) {
                                                if ((abstractC296116.f6636 & i25) != 0) {
                                                    i26++;
                                                    if (i26 == 1) {
                                                        abstractC2961M38996 = abstractC296116;
                                                    } else {
                                                        if (c20598 == null) {
                                                            c20598 = new C2059(0, new AbstractC2961[16]);
                                                        }
                                                        if (abstractC2961M38996 != null) {
                                                            c20598.m2607(abstractC2961M38996);
                                                            abstractC2961M38996 = null;
                                                        }
                                                        c20598.m2607(abstractC296116);
                                                    }
                                                }
                                                abstractC296116 = abstractC296116.f6633;
                                                i25 = 2097152;
                                            }
                                            if (i26 == 1) {
                                            }
                                        }
                                    }
                                    abstractC2961M38996 = AbstractC2620.m3899(c20598);
                                }
                            }
                            abstractC296115 = abstractC296115.f6629;
                            i24 = 2097152;
                        }
                    }
                    c2583M39066 = c2583M39066.m3816();
                    abstractC296115 = (c2583M39066 == null || (c26463 = c2583M39066.f5439) == null) ? null : c26463.f5629;
                }
                if (arrayList4 != null && arrayList4.size() - 1 >= 0) {
                    while (true) {
                        int i27 = size2 - 1;
                        ((InterfaceC8149) arrayList4.get(size2)).mo1781(c0984, PointerEventPass.Initial);
                        if (i27 < 0) {
                            break;
                        }
                        size2 = i27;
                    }
                }
                interfaceC81492.mo1781(c0984, PointerEventPass.Initial);
                interfaceC81492.mo1781(c0984, PointerEventPass.Main);
                if (arrayList4 != null) {
                    int size6 = arrayList4.size();
                    for (int i28 = 0; i28 < size6; i28++) {
                        ((InterfaceC8149) arrayList4.get(i28)).mo1781(c0984, PointerEventPass.Main);
                    }
                }
                if (arrayList4 != null && arrayList4.size() - 1 >= 0) {
                    while (true) {
                        int i29 = size - 1;
                        ((InterfaceC8149) arrayList4.get(size)).mo1781(c0984, PointerEventPass.Final);
                        if (i29 < 0) {
                            break;
                        }
                        size = i29;
                    }
                }
                interfaceC81492.mo1781(c0984, PointerEventPass.Final);
            }
            ArrayList arrayList5 = (ArrayList) c0984.f940;
            int size7 = arrayList5.size();
            for (int i30 = 0; i30 < size7; i30++) {
                if (((C8150) arrayList5.get(i30)).f19868) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        c2743.getClass();
        MotionEvent motionEvent2 = (MotionEvent) c0984.f939;
        int action = motionEvent2.getAction();
        if (action != 0) {
            z4 = true;
            if ((action == 1 || action == 2) && z2) {
                c2743.f5970 = 0;
                c2743.f5971 = true;
            }
        } else {
            z4 = true;
            c2743.f5970 = c0984.f941;
            c2743.f5971 = false;
        }
        ((GestureDetector) c2743.f5968).onTouchEvent(motionEvent2);
        return z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0157  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean z = this.f5805;
        RunnableC2732 runnableC2732 = this.f5801;
        if (z) {
            removeCallbacks(runnableC2732);
            runnableC2732.run();
        }
        if (!m4076(motionEvent) && isAttachedToWindow()) {
            ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC2720 = this.f5769;
            ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = viewOnAttachStateChangeListenerC2720.f5877;
            AccessibilityManager accessibilityManager = viewOnAttachStateChangeListenerC2720.f5881;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    viewTreeObserverOnGlobalLayoutListenerC2719.m4102(true);
                    C2615 c2615 = new C2615();
                    C2583 root = viewTreeObserverOnGlobalLayoutListenerC2719.getRoot();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
                    C2586 c2586 = C2583.f5434;
                    C2646 c2646 = root.f5439;
                    AbstractC2629 abstractC2629 = c2646.f5630;
                    InterfaceC7387 interfaceC7387 = AbstractC2629.f5584;
                    c2646.f5630.m3952(AbstractC2629.f5586, abstractC2629.m3961(jFloatToRawIntBits), c2615, 1, true);
                    C1091 c1091 = c2615.f5566;
                    for (int i2 = c1091.f1349 - 1; -1 < i2; i2--) {
                        Object objM1441 = c1091.m1441(i2);
                        objM1441.getClass();
                        C2583 c2583M3906 = AbstractC2620.m3906((AbstractC2961) objM1441);
                        if (viewTreeObserverOnGlobalLayoutListenerC2719.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(c2583M3906) != null) {
                            break;
                        }
                        if (c2583M3906.f5439.m3988(8)) {
                            int iM4130 = viewOnAttachStateChangeListenerC2720.m4130(c2583M3906.f5468);
                            C2788 c2788M4238 = AbstractC2792.m4238(c2583M3906, false);
                            if (AbstractC2792.m4239(c2788M4238)) {
                                if (!c2788M4238.m4227().f6124.m1312(AbstractC2778.f6064)) {
                                    i = iM4130;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i = Integer.MIN_VALUE;
                    viewTreeObserverOnGlobalLayoutListenerC2719.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i3 = viewOnAttachStateChangeListenerC2720.f5876;
                    if (i3 != i) {
                        viewOnAttachStateChangeListenerC2720.f5876 = i;
                        ViewOnAttachStateChangeListenerC2720.m4121(viewOnAttachStateChangeListenerC2720, i, 128, null, 12);
                        ViewOnAttachStateChangeListenerC2720.m4121(viewOnAttachStateChangeListenerC2720, i3, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i4 = viewOnAttachStateChangeListenerC2720.f5876;
                    if (i4 == Integer.MIN_VALUE) {
                        viewTreeObserverOnGlobalLayoutListenerC2719.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    } else if (i4 != Integer.MIN_VALUE) {
                        viewOnAttachStateChangeListenerC2720.f5876 = Integer.MIN_VALUE;
                        ViewOnAttachStateChangeListenerC2720.m4121(viewOnAttachStateChangeListenerC2720, Integer.MIN_VALUE, 128, null, 12);
                        ViewOnAttachStateChangeListenerC2720.m4121(viewOnAttachStateChangeListenerC2720, i4, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && m4105(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.f5813;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.f5813 = MotionEvent.obtainNoHistory(motionEvent);
                        this.f5805 = true;
                        postDelayed(runnableC2732, 8L);
                        return false;
                    }
                } else if ((m4108(motionEvent) & 1) != 0) {
                    return true;
                }
            } else if (m4106(motionEvent)) {
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((C2313) getFocusOwner()).m3199(keyEvent, new InterfaceC7372() { // from class: androidx.compose.ui.platform.AndroidComposeView$dispatchKeyEvent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p068.InterfaceC7372
                public final Boolean invoke() {
                    return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent(keyEvent));
                }
            });
        }
        C2700 c2700 = getComposeViewContext().f5946;
        int metaState = keyEvent.getMetaState();
        c2700.getClass();
        ((AbstractC2182) AbstractC2684.f5699).setValue(new C2472(metaState));
        return ((C2313) getFocusOwner()).m3199(keyEvent, new InterfaceC7372() { // from class: androidx.compose.ui.focus.FocusOwner$dispatchKeyEvent$1
            @Override // p068.InterfaceC7372
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        }) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C2646 c2646;
        if (isFocused()) {
            C2313 c2313 = (C2313) getFocusOwner();
            if (c2313.f4534.f4541) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                C2287 c2287M3167 = AbstractC2294.m3167(c2313.f4535);
                if (c2287M3167 != null) {
                    if (!c2287M3167.f6637.f6624) {
                        AbstractC8765.m13982("visitAncestors called on an unattached node");
                    }
                    AbstractC2961 abstractC2961 = c2287M3167.f6637;
                    C2583 c2583M3906 = AbstractC2620.m3906(c2287M3167);
                    while (c2583M3906 != null) {
                        if ((c2583M3906.f5439.f5628.f6630 & 131072) != 0) {
                            while (abstractC2961 != null) {
                                if ((abstractC2961.f6636 & 131072) != 0) {
                                    AbstractC2961 abstractC2961M3899 = abstractC2961;
                                    C2059 c2059 = null;
                                    while (abstractC2961M3899 != null) {
                                        if ((abstractC2961M3899.f6636 & 131072) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                            int i = 0;
                                            for (AbstractC2961 abstractC29612 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29612 != null; abstractC29612 = abstractC29612.f6633) {
                                                if ((abstractC29612.f6636 & 131072) != 0) {
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
                                }
                                abstractC2961 = abstractC2961.f6629;
                            }
                        }
                        c2583M3906 = c2583M3906.m3816();
                        abstractC2961 = (c2583M3906 == null || (c2646 = c2583M3906.f5439) == null) ? null : c2646.f5629;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            C2666.f5668.m4024(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object c2653;
        C2287 c2287M3203;
        if (this.f5805) {
            RunnableC2732 runnableC2732 = this.f5801;
            removeCallbacks(runnableC2732);
            MotionEvent motionEvent2 = this.f5813;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f5805 = false;
            } else {
                runnableC2732.run();
            }
        }
        if (!m4076(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || m4106(motionEvent))) {
            int iM4108 = m4108(motionEvent);
            if ((iM4108 & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(DexMap.TYPE_STRING_DATA_ITEM) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (c2653 = view.getTag(C0328R.id.auto_clear_focus_behavior_tag)) == null) {
                    c2653 = new C2653(1);
                }
                if (c2653.equals(new C2653(1)) && (c2287M3203 = ((C2313) getFocusOwner()).m3203()) != null) {
                    AbstractC2629 abstractC2629M3909 = AbstractC2620.m3909(c2287M3203);
                    if (!AbstractC2505.m3673(abstractC2629M3909).mo3649(abstractC2629M3909, true).m13080((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        InterfaceC2320.m3215(getFocusOwner());
                    }
                }
            }
            if ((iM4108 & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return m4079(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        C8157 c8157M3213;
        if (view == null || this.f5839.f5395) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || !AbstractC2671.m4031(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            C2287 c2287M3167 = AbstractC2294.m3167(((C2313) getFocusOwner()).f4535);
            c8157M3213 = c2287M3167 != null ? AbstractC2294.m3189(c2287M3167) : null;
            if (c8157M3213 == null) {
                c8157M3213 = AbstractC2316.m3213(view, this);
            }
        } else {
            c8157M3213 = AbstractC2316.m3213(view, this);
        }
        C2299 c2299M3210 = AbstractC2316.m3210(i);
        int i2 = c2299M3210 != null ? c2299M3210.f4506 : 6;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (((C2313) getFocusOwner()).m3204(i2, c8157M3213, new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidComposeView$focusSearch$searchResult$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p068.InterfaceC7387
            public final Boolean invoke(C2287 c2287) {
                ref$ObjectRef.element = c2287;
                return Boolean.TRUE;
            }
        }) == null) {
            return view;
        }
        T t = ref$ObjectRef.element;
        if (t == 0) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || AbstractC2294.m3183(AbstractC2294.m3189((C2287) t), AbstractC2316.m3213(viewFindNextFocus, this), c8157M3213, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public final C2652 getAndroidViewsHandler$ui() {
        if (this.f5843 == null) {
            C2652 c2652 = new C2652(getContext());
            this.f5843 = c2652;
            addView(c2652, -1);
            requestLayout();
        }
        C2652 c26522 = this.f5843;
        c26522.getClass();
        return c26522;
    }

    public InterfaceC2238 getAutofill() {
        return this.f5848;
    }

    public AbstractC2252 getAutofillManager() {
        return this.f5832;
    }

    public C2253 getAutofillTree() {
        return this.f5768;
    }

    public final C2738 getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.f5793;
    }

    public final Configuration getConfiguration() {
        return (Configuration) ((AbstractC2182) this.f5850).getValue();
    }

    public final ViewOnAttachStateChangeListenerC2256 getContentCaptureManager$ui() {
        return this.f5770;
    }

    public InterfaceC5192 getCoroutineContext() {
        return this.f5776;
    }

    public InterfaceC8725 getDensity() {
        return (InterfaceC8725) ((AbstractC2182) this.f5779).getValue();
    }

    public C8157 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            C2287 c2287M3167 = AbstractC2294.m3167(((C2313) getFocusOwner()).f4535);
            if (c2287M3167 != null) {
                return AbstractC2294.m3189(c2287M3167);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return AbstractC2316.m3213(viewFindFocus, this);
        }
        return null;
    }

    public InterfaceC2318 getFocusOwner() {
        return this.f5777;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C8157 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f19885);
            rect.top = Math.round(embeddedViewFocusRect.f19884);
            rect.right = Math.round(embeddedViewFocusRect.f19883);
            rect.bottom = Math.round(embeddedViewFocusRect.f19882);
            return;
        }
        if (AbstractC5227.m9466(((C2313) getFocusOwner()).m3204(6, null, new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidComposeView$getFocusedRect$1
            @Override // p068.InterfaceC7387
            public final Boolean invoke(C2287 c2287) {
                return Boolean.TRUE;
            }
        }), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public InterfaceC2830 getFontFamilyResolver() {
        return (InterfaceC2830) this.f5799.getValue();
    }

    public InterfaceC2825 getFontLoader() {
        return this.f5796;
    }

    public final InterfaceC2704 getFrameEndScheduler$ui() {
        return this.f5822;
    }

    public InterfaceC2418 getGraphicsContext() {
        return this.f5765;
    }

    public InterfaceC8146 getHapticFeedBack() {
        return this.f5794;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f5839.f5396.m3889() || !this.f5821.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public InterfaceC8153 getInputModeManager() {
        return this.f5795;
    }

    public final RunnableC2536 getInsetsListener() {
        return this.f5781;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.f5833;
    }

    @Override // android.view.View, android.view.ViewParent
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) ((AbstractC2182) this.f5798).getValue();
    }

    public C8661 getLocaleList() {
        return (C8661) this.f5847.getValue();
    }

    public long getMeasureIteration() {
        C2578 c2578 = this.f5839;
        if (!c2578.f5395) {
            AbstractC8765.m13984("measureIteration should be only used during the measure/layout pass");
        }
        return c2578.f5399;
    }

    public C2569 getModifierLocalManager() {
        return this.f5816;
    }

    public ViewTreeObserverOnGlobalLayoutListenerC2719 getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public AbstractC2543 getPlacementScope() {
        InterfaceC7387 interfaceC7387 = AbstractC2560.f5346;
        return new C2499(this, 1);
    }

    public InterfaceC2480 getPointerIconService() {
        return this.f5787;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final C8151 m4080getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.f5819;
    }

    public C2796 getRectManager() {
        return this.f5774;
    }

    public InterfaceC8162 getRetainedValuesStore() {
        return this.f5820;
    }

    public C2583 getRoot() {
        return this.f5772;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        C2763 c2763;
        if (Build.VERSION.SDK_INT < 31 || (c2763 = this.f5790) == null) {
            return false;
        }
        return ((Boolean) ((AbstractC2182) c2763.f6023).getValue()).booleanValue();
    }

    public C2786 getSemanticsOwner() {
        return this.f5773;
    }

    public C2593 getSharedDrawScope() {
        return this.f5818;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? C2651.f5640.m4011(this) : this.f5827;
    }

    public C2638 getSnapshotObserver() {
        return this.f5828;
    }

    public InterfaceC2706 getSoftwareKeyboardController() {
        C2736 c2736 = this.f5797;
        if (c2736 != null) {
            return c2736;
        }
        C2736 c27362 = new C2736(getTextInputService());
        this.f5797 = c27362;
        return c27362;
    }

    public C2848 getTextInputService() {
        C2848 c2848 = this.f5808;
        if (c2848 != null) {
            return c2848;
        }
        C2848 c28482 = new C2848((InterfaceC2854) AbstractC2671.f5683.invoke(getLegacyTextInputServiceAndroid()));
        this.f5808 = c28482;
        return c28482;
    }

    public InterfaceC2709 getTextToolbar() {
        return this.f5817;
    }

    public final InterfaceC2633 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public InterfaceC2698 getViewConfiguration() {
        return this.f5782;
    }

    public final AbstractC2724 getViewTreeOwners() {
        AbstractC0900.m697(this.f5806.getValue());
        return null;
    }

    public InterfaceC2683 getWindowInfo() {
        return getComposeViewContext().f5946;
    }

    public final C2242 get_autofillManager$ui() {
        return this.f5832;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC8162 interfaceC8162;
        Object obj;
        super.onAttachedToWindow();
        setAttached(true);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(AbstractC2751.m4190());
        }
        this.f5781.onViewAttachedToWindow(this);
        int i2 = 0;
        if (i > 28) {
            if (f5758 == null) {
                RunnableC2733 runnableC2733 = new RunnableC2733(i2);
                f5758 = runnableC2733;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (f5759 == null) {
                        f5759 = Class.forName("android.os.SystemProperties");
                    }
                    if (f5760 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = f5759;
                        f5760 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = f5760;
                    if (method != null) {
                        method.invoke(null, runnableC2733);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            C1091 c1091 = f5757;
            synchronized (c1091) {
                c1091.m1335(this);
            }
        }
        if (!this.f5793) {
            getComposeViewContext().m4160();
        }
        this.f5793 = false;
        m4104(getRoot());
        m4074(getRoot());
        getSnapshotObserver().f5619.m2805();
        C1171 c1171 = this.f5848;
        if (c1171 != null) {
            C2248 c2248 = C2248.f4422;
            c2248.getClass();
            ((AutofillManager) c1171.f1439).registerCallback(c2248);
        }
        InterfaceC3221 interfaceC3221 = getComposeViewContext().f5942;
        InterfaceC3254 interfaceC3254 = getComposeViewContext().f5940;
        InterfaceC2704 interfaceC2704 = this.f5822;
        if (interfaceC3221 == null || interfaceC3254 == null || interfaceC2704 == null) {
            interfaceC8162 = null;
        } else {
            C3256 viewModelStore = interfaceC3254.getViewModelStore();
            C3259 c3259 = new C3259();
            C8466 c8466 = C8466.f21070;
            viewModelStore.getClass();
            c8466.getClass();
            C1171 c11712 = new C1171(viewModelStore, c3259, c8466);
            InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C2702.class);
            String strMo9444 = interfaceC5925Mo9476.mo9444();
            if (strMo9444 == null) {
                C6755.m11869("Local and anonymous classes can not be ViewModels");
                return;
            }
            C2702 c2702 = (C2702) c11712.m1519("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strMo9444), interfaceC5925Mo9476);
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            C1093 c1093 = c2702.f5714;
            Object objM1393 = c1093.m1393(id);
            if (objM1393 == null) {
                objM1393 = new C1091(1);
                c1093.m1350(id, objM1393);
            }
            C1091 c10912 = (C1091) objM1393;
            Object[] objArr = c10912.f1350;
            int i3 = c10912.f1349;
            while (true) {
                if (i2 >= i3) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (!((C2705) obj).f5720) {
                    break;
                } else {
                    i2++;
                }
            }
            C2705 c2705 = (C2705) obj;
            if (c2705 == null) {
                c2705 = new C2705();
                c10912.m1335(c2705);
            }
            c2705.f5720 = true;
            this.f5823 = c2705;
            interfaceC8162 = c2705.f5721;
        }
        if (interfaceC8162 == null) {
            interfaceC8162 = C8164.f19892;
        }
        this.f5820 = interfaceC8162;
        InterfaceC7387 interfaceC7387 = this.f5810;
        if (interfaceC7387 != null) {
            interfaceC7387.invoke(getComposeViewContext());
            this.f5810 = null;
        }
        AbstractC3235 lifecycle = getComposeViewContext().f5942.getLifecycle();
        lifecycle.mo5063(this);
        lifecycle.mo5063(this.f5770);
        ((AbstractC2182) this.f5795.f19870).setValue(new C8154(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            C2662.f5664.m4020(this);
        }
        C2242 c2242 = this.f5832;
        if (c2242 != null) {
            ((C2313) getFocusOwner()).f4539.m1335(c2242);
            getSemanticsOwner().f6107.m1335(c2242);
        }
        ((C2313) getFocusOwner()).f4539.m1335(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        C2960 c2960 = (C2960) this.f5809.get();
        C2669 c2669 = (C2669) (c2960 != null ? c2960.f6622 : null);
        if (c2669 == null) {
            return getLegacyTextInputServiceAndroid().f6239;
        }
        C2960 c29602 = (C2960) c2669.f5673.get();
        C2745 c2745 = (C2745) (c29602 != null ? c29602.f6622 : null);
        return c2745 != null && (c2745.f5974 ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m4083(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        C2960 c2960 = (C2960) this.f5809.get();
        C2669 c2669 = (C2669) (c2960 != null ? c2960.f6622 : null);
        if (c2669 == null) {
            C2834 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
            if (legacyTextInputServiceAndroid.f6239) {
                C2859 c2859 = legacyTextInputServiceAndroid.f6245;
                C2847 c2847 = legacyTextInputServiceAndroid.f6246;
                int i2 = c2859.f6315;
                boolean z = c2859.f6319;
                if (i2 == 1) {
                    i = z ? 6 : 0;
                } else if (i2 == 0) {
                    i = 1;
                } else if (i2 == 2) {
                    i = 2;
                } else if (i2 == 6) {
                    i = 5;
                } else if (i2 == 5) {
                    i = 7;
                } else if (i2 == 3) {
                    i = 3;
                } else if (i2 == 4) {
                    i = 4;
                } else {
                    if (i2 != 7) {
                        C6755.m11870("invalid ImeAction");
                        return null;
                    }
                }
                editorInfo.imeOptions = i;
                int i3 = c2859.f6316;
                if (i3 == 1) {
                    editorInfo.inputType = 1;
                } else if (i3 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i;
                } else if (i3 == 3) {
                    editorInfo.inputType = 2;
                } else if (i3 == 4) {
                    editorInfo.inputType = 3;
                } else if (i3 == 5) {
                    editorInfo.inputType = 17;
                } else if (i3 == 6) {
                    editorInfo.inputType = 33;
                } else if (i3 == 7) {
                    editorInfo.inputType = 129;
                } else if (i3 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i3 != 9) {
                        C6755.m11870("Invalid Keyboard Type");
                        return null;
                    }
                    editorInfo.inputType = DexMap.TYPE_STRING_DATA_ITEM;
                }
                if (!z) {
                    int i4 = editorInfo.inputType;
                    if ((i4 & 1) == 1) {
                        editorInfo.inputType = i4 | 131072;
                        if (i2 == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                }
                int i5 = editorInfo.inputType;
                if ((i5 & 1) == 1) {
                    int i6 = c2859.f6318;
                    if (i6 == 1) {
                        editorInfo.inputType = i5 | 4096;
                    } else if (i6 == 2) {
                        editorInfo.inputType = i5 | 8192;
                    } else if (i6 == 3) {
                        editorInfo.inputType = i5 | 16384;
                    }
                    if (c2859.f6317) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j = c2847.f6291;
                int i7 = C2869.f6347;
                editorInfo.initialSelStart = (int) (j >> 32);
                editorInfo.initialSelEnd = (int) (j & 4294967295L);
                AbstractC5894.m10579(editorInfo, c2847.f6292.f6474);
                editorInfo.imeOptions |= 33554432;
                if (C8542.m13568()) {
                    C8542.m13569().m13576(editorInfo);
                }
                InputConnectionC2846 inputConnectionC2846 = new InputConnectionC2846(legacyTextInputServiceAndroid.f6246, new C0960(legacyTextInputServiceAndroid, 28), legacyTextInputServiceAndroid.f6245.f6317);
                legacyTextInputServiceAndroid.f6249.add(new WeakReference(inputConnectionC2846));
                return inputConnectionC2846;
            }
        } else {
            C2960 c29602 = (C2960) c2669.f5673.get();
            final C2745 c2745 = (C2745) (c29602 != null ? c29602.f6622 : null);
            if (c2745 != null) {
                synchronized (c2745.f5976) {
                    if (c2745.f5974) {
                        return null;
                    }
                    InputConnection inputConnectionMo2226 = c2745.f5978.mo2226(editorInfo);
                    InterfaceC7387 interfaceC7387 = new InterfaceC7387() { // from class: androidx.compose.ui.platform.InputMethodSession$createInputConnection$1$1
                        {
                            super(1);
                        }

                        public final void invoke(InterfaceInputConnectionC2852 interfaceInputConnectionC2852) {
                            C2851 c2851 = (C2851) interfaceInputConnectionC2852;
                            InputConnection inputConnection = c2851.f6299;
                            if (inputConnection != null) {
                                inputConnection.closeConnection();
                                c2851.f6299 = null;
                            }
                            C2059 c2059 = c2745.f5975;
                            Object[] objArr = c2059.f3866;
                            int i8 = c2059.f3865;
                            int i9 = 0;
                            while (true) {
                                if (i9 >= i8) {
                                    i9 = -1;
                                    break;
                                } else if (AbstractC5227.m9466((C2597) objArr[i9], c2851)) {
                                    break;
                                } else {
                                    i9++;
                                }
                            }
                            if (i9 >= 0) {
                                c2745.f5975.m2613(i9);
                            }
                            C2745 c27452 = c2745;
                            if (c27452.f5975.f3865 == 0) {
                                c27452.f5977.invoke();
                            }
                        }

                        @Override // p068.InterfaceC7387
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((InterfaceInputConnectionC2852) obj);
                            return C6008.f15084;
                        }
                    };
                    InputConnection c2855 = Build.VERSION.SDK_INT >= 34 ? new C2855(inputConnectionMo2226, interfaceC7387) : new C2851(inputConnectionMo2226, interfaceC7387);
                    c2745.f5975.m2607(new C2597(c2855));
                    return c2855;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        C2788 c2788;
        ViewOnAttachStateChangeListenerC2256 viewOnAttachStateChangeListenerC2256 = this.f5770;
        viewOnAttachStateChangeListenerC2256.getClass();
        for (long j : jArr) {
            C2785 c2785 = (C2785) viewOnAttachStateChangeListenerC2256.m3107().m1393((int) j);
            if (c2785 != null && (c2788 = c2785.f6106) != null) {
                AbstractC1759.m2410();
                ViewTranslationRequest.Builder builderM2407 = AbstractC1759.m2407(viewOnAttachStateChangeListenerC2256.f4444.getAutofillId(), c2788.f6112);
                List list = (List) AbstractC2792.m4233(c2788.f6114, AbstractC2778.f6063);
                if (list != null) {
                    builderM2407.setValue("android:text", TranslationRequestValue.forText(new C2902(AbstractC8743.m13970(list, "\n", null, 62))));
                    consumer.accept(builderM2407.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.f5781.onViewDetachedFromWindow(this);
        View view = this.f5778;
        if (m4075() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            C1091 c1091 = f5757;
            synchronized (c1091) {
                c1091.m1336(this);
            }
        }
        getComposeViewContext().m4161();
        C2110 c2110 = getSnapshotObserver().f5619;
        C2102 c2102 = c2110.f4059;
        if (c2102 != null) {
            c2102.m2785();
        }
        c2110.m2808();
        AbstractC3235 lifecycle = getComposeViewContext().f5942.getLifecycle();
        lifecycle.mo5062(this.f5770);
        lifecycle.mo5062(this);
        C1171 c1171 = this.f5848;
        if (c1171 != null) {
            C2248 c2248 = C2248.f4422;
            c2248.getClass();
            ((AutofillManager) c1171.f1439).unregisterCallback(c2248);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        C2705 c2705 = this.f5823;
        if (c2705 != null) {
            c2705.f5720 = false;
        }
        this.f5823 = null;
        if (i >= 31) {
            C2662.f5664.m4021(this);
        }
        C2242 c2242 = this.f5832;
        if (c2242 != null) {
            getSemanticsOwner().f6107.m1336(c2242);
            ((C2313) getFocusOwner()).f4539.m1336(c2242);
        }
        C2796 rectManager = getRectManager();
        rectManager.f6164 = rectManager.f6167.m4252(0L, 0L, null, 0, 0);
        getRectManager().m4249();
        C2796 rectManager2 = getRectManager();
        RunnableC2727 runnableC2727 = rectManager2.f6170;
        if (runnableC2727 != null) {
            rectManager2.f6169.removeCallbacks(runnableC2727);
            rectManager2.f6170 = null;
        }
        ((C2313) getFocusOwner()).f4539.m1336(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        C2313 c2313 = (C2313) getFocusOwner();
        AbstractC2294.m3169(c2313.f4535, true);
        if (c2313.m3203() != null) {
            C2287 c2287M3203 = c2313.m3203();
            c2313.m3205(null);
            if (c2287M3203 != null) {
                c2287M3203.m3161(FocusStateImpl.Active, FocusStateImpl.Inactive);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f5833 = 0L;
        m4082();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        m4083(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.f5833 = 0L;
            this.f5839.m3758(this.f5789);
            this.f5844 = null;
            m4082();
            if (this.f5843 != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C2578 c2578 = this.f5839;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m4104(getRoot());
            }
            long jM4078 = m4078(i);
            long jM40782 = m4078(i2);
            long jM12609 = AbstractC7390.m12609((int) (jM4078 >>> 32), (int) (jM4078 & 4294967295L), (int) (jM40782 >>> 32), (int) (4294967295L & jM40782));
            C8727 c8727 = this.f5844;
            if (c8727 == null) {
                this.f5844 = new C8727(jM12609);
                this.f5840 = false;
            } else if (!C8727.m13894(c8727.f22210, jM12609)) {
                this.f5840 = true;
            }
            c2578.m3749(jM12609);
            c2578.m3750();
            setMeasuredDimension(getRoot().f5477.f5512.f5344, getRoot().f5477.f5512.f5342);
            if (this.f5843 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f5477.f5512.f5344, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f5477.f5512.f5342, 1073741824));
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure != null) {
            C2242 c2242 = this.f5832;
            if (c2242 != null) {
                C2583 c2583 = c2242.f4413.f6110;
                AutofillId autofillId = c2242.f4412;
                String str = c2242.f4407;
                C2796 c2796 = c2242.f4408;
                AbstractC2247.m3103(viewStructure, c2583, autofillId, str, c2796);
                Object[] objArr = AbstractC1134.f1348;
                C1091 c1091 = new C1091(2);
                c1091.m1335(c2583);
                c1091.m1335(viewStructure);
                while (c1091.m1438()) {
                    Object objM1337 = c1091.m1337(c1091.f1349 - 1);
                    objM1337.getClass();
                    ViewStructure viewStructure2 = (ViewStructure) objM1337;
                    Object objM13372 = c1091.m1337(c1091.f1349 - 1);
                    objM13372.getClass();
                    C1089 c1089 = (C1089) ((C2583) ((InterfaceC2784) objM13372)).m3817();
                    int i2 = ((C2059) c1089.f1239).f3865;
                    for (int i3 = 0; i3 < i2; i3++) {
                        InterfaceC2784 interfaceC2784 = (InterfaceC2784) c1089.get(i3);
                        if (!((C2583) interfaceC2784).f5471) {
                            C2583 c25832 = (C2583) interfaceC2784;
                            if (c25832.m3803() && c25832.m3802()) {
                                C2791 c2791M3814 = c25832.m3814();
                                if (c2791M3814 != null) {
                                    C1083 c1083 = c2791M3814.f6124;
                                    if (c1083.m1313(AbstractC2794.f6152) || c1083.m1313(AbstractC2794.f6151) || c1083.m1313(AbstractC2778.f6089) || c1083.m1313(AbstractC2778.f6081)) {
                                        ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                        AbstractC2247.m3103(viewStructureNewChild, interfaceC2784, autofillId, str, c2796);
                                        c1091.m1335(interfaceC2784);
                                        c1091.m1335(viewStructureNewChild);
                                    } else {
                                        c1091.m1335(interfaceC2784);
                                        c1091.m1335(viewStructure2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C1171 c1171 = this.f5848;
            if (c1171 != null) {
                C2253 c2253 = (C2253) c1171.f1441;
                LinkedHashMap linkedHashMap = c2253.f4426;
                LinkedHashMap linkedHashMap2 = c2253.f4426;
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                Iterator it = linkedHashMap2.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    if (entry.getValue() != null) {
                        C3775.m6954();
                        return;
                    }
                    ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                    viewStructureNewChild2.setAutofillId((AutofillId) c1171.f1438, iIntValue);
                    viewStructureNewChild2.setId(iIntValue, ((ViewTreeObserverOnGlobalLayoutListenerC2719) c1171.f1440).getContext().getPackageName(), null, null);
                    viewStructureNewChild2.setAutofillType(1);
                    throw null;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        InterfaceC2476 interfaceC2476;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(DexMap.TYPE_STRING_DATA_ITEM) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (interfaceC2476 = ((C2729) getPointerIconService()).f5907) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return interfaceC2476 instanceof C2469 ? PointerIcon.getSystemIcon(context, ((C2469) interfaceC2476).f5124) : PointerIcon.getSystemIcon(context, DescriptorProtos$Edition.EDITION_2023_VALUE);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.f5825) {
            int[] iArr = AbstractC2316.f4547;
            LayoutDirection layoutDirection = i != 0 ? i != 1 ? null : LayoutDirection.Rtl : LayoutDirection.Ltr;
            if (layoutDirection == null) {
                layoutDirection = LayoutDirection.Ltr;
            }
            setLayoutDirection(layoutDirection);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        C2763 c2763;
        if (Build.VERSION.SDK_INT < 31 || (c2763 = this.f5790) == null) {
            return;
        }
        c2763.m4196(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m4082();
    }

    @Override // androidx.lifecycle.InterfaceC3242
    public final void onStop(InterfaceC3221 interfaceC3221) {
        C2705 c2705 = this.f5823;
        if (c2705 != null) {
            C3244 c3244 = (C3244) c2705.f5722.f702;
            if (c3244.f7396 && !c3244.f7395) {
                InterfaceC2187 interfaceC2187 = c2705.f5719;
                if (interfaceC2187 != null) {
                    interfaceC2187.cancel();
                }
                c2705.f5719 = null;
                return;
            }
            if (c3244.f7394) {
                return;
            }
            if (!c3244.f7395) {
                AbstractC8179.m13102("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!((C1083) c3244.f7393).m1320()) {
                AbstractC8179.m13102("Attempted to start retaining exited values with pending exited values");
            }
            c3244.f7395 = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        ((AbstractC2182) this.f5795.f19870).setValue(new C8154(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ViewOnAttachStateChangeListenerC2256 viewOnAttachStateChangeListenerC2256 = this.f5770;
        viewOnAttachStateChangeListenerC2256.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (AbstractC5227.m9466(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            AbstractC7390.m12613(viewOnAttachStateChangeListenerC2256, longSparseArray);
        } else {
            viewOnAttachStateChangeListenerC2256.f4444.post(new RunnableC0946(viewOnAttachStateChangeListenerC2256, 1, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zM4190;
        this.f5792 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zM4190 = AbstractC2751.m4190())) {
            return;
        }
        setShowLayoutBounds(zM4190);
        m4074(getRoot());
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2636
    public void registerOnLayoutCompletedListener(InterfaceC2637 interfaceC2637) {
        this.f5839.registerOnLayoutCompletedListener(interfaceC2637);
        m4095(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (!isFocused()) {
            C2299 c2299M3210 = AbstractC2316.m3210(i);
            final int i2 = c2299M3210 != null ? c2299M3210.f4506 : 7;
            Boolean boolM3204 = ((C2313) getFocusOwner()).m3204(i2, rect != null ? new C8157(rect.left, rect.top, rect.right, rect.bottom) : null, new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithPrevRect$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p068.InterfaceC7387
                public final Boolean invoke(C2287 c2287) {
                    return Boolean.valueOf(c2287.m3156(i2));
                }
            });
            Boolean bool = Boolean.TRUE;
            if (!AbstractC5227.m9466(boolM3204, bool)) {
                if (!AbstractC5227.m9466(((C2313) getFocusOwner()).m3204(i2, null, new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithoutPrevRect$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p068.InterfaceC7387
                    public final Boolean invoke(C2287 c2287) {
                        return Boolean.valueOf(c2287.m3156(i2));
                    }
                }), bool)) {
                    if (!hasFocus()) {
                        return false;
                    }
                    if (i2 == 1 || i2 == 2) {
                        return ((C2313) getFocusOwner()).m3208(i2);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.f5769.f5878 = j;
    }

    public final void setComposeViewContext(C2738 c2738) {
        if (getCoroutineContext() != c2738.f5943.mo2894() && !((C1089) getRoot().m3817()).isEmpty()) {
            AbstractC8765.m13984("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        AbstractC2121 abstractC2121M2791 = AbstractC2109.m2791();
        InterfaceC7387 interfaceC7387Mo2763 = abstractC2121M2791 != null ? abstractC2121M2791.mo2763() : null;
        AbstractC2121 abstractC2121M2803 = AbstractC2109.m2803(abstractC2121M2791);
        try {
            C2738 c27382 = get_composeViewContext();
            if (c2738 != c27382) {
                if (isAttachedToWindow()) {
                    c27382.m4161();
                    c2738.m4160();
                }
                set_composeViewContext(c2738);
                setCoroutineContext(c2738.f5943.mo2894());
            }
        } finally {
            AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.f5793 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        ((AbstractC2182) this.f5850).setValue(configuration);
    }

    public final void setContentCaptureManager$ui(ViewOnAttachStateChangeListenerC2256 viewOnAttachStateChangeListenerC2256) {
        this.f5770 = viewOnAttachStateChangeListenerC2256;
    }

    public void setCoroutineContext(InterfaceC5192 interfaceC5192) {
        this.f5776 = interfaceC5192;
    }

    public final void setFrameEndScheduler$ui(InterfaceC2704 interfaceC2704) {
        this.f5822 = interfaceC2704;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.f5833 = j;
    }

    public final void setOnReadyForComposition(InterfaceC7387 interfaceC7387) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.f5793) {
            interfaceC7387.invoke(getComposeViewContext());
        } else {
            this.f5810 = interfaceC7387;
        }
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m4081setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(C8151 c8151) {
        this.f5819 = c8151;
    }

    public void setShowLayoutBounds(boolean z) {
        this.f5827 = z;
    }

    public void setUncaughtExceptionHandler(InterfaceC2633 interfaceC2633) {
        this.f5839.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4082() {
        boolean z;
        int i;
        int[] iArr = this.f5841;
        getLocationOnScreen(iArr);
        long j = this.f5842;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 != i4 || i3 != iArr[1] || this.f5833 < 0) {
            this.f5842 = (4294967295L & ((long) iArr[1])) | (((long) i4) << 32);
            if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                z = false;
            } else {
                C2059 c2059M3799 = getRoot().m3799();
                Object[] objArr = c2059M3799.f3866;
                int i5 = c2059M3799.f3865;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((C2583) objArr[i6]).f5477.f5512.m3731();
                }
                z = true;
            }
        }
        m4086();
        View rootView = this.f5791;
        if (rootView == null) {
            rootView = getRootView();
            this.f5791 = rootView;
        }
        C2796 rectManager = getRectManager();
        long j2 = this.f5842;
        long jM14240 = AbstractC9019.m14240(this.f5835);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.f5838;
        if (fArr.length < 16) {
            i = 0;
        } else {
            i = (((fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) ? 1 : 0);
        }
        C2801 c2801 = rectManager.f6167;
        if ((i & 2) != 0) {
            fArr = null;
        }
        rectManager.f6164 = c2801.m4252(j2, jM14240, fArr, width, height) || rectManager.f6164;
        this.f5839.m3748(z);
        getRectManager().m4249();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m4083(Configuration configuration) {
        InterfaceC2230 interfaceC2230;
        Configuration configuration2 = getConfiguration();
        if (AbstractC5227.m9466(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(AbstractC7176.m12463(getContext()));
        }
        InterfaceC7387 interfaceC7387 = AbstractC2671.f5683;
        if ((configuration2.diff(configuration) & (-1342235264)) == 0 || (interfaceC2230 = this.f5786.f5712) == null) {
            return;
        }
        ((AbstractC2182) interfaceC2230).setValue(AbstractC2751.m4177(this));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m4084(float f) {
        if (m4075()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.f5802) || f > this.f5802) {
                    this.f5802 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.f5803) || f < this.f5803) {
                    this.f5803 = f;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void m4085(MotionEvent motionEvent) {
        this.f5833 = AnimationUtils.currentAnimationTimeMillis();
        InterfaceC2649 interfaceC2649 = this.f5788;
        float[] fArr = this.f5838;
        interfaceC2649.mo4009(this, fArr);
        AbstractC2751.m4181(fArr, this.f5834);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jM3466 = C2422.m3466((((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jM3466 >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jM3466 & 4294967295L));
        this.f5835 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m4086() {
        if (this.f5836) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f5833) {
            this.f5833 = jCurrentAnimationTimeMillis;
            InterfaceC2649 interfaceC2649 = this.f5788;
            float[] fArr = this.f5838;
            interfaceC2649.mo4009(this, fArr);
            AbstractC2751.m4181(fArr, this.f5834);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f5841;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f5835 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m4087() {
        ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC2720 = this.f5769;
        viewOnAttachStateChangeListenerC2720.f5863 = true;
        Handler handler = viewOnAttachStateChangeListenerC2720.f5877.getHandler();
        if (viewOnAttachStateChangeListenerC2720.m4140() && !viewOnAttachStateChangeListenerC2720.f5882 && handler != null) {
            viewOnAttachStateChangeListenerC2720.f5882 = true;
            handler.post(viewOnAttachStateChangeListenerC2720.f5887);
        }
        ViewOnAttachStateChangeListenerC2256 viewOnAttachStateChangeListenerC2256 = this.f5770;
        viewOnAttachStateChangeListenerC2256.f4441 = true;
        Handler handler2 = viewOnAttachStateChangeListenerC2256.f4444.getHandler();
        if (!viewOnAttachStateChangeListenerC2256.m3106() || viewOnAttachStateChangeListenerC2256.f4432 || handler2 == null) {
            return;
        }
        viewOnAttachStateChangeListenerC2256.f4432 = true;
        handler2.post(viewOnAttachStateChangeListenerC2256.f4431);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m4088(C2583 c2583, boolean z, boolean z2) {
        C2591 c2591 = c2583.f5477;
        C2578 c2578 = this.f5839;
        if (!z) {
            c2578.getClass();
            int i = AbstractC2577.f5391[c2591.f5504.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                return;
            }
            if (i != 5) {
                C5043.m9170();
                return;
            }
            C2583 c2583M3816 = c2583.m3816();
            boolean z3 = c2583M3816 == null || c2583M3816.m3802();
            if (!z2) {
                if (c2583.m3819()) {
                    return;
                }
                if (c2583.m3822() && c2583.m3802() == z3 && c2583.m3802() == c2591.f5512.f5377) {
                    return;
                }
            }
            C2573 c2573 = c2591.f5512;
            c2573.f5375 = true;
            c2573.f5366 = true;
            if (!c2583.f5471 && c2573.f5377 && z3) {
                if ((c2583M3816 == null || !c2583M3816.m3822()) && (c2583M3816 == null || !c2583M3816.m3819())) {
                    c2578.f5396.m3888(c2583, Invalidation.Placement);
                }
                if (c2578.f5394) {
                    return;
                }
                m4095(null);
                return;
            }
            return;
        }
        C2613 c2613 = c2578.f5396;
        int i2 = AbstractC2577.f5391[c2591.f5504.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return;
                }
                if (i2 != 4 && i2 != 5) {
                    C5043.m9170();
                    return;
                }
            }
            if ((c2591.f5503 || c2591.f5502) && !z2) {
                return;
            }
            c2591.f5502 = true;
            c2591.f5514 = true;
            C2573 c25732 = c2591.f5512;
            c25732.f5375 = true;
            c25732.f5366 = true;
            if (c2583.f5471) {
                return;
            }
            C2583 c2583M38162 = c2583.m3816();
            if (AbstractC5227.m9466(c2583.m3801(), Boolean.TRUE) && ((c2583M38162 == null || !c2583M38162.f5477.f5503) && (c2583M38162 == null || !c2583M38162.f5477.f5502))) {
                c2613.m3888(c2583, Invalidation.LookaheadPlacement);
            } else if (c2583.m3802() && ((c2583M38162 == null || !c2583M38162.m3822()) && (c2583M38162 == null || !c2583M38162.m3819()))) {
                c2613.m3888(c2583, Invalidation.Placement);
            }
            if (c2578.f5394) {
                return;
            }
            m4095(null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m4089(C2583 c2583, boolean z, boolean z2, boolean z3) {
        C2583 c2583M3816;
        C2583 c2583M38162;
        C2578 c2578 = this.f5839;
        if (!z) {
            if (c2578.m3753(c2583, z2) && z3) {
                m4095(c2583);
                return;
            }
            return;
        }
        C2613 c2613 = c2578.f5396;
        C2583 c25832 = c2583.f5465;
        C2591 c2591 = c2583.f5477;
        if (c25832 == null) {
            AbstractC8765.m13982("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i = AbstractC2577.f5391[c2591.f5504.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4) {
                c2578.f5398.m2607(new C2581(c2583, true, z2));
                return;
            }
            if (i != 5) {
                C5043.m9170();
                return;
            }
            if (!c2591.f5503 || z2) {
                c2591.f5503 = true;
                c2591.f5512.f5376 = true;
                if (c2583.f5471) {
                    return;
                }
                if ((AbstractC5227.m9466(c2583.m3801(), Boolean.TRUE) || C2578.m3744(c2583)) && ((c2583M3816 = c2583.m3816()) == null || !c2583M3816.f5477.f5503)) {
                    c2613.m3888(c2583, Invalidation.LookaheadMeasurement);
                } else if ((c2583.m3802() || C2578.m3745(c2583)) && ((c2583M38162 = c2583.m3816()) == null || !c2583M38162.m3819())) {
                    c2613.m3888(c2583, Invalidation.Measurement);
                }
                if (c2578.f5394 || !z3) {
                    return;
                }
                m4095(c2583);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m4090(C2583 c2583) {
        ViewOnAttachStateChangeListenerC2720 viewOnAttachStateChangeListenerC2720 = this.f5769;
        viewOnAttachStateChangeListenerC2720.f5863 = true;
        if (viewOnAttachStateChangeListenerC2720.m4140()) {
            viewOnAttachStateChangeListenerC2720.m4138(c2583);
        }
        ViewOnAttachStateChangeListenerC2256 viewOnAttachStateChangeListenerC2256 = this.f5770;
        viewOnAttachStateChangeListenerC2256.f4441 = true;
        if (viewOnAttachStateChangeListenerC2256.m3106()) {
            viewOnAttachStateChangeListenerC2256.f4438.mo8995(C6008.f15084);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineSingletons m4091(InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        AndroidComposeView$textInputSession$1 androidComposeView$textInputSession$1;
        if (continuationImpl instanceof AndroidComposeView$textInputSession$1) {
            androidComposeView$textInputSession$1 = (AndroidComposeView$textInputSession$1) continuationImpl;
            int i = androidComposeView$textInputSession$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidComposeView$textInputSession$1.label = i - Integer.MIN_VALUE;
            } else {
                androidComposeView$textInputSession$1 = new AndroidComposeView$textInputSession$1(this, continuationImpl);
            }
        }
        Object obj = androidComposeView$textInputSession$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = androidComposeView$textInputSession$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC7387 interfaceC7387 = new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidComposeView$textInputSession$2
                {
                    super(1);
                }

                @Override // p068.InterfaceC7387
                public final C2669 invoke(InterfaceC6233 interfaceC6233) {
                    ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = this.this$0;
                    return new C2669(viewTreeObserverOnGlobalLayoutListenerC2719, viewTreeObserverOnGlobalLayoutListenerC2719.getTextInputService(), interfaceC6233);
                }
            };
            androidComposeView$textInputSession$1.label = 1;
            if (AbstractC2953.m4420(this.f5809, interfaceC7387, interfaceC7383, androidComposeView$textInputSession$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        C5043.m9161();
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m4092(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jM4098 = m4098((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jM4098 >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jM4098 & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C0923 c0923M3603 = this.f5845.m3603(this, motionEventObtain);
        c0923M3603.getClass();
        this.f5849.m2117(c0923M3603, this, true);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final int m4093(MotionEvent motionEvent) {
        Object obj;
        if (this.f5792) {
            this.f5792 = false;
            C2700 c2700 = getComposeViewContext().f5946;
            int metaState = motionEvent.getMetaState();
            c2700.getClass();
            ((AbstractC2182) AbstractC2684.f5699).setValue(new C2472(metaState));
        }
        C2483 c2483 = this.f5845;
        C0923 c0923M3603 = c2483.m3603(this, motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C1589 c1589 = this.f5849;
        if (c0923M3603 == null) {
            if (!c1589.f2501) {
                ((C1110) ((C0960) c1589.f2498).f702).m1387();
                ((C2466) c1589.f2499).m3573();
            }
            return 0;
        }
        List list = (List) c0923M3603.f572;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = list.get(size);
                if (((C2471) obj).f5126 && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
            obj = null;
        } else {
            obj = null;
        }
        C2471 c2471 = (C2471) obj;
        if (c2471 != null) {
            this.f5824 = c2471.f5127;
        }
        int iM2117 = c1589.m2117(c0923M3603, this, m4105(motionEvent));
        c0923M3603.f573 = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iM2117 & 1) != 0) {
            return iM2117;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        c2483.f5183.delete(pointerId);
        c2483.f5184.delete(pointerId);
        return iM2117;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final long m4094(long j) {
        m4086();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.f5835 >> 32));
        return C2422.m3466((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.f5835 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.f5834);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m4095(C2583 c2583) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (c2583 != null) {
            while (c2583 != null && c2583.m3820() == LayoutNode$UsageByParent.InMeasureBlock) {
                if (!this.f5840) {
                    C2583 c2583M3816 = c2583.m3816();
                    if (c2583M3816 == null) {
                        break;
                    }
                    long j = c2583M3816.f5439.f5631.f5341;
                    if (C8727.m13890(j) && C8727.m13891(j)) {
                        break;
                    }
                }
                c2583 = c2583.m3816();
            }
            if (c2583 == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean m4096() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    @Override // androidx.lifecycle.InterfaceC3242
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo4097(InterfaceC3221 interfaceC3221) {
        InterfaceC2187 interfaceC2187Mo2879;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(AbstractC2751.m4190());
        }
        final C2705 c2705 = this.f5823;
        if (c2705 != null) {
            InterfaceC2704 interfaceC2704 = this.f5822;
            interfaceC2704.getClass();
            C0960 c0960 = c2705.f5722;
            C3244 c3244 = (C3244) c0960.f702;
            if (!c3244.f7396 || c3244.f7395) {
                return;
            }
            try {
                interfaceC2187Mo2879 = ((C2687) interfaceC2704).f5706.mo2879(new InterfaceC7372() { // from class: androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry$stopRetainingExitedValues$1
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m4000invoke() {
                        C3244 c32442 = (C3244) c2705.f5722.f702;
                        if (c32442.f7394) {
                            return;
                        }
                        if (c32442.f7395) {
                            AbstractC8179.m13102("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                        }
                        c32442.m5074();
                        c32442.f7395 = true;
                    }

                    @Override // p068.InterfaceC7372
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m4000invoke();
                        return C6008.f15084;
                    }
                });
            } catch (CancellationException unused) {
                C3244 c32442 = (C3244) c0960.f702;
                if (!c32442.f7394) {
                    if (c32442.f7395) {
                        AbstractC8179.m13102("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    c32442.m5074();
                    c32442.f7395 = true;
                }
                interfaceC2187Mo2879 = null;
            }
            InterfaceC2187 interfaceC2187 = c2705.f5719;
            if (interfaceC2187 != null) {
                interfaceC2187.cancel();
            }
            c2705.f5719 = interfaceC2187Mo2879;
        }
    }

    @Override // androidx.compose.p001ui.focus.InterfaceC2319
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3102(C2287 c2287, C2287 c22872) {
        C2646 c2646;
        boolean z;
        C2646 c26462;
        boolean z2;
        if (c2287 != null) {
            C2287 c22873 = c2287;
            if (!c22873.f6637.f6624) {
                AbstractC8765.m13982("visitAncestors called on an unattached node");
            }
            AbstractC2961 abstractC2961 = c22873.f6637;
            C2583 c2583M3906 = AbstractC2620.m3906(c2287);
            C1082 c1082 = null;
            ArrayList arrayList = null;
            while (c2583M3906 != null) {
                if ((c2583M3906.f5439.f5628.f6630 & 2097152) != 0) {
                    while (abstractC2961 != null) {
                        if ((abstractC2961.f6636 & 2097152) != 0) {
                            AbstractC2961 abstractC2961M3899 = abstractC2961;
                            C2059 c2059 = null;
                            while (abstractC2961M3899 != null) {
                                if (abstractC2961M3899 instanceof InterfaceC8149) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(abstractC2961M3899);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (abstractC2961M3899.f6636 & 2097152) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                    int i = 0;
                                    for (AbstractC2961 abstractC29612 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29612 != null; abstractC29612 = abstractC29612.f6633) {
                                        if ((abstractC29612.f6636 & 2097152) != 0) {
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
                        }
                        abstractC2961 = abstractC2961.f6629;
                    }
                }
                c2583M3906 = c2583M3906.m3816();
                abstractC2961 = (c2583M3906 == null || (c26462 = c2583M3906.f5439) == null) ? null : c26462.f5629;
            }
            if (arrayList == null) {
                return;
            }
            if (c22872 != null) {
                if (!c22872.f6637.f6624) {
                    AbstractC8765.m13982("visitAncestors called on an unattached node");
                }
                AbstractC2961 abstractC29613 = c22872.f6637;
                C2583 c2583M39062 = AbstractC2620.m3906(c22872);
                C1082 c10822 = null;
                while (c2583M39062 != null) {
                    if ((c2583M39062.f5439.f5628.f6630 & 2097152) != 0) {
                        while (abstractC29613 != null) {
                            if ((abstractC29613.f6636 & 2097152) != 0) {
                                AbstractC2961 abstractC2961M38992 = abstractC29613;
                                C2059 c20592 = null;
                                while (abstractC2961M38992 != null) {
                                    if (abstractC2961M38992 instanceof InterfaceC8149) {
                                        if (c10822 == null) {
                                            C1082 c10823 = AbstractC1132.f1342;
                                            c10822 = new C1082();
                                        }
                                        c10822.m1301(abstractC2961M38992);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (abstractC2961M38992.f6636 & 2097152) != 0 && (abstractC2961M38992 instanceof AbstractC2623)) {
                                        int i2 = 0;
                                        for (AbstractC2961 abstractC29614 = ((AbstractC2623) abstractC2961M38992).f5571; abstractC29614 != null; abstractC29614 = abstractC29614.f6633) {
                                            if ((abstractC29614.f6636 & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    abstractC2961M38992 = abstractC29614;
                                                } else {
                                                    if (c20592 == null) {
                                                        c20592 = new C2059(0, new AbstractC2961[16]);
                                                    }
                                                    if (abstractC2961M38992 != null) {
                                                        c20592.m2607(abstractC2961M38992);
                                                        abstractC2961M38992 = null;
                                                    }
                                                    c20592.m2607(abstractC29614);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    abstractC2961M38992 = AbstractC2620.m3899(c20592);
                                }
                            }
                            abstractC29613 = abstractC29613.f6629;
                        }
                    }
                    c2583M39062 = c2583M39062.m3816();
                    abstractC29613 = (c2583M39062 == null || (c2646 = c2583M39062.f5439) == null) ? null : c2646.f5629;
                }
                c1082 = c10822;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC8149 interfaceC8149 = (InterfaceC8149) arrayList.get(i3);
                if (!(c1082 != null ? c1082.m1434(interfaceC8149) : false)) {
                    interfaceC8149.mo1794();
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long m4098(long j) {
        m4086();
        long jM3466 = C2422.m3466(j, this.f5838);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f5835 >> 32)) + Float.intBitsToFloat((int) (jM3466 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f5835 & 4294967295L)) + Float.intBitsToFloat((int) (jM3466 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m4099(float[] fArr) {
        m4086();
        C2422.m3463(fArr, this.f5838);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f5835 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f5835 & 4294967295L));
        InterfaceC7387 interfaceC7387 = AbstractC2671.f5683;
        float[] fArr2 = this.f5837;
        C2422.m3464(fArr2);
        C2422.m3462(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        AbstractC2671.m4029(fArr, fArr2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean m4100(int i) {
        if (i != 7 && i != 8) {
            Integer numM3211 = AbstractC2316.m3211(i);
            if (numM3211 == null) {
                throw AbstractC0900.m699("Invalid focus direction");
            }
            int iIntValue = numM3211.intValue();
            C2287 c2287M3203 = ((C2313) getFocusOwner()).m3203();
            if (c2287M3203 == null) {
                C6755.m11870("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer numM32112 = AbstractC2316.m3211(i);
            if (numM32112 == null) {
                throw AbstractC0900.m699("Invalid focus direction");
            }
            int iIntValue2 = numM32112.intValue();
            AbstractC2909 abstractC2909 = AbstractC2620.m3906(c2287M3203).f5461;
            View interopView = abstractC2909 != null ? abstractC2909.getInteropView() : null;
            View viewFindFocus = findFocus();
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            rootView.getClass();
            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
            if (viewFindNextFocus == null || interopView == null || !AbstractC2671.m4031(interopView, viewFindNextFocus)) {
                viewFindNextFocus = null;
            }
            if (viewFindNextFocus != null) {
                return AbstractC2316.m3212(viewFindNextFocus, Integer.valueOf(iIntValue), null);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m4101() {
        if (this.f5831) {
            getSnapshotObserver().m3972();
            this.f5831 = false;
        }
        C2652 c2652 = this.f5843;
        if (c2652 != null) {
            m4077(c2652);
        }
        C2242 c2242 = this.f5832;
        if (c2242 != null) {
            C1092 c1092 = c2242.f4409;
            if (c1092.f1244 == 0 && c2242.f4410) {
                ((AutofillManager) c2242.f4415.f702).commit();
                c2242.f4410 = false;
            }
            if (c1092.f1244 != 0) {
                c2242.f4410 = true;
            }
        }
        while (true) {
            C1091 c1091 = this.f5814;
            if (!c1091.m1438() || c1091.m1441(0) == null) {
                return;
            }
            int i = c1091.f1349;
            for (int i2 = 0; i2 < i; i2++) {
                InterfaceC7372 interfaceC7372 = (InterfaceC7372) c1091.m1441(i2);
                c1091.m1332(i2, null);
                if (interfaceC7372 != null) {
                    interfaceC7372.invoke();
                }
            }
            c1091.m1331(0, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m4102(boolean z) {
        InterfaceC7372 interfaceC7372;
        C2578 c2578 = this.f5839;
        if (c2578.f5396.m3889() || ((C2059) c2578.f5393.f572).f3865 != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    interfaceC7372 = this.f5789;
                } finally {
                    Trace.endSection();
                }
            } else {
                interfaceC7372 = null;
            }
            if (c2578.m3758(interfaceC7372)) {
                requestLayout();
            }
            c2578.m3748(false);
            getRectManager().m4249();
            if (this.f5846) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f5846 = false;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m4103(C2583 c2583, long j) {
        C2578 c2578 = this.f5839;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            c2578.m3751(c2583, j);
            if (!c2578.f5396.m3889()) {
                c2578.m3748(false);
                getRectManager().m4249();
                if (this.f5846) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f5846 = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m4104(C2583 c2583) {
        this.f5839.m3753(c2583, false);
        C2059 c2059M3799 = c2583.m3799();
        Object[] objArr = c2059M3799.f3866;
        int i = c2059M3799.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            m4104((C2583) objArr[i2]);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean m4105(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m4106(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f5813) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m4107(C2583 c2583, boolean z) {
        this.f5839.m3757(c2583, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m4108(MotionEvent motionEvent) {
        int actionMasked;
        MotionEvent motionEvent2;
        ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719;
        removeCallbacks(this.f5800);
        try {
            m4085(motionEvent);
            this.f5836 = true;
            m4102(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.f5813;
                boolean z = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                C1589 c1589 = this.f5849;
                if (motionEvent3 != null) {
                    try {
                        if (!((motionEvent3.getSource() == motionEvent.getSource() && motionEvent3.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                            motionEvent2 = motionEvent3;
                        } else if (motionEvent3.getButtonState() != 0 || (actionMasked = motionEvent3.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            motionEvent2 = motionEvent3;
                            if (!c1589.f2501) {
                                ((C1110) ((C0960) c1589.f2498).f702).m1387();
                                ((C2466) c1589.f2499).m3573();
                            }
                        } else if (motionEvent3.getActionMasked() != 10 && z) {
                            m4092(motionEvent3, 10, motionEvent3.getEventTime(), true);
                            motionEvent2 = motionEvent3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                boolean z2 = motionEvent.getToolType(0) == 3;
                if (z || !z2 || actionMasked2 == 3 || actionMasked2 == 9 || !m4105(motionEvent)) {
                    viewTreeObserverOnGlobalLayoutListenerC2719 = this;
                } else {
                    viewTreeObserverOnGlobalLayoutListenerC2719 = this;
                    viewTreeObserverOnGlobalLayoutListenerC2719.m4092(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent4 = viewTreeObserverOnGlobalLayoutListenerC2719.f5813;
                if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                    MotionEvent motionEvent5 = viewTreeObserverOnGlobalLayoutListenerC2719.f5813;
                    int pointerId = motionEvent5 != null ? motionEvent5.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    C2483 c2483 = viewTreeObserverOnGlobalLayoutListenerC2719.f5845;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            c2483.f5183.delete(pointerId);
                            c2483.f5184.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent6 = viewTreeObserverOnGlobalLayoutListenerC2719.f5813;
                        float x = motionEvent6 != null ? motionEvent6.getX() : Float.NaN;
                        MotionEvent motionEvent7 = viewTreeObserverOnGlobalLayoutListenerC2719.f5813;
                        boolean z3 = (x == motionEvent.getX() && (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent8 = viewTreeObserverOnGlobalLayoutListenerC2719.f5813;
                        boolean z4 = (motionEvent8 != null ? motionEvent8.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z3 || z4) {
                            if (pointerId >= 0) {
                                c2483.f5183.delete(pointerId);
                                c2483.f5184.delete(pointerId);
                            }
                            C2466 c2466 = (C2466) c1589.f2499;
                            if (c2466.f5113) {
                                c2466.f5113 = true;
                            } else {
                                c2466.f5118.f5191.m2612();
                            }
                        }
                    }
                }
                viewTreeObserverOnGlobalLayoutListenerC2719.f5813 = MotionEvent.obtainNoHistory(motionEvent);
                int iM4093 = m4093(motionEvent);
                Trace.endSection();
                viewTreeObserverOnGlobalLayoutListenerC2719.f5836 = false;
                return iM4093;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.f5836 = false;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: getAccessibilityManager, reason: merged with bridge method [inline-methods] */
    public C2730 m4109getAccessibilityManager() {
        return this.f5766;
    }

    /* JADX INFO: renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public C2734 m4110getClipboard() {
        return this.f5829;
    }

    /* JADX INFO: renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public C2735 m4111getClipboardManager() {
        return this.f5830;
    }

    public ViewOnDragListenerC2263 getDragAndDropManager() {
        return this.f5775;
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public C1093 m4113getLayoutNodes() {
        return this.f5771;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @InterfaceC6001
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m4069getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @InterfaceC6001
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public InterfaceC2632 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(InterfaceC2633 interfaceC2633) {
    }
}
