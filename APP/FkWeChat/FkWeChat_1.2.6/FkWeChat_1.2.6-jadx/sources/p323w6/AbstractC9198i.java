package p323w6;

import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p281t6.C8138c;
import p281t6.C8140d;
import p281t6.C8169v;
import p281t6.InterfaceC8163p;

/* JADX INFO: renamed from: w6.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9198i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0173a f31424a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8163p f31425b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4705l f31426c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4705l f31427d;

    /* JADX INFO: renamed from: w6.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC9198i {

        /* JADX INFO: renamed from: e */
        public final InterfaceC0173a f31428e;

        /* JADX INFO: renamed from: f */
        public final String f31429f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC0173a interfaceC0173a, InterfaceC0173a interfaceC0173a2, InterfaceC8163p interfaceC8163p) {
            super(interfaceC0173a2, interfaceC8163p, 0 == true ? 1 : 0);
            interfaceC0173a.getClass();
            interfaceC0173a2.getClass();
            interfaceC8163p.getClass();
            this.f31428e = interfaceC0173a;
            C8138c c8138cM35823c = m35823c();
            this.f31429f = c8138cM35823c != null ? c8138cM35823c.m31647c("filename") : null;
        }
    }

    /* JADX INFO: renamed from: w6.i$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC9198i {

        /* JADX INFO: renamed from: e */
        public final String f31430e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC0173a interfaceC0173a, InterfaceC8163p interfaceC8163p) {
            super(interfaceC0173a, interfaceC8163p, null);
            str.getClass();
            interfaceC0173a.getClass();
            interfaceC8163p.getClass();
            this.f31430e = str;
        }

        /* JADX INFO: renamed from: f */
        public final String m35826f() {
            return this.f31430e;
        }
    }

    public AbstractC9198i(InterfaceC0173a interfaceC0173a, InterfaceC8163p interfaceC8163p) {
        this.f31424a = interfaceC0173a;
        this.f31425b = interfaceC8163p;
        EnumC4708o enumC4708o = EnumC4708o.f13923s;
        this.f31426c = AbstractC4706m.m18788b(enumC4708o, new InterfaceC0173a() { // from class: w6.g
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return AbstractC9198i.m35822b(this.f31422q);
            }
        });
        this.f31427d = AbstractC4706m.m18788b(enumC4708o, new InterfaceC0173a() { // from class: w6.h
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return AbstractC9198i.m35821a(this.f31423q);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static C8140d m35821a(AbstractC9198i abstractC9198i) {
        String strMo12334e = abstractC9198i.f31425b.mo12334e(C8169v.f27347a.m31681j());
        if (strMo12334e != null) {
            return C8140d.f27220f.m31606b(strMo12334e);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C8138c m35822b(AbstractC9198i abstractC9198i) {
        String strMo12334e = abstractC9198i.f31425b.mo12334e(C8169v.f27347a.m31679h());
        if (strMo12334e != null) {
            return C8138c.f27213d.m31595a(strMo12334e);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final C8138c m35823c() {
        return (C8138c) this.f31426c.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0173a m35824d() {
        return this.f31424a;
    }

    /* JADX INFO: renamed from: e */
    public final String m35825e() {
        C8138c c8138cM35823c = m35823c();
        if (c8138cM35823c != null) {
            return c8138cM35823c.m31594e();
        }
        return null;
    }

    public /* synthetic */ AbstractC9198i(InterfaceC0173a interfaceC0173a, InterfaceC8163p interfaceC8163p, AbstractC1043k abstractC1043k) {
        this(interfaceC0173a, interfaceC8163p);
    }
}
