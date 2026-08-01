package io.ktor.server.http.content;

import android.widget.ProgressBar;
import androidx.compose.foundation.lazy.C1597;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.server.application.InterfaceC4889;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6008;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import lin.xposed.hook.javaplugin.bean.MessageData;
import net.bytebuddy.pool.TypePool;
import p068.InterfaceC7387;
import p104.C7981;
import p104.C7986;
import p233.AbstractC8798;
import p303.AbstractC9234;
import p331.C9492;
import p341.C9570;
import p345.C9595;
import p345.C9603;
import p359.C9648;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4956 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12860;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f12861;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f12862;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f12863;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12864 = 0;

    public /* synthetic */ C4956(String str, InterfaceC4889 interfaceC4889, String str2, InterfaceC7387 interfaceC7387) {
        this.f12862 = str;
        this.f12861 = interfaceC4889;
        this.f12863 = str2;
        this.f12860 = interfaceC7387;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f12864;
        C6008 c6008 = C6008.f15084;
        Object obj2 = this.f12860;
        String str = this.f12862;
        Object obj3 = this.f12861;
        Object obj4 = this.f12863;
        switch (i) {
            case 0:
                CompressedFileType compressedFileType = (CompressedFileType) obj;
                compressedFileType.getClass();
                String str2 = str + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + compressedFileType.getExtension();
                Pair pairM9079 = AbstractC4955.m9079(((InterfaceC4889) obj3).mo9019(), str2, (String) obj4, new C1597(str2, str, (InterfaceC7387) obj2, 6));
                if (pairM9079 != null) {
                    break;
                }
                break;
            case 1:
                MessageData messageData = (MessageData) obj4;
                C7981 c7981 = (C7981) obj3;
                C9570 c9570 = (C9570) obj2;
                C9595 c9595 = (C9595) obj;
                AbstractC9234.m14531(2295);
                c9595.getClass();
                c9595.m15027(Long.valueOf(messageData.MessageTime), AbstractC9234.m14531(2610));
                String strM14532 = AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵呜");
                String str3 = messageData.MessageContent;
                if (str3 == null) {
                    str3 = "";
                }
                c9595.m15027(str3, strM14532);
                c9595.m15027(Integer.valueOf(messageData.MessageType), AbstractC9234.m14531(2611));
                c9595.m15027(str, AbstractC9234.m14531(2612));
                c9595.m15027(messageData.SenderNickName, AbstractC9234.m14531(2613));
                String strM14531 = AbstractC9234.m14531(2614);
                String str4 = messageData.FileName;
                if (str4 == null) {
                    str4 = "";
                }
                c9595.m15027(str4, strM14531);
                c9595.m15027(messageData.FileUrl, AbstractC9234.m14531(2615));
                c9595.m15027(Long.valueOf(messageData.FileSize), AbstractC9234.m14531(2616));
                String strM145312 = AbstractC9234.m14531(2617);
                String str5 = messageData.LocalPath;
                if (str5 == null) {
                    str5 = "";
                }
                c9595.m15027(str5, strM145312);
                String strM145313 = AbstractC9234.m14531(2618);
                String str6 = messageData.ReplyTo;
                c9595.m15027(str6 != null ? str6 : "", strM145313);
                String strM145322 = AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵呜喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜喵呜喵呜");
                AbstractC9234.m14532("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
                C9603 c9603 = new C9603();
                AbstractC9234.m14531(2337);
                String[] strArr = messageData.AtList;
                List listM9405 = strArr != null ? AbstractC5179.m9405(strArr) : null;
                if (listM9405 == null) {
                    listM9405 = EmptyList.INSTANCE;
                }
                c9603.m15028(listM9405);
                c9595.m15027(new C7986(c9603.f25063), strM145322);
                String strM145314 = AbstractC9234.m14531(2619);
                AbstractC9234.m14532("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
                C9603 c96032 = new C9603();
                AbstractC9234.m14531(2337);
                ArrayList<String> arrayList = messageData.PicUrlList;
                List listM9356 = arrayList != null ? AbstractC5176.m9356(arrayList) : null;
                if (listM9356 == null) {
                    listM9356 = EmptyList.INSTANCE;
                }
                c96032.m15028(listM9356);
                c9595.m15027(new C7986(c96032.f25063), strM145314);
                c9595.m15027(c7981, AbstractC9234.m14531(2620));
                String str7 = c9570.f24980;
                String str8 = c9570.f24979;
                if (!AbstractC5227.m9466(str7, AbstractC9234.m14532("喵喵喵呜喵呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜"))) {
                    c9595.m15027(str8, AbstractC9234.m14531(2621));
                } else {
                    c9595.m15027(str8, AbstractC9234.m14531(2441));
                }
                break;
            default:
                C9492 c9492 = (C9492) obj3;
                ProgressBar progressBar = (ProgressBar) obj2;
                List list = (List) obj;
                list.getClass();
                AbstractC8798.m14017((C9648) obj4, list);
                if (list.isEmpty()) {
                    c9492.m14918(C0328R.id.tv_page_title, str + " ，暂无表情包");
                }
                progressBar.setVisibility(8);
                break;
        }
        return c6008;
    }

    public /* synthetic */ C4956(MessageData messageData, String str, C7981 c7981, C9570 c9570) {
        this.f12863 = messageData;
        this.f12862 = str;
        this.f12861 = c7981;
        this.f12860 = c9570;
    }

    public /* synthetic */ C4956(C9648 c9648, C9492 c9492, String str, ProgressBar progressBar) {
        this.f12863 = c9648;
        this.f12861 = c9492;
        this.f12862 = str;
        this.f12860 = progressBar;
    }
}
