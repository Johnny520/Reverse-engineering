package p217oe;

import java.util.List;
import me.AbstractC5166e;
import me.C5164c;
import me.C5168g;
import ne.AbstractC5591c;
import ne.InterfaceC5590b;

/* JADX INFO: renamed from: oe.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5742d {

    /* JADX INFO: renamed from: a */
    public static final a f18111a = a.f18112a;

    /* JADX INFO: renamed from: oe.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f18112a = new a();

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ int m23240c(a aVar, CharSequence charSequence, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            return aVar.m23242b(charSequence, i10);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m23241a(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
            aVar.getClass();
            interfaceC5590b.getClass();
            return aVar.m21192i() == AbstractC5591c.m22694f(interfaceC5590b, aVar.m21186c());
        }

        /* JADX INFO: renamed from: b */
        public final int m23242b(CharSequence charSequence, int i10) {
            charSequence.getClass();
            for (int i11 = 0; i11 < 3; i11++) {
                if (i10 < charSequence.length() && charSequence.charAt(i10) == ' ') {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* JADX INFO: renamed from: a */
    List mo12784a(C5164c.a aVar, C5168g c5168g, AbstractC5166e.a aVar2);

    /* JADX INFO: renamed from: b */
    boolean mo12785b(C5164c.a aVar, InterfaceC5590b interfaceC5590b);
}
