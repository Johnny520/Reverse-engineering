package p038;

import android.view.View;
import androidx.compose.runtime.internal.C1245;
import androidx.fragment.app.C2358;
import com.bumptech.glide.AbstractC3056;
import com.google.android.material.textfield.ViewOnClickListenerC3182;
import p026.AbstractC6293;
import p028.C6301;
import p032.AbstractC6318;
import p032.C6316;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6376 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String[] f17512 = {AbstractC3056.m6668(-3937563173096523175L), AbstractC3056.m6668(-3937563181686457767L), AbstractC3056.m6668(-3937562975528027559L), AbstractC3056.m6668(-3937562820909204903L), AbstractC3056.m6668(-3937562726419924391L)};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C6301 f17513 = new C6301(AbstractC3056.m6668(-3937585326537835943L));

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        C6316 c6316M11825 = C6316.m11825(AbstractC3056.m6668(-3937562558916199847L));
        c6316M11825.f17409.f3617 = AbstractC3056.m6668(-3937579786030024103L);
        String[] strArr = this.f17512;
        Class[] clsArr = new Class[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            clsArr[i] = AbstractC6318.m11838(strArr[i]);
        }
        C1245 c1245 = c6316M11825.f17409;
        c1245.f3618 = clsArr;
        c1245.f3616 = Void.TYPE;
        m11803(c6316M11825.m11827(), new C2358(this, 16));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937585167624045991L);
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11193() {
        return new ViewOnClickListenerC3182(this, 16);
    }
}
