package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2962;
import java.io.File;
import java.util.List;
import p228.C8035;
import p228.InterfaceC8032;
import p286.InterfaceC8392;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2994 implements InterfaceC2991, InterfaceC2962 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC8392 f9473;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f9474 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public volatile C8035 f9475;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public File f9476;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public List f9477;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f9478;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3010 f9479;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC2992 f9480;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f9481;

    public C2994(List list, C3010 c3010, InterfaceC2992 interfaceC2992) {
        this.f9481 = list;
        this.f9479 = c3010;
        this.f9480 = interfaceC2992;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2991
    public final void cancel() {
        C8035 c8035 = this.f9475;
        if (c8035 != null) {
            c8035.f22189.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo6376(Object obj) {
        this.f9480.mo6417(this.f9473, obj, this.f9475.f22189, DataSource.DATA_DISK_CACHE, this.f9473);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6377(Exception exc) {
        this.f9480.mo6418(this.f9473, exc, this.f9475.f22189, DataSource.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2991
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo6411() {
        while (true) {
            List list = this.f9477;
            boolean z = false;
            if (list != null && this.f9478 < list.size()) {
                this.f9475 = null;
                while (!z && this.f9478 < this.f9477.size()) {
                    List list2 = this.f9477;
                    int i = this.f9478;
                    this.f9478 = i + 1;
                    InterfaceC8032 interfaceC8032 = (InterfaceC8032) list2.get(i);
                    File file = this.f9476;
                    C3010 c3010 = this.f9479;
                    this.f9475 = interfaceC8032.mo13474(file, c3010.f9556, c3010.f9555, c3010.f9571);
                    if (this.f9475 != null && this.f9479.m6445(this.f9475.f22189.mo6375()) != null) {
                        this.f9475.f22189.mo6372(this.f9479.f9565, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f9474 + 1;
            this.f9474 = i2;
            if (i2 >= this.f9481.size()) {
                return false;
            }
            InterfaceC8392 interfaceC8392 = (InterfaceC8392) this.f9481.get(this.f9474);
            C3010 c30102 = this.f9479;
            File fileMo11638 = c30102.f9567.m6428().mo11638(new C2993(interfaceC8392, c30102.f9561));
            this.f9476 = fileMo11638;
            if (fileMo11638 != null) {
                this.f9473 = interfaceC8392;
                this.f9477 = this.f9479.f9558.m6897().m6888(fileMo11638);
                this.f9478 = 0;
            }
        }
    }
}
