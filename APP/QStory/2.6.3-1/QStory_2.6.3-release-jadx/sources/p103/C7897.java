package p103;

import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.RunnableC0946;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.runtime.internal.C2086;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3738;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.C6008;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7387;
import p104.C7981;
import p104.C7986;
import p105.InterfaceC8013;
import p107.C8024;
import p109.C8030;
import p209.C8657;
import p233.AbstractC8798;
import p246.C8882;
import p265.C8988;
import p268.C9017;
import p273.AbstractC9040;
import p273.C9027;
import p273.C9037;
import p273.C9069;
import p303.AbstractC9234;
import p337.C9517;
import p339.AbstractC9550;
import p345.AbstractC9594;
import p345.C9595;
import p345.C9599;
import p345.C9603;
import p358.C9646;
import p359.C9648;
import p404.C9911;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.widget.CustomRecycleView;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;
import top.suzhelan.sticker.sdk.presenter.C6815;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7897 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f19313;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f19314;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f19315;

    public /* synthetic */ C7897(Object obj, int i, Object obj2) {
        this.f19315 = i;
        this.f19313 = obj;
        this.f19314 = obj2;
    }

    /* JADX WARN: Type inference failed for: r8v15, types: [T, java.lang.Object, java.lang.String] */
    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f19315;
        C6008 c6008 = C6008.f15084;
        Object obj2 = this.f19314;
        Object obj3 = this.f19313;
        switch (i) {
            case 0:
                C8024 c8024 = (C8024) obj;
                c8024.getClass();
                C8024.m12996(c8024, "key", ((InterfaceC8013) obj3).getDescriptor());
                C8024.m12996(c8024, "value", ((InterfaceC8013) obj2).getDescriptor());
                return c6008;
            case 1:
                ((C8030) obj3).f19560.removeCallbacks((RunnableC0946) obj2);
                return c6008;
            case 2:
                C8988 c8988 = (C8988) obj;
                c8988.getClass();
                c8988.f22844 = AbstractC1298.m1701((InterfaceC7372) obj3);
                c8988.f22843 = (Throwable) obj2;
                return c6008;
            case 3:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                AbstractC9234.m14531(1293);
                ((String) obj).getClass();
                LinearLayout linearLayout = (LinearLayout) ((C9037) obj3).mo14285().findViewById(C0328R.id.ll_dir_list);
                C9517.f24851.getClass();
                List listM14975 = C9517.m14975();
                linkedHashSet.clear();
                linearLayout.removeAllViews();
                AbstractC9550.m14988(linearLayout, listM14975, linkedHashSet);
                return c6008;
            case 4:
                List list = (List) obj3;
                C9595 c9595 = (C9595) obj;
                c9595.m15027(AbstractC9234.m14532("喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜喵呜~喵喵喵喵喵呜呜喵~喵喵喵呜呜喵喵喵"), AbstractC3275.m5142(2295, c9595, "喵喵喵喵喵呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜呜喵呜"));
                String strM14531 = AbstractC9234.m14531(2436);
                AbstractC9234.m14532("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
                C9595 c95952 = new C9595();
                AbstractC9234.m14531(2295);
                for (C7981 c7981 : (List) obj2) {
                    String strM15021 = AbstractC9594.m15021(AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜"), c7981);
                    if (strM15021 == null) {
                        strM15021 = "";
                    }
                    c95952.m15027(c7981, strM15021);
                }
                c9595.m15027(new C7981(c95952.f25048), strM14531);
                if (!list.isEmpty()) {
                    String strM145312 = AbstractC9234.m14531(2437);
                    AbstractC9234.m14532("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
                    C9603 c9603 = new C9603();
                    AbstractC9234.m14531(2337);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        c9603.m15029(it.next());
                    }
                    c9595.m15027(new C7986(c9603.f25063), strM145312);
                }
                return c6008;
            case 5:
                C7981 c79812 = (C7981) obj2;
                C9595 c95953 = (C9595) obj;
                c95953.m15027(AbstractC9594.m15024(((InterfaceC7380) obj3).invoke(AbstractC3738.m6899(AbstractC9234.m14531(2374), c79812), AbstractC3738.m6899(AbstractC9234.m14532("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜"), c79812), c79812)), AbstractC3275.m5142(2295, c95953, "喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵"));
                return c6008;
            case 6:
                List list2 = (List) obj;
                list2.getClass();
                AbstractC8798.m14017((C9648) obj3, list2);
                ((ProgressBar) obj2).setVisibility(8);
                return c6008;
            case 7:
                C9069 c9069 = (C9069) obj3;
                C8657 c8657 = (C8657) obj2;
                String str = (String) obj;
                str.getClass();
                if (str.length() == 0) {
                    AbstractC9040.m14294("未配置表情存储目录", WaitDialog$TYPE.ERROR);
                } else {
                    C9027.m14266("下载中...");
                    c9069.m14323();
                    ((C6815) c8657.f21712).m11923((OnlineStickerInfo) c8657.f21711, str, new C9599(7));
                }
                return c6008;
            case 8:
                File file = (File) obj;
                file.getClass();
                ((C9069) obj3).m14323();
                C7897 c7897 = (C7897) ((C8882) obj2).f22569;
                String name = file.getName();
                name.getClass();
                c7897.invoke(name);
                return c6008;
            case 9:
                ?? r8 = (String) obj;
                AbstractC9234.m14531(1235);
                r8.getClass();
                ((Ref$ObjectRef) obj3).element = r8;
                ((CountDownLatch) obj2).countDown();
                return c6008;
            case 10:
                C9646 c9646 = (C9646) obj2;
                ((String) obj).getClass();
                CustomRecycleView customRecycleView = (CustomRecycleView) ((C2086) obj3).f3979;
                if (customRecycleView != null) {
                    customRecycleView.m5306(c9646.mo5354());
                    return c6008;
                }
                AbstractC5227.m9467("rvCommentList");
                throw null;
            default:
                String str2 = (String) obj2;
                ((Boolean) obj).getClass();
                C9027.m14266("解压中...");
                ((C9911) obj3).f25802.m11774(str2, PluginSdkConfig.getINSTALL_DIR(), new C9017(str2, 3));
                return c6008;
        }
    }
}
