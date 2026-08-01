package p112hb;

import gb.AbstractC2705r;
import gb.AbstractC2706r0;
import gb.InterfaceC2716u1;
import java.util.Collection;
import p010a9.InterfaceC0173a;
import p160kb.InterfaceC4229i;
import p213oa.C5691b;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6005h0;
import p229p9.InterfaceC6019m;
import za.InterfaceC9913k;

/* JADX INFO: renamed from: hb.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2949h extends AbstractC2705r {

    /* JADX INFO: renamed from: hb.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC2949h {

        /* JADX INFO: renamed from: a */
        public static final a f7784a = new a();

        @Override // p112hb.AbstractC2949h
        /* JADX INFO: renamed from: b */
        public InterfaceC5995e mo10846b(C5691b c5691b) {
            c5691b.getClass();
            return null;
        }

        @Override // p112hb.AbstractC2949h
        /* JADX INFO: renamed from: c */
        public InterfaceC9913k mo10847c(InterfaceC5995e interfaceC5995e, InterfaceC0173a interfaceC0173a) {
            interfaceC5995e.getClass();
            interfaceC0173a.getClass();
            return (InterfaceC9913k) interfaceC0173a.invoke();
        }

        @Override // p112hb.AbstractC2949h
        /* JADX INFO: renamed from: d */
        public boolean mo10848d(InterfaceC6005h0 interfaceC6005h0) {
            interfaceC6005h0.getClass();
            return false;
        }

        @Override // p112hb.AbstractC2949h
        /* JADX INFO: renamed from: e */
        public boolean mo10849e(InterfaceC2716u1 interfaceC2716u1) {
            interfaceC2716u1.getClass();
            return false;
        }

        @Override // p112hb.AbstractC2949h
        /* JADX INFO: renamed from: g */
        public Collection mo10851g(InterfaceC5995e interfaceC5995e) {
            interfaceC5995e.getClass();
            Collection collectionMo9546n = interfaceC5995e.mo5591o().mo9546n();
            collectionMo9546n.getClass();
            return collectionMo9546n;
        }

        @Override // gb.AbstractC2705r
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public AbstractC2706r0 mo9586a(InterfaceC4229i interfaceC4229i) {
            interfaceC4229i.getClass();
            return (AbstractC2706r0) interfaceC4229i;
        }

        @Override // p112hb.AbstractC2949h
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public InterfaceC5995e mo10850f(InterfaceC6019m interfaceC6019m) {
            interfaceC6019m.getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC5995e mo10846b(C5691b c5691b);

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC9913k mo10847c(InterfaceC5995e interfaceC5995e, InterfaceC0173a interfaceC0173a);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo10848d(InterfaceC6005h0 interfaceC6005h0);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo10849e(InterfaceC2716u1 interfaceC2716u1);

    /* JADX INFO: renamed from: f */
    public abstract InterfaceC6004h mo10850f(InterfaceC6019m interfaceC6019m);

    /* JADX INFO: renamed from: g */
    public abstract Collection mo10851g(InterfaceC5995e interfaceC5995e);

    /* JADX INFO: renamed from: h */
    public abstract AbstractC2706r0 mo9586a(InterfaceC4229i interfaceC4229i);
}
