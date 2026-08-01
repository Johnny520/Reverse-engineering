package p074f3;

import android.text.style.TtsSpan;
import p215oc.C5729x;
import p319w2.AbstractC9157x3;
import p319w2.C9167z3;

/* JADX INFO: renamed from: f3.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2286f {
    /* JADX INFO: renamed from: a */
    public static final TtsSpan m8335a(AbstractC9157x3 abstractC9157x3) {
        if (abstractC9157x3 instanceof C9167z3) {
            return m8336b((C9167z3) abstractC9157x3);
        }
        C5729x.m23182a();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final TtsSpan m8336b(C9167z3 c9167z3) {
        return new TtsSpan.VerbatimBuilder(c9167z3.m35609a()).build();
    }
}
