package p000;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: j0 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0274j0 {

    /* JADX INFO: renamed from: a */
    public final Class f435a;

    /* JADX INFO: renamed from: b */
    public final Class f436b;

    /* JADX INFO: renamed from: c */
    public final Class f437c;

    /* JADX INFO: renamed from: d */
    public final Class f438d;

    /* JADX INFO: renamed from: e */
    public final Field f439e;

    /* JADX INFO: renamed from: f */
    public final Field f440f;

    /* JADX INFO: renamed from: g */
    public final Field f441g;

    /* JADX INFO: renamed from: h */
    public final Method f442h;

    /* JADX INFO: renamed from: i */
    public final Method f443i;

    /* JADX INFO: renamed from: j */
    public final Method f444j;

    /* JADX INFO: renamed from: k */
    public final Method f445k;

    /* JADX INFO: renamed from: l */
    public final Method f446l;

    /* JADX INFO: renamed from: m */
    public final Method f447m;

    /* JADX INFO: renamed from: n */
    public final Method f448n;

    /* JADX INFO: renamed from: o */
    public final Method f449o;

    /* JADX INFO: renamed from: p */
    public final Method f450p;

    /* JADX INFO: renamed from: q */
    public final Method f451q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0274j0(Class cls, Class cls2, Class cls3, Class cls4, Field field, Field field2, Field field3, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10) {
        this.f435a = cls;
        this.f436b = cls2;
        this.f437c = cls3;
        this.f438d = cls4;
        this.f439e = field;
        this.f440f = field2;
        this.f441g = field3;
        this.f442h = method;
        this.f443i = method2;
        this.f444j = method3;
        this.f445k = method4;
        this.f446l = method5;
        this.f447m = method6;
        this.f448n = method7;
        this.f449o = method8;
        this.f450p = method9;
        this.f451q = method10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0274j0 m702a(ClassLoader classLoader) throws NoSuchFieldException, NoSuchMethodException, ClassNotFoundException {
        Class clsM839s = AbstractC0429r0.m839s(classLoader, "com.tencent.mobileqq.aio.msglist.holder.AIOBubbleMsgItemVB");
        Class clsM839s2 = AbstractC0429r0.m839s(classLoader, "com.tencent.mobileqq.aio.msglist.holder.AIOMsgItemUIState$AIOMsgItemState");
        Class clsM839s3 = AbstractC0429r0.m839s(classLoader, "com.tencent.mobileqq.aio.msg.AIOMsgItem");
        Class clsM839s4 = AbstractC0429r0.m839s(classLoader, "com.tencent.mobileqq.aio.msg.GrayTipsMsgItem");
        Class clsM839s5 = AbstractC0429r0.m839s(classLoader, "com.tencent.qqnt.aio.holder.template.BubbleLayoutCompatPress");
        Class superclass = clsM839s3.getSuperclass();
        if (superclass == null || superclass == Object.class) {
            throw new NoSuchFieldException("AIOMsgItem base class missing");
        }
        Field fieldM822b = AbstractC0429r0.m822b(clsM839s, View.class);
        Field fieldM822b2 = AbstractC0429r0.m822b(clsM839s, clsM839s3);
        Field fieldM822b3 = AbstractC0429r0.m822b(clsM839s2, superclass);
        Method method = clsM839s3.getMethod("getMsgRecord", null);
        Class<?> returnType = method.getReturnType();
        Method method2 = returnType.getMethod("getChatType", null);
        Method method3 = returnType.getMethod("getPeerUid", null);
        Method method4 = returnType.getMethod("getMsgSeq", null);
        Method method5 = returnType.getMethod("getMsgId", null);
        Method method6 = returnType.getMethod("getMsgRandom", null);
        Method method7 = returnType.getMethod("getSenderUid", null);
        Method method8 = returnType.getMethod("getSenderUin", null);
        Method method9 = returnType.getMethod("getRecallTime", null);
        Method method10 = returnType.getMethod("getMsgTime", null);
        fieldM822b.setAccessible(true);
        fieldM822b2.setAccessible(true);
        fieldM822b3.setAccessible(true);
        method.setAccessible(true);
        method2.setAccessible(true);
        method3.setAccessible(true);
        method4.setAccessible(true);
        method5.setAccessible(true);
        method6.setAccessible(true);
        method7.setAccessible(true);
        method8.setAccessible(true);
        method9.setAccessible(true);
        method10.setAccessible(true);
        return new C0274j0(clsM839s2, clsM839s3, clsM839s4, clsM839s5, fieldM822b, fieldM822b2, fieldM822b3, method, method2, method3, method4, method5, method6, method7, method8, method9, method10);
    }
}
