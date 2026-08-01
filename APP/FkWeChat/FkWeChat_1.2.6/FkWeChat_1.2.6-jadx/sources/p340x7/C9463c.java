package p340x7;

import java.lang.management.ManagementFactory;
import p010a9.InterfaceC0173a;
import p172l8.AbstractC4706m;
import p172l8.InterfaceC4705l;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: x7.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9463c {

    /* JADX INFO: renamed from: a */
    public static final C9463c f32155a = new C9463c();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC4705l f32156b = AbstractC4706m.m18787a(new InterfaceC0173a() { // from class: x7.b
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return Boolean.valueOf(C9463c.m36880c());
        }
    });

    /* JADX INFO: renamed from: c */
    public static final boolean m36880c() {
        try {
            return AbstractC8621f0.m33126a0(ManagementFactory.getRuntimeMXBean().getInputArguments().toString(), "jdwp", false, 2, null);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m36881b() {
        return ((Boolean) f32156b.getValue()).booleanValue();
    }
}
