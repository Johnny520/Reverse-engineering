package ga;

import gb.AbstractC2706r0;
import java.util.Map;
import p172l8.C4699i;
import p213oa.C5692c;
import p229p9.InterfaceC6003g1;
import p243q9.InterfaceC6328c;

/* JADX INFO: renamed from: ga.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2581e implements InterfaceC6328c {

    /* JADX INFO: renamed from: a */
    public static final C2581e f6857a = new C2581e();

    @Override // p243q9.InterfaceC6328c
    /* JADX INFO: renamed from: a */
    public Map mo5548a() {
        m9142b();
        throw new C4699i();
    }

    /* JADX INFO: renamed from: b */
    public final Void m9142b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // p243q9.InterfaceC6328c
    /* JADX INFO: renamed from: d */
    public C5692c mo5549d() {
        return InterfaceC6328c.a.m24994a(this);
    }

    @Override // p243q9.InterfaceC6328c
    public InterfaceC6003g1 getSource() {
        m9142b();
        throw new C4699i();
    }

    @Override // p243q9.InterfaceC6328c
    public AbstractC2706r0 getType() {
        m9142b();
        throw new C4699i();
    }

    public String toString() {
        return "[EnhancedType]";
    }
}
