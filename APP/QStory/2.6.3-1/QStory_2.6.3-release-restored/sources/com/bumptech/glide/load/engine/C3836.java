package com.bumptech.glide.load.engine;

import java.io.File;
import p027.C7043;
import p091.C7787;
import p183.C8541;
import p238.AbstractC8818;
import p238.InterfaceC8816;
import p246.C8878;
import p246.InterfaceC8881;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3836 implements InterfaceC8816 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f9876;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile Object f9877;

    public /* synthetic */ C3836(Object obj) {
        this.f9876 = obj;
    }

    @Override // p238.InterfaceC8816
    public Object get() {
        if (this.f9877 == null) {
            synchronized (this) {
                try {
                    if (this.f9877 == null) {
                        Object obj = ((InterfaceC8816) this.f9876).get();
                        AbstractC8818.m14028(obj, "Argument must not be null");
                        this.f9877 = obj;
                    }
                } finally {
                }
            }
        }
        return this.f9877;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC8881 m7046() {
        if (((InterfaceC8881) this.f9877) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC8881) this.f9877) == null) {
                        File cacheDir = ((C8541) ((C8878) this.f9876).f22564).f21260.getCacheDir();
                        C7043 c7043 = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            c7043 = new C7043(file);
                        }
                        this.f9877 = c7043;
                    }
                    if (((InterfaceC8881) this.f9877) == null) {
                        this.f9877 = new C7787(13);
                    }
                } finally {
                }
            }
        }
        return (InterfaceC8881) this.f9877;
    }
}
