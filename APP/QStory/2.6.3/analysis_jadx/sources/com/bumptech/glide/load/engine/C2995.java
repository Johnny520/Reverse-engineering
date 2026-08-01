package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2963;
import java.io.File;
import java.util.List;
import p228.C8036;
import p228.InterfaceC8033;
import p286.InterfaceC8393;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2995 implements InterfaceC2992, InterfaceC2963 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC8393 f9475;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f9476 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public volatile C8036 f9477;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public File f9478;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public List f9479;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f9480;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C3011 f9481;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC2993 f9482;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final List f9483;

    public C2995(List list, C3011 c3011, InterfaceC2993 interfaceC2993) {
        this.f9483 = list;
        this.f9481 = c3011;
        this.f9482 = interfaceC2993;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2992
    public final void cancel() {
        C8036 c8036 = this.f9477;
        if (c8036 != null) {
            c8036.f22186.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2963
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo6434(Object obj) {
        this.f9482.mo6475(this.f9475, obj, this.f9477.f22186, DataSource.DATA_DISK_CACHE, this.f9475);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2963
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo6435(Exception exc) {
        this.f9482.mo6476(this.f9475, exc, this.f9477.f22186, DataSource.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2992
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo6469() {
        while (true) {
            List list = this.f9479;
            boolean z = false;
            if (list != null && this.f9480 < list.size()) {
                this.f9477 = null;
                while (!z && this.f9480 < this.f9479.size()) {
                    List list2 = this.f9479;
                    int i = this.f9480;
                    this.f9480 = i + 1;
                    InterfaceC8033 interfaceC8033 = (InterfaceC8033) list2.get(i);
                    File file = this.f9478;
                    C3011 c3011 = this.f9481;
                    this.f9477 = interfaceC8033.mo13502(file, c3011.f9558, c3011.f9557, c3011.f9573);
                    if (this.f9477 != null && this.f9481.m6505(this.f9477.f22186.mo6433()) != null) {
                        this.f9477.f22186.mo6430(this.f9481.f9567, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f9476 + 1;
            this.f9476 = i2;
            if (i2 >= this.f9483.size()) {
                return false;
            }
            InterfaceC8393 interfaceC8393 = (InterfaceC8393) this.f9483.get(this.f9476);
            C3011 c30112 = this.f9481;
            File fileMo11654 = c30112.f9569.m6486().mo11654(new C2994(interfaceC8393, c30112.f9563));
            this.f9478 = fileMo11654;
            if (fileMo11654 != null) {
                this.f9475 = interfaceC8393;
                this.f9479 = this.f9481.f9560.m6884().m6875(fileMo11654);
                this.f9480 = 0;
            }
        }
    }
}
