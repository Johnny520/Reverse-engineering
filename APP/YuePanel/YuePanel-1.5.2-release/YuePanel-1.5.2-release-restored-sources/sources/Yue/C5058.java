package Yue;

import Yue.C7130;
import Yue.C8023;
import Yue.InterfaceC7144;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5058 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final String f1241 = "font_results";

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final int f1242 = -1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final int f11981 = -2;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦۢ$ۥ */
    public static final class C0627 implements BaseColumns {

        /* JADX INFO: renamed from: ۥ */
        public static final String f1243 = "file_id";

        /* JADX INFO: renamed from: ۥ۟ */
        public static final String f1244 = "font_ttc_index";

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final String f11982 = "font_variation_settings";

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final String f11983 = "font_weight";

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final String f11984 = "font_italic";

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final String f11985 = "result_code";

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f11986 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f11987 = 1;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f11988 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f11989 = 3;
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦۢ$ۥ۟ */
    public static class C0628 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f11990 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final int f11991 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f11992 = 2;

        /* JADX INFO: renamed from: ۥ */
        public final int f1245;

        /* JADX INFO: renamed from: ۥ۟ */
        public final C5059[] f1246;

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public C0628(int i, @InterfaceC6490 C5059[] c5059Arr) {
            this.f1245 = i;
            this.f1246 = c5059Arr;
        }

        /* JADX INFO: renamed from: ۥ */
        public static C0628 m1878(int i, @InterfaceC6490 C5059[] c5059Arr) {
            return new C0628(i, c5059Arr);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public C5059[] m1879() {
            return this.f1246;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m15583() {
            return this.f1245;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦۢ$ۥ۟۟, reason: contains not printable characters */
    public static class C5059 {

        /* JADX INFO: renamed from: ۥ */
        public final Uri f1247;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f1248;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f11993;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean f11994;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final int f11995;

        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public C5059(@InterfaceC6391 Uri uri, @InterfaceC5459(from = 0) int i, @InterfaceC5459(from = 1, m2228to = 1000) int i2, boolean z, int i3) {
            this.f1247 = (Uri) C6740.m21415(uri);
            this.f1248 = i;
            this.f11993 = i2;
            this.f11994 = z;
            this.f11995 = i3;
        }

        /* JADX INFO: renamed from: ۥ */
        public static C5059 m1880(@InterfaceC6391 Uri uri, @InterfaceC5459(from = 0) int i, @InterfaceC5459(from = 1, m2228to = 1000) int i2, boolean z, int i3) {
            return new C5059(uri, i, i2, z, i3);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public int m1881() {
            return this.f11995;
        }

        @InterfaceC5459(from = 0)
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m15584() {
            return this.f1248;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Uri m15585() {
            return this.f1247;
        }

        @InterfaceC5459(from = 1, m2228to = 1000)
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m15586() {
            return this.f11993;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean m15587() {
            return this.f11994;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۦۢ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C5060 {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public static final int f1249 = 0;

        /* JADX INFO: renamed from: ۥ۟ */
        public static final int f1250 = 0;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f11996 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final int f11997 = -2;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f11998 = -3;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f11999 = -4;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f12000 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f12001 = 2;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f12002 = 3;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۦۢ$ۥ۟۟۟$ۥ */
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC0629 {
        }

        /* JADX INFO: renamed from: ۥ */
        public void mo1882(int i) {
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void mo1883(Typeface typeface) {
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public static Typeface m1876(@InterfaceC6391 Context context, @InterfaceC6490 CancellationSignal cancellationSignal, @InterfaceC6391 C5059[] c5059Arr) {
        return C8023.m25337(context, cancellationSignal, c5059Arr, 0);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static C0628 m1877(@InterfaceC6391 Context context, @InterfaceC6490 CancellationSignal cancellationSignal, @InterfaceC6391 C5045 c5045) throws PackageManager.NameNotFoundException {
        return C5043.m15550(context, c5045, cancellationSignal);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Typeface m15576(Context context, C5045 c5045, @InterfaceC6490 C7130.AbstractC7134 abstractC7134, @InterfaceC6490 Handler handler, boolean z, int i, int i2) {
        return m15579(context, c5045, i2, z, i, C7130.AbstractC7134.getHandler(handler), new C8023.C1408(abstractC7134));
    }

    @InterfaceC6490
    @Deprecated
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static ProviderInfo m15577(@InterfaceC6391 PackageManager packageManager, @InterfaceC6391 C5045 c5045, @InterfaceC6490 Resources resources) throws PackageManager.NameNotFoundException {
        return C5043.m15551(packageManager, c5045, resources);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Map<Uri, ByteBuffer> m15578(Context context, C5059[] c5059Arr, CancellationSignal cancellationSignal) {
        return C8032.m25395(context, c5059Arr, cancellationSignal);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Typeface m15579(@InterfaceC6391 Context context, @InterfaceC6391 C5045 c5045, int i, boolean z, @InterfaceC5459(from = 0) int i2, @InterfaceC6391 Handler handler, @InterfaceC6391 C5060 c5060) {
        C3654 c3654 = new C3654(c5060, handler);
        return z ? C5048.m15562(context, c5045, c3654, i, i2) : C5048.m15561(context, c5045, i, null, c3654);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m15580(@InterfaceC6391 Context context, @InterfaceC6391 C5045 c5045, @InterfaceC6391 C5060 c5060, @InterfaceC6391 Handler handler) {
        C3654 c3654 = new C3654(c5060);
        C5048.m15561(context.getApplicationContext(), c5045, 0, C7107.m3400(handler), c3654);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m15581() {
        C5048.m15563();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC8392
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m15582() {
        C5048.m15563();
    }
}
