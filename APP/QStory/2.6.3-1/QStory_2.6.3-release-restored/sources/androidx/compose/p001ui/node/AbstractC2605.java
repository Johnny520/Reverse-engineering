package androidx.compose.p001ui.node;

import androidx.compose.p001ui.layout.AbstractC2523;
import androidx.compose.p001ui.layout.AbstractC2524;
import androidx.compose.p001ui.layout.C2532;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.C6008;
import kotlin.collections.AbstractC5171;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2605 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC2604 f5539;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f5540;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f5541;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f5542;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2604 f5544;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f5543 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final HashMap f5545 = new HashMap();

    public AbstractC2605(InterfaceC2604 interfaceC2604) {
        this.f5544 = interfaceC2604;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3880(AbstractC2605 abstractC2605, AbstractC2524 abstractC2524, int i, AbstractC2629 abstractC2629) {
        long jMo3874;
        HashMap map = abstractC2605.f5545;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        loop0: while (true) {
            jMo3874 = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                jMo3874 = abstractC2605.mo3874(abstractC2629, jMo3874);
                abstractC2629 = abstractC2629.f5601;
                abstractC2629.getClass();
                if (abstractC2629.equals(abstractC2605.f5544.mo3732())) {
                    break loop0;
                }
            } while (!abstractC2605.mo3873(abstractC2629).containsKey(abstractC2524));
            float fMo3872 = abstractC2605.mo3872(abstractC2629, abstractC2524);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fMo3872);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fMo3872);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
        int iRound = Math.round(abstractC2524 instanceof C2532 ? Float.intBitsToFloat((int) (jMo3874 & 4294967295L)) : Float.intBitsToFloat((int) (jMo3874 >> 32)));
        if (map.containsKey(abstractC2524)) {
            int iIntValue = ((Number) AbstractC5171.m9332(abstractC2524, map)).intValue();
            C2532 c2532 = AbstractC2523.f5297;
            iRound = ((Number) abstractC2524.f5298.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
        }
        map.put(abstractC2524, Integer.valueOf(iRound));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m3881() {
        m3885();
        return this.f5539 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m3882() {
        return this.f5542 || this.f5541 || this.f5540;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract int mo3872(AbstractC2629 abstractC2629, AbstractC2524 abstractC2524);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract Map mo3873(AbstractC2629 abstractC2629);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract long mo3874(AbstractC2629 abstractC2629, long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m3883() {
        HashMap map = this.f5545;
        map.clear();
        InterfaceC7387 interfaceC7387 = new InterfaceC7387() { // from class: androidx.compose.ui.node.AlignmentLines$recalculate$1
            {
                super(1);
            }

            public final void invoke(InterfaceC2604 interfaceC2604) {
                if (interfaceC2604.mo3734() == Integer.MAX_VALUE) {
                    return;
                }
                if (interfaceC2604.mo3733().f5543) {
                    interfaceC2604.mo3727();
                }
                HashMap map2 = interfaceC2604.mo3733().f5545;
                AbstractC2605 abstractC2605 = this.this$0;
                for (Map.Entry entry : map2.entrySet()) {
                    AbstractC2605.m3880(abstractC2605, (AbstractC2524) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC2604.mo3732());
                }
                AbstractC2629 abstractC2629 = interfaceC2604.mo3732().f5601;
                abstractC2629.getClass();
                while (!abstractC2629.equals(this.this$0.f5544.mo3732())) {
                    Set<AbstractC2524> setKeySet = this.this$0.mo3873(abstractC2629).keySet();
                    AbstractC2605 abstractC26052 = this.this$0;
                    for (AbstractC2524 abstractC2524 : setKeySet) {
                        AbstractC2605.m3880(abstractC26052, abstractC2524, abstractC26052.mo3872(abstractC2629, abstractC2524), abstractC2629);
                    }
                    abstractC2629 = abstractC2629.f5601;
                    abstractC2629.getClass();
                }
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC2604) obj);
                return C6008.f15084;
            }
        };
        InterfaceC2604 interfaceC2604 = this.f5544;
        interfaceC2604.mo3726(interfaceC7387);
        map.putAll(mo3873(interfaceC2604.mo3732()));
        this.f5543 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3884() {
        this.f5543 = true;
        InterfaceC2604 interfaceC2604 = this.f5544;
        InterfaceC2604 interfaceC2604Mo3735 = interfaceC2604.mo3735();
        if (interfaceC2604Mo3735 == null) {
            return;
        }
        if (this.f5542) {
            interfaceC2604Mo3735.requestLayout();
        }
        if (this.f5541) {
            interfaceC2604.mo3725();
        }
        if (this.f5540) {
            interfaceC2604.requestLayout();
        }
        interfaceC2604Mo3735.mo3733().m3884();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m3885() {
        AbstractC2605 abstractC2605Mo3733;
        AbstractC2605 abstractC2605Mo37332;
        boolean zM3882 = m3882();
        InterfaceC2604 interfaceC2604 = this.f5544;
        if (!zM3882) {
            InterfaceC2604 interfaceC2604Mo3735 = interfaceC2604.mo3735();
            if (interfaceC2604Mo3735 == null) {
                return;
            }
            interfaceC2604 = interfaceC2604Mo3735.mo3733().f5539;
            if (interfaceC2604 == null || !interfaceC2604.mo3733().m3882()) {
                InterfaceC2604 interfaceC26042 = this.f5539;
                if (interfaceC26042 == null || interfaceC26042.mo3733().m3882()) {
                    return;
                }
                InterfaceC2604 interfaceC2604Mo37352 = interfaceC26042.mo3735();
                if (interfaceC2604Mo37352 != null && (abstractC2605Mo37332 = interfaceC2604Mo37352.mo3733()) != null) {
                    abstractC2605Mo37332.m3885();
                }
                InterfaceC2604 interfaceC2604Mo37353 = interfaceC26042.mo3735();
                interfaceC2604 = (interfaceC2604Mo37353 == null || (abstractC2605Mo3733 = interfaceC2604Mo37353.mo3733()) == null) ? null : abstractC2605Mo3733.f5539;
            }
        }
        this.f5539 = interfaceC2604;
    }
}
