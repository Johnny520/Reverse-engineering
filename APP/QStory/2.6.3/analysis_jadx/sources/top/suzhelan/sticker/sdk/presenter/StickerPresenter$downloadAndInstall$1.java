package top.suzhelan.sticker.sdk.presenter;

import androidx.activity.AbstractC0053;
import io.ktor.client.plugins.AbstractC3933;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.AbstractC4381;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.internal.AbstractC5365;
import p007.AbstractC6128;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p093.C7201;
import p095.C7207;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;
import top.suzhelan.sticker.sdk.net.StickerClientKt;
import top.suzhelan.sticker.sdk.net.StickerSdkConfig;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$downloadAndInstall$1", f = "StickerPresenter.kt", l = {108, 151}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class StickerPresenter$downloadAndInstall$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6554 $onEnd;
    final /* synthetic */ OnlineStickerInfo $sticker;
    final /* synthetic */ String $targetDirName;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ C5985 this$0;

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerPresenter$downloadAndInstall$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$downloadAndInstall$1$1", f = "StickerPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC6554 $onEnd;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC6554 interfaceC6554, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$onEnd = interfaceC6554;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(this.$onEnd, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            this.$onEnd.invoke(Boolean.FALSE, "未配置表情存储目录");
            return C5176.f14739;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerPresenter$downloadAndInstall$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.suzhelan.sticker.sdk.presenter.StickerPresenter$downloadAndInstall$1$3", f = "StickerPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC6554 $onEnd;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(InterfaceC6554 interfaceC6554, InterfaceC4357<? super AnonymousClass3> interfaceC4357) {
            super(2, interfaceC4357);
            this.$onEnd = interfaceC6554;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass3(this.$onEnd, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass3) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            this.$onEnd.invoke(Boolean.TRUE, "下载成功!可在本地表情面板查看");
            return C5176.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerPresenter$downloadAndInstall$1(String str, OnlineStickerInfo onlineStickerInfo, C5985 c5985, InterfaceC6554 interfaceC6554, InterfaceC4357<? super StickerPresenter$downloadAndInstall$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$targetDirName = str;
        this.$sticker = onlineStickerInfo;
        this.this$0 = c5985;
        this.$onEnd = interfaceC6554;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new StickerPresenter$downloadAndInstall$1(this.$targetDirName, this.$sticker, this.this$0, this.$onEnd, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((StickerPresenter$downloadAndInstall$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        File file;
        BufferedOutputStream bufferedOutputStream;
        byte[] bArr;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return c5176;
            }
            if (i != 2) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            file = (File) this.L$2;
            try {
                AbstractC5185.m10210(obj);
                file.delete();
                return c5176;
            } catch (Throwable th) {
                th = th;
                file.delete();
                throw th;
            }
        }
        AbstractC5185.m10210(obj);
        String sticker_dir = StickerSdkConfig.getSTICKER_DIR();
        if (sticker_dir.length() == 0) {
            C7207 c7207 = AbstractC5395.f15030;
            C7201 c7201 = AbstractC5365.f14960;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onEnd, null);
            this.L$0 = null;
            this.label = 1;
            if (AbstractC5399.m10470(c7201, anonymousClass1, this) != coroutineSingletons) {
                return c5176;
            }
        } else {
            File file2 = new File(sticker_dir, this.$targetDirName);
            File file3 = new File(sticker_dir, AbstractC0053.m158("temp_", this.$sticker.getId(), ".zip"));
            try {
                Object obj2 = StickerClientKt.getStickerApiService().downloadSticker(this.$sticker.getId()).execute().f15756;
                obj2.getClass();
                BufferedInputStream bufferedInputStream = new BufferedInputStream(((AbstractC6128) obj2).m11518());
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
                    AbstractC4381.m8873(file4, file5);
                }
                file2.mkdirs();
                String absolutePath = file3.getAbsolutePath();
                absolutePath.getClass();
                String absolutePath2 = file2.getAbsolutePath();
                absolutePath2.getClass();
                AbstractC3933.m8289(absolutePath, absolutePath2);
                C5985.m11360(this.this$0, file2);
                if (file5.exists()) {
                    AbstractC4381.m8873(file5, file4);
                    file5.delete();
                }
                C7207 c72072 = AbstractC5395.f15030;
                C7201 c72012 = AbstractC5365.f14960;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$onEnd, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = file3;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 2;
                if (AbstractC5399.m10470(c72012, anonymousClass3, this) != coroutineSingletons) {
                    file = file3;
                    file.delete();
                    return c5176;
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
