package androidx.compose.p001ui.node;

import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2591 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f5502;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f5503;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f5505;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f5506;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2583 f5507;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f5508;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f5509;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C2582 f5510;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f5511;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f5513;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f5514;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f5515;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f5516;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f5517;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f5518;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public LayoutNode$LayoutState f5504 = LayoutNode$LayoutState.Idle;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2573 f5512 = new C2573(this);

    public C2591(C2583 c2583) {
        this.f5507 = c2583;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3856(boolean z) {
        if (this.f5515 != z) {
            this.f5515 = z;
            if (z && !this.f5518) {
                m3858(this.f5516 + 1);
            } else {
                if (z || this.f5518) {
                    return;
                }
                m3858(this.f5516 - 1);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3857(int i) {
        int i2 = this.f5511;
        this.f5511 = i;
        if ((i2 == 0) != (i == 0)) {
            C2583 c2583M3816 = this.f5507.m3816();
            C2591 c2591 = c2583M3816 != null ? c2583M3816.f5477 : null;
            if (c2591 != null) {
                int i3 = c2591.f5511;
                if (i == 0) {
                    c2591.m3857(i3 - 1);
                } else {
                    c2591.m3857(i3 + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3858(int i) {
        int i2 = this.f5516;
        this.f5516 = i;
        if ((i2 == 0) != (i == 0)) {
            C2583 c2583M3816 = this.f5507.m3816();
            C2591 c2591 = c2583M3816 != null ? c2583M3816.f5477 : null;
            if (c2591 != null) {
                int i3 = c2591.f5516;
                if (i == 0) {
                    c2591.m3858(i3 - 1);
                } else {
                    c2591.m3858(i3 + 1);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3859(long j) {
        C2582 c2582 = this.f5510;
        if (c2582 != null) {
            LayoutNode$LayoutState layoutNode$LayoutState = LayoutNode$LayoutState.LookaheadMeasuring;
            C2591 c2591 = c2582.f5432;
            c2591.f5504 = layoutNode$LayoutState;
            C2583 c2583 = c2591.f5507;
            c2591.f5503 = false;
            c2582.f5417 = j;
            C2638 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2592.m3866(c2583)).getSnapshotObserver();
            InterfaceC7372 interfaceC7372 = c2582.f5416;
            snapshotObserver.f5619.m2806(c2583, snapshotObserver.f5618, interfaceC7372);
            c2591.f5502 = true;
            c2591.f5514 = true;
            boolean zM3905 = AbstractC2620.m3905(c2583);
            C2573 c2573 = c2591.f5512;
            if (zM3905) {
                c2573.f5375 = true;
                c2573.f5366 = true;
            } else {
                c2573.f5376 = true;
            }
            c2591.f5504 = LayoutNode$LayoutState.Idle;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3860() {
        LayoutNode$LayoutState layoutNode$LayoutState = this.f5507.f5477.f5504;
        if (layoutNode$LayoutState == LayoutNode$LayoutState.LayingOut || layoutNode$LayoutState == LayoutNode$LayoutState.LookaheadLayingOut) {
            if (this.f5512.f5363) {
                m3863(true);
            } else {
                m3856(true);
            }
        }
        if (layoutNode$LayoutState == LayoutNode$LayoutState.LookaheadLayingOut) {
            C2582 c2582 = this.f5510;
            if (c2582 == null || !c2582.f5425) {
                m3862(true);
            } else {
                m3864(true);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC2629 m3861() {
        return this.f5507.f5439.f5630;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m3862(boolean z) {
        if (this.f5508 != z) {
            this.f5508 = z;
            if (z && !this.f5509) {
                m3857(this.f5511 + 1);
            } else {
                if (z || this.f5509) {
                    return;
                }
                m3857(this.f5511 - 1);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3863(boolean z) {
        if (this.f5518 != z) {
            this.f5518 = z;
            if (z && !this.f5515) {
                m3858(this.f5516 + 1);
            } else {
                if (z || this.f5515) {
                    return;
                }
                m3858(this.f5516 - 1);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m3864(boolean z) {
        if (this.f5509 != z) {
            this.f5509 = z;
            if (z && !this.f5508) {
                m3857(this.f5511 + 1);
            } else {
                if (z || this.f5508) {
                    return;
                }
                m3857(this.f5511 - 1);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m3865() {
        C2573 c2573 = this.f5512;
        C2591 c2591 = c2573.f5383;
        Object obj = c2573.f5379;
        C2583 c2583 = this.f5507;
        if ((obj != null || c2591.m3861().mo3616() != null) && c2573.f5380) {
            c2573.f5380 = false;
            c2573.f5379 = c2591.m3861().mo3616();
            C2583 c2583M3816 = c2583.m3816();
            if (c2583M3816 != null) {
                C2583.m3784(c2583M3816, false, 7);
            }
        }
        C2582 c2582 = this.f5510;
        if (c2582 != null) {
            C2591 c25912 = c2582.f5432;
            if (c2582.f5414 == null) {
                AbstractC2580 abstractC2580Mo3845 = c25912.m3861().mo3845();
                abstractC2580Mo3845.getClass();
                if (abstractC2580Mo3845.f5408.mo3616() == null) {
                    return;
                }
            }
            if (c2582.f5415) {
                c2582.f5415 = false;
                AbstractC2580 abstractC2580Mo38452 = c25912.m3861().mo3845();
                abstractC2580Mo38452.getClass();
                c2582.f5414 = abstractC2580Mo38452.f5408.mo3616();
                if (AbstractC2620.m3905(c2583)) {
                    C2583 c2583M38162 = c2583.m3816();
                    if (c2583M38162 != null) {
                        C2583.m3784(c2583M38162, false, 7);
                        return;
                    }
                    return;
                }
                C2583 c2583M38163 = c2583.m3816();
                if (c2583M38163 != null) {
                    C2583.m3780(c2583M38163, false, 7);
                }
            }
        }
    }
}
