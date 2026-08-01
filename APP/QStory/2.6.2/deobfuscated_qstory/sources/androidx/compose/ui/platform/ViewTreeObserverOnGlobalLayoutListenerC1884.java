package androidx.compose.ui.platform;

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
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0076;
import androidx.appcompat.app.C0113;
import androidx.appcompat.app.RunnableC0062;
import androidx.appcompat.app.RunnableC0099;
import androidx.collection.AbstractC0273;
import androidx.collection.AbstractC0285;
import androidx.collection.C0235;
import androidx.collection.C0236;
import androidx.collection.C0242;
import androidx.collection.C0244;
import androidx.collection.C0245;
import androidx.collection.C0246;
import androidx.collection.C0263;
import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.lazy.C0748;
import androidx.compose.foundation.text.selection.AbstractC0921;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1362;
import androidx.compose.runtime.InterfaceC1352;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.runtime.snapshots.AbstractC1274;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.runtime.snapshots.C1267;
import androidx.compose.runtime.snapshots.C1275;
import androidx.compose.ui.AbstractC2128;
import androidx.compose.ui.C2127;
import androidx.compose.ui.autofill.AbstractC1417;
import androidx.compose.ui.autofill.C1407;
import androidx.compose.ui.autofill.C1413;
import androidx.compose.ui.autofill.C1418;
import androidx.compose.ui.autofill.InterfaceC1403;
import androidx.compose.ui.contentcapture.ViewOnAttachStateChangeListenerC1421;
import androidx.compose.ui.draganddrop.ViewOnDragListenerC1428;
import androidx.compose.ui.focus.AbstractC1459;
import androidx.compose.ui.focus.AbstractC1481;
import androidx.compose.ui.focus.C1452;
import androidx.compose.ui.focus.C1464;
import androidx.compose.ui.focus.C1477;
import androidx.compose.ui.focus.C1478;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.focus.InterfaceC1483;
import androidx.compose.ui.focus.InterfaceC1484;
import androidx.compose.ui.focus.InterfaceC1485;
import androidx.compose.ui.graphics.C1587;
import androidx.compose.ui.graphics.C1591;
import androidx.compose.ui.graphics.C1595;
import androidx.compose.ui.graphics.C1602;
import androidx.compose.ui.graphics.InterfaceC1583;
import androidx.compose.ui.input.pointer.C1631;
import androidx.compose.ui.input.pointer.C1634;
import androidx.compose.ui.input.pointer.C1636;
import androidx.compose.ui.input.pointer.C1637;
import androidx.compose.ui.input.pointer.C1648;
import androidx.compose.ui.input.pointer.InterfaceC1641;
import androidx.compose.ui.input.pointer.InterfaceC1645;
import androidx.compose.ui.layout.AbstractC1670;
import androidx.compose.ui.layout.AbstractC1708;
import androidx.compose.ui.layout.AbstractC1725;
import androidx.compose.ui.layout.C1664;
import androidx.compose.ui.layout.C1721;
import androidx.compose.ui.layout.RunnableC1701;
import androidx.compose.ui.modifier.C1734;
import androidx.compose.ui.node.AbstractC1742;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.AbstractC1794;
import androidx.compose.ui.node.C1738;
import androidx.compose.ui.node.C1743;
import androidx.compose.ui.node.C1746;
import androidx.compose.ui.node.C1748;
import androidx.compose.ui.node.C1756;
import androidx.compose.ui.node.C1758;
import androidx.compose.ui.node.C1762;
import androidx.compose.ui.node.C1778;
import androidx.compose.ui.node.C1780;
import androidx.compose.ui.node.C1803;
import androidx.compose.ui.node.C1811;
import androidx.compose.ui.node.InterfaceC1797;
import androidx.compose.ui.node.InterfaceC1798;
import androidx.compose.ui.node.InterfaceC1801;
import androidx.compose.ui.node.InterfaceC1802;
import androidx.compose.ui.node.InterfaceC1805;
import androidx.compose.ui.node.InterfaceC1806;
import androidx.compose.ui.node.Invalidation;
import androidx.compose.ui.node.LayoutNode$UsageByParent;
import androidx.compose.ui.scrollcapture.C1928;
import androidx.compose.ui.semantics.AbstractC1943;
import androidx.compose.ui.semantics.AbstractC1957;
import androidx.compose.ui.semantics.AbstractC1959;
import androidx.compose.ui.semantics.C1937;
import androidx.compose.ui.semantics.C1941;
import androidx.compose.ui.semantics.C1950;
import androidx.compose.ui.semantics.C1951;
import androidx.compose.ui.semantics.C1953;
import androidx.compose.ui.semantics.C1956;
import androidx.compose.ui.semantics.InterfaceC1949;
import androidx.compose.ui.spatial.C1961;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.C2068;
import androidx.compose.ui.text.font.InterfaceC1991;
import androidx.compose.ui.text.font.InterfaceC1996;
import androidx.compose.ui.text.input.C2000;
import androidx.compose.ui.text.input.C2013;
import androidx.compose.ui.text.input.C2014;
import androidx.compose.ui.text.input.C2017;
import androidx.compose.ui.text.input.C2021;
import androidx.compose.ui.text.input.C2025;
import androidx.compose.ui.text.input.InputConnectionC2012;
import androidx.compose.ui.text.input.InterfaceC2020;
import androidx.compose.ui.text.input.InterfaceInputConnectionC2018;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AbstractC2076;
import androidx.core.os.C2178;
import androidx.core.os.C2182;
import androidx.core.view.AbstractC2270;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.C2411;
import androidx.lifecycle.C2423;
import androidx.lifecycle.C2426;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.InterfaceC2409;
import androidx.lifecycle.InterfaceC2421;
import bsh.C2632;
import com.alibaba.fastjson2.C2941;
import com.bumptech.glide.AbstractC3054;
import com.davemorrissey.labs.subscaleview.R;
import com.google.protobuf.DescriptorProtos$Edition;
import io.ktor.util.C4210;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.C5175;
import kotlin.InterfaceC5168;
import kotlin.NotImplementedError;
import kotlin.collections.C4350;
import kotlin.coroutines.InterfaceC4359;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p000.AbstractC6087;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p108.InterfaceC7316;
import p110.C7321;
import p110.InterfaceC7319;
import p111.C7322;
import p111.C7324;
import p111.InterfaceC7323;
import p112.C7327;
import p114.C7334;
import p114.InterfaceC7332;
import p117.AbstractC7349;
import p160.C7636;
import p167.C7712;
import p175.AbstractC7738;
import p194.C7831;
import p194.C7832;
import p205.C7897;
import p205.InterfaceC7895;
import p207.AbstractC7913;
import p210.AbstractC7935;
import top.linl.dexparser.bean.DexMap;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1884 extends ViewGroup implements InterfaceC1801, InterfaceC1797, InterfaceC2409, InterfaceC1805, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, InterfaceC1484 {

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public static final C0244 f5411 = new C0244();

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    public static RunnableC1898 f5412;

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public static Class f5413;

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public static Method f5414;

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public static Method f5415;

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public static Method f5416;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public C0244 f5417;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public boolean f5418;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final C1591 f5419;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final C1895 f5420;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final C0244 f5421;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final C1418 f5422;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC1885 f5423;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public ViewOnAttachStateChangeListenerC1421 f5424;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C0246 f5425;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C1748 f5426;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final C1951 f5427;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C1961 f5428;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final ViewOnDragListenerC1428 f5429;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public InterfaceC4359 f5430;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C1478 f5431;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final View f5432;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC1395 f5433;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final RunnableC1897 f5434;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final RunnableC1701 f5435;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C1821 f5436;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C1602 f5437;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C1362 f5438;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC1395 f5439;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C1865 f5440;

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public final C1894 f5441;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final InterfaceC1814 f5442;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final InterfaceC6542 f5443;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final C1928 f5444;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public View f5445;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public boolean f5446;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public boolean f5447;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final InterfaceC7316 f5448;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final C7322 f5449;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final InterfaceC1991 f5450;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public C1901 f5451;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final InterfaceC1395 f5452;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public final InterfaceC1395 f5453;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public final RunnableC0062 f5454;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final RunnableC1897 f5455;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public float f5456;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public float f5457;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final C1908 f5458;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public boolean f5459;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final C1362 f5460;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final InterfaceC1395 f5461;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public C2014 f5462;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final AtomicReference f5463;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public InterfaceC6557 f5464;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public C2000 f5465;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public long f5466;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public MotionEvent f5467;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final C0244 f5468;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public final C0076 f5469;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final C1734 f5470;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final C1833 f5471;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C1758 f5472;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C7321 f5473;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public InterfaceC7332 f5474;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C4350 f5475;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC1869 f5476;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C1870 f5477;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f5478;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f5479;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1395 f5480;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public boolean f5481;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final C1803 f5482;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final C1899 f5483;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final C1900 f5484;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public boolean f5485;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final C1407 f5486;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public long f5487;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final float[] f5488;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public long f5489;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public boolean f5490;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final float[] f5491;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final float[] f5492;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final C1743 f5493;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public boolean f5494;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final int[] f5495;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public long f5496;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public C1817 f5497;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public C7897 f5498;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final C1648 f5499;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public boolean f5500;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final C1362 f5501;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final C0325 f5502;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final C0748 f5503;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final InterfaceC1395 f5504;

    public ViewTreeObserverOnGlobalLayoutListenerC1884(Context context, C1903 c1903) {
        super(context);
        this.f5480 = AbstractC1367.m2465(c1903);
        this.f5478 = 9205357640488583168L;
        int i = 1;
        this.f5479 = true;
        this.f5472 = c1903.f5607;
        this.f5474 = C7334.f19552;
        this.f5475 = new C4350();
        this.f5434 = new RunnableC1897(this, 0);
        this.f5433 = AbstractC1367.m2466(AbstractC4921.m9889(context), C1353.f3918);
        this.f5431 = new C1478(this, this);
        this.f5430 = c1903.f5597.mo2324();
        new AndroidComposeView$dragAndDropManager$1(this);
        this.f5429 = new ViewOnDragListenerC1428();
        this.f5440 = new C1865();
        this.f5439 = AbstractC1367.m2465(Boolean.FALSE);
        this.f5438 = AbstractC1367.m2486(new InterfaceC6542() { // from class: androidx.compose.ui.platform.AndroidComposeView$derivedIsAttached$2
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final Boolean invoke() {
                Boolean bool = (Boolean) ((AbstractC1347) this.this$0.f5439).getValue();
                bool.booleanValue();
                return bool;
            }
        });
        this.f5437 = c1903.f5599;
        this.f5436 = c1903.f5606;
        this.f5435 = new RunnableC1701();
        C1748 c1748 = new C1748(3);
        c1748.m3261(C1721.f4992);
        c1748.m3265(getDensity());
        c1748.m3259(getViewConfiguration());
        c1748.m3260(new C1891(this).mo3856(((C1478) getFocusOwner()).f4187).mo3856(getDragAndDropManager().f4106));
        this.f5426 = c1748;
        C0246 c0246 = AbstractC0273.f978;
        this.f5425 = new C0246();
        m3543getLayoutNodes();
        this.f5428 = new C1961(this);
        this.f5427 = new C1951(getRoot(), new C1937(), m3543getLayoutNodes());
        ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC1885 = new ViewOnAttachStateChangeListenerC1885(this);
        this.f5423 = viewOnAttachStateChangeListenerC1885;
        this.f5424 = new ViewOnAttachStateChangeListenerC1421(this, new AndroidComposeView$contentCaptureManager$1(this));
        this.f5420 = c1903.f5615;
        this.f5419 = new C1591(this);
        this.f5422 = new C1418();
        this.f5421 = new C0244();
        this.f5499 = new C1648();
        C1748 root = getRoot();
        C0748 c0748 = new C0748();
        c0748.f2154 = root;
        c0748.f2153 = new C1631(root.f5093.f5285);
        c0748.f2152 = new C0113(23);
        c0748.f2151 = new C1780();
        this.f5503 = c0748;
        this.f5504 = AbstractC1367.m2465(new Configuration(context.getResources().getConfiguration()));
        this.f5501 = AbstractC1367.m2486(new InterfaceC6542() { // from class: androidx.compose.ui.platform.AndroidComposeView$localeList$2
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final C7831 invoke() {
                LocaleList locales = this.this$0.getConfiguration().getLocales();
                C2178 c2178 = new C2178(new C2182(locales));
                if (locales.isEmpty()) {
                    c2178 = new C2178(new C2182(LocaleList.getDefault()));
                }
                C2182 c2182 = c2178.f6452;
                int size = c2182.f6454.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Locale locale = c2182.f6454.get(i2);
                    locale.getClass();
                    arrayList.add(new C7832(locale));
                }
                return new C7831(arrayList);
            }
        });
        this.f5502 = new C0325(this, getAutofillTree());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw AbstractC0053.m139("Autofill service could not be located.");
        }
        this.f5486 = new C1407(new C0113(autofillManager, 19), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.f5484 = c1903.f5613;
        this.f5483 = c1903.f5605;
        this.f5482 = new C1803(new AndroidComposeView$snapshotObserver$1(this));
        this.f5493 = new C1743(getRoot());
        this.f5496 = 9223372034707292159L;
        this.f5495 = new int[]{0, 0};
        float[] fArrM2897 = C1587.m2897();
        this.f5491 = fArrM2897;
        this.f5492 = C1587.m2897();
        this.f5488 = C1587.m2897();
        this.f5487 = -1L;
        this.f5489 = 9187343241974906880L;
        this.f5461 = AbstractC1367.m2465(null);
        this.f5460 = AbstractC1367.m2486(new InterfaceC6542() { // from class: androidx.compose.ui.platform.AndroidComposeView$viewTreeOwners$2
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final AbstractC1889 invoke() {
                this.this$0.get_viewTreeOwners();
                return null;
            }
        });
        this.f5463 = new AtomicReference(null);
        this.f5450 = c1903.f5604;
        this.f5453 = c1903.f5608;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = AbstractC1481.f4201;
        LayoutDirection layoutDirection2 = layoutDirection != 0 ? layoutDirection != 1 ? null : LayoutDirection.Rtl : LayoutDirection.Ltr;
        this.f5452 = AbstractC1367.m2465(layoutDirection2 == null ? LayoutDirection.Ltr : layoutDirection2);
        this.f5448 = c1903.f5609;
        this.f5449 = new C7322(isInTouchMode() ? 1 : 2);
        this.f5470 = new C1734(this);
        this.f5471 = new C1833(this);
        this.f5469 = new C0076(9);
        this.f5468 = new C0244();
        this.f5454 = new RunnableC0062(this, 4);
        this.f5455 = new RunnableC1897(this, i);
        this.f5458 = new C1908(context, new InterfaceC6557() { // from class: androidx.compose.ui.platform.AndroidComposeView$indirectPointerNavigationGestureDetector$1
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public /* synthetic */ Object invoke(Object obj) {
                m3421invoke3ESFkO8(((C1464) obj).f4160);
                return C5175.f14739;
            }

            /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final void m3421invoke3ESFkO8(int i2) {
                ((C1478) this.this$0.getFocusOwner()).m2637(i2, false);
            }
        });
        this.f5443 = new InterfaceC6542() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3422invoke() {
                MotionEvent motionEvent = this.this$0.f5467;
                if (motionEvent != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 7 || actionMasked == 9) {
                        this.this$0.f5466 = SystemClock.uptimeMillis();
                        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.this$0;
                        viewTreeObserverOnGlobalLayoutListenerC1884.post(viewTreeObserverOnGlobalLayoutListenerC1884.f5454);
                    }
                }
            }

            @Override // p052.InterfaceC6542
            public /* bridge */ /* synthetic */ Object invoke() {
                m3422invoke();
                return C5175.f14739;
            }
        };
        int i2 = Build.VERSION.SDK_INT;
        this.f5442 = i2 < 29 ? new C1815(fArrM2897) : new C1920();
        addOnAttachStateChangeListener(this.f5424);
        setWillNotDraw(false);
        setFocusable(true);
        C1837.f5338.m3462(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        AbstractC2270.m4234(this, viewOnAttachStateChangeListenerC1885);
        setOnDragListener(getDragAndDropManager());
        getRoot().m3239(this);
        if (i2 >= 29) {
            C1830.f5321.m3453(this);
        }
        if (m3505()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.f5432 = view;
            addView(view, -1);
        }
        this.f5444 = i2 >= 31 ? new C1928() : null;
        this.f5441 = new C1894(this);
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.f5438.getValue()).booleanValue();
    }

    private final C2000 getLegacyTextInputServiceAndroid() {
        C2000 c2000 = this.f5465;
        if (c2000 != null) {
            return c2000;
        }
        C2000 c20002 = new C2000(getView(), this);
        this.f5465 = c20002;
        return c20002;
    }

    private final C1903 get_composeViewContext() {
        return (C1903) ((AbstractC1347) this.f5480).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC1889 get_viewTreeOwners() {
        AbstractC0053.m137(((AbstractC1347) this.f5461).getValue());
        return null;
    }

    private final void setAttached(boolean z) {
        ((AbstractC1347) this.f5439).setValue(Boolean.valueOf(z));
    }

    private void setDensity(InterfaceC7895 interfaceC7895) {
        ((AbstractC1347) this.f5433).setValue(interfaceC7895);
    }

    private void setFontFamilyResolver(InterfaceC1996 interfaceC1996) {
        this.f5453.setValue(interfaceC1996);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        ((AbstractC1347) this.f5452).setValue(layoutDirection);
    }

    private final void set_composeViewContext(C1903 c1903) {
        ((AbstractC1347) this.f5480).setValue(c1903);
    }

    private final void set_viewTreeOwners(AbstractC1889 abstractC1889) {
        ((AbstractC1347) this.f5461).setValue(abstractC1889);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m3503(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iM797;
        ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC1885 = viewTreeObserverOnGlobalLayoutListenerC1884.f5423;
        if (AbstractC4394.m8917(str, viewOnAttachStateChangeListenerC1885.f5511)) {
            int iM7972 = viewOnAttachStateChangeListenerC1885.f5509.m797(i);
            if (iM7972 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM7972);
                return;
            }
            return;
        }
        if (!AbstractC4394.m8917(str, viewOnAttachStateChangeListenerC1885.f5510) || (iM797 = viewOnAttachStateChangeListenerC1885.f5508.m797(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iM797);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m3504(C1748 c1748) {
        c1748.m3225();
        C1224 c1224M3229 = c1748.m3229();
        Object[] objArr = c1224M3229.f3520;
        int i = c1224M3229.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            m3504((C1748) objArr[i2]);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m3505() {
        return Build.VERSION.SDK_INT >= 35;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static boolean m3506(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !C1856.f5362.m3473(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m3507(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC1884) {
                ((ViewTreeObserverOnGlobalLayoutListenerC1884) childAt).m3531();
            } else if (childAt instanceof ViewGroup) {
                m3507((ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static long m3508(int i) {
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
        C2632.m5296();
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static View m3509(View view, int i) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (AbstractC4394.m8917(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewM3509 = m3509(viewGroup.getChildAt(i2), i);
                    if (viewM3509 != null) {
                        return viewM3509;
                    }
                }
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        C1452 c1452 = ((C1478) getFocusOwner()).f4189;
        if (!c1452.f6278) {
            return;
        }
        if (!c1452.f6291.f6278) {
            AbstractC7935.m13395("visitSubtreeIf called on an unattached node");
        }
        C1224 c1224 = new C1224(0, new AbstractC2128[16]);
        AbstractC2128 abstractC2128 = c1452.f6291;
        AbstractC2128 abstractC21282 = abstractC2128.f6287;
        if (abstractC21282 == null) {
            AbstractC1785.m3332(c1224, abstractC2128);
        } else {
            c1224.m2037(abstractC21282);
        }
        while (true) {
            int i3 = c1224.f3519;
            if (i3 == 0) {
                return;
            }
            AbstractC2128 abstractC21283 = (AbstractC2128) c1224.m2043(i3 - 1);
            if ((abstractC21283.f6284 & 1024) != 0) {
                for (AbstractC2128 abstractC21284 = abstractC21283; abstractC21284 != null && abstractC21284.f6278; abstractC21284 = abstractC21284.f6287) {
                    if ((abstractC21284.f6290 & 1024) != 0) {
                        AbstractC2128 abstractC2128M3329 = abstractC21284;
                        C1224 c12242 = null;
                        while (abstractC2128M3329 != null) {
                            if (abstractC2128M3329 instanceof C1452) {
                                C1452 c14522 = (C1452) abstractC2128M3329;
                                if (c14522.f6278 && c14522.m2590().f4179) {
                                    super.addFocusables(arrayList, i, i2);
                                    C1452 c14523 = ((C1478) getFocusOwner()).f4189;
                                    if (c14523.f6278) {
                                        if (!c14523.f6291.f6278) {
                                            AbstractC7935.m13395("visitSubtreeIf called on an unattached node");
                                        }
                                        C1224 c12243 = new C1224(0, new AbstractC2128[16]);
                                        AbstractC2128 abstractC21285 = c14523.f6291;
                                        AbstractC2128 abstractC21286 = abstractC21285.f6287;
                                        if (abstractC21286 == null) {
                                            AbstractC1785.m3332(c12243, abstractC21285);
                                        } else {
                                            c12243.m2037(abstractC21286);
                                        }
                                        while (true) {
                                            int i4 = c12243.f3519;
                                            if (i4 == 0) {
                                                break;
                                            }
                                            AbstractC2128 abstractC21287 = (AbstractC2128) c12243.m2043(i4 - 1);
                                            if ((abstractC21287.f6284 & 1024) != 0) {
                                                for (AbstractC2128 abstractC21288 = abstractC21287; abstractC21288 != null && abstractC21288.f6278; abstractC21288 = abstractC21288.f6287) {
                                                    if ((abstractC21288.f6290 & 1024) != 0) {
                                                        AbstractC2128 abstractC2128M33292 = abstractC21288;
                                                        C1224 c12244 = null;
                                                        while (abstractC2128M33292 != null) {
                                                            if (abstractC2128M33292 instanceof C1452) {
                                                                C1452 c14524 = (C1452) abstractC2128M33292;
                                                                if (c14524.f6278) {
                                                                    C1477 c1477M2590 = c14524.m2590();
                                                                    if (c14524.f6278 && !c14524.f4146 && c1477M2590.f4179) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((abstractC2128M33292.f6290 & 1024) != 0 && (abstractC2128M33292 instanceof AbstractC1788)) {
                                                                int i5 = 0;
                                                                for (AbstractC2128 abstractC21289 = ((AbstractC1788) abstractC2128M33292).f5225; abstractC21289 != null; abstractC21289 = abstractC21289.f6287) {
                                                                    if ((abstractC21289.f6290 & 1024) != 0) {
                                                                        i5++;
                                                                        if (i5 == 1) {
                                                                            abstractC2128M33292 = abstractC21289;
                                                                        } else {
                                                                            if (c12244 == null) {
                                                                                c12244 = new C1224(0, new AbstractC2128[16]);
                                                                            }
                                                                            if (abstractC2128M33292 != null) {
                                                                                c12244.m2037(abstractC2128M33292);
                                                                                abstractC2128M33292 = null;
                                                                            }
                                                                            c12244.m2037(abstractC21289);
                                                                        }
                                                                    }
                                                                }
                                                                if (i5 == 1) {
                                                                }
                                                            }
                                                            abstractC2128M33292 = AbstractC1785.m3329(c12244);
                                                        }
                                                    }
                                                }
                                            }
                                            AbstractC1785.m3332(c12243, abstractC21287);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((abstractC2128M3329.f6290 & 1024) != 0 && (abstractC2128M3329 instanceof AbstractC1788)) {
                                int i6 = 0;
                                for (AbstractC2128 abstractC212810 = ((AbstractC1788) abstractC2128M3329).f5225; abstractC212810 != null; abstractC212810 = abstractC212810.f6287) {
                                    if ((abstractC212810.f6290 & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            abstractC2128M3329 = abstractC212810;
                                        } else {
                                            if (c12242 == null) {
                                                c12242 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (abstractC2128M3329 != null) {
                                                c12242.m2037(abstractC2128M3329);
                                                abstractC2128M3329 = null;
                                            }
                                            c12242.m2037(abstractC212810);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            abstractC2128M3329 = AbstractC1785.m3329(c12242);
                        }
                    }
                }
            }
            AbstractC1785.m3332(c1224, abstractC21283);
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
        C1956 c1956M3244;
        InterfaceC6557 interfaceC6557;
        InterfaceC6557 interfaceC65572;
        C1407 c1407 = this.f5486;
        if (c1407 != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                InterfaceC1949 interfaceC1949 = (InterfaceC1949) c1407.f4067.f5762.m832(iKeyAt);
                if (interfaceC1949 != null && (c1956M3244 = ((C1748) interfaceC1949).m3244()) != null) {
                    C1941 c1941 = (C1941) AbstractC1957.m3663(c1956M3244, AbstractC1959.f5806);
                    if (c1941 != null && (interfaceC65572 = (InterfaceC6557) c1941.f5705) != null) {
                    }
                    C1941 c19412 = (C1941) AbstractC1957.m3663(c1956M3244, AbstractC1959.f5805);
                    if (c19412 != null && (interfaceC6557 = (InterfaceC6557) c19412.f5705) != null) {
                    }
                }
            }
        }
        C0325 c0325 = this.f5502;
        if (c0325 != null) {
            C1418 c1418 = (C1418) c0325.f1096;
            if (c1418.f4080.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (c1418.f4080.get(Integer.valueOf(iKeyAt2)) != null) {
                        C2941.m6336();
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
        return this.f5423.m3572(false, i, this.f5478);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f5423.m3572(true, i, this.f5478);
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
        C0244 c0244 = this.f5421;
        if (!isAttachedToWindow()) {
            m3504(getRoot());
        }
        m3532(true);
        AbstractC1280.m2270().mo2199();
        this.f5418 = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            C1602 c1602 = this.f5437;
            C1595 c1595 = c1602.f4702;
            Canvas canvas2 = c1595.f4689;
            c1595.f4689 = canvas;
            getRoot().m3257(c1595, null);
            c1602.f4702.f4689 = canvas2;
            if (c0244.m877()) {
                int i = c0244.f1004;
                for (int i2 = 0; i2 < i; i2++) {
                    ((C1911) ((InterfaceC1806) c0244.m880(i2))).m3603();
                }
            }
            int i3 = AbstractC1845.f5351;
            c0244.m778();
            this.f5418 = false;
            Trace.endSection();
            C0244 c02442 = this.f5417;
            if (c02442 != null) {
                c0244.m773(c02442);
                c02442.m778();
            }
            if (m3505()) {
                AbstractC1819.m3442(this, this.f5456);
                View view = this.f5432;
                if (view != null) {
                    AbstractC1819.m3442(view, this.f5457);
                    if (!Float.isNaN(this.f5457)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.f5456 = Float.NaN;
                this.f5457 = Float.NaN;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchGenericMotionEvent(final android.view.MotionEvent r43) {
        /*
            Method dump skipped, instruction units count: 1983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0157  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((C1478) getFocusOwner()).m2629(keyEvent, new InterfaceC6542() { // from class: androidx.compose.ui.platform.AndroidComposeView$dispatchKeyEvent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p052.InterfaceC6542
                public final Boolean invoke() {
                    return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent(keyEvent));
                }
            });
        }
        C1865 c1865 = getComposeViewContext().f5600;
        int metaState = keyEvent.getMetaState();
        c1865.getClass();
        ((AbstractC1347) AbstractC1849.f5353).setValue(new C1637(metaState));
        return ((C1478) getFocusOwner()).m2629(keyEvent, new InterfaceC6542() { // from class: androidx.compose.ui.focus.FocusOwner$dispatchKeyEvent$1
            @Override // p052.InterfaceC6542
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        }) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C1811 c1811;
        if (isFocused()) {
            C1478 c1478 = (C1478) getFocusOwner();
            if (c1478.f4188.f4195) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                C1452 c1452M2597 = AbstractC1459.m2597(c1478.f4189);
                if (c1452M2597 != null) {
                    if (!c1452M2597.f6291.f6278) {
                        AbstractC7935.m13395("visitAncestors called on an unattached node");
                    }
                    AbstractC2128 abstractC2128 = c1452M2597.f6291;
                    C1748 c1748M3336 = AbstractC1785.m3336(c1452M2597);
                    while (c1748M3336 != null) {
                        if ((c1748M3336.f5093.f5282.f6284 & 131072) != 0) {
                            while (abstractC2128 != null) {
                                if ((abstractC2128.f6290 & 131072) != 0) {
                                    AbstractC2128 abstractC2128M3329 = abstractC2128;
                                    C1224 c1224 = null;
                                    while (abstractC2128M3329 != null) {
                                        if ((abstractC2128M3329.f6290 & 131072) != 0 && (abstractC2128M3329 instanceof AbstractC1788)) {
                                            int i = 0;
                                            for (AbstractC2128 abstractC21282 = ((AbstractC1788) abstractC2128M3329).f5225; abstractC21282 != null; abstractC21282 = abstractC21282.f6287) {
                                                if ((abstractC21282.f6290 & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        abstractC2128M3329 = abstractC21282;
                                                    } else {
                                                        if (c1224 == null) {
                                                            c1224 = new C1224(0, new AbstractC2128[16]);
                                                        }
                                                        if (abstractC2128M3329 != null) {
                                                            c1224.m2037(abstractC2128M3329);
                                                            abstractC2128M3329 = null;
                                                        }
                                                        c1224.m2037(abstractC21282);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        abstractC2128M3329 = AbstractC1785.m3329(c1224);
                                    }
                                }
                                abstractC2128 = abstractC2128.f6283;
                            }
                        }
                        c1748M3336 = c1748M3336.m3246();
                        abstractC2128 = (c1748M3336 == null || (c1811 = c1748M3336.f5093) == null) ? null : c1811.f5283;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            C1831.f5322.m3454(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object c1818;
        C1452 c1452M2633;
        if (this.f5459) {
            RunnableC1897 runnableC1897 = this.f5455;
            removeCallbacks(runnableC1897);
            MotionEvent motionEvent2 = this.f5467;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f5459 = false;
            } else {
                runnableC1897.run();
            }
        }
        if (!m3506(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || m3536(motionEvent))) {
            int iM3538 = m3538(motionEvent);
            if ((iM3538 & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(DexMap.TYPE_STRING_DATA_ITEM) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (c1818 = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    c1818 = new C1818(1);
                }
                if (c1818.equals(new C1818(1)) && (c1452M2633 = ((C1478) getFocusOwner()).m2633()) != null) {
                    AbstractC1794 abstractC1794M3339 = AbstractC1785.m3339(c1452M2633);
                    if (!AbstractC1670.m3103(abstractC1794M3339).mo3079(abstractC1794M3339, true).m12494((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        InterfaceC1485.m2645(getFocusOwner());
                    }
                }
            }
            if ((iM3538 & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return m3509(this, i);
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
        C7327 c7327M2643;
        if (view == null || this.f5493.f5049) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || !AbstractC1836.m3461(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            C1452 c1452M2597 = AbstractC1459.m2597(((C1478) getFocusOwner()).f4189);
            c7327M2643 = c1452M2597 != null ? AbstractC1459.m2619(c1452M2597) : null;
            if (c7327M2643 == null) {
                c7327M2643 = AbstractC1481.m2643(view, this);
            }
        } else {
            c7327M2643 = AbstractC1481.m2643(view, this);
        }
        C1464 c1464M2640 = AbstractC1481.m2640(i);
        int i2 = c1464M2640 != null ? c1464M2640.f4160 : 6;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (((C1478) getFocusOwner()).m2634(i2, c7327M2643, new InterfaceC6557() { // from class: androidx.compose.ui.platform.AndroidComposeView$focusSearch$searchResult$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p052.InterfaceC6557
            public final Boolean invoke(C1452 c1452) {
                ref$ObjectRef.element = c1452;
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
        } else if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || AbstractC1459.m2613(AbstractC1459.m2619((C1452) t), AbstractC1481.m2643(viewFindNextFocus, this), c7327M2643, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public final C1817 getAndroidViewsHandler$ui() {
        if (this.f5497 == null) {
            C1817 c1817 = new C1817(getContext());
            this.f5497 = c1817;
            addView(c1817, -1);
            requestLayout();
        }
        C1817 c18172 = this.f5497;
        c18172.getClass();
        return c18172;
    }

    public InterfaceC1403 getAutofill() {
        return this.f5502;
    }

    public AbstractC1417 getAutofillManager() {
        return this.f5486;
    }

    public C1418 getAutofillTree() {
        return this.f5422;
    }

    public final C1903 getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.f5447;
    }

    public final Configuration getConfiguration() {
        return (Configuration) ((AbstractC1347) this.f5504).getValue();
    }

    public final ViewOnAttachStateChangeListenerC1421 getContentCaptureManager$ui() {
        return this.f5424;
    }

    public InterfaceC4359 getCoroutineContext() {
        return this.f5430;
    }

    public InterfaceC7895 getDensity() {
        return (InterfaceC7895) ((AbstractC1347) this.f5433).getValue();
    }

    public C7327 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            C1452 c1452M2597 = AbstractC1459.m2597(((C1478) getFocusOwner()).f4189);
            if (c1452M2597 != null) {
                return AbstractC1459.m2619(c1452M2597);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return AbstractC1481.m2643(viewFindFocus, this);
        }
        return null;
    }

    public InterfaceC1483 getFocusOwner() {
        return this.f5431;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C7327 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f19545);
            rect.top = Math.round(embeddedViewFocusRect.f19544);
            rect.right = Math.round(embeddedViewFocusRect.f19543);
            rect.bottom = Math.round(embeddedViewFocusRect.f19542);
            return;
        }
        if (AbstractC4394.m8917(((C1478) getFocusOwner()).m2634(6, null, new InterfaceC6557() { // from class: androidx.compose.ui.platform.AndroidComposeView$getFocusedRect$1
            @Override // p052.InterfaceC6557
            public final Boolean invoke(C1452 c1452) {
                return Boolean.TRUE;
            }
        }), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public InterfaceC1996 getFontFamilyResolver() {
        return (InterfaceC1996) this.f5453.getValue();
    }

    public InterfaceC1991 getFontLoader() {
        return this.f5450;
    }

    public final InterfaceC1869 getFrameEndScheduler$ui() {
        return this.f5476;
    }

    public InterfaceC1583 getGraphicsContext() {
        return this.f5419;
    }

    public InterfaceC7316 getHapticFeedBack() {
        return this.f5448;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f5493.f5050.m3319() || !this.f5475.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public InterfaceC7323 getInputModeManager() {
        return this.f5449;
    }

    public final RunnableC1701 getInsetsListener() {
        return this.f5435;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.f5487;
    }

    @Override // android.view.View, android.view.ViewParent
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) ((AbstractC1347) this.f5452).getValue();
    }

    public C7831 getLocaleList() {
        return (C7831) this.f5501.getValue();
    }

    public long getMeasureIteration() {
        C1743 c1743 = this.f5493;
        if (!c1743.f5049) {
            AbstractC7935.m13397("measureIteration should be only used during the measure/layout pass");
        }
        return c1743.f5053;
    }

    public C1734 getModifierLocalManager() {
        return this.f5470;
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1884 getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public AbstractC1708 getPlacementScope() {
        InterfaceC6557 interfaceC6557 = AbstractC1725.f5000;
        return new C1664(this, 1);
    }

    public InterfaceC1645 getPointerIconService() {
        return this.f5441;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final C7321 m3510getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.f5473;
    }

    public C1961 getRectManager() {
        return this.f5428;
    }

    public InterfaceC7332 getRetainedValuesStore() {
        return this.f5474;
    }

    public C1748 getRoot() {
        return this.f5426;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        C1928 c1928;
        if (Build.VERSION.SDK_INT < 31 || (c1928 = this.f5444) == null) {
            return false;
        }
        return ((Boolean) ((AbstractC1347) c1928.f5677).getValue()).booleanValue();
    }

    public C1951 getSemanticsOwner() {
        return this.f5427;
    }

    public C1758 getSharedDrawScope() {
        return this.f5472;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? C1816.f5294.m3441(this) : this.f5481;
    }

    public C1803 getSnapshotObserver() {
        return this.f5482;
    }

    public InterfaceC1871 getSoftwareKeyboardController() {
        C1901 c1901 = this.f5451;
        if (c1901 != null) {
            return c1901;
        }
        C1901 c19012 = new C1901(getTextInputService());
        this.f5451 = c19012;
        return c19012;
    }

    public C2014 getTextInputService() {
        C2014 c2014 = this.f5462;
        if (c2014 != null) {
            return c2014;
        }
        C2014 c20142 = new C2014((InterfaceC2020) AbstractC1836.f5337.invoke(getLegacyTextInputServiceAndroid()));
        this.f5462 = c20142;
        return c20142;
    }

    public InterfaceC1874 getTextToolbar() {
        return this.f5471;
    }

    public final InterfaceC1798 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public InterfaceC1863 getViewConfiguration() {
        return this.f5436;
    }

    public final AbstractC1889 getViewTreeOwners() {
        AbstractC0053.m137(this.f5460.getValue());
        return null;
    }

    public InterfaceC1848 getWindowInfo() {
        return getComposeViewContext().f5600;
    }

    public final C1407 get_autofillManager$ui() {
        return this.f5486;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC7332 interfaceC7332;
        Object obj;
        super.onAttachedToWindow();
        setAttached(true);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(AbstractC1916.m3620());
        }
        this.f5435.onViewAttachedToWindow(this);
        int i2 = 0;
        if (i > 28) {
            if (f5412 == null) {
                RunnableC1898 runnableC1898 = new RunnableC1898(i2);
                f5412 = runnableC1898;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (f5413 == null) {
                        f5413 = Class.forName("android.os.SystemProperties");
                    }
                    if (f5414 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = f5413;
                        f5414 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = f5414;
                    if (method != null) {
                        method.invoke(null, runnableC1898);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            C0244 c0244 = f5411;
            synchronized (c0244) {
                c0244.m774(this);
            }
        }
        if (!this.f5447) {
            getComposeViewContext().m3590();
        }
        this.f5447 = false;
        m3534(getRoot());
        m3504(getRoot());
        getSnapshotObserver().f5273.m2235();
        C0325 c0325 = this.f5502;
        if (c0325 != null) {
            C1413 c1413 = C1413.f4076;
            c1413.getClass();
            ((AutofillManager) c0325.f1094).registerCallback(c1413);
        }
        InterfaceC2388 interfaceC2388 = getComposeViewContext().f5596;
        InterfaceC2421 interfaceC2421 = getComposeViewContext().f5594;
        InterfaceC1869 interfaceC1869 = this.f5476;
        if (interfaceC2388 == null || interfaceC2421 == null || interfaceC1869 == null) {
            interfaceC7332 = null;
        } else {
            C2423 viewModelStore = interfaceC2421.getViewModelStore();
            C2426 c2426 = new C2426();
            C7636 c7636 = C7636.f20730;
            viewModelStore.getClass();
            c7636.getClass();
            C0325 c03252 = new C0325(viewModelStore, c2426, c7636);
            InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(C1867.class);
            String strMo8895 = interfaceC5092Mo8927.mo8895();
            if (strMo8895 == null) {
                C5919.m11249("Local and anonymous classes can not be ViewModels");
                return;
            }
            C1867 c1867 = (C1867) c03252.m958("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strMo8895), interfaceC5092Mo8927);
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            C0246 c0246 = c1867.f5368;
            Object objM832 = c0246.m832(id);
            if (objM832 == null) {
                objM832 = new C0244(1);
                c0246.m789(id, objM832);
            }
            C0244 c02442 = (C0244) objM832;
            Object[] objArr = c02442.f1005;
            int i3 = c02442.f1004;
            while (true) {
                if (i2 >= i3) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (!((C1870) obj).f5374) {
                    break;
                } else {
                    i2++;
                }
            }
            C1870 c1870 = (C1870) obj;
            if (c1870 == null) {
                c1870 = new C1870();
                c02442.m774(c1870);
            }
            c1870.f5374 = true;
            this.f5477 = c1870;
            interfaceC7332 = c1870.f5375;
        }
        if (interfaceC7332 == null) {
            interfaceC7332 = C7334.f19552;
        }
        this.f5474 = interfaceC7332;
        InterfaceC6557 interfaceC6557 = this.f5464;
        if (interfaceC6557 != null) {
            interfaceC6557.invoke(getComposeViewContext());
            this.f5464 = null;
        }
        AbstractC2402 lifecycle = getComposeViewContext().f5596.getLifecycle();
        lifecycle.mo4493(this);
        lifecycle.mo4493(this.f5424);
        ((AbstractC1347) this.f5449.f19530).setValue(new C7324(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            C1827.f5318.m3450(this);
        }
        C1407 c1407 = this.f5486;
        if (c1407 != null) {
            ((C1478) getFocusOwner()).f4193.m774(c1407);
            getSemanticsOwner().f5761.m774(c1407);
        }
        ((C1478) getFocusOwner()).f4193.m774(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        C2127 c2127 = (C2127) this.f5463.get();
        C1834 c1834 = (C1834) (c2127 != null ? c2127.f6276 : null);
        if (c1834 == null) {
            return getLegacyTextInputServiceAndroid().f5893;
        }
        C2127 c21272 = (C2127) c1834.f5327.get();
        C1910 c1910 = (C1910) (c21272 != null ? c21272.f6276 : null);
        return c1910 != null && (c1910.f5628 ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m3513(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        C2127 c2127 = (C2127) this.f5463.get();
        C1834 c1834 = (C1834) (c2127 != null ? c2127.f6276 : null);
        if (c1834 == null) {
            C2000 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
            if (legacyTextInputServiceAndroid.f5893) {
                C2025 c2025 = legacyTextInputServiceAndroid.f5899;
                C2013 c2013 = legacyTextInputServiceAndroid.f5900;
                int i2 = c2025.f5969;
                boolean z = c2025.f5973;
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
                        C5919.m11250("invalid ImeAction");
                        return null;
                    }
                }
                editorInfo.imeOptions = i;
                int i3 = c2025.f5970;
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
                        C5919.m11250("Invalid Keyboard Type");
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
                    int i6 = c2025.f5972;
                    if (i6 == 1) {
                        editorInfo.inputType = i5 | 4096;
                    } else if (i6 == 2) {
                        editorInfo.inputType = i5 | 8192;
                    } else if (i6 == 3) {
                        editorInfo.inputType = i5 | 16384;
                    }
                    if (c2025.f5971) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j = c2013.f5945;
                int i7 = C2035.f6001;
                editorInfo.initialSelStart = (int) (j >> 32);
                editorInfo.initialSelEnd = (int) (j & 4294967295L);
                AbstractC3054.m6593(editorInfo, c2013.f5946.f6128);
                editorInfo.imeOptions |= 33554432;
                if (C7712.m12979()) {
                    C7712.m12980().m12987(editorInfo);
                }
                InputConnectionC2012 inputConnectionC2012 = new InputConnectionC2012(legacyTextInputServiceAndroid.f5900, new C0113(legacyTextInputServiceAndroid, 28), legacyTextInputServiceAndroid.f5899.f5971);
                legacyTextInputServiceAndroid.f5903.add(new WeakReference(inputConnectionC2012));
                return inputConnectionC2012;
            }
        } else {
            C2127 c21272 = (C2127) c1834.f5327.get();
            final C1910 c1910 = (C1910) (c21272 != null ? c21272.f6276 : null);
            if (c1910 != null) {
                synchronized (c1910.f5630) {
                    if (c1910.f5628) {
                        return null;
                    }
                    InputConnection inputConnectionMo1656 = c1910.f5632.mo1656(editorInfo);
                    InterfaceC6557 interfaceC6557 = new InterfaceC6557() { // from class: androidx.compose.ui.platform.InputMethodSession$createInputConnection$1$1
                        {
                            super(1);
                        }

                        public final void invoke(InterfaceInputConnectionC2018 interfaceInputConnectionC2018) {
                            C2017 c2017 = (C2017) interfaceInputConnectionC2018;
                            InputConnection inputConnection = c2017.f5953;
                            if (inputConnection != null) {
                                inputConnection.closeConnection();
                                c2017.f5953 = null;
                            }
                            C1224 c1224 = c1910.f5629;
                            Object[] objArr = c1224.f3520;
                            int i8 = c1224.f3519;
                            int i9 = 0;
                            while (true) {
                                if (i9 >= i8) {
                                    i9 = -1;
                                    break;
                                } else if (AbstractC4394.m8917((C1762) objArr[i9], c2017)) {
                                    break;
                                } else {
                                    i9++;
                                }
                            }
                            if (i9 >= 0) {
                                c1910.f5629.m2043(i9);
                            }
                            C1910 c19102 = c1910;
                            if (c19102.f5629.f3519 == 0) {
                                c19102.f5631.invoke();
                            }
                        }

                        @Override // p052.InterfaceC6557
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((InterfaceInputConnectionC2018) obj);
                            return C5175.f14739;
                        }
                    };
                    InputConnection c2021 = Build.VERSION.SDK_INT >= 34 ? new C2021(inputConnectionMo1656, interfaceC6557) : new C2017(inputConnectionMo1656, interfaceC6557);
                    c1910.f5629.m2037(new C1762(c2021));
                    return c2021;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        C1953 c1953;
        ViewOnAttachStateChangeListenerC1421 viewOnAttachStateChangeListenerC1421 = this.f5424;
        viewOnAttachStateChangeListenerC1421.getClass();
        for (long j : jArr) {
            C1950 c1950 = (C1950) viewOnAttachStateChangeListenerC1421.m2537().m832((int) j);
            if (c1950 != null && (c1953 = c1950.f5760) != null) {
                AbstractC0921.m1840();
                ViewTranslationRequest.Builder builderM1837 = AbstractC0921.m1837(viewOnAttachStateChangeListenerC1421.f4098.getAutofillId(), c1953.f5766);
                List list = (List) AbstractC1957.m3663(c1953.f5768, AbstractC1943.f5717);
                if (list != null) {
                    builderM1837.setValue("android:text", TranslationRequestValue.forText(new C2068(AbstractC7913.m13383(list, "\n", null, 62))));
                    consumer.accept(builderM1837.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.f5435.onViewDetachedFromWindow(this);
        View view = this.f5432;
        if (m3505() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            C0244 c0244 = f5411;
            synchronized (c0244) {
                c0244.m775(this);
            }
        }
        getComposeViewContext().m3591();
        C1275 c1275 = getSnapshotObserver().f5273;
        C1267 c1267 = c1275.f3713;
        if (c1267 != null) {
            c1267.m2215();
        }
        c1275.m2238();
        AbstractC2402 lifecycle = getComposeViewContext().f5596.getLifecycle();
        lifecycle.mo4492(this.f5424);
        lifecycle.mo4492(this);
        C0325 c0325 = this.f5502;
        if (c0325 != null) {
            C1413 c1413 = C1413.f4076;
            c1413.getClass();
            ((AutofillManager) c0325.f1094).unregisterCallback(c1413);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        C1870 c1870 = this.f5477;
        if (c1870 != null) {
            c1870.f5374 = false;
        }
        this.f5477 = null;
        if (i >= 31) {
            C1827.f5318.m3451(this);
        }
        C1407 c1407 = this.f5486;
        if (c1407 != null) {
            getSemanticsOwner().f5761.m775(c1407);
            ((C1478) getFocusOwner()).f4193.m775(c1407);
        }
        C1961 rectManager = getRectManager();
        rectManager.f5818 = rectManager.f5821.m3682(0L, 0L, null, 0, 0);
        getRectManager().m3679();
        C1961 rectManager2 = getRectManager();
        RunnableC1892 runnableC1892 = rectManager2.f5824;
        if (runnableC1892 != null) {
            rectManager2.f5823.removeCallbacks(runnableC1892);
            rectManager2.f5824 = null;
        }
        ((C1478) getFocusOwner()).f4193.m775(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        C1478 c1478 = (C1478) getFocusOwner();
        AbstractC1459.m2599(c1478.f4189, true);
        if (c1478.m2633() != null) {
            C1452 c1452M2633 = c1478.m2633();
            c1478.m2635(null);
            if (c1452M2633 != null) {
                c1452M2633.m2591(FocusStateImpl.Active, FocusStateImpl.Inactive);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f5487 = 0L;
        m3512();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        m3513(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.f5487 = 0L;
            this.f5493.m3188(this.f5443);
            this.f5498 = null;
            m3512();
            if (this.f5497 != null) {
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
        C1743 c1743 = this.f5493;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m3534(getRoot());
            }
            long jM3508 = m3508(i);
            long jM35082 = m3508(i2);
            long jM11407 = AbstractC6087.m11407((int) (jM3508 >>> 32), (int) (jM3508 & 4294967295L), (int) (jM35082 >>> 32), (int) (4294967295L & jM35082));
            C7897 c7897 = this.f5498;
            if (c7897 == null) {
                this.f5498 = new C7897(jM11407);
                this.f5494 = false;
            } else if (!C7897.m13307(c7897.f21868, jM11407)) {
                this.f5494 = true;
            }
            c1743.m3179(jM11407);
            c1743.m3180();
            setMeasuredDimension(getRoot().f5131.f5166.f4998, getRoot().f5131.f5166.f4996);
            if (this.f5497 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f5131.f5166.f4998, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f5131.f5166.f4996, 1073741824));
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r12, int r13) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        InterfaceC1641 interfaceC1641;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(DexMap.TYPE_STRING_DATA_ITEM) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (interfaceC1641 = ((C1894) getPointerIconService()).f5561) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return interfaceC1641 instanceof C1634 ? PointerIcon.getSystemIcon(context, ((C1634) interfaceC1641).f4778) : PointerIcon.getSystemIcon(context, DescriptorProtos$Edition.EDITION_2023_VALUE);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.f5479) {
            int[] iArr = AbstractC1481.f4201;
            LayoutDirection layoutDirection = i != 0 ? i != 1 ? null : LayoutDirection.Rtl : LayoutDirection.Ltr;
            if (layoutDirection == null) {
                layoutDirection = LayoutDirection.Ltr;
            }
            setLayoutDirection(layoutDirection);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        C1928 c1928;
        if (Build.VERSION.SDK_INT < 31 || (c1928 = this.f5444) == null) {
            return;
        }
        c1928.m3626(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m3512();
    }

    @Override // androidx.lifecycle.InterfaceC2409
    public final void onStop(InterfaceC2388 interfaceC2388) {
        C1870 c1870 = this.f5477;
        if (c1870 != null) {
            C2411 c2411 = (C2411) c1870.f5376.f357;
            if (c2411.f7050 && !c2411.f7049) {
                InterfaceC1352 interfaceC1352 = c1870.f5373;
                if (interfaceC1352 != null) {
                    interfaceC1352.cancel();
                }
                c1870.f5373 = null;
                return;
            }
            if (c2411.f7048) {
                return;
            }
            if (!c2411.f7049) {
                AbstractC7349.m12516("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!((C0236) c2411.f7047).m759()) {
                AbstractC7349.m12516("Attempted to start retaining exited values with pending exited values");
            }
            c2411.f7049 = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        ((AbstractC1347) this.f5449.f19530).setValue(new C7324(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ViewOnAttachStateChangeListenerC1421 viewOnAttachStateChangeListenerC1421 = this.f5424;
        viewOnAttachStateChangeListenerC1421.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (AbstractC4394.m8917(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            AbstractC7738.m13059(viewOnAttachStateChangeListenerC1421, longSparseArray);
        } else {
            viewOnAttachStateChangeListenerC1421.f4098.post(new RunnableC0099(viewOnAttachStateChangeListenerC1421, 1, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zM3620;
        this.f5446 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zM3620 = AbstractC1916.m3620())) {
            return;
        }
        setShowLayoutBounds(zM3620);
        m3504(getRoot());
    }

    @Override // androidx.compose.ui.node.InterfaceC1801
    public void registerOnLayoutCompletedListener(InterfaceC1802 interfaceC1802) {
        this.f5493.registerOnLayoutCompletedListener(interfaceC1802);
        m3525(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (!isFocused()) {
            C1464 c1464M2640 = AbstractC1481.m2640(i);
            final int i2 = c1464M2640 != null ? c1464M2640.f4160 : 7;
            Boolean boolM2634 = ((C1478) getFocusOwner()).m2634(i2, rect != null ? new C7327(rect.left, rect.top, rect.right, rect.bottom) : null, new InterfaceC6557() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithPrevRect$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p052.InterfaceC6557
                public final Boolean invoke(C1452 c1452) {
                    return Boolean.valueOf(c1452.m2586(i2));
                }
            });
            Boolean bool = Boolean.TRUE;
            if (!AbstractC4394.m8917(boolM2634, bool)) {
                if (!AbstractC4394.m8917(((C1478) getFocusOwner()).m2634(i2, null, new InterfaceC6557() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithoutPrevRect$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p052.InterfaceC6557
                    public final Boolean invoke(C1452 c1452) {
                        return Boolean.valueOf(c1452.m2586(i2));
                    }
                }), bool)) {
                    if (!hasFocus()) {
                        return false;
                    }
                    if (i2 == 1 || i2 == 2) {
                        return ((C1478) getFocusOwner()).m2638(i2);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.f5423.f5532 = j;
    }

    public final void setComposeViewContext(C1903 c1903) {
        if (getCoroutineContext() != c1903.f5597.mo2324() && !((C0242) getRoot().m3247()).isEmpty()) {
            AbstractC7935.m13397("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        AbstractC1286 abstractC1286M2221 = AbstractC1274.m2221();
        InterfaceC6557 interfaceC6557Mo2193 = abstractC1286M2221 != null ? abstractC1286M2221.mo2193() : null;
        AbstractC1286 abstractC1286M2233 = AbstractC1274.m2233(abstractC1286M2221);
        try {
            C1903 c19032 = get_composeViewContext();
            if (c1903 != c19032) {
                if (isAttachedToWindow()) {
                    c19032.m3591();
                    c1903.m3590();
                }
                set_composeViewContext(c1903);
                setCoroutineContext(c1903.f5597.mo2324());
            }
        } finally {
            AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.f5447 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        ((AbstractC1347) this.f5504).setValue(configuration);
    }

    public final void setContentCaptureManager$ui(ViewOnAttachStateChangeListenerC1421 viewOnAttachStateChangeListenerC1421) {
        this.f5424 = viewOnAttachStateChangeListenerC1421;
    }

    public void setCoroutineContext(InterfaceC4359 interfaceC4359) {
        this.f5430 = interfaceC4359;
    }

    public final void setFrameEndScheduler$ui(InterfaceC1869 interfaceC1869) {
        this.f5476 = interfaceC1869;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.f5487 = j;
    }

    public final void setOnReadyForComposition(InterfaceC6557 interfaceC6557) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.f5447) {
            interfaceC6557.invoke(getComposeViewContext());
        } else {
            this.f5464 = interfaceC6557;
        }
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m3511setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(C7321 c7321) {
        this.f5473 = c7321;
    }

    public void setShowLayoutBounds(boolean z) {
        this.f5481 = z;
    }

    public void setUncaughtExceptionHandler(InterfaceC1798 interfaceC1798) {
        this.f5493.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3512() {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884.m3512():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m3513(Configuration configuration) {
        InterfaceC1395 interfaceC1395;
        Configuration configuration2 = getConfiguration();
        if (AbstractC4394.m8917(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(AbstractC4921.m9889(getContext()));
        }
        InterfaceC6557 interfaceC6557 = AbstractC1836.f5337;
        if ((configuration2.diff(configuration) & (-1342235264)) == 0 || (interfaceC1395 = this.f5440.f5366) == null) {
            return;
        }
        ((AbstractC1347) interfaceC1395).setValue(AbstractC1916.m3607(this));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m3514(float f) {
        if (m3505()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.f5456) || f > this.f5456) {
                    this.f5456 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.f5457) || f < this.f5457) {
                    this.f5457 = f;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void m3515(MotionEvent motionEvent) {
        this.f5487 = AnimationUtils.currentAnimationTimeMillis();
        InterfaceC1814 interfaceC1814 = this.f5442;
        float[] fArr = this.f5492;
        interfaceC1814.mo3439(this, fArr);
        AbstractC1916.m3611(fArr, this.f5488);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jM2896 = C1587.m2896((((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jM2896 >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jM2896 & 4294967295L));
        this.f5489 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m3516() {
        if (this.f5490) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f5487) {
            this.f5487 = jCurrentAnimationTimeMillis;
            InterfaceC1814 interfaceC1814 = this.f5442;
            float[] fArr = this.f5492;
            interfaceC1814.mo3439(this, fArr);
            AbstractC1916.m3611(fArr, this.f5488);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f5495;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f5489 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m3517() {
        ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC1885 = this.f5423;
        viewOnAttachStateChangeListenerC1885.f5517 = true;
        Handler handler = viewOnAttachStateChangeListenerC1885.f5531.getHandler();
        if (viewOnAttachStateChangeListenerC1885.m3570() && !viewOnAttachStateChangeListenerC1885.f5536 && handler != null) {
            viewOnAttachStateChangeListenerC1885.f5536 = true;
            handler.post(viewOnAttachStateChangeListenerC1885.f5541);
        }
        ViewOnAttachStateChangeListenerC1421 viewOnAttachStateChangeListenerC1421 = this.f5424;
        viewOnAttachStateChangeListenerC1421.f4095 = true;
        Handler handler2 = viewOnAttachStateChangeListenerC1421.f4098.getHandler();
        if (!viewOnAttachStateChangeListenerC1421.m2536() || viewOnAttachStateChangeListenerC1421.f4086 || handler2 == null) {
            return;
        }
        viewOnAttachStateChangeListenerC1421.f4086 = true;
        handler2.post(viewOnAttachStateChangeListenerC1421.f4085);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m3518(C1748 c1748, boolean z, boolean z2) {
        C1756 c1756 = c1748.f5131;
        C1743 c1743 = this.f5493;
        if (!z) {
            c1743.getClass();
            int i = AbstractC1742.f5045[c1756.f5158.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                return;
            }
            if (i != 5) {
                C4210.m8621();
                return;
            }
            C1748 c1748M3246 = c1748.m3246();
            boolean z3 = c1748M3246 == null || c1748M3246.m3232();
            if (!z2) {
                if (c1748.m3249()) {
                    return;
                }
                if (c1748.m3252() && c1748.m3232() == z3 && c1748.m3232() == c1756.f5166.f5031) {
                    return;
                }
            }
            C1738 c1738 = c1756.f5166;
            c1738.f5029 = true;
            c1738.f5020 = true;
            if (!c1748.f5125 && c1738.f5031 && z3) {
                if ((c1748M3246 == null || !c1748M3246.m3252()) && (c1748M3246 == null || !c1748M3246.m3249())) {
                    c1743.f5050.m3318(c1748, Invalidation.Placement);
                }
                if (c1743.f5048) {
                    return;
                }
                m3525(null);
                return;
            }
            return;
        }
        C1778 c1778 = c1743.f5050;
        int i2 = AbstractC1742.f5045[c1756.f5158.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return;
                }
                if (i2 != 4 && i2 != 5) {
                    C4210.m8621();
                    return;
                }
            }
            if ((c1756.f5157 || c1756.f5156) && !z2) {
                return;
            }
            c1756.f5156 = true;
            c1756.f5168 = true;
            C1738 c17382 = c1756.f5166;
            c17382.f5029 = true;
            c17382.f5020 = true;
            if (c1748.f5125) {
                return;
            }
            C1748 c1748M32462 = c1748.m3246();
            if (AbstractC4394.m8917(c1748.m3231(), Boolean.TRUE) && ((c1748M32462 == null || !c1748M32462.f5131.f5157) && (c1748M32462 == null || !c1748M32462.f5131.f5156))) {
                c1778.m3318(c1748, Invalidation.LookaheadPlacement);
            } else if (c1748.m3232() && ((c1748M32462 == null || !c1748M32462.m3252()) && (c1748M32462 == null || !c1748M32462.m3249()))) {
                c1778.m3318(c1748, Invalidation.Placement);
            }
            if (c1743.f5048) {
                return;
            }
            m3525(null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m3519(C1748 c1748, boolean z, boolean z2, boolean z3) {
        C1748 c1748M3246;
        C1748 c1748M32462;
        C1743 c1743 = this.f5493;
        if (!z) {
            if (c1743.m3183(c1748, z2) && z3) {
                m3525(c1748);
                return;
            }
            return;
        }
        C1778 c1778 = c1743.f5050;
        C1748 c17482 = c1748.f5119;
        C1756 c1756 = c1748.f5131;
        if (c17482 == null) {
            AbstractC7935.m13395("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i = AbstractC1742.f5045[c1756.f5158.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4) {
                c1743.f5052.m2037(new C1746(c1748, true, z2));
                return;
            }
            if (i != 5) {
                C4210.m8621();
                return;
            }
            if (!c1756.f5157 || z2) {
                c1756.f5157 = true;
                c1756.f5166.f5030 = true;
                if (c1748.f5125) {
                    return;
                }
                if ((AbstractC4394.m8917(c1748.m3231(), Boolean.TRUE) || C1743.m3174(c1748)) && ((c1748M3246 = c1748.m3246()) == null || !c1748M3246.f5131.f5157)) {
                    c1778.m3318(c1748, Invalidation.LookaheadMeasurement);
                } else if ((c1748.m3232() || C1743.m3175(c1748)) && ((c1748M32462 = c1748.m3246()) == null || !c1748M32462.m3249())) {
                    c1778.m3318(c1748, Invalidation.Measurement);
                }
                if (c1743.f5048 || !z3) {
                    return;
                }
                m3525(c1748);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m3520(C1748 c1748) {
        ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC1885 = this.f5423;
        viewOnAttachStateChangeListenerC1885.f5517 = true;
        if (viewOnAttachStateChangeListenerC1885.m3570()) {
            viewOnAttachStateChangeListenerC1885.m3568(c1748);
        }
        ViewOnAttachStateChangeListenerC1421 viewOnAttachStateChangeListenerC1421 = this.f5424;
        viewOnAttachStateChangeListenerC1421.f4095 = true;
        if (viewOnAttachStateChangeListenerC1421.m2536()) {
            viewOnAttachStateChangeListenerC1421.f4092.mo8445(C5175.f14739);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.coroutines.intrinsics.CoroutineSingletons m3521(p052.InterfaceC6553 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.platform.AndroidComposeView$textInputSession$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = (androidx.compose.ui.platform.AndroidComposeView$textInputSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 == r4) goto L2a
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r3
        L2a:
            kotlin.AbstractC5184.m10206(r7)
            goto L41
        L2e:
            kotlin.AbstractC5184.m10206(r7)
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$2 r7 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$2
            r7.<init>()
            r0.label = r4
            java.util.concurrent.atomic.AtomicReference r5 = r5.f5463
            java.lang.Object r5 = androidx.compose.ui.AbstractC2120.m3850(r5, r7, r6, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            io.ktor.util.C4210.m8612()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884.m3521(飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):kotlin.coroutines.intrinsics.CoroutineSingletons");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m3522(MotionEvent motionEvent, int i, long j, boolean z) {
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
            long jM3528 = m3528((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jM3528 >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jM3528 & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C0076 c0076M3033 = this.f5499.m3033(this, motionEventObtain);
        c0076M3033.getClass();
        this.f5503.m1547(c0076M3033, this, true);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final int m3523(MotionEvent motionEvent) {
        Object obj;
        if (this.f5446) {
            this.f5446 = false;
            C1865 c1865 = getComposeViewContext().f5600;
            int metaState = motionEvent.getMetaState();
            c1865.getClass();
            ((AbstractC1347) AbstractC1849.f5353).setValue(new C1637(metaState));
        }
        C1648 c1648 = this.f5499;
        C0076 c0076M3033 = c1648.m3033(this, motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C0748 c0748 = this.f5503;
        if (c0076M3033 == null) {
            if (!c0748.f2155) {
                ((C0263) ((C0113) c0748.f2152).f357).m826();
                ((C1631) c0748.f2153).m3003();
            }
            return 0;
        }
        List list = (List) c0076M3033.f227;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = list.get(size);
                if (((C1636) obj).f4780 && (actionMasked == 0 || actionMasked == 5)) {
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
        C1636 c1636 = (C1636) obj;
        if (c1636 != null) {
            this.f5478 = c1636.f4781;
        }
        int iM1547 = c0748.m1547(c0076M3033, this, m3535(motionEvent));
        c0076M3033.f228 = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iM1547 & 1) != 0) {
            return iM1547;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        c1648.f4837.delete(pointerId);
        c1648.f4838.delete(pointerId);
        return iM1547;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final long m3524(long j) {
        m3516();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.f5489 >> 32));
        return C1587.m2896((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.f5489 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.f5488);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m3525(C1748 c1748) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (c1748 != null) {
            while (c1748 != null && c1748.m3250() == LayoutNode$UsageByParent.InMeasureBlock) {
                if (!this.f5494) {
                    C1748 c1748M3246 = c1748.m3246();
                    if (c1748M3246 == null) {
                        break;
                    }
                    long j = c1748M3246.f5093.f5285.f4995;
                    if (C7897.m13303(j) && C7897.m13304(j)) {
                        break;
                    }
                }
                c1748 = c1748.m3246();
            }
            if (c1748 == getRoot()) {
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
    public final boolean m3526() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    @Override // androidx.lifecycle.InterfaceC2409
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo3527(InterfaceC2388 interfaceC2388) {
        InterfaceC1352 interfaceC1352Mo2309;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(AbstractC1916.m3620());
        }
        final C1870 c1870 = this.f5477;
        if (c1870 != null) {
            InterfaceC1869 interfaceC1869 = this.f5476;
            interfaceC1869.getClass();
            C0113 c0113 = c1870.f5376;
            C2411 c2411 = (C2411) c0113.f357;
            if (!c2411.f7050 || c2411.f7049) {
                return;
            }
            try {
                interfaceC1352Mo2309 = ((C1852) interfaceC1869).f5360.mo2309(new InterfaceC6542() { // from class: androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry$stopRetainingExitedValues$1
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m3430invoke() {
                        C2411 c24112 = (C2411) c1870.f5376.f357;
                        if (c24112.f7048) {
                            return;
                        }
                        if (c24112.f7049) {
                            AbstractC7349.m12516("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                        }
                        c24112.m4504();
                        c24112.f7049 = true;
                    }

                    @Override // p052.InterfaceC6542
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m3430invoke();
                        return C5175.f14739;
                    }
                });
            } catch (CancellationException unused) {
                C2411 c24112 = (C2411) c0113.f357;
                if (!c24112.f7048) {
                    if (c24112.f7049) {
                        AbstractC7349.m12516("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    c24112.m4504();
                    c24112.f7049 = true;
                }
                interfaceC1352Mo2309 = null;
            }
            InterfaceC1352 interfaceC1352 = c1870.f5373;
            if (interfaceC1352 != null) {
                interfaceC1352.cancel();
            }
            c1870.f5373 = interfaceC1352Mo2309;
        }
    }

    @Override // androidx.compose.ui.focus.InterfaceC1484
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2532(C1452 c1452, C1452 c14522) {
        C1811 c1811;
        boolean z;
        C1811 c18112;
        boolean z2;
        if (c1452 != null) {
            C1452 c14523 = c1452;
            if (!c14523.f6291.f6278) {
                AbstractC7935.m13395("visitAncestors called on an unattached node");
            }
            AbstractC2128 abstractC2128 = c14523.f6291;
            C1748 c1748M3336 = AbstractC1785.m3336(c1452);
            C0235 c0235 = null;
            ArrayList arrayList = null;
            while (c1748M3336 != null) {
                if ((c1748M3336.f5093.f5282.f6284 & 2097152) != 0) {
                    while (abstractC2128 != null) {
                        if ((abstractC2128.f6290 & 2097152) != 0) {
                            AbstractC2128 abstractC2128M3329 = abstractC2128;
                            C1224 c1224 = null;
                            while (abstractC2128M3329 != null) {
                                if (abstractC2128M3329 instanceof InterfaceC7319) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(abstractC2128M3329);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (abstractC2128M3329.f6290 & 2097152) != 0 && (abstractC2128M3329 instanceof AbstractC1788)) {
                                    int i = 0;
                                    for (AbstractC2128 abstractC21282 = ((AbstractC1788) abstractC2128M3329).f5225; abstractC21282 != null; abstractC21282 = abstractC21282.f6287) {
                                        if ((abstractC21282.f6290 & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                abstractC2128M3329 = abstractC21282;
                                            } else {
                                                if (c1224 == null) {
                                                    c1224 = new C1224(0, new AbstractC2128[16]);
                                                }
                                                if (abstractC2128M3329 != null) {
                                                    c1224.m2037(abstractC2128M3329);
                                                    abstractC2128M3329 = null;
                                                }
                                                c1224.m2037(abstractC21282);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                abstractC2128M3329 = AbstractC1785.m3329(c1224);
                            }
                        }
                        abstractC2128 = abstractC2128.f6283;
                    }
                }
                c1748M3336 = c1748M3336.m3246();
                abstractC2128 = (c1748M3336 == null || (c18112 = c1748M3336.f5093) == null) ? null : c18112.f5283;
            }
            if (arrayList == null) {
                return;
            }
            if (c14522 != null) {
                if (!c14522.f6291.f6278) {
                    AbstractC7935.m13395("visitAncestors called on an unattached node");
                }
                AbstractC2128 abstractC21283 = c14522.f6291;
                C1748 c1748M33362 = AbstractC1785.m3336(c14522);
                C0235 c02352 = null;
                while (c1748M33362 != null) {
                    if ((c1748M33362.f5093.f5282.f6284 & 2097152) != 0) {
                        while (abstractC21283 != null) {
                            if ((abstractC21283.f6290 & 2097152) != 0) {
                                AbstractC2128 abstractC2128M33292 = abstractC21283;
                                C1224 c12242 = null;
                                while (abstractC2128M33292 != null) {
                                    if (abstractC2128M33292 instanceof InterfaceC7319) {
                                        if (c02352 == null) {
                                            C0235 c02353 = AbstractC0285.f997;
                                            c02352 = new C0235();
                                        }
                                        c02352.m740(abstractC2128M33292);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (abstractC2128M33292.f6290 & 2097152) != 0 && (abstractC2128M33292 instanceof AbstractC1788)) {
                                        int i2 = 0;
                                        for (AbstractC2128 abstractC21284 = ((AbstractC1788) abstractC2128M33292).f5225; abstractC21284 != null; abstractC21284 = abstractC21284.f6287) {
                                            if ((abstractC21284.f6290 & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    abstractC2128M33292 = abstractC21284;
                                                } else {
                                                    if (c12242 == null) {
                                                        c12242 = new C1224(0, new AbstractC2128[16]);
                                                    }
                                                    if (abstractC2128M33292 != null) {
                                                        c12242.m2037(abstractC2128M33292);
                                                        abstractC2128M33292 = null;
                                                    }
                                                    c12242.m2037(abstractC21284);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    abstractC2128M33292 = AbstractC1785.m3329(c12242);
                                }
                            }
                            abstractC21283 = abstractC21283.f6283;
                        }
                    }
                    c1748M33362 = c1748M33362.m3246();
                    abstractC21283 = (c1748M33362 == null || (c1811 = c1748M33362.f5093) == null) ? null : c1811.f5283;
                }
                c0235 = c02352;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC7319 interfaceC7319 = (InterfaceC7319) arrayList.get(i3);
                if (!(c0235 != null ? c0235.m873(interfaceC7319) : false)) {
                    interfaceC7319.mo1224();
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long m3528(long j) {
        m3516();
        long jM2896 = C1587.m2896(j, this.f5492);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f5489 >> 32)) + Float.intBitsToFloat((int) (jM2896 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f5489 & 4294967295L)) + Float.intBitsToFloat((int) (jM2896 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m3529(float[] fArr) {
        m3516();
        C1587.m2893(fArr, this.f5492);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f5489 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f5489 & 4294967295L));
        InterfaceC6557 interfaceC6557 = AbstractC1836.f5337;
        float[] fArr2 = this.f5491;
        C1587.m2894(fArr2);
        C1587.m2892(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        AbstractC1836.m3459(fArr, fArr2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean m3530(int i) {
        if (i != 7 && i != 8) {
            Integer numM2641 = AbstractC1481.m2641(i);
            if (numM2641 == null) {
                throw AbstractC0053.m139("Invalid focus direction");
            }
            int iIntValue = numM2641.intValue();
            C1452 c1452M2633 = ((C1478) getFocusOwner()).m2633();
            if (c1452M2633 == null) {
                C5919.m11250("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer numM26412 = AbstractC1481.m2641(i);
            if (numM26412 == null) {
                throw AbstractC0053.m139("Invalid focus direction");
            }
            int iIntValue2 = numM26412.intValue();
            AbstractC2076 abstractC2076 = AbstractC1785.m3336(c1452M2633).f5115;
            View interopView = abstractC2076 != null ? abstractC2076.getInteropView() : null;
            View viewFindFocus = findFocus();
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            rootView.getClass();
            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
            if (viewFindNextFocus == null || interopView == null || !AbstractC1836.m3461(interopView, viewFindNextFocus)) {
                viewFindNextFocus = null;
            }
            if (viewFindNextFocus != null) {
                return AbstractC1481.m2642(viewFindNextFocus, Integer.valueOf(iIntValue), null);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m3531() {
        if (this.f5485) {
            getSnapshotObserver().m3402();
            this.f5485 = false;
        }
        C1817 c1817 = this.f5497;
        if (c1817 != null) {
            m3507(c1817);
        }
        C1407 c1407 = this.f5486;
        if (c1407 != null) {
            C0245 c0245 = c1407.f4063;
            if (c0245.f899 == 0 && c1407.f4064) {
                ((AutofillManager) c1407.f4069.f357).commit();
                c1407.f4064 = false;
            }
            if (c0245.f899 != 0) {
                c1407.f4064 = true;
            }
        }
        while (true) {
            C0244 c0244 = this.f5468;
            if (!c0244.m877() || c0244.m880(0) == null) {
                return;
            }
            int i = c0244.f1004;
            for (int i2 = 0; i2 < i; i2++) {
                InterfaceC6542 interfaceC6542 = (InterfaceC6542) c0244.m880(i2);
                c0244.m771(i2, null);
                if (interfaceC6542 != null) {
                    interfaceC6542.invoke();
                }
            }
            c0244.m770(0, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m3532(boolean z) {
        InterfaceC6542 interfaceC6542;
        C1743 c1743 = this.f5493;
        if (c1743.f5050.m3319() || ((C1224) c1743.f5047.f227).f3519 != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    interfaceC6542 = this.f5443;
                } finally {
                    Trace.endSection();
                }
            } else {
                interfaceC6542 = null;
            }
            if (c1743.m3188(interfaceC6542)) {
                requestLayout();
            }
            c1743.m3178(false);
            getRectManager().m3679();
            if (this.f5500) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f5500 = false;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m3533(C1748 c1748, long j) {
        C1743 c1743 = this.f5493;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            c1743.m3181(c1748, j);
            if (!c1743.f5050.m3319()) {
                c1743.m3178(false);
                getRectManager().m3679();
                if (this.f5500) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f5500 = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m3534(C1748 c1748) {
        this.f5493.m3183(c1748, false);
        C1224 c1224M3229 = c1748.m3229();
        Object[] objArr = c1224M3229.f3520;
        int i = c1224M3229.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            m3534((C1748) objArr[i2]);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean m3535(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m3536(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f5467) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m3537(C1748 c1748, boolean z) {
        this.f5493.m3187(c1748, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m3538(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884.m3538(android.view.MotionEvent):int");
    }

    /* JADX INFO: renamed from: getAccessibilityManager, reason: merged with bridge method [inline-methods] */
    public C1895 m3539getAccessibilityManager() {
        return this.f5420;
    }

    /* JADX INFO: renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public C1899 m3540getClipboard() {
        return this.f5483;
    }

    /* JADX INFO: renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public C1900 m3541getClipboardManager() {
        return this.f5484;
    }

    public ViewOnDragListenerC1428 getDragAndDropManager() {
        return this.f5429;
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public C0246 m3543getLayoutNodes() {
        return this.f5425;
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

    @InterfaceC5168
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m3499getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @InterfaceC5168
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public InterfaceC1797 getRootForTest() {
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

    public final void setUncaughtExceptionHandler$ui(InterfaceC1798 interfaceC1798) {
    }
}
