package top.suzhelan.qstory.hook.item.chat;

import android.app.Activity;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3066;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.AbstractC4345;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p037.AbstractC6370;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p257.AbstractC8211;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.suzhelan.qstory.hook.item.chat.DownloadEmotion$downloadEmotion$1", f = "DownloadEmotion.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class DownloadEmotion$downloadEmotion$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ ArrayList<String> $picMD5List;
    final /* synthetic */ ArrayList<String> $picUrlList;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadEmotion$downloadEmotion$1(ArrayList<String> arrayList, ArrayList<String> arrayList2, Activity activity, InterfaceC4357<? super DownloadEmotion$downloadEmotion$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$picUrlList = arrayList;
        this.$picMD5List = arrayList2;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        DownloadEmotion$downloadEmotion$1 downloadEmotion$downloadEmotion$1 = new DownloadEmotion$downloadEmotion$1(this.$picUrlList, this.$picMD5List, this.$activity, interfaceC4357);
        downloadEmotion$downloadEmotion$1.L$0 = obj;
        return downloadEmotion$downloadEmotion$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((DownloadEmotion$downloadEmotion$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM163;
        C5176 c5176 = C5176.f14739;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311(AbstractC8405.m13972(1261));
            return null;
        }
        AbstractC5185.m10210(obj);
        ArrayList<String> arrayList = this.$picUrlList;
        ArrayList<String> arrayList2 = this.$picMD5List;
        Activity activity = this.$activity;
        try {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            AbstractC8405.m13972(2163);
            externalStoragePublicDirectory.getClass();
            ArrayList arrayList3 = new ArrayList();
            Iterator<String> it = arrayList.iterator();
            AbstractC8405.m13972(1253);
            it.getClass();
            while (it.hasNext()) {
                String next = it.next();
                AbstractC8405.m13972(1254);
                next.getClass();
                String str = next;
                File file = new File(externalStoragePublicDirectory + AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵呜喵喵呜喵喵~喵喵呜喵呜喵呜呜"), arrayList2.get(arrayList.indexOf(str)) + AbstractC3066.m6854(str));
                if (file.exists()) {
                    file.delete();
                }
                AbstractC6370.m11951(str, file.getAbsolutePath());
                arrayList3.add(file);
            }
            ArrayList arrayList4 = new ArrayList(AbstractC4345.m8822(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((File) it2.next()).getAbsolutePath());
            }
            MediaScannerConnection.scanFile(activity, (String[]) arrayList4.toArray(new String[0]), null, new C5862());
            objM163 = Result.m8745constructorimpl(c5176);
        } catch (Throwable th) {
            objM163 = AbstractC0053.m163(th);
        }
        if (Result.m8748exceptionOrNullimpl(objM163) != null) {
            AbstractC8211.m13735(AbstractC8405.m13972(2164), WaitDialog$TYPE.ERROR);
        }
        if (Result.m8752isSuccessimpl(objM163)) {
            AbstractC8211.m13736(AbstractC8405.m13972(2165), WaitDialog$TYPE.SUCCESS, 500L);
        }
        return c5176;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0$1(String str, Uri uri) {
    }
}
