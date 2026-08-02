package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import defpackage.k40;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements k40 {
    public final ParcelFileDescriptorRewinder$InternalRewinder h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(ParcelFileDescriptor parcelFileDescriptor) {
        this.h = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ParcelFileDescriptor a() {
        return this.h.rewind();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k40
    public final Object f() {
        return this.h.rewind();
    }

    @Override // defpackage.k40
    public final void b() {
    }
}
