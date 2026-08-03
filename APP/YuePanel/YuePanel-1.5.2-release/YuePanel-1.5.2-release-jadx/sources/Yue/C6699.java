package Yue;

import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* JADX INFO: renamed from: Yue.ۥۣۡۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6699 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f2249 = 0;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f17246 = 1000;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f17247 = 1001;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f17248 = 1002;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f17249 = 1003;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f17250 = 1004;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f17251 = 1006;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f17252 = 1007;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f17253 = 1008;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f17254 = 1009;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f17255 = 1010;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f17256 = 1011;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f17257 = 1012;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f17258 = 1013;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f17259 = 1014;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f17260 = 1015;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f17261 = 1016;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f17262 = 1017;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f17263 = 1018;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f17264 = 1019;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f17265 = 1020;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f17266 = 1021;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f17267 = 1000;

    /* JADX INFO: renamed from: ۥ */
    public final PointerIcon f2250;

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۨ$ۥ */
    @InterfaceC7113(24)
    public static class C1064 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static PointerIcon m3180(Bitmap bitmap, float f, float f2) {
            return PointerIcon.create(bitmap, f, f2);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static PointerIcon m3181(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static PointerIcon m21378(Resources resources, int i) {
            return PointerIcon.load(resources, i);
        }
    }

    public C6699(PointerIcon pointerIcon) {
        this.f2250 = pointerIcon;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static C6699 m3178(@InterfaceC6391 Bitmap bitmap, float f, float f2) {
        return new C6699(C1064.m3180(bitmap, f, f2));
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C6699 m21376(@InterfaceC6391 Context context, int i) {
        return new C6699(C1064.m3181(context, i));
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static C6699 m21377(@InterfaceC6391 Resources resources, int i) {
        return new C6699(C1064.m21378(resources, i));
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public Object m3179() {
        return this.f2250;
    }
}
