package p000;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: renamed from: ar */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1188ar {
    /* JADX INFO: renamed from: a */
    public static MediaDescription m2279a(MediaDescription.Builder r0) {
        return r0.build();
    }

    /* JADX INFO: renamed from: b */
    public static MediaDescription.Builder m2280b() {
        return new MediaDescription.Builder();
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m2281c(MediaDescription r0) {
        return r0.getDescription();
    }

    /* JADX INFO: renamed from: d */
    public static Bundle m2282d(MediaDescription r0) {
        return r0.getExtras();
    }

    /* JADX INFO: renamed from: e */
    public static Bitmap m2283e(MediaDescription r0) {
        return r0.getIconBitmap();
    }

    /* JADX INFO: renamed from: f */
    public static Uri m2284f(MediaDescription r0) {
        return r0.getIconUri();
    }

    /* JADX INFO: renamed from: g */
    public static String m2285g(MediaDescription r0) {
        return r0.getMediaId();
    }

    /* JADX INFO: renamed from: h */
    public static CharSequence m2286h(MediaDescription r0) {
        return r0.getSubtitle();
    }

    /* JADX INFO: renamed from: i */
    public static CharSequence m2287i(MediaDescription r0) {
        return r0.getTitle();
    }

    /* JADX INFO: renamed from: j */
    public static void m2288j(MediaDescription.Builder r0, CharSequence r1) {
        r0.setDescription(r1);
    }

    /* JADX INFO: renamed from: k */
    public static void m2289k(MediaDescription.Builder r0, Bundle r1) {
        r0.setExtras(r1);
    }

    /* JADX INFO: renamed from: l */
    public static void m2290l(MediaDescription.Builder r0, Bitmap r1) {
        r0.setIconBitmap(r1);
    }

    /* JADX INFO: renamed from: m */
    public static void m2291m(MediaDescription.Builder r0, Uri r1) {
        r0.setIconUri(r1);
    }

    /* JADX INFO: renamed from: n */
    public static void m2292n(MediaDescription.Builder r0, String r1) {
        r0.setMediaId(r1);
    }

    /* JADX INFO: renamed from: o */
    public static void m2293o(MediaDescription.Builder r0, CharSequence r1) {
        r0.setSubtitle(r1);
    }

    /* JADX INFO: renamed from: p */
    public static void m2294p(MediaDescription.Builder r0, CharSequence r1) {
        r0.setTitle(r1);
    }
}
