package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3883 extends C3882 {
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final <T> void m10761(@InterfaceC6399 Iterator<? extends T> it, @InterfaceC6399 InterfaceC5124<? super T, C8107> interfaceC5124) {
        C5499.m17103(it, "<this>");
        C5499.m17103(interfaceC5124, "operation");
        while (it.hasNext()) {
            interfaceC5124.invoke(it.next());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Iterator<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final <T> Iterator<T> m10762(Iterator<? extends T> it) {
        C5499.m17103(it, "<this>");
        return it;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final <T> Iterator<C5428<T>> m10763(@InterfaceC6399 Iterator<? extends T> it) {
        C5499.m17103(it, "<this>");
        return new C5430(it);
    }
}
