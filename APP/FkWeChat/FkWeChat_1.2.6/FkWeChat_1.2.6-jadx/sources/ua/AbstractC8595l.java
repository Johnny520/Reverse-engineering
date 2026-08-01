package ua;

import p024b9.AbstractC1043k;
import p129ib.C3378i;
import p129ib.C3381l;
import p129ib.EnumC3380k;
import p172l8.C4700i0;
import p229p9.InterfaceC6005h0;

/* JADX INFO: renamed from: ua.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8595l extends AbstractC8590g {

    /* JADX INFO: renamed from: b */
    public static final a f28631b = new a(null);

    /* JADX INFO: renamed from: ua.l$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC8595l {

        /* JADX INFO: renamed from: c */
        public final String f28632c;

        public b(String str) {
            str.getClass();
            this.f28632c = str;
        }

        @Override // ua.AbstractC8590g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public C3378i mo32999a(InterfaceC6005h0 interfaceC6005h0) {
            interfaceC6005h0.getClass();
            return C3381l.m12703d(EnumC3380k.f9323y0, this.f28632c);
        }

        @Override // ua.AbstractC8590g
        public String toString() {
            return this.f28632c;
        }
    }

    public AbstractC8595l() {
        super(C4700i0.f13910a);
    }

    @Override // ua.AbstractC8590g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C4700i0 mo33009b() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ua.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC8595l m33019a(String str) {
            str.getClass();
            return new b(str);
        }

        public a() {
        }
    }
}
