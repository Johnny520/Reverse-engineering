package lin.xposed.hook.util.qq;

import bsh.C2660;
import com.alibaba.fastjson2.util.C2844;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import p007.AbstractC6136;
import p032.AbstractC6314;
import p032.AbstractC6318;
import p392.C9125;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class QQMsgService {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public interface IGetMultiMsgCallback {
        void onResult(int i, String str, ArrayList<Object> arrayList);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public interface IMsgOperateCallback {
        void onResult(int i, String str, ArrayList arrayList);
    }

    public static void deleteMsg(Object obj, ArrayList<Long> arrayList) {
        if (obj == null || arrayList == null) {
            return;
        }
        XposedHelpers.callMethod(AbstractC6136.m11554(-3937654484101236135L), "deleteMsg", new Class[]{AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.Contact"), ArrayList.class, AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.IOperateCallback")}, new Object[]{obj, arrayList, Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.IOperateCallback")}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQMsgService.1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj2, Method method, Object[] objArr) {
                return null;
            }
        })});
    }

    public static void getMsgsByMsgId(Object obj, ArrayList<Long> arrayList, IMsgOperateCallback iMsgOperateCallback) {
        try {
            AbstractC6314.m11819(AbstractC6136.m11554(-3937654484101236135L), "getMsgsByMsgId", Void.TYPE, new Class[]{AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.Contact"), ArrayList.class, AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.IMsgOperateCallback")}, obj, arrayList, Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.IMsgOperateCallback")}, new C2660(iMsgOperateCallback, 1)));
        } catch (Exception e) {
            C5919.m11252(e);
        }
    }

    public static void getMultiMsg(Object obj, int i, int i2, final IGetMultiMsgCallback iGetMultiMsgCallback) {
        Object msgServiceOfKernel = QQServiceTool.getMsgServiceOfKernel();
        C9125 c9125M14679 = C9125.m14679(msgServiceOfKernel);
        c9125M14679.f25504 = "getMultiMsg";
        Class clsM11838 = AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.Contact");
        Class clsM118382 = AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.IGetMultiMsgCallback");
        Class cls = Integer.TYPE;
        c9125M14679.m14683(clsM11838, cls, cls, clsM118382);
        c9125M14679.m14684(msgServiceOfKernel, obj, Integer.valueOf(i), Integer.valueOf(i2), Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.IGetMultiMsgCallback")}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQMsgService.3
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj2, Method method, Object[] objArr) {
                iGetMultiMsgCallback.onResult(((Integer) objArr[0]).intValue(), (String) objArr[1], (ArrayList) objArr[2]);
                return null;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$getMsgsByMsgId$1(IMsgOperateCallback iMsgOperateCallback, Object obj, Method method, Object[] objArr) {
        iMsgOperateCallback.onResult(((Integer) objArr[0]).intValue(), (String) objArr[1], (ArrayList) objArr[2]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$recallMsg$0(Object obj, Object obj2, Long l) {
        XposedHelpers.callMethod(obj, "recallMsg", new Class[]{AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.Contact"), Long.TYPE, AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.IOperateCallback")}, new Object[]{obj2, l, Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{AbstractC6318.m11838("com.tencent.qqnt.kernel.nativeinterface.IOperateCallback")}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQMsgService.2
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj3, Method method, Object[] objArr) {
                return null;
            }
        })});
    }

    public static void recallMsg(Object obj, ArrayList<Long> arrayList) {
        if (obj == null || arrayList == null) {
            return;
        }
        arrayList.forEach(new C2844(AbstractC6136.m11554(-3937654484101236135L), 4, obj));
    }

    public static void recallMsg(Object obj, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j));
        recallMsg(obj, (ArrayList<Long>) arrayList);
    }
}
