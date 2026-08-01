package p087;

import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.RunnableC0099;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.internal.C1251;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2905;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.C5176;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6543;
import p052.InterfaceC6551;
import p052.InterfaceC6558;
import p088.C7152;
import p088.C7157;
import p089.InterfaceC7184;
import p091.C7195;
import p093.C7201;
import p193.C7828;
import p217.AbstractC7969;
import p230.C8053;
import p249.C8159;
import p252.C8188;
import p257.AbstractC8211;
import p257.C8198;
import p257.C8208;
import p257.C8240;
import p287.AbstractC8405;
import p321.C8688;
import p323.AbstractC8721;
import p329.AbstractC8765;
import p329.C8766;
import p329.C8770;
import p329.C8774;
import p342.C8817;
import p343.C8819;
import p388.C9082;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.widget.CustomRecycleView;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;
import top.suzhelan.sticker.sdk.presenter.C5985;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7068 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f18968;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f18969;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18970;

    public /* synthetic */ C7068(Object obj, int i, Object obj2) {
        this.f18970 = i;
        this.f18968 = obj;
        this.f18969 = obj2;
    }

    /* JADX WARN: Type inference failed for: r8v15, types: [T, java.lang.Object, java.lang.String] */
    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f18970;
        C5176 c5176 = C5176.f14739;
        Object obj2 = this.f18969;
        Object obj3 = this.f18968;
        switch (i) {
            case 0:
                C7195 c7195 = (C7195) obj;
                c7195.getClass();
                C7195.m12437(c7195, "key", ((InterfaceC7184) obj3).getDescriptor());
                C7195.m12437(c7195, "value", ((InterfaceC7184) obj2).getDescriptor());
                return c5176;
            case 1:
                ((C7201) obj3).f19215.removeCallbacks((RunnableC0099) obj2);
                return c5176;
            case 2:
                C8159 c8159 = (C8159) obj;
                c8159.getClass();
                c8159.f22499 = AbstractC0455.m1141((InterfaceC6543) obj3);
                c8159.f22498 = (Throwable) obj2;
                return c5176;
            case 3:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                AbstractC8405.m13972(1293);
                ((String) obj).getClass();
                LinearLayout linearLayout = (LinearLayout) ((C8208) obj3).mo13726().findViewById(R.id.ll_dir_list);
                C8688.f24506.getClass();
                List listM14416 = C8688.m14416();
                linkedHashSet.clear();
                linearLayout.removeAllViews();
                AbstractC8721.m14429(linearLayout, listM14416, linkedHashSet);
                return c5176;
            case 4:
                List list = (List) obj3;
                C8766 c8766 = (C8766) obj;
                c8766.m14468(AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜喵呜~喵喵喵喵喵呜呜喵~喵喵喵呜呜喵喵喵"), AbstractC2442.m4582(2295, c8766, "喵喵喵喵喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜"));
                String strM13972 = AbstractC8405.m13972(2436);
                AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
                C8766 c87662 = new C8766();
                AbstractC8405.m13972(2295);
                for (C7152 c7152 : (List) obj2) {
                    String strM14462 = AbstractC8765.m14462(AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜"), c7152);
                    if (strM14462 == null) {
                        strM14462 = "";
                    }
                    c87662.m14468(c7152, strM14462);
                }
                c8766.m14468(new C7152(c87662.f24703), strM13972);
                if (!list.isEmpty()) {
                    String strM139722 = AbstractC8405.m13972(2437);
                    AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
                    C8774 c8774 = new C8774();
                    AbstractC8405.m13972(2337);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        c8774.m14470(it.next());
                    }
                    c8766.m14468(new C7157(c8774.f24718), strM139722);
                }
                return c5176;
            case 5:
                C7152 c71522 = (C7152) obj2;
                C8766 c87663 = (C8766) obj;
                c87663.m14468(AbstractC8765.m14465(((InterfaceC6551) obj3).invoke(AbstractC2905.m6339(AbstractC8405.m13972(2374), c71522), AbstractC2905.m6339(AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜"), c71522), c71522)), AbstractC2442.m4582(2295, c87663, "喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵"));
                return c5176;
            case 6:
                List list2 = (List) obj;
                list2.getClass();
                AbstractC7969.m13458((C8819) obj3, list2);
                ((ProgressBar) obj2).setVisibility(8);
                return c5176;
            case 7:
                C8240 c8240 = (C8240) obj3;
                C7828 c7828 = (C7828) obj2;
                String str = (String) obj;
                str.getClass();
                if (str.length() == 0) {
                    AbstractC8211.m13735("未配置表情存储目录", WaitDialog$TYPE.ERROR);
                } else {
                    C8198.m13707("下载中...");
                    c8240.m13764();
                    ((C5985) c7828.f21367).m11364((OnlineStickerInfo) c7828.f21366, str, new C8770(7));
                }
                return c5176;
            case 8:
                File file = (File) obj;
                file.getClass();
                ((C8240) obj3).m13764();
                C7068 c7068 = (C7068) ((C8053) obj2).f22224;
                String name = file.getName();
                name.getClass();
                c7068.invoke(name);
                return c5176;
            case 9:
                ?? r8 = (String) obj;
                AbstractC8405.m13972(1235);
                r8.getClass();
                ((Ref$ObjectRef) obj3).element = r8;
                ((CountDownLatch) obj2).countDown();
                return c5176;
            case 10:
                C8817 c8817 = (C8817) obj2;
                ((String) obj).getClass();
                CustomRecycleView customRecycleView = (CustomRecycleView) ((C1251) obj3).f3634;
                if (customRecycleView != null) {
                    customRecycleView.m4746(c8817.mo4794());
                    return c5176;
                }
                AbstractC4395.m8908("rvCommentList");
                throw null;
            default:
                String str2 = (String) obj2;
                ((Boolean) obj).getClass();
                C8198.m13707("解压中...");
                ((C9082) obj3).f25457.m11215(str2, PluginSdkConfig.getINSTALL_DIR(), new C8188(str2, 3));
                return c5176;
        }
    }
}
