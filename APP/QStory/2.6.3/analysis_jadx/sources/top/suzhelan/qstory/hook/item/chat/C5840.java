package top.suzhelan.qstory.hook.item.chat;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.C2358;
import com.alibaba.fastjson2.AbstractC2905;
import com.bumptech.glide.AbstractC3055;
import com.davemorrissey.labs.subscaleview.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import lin.xposed.hook.util.qq.QQAIOTool;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p034.AbstractC6344;
import p287.AbstractC8405;
import p384.C9028;
import p384.C9031;
import p389.C9092;
import p391.C9095;
import top.suzhelan.qstory.hook.api.C5818;
import top.suzhelan.qstory.hook.item.C5879;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5840 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f15990 = 2720642;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C9095 f15991 = new C9095(AbstractC8405.m13972(2181), 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final LinkedHashMap f15987 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final LinkedHashMap f15986 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final ArrayList f15988 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ArrayList f15989 = new ArrayList();

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        String strM13972 = AbstractC8405.m13972(2183);
        C9095 c9095 = this.f15991;
        ArrayList arrayListM14680 = c9095.m14680(C9031.class, strM13972);
        ArrayList<C9031> arrayList = this.f15988;
        arrayList.addAll(arrayListM14680);
        ArrayList arrayListM146802 = c9095.m14680(C9028.class, AbstractC8405.m13972(2184));
        ArrayList<C9028> arrayList2 = this.f15989;
        arrayList2.addAll(arrayListM146802);
        for (C9031 c9031 : arrayList) {
            this.f15987.put(c9031.f25313 + c9031.f25312, c9031);
        }
        for (C9028 c9028 : arrayList2) {
            this.f15986.put(c9028.f25310 + c9028.f25308, c9028);
        }
        C5856 c5856 = new C5856(this, 0);
        AbstractC8405.m13972(1411);
        AbstractC3055.f9758 = c5856;
        C9092 c9092M14673 = C9092.m14673(AbstractC8405.m13972(1556));
        c9092M14673.m14675(String.class, byte[].class, AbstractC6337.m11866(AbstractC8405.m13972(1557)));
        c9092M14673.f25481 = AbstractC8405.m13972(1558);
        m11831((Method) c9092M14673.m14605(), new C2358(this, 7));
        HashMap map = C5818.f15949;
        AbstractC6344.m11874(this, new C5879(this, 1));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(2182);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11253(ViewGroup viewGroup, String str) {
        Context context = viewGroup.getContext();
        int id = viewGroup.getId();
        int contentId = QQAIOTool.getContentId(viewGroup);
        Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(1912));
        Class cls = Integer.TYPE;
        cls.getClass();
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) AbstractC2905.m6285(new Object[]{-2, -2}, new Class[]{cls, cls}, clsM11866);
        AbstractC6336.m11865(layoutParams, AbstractC8405.m13972(1914), Integer.valueOf(id));
        AbstractC6336.m11865(layoutParams, AbstractC8405.m13972(1915), Integer.valueOf(id));
        AbstractC6336.m11865(layoutParams, AbstractC8405.m13972(1916), Integer.valueOf(contentId));
        TextView textView = new TextView(context);
        textView.setText(AbstractC8405.m13972(2185) + str + AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵喵呜呜呜~呜呜喵呜呜呜呜喵~呜喵喵喵呜呜喵呜~呜呜呜呜呜呜呜喵~呜呜呜呜喵喵呜喵"));
        textView.setId(this.f15990);
        textView.setGravity(17);
        textView.setTextSize(14.0f);
        textView.setTextColor(context.getColor(R.color.QQ__res_0x24060001));
        textView.setClickable(false);
        viewGroup.addView(textView, layoutParams);
    }
}
