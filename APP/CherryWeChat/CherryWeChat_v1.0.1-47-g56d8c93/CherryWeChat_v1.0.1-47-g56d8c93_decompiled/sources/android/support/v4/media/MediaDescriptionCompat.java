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
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0646P0(13);

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

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f3647a = str;
        this.f3648b = charSequence;
        this.f3649c = charSequence2;
        this.f3650d = charSequence3;
        this.f3651e = bitmap;
        this.f3652f = uri;
        this.f3653g = bundle;
        this.f3654h = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f3648b) + ", " + ((Object) this.f3649c) + ", " + ((Object) this.f3650d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MediaDescription mediaDescriptionM2279a = this.f3655i;
        if (mediaDescriptionM2279a == null) {
            MediaDescription.Builder builderM2280b = AbstractC1188ar.m2280b();
            AbstractC1188ar.m2292n(builderM2280b, this.f3647a);
            AbstractC1188ar.m2294p(builderM2280b, this.f3648b);
            AbstractC1188ar.m2293o(builderM2280b, this.f3649c);
            AbstractC1188ar.m2288j(builderM2280b, this.f3650d);
            AbstractC1188ar.m2290l(builderM2280b, this.f3651e);
            AbstractC1188ar.m2291m(builderM2280b, this.f3652f);
            AbstractC1188ar.m2289k(builderM2280b, this.f3653g);
            AbstractC1232br.m2355b(builderM2280b, this.f3654h);
            mediaDescriptionM2279a = AbstractC1188ar.m2279a(builderM2280b);
            this.f3655i = mediaDescriptionM2279a;
        }
        mediaDescriptionM2279a.writeToParcel(parcel, i);
    }
}
