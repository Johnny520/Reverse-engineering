package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.C6008;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6052 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C6057 f15154;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f15155;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f15156;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC6050[] f15157;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC6050 m10859() {
        AbstractC6050 abstractC6050Mo10861;
        C6057 c6057;
        synchronized (this) {
            try {
                AbstractC6050[] abstractC6050ArrMo10860 = this.f15157;
                if (abstractC6050ArrMo10860 == null) {
                    abstractC6050ArrMo10860 = mo10860();
                    this.f15157 = abstractC6050ArrMo10860;
                } else if (this.f15155 >= abstractC6050ArrMo10860.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC6050ArrMo10860, abstractC6050ArrMo10860.length * 2);
                    this.f15157 = (AbstractC6050[]) objArrCopyOf;
                    abstractC6050ArrMo10860 = (AbstractC6050[]) objArrCopyOf;
                }
                int i = this.f15156;
                do {
                    abstractC6050Mo10861 = abstractC6050ArrMo10860[i];
                    if (abstractC6050Mo10861 == null) {
                        abstractC6050Mo10861 = mo10861();
                        abstractC6050ArrMo10860[i] = abstractC6050Mo10861;
                    }
                    i++;
                    if (i >= abstractC6050ArrMo10860.length) {
                        i = 0;
                    }
                } while (!abstractC6050Mo10861.mo10856(this));
                this.f15156 = i;
                this.f15155++;
                c6057 = this.f15154;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c6057 != null) {
            c6057.m10864(1);
        }
        return abstractC6050Mo10861;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public abstract AbstractC6050[] mo10860();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public abstract AbstractC6050 mo10861();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m10862(AbstractC6050 abstractC6050) {
        C6057 c6057;
        int i;
        InterfaceC5189[] interfaceC5189ArrMo10855;
        synchronized (this) {
            try {
                int i2 = this.f15155 - 1;
                this.f15155 = i2;
                c6057 = this.f15154;
                if (i2 == 0) {
                    this.f15156 = 0;
                }
                abstractC6050.getClass();
                interfaceC5189ArrMo10855 = abstractC6050.mo10855(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC5189 interfaceC5189 : interfaceC5189ArrMo10855) {
            if (interfaceC5189 != null) {
                interfaceC5189.resumeWith(Result.m9304constructorimpl(C6008.f15084));
            }
        }
        if (c6057 != null) {
            c6057.m10864(-1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C6057 m10863() {
        C6057 c6057;
        synchronized (this) {
            c6057 = this.f15154;
            if (c6057 == null) {
                int i = this.f15155;
                c6057 = new C6057(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
                c6057.mo10868(Integer.valueOf(i));
                this.f15154 = c6057;
            }
        }
        return c6057;
    }
}
