package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC1188ar;
import p000.AbstractC1232br;
import p000.C0646P0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public final String f3647a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f3648b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f3649c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f3650d;

    /* JADX INFO: renamed from: e */
    public final Bitmap f3651e;

    /* JADX INFO: renamed from: f */
    public final Uri f3652f;

    /* JADX INFO: renamed from: g */
    public final Bundle f3653g;

    /* JADX INFO: renamed from: h */
    public final Uri f3654h;

    /* JADX INFO: renamed from: i */
    public MediaDescription f3655i;

    static {
        CREATOR = new C0646P0(13);
    }

    public MediaDescriptionCompat(String r1, CharSequence r2, CharSequence r3, CharSequence r4, Bitmap r5, Uri r6, Bundle r7, Uri r8) {
        this.f3647a = r1;
        this.f3648b = r2;
        this.f3649c = r3;
        this.f3650d = r4;
        this.f3651e = r5;
        this.f3652f = r6;
        this.f3653g = r7;
        this.f3654h = r8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f3648b + ", " + this.f3649c + ", " + this.f3650d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        MediaDescription r0 = this.f3655i;
        if (r0 != null) goto L5;
        MediaDescription.Builder r02 = AbstractC1188ar.m2280b();
        AbstractC1188ar.m2292n(r02, this.f3647a);
        AbstractC1188ar.m2294p(r02, this.f3648b);
        AbstractC1188ar.m2293o(r02, this.f3649c);
        AbstractC1188ar.m2288j(r02, this.f3650d);
        AbstractC1188ar.m2290l(r02, this.f3651e);
        AbstractC1188ar.m2291m(r02, this.f3652f);
        AbstractC1188ar.m2289k(r02, this.f3653g);
        AbstractC1232br.m2355b(r02, this.f3654h);
        r0 = AbstractC1188ar.m2279a(r02);
        this.f3655i = r0;
    L5:
        r0.writeToParcel(r3, r4);
    }
}
