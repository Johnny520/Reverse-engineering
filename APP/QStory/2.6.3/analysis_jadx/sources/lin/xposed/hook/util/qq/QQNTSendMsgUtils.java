package lin.xposed.hook.util.qq;

import androidx.compose.runtime.internal.C1245;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import p009.AbstractC6183;
import p010.AbstractC6185;
import p033.AbstractC6337;
import p033.C6335;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class QQNTSendMsgUtils {
    public static void forwardMsg(ArrayList<Long> arrayList, Object obj, ArrayList<Object> arrayList2) {
        Object objM11587 = AbstractC6183.m11587(965);
        Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(971));
        C6335 c6335M11854 = C6335.m11854(objM11587.getClass());
        Class[] clsArr = {ArrayList.class, AbstractC6337.m11866(AbstractC8405.m13972(133)), ArrayList.class, ArrayList.class, clsM11866};
        C1245 c1245 = c6335M11854.f17458;
        c1245.f3619 = clsArr;
        c1245.f3617 = Void.TYPE;
        c6335M11854.f17458.f3618 = AbstractC8405.m13972(662);
        c6335M11854.m11856(objM11587, arrayList, obj, arrayList2, null, Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{clsM11866}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQNTSendMsgUtils.1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj2, Method method, Object[] objArr) {
                return null;
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String post(java.lang.String r5, java.lang.String r6, java.lang.String r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 207
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
            AbstractC6185.m11592(AbstractC8405.m13972(972));
            return;
        }
        if (arrayList == null) {
            AbstractC6185.m11592(AbstractC8405.m13972(973));
            return;
        }
        Object objM11587 = AbstractC6183.m11587(965);
        C6335 c6335M11854 = C6335.m11854(objM11587.getClass());
        Class[] clsArr = {AbstractC6337.m11866(AbstractC8405.m13972(133)), ArrayList.class, AbstractC6337.m11866(AbstractC8405.m13972(136))};
        C1245 c1245 = c6335M11854.f17458;
        c1245.f3619 = clsArr;
        c1245.f3617 = Void.TYPE;
        c6335M11854.f17458.f3618 = AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵呜喵呜喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜呜喵");
        c6335M11854.m11856(objM11587, obj, arrayList, Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(136))}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQNTSendMsgUtils.2
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
            AbstractC6185.m11592(AbstractC8405.m13972(972));
            return;
        }
        if (arrayList == null) {
            AbstractC6185.m11592(AbstractC8405.m13972(973));
            return;
        }
        Object objM11587 = AbstractC6183.m11587(965);
        C6335 c6335M11854 = C6335.m11854(objM11587.getClass());
        Class[] clsArr = {AbstractC6337.m11866(AbstractC8405.m13972(133)), ArrayList.class, AbstractC6337.m11866(AbstractC8405.m13972(136))};
        C1245 c1245 = c6335M11854.f17458;
        c1245.f3619 = clsArr;
        c1245.f3617 = Void.TYPE;
        c6335M11854.f17458.f3618 = AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵呜喵呜喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵喵喵呜呜喵");
        c6335M11854.m11856(objM11587, obj, arrayList, Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(136))}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQNTSendMsgUtils.3
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj2, Method method, Object[] objArr) {
                iOperateCallback.onResult(((Integer) objArr[0]).intValue(), (String) objArr[1]);
                return null;
            }
        }));
    }
}
