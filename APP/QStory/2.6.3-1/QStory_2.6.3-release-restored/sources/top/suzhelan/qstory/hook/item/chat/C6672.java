package top.suzhelan.qstory.hook.item.chat;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.compose.material.ripple.RunnableC1945;
import androidx.fragment.app.C3191;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p045.C7149;
import p050.AbstractC7173;
import p332.C9496;
import p405.C9921;
import top.suzhelan.qstory.hook.api.C6648;
import top.suzhelan.qstory.hook.item.C6709;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "androidx/appcompat/app/飘花落叶言子世哲苏兰楪", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6672 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static long f16337;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public String f16338;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f16339;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public BitmapDrawable f16340;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C7149 f16343;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f16342 = 37327666;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f16341 = 500;

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        this.f16343 = new C7149("Repetition");
        new Thread(new RunnableC1945(this, 13)).start();
        C9921 c9921M15232 = C9921.m15232("com.tencent.mobileqq.aio.msglist.holder.component.msgfollow.AIOMsgFollowComponent");
        c9921M15232.m15234(Integer.TYPE, C9496.class, List.class);
        m12389((Method) c9921M15232.m15164(), new C3191(this, 9));
        HashMap map = C6648.f16294;
        AbstractC7173.m12433(this, new C6709(this, 2));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "传统消息居中位置 点击可设置一些复读参数";
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11806() {
        return new ViewOnClickListenerC4015(this, 6);
    }
}
