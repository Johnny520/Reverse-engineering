package Yue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4914 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤ۠$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", m1273f = "Collection.kt", m1274i = {0}, m1275l = {26}, m1276m = "toCollection", m1277n = {"destination"}, m1278s = {"L$0"})
    public static final class C0540<T, C extends Collection<? super T>> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f11385;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f11386;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f11387;

        public C0540(InterfaceC4199<? super C0540> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f11386 = obj;
            this.f11387 |= Integer.MIN_VALUE;
            return C4896.m15296(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤ۠$ۥ۟ */
    public static final class C0541<T> implements InterfaceC4892 {

        /* JADX INFO: Incorrect field signature: TC; */
        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Collection f11388;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        public C0541(Collection collection) {
            this.f11388 = collection;
        }

        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public final Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            this.f11388.add(t);
            return C8107.f3222;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T, C extends Collection<? super T>> Object m1815(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC4199<? super C> interfaceC4199) {
        C0540 c0540;
        if (interfaceC4199 instanceof C0540) {
            c0540 = (C0540) interfaceC4199;
            int i = c0540.f11387;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0540.f11387 = i - Integer.MIN_VALUE;
            } else {
                c0540 = new C0540(interfaceC4199);
            }
        }
        Object obj = c0540.f11386;
        Object objM17142 = C5508.m17142();
        int i2 = c0540.f11387;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Collection collection = (Collection) c0540.f11385;
            C7149.m22422(obj);
            return collection;
        }
        C7149.m22422(obj);
        InterfaceC4892<? super Object> c0541 = new C0541<>(c);
        c0540.f11385 = c;
        c0540.f11387 = 1;
        return interfaceC4890.mo48(c0541, c0540) == objM17142 ? objM17142 : c;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> Object m1816(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 List<T> list, @InterfaceC6399 InterfaceC4199<? super List<? extends T>> interfaceC4199) {
        return C4896.m15296(interfaceC4890, list, interfaceC4199);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ Object m15332(InterfaceC4890 interfaceC4890, List list, InterfaceC4199 interfaceC4199, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return C4896.m15297(interfaceC4890, list, interfaceC4199);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> Object m15333(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 Set<T> set, @InterfaceC6399 InterfaceC4199<? super Set<? extends T>> interfaceC4199) {
        return C4896.m15296(interfaceC4890, set, interfaceC4199);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Object m15334(InterfaceC4890 interfaceC4890, Set set, InterfaceC4199 interfaceC4199, int i, Object obj) {
        if ((i & 1) != 0) {
            set = new LinkedHashSet();
        }
        return C4896.m15299(interfaceC4890, set, interfaceC4199);
    }
}
