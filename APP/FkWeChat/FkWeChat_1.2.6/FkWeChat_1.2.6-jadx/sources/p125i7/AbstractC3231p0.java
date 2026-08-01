package p125i7;

import java.lang.reflect.Method;
import p098g9.InterfaceC2552f;
import p127i9.AbstractC3366d;
import p172l8.InterfaceC4695g;

/* JADX INFO: renamed from: i7.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3231p0 {
    /* JADX INFO: renamed from: a */
    public static final String m12280a(InterfaceC4695g interfaceC4695g) {
        Method methodM12583e;
        interfaceC4695g.getClass();
        InterfaceC2552f interfaceC2552f = interfaceC4695g instanceof InterfaceC2552f ? (InterfaceC2552f) interfaceC4695g : null;
        if (interfaceC2552f == null || (methodM12583e = AbstractC3366d.m12583e(interfaceC2552f)) == null) {
            return interfaceC4695g.getClass().getName().concat(".invoke");
        }
        return methodM12583e.getDeclaringClass().getName() + '.' + methodM12583e.getName();
    }
}
