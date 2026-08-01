package p039;

import androidx.compose.runtime.internal.C1245;
import bsh.C2633;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p010.AbstractC6185;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6426 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static Field f17612;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final AtomicReference f17613 = new AtomicReference();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Class f17614;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C6427 f17615;

    public RunnableC6426(C6427 c6427) {
        this.f17615 = c6427;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Method m11974(Object obj) {
        AtomicReference atomicReference = f17613;
        if (atomicReference.get() != null) {
            return (Method) atomicReference.get();
        }
        Class clsM11975 = m11975(obj);
        if (clsM11975 == null) {
            C2633.m5339(AbstractC8405.m13972(111));
            return null;
        }
        C6335 c6335M11854 = C6335.m11854(clsM11975);
        Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(114));
        Class cls = Integer.TYPE;
        Class[] clsArr = {cls, Object.class, clsM11866, cls};
        C1245 c1245 = c6335M11854.f17458;
        c1245.f3619 = clsArr;
        c1245.f3617 = Void.TYPE;
        atomicReference.set(c6335M11854.m11855());
        return (Method) atomicReference.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        p039.RunnableC6426.f17614 = r3.getType();
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Class m11975(java.lang.Object r6) {
        /*
            java.lang.Class r0 = p039.RunnableC6426.f17614
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Class r0 = r6.getClass()
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L42
            r3 = r0[r2]
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.IllegalAccessException -> L3c
            java.lang.Object r4 = r3.get(r6)     // Catch: java.lang.IllegalAccessException -> L3c
            if (r4 != 0) goto L1e
            goto L39
        L1e:
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.IllegalAccessException -> L3c
            java.lang.String r4 = r4.getName()     // Catch: java.lang.IllegalAccessException -> L3c
            r5 = 167(0xa7, float:2.34E-43)
            java.lang.String r5 = p287.AbstractC8405.m13972(r5)     // Catch: java.lang.IllegalAccessException -> L3c
            boolean r4 = r4.startsWith(r5)     // Catch: java.lang.IllegalAccessException -> L3c
            if (r4 == 0) goto L39
            java.lang.Class r6 = r3.getType()     // Catch: java.lang.IllegalAccessException -> L3c
            p039.RunnableC6426.f17614 = r6     // Catch: java.lang.IllegalAccessException -> L3c
            goto L42
        L39:
            int r2 = r2 + 1
            goto Lf
        L3c:
            r6 = move-exception
            top.suzhelan.qstory.hook.item.C5925.m11313(r6)
            r6 = 0
            return r6
        L42:
            java.lang.Class r6 = p039.RunnableC6426.f17614
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p039.RunnableC6426.m11975(java.lang.Object):java.lang.Class");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        r3.setAccessible(true);
        p039.RunnableC6426.f17612 = r3;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m11976(java.lang.Object r7) {
        /*
            java.lang.reflect.Field r0 = p039.RunnableC6426.f17612
            if (r0 == 0) goto L9
            java.lang.Object r7 = r0.get(r7)
            return r7
        L9:
            java.lang.Class r0 = r7.getClass()
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
        L13:
            if (r2 >= r1) goto L41
            r3 = r0[r2]
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.IllegalAccessException -> L3b
            java.lang.Object r5 = r3.get(r7)     // Catch: java.lang.IllegalAccessException -> L3b
            if (r5 != 0) goto L22
            goto L38
        L22:
            java.lang.String r5 = r5.toString()     // Catch: java.lang.IllegalAccessException -> L3b
            r6 = 115(0x73, float:1.61E-43)
            java.lang.String r6 = p287.AbstractC8405.m13972(r6)     // Catch: java.lang.IllegalAccessException -> L3b
            boolean r5 = r5.contains(r6)     // Catch: java.lang.IllegalAccessException -> L3b
            if (r5 == 0) goto L38
            r3.setAccessible(r4)     // Catch: java.lang.IllegalAccessException -> L3b
            p039.RunnableC6426.f17612 = r3     // Catch: java.lang.IllegalAccessException -> L3b
            goto L41
        L38:
            int r2 = r2 + 1
            goto L13
        L3b:
            r7 = move-exception
            top.suzhelan.qstory.hook.item.C5925.m11313(r7)
            r7 = 0
            return r7
        L41:
            java.lang.reflect.Field r0 = p039.RunnableC6426.f17612
            java.lang.Object r7 = r0.get(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p039.RunnableC6426.m11976(java.lang.Object):java.lang.Object");
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6427 c6427 = this.f17615;
        ConcurrentHashMap concurrentHashMap = c6427.f17616;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        new Timer().schedule(new C6422(atomicBoolean, 0), 1000L);
        AbstractC6185.m11592(AbstractC8405.m13972(168));
        while (!atomicBoolean.get()) {
            if (concurrentHashMap.size() == 0) {
                try {
                    TimeUnit.MILLISECONDS.sleep(50L);
                } catch (InterruptedException e) {
                    C5925.m11313(e);
                    return;
                }
            } else {
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    try {
                        Object key = entry.getKey();
                        Object objM11858 = AbstractC6336.m11858(m11975(key), key);
                        Integer num = (Integer) entry.getValue();
                        num.getClass();
                        m11974(key).invoke(objM11858, num, m11976(key), AbstractC6336.m11861(key.getClass(), AbstractC6337.m11866(AbstractC8405.m13972(114))).get(key), Integer.valueOf(c6427.f17617));
                    } catch (Exception unused) {
                    }
                    it.remove();
                }
            }
        }
        AbstractC6185.m11592(AbstractC8405.m13972(169));
    }
}
