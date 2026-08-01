package androidx.compose.ui.node;

import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1756 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f5157;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f5158;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f5160;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f5161;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1748 f5162;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f5163;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f5164;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C1747 f5165;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f5166;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f5168;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f5169;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f5170;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f5171;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f5172;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f5173;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public LayoutNode$LayoutState f5159 = LayoutNode$LayoutState.Idle;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1738 f5167 = new C1738(this);

    public C1756(C1748 c1748) {
        this.f5162 = c1748;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3296(boolean z) {
        if (this.f5170 != z) {
            this.f5170 = z;
            if (z && !this.f5173) {
                m3298(this.f5171 + 1);
            } else {
                if (z || this.f5173) {
                    return;
                }
                m3298(this.f5171 - 1);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3297(int i) {
        int i2 = this.f5166;
        this.f5166 = i;
        if ((i2 == 0) != (i == 0)) {
            C1748 c1748M3256 = this.f5162.m3256();
            C1756 c1756 = c1748M3256 != null ? c1748M3256.f5132 : null;
            if (c1756 != null) {
                int i3 = c1756.f5166;
                if (i == 0) {
                    c1756.m3297(i3 - 1);
                } else {
                    c1756.m3297(i3 + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3298(int i) {
        int i2 = this.f5171;
        this.f5171 = i;
        if ((i2 == 0) != (i == 0)) {
            C1748 c1748M3256 = this.f5162.m3256();
            C1756 c1756 = c1748M3256 != null ? c1748M3256.f5132 : null;
            if (c1756 != null) {
                int i3 = c1756.f5171;
                if (i == 0) {
                    c1756.m3298(i3 - 1);
                } else {
                    c1756.m3298(i3 + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3299(long j) {
        C1747 c1747 = this.f5165;
        if (c1747 != null) {
            LayoutNode$LayoutState layoutNode$LayoutState = LayoutNode$LayoutState.LookaheadMeasuring;
            C1756 c1756 = c1747.f5087;
            c1756.f5159 = layoutNode$LayoutState;
            C1748 c1748 = c1756.f5162;
            c1756.f5158 = false;
            c1747.f5072 = j;
            C1803 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1757.m3306(c1748)).getSnapshotObserver();
            InterfaceC6543 interfaceC6543 = c1747.f5071;
            snapshotObserver.f5274.m2246(c1748, snapshotObserver.f5273, interfaceC6543);
            c1756.f5157 = true;
            c1756.f5169 = true;
            boolean zM3345 = AbstractC1785.m3345(c1748);
            C1738 c1738 = c1756.f5167;
            if (zM3345) {
                c1738.f5030 = true;
                c1738.f5021 = true;
            } else {
                c1738.f5031 = true;
            }
            c1756.f5159 = LayoutNode$LayoutState.Idle;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3300() {
        LayoutNode$LayoutState layoutNode$LayoutState = this.f5162.f5132.f5159;
        if (layoutNode$LayoutState == LayoutNode$LayoutState.LayingOut || layoutNode$LayoutState == LayoutNode$LayoutState.LookaheadLayingOut) {
            if (this.f5167.f5018) {
                m3303(true);
            } else {
                m3296(true);
            }
        }
        if (layoutNode$LayoutState == LayoutNode$LayoutState.LookaheadLayingOut) {
            C1747 c1747 = this.f5165;
            if (c1747 == null || !c1747.f5080) {
                m3302(true);
            } else {
                m3304(true);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC1794 m3301() {
        return this.f5162.f5094.f5285;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m3302(boolean z) {
        if (this.f5163 != z) {
            this.f5163 = z;
            if (z && !this.f5164) {
                m3297(this.f5166 + 1);
            } else {
                if (z || this.f5164) {
                    return;
                }
                m3297(this.f5166 - 1);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3303(boolean z) {
        if (this.f5173 != z) {
            this.f5173 = z;
            if (z && !this.f5170) {
                m3298(this.f5171 + 1);
            } else {
                if (z || this.f5170) {
                    return;
                }
                m3298(this.f5171 - 1);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m3304(boolean z) {
        if (this.f5164 != z) {
            this.f5164 = z;
            if (z && !this.f5163) {
                m3297(this.f5166 + 1);
            } else {
                if (z || this.f5163) {
                    return;
                }
                m3297(this.f5166 - 1);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m3305() {
        C1738 c1738 = this.f5167;
        C1756 c1756 = c1738.f5038;
        Object obj = c1738.f5034;
        C1748 c1748 = this.f5162;
        if ((obj != null || c1756.m3301().mo3056() != null) && c1738.f5035) {
            c1738.f5035 = false;
            c1738.f5034 = c1756.m3301().mo3056();
            C1748 c1748M3256 = c1748.m3256();
            if (c1748M3256 != null) {
                C1748.m3224(c1748M3256, false, 7);
            }
        }
        C1747 c1747 = this.f5165;
        if (c1747 != null) {
            C1756 c17562 = c1747.f5087;
            if (c1747.f5069 == null) {
                AbstractC1745 abstractC1745Mo3285 = c17562.m3301().mo3285();
                abstractC1745Mo3285.getClass();
                if (abstractC1745Mo3285.f5063.mo3056() == null) {
                    return;
                }
            }
            if (c1747.f5070) {
                c1747.f5070 = false;
                AbstractC1745 abstractC1745Mo32852 = c17562.m3301().mo3285();
                abstractC1745Mo32852.getClass();
                c1747.f5069 = abstractC1745Mo32852.f5063.mo3056();
                if (AbstractC1785.m3345(c1748)) {
                    C1748 c1748M32562 = c1748.m3256();
                    if (c1748M32562 != null) {
                        C1748.m3224(c1748M32562, false, 7);
                        return;
                    }
                    return;
                }
                C1748 c1748M32563 = c1748.m3256();
                if (c1748M32563 != null) {
                    C1748.m3220(c1748M32563, false, 7);
                }
            }
        }
    }
}
