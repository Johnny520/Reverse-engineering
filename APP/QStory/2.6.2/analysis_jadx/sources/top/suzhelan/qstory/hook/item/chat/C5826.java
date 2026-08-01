package top.suzhelan.qstory.hook.item.chat;

import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p392.C9125;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲楪兰苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5826 extends AbstractC6293 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static boolean m11182(char c) {
        if ('A' <= c && c < '[') {
            return true;
        }
        if ('a' > c || c >= '{') {
            return '0' <= c && c < ':';
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m11183(char c) {
        return c >= 0 && c < 'z' && !m11182(c);
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        C9125 c9125M14681 = C9125.m14681(AbstractC3056.m6668(-3937562558916199847L));
        c9125M14681.f25504 = AbstractC3056.m6668(-3937579786030024103L);
        c9125M14681.m14683(Long.TYPE, classLoader.loadClass(AbstractC3056.m6668(-3937563181686457767L)), ArrayList.class, HashMap.class, classLoader.loadClass(AbstractC3056.m6668(-3937562726419924391L)));
        Member memberM14686 = c9125M14681.m14686();
        AbstractC3056.m6668(-3937714995895469479L);
        memberM14686.getClass();
        m11803((Method) memberM14686, new C5864(this, 10));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937798631793624487L);
    }
}
