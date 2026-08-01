package com.bumptech.glide.load.engine;

import java.io.File;
import p011.C6214;
import p075.C6958;
import p167.C7712;
import p222.AbstractC7989;
import p222.InterfaceC7987;
import p230.C8049;
import p230.InterfaceC8052;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3004 implements InterfaceC7987 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f9531;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile Object f9532;

    public /* synthetic */ C3004(Object obj) {
        this.f9531 = obj;
    }

    @Override // p222.InterfaceC7987
    public Object get() {
        if (this.f9532 == null) {
            synchronized (this) {
                try {
                    if (this.f9532 == null) {
                        Object obj = ((InterfaceC7987) this.f9531).get();
                        AbstractC7989.m13469(obj, "Argument must not be null");
                        this.f9532 = obj;
                    }
                } finally {
                }
            }
        }
        return this.f9532;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC8052 m6486() {
        if (((InterfaceC8052) this.f9532) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC8052) this.f9532) == null) {
                        File cacheDir = ((C7712) ((C8049) this.f9531).f22219).f20915.getCacheDir();
                        C6214 c6214 = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            c6214 = new C6214(file);
                        }
                        this.f9532 = c6214;
                    }
                    if (((InterfaceC8052) this.f9532) == null) {
                        this.f9532 = new C6958(13);
                    }
                } finally {
                }
            }
        }
        return (InterfaceC8052) this.f9532;
    }
}
