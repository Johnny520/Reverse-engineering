package p230p8;

import ac.RunnableC0059l;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import be.AbstractC0283h;
import gg.AbstractC1416l;
import gg.C1425u;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import ng.AbstractC3015m;
import ng.C3010h;
import ng.C3011i;
import ng.C3022t;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p027c0.C0361f;
import p036c9.C0456k1;
import p036c9.C0482r0;
import p054dg.AbstractC0793l;
import p054dg.C0795n;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p099h.Hchat.utils.KavaReflector;
import p108ha.C1657q;
import p129ig.AbstractC2043a;
import p136j8.C2104o;
import p211o9.C3092e;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p258r8.C3740e;
import p258r8.C3742g;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.EnumC3957d;
import p332wb.AbstractC4855en;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: p8.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3363o {

    /* JADX INFO: renamed from: a */
    public final C3742g f10853a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1235p f10854b;

    /* JADX INFO: renamed from: c */
    public final OkHttpClient f10855c;

    /* JADX INFO: renamed from: d */
    public final Object f10856d;

    /* JADX INFO: renamed from: e */
    public final Object f10857e;

    /* JADX INFO: renamed from: f */
    public final Handler f10858f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3363o(C3742g c3742g, InterfaceC1235p interfaceC1235p) {
        c3742g.getClass();
        this.f10853a = c3742g;
        this.f10854b = interfaceC1235p;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f10855c = builder.connectTimeout(30L, timeUnit).readTimeout(120L, timeUnit).callTimeout(180L, timeUnit).build();
        final int i9 = 0;
        InterfaceC1220a interfaceC1220a = new InterfaceC1220a(this) { // from class: p8.m

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C3363o f10849h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f10849h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        final C1425u c1425u = new C1425u();
                        final int i10 = 0;
                        final C3363o c3363o = this.f10849h;
                        C3740e.m7756c(new Runnable() { // from class: p8.n
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        C3363o c3363o2 = c3363o;
                                        C3742g c3742g2 = c3363o2.f10853a;
                                        InterfaceC1235p interfaceC1235p2 = c3363o2.f10854b;
                                        c3742g2.getClass();
                                        List listM101y0 = AbstractC0000a.m101y0("getAccSnsPath", "com.tencent.mm.plugin.sns.model.SnsCore");
                                        Class clsM2246i = AbstractC0921a.m2246i(C3365q.class);
                                        C3365q c3365q = C3365q.f10860a;
                                        c1425u.f4738g = new C3366r(c3365q.m7142b(c3742g2, "sns_root_v1", listM101y0, new C0361f(1, c3365q, clsM2246i, "isSnsRootMethod", "isSnsRootMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 29), interfaceC1235p2), c3365q.m7142b(c3742g2, "media_directory_v1", AbstractC0000a.m101y0("getMediaFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper"), new C3364p(1, c3365q, AbstractC0921a.m2246i(C3365q.class), "isMediaDirectoryMethod", "isMediaDirectoryMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 0), interfaceC1235p2), c3365q.m7142b(c3742g2, "big_image_name_v1", AbstractC0000a.m101y0("getSnsBigName", "snsb_"), new C3364p(1, c3365q, AbstractC0921a.m2246i(C3365q.class), "isBigImageNameMethod", "isBigImageNameMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 1), interfaceC1235p2), c3365q.m7142b(c3742g2, "video_path_v1", AbstractC0000a.m101y0("MicroMsg.SnsVideoLogic", "getSnsVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic"), new C3364p(1, c3365q, AbstractC0921a.m2246i(C3365q.class), "isVideoPathMethod", "isVideoPathMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 2), interfaceC1235p2));
                                        break;
                                    default:
                                        C3363o c3363o3 = c3363o;
                                        C3742g c3742g3 = c3363o3.f10853a;
                                        InterfaceC1235p interfaceC1235p3 = c3363o3.f10854b;
                                        c3742g3.getClass();
                                        List listM101y02 = AbstractC0000a.m101y0("getSnsDownManager", "com.tencent.mm.plugin.sns.model.SnsCore");
                                        Class clsM2246i2 = AbstractC0921a.m2246i(C3368t.class);
                                        C3368t c3368t = C3368t.f10871a;
                                        c1425u.f4738g = new C3369u(c3368t.m7145c(c3742g3, "image_manager_v1", listM101y02, new C3364p(1, c3368t, clsM2246i2, "isManagerGetter", "isManagerGetter(Ljava/lang/reflect/Method;)Z", 0, 0, 3), interfaceC1235p3), c3368t.m7145c(c3742g3, "image_download_v1", AbstractC0000a.m101y0("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager"), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isImageDownload", "isImageDownload(Ljava/lang/reflect/Method;)Z", 0, 0, 4), interfaceC1235p3), c3368t.m7145c(c3742g3, "video_service_v1", AbstractC0000a.m101y0("getSnsVideoService", "com.tencent.mm.plugin.sns.model.SnsCore"), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isManagerGetter", "isManagerGetter(Ljava/lang/reflect/Method;)Z", 0, 0, 5), interfaceC1235p3), c3368t.m7145c(c3742g3, "video_download_v1", AbstractC0000a.m101y0("addSnsVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService"), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isVideoDownload", "isVideoDownload(Ljava/lang/reflect/Method;)Z", 0, 0, 6), interfaceC1235p3), c3368t.m7145c(c3742g3, "video_full_path_v1", AbstractC0000a.m101y0("getSnsVideoFullPath", "getSnsVideoFullPath have flag %s, %s >>"), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isVideoStatusPath", "isVideoStatusPath(Ljava/lang/reflect/Method;)Z", 0, 0, 7), interfaceC1235p3), c3368t.m7145c(c3742g3, "video_finished_path_v1", AbstractC0000a.m101y0("isDownloadFinish", "it don't download video[%s] finish. file[%b], return null."), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isVideoStatusPath", "isVideoStatusPath(Ljava/lang/reflect/Method;)Z", 0, 0, 8), interfaceC1235p3), c3368t.m7145c(c3742g3, "video_thumb_path_v1", AbstractC0000a.m99x0("getSnsVideoThumbImagePath"), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isVideoMediaPath", "isVideoMediaPath(Ljava/lang/reflect/Method;)Z", 0, 0, 9), interfaceC1235p3));
                                        break;
                                }
                            }
                        });
                        Object obj = c1425u.f4738g;
                        if (obj != null) {
                            return (C3366r) obj;
                        }
                        AbstractC1416l.m3831g("methods");
                        throw null;
                    default:
                        final C1425u c1425u2 = new C1425u();
                        final int i11 = 1;
                        final C3363o c3363o2 = this.f10849h;
                        C3740e.m7756c(new Runnable() { // from class: p8.n
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        C3363o c3363o22 = c3363o2;
                                        C3742g c3742g2 = c3363o22.f10853a;
                                        InterfaceC1235p interfaceC1235p2 = c3363o22.f10854b;
                                        c3742g2.getClass();
                                        List listM101y0 = AbstractC0000a.m101y0("getAccSnsPath", "com.tencent.mm.plugin.sns.model.SnsCore");
                                        Class clsM2246i = AbstractC0921a.m2246i(C3365q.class);
                                        C3365q c3365q = C3365q.f10860a;
                                        c1425u2.f4738g = new C3366r(c3365q.m7142b(c3742g2, "sns_root_v1", listM101y0, new C0361f(1, c3365q, clsM2246i, "isSnsRootMethod", "isSnsRootMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 29), interfaceC1235p2), c3365q.m7142b(c3742g2, "media_directory_v1", AbstractC0000a.m101y0("getMediaFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper"), new C3364p(1, c3365q, AbstractC0921a.m2246i(C3365q.class), "isMediaDirectoryMethod", "isMediaDirectoryMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 0), interfaceC1235p2), c3365q.m7142b(c3742g2, "big_image_name_v1", AbstractC0000a.m101y0("getSnsBigName", "snsb_"), new C3364p(1, c3365q, AbstractC0921a.m2246i(C3365q.class), "isBigImageNameMethod", "isBigImageNameMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 1), interfaceC1235p2), c3365q.m7142b(c3742g2, "video_path_v1", AbstractC0000a.m101y0("MicroMsg.SnsVideoLogic", "getSnsVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic"), new C3364p(1, c3365q, AbstractC0921a.m2246i(C3365q.class), "isVideoPathMethod", "isVideoPathMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 2), interfaceC1235p2));
                                        break;
                                    default:
                                        C3363o c3363o3 = c3363o2;
                                        C3742g c3742g3 = c3363o3.f10853a;
                                        InterfaceC1235p interfaceC1235p3 = c3363o3.f10854b;
                                        c3742g3.getClass();
                                        List listM101y02 = AbstractC0000a.m101y0("getSnsDownManager", "com.tencent.mm.plugin.sns.model.SnsCore");
                                        Class clsM2246i2 = AbstractC0921a.m2246i(C3368t.class);
                                        C3368t c3368t = C3368t.f10871a;
                                        c1425u2.f4738g = new C3369u(c3368t.m7145c(c3742g3, "image_manager_v1", listM101y02, new C3364p(1, c3368t, clsM2246i2, "isManagerGetter", "isManagerGetter(Ljava/lang/reflect/Method;)Z", 0, 0, 3), interfaceC1235p3), c3368t.m7145c(c3742g3, "image_download_v1", AbstractC0000a.m101y0("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager"), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isImageDownload", "isImageDownload(Ljava/lang/reflect/Method;)Z", 0, 0, 4), interfaceC1235p3), c3368t.m7145c(c3742g3, "video_service_v1", AbstractC0000a.m101y0("getSnsVideoService", "com.tencent.mm.plugin.sns.model.SnsCore"), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isManagerGetter", "isManagerGetter(Ljava/lang/reflect/Method;)Z", 0, 0, 5), interfaceC1235p3), c3368t.m7145c(c3742g3, "video_download_v1", AbstractC0000a.m101y0("addSnsVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService"), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isVideoDownload", "isVideoDownload(Ljava/lang/reflect/Method;)Z", 0, 0, 6), interfaceC1235p3), c3368t.m7145c(c3742g3, "video_full_path_v1", AbstractC0000a.m101y0("getSnsVideoFullPath", "getSnsVideoFullPath have flag %s, %s >>"), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isVideoStatusPath", "isVideoStatusPath(Ljava/lang/reflect/Method;)Z", 0, 0, 7), interfaceC1235p3), c3368t.m7145c(c3742g3, "video_finished_path_v1", AbstractC0000a.m101y0("isDownloadFinish", "it don't download video[%s] finish. file[%b], return null."), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isVideoStatusPath", "isVideoStatusPath(Ljava/lang/reflect/Method;)Z", 0, 0, 8), interfaceC1235p3), c3368t.m7145c(c3742g3, "video_thumb_path_v1", AbstractC0000a.m99x0("getSnsVideoThumbImagePath"), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isVideoMediaPath", "isVideoMediaPath(Ljava/lang/reflect/Method;)Z", 0, 0, 9), interfaceC1235p3));
                                        break;
                                }
                            }
                        });
                        Object obj2 = c1425u2.f4738g;
                        if (obj2 != null) {
                            return (C3369u) obj2;
                        }
                        AbstractC1416l.m3831g("methods");
                        throw null;
                }
            }
        };
        EnumC3957d enumC3957d = EnumC3957d.f12958g;
        this.f10856d = AbstractC0283h.m1127G(enumC3957d, interfaceC1220a);
        final int i10 = 1;
        this.f10857e = AbstractC0283h.m1127G(enumC3957d, new InterfaceC1220a(this) { // from class: p8.m

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C3363o f10849h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f10849h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        final C1425u c1425u = new C1425u();
                        final int i102 = 0;
                        final C3363o c3363o = this.f10849h;
                        C3740e.m7756c(new Runnable() { // from class: p8.n
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i102) {
                                    case 0:
                                        C3363o c3363o22 = c3363o;
                                        C3742g c3742g2 = c3363o22.f10853a;
                                        InterfaceC1235p interfaceC1235p2 = c3363o22.f10854b;
                                        c3742g2.getClass();
                                        List listM101y0 = AbstractC0000a.m101y0("getAccSnsPath", "com.tencent.mm.plugin.sns.model.SnsCore");
                                        Class clsM2246i = AbstractC0921a.m2246i(C3365q.class);
                                        C3365q c3365q = C3365q.f10860a;
                                        c1425u.f4738g = new C3366r(c3365q.m7142b(c3742g2, "sns_root_v1", listM101y0, new C0361f(1, c3365q, clsM2246i, "isSnsRootMethod", "isSnsRootMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 29), interfaceC1235p2), c3365q.m7142b(c3742g2, "media_directory_v1", AbstractC0000a.m101y0("getMediaFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper"), new C3364p(1, c3365q, AbstractC0921a.m2246i(C3365q.class), "isMediaDirectoryMethod", "isMediaDirectoryMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 0), interfaceC1235p2), c3365q.m7142b(c3742g2, "big_image_name_v1", AbstractC0000a.m101y0("getSnsBigName", "snsb_"), new C3364p(1, c3365q, AbstractC0921a.m2246i(C3365q.class), "isBigImageNameMethod", "isBigImageNameMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 1), interfaceC1235p2), c3365q.m7142b(c3742g2, "video_path_v1", AbstractC0000a.m101y0("MicroMsg.SnsVideoLogic", "getSnsVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic"), new C3364p(1, c3365q, AbstractC0921a.m2246i(C3365q.class), "isVideoPathMethod", "isVideoPathMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 2), interfaceC1235p2));
                                        break;
                                    default:
                                        C3363o c3363o3 = c3363o;
                                        C3742g c3742g3 = c3363o3.f10853a;
                                        InterfaceC1235p interfaceC1235p3 = c3363o3.f10854b;
                                        c3742g3.getClass();
                                        List listM101y02 = AbstractC0000a.m101y0("getSnsDownManager", "com.tencent.mm.plugin.sns.model.SnsCore");
                                        Class clsM2246i2 = AbstractC0921a.m2246i(C3368t.class);
                                        C3368t c3368t = C3368t.f10871a;
                                        c1425u.f4738g = new C3369u(c3368t.m7145c(c3742g3, "image_manager_v1", listM101y02, new C3364p(1, c3368t, clsM2246i2, "isManagerGetter", "isManagerGetter(Ljava/lang/reflect/Method;)Z", 0, 0, 3), interfaceC1235p3), c3368t.m7145c(c3742g3, "image_download_v1", AbstractC0000a.m101y0("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager"), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isImageDownload", "isImageDownload(Ljava/lang/reflect/Method;)Z", 0, 0, 4), interfaceC1235p3), c3368t.m7145c(c3742g3, "video_service_v1", AbstractC0000a.m101y0("getSnsVideoService", "com.tencent.mm.plugin.sns.model.SnsCore"), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isManagerGetter", "isManagerGetter(Ljava/lang/reflect/Method;)Z", 0, 0, 5), interfaceC1235p3), c3368t.m7145c(c3742g3, "video_download_v1", AbstractC0000a.m101y0("addSnsVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService"), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isVideoDownload", "isVideoDownload(Ljava/lang/reflect/Method;)Z", 0, 0, 6), interfaceC1235p3), c3368t.m7145c(c3742g3, "video_full_path_v1", AbstractC0000a.m101y0("getSnsVideoFullPath", "getSnsVideoFullPath have flag %s, %s >>"), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isVideoStatusPath", "isVideoStatusPath(Ljava/lang/reflect/Method;)Z", 0, 0, 7), interfaceC1235p3), c3368t.m7145c(c3742g3, "video_finished_path_v1", AbstractC0000a.m101y0("isDownloadFinish", "it don't download video[%s] finish. file[%b], return null."), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isVideoStatusPath", "isVideoStatusPath(Ljava/lang/reflect/Method;)Z", 0, 0, 8), interfaceC1235p3), c3368t.m7145c(c3742g3, "video_thumb_path_v1", AbstractC0000a.m99x0("getSnsVideoThumbImagePath"), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isVideoMediaPath", "isVideoMediaPath(Ljava/lang/reflect/Method;)Z", 0, 0, 9), interfaceC1235p3));
                                        break;
                                }
                            }
                        });
                        Object obj = c1425u.f4738g;
                        if (obj != null) {
                            return (C3366r) obj;
                        }
                        AbstractC1416l.m3831g("methods");
                        throw null;
                    default:
                        final C1425u c1425u2 = new C1425u();
                        final int i11 = 1;
                        final C3363o c3363o2 = this.f10849h;
                        C3740e.m7756c(new Runnable() { // from class: p8.n
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        C3363o c3363o22 = c3363o2;
                                        C3742g c3742g2 = c3363o22.f10853a;
                                        InterfaceC1235p interfaceC1235p2 = c3363o22.f10854b;
                                        c3742g2.getClass();
                                        List listM101y0 = AbstractC0000a.m101y0("getAccSnsPath", "com.tencent.mm.plugin.sns.model.SnsCore");
                                        Class clsM2246i = AbstractC0921a.m2246i(C3365q.class);
                                        C3365q c3365q = C3365q.f10860a;
                                        c1425u2.f4738g = new C3366r(c3365q.m7142b(c3742g2, "sns_root_v1", listM101y0, new C0361f(1, c3365q, clsM2246i, "isSnsRootMethod", "isSnsRootMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 29), interfaceC1235p2), c3365q.m7142b(c3742g2, "media_directory_v1", AbstractC0000a.m101y0("getMediaFilePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper"), new C3364p(1, c3365q, AbstractC0921a.m2246i(C3365q.class), "isMediaDirectoryMethod", "isMediaDirectoryMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 0), interfaceC1235p2), c3365q.m7142b(c3742g2, "big_image_name_v1", AbstractC0000a.m101y0("getSnsBigName", "snsb_"), new C3364p(1, c3365q, AbstractC0921a.m2246i(C3365q.class), "isBigImageNameMethod", "isBigImageNameMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 1), interfaceC1235p2), c3365q.m7142b(c3742g2, "video_path_v1", AbstractC0000a.m101y0("MicroMsg.SnsVideoLogic", "getSnsVideoPath", "com.tencent.mm.plugin.sns.model.SnsVideoLogic"), new C3364p(1, c3365q, AbstractC0921a.m2246i(C3365q.class), "isVideoPathMethod", "isVideoPathMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 2), interfaceC1235p2));
                                        break;
                                    default:
                                        C3363o c3363o3 = c3363o2;
                                        C3742g c3742g3 = c3363o3.f10853a;
                                        InterfaceC1235p interfaceC1235p3 = c3363o3.f10854b;
                                        c3742g3.getClass();
                                        List listM101y02 = AbstractC0000a.m101y0("getSnsDownManager", "com.tencent.mm.plugin.sns.model.SnsCore");
                                        Class clsM2246i2 = AbstractC0921a.m2246i(C3368t.class);
                                        C3368t c3368t = C3368t.f10871a;
                                        c1425u2.f4738g = new C3369u(c3368t.m7145c(c3742g3, "image_manager_v1", listM101y02, new C3364p(1, c3368t, clsM2246i2, "isManagerGetter", "isManagerGetter(Ljava/lang/reflect/Method;)Z", 0, 0, 3), interfaceC1235p3), c3368t.m7145c(c3742g3, "image_download_v1", AbstractC0000a.m101y0("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager"), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isImageDownload", "isImageDownload(Ljava/lang/reflect/Method;)Z", 0, 0, 4), interfaceC1235p3), c3368t.m7145c(c3742g3, "video_service_v1", AbstractC0000a.m101y0("getSnsVideoService", "com.tencent.mm.plugin.sns.model.SnsCore"), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isManagerGetter", "isManagerGetter(Ljava/lang/reflect/Method;)Z", 0, 0, 5), interfaceC1235p3), c3368t.m7145c(c3742g3, "video_download_v1", AbstractC0000a.m101y0("addSnsVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService"), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isVideoDownload", "isVideoDownload(Ljava/lang/reflect/Method;)Z", 0, 0, 6), interfaceC1235p3), c3368t.m7145c(c3742g3, "video_full_path_v1", AbstractC0000a.m101y0("getSnsVideoFullPath", "getSnsVideoFullPath have flag %s, %s >>"), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isVideoStatusPath", "isVideoStatusPath(Ljava/lang/reflect/Method;)Z", 0, 0, 7), interfaceC1235p3), c3368t.m7145c(c3742g3, "video_finished_path_v1", AbstractC0000a.m101y0("isDownloadFinish", "it don't download video[%s] finish. file[%b], return null."), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isVideoStatusPath", "isVideoStatusPath(Ljava/lang/reflect/Method;)Z", 0, 0, 8), interfaceC1235p3), c3368t.m7145c(c3742g3, "video_thumb_path_v1", AbstractC0000a.m99x0("getSnsVideoThumbImagePath"), new C3364p(1, c3368t, AbstractC0921a.m2246i(C3368t.class), "isVideoMediaPath", "isVideoMediaPath(Ljava/lang/reflect/Method;)Z", 0, 0, 9), interfaceC1235p3));
                                        break;
                                }
                            }
                        });
                        Object obj2 = c1425u2.f4738g;
                        if (obj2 != null) {
                            return (C3369u) obj2;
                        }
                        AbstractC1416l.m3831g("methods");
                        throw null;
                }
            }
        });
        this.f10858f = new Handler(Looper.getMainLooper());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m7119a(Object obj, Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        Class<?> cls = parameterTypes.length == 1 ? parameterTypes[0] : null;
        return cls != null && cls.isInstance(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m7120b(InputStream inputStream, FileOutputStream fileOutputStream, long j3, AtomicBoolean atomicBoolean) throws InterruptedException, IOException {
        byte[] bArr = new byte[8192];
        long j4 = 0;
        while (!atomicBoolean.get()) {
            int i9 = inputStream.read(bArr);
            if (i9 <= 0) {
                return;
            }
            j4 += (long) i9;
            if (j4 > j3) {
                C2104o.m5276A("媒体文件过大");
                return;
            }
            fileOutputStream.write(bArr, 0, i9);
        }
        throw new InterruptedException("已取消");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m7121c(String str) {
        return AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3149m.m6703R0(str).toString(), "&amp;", "&", false), "&#38;", "&", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static ArrayList m7122d(Object obj) {
        ArrayList<Field> arrayListM7126i = m7126i(obj);
        ArrayList arrayList = new ArrayList();
        for (Field field : arrayListM7126i) {
            String string = null;
            if (AbstractC1416l.m3825a(field.getType(), String.class)) {
                Object field2 = KavaReflector.readField(field, obj);
                String str = field2 instanceof String ? (String) field2 : null;
                if (str != null) {
                    string = AbstractC3149m.m6703R0(str).toString();
                }
            }
            if (string != null) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static Object m7123f(int i9, Object obj, Set set) {
        Object field;
        Object objM7123f;
        if (obj == null || i9 > 5 || !set.add(obj)) {
            return null;
        }
        if (obj.getClass().getName().equals("com.tencent.mm.plugin.sns.storage.SnsInfo")) {
            return obj;
        }
        if (obj instanceof Object[]) {
            for (Object obj2 : (Object[]) obj) {
                Object objM7123f2 = m7123f(i9 + 1, obj2, set);
                if (objM7123f2 != null) {
                    return objM7123f2;
                }
            }
            return null;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                Object objM7123f3 = m7123f(i9 + 1, it.next(), set);
                if (objM7123f3 != null) {
                    return objM7123f3;
                }
            }
            return null;
        }
        if (obj instanceof View) {
            return m7123f(i9 + 1, ((View) obj).getTag(), set);
        }
        String name = obj.getClass().getName();
        if (AbstractC3156t.m6740d0(name, "java.", false) || AbstractC3156t.m6740d0(name, "android.", false)) {
            return null;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            for (Field field2 : KavaReflector.declaredFields(superclass)) {
                if (!Modifier.isStatic(field2.getModifiers()) && !field2.getType().isPrimitive() && (field = KavaReflector.readField(field2, obj)) != null && (objM7123f = m7123f(i9 + 1, field, set)) != null) {
                    return objM7123f;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m7124g(int i9, Object obj, Set set) {
        Object field;
        Object objM7124g;
        Object next;
        Object objInvoke;
        if (obj != null && i9 <= 5 && set.add(obj)) {
            if (obj.getClass().getName().equals("com.tencent.mm.protocal.protobuf.TimeLineObject")) {
                return obj;
            }
            if (obj instanceof Object[]) {
                for (Object obj2 : (Object[]) obj) {
                    Object objM7124g2 = m7124g(i9 + 1, obj2, set);
                    if (objM7124g2 != null) {
                        return objM7124g2;
                    }
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    Object objM7124g3 = m7124g(i9 + 1, it.next(), set);
                    if (objM7124g3 != null) {
                        return objM7124g3;
                    }
                }
            } else {
                if (obj instanceof View) {
                    return m7124g(i9 + 1, ((View) obj).getTag(), set);
                }
                for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                    Iterator<T> it2 = KavaReflector.declaredMethods(superclass).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        Method method = (Method) next;
                        if (!Modifier.isStatic(method.getModifiers())) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            parameterTypes.getClass();
                            boolean z9 = parameterTypes.length == 0 && method.getReturnType().getName().equals("com.tencent.mm.protocal.protobuf.TimeLineObject");
                            if (z9) {
                                break;
                            }
                        }
                    }
                    Method method2 = (Method) next;
                    if (method2 != null && (objInvoke = KavaReflector.invoke(method2, obj, new Object[0])) != null) {
                        return objInvoke;
                    }
                }
                String name = obj.getClass().getName();
                if (!AbstractC3156t.m6740d0(name, "java.", false) && !AbstractC3156t.m6740d0(name, "android.", false)) {
                    for (Class<?> superclass2 = obj.getClass(); superclass2 != null && !superclass2.equals(Object.class); superclass2 = superclass2.getSuperclass()) {
                        for (Field field2 : KavaReflector.declaredFields(superclass2)) {
                            if (!Modifier.isStatic(field2.getModifiers()) && !field2.getType().isPrimitive() && (field = KavaReflector.readField(field2, obj)) != null && (objM7124g = m7124g(i9 + 1, field, set)) != null) {
                                return objM7124g;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m7125h(Object obj, String str) {
        Object field = KavaReflector.readField(obj, str);
        String str2 = field instanceof String ? (String) field : null;
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM7121c = m7121c(str2);
        String str3 = m7127k(strM7121c) ? strM7121c : null;
        return str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static ArrayList m7126i(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            List<Field> listDeclaredFields = KavaReflector.declaredFields(superclass);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listDeclaredFields) {
                Field field = (Field) obj2;
                if (!(Modifier.isStatic(field.getModifiers()) || field.isSynthetic())) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add((Field) it.next());
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m7127k(String str) {
        return AbstractC3156t.m6740d0(str, "https://", true) || AbstractC3156t.m6740d0(str, "http://", true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m7128l(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return options.outWidth > 0 && options.outHeight > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static boolean m7129m(String str) {
        Object c3959f;
        Integer numM6741e0;
        Integer numM6741e02;
        Long lM6743g0;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            long jLongValue = (strExtractMetadata == null || (lM6743g0 = AbstractC3156t.m6743g0(strExtractMetadata)) == null) ? 0L : lM6743g0.longValue();
            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
            boolean z9 = false;
            int iIntValue = (strExtractMetadata2 == null || (numM6741e02 = AbstractC3156t.m6741e0(10, strExtractMetadata2)) == null) ? 0 : numM6741e02.intValue();
            String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
            int iIntValue2 = (strExtractMetadata3 == null || (numM6741e0 = AbstractC3156t.m6741e0(10, strExtractMetadata3)) == null) ? 0 : numM6741e0.intValue();
            if (jLongValue > 0 && iIntValue > 0 && iIntValue2 > 0) {
                z9 = true;
            }
            c3959f = Boolean.valueOf(z9);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = obj;
        }
        Boolean bool = (Boolean) c3959f;
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable unused) {
        }
        return bool.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static boolean m7130n(Object obj) {
        ArrayList<Field> arrayListM7126i = m7126i(obj);
        if (!arrayListM7126i.isEmpty()) {
            Iterator it = arrayListM7126i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (AbstractC1416l.m3825a(((Field) it.next()).getType(), String.class)) {
                    if (!arrayListM7126i.isEmpty()) {
                        for (Field field : arrayListM7126i) {
                            if (AbstractC1416l.m3825a(field.getType(), Integer.TYPE) || AbstractC1416l.m3825a(field.getType(), Integer.class)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3367s m7131p(Object obj, boolean z9) {
        Object next;
        String hexString;
        String strM7125h;
        Object next2;
        ArrayList arrayListM7122d = m7122d(obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : arrayListM7122d) {
            if (m7127k((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(m7121c((String) it.next()));
        }
        List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2));
        Object field = KavaReflector.readField(obj, "d");
        C3367s c3367sM7131p = null;
        String str = field instanceof String ? (String) field : null;
        if (str == null || (hexString = AbstractC3149m.m6703R0(str).toString()) == null) {
            Iterator it2 = arrayListM7122d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                String str2 = (String) next;
                if ((AbstractC3149m.m6721t0(str2) || m7127k(str2)) ? false : true) {
                    break;
                }
            }
            hexString = (String) next;
            if (hexString == null) {
                hexString = Integer.toHexString(System.identityHashCode(obj));
            }
        } else {
            if (AbstractC3149m.m6721t0(hexString)) {
                hexString = null;
            }
            if (hexString == null) {
            }
        }
        String str3 = hexString;
        Object field2 = KavaReflector.readField(obj, "e");
        Number number = field2 instanceof Number ? (Number) field2 : null;
        int iIntValue = number != null ? number.intValue() : 0;
        String strM7125h2 = m7125h(obj, "o");
        String strM7125h3 = m7125h(obj, "q");
        if (!AbstractC3149m.m6721t0(strM7125h3)) {
            strM7125h = m7125h(obj, "n");
        } else if (AbstractC3149m.m6721t0(strM7125h2)) {
            strM7125h = m7125h(obj, "i");
            if (AbstractC3149m.m6721t0(strM7125h)) {
                strM7125h = m7125h(obj, "n");
            }
        } else {
            strM7125h = m7125h(obj, "i");
        }
        if (AbstractC3149m.m6721t0(strM7125h)) {
            String str4 = (String) AbstractC4166m.m8424v1(listM8407P1);
            if (str4 == null) {
                str4 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            strM7125h = str4;
        }
        String str5 = strM7125h;
        String str6 = AbstractC3149m.m6721t0(strM7125h3) ? strM7125h2 : strM7125h3;
        if (z9) {
            C3010h c3010h = new C3010h(AbstractC3015m.m6414X(new C3011i(new C0795n(m7126i(obj), 6), true, new C0456k1(obj, 20)), new C0456k1(obj, 21)));
            while (true) {
                if (!c3010h.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = c3010h.next();
                if (next2 != obj && m7130n(next2)) {
                    break;
                }
            }
            if (next2 != null) {
                c3367sM7131p = m7131p(next2, false);
            }
        }
        str3.getClass();
        return new C3367s(str3, iIntValue, str5, str6, obj, c3367sM7131p);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Can't wrap try/catch for region: R(15:124|23|(4:120|24|118|25)|(1:27)(13:32|(2:34|(1:36)(9:37|116|38|39|107|40|41|42|(0)(16:47|(1:49)|52|(1:54)|55|(0)(1:60)|108|77|111|78|89|(2:91|(1:93))|94|(1:96)|97|(3:129|99|100)(2:101|132))))(1:76)|61|108|77|111|78|89|(0)|94|(0)|97|(0)(0))|28|108|77|111|78|89|(0)|94|(0)|97|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0166, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0171, code lost:
    
        r0 = new p276sf.C3959f(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0193  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m7132e(List list, String str, String str2, long j3, AtomicBoolean atomicBoolean) throws InterruptedException {
        Object c3959f;
        Throwable thM8182b;
        Response responseExecute;
        boolean z9;
        InterfaceC1235p interfaceC1235p = this.f10854b;
        File file = new File(this.f10853a.f12143a.getCacheDir(), "Hchat_sns_forward");
        String str3 = null;
        if (file.isDirectory() || file.mkdirs()) {
            String hexString = Integer.toHexString(str.hashCode());
            File file2 = new File(file, AbstractC0255e.m1021j("remote_v2_", hexString, ".", str2));
            if (file2.isFile()) {
                long length = file2.length();
                if (1 <= length && length <= j3) {
                    return file2.getAbsolutePath();
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (atomicBoolean.get()) {
                    throw new InterruptedException("已取消");
                }
                String strM7121c = m7121c(str4);
                if (m7127k(strM7121c)) {
                    File file3 = new File(file, AbstractC0255e.m1020i(hexString, ".part"));
                    try {
                        responseExecute = this.f10855c.newCall(new Request.Builder().url(strM7121c).header("User-Agent", "MicroMessenger Client").build()).execute();
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        if (responseExecute.isSuccessful()) {
                            ResponseBody responseBodyBody = responseExecute.body();
                            if (responseBodyBody == null) {
                                interfaceC1235p.invoke("朋友圈媒体下载响应为空: url=" + strM7121c, null);
                            } else if (responseBodyBody.contentLength() <= j3) {
                                InputStream inputStreamByteStream = responseBodyBody.byteStream();
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file3, false);
                                    try {
                                        try {
                                            m7120b(inputStreamByteStream, fileOutputStream, j3, atomicBoolean);
                                            fileOutputStream.close();
                                            inputStreamByteStream.close();
                                            if (file3.isFile() && file3.length() > 0) {
                                                if (file2.exists()) {
                                                    file2.delete();
                                                }
                                                if (!file3.renameTo(file2)) {
                                                    AbstractC0793l.m2021a0(file3, file2);
                                                    file3.delete();
                                                }
                                                if (file2.isFile() && file2.length() > 0) {
                                                    z9 = true;
                                                }
                                                c3959f = Boolean.valueOf(z9);
                                                responseExecute.close();
                                                thM8182b = C3960g.m8182b(c3959f);
                                                if (thM8182b != null) {
                                                    file3.delete();
                                                    if (!(thM8182b instanceof InterruptedException)) {
                                                        interfaceC1235p.invoke("朋友圈媒体下载失败: ".concat(strM7121c), thM8182b);
                                                    }
                                                }
                                                Boolean bool = Boolean.FALSE;
                                                if (c3959f instanceof C3959f) {
                                                    c3959f = bool;
                                                }
                                                if (((Boolean) c3959f).booleanValue()) {
                                                    return file2.getAbsolutePath();
                                                }
                                                str3 = null;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            Throwable th5 = th;
                                            try {
                                                throw th5;
                                            } catch (Throwable th6) {
                                                AbstractC2043a.m5035i(inputStreamByteStream, th5);
                                                throw th6;
                                            }
                                        }
                                    } finally {
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                            }
                            z9 = false;
                            c3959f = Boolean.valueOf(z9);
                            responseExecute.close();
                            thM8182b = C3960g.m8182b(c3959f);
                            if (thM8182b != null) {
                            }
                            Boolean bool2 = Boolean.FALSE;
                            if (c3959f instanceof C3959f) {
                            }
                            if (((Boolean) c3959f).booleanValue()) {
                            }
                        } else {
                            interfaceC1235p.invoke("朋友圈媒体下载响应异常: code=" + responseExecute.code() + " url=" + strM7121c, str3);
                        }
                        c3959f = Boolean.valueOf(z9);
                        responseExecute.close();
                        thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                        }
                        Boolean bool22 = Boolean.FALSE;
                        if (c3959f instanceof C3959f) {
                        }
                        if (((Boolean) c3959f).booleanValue()) {
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        Throwable th9 = th;
                        try {
                            throw th9;
                        } catch (Throwable th10) {
                            AbstractC2043a.m5035i(responseExecute, th9);
                            throw th10;
                        }
                    }
                    z9 = false;
                }
            }
        }
        return str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m7133j(InterfaceC1220a interfaceC1220a) {
        if (AbstractC1416l.m3825a(Looper.myLooper(), Looper.getMainLooper())) {
            return ((Boolean) interfaceC1220a.invoke()).booleanValue();
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        return this.f10858f.post(new RunnableC0059l(atomicBoolean, interfaceC1220a, countDownLatch, 26)) && countDownLatch.await(5000L, TimeUnit.MILLISECONDS) && atomicBoolean.get();
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Code restructure failed: missing block: B:116:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ed, code lost:
    
        if (r7 != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ef, code lost:
    
        if (r7 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f1, code lost:
    
        r6 = new java.io.FileOutputStream(r9, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f8, code lost:
    
        m7120b(r7, r6, r22, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fb, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fe, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0105, code lost:
    
        if (r9.isFile() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0107, code lost:
    
        r6 = r9.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010d, code lost:
    
        if (r16 > r6) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0111, code lost:
    
        if (r6 > r22) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0113, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0115, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0117, code lost:
    
        if (r10 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0119, code lost:
    
        r0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011b, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x011c, code lost:
    
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011e, code lost:
    
        r0 = r0.getAbsolutePath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0123, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0125, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0128, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0136, code lost:
    
        r0 = new p276sf.C3959f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x013c, code lost:
    
        r3 = p276sf.C3960g.m8182b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0140, code lost:
    
        if (r3 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0142, code lost:
    
        r9.delete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0147, code lost:
    
        if ((r3 instanceof java.lang.InterruptedException) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0149, code lost:
    
        r18.f10854b.invoke("读取朋友圈VFS缓存失败: ".concat(r19), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0156, code lost:
    
        if ((r0 instanceof p276sf.C3959f) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0159, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x015c, code lost:
    
        return (java.lang.String) r5;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m7134o(String str, String str2, String str3, long j3, AtomicBoolean atomicBoolean) {
        long j4;
        InputStream inputStream;
        Object next;
        Object obj = null;
        if (AbstractC3149m.m6721t0(str)) {
            return null;
        }
        File file = new File(str);
        long j5 = 1;
        if (file.isFile()) {
            long length = file.length();
            if (1 <= length && length <= j3) {
                return file.getAbsolutePath();
            }
        }
        C3742g c3742g = this.f10853a;
        File file2 = new File(c3742g.f12143a.getCacheDir(), "Hchat_sns_forward");
        if (!file2.isDirectory() && !file2.mkdirs()) {
            return null;
        }
        File file3 = new File(file2, AbstractC0255e.m1021j("local_", Integer.toHexString(str2.hashCode()), ".", str3));
        if (file3.isFile()) {
            long length2 = file3.length();
            if (1 <= length2 && length2 <= j3) {
                return file3.getAbsolutePath();
            }
        }
        String[] strArr = {"com.tencent.mm.vfs.w6", "com.tencent.mm.vfs.p6"};
        boolean z9 = false;
        int i9 = 0;
        while (true) {
            if (i9 >= 2) {
                j4 = j5;
                inputStream = null;
                break;
            }
            Class<?> clsLoadClass = KavaReflector.loadClass(strArr[i9], c3742g.f12145c);
            if (clsLoadClass != null) {
                Iterator<T> it = KavaReflector.declaredMethods(clsLoadClass).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        j4 = j5;
                        next = null;
                        break;
                    }
                    next = it.next();
                    Method method = (Method) next;
                    j4 = j5;
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (Modifier.isStatic(method.getModifiers()) && AbstractC1416l.m3825a(method.getReturnType(), InputStream.class) && parameterTypes.length == 1 && AbstractC1416l.m3825a(parameterTypes[0], String.class)) {
                        break;
                    }
                    j5 = j4;
                }
                Method method2 = (Method) next;
                if (method2 != null) {
                    Object objInvoke = KavaReflector.invoke(method2, null, str);
                    inputStream = objInvoke instanceof InputStream ? (InputStream) objInvoke : null;
                }
            } else {
                j4 = j5;
            }
            i9++;
            j5 = j4;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v24, resolved type: android.graphics.Bitmap */
    /* JADX DEBUG: Multi-variable search result rejected for r4v26, resolved type: android.graphics.Bitmap */
    /* JADX DEBUG: Multi-variable search result rejected for r4v29, resolved type: android.graphics.Bitmap */
    /* JADX DEBUG: Multi-variable search result rejected for r4v30, resolved type: android.graphics.Bitmap */
    /* JADX DEBUG: Multi-variable search result rejected for r4v31, resolved type: android.graphics.Bitmap */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0188  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, sf.c] */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3348c m7135q(C3370v c3370v, AtomicBoolean atomicBoolean) throws InterruptedException {
        C3350d c3350d;
        long j3;
        Object c3959f;
        Long lM6743g0;
        String str;
        String strM7136r;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean zM7133j;
        Method method;
        Object next;
        ArrayList arrayList3;
        Object next2;
        String str2;
        String str3;
        String absolutePath;
        Object obj;
        Object c3959f2;
        Bitmap bitmap;
        Throwable thM8182b;
        boolean z9;
        Object c3959f3;
        Throwable thM8182b2;
        boolean z10;
        String str4;
        c3370v.getClass();
        String str5 = c3370v.f10880b;
        ArrayList arrayList4 = c3370v.f10882d;
        String str6 = c3370v.f10879a;
        atomicBoolean.getClass();
        if (atomicBoolean.get()) {
            throw new InterruptedException("已取消");
        }
        int i9 = c3370v.f10881c;
        ?? r11 = this.f10857e;
        char c10 = 0;
        boolean z11 = true;
        if (i9 != 1 && i9 != 54) {
            if (i9 != 5 && i9 != 15) {
                z11 = false;
            }
            if (!z11) {
                return new C3348c(str5, null, null, null, 14);
            }
            C3367s c3367s = (C3367s) AbstractC4166m.m8424v1(arrayList4);
            if (c3367s == null) {
                C2104o.m5276A("未找到朋友圈视频");
                return null;
            }
            Object obj2 = c3367s.f10869e;
            String str7 = c3367s.f10865a;
            String strM7138t = m7138t(str6, c3367s, AbstractC4855en.m9265i(str6, "_", str7, "_video"), atomicBoolean);
            if (strM7138t == null) {
                C2104o.m5276A("朋友圈视频下载失败");
                return null;
            }
            Method method2 = ((C3369u) r11.getValue()).f10878g;
            InterfaceC1235p interfaceC1235p = this.f10854b;
            if (method2 == null) {
                str2 = null;
                str3 = strM7138t;
                absolutePath = null;
            } else if (m7119a(obj2, method2)) {
                try {
                    Object objInvokeOrThrow = KavaReflector.invokeOrThrow(method2, null, obj2);
                    str4 = objInvokeOrThrow instanceof String ? (String) objInvokeOrThrow : null;
                } catch (Throwable th2) {
                    th = th2;
                    str2 = null;
                    str3 = strM7138t;
                }
                if (str4 != null) {
                    str2 = null;
                    str3 = strM7138t;
                    String str8 = str4;
                    try {
                        String strM7134o = m7134o(str8, str7.concat("_video_thumb"), "jpg", 41943040L, atomicBoolean);
                        if (strM7134o != null && m7128l(strM7134o)) {
                            c3959f3 = strM7134o;
                        } else if (strM7134o != null && !strM7134o.equals(str8)) {
                            new File(strM7134o).delete();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c3959f3 = new C3959f(th);
                    }
                    thM8182b2 = C3960g.m8182b(c3959f3);
                    if (thM8182b2 != null && !(thM8182b2 instanceof InterruptedException)) {
                        interfaceC1235p.invoke("读取朋友圈视频封面失败: ".concat(str7), thM8182b2);
                    }
                    z10 = c3959f3 instanceof C3959f;
                    Object obj3 = c3959f3;
                    if (z10) {
                        obj3 = str2;
                    }
                    absolutePath = (String) obj3;
                } else {
                    str2 = null;
                    str3 = strM7138t;
                }
                c3959f3 = str2;
                thM8182b2 = C3960g.m8182b(c3959f3);
                if (thM8182b2 != null) {
                    interfaceC1235p.invoke("读取朋友圈视频封面失败: ".concat(str7), thM8182b2);
                }
                z10 = c3959f3 instanceof C3959f;
                Object obj32 = c3959f3;
                if (z10) {
                }
                absolutePath = (String) obj32;
            } else {
                str2 = null;
                absolutePath = null;
                str3 = strM7138t;
            }
            if (absolutePath == null) {
                String strM9264h = AbstractC4855en.m9264h(str6, "_", str7);
                if (atomicBoolean.get()) {
                    throw new InterruptedException("已取消");
                }
                File file = new File(this.f10853a.f12143a.getCacheDir(), "Hchat_sns_forward");
                if (file.isDirectory() || file.mkdirs()) {
                    File file2 = new File(file, AbstractC0921a.m2251n("video_thumb_", Integer.toHexString(strM9264h.hashCode()), ".jpg"));
                    if (file2.isFile()) {
                        String absolutePath2 = file2.getAbsolutePath();
                        absolutePath2.getClass();
                        if (m7128l(absolutePath2)) {
                            absolutePath = file2.getAbsolutePath();
                        } else {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            try {
                                mediaMetadataRetriever.setDataSource(str3);
                                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                                if (frameAtTime != null) {
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
                                        try {
                                            if (frameAtTime.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream)) {
                                                fileOutputStream.close();
                                                String absolutePath3 = file2.getAbsolutePath();
                                                boolean zM7128l = m7128l(absolutePath3);
                                                c3959f2 = absolutePath3;
                                                bitmap = frameAtTime;
                                                if (!zM7128l) {
                                                }
                                            } else {
                                                fileOutputStream.close();
                                            }
                                            c3959f2 = str2;
                                            bitmap = frameAtTime;
                                        } finally {
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj = frameAtTime;
                                        c3959f2 = new C3959f(th);
                                        bitmap = obj;
                                        thM8182b = C3960g.m8182b(c3959f2);
                                        if (thM8182b != null) {
                                        }
                                        z9 = c3959f2 instanceof C3959f;
                                        Object obj4 = c3959f2;
                                        if (z9) {
                                        }
                                        absolutePath = (String) obj4;
                                        if (bitmap != 0) {
                                        }
                                        mediaMetadataRetriever.release();
                                        if (absolutePath == null) {
                                        }
                                        if (absolutePath == null) {
                                        }
                                        return new C3348c(str5, null, str3, absolutePath, 2);
                                    }
                                } else {
                                    String str9 = str2;
                                    bitmap = str9;
                                    c3959f2 = str9;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                obj = str2;
                            }
                            thM8182b = C3960g.m8182b(c3959f2);
                            if (thM8182b != null) {
                                file2.delete();
                                if (!(thM8182b instanceof InterruptedException)) {
                                    interfaceC1235p.invoke("生成朋友圈视频封面失败: ".concat(str3), thM8182b);
                                }
                            }
                            z9 = c3959f2 instanceof C3959f;
                            Object obj42 = c3959f2;
                            if (z9) {
                                obj42 = str2;
                            }
                            absolutePath = (String) obj42;
                            if (bitmap != 0) {
                                bitmap.recycle();
                            }
                            try {
                                mediaMetadataRetriever.release();
                            } catch (Throwable unused) {
                            }
                            if (absolutePath == null) {
                                file2.delete();
                            }
                        }
                    }
                } else {
                    absolutePath = str2;
                }
                if (absolutePath == null) {
                    C2104o.m5276A("朋友圈视频封面生成失败");
                    return null;
                }
            }
            return new C3348c(str5, null, str3, absolutePath, 2);
        }
        List listM8403L1 = AbstractC4166m.m8403L1(9, arrayList4);
        ArrayList arrayList5 = new ArrayList(AbstractC4167n.m8429e1(listM8403L1));
        int i10 = 0;
        for (Object obj5 : listM8403L1) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            arrayList5.add(m7136r((C3367s) obj5, i10, atomicBoolean));
            i10 = i11;
        }
        ArrayList arrayList6 = new ArrayList(arrayList5);
        ArrayList arrayList7 = new ArrayList(AbstractC4167n.m8429e1(listM8403L1));
        int i12 = 0;
        for (Object obj6 : listM8403L1) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            C3367s c3367s2 = (C3367s) obj6;
            if (arrayList6.get(i12) == null) {
                C3369u c3369u = (C3369u) r11.getValue();
                ArrayList arrayList8 = arrayList6;
                Method method3 = c3369u.f10872a;
                if (method3 == null || (method = c3369u.f10873b) == null || !method.getParameterTypes()[c10].isInstance(c3367s2.f10869e)) {
                    arrayList = arrayList7;
                    arrayList2 = arrayList8;
                } else {
                    Class<?> cls = method.getParameterTypes()[3];
                    cls.getClass();
                    List<Field> listDeclaredFields = KavaReflector.declaredFields(cls);
                    Iterator<T> it = listDeclaredFields.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        Field field = (Field) next;
                        if (!Modifier.isStatic(field.getModifiers()) && AbstractC1416l.m3825a(field.getType(), String.class)) {
                            break;
                        }
                    }
                    Field field2 = (Field) next;
                    if (field2 != null) {
                        arrayList3 = arrayList7;
                        C3010h c3010h = new C3010h(AbstractC3015m.m6414X(new C3011i(new C0795n(listDeclaredFields, 6), true, new C1657q(cls, 3)), new C3092e(10)));
                        while (c3010h.hasNext()) {
                            next2 = c3010h.next();
                            if (AbstractC1416l.m3825a(KavaReflector.readField(field2, next2), "timeline")) {
                                break;
                            }
                        }
                    } else {
                        arrayList3 = arrayList7;
                    }
                    next2 = null;
                    if (next2 != null) {
                        arrayList2 = arrayList8;
                        arrayList = arrayList3;
                        zM7133j = m7133j(new C0482r0(this, method3, method, c3367s2, next2, 4));
                        boolean z12 = zM7133j ? false : true;
                        arrayList.add(Boolean.valueOf(z12));
                        arrayList6 = arrayList2;
                        arrayList7 = arrayList;
                        i12 = i13;
                        c10 = 0;
                    } else {
                        arrayList2 = arrayList8;
                        arrayList = arrayList3;
                    }
                }
                zM7133j = false;
                if (zM7133j) {
                }
                arrayList.add(Boolean.valueOf(z12));
                arrayList6 = arrayList2;
                arrayList7 = arrayList;
                i12 = i13;
                c10 = 0;
            } else {
                arrayList = arrayList7;
                arrayList2 = arrayList6;
            }
            arrayList.add(Boolean.valueOf(z12));
            arrayList6 = arrayList2;
            arrayList7 = arrayList;
            i12 = i13;
            c10 = 0;
        }
        ArrayList arrayList9 = arrayList7;
        ArrayList arrayList10 = arrayList6;
        long jElapsedRealtime = SystemClock.elapsedRealtime() + 60000;
        int i14 = 0;
        for (Object obj7 : listM8403L1) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            C3367s c3367s3 = (C3367s) obj7;
            if (arrayList10.get(i14) == null && ((Boolean) arrayList9.get(i14)).booleanValue()) {
                while (true) {
                    if (SystemClock.elapsedRealtime() >= jElapsedRealtime) {
                        strM7136r = m7136r(c3367s3, i14, atomicBoolean);
                        break;
                    }
                    if (atomicBoolean.get()) {
                        throw new InterruptedException("已取消");
                    }
                    strM7136r = m7136r(c3367s3, i14, atomicBoolean);
                    if (strM7136r != null) {
                        break;
                    }
                    SystemClock.sleep(500L);
                }
                arrayList10.set(i14, strM7136r);
            }
            if (arrayList10.get(i14) == null) {
                String strM7132e = m7132e(AbstractC0000a.m99x0(c3367s3.f10867c), str6 + "_" + c3367s3.f10865a + "_" + i14, "jpg", 41943040L, atomicBoolean);
                if (strM7132e == null) {
                    str = null;
                    arrayList10.set(i14, str);
                } else {
                    str = m7128l(strM7132e) ? strM7132e : null;
                    if (str == null) {
                        AbstractC3199a.m6849v(strM7132e);
                        str = null;
                    }
                    arrayList10.set(i14, str);
                }
            }
            i14 = i15;
        }
        ArrayList arrayList11 = new ArrayList(AbstractC4167n.m8429e1(arrayList10));
        int i16 = 0;
        for (Object obj8 : arrayList10) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            String str10 = (String) obj8;
            if (str10 == null) {
                C2104o.m5276A(AbstractC0921a.m2250m(i17, "第", "张图片下载失败"));
                return null;
            }
            arrayList11.add(str10);
            i16 = i17;
        }
        if (arrayList11.isEmpty()) {
            C2104o.m5276A("未找到朋友圈图片");
            return null;
        }
        ArrayList arrayList12 = new ArrayList(AbstractC4167n.m8429e1(listM8403L1));
        int i18 = 0;
        for (Object obj9 : listM8403L1) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            C3367s c3367s4 = (C3367s) obj9;
            String str11 = (String) arrayList11.get(i18);
            C3367s c3367s5 = c3367s4.f10870f;
            if (c3367s5 != null) {
                String strM7138t2 = m7138t(str6, c3367s5, str6 + "_" + c3367s4.f10865a + "_" + c3367s5.f10865a + "_live", atomicBoolean);
                if (strM7138t2 == null) {
                    C2104o.m5276A(AbstractC0921a.m2250m(i19, "第", "张实况视频下载失败"));
                    return null;
                }
                MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever2.setDataSource(strM7138t2);
                } catch (Throwable th6) {
                    th = th6;
                }
                try {
                    String strExtractMetadata = mediaMetadataRetriever2.extractMetadata(9);
                    c3959f = Long.valueOf((strExtractMetadata == null || (lM6743g0 = AbstractC3156t.m6743g0(strExtractMetadata)) == null) ? 0L : lM6743g0.longValue());
                    j3 = 0;
                } catch (Throwable th7) {
                    th = th7;
                    j3 = 0;
                    c3959f = new C3959f(th);
                }
                Object objValueOf = Long.valueOf(j3);
                if (c3959f instanceof C3959f) {
                    c3959f = objValueOf;
                }
                Number number = (Number) c3959f;
                number.longValue();
                try {
                    mediaMetadataRetriever2.release();
                } catch (Throwable unused2) {
                }
                long jLongValue = number.longValue();
                Long lValueOf = Long.valueOf(jLongValue);
                if (!(jLongValue > j3)) {
                    lValueOf = null;
                }
                if (lValueOf == null) {
                    C2104o.m5276A(AbstractC0921a.m2250m(i19, "第", "张实况视频无效"));
                    return null;
                }
                long jLongValue2 = lValueOf.longValue();
                if (jLongValue2 > 2147483647L) {
                    jLongValue2 = 2147483647L;
                }
                c3350d = new C3350d(str11, strM7138t2, (int) jLongValue2, 0, 0, 0L, 120);
            } else {
                c3350d = new C3350d(str11, null, 0, 0, 0, 0L, 126);
            }
            arrayList12.add(c3350d);
            i18 = i19;
        }
        return new C3348c(str5, arrayList12, null, null, 12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, sf.c] */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m7136r(C3367s c3367s, int i9, AtomicBoolean atomicBoolean) {
        Method method;
        Method method2;
        Object c3959f;
        C3366r c3366r = (C3366r) this.f10856d.getValue();
        Method method3 = c3366r.f10861a;
        if (method3 == null || (method = c3366r.f10862b) == null || (method2 = c3366r.f10863c) == null) {
            return null;
        }
        Object obj = c3367s.f10869e;
        String str = c3367s.f10865a;
        if (!m7119a(obj, method2)) {
            return null;
        }
        try {
            Object objInvoke = KavaReflector.invoke(method3, null, new Object[0]);
            String str2 = objInvoke instanceof String ? (String) objInvoke : null;
            if (str2 != null) {
                Object objInvoke2 = KavaReflector.invoke(method, null, str2, str);
                String str3 = objInvoke2 instanceof String ? (String) objInvoke2 : null;
                if (str3 != null) {
                    Object objInvoke3 = KavaReflector.invoke(method2, null, c3367s.f10869e);
                    String str4 = objInvoke3 instanceof String ? (String) objInvoke3 : null;
                    if (str4 != null) {
                        String strConcat = str3.concat(str4);
                        String strM7134o = m7134o(strConcat, str + "_" + i9, "jpg", 41943040L, atomicBoolean);
                        if (strM7134o == null || !m7128l(strM7134o)) {
                            if (strM7134o != null && !strM7134o.equals(strConcat)) {
                                new File(strM7134o).delete();
                            }
                            c3959f = null;
                        } else {
                            c3959f = strM7134o;
                        }
                    } else {
                        c3959f = null;
                    }
                }
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null && !(thM8182b instanceof InterruptedException)) {
            this.f10854b.invoke("读取朋友圈本地原图失败: ".concat(str), thM8182b);
        }
        return (String) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0122  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, sf.c] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, sf.c] */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m7137s(String str, C3367s c3367s, AtomicBoolean atomicBoolean) {
        C3363o c3363o;
        Throwable th2;
        Object c3959f;
        Throwable thM8182b;
        Method method;
        try {
            C3369u c3369u = (C3369u) this.f10857e.getValue();
            ArrayList arrayList = new ArrayList(3);
            Method method2 = c3369u.f10877f;
            Method method3 = c3369u.f10876e;
            for (Method method4 : AbstractC0000a.m101y0(method2, method3)) {
                try {
                    if (method4 != null) {
                        Object obj = c3367s.f10869e;
                        Class<?>[] parameterTypes = method4.getParameterTypes();
                        parameterTypes.getClass();
                        Class cls = (Class) AbstractC4165l.m8366C0(1, parameterTypes);
                        if (cls != null && cls.isInstance(obj)) {
                            Object objInvokeOrThrow = KavaReflector.invokeOrThrow(method4, null, str, c3367s.f10869e);
                            String str2 = objInvokeOrThrow instanceof String ? (String) objInvokeOrThrow : null;
                            if (str2 != null) {
                                if (AbstractC3149m.m6721t0(str2)) {
                                    str2 = null;
                                }
                                if (str2 != null) {
                                    arrayList.add(str2);
                                }
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    c3363o = this;
                    c3959f = new C3959f(th2);
                    thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                        c3363o.f10854b.invoke("读取朋友圈本地视频失败: ".concat(c3367s.f10865a), thM8182b);
                    }
                    return (String) (c3959f instanceof C3959f ? null : c3959f);
                }
            }
            if (c3369u.f10877f == null && method3 == null && (method = ((C3366r) this.f10856d.getValue()).f10864d) != null && m7119a(c3367s.f10869e, method)) {
                Object objInvokeOrThrow2 = KavaReflector.invokeOrThrow(method, null, c3367s.f10869e);
                String str3 = objInvokeOrThrow2 instanceof String ? (String) objInvokeOrThrow2 : null;
                if (str3 != null) {
                    if (AbstractC3149m.m6721t0(str3)) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        arrayList.add(str3);
                    }
                }
            }
            Iterator it = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    c3363o = this;
                    c3959f = null;
                    break;
                }
                String str4 = (String) it.next();
                c3363o = this;
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                try {
                    String strM7134o = c3363o.m7134o(str4, c3367s.f10865a + "_video", "mp4", 536870912L, atomicBoolean2);
                    if (strM7134o != null) {
                        if (m7129m(strM7134o)) {
                            c3959f = strM7134o;
                            break;
                        }
                        if (!strM7134o.equals(str4)) {
                            new File(strM7134o).delete();
                        }
                    }
                    atomicBoolean = atomicBoolean2;
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    c3959f = new C3959f(th2);
                }
            }
        } catch (Throwable th5) {
            th = th5;
            c3363o = this;
        }
        thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null && !(thM8182b instanceof InterruptedException)) {
            c3363o.f10854b.invoke("读取朋友圈本地视频失败: ".concat(c3367s.f10865a), thM8182b);
        }
        return (String) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, sf.c] */
    /* JADX INFO: renamed from: t */
    public final String m7138t(String str, C3367s c3367s, String str2, AtomicBoolean atomicBoolean) throws InterruptedException {
        Method method;
        String strM7137s = m7137s(str, c3367s, atomicBoolean);
        if (strM7137s == null) {
            C3369u c3369u = (C3369u) this.f10857e.getValue();
            Method method2 = c3369u.f10874c;
            boolean zM7133j = false;
            if (method2 != null && (method = c3369u.f10875d) != null && method.getParameterTypes()[0].isInstance(c3367s.f10869e)) {
                zM7133j = m7133j(new C0482r0(this, method2, method, c3367s, str, 3));
            }
            if (zM7133j) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() + 90000;
                while (true) {
                    if (SystemClock.elapsedRealtime() >= jElapsedRealtime) {
                        strM7137s = m7137s(str, c3367s, atomicBoolean);
                        break;
                    }
                    if (atomicBoolean.get()) {
                        throw new InterruptedException("已取消");
                    }
                    String strM7137s2 = m7137s(str, c3367s, atomicBoolean);
                    if (strM7137s2 != null) {
                        strM7137s = strM7137s2;
                        break;
                    }
                    SystemClock.sleep(500L);
                }
            }
        }
        if (strM7137s != null) {
            return strM7137s;
        }
        String strM7132e = m7132e(AbstractC0000a.m99x0(c3367s.f10867c), str2, "mp4", 536870912L, atomicBoolean);
        if (strM7132e != null) {
            String str3 = m7129m(strM7132e) ? strM7132e : null;
            if (str3 != null) {
                return str3;
            }
            AbstractC3199a.m6849v(strM7132e);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final C3370v m7139u(Object obj) {
        Object c3959f;
        if (obj == null) {
            return null;
        }
        try {
            Object objInvokeMethod = KavaReflector.invokeMethod(obj, "getTimeLine", new Object[0]);
            c3959f = objInvokeMethod != null ? m7140v(objInvokeMethod) : null;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f10854b.invoke("解析朋友圈原生内容失败", thM8182b);
        }
        return (C3370v) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3370v m7140v(Object obj) {
        int iIntValue;
        List list;
        Object objInvoke;
        String strM8392A1;
        Object field = KavaReflector.readField(obj, "ContentDesc");
        String strM8392A12 = field instanceof String ? (String) field : null;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (strM8392A12 == null) {
            strM8392A12 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Object field2 = KavaReflector.readField(obj, "ContentObj");
        if (field2 != null) {
            Object field3 = KavaReflector.readField(field2, "e");
            Number number = field3 instanceof Number ? (Number) field3 : null;
            iIntValue = number != null ? number.intValue() : 0;
        }
        List list2 = C4173t.f13710g;
        if (field2 != null) {
            list = (List) AbstractC3015m.m6411U(AbstractC3015m.m6414X(new C3011i(new C0795n(m7126i(field2), 6), true, new C3092e(12)), new C0456k1(field2, this)));
            if (list == null) {
                list = list2;
            }
        } else {
            list = null;
        }
        if (list != null) {
            list2 = list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(m7131p(it.next(), iIntValue == 54));
        }
        Object field4 = KavaReflector.readField(obj, "Id");
        String strM9263g = field4 instanceof String ? (String) field4 : null;
        if (strM9263g == null) {
            strM9263g = AbstractC4855en.m9263g("sns_", Integer.toHexString(System.identityHashCode(obj)));
        } else {
            if (AbstractC3149m.m6721t0(strM9263g)) {
                strM9263g = null;
            }
            if (strM9263g == null) {
            }
        }
        if (AbstractC3149m.m6721t0(strM8392A12) && iIntValue != 1 && iIntValue != 5 && iIntValue != 15 && iIntValue != 54) {
            if (field2 != null) {
                ArrayList arrayListM7122d = m7122d(field2);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayListM7122d) {
                    if (!m7127k((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (!AbstractC3149m.m6721t0((String) obj3)) {
                        arrayList3.add(obj3);
                    }
                }
                strM8392A1 = AbstractC4166m.m8392A1(AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList3)), "\n", null, null, null, 62);
            } else {
                strM8392A1 = null;
            }
            strM8392A12 = strM8392A1 == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM8392A1;
        }
        if (iIntValue != 1 && iIntValue != 5 && iIntValue != 15 && iIntValue != 54) {
            C3022t c3022tM6413W = AbstractC3015m.m6413W(new C0795n(arrayList, 6), new C3092e(11));
            Iterator it2 = c3022tM6413W.f9822a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    objInvoke = null;
                    break;
                }
                objInvoke = c3022tM6413W.f9823b.invoke(it2.next());
                if (!AbstractC3149m.m6721t0((String) objInvoke)) {
                    break;
                }
            }
            String str2 = (String) objInvoke;
            if (str2 != null) {
                str = str2;
            }
            List listM101y0 = AbstractC0000a.m101y0(strM8392A12, str);
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : listM101y0) {
                if (!AbstractC3149m.m6721t0((String) obj4)) {
                    arrayList4.add(obj4);
                }
            }
            strM8392A12 = AbstractC4166m.m8392A1(AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList4)), "\n", null, null, null, 62);
        }
        if (AbstractC3149m.m6721t0(strM8392A12) && arrayList.isEmpty()) {
            return null;
        }
        return new C3370v(strM9263g, strM8392A12, iIntValue, arrayList);
    }
}
