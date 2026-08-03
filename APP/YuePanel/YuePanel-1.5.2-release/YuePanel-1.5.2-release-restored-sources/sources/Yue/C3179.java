package Yue;

import Yue.C7148;
import android.annotation.SuppressLint;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import sun.misc.Signal;
import sun.misc.SignalHandler;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"all"})
@IgnoreJRERequirement
public final class C3179 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C3179 f113 = new C3179();

    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean f114;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۢۢ$ۥ */
    public static final class C0070 implements ClassFileTransformer {

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6399
        public static final C0070 f115 = new C0070();

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public byte[] m253(@InterfaceC6399 ClassLoader classLoader, @InterfaceC6399 String str, @InterfaceC6489 Class<?> cls, @InterfaceC6399 ProtectionDomain protectionDomain, @InterfaceC6489 byte[] bArr) {
            if (!C5499.m17094(str, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                return null;
            }
            C3177.f111.m249(true);
            return C3629.m9786(classLoader.getResourceAsStream("DebugProbesKt.bin"));
        }
    }

    static {
        Object objM3438;
        try {
            C7148.C1189 c1189 = C7148.f21560;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            objM3438 = C7148.m3438(property != null ? Boolean.valueOf(Boolean.parseBoolean(property)) : null);
        } catch (Throwable th) {
            C7148.C1189 c11892 = C7148.f21560;
            objM3438 = C7148.m3438(C7149.m3441(th));
        }
        Boolean bool = (Boolean) (C7148.m22407(objM3438) ? null : objM3438);
        f114 = bool != null ? bool.booleanValue() : C4315.f820.m12482();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m6517(Signal signal) {
        C4315 c4315 = C4315.f820;
        if (c4315.m12487()) {
            c4315.m12468(System.out);
        } else {
            System.out.println((Object) "Cannot perform coroutines dump, debug probes are disabled");
        }
    }

    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m6518(@InterfaceC6489 String str, @InterfaceC6399 Instrumentation instrumentation) {
        C3177.f111.m249(true);
        instrumentation.addTransformer(C0070.f115);
        C4315 c4315 = C4315.f820;
        c4315.m12498(f114);
        c4315.m12485();
        f113.m252();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m252() {
        try {
            Signal.handle(new Signal("TRAP"), new SignalHandler() { // from class: Yue.ۥ۟۠ۢۡ
                /* JADX INFO: renamed from: ۥ */
                public final void m250(Signal signal) {
                    C3179.m6517(signal);
                }
            });
        } catch (Throwable unused) {
        }
    }
}
