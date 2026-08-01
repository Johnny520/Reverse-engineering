package top.suzhelan.qstory.hook.item.chat;

import android.app.Activity;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import androidx.activity.AbstractC0900;
import com.bumptech.glide.AbstractC3898;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.AbstractC5177;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p053.AbstractC7199;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p273.AbstractC9040;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.qstory.hook.item.chat.DownloadEmotion$downloadEmotion$1", m556f = "DownloadEmotion.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class DownloadEmotion$downloadEmotion$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ ArrayList<String> $picMD5List;
    final /* synthetic */ ArrayList<String> $picUrlList;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadEmotion$downloadEmotion$1(ArrayList<String> arrayList, ArrayList<String> arrayList2, Activity activity, InterfaceC5189<? super DownloadEmotion$downloadEmotion$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$picUrlList = arrayList;
        this.$picMD5List = arrayList2;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        DownloadEmotion$downloadEmotion$1 downloadEmotion$downloadEmotion$1 = new DownloadEmotion$downloadEmotion$1(this.$picUrlList, this.$picMD5List, this.$activity, interfaceC5189);
        downloadEmotion$downloadEmotion$1.L$0 = obj;
        return downloadEmotion$downloadEmotion$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DownloadEmotion$downloadEmotion$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM723;
        C6008 c6008 = C6008.f15084;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        ArrayList<String> arrayList = this.$picUrlList;
        ArrayList<String> arrayList2 = this.$picMD5List;
        Activity activity = this.$activity;
        try {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            "getExternalStoragePublicDirectory(...)";
            externalStoragePublicDirectory.getClass();
            ArrayList arrayList3 = new ArrayList();
            Iterator<String> it = arrayList.iterator();
            "iterator(...)";
            it.getClass();
            while (it.hasNext()) {
                String next = it.next();
                "next(...)";
                next.getClass();
                String str = next;
                File file = new File(externalStoragePublicDirectory + "/QQ", arrayList2.get(arrayList.indexOf(str)) + AbstractC3898.m7414(str));
                if (file.exists()) {
                    file.delete();
                }
                AbstractC7199.m12510(str, file.getAbsolutePath());
                arrayList3.add(file);
            }
            ArrayList arrayList4 = new ArrayList(AbstractC5177.m9381(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((File) it2.next()).getAbsolutePath());
            }
            MediaScannerConnection.scanFile(activity, (String[]) arrayList4.toArray(new String[0]), null, new C6692());
            objM723 = Result.m9304constructorimpl(c6008);
        } catch (Throwable th) {
            objM723 = AbstractC0900.m723(th);
        }
        if (Result.m9307exceptionOrNullimpl(objM723) != null) {
            AbstractC9040.m14294("下载失败!", WaitDialog$TYPE.ERROR);
        }
        if (Result.m9311isSuccessimpl(objM723)) {
            AbstractC9040.m14295("下载成功!", WaitDialog$TYPE.SUCCESS, 500L);
        }
        return c6008;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0$1(String str, Uri uri) {
    }
}
