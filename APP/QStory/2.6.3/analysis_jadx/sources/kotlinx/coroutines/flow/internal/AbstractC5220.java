package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.C5176;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4357;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5220 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C5225 f14809;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f14810;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f14811;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC5218[] f14812;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC5218 m10300() {
        AbstractC5218 abstractC5218Mo10302;
        C5225 c5225;
        synchronized (this) {
            try {
                AbstractC5218[] abstractC5218ArrMo10301 = this.f14812;
                if (abstractC5218ArrMo10301 == null) {
                    abstractC5218ArrMo10301 = mo10301();
                    this.f14812 = abstractC5218ArrMo10301;
                } else if (this.f14810 >= abstractC5218ArrMo10301.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC5218ArrMo10301, abstractC5218ArrMo10301.length * 2);
                    this.f14812 = (AbstractC5218[]) objArrCopyOf;
                    abstractC5218ArrMo10301 = (AbstractC5218[]) objArrCopyOf;
                }
                int i = this.f14811;
                do {
                    abstractC5218Mo10302 = abstractC5218ArrMo10301[i];
                    if (abstractC5218Mo10302 == null) {
                        abstractC5218Mo10302 = mo10302();
                        abstractC5218ArrMo10301[i] = abstractC5218Mo10302;
                    }
                    i++;
                    if (i >= abstractC5218ArrMo10301.length) {
                        i = 0;
                    }
                } while (!abstractC5218Mo10302.mo10297(this));
                this.f14811 = i;
                this.f14810++;
                c5225 = this.f14809;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c5225 != null) {
            c5225.m10305(1);
        }
        return abstractC5218Mo10302;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public abstract AbstractC5218[] mo10301();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public abstract AbstractC5218 mo10302();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m10303(AbstractC5218 abstractC5218) {
        C5225 c5225;
        int i;
        InterfaceC4357[] interfaceC4357ArrMo10296;
        synchronized (this) {
            try {
                int i2 = this.f14810 - 1;
                this.f14810 = i2;
                c5225 = this.f14809;
                if (i2 == 0) {
                    this.f14811 = 0;
                }
                abstractC5218.getClass();
                interfaceC4357ArrMo10296 = abstractC5218.mo10296(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC4357 interfaceC4357 : interfaceC4357ArrMo10296) {
            if (interfaceC4357 != null) {
                interfaceC4357.resumeWith(Result.m8745constructorimpl(C5176.f14739));
            }
        }
        if (c5225 != null) {
            c5225.m10305(-1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C5225 m10304() {
        C5225 c5225;
        synchronized (this) {
            c5225 = this.f14809;
            if (c5225 == null) {
                int i = this.f14810;
                c5225 = new C5225(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
                c5225.mo10309(Integer.valueOf(i));
                this.f14809 = c5225;
            }
        }
        return c5225;
    }
}
