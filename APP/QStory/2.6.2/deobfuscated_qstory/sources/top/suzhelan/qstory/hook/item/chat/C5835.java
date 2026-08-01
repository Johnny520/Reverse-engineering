package top.suzhelan.qstory.hook.item.chat;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.C2358;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3064;
import com.davemorrissey.labs.subscaleview.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import lin.xposed.hook.util.qq.QQAIOTool;
import net.bytebuddy.description.method.MethodDescription;
import p000.AbstractC6087;
import p007.AbstractC6136;
import p026.AbstractC6293;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p038.C6411;
import p316.C8675;
import p383.C9022;
import p383.C9025;
import p391.C9114;
import p392.C9125;
import top.suzhelan.qstory.hook.api.C5817;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪苏哲兰;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5835 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f15979 = 2720642;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C9114 f15980 = new C9114("\u9632\u64a4\u56de\u6570\u636e\u5e93", 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final LinkedHashMap f15976 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final LinkedHashMap f15975 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final ArrayList f15977 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final ArrayList f15978 = new ArrayList();

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        String strM6668 = "friendCache";
        C9114 c9114 = this.f15980;
        ArrayList arrayListM14643 = c9114.m14643(C9025.class, strM6668);
        ArrayList<C9025> arrayList = this.f15977;
        arrayList.addAll(arrayListM14643);
        ArrayList arrayListM146432 = c9114.m14643(C9022.class, "groupCache");
        ArrayList<C9022> arrayList2 = this.f15978;
        arrayList2.addAll(arrayListM146432);
        for (C9025 c9025 : arrayList) {
            this.f15976.put(c9025.f25320 + c9025.f25319, c9025);
        }
        for (C9022 c9022 : arrayList2) {
            this.f15975.put(c9022.f25317 + c9022.f25315, c9022);
        }
        C5851 c5851 = new C5851(this, 0);
        "callback";
        AbstractC3064.f9794 = c5851;
        C9125 c9125M14681 = C9125.m14681("com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession$CppProxy");
        c9125M14681.m14683(String.class, byte[].class, AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.PushExtraInfo"));
        c9125M14681.f25504 = "onMsfPush";
        m11803((Method) c9125M14681.m14686(), new C2358(this, 7));
        HashMap map = C5817.f15949;
        C8675.m14351(this, new C6411(this, 2));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u9002\u914dQQNT";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11188(ViewGroup viewGroup, String str) {
        Context context = viewGroup.getContext();
        int id = viewGroup.getId();
        int contentId = QQAIOTool.getContentId(viewGroup);
        Class clsM11838 = AbstractC6318.m11838("androidx.constraintlayout.widget.ConstraintLayout$LayoutParams");
        Class cls = Integer.TYPE;
        cls.getClass();
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) AbstractC6087.m11389(new Object[]{-2, -2}, new Class[]{cls, cls}, clsM11838);
        AbstractC6317.m11837(layoutParams, "startToStart", Integer.valueOf(id));
        AbstractC6317.m11837(layoutParams, "endToEnd", Integer.valueOf(id));
        AbstractC6317.m11837(layoutParams, "topToTop", Integer.valueOf(contentId));
        TextView textView = new TextView(context);
        StringBuilder sb = new StringBuilder();
        AbstractC6136.m11544(-3937785076876838311L, sb, str);
        sb.append("\u64a4\u56de");
        textView.setText(sb.toString());
        textView.setId(this.f15979);
        textView.setGravity(17);
        textView.setTextSize(14.0f);
        textView.setTextColor(context.getColor(R.color.QQ__res_0x24060001));
        textView.setClickable(false);
        viewGroup.addView(textView, layoutParams);
    }
}
