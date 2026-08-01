package io.ktor.server.http.content;

import android.widget.ProgressBar;
import androidx.compose.foundation.lazy.C0756;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.server.application.InterfaceC4057;
import java.util.ArrayList;
import java.util.List;
import kotlin.C5176;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import lin.xposed.hook.javaplugin.bean.MessageData;
import net.bytebuddy.pool.TypePool;
import p052.InterfaceC6558;
import p088.C7152;
import p088.C7157;
import p217.AbstractC7969;
import p287.AbstractC8405;
import p315.C8663;
import p325.C8741;
import p329.C8766;
import p329.C8774;
import p343.C8819;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4124 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12515;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f12516;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f12517;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f12518;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12519 = 0;

    public /* synthetic */ C4124(String str, InterfaceC4057 interfaceC4057, String str2, InterfaceC6558 interfaceC6558) {
        this.f12517 = str;
        this.f12516 = interfaceC4057;
        this.f12518 = str2;
        this.f12515 = interfaceC6558;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f12519;
        C5176 c5176 = C5176.f14739;
        Object obj2 = this.f12515;
        String str = this.f12517;
        Object obj3 = this.f12516;
        Object obj4 = this.f12518;
        switch (i) {
            case 0:
                CompressedFileType compressedFileType = (CompressedFileType) obj;
                compressedFileType.getClass();
                String str2 = str + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + compressedFileType.getExtension();
                Pair pairM8520 = AbstractC4123.m8520(((InterfaceC4057) obj3).mo8460(), str2, (String) obj4, new C0756(str2, str, (InterfaceC6558) obj2, 6));
                if (pairM8520 != null) {
                    break;
                }
                break;
            case 1:
                MessageData messageData = (MessageData) obj4;
                C7152 c7152 = (C7152) obj3;
                C8741 c8741 = (C8741) obj2;
                C8766 c8766 = (C8766) obj;
                AbstractC8405.m13972(2295); /* decoded: m13972(2295)=$this$jsonObject */
                c8766.getClass();
                c8766.m14468(Long.valueOf(messageData.MessageTime), AbstractC8405.m13972(2610)); /* decoded: m13972(2610)=message_time */
                String strM13973 = AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵呜"); /* decoded-inline: content */
                String str3 = messageData.MessageContent;
                if (str3 == null) {
                    str3 = "";
                }
                c8766.m14468(str3, strM13973);
                c8766.m14468(Integer.valueOf(messageData.MessageType), AbstractC8405.m13972(2611)); /* decoded: m13972(2611)=message_type */
                c8766.m14468(str, AbstractC8405.m13972(2612)); /* decoded: m13972(2612)=sender_uin */
                c8766.m14468(messageData.SenderNickName, AbstractC8405.m13972(2613)); /* decoded: m13972(2613)=sender_nickname */
                String strM13972 = AbstractC8405.m13972(2614); /* decoded: m13972(2614)=file_name */
                String str4 = messageData.FileName;
                if (str4 == null) {
                    str4 = "";
                }
                c8766.m14468(str4, strM13972);
                c8766.m14468(messageData.FileUrl, AbstractC8405.m13972(2615)); /* decoded: m13972(2615)=file_url */
                c8766.m14468(Long.valueOf(messageData.FileSize), AbstractC8405.m13972(2616)); /* decoded: m13972(2616)=file_size */
                String strM139722 = AbstractC8405.m13972(2617); /* decoded: m13972(2617)=local_path */
                String str5 = messageData.LocalPath;
                if (str5 == null) {
                    str5 = "";
                }
                c8766.m14468(str5, strM139722);
                String strM139723 = AbstractC8405.m13972(2618); /* decoded: m13972(2618)=reply_to_uin */
                String str6 = messageData.ReplyTo;
                c8766.m14468(str6 != null ? str6 : "", strM139723);
                String strM139732 = AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵喵喵呜~喵喵呜喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜喵呜喵呜"); /* decoded-inline: at_list */
                AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵"); /* decoded-inline: block */
                C8774 c8774 = new C8774();
                AbstractC8405.m13972(2337); /* decoded: m13972(2337)=$this$jsonArray */
                String[] strArr = messageData.AtList;
                List listM8846 = strArr != null ? AbstractC4347.m8846(strArr) : null;
                if (listM8846 == null) {
                    listM8846 = EmptyList.INSTANCE;
                }
                c8774.m14469(listM8846);
                c8766.m14468(new C7157(c8774.f24718), strM139732);
                String strM139724 = AbstractC8405.m13972(2619); /* decoded: m13972(2619)=pic_url_list */
                AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵"); /* decoded-inline: block */
                C8774 c87742 = new C8774();
                AbstractC8405.m13972(2337); /* decoded: m13972(2337)=$this$jsonArray */
                ArrayList<String> arrayList = messageData.PicUrlList;
                List listM8797 = arrayList != null ? AbstractC4344.m8797(arrayList) : null;
                if (listM8797 == null) {
                    listM8797 = EmptyList.INSTANCE;
                }
                c87742.m14469(listM8797);
                c8766.m14468(new C7157(c87742.f24718), strM139724);
                c8766.m14468(c7152, AbstractC8405.m13972(2620)); /* decoded: m13972(2620)=reply_message */
                String str7 = c8741.f24635;
                String str8 = c8741.f24634;
                if (!AbstractC4395.m8907(str7, AbstractC8405.m13973("喵喵喵呜喵呜喵喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜"))) { /* decoded-inline: group */
                    c8766.m14468(str8, AbstractC8405.m13972(2621)); /* decoded: m13972(2621)=friend_uin */
                } else {
                    c8766.m14468(str8, AbstractC8405.m13972(2441)); /* decoded: m13972(2441)=group_uin */
                }
                break;
            default:
                C8663 c8663 = (C8663) obj3;
                ProgressBar progressBar = (ProgressBar) obj2;
                List list = (List) obj;
                list.getClass();
                AbstractC7969.m13458((C8819) obj4, list);
                if (list.isEmpty()) {
                    c8663.m14359(R.id.tv_page_title, str + " ，暂无表情包");
                }
                progressBar.setVisibility(8);
                break;
        }
        return c5176;
    }

    public /* synthetic */ C4124(MessageData messageData, String str, C7152 c7152, C8741 c8741) {
        this.f12518 = messageData;
        this.f12517 = str;
        this.f12516 = c7152;
        this.f12515 = c8741;
    }

    public /* synthetic */ C4124(C8819 c8819, C8663 c8663, String str, ProgressBar progressBar) {
        this.f12518 = c8819;
        this.f12516 = c8663;
        this.f12517 = str;
        this.f12515 = progressBar;
    }
}
