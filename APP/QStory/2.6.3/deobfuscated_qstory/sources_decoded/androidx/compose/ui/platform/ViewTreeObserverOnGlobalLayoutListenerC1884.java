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
import bsh.C2633;
import com.alibaba.fastjson2.C2942;
import com.davemorrissey.labs.subscaleview.R;
import com.google.protobuf.DescriptorProtos$Edition;
import io.ktor.util.C4211;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.C5176;
import kotlin.InterfaceC5169;
import kotlin.NotImplementedError;
import kotlin.collections.C4351;
import kotlin.coroutines.InterfaceC4360;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.jvm.internal.AbstractC5062;
import p034.AbstractC6347;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p053.AbstractC6561;
import p108.InterfaceC7317;
import p110.C7322;
import p110.InterfaceC7320;
import p111.C7323;
import p111.C7325;
import p111.InterfaceC7324;
import p112.C7328;
import p114.C7335;
import p114.InterfaceC7333;
import p117.AbstractC7350;
import p160.C7637;
import p167.C7713;
import p194.C7832;
import p194.C7833;
import p205.C7898;
import p205.InterfaceC7896;
import p207.AbstractC7914;
import p210.AbstractC7936;
import top.linl.dexparser.bean.DexMap;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1884 extends ViewGroup implements InterfaceC1801, InterfaceC1797, InterfaceC2409, InterfaceC1805, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, InterfaceC1484 {

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public static final C0244 f5412 = new C0244();

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    public static RunnableC1898 f5413;

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public static Class f5414;

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public static Method f5415;

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public static Method f5416;

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public static Method f5417;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public C0244 f5418;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public boolean f5419;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final C1591 f5420;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final C1895 f5421;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final C0244 f5422;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final C1418 f5423;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC1885 f5424;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public ViewOnAttachStateChangeListenerC1421 f5425;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final C0246 f5426;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C1748 f5427;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final C1951 f5428;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C1961 f5429;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final ViewOnDragListenerC1428 f5430;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public InterfaceC4360 f5431;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C1478 f5432;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final View f5433;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC1395 f5434;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final RunnableC1897 f5435;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final RunnableC1701 f5436;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C1821 f5437;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C1602 f5438;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final C1362 f5439;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final InterfaceC1395 f5440;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C1865 f5441;

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public final C1894 f5442;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final InterfaceC1814 f5443;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final InterfaceC6543 f5444;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public final C1928 f5445;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public View f5446;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public boolean f5447;

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    public boolean f5448;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public final InterfaceC7317 f5449;

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public final C7323 f5450;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public final InterfaceC1991 f5451;

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public C1901 f5452;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public final InterfaceC1395 f5453;

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public final InterfaceC1395 f5454;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public final RunnableC0062 f5455;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public final RunnableC1897 f5456;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public float f5457;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public float f5458;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public final C1908 f5459;

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public boolean f5460;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public final C1362 f5461;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final InterfaceC1395 f5462;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public C2014 f5463;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final AtomicReference f5464;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public InterfaceC6558 f5465;

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public C2000 f5466;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public long f5467;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public MotionEvent f5468;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final C0244 f5469;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public final C0076 f5470;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public final C1734 f5471;

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public final C1833 f5472;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C1758 f5473;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C7322 f5474;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public InterfaceC7333 f5475;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C4351 f5476;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC1869 f5477;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C1870 f5478;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f5479;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f5480;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1395 f5481;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public boolean f5482;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final C1803 f5483;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final C1899 f5484;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final C1900 f5485;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public boolean f5486;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final C1407 f5487;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public long f5488;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final float[] f5489;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public long f5490;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public boolean f5491;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final float[] f5492;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final float[] f5493;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final C1743 f5494;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public boolean f5495;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final int[] f5496;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public long f5497;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public C1817 f5498;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public C7898 f5499;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final C1648 f5500;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public boolean f5501;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final C1362 f5502;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final C0325 f5503;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final C0748 f5504;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final InterfaceC1395 f5505;

    public ViewTreeObserverOnGlobalLayoutListenerC1884(Context context, C1903 c1903) {
        super(context);
        this.f5481 = AbstractC1367.m2474(c1903);
        this.f5479 = 9205357640488583168L;
        int i = 1;
        this.f5480 = true;
        this.f5473 = c1903.f5608;
        this.f5475 = C7335.f19547;
        this.f5476 = new C4351();
        this.f5435 = new RunnableC1897(this, 0);
        this.f5434 = AbstractC1367.m2475(AbstractC6347.m11904(context), C1353.f3919);
        this.f5432 = new C1478(this, this);
        this.f5431 = c1903.f5598.mo2334();
        new AndroidComposeView$dragAndDropManager$1(this);
        this.f5430 = new ViewOnDragListenerC1428();
        this.f5441 = new C1865();
        this.f5440 = AbstractC1367.m2474(Boolean.FALSE);
        this.f5439 = AbstractC1367.m2496(new InterfaceC6543() { // from class: androidx.compose.ui.platform.AndroidComposeView$derivedIsAttached$2
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final Boolean invoke() {
                Boolean bool = (Boolean) ((AbstractC1347) this.this$0.f5440).getValue();
                bool.booleanValue();
                return bool;
            }
        });
        this.f5438 = c1903.f5600;
        this.f5437 = c1903.f5607;
        this.f5436 = new RunnableC1701();
        C1748 c1748 = new C1748(3);
        c1748.m3271(C1721.f4993);
        c1748.m3275(getDensity());
        c1748.m3269(getViewConfiguration());
        c1748.m3270(new C1891(this).mo3866(((C1478) getFocusOwner()).f4188).mo3866(getDragAndDropManager().f4107));
        this.f5427 = c1748;
        C0246 c0246 = AbstractC0273.f978;
        this.f5426 = new C0246();
        m3553getLayoutNodes();
        this.f5429 = new C1961(this);
        this.f5428 = new C1951(getRoot(), new C1937(), m3553getLayoutNodes());
        ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC1885 = new ViewOnAttachStateChangeListenerC1885(this);
        this.f5424 = viewOnAttachStateChangeListenerC1885;
        this.f5425 = new ViewOnAttachStateChangeListenerC1421(this, new AndroidComposeView$contentCaptureManager$1(this));
        this.f5421 = c1903.f5616;
        this.f5420 = new C1591(this);
        this.f5423 = new C1418();
        this.f5422 = new C0244();
        this.f5500 = new C1648();
        C1748 root = getRoot();
        C0748 c0748 = new C0748();
        c0748.f2155 = root;
        c0748.f2154 = new C1631(root.f5094.f5286);
        c0748.f2153 = new C0113(23);
        c0748.f2152 = new C1780();
        this.f5504 = c0748;
        this.f5505 = AbstractC1367.m2474(new Configuration(context.getResources().getConfiguration()));
        this.f5502 = AbstractC1367.m2496(new InterfaceC6543() { // from class: androidx.compose.ui.platform.AndroidComposeView$localeList$2
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final C7832 invoke() {
                LocaleList locales = this.this$0.getConfiguration().getLocales();
                C2178 c2178 = new C2178(new C2182(locales));
                if (locales.isEmpty()) {
                    c2178 = new C2178(new C2182(LocaleList.getDefault()));
                }
                C2182 c2182 = c2178.f6453;
                int size = c2182.f6455.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Locale locale = c2182.f6455.get(i2);
                    locale.getClass();
                    arrayList.add(new C7833(locale));
                }
                return new C7832(arrayList);
            }
        });
        this.f5503 = new C0325(this, getAutofillTree());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw AbstractC0053.m139("Autofill service could not be located.");
        }
        this.f5487 = new C1407(new C0113(autofillManager, 19), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.f5485 = c1903.f5614;
        this.f5484 = c1903.f5606;
        this.f5483 = new C1803(new AndroidComposeView$snapshotObserver$1(this));
        this.f5494 = new C1743(getRoot());
        this.f5497 = 9223372034707292159L;
        this.f5496 = new int[]{0, 0};
        float[] fArrM2907 = C1587.m2907();
        this.f5492 = fArrM2907;
        this.f5493 = C1587.m2907();
        this.f5489 = C1587.m2907();
        this.f5488 = -1L;
        this.f5490 = 9187343241974906880L;
        this.f5462 = AbstractC1367.m2474(null);
        this.f5461 = AbstractC1367.m2496(new InterfaceC6543() { // from class: androidx.compose.ui.platform.AndroidComposeView$viewTreeOwners$2
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final AbstractC1889 invoke() {
                this.this$0.get_viewTreeOwners();
                return null;
            }
        });
        this.f5464 = new AtomicReference(null);
        this.f5451 = c1903.f5605;
        this.f5454 = c1903.f5609;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = AbstractC1481.f4202;
        LayoutDirection layoutDirection2 = layoutDirection != 0 ? layoutDirection != 1 ? null : LayoutDirection.Rtl : LayoutDirection.Ltr;
        this.f5453 = AbstractC1367.m2474(layoutDirection2 == null ? LayoutDirection.Ltr : layoutDirection2);
        this.f5449 = c1903.f5610;
        this.f5450 = new C7323(isInTouchMode() ? 1 : 2);
        this.f5471 = new C1734(this);
        this.f5472 = new C1833(this);
        this.f5470 = new C0076(9);
        this.f5469 = new C0244();
        this.f5455 = new RunnableC0062(this, 4);
        this.f5456 = new RunnableC1897(this, i);
        this.f5459 = new C1908(context, new InterfaceC6558() { // from class: androidx.compose.ui.platform.AndroidComposeView$indirectPointerNavigationGestureDetector$1
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
            public /* synthetic */ Object invoke(Object obj) {
                m3431invoke3ESFkO8(((C1464) obj).f4161);
                return C5176.f14739;
            }

            /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final void m3431invoke3ESFkO8(int i2) {
                ((C1478) this.this$0.getFocusOwner()).m2647(i2, false);
            }
        });
        this.f5444 = new InterfaceC6543() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m3432invoke() {
                MotionEvent motionEvent = this.this$0.f5468;
                if (motionEvent != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 7 || actionMasked == 9) {
                        this.this$0.f5467 = SystemClock.uptimeMillis();
                        ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.this$0;
                        viewTreeObserverOnGlobalLayoutListenerC1884.post(viewTreeObserverOnGlobalLayoutListenerC1884.f5455);
                    }
                }
            }

            @Override // p052.InterfaceC6543
            public /* bridge */ /* synthetic */ Object invoke() {
                m3432invoke();
                return C5176.f14739;
            }
        };
        int i2 = Build.VERSION.SDK_INT;
        this.f5443 = i2 < 29 ? new C1815(fArrM2907) : new C1920();
        addOnAttachStateChangeListener(this.f5425);
        setWillNotDraw(false);
        setFocusable(true);
        C1837.f5339.m3472(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        AbstractC2270.m4244(this, viewOnAttachStateChangeListenerC1885);
        setOnDragListener(getDragAndDropManager());
        getRoot().m3249(this);
        if (i2 >= 29) {
            C1830.f5322.m3463(this);
        }
        if (m3515()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.f5433 = view;
            addView(view, -1);
        }
        this.f5445 = i2 >= 31 ? new C1928() : null;
        this.f5442 = new C1894(this);
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.f5439.getValue()).booleanValue();
    }

    private final C2000 getLegacyTextInputServiceAndroid() {
        C2000 c2000 = this.f5466;
        if (c2000 != null) {
            return c2000;
        }
        C2000 c20002 = new C2000(getView(), this);
        this.f5466 = c20002;
        return c20002;
    }

    private final C1903 get_composeViewContext() {
        return (C1903) ((AbstractC1347) this.f5481).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC1889 get_viewTreeOwners() {
        AbstractC0053.m137(((AbstractC1347) this.f5462).getValue());
        return null;
    }

    private final void setAttached(boolean z) {
        ((AbstractC1347) this.f5440).setValue(Boolean.valueOf(z));
    }

    private void setDensity(InterfaceC7896 interfaceC7896) {
        ((AbstractC1347) this.f5434).setValue(interfaceC7896);
    }

    private void setFontFamilyResolver(InterfaceC1996 interfaceC1996) {
        this.f5454.setValue(interfaceC1996);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        ((AbstractC1347) this.f5453).setValue(layoutDirection);
    }

    private final void set_composeViewContext(C1903 c1903) {
        ((AbstractC1347) this.f5481).setValue(c1903);
    }

    private final void set_viewTreeOwners(AbstractC1889 abstractC1889) {
        ((AbstractC1347) this.f5462).setValue(abstractC1889);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m3513(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iM798;
        ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC1885 = viewTreeObserverOnGlobalLayoutListenerC1884.f5424;
        if (AbstractC4395.m8907(str, viewOnAttachStateChangeListenerC1885.f5512)) {
            int iM7982 = viewOnAttachStateChangeListenerC1885.f5510.m798(i);
            if (iM7982 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM7982);
                return;
            }
            return;
        }
        if (!AbstractC4395.m8907(str, viewOnAttachStateChangeListenerC1885.f5511) || (iM798 = viewOnAttachStateChangeListenerC1885.f5509.m798(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iM798);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static void m3514(C1748 c1748) {
        c1748.m3235();
        C1224 c1224M3239 = c1748.m3239();
        Object[] objArr = c1224M3239.f3521;
        int i = c1224M3239.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            m3514((C1748) objArr[i2]);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m3515() {
        return Build.VERSION.SDK_INT >= 35;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static boolean m3516(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !C1856.f5363.m3483(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m3517(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC1884) {
                ((ViewTreeObserverOnGlobalLayoutListenerC1884) childAt).m3541();
            } else if (childAt instanceof ViewGroup) {
                m3517((ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static long m3518(int i) {
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
        C2633.m5341();
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static View m3519(View view, int i) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (AbstractC4395.m8907(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewM3519 = m3519(viewGroup.getChildAt(i2), i);
                    if (viewM3519 != null) {
                        return viewM3519;
                    }
                }
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        C1452 c1452 = ((C1478) getFocusOwner()).f4190;
        if (!c1452.f6279) {
            return;
        }
        if (!c1452.f6292.f6279) {
            AbstractC7936.m13423("visitSubtreeIf called on an unattached node");
        }
        C1224 c1224 = new C1224(0, new AbstractC2128[16]);
        AbstractC2128 abstractC2128 = c1452.f6292;
        AbstractC2128 abstractC21282 = abstractC2128.f6288;
        if (abstractC21282 == null) {
            AbstractC1785.m3342(c1224, abstractC2128);
        } else {
            c1224.m2047(abstractC21282);
        }
        while (true) {
            int i3 = c1224.f3520;
            if (i3 == 0) {
                return;
            }
            AbstractC2128 abstractC21283 = (AbstractC2128) c1224.m2053(i3 - 1);
            if ((abstractC21283.f6285 & 1024) != 0) {
                for (AbstractC2128 abstractC21284 = abstractC21283; abstractC21284 != null && abstractC21284.f6279; abstractC21284 = abstractC21284.f6288) {
                    if ((abstractC21284.f6291 & 1024) != 0) {
                        AbstractC2128 abstractC2128M3339 = abstractC21284;
                        C1224 c12242 = null;
                        while (abstractC2128M3339 != null) {
                            if (abstractC2128M3339 instanceof C1452) {
                                C1452 c14522 = (C1452) abstractC2128M3339;
                                if (c14522.f6279 && c14522.m2600().f4180) {
                                    super.addFocusables(arrayList, i, i2);
                                    C1452 c14523 = ((C1478) getFocusOwner()).f4190;
                                    if (c14523.f6279) {
                                        if (!c14523.f6292.f6279) {
                                            AbstractC7936.m13423("visitSubtreeIf called on an unattached node");
                                        }
                                        C1224 c12243 = new C1224(0, new AbstractC2128[16]);
                                        AbstractC2128 abstractC21285 = c14523.f6292;
                                        AbstractC2128 abstractC21286 = abstractC21285.f6288;
                                        if (abstractC21286 == null) {
                                            AbstractC1785.m3342(c12243, abstractC21285);
                                        } else {
                                            c12243.m2047(abstractC21286);
                                        }
                                        while (true) {
                                            int i4 = c12243.f3520;
                                            if (i4 == 0) {
                                                break;
                                            }
                                            AbstractC2128 abstractC21287 = (AbstractC2128) c12243.m2053(i4 - 1);
                                            if ((abstractC21287.f6285 & 1024) != 0) {
                                                for (AbstractC2128 abstractC21288 = abstractC21287; abstractC21288 != null && abstractC21288.f6279; abstractC21288 = abstractC21288.f6288) {
                                                    if ((abstractC21288.f6291 & 1024) != 0) {
                                                        AbstractC2128 abstractC2128M33392 = abstractC21288;
                                                        C1224 c12244 = null;
                                                        while (abstractC2128M33392 != null) {
                                                            if (abstractC2128M33392 instanceof C1452) {
                                                                C1452 c14524 = (C1452) abstractC2128M33392;
                                                                if (c14524.f6279) {
                                                                    C1477 c1477M2600 = c14524.m2600();
                                                                    if (c14524.f6279 && !c14524.f4147 && c1477M2600.f4180) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((abstractC2128M33392.f6291 & 1024) != 0 && (abstractC2128M33392 instanceof AbstractC1788)) {
                                                                int i5 = 0;
                                                                for (AbstractC2128 abstractC21289 = ((AbstractC1788) abstractC2128M33392).f5226; abstractC21289 != null; abstractC21289 = abstractC21289.f6288) {
                                                                    if ((abstractC21289.f6291 & 1024) != 0) {
                                                                        i5++;
                                                                        if (i5 == 1) {
                                                                            abstractC2128M33392 = abstractC21289;
                                                                        } else {
                                                                            if (c12244 == null) {
                                                                                c12244 = new C1224(0, new AbstractC2128[16]);
                                                                            }
                                                                            if (abstractC2128M33392 != null) {
                                                                                c12244.m2047(abstractC2128M33392);
                                                                                abstractC2128M33392 = null;
                                                                            }
                                                                            c12244.m2047(abstractC21289);
                                                                        }
                                                                    }
                                                                }
                                                                if (i5 == 1) {
                                                                }
                                                            }
                                                            abstractC2128M33392 = AbstractC1785.m3339(c12244);
                                                        }
                                                    }
                                                }
                                            }
                                            AbstractC1785.m3342(c12243, abstractC21287);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((abstractC2128M3339.f6291 & 1024) != 0 && (abstractC2128M3339 instanceof AbstractC1788)) {
                                int i6 = 0;
                                for (AbstractC2128 abstractC212810 = ((AbstractC1788) abstractC2128M3339).f5226; abstractC212810 != null; abstractC212810 = abstractC212810.f6288) {
                                    if ((abstractC212810.f6291 & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            abstractC2128M3339 = abstractC212810;
                                        } else {
                                            if (c12242 == null) {
                                                c12242 = new C1224(0, new AbstractC2128[16]);
                                            }
                                            if (abstractC2128M3339 != null) {
                                                c12242.m2047(abstractC2128M3339);
                                                abstractC2128M3339 = null;
                                            }
                                            c12242.m2047(abstractC212810);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            abstractC2128M3339 = AbstractC1785.m3339(c12242);
                        }
                    }
                }
            }
            AbstractC1785.m3342(c1224, abstractC21283);
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
        C1956 c1956M3254;
        InterfaceC6558 interfaceC6558;
        InterfaceC6558 interfaceC65582;
        C1407 c1407 = this.f5487;
        if (c1407 != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                InterfaceC1949 interfaceC1949 = (InterfaceC1949) c1407.f4068.f5763.m833(iKeyAt);
                if (interfaceC1949 != null && (c1956M3254 = ((C1748) interfaceC1949).m3254()) != null) {
                    C1941 c1941 = (C1941) AbstractC1957.m3673(c1956M3254, AbstractC1959.f5807);
                    if (c1941 != null && (interfaceC65582 = (InterfaceC6558) c1941.f5706) != null) {
                    }
                    C1941 c19412 = (C1941) AbstractC1957.m3673(c1956M3254, AbstractC1959.f5806);
                    if (c19412 != null && (interfaceC6558 = (InterfaceC6558) c19412.f5706) != null) {
                    }
                }
            }
        }
        C0325 c0325 = this.f5503;
        if (c0325 != null) {
            C1418 c1418 = (C1418) c0325.f1096;
            if (c1418.f4081.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (c1418.f4081.get(Integer.valueOf(iKeyAt2)) != null) {
                        C2942.m6394();
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
        return this.f5424.m3582(false, i, this.f5479);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f5424.m3582(true, i, this.f5479);
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
        C0244 c0244 = this.f5422;
        if (!isAttachedToWindow()) {
            m3514(getRoot());
        }
        m3542(true);
        AbstractC1280.m2280().mo2209();
        this.f5419 = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            C1602 c1602 = this.f5438;
            C1595 c1595 = c1602.f4703;
            Canvas canvas2 = c1595.f4690;
            c1595.f4690 = canvas;
            getRoot().m3267(c1595, null);
            c1602.f4703.f4690 = canvas2;
            if (c0244.m878()) {
                int i = c0244.f1004;
                for (int i2 = 0; i2 < i; i2++) {
                    ((C1911) ((InterfaceC1806) c0244.m881(i2))).m3613();
                }
            }
            int i3 = AbstractC1845.f5352;
            c0244.m779();
            this.f5419 = false;
            Trace.endSection();
            C0244 c02442 = this.f5418;
            if (c02442 != null) {
                c0244.m774(c02442);
                c02442.m779();
            }
            if (m3515()) {
                AbstractC1819.m3452(this, this.f5457);
                View view = this.f5433;
                if (view != null) {
                    AbstractC1819.m3452(view, this.f5458);
                    if (!Float.isNaN(this.f5458)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.f5457 = Float.NaN;
                this.f5458 = Float.NaN;
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
            return ((C1478) getFocusOwner()).m2639(keyEvent, new InterfaceC6543() { // from class: androidx.compose.ui.platform.AndroidComposeView$dispatchKeyEvent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p052.InterfaceC6543
                public final Boolean invoke() {
                    return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent(keyEvent));
                }
            });
        }
        C1865 c1865 = getComposeViewContext().f5601;
        int metaState = keyEvent.getMetaState();
        c1865.getClass();
        ((AbstractC1347) AbstractC1849.f5354).setValue(new C1637(metaState));
        return ((C1478) getFocusOwner()).m2639(keyEvent, new InterfaceC6543() { // from class: androidx.compose.ui.focus.FocusOwner$dispatchKeyEvent$1
            @Override // p052.InterfaceC6543
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
            if (c1478.f4189.f4196) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                C1452 c1452M2607 = AbstractC1459.m2607(c1478.f4190);
                if (c1452M2607 != null) {
                    if (!c1452M2607.f6292.f6279) {
                        AbstractC7936.m13423("visitAncestors called on an unattached node");
                    }
                    AbstractC2128 abstractC2128 = c1452M2607.f6292;
                    C1748 c1748M3346 = AbstractC1785.m3346(c1452M2607);
                    while (c1748M3346 != null) {
                        if ((c1748M3346.f5094.f5283.f6285 & 131072) != 0) {
                            while (abstractC2128 != null) {
                                if ((abstractC2128.f6291 & 131072) != 0) {
                                    AbstractC2128 abstractC2128M3339 = abstractC2128;
                                    C1224 c1224 = null;
                                    while (abstractC2128M3339 != null) {
                                        if ((abstractC2128M3339.f6291 & 131072) != 0 && (abstractC2128M3339 instanceof AbstractC1788)) {
                                            int i = 0;
                                            for (AbstractC2128 abstractC21282 = ((AbstractC1788) abstractC2128M3339).f5226; abstractC21282 != null; abstractC21282 = abstractC21282.f6288) {
                                                if ((abstractC21282.f6291 & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        abstractC2128M3339 = abstractC21282;
                                                    } else {
                                                        if (c1224 == null) {
                                                            c1224 = new C1224(0, new AbstractC2128[16]);
                                                        }
                                                        if (abstractC2128M3339 != null) {
                                                            c1224.m2047(abstractC2128M3339);
                                                            abstractC2128M3339 = null;
                                                        }
                                                        c1224.m2047(abstractC21282);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        abstractC2128M3339 = AbstractC1785.m3339(c1224);
                                    }
                                }
                                abstractC2128 = abstractC2128.f6284;
                            }
                        }
                        c1748M3346 = c1748M3346.m3256();
                        abstractC2128 = (c1748M3346 == null || (c1811 = c1748M3346.f5094) == null) ? null : c1811.f5284;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            C1831.f5323.m3464(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object c1818;
        C1452 c1452M2643;
        if (this.f5460) {
            RunnableC1897 runnableC1897 = this.f5456;
            removeCallbacks(runnableC1897);
            MotionEvent motionEvent2 = this.f5468;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f5460 = false;
            } else {
                runnableC1897.run();
            }
        }
        if (!m3516(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || m3546(motionEvent))) {
            int iM3548 = m3548(motionEvent);
            if ((iM3548 & 2) != 0) {
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
                if (c1818.equals(new C1818(1)) && (c1452M2643 = ((C1478) getFocusOwner()).m2643()) != null) {
                    AbstractC1794 abstractC1794M3349 = AbstractC1785.m3349(c1452M2643);
                    if (!AbstractC1670.m3113(abstractC1794M3349).mo3089(abstractC1794M3349, true).m12521((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        InterfaceC1485.m2655(getFocusOwner());
                    }
                }
            }
            if ((iM3548 & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return m3519(this, i);
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
        C7328 c7328M2653;
        if (view == null || this.f5494.f5050) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || !AbstractC1836.m3471(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            C1452 c1452M2607 = AbstractC1459.m2607(((C1478) getFocusOwner()).f4190);
            c7328M2653 = c1452M2607 != null ? AbstractC1459.m2629(c1452M2607) : null;
            if (c7328M2653 == null) {
                c7328M2653 = AbstractC1481.m2653(view, this);
            }
        } else {
            c7328M2653 = AbstractC1481.m2653(view, this);
        }
        C1464 c1464M2650 = AbstractC1481.m2650(i);
        int i2 = c1464M2650 != null ? c1464M2650.f4161 : 6;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (((C1478) getFocusOwner()).m2644(i2, c7328M2653, new InterfaceC6558() { // from class: androidx.compose.ui.platform.AndroidComposeView$focusSearch$searchResult$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p052.InterfaceC6558
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
        } else if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || AbstractC1459.m2623(AbstractC1459.m2629((C1452) t), AbstractC1481.m2653(viewFindNextFocus, this), c7328M2653, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public final C1817 getAndroidViewsHandler$ui() {
        if (this.f5498 == null) {
            C1817 c1817 = new C1817(getContext());
            this.f5498 = c1817;
            addView(c1817, -1);
            requestLayout();
        }
        C1817 c18172 = this.f5498;
        c18172.getClass();
        return c18172;
    }

    public InterfaceC1403 getAutofill() {
        return this.f5503;
    }

    public AbstractC1417 getAutofillManager() {
        return this.f5487;
    }

    public C1418 getAutofillTree() {
        return this.f5423;
    }

    public final C1903 getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.f5448;
    }

    public final Configuration getConfiguration() {
        return (Configuration) ((AbstractC1347) this.f5505).getValue();
    }

    public final ViewOnAttachStateChangeListenerC1421 getContentCaptureManager$ui() {
        return this.f5425;
    }

    public InterfaceC4360 getCoroutineContext() {
        return this.f5431;
    }

    public InterfaceC7896 getDensity() {
        return (InterfaceC7896) ((AbstractC1347) this.f5434).getValue();
    }

    public C7328 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            C1452 c1452M2607 = AbstractC1459.m2607(((C1478) getFocusOwner()).f4190);
            if (c1452M2607 != null) {
                return AbstractC1459.m2629(c1452M2607);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return AbstractC1481.m2653(viewFindFocus, this);
        }
        return null;
    }

    public InterfaceC1483 getFocusOwner() {
        return this.f5432;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C7328 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f19540);
            rect.top = Math.round(embeddedViewFocusRect.f19539);
            rect.right = Math.round(embeddedViewFocusRect.f19538);
            rect.bottom = Math.round(embeddedViewFocusRect.f19537);
            return;
        }
        if (AbstractC4395.m8907(((C1478) getFocusOwner()).m2644(6, null, new InterfaceC6558() { // from class: androidx.compose.ui.platform.AndroidComposeView$getFocusedRect$1
            @Override // p052.InterfaceC6558
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
        return (InterfaceC1996) this.f5454.getValue();
    }

    public InterfaceC1991 getFontLoader() {
        return this.f5451;
    }

    public final InterfaceC1869 getFrameEndScheduler$ui() {
        return this.f5477;
    }

    public InterfaceC1583 getGraphicsContext() {
        return this.f5420;
    }

    public InterfaceC7317 getHapticFeedBack() {
        return this.f5449;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f5494.f5051.m3329() || !this.f5476.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public InterfaceC7324 getInputModeManager() {
        return this.f5450;
    }

    public final RunnableC1701 getInsetsListener() {
        return this.f5436;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.f5488;
    }

    @Override // android.view.View, android.view.ViewParent
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) ((AbstractC1347) this.f5453).getValue();
    }

    public C7832 getLocaleList() {
        return (C7832) this.f5502.getValue();
    }

    public long getMeasureIteration() {
        C1743 c1743 = this.f5494;
        if (!c1743.f5050) {
            AbstractC7936.m13425("measureIteration should be only used during the measure/layout pass");
        }
        return c1743.f5054;
    }

    public C1734 getModifierLocalManager() {
        return this.f5471;
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1884 getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public AbstractC1708 getPlacementScope() {
        InterfaceC6558 interfaceC6558 = AbstractC1725.f5001;
        return new C1664(this, 1);
    }

    public InterfaceC1645 getPointerIconService() {
        return this.f5442;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final C7322 m3520getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.f5474;
    }

    public C1961 getRectManager() {
        return this.f5429;
    }

    public InterfaceC7333 getRetainedValuesStore() {
        return this.f5475;
    }

    public C1748 getRoot() {
        return this.f5427;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        C1928 c1928;
        if (Build.VERSION.SDK_INT < 31 || (c1928 = this.f5445) == null) {
            return false;
        }
        return ((Boolean) ((AbstractC1347) c1928.f5678).getValue()).booleanValue();
    }

    public C1951 getSemanticsOwner() {
        return this.f5428;
    }

    public C1758 getSharedDrawScope() {
        return this.f5473;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? C1816.f5295.m3451(this) : this.f5482;
    }

    public C1803 getSnapshotObserver() {
        return this.f5483;
    }

    public InterfaceC1871 getSoftwareKeyboardController() {
        C1901 c1901 = this.f5452;
        if (c1901 != null) {
            return c1901;
        }
        C1901 c19012 = new C1901(getTextInputService());
        this.f5452 = c19012;
        return c19012;
    }

    public C2014 getTextInputService() {
        C2014 c2014 = this.f5463;
        if (c2014 != null) {
            return c2014;
        }
        C2014 c20142 = new C2014((InterfaceC2020) AbstractC1836.f5338.invoke(getLegacyTextInputServiceAndroid()));
        this.f5463 = c20142;
        return c20142;
    }

    public InterfaceC1874 getTextToolbar() {
        return this.f5472;
    }

    public final InterfaceC1798 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public InterfaceC1863 getViewConfiguration() {
        return this.f5437;
    }

    public final AbstractC1889 getViewTreeOwners() {
        AbstractC0053.m137(this.f5461.getValue());
        return null;
    }

    public InterfaceC1848 getWindowInfo() {
        return getComposeViewContext().f5601;
    }

    public final C1407 get_autofillManager$ui() {
        return this.f5487;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC7333 interfaceC7333;
        Object obj;
        super.onAttachedToWindow();
        setAttached(true);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(AbstractC1916.m3630());
        }
        this.f5436.onViewAttachedToWindow(this);
        int i2 = 0;
        if (i > 28) {
            if (f5413 == null) {
                RunnableC1898 runnableC1898 = new RunnableC1898(i2);
                f5413 = runnableC1898;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (f5414 == null) {
                        f5414 = Class.forName("android.os.SystemProperties");
                    }
                    if (f5415 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = f5414;
                        f5415 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = f5415;
                    if (method != null) {
                        method.invoke(null, runnableC1898);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            C0244 c0244 = f5412;
            synchronized (c0244) {
                c0244.m775(this);
            }
        }
        if (!this.f5448) {
            getComposeViewContext().m3600();
        }
        this.f5448 = false;
        m3544(getRoot());
        m3514(getRoot());
        getSnapshotObserver().f5274.m2245();
        C0325 c0325 = this.f5503;
        if (c0325 != null) {
            C1413 c1413 = C1413.f4077;
            c1413.getClass();
            ((AutofillManager) c0325.f1094).registerCallback(c1413);
        }
        InterfaceC2388 interfaceC2388 = getComposeViewContext().f5597;
        InterfaceC2421 interfaceC2421 = getComposeViewContext().f5595;
        InterfaceC1869 interfaceC1869 = this.f5477;
        if (interfaceC2388 == null || interfaceC2421 == null || interfaceC1869 == null) {
            interfaceC7333 = null;
        } else {
            C2423 viewModelStore = interfaceC2421.getViewModelStore();
            C2426 c2426 = new C2426();
            C7637 c7637 = C7637.f20725;
            viewModelStore.getClass();
            c7637.getClass();
            C0325 c03252 = new C0325(viewModelStore, c2426, c7637);
            InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(C1867.class);
            String strMo8885 = interfaceC5093Mo8917.mo8885();
            if (strMo8885 == null) {
                C5925.m11310("Local and anonymous classes can not be ViewModels");
                return;
            }
            C1867 c1867 = (C1867) c03252.m959("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strMo8885), interfaceC5093Mo8917);
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            C0246 c0246 = c1867.f5369;
            Object objM833 = c0246.m833(id);
            if (objM833 == null) {
                objM833 = new C0244(1);
                c0246.m790(id, objM833);
            }
            C0244 c02442 = (C0244) objM833;
            Object[] objArr = c02442.f1005;
            int i3 = c02442.f1004;
            while (true) {
                if (i2 >= i3) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (!((C1870) obj).f5375) {
                    break;
                } else {
                    i2++;
                }
            }
            C1870 c1870 = (C1870) obj;
            if (c1870 == null) {
                c1870 = new C1870();
                c02442.m775(c1870);
            }
            c1870.f5375 = true;
            this.f5478 = c1870;
            interfaceC7333 = c1870.f5376;
        }
        if (interfaceC7333 == null) {
            interfaceC7333 = C7335.f19547;
        }
        this.f5475 = interfaceC7333;
        InterfaceC6558 interfaceC6558 = this.f5465;
        if (interfaceC6558 != null) {
            interfaceC6558.invoke(getComposeViewContext());
            this.f5465 = null;
        }
        AbstractC2402 lifecycle = getComposeViewContext().f5597.getLifecycle();
        lifecycle.mo4503(this);
        lifecycle.mo4503(this.f5425);
        ((AbstractC1347) this.f5450.f19525).setValue(new C7325(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            C1827.f5319.m3460(this);
        }
        C1407 c1407 = this.f5487;
        if (c1407 != null) {
            ((C1478) getFocusOwner()).f4194.m775(c1407);
            getSemanticsOwner().f5762.m775(c1407);
        }
        ((C1478) getFocusOwner()).f4194.m775(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        C2127 c2127 = (C2127) this.f5464.get();
        C1834 c1834 = (C1834) (c2127 != null ? c2127.f6277 : null);
        if (c1834 == null) {
            return getLegacyTextInputServiceAndroid().f5894;
        }
        C2127 c21272 = (C2127) c1834.f5328.get();
        C1910 c1910 = (C1910) (c21272 != null ? c21272.f6277 : null);
        return c1910 != null && (c1910.f5629 ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m3523(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        C2127 c2127 = (C2127) this.f5464.get();
        C1834 c1834 = (C1834) (c2127 != null ? c2127.f6277 : null);
        if (c1834 == null) {
            C2000 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
            if (legacyTextInputServiceAndroid.f5894) {
                C2025 c2025 = legacyTextInputServiceAndroid.f5900;
                C2013 c2013 = legacyTextInputServiceAndroid.f5901;
                int i2 = c2025.f5970;
                boolean z = c2025.f5974;
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
                        C5925.m11311("invalid ImeAction");
                        return null;
                    }
                }
                editorInfo.imeOptions = i;
                int i3 = c2025.f5971;
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
                        C5925.m11311("Invalid Keyboard Type");
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
                    int i6 = c2025.f5973;
                    if (i6 == 1) {
                        editorInfo.inputType = i5 | 4096;
                    } else if (i6 == 2) {
                        editorInfo.inputType = i5 | 8192;
                    } else if (i6 == 3) {
                        editorInfo.inputType = i5 | 16384;
                    }
                    if (c2025.f5972) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j = c2013.f5946;
                int i7 = C2035.f6002;
                editorInfo.initialSelStart = (int) (j >> 32);
                editorInfo.initialSelEnd = (int) (j & 4294967295L);
                AbstractC5062.m10020(editorInfo, c2013.f5947.f6129);
                editorInfo.imeOptions |= 33554432;
                if (C7713.m13009()) {
                    C7713.m13010().m13017(editorInfo);
                }
                InputConnectionC2012 inputConnectionC2012 = new InputConnectionC2012(legacyTextInputServiceAndroid.f5901, new C0113(legacyTextInputServiceAndroid, 28), legacyTextInputServiceAndroid.f5900.f5972);
                legacyTextInputServiceAndroid.f5904.add(new WeakReference(inputConnectionC2012));
                return inputConnectionC2012;
            }
        } else {
            C2127 c21272 = (C2127) c1834.f5328.get();
            final C1910 c1910 = (C1910) (c21272 != null ? c21272.f6277 : null);
            if (c1910 != null) {
                synchronized (c1910.f5631) {
                    if (c1910.f5629) {
                        return null;
                    }
                    InputConnection inputConnectionMo1666 = c1910.f5633.mo1666(editorInfo);
                    InterfaceC6558 interfaceC6558 = new InterfaceC6558() { // from class: androidx.compose.ui.platform.InputMethodSession$createInputConnection$1$1
                        {
                            super(1);
                        }

                        public final void invoke(InterfaceInputConnectionC2018 interfaceInputConnectionC2018) {
                            C2017 c2017 = (C2017) interfaceInputConnectionC2018;
                            InputConnection inputConnection = c2017.f5954;
                            if (inputConnection != null) {
                                inputConnection.closeConnection();
                                c2017.f5954 = null;
                            }
                            C1224 c1224 = c1910.f5630;
                            Object[] objArr = c1224.f3521;
                            int i8 = c1224.f3520;
                            int i9 = 0;
                            while (true) {
                                if (i9 >= i8) {
                                    i9 = -1;
                                    break;
                                } else if (AbstractC4395.m8907((C1762) objArr[i9], c2017)) {
                                    break;
                                } else {
                                    i9++;
                                }
                            }
                            if (i9 >= 0) {
                                c1910.f5630.m2053(i9);
                            }
                            C1910 c19102 = c1910;
                            if (c19102.f5630.f3520 == 0) {
                                c19102.f5632.invoke();
                            }
                        }

                        @Override // p052.InterfaceC6558
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((InterfaceInputConnectionC2018) obj);
                            return C5176.f14739;
                        }
                    };
                    InputConnection c2021 = Build.VERSION.SDK_INT >= 34 ? new C2021(inputConnectionMo1666, interfaceC6558) : new C2017(inputConnectionMo1666, interfaceC6558);
                    c1910.f5630.m2047(new C1762(c2021));
                    return c2021;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        C1953 c1953;
        ViewOnAttachStateChangeListenerC1421 viewOnAttachStateChangeListenerC1421 = this.f5425;
        viewOnAttachStateChangeListenerC1421.getClass();
        for (long j : jArr) {
            C1950 c1950 = (C1950) viewOnAttachStateChangeListenerC1421.m2547().m833((int) j);
            if (c1950 != null && (c1953 = c1950.f5761) != null) {
                AbstractC0921.m1850();
                ViewTranslationRequest.Builder builderM1847 = AbstractC0921.m1847(viewOnAttachStateChangeListenerC1421.f4099.getAutofillId(), c1953.f5767);
                List list = (List) AbstractC1957.m3673(c1953.f5769, AbstractC1943.f5718);
                if (list != null) {
                    builderM1847.setValue("android:text", TranslationRequestValue.forText(new C2068(AbstractC7914.m13411(list, "\n", null, 62))));
                    consumer.accept(builderM1847.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.f5436.onViewDetachedFromWindow(this);
        View view = this.f5433;
        if (m3515() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            C0244 c0244 = f5412;
            synchronized (c0244) {
                c0244.m776(this);
            }
        }
        getComposeViewContext().m3601();
        C1275 c1275 = getSnapshotObserver().f5274;
        C1267 c1267 = c1275.f3714;
        if (c1267 != null) {
            c1267.m2225();
        }
        c1275.m2248();
        AbstractC2402 lifecycle = getComposeViewContext().f5597.getLifecycle();
        lifecycle.mo4502(this.f5425);
        lifecycle.mo4502(this);
        C0325 c0325 = this.f5503;
        if (c0325 != null) {
            C1413 c1413 = C1413.f4077;
            c1413.getClass();
            ((AutofillManager) c0325.f1094).unregisterCallback(c1413);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        C1870 c1870 = this.f5478;
        if (c1870 != null) {
            c1870.f5375 = false;
        }
        this.f5478 = null;
        if (i >= 31) {
            C1827.f5319.m3461(this);
        }
        C1407 c1407 = this.f5487;
        if (c1407 != null) {
            getSemanticsOwner().f5762.m776(c1407);
            ((C1478) getFocusOwner()).f4194.m776(c1407);
        }
        C1961 rectManager = getRectManager();
        rectManager.f5819 = rectManager.f5822.m3692(0L, 0L, null, 0, 0);
        getRectManager().m3689();
        C1961 rectManager2 = getRectManager();
        RunnableC1892 runnableC1892 = rectManager2.f5825;
        if (runnableC1892 != null) {
            rectManager2.f5824.removeCallbacks(runnableC1892);
            rectManager2.f5825 = null;
        }
        ((C1478) getFocusOwner()).f4194.m776(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        C1478 c1478 = (C1478) getFocusOwner();
        AbstractC1459.m2609(c1478.f4190, true);
        if (c1478.m2643() != null) {
            C1452 c1452M2643 = c1478.m2643();
            c1478.m2645(null);
            if (c1452M2643 != null) {
                c1452M2643.m2601(FocusStateImpl.Active, FocusStateImpl.Inactive);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f5488 = 0L;
        m3522();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        m3523(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.f5488 = 0L;
            this.f5494.m3198(this.f5444);
            this.f5499 = null;
            m3522();
            if (this.f5498 != null) {
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
        C1743 c1743 = this.f5494;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m3544(getRoot());
            }
            long jM3518 = m3518(i);
            long jM35182 = m3518(i2);
            long jM12050 = AbstractC6561.m12050((int) (jM3518 >>> 32), (int) (jM3518 & 4294967295L), (int) (jM35182 >>> 32), (int) (4294967295L & jM35182));
            C7898 c7898 = this.f5499;
            if (c7898 == null) {
                this.f5499 = new C7898(jM12050);
                this.f5495 = false;
            } else if (!C7898.m13335(c7898.f21865, jM12050)) {
                this.f5495 = true;
            }
            c1743.m3189(jM12050);
            c1743.m3190();
            setMeasuredDimension(getRoot().f5132.f5167.f4999, getRoot().f5132.f5167.f4997);
            if (this.f5498 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f5132.f5167.f4999, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f5132.f5167.f4997, 1073741824));
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
        if (motionEvent.isFromSource(DexMap.TYPE_STRING_DATA_ITEM) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (interfaceC1641 = ((C1894) getPointerIconService()).f5562) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return interfaceC1641 instanceof C1634 ? PointerIcon.getSystemIcon(context, ((C1634) interfaceC1641).f4779) : PointerIcon.getSystemIcon(context, DescriptorProtos$Edition.EDITION_2023_VALUE);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.f5480) {
            int[] iArr = AbstractC1481.f4202;
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
        if (Build.VERSION.SDK_INT < 31 || (c1928 = this.f5445) == null) {
            return;
        }
        c1928.m3636(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m3522();
    }

    @Override // androidx.lifecycle.InterfaceC2409
    public final void onStop(InterfaceC2388 interfaceC2388) {
        C1870 c1870 = this.f5478;
        if (c1870 != null) {
            C2411 c2411 = (C2411) c1870.f5377.f357;
            if (c2411.f7051 && !c2411.f7050) {
                InterfaceC1352 interfaceC1352 = c1870.f5374;
                if (interfaceC1352 != null) {
                    interfaceC1352.cancel();
                }
                c1870.f5374 = null;
                return;
            }
            if (c2411.f7049) {
                return;
            }
            if (!c2411.f7050) {
                AbstractC7350.m12543("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!((C0236) c2411.f7048).m760()) {
                AbstractC7350.m12543("Attempted to start retaining exited values with pending exited values");
            }
            c2411.f7050 = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        ((AbstractC1347) this.f5450.f19525).setValue(new C7325(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ViewOnAttachStateChangeListenerC1421 viewOnAttachStateChangeListenerC1421 = this.f5425;
        viewOnAttachStateChangeListenerC1421.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (AbstractC4395.m8907(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            AbstractC6561.m12054(viewOnAttachStateChangeListenerC1421, longSparseArray);
        } else {
            viewOnAttachStateChangeListenerC1421.f4099.post(new RunnableC0099(viewOnAttachStateChangeListenerC1421, 1, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zM3630;
        this.f5447 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zM3630 = AbstractC1916.m3630())) {
            return;
        }
        setShowLayoutBounds(zM3630);
        m3514(getRoot());
    }

    @Override // androidx.compose.ui.node.InterfaceC1801
    public void registerOnLayoutCompletedListener(InterfaceC1802 interfaceC1802) {
        this.f5494.registerOnLayoutCompletedListener(interfaceC1802);
        m3535(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (!isFocused()) {
            C1464 c1464M2650 = AbstractC1481.m2650(i);
            final int i2 = c1464M2650 != null ? c1464M2650.f4161 : 7;
            Boolean boolM2644 = ((C1478) getFocusOwner()).m2644(i2, rect != null ? new C7328(rect.left, rect.top, rect.right, rect.bottom) : null, new InterfaceC6558() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithPrevRect$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p052.InterfaceC6558
                public final Boolean invoke(C1452 c1452) {
                    return Boolean.valueOf(c1452.m2596(i2));
                }
            });
            Boolean bool = Boolean.TRUE;
            if (!AbstractC4395.m8907(boolM2644, bool)) {
                if (!AbstractC4395.m8907(((C1478) getFocusOwner()).m2644(i2, null, new InterfaceC6558() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithoutPrevRect$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p052.InterfaceC6558
                    public final Boolean invoke(C1452 c1452) {
                        return Boolean.valueOf(c1452.m2596(i2));
                    }
                }), bool)) {
                    if (!hasFocus()) {
                        return false;
                    }
                    if (i2 == 1 || i2 == 2) {
                        return ((C1478) getFocusOwner()).m2648(i2);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.f5424.f5533 = j;
    }

    public final void setComposeViewContext(C1903 c1903) {
        if (getCoroutineContext() != c1903.f5598.mo2334() && !((C0242) getRoot().m3257()).isEmpty()) {
            AbstractC7936.m13425("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        AbstractC1286 abstractC1286M2231 = AbstractC1274.m2231();
        InterfaceC6558 interfaceC6558Mo2203 = abstractC1286M2231 != null ? abstractC1286M2231.mo2203() : null;
        AbstractC1286 abstractC1286M2243 = AbstractC1274.m2243(abstractC1286M2231);
        try {
            C1903 c19032 = get_composeViewContext();
            if (c1903 != c19032) {
                if (isAttachedToWindow()) {
                    c19032.m3601();
                    c1903.m3600();
                }
                set_composeViewContext(c1903);
                setCoroutineContext(c1903.f5598.mo2334());
            }
        } finally {
            AbstractC1274.m2237(abstractC1286M2231, abstractC1286M2243, interfaceC6558Mo2203);
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.f5448 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        ((AbstractC1347) this.f5505).setValue(configuration);
    }

    public final void setContentCaptureManager$ui(ViewOnAttachStateChangeListenerC1421 viewOnAttachStateChangeListenerC1421) {
        this.f5425 = viewOnAttachStateChangeListenerC1421;
    }

    public void setCoroutineContext(InterfaceC4360 interfaceC4360) {
        this.f5431 = interfaceC4360;
    }

    public final void setFrameEndScheduler$ui(InterfaceC1869 interfaceC1869) {
        this.f5477 = interfaceC1869;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.f5488 = j;
    }

    public final void setOnReadyForComposition(InterfaceC6558 interfaceC6558) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.f5448) {
            interfaceC6558.invoke(getComposeViewContext());
        } else {
            this.f5465 = interfaceC6558;
        }
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m3521setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(C7322 c7322) {
        this.f5474 = c7322;
    }

    public void setShowLayoutBounds(boolean z) {
        this.f5482 = z;
    }

    public void setUncaughtExceptionHandler(InterfaceC1798 interfaceC1798) {
        this.f5494.getClass();
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
    public final void m3522() {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884.m3522():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m3523(Configuration configuration) {
        InterfaceC1395 interfaceC1395;
        Configuration configuration2 = getConfiguration();
        if (AbstractC4395.m8907(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(AbstractC6347.m11904(getContext()));
        }
        InterfaceC6558 interfaceC6558 = AbstractC1836.f5338;
        if ((configuration2.diff(configuration) & (-1342235264)) == 0 || (interfaceC1395 = this.f5441.f5367) == null) {
            return;
        }
        ((AbstractC1347) interfaceC1395).setValue(AbstractC1916.m3617(this));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m3524(float f) {
        if (m3515()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.f5457) || f > this.f5457) {
                    this.f5457 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.f5458) || f < this.f5458) {
                    this.f5458 = f;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void m3525(MotionEvent motionEvent) {
        this.f5488 = AnimationUtils.currentAnimationTimeMillis();
        InterfaceC1814 interfaceC1814 = this.f5443;
        float[] fArr = this.f5493;
        interfaceC1814.mo3449(this, fArr);
        AbstractC1916.m3621(fArr, this.f5489);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jM2906 = C1587.m2906((((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jM2906 >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jM2906 & 4294967295L));
        this.f5490 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m3526() {
        if (this.f5491) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f5488) {
            this.f5488 = jCurrentAnimationTimeMillis;
            InterfaceC1814 interfaceC1814 = this.f5443;
            float[] fArr = this.f5493;
            interfaceC1814.mo3449(this, fArr);
            AbstractC1916.m3621(fArr, this.f5489);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f5496;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f5490 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m3527() {
        ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC1885 = this.f5424;
        viewOnAttachStateChangeListenerC1885.f5518 = true;
        Handler handler = viewOnAttachStateChangeListenerC1885.f5532.getHandler();
        if (viewOnAttachStateChangeListenerC1885.m3580() && !viewOnAttachStateChangeListenerC1885.f5537 && handler != null) {
            viewOnAttachStateChangeListenerC1885.f5537 = true;
            handler.post(viewOnAttachStateChangeListenerC1885.f5542);
        }
        ViewOnAttachStateChangeListenerC1421 viewOnAttachStateChangeListenerC1421 = this.f5425;
        viewOnAttachStateChangeListenerC1421.f4096 = true;
        Handler handler2 = viewOnAttachStateChangeListenerC1421.f4099.getHandler();
        if (!viewOnAttachStateChangeListenerC1421.m2546() || viewOnAttachStateChangeListenerC1421.f4087 || handler2 == null) {
            return;
        }
        viewOnAttachStateChangeListenerC1421.f4087 = true;
        handler2.post(viewOnAttachStateChangeListenerC1421.f4086);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m3528(C1748 c1748, boolean z, boolean z2) {
        C1756 c1756 = c1748.f5132;
        C1743 c1743 = this.f5494;
        if (!z) {
            c1743.getClass();
            int i = AbstractC1742.f5046[c1756.f5159.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                return;
            }
            if (i != 5) {
                C4211.m8611();
                return;
            }
            C1748 c1748M3256 = c1748.m3256();
            boolean z3 = c1748M3256 == null || c1748M3256.m3242();
            if (!z2) {
                if (c1748.m3259()) {
                    return;
                }
                if (c1748.m3262() && c1748.m3242() == z3 && c1748.m3242() == c1756.f5167.f5032) {
                    return;
                }
            }
            C1738 c1738 = c1756.f5167;
            c1738.f5030 = true;
            c1738.f5021 = true;
            if (!c1748.f5126 && c1738.f5032 && z3) {
                if ((c1748M3256 == null || !c1748M3256.m3262()) && (c1748M3256 == null || !c1748M3256.m3259())) {
                    c1743.f5051.m3328(c1748, Invalidation.Placement);
                }
                if (c1743.f5049) {
                    return;
                }
                m3535(null);
                return;
            }
            return;
        }
        C1778 c1778 = c1743.f5051;
        int i2 = AbstractC1742.f5046[c1756.f5159.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return;
                }
                if (i2 != 4 && i2 != 5) {
                    C4211.m8611();
                    return;
                }
            }
            if ((c1756.f5158 || c1756.f5157) && !z2) {
                return;
            }
            c1756.f5157 = true;
            c1756.f5169 = true;
            C1738 c17382 = c1756.f5167;
            c17382.f5030 = true;
            c17382.f5021 = true;
            if (c1748.f5126) {
                return;
            }
            C1748 c1748M32562 = c1748.m3256();
            if (AbstractC4395.m8907(c1748.m3241(), Boolean.TRUE) && ((c1748M32562 == null || !c1748M32562.f5132.f5158) && (c1748M32562 == null || !c1748M32562.f5132.f5157))) {
                c1778.m3328(c1748, Invalidation.LookaheadPlacement);
            } else if (c1748.m3242() && ((c1748M32562 == null || !c1748M32562.m3262()) && (c1748M32562 == null || !c1748M32562.m3259()))) {
                c1778.m3328(c1748, Invalidation.Placement);
            }
            if (c1743.f5049) {
                return;
            }
            m3535(null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m3529(C1748 c1748, boolean z, boolean z2, boolean z3) {
        C1748 c1748M3256;
        C1748 c1748M32562;
        C1743 c1743 = this.f5494;
        if (!z) {
            if (c1743.m3193(c1748, z2) && z3) {
                m3535(c1748);
                return;
            }
            return;
        }
        C1778 c1778 = c1743.f5051;
        C1748 c17482 = c1748.f5120;
        C1756 c1756 = c1748.f5132;
        if (c17482 == null) {
            AbstractC7936.m13423("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i = AbstractC1742.f5046[c1756.f5159.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4) {
                c1743.f5053.m2047(new C1746(c1748, true, z2));
                return;
            }
            if (i != 5) {
                C4211.m8611();
                return;
            }
            if (!c1756.f5158 || z2) {
                c1756.f5158 = true;
                c1756.f5167.f5031 = true;
                if (c1748.f5126) {
                    return;
                }
                if ((AbstractC4395.m8907(c1748.m3241(), Boolean.TRUE) || C1743.m3184(c1748)) && ((c1748M3256 = c1748.m3256()) == null || !c1748M3256.f5132.f5158)) {
                    c1778.m3328(c1748, Invalidation.LookaheadMeasurement);
                } else if ((c1748.m3242() || C1743.m3185(c1748)) && ((c1748M32562 = c1748.m3256()) == null || !c1748M32562.m3259())) {
                    c1778.m3328(c1748, Invalidation.Measurement);
                }
                if (c1743.f5049 || !z3) {
                    return;
                }
                m3535(c1748);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m3530(C1748 c1748) {
        ViewOnAttachStateChangeListenerC1885 viewOnAttachStateChangeListenerC1885 = this.f5424;
        viewOnAttachStateChangeListenerC1885.f5518 = true;
        if (viewOnAttachStateChangeListenerC1885.m3580()) {
            viewOnAttachStateChangeListenerC1885.m3578(c1748);
        }
        ViewOnAttachStateChangeListenerC1421 viewOnAttachStateChangeListenerC1421 = this.f5425;
        viewOnAttachStateChangeListenerC1421.f4096 = true;
        if (viewOnAttachStateChangeListenerC1421.m2546()) {
            viewOnAttachStateChangeListenerC1421.f4093.mo8436(C5176.f14739);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.coroutines.intrinsics.CoroutineSingletons m3531(p052.InterfaceC6554 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
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
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            return r3
        L2a:
            kotlin.AbstractC5185.m10210(r7)
            goto L41
        L2e:
            kotlin.AbstractC5185.m10210(r7)
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$2 r7 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$2
            r7.<init>()
            r0.label = r4
            java.util.concurrent.atomic.AtomicReference r5 = r5.f5464
            java.lang.Object r5 = androidx.compose.ui.AbstractC2120.m3860(r5, r7, r6, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            io.ktor.util.C4211.m8602()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884.m3531(飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):kotlin.coroutines.intrinsics.CoroutineSingletons");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m3532(MotionEvent motionEvent, int i, long j, boolean z) {
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
            long jM3538 = m3538((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jM3538 >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jM3538 & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C0076 c0076M3043 = this.f5500.m3043(this, motionEventObtain);
        c0076M3043.getClass();
        this.f5504.m1557(c0076M3043, this, true);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final int m3533(MotionEvent motionEvent) {
        Object obj;
        if (this.f5447) {
            this.f5447 = false;
            C1865 c1865 = getComposeViewContext().f5601;
            int metaState = motionEvent.getMetaState();
            c1865.getClass();
            ((AbstractC1347) AbstractC1849.f5354).setValue(new C1637(metaState));
        }
        C1648 c1648 = this.f5500;
        C0076 c0076M3043 = c1648.m3043(this, motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C0748 c0748 = this.f5504;
        if (c0076M3043 == null) {
            if (!c0748.f2156) {
                ((C0263) ((C0113) c0748.f2153).f357).m827();
                ((C1631) c0748.f2154).m3013();
            }
            return 0;
        }
        List list = (List) c0076M3043.f227;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = list.get(size);
                if (((C1636) obj).f4781 && (actionMasked == 0 || actionMasked == 5)) {
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
            this.f5479 = c1636.f4782;
        }
        int iM1557 = c0748.m1557(c0076M3043, this, m3545(motionEvent));
        c0076M3043.f228 = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iM1557 & 1) != 0) {
            return iM1557;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        c1648.f4838.delete(pointerId);
        c1648.f4839.delete(pointerId);
        return iM1557;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final long m3534(long j) {
        m3526();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.f5490 >> 32));
        return C1587.m2906((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.f5490 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.f5489);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m3535(C1748 c1748) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (c1748 != null) {
            while (c1748 != null && c1748.m3260() == LayoutNode$UsageByParent.InMeasureBlock) {
                if (!this.f5495) {
                    C1748 c1748M3256 = c1748.m3256();
                    if (c1748M3256 == null) {
                        break;
                    }
                    long j = c1748M3256.f5094.f5286.f4996;
                    if (C7898.m13331(j) && C7898.m13332(j)) {
                        break;
                    }
                }
                c1748 = c1748.m3256();
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
    public final boolean m3536() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    @Override // androidx.lifecycle.InterfaceC2409
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo3537(InterfaceC2388 interfaceC2388) {
        InterfaceC1352 interfaceC1352Mo2319;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(AbstractC1916.m3630());
        }
        final C1870 c1870 = this.f5478;
        if (c1870 != null) {
            InterfaceC1869 interfaceC1869 = this.f5477;
            interfaceC1869.getClass();
            C0113 c0113 = c1870.f5377;
            C2411 c2411 = (C2411) c0113.f357;
            if (!c2411.f7051 || c2411.f7050) {
                return;
            }
            try {
                interfaceC1352Mo2319 = ((C1852) interfaceC1869).f5361.mo2319(new InterfaceC6543() { // from class: androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry$stopRetainingExitedValues$1
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m3440invoke() {
                        C2411 c24112 = (C2411) c1870.f5377.f357;
                        if (c24112.f7049) {
                            return;
                        }
                        if (c24112.f7050) {
                            AbstractC7350.m12543("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                        }
                        c24112.m4514();
                        c24112.f7050 = true;
                    }

                    @Override // p052.InterfaceC6543
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m3440invoke();
                        return C5176.f14739;
                    }
                });
            } catch (CancellationException unused) {
                C2411 c24112 = (C2411) c0113.f357;
                if (!c24112.f7049) {
                    if (c24112.f7050) {
                        AbstractC7350.m12543("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    c24112.m4514();
                    c24112.f7050 = true;
                }
                interfaceC1352Mo2319 = null;
            }
            InterfaceC1352 interfaceC1352 = c1870.f5374;
            if (interfaceC1352 != null) {
                interfaceC1352.cancel();
            }
            c1870.f5374 = interfaceC1352Mo2319;
        }
    }

    @Override // androidx.compose.ui.focus.InterfaceC1484
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2542(C1452 c1452, C1452 c14522) {
        C1811 c1811;
        boolean z;
        C1811 c18112;
        boolean z2;
        if (c1452 != null) {
            C1452 c14523 = c1452;
            if (!c14523.f6292.f6279) {
                AbstractC7936.m13423("visitAncestors called on an unattached node");
            }
            AbstractC2128 abstractC2128 = c14523.f6292;
            C1748 c1748M3346 = AbstractC1785.m3346(c1452);
            C0235 c0235 = null;
            ArrayList arrayList = null;
            while (c1748M3346 != null) {
                if ((c1748M3346.f5094.f5283.f6285 & 2097152) != 0) {
                    while (abstractC2128 != null) {
                        if ((abstractC2128.f6291 & 2097152) != 0) {
                            AbstractC2128 abstractC2128M3339 = abstractC2128;
                            C1224 c1224 = null;
                            while (abstractC2128M3339 != null) {
                                if (abstractC2128M3339 instanceof InterfaceC7320) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(abstractC2128M3339);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (abstractC2128M3339.f6291 & 2097152) != 0 && (abstractC2128M3339 instanceof AbstractC1788)) {
                                    int i = 0;
                                    for (AbstractC2128 abstractC21282 = ((AbstractC1788) abstractC2128M3339).f5226; abstractC21282 != null; abstractC21282 = abstractC21282.f6288) {
                                        if ((abstractC21282.f6291 & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                abstractC2128M3339 = abstractC21282;
                                            } else {
                                                if (c1224 == null) {
                                                    c1224 = new C1224(0, new AbstractC2128[16]);
                                                }
                                                if (abstractC2128M3339 != null) {
                                                    c1224.m2047(abstractC2128M3339);
                                                    abstractC2128M3339 = null;
                                                }
                                                c1224.m2047(abstractC21282);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                abstractC2128M3339 = AbstractC1785.m3339(c1224);
                            }
                        }
                        abstractC2128 = abstractC2128.f6284;
                    }
                }
                c1748M3346 = c1748M3346.m3256();
                abstractC2128 = (c1748M3346 == null || (c18112 = c1748M3346.f5094) == null) ? null : c18112.f5284;
            }
            if (arrayList == null) {
                return;
            }
            if (c14522 != null) {
                if (!c14522.f6292.f6279) {
                    AbstractC7936.m13423("visitAncestors called on an unattached node");
                }
                AbstractC2128 abstractC21283 = c14522.f6292;
                C1748 c1748M33462 = AbstractC1785.m3346(c14522);
                C0235 c02352 = null;
                while (c1748M33462 != null) {
                    if ((c1748M33462.f5094.f5283.f6285 & 2097152) != 0) {
                        while (abstractC21283 != null) {
                            if ((abstractC21283.f6291 & 2097152) != 0) {
                                AbstractC2128 abstractC2128M33392 = abstractC21283;
                                C1224 c12242 = null;
                                while (abstractC2128M33392 != null) {
                                    if (abstractC2128M33392 instanceof InterfaceC7320) {
                                        if (c02352 == null) {
                                            C0235 c02353 = AbstractC0285.f997;
                                            c02352 = new C0235();
                                        }
                                        c02352.m741(abstractC2128M33392);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (abstractC2128M33392.f6291 & 2097152) != 0 && (abstractC2128M33392 instanceof AbstractC1788)) {
                                        int i2 = 0;
                                        for (AbstractC2128 abstractC21284 = ((AbstractC1788) abstractC2128M33392).f5226; abstractC21284 != null; abstractC21284 = abstractC21284.f6288) {
                                            if ((abstractC21284.f6291 & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    abstractC2128M33392 = abstractC21284;
                                                } else {
                                                    if (c12242 == null) {
                                                        c12242 = new C1224(0, new AbstractC2128[16]);
                                                    }
                                                    if (abstractC2128M33392 != null) {
                                                        c12242.m2047(abstractC2128M33392);
                                                        abstractC2128M33392 = null;
                                                    }
                                                    c12242.m2047(abstractC21284);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    abstractC2128M33392 = AbstractC1785.m3339(c12242);
                                }
                            }
                            abstractC21283 = abstractC21283.f6284;
                        }
                    }
                    c1748M33462 = c1748M33462.m3256();
                    abstractC21283 = (c1748M33462 == null || (c1811 = c1748M33462.f5094) == null) ? null : c1811.f5284;
                }
                c0235 = c02352;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC7320 interfaceC7320 = (InterfaceC7320) arrayList.get(i3);
                if (!(c0235 != null ? c0235.m874(interfaceC7320) : false)) {
                    interfaceC7320.mo1234();
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long m3538(long j) {
        m3526();
        long jM2906 = C1587.m2906(j, this.f5493);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f5490 >> 32)) + Float.intBitsToFloat((int) (jM2906 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f5490 & 4294967295L)) + Float.intBitsToFloat((int) (jM2906 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m3539(float[] fArr) {
        m3526();
        C1587.m2903(fArr, this.f5493);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f5490 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f5490 & 4294967295L));
        InterfaceC6558 interfaceC6558 = AbstractC1836.f5338;
        float[] fArr2 = this.f5492;
        C1587.m2904(fArr2);
        C1587.m2902(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        AbstractC1836.m3469(fArr, fArr2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final boolean m3540(int i) {
        if (i != 7 && i != 8) {
            Integer numM2651 = AbstractC1481.m2651(i);
            if (numM2651 == null) {
                throw AbstractC0053.m139("Invalid focus direction");
            }
            int iIntValue = numM2651.intValue();
            C1452 c1452M2643 = ((C1478) getFocusOwner()).m2643();
            if (c1452M2643 == null) {
                C5925.m11311("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer numM26512 = AbstractC1481.m2651(i);
            if (numM26512 == null) {
                throw AbstractC0053.m139("Invalid focus direction");
            }
            int iIntValue2 = numM26512.intValue();
            AbstractC2076 abstractC2076 = AbstractC1785.m3346(c1452M2643).f5116;
            View interopView = abstractC2076 != null ? abstractC2076.getInteropView() : null;
            View viewFindFocus = findFocus();
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            rootView.getClass();
            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
            if (viewFindNextFocus == null || interopView == null || !AbstractC1836.m3471(interopView, viewFindNextFocus)) {
                viewFindNextFocus = null;
            }
            if (viewFindNextFocus != null) {
                return AbstractC1481.m2652(viewFindNextFocus, Integer.valueOf(iIntValue), null);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m3541() {
        if (this.f5486) {
            getSnapshotObserver().m3412();
            this.f5486 = false;
        }
        C1817 c1817 = this.f5498;
        if (c1817 != null) {
            m3517(c1817);
        }
        C1407 c1407 = this.f5487;
        if (c1407 != null) {
            C0245 c0245 = c1407.f4064;
            if (c0245.f899 == 0 && c1407.f4065) {
                ((AutofillManager) c1407.f4070.f357).commit();
                c1407.f4065 = false;
            }
            if (c0245.f899 != 0) {
                c1407.f4065 = true;
            }
        }
        while (true) {
            C0244 c0244 = this.f5469;
            if (!c0244.m878() || c0244.m881(0) == null) {
                return;
            }
            int i = c0244.f1004;
            for (int i2 = 0; i2 < i; i2++) {
                InterfaceC6543 interfaceC6543 = (InterfaceC6543) c0244.m881(i2);
                c0244.m772(i2, null);
                if (interfaceC6543 != null) {
                    interfaceC6543.invoke();
                }
            }
            c0244.m771(0, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m3542(boolean z) {
        InterfaceC6543 interfaceC6543;
        C1743 c1743 = this.f5494;
        if (c1743.f5051.m3329() || ((C1224) c1743.f5048.f227).f3520 != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    interfaceC6543 = this.f5444;
                } finally {
                    Trace.endSection();
                }
            } else {
                interfaceC6543 = null;
            }
            if (c1743.m3198(interfaceC6543)) {
                requestLayout();
            }
            c1743.m3188(false);
            getRectManager().m3689();
            if (this.f5501) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f5501 = false;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m3543(C1748 c1748, long j) {
        C1743 c1743 = this.f5494;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            c1743.m3191(c1748, j);
            if (!c1743.f5051.m3329()) {
                c1743.m3188(false);
                getRectManager().m3689();
                if (this.f5501) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f5501 = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m3544(C1748 c1748) {
        this.f5494.m3193(c1748, false);
        C1224 c1224M3239 = c1748.m3239();
        Object[] objArr = c1224M3239.f3521;
        int i = c1224M3239.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            m3544((C1748) objArr[i2]);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean m3545(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean m3546(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f5468) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m3547(C1748 c1748, boolean z) {
        this.f5494.m3197(c1748, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m3548(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884.m3548(android.view.MotionEvent):int");
    }

    /* JADX INFO: renamed from: getAccessibilityManager, reason: merged with bridge method [inline-methods] */
    public C1895 m3549getAccessibilityManager() {
        return this.f5421;
    }

    /* JADX INFO: renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public C1899 m3550getClipboard() {
        return this.f5484;
    }

    /* JADX INFO: renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public C1900 m3551getClipboardManager() {
        return this.f5485;
    }

    public ViewOnDragListenerC1428 getDragAndDropManager() {
        return this.f5430;
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public C0246 m3553getLayoutNodes() {
        return this.f5426;
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

    @InterfaceC5169
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m3509getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @InterfaceC5169
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
