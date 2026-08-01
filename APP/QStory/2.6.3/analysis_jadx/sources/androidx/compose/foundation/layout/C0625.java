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
import p164.C7665;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0625 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final WeakHashMap f1740 = new WeakHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0631 f1741;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0631 f1742;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0631 f1743;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0631 f1744;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0631 f1745;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0631 f1746;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f1747;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f1748;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final RunnableC0670 f1749;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C0612 f1750;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C0612 f1751;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0612 f1752;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0612 f1753;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C0612 f1754;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0612 f1755;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C0631 f1756;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0631 f1757;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC1395 f1758;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C0612 f1759;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C0631 f1760;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C0612 f1761;

    public C0625(View view) {
        C0631 c0631M1458 = C0646.m1458(4, "captionBar");
        this.f1746 = c0631M1458;
        C0631 c0631M14582 = C0646.m1458(128, "displayCutout");
        this.f1745 = c0631M14582;
        C0631 c0631M14583 = C0646.m1458(8, "ime");
        this.f1744 = c0631M14583;
        C0631 c0631M14584 = C0646.m1458(32, "mandatorySystemGestures");
        this.f1743 = c0631M14584;
        C0631 c0631M14585 = C0646.m1458(2, "navigationBars");
        this.f1742 = c0631M14585;
        C0631 c0631M14586 = C0646.m1458(1, "statusBars");
        this.f1741 = c0631M14586;
        C0631 c0631M14587 = C0646.m1458(519, "systemBars");
        this.f1757 = c0631M14587;
        C0631 c0631M14588 = C0646.m1458(16, "systemGestures");
        this.f1756 = c0631M14588;
        C0631 c0631M14589 = C0646.m1458(64, "tappableElement");
        this.f1760 = c0631M14589;
        C0612 c0612 = new C0612(new C0671(0, 0, 0, 0), "waterfall");
        this.f1761 = c0612;
        this.f1758 = AbstractC1367.m2474(null);
        new C0609(new C0609(new C0609(c0631M14587, c0631M14583), c0631M14582), new C0609(new C0609(new C0609(c0631M14589, c0631M14584), c0631M14588), c0612));
        this.f1759 = C0646.m1457(4, "captionBarIgnoringVisibility");
        this.f1751 = C0646.m1457(2, "navigationBarsIgnoringVisibility");
        this.f1750 = C0646.m1457(1, "statusBarsIgnoringVisibility");
        this.f1754 = C0646.m1457(519, "systemBarsIgnoringVisibility");
        this.f1755 = C0646.m1457(64, "tappableElementIgnoringVisibility");
        this.f1752 = new C0612(new C0671(0, 0, 0, 0), "imeAnimationTarget");
        this.f1753 = new C0612(new C0671(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f1748 = bool != null ? bool.booleanValue() : false;
        this.f1749 = new RunnableC0670(this);
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        C2225 c2225M3993 = AbstractC2189.m3993(view);
        if (c2225M3993 != null) {
            C2238 c2238 = c2225M3993.f6521;
            c0631M1458.m1446(c2238.mo4045(4));
            c0631M14582.m1446(c2238.mo4045(128));
            c0631M14583.m1446(c2238.mo4045(8));
            c0631M14584.m1446(c2238.mo4045(32));
            c0631M14585.m1446(c2238.mo4045(2));
            c0631M14586.m1446(c2238.mo4045(1));
            c0631M14587.m1446(c2238.mo4045(519));
            c0631M14588.m1446(c2238.mo4045(16));
            c0631M14589.m1446(c2238.mo4045(64));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m1389(C0625 c0625, C2225 c2225) {
        boolean z = false;
        c0625.f1746.m1448(c2225, 0);
        c0625.f1744.m1448(c2225, 0);
        c0625.f1745.m1448(c2225, 0);
        c0625.f1742.m1448(c2225, 0);
        c0625.f1741.m1448(c2225, 0);
        c0625.f1757.m1448(c2225, 0);
        c0625.f1756.m1448(c2225, 0);
        c0625.f1760.m1448(c2225, 0);
        c0625.f1743.m1448(c2225, 0);
        c0625.f1759.m1377(AbstractC0628.m1427(c2225.f6521.mo4053(4)));
        c0625.f1751.m1377(AbstractC0628.m1427(c2225.f6521.mo4053(2)));
        c0625.f1750.m1377(AbstractC0628.m1427(c2225.f6521.mo4053(1)));
        c0625.f1754.m1377(AbstractC0628.m1427(c2225.f6521.mo4053(519)));
        c0625.f1755.m1377(AbstractC0628.m1427(c2225.f6521.mo4053(64)));
        C2254 c2254Mo4022 = c2225.f6521.mo4022();
        c0625.f1761.m1377(AbstractC0628.m1427(c2254Mo4022 != null ? c2254Mo4022.m4212() : C7665.f20806));
        C1614 c1614 = null;
        if (c2254Mo4022 != null) {
            Path pathM4213 = Build.VERSION.SDK_INT >= 31 ? AbstractC2255.m4213(c2254Mo4022.f6561) : null;
            if (pathM4213 != null) {
                c1614 = new C1614(pathM4213);
            }
        }
        ((AbstractC1347) c0625.f1758).setValue(c1614);
        synchronized (AbstractC1280.f3745) {
            C0235 c0235 = AbstractC1280.f3752.f3697;
            if (c0235 != null) {
                if (c0235.m872()) {
                    z = true;
                }
            }
        }
        if (z) {
            AbstractC1280.m2263();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1390(View view) {
        if (this.f1747 == 0) {
            WeakHashMap weakHashMap = AbstractC2270.f6594;
            RunnableC0670 runnableC0670 = this.f1749;
            AbstractC2193.m4004(view, runnableC0670);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(runnableC0670);
            AbstractC2270.m4242(view, runnableC0670);
        }
        this.f1747++;
    }
}
