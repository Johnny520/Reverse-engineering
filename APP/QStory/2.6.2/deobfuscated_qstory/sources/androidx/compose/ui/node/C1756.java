package androidx.compose.ui.node;

import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1756 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f5156;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f5157;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f5159;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f5160;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1748 f5161;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f5162;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f5163;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C1747 f5164;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f5165;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f5167;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f5168;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f5169;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f5170;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f5171;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f5172;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public LayoutNode$LayoutState f5158 = LayoutNode$LayoutState.Idle;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1738 f5166 = new C1738(this);

    public C1756(C1748 c1748) {
        this.f5161 = c1748;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3286(boolean z) {
        if (this.f5169 != z) {
            this.f5169 = z;
            if (z && !this.f5172) {
                m3288(this.f5170 + 1);
            } else {
                if (z || this.f5172) {
                    return;
                }
                m3288(this.f5170 - 1);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3287(int i) {
        int i2 = this.f5165;
        this.f5165 = i;
        if ((i2 == 0) != (i == 0)) {
            C1748 c1748M3246 = this.f5161.m3246();
            C1756 c1756 = c1748M3246 != null ? c1748M3246.f5131 : null;
            if (c1756 != null) {
                int i3 = c1756.f5165;
                if (i == 0) {
                    c1756.m3287(i3 - 1);
                } else {
                    c1756.m3287(i3 + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3288(int i) {
        int i2 = this.f5170;
        this.f5170 = i;
        if ((i2 == 0) != (i == 0)) {
            C1748 c1748M3246 = this.f5161.m3246();
            C1756 c1756 = c1748M3246 != null ? c1748M3246.f5131 : null;
            if (c1756 != null) {
                int i3 = c1756.f5170;
                if (i == 0) {
                    c1756.m3288(i3 - 1);
                } else {
                    c1756.m3288(i3 + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3289(long j) {
        C1747 c1747 = this.f5164;
        if (c1747 != null) {
            LayoutNode$LayoutState layoutNode$LayoutState = LayoutNode$LayoutState.LookaheadMeasuring;
            C1756 c1756 = c1747.f5086;
            c1756.f5158 = layoutNode$LayoutState;
            C1748 c1748 = c1756.f5161;
            c1756.f5157 = false;
            c1747.f5071 = j;
            C1803 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3296(c1748)).getSnapshotObserver();
            InterfaceC6542 interfaceC6542 = c1747.f5070;
            snapshotObserver.f5273.m2236(c1748, snapshotObserver.f5272, interfaceC6542);
            c1756.f5156 = true;
            c1756.f5168 = true;
            boolean zM3335 = AbstractC1785.m3335(c1748);
            C1738 c1738 = c1756.f5166;
            if (zM3335) {
                c1738.f5029 = true;
                c1738.f5020 = true;
            } else {
                c1738.f5030 = true;
            }
            c1756.f5158 = LayoutNode$LayoutState.Idle;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3290() {
        LayoutNode$LayoutState layoutNode$LayoutState = this.f5161.f5131.f5158;
        if (layoutNode$LayoutState == LayoutNode$LayoutState.LayingOut || layoutNode$LayoutState == LayoutNode$LayoutState.LookaheadLayingOut) {
            if (this.f5166.f5017) {
                m3293(true);
            } else {
                m3286(true);
            }
        }
        if (layoutNode$LayoutState == LayoutNode$LayoutState.LookaheadLayingOut) {
            C1747 c1747 = this.f5164;
            if (c1747 == null || !c1747.f5079) {
                m3292(true);
            } else {
                m3294(true);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC1794 m3291() {
        return this.f5161.f5093.f5284;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m3292(boolean z) {
        if (this.f5162 != z) {
            this.f5162 = z;
            if (z && !this.f5163) {
                m3287(this.f5165 + 1);
            } else {
                if (z || this.f5163) {
                    return;
                }
                m3287(this.f5165 - 1);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3293(boolean z) {
        if (this.f5172 != z) {
            this.f5172 = z;
            if (z && !this.f5169) {
                m3288(this.f5170 + 1);
            } else {
                if (z || this.f5169) {
                    return;
                }
                m3288(this.f5170 - 1);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m3294(boolean z) {
        if (this.f5163 != z) {
            this.f5163 = z;
            if (z && !this.f5162) {
                m3287(this.f5165 + 1);
            } else {
                if (z || this.f5162) {
                    return;
                }
                m3287(this.f5165 - 1);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m3295() {
        C1738 c1738 = this.f5166;
        C1756 c1756 = c1738.f5037;
        Object obj = c1738.f5033;
        C1748 c1748 = this.f5161;
        if ((obj != null || c1756.m3291().mo3046() != null) && c1738.f5034) {
            c1738.f5034 = false;
            c1738.f5033 = c1756.m3291().mo3046();
            C1748 c1748M3246 = c1748.m3246();
            if (c1748M3246 != null) {
                C1748.m3214(c1748M3246, false, 7);
            }
        }
        C1747 c1747 = this.f5164;
        if (c1747 != null) {
            C1756 c17562 = c1747.f5086;
            if (c1747.f5068 == null) {
                AbstractC1745 abstractC1745Mo3275 = c17562.m3291().mo3275();
                abstractC1745Mo3275.getClass();
                if (abstractC1745Mo3275.f5062.mo3046() == null) {
                    return;
                }
            }
            if (c1747.f5069) {
                c1747.f5069 = false;
                AbstractC1745 abstractC1745Mo32752 = c17562.m3291().mo3275();
                abstractC1745Mo32752.getClass();
                c1747.f5068 = abstractC1745Mo32752.f5062.mo3046();
                if (AbstractC1785.m3335(c1748)) {
                    C1748 c1748M32462 = c1748.m3246();
                    if (c1748M32462 != null) {
                        C1748.m3214(c1748M32462, false, 7);
                        return;
                    }
                    return;
                }
                C1748 c1748M32463 = c1748.m3246();
                if (c1748M32463 != null) {
                    C1748.m3210(c1748M32463, false, 7);
                }
            }
        }
    }
}
