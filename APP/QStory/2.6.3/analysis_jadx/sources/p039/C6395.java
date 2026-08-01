package p039;

import android.view.View;
import androidx.compose.runtime.internal.C1245;
import androidx.fragment.app.C2358;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import p026.AbstractC6311;
import p029.C6320;
import p033.AbstractC6337;
import p033.C6335;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6395 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String[] f17558 = {AbstractC8405.m13973("喵喵呜呜呜喵喵呜"), AbstractC8405.m13972(133), AbstractC8405.m13972(134), AbstractC8405.m13972(135), AbstractC8405.m13972(136)};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6320 f17559 = new C6320(AbstractC8405.m13972(245));

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        C6335 c6335M11853 = C6335.m11853(AbstractC8405.m13972(137));
        c6335M11853.f17458.f3618 = AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵呜喵呜喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜呜喵");
        String[] strArr = this.f17558;
        Class[] clsArr = new Class[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            clsArr[i] = AbstractC6337.m11866(strArr[i]);
        }
        C1245 c1245 = c6335M11853.f17458;
        c1245.f3619 = clsArr;
        c1245.f3617 = Void.TYPE;
        m11831(c6335M11853.m11855(), new C2358(this, 16));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(246);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11247() {
        return new ViewOnClickListenerC3183(this, 17);
    }
}
