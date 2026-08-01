package p043;

import android.view.View;
import com.bumptech.glide.AbstractC3056;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.reflect.jvm.internal.AbstractC5061;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5532;
import p331.C8799;
import p336.AbstractC8805;
import top.suzhelan.qstory.hook.api.C5815;
import top.suzhelan.qstory.hook.api.C5816;
import top.suzhelan.qstory.hook.api.C5820;
import top.suzhelan.qstory.hook.item.C5907;

/* JADX INFO: renamed from: 飘花落叶言世哲苏楪兰子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6448 extends AbstractC8805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Set f17683;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ExecutorService f17684 = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public HashMap f17685;

    public C6448() {
        AbstractC3056.m6668(-3937610718384489895L);
        AbstractC3056.m6668(-3937610731269391783L);
        this.f17685 = new HashMap();
        this.f17683 = new HashSet();
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Set setM10020 = AbstractC5061.m10020(AbstractC3056.m6668(-3937610718384489895L));
        this.f17683 = setM10020;
        if (setM10020.size() == 0) {
            this.f17683.add(AbstractC3056.m6668(-3937609266685543847L));
            this.f17683.add(AbstractC3056.m6668(-3937609313930184103L));
        }
        this.f17685 = AbstractC5061.m10023(AbstractC3056.m6668(-3937610731269391783L));
        m11940();
        C5907 c5907 = new C5907(this, 2);
        C5820 c5820 = C5816.f15946;
        AbstractC3056.m6668(-3937712899951429031L);
        AbstractC3056.m6668(-3937712629368489383L);
        C5816.f15943.add(new C5815(this, c5907));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937610632485143975L) + AbstractC5061.m10021() + AbstractC3056.m6668(-3937610718384489895L) + AbstractC3056.m6668(-3937610602420372903L);
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11193() {
        return new ViewOnClickListenerC5532(this);
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11255(C8799 c8799) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11940() {
        AbstractC5061.m10015(AbstractC3056.m6668(-3937610731269391783L), this.f17685);
        AbstractC5061.m10014(AbstractC3056.m6668(-3937610718384489895L), this.f17683);
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11257(C8799 c8799) {
        return true;
    }
}
