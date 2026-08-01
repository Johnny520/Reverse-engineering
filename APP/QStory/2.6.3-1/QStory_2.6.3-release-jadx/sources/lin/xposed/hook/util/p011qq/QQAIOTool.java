package lin.xposed.hook.util.p011qq;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import top.suzhelan.qstory.hook.api.C6643;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class QQAIOTool {
    private static int contentId;
    private static int contentViewId;

    private static LinearLayout findContentView(ViewGroup viewGroup) {
        return (LinearLayout) viewGroup.findViewById(C6643.f16281);
    }

    public static int getContentId(ViewGroup viewGroup) {
        int i = contentViewId;
        if (i != 0) {
            return i;
        }
        try {
            int id = findContentView(viewGroup).getId();
            contentViewId = id;
            return id;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static ViewGroup getContentView(ViewGroup viewGroup) {
        return (ViewGroup) viewGroup.findViewById(getContentId(viewGroup));
    }

    public static boolean hasContentMessage(ViewGroup viewGroup) {
        return viewGroup.getChildCount() >= 5;
    }
}
