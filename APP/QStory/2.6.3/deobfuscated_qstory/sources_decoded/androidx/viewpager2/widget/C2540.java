package androidx.viewpager2.widget;

import androidx.recyclerview.widget.AbstractC2533;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2540 extends AbstractC2533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f7650;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f7651;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinearLayoutManager f7652;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2550 f7653;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2549 f7654;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C2543 f7655;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f7656;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C2541 f7657;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f7658;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f7659;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f7660;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f7661;

    public C2540(C2549 c2549) {
        this.f7654 = c2549;
        C2550 c2550 = c2549.f7677;
        this.f7653 = c2550;
        this.f7652 = (LinearLayoutManager) c2550.getLayoutManager();
        this.f7657 = new C2541();
        m5047();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x013e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5046() {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C2540.m5046():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m5047() {
        this.f7651 = 0;
        this.f7650 = 0;
        C2541 c2541 = this.f7657;
        c2541.f7664 = -1;
        c2541.f7663 = 0.0f;
        c2541.f7662 = 0;
        this.f7656 = -1;
        this.f7660 = -1;
        this.f7661 = false;
        this.f7658 = false;
        this.f7659 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m5048(int i) {
        if ((this.f7651 == 3 && this.f7650 == 0) || this.f7650 == i) {
            return;
        }
        this.f7650 = i;
        C2543 c2543 = this.f7655;
        if (c2543 != null) {
            c2543.mo5051(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    @Override // androidx.recyclerview.widget.AbstractC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo4898(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r6 = 1
            r5.f7658 = r6
            r5.m5046()
            boolean r0 = r5.f7661
            r1 = -1
            androidx.viewpager2.widget.飘花落叶言子楪世兰苏哲 r2 = r5.f7657
            r3 = 0
            if (r0 == 0) goto L42
            r5.f7661 = r3
            if (r8 > 0) goto L2a
            if (r8 != 0) goto L32
            if (r7 >= 0) goto L18
            r7 = r6
            goto L19
        L18:
            r7 = r3
        L19:
            androidx.viewpager2.widget.飘花落叶言子楪哲兰苏世 r8 = r5.f7654
            androidx.viewpager2.widget.飘花落叶言子楪苏哲兰世 r8 = r8.f7688
            androidx.recyclerview.widget.RecyclerView r8 = r8.f7592
            int r8 = r8.getLayoutDirection()
            if (r8 != r6) goto L27
            r8 = r6
            goto L28
        L27:
            r8 = r3
        L28:
            if (r7 != r8) goto L32
        L2a:
            int r7 = r2.f7662
            if (r7 == 0) goto L32
            int r7 = r2.f7664
            int r7 = r7 + r6
            goto L34
        L32:
            int r7 = r2.f7664
        L34:
            r5.f7660 = r7
            int r8 = r5.f7656
            if (r8 == r7) goto L52
            androidx.viewpager2.widget.飘花落叶言子楪世哲苏兰 r8 = r5.f7655
            if (r8 == 0) goto L52
            r8.mo5049(r7)
            goto L52
        L42:
            int r7 = r5.f7651
            if (r7 != 0) goto L52
            int r7 = r2.f7664
            if (r7 != r1) goto L4b
            r7 = r3
        L4b:
            androidx.viewpager2.widget.飘花落叶言子楪世哲苏兰 r8 = r5.f7655
            if (r8 == 0) goto L52
            r8.mo5049(r7)
        L52:
            int r7 = r2.f7664
            if (r7 != r1) goto L57
            r7 = r3
        L57:
            float r8 = r2.f7663
            int r0 = r2.f7662
            androidx.viewpager2.widget.飘花落叶言子楪世哲苏兰 r4 = r5.f7655
            if (r4 == 0) goto L62
            r4.mo5050(r7, r8, r0)
        L62:
            int r7 = r2.f7664
            int r8 = r5.f7660
            if (r7 == r8) goto L6a
            if (r8 != r1) goto L78
        L6a:
            int r7 = r2.f7662
            if (r7 != 0) goto L78
            int r7 = r5.f7650
            if (r7 == r6) goto L78
            r5.m5048(r3)
            r5.m5047()
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C2540.mo4898(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    @Override // androidx.recyclerview.widget.AbstractC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo4899(RecyclerView recyclerView, int i) {
        C2543 c2543;
        C2543 c25432;
        int i2 = this.f7651;
        if (!(i2 == 1 && this.f7650 == 1) && i == 1) {
            this.f7651 = 1;
            int i3 = this.f7660;
            if (i3 != -1) {
                this.f7656 = i3;
                this.f7660 = -1;
            } else if (this.f7656 == -1) {
                this.f7656 = this.f7652.m4646();
            }
            m5048(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.f7658) {
                m5048(2);
                this.f7661 = true;
                return;
            }
            return;
        }
        C2541 c2541 = this.f7657;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            m5046();
            if (!this.f7658) {
                int i4 = c2541.f7664;
                if (i4 != -1 && (c25432 = this.f7655) != null) {
                    c25432.mo5050(i4, 0.0f, 0);
                }
            } else if (c2541.f7662 == 0) {
                int i5 = this.f7656;
                int i6 = c2541.f7664;
                if (i5 != i6 && (c2543 = this.f7655) != null) {
                    c2543.mo5049(i6);
                }
            }
            m5048(0);
            m5047();
        }
        if (this.f7651 == 2 && i == 0 && this.f7659) {
            m5046();
            if (c2541.f7662 == 0) {
                int i7 = this.f7660;
                int i8 = c2541.f7664;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    C2543 c25433 = this.f7655;
                    if (c25433 != null) {
                        c25433.mo5049(i8);
                    }
                }
                m5048(0);
                m5047();
            }
        }
    }
}
