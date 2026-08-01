package lin.xposed.hook.util.p011qq;

import bsh.C3494;
import com.alibaba.fastjson2.util.C3678;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import p025.AbstractC7012;
import p049.AbstractC7162;
import p049.AbstractC7166;
import p405.C9921;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class QQMsgService {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface IGetMultiMsgCallback {
        void onResult(int i, String str, ArrayList<Object> arrayList);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface IMsgOperateCallback {
        void onResult(int i, String str, ArrayList arrayList);
    }

    public static void deleteMsg(Object obj, ArrayList<Long> arrayList) {
        if (obj == null || arrayList == null) {
            return;
        }
        XposedHelpers.callMethod(AbstractC7012.m12146(965), "deleteMsg", new Class[]{AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.Contact"), ArrayList.class, AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.IOperateCallback")}, new Object[]{obj, arrayList, Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.IOperateCallback")}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQMsgService.1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj2, Method method, Object[] objArr) {
                return null;
            }
        })});
    }

    public static void getMsgsByMsgId(Object obj, ArrayList<Long> arrayList, IMsgOperateCallback iMsgOperateCallback) {
        try {
            AbstractC7162.m12406(AbstractC7012.m12146(965), "getMsgsByMsgId", Void.TYPE, new Class[]{AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.Contact"), ArrayList.class, AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.IMsgOperateCallback")}, obj, arrayList, Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.IMsgOperateCallback")}, new C3494(iMsgOperateCallback, 1)));
        } catch (Exception e) {
            C6755.m11872(e);
        }
    }

    public static void getMultiMsg(Object obj, int i, int i2, final IGetMultiMsgCallback iGetMultiMsgCallback) {
        Object msgServiceOfKernel = QQServiceTool.getMsgServiceOfKernel();
        C9921 c9921M15230 = C9921.m15230(msgServiceOfKernel);
        c9921M15230.f25826 = "getMultiMsg";
        Class clsM12425 = AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.Contact");
        Class clsM124252 = AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.IGetMultiMsgCallback");
        Class cls = Integer.TYPE;
        c9921M15230.m15234(clsM12425, cls, cls, clsM124252);
        c9921M15230.m15235(msgServiceOfKernel, obj, Integer.valueOf(i), Integer.valueOf(i2), Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.IGetMultiMsgCallback")}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQMsgService.3
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
        XposedHelpers.callMethod(obj, "recallMsg", new Class[]{AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.Contact"), Long.TYPE, AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.IOperateCallback")}, new Object[]{obj2, l, Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{AbstractC7166.m12425("com.tencent.qqnt.kernel.nativeinterface.IOperateCallback")}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQMsgService.2
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
        arrayList.forEach(new C3678(AbstractC7012.m12146(965), 4, obj));
    }

    public static void recallMsg(Object obj, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j));
        recallMsg(obj, (ArrayList<Long>) arrayList);
    }
}
