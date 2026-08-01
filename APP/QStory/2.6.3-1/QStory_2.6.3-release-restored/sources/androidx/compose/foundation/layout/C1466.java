package androidx.compose.foundation.layout;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import androidx.collection.C1082;
import androidx.compose.p001ui.graphics.C2449;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.core.view.AbstractC3022;
import androidx.core.view.AbstractC3026;
import androidx.core.view.AbstractC3088;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3058;
import androidx.core.view.C3071;
import androidx.core.view.C3087;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.WeakHashMap;
import p180.C8494;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1466 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final WeakHashMap f2085 = new WeakHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1472 f2086;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1472 f2087;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1472 f2088;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1472 f2089;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1472 f2090;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1472 f2091;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f2092;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f2093;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final RunnableC1511 f2094;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C1453 f2095;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C1453 f2096;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1453 f2097;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1453 f2098;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C1453 f2099;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1453 f2100;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C1472 f2101;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C1472 f2102;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC2230 f2103;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C1453 f2104;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C1472 f2105;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C1453 f2106;

    public C1466(View view) {
        C1472 c1472M2018 = C1487.m2018(4, "captionBar");
        this.f2091 = c1472M2018;
        C1472 c1472M20182 = C1487.m2018(128, "displayCutout");
        this.f2090 = c1472M20182;
        C1472 c1472M20183 = C1487.m2018(8, "ime");
        this.f2089 = c1472M20183;
        C1472 c1472M20184 = C1487.m2018(32, "mandatorySystemGestures");
        this.f2088 = c1472M20184;
        C1472 c1472M20185 = C1487.m2018(2, "navigationBars");
        this.f2087 = c1472M20185;
        C1472 c1472M20186 = C1487.m2018(1, "statusBars");
        this.f2086 = c1472M20186;
        C1472 c1472M20187 = C1487.m2018(519, "systemBars");
        this.f2102 = c1472M20187;
        C1472 c1472M20188 = C1487.m2018(16, "systemGestures");
        this.f2101 = c1472M20188;
        C1472 c1472M20189 = C1487.m2018(64, "tappableElement");
        this.f2105 = c1472M20189;
        C1453 c1453 = new C1453(new C1512(0, 0, 0, 0), "waterfall");
        this.f2106 = c1453;
        this.f2103 = AbstractC2202.m3034(null);
        new C1450(new C1450(new C1450(c1472M20187, c1472M20183), c1472M20182), new C1450(new C1450(new C1450(c1472M20189, c1472M20184), c1472M20188), c1453));
        this.f2104 = C1487.m2017(4, "captionBarIgnoringVisibility");
        this.f2096 = C1487.m2017(2, "navigationBarsIgnoringVisibility");
        this.f2095 = C1487.m2017(1, "statusBarsIgnoringVisibility");
        this.f2099 = C1487.m2017(519, "systemBarsIgnoringVisibility");
        this.f2100 = C1487.m2017(64, "tappableElementIgnoringVisibility");
        this.f2097 = new C1453(new C1512(0, 0, 0, 0), "imeAnimationTarget");
        this.f2098 = new C1453(new C1512(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(C0328R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f2093 = bool != null ? bool.booleanValue() : false;
        this.f2094 = new RunnableC1511(this);
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        C3058 c3058M4553 = AbstractC3022.m4553(view);
        if (c3058M4553 != null) {
            C3071 c3071 = c3058M4553.f6866;
            c1472M2018.m2006(c3071.mo4605(4));
            c1472M20182.m2006(c3071.mo4605(128));
            c1472M20183.m2006(c3071.mo4605(8));
            c1472M20184.m2006(c3071.mo4605(32));
            c1472M20185.m2006(c3071.mo4605(2));
            c1472M20186.m2006(c3071.mo4605(1));
            c1472M20187.m2006(c3071.mo4605(519));
            c1472M20188.m2006(c3071.mo4605(16));
            c1472M20189.m2006(c3071.mo4605(64));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m1949(C1466 c1466, C3058 c3058) {
        boolean z = false;
        c1466.f2091.m2008(c3058, 0);
        c1466.f2089.m2008(c3058, 0);
        c1466.f2090.m2008(c3058, 0);
        c1466.f2087.m2008(c3058, 0);
        c1466.f2086.m2008(c3058, 0);
        c1466.f2102.m2008(c3058, 0);
        c1466.f2101.m2008(c3058, 0);
        c1466.f2105.m2008(c3058, 0);
        c1466.f2088.m2008(c3058, 0);
        c1466.f2104.m1937(AbstractC1469.m1987(c3058.f6866.mo4613(4)));
        c1466.f2096.m1937(AbstractC1469.m1987(c3058.f6866.mo4613(2)));
        c1466.f2095.m1937(AbstractC1469.m1987(c3058.f6866.mo4613(1)));
        c1466.f2099.m1937(AbstractC1469.m1987(c3058.f6866.mo4613(519)));
        c1466.f2100.m1937(AbstractC1469.m1987(c3058.f6866.mo4613(64)));
        C3087 c3087Mo4582 = c3058.f6866.mo4582();
        c1466.f2106.m1937(AbstractC1469.m1987(c3087Mo4582 != null ? c3087Mo4582.m4772() : C8494.f21151));
        C2449 c2449 = null;
        if (c3087Mo4582 != null) {
            Path pathM4773 = Build.VERSION.SDK_INT >= 31 ? AbstractC3088.m4773(c3087Mo4582.f6906) : null;
            if (pathM4773 != null) {
                c2449 = new C2449(pathM4773);
            }
        }
        ((AbstractC2182) c1466.f2103).setValue(c2449);
        synchronized (AbstractC2115.f4090) {
            C1082 c1082 = AbstractC2115.f4097.f4042;
            if (c1082 != null) {
                if (c1082.m1432()) {
                    z = true;
                }
            }
        }
        if (z) {
            AbstractC2115.m2823();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1950(View view) {
        if (this.f2092 == 0) {
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            RunnableC1511 runnableC1511 = this.f2094;
            AbstractC3026.m4564(view, runnableC1511);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(runnableC1511);
            AbstractC3103.m4802(view, runnableC1511);
        }
        this.f2092++;
    }
}
