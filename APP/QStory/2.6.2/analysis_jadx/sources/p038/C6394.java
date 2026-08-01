package p038;

import androidx.compose.runtime.internal.C1245;
import bsh.C2632;
import com.bumptech.glide.AbstractC3056;
import com.google.gson.internal.C3223;
import java.lang.reflect.Method;
import p022.C6267;
import p026.AbstractC6293;
import p032.AbstractC6314;
import p032.AbstractC6318;
import p032.C6316;
import p053.AbstractC6560;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6394 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        Method methodM11827;
        boolean zM12011 = AbstractC6560.m12011();
        Class cls = Boolean.TYPE;
        Class cls2 = Void.TYPE;
        if (!zM12011) {
            m11803(AbstractC6314.m11822(AbstractC3056.m6668(-3937566175278663079L), AbstractC3056.m6668(-3937566072199447975L), cls2, new Class[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937565891810821543L)), cls, cls}), new C6267(5));
            return;
        }
        Class<?> clsLoadClass = classLoader.loadClass(AbstractC3056.m6668(-3937567098696631719L));
        Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937566896833168807L));
        Class clsM118382 = AbstractC6318.m11838(AbstractC3056.m6668(-3937566737919378855L));
        Class clsM118383 = AbstractC6318.m11838(AbstractC3056.m6668(-3937566458746504615L));
        C6316 c6316M11826 = C6316.m11826(clsLoadClass);
        C1245 c1245 = c6316M11826.f17409;
        c1245.f3616 = cls2;
        c1245.f3618 = new Class[]{clsM11838, Object.class, clsM118382};
        Method methodM118272 = null;
        try {
            methodM11827 = c6316M11826.m11827();
        } catch (Exception unused) {
            methodM11827 = null;
        }
        if (methodM11827 == null) {
            C6316 c6316M118262 = C6316.m11826(clsLoadClass);
            C1245 c12452 = c6316M118262.f17409;
            c12452.f3616 = cls2;
            c12452.f3618 = new Class[]{clsM11838, Object.class, clsM118382, clsM118383};
            try {
                methodM11827 = c6316M118262.m11827();
            } catch (Exception unused2) {
                methodM11827 = null;
            }
        }
        if (methodM11827 == null) {
            C6316 c6316M118263 = C6316.m11826(clsLoadClass);
            C1245 c12453 = c6316M118263.f17409;
            c12453.f3616 = cls2;
            c12453.f3618 = new Class[]{clsM11838, Object.class, clsM118382, clsM118383, cls};
            try {
                methodM11827 = c6316M118263.m11827();
            } catch (Exception unused3) {
                methodM11827 = null;
            }
        }
        if (methodM11827 == null) {
            C6316 c6316M118264 = C6316.m11826(clsLoadClass);
            C1245 c12454 = c6316M118264.f17409;
            c12454.f3616 = cls2;
            c12454.f3618 = new Class[]{clsM11838, clsM118383, clsM118382, cls};
            try {
                methodM118272 = c6316M118264.m11827();
            } catch (Exception unused4) {
            }
            methodM11827 = methodM118272;
        }
        if (methodM11827 != null) {
            m11803(methodM11827, new C3223(this, clsM118383));
        } else {
            C2632.m5294(AbstractC3056.m6668(-3937566295537747367L));
        }
    }
}
