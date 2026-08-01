package p339;

import android.view.View;
import com.bumptech.glide.AbstractC3898;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.BaseDialog$BOOLEAN;
import com.kongzue.dialogx.interfaces.InterfaceC4582;
import java.io.File;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.reflect.jvm.internal.impl.types.C5707;
import p273.C9037;
import p273.C9041;
import p273.C9069;
import p273.RunnableC9044;
import p337.C9517;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9559 implements InterfaceC4582 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ Object f24956;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f24957;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Serializable f24958;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24959;

    public /* synthetic */ C9559(int i, Serializable serializable, Object obj, Object obj2) {
        this.f24959 = i;
        this.f24958 = serializable;
        this.f24957 = obj;
        this.f24956 = obj2;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4582
    public final boolean onClick(AbstractC4570 abstractC4570, View view) {
        int i = this.f24959;
        Object obj = this.f24956;
        Object obj2 = this.f24957;
        Serializable serializable = this.f24958;
        switch (i) {
            case 0:
                C9517.f24851.getClass();
                AbstractC5894.m10611(new File(C9517.m14969(), (String) serializable));
                ((C9069) obj2).m14323();
                C9041.m14296("删除成功").m14299();
                ((C9539) obj).invoke();
                return false;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) serializable;
                C5707 c5707 = (C5707) obj2;
                Map map = (Map) obj;
                C9037 c9037 = (C9037) abstractC4570;
                if (linkedHashSet.isEmpty()) {
                    C9041.m14296("请选择至少一个保存目录").m14300();
                } else {
                    if (c5707.f14524.get() <= 0) {
                        AtomicInteger atomicInteger = new AtomicInteger(0);
                        for (String str : map.keySet()) {
                            "md5";
                            str.getClass();
                            String str2 = (String) c5707.f14523.get(str);
                            if (str2 == null || str2.length() == 0) {
                                atomicInteger.incrementAndGet();
                            } else {
                                List<String> listM9356 = AbstractC5176.m9356(linkedHashSet);
                                File file = new File(str2);
                                String strM7414 = AbstractC3898.m7414(str2);
                                String name = file.getName();
                                "getName(...)";
                                name.getClass();
                                Locale locale = Locale.getDefault();
                                "getDefault(...)";
                                locale.getClass();
                                String upperCase = name.toUpperCase(locale);
                                "toUpperCase(...)";
                                upperCase.getClass();
                                String strConcat = upperCase.concat(strM7414);
                                for (String str3 : listM9356) {
                                    StringBuilder sb = new StringBuilder();
                                    C9517.f24851.getClass();
                                    sb.append(C9517.m14969());
                                    sb.append('/');
                                    sb.append(str3);
                                    sb.append('/');
                                    sb.append(strConcat);
                                    AbstractC5894.m10609(str2, sb.toString());
                                }
                            }
                        }
                        if (atomicInteger.get() > 0) {
                            C9041.m14296(atomicInteger.get() + " 张图片保存失败").m14300();
                        } else {
                            C9041.m14296("已保存到 " + linkedHashSet.size() + " 个文件夹").m14299();
                        }
                        c9037.m14289();
                        return false;
                    }
                    C9041 c9041M14296 = C9041.m14296("图片还没加载请稍后");
                    c9041M14296.f22995 = BaseDialog$BOOLEAN.FALSE;
                    if (c9041M14296.f22998 != null) {
                        AbstractC4570.m8589(new RunnableC9044(c9041M14296, 0));
                    }
                    c9041M14296.f11928.mo10453();
                    c9041M14296.f23002 = C0328R.mipmap.ico_dialogx_warning;
                    if (c9041M14296.f22998 != null) {
                        AbstractC4570.m8589(new RunnableC9044(c9041M14296, 0));
                    }
                }
                return true;
        }
    }
}
