package Yue;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class C5417 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۠ۥ$ۥ */
    @InterfaceC7507({"SMAP\nImageDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDecoder.kt\nandroidx/core/graphics/ImageDecoderKt$decodeBitmap$1\n*L\n1#1,56:1\n*E\n"})
    public static final class C0752 implements ImageDecoder$OnHeaderDecodedListener {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC5140<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, C8107> f1492;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۤ<? super android.graphics.ImageDecoder, ? super android.graphics.ImageDecoder$ImageInfo, ? super android.graphics.ImageDecoder$Source, Yue.ۥۣۢ۠ۤ> */
        /* JADX WARN: Multi-variable type inference failed */
        public C0752(InterfaceC5140<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, C8107> interfaceC5140) {
            this.f1492 = interfaceC5140;
        }

        public final void onHeaderDecoded(@InterfaceC6399 ImageDecoder imageDecoder, @InterfaceC6399 ImageDecoder.ImageInfo imageInfo, @InterfaceC6399 ImageDecoder.Source source) {
            this.f1492.mo15350(imageDecoder, imageInfo, source);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۠ۥ$ۥ۟ */
    @InterfaceC7507({"SMAP\nImageDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDecoder.kt\nandroidx/core/graphics/ImageDecoderKt$decodeDrawable$1\n*L\n1#1,56:1\n*E\n"})
    public static final class C0753 implements ImageDecoder$OnHeaderDecodedListener {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC5140<ImageDecoder, ImageDecoder.ImageInfo, ImageDecoder.Source, C8107> f1493;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۤ<? super android.graphics.ImageDecoder, ? super android.graphics.ImageDecoder$ImageInfo, ? super android.graphics.ImageDecoder$Source, Yue.ۥۣۢ۠ۤ> */
        /* JADX WARN: Multi-variable type inference failed */
        public C0753(InterfaceC5140<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, C8107> interfaceC5140) {
            this.f1493 = interfaceC5140;
        }

        public final void onHeaderDecoded(@InterfaceC6399 ImageDecoder imageDecoder, @InterfaceC6399 ImageDecoder.ImageInfo imageInfo, @InterfaceC6399 ImageDecoder.Source source) {
            this.f1493.mo15350(imageDecoder, imageInfo, source);
        }
    }

    @InterfaceC6399
    @InterfaceC7113(28)
    /* JADX INFO: renamed from: ۥ */
    public static final Bitmap m2184(@InterfaceC6399 ImageDecoder.Source source, @InterfaceC6399 InterfaceC5140<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, C8107> interfaceC5140) {
        return ImageDecoder.decodeBitmap(source, C5414.m2181(new C0752(interfaceC5140)));
    }

    @InterfaceC6399
    @InterfaceC7113(28)
    /* JADX INFO: renamed from: ۥ۟ */
    public static final Drawable m2185(@InterfaceC6399 ImageDecoder.Source source, @InterfaceC6399 InterfaceC5140<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, C8107> interfaceC5140) {
        return ImageDecoder.decodeDrawable(source, C5414.m2181(new C0753(interfaceC5140)));
    }
}
