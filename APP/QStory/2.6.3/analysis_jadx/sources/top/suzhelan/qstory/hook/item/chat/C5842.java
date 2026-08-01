package top.suzhelan.qstory.hook.item.chat;

import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.compose.material.ripple.RunnableC1107;
import androidx.fragment.app.C2358;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p029.C6320;
import p034.AbstractC6344;
import p287.AbstractC8405;
import p316.C8667;
import p389.C9092;
import top.suzhelan.qstory.hook.api.C5818;
import top.suzhelan.qstory.hook.item.C5879;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "androidx/appcompat/app/飘花落叶言子世哲苏兰楪", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5842 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static long f15992;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public String f15993;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f15994;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public BitmapDrawable f15995;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C6320 f15998;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f15997 = 37327666;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f15996 = 500;

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        this.f15998 = new C6320(AbstractC8405.m13972(2212));
        new Thread(new RunnableC1107(this, 13)).start();
        C9092 c9092M14673 = C9092.m14673(AbstractC8405.m13972(2213));
        c9092M14673.m14675(Integer.TYPE, C8667.class, List.class);
        m11830((Method) c9092M14673.m14605(), new C2358(this, 9));
        HashMap map = C5818.f15949;
        AbstractC6344.m11874(this, new C5879(this, 2));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(2211);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11247() {
        return new ViewOnClickListenerC3183(this, 6);
    }
}
