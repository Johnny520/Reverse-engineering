package de;

import be.AbstractC1113a;
import be.AbstractC1117e;
import be.C1115c;
import java.util.Iterator;
import java.util.List;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p038ce.C1523e;
import p038ce.InterfaceC1519a;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;

/* JADX INFO: renamed from: de.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1953a extends C1523e {

    /* JADX INFO: renamed from: g */
    public static final a f5438g = new a(null);

    /* JADX INFO: renamed from: f */
    public final InterfaceC4705l f5439f;

    /* JADX INFO: renamed from: de.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0173a {
        public b() {
            super(0);
        }

        @Override // p010a9.InterfaceC0173a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C1953a.this.m7073c());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1953a(AbstractC1113a abstractC1113a, List list) {
        super(abstractC1113a, list);
        abstractC1113a.getClass();
        list.getClass();
        this.f5439f = AbstractC4706m.m18788b(EnumC4708o.f13923s, new b());
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7073c() {
        if (f5438g.m7075b(this)) {
            return true;
        }
        for (InterfaceC1519a interfaceC1519a : mo5938f()) {
            if (AbstractC1061t.m3842c(interfaceC1519a.getType(), C1115c.f3355e) && f5438g.m7075b(interfaceC1519a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: de.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final boolean m7075b(InterfaceC1519a interfaceC1519a) {
            Iterator it = interfaceC1519a.mo5938f().iterator();
            int i10 = 0;
            boolean z10 = false;
            while (it.hasNext()) {
                AbstractC1113a type = ((InterfaceC1519a) it.next()).getType();
                if (AbstractC1061t.m3842c(type, AbstractC1117e.f3407q)) {
                    i10++;
                } else {
                    if (AbstractC1061t.m3842c(type, AbstractC1117e.f3377A) ? true : AbstractC1061t.m3842c(type, AbstractC1117e.f3380D) ? true : AbstractC1061t.m3842c(type, AbstractC1117e.f3390N)) {
                        continue;
                    } else {
                        if (z10 && i10 > 1) {
                            return true;
                        }
                        i10 = 0;
                        z10 = true;
                    }
                }
            }
            return false;
        }

        public a() {
        }
    }
}
