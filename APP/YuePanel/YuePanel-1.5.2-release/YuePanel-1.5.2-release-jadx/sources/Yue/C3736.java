package Yue;

import Yue.InterfaceC7042;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3736 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۢۢ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", m1273f = "Channels.common.kt", m1274i = {0, 0}, m1275l = {104}, m1276m = "consumeEach", m1277n = {"action", "$this$consume$iv"}, m1278s = {"L$0", "L$1"})
    public static final class C0245<E> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6685;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6686;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f6687;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f6688;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f6689;

        public C0245(InterfaceC4199<? super C0245> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6688 = obj;
            this.f6689 |= Integer.MIN_VALUE;
            return C3736.m10283(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۢۢ$ۥ۟ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", m1273f = "Channels.common.kt", m1274i = {0, 0}, m1275l = {129}, m1276m = "consumeEach", m1277n = {"action", "channel$iv"}, m1278s = {"L$0", "L$1"})
    public static final class C0246<E> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6690;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6691;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f6692;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f6693;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f6694;

        public C0246(InterfaceC4199<? super C0246> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6693 = obj;
            this.f6694 |= Integer.MIN_VALUE;
            return C3736.m10282(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۢۢ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", m1273f = "Channels.common.kt", m1274i = {0, 0}, m1275l = {148}, m1276m = "toList", m1277n = {"$this$toList_u24lambda_u2d3", "$this$consume$iv$iv"}, m1278s = {"L$1", "L$2"})
    public static final class C3737<E> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6695;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f6696;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f6697;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public Object f6698;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public /* synthetic */ Object f6699;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public int f6700;

        public C3737(InterfaceC4199<? super C3737> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6699 = obj;
            this.f6700 |= Integer.MIN_VALUE;
            return C3734.m10269(null, this);
        }
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ */
    public static final void m813(@InterfaceC6399 InterfaceC7042<?> interfaceC7042, @InterfaceC6489 Throwable th) {
        if (th != null) {
            cancellationExceptionM1654 = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionM1654 == null) {
                cancellationExceptionM1654 = C4739.m1654("Channel was consumed, consumer had failed", th);
            }
        }
        interfaceC7042.mo5718(cancellationExceptionM1654);
    }

    @InterfaceC6501
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <E, R> R m814(@InterfaceC6399 InterfaceC3592<E> interfaceC3592, @InterfaceC6399 InterfaceC5124<? super InterfaceC7042<? extends E>, ? extends R> interfaceC5124) {
        InterfaceC7042<E> interfaceC7042Mo6940 = interfaceC3592.mo6940();
        try {
            return interfaceC5124.invoke(interfaceC7042Mo6940);
        } finally {
            C5437.m16930(1);
            InterfaceC7042.C1149.m3336(interfaceC7042Mo6940, null, 1, null);
            C5437.m16929(1);
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <E, R> R m10281(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 InterfaceC5124<? super InterfaceC7042<? extends E>, ? extends R> interfaceC5124) {
        try {
            R rInvoke = interfaceC5124.invoke(interfaceC7042);
            C5437.m16930(1);
            C3734.m810(interfaceC7042, null);
            C5437.m16929(1);
            return rInvoke;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:26:0x0065, B:28:0x006d, B:31:0x007a), top: B:42:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #1 {all -> 0x0077, blocks: (B:26:0x0065, B:28:0x006d, B:31:0x007a), top: B:42:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0061 -> B:14:0x0038). Please report as a decompilation issue!!! */
    @InterfaceC6489
    @InterfaceC6501
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> Object m10282(@InterfaceC6399 InterfaceC3592<E> interfaceC3592, @InterfaceC6399 InterfaceC5124<? super E, C8107> interfaceC5124, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) throws Throwable {
        C0246 c0246;
        InterfaceC7042<E> interfaceC7042;
        Throwable th;
        InterfaceC7042<E> interfaceC70422;
        InterfaceC3728 it;
        Object objMo38;
        if (interfaceC4199 instanceof C0246) {
            c0246 = (C0246) interfaceC4199;
            int i = c0246.f6694;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0246.f6694 = i - Integer.MIN_VALUE;
            } else {
                c0246 = new C0246(interfaceC4199);
            }
        }
        Object obj = c0246.f6693;
        Object objM17142 = C5508.m17142();
        int i2 = c0246.f6694;
        if (i2 == 0) {
            C7149.m22422(obj);
            InterfaceC7042<E> interfaceC7042Mo6940 = interfaceC3592.mo6940();
            try {
                interfaceC70422 = interfaceC7042Mo6940;
                it = interfaceC7042Mo6940.iterator();
                c0246.f6690 = interfaceC5124;
                c0246.f6691 = interfaceC70422;
                c0246.f6692 = it;
                c0246.f6694 = 1;
                objMo38 = it.mo38(c0246);
                if (objMo38 != objM17142) {
                }
            } catch (Throwable th2) {
                interfaceC7042 = interfaceC7042Mo6940;
                th = th2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (InterfaceC3728) c0246.f6692;
            interfaceC7042 = (InterfaceC7042) c0246.f6691;
            InterfaceC5124<? super E, C8107> interfaceC51242 = (InterfaceC5124) c0246.f6690;
            try {
                C7149.m22422(obj);
                C0246 c02462 = c0246;
                InterfaceC7042<E> interfaceC70423 = interfaceC7042;
                interfaceC5124 = interfaceC51242;
                C0246 c02463 = c02462;
                try {
                    if (!((Boolean) obj).booleanValue()) {
                        interfaceC5124.invoke((Object) it.next());
                        interfaceC70422 = interfaceC70423;
                        c0246 = c02463;
                        try {
                            c0246.f6690 = interfaceC5124;
                            c0246.f6691 = interfaceC70422;
                            c0246.f6692 = it;
                            c0246.f6694 = 1;
                            objMo38 = it.mo38(c0246);
                            if (objMo38 != objM17142) {
                                return objM17142;
                            }
                            c02462 = c0246;
                            interfaceC70423 = interfaceC70422;
                            obj = objMo38;
                            C0246 c024632 = c02462;
                            if (!((Boolean) obj).booleanValue()) {
                                C8107 c8107 = C8107.f3222;
                                C5437.m16930(1);
                                InterfaceC7042.C1149.m3336(interfaceC70423, null, 1, null);
                                C5437.m16929(1);
                                return c8107;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            interfaceC7042 = interfaceC70422;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    interfaceC7042 = interfaceC70423;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        C5437.m16930(1);
        InterfaceC7042.C1149.m3336(interfaceC7042, null, 1, null);
        C5437.m16929(1);
        throw th;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:21:0x004a, B:28:0x006d), top: B:37:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x005c, B:27:0x0064, B:21:0x004a, B:28:0x006d), top: B:37:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0059 -> B:25:0x005c). Please report as a decompilation issue!!! */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> Object m10283(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 InterfaceC5124<? super E, C8107> interfaceC5124, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        C0245 c0245;
        InterfaceC7042<? extends E> interfaceC70422;
        Throwable th;
        InterfaceC3728 it;
        InterfaceC5124<? super E, C8107> interfaceC51242;
        Object objMo38;
        if (interfaceC4199 instanceof C0245) {
            c0245 = (C0245) interfaceC4199;
            int i = c0245.f6689;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0245.f6689 = i - Integer.MIN_VALUE;
            } else {
                c0245 = new C0245(interfaceC4199);
            }
        }
        Object obj = c0245.f6688;
        Object objM17142 = C5508.m17142();
        int i2 = c0245.f6689;
        if (i2 == 0) {
            C7149.m22422(obj);
            try {
                interfaceC70422 = interfaceC7042;
                it = interfaceC7042.iterator();
                interfaceC51242 = interfaceC5124;
                c0245.f6685 = interfaceC51242;
                c0245.f6686 = interfaceC70422;
                c0245.f6687 = it;
                c0245.f6689 = 1;
                objMo38 = it.mo38(c0245);
                if (objMo38 != objM17142) {
                }
            } catch (Throwable th2) {
                interfaceC70422 = interfaceC7042;
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (InterfaceC3728) c0245.f6687;
            interfaceC70422 = (InterfaceC7042) c0245.f6686;
            InterfaceC5124<? super E, C8107> interfaceC51243 = (InterfaceC5124) c0245.f6685;
            try {
                C7149.m22422(obj);
                if (!((Boolean) obj).booleanValue()) {
                    interfaceC51243.invoke((Object) it.next());
                    interfaceC51242 = interfaceC51243;
                    c0245.f6685 = interfaceC51242;
                    c0245.f6686 = interfaceC70422;
                    c0245.f6687 = it;
                    c0245.f6689 = 1;
                    objMo38 = it.mo38(c0245);
                    if (objMo38 != objM17142) {
                        return objM17142;
                    }
                    interfaceC51243 = interfaceC51242;
                    obj = objMo38;
                    if (!((Boolean) obj).booleanValue()) {
                        C8107 c8107 = C8107.f3222;
                        C5437.m16930(1);
                        C3734.m810(interfaceC70422, null);
                        C5437.m16929(1);
                        return c8107;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    C5437.m16930(1);
                    C3734.m810(interfaceC70422, th);
                    C5437.m16929(1);
                    throw th4;
                }
            }
        }
    }

    @InterfaceC6501
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <E> Object m10284(InterfaceC3592<E> interfaceC3592, InterfaceC5124<? super E, C8107> interfaceC5124, InterfaceC4199<? super C8107> interfaceC4199) {
        InterfaceC7042<E> interfaceC7042Mo6940 = interfaceC3592.mo6940();
        try {
            InterfaceC3728<E> it = interfaceC7042Mo6940.iterator();
            while (true) {
                C5437.m16931(3);
                C5437.m16931(0);
                Object objMo38 = it.mo38(null);
                C5437.m16931(1);
                if (!((Boolean) objMo38).booleanValue()) {
                    C8107 c8107 = C8107.f3222;
                    C5437.m16930(1);
                    InterfaceC7042.C1149.m3336(interfaceC7042Mo6940, null, 1, null);
                    C5437.m16929(1);
                    return c8107;
                }
                interfaceC5124.invoke(it.next());
            }
        } catch (Throwable th) {
            C5437.m16930(1);
            InterfaceC7042.C1149.m3336(interfaceC7042Mo6940, null, 1, null);
            C5437.m16929(1);
            throw th;
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <E> Object m10285(InterfaceC7042<? extends E> interfaceC7042, InterfaceC5124<? super E, C8107> interfaceC5124, InterfaceC4199<? super C8107> interfaceC4199) {
        try {
            InterfaceC3728<? extends E> it = interfaceC7042.iterator();
            while (true) {
                C5437.m16931(3);
                C5437.m16931(0);
                Object objMo38 = it.mo38(null);
                C5437.m16931(1);
                if (!((Boolean) objMo38).booleanValue()) {
                    C8107 c8107 = C8107.f3222;
                    C5437.m16930(1);
                    C3734.m810(interfaceC7042, null);
                    C5437.m16929(1);
                    return c8107;
                }
                interfaceC5124.invoke(it.next());
            }
        } finally {
        }
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in the favour of 'onReceiveCatching'")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <E> InterfaceC7287<E> m10286(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042) {
        return interfaceC7042.mo5723();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۟ۧۤۢ<? super E> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @InterfaceC7097(expression = "receiveCatching().getOrNull()", imports = {}))
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <E> Object m10287(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 InterfaceC4199<? super E> interfaceC4199) {
        return interfaceC7042.mo5725(interfaceC4199);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:25:0x0067, B:27:0x006f, B:28:0x0078), top: B:43:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0035, B:25:0x0067, B:27:0x006f, B:28:0x0078), top: B:43:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:25:0x0067). Please report as a decompilation issue!!! */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> Object m10288(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 InterfaceC4199<? super List<? extends E>> interfaceC4199) {
        C3737 c3737;
        InterfaceC7042<? extends E> interfaceC70422;
        Throwable th;
        List list;
        InterfaceC3728 it;
        ?? r4;
        Object objMo38;
        if (interfaceC4199 instanceof C3737) {
            c3737 = (C3737) interfaceC4199;
            int i = c3737.f6700;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3737.f6700 = i - Integer.MIN_VALUE;
            } else {
                c3737 = new C3737(interfaceC4199);
            }
        }
        Object obj = c3737.f6699;
        Object objM17142 = C5508.m17142();
        int i2 = c3737.f6700;
        if (i2 == 0) {
            C7149.m22422(obj);
            try {
                List listM10713 = C3879.m10713();
                list = listM10713;
                interfaceC70422 = interfaceC7042;
                it = interfaceC7042.iterator();
                r4 = listM10713;
                c3737.f6695 = list;
                c3737.f6696 = r4;
                c3737.f6697 = interfaceC70422;
                c3737.f6698 = it;
                c3737.f6700 = 1;
                objMo38 = it.mo38(c3737);
                if (objMo38 != objM17142) {
                }
            } catch (Throwable th2) {
                interfaceC70422 = interfaceC7042;
                th = th2;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (InterfaceC3728) c3737.f6698;
            InterfaceC7042<? extends E> interfaceC70423 = (InterfaceC7042) c3737.f6697;
            List list2 = (List) c3737.f6696;
            List list3 = (List) c3737.f6695;
            try {
                C7149.m22422(obj);
                ?? r42 = list2;
                List list4 = list3;
                if (!((Boolean) obj).booleanValue()) {
                    r42.add(it.next());
                    interfaceC70422 = interfaceC70423;
                    r4 = r42;
                    list = list4;
                    try {
                        c3737.f6695 = list;
                        c3737.f6696 = r4;
                        c3737.f6697 = interfaceC70422;
                        c3737.f6698 = it;
                        c3737.f6700 = 1;
                        objMo38 = it.mo38(c3737);
                        if (objMo38 != objM17142) {
                            return objM17142;
                        }
                        interfaceC70423 = interfaceC70422;
                        obj = objMo38;
                        r42 = r4;
                        list4 = list;
                        if (!((Boolean) obj).booleanValue()) {
                            C8107 c8107 = C8107.f3222;
                            C3734.m810(interfaceC70423, null);
                            return C3879.m917(list4);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            C3734.m810(interfaceC70422, th);
                            throw th4;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                interfaceC70422 = interfaceC70423;
                throw th;
            }
        }
    }
}
