package p087;

import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.RunnableC0099;
import androidx.compose.runtime.internal.C1251;
import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.dialogs.WaitDialog$TYPE;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6542;
import p052.InterfaceC6550;
import p052.InterfaceC6557;
import p088.C7151;
import p088.C7156;
import p089.InterfaceC7183;
import p091.C7194;
import p093.C7200;
import p193.C7827;
import p217.AbstractC7968;
import p230.C8052;
import p249.C8158;
import p252.C8187;
import p257.AbstractC8210;
import p257.C8197;
import p257.C8207;
import p257.C8239;
import p319.AbstractC8699;
import p324.C8738;
import p325.AbstractC8757;
import p325.C8758;
import p325.C8762;
import p325.C8766;
import p341.C8816;
import p343.C8831;
import p386.C9094;
import p392.AbstractC9124;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.widget.CustomRecycleView;
import top.suzhelan.sticker.sdk.entity.OnlineStickerInfo;
import top.suzhelan.sticker.sdk.presenter.C5979;
import top.yukonga.miuix.kmp.utils.C6051;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7067 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f18973;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f18974;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18975;

    public /* synthetic */ C7067(Object obj, int i, Object obj2) {
        this.f18975 = i;
        this.f18973 = obj;
        this.f18974 = obj2;
    }

    /* JADX WARN: Type inference failed for: r9v15, types: [T, java.lang.Object, java.lang.String] */
    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f18975;
        int i2 = 8;
        C5175 c5175 = C5175.f14739;
        Object obj2 = this.f18974;
        Object obj3 = this.f18973;
        switch (i) {
            case 0:
                C7194 c7194 = (C7194) obj;
                c7194.getClass();
                C7194.m12410(c7194, "key", ((InterfaceC7183) obj3).getDescriptor());
                C7194.m12410(c7194, "value", ((InterfaceC7183) obj2).getDescriptor());
                return c5175;
            case 1:
                ((C7200) obj3).f19220.removeCallbacks((RunnableC0099) obj2);
                return c5175;
            case 2:
                C8158 c8158 = (C8158) obj;
                c8158.getClass();
                c8158.f22501 = AbstractC9124.m14659((InterfaceC6542) obj3);
                c8158.f22500 = (Throwable) obj2;
                return c5175;
            case 3:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                AbstractC3056.m6668(-3937690725035279783L);
                ((String) obj).getClass();
                LinearLayout linearLayout = (LinearLayout) ((C8207) obj3).mo13709().findViewById(R.id.ll_dir_list);
                C8738.f24639.getClass();
                List listM14411 = C8738.m14411();
                linkedHashSet.clear();
                linearLayout.removeAllViews();
                AbstractC8699.m14381(linearLayout, listM14411, linkedHashSet);
                return c5175;
            case 4:
                List list = (List) obj3;
                C8758 c8758 = (C8758) obj;
                c8758.m14434(AbstractC3056.m6668(-3937817027138553255L), AbstractC2442.m4573(-3937791360413992359L, c8758, -3937627417217336743L));
                c8758.m14434(AbstractC8757.m14433(new C6051((List) obj2, i2)), AbstractC3056.m6668(-3937800014773093799L));
                if (!list.isEmpty()) {
                    String strM6668 = AbstractC3056.m6668(-3937800062017734055L);
                    AbstractC3056.m6668(-3937811065723946407L);
                    C8766 c8766 = new C8766();
                    AbstractC3056.m6668(-3937805782914172327L);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        c8766.m14436(it.next());
                    }
                    c8758.m14434(new C7156(c8766.f24693), strM6668);
                }
                return c5175;
            case 5:
                C7151 c7151 = (C7151) obj2;
                C8758 c87582 = (C8758) obj;
                c87582.m14434(AbstractC8757.m14431(((InterfaceC6550) obj3).invoke(AbstractC3056.m6713(c7151, AbstractC3056.m6668(-3937803510876472743L)), AbstractC3056.m6713(c7151, AbstractC3056.m6668(-3937803416387192231L)), c7151)), AbstractC2442.m4573(-3937791360413992359L, c87582, -3937685966211515815L));
                return c5175;
            case 6:
                List list2 = (List) obj;
                list2.getClass();
                AbstractC7968.m13430((C8816) obj3, list2);
                ((ProgressBar) obj2).setVisibility(8);
                return c5175;
            case 7:
                C8239 c8239 = (C8239) obj3;
                C7827 c7827 = (C7827) obj2;
                String str = (String) obj;
                str.getClass();
                if (str.length() == 0) {
                    AbstractC8210.m13718("未配置表情存储目录", WaitDialog$TYPE.ERROR);
                } else {
                    C8197.m13690("下载中...");
                    c8239.m13747();
                    ((C5979) c7827.f21370).m11304((OnlineStickerInfo) c7827.f21369, str, new C8762(7));
                }
                return c5175;
            case 8:
                File file = (File) obj;
                file.getClass();
                ((C8239) obj3).m13747();
                C7067 c7067 = (C7067) ((C8052) obj2).f22226;
                String name = file.getName();
                name.getClass();
                c7067.invoke(name);
                return c5175;
            case 9:
                ?? r9 = (String) obj;
                AbstractC3056.m6668(-3937677419226596775L);
                r9.getClass();
                ((Ref$ObjectRef) obj3).element = r9;
                ((CountDownLatch) obj2).countDown();
                return c5175;
            case 10:
                C8831 c8831 = (C8831) obj2;
                ((String) obj).getClass();
                CustomRecycleView customRecycleView = (CustomRecycleView) ((C1251) obj3).f3633;
                if (customRecycleView != null) {
                    customRecycleView.m4736(c8831.mo4784());
                    return c5175;
                }
                AbstractC4394.m8918("rvCommentList");
                throw null;
            default:
                String str2 = (String) obj2;
                ((Boolean) obj).getClass();
                C8197.m13690("解压中...");
                ((C9094) obj3).f25406.m11158(str2, PluginSdkConfig.getINSTALL_DIR(), new C8187(str2, 3));
                return c5175;
        }
    }
}
