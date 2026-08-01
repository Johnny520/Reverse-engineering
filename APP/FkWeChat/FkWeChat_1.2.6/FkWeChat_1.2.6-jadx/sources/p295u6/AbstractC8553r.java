package p295u6;

import java.io.IOException;
import java.util.Iterator;
import p097g8.AbstractC2544c;
import p185m8.AbstractC5102r;

/* JADX INFO: renamed from: u6.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8553r {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2544c f28546a = new b();

    /* JADX INFO: renamed from: b */
    public static final AbstractC2544c f28547b = new a();

    /* JADX INFO: renamed from: u6.r$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC2544c {
        public a() {
            super(1000);
        }

        @Override // p097g8.AbstractC2544c
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public C8550o mo9067c(C8550o c8550o) {
            c8550o.getClass();
            c8550o.m32897f();
            return (C8550o) super.mo9067c(c8550o);
        }

        @Override // p097g8.AbstractC2544c
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public C8550o mo9061f() {
            return new C8550o();
        }
    }

    /* JADX INFO: renamed from: u6.r$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC2544c {
        public b() {
            super(1000);
        }

        @Override // p097g8.AbstractC2544c
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public int[] mo9067c(int[] iArr) {
            iArr.getClass();
            AbstractC5102r.m20673y(iArr, -1, 0, 0, 6, null);
            return (int[]) super.mo9067c(iArr);
        }

        @Override // p097g8.AbstractC2544c
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int[] mo9061f() {
            int[] iArr = new int[768];
            for (int i10 = 0; i10 < 768; i10++) {
                iArr[i10] = -1;
            }
            return iArr;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m32921c(C8552q c8552q, String str, Appendable appendable) throws IOException {
        c8552q.getClass();
        str.getClass();
        appendable.getClass();
        Iterator it = c8552q.m32912i().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            appendable.append(str);
            appendable.append(c8552q.m32911h(iIntValue));
            appendable.append(" => ");
            appendable.append(c8552q.m32917n(iIntValue));
            appendable.append("\n");
        }
    }
}
