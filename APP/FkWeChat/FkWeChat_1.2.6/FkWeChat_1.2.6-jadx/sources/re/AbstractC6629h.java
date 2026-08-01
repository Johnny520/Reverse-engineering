package re;

import be.AbstractC1117e;
import java.util.ArrayList;
import java.util.List;
import je.AbstractC3858b;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p080f9.C2363j;
import re.AbstractC6630i;
import re.AbstractC6630i.a;

/* JADX INFO: renamed from: re.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6629h {

    /* JADX INFO: renamed from: a */
    public static final a f20760a = new a(null);

    /* JADX INFO: renamed from: re.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final List m26261a(AbstractC6630i abstractC6630i, C2363j c2363j) {
            abstractC6630i.getClass();
            c2363j.getClass();
            ArrayList arrayList = new ArrayList();
            int iM8560o = c2363j.m8560o();
            int iM8561p = c2363j.m8561p();
            int i10 = iM8561p - 1;
            if (iM8560o <= i10) {
                int i11 = iM8560o;
                while (true) {
                    if (AbstractC1061t.m3842c(abstractC6630i.new a(iM8560o).m26273h(), AbstractC1117e.f3394d)) {
                        if (i11 < iM8560o) {
                            arrayList.add(new C2363j(i11, iM8560o - 1));
                        }
                        i11 = iM8560o + 1;
                    }
                    if (iM8560o == i10) {
                        break;
                    }
                    iM8560o++;
                }
                iM8560o = i11;
            }
            if (iM8560o < iM8561p) {
                arrayList.add(new C2363j(iM8560o, iM8561p));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m26262b(AbstractC6630i.a aVar, int i10) {
            aVar.getClass();
            return AbstractC3858b.m15295b(aVar.m26267b(i10));
        }

        /* JADX INFO: renamed from: c */
        public final boolean m26263c(AbstractC6630i.a aVar, int i10) {
            aVar.getClass();
            return AbstractC3858b.m15296c(aVar.m26267b(i10));
        }

        public a() {
        }
    }
}
