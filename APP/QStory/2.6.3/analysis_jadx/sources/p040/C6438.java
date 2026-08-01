package p040;

import android.view.View;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5533;
import p287.AbstractC8405;
import p332.C8785;
import p337.AbstractC8803;
import top.suzhelan.qstory.hook.api.C5816;
import top.suzhelan.qstory.hook.api.C5817;
import top.suzhelan.qstory.hook.api.C5821;
import top.suzhelan.qstory.hook.item.C5913;

/* JADX INFO: renamed from: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6438 extends AbstractC8803 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Set f17635;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ExecutorService f17636 = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public HashMap f17637;

    public C6438() {
        AbstractC8405.m13972(496);
        AbstractC8405.m13972(497);
        this.f17637 = new HashMap();
        this.f17635 = new HashSet();
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        Set setM1164 = AbstractC0455.m1164(AbstractC8405.m13972(496));
        this.f17635 = setM1164;
        if (setM1164.size() == 0) {
            this.f17635.add(AbstractC8405.m13972(509));
            this.f17635.add(AbstractC8405.m13972(510));
        }
        this.f17637 = AbstractC0455.m1162(AbstractC8405.m13972(497));
        m11978();
        C5913 c5913 = new C5913(this, 2);
        C5821 c5821 = C5817.f15946;
        AbstractC8405.m13972(1562);
        AbstractC8405.m13972(1566);
        C5817.f15943.add(new C5816(this, c5913));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(498) + AbstractC0455.m1166() + AbstractC8405.m13972(496) + AbstractC8405.m13972(499);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11247() {
        return new ViewOnClickListenerC5533(this);
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11251(C8785 c8785) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11978() {
        AbstractC0455.m1151(AbstractC8405.m13972(497), this.f17637);
        AbstractC0455.m1143(AbstractC8405.m13972(496), this.f17635);
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11252(C8785 c8785) {
        return true;
    }
}
