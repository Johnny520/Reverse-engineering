package androidx.compose.foundation.layout;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import androidx.collection.C0235;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.ui.graphics.C1614;
import androidx.core.view.AbstractC2189;
import androidx.core.view.AbstractC2193;
import androidx.core.view.AbstractC2255;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2225;
import androidx.core.view.C2238;
import androidx.core.view.C2254;
import com.davemorrissey.labs.subscaleview.R;
import java.util.WeakHashMap;
import p164.C7664;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0625 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final WeakHashMap f1739 = new WeakHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0631 f1740;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0631 f1741;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0631 f1742;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0631 f1743;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0631 f1744;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0631 f1745;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f1746;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f1747;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final RunnableC0670 f1748;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C0612 f1749;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C0612 f1750;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0612 f1751;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0612 f1752;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C0612 f1753;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0612 f1754;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C0631 f1755;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0631 f1756;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC1395 f1757;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C0612 f1758;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C0631 f1759;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C0612 f1760;

    public C0625(View view) {
        C0631 c0631M1448 = C0646.m1448(4, "captionBar");
        this.f1745 = c0631M1448;
        C0631 c0631M14482 = C0646.m1448(128, "displayCutout");
        this.f1744 = c0631M14482;
        C0631 c0631M14483 = C0646.m1448(8, "ime");
        this.f1743 = c0631M14483;
        C0631 c0631M14484 = C0646.m1448(32, "mandatorySystemGestures");
        this.f1742 = c0631M14484;
        C0631 c0631M14485 = C0646.m1448(2, "navigationBars");
        this.f1741 = c0631M14485;
        C0631 c0631M14486 = C0646.m1448(1, "statusBars");
        this.f1740 = c0631M14486;
        C0631 c0631M14487 = C0646.m1448(519, "systemBars");
        this.f1756 = c0631M14487;
        C0631 c0631M14488 = C0646.m1448(16, "systemGestures");
        this.f1755 = c0631M14488;
        C0631 c0631M14489 = C0646.m1448(64, "tappableElement");
        this.f1759 = c0631M14489;
        C0612 c0612 = new C0612(new C0671(0, 0, 0, 0), "waterfall");
        this.f1760 = c0612;
        this.f1757 = AbstractC1367.m2465(null);
        new C0609(new C0609(new C0609(c0631M14487, c0631M14483), c0631M14482), new C0609(new C0609(new C0609(c0631M14489, c0631M14484), c0631M14488), c0612));
        this.f1758 = C0646.m1447(4, "captionBarIgnoringVisibility");
        this.f1750 = C0646.m1447(2, "navigationBarsIgnoringVisibility");
        this.f1749 = C0646.m1447(1, "statusBarsIgnoringVisibility");
        this.f1753 = C0646.m1447(519, "systemBarsIgnoringVisibility");
        this.f1754 = C0646.m1447(64, "tappableElementIgnoringVisibility");
        this.f1751 = new C0612(new C0671(0, 0, 0, 0), "imeAnimationTarget");
        this.f1752 = new C0612(new C0671(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f1747 = bool != null ? bool.booleanValue() : false;
        this.f1748 = new RunnableC0670(this);
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        C2225 c2225M3983 = AbstractC2189.m3983(view);
        if (c2225M3983 != null) {
            C2238 c2238 = c2225M3983.f6520;
            c0631M1448.m1436(c2238.mo4035(4));
            c0631M14482.m1436(c2238.mo4035(128));
            c0631M14483.m1436(c2238.mo4035(8));
            c0631M14484.m1436(c2238.mo4035(32));
            c0631M14485.m1436(c2238.mo4035(2));
            c0631M14486.m1436(c2238.mo4035(1));
            c0631M14487.m1436(c2238.mo4035(519));
            c0631M14488.m1436(c2238.mo4035(16));
            c0631M14489.m1436(c2238.mo4035(64));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m1379(C0625 c0625, C2225 c2225) {
        boolean z = false;
        c0625.f1745.m1438(c2225, 0);
        c0625.f1743.m1438(c2225, 0);
        c0625.f1744.m1438(c2225, 0);
        c0625.f1741.m1438(c2225, 0);
        c0625.f1740.m1438(c2225, 0);
        c0625.f1756.m1438(c2225, 0);
        c0625.f1755.m1438(c2225, 0);
        c0625.f1759.m1438(c2225, 0);
        c0625.f1742.m1438(c2225, 0);
        c0625.f1758.m1367(AbstractC0628.m1417(c2225.f6520.mo4043(4)));
        c0625.f1750.m1367(AbstractC0628.m1417(c2225.f6520.mo4043(2)));
        c0625.f1749.m1367(AbstractC0628.m1417(c2225.f6520.mo4043(1)));
        c0625.f1753.m1367(AbstractC0628.m1417(c2225.f6520.mo4043(519)));
        c0625.f1754.m1367(AbstractC0628.m1417(c2225.f6520.mo4043(64)));
        C2254 c2254Mo4012 = c2225.f6520.mo4012();
        c0625.f1760.m1367(AbstractC0628.m1417(c2254Mo4012 != null ? c2254Mo4012.m4202() : C7664.f20811));
        C1614 c1614 = null;
        if (c2254Mo4012 != null) {
            Path pathM4203 = Build.VERSION.SDK_INT >= 31 ? AbstractC2255.m4203(c2254Mo4012.f6560) : null;
            if (pathM4203 != null) {
                c1614 = new C1614(pathM4203);
            }
        }
        ((AbstractC1347) c0625.f1757).setValue(c1614);
        synchronized (AbstractC1280.f3744) {
            C0235 c0235 = AbstractC1280.f3751.f3696;
            if (c0235 != null) {
                if (c0235.m871()) {
                    z = true;
                }
            }
        }
        if (z) {
            AbstractC1280.m2253();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1380(View view) {
        if (this.f1746 == 0) {
            WeakHashMap weakHashMap = AbstractC2270.f6593;
            RunnableC0670 runnableC0670 = this.f1748;
            AbstractC2193.m3994(view, runnableC0670);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(runnableC0670);
            AbstractC2270.m4232(view, runnableC0670);
        }
        this.f1746++;
    }
}
