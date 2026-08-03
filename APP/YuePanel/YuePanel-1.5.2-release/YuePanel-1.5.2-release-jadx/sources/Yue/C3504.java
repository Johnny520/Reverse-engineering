package Yue;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3504 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۤۤ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.AwaitKt", m1273f = "Await.kt", m1274i = {0}, m1275l = {54}, m1276m = "joinAll", m1277n = {"$this$forEach$iv"}, m1278s = {"L$0"})
    public static final class C0159 extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f5862;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f5863;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f5864;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f5865;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f5866;

        public C0159(InterfaceC4199<? super C0159> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f5865 = obj;
            this.f5866 |= Integer.MIN_VALUE;
            return C3504.m9336(null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۤۤ$ۥ۟ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.AwaitKt", m1273f = "Await.kt", m1274i = {}, m1275l = {66}, m1276m = "joinAll", m1277n = {}, m1278s = {})
    public static final class C0160 extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f5867;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f5868;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f5869;

        public C0160(InterfaceC4199<? super C0160> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f5868 = obj;
            this.f5869 |= Integer.MIN_VALUE;
            return C3504.m9335(null, this);
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public static final <T> Object m563(@InterfaceC6399 Collection<? extends InterfaceC4360<? extends T>> collection, @InterfaceC6399 InterfaceC4199<? super List<? extends T>> interfaceC4199) {
        if (collection.isEmpty()) {
            return C3880.m10735();
        }
        Object[] array = collection.toArray(new InterfaceC4360[0]);
        if (array != null) {
            return new C3503((InterfaceC4360[]) array).m562(interfaceC4199);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> Object m564(@InterfaceC6399 InterfaceC4360<? extends T>[] interfaceC4360Arr, @InterfaceC6399 InterfaceC4199<? super List<? extends T>> interfaceC4199) {
        return interfaceC4360Arr.length == 0 ? C3880.m10735() : new C3503(interfaceC4360Arr).m562(interfaceC4199);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9335(@InterfaceC6399 Collection<? extends InterfaceC5542> collection, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        C0160 c0160;
        Iterator it;
        if (interfaceC4199 instanceof C0160) {
            c0160 = (C0160) interfaceC4199;
            int i = c0160.f5869;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0160.f5869 = i - Integer.MIN_VALUE;
            } else {
                c0160 = new C0160(interfaceC4199);
            }
        }
        Object obj = c0160.f5868;
        Object objM17142 = C5508.m17142();
        int i2 = c0160.f5869;
        if (i2 == 0) {
            C7149.m22422(obj);
            it = collection.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c0160.f5867;
            C7149.m22422(obj);
        }
        while (it.hasNext()) {
            InterfaceC5542 interfaceC5542 = (InterfaceC5542) it.next();
            c0160.f5867 = it;
            c0160.f5869 = 1;
            if (interfaceC5542.mo17163(c0160) == objM17142) {
                return objM17142;
            }
        }
        return C8107.f3222;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:19:0x0055). Please report as a decompilation issue!!! */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9336(@InterfaceC6399 InterfaceC5542[] interfaceC5542Arr, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        C0159 c0159;
        int i;
        InterfaceC5542[] interfaceC5542Arr2;
        int length;
        if (interfaceC4199 instanceof C0159) {
            c0159 = (C0159) interfaceC4199;
            int i2 = c0159.f5866;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0159.f5866 = i2 - Integer.MIN_VALUE;
            } else {
                c0159 = new C0159(interfaceC4199);
            }
        }
        Object obj = c0159.f5865;
        Object objM17142 = C5508.m17142();
        int i3 = c0159.f5866;
        if (i3 == 0) {
            C7149.m22422(obj);
            i = 0;
            interfaceC5542Arr2 = interfaceC5542Arr;
            length = interfaceC5542Arr.length;
            if (i < length) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            length = c0159.f5864;
            i = c0159.f5863;
            InterfaceC5542[] interfaceC5542Arr3 = (InterfaceC5542[]) c0159.f5862;
            C7149.m22422(obj);
            interfaceC5542Arr2 = interfaceC5542Arr3;
            i++;
            if (i < length) {
                InterfaceC5542 interfaceC5542 = interfaceC5542Arr2[i];
                c0159.f5862 = interfaceC5542Arr2;
                c0159.f5863 = i;
                c0159.f5864 = length;
                c0159.f5866 = 1;
                if (interfaceC5542.mo17163(c0159) == objM17142) {
                    return objM17142;
                }
                i++;
                if (i < length) {
                    return C8107.f3222;
                }
            }
        }
    }
}
