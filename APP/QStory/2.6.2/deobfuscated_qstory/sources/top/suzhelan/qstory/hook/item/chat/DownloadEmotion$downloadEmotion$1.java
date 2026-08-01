package top.suzhelan.qstory.hook.item.chat;

import android.app.Activity;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.AbstractC4344;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p036.AbstractC6353;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p251.AbstractC8174;
import p257.AbstractC8210;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.suzhelan.qstory.hook.item.chat.DownloadEmotion$downloadEmotion$1", f = "DownloadEmotion.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class DownloadEmotion$downloadEmotion$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ ArrayList<String> $picMD5List;
    final /* synthetic */ ArrayList<String> $picUrlList;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadEmotion$downloadEmotion$1(ArrayList<String> arrayList, ArrayList<String> arrayList2, Activity activity, InterfaceC4356<? super DownloadEmotion$downloadEmotion$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$picUrlList = arrayList;
        this.$picMD5List = arrayList2;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        DownloadEmotion$downloadEmotion$1 downloadEmotion$downloadEmotion$1 = new DownloadEmotion$downloadEmotion$1(this.$picUrlList, this.$picMD5List, this.$activity, interfaceC4356);
        downloadEmotion$downloadEmotion$1.L$0 = obj;
        return downloadEmotion$downloadEmotion$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((DownloadEmotion$downloadEmotion$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM162;
        C5175 c5175 = C5175.f14739;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
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
                File file = new File(externalStoragePublicDirectory + "/QQ", arrayList2.get(arrayList.indexOf(str)) + AbstractC8174.m13614(str));
                if (file.exists()) {
                    file.delete();
                }
                AbstractC6353.m11903(str, file.getAbsolutePath());
                arrayList3.add(file);
            }
            ArrayList arrayList4 = new ArrayList(AbstractC4344.m8832(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((File) it2.next()).getAbsolutePath());
            }
            MediaScannerConnection.scanFile(activity, (String[]) arrayList4.toArray(new String[0]), null, new C5857());
            objM162 = Result.m8755constructorimpl(c5175);
        } catch (Throwable th) {
            objM162 = AbstractC0053.m162(th);
        }
        if (Result.m8758exceptionOrNullimpl(objM162) != null) {
            AbstractC8210.m13718("\u4e0b\u8f7d\u5931\u8d25!", WaitDialog$TYPE.ERROR);
        }
        if (Result.m8762isSuccessimpl(objM162)) {
            AbstractC8210.m13719("\u4e0b\u8f7d\u6210\u529f!", WaitDialog$TYPE.SUCCESS, 500L);
        }
        return c5175;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0$1(String str, Uri uri) {
    }
}
