package Yue;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5463 {

    /* JADX INFO: renamed from: ۥ */
    @SuppressLint({"ActionValue"})
    public static final String f1524 = "android.intent.action.CREATE_REMINDER";

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f1525 = "android.intent.extra.HTML_TEXT";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f13423 = "android.intent.extra.START_PLAYBACK";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @SuppressLint({"ActionValue"})
    public static final String f13424 = "android.intent.extra.TIME";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f13425 = "android.intent.category.LEANBACK_LAUNCHER";

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۤۢ$ۥ */
    @InterfaceC7113(33)
    public static class C0771 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static <T> T[] m2231(@InterfaceC6391 Intent intent, @InterfaceC6490 String str, @InterfaceC6391 Class<T> cls) {
            return (T[]) intent.getParcelableArrayExtra(str, cls);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static <T> ArrayList<T> m2232(@InterfaceC6391 Intent intent, @InterfaceC6490 String str, @InterfaceC6391 Class<? extends T> cls) {
            return intent.getParcelableArrayListExtra(str, cls);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static <T> T m16985(@InterfaceC6391 Intent intent, @InterfaceC6490 String str, @InterfaceC6391 Class<T> cls) {
            return (T) intent.getParcelableExtra(str, cls);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static <T extends Serializable> T m16986(@InterfaceC6391 Intent intent, @InterfaceC6490 String str, @InterfaceC6391 Class<T> cls) {
            return (T) intent.getSerializableExtra(str, cls);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static Intent m2229(@InterfaceC6391 Context context, @InterfaceC6391 String str) {
        if (!C6591.m3049(context.getPackageManager())) {
            throw new UnsupportedOperationException("Unused App Restriction features are not available on this device");
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", str, null));
        }
        Intent data = new Intent(C6591.f2155).setData(Uri.fromParts("package", str, null));
        return i >= 30 ? data : data.setPackage((String) C6740.m21415(C6591.m3050(context.getPackageManager())));
    }

    @InterfaceC6490
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    /* JADX INFO: renamed from: ۥ۟ */
    public static Parcelable[] m2230(@InterfaceC6391 Intent intent, @InterfaceC6490 String str, @InterfaceC6391 Class<? extends Parcelable> cls) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) C0771.m2231(intent, str, cls) : intent.getParcelableArrayExtra(str);
    }

    @InterfaceC6490
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static <T> ArrayList<T> m16981(@InterfaceC6391 Intent intent, @InterfaceC6490 String str, @InterfaceC6391 Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? C0771.m2232(intent, str, cls) : intent.getParcelableArrayListExtra(str);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static <T> T m16982(@InterfaceC6391 Intent intent, @InterfaceC6490 String str, @InterfaceC6391 Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) C0771.m16985(intent, str, cls);
        }
        T t = (T) intent.getParcelableExtra(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static <T extends Serializable> T m16983(@InterfaceC6391 Intent intent, @InterfaceC6490 String str, @InterfaceC6391 Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) C0771.m16986(intent, str, cls);
        }
        T t = (T) intent.getSerializableExtra(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Intent m16984(@InterfaceC6391 String str, @InterfaceC6391 String str2) {
        return Intent.makeMainSelectorActivity(str, str2);
    }
}
