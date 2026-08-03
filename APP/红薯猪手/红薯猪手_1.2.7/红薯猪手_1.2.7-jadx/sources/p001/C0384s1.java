package p001;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import com.tendcloud.tenddata.C0020ab;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p001.C0428v6;
import p001.C0481z7;

/* JADX INFO: renamed from: ۟.s1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0384s1 {

    /* JADX INFO: renamed from: ۥ */
    public final Context f1072;

    /* JADX INFO: renamed from: ۥ۟ */
    public final ExecutorService f1073;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final InterfaceC0449x1 f1769;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final LinkedHashMap f1770;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final WeakHashMap f1771;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final WeakHashMap f1772;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final HashSet f1773;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final a f1774;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final Handler f1775;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final InterfaceC0191e0 f1776;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public final C0215fa f1777;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public final ArrayList f1778;

    /* JADX INFO: renamed from: ۥ۠ */
    public final boolean f1074;

    /* JADX INFO: renamed from: ۟.s1$a */
    public static class a extends Handler {

        /* JADX INFO: renamed from: ۥ */
        public final C0384s1 f1075;

        /* JADX INFO: renamed from: ۟.s1$a$a, reason: collision with other inner class name */
        public class RunnableC0496a implements Runnable {

            /* JADX INFO: renamed from: ۥ */
            public final /* synthetic */ Message f1076;

            public RunnableC0496a(Message message) {
                this.f1076 = message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sbM1039 = C0167c4.m1039("Unknown handler message received: ");
                sbM1039.append(this.f1076.what);
                throw new AssertionError(sbM1039.toString());
            }
        }

        public a(Looper looper, C0384s1 c0384s1) {
            super(looper);
            this.f1075 = c0384s1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Code restructure failed: missing block: B:188:0x0340, code lost:
        
            throw new java.lang.IllegalStateException(p001.C0238h5.class.getName() + ".sizeOf() is reporting inconsistent results!");
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v14 */
        /* JADX WARN: Type inference failed for: r4v15 */
        /* JADX WARN: Type inference failed for: r4v17 */
        /* JADX WARN: Type inference failed for: r4v21 */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void handleMessage(Message message) {
            boolean zMo1252;
            NetworkInfo activeNetworkInfo = null;
            ArrayList arrayList = null;
            int i = 2;
            switch (message.what) {
                case 1:
                    this.f1075.m1224((AbstractC0204f) message.obj, true);
                    return;
                case 2:
                    AbstractC0204f abstractC0204f = (AbstractC0204f) message.obj;
                    C0384s1 c0384s1 = this.f1075;
                    c0384s1.getClass();
                    String str = abstractC0204f.f1432;
                    RunnableC0163c0 runnableC0163c0 = (RunnableC0163c0) c0384s1.f1770.get(str);
                    if (runnableC0163c0 != null) {
                        runnableC0163c0.m1028(abstractC0204f);
                        if (runnableC0163c0.m830()) {
                            c0384s1.f1770.remove(str);
                            if (abstractC0204f.f773.f1916) {
                                abstractC0204f.f774.m958();
                                StringBuilder sb = C0259ic.f866;
                            }
                        }
                    }
                    if (c0384s1.f1773.contains(abstractC0204f.f1433)) {
                        c0384s1.f1772.remove(abstractC0204f.m1061());
                        if (abstractC0204f.f773.f1916) {
                            abstractC0204f.f774.m958();
                            StringBuilder sb2 = C0259ic.f866;
                        }
                    }
                    AbstractC0204f abstractC0204f2 = (AbstractC0204f) c0384s1.f1771.remove(abstractC0204f.m1061());
                    if (abstractC0204f2 == null || !abstractC0204f2.f773.f1916) {
                        return;
                    }
                    abstractC0204f2.f774.m958();
                    StringBuilder sb3 = C0259ic.f866;
                    return;
                case 3:
                case 8:
                default:
                    C0481z7.f1228.post(new RunnableC0496a(message));
                    return;
                case 4:
                    RunnableC0163c0 runnableC0163c02 = (RunnableC0163c0) message.obj;
                    C0384s1 c0384s12 = this.f1075;
                    c0384s12.getClass();
                    if ((runnableC0163c02.f1350 & 2) == 0) {
                        InterfaceC0191e0 interfaceC0191e0 = c0384s12.f1776;
                        String str2 = runnableC0163c02.f1348;
                        Bitmap bitmap = runnableC0163c02.f718;
                        C0238h5 c0238h5 = (C0238h5) interfaceC0191e0;
                        c0238h5.getClass();
                        if (str2 == null || bitmap == null) {
                            throw new NullPointerException("key == null || bitmap == null");
                        }
                        synchronized (c0238h5) {
                            c0238h5.f1496 += C0259ic.m873(bitmap);
                            Bitmap bitmapPut = c0238h5.f830.put(str2, bitmap);
                            if (bitmapPut != null) {
                                c0238h5.f1496 -= C0259ic.m873(bitmapPut);
                            }
                            break;
                        }
                        int i2 = c0238h5.f831;
                        while (true) {
                            synchronized (c0238h5) {
                                if (c0238h5.f1496 >= 0 && (!c0238h5.f830.isEmpty() || c0238h5.f1496 == 0)) {
                                    if (c0238h5.f1496 > i2 && !c0238h5.f830.isEmpty()) {
                                        Map.Entry<String, Bitmap> next = c0238h5.f830.entrySet().iterator().next();
                                        String key = next.getKey();
                                        Bitmap value = next.getValue();
                                        c0238h5.f830.remove(key);
                                        c0238h5.f1496 -= C0259ic.m873(value);
                                    }
                                }
                            }
                        }
                        break;
                    }
                    c0384s12.f1770.remove(runnableC0163c02.f1348);
                    c0384s12.m933(runnableC0163c02);
                    if (runnableC0163c02.f717.f1916) {
                        C0259ic.m1095(runnableC0163c02);
                        return;
                    }
                    return;
                case 5:
                    RunnableC0163c0 runnableC0163c03 = (RunnableC0163c0) message.obj;
                    C0384s1 c0384s13 = this.f1075;
                    c0384s13.getClass();
                    Future<?> future = runnableC0163c03.f1355;
                    if ((future != null && future.isCancelled()) == true) {
                        return;
                    }
                    if (c0384s13.f1073.isShutdown()) {
                        c0384s13.m1223(runnableC0163c03);
                        return;
                    }
                    if (c0384s13.f1074) {
                        Context context = c0384s13.f1072;
                        StringBuilder sb4 = C0259ic.f866;
                        activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                    }
                    ?? r4 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                    int i3 = runnableC0163c03.f1359;
                    if ((i3 > 0) == true) {
                        runnableC0163c03.f1359 = i3 - 1;
                        zMo1252 = runnableC0163c03.f1352.mo1252(activeNetworkInfo);
                    } else {
                        zMo1252 = false;
                    }
                    AbstractC0469y8 abstractC0469y8 = runnableC0163c03.f1352;
                    abstractC0469y8.getClass();
                    boolean z = abstractC0469y8 instanceof C0428v6;
                    if (!zMo1252) {
                        boolean z2 = c0384s13.f1074 && z;
                        c0384s13.m1223(runnableC0163c03);
                        if (!z2) {
                            return;
                        }
                    } else {
                        if (!c0384s13.f1074 || r4 == true) {
                            if (runnableC0163c03.f717.f1916) {
                                C0259ic.m1095(runnableC0163c03);
                            }
                            if (runnableC0163c03.f1357 instanceof C0428v6.a) {
                                runnableC0163c03.f1351 = 1 | runnableC0163c03.f1351;
                            }
                            runnableC0163c03.f1355 = c0384s13.f1073.submit(runnableC0163c03);
                            return;
                        }
                        c0384s13.m1223(runnableC0163c03);
                        if (!z) {
                            return;
                        }
                    }
                    c0384s13.m1222(runnableC0163c03);
                    return;
                case 6:
                    this.f1075.m1223((RunnableC0163c0) message.obj);
                    return;
                case 7:
                    C0384s1 c0384s14 = this.f1075;
                    c0384s14.getClass();
                    ArrayList<RunnableC0163c0> arrayList2 = new ArrayList(c0384s14.f1778);
                    c0384s14.f1778.clear();
                    Handler handler = c0384s14.f1775;
                    handler.sendMessage(handler.obtainMessage(8, arrayList2));
                    if (!arrayList2.isEmpty() && ((RunnableC0163c0) arrayList2.get(0)).f717.f1916) {
                        StringBuilder sb5 = new StringBuilder();
                        for (RunnableC0163c0 runnableC0163c04 : arrayList2) {
                            if (sb5.length() > 0) {
                                sb5.append(", ");
                            }
                            sb5.append(C0259ic.m1095(runnableC0163c04));
                        }
                        StringBuilder sb6 = C0259ic.f866;
                        return;
                    }
                    return;
                case C0020ab.b.API_TYPE_ACCOUNT /* 9 */:
                    NetworkInfo networkInfo = (NetworkInfo) message.obj;
                    C0384s1 c0384s15 = this.f1075;
                    ExecutorService executorService = c0384s15.f1073;
                    if (executorService instanceof C0157b8) {
                        C0157b8 c0157b8 = (C0157b8) executorService;
                        if (networkInfo != null) {
                            c0157b8.getClass();
                            if (networkInfo.isConnectedOrConnecting()) {
                                int type = networkInfo.getType();
                                if (type == 0) {
                                    int subtype = networkInfo.getSubtype();
                                    switch (subtype) {
                                        case 1:
                                        case 2:
                                            c0157b8.setCorePoolSize(1);
                                            c0157b8.setMaximumPoolSize(1);
                                            break;
                                        default:
                                            if (subtype != 12) {
                                            }
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                            c0157b8.setCorePoolSize(i);
                                            c0157b8.setMaximumPoolSize(i);
                                            break;
                                    }
                                } else {
                                    i = (type == 1 || type == 6 || type == 9) ? 4 : 3;
                                    c0157b8.setCorePoolSize(i);
                                    c0157b8.setMaximumPoolSize(i);
                                }
                            } else {
                                c0157b8.setCorePoolSize(3);
                                c0157b8.setMaximumPoolSize(3);
                            }
                        }
                    }
                    if (networkInfo == null || !networkInfo.isConnected() || c0384s15.f1771.isEmpty()) {
                        return;
                    }
                    Iterator it = c0384s15.f1771.values().iterator();
                    while (it.hasNext()) {
                        AbstractC0204f abstractC0204f3 = (AbstractC0204f) it.next();
                        it.remove();
                        if (abstractC0204f3.f773.f1916) {
                            abstractC0204f3.f774.m958();
                            StringBuilder sb7 = C0259ic.f866;
                        }
                        c0384s15.m1224(abstractC0204f3, false);
                    }
                    return;
                case 10:
                    C0384s1 c0384s16 = this.f1075;
                    int i4 = message.arg1;
                    c0384s16.getClass();
                    return;
                case 11:
                    Object obj = message.obj;
                    C0384s1 c0384s17 = this.f1075;
                    if (c0384s17.f1773.add(obj)) {
                        Iterator it2 = c0384s17.f1770.values().iterator();
                        while (it2.hasNext()) {
                            RunnableC0163c0 runnableC0163c05 = (RunnableC0163c0) it2.next();
                            boolean z3 = runnableC0163c05.f717.f1916;
                            AbstractC0204f abstractC0204f4 = runnableC0163c05.f1353;
                            ArrayList arrayList3 = runnableC0163c05.f1354;
                            ?? r8 = (arrayList3 == null || arrayList3.isEmpty()) ? false : true;
                            if (abstractC0204f4 != null || r8 != false) {
                                if (abstractC0204f4 != null && abstractC0204f4.f1433.equals(obj)) {
                                    runnableC0163c05.m1028(abstractC0204f4);
                                    c0384s17.f1772.put(abstractC0204f4.m1061(), abstractC0204f4);
                                    if (z3) {
                                        abstractC0204f4.f774.m958();
                                        Objects.toString(obj);
                                        StringBuilder sb8 = C0259ic.f866;
                                    }
                                }
                                if (r8 != false) {
                                    for (int size = arrayList3.size() - 1; size >= 0; size--) {
                                        AbstractC0204f abstractC0204f5 = (AbstractC0204f) arrayList3.get(size);
                                        if (abstractC0204f5.f1433.equals(obj)) {
                                            runnableC0163c05.m1028(abstractC0204f5);
                                            c0384s17.f1772.put(abstractC0204f5.m1061(), abstractC0204f5);
                                            if (z3) {
                                                abstractC0204f5.f774.m958();
                                                Objects.toString(obj);
                                                StringBuilder sb9 = C0259ic.f866;
                                            }
                                        }
                                    }
                                }
                                if (runnableC0163c05.m830()) {
                                    it2.remove();
                                    if (z3) {
                                        C0259ic.m1095(runnableC0163c05);
                                    }
                                }
                            }
                        }
                        return;
                    }
                    return;
                case 12:
                    Object obj2 = message.obj;
                    C0384s1 c0384s18 = this.f1075;
                    if (c0384s18.f1773.remove(obj2)) {
                        Iterator it3 = c0384s18.f1772.values().iterator();
                        while (it3.hasNext()) {
                            AbstractC0204f abstractC0204f6 = (AbstractC0204f) it3.next();
                            if (abstractC0204f6.f1433.equals(obj2)) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(abstractC0204f6);
                                it3.remove();
                            }
                        }
                        if (arrayList != null) {
                            Handler handler2 = c0384s18.f1775;
                            handler2.sendMessage(handler2.obtainMessage(13, arrayList));
                            return;
                        }
                        return;
                    }
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: ۟.s1$b */
    public static class b extends HandlerThread {
        public b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* JADX INFO: renamed from: ۟.s1$c */
    public static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: ۥ */
        public final C0384s1 f1077;

        public c(C0384s1 c0384s1) {
            this.f1077 = c0384s1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra("state")) {
                    C0384s1 c0384s1 = this.f1077;
                    boolean booleanExtra = intent.getBooleanExtra("state", false);
                    a aVar = c0384s1.f1774;
                    aVar.sendMessage(aVar.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                    return;
                }
                return;
            }
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                StringBuilder sb = C0259ic.f866;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                C0384s1 c0384s12 = this.f1077;
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                a aVar2 = c0384s12.f1774;
                aVar2.sendMessage(aVar2.obtainMessage(9, activeNetworkInfo));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0384s1(Context context, ExecutorService executorService, C0481z7.a aVar, InterfaceC0449x1 interfaceC0449x1, InterfaceC0191e0 interfaceC0191e0, C0215fa c0215fa) {
        b bVar = new b();
        bVar.start();
        Looper looper = bVar.getLooper();
        StringBuilder sb = C0259ic.f866;
        HandlerC0245hc handlerC0245hc = new HandlerC0245hc(looper);
        handlerC0245hc.sendMessageDelayed(handlerC0245hc.obtainMessage(), 1000L);
        this.f1072 = context;
        this.f1073 = executorService;
        this.f1770 = new LinkedHashMap();
        this.f1771 = new WeakHashMap();
        this.f1772 = new WeakHashMap();
        this.f1773 = new HashSet();
        this.f1774 = new a(bVar.getLooper(), this);
        this.f1769 = interfaceC0449x1;
        this.f1775 = aVar;
        this.f1776 = interfaceC0191e0;
        this.f1777 = c0215fa;
        this.f1778 = new ArrayList(4);
        try {
            Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (NullPointerException unused) {
        }
        this.f1074 = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
        c cVar = new c(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        if (cVar.f1077.f1074) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        cVar.f1077.f1072.registerReceiver(cVar, intentFilter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ */
    public final void m933(RunnableC0163c0 runnableC0163c0) {
        Future<?> future = runnableC0163c0.f1355;
        if (future != null && future.isCancelled()) {
            return;
        }
        this.f1778.add(runnableC0163c0);
        if (this.f1774.hasMessages(7)) {
            return;
        }
        this.f1774.sendEmptyMessageDelayed(7, 200L);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m934(RunnableC0163c0 runnableC0163c0) {
        a aVar = this.f1774;
        aVar.sendMessage(aVar.obtainMessage(4, runnableC0163c0));
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m1220(RunnableC0163c0 runnableC0163c0) {
        a aVar = this.f1774;
        aVar.sendMessage(aVar.obtainMessage(6, runnableC0163c0));
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final void m1221(RunnableC0163c0 runnableC0163c0) {
        a aVar = this.f1774;
        aVar.sendMessageDelayed(aVar.obtainMessage(5, runnableC0163c0), 500L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final void m1222(RunnableC0163c0 runnableC0163c0) {
        Object objM1061;
        AbstractC0204f abstractC0204f = runnableC0163c0.f1353;
        if (abstractC0204f != null && (objM1061 = abstractC0204f.m1061()) != null) {
            abstractC0204f.f1434 = true;
            this.f1771.put(objM1061, abstractC0204f);
        }
        ArrayList arrayList = runnableC0163c0.f1354;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AbstractC0204f abstractC0204f2 = (AbstractC0204f) arrayList.get(i);
                Object objM10612 = abstractC0204f2.m1061();
                if (objM10612 != null) {
                    abstractC0204f2.f1434 = true;
                    this.f1771.put(objM10612, abstractC0204f2);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final void m1223(RunnableC0163c0 runnableC0163c0) {
        if (runnableC0163c0.f717.f1916) {
            C0259ic.m1095(runnableC0163c0);
        }
        this.f1770.remove(runnableC0163c0.f1348);
        m933(runnableC0163c0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final void m1224(AbstractC0204f abstractC0204f, boolean z) {
        RunnableC0163c0 runnableC0163c0;
        if (this.f1773.contains(abstractC0204f.f1433)) {
            this.f1772.put(abstractC0204f.m1061(), abstractC0204f);
            if (abstractC0204f.f773.f1916) {
                abstractC0204f.f774.m958();
                Objects.toString(abstractC0204f.f1433);
                StringBuilder sb = C0259ic.f866;
                return;
            }
            return;
        }
        RunnableC0163c0 runnableC0163c02 = (RunnableC0163c0) this.f1770.get(abstractC0204f.f1432);
        if (runnableC0163c02 != null) {
            boolean z2 = runnableC0163c02.f717.f1916;
            C0443w8 c0443w8 = abstractC0204f.f774;
            if (runnableC0163c02.f1353 != null) {
                if (runnableC0163c02.f1354 == null) {
                    runnableC0163c02.f1354 = new ArrayList(3);
                }
                runnableC0163c02.f1354.add(abstractC0204f);
                if (z2) {
                    c0443w8.m958();
                    C0259ic.m1096(runnableC0163c02, "to ");
                }
                int i = abstractC0204f.f774.f1854;
                if (C0167c4.m1040(i) > C0167c4.m1040(runnableC0163c02.f1360)) {
                    runnableC0163c02.f1360 = i;
                    return;
                }
                return;
            }
            runnableC0163c02.f1353 = abstractC0204f;
            if (z2) {
                ArrayList arrayList = runnableC0163c02.f1354;
                if (arrayList == null || arrayList.isEmpty()) {
                    c0443w8.m958();
                    StringBuilder sb2 = C0259ic.f866;
                    return;
                } else {
                    c0443w8.m958();
                    C0259ic.m1096(runnableC0163c02, "to ");
                    return;
                }
            }
            return;
        }
        if (this.f1073.isShutdown()) {
            if (abstractC0204f.f773.f1916) {
                abstractC0204f.f774.m958();
                StringBuilder sb3 = C0259ic.f866;
                return;
            }
            return;
        }
        C0481z7 c0481z7 = abstractC0204f.f773;
        InterfaceC0191e0 interfaceC0191e0 = this.f1776;
        C0215fa c0215fa = this.f1777;
        Object obj = RunnableC0163c0.f1341;
        C0443w8 c0443w82 = abstractC0204f.f774;
        List<AbstractC0469y8> list = c0481z7.f1230;
        int i2 = 0;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                runnableC0163c0 = new RunnableC0163c0(c0481z7, this, interfaceC0191e0, c0215fa, abstractC0204f, RunnableC0163c0.f1344);
                break;
            }
            AbstractC0469y8 abstractC0469y8 = list.get(i2);
            if (abstractC0469y8.mo831(c0443w82)) {
                runnableC0163c0 = new RunnableC0163c0(c0481z7, this, interfaceC0191e0, c0215fa, abstractC0204f, abstractC0469y8);
                break;
            }
            i2++;
        }
        runnableC0163c0.f1355 = this.f1073.submit(runnableC0163c0);
        this.f1770.put(abstractC0204f.f1432, runnableC0163c0);
        if (z) {
            this.f1771.remove(abstractC0204f.m1061());
        }
        if (abstractC0204f.f773.f1916) {
            abstractC0204f.f774.m958();
            StringBuilder sb4 = C0259ic.f866;
        }
    }
}
