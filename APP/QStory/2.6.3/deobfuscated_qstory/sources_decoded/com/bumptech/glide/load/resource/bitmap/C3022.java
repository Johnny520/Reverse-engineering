package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.load.engine.InterfaceC2989;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import p286.C8397;
import p286.C8398;
import p286.InterfaceC8400;
import p305.C8623;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3022 implements InterfaceC8400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8623 f9633 = f9629;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC2979 f9634;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3023 f9635;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8398 f9631 = new C8398("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C3047(1));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8398 f9630 = new C8398("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C3047(2));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8623 f9629 = new C8623(18);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final List f9632 = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    public C3022(InterfaceC2979 interfaceC2979, InterfaceC3023 interfaceC3023) {
        this.f9634 = interfaceC2979;
        this.f9635 = interfaceC3023;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062 A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #2 {all -> 0x0068, blocks: (B:23:0x005c, B:25:0x0062), top: B:89:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0120 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap m6532(java.lang.Object r14, android.media.MediaMetadataRetriever r15, long r16, int r18, int r19, int r20, com.bumptech.glide.load.resource.bitmap.C3037 r21) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C3022.m6532(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪哲世苏兰):android.graphics.Bitmap");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p286.InterfaceC8400
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2989 mo6524(Object obj, int i, int i2, C8397 c8397) throws Exception {
        boolean zIsTerminated;
        boolean zIsTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        long jLongValue = ((Long) c8397.m13964(f9631)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            C5925.m11310(AbstractC2442.m4583(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
            return null;
        }
        int i3 = (Integer) c8397.m13964(f9630);
        if (i3 == null) {
            i3 = 2;
        }
        C3037 c3037 = (C3037) c8397.m13964(C3037.f9671);
        if (c3037 == null) {
            c3037 = C3037.f9665;
        }
        C3037 c30372 = c3037;
        this.f9633.getClass();
        Integer num = i3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        boolean z = false;
        try {
            this.f9635.mo6533(mediaMetadataRetriever, obj);
            Bitmap bitmapM6532 = m6532(obj, mediaMetadataRetriever, jLongValue, num.intValue(), i, i2, c30372);
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
            } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
            } else if (mediaMetadataRetriever instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) mediaMetadataRetriever;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!zIsTerminated2) {
                        try {
                            zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                mediaMetadataRetriever.release();
            }
            return C3026.m6536(bitmapM6532, this.f9634);
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
            } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
            } else if (mediaMetadataRetriever instanceof ExecutorService) {
                ExecutorService executorService2 = (ExecutorService) mediaMetadataRetriever;
                if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated = executorService2.isTerminated())) {
                    executorService2.shutdown();
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService2.awaitTermination(1L, timeUnit);
                        } catch (InterruptedException unused2) {
                            if (!z) {
                                executorService2.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                mediaMetadataRetriever.release();
            }
            throw th;
        }
    }

    @Override // p286.InterfaceC8400
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo6525(Object obj, C8397 c8397) {
        return true;
    }
}
