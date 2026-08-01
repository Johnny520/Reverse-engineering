package p321;

import android.view.View;
import androidx.activity.AbstractC0053;
import androidx.compose.material.ripple.RunnableC1107;
import com.bumptech.glide.AbstractC3056;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lin.xposed.hook.util.qq.Hook_cookie;
import lin.xposed.hook.util.qq.QQEnvTool;
import p036.AbstractC6353;
import p331.C8799;
import p336.AbstractC8805;
import p391.C9114;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C8721 extends AbstractC8805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ int f24585 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9114 f24586 = new C9114(AbstractC3056.m6668(-3937684527397471655L), 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ScheduledExecutorService f24587 = Executors.newSingleThreadScheduledExecutor();

    static {
        AbstractC3056.m6668(-3937683097173362087L);
        AbstractC3056.m6668(-3937681134373307815L);
        AbstractC3056.m6668(-3937681194502849959L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static String m14397(String str, boolean z) {
        String strM6668 = z ? AbstractC3056.m6668(-3937595638754313639L) : AbstractC3056.m6668(-3937682843770291623L);
        String str2 = AbstractC3056.m6668(-3937682822295455143L) + Hook_cookie.getG_TK(AbstractC3056.m6668(-3937656322347238823L));
        StringBuilder sbM149 = AbstractC0053.m149(AbstractC3056.m6668(-3937656275102598567L) + QQEnvTool.getCurrentUin());
        sbM149.append(AbstractC3056.m6668(-3937656210678089127L));
        sbM149.append(Hook_cookie.getSkey());
        StringBuilder sbM1492 = AbstractC0053.m149(sbM149.toString());
        sbM1492.append(AbstractC3056.m6668(-3937656245037827495L));
        sbM1492.append(Hook_cookie.getPskey(AbstractC3056.m6668(-3937656322347238823L)));
        String string = sbM1492.toString();
        HashMap map = new HashMap();
        map.put(AbstractC3056.m6668(-3937682409978594727L), AbstractC3056.m6668(-3937595638754313639L));
        map.put(AbstractC3056.m6668(-3937682345554085287L), AbstractC3056.m6668(-3937595638754313639L));
        map.put(AbstractC3056.m6668(-3937682281129575847L), AbstractC3056.m6668(-3937561979095614887L));
        map.put(AbstractC3056.m6668(-3937682165165458855L), AbstractC3056.m6668(-3937561979095614887L));
        map.put(AbstractC3056.m6668(-3937682203820164519L), AbstractC3056.m6668(-3937561979095614887L));
        map.put(AbstractC3056.m6668(-3937682100740949415L), AbstractC3056.m6668(-3937561979095614887L));
        map.put(AbstractC3056.m6668(-3937682049201341863L), AbstractC3056.m6668(-3937561979095614887L));
        map.put(AbstractC3056.m6668(-3937682066381211047L), str);
        map.put(AbstractC3056.m6668(-3937681980481865127L), AbstractC3056.m6668(-3937595638754313639L));
        map.put(AbstractC3056.m6668(-3937591713154205095L), AbstractC3056.m6668(-3937595638754313639L));
        map.put(AbstractC3056.m6668(-3937681997661734311L), strM6668);
        map.put(AbstractC3056.m6668(-3937681937532192167L), AbstractC3056.m6668(-3937561652678100391L));
        map.put(AbstractC3056.m6668(-3937681834452977063L), QQEnvTool.getCurrentUin());
        map.put(AbstractC3056.m6668(-3937681868812715431L), AbstractC3056.m6668(-3937595638754313639L));
        map.put(AbstractC3056.m6668(-3937683921807082919L), AbstractC3056.m6668(-3937681752848598439L));
        map.put(AbstractC3056.m6668(-3937681800093238695L), AbstractC3056.m6668(-3937681709898925479L) + QQEnvTool.getCurrentUin() + AbstractC3056.m6668(-3937681654064350631L));
        return AbstractC6353.m11899(str2, string, map);
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        this.f24587.scheduleWithFixedDelay(new RunnableC1107(this, 27), 0L, 5L, TimeUnit.MINUTES);
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937682946849506727L);
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11193() {
        return new ViewOnClickListenerC3182(this, 23);
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11255(C8799 c8799) {
        return true;
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11257(C8799 c8799) {
        return c8799.f24759.intValue() >= 1;
    }
}
