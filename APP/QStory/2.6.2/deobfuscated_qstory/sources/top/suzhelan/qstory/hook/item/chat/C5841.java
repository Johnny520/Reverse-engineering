package top.suzhelan.qstory.hook.item.chat;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.compose.material.ripple.RunnableC1107;
import androidx.fragment.app.C2358;
import com.bumptech.glide.AbstractC3056;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p028.C6301;
import p038.C6411;
import p316.C8675;
import p392.AbstractC9124;
import p392.C9125;
import top.suzhelan.qstory.hook.api.C5817;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏楪哲兰;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "androidx/appcompat/app/飘花落叶言子世哲苏兰楪", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5841 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static long f15994;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public String f15995;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f15996;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public BitmapDrawable f15997;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C6301 f16000;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f15999 = 37327666;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f15998 = 500;

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        this.f16000 = new C6301("Repetition");
        new Thread(new RunnableC1107(this, 13)).start();
        C9125 c9125M14681 = C9125.m14681("com.tencent.mobileqq.aio.msglist.holder.component.msgfollow.AIOMsgFollowComponent");
        c9125M14681.m14683(Integer.TYPE, AbstractC9124.class, List.class);
        m11802((Method) c9125M14681.m14686(), new C2358(this, 8));
        HashMap map = C5817.f15949;
        C8675.m14351(this, new C6411(this, 3));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u4f20\u7edf\u6d88\u606f\u5c45\u4e2d\u4f4d\u7f6e \u70b9\u51fb\u53ef\u8bbe\u7f6e\u4e00\u4e9b\u590d\u8bfb\u53c2\u6570";
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11193() {
        return new ViewOnClickListenerC3182(this, 6);
    }
}
