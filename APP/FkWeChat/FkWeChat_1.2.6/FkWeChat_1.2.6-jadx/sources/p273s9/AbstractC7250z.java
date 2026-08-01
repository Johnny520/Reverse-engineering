package p273s9;

import gb.AbstractC2655d2;
import p024b9.AbstractC1043k;
import p112hb.AbstractC2949h;
import p229p9.InterfaceC5995e;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: s9.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7250z implements InterfaceC5995e {

    /* JADX INFO: renamed from: q */
    public static final a f24119q = new a(null);

    /* JADX INFO: renamed from: E0 */
    public abstract InterfaceC9913k mo5570E0(AbstractC2949h abstractC2949h);

    /* JADX INFO: renamed from: N */
    public abstract InterfaceC9913k mo12632N(AbstractC2655d2 abstractC2655d2, AbstractC2949h abstractC2949h);

    /* JADX INFO: renamed from: s9.z$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC9913k m28694a(InterfaceC5995e interfaceC5995e, AbstractC2655d2 abstractC2655d2, AbstractC2949h abstractC2949h) {
            InterfaceC9913k interfaceC9913kMo12632N;
            interfaceC5995e.getClass();
            abstractC2655d2.getClass();
            abstractC2949h.getClass();
            AbstractC7250z abstractC7250z = interfaceC5995e instanceof AbstractC7250z ? (AbstractC7250z) interfaceC5995e : null;
            if (abstractC7250z != null && (interfaceC9913kMo12632N = abstractC7250z.mo12632N(abstractC2655d2, abstractC2949h)) != null) {
                return interfaceC9913kMo12632N;
            }
            InterfaceC9913k interfaceC9913kMo23998O0 = interfaceC5995e.mo23998O0(abstractC2655d2);
            interfaceC9913kMo23998O0.getClass();
            return interfaceC9913kMo23998O0;
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC9913k m28695b(InterfaceC5995e interfaceC5995e, AbstractC2949h abstractC2949h) {
            InterfaceC9913k interfaceC9913kMo5570E0;
            interfaceC5995e.getClass();
            abstractC2949h.getClass();
            AbstractC7250z abstractC7250z = interfaceC5995e instanceof AbstractC7250z ? (AbstractC7250z) interfaceC5995e : null;
            if (abstractC7250z != null && (interfaceC9913kMo5570E0 = abstractC7250z.mo5570E0(abstractC2949h)) != null) {
                return interfaceC9913kMo5570E0;
            }
            InterfaceC9913k interfaceC9913kMo5571H0 = interfaceC5995e.mo5571H0();
            interfaceC9913kMo5571H0.getClass();
            return interfaceC9913kMo5571H0;
        }

        public a() {
        }
    }
}
