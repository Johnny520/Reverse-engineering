package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import p000.InterfaceC2713xc;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1274a implements InterfaceC2713xc {

    /* JADX INFO: renamed from: a */
    public final ParcelFileDescriptorRewinder$InternalRewinder f4346a;

    public C1274a(ParcelFileDescriptor r2) {
        this.f4346a = new ParcelFileDescriptorRewinder$InternalRewinder(r2);
    }

    /* JADX INFO: renamed from: a */
    public final ParcelFileDescriptor m2416a() {
        return this.f4346a.rewind();
    }

    @Override // p000.InterfaceC2713xc
    /* JADX INFO: renamed from: c */
    public final void mo232c() {
    }

    @Override // p000.InterfaceC2713xc
    /* JADX INFO: renamed from: j */
    public final Object mo237j() {
        return this.f4346a.rewind();
    }
}
