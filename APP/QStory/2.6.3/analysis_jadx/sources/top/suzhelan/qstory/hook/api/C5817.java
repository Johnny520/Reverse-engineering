package top.suzhelan.qstory.hook.api;

import androidx.compose.runtime.internal.C1245;
import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.AbstractC5062;
import lin.xposed.hook.util.qq.QQEnvTool;
import net.bytebuddy.description.method.MethodDescription;
import p010.InterfaceC6190;
import p026.AbstractC6316;
import p033.C6335;
import p036.AbstractC6358;
import p287.AbstractC8405;
import p389.AbstractC9090;
import p389.C9086;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏世兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "top/suzhelan/qstory/hook/api/飘花落叶言子楪哲世兰苏", "top/suzhelan/qstory/hook/api/飘花落叶言子楪哲世苏兰", "top/suzhelan/qstory/hook/api/飘花落叶言子楪苏兰哲世", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5817 extends AbstractC6316 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ExecutorService f15947;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f15948 = System.currentTimeMillis();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5821 f15946 = new C5821();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final ArrayList f15944 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final ArrayList f15943 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final ArrayList f15945 = new ArrayList();

    public C5817() {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        AbstractC8405.m13972(1569);
        executorServiceNewCachedThreadPool.getClass();
        this.f15947 = executorServiceNewCachedThreadPool;
    }

    public static final void addAPIMessageListener(InterfaceC5815 interfaceC5815) {
        f15946.addAPIMessageListener(interfaceC5815);
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        String strM13972 = AbstractC8405.m13972(1570);
        int i = AbstractC6358.f17508;
        if (i >= 12290) {
            strM13972 = AbstractC8405.m13972(1571);
        } else if (i >= 11650) {
            strM13972 = AbstractC8405.m13972(1572);
        } else if (i == 9048) {
            strM13972 = AbstractC8405.m13972(1573);
        } else if (i >= 6458) {
            strM13972 = AbstractC8405.m13972(1574);
        }
        Class clsM14669 = AbstractC9090.m14669(strM13972);
        C6335 c6335M11854 = C6335.m11854(clsM14669);
        String strM139722 = AbstractC8405.m13972(1575);
        C1245 c1245 = c6335M11854.f17458;
        c1245.f3618 = strM139722;
        c1245.f3619 = new Class[]{ArrayList.class};
        Class cls = Void.TYPE;
        c1245.f3617 = cls;
        final int i2 = 0;
        AbstractC5062.m10039(c6335M11854.m11855(), new InterfaceC6190(this) { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏哲世兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C5817 f15955;

            {
                this.f15955 = this;
            }

            @Override // p010.InterfaceC6190
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo8621(XC_MethodHook.MethodHookParam methodHookParam) {
                int i3 = i2;
                Class cls2 = Long.TYPE;
                C5817 c5817 = this.f15955;
                final int i4 = 0;
                switch (i3) {
                    case 0:
                        C5821 c5821 = C5817.f15946;
                        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                        methodHookParam.getClass();
                        Object obj = methodHookParam.args[0];
                        AbstractC8405.m13972(1540);
                        obj.getClass();
                        ArrayList arrayList = (ArrayList) obj;
                        ExecutorService executorService = c5817.f15947;
                        if (System.currentTimeMillis() - c5817.f15948 >= 2000 && !arrayList.isEmpty()) {
                            final Object obj2 = arrayList.get(0);
                            AbstractC8405.m13972(1548);
                            obj2.getClass();
                            Long l = (Long) C9086.m14663(cls2, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), obj2);
                            ArrayList arrayList2 = C5817.f15944;
                            if (!arrayList2.contains(l)) {
                                l.getClass();
                                if (arrayList2.size() >= 500) {
                                    arrayList2.clear();
                                }
                                arrayList2.add(l);
                                Iterator it = C5817.f15945.iterator();
                                AbstractC8405.m13972(1253);
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    AbstractC8405.m13972(1254);
                                    next.getClass();
                                    final InterfaceC5815 interfaceC5815 = (InterfaceC5815) next;
                                    executorService.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏哲兰世
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i5 = i4;
                                            Object obj3 = obj2;
                                            InterfaceC5815 interfaceC58152 = interfaceC5815;
                                            switch (i5) {
                                                case 0:
                                                    C5821 c58212 = C5817.f15946;
                                                    interfaceC58152.mo10864(obj3);
                                                    break;
                                                default:
                                                    C5821 c58213 = C5817.f15946;
                                                    interfaceC58152.mo10864(obj3);
                                                    break;
                                            }
                                        }
                                    });
                                }
                                Iterator it2 = C5817.f15943.iterator();
                                AbstractC8405.m13972(1253);
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    AbstractC8405.m13972(1254);
                                    next2.getClass();
                                    final C5816 c5816 = (C5816) next2;
                                    if (c5816.f15942.f17425.booleanValue()) {
                                        executorService.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏兰世哲
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i5 = i4;
                                                Object obj3 = obj2;
                                                C5816 c58162 = c5816;
                                                switch (i5) {
                                                    case 0:
                                                        C5821 c58212 = C5817.f15946;
                                                        c58162.f15941.mo10864(obj3);
                                                        break;
                                                    default:
                                                        C5821 c58213 = C5817.f15946;
                                                        c58162.f15941.mo10864(obj3);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        C5821 c58212 = C5817.f15946;
                        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                        methodHookParam.getClass();
                        Object obj3 = methodHookParam.args[0];
                        AbstractC8405.m13972(1540);
                        obj3.getClass();
                        ArrayList arrayList3 = (ArrayList) obj3;
                        ExecutorService executorService2 = c5817.f15947;
                        if (System.currentTimeMillis() - c5817.f15948 >= 2000 && !arrayList3.isEmpty()) {
                            final Object obj4 = arrayList3.get(0);
                            AbstractC8405.m13972(1548);
                            obj4.getClass();
                            Long l2 = (Long) C9086.m14663(cls2, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), obj4);
                            ArrayList arrayList4 = C5817.f15944;
                            if (!arrayList4.contains(l2)) {
                                Integer num = (Integer) C9086.m14663(Integer.TYPE, AbstractC8405.m13972(1577), obj4);
                                if (num != null && num.intValue() == 2) {
                                    if (!((Boolean) C9086.m14663(Boolean.TYPE, AbstractC8405.m13972(1578), obj4)).booleanValue() && String.valueOf((Long) C9086.m14663(cls2, AbstractC8405.m13972(483), obj4)).equals(QQEnvTool.getCurrentUin())) {
                                        l2.getClass();
                                        if (arrayList4.size() >= 500) {
                                            arrayList4.clear();
                                        }
                                        arrayList4.add(l2);
                                        Iterator it3 = C5817.f15945.iterator();
                                        AbstractC8405.m13972(1253);
                                        it3.getClass();
                                        while (true) {
                                            final int i5 = 1;
                                            if (!it3.hasNext()) {
                                                Iterator it4 = C5817.f15943.iterator();
                                                AbstractC8405.m13972(1253);
                                                it4.getClass();
                                                while (it4.hasNext()) {
                                                    Object next3 = it4.next();
                                                    AbstractC8405.m13972(1254);
                                                    next3.getClass();
                                                    final C5816 c58162 = (C5816) next3;
                                                    if (c58162.f15942.f17425.booleanValue()) {
                                                        executorService2.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏兰世哲
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                int i52 = i5;
                                                                Object obj32 = obj4;
                                                                C5816 c581622 = c58162;
                                                                switch (i52) {
                                                                    case 0:
                                                                        C5821 c582122 = C5817.f15946;
                                                                        c581622.f15941.mo10864(obj32);
                                                                        break;
                                                                    default:
                                                                        C5821 c58213 = C5817.f15946;
                                                                        c581622.f15941.mo10864(obj32);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                    }
                                                }
                                            } else {
                                                Object next4 = it3.next();
                                                AbstractC8405.m13972(1254);
                                                next4.getClass();
                                                final InterfaceC5815 interfaceC58152 = (InterfaceC5815) next4;
                                                executorService2.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏哲兰世
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i52 = i5;
                                                        Object obj32 = obj4;
                                                        InterfaceC5815 interfaceC581522 = interfaceC58152;
                                                        switch (i52) {
                                                            case 0:
                                                                C5821 c582122 = C5817.f15946;
                                                                interfaceC581522.mo10864(obj32);
                                                                break;
                                                            default:
                                                                C5821 c58213 = C5817.f15946;
                                                                interfaceC581522.mo10864(obj32);
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
        C6335 c6335M118542 = C6335.m11854(clsM14669);
        String strM139723 = AbstractC8405.m13972(1576);
        C1245 c12452 = c6335M118542.f17458;
        c12452.f3618 = strM139723;
        c12452.f3619 = new Class[]{ArrayList.class};
        c12452.f3617 = cls;
        final int i3 = 1;
        AbstractC5062.m10039(c6335M118542.m11855(), new InterfaceC6190(this) { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏哲世兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C5817 f15955;

            {
                this.f15955 = this;
            }

            @Override // p010.InterfaceC6190
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo8621(XC_MethodHook.MethodHookParam methodHookParam) {
                int i32 = i3;
                Class cls2 = Long.TYPE;
                C5817 c5817 = this.f15955;
                final int i4 = 0;
                switch (i32) {
                    case 0:
                        C5821 c5821 = C5817.f15946;
                        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                        methodHookParam.getClass();
                        Object obj = methodHookParam.args[0];
                        AbstractC8405.m13972(1540);
                        obj.getClass();
                        ArrayList arrayList = (ArrayList) obj;
                        ExecutorService executorService = c5817.f15947;
                        if (System.currentTimeMillis() - c5817.f15948 >= 2000 && !arrayList.isEmpty()) {
                            final Object obj2 = arrayList.get(0);
                            AbstractC8405.m13972(1548);
                            obj2.getClass();
                            Long l = (Long) C9086.m14663(cls2, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), obj2);
                            ArrayList arrayList2 = C5817.f15944;
                            if (!arrayList2.contains(l)) {
                                l.getClass();
                                if (arrayList2.size() >= 500) {
                                    arrayList2.clear();
                                }
                                arrayList2.add(l);
                                Iterator it = C5817.f15945.iterator();
                                AbstractC8405.m13972(1253);
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    AbstractC8405.m13972(1254);
                                    next.getClass();
                                    final InterfaceC5815 interfaceC5815 = (InterfaceC5815) next;
                                    executorService.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏哲兰世
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i52 = i4;
                                            Object obj32 = obj2;
                                            InterfaceC5815 interfaceC581522 = interfaceC5815;
                                            switch (i52) {
                                                case 0:
                                                    C5821 c582122 = C5817.f15946;
                                                    interfaceC581522.mo10864(obj32);
                                                    break;
                                                default:
                                                    C5821 c58213 = C5817.f15946;
                                                    interfaceC581522.mo10864(obj32);
                                                    break;
                                            }
                                        }
                                    });
                                }
                                Iterator it2 = C5817.f15943.iterator();
                                AbstractC8405.m13972(1253);
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    AbstractC8405.m13972(1254);
                                    next2.getClass();
                                    final C5816 c5816 = (C5816) next2;
                                    if (c5816.f15942.f17425.booleanValue()) {
                                        executorService.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏兰世哲
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i52 = i4;
                                                Object obj32 = obj2;
                                                C5816 c581622 = c5816;
                                                switch (i52) {
                                                    case 0:
                                                        C5821 c582122 = C5817.f15946;
                                                        c581622.f15941.mo10864(obj32);
                                                        break;
                                                    default:
                                                        C5821 c58213 = C5817.f15946;
                                                        c581622.f15941.mo10864(obj32);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                                break;
                            }
                        }
                        break;
                    default:
                        C5821 c58212 = C5817.f15946;
                        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                        methodHookParam.getClass();
                        Object obj3 = methodHookParam.args[0];
                        AbstractC8405.m13972(1540);
                        obj3.getClass();
                        ArrayList arrayList3 = (ArrayList) obj3;
                        ExecutorService executorService2 = c5817.f15947;
                        if (System.currentTimeMillis() - c5817.f15948 >= 2000 && !arrayList3.isEmpty()) {
                            final Object obj4 = arrayList3.get(0);
                            AbstractC8405.m13972(1548);
                            obj4.getClass();
                            Long l2 = (Long) C9086.m14663(cls2, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), obj4);
                            ArrayList arrayList4 = C5817.f15944;
                            if (!arrayList4.contains(l2)) {
                                Integer num = (Integer) C9086.m14663(Integer.TYPE, AbstractC8405.m13972(1577), obj4);
                                if (num != null && num.intValue() == 2) {
                                    if (!((Boolean) C9086.m14663(Boolean.TYPE, AbstractC8405.m13972(1578), obj4)).booleanValue() && String.valueOf((Long) C9086.m14663(cls2, AbstractC8405.m13972(483), obj4)).equals(QQEnvTool.getCurrentUin())) {
                                        l2.getClass();
                                        if (arrayList4.size() >= 500) {
                                            arrayList4.clear();
                                        }
                                        arrayList4.add(l2);
                                        Iterator it3 = C5817.f15945.iterator();
                                        AbstractC8405.m13972(1253);
                                        it3.getClass();
                                        while (true) {
                                            final int i5 = 1;
                                            if (!it3.hasNext()) {
                                                Iterator it4 = C5817.f15943.iterator();
                                                AbstractC8405.m13972(1253);
                                                it4.getClass();
                                                while (it4.hasNext()) {
                                                    Object next3 = it4.next();
                                                    AbstractC8405.m13972(1254);
                                                    next3.getClass();
                                                    final C5816 c58162 = (C5816) next3;
                                                    if (c58162.f15942.f17425.booleanValue()) {
                                                        executorService2.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏兰世哲
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                int i52 = i5;
                                                                Object obj32 = obj4;
                                                                C5816 c581622 = c58162;
                                                                switch (i52) {
                                                                    case 0:
                                                                        C5821 c582122 = C5817.f15946;
                                                                        c581622.f15941.mo10864(obj32);
                                                                        break;
                                                                    default:
                                                                        C5821 c58213 = C5817.f15946;
                                                                        c581622.f15941.mo10864(obj32);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                    }
                                                }
                                            } else {
                                                Object next4 = it3.next();
                                                AbstractC8405.m13972(1254);
                                                next4.getClass();
                                                final InterfaceC5815 interfaceC58152 = (InterfaceC5815) next4;
                                                executorService2.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏哲兰世
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i52 = i5;
                                                        Object obj32 = obj4;
                                                        InterfaceC5815 interfaceC581522 = interfaceC58152;
                                                        switch (i52) {
                                                            case 0:
                                                                C5821 c582122 = C5817.f15946;
                                                                interfaceC581522.mo10864(obj32);
                                                                break;
                                                            default:
                                                                C5821 c58213 = C5817.f15946;
                                                                interfaceC581522.mo10864(obj32);
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        });
    }
}
