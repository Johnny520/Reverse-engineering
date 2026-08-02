package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import p000.k40;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.a */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0100a implements k40 {

    /* JADX INFO: renamed from: h */
    public final ParcelFileDescriptorRewinder$InternalRewinder f1652h;

    public C0100a(ParcelFileDescriptor parcelFileDescriptor) {
        this.f1652h = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    /* JADX INFO: renamed from: a */
    public final ParcelFileDescriptor m871a() {
        return this.f1652h.rewind();
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: f */
    public final Object mo873f() {
        return this.f1652h.rewind();
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: b */
    public final void mo872b() {
    }
}
