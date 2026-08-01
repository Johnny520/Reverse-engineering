package p038ce;

import be.AbstractC1113a;
import be.AbstractC1117e;
import be.C1115c;
import de.C1953a;
import de.C1954b;
import java.util.ArrayList;
import java.util.List;
import me.InterfaceC5162a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5112w;

/* JADX INFO: renamed from: ce.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C1520b {

    /* JADX INFO: renamed from: c */
    public static final a f4485c = new a(null);

    /* JADX INFO: renamed from: a */
    public final CharSequence f4486a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5162a f4487b;

    public C1520b(CharSequence charSequence, InterfaceC5162a interfaceC5162a) {
        charSequence.getClass();
        interfaceC5162a.getClass();
        this.f4486a = charSequence;
        this.f4487b = interfaceC5162a;
    }

    /* JADX INFO: renamed from: a */
    public C1523e m5941a(AbstractC1113a abstractC1113a, List list) {
        abstractC1113a.getClass();
        list.getClass();
        this.f4487b.mo21175a();
        return AbstractC1061t.m3842c(abstractC1113a, C1115c.f3353c) ? true : AbstractC1061t.m3842c(abstractC1113a, C1115c.f3354d) ? new C1953a(abstractC1113a, list) : AbstractC1061t.m3842c(abstractC1113a, C1115c.f3355e) ? new C1954b(list) : new C1523e(abstractC1113a, list);
    }

    /* JADX INFO: renamed from: b */
    public List mo5942b(AbstractC1113a abstractC1113a, int i10, int i11) {
        abstractC1113a.getClass();
        if (!AbstractC1061t.m3842c(abstractC1113a, AbstractC1117e.f3390N)) {
            return AbstractC5112w.m20789e(new C1524f(abstractC1113a, i10, i11));
        }
        ArrayList arrayList = new ArrayList();
        while (i10 < i11) {
            this.f4487b.mo21175a();
            int iM5944a = f4485c.m5944a(this.f4486a, i10, i11, '\n');
            if (iM5944a == -1) {
                break;
            }
            if (iM5944a > i10) {
                arrayList.add(new C1524f(AbstractC1117e.f3390N, i10, iM5944a));
            }
            int i12 = iM5944a + 1;
            arrayList.add(new C1524f(AbstractC1117e.f3407q, iM5944a, i12));
            i10 = i12;
        }
        if (i11 > i10) {
            arrayList.add(new C1524f(AbstractC1117e.f3390N, i10, i11));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final CharSequence m5943c() {
        return this.f4486a;
    }

    /* JADX INFO: renamed from: ce.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m5944a(CharSequence charSequence, int i10, int i11, char c10) {
            charSequence.getClass();
            int i12 = i11 - 1;
            if (i10 > i12) {
                return -1;
            }
            while (charSequence.charAt(i10) != c10) {
                if (i10 == i12) {
                    return -1;
                }
                i10++;
            }
            return i10;
        }

        public a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1520b(CharSequence charSequence) {
        this(charSequence, InterfaceC5162a.a.f15759a);
        charSequence.getClass();
    }
}
