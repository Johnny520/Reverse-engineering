package p038;

import androidx.compose.runtime.internal.C1245;
import bsh.C2632;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p010.AbstractC6154;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6399 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static Field f17552;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final AtomicReference f17553 = new AtomicReference();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Class f17554;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C6403 f17555;

    public RunnableC6399(C6403 c6403) {
        this.f17555 = c6403;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Method m11923(Object obj) {
        AtomicReference atomicReference = f17553;
        if (atomicReference.get() != null) {
            return (Method) atomicReference.get();
        }
        Class clsM11924 = m11924(obj);
        if (clsM11924 == null) {
            C2632.m5294("findClass is null");
            return null;
        }
        C6316 c6316M11826 = C6316.m11826(clsM11924);
        Class clsM11838 = AbstractC6318.m11838("com.tencent.qqnt.chats.core.adapter.holder.RecentContactItemBinding");
        Class cls = Integer.TYPE;
        Class[] clsArr = {cls, Object.class, clsM11838, cls};
        C1245 c1245 = c6316M11826.f17409;
        c1245.f3618 = clsArr;
        c1245.f3616 = Void.TYPE;
        atomicReference.set(c6316M11826.m11827());
        return (Method) atomicReference.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        p038.RunnableC6399.f17554 = r3.getType();
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Class m11924(java.lang.Object r7) {
        /*
            java.lang.Class r0 = p038.RunnableC6399.f17554
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Class r0 = r7.getClass()
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L45
            r3 = r0[r2]
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.IllegalAccessException -> L3f
            java.lang.Object r4 = r3.get(r7)     // Catch: java.lang.IllegalAccessException -> L3f
            if (r4 != 0) goto L1e
            goto L3c
        L1e:
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.IllegalAccessException -> L3f
            java.lang.String r4 = r4.getName()     // Catch: java.lang.IllegalAccessException -> L3f
            r5 = -3937577432387945895(0xc95aea2ffaebfa59, double:-2.400879907493359E45)
            java.lang.String r5 = com.bumptech.glide.AbstractC3056.m6668(r5)     // Catch: java.lang.IllegalAccessException -> L3f
            boolean r4 = r4.startsWith(r5)     // Catch: java.lang.IllegalAccessException -> L3f
            if (r4 == 0) goto L3c
            java.lang.Class r7 = r3.getType()     // Catch: java.lang.IllegalAccessException -> L3f
            p038.RunnableC6399.f17554 = r7     // Catch: java.lang.IllegalAccessException -> L3f
            goto L45
        L3c:
            int r2 = r2 + 1
            goto Lf
        L3f:
            r7 = move-exception
            top.suzhelan.qstory.hook.item.C5919.m11252(r7)
            r7 = 0
            return r7
        L45:
            java.lang.Class r7 = p038.RunnableC6399.f17554
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p038.RunnableC6399.m11924(java.lang.Object):java.lang.Class");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        r3.setAccessible(true);
        p038.RunnableC6399.f17552 = r3;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m11925(java.lang.Object r8) {
        /*
            java.lang.reflect.Field r0 = p038.RunnableC6399.f17552
            if (r0 == 0) goto L9
            java.lang.Object r8 = r0.get(r8)
            return r8
        L9:
            java.lang.Class r0 = r8.getClass()
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
        L13:
            if (r2 >= r1) goto L44
            r3 = r0[r2]
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.IllegalAccessException -> L3e
            java.lang.Object r5 = r3.get(r8)     // Catch: java.lang.IllegalAccessException -> L3e
            if (r5 != 0) goto L22
            goto L3b
        L22:
            java.lang.String r5 = r5.toString()     // Catch: java.lang.IllegalAccessException -> L3e
            r6 = -3937567201775846823(0xc95af37dfaebfa59, double:-2.4041221178853817E45)
            java.lang.String r6 = com.bumptech.glide.AbstractC3056.m6668(r6)     // Catch: java.lang.IllegalAccessException -> L3e
            boolean r5 = r5.contains(r6)     // Catch: java.lang.IllegalAccessException -> L3e
            if (r5 == 0) goto L3b
            r3.setAccessible(r4)     // Catch: java.lang.IllegalAccessException -> L3e
            p038.RunnableC6399.f17552 = r3     // Catch: java.lang.IllegalAccessException -> L3e
            goto L44
        L3b:
            int r2 = r2 + 1
            goto L13
        L3e:
            r8 = move-exception
            top.suzhelan.qstory.hook.item.C5919.m11252(r8)
            r8 = 0
            return r8
        L44:
            java.lang.reflect.Field r0 = p038.RunnableC6399.f17552
            java.lang.Object r8 = r0.get(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p038.RunnableC6399.m11925(java.lang.Object):java.lang.Object");
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6403 c6403 = this.f17555;
        ConcurrentHashMap concurrentHashMap = c6403.f17562;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        new Timer().schedule(new C6400(atomicBoolean, 0), 1000L);
        AbstractC6154.m11561("\u5f00\u59cb\u6e05\u7406");
        while (!atomicBoolean.get()) {
            if (concurrentHashMap.size() == 0) {
                try {
                    TimeUnit.MILLISECONDS.sleep(50L);
                } catch (InterruptedException e) {
                    C5919.m11252(e);
                    return;
                }
            } else {
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    try {
                        Object key = entry.getKey();
                        Object objM11830 = AbstractC6317.m11830(m11924(key), key);
                        Integer num = (Integer) entry.getValue();
                        num.getClass();
                        m11923(key).invoke(objM11830, num, m11925(key), AbstractC6317.m11833(key.getClass(), AbstractC6318.m11838("com.tencent.qqnt.chats.core.adapter.holder.RecentContactItemBinding")).get(key), Integer.valueOf(c6403.f17563));
                    } catch (Exception unused) {
                    }
                    it.remove();
                }
            }
        }
        AbstractC6154.m11561("\u5df2\u6e05\u7406");
    }
}
