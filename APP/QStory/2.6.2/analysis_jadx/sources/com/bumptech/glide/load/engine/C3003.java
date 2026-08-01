package com.bumptech.glide.load.engine;

import java.io.File;
import p013.C6188;
import p075.C6957;
import p167.C7711;
import p222.AbstractC7988;
import p222.InterfaceC7986;
import p230.C8048;
import p230.InterfaceC8051;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3003 implements InterfaceC7986 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f9529;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile Object f9530;

    public /* synthetic */ C3003(Object obj) {
        this.f9529 = obj;
    }

    @Override // p222.InterfaceC7986
    public Object get() {
        if (this.f9530 == null) {
            synchronized (this) {
                try {
                    if (this.f9530 == null) {
                        Object obj = ((InterfaceC7986) this.f9529).get();
                        AbstractC7988.m13441(obj, "Argument must not be null");
                        this.f9530 = obj;
                    }
                } finally {
                }
            }
        }
        return this.f9530;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC8051 m6428() {
        if (((InterfaceC8051) this.f9530) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC8051) this.f9530) == null) {
                        File cacheDir = ((C7711) ((C8048) this.f9529).f22221).f20920.getCacheDir();
                        C6188 c6188 = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            c6188 = new C6188(file);
                        }
                        this.f9530 = c6188;
                    }
                    if (((InterfaceC8051) this.f9530) == null) {
                        this.f9530 = new C6957(13);
                    }
                } finally {
                }
            }
        }
        return (InterfaceC8051) this.f9530;
    }
}
