package lin.xposed.hook.util.qq;

import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import p007.AbstractC6136;
import p010.AbstractC6154;
import p032.AbstractC6318;
import p032.C6316;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class QQNTSendMsgUtils {
    public static void forwardMsg(ArrayList<Long> arrayList, Object obj, ArrayList<Object> arrayList2) {
        Object objM11554 = AbstractC6136.m11554(-3937654484101236135L);
        Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937653672352417191L));
        C6316 c6316M11826 = C6316.m11826(objM11554.getClass());
        Class[] clsArr = {ArrayList.class, AbstractC6318.m11838(AbstractC3056.m6668(-3937563181686457767L)), ArrayList.class, ArrayList.class, clsM11838};
        C1245 c1245 = c6316M11826.f17409;
        c1245.f3618 = clsArr;
        c1245.f3616 = Void.TYPE;
        c6316M11826.f17409.f3617 = AbstractC3056.m6668(-3937631570450711975L);
        c6316M11826.m11828(objM11554, arrayList, obj, arrayList2, null, Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{clsM11838}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQNTSendMsgUtils.1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj2, Method method, Object[] objArr) {
                return null;
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String post(java.lang.String r6, java.lang.String r7, java.lang.String r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lin.xposed.hook.util.qq.QQNTSendMsgUtils.post(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static void sendCard(Object obj, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CreateElement.createArkElement(str));
        sendMsg(obj, arrayList);
    }

    public static void sendFile(Object obj, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CreateElement.createFileElement(str));
        sendMsg(obj, arrayList);
    }

    public static void sendMsg(Object obj, ArrayList arrayList) {
        if (obj == null) {
            AbstractC6154.m11561(AbstractC3056.m6668(-3937653397474510247L));
            return;
        }
        if (arrayList == null) {
            AbstractC6154.m11561(AbstractC3056.m6668(-3937653320165098919L));
            return;
        }
        Object objM11554 = AbstractC6136.m11554(-3937654484101236135L);
        C6316 c6316M11826 = C6316.m11826(objM11554.getClass());
        Class[] clsArr = {AbstractC6318.m11838(AbstractC3056.m6668(-3937563181686457767L)), ArrayList.class, AbstractC6318.m11838(AbstractC3056.m6668(-3937562726419924391L))};
        C1245 c1245 = c6316M11826.f17409;
        c1245.f3618 = clsArr;
        c1245.f3616 = Void.TYPE;
        c6316M11826.f17409.f3617 = AbstractC3056.m6668(-3937579786030024103L);
        c6316M11826.m11828(objM11554, obj, arrayList, Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937562726419924391L))}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQNTSendMsgUtils.2
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj2, Method method, Object[] objArr) {
                return null;
            }
        }));
    }

    public static void sendPic(Object obj, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CreateElement.createPicElement(str));
        sendMsg(obj, arrayList);
    }

    public static void sendText(Object obj, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CreateElement.createTextElement(str));
        sendMsg(obj, arrayList);
    }

    public static void sendVideo(Object obj, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CreateElement.createVideoElement(str));
        sendMsg(obj, arrayList);
    }

    public static void sendVoice(Object obj, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CreateElement.createPttElement(str));
        sendMsg(obj, arrayList);
    }

    public static void sendMsg(Object obj, ArrayList arrayList, final IOperateCallback iOperateCallback) {
        if (obj == null) {
            AbstractC6154.m11561(AbstractC3056.m6668(-3937653397474510247L));
            return;
        }
        if (arrayList == null) {
            AbstractC6154.m11561(AbstractC3056.m6668(-3937653320165098919L));
            return;
        }
        Object objM11554 = AbstractC6136.m11554(-3937654484101236135L);
        C6316 c6316M11826 = C6316.m11826(objM11554.getClass());
        Class[] clsArr = {AbstractC6318.m11838(AbstractC3056.m6668(-3937563181686457767L)), ArrayList.class, AbstractC6318.m11838(AbstractC3056.m6668(-3937562726419924391L))};
        C1245 c1245 = c6316M11826.f17409;
        c1245.f3618 = clsArr;
        c1245.f3616 = Void.TYPE;
        c6316M11826.f17409.f3617 = AbstractC3056.m6668(-3937579786030024103L);
        c6316M11826.m11828(objM11554, obj, arrayList, Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937562726419924391L))}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQNTSendMsgUtils.3
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj2, Method method, Object[] objArr) {
                iOperateCallback.onResult(((Integer) objArr[0]).intValue(), (String) objArr[1]);
                return null;
            }
        }));
    }
}
