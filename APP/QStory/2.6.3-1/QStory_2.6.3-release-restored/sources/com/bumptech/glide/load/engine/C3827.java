package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC3795;
import java.io.File;
import java.util.List;
import p244.C8865;
import p244.InterfaceC8862;
import p302.InterfaceC9222;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3827 implements InterfaceC3824, InterfaceC3795 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC9222 f9820;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f9821 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public volatile C8865 f9822;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public File f9823;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public List f9824;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f9825;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3843 f9826;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC3825 f9827;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f9828;

    public C3827(List list, C3843 c3843, InterfaceC3825 interfaceC3825) {
        this.f9828 = list;
        this.f9826 = c3843;
        this.f9827 = interfaceC3825;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3824
    public final void cancel() {
        C8865 c8865 = this.f9822;
        if (c8865 != null) {
            c8865.f22531.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3795
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo6994(Object obj) {
        this.f9827.mo7035(this.f9820, obj, this.f9822.f22531, DataSource.DATA_DISK_CACHE, this.f9820);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3795
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6995(Exception exc) {
        this.f9827.mo7036(this.f9820, exc, this.f9822.f22531, DataSource.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3824
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo7029() {
        while (true) {
            List list = this.f9824;
            boolean z = false;
            if (list != null && this.f9825 < list.size()) {
                this.f9822 = null;
                while (!z && this.f9825 < this.f9824.size()) {
                    List list2 = this.f9824;
                    int i = this.f9825;
                    this.f9825 = i + 1;
                    InterfaceC8862 interfaceC8862 = (InterfaceC8862) list2.get(i);
                    File file = this.f9823;
                    C3843 c3843 = this.f9826;
                    this.f9822 = interfaceC8862.mo14061(file, c3843.f9903, c3843.f9902, c3843.f9918);
                    if (this.f9822 != null && this.f9826.m7065(this.f9822.f22531.mo6993()) != null) {
                        this.f9822.f22531.mo6990(this.f9826.f9912, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f9821 + 1;
            this.f9821 = i2;
            if (i2 >= this.f9828.size()) {
                return false;
            }
            InterfaceC9222 interfaceC9222 = (InterfaceC9222) this.f9828.get(this.f9821);
            C3843 c38432 = this.f9826;
            File fileMo12213 = c38432.f9914.m7046().mo12213(new C3826(interfaceC9222, c38432.f9908));
            this.f9823 = fileMo12213;
            if (fileMo12213 != null) {
                this.f9820 = interfaceC9222;
                this.f9824 = this.f9826.f9905.m7444().m7435(fileMo12213);
                this.f9825 = 0;
            }
        }
    }
}
