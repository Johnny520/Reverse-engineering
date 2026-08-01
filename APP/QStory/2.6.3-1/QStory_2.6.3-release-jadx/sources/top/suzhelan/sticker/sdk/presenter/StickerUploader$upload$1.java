package top.suzhelan.sticker.sdk.presenter;

import android.util.Log;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3897;
import com.bumptech.glide.AbstractC3898;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.zip.ZipOutputStream;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import kotlin.text.Regex;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.internal.AbstractC6197;
import kotlinx.coroutines.internal.C6183;
import p023.AbstractC6962;
import p023.C6951;
import p023.C6953;
import p023.C6973;
import p023.C6974;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p109.C8030;
import p111.C8036;
import p273.C9027;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;
import top.suzhelan.sticker.sdk.net.StickerClientKt;
import top.suzhelan.sticker.sdk.net.StickerResult;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.sticker.sdk.presenter.StickerUploader$upload$1", m556f = "StickerUploader.kt", m557l = {67, 77, 86, 137, 149}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class StickerUploader$upload$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ String $author;
    final /* synthetic */ String $coverFileName;
    final /* synthetic */ String $description;
    final /* synthetic */ String $dirPath;
    final /* synthetic */ String $nickname;
    final /* synthetic */ InterfaceC7383 $onEnd;
    final /* synthetic */ String $tags;
    final /* synthetic */ String $title;
    final /* synthetic */ String $uin;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$15;
    Object L$16;
    Object L$17;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerUploader$upload$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.sticker.sdk.presenter.StickerUploader$upload$1$1", m556f = "StickerUploader.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08121 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7383 $onEnd;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08121(InterfaceC7383 interfaceC7383, InterfaceC5189<? super C08121> interfaceC5189) {
            super(2, interfaceC5189);
            this.$onEnd = interfaceC7383;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08121(this.$onEnd, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08121) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.$onEnd.invoke(Boolean.FALSE, "目录不存在");
            return C6008.f15084;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerUploader$upload$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.sticker.sdk.presenter.StickerUploader$upload$1$2", m556f = "StickerUploader.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08132 extends SuspendLambda implements InterfaceC7383 {

        /* JADX INFO: renamed from: $e */
        final /* synthetic */ Exception f340$e;
        final /* synthetic */ InterfaceC7383 $onEnd;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08132(InterfaceC7383 interfaceC7383, Exception exc, InterfaceC5189<? super C08132> interfaceC5189) {
            super(2, interfaceC5189);
            this.$onEnd = interfaceC7383;
            this.f340$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08132(this.$onEnd, this.f340$e, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08132) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.$onEnd.invoke(Boolean.FALSE, "压缩失败: " + this.f340$e.getMessage());
            return C6008.f15084;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerUploader$upload$1$3 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.sticker.sdk.presenter.StickerUploader$upload$1$3", m556f = "StickerUploader.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08143 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7383 $onEnd;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08143(InterfaceC7383 interfaceC7383, InterfaceC5189<? super C08143> interfaceC5189) {
            super(2, interfaceC5189);
            this.$onEnd = interfaceC7383;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08143(this.$onEnd, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08143) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.$onEnd.invoke(Boolean.FALSE, "目录中没有找到图片文件作为封面");
            return C6008.f15084;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerUploader$upload$1$4 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.sticker.sdk.presenter.StickerUploader$upload$1$4", m556f = "StickerUploader.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08154 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7383 $onEnd;
        final /* synthetic */ StickerResult<OnlineStickerInfo> $res;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08154(StickerResult<OnlineStickerInfo> stickerResult, InterfaceC7383 interfaceC7383, InterfaceC5189<? super C08154> interfaceC5189) {
            super(2, interfaceC5189);
            this.$res = stickerResult;
            this.$onEnd = interfaceC7383;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08154(this.$res, this.$onEnd, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08154) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String message;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            StickerResult<OnlineStickerInfo> stickerResult = this.$res;
            if (stickerResult == null || !stickerResult.isSuccess()) {
                InterfaceC7383 interfaceC7383 = this.$onEnd;
                Boolean bool = Boolean.FALSE;
                StickerResult<OnlineStickerInfo> stickerResult2 = this.$res;
                if (stickerResult2 == null || (message = stickerResult2.getMessage()) == null) {
                    message = "上传失败";
                }
                interfaceC7383.invoke(bool, message);
            } else {
                this.$onEnd.invoke(Boolean.TRUE, this.$res.getMessage());
            }
            return C6008.f15084;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.sticker.sdk.presenter.StickerUploader$upload$1$5 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.suzhelan.sticker.sdk.presenter.StickerUploader$upload$1$5", m556f = "StickerUploader.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08165 extends SuspendLambda implements InterfaceC7383 {

        /* JADX INFO: renamed from: $e */
        final /* synthetic */ Exception f341$e;
        final /* synthetic */ InterfaceC7383 $onEnd;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08165(InterfaceC7383 interfaceC7383, Exception exc, InterfaceC5189<? super C08165> interfaceC5189) {
            super(2, interfaceC5189);
            this.$onEnd = interfaceC7383;
            this.f341$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08165(this.$onEnd, this.f341$e, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08165) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.$onEnd.invoke(Boolean.FALSE, "上传失败: " + this.f341$e.getMessage());
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerUploader$upload$1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, InterfaceC7383 interfaceC7383, InterfaceC5189<? super StickerUploader$upload$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$dirPath = str;
        this.$coverFileName = str2;
        this.$title = str3;
        this.$uin = str4;
        this.$nickname = str5;
        this.$tags = str6;
        this.$description = str7;
        this.$author = str8;
        this.$onEnd = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new StickerUploader$upload$1(this.$dirPath, this.$coverFileName, this.$title, this.$uin, this.$nickname, this.$tags, this.$description, this.$author, this.$onEnd, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((StickerUploader$upload$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x030a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ZipOutputStream zipOutputStream;
        File file;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        try {
        } catch (Exception e) {
            Log.e("StickerUploader", "upload error", e);
            C8036 c8036 = AbstractC6227.f15375;
            C8030 c8030 = AbstractC6197.f15305;
            C08165 c08165 = new C08165(this.$onEnd, e, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.L$9 = null;
            this.L$10 = null;
            this.L$11 = null;
            this.L$12 = null;
            this.L$13 = null;
            this.L$14 = null;
            this.L$15 = null;
            this.L$16 = null;
            this.L$17 = null;
            this.label = 5;
            if (AbstractC6231.m11029(c8030, c08165, this) == coroutineSingletons) {
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                } else if (i == 3) {
                } else {
                    if (i == 4) {
                        file = (File) this.L$1;
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
                    if (i != 5) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC6017.m10769(obj);
                }
            }
            AbstractC6017.m10769(obj);
            return c6008;
        }
        AbstractC6017.m10769(obj);
        C9027.m14266("压缩中...");
        File file2 = new File(this.$dirPath);
        if (file2.exists() && file2.isDirectory()) {
            File file3 = new File(file2.getParent(), "upload_" + System.currentTimeMillis() + ".zip");
            try {
                C6183 c6183 = C6814.f16645;
                zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file3)));
            } catch (Exception e2) {
                file3.delete();
                C8036 c80362 = AbstractC6227.f15375;
                C8030 c80302 = AbstractC6197.f15305;
                C08132 c08132 = new C08132(this.$onEnd, e2, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                if (AbstractC6231.m11029(c80302, c08132, this) == coroutineSingletons) {
                }
            }
            try {
                C6814.m11915(file2, "", zipOutputStream);
                zipOutputStream.close();
                C9027.m14266("选取封面...");
                File fileM11918 = C6814.m11918(file2, this.$coverFileName);
                if (fileM11918 == null) {
                    file3.delete();
                    C8036 c80363 = AbstractC6227.f15375;
                    C8030 c80303 = AbstractC6197.f15305;
                    C08143 c08143 = new C08143(this.$onEnd, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (AbstractC6231.m11029(c80303, c08143, this) == coroutineSingletons) {
                    }
                } else {
                    try {
                        C9027.m14266("构建参数...");
                        LinkedHashMap linkedHashMapM9327 = AbstractC5171.m9327(new Pair("title", this.$title));
                        String str = this.$uin;
                        if (str != null && !AbstractC5976.m10731(str)) {
                            linkedHashMapM9327.put("uin", this.$uin);
                        }
                        String str2 = this.$nickname;
                        if (str2 != null && !AbstractC5976.m10731(str2)) {
                            linkedHashMapM9327.put("nickname", this.$nickname);
                        }
                        String str3 = this.$tags;
                        if (str3 != null && !AbstractC5976.m10731(str3)) {
                            linkedHashMapM9327.put("tags", this.$tags);
                        }
                        String str4 = this.$description;
                        if (str4 != null && !AbstractC5976.m10731(str4)) {
                            linkedHashMapM9327.put("description", this.$description);
                        }
                        String str5 = this.$author;
                        if (str5 != null && !AbstractC5976.m10731(str5)) {
                            linkedHashMapM9327.put("author", this.$author);
                        }
                        String strValueOf = String.valueOf(System.currentTimeMillis());
                        String string = UUID.randomUUID().toString();
                        string.getClass();
                        String strM10696 = AbstractC5971.m10696(string, "-", "");
                        String strM11917 = C6814.m11917(linkedHashMapM9327, strValueOf, strM10696);
                        int i2 = AbstractC6962.f17134;
                        Regex regex = C6973.f17204;
                        C6974 c6974M7424 = AbstractC3898.m7424("archive", file3.getName(), new C6953(AbstractC3888.m7271("application/zip"), file3));
                        C6974 c6974M74242 = AbstractC3898.m7424("cover", fileM11918.getName(), new C6953(AbstractC3888.m7271("image/*"), fileM11918));
                        C6951 c6951M7401 = AbstractC3897.m7401(this.$title, AbstractC3888.m7271("text/plain"));
                        String str6 = this.$tags;
                        C6951 c6951M74012 = str6 != null ? AbstractC3897.m7401(str6, AbstractC3888.m7271("text/plain")) : null;
                        String str7 = this.$uin;
                        C6951 c6951M74013 = str7 != null ? AbstractC3897.m7401(str7, AbstractC3888.m7271("text/plain")) : null;
                        String str8 = this.$nickname;
                        C6951 c6951M74014 = str8 != null ? AbstractC3897.m7401(str8, AbstractC3888.m7271("text/plain")) : null;
                        String str9 = this.$description;
                        C6951 c6951M74015 = str9 != null ? AbstractC3897.m7401(str9, AbstractC3888.m7271("text/plain")) : null;
                        String str10 = this.$author;
                        C6951 c6951M74016 = str10 != null ? AbstractC3897.m7401(str10, AbstractC3888.m7271("text/plain")) : null;
                        C9027.m14266("上传中...");
                        StickerResult stickerResult = (StickerResult) StickerClientKt.getStickerApiService().uploadSticker(strM11917, strValueOf, strM10696, c6974M7424, c6974M74242, c6951M7401, c6951M74012, c6951M74013, c6951M74014, c6951M74015, c6951M74016).execute().f16101;
                        C8036 c80364 = AbstractC6227.f15375;
                        C8030 c80304 = AbstractC6197.f15305;
                        C08154 c08154 = new C08154(stickerResult, this.$onEnd, null);
                        this.L$0 = null;
                        this.L$1 = file3;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.L$8 = null;
                        this.L$9 = null;
                        this.L$10 = null;
                        this.L$11 = null;
                        this.L$12 = null;
                        this.L$13 = null;
                        this.L$14 = null;
                        this.L$15 = null;
                        this.L$16 = null;
                        this.L$17 = null;
                        this.label = 4;
                        if (AbstractC6231.m11029(c80304, c08154, this) != coroutineSingletons) {
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
            } finally {
            }
        }
        C8036 c80365 = AbstractC6227.f15375;
        C8030 c80305 = AbstractC6197.f15305;
        C08121 c08121 = new C08121(this.$onEnd, null);
        this.L$0 = null;
        this.label = 1;
        if (AbstractC6231.m11029(c80305, c08121, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return c6008;
    }
}
