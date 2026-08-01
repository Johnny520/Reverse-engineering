package top.suzhelan.qstory.hook.item.chat;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.C3191;
import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.AbstractC3887;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import lin.xposed.hook.util.p011qq.QQAIOTool;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p050.AbstractC7173;
import p303.AbstractC9234;
import p400.C9857;
import p400.C9860;
import p405.C9921;
import p407.C9924;
import top.suzhelan.qstory.hook.api.C6648;
import top.suzhelan.qstory.hook.item.C6709;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6670 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f16335 = 2720642;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C9924 f16336 = new C9924(AbstractC9234.m14531(2181), 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final LinkedHashMap f16332 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final LinkedHashMap f16331 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final ArrayList f16333 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ArrayList f16334 = new ArrayList();

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        String strM14531 = AbstractC9234.m14531(2183);
        C9924 c9924 = this.f16336;
        ArrayList arrayListM15239 = c9924.m15239(C9860.class, strM14531);
        ArrayList<C9860> arrayList = this.f16333;
        arrayList.addAll(arrayListM15239);
        ArrayList arrayListM152392 = c9924.m15239(C9857.class, AbstractC9234.m14531(2184));
        ArrayList<C9857> arrayList2 = this.f16334;
        arrayList2.addAll(arrayListM152392);
        for (C9860 c9860 : arrayList) {
            this.f16332.put(c9860.f25658 + c9860.f25657, c9860);
        }
        for (C9857 c9857 : arrayList2) {
            this.f16331.put(c9857.f25655 + c9857.f25653, c9857);
        }
        C6686 c6686 = new C6686(this, 0);
        AbstractC9234.m14531(1411);
        AbstractC3887.f10103 = c6686;
        C9921 c9921M15232 = C9921.m15232(AbstractC9234.m14531(1556));
        c9921M15232.m15234(String.class, byte[].class, AbstractC7166.m12425(AbstractC9234.m14531(1557)));
        c9921M15232.f25826 = AbstractC9234.m14531(1558);
        m12390((Method) c9921M15232.m15164(), new C3191(this, 7));
        HashMap map = C6648.f16294;
        AbstractC7173.m12433(this, new C6709(this, 1));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(2182);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11812(ViewGroup viewGroup, String str) {
        Context context = viewGroup.getContext();
        int id = viewGroup.getId();
        int contentId = QQAIOTool.getContentId(viewGroup);
        Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(1912));
        Class cls = Integer.TYPE;
        cls.getClass();
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) AbstractC3738.m6845(new Object[]{-2, -2}, new Class[]{cls, cls}, clsM12425);
        AbstractC7165.m12424(layoutParams, AbstractC9234.m14531(1914), Integer.valueOf(id));
        AbstractC7165.m12424(layoutParams, AbstractC9234.m14531(1915), Integer.valueOf(id));
        AbstractC7165.m12424(layoutParams, AbstractC9234.m14531(1916), Integer.valueOf(contentId));
        TextView textView = new TextView(context);
        textView.setText(AbstractC9234.m14531(2185) + str + AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜喵喵呜呜呜~呜呜喵呜呜呜呜喵~呜喵喵喵呜呜喵呜~呜呜呜呜呜呜呜喵~呜呜呜呜喵喵呜喵"));
        textView.setId(this.f16335);
        textView.setGravity(17);
        textView.setTextSize(14.0f);
        textView.setTextColor(context.getColor(C0328R.color.QQ__res_0x24060001));
        textView.setClickable(false);
        viewGroup.addView(textView, layoutParams);
    }
}
