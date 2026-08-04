package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import yyds.InterfaceC0740;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.ᛲᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0039 implements InterfaceC0740 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ParcelFileDescriptorRewinder$InternalRewinder f376;

    public C0039(ParcelFileDescriptor parcelFileDescriptor) {
        this.f376 = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final ParcelFileDescriptor m243() {
        return this.f376.rewind();
    }

    @Override // yyds.InterfaceC0740
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void mo244() {
    }

    @Override // yyds.InterfaceC0740
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final Object mo245() {
        return this.f376.rewind();
    }
}
