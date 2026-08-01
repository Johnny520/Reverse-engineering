package p247qe;

import java.util.List;
import me.AbstractC5166e;
import me.C5164c;
import me.C5168g;
import ne.InterfaceC5590b;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p217oe.InterfaceC5742d;
import pe.C6072e;

/* JADX INFO: renamed from: qe.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6420e implements InterfaceC5742d {

    /* JADX INFO: renamed from: b */
    public static final a f20215b = new a(null);

    @Override // p217oe.InterfaceC5742d
    /* JADX INFO: renamed from: a */
    public List mo12784a(C5164c.a aVar, C5168g c5168g, AbstractC5166e.a aVar2) {
        aVar.getClass();
        c5168g.getClass();
        aVar2.getClass();
        return m25443c(aVar, aVar2.m21216a()) ? AbstractC5112w.m20789e(new C6072e(aVar2.m21216a(), c5168g.m21225e())) : AbstractC5114x.m20800o();
    }

    @Override // p217oe.InterfaceC5742d
    /* JADX INFO: renamed from: b */
    public boolean mo12785b(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
        aVar.getClass();
        interfaceC5590b.getClass();
        return m25443c(aVar, interfaceC5590b);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m25443c(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
        aVar.getClass();
        interfaceC5590b.getClass();
        if (InterfaceC5742d.f18111a.m23241a(aVar, interfaceC5590b)) {
            return f20215b.m25444a(aVar.m21186c(), aVar.m21192i());
        }
        return false;
    }

    /* JADX INFO: renamed from: qe.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m25444a(CharSequence charSequence, int i10) {
            charSequence.getClass();
            int length = charSequence.length();
            Character chValueOf = null;
            int i11 = 0;
            int i12 = 1;
            while (i10 < length) {
                char cCharAt = charSequence.charAt(i10);
                if (chValueOf == null) {
                    if (cCharAt == '*' || cCharAt == '-' || cCharAt == '_') {
                        chValueOf = Character.valueOf(cCharAt);
                    } else {
                        if (i11 >= 3 || cCharAt != ' ') {
                            return false;
                        }
                        i11++;
                    }
                } else if (cCharAt == chValueOf.charValue()) {
                    i12++;
                } else if (cCharAt != ' ' && cCharAt != '\t') {
                    return false;
                }
                i10++;
            }
            return i12 >= 3;
        }

        public a() {
        }
    }
}
