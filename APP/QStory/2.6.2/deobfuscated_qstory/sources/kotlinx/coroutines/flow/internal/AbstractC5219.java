package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.C5175;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4356;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5219 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C5224 f14809;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f14810;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f14811;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC5217[] f14812;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC5217 m10296() {
        AbstractC5217 abstractC5217Mo10298;
        C5224 c5224;
        synchronized (this) {
            try {
                AbstractC5217[] abstractC5217ArrMo10297 = this.f14812;
                if (abstractC5217ArrMo10297 == null) {
                    abstractC5217ArrMo10297 = mo10297();
                    this.f14812 = abstractC5217ArrMo10297;
                } else if (this.f14810 >= abstractC5217ArrMo10297.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC5217ArrMo10297, abstractC5217ArrMo10297.length * 2);
                    this.f14812 = (AbstractC5217[]) objArrCopyOf;
                    abstractC5217ArrMo10297 = (AbstractC5217[]) objArrCopyOf;
                }
                int i = this.f14811;
                do {
                    abstractC5217Mo10298 = abstractC5217ArrMo10297[i];
                    if (abstractC5217Mo10298 == null) {
                        abstractC5217Mo10298 = mo10298();
                        abstractC5217ArrMo10297[i] = abstractC5217Mo10298;
                    }
                    i++;
                    if (i >= abstractC5217ArrMo10297.length) {
                        i = 0;
                    }
                } while (!abstractC5217Mo10298.mo10293(this));
                this.f14811 = i;
                this.f14810++;
                c5224 = this.f14809;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c5224 != null) {
            c5224.m10301(1);
        }
        return abstractC5217Mo10298;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public abstract AbstractC5217[] mo10297();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public abstract AbstractC5217 mo10298();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m10299(AbstractC5217 abstractC5217) {
        C5224 c5224;
        int i;
        InterfaceC4356[] interfaceC4356ArrMo10292;
        synchronized (this) {
            try {
                int i2 = this.f14810 - 1;
                this.f14810 = i2;
                c5224 = this.f14809;
                if (i2 == 0) {
                    this.f14811 = 0;
                }
                abstractC5217.getClass();
                interfaceC4356ArrMo10292 = abstractC5217.mo10292(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC4356 interfaceC4356 : interfaceC4356ArrMo10292) {
            if (interfaceC4356 != null) {
                interfaceC4356.resumeWith(Result.m8755constructorimpl(C5175.f14739));
            }
        }
        if (c5224 != null) {
            c5224.m10301(-1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C5224 m10300() {
        C5224 c5224;
        synchronized (this) {
            c5224 = this.f14809;
            if (c5224 == null) {
                int i = this.f14810;
                c5224 = new C5224(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
                c5224.mo10305(Integer.valueOf(i));
                this.f14809 = c5224;
            }
        }
        return c5224;
    }
}
