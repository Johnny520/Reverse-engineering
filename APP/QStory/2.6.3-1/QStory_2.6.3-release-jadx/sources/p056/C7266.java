package p056;

import android.view.View;
import androidx.compose.runtime.internal.C2080;
import androidx.fragment.app.C3191;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import p042.AbstractC7140;
import p045.C7149;
import p049.AbstractC7166;
import p049.C7164;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7266 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String[] f17978 = {AbstractC9234.m14532("喵喵呜呜呜喵喵呜"), AbstractC9234.m14531(133), AbstractC9234.m14531(134), AbstractC9234.m14531(135), AbstractC9234.m14531(136)};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C7149 f17979;

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        this.f17979 = new C7149(AbstractC9234.m14531(514));
        C7164 c7164M12412 = C7164.m12412(AbstractC9234.m14531(137));
        c7164M12412.f17803.f3963 = AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵呜喵呜喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜呜喵");
        String[] strArr = this.f17978;
        Class[] clsArr = new Class[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            clsArr[i] = AbstractC7166.m12425(strArr[i]);
        }
        C2080 c2080 = c7164M12412.f17803;
        c2080.f3964 = clsArr;
        c2080.f3962 = Void.TYPE;
        m12390(c7164M12412.m12414(), new C3191(this, 19));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(515);
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11806() {
        return new ViewOnClickListenerC4015(this, 18);
    }
}
