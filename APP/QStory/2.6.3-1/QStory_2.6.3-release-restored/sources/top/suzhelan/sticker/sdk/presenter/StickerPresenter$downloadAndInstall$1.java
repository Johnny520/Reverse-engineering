package top.suzhelan.sticker.sdk.presenter;

import androidx.activity.AbstractC0900;
import io.ktor.client.plugins.AbstractC4765;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.p008io.AbstractC5213;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.internal.AbstractC6197;
import p023.AbstractC6957;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p109.C8030;
import p111.C8036;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;
import top.suzhelan.sticker.sdk.net.StickerClientKt;
import top.suzhelan.sticker.sdk.net.StickerSdkConfig;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$downloadAndInstall$1", m556f = "StickerPresenter.kt", m557l = {108, 151}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class StickerPresenter$downloadAndInstall$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $onEnd;
    final /* synthetic */ OnlineStickerInfo $sticker;
    final /* synthetic */ String $targetDirName;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ C6815 this$0;

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerPresenter$downloadAndInstall$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$downloadAndInstall$1$1", m556f = "StickerPresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08041 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7383 $onEnd;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08041(InterfaceC7383 interfaceC7383, InterfaceC5189<? super C08041> interfaceC5189) {
            super(2, interfaceC5189);
            this.$onEnd = interfaceC7383;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08041(this.$onEnd, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08041) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.$onEnd.invoke(Boolean.FALSE, "未配置表情存储目录");
            return C6008.f15084;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerPresenter$downloadAndInstall$1$3 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$downloadAndInstall$1$3", m556f = "StickerPresenter.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08053 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7383 $onEnd;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08053(InterfaceC7383 interfaceC7383, InterfaceC5189<? super C08053> interfaceC5189) {
            super(2, interfaceC5189);
            this.$onEnd = interfaceC7383;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08053(this.$onEnd, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08053) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.$onEnd.invoke(Boolean.TRUE, "下载成功!可在本地表情面板查看");
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerPresenter$downloadAndInstall$1(String str, OnlineStickerInfo onlineStickerInfo, C6815 c6815, InterfaceC7383 interfaceC7383, InterfaceC5189<? super StickerPresenter$downloadAndInstall$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$targetDirName = str;
        this.$sticker = onlineStickerInfo;
        this.this$0 = c6815;
        this.$onEnd = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new StickerPresenter$downloadAndInstall$1(this.$targetDirName, this.$sticker, this.this$0, this.$onEnd, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((StickerPresenter$downloadAndInstall$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        File file;
        BufferedOutputStream bufferedOutputStream;
        byte[] bArr;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            file = (File) this.L$2;
            try {
                AbstractC6017.m10769(obj);
                file.delete();
                return c6008;
            } catch (Throwable th) {
                th = th;
                file.delete();
                throw th;
            }
        }
        AbstractC6017.m10769(obj);
        String sticker_dir = StickerSdkConfig.getSTICKER_DIR();
        if (sticker_dir.length() == 0) {
            C8036 c8036 = AbstractC6227.f15375;
            C8030 c8030 = AbstractC6197.f15305;
            C08041 c08041 = new C08041(this.$onEnd, null);
            this.L$0 = null;
            this.label = 1;
            if (AbstractC6231.m11029(c8030, c08041, this) != coroutineSingletons) {
                return c6008;
            }
        } else {
            File file2 = new File(sticker_dir, this.$targetDirName);
            File file3 = new File(sticker_dir, AbstractC0900.m718("temp_", this.$sticker.getId(), ".zip"));
            try {
                Object obj2 = StickerClientKt.getStickerApiService().downloadSticker(this.$sticker.getId()).execute().f16101;
                obj2.getClass();
                BufferedInputStream bufferedInputStream = new BufferedInputStream(((AbstractC6957) obj2).m12077());
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
                    AbstractC5213.m9432(file4, file5);
                }
                file2.mkdirs();
                String absolutePath = file3.getAbsolutePath();
                absolutePath.getClass();
                String absolutePath2 = file2.getAbsolutePath();
                absolutePath2.getClass();
                AbstractC4765.m8848(absolutePath, absolutePath2);
                C6815.m11919(this.this$0, file2);
                if (file5.exists()) {
                    AbstractC5213.m9432(file5, file4);
                    file5.delete();
                }
                C8036 c80362 = AbstractC6227.f15375;
                C8030 c80302 = AbstractC6197.f15305;
                C08053 c08053 = new C08053(this.$onEnd, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = file3;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 2;
                if (AbstractC6231.m11029(c80302, c08053, this) != coroutineSingletons) {
                    file = file3;
                    file.delete();
                    return c6008;
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
