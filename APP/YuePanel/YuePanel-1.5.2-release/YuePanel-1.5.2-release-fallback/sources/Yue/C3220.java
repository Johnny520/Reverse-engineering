package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"ClassVerificationFailure"})
public final class C3220 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۠ۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nImageDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDecoder.kt\nandroidx/core/graphics/ImageDecoderKt$decodeBitmap$1\n*L\n1#1,56:1\n*E\n"})
    public static final class C3221 implements android.graphics.ImageDecoder$OnHeaderDecodedListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2841<android.graphics.ImageDecoder, android.graphics.ImageDecoder.ImageInfo, android.graphics.ImageDecoder.Source, Yue.C6593> f10555;

        public C3221(Yue.InterfaceC2841<? super android.graphics.ImageDecoder, ? super android.graphics.ImageDecoder.ImageInfo, ? super android.graphics.ImageDecoder.Source, Yue.C6593> r1) {
                r0 = this;
                r0.f10555 = r1
                r0.<init>()
                return
        }

        public final void onHeaderDecoded(@Yue.InterfaceC4418 android.graphics.ImageDecoder r2, @Yue.InterfaceC4418 android.graphics.ImageDecoder.ImageInfo r3, @Yue.InterfaceC4418 android.graphics.ImageDecoder.Source r4) {
                r1 = this;
                Yue.ۥۣ۠ۢۤ<android.graphics.ImageDecoder, android.graphics.ImageDecoder$ImageInfo, android.graphics.ImageDecoder$Source, Yue.ۥۣۢ۠ۤ> r0 = r1.f10555
                r0.mo11720(r2, r3, r4)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۠ۥ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nImageDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDecoder.kt\nandroidx/core/graphics/ImageDecoderKt$decodeDrawable$1\n*L\n1#1,56:1\n*E\n"})
    public static final class C3222 implements android.graphics.ImageDecoder$OnHeaderDecodedListener {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.InterfaceC2841<android.graphics.ImageDecoder, android.graphics.ImageDecoder.ImageInfo, android.graphics.ImageDecoder.Source, Yue.C6593> f10556;

        public C3222(Yue.InterfaceC2841<? super android.graphics.ImageDecoder, ? super android.graphics.ImageDecoder.ImageInfo, ? super android.graphics.ImageDecoder.Source, Yue.C6593> r1) {
                r0 = this;
                r0.f10556 = r1
                r0.<init>()
                return
        }

        public final void onHeaderDecoded(@Yue.InterfaceC4418 android.graphics.ImageDecoder r2, @Yue.InterfaceC4418 android.graphics.ImageDecoder.ImageInfo r3, @Yue.InterfaceC4418 android.graphics.ImageDecoder.Source r4) {
                r1 = this;
                Yue.ۥۣ۠ۢۤ<android.graphics.ImageDecoder, android.graphics.ImageDecoder$ImageInfo, android.graphics.ImageDecoder$Source, Yue.ۥۣۢ۠ۤ> r0 = r1.f10556
                r0.mo11720(r2, r3, r4)
                return
        }
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5336(28)
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final android.graphics.Bitmap m13632(@Yue.InterfaceC4418 android.graphics.ImageDecoder.Source r1, @Yue.InterfaceC4418 Yue.InterfaceC2841<? super android.graphics.ImageDecoder, ? super android.graphics.ImageDecoder.ImageInfo, ? super android.graphics.ImageDecoder.Source, Yue.C6593> r2) {
            Yue.ۥ۠ۥ۠ۥ$ۥ r0 = new Yue.ۥ۠ۥ۠ۥ$ۥ
            r0.<init>(r2)
            android.graphics.ImageDecoder$OnHeaderDecodedListener r2 = Yue.C3217.m13629(r0)
            android.graphics.Bitmap r1 = Yue.C3219.m13631(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5336(28)
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final android.graphics.drawable.Drawable m13633(@Yue.InterfaceC4418 android.graphics.ImageDecoder.Source r1, @Yue.InterfaceC4418 Yue.InterfaceC2841<? super android.graphics.ImageDecoder, ? super android.graphics.ImageDecoder.ImageInfo, ? super android.graphics.ImageDecoder.Source, Yue.C6593> r2) {
            Yue.ۥ۠ۥ۠ۥ$ۥ۟ r0 = new Yue.ۥ۠ۥ۠ۥ$ۥ۟
            r0.<init>(r2)
            android.graphics.ImageDecoder$OnHeaderDecodedListener r2 = Yue.C3217.m13629(r0)
            android.graphics.drawable.Drawable r1 = Yue.C3218.m13630(r1, r2)
            return r1
    }
}
