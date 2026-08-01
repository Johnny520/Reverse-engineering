package top.suzhelan.qstory.hook.api;

import androidx.compose.runtime.internal.C2080;
import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.AbstractC5894;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import net.bytebuddy.description.method.MethodDescription;
import p026.InterfaceC7019;
import p042.AbstractC7145;
import p049.C7164;
import p052.AbstractC7187;
import p405.AbstractC9919;
import p405.C9915;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m151d2 = {"Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏世兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "top/suzhelan/qstory/hook/api/飘花落叶言子楪哲世兰苏", "top/suzhelan/qstory/hook/api/飘花落叶言子楪哲世苏兰", "top/suzhelan/qstory/hook/api/飘花落叶言子楪苏兰哲世", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6647 extends AbstractC7145 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ExecutorService f16292;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f16293 = System.currentTimeMillis();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C6651 f16291 = new C6651();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final ArrayList f16289 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final ArrayList f16288 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final ArrayList f16290 = new ArrayList();

    public C6647() {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        "newCachedThreadPool(...)";
        executorServiceNewCachedThreadPool.getClass();
        this.f16292 = executorServiceNewCachedThreadPool;
    }

    public static final void addAPIMessageListener(InterfaceC6645 interfaceC6645) {
        f16291.addAPIMessageListener(interfaceC6645);
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        String strM14531 = "com.tencent.qqnt.msg.MsgService$a";
        int i = AbstractC7187.f17853;
        if (i >= 12290) {
            strM14531 = "com.tencent.qqnt.msg.MsgService$d";
        } else if (i >= 11650) {
            strM14531 = "com.tencent.qqnt.kernel.api.impl.MsgService$b";
        } else if (i == 9048) {
            strM14531 = "com.tencent.qqnt.kernel.api.impl.MsgService$d";
        } else if (i >= 6458) {
            strM14531 = "com.tencent.qqnt.msg.MsgService$c";
        }
        Class clsM15228 = AbstractC9919.m15228(strM14531);
        C7164 c7164M12413 = C7164.m12413(clsM15228);
        String strM145312 = "onRecvMsg";
        C2080 c2080 = c7164M12413.f17803;
        c2080.f3963 = strM145312;
        c2080.f3964 = new Class[]{ArrayList.class};
        Class cls = Void.TYPE;
        c2080.f3962 = cls;
        final int i2 = 0;
        AbstractC5894.m10598(c7164M12413.m12414(), new InterfaceC7019(this) { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏哲世兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6647 f16300;

            {
                this.f16300 = this;
            }

            @Override // p026.InterfaceC7019
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo9180(XC_MethodHook.MethodHookParam methodHookParam) {
                int i3 = i2;
                Class cls2 = Long.TYPE;
                C6647 c6647 = this.f16300;
                final int i4 = 0;
                switch (i3) {
                    case 0:
                        C6651 c6651 = C6647.f16291;
                        "param";
                        methodHookParam.getClass();
                        Object obj = methodHookParam.args[0];
                        "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>";
                        obj.getClass();
                        ArrayList arrayList = (ArrayList) obj;
                        ExecutorService executorService = c6647.f16292;
                        if (System.currentTimeMillis() - c6647.f16293 >= 2000 && !arrayList.isEmpty()) {
                            final Object obj2 = arrayList.get(0);
                            "get(...)";
                            obj2.getClass();
                            Long l = (Long) C9915.m15222(cls2, "msgId", obj2);
                            ArrayList arrayList2 = C6647.f16289;
                            if (!arrayList2.contains(l)) {
                                l.getClass();
                                if (arrayList2.size() >= 500) {
                                    arrayList2.clear();
                                }
                                arrayList2.add(l);
                                Iterator it = C6647.f16290.iterator();
                                "iterator(...)";
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    "next(...)";
                                    next.getClass();
                                    final InterfaceC6645 interfaceC6645 = (InterfaceC6645) next;
                                    executorService.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏哲兰世
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i5 = i4;
                                            Object obj3 = obj2;
                                            InterfaceC6645 interfaceC66452 = interfaceC6645;
                                            switch (i5) {
                                                case 0:
                                                    C6651 c66512 = C6647.f16291;
                                                    interfaceC66452.mo11423(obj3);
                                                    break;
                                                default:
                                                    C6651 c66513 = C6647.f16291;
                                                    interfaceC66452.mo11423(obj3);
                                                    break;
                                            }
                                        }
                                    });
                                }
                                Iterator it2 = C6647.f16288.iterator();
                                "iterator(...)";
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    "next(...)";
                                    next2.getClass();
                                    final C6646 c6646 = (C6646) next2;
                                    if (c6646.f16287.f17770.booleanValue()) {
                                        executorService.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏兰世哲
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i5 = i4;
                                                Object obj3 = obj2;
                                                C6646 c66462 = c6646;
                                                switch (i5) {
                                                    case 0:
                                                        C6651 c66512 = C6647.f16291;
                                                        c66462.f16286.mo11423(obj3);
                                                        break;
                                                    default:
                                                        C6651 c66513 = C6647.f16291;
                                                        c66462.f16286.mo11423(obj3);
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
                        C6651 c66512 = C6647.f16291;
                        "param";
                        methodHookParam.getClass();
                        Object obj3 = methodHookParam.args[0];
                        "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>";
                        obj3.getClass();
                        ArrayList arrayList3 = (ArrayList) obj3;
                        ExecutorService executorService2 = c6647.f16292;
                        if (System.currentTimeMillis() - c6647.f16293 >= 2000 && !arrayList3.isEmpty()) {
                            final Object obj4 = arrayList3.get(0);
                            "get(...)";
                            obj4.getClass();
                            Long l2 = (Long) C9915.m15222(cls2, "msgId", obj4);
                            ArrayList arrayList4 = C6647.f16289;
                            if (!arrayList4.contains(l2)) {
                                Integer num = (Integer) C9915.m15222(Integer.TYPE, "sendStatus", obj4);
                                if (num != null && num.intValue() == 2) {
                                    if (!((Boolean) C9915.m15222(Boolean.TYPE, "isOnlineMsg", obj4)).booleanValue() && String.valueOf((Long) C9915.m15222(cls2, "senderUin", obj4)).equals(QQEnvTool.getCurrentUin())) {
                                        l2.getClass();
                                        if (arrayList4.size() >= 500) {
                                            arrayList4.clear();
                                        }
                                        arrayList4.add(l2);
                                        Iterator it3 = C6647.f16290.iterator();
                                        "iterator(...)";
                                        it3.getClass();
                                        while (true) {
                                            final int i5 = 1;
                                            if (!it3.hasNext()) {
                                                Iterator it4 = C6647.f16288.iterator();
                                                "iterator(...)";
                                                it4.getClass();
                                                while (it4.hasNext()) {
                                                    Object next3 = it4.next();
                                                    "next(...)";
                                                    next3.getClass();
                                                    final C6646 c66462 = (C6646) next3;
                                                    if (c66462.f16287.f17770.booleanValue()) {
                                                        executorService2.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏兰世哲
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                int i52 = i5;
                                                                Object obj32 = obj4;
                                                                C6646 c664622 = c66462;
                                                                switch (i52) {
                                                                    case 0:
                                                                        C6651 c665122 = C6647.f16291;
                                                                        c664622.f16286.mo11423(obj32);
                                                                        break;
                                                                    default:
                                                                        C6651 c66513 = C6647.f16291;
                                                                        c664622.f16286.mo11423(obj32);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                    }
                                                }
                                            } else {
                                                Object next4 = it3.next();
                                                "next(...)";
                                                next4.getClass();
                                                final InterfaceC6645 interfaceC66452 = (InterfaceC6645) next4;
                                                executorService2.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏哲兰世
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i52 = i5;
                                                        Object obj32 = obj4;
                                                        InterfaceC6645 interfaceC664522 = interfaceC66452;
                                                        switch (i52) {
                                                            case 0:
                                                                C6651 c665122 = C6647.f16291;
                                                                interfaceC664522.mo11423(obj32);
                                                                break;
                                                            default:
                                                                C6651 c66513 = C6647.f16291;
                                                                interfaceC664522.mo11423(obj32);
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
        C7164 c7164M124132 = C7164.m12413(clsM15228);
        String strM145313 = "onMsgInfoListUpdate";
        C2080 c20802 = c7164M124132.f17803;
        c20802.f3963 = strM145313;
        c20802.f3964 = new Class[]{ArrayList.class};
        c20802.f3962 = cls;
        final int i3 = 1;
        AbstractC5894.m10598(c7164M124132.m12414(), new InterfaceC7019(this) { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏哲世兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6647 f16300;

            {
                this.f16300 = this;
            }

            @Override // p026.InterfaceC7019
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo9180(XC_MethodHook.MethodHookParam methodHookParam) {
                int i32 = i3;
                Class cls2 = Long.TYPE;
                C6647 c6647 = this.f16300;
                final int i4 = 0;
                switch (i32) {
                    case 0:
                        C6651 c6651 = C6647.f16291;
                        "param";
                        methodHookParam.getClass();
                        Object obj = methodHookParam.args[0];
                        "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>";
                        obj.getClass();
                        ArrayList arrayList = (ArrayList) obj;
                        ExecutorService executorService = c6647.f16292;
                        if (System.currentTimeMillis() - c6647.f16293 >= 2000 && !arrayList.isEmpty()) {
                            final Object obj2 = arrayList.get(0);
                            "get(...)";
                            obj2.getClass();
                            Long l = (Long) C9915.m15222(cls2, "msgId", obj2);
                            ArrayList arrayList2 = C6647.f16289;
                            if (!arrayList2.contains(l)) {
                                l.getClass();
                                if (arrayList2.size() >= 500) {
                                    arrayList2.clear();
                                }
                                arrayList2.add(l);
                                Iterator it = C6647.f16290.iterator();
                                "iterator(...)";
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    "next(...)";
                                    next.getClass();
                                    final InterfaceC6645 interfaceC6645 = (InterfaceC6645) next;
                                    executorService.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏哲兰世
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i52 = i4;
                                            Object obj32 = obj2;
                                            InterfaceC6645 interfaceC664522 = interfaceC6645;
                                            switch (i52) {
                                                case 0:
                                                    C6651 c665122 = C6647.f16291;
                                                    interfaceC664522.mo11423(obj32);
                                                    break;
                                                default:
                                                    C6651 c66513 = C6647.f16291;
                                                    interfaceC664522.mo11423(obj32);
                                                    break;
                                            }
                                        }
                                    });
                                }
                                Iterator it2 = C6647.f16288.iterator();
                                "iterator(...)";
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    "next(...)";
                                    next2.getClass();
                                    final C6646 c6646 = (C6646) next2;
                                    if (c6646.f16287.f17770.booleanValue()) {
                                        executorService.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏兰世哲
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i52 = i4;
                                                Object obj32 = obj2;
                                                C6646 c664622 = c6646;
                                                switch (i52) {
                                                    case 0:
                                                        C6651 c665122 = C6647.f16291;
                                                        c664622.f16286.mo11423(obj32);
                                                        break;
                                                    default:
                                                        C6651 c66513 = C6647.f16291;
                                                        c664622.f16286.mo11423(obj32);
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
                        C6651 c66512 = C6647.f16291;
                        "param";
                        methodHookParam.getClass();
                        Object obj3 = methodHookParam.args[0];
                        "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any>";
                        obj3.getClass();
                        ArrayList arrayList3 = (ArrayList) obj3;
                        ExecutorService executorService2 = c6647.f16292;
                        if (System.currentTimeMillis() - c6647.f16293 >= 2000 && !arrayList3.isEmpty()) {
                            final Object obj4 = arrayList3.get(0);
                            "get(...)";
                            obj4.getClass();
                            Long l2 = (Long) C9915.m15222(cls2, "msgId", obj4);
                            ArrayList arrayList4 = C6647.f16289;
                            if (!arrayList4.contains(l2)) {
                                Integer num = (Integer) C9915.m15222(Integer.TYPE, "sendStatus", obj4);
                                if (num != null && num.intValue() == 2) {
                                    if (!((Boolean) C9915.m15222(Boolean.TYPE, "isOnlineMsg", obj4)).booleanValue() && String.valueOf((Long) C9915.m15222(cls2, "senderUin", obj4)).equals(QQEnvTool.getCurrentUin())) {
                                        l2.getClass();
                                        if (arrayList4.size() >= 500) {
                                            arrayList4.clear();
                                        }
                                        arrayList4.add(l2);
                                        Iterator it3 = C6647.f16290.iterator();
                                        "iterator(...)";
                                        it3.getClass();
                                        while (true) {
                                            final int i5 = 1;
                                            if (!it3.hasNext()) {
                                                Iterator it4 = C6647.f16288.iterator();
                                                "iterator(...)";
                                                it4.getClass();
                                                while (it4.hasNext()) {
                                                    Object next3 = it4.next();
                                                    "next(...)";
                                                    next3.getClass();
                                                    final C6646 c66462 = (C6646) next3;
                                                    if (c66462.f16287.f17770.booleanValue()) {
                                                        executorService2.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏兰世哲
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                int i52 = i5;
                                                                Object obj32 = obj4;
                                                                C6646 c664622 = c66462;
                                                                switch (i52) {
                                                                    case 0:
                                                                        C6651 c665122 = C6647.f16291;
                                                                        c664622.f16286.mo11423(obj32);
                                                                        break;
                                                                    default:
                                                                        C6651 c66513 = C6647.f16291;
                                                                        c664622.f16286.mo11423(obj32);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                    }
                                                }
                                            } else {
                                                Object next4 = it3.next();
                                                "next(...)";
                                                next4.getClass();
                                                final InterfaceC6645 interfaceC66452 = (InterfaceC6645) next4;
                                                executorService2.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏哲兰世
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i52 = i5;
                                                        Object obj32 = obj4;
                                                        InterfaceC6645 interfaceC664522 = interfaceC66452;
                                                        switch (i52) {
                                                            case 0:
                                                                C6651 c665122 = C6647.f16291;
                                                                interfaceC664522.mo11423(obj32);
                                                                break;
                                                            default:
                                                                C6651 c66513 = C6647.f16291;
                                                                interfaceC664522.mo11423(obj32);
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
