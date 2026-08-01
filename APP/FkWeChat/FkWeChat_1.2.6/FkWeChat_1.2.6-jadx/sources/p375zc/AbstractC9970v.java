package p375zc;

import java.util.List;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1052o0;
import p154k5.C3972g;
import p172l8.AbstractC4706m;
import p172l8.InterfaceC4705l;
import p329wc.AbstractC9224l;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;

/* JADX INFO: renamed from: zc.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9970v {

    /* JADX INFO: renamed from: zc.v$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC9218f {

        /* JADX INFO: renamed from: a */
        public final InterfaceC4705l f33548a;

        public a(InterfaceC0173a interfaceC0173a) {
            this.f33548a = AbstractC4706m.m18787a(interfaceC0173a);
        }

        @Override // p329wc.InterfaceC9218f
        /* JADX INFO: renamed from: a */
        public String mo35888a() {
            return m38605b().mo35888a();
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC9218f m38605b() {
            return (InterfaceC9218f) this.f33548a.getValue();
        }

        @Override // p329wc.InterfaceC9218f
        /* JADX INFO: renamed from: c */
        public boolean mo35889c() {
            return super.mo35889c();
        }

        @Override // p329wc.InterfaceC9218f
        /* JADX INFO: renamed from: d */
        public int mo35890d(String str) {
            str.getClass();
            return m38605b().mo35890d(str);
        }

        @Override // p329wc.InterfaceC9218f
        /* JADX INFO: renamed from: e */
        public int mo35891e() {
            return m38605b().mo35891e();
        }

        @Override // p329wc.InterfaceC9218f
        /* JADX INFO: renamed from: f */
        public String mo35892f(int i10) {
            return m38605b().mo35892f(i10);
        }

        @Override // p329wc.InterfaceC9218f
        /* JADX INFO: renamed from: g */
        public List mo35893g(int i10) {
            return m38605b().mo35893g(i10);
        }

        @Override // p329wc.InterfaceC9218f
        public List getAnnotations() {
            return super.getAnnotations();
        }

        @Override // p329wc.InterfaceC9218f
        /* JADX INFO: renamed from: h */
        public InterfaceC9218f mo35894h(int i10) {
            return m38605b().mo35894h(i10);
        }

        @Override // p329wc.InterfaceC9218f
        /* JADX INFO: renamed from: i */
        public boolean mo35895i(int i10) {
            return m38605b().mo35895i(i10);
        }

        @Override // p329wc.InterfaceC9218f
        /* JADX INFO: renamed from: j */
        public AbstractC9224l mo35896j() {
            return m38605b().mo35896j();
        }

        @Override // p329wc.InterfaceC9218f
        /* JADX INFO: renamed from: k */
        public boolean mo35897k() {
            return super.mo35897k();
        }
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC9955k m38600d(InterfaceC9487e interfaceC9487e) {
        interfaceC9487e.getClass();
        InterfaceC9955k interfaceC9955k = interfaceC9487e instanceof InterfaceC9955k ? (InterfaceC9955k) interfaceC9487e : null;
        if (interfaceC9955k != null) {
            return interfaceC9955k;
        }
        C3972g.m15749a("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ", AbstractC1052o0.m3807b(interfaceC9487e.getClass()));
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC9971w m38601e(InterfaceC9488f interfaceC9488f) {
        interfaceC9488f.getClass();
        InterfaceC9971w interfaceC9971w = interfaceC9488f instanceof InterfaceC9971w ? (InterfaceC9971w) interfaceC9488f : null;
        if (interfaceC9971w != null) {
            return interfaceC9971w;
        }
        C3972g.m15749a("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ", AbstractC1052o0.m3807b(interfaceC9488f.getClass()));
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC9218f m38602f(InterfaceC0173a interfaceC0173a) {
        return new a(interfaceC0173a);
    }

    /* JADX INFO: renamed from: g */
    public static final void m38603g(InterfaceC9487e interfaceC9487e) {
        m38600d(interfaceC9487e);
    }

    /* JADX INFO: renamed from: h */
    public static final void m38604h(InterfaceC9488f interfaceC9488f) {
        m38601e(interfaceC9488f);
    }
}
