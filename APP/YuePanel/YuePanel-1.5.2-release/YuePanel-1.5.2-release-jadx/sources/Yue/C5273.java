package Yue;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import com.bumptech.glide.gifencoder.AnimatedGifEncoder;
import com.nmmedit.protect.NativeUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5273 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f1374 = 100;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f1375 = 2048;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f12544 = 300;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final long f12545 = 100663296;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12546;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12547;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12548;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12549;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12550;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12551;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12552;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12553;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12554;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12555;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12556;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12557;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12558;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12559;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12560;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12561;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12562;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12563;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12564;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12565;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12566;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12567;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۤۨ$ۥ */
    public class C0690 extends Animatable2.AnimationCallback {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ AtomicBoolean f1376;

        static {
            NativeUtil.classesInit0(712);
        }

        public C0690(AtomicBoolean atomicBoolean) {
            this.f1376 = atomicBoolean;
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public native void onAnimationEnd(Drawable drawable);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۤۨ$ۥ۟ */
    public interface InterfaceC0691 {
        /* JADX INFO: renamed from: ۥ */
        void m2043(@InterfaceC6391 File file);

        /* JADX INFO: renamed from: ۥ۟ */
        void m2044(@InterfaceC6391 Exception exc);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۤۨ$ۥ۟۟, reason: contains not printable characters */
    public static final class C5274 {

        /* JADX INFO: renamed from: ۥ */
        public final int f1377;

        /* JADX INFO: renamed from: ۥ۟ */
        public final int f1378;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f12568;

        /* JADX INFO: renamed from: Yue.ۥۣ۠ۤۨ$ۥ۟۟$ۥ */
        public static final class C0692 {

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public static volatile /* synthetic */ String f12569;

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public static volatile /* synthetic */ String f12570;

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public static volatile /* synthetic */ String f12571;

            /* JADX INFO: renamed from: ۥ */
            public int f1379 = 100;

            /* JADX INFO: renamed from: ۥ۟ */
            public int f1380 = 2048;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public int f12572;

            static {
                NativeUtil.classesInit0(694);
            }

            private static native /* synthetic */ String yue_xin_awa(int i);

            /* JADX INFO: renamed from: ۥ */
            public static native /* synthetic */ int m2047(C0692 c0692);

            /* JADX INFO: renamed from: ۥ۟ */
            public static native /* synthetic */ int m2048(C0692 c0692);

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public static native /* synthetic */ int m16170(C0692 c0692);

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public native C5274 m16171();

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public native C0692 m16172(int i);

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public native C0692 m16173(int i);

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public native C0692 m16174(int i);
        }

        static {
            NativeUtil.classesInit0(314);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 Yue.ۥۣ۠ۤۨ$ۥ۟۟$ۥ) A[MD:(Yue.ۥۣ۠ۤۨ$ۥ۟۟$ۥ):void (m)] (LINE:1) call: Yue.ۥۣ۠ۤۨ.ۥ۟۟.<init>(Yue.ۥۣ۠ۤۨ$ۥ۟۟$ۥ):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C5274(C0692 c0692, C0690 c0690) {
            this(c0692);
        }

        /* JADX INFO: renamed from: ۥ */
        public static native C0692 m2045();

        /* JADX INFO: renamed from: ۥ۟ */
        public native int m2046();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public native int m16168();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public native int m16169();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C5274(C0692 c0692) {
            this.f1377 = C0692.m2047(c0692);
            this.f1378 = C0692.m2048(c0692);
            this.f12568 = C0692.m16170(c0692);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۤۨ$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC5275 {
        /* JADX INFO: renamed from: ۥ */
        void mo2049(int i);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۤۨ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C5276 {

        /* JADX INFO: renamed from: ۥ */
        public final InterfaceC5275 f1381;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f1382;

        static {
            NativeUtil.classesInit0(640);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 Yue.ۥۣ۠ۤۨ$ۥ۟۟۟) A[MD:(Yue.ۥۣ۠ۤۨ$ۥ۟۟۟):void (m)] (LINE:1) call: Yue.ۥۣ۠ۤۨ.ۥ۟۟۟۟.<init>(Yue.ۥۣ۠ۤۨ$ۥ۟۟۟):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C5276(InterfaceC5275 interfaceC5275, C0690 c0690) {
            this(interfaceC5275);
        }

        /* JADX INFO: renamed from: ۥ */
        public static native /* synthetic */ void m2050(C5276 c5276, int i);

        /* JADX INFO: renamed from: ۥ۟ */
        public final native void m2051(int i);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C5276(@InterfaceC6490 InterfaceC5275 interfaceC5275) {
            this.f1382 = -1;
            this.f1381 = interfaceC5275;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۤۨ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C5277 {

        /* JADX INFO: renamed from: ۥ */
        public final int[] f1383;

        static {
            NativeUtil.classesInit0(641);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int[]) A[MD:(int[]):void (m)] (LINE:1) call: Yue.ۥۣ۠ۤۨ.ۥ۟۟۟۠.<init>(int[]):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C5277(int[] iArr, C0690 c0690) {
            this(iArr);
        }

        /* JADX INFO: renamed from: ۥ */
        public static native /* synthetic */ int m2052(C5277 c5277);

        /* JADX INFO: renamed from: ۥ۟ */
        public static native /* synthetic */ int m2053(C5277 c5277, int i);

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final native int m16175();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final native int m16176(int i);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C5277(@InterfaceC6391 int[] iArr) {
            this.f1383 = iArr;
        }
    }

    static {
        NativeUtil.classesInit0(553);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m2041(InterfaceC0691 interfaceC0691, Context context, Object obj, File file, C5274 c5274, InterfaceC5275 interfaceC5275);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native void m2042(AnimatedGifEncoder animatedGifEncoder, Bitmap bitmap);

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native File m16142(Context context, Object obj, File file) throws IOException;

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native File m16143(Context context, Object obj, File file, C5274 c5274) throws IOException;

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native File m16144(Context context, Object obj, File file, C5274 c5274, InterfaceC5275 interfaceC5275) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native void m16145(Context context, Object obj, File file, C5274 c5274, Executor executor, InterfaceC0691 interfaceC0691);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native void m16146(Context context, Object obj, File file, C5274 c5274, Executor executor, InterfaceC5275 interfaceC5275, InterfaceC0691 interfaceC0691);

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native ImageDecoder.Source m16147(Context context, Object obj) throws IOException;

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native Bitmap m16148(MediaMetadataRetriever mediaMetadataRetriever, long j, MediaMetadataRetriever.BitmapParams bitmapParams);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native boolean m16149(Bitmap bitmap);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m16150(InterfaceC0691 interfaceC0691, Context context, Object obj, File file, C5274 c5274, InterfaceC5275 interfaceC5275);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native boolean m16151(byte[] bArr, int i, String str);

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native InputStream m16152(Context context, Object obj) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static native int m16153(String str);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static native long m16154(String str);

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native Bitmap m16155(Bitmap bitmap, int i);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static native boolean m16156(InputStream inputStream, byte[] bArr, int i) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static native int m16157(byte[] bArr, int i);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static native long m16158(byte[] bArr, int i);

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native C5277 m16159(Context context, Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static native void m16160(File file, File file2) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static native void m16161(MediaMetadataRetriever mediaMetadataRetriever, Context context, Object obj) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static native boolean m16162(InputStream inputStream, long j) throws IOException;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static native void m16163(long j);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static native boolean m16164(Context context, Object obj, File file, C5274 c5274, C5276 c5276, int i, int i2);

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static native boolean m16165(AnimatedImageDrawable animatedImageDrawable, C5277 c5277, File file, C5274 c5274, C5276 c5276, int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static native boolean m16166(Context context, Object obj, File file, C5274 c5274, C5276 c5276, int i, int i2);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static native void m16167(Bitmap bitmap, File file, C5274 c5274) throws IOException;
}
