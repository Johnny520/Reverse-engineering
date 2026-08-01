package p039;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import androidx.compose.runtime.internal.C1245;
import androidx.fragment.app.C2358;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Method;
import java.util.List;
import lin.xposed.hook.view.main.itemview.C5565;
import p010.AbstractC6185;
import p026.AbstractC6311;
import p033.AbstractC6337;
import p033.C6335;
import p036.AbstractC6358;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.chat.C5856;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6430 extends AbstractC6311 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m11977(String str) {
        ((ClipboardManager) AbstractC6358.f17507.getSystemService(AbstractC8405.m13972(46))).setPrimaryClip(ClipData.newPlainText(AbstractC8405.m13973("喵喵呜喵喵喵呜喵~喵喵呜喵喵呜呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵呜"), str));
        AbstractC6185.m11592(AbstractC8405.m13972(166) + str);
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        Method methodM11855;
        if (AbstractC3056.m6696()) {
            C5856 c5856 = new C5856(this, 6);
            int i = AbstractC6358.f17508;
            if (i >= 6458) {
                if (i > 5028) {
                    C6335 c6335M11853 = C6335.m11853(AbstractC8405.m13972(158));
                    String strM13973 = AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵喵");
                    C1245 c1245 = c6335M11853.f17458;
                    c1245.f3618 = strM13973;
                    c1245.f3619 = new Class[]{Object.class, View.class};
                    methodM11855 = c6335M11853.m11855();
                } else {
                    C6335 c6335M118532 = C6335.m11853(AbstractC8405.m13972(159));
                    String strM139732 = AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜喵喵呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵喵喵喵呜喵~喵喵喵呜喵呜喵喵");
                    C1245 c12452 = c6335M118532.f17458;
                    c12452.f3618 = strM139732;
                    c12452.f3619 = new Class[]{Object.class};
                    methodM11855 = c6335M118532.m11855();
                }
                m11831(methodM11855, new C2358(c5856, 13));
                return;
            }
            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(160));
            String[] strArr = {AbstractC8405.m13972(161), AbstractC8405.m13972(162)};
            Class clsM118662 = AbstractC6337.m11866(AbstractC8405.m13972(163));
            C6335 c6335M11854 = C6335.m11854(clsM118662);
            c6335M11854.f17458.f3617 = clsM11866;
            Method methodM118552 = c6335M11854.m11855();
            C6335 c6335M118542 = C6335.m11854(clsM118662);
            c6335M118542.f17458.f3617 = List.class;
            Method methodM118553 = c6335M118542.m11855();
            for (int i2 = 0; i2 < 2; i2++) {
                C6335 c6335M118533 = C6335.m11853(strArr[i2]);
                String name = methodM118553.getName();
                C1245 c12453 = c6335M118533.f17458;
                c12453.f3618 = name;
                c12453.f3617 = List.class;
                ((C6430) c5856.f16014).m11830(c6335M118533.m11855(), new C5565(c5856, methodM118552, clsM11866, 5));
            }
        }
    }
}
