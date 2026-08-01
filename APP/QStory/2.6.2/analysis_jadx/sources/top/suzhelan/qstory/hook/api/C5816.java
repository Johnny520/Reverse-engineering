package top.suzhelan.qstory.hook.api;

import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.AbstractC5061;
import lin.xposed.hook.util.qq.QQEnvTool;
import net.bytebuddy.description.method.MethodDescription;
import p010.InterfaceC6159;
import p026.AbstractC6298;
import p032.C6316;
import p035.AbstractC6340;
import p392.AbstractC9121;
import p392.C9117;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏世兰;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "top/suzhelan/qstory/hook/api/飘花落叶言子楪哲世兰苏", "top/suzhelan/qstory/hook/api/飘花落叶言子楪哲世苏兰", "top/suzhelan/qstory/hook/api/飘花落叶言子楪苏兰哲世", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5816 extends AbstractC6298 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ExecutorService f15947;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f15948 = System.currentTimeMillis();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5820 f15946 = new C5820();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final ArrayList f15944 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final ArrayList f15943 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final ArrayList f15945 = new ArrayList();

    public C5816() {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        AbstractC3056.m6668(-3937712401735222695L);
        executorServiceNewCachedThreadPool.getClass();
        this.f15947 = executorServiceNewCachedThreadPool;
    }

    public static final void addAPIMessageListener(InterfaceC5814 interfaceC5814) {
        f15946.addAPIMessageListener(interfaceC5814);
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        String strM6668 = AbstractC3056.m6668(-3937712371670451623L);
        int i = AbstractC6340.f17461;
        if (i >= 12290) {
            strM6668 = AbstractC3056.m6668(-3937712139742217639L);
        } else if (i >= 11650) {
            strM6668 = AbstractC3056.m6668(-3937712010893198759L);
        } else if (i == 9048) {
            strM6668 = AbstractC3056.m6668(-3937711796144833959L);
        } else if (i >= 6458) {
            strM6668 = AbstractC3056.m6668(-3937729276661728679L);
        }
        Class clsM14657 = AbstractC9121.m14657(strM6668);
        C6316 c6316M11826 = C6316.m11826(clsM14657);
        String strM66682 = AbstractC3056.m6668(-3937729044733494695L);
        C1245 c1245 = c6316M11826.f17409;
        c1245.f3617 = strM66682;
        c1245.f3618 = new Class[]{ArrayList.class};
        Class cls = Void.TYPE;
        c1245.f3616 = cls;
        final int i2 = 0;
        AbstractC5061.m10019(c6316M11826.m11827(), new InterfaceC6159(this) { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏哲世兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C5816 f15955;

            {
                this.f15955 = this;
            }

            @Override // p010.InterfaceC6159
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo8631(XC_MethodHook.MethodHookParam methodHookParam) {
                int i3 = i2;
                Class cls2 = Long.TYPE;
                C5816 c5816 = this.f15955;
                final int i4 = 0;
                switch (i3) {
                    case 0:
                        C5820 c5820 = C5816.f15946;
                        AbstractC3056.m6668(-3937697365054719399L);
                        methodHookParam.getClass();
                        Object obj = methodHookParam.args[0];
                        AbstractC3056.m6668(-3937715979442980263L);
                        obj.getClass();
                        ArrayList arrayList = (ArrayList) obj;
                        ExecutorService executorService = c5816.f15947;
                        if (System.currentTimeMillis() - c5816.f15948 >= 2000 && !arrayList.isEmpty()) {
                            final Object obj2 = arrayList.get(0);
                            AbstractC3056.m6668(-3937714957240763815L);
                            obj2.getClass();
                            Long l = (Long) C9117.m14649(cls2, AbstractC3056.m6668(-3937565221795923367L), obj2);
                            ArrayList arrayList2 = C5816.f15944;
                            if (!arrayList2.contains(l)) {
                                l.getClass();
                                if (arrayList2.size() >= 500) {
                                    arrayList2.clear();
                                }
                                arrayList2.add(l);
                                Iterator it = C5816.f15945.iterator();
                                AbstractC3056.m6668(-3937693916195980711L);
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    AbstractC3056.m6668(-3937693873246307751L);
                                    next.getClass();
                                    final InterfaceC5814 interfaceC5814 = (InterfaceC5814) next;
                                    executorService.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏哲兰世
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i5 = i4;
                                            Object obj3 = obj2;
                                            InterfaceC5814 interfaceC58142 = interfaceC5814;
                                            switch (i5) {
                                                case 0:
                                                    C5820 c58202 = C5816.f15946;
                                                    interfaceC58142.mo10807(obj3);
                                                    break;
                                                default:
                                                    C5820 c58203 = C5816.f15946;
                                                    interfaceC58142.mo10807(obj3);
                                                    break;
                                            }
                                        }
                                    });
                                }
                                Iterator it2 = C5816.f15943.iterator();
                                AbstractC3056.m6668(-3937693916195980711L);
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    AbstractC3056.m6668(-3937693873246307751L);
                                    next2.getClass();
                                    final C5815 c5815 = (C5815) next2;
                                    if (c5815.f15942.f17376.booleanValue()) {
                                        executorService.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏兰世哲
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i5 = i4;
                                                Object obj3 = obj2;
                                                C5815 c58152 = c5815;
                                                switch (i5) {
                                                    case 0:
                                                        C5820 c58202 = C5816.f15946;
                                                        c58152.f15941.mo10807(obj3);
                                                        break;
                                                    default:
                                                        C5820 c58203 = C5816.f15946;
                                                        c58152.f15941.mo10807(obj3);
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
                        C5820 c58202 = C5816.f15946;
                        AbstractC3056.m6668(-3937697365054719399L);
                        methodHookParam.getClass();
                        Object obj3 = methodHookParam.args[0];
                        AbstractC3056.m6668(-3937715979442980263L);
                        obj3.getClass();
                        ArrayList arrayList3 = (ArrayList) obj3;
                        ExecutorService executorService2 = c5816.f15947;
                        if (System.currentTimeMillis() - c5816.f15948 >= 2000 && !arrayList3.isEmpty()) {
                            final Object obj4 = arrayList3.get(0);
                            AbstractC3056.m6668(-3937714957240763815L);
                            obj4.getClass();
                            Long l2 = (Long) C9117.m14649(cls2, AbstractC3056.m6668(-3937565221795923367L), obj4);
                            ArrayList arrayList4 = C5816.f15944;
                            if (!arrayList4.contains(l2)) {
                                Integer num = (Integer) C9117.m14649(Integer.TYPE, AbstractC3056.m6668(-3937729001783821735L), obj4);
                                if (num != null && num.intValue() == 2) {
                                    if (!((Boolean) C9117.m14649(Boolean.TYPE, AbstractC3056.m6668(-3937728945949246887L), obj4)).booleanValue() && String.valueOf((Long) C9117.m14649(cls2, AbstractC3056.m6668(-3937611379809453479L), obj4)).equals(QQEnvTool.getCurrentUin())) {
                                        l2.getClass();
                                        if (arrayList4.size() >= 500) {
                                            arrayList4.clear();
                                        }
                                        arrayList4.add(l2);
                                        Iterator it3 = C5816.f15945.iterator();
                                        AbstractC3056.m6668(-3937693916195980711L);
                                        it3.getClass();
                                        while (true) {
                                            final int i5 = 1;
                                            if (!it3.hasNext()) {
                                                Iterator it4 = C5816.f15943.iterator();
                                                AbstractC3056.m6668(-3937693916195980711L);
                                                it4.getClass();
                                                while (it4.hasNext()) {
                                                    Object next3 = it4.next();
                                                    AbstractC3056.m6668(-3937693873246307751L);
                                                    next3.getClass();
                                                    final C5815 c58152 = (C5815) next3;
                                                    if (c58152.f15942.f17376.booleanValue()) {
                                                        executorService2.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏兰世哲
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                int i52 = i5;
                                                                Object obj32 = obj4;
                                                                C5815 c581522 = c58152;
                                                                switch (i52) {
                                                                    case 0:
                                                                        C5820 c582022 = C5816.f15946;
                                                                        c581522.f15941.mo10807(obj32);
                                                                        break;
                                                                    default:
                                                                        C5820 c58203 = C5816.f15946;
                                                                        c581522.f15941.mo10807(obj32);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                    }
                                                }
                                            } else {
                                                Object next4 = it3.next();
                                                AbstractC3056.m6668(-3937693873246307751L);
                                                next4.getClass();
                                                final InterfaceC5814 interfaceC58142 = (InterfaceC5814) next4;
                                                executorService2.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏哲兰世
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i52 = i5;
                                                        Object obj32 = obj4;
                                                        InterfaceC5814 interfaceC581422 = interfaceC58142;
                                                        switch (i52) {
                                                            case 0:
                                                                C5820 c582022 = C5816.f15946;
                                                                interfaceC581422.mo10807(obj32);
                                                                break;
                                                            default:
                                                                C5820 c58203 = C5816.f15946;
                                                                interfaceC581422.mo10807(obj32);
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
        C6316 c6316M118262 = C6316.m11826(clsM14657);
        String strM66683 = AbstractC3056.m6668(-3937729087683167655L);
        C1245 c12452 = c6316M118262.f17409;
        c12452.f3617 = strM66683;
        c12452.f3618 = new Class[]{ArrayList.class};
        c12452.f3616 = cls;
        final int i3 = 1;
        AbstractC5061.m10019(c6316M118262.m11827(), new InterfaceC6159(this) { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏哲世兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C5816 f15955;

            {
                this.f15955 = this;
            }

            @Override // p010.InterfaceC6159
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo8631(XC_MethodHook.MethodHookParam methodHookParam) {
                int i32 = i3;
                Class cls2 = Long.TYPE;
                C5816 c5816 = this.f15955;
                final int i4 = 0;
                switch (i32) {
                    case 0:
                        C5820 c5820 = C5816.f15946;
                        AbstractC3056.m6668(-3937697365054719399L);
                        methodHookParam.getClass();
                        Object obj = methodHookParam.args[0];
                        AbstractC3056.m6668(-3937715979442980263L);
                        obj.getClass();
                        ArrayList arrayList = (ArrayList) obj;
                        ExecutorService executorService = c5816.f15947;
                        if (System.currentTimeMillis() - c5816.f15948 >= 2000 && !arrayList.isEmpty()) {
                            final Object obj2 = arrayList.get(0);
                            AbstractC3056.m6668(-3937714957240763815L);
                            obj2.getClass();
                            Long l = (Long) C9117.m14649(cls2, AbstractC3056.m6668(-3937565221795923367L), obj2);
                            ArrayList arrayList2 = C5816.f15944;
                            if (!arrayList2.contains(l)) {
                                l.getClass();
                                if (arrayList2.size() >= 500) {
                                    arrayList2.clear();
                                }
                                arrayList2.add(l);
                                Iterator it = C5816.f15945.iterator();
                                AbstractC3056.m6668(-3937693916195980711L);
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    AbstractC3056.m6668(-3937693873246307751L);
                                    next.getClass();
                                    final InterfaceC5814 interfaceC5814 = (InterfaceC5814) next;
                                    executorService.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏哲兰世
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i52 = i4;
                                            Object obj32 = obj2;
                                            InterfaceC5814 interfaceC581422 = interfaceC5814;
                                            switch (i52) {
                                                case 0:
                                                    C5820 c582022 = C5816.f15946;
                                                    interfaceC581422.mo10807(obj32);
                                                    break;
                                                default:
                                                    C5820 c58203 = C5816.f15946;
                                                    interfaceC581422.mo10807(obj32);
                                                    break;
                                            }
                                        }
                                    });
                                }
                                Iterator it2 = C5816.f15943.iterator();
                                AbstractC3056.m6668(-3937693916195980711L);
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    AbstractC3056.m6668(-3937693873246307751L);
                                    next2.getClass();
                                    final C5815 c5815 = (C5815) next2;
                                    if (c5815.f15942.f17376.booleanValue()) {
                                        executorService.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏兰世哲
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i52 = i4;
                                                Object obj32 = obj2;
                                                C5815 c581522 = c5815;
                                                switch (i52) {
                                                    case 0:
                                                        C5820 c582022 = C5816.f15946;
                                                        c581522.f15941.mo10807(obj32);
                                                        break;
                                                    default:
                                                        C5820 c58203 = C5816.f15946;
                                                        c581522.f15941.mo10807(obj32);
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
                        C5820 c58202 = C5816.f15946;
                        AbstractC3056.m6668(-3937697365054719399L);
                        methodHookParam.getClass();
                        Object obj3 = methodHookParam.args[0];
                        AbstractC3056.m6668(-3937715979442980263L);
                        obj3.getClass();
                        ArrayList arrayList3 = (ArrayList) obj3;
                        ExecutorService executorService2 = c5816.f15947;
                        if (System.currentTimeMillis() - c5816.f15948 >= 2000 && !arrayList3.isEmpty()) {
                            final Object obj4 = arrayList3.get(0);
                            AbstractC3056.m6668(-3937714957240763815L);
                            obj4.getClass();
                            Long l2 = (Long) C9117.m14649(cls2, AbstractC3056.m6668(-3937565221795923367L), obj4);
                            ArrayList arrayList4 = C5816.f15944;
                            if (!arrayList4.contains(l2)) {
                                Integer num = (Integer) C9117.m14649(Integer.TYPE, AbstractC3056.m6668(-3937729001783821735L), obj4);
                                if (num != null && num.intValue() == 2) {
                                    if (!((Boolean) C9117.m14649(Boolean.TYPE, AbstractC3056.m6668(-3937728945949246887L), obj4)).booleanValue() && String.valueOf((Long) C9117.m14649(cls2, AbstractC3056.m6668(-3937611379809453479L), obj4)).equals(QQEnvTool.getCurrentUin())) {
                                        l2.getClass();
                                        if (arrayList4.size() >= 500) {
                                            arrayList4.clear();
                                        }
                                        arrayList4.add(l2);
                                        Iterator it3 = C5816.f15945.iterator();
                                        AbstractC3056.m6668(-3937693916195980711L);
                                        it3.getClass();
                                        while (true) {
                                            final int i5 = 1;
                                            if (!it3.hasNext()) {
                                                Iterator it4 = C5816.f15943.iterator();
                                                AbstractC3056.m6668(-3937693916195980711L);
                                                it4.getClass();
                                                while (it4.hasNext()) {
                                                    Object next3 = it4.next();
                                                    AbstractC3056.m6668(-3937693873246307751L);
                                                    next3.getClass();
                                                    final C5815 c58152 = (C5815) next3;
                                                    if (c58152.f15942.f17376.booleanValue()) {
                                                        executorService2.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏兰世哲
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                int i52 = i5;
                                                                Object obj32 = obj4;
                                                                C5815 c581522 = c58152;
                                                                switch (i52) {
                                                                    case 0:
                                                                        C5820 c582022 = C5816.f15946;
                                                                        c581522.f15941.mo10807(obj32);
                                                                        break;
                                                                    default:
                                                                        C5820 c58203 = C5816.f15946;
                                                                        c581522.f15941.mo10807(obj32);
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                    }
                                                }
                                            } else {
                                                Object next4 = it3.next();
                                                AbstractC3056.m6668(-3937693873246307751L);
                                                next4.getClass();
                                                final InterfaceC5814 interfaceC58142 = (InterfaceC5814) next4;
                                                executorService2.execute(new Runnable() { // from class: top.suzhelan.qstory.hook.api.飘花落叶言子楪苏哲兰世
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        int i52 = i5;
                                                        Object obj32 = obj4;
                                                        InterfaceC5814 interfaceC581422 = interfaceC58142;
                                                        switch (i52) {
                                                            case 0:
                                                                C5820 c582022 = C5816.f15946;
                                                                interfaceC581422.mo10807(obj32);
                                                                break;
                                                            default:
                                                                C5820 c58203 = C5816.f15946;
                                                                interfaceC581422.mo10807(obj32);
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
