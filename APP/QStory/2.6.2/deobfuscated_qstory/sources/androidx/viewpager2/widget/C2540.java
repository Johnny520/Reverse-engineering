package androidx.viewpager2.widget;

import androidx.recyclerview.widget.AbstractC2533;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2540 extends AbstractC2533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f7649;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f7650;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinearLayoutManager f7651;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2550 f7652;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2549 f7653;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C2543 f7654;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f7655;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C2541 f7656;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f7657;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f7658;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f7659;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f7660;

    public C2540(C2549 c2549) {
        this.f7653 = c2549;
        C2550 c2550 = c2549.f7676;
        this.f7652 = c2550;
        this.f7651 = (LinearLayoutManager) c2550.getLayoutManager();
        this.f7656 = new C2541();
        m5037();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x013e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5036() {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C2540.m5036():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m5037() {
        this.f7650 = 0;
        this.f7649 = 0;
        C2541 c2541 = this.f7656;
        c2541.f7663 = -1;
        c2541.f7662 = 0.0f;
        c2541.f7661 = 0;
        this.f7655 = -1;
        this.f7659 = -1;
        this.f7660 = false;
        this.f7657 = false;
        this.f7658 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m5038(int i) {
        if ((this.f7650 == 3 && this.f7649 == 0) || this.f7649 == i) {
            return;
        }
        this.f7649 = i;
        C2543 c2543 = this.f7654;
        if (c2543 != null) {
            c2543.mo5041(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    @Override // androidx.recyclerview.widget.AbstractC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo4888(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f7657 = r6
            r5.m5036()
            boolean r0 = r5.f7660
            r1 = -1
            androidx.viewpager2.widget.飘花落叶言子楪世兰苏哲 r2 = r5.f7656
            r3 = 0
            if (r0 == 0) goto L42
            r5.f7660 = r3
            if (r8 > 0) goto L2a
            if (r8 != 0) goto L32
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.飘花落叶言子楪哲兰苏世 r8 = r5.f7653
            androidx.viewpager2.widget.飘花落叶言子楪苏哲兰世 r8 = r8.f7687
            androidx.recyclerview.widget.RecyclerView r8 = r8.f7591
            int r8 = r8.getLayoutDirection()
            if (r8 != r6) goto L27
            r8 = r6
            goto L28
        L27:
            r8 = r3
        L28:
            if (r7 != r8) goto L32
        L2a:
            int r7 = r2.f7661
            if (r7 == 0) goto L32
            int r7 = r2.f7663
            int r7 = r7 + r6
            goto L34
        L32:
            int r7 = r2.f7663
        L34:
            r5.f7659 = r7
            int r8 = r5.f7655
            if (r8 == r7) goto L52
            androidx.viewpager2.widget.飘花落叶言子楪世哲苏兰 r8 = r5.f7654
            if (r8 == 0) goto L52
            r8.mo5039(r7)
            goto L52
        L42:
            int r7 = r5.f7650
            if (r7 != 0) goto L52
            int r7 = r2.f7663
            if (r7 != r1) goto L4b
            r7 = r3
        L4b:
            androidx.viewpager2.widget.飘花落叶言子楪世哲苏兰 r8 = r5.f7654
            if (r8 == 0) goto L52
            r8.mo5039(r7)
        L52:
            int r7 = r2.f7663
            if (r7 != r1) goto L57
            r7 = r3
        L57:
            float r8 = r2.f7662
            int r0 = r2.f7661
            androidx.viewpager2.widget.飘花落叶言子楪世哲苏兰 r4 = r5.f7654
            if (r4 == 0) goto L62
            r4.mo5040(r7, r8, r0)
        L62:
            int r7 = r2.f7663
            int r8 = r5.f7659
            if (r7 == r8) goto L6a
            if (r8 != r1) goto L78
        L6a:
            int r7 = r2.f7661
            if (r7 != 0) goto L78
            int r7 = r5.f7649
            if (r7 == r6) goto L78
            r5.m5038(r3)
            r5.m5037()
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C2540.mo4888(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    @Override // androidx.recyclerview.widget.AbstractC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo4889(RecyclerView recyclerView, int i) {
        C2543 c2543;
        C2543 c25432;
        int i2 = this.f7650;
        if (!(i2 == 1 && this.f7649 == 1) && i == 1) {
            this.f7650 = 1;
            int i3 = this.f7659;
            if (i3 != -1) {
                this.f7655 = i3;
                this.f7659 = -1;
            } else if (this.f7655 == -1) {
                this.f7655 = this.f7651.m4636();
            }
            m5038(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.f7657) {
                m5038(2);
                this.f7660 = true;
                return;
            }
            return;
        }
        C2541 c2541 = this.f7656;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            m5036();
            if (!this.f7657) {
                int i4 = c2541.f7663;
                if (i4 != -1 && (c25432 = this.f7654) != null) {
                    c25432.mo5040(i4, 0.0f, 0);
                }
            } else if (c2541.f7661 == 0) {
                int i5 = this.f7655;
                int i6 = c2541.f7663;
                if (i5 != i6 && (c2543 = this.f7654) != null) {
                    c2543.mo5039(i6);
                }
            }
            m5038(0);
            m5037();
        }
        if (this.f7650 == 2 && i == 0 && this.f7658) {
            m5036();
            if (c2541.f7661 == 0) {
                int i7 = this.f7659;
                int i8 = c2541.f7663;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    C2543 c25433 = this.f7654;
                    if (c25433 != null) {
                        c25433.mo5039(i8);
                    }
                }
                m5038(0);
                m5037();
            }
        }
    }
}
