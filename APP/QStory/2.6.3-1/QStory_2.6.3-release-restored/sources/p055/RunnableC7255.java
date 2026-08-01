package p055;

import androidx.compose.runtime.internal.C2080;
import bsh.C3466;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p026.AbstractC7014;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC7255 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static Field f17957;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final AtomicReference f17958 = new AtomicReference();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Class f17959;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C7256 f17960;

    public RunnableC7255(C7256 c7256) {
        this.f17960 = c7256;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Method m12533(Object obj) {
        AtomicReference atomicReference = f17958;
        if (atomicReference.get() != null) {
            return (Method) atomicReference.get();
        }
        Class clsM12534 = m12534(obj);
        if (clsM12534 == null) {
            C3466.m5899("findClass is null");
            return null;
        }
        C7164 c7164M12413 = C7164.m12413(clsM12534);
        Class clsM12425 = AbstractC7166.m12425("com.tencent.qqnt.chats.core.adapter.holder.RecentContactItemBinding");
        Class cls = Integer.TYPE;
        Class[] clsArr = {cls, Object.class, clsM12425, cls};
        C2080 c2080 = c7164M12413.f17803;
        c2080.f3964 = clsArr;
        c2080.f3962 = Void.TYPE;
        atomicReference.set(c7164M12413.m12414());
        return (Method) atomicReference.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        p055.RunnableC7255.f17959 = r3.getType();
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Class m12534(Object obj) {
        Class cls = f17959;
        if (cls != null) {
            return cls;
        }
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Field field = declaredFields[i];
            try {
                field.setAccessible(true);
                Object obj2 = field.get(obj);
                if (obj2 != null && obj2.getClass().getName().startsWith("com.tencent.qqnt.chats.core.ui.ChatsListVB$")) {
                    break;
                }
                i++;
            } catch (IllegalAccessException e) {
                C6755.m11872(e);
                return null;
            }
        }
        return f17959;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        r3.setAccessible(true);
        p055.RunnableC7255.f17957 = r3;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m12535(Object obj) {
        Field field = f17957;
        if (field != null) {
            return field.get(obj);
        }
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Field field2 = declaredFields[i];
            try {
                field2.setAccessible(true);
                Object obj2 = field2.get(obj);
                if (obj2 != null && obj2.toString().contains("RecentContactChatItem")) {
                    break;
                }
                i++;
            } catch (IllegalAccessException e) {
                C6755.m11872(e);
                return null;
            }
        }
        return f17957.get(obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7256 c7256 = this.f17960;
        ConcurrentHashMap concurrentHashMap = c7256.f17961;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        new Timer().schedule(new C7251(atomicBoolean, 0), 1000L);
        AbstractC7014.m12151("开始清理");
        while (!atomicBoolean.get()) {
            if (concurrentHashMap.size() == 0) {
                try {
                    TimeUnit.MILLISECONDS.sleep(50L);
                } catch (InterruptedException e) {
                    C6755.m11872(e);
                    return;
                }
            } else {
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    try {
                        Object key = entry.getKey();
                        Object objM12417 = AbstractC7165.m12417(m12534(key), key);
                        Integer num = (Integer) entry.getValue();
                        num.getClass();
                        m12533(key).invoke(objM12417, num, m12535(key), AbstractC7165.m12420(key.getClass(), AbstractC7166.m12425("com.tencent.qqnt.chats.core.adapter.holder.RecentContactItemBinding")).get(key), Integer.valueOf(c7256.f17962));
                    } catch (Exception unused) {
                    }
                    it.remove();
                }
            }
        }
        AbstractC7014.m12151("已清理");
    }
}
