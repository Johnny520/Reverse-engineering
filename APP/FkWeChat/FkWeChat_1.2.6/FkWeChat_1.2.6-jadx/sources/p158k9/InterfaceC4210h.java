package p158k9;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: k9.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC4210h {

    /* JADX INFO: renamed from: k9.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m16663a(InterfaceC4210h interfaceC4210h, Object[] objArr) {
            objArr.getClass();
            if (AbstractC4212j.m16673a(interfaceC4210h) == objArr.length) {
                return;
            }
            throw new IllegalArgumentException("Callable expects " + AbstractC4212j.m16673a(interfaceC4210h) + " arguments, but " + objArr.length + " were provided.");
        }

        /* JADX INFO: renamed from: b */
        public static boolean m16664b(InterfaceC4210h interfaceC4210h) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    List mo16637a();

    /* JADX INFO: renamed from: b */
    Member mo16638b();

    /* JADX INFO: renamed from: c */
    boolean mo16639c();

    /* JADX INFO: renamed from: f */
    Type mo16642f();

    /* JADX INFO: renamed from: o */
    Object mo16643o(Object[] objArr);
}
