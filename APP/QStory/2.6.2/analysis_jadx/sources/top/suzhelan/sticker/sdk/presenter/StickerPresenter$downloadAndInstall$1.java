package top.suzhelan.sticker.sdk.presenter;

import androidx.activity.AbstractC0053;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.AbstractC4380;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.internal.AbstractC5364;
import p000.AbstractC6087;
import p015.AbstractC6201;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p093.C7200;
import p095.C7206;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;
import top.suzhelan.sticker.sdk.net.StickerClientKt;
import top.suzhelan.sticker.sdk.net.StickerSdkConfig;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$downloadAndInstall$1", f = "StickerPresenter.kt", l = {108, 151}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class StickerPresenter$downloadAndInstall$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6553 $onEnd;
    final /* synthetic */ OnlineStickerInfo $sticker;
    final /* synthetic */ String $targetDirName;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ C5979 this$0;

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerPresenter$downloadAndInstall$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$downloadAndInstall$1$1", f = "StickerPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC6553 $onEnd;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC6553 interfaceC6553, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$onEnd = interfaceC6553;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.$onEnd, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            this.$onEnd.invoke(Boolean.FALSE, "未配置表情存储目录");
            return C5175.f14739;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerPresenter$downloadAndInstall$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$downloadAndInstall$1$3", f = "StickerPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC6553 $onEnd;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(InterfaceC6553 interfaceC6553, InterfaceC4356<? super AnonymousClass3> interfaceC4356) {
            super(2, interfaceC4356);
            this.$onEnd = interfaceC6553;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass3(this.$onEnd, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass3) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            this.$onEnd.invoke(Boolean.TRUE, "下载成功!可在本地表情面板查看");
            return C5175.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerPresenter$downloadAndInstall$1(String str, OnlineStickerInfo onlineStickerInfo, C5979 c5979, InterfaceC6553 interfaceC6553, InterfaceC4356<? super StickerPresenter$downloadAndInstall$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$targetDirName = str;
        this.$sticker = onlineStickerInfo;
        this.this$0 = c5979;
        this.$onEnd = interfaceC6553;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new StickerPresenter$downloadAndInstall$1(this.$targetDirName, this.$sticker, this.this$0, this.$onEnd, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((StickerPresenter$downloadAndInstall$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        File file;
        BufferedOutputStream bufferedOutputStream;
        byte[] bArr;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return c5175;
            }
            if (i != 2) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            file = (File) this.L$2;
            try {
                AbstractC5184.m10206(obj);
                file.delete();
                return c5175;
            } catch (Throwable th) {
                th = th;
                file.delete();
                throw th;
            }
        }
        AbstractC5184.m10206(obj);
        String sticker_dir = StickerSdkConfig.getSTICKER_DIR();
        if (sticker_dir.length() == 0) {
            C7206 c7206 = AbstractC5394.f15030;
            C7200 c7200 = AbstractC5364.f14960;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onEnd, null);
            this.L$0 = null;
            this.label = 1;
            if (AbstractC5398.m10466(c7200, anonymousClass1, this) != coroutineSingletons) {
                return c5175;
            }
        } else {
            File file2 = new File(sticker_dir, this.$targetDirName);
            File file3 = new File(sticker_dir, AbstractC0053.m156("temp_", this.$sticker.getId(), ".zip"));
            try {
                Object obj2 = StickerClientKt.getStickerApiService().downloadSticker(this.$sticker.getId()).execute().f15756;
                obj2.getClass();
                BufferedInputStream bufferedInputStream = new BufferedInputStream(((AbstractC6201) obj2).m11647());
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3));
                    try {
                        bArr = new byte[4096];
                    } finally {
                    }
                } finally {
                }
                while (true) {
                    int i2 = bufferedInputStream.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    bufferedOutputStream.write(bArr, 0, i2);
                }
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                bufferedInputStream.close();
                File file4 = new File(file2, "config.json");
                File file5 = new File(file2, "config.json.bak_download");
                if (file4.exists()) {
                    AbstractC4380.m8883(file4, file5);
                }
                file2.mkdirs();
                String absolutePath = file3.getAbsolutePath();
                absolutePath.getClass();
                String absolutePath2 = file2.getAbsolutePath();
                absolutePath2.getClass();
                AbstractC6087.m11421(absolutePath, absolutePath2);
                C5979.m11300(this.this$0, file2);
                if (file5.exists()) {
                    AbstractC4380.m8883(file5, file4);
                    file5.delete();
                }
                C7206 c72062 = AbstractC5394.f15030;
                C7200 c72002 = AbstractC5364.f14960;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$onEnd, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = file3;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 2;
                if (AbstractC5398.m10466(c72002, anonymousClass3, this) != coroutineSingletons) {
                    file = file3;
                    file.delete();
                    return c5175;
                }
            } catch (Throwable th2) {
                th = th2;
                file = file3;
                file.delete();
                throw th;
            }
        }
        return coroutineSingletons;
    }
}
