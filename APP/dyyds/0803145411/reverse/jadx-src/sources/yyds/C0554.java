package yyds;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: renamed from: yyds.ᛳᛳᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0554 extends AbstractC2134 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final byte[] f2647 = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC1410.f6680);

    @Override // yyds.InterfaceC1410
    public final boolean equals(Object obj) {
        return obj instanceof C0554;
    }

    @Override // yyds.InterfaceC1410
    public final int hashCode() {
        return 1572326941;
    }

    @Override // yyds.InterfaceC1410
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1227(MessageDigest messageDigest) {
        messageDigest.update(f2647);
    }

    @Override // yyds.AbstractC2134
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Bitmap mo1402(InterfaceC2587 interfaceC2587, Bitmap bitmap, int i, int i2) {
        return AbstractC2663.m4753(interfaceC2587, bitmap, i, i2);
    }
}
