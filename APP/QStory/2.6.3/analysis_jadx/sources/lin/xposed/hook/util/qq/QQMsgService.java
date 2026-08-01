package lin.xposed.hook.util.qq;

import bsh.C2661;
import com.alibaba.fastjson2.util.C2845;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import p009.AbstractC6183;
import p033.AbstractC6333;
import p033.AbstractC6337;
import p287.AbstractC8405;
import p389.C9092;
import top.suzhelan.qstory.hook.item.C5925;

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
        XposedHelpers.callMethod(AbstractC6183.m11587(965), AbstractC8405.m13972(632), new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(133)), ArrayList.class, AbstractC6337.m11866(AbstractC8405.m13972(136))}, new Object[]{obj, arrayList, Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(136))}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQMsgService.1
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj2, Method method, Object[] objArr) {
                return null;
            }
        })});
    }

    public static void getMsgsByMsgId(Object obj, ArrayList<Long> arrayList, IMsgOperateCallback iMsgOperateCallback) {
        try {
            AbstractC6333.m11847(AbstractC6183.m11587(965), AbstractC8405.m13972(968), Void.TYPE, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(133)), ArrayList.class, AbstractC6337.m11866(AbstractC8405.m13972(969))}, obj, arrayList, Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(969))}, new C2661(iMsgOperateCallback, 1)));
        } catch (Exception e) {
            C5925.m11313(e);
        }
    }

    public static void getMultiMsg(Object obj, int i, int i2, final IGetMultiMsgCallback iGetMultiMsgCallback) {
        Object msgServiceOfKernel = QQServiceTool.getMsgServiceOfKernel();
        C9092 c9092M14671 = C9092.m14671(msgServiceOfKernel);
        c9092M14671.f25481 = AbstractC8405.m13972(966);
        Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(133));
        Class clsM118662 = AbstractC6337.m11866(AbstractC8405.m13972(967));
        Class cls = Integer.TYPE;
        c9092M14671.m14675(clsM11866, cls, cls, clsM118662);
        c9092M14671.m14676(msgServiceOfKernel, obj, Integer.valueOf(i), Integer.valueOf(i2), Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(967))}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQMsgService.3
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
        XposedHelpers.callMethod(obj, AbstractC8405.m13972(970), new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(133)), Long.TYPE, AbstractC6337.m11866(AbstractC8405.m13972(136))}, new Object[]{obj2, l, Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(136))}, new InvocationHandler() { // from class: lin.xposed.hook.util.qq.QQMsgService.2
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
        arrayList.forEach(new C2845(AbstractC6183.m11587(965), 4, obj));
    }

    public static void recallMsg(Object obj, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j));
        recallMsg(obj, (ArrayList<Long>) arrayList);
    }
}
