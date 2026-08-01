package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC1688;
import androidx.compose.ui.layout.AbstractC1689;
import androidx.compose.ui.layout.C1697;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.C5175;
import kotlin.collections.AbstractC4338;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1770 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC1769 f5193;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f5194;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f5195;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f5196;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1769 f5198;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f5197 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final HashMap f5199 = new HashMap();

    public AbstractC1770(InterfaceC1769 interfaceC1769) {
        this.f5198 = interfaceC1769;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3310(AbstractC1770 abstractC1770, AbstractC1689 abstractC1689, int i, AbstractC1794 abstractC1794) {
        long jMo3304;
        HashMap map = abstractC1770.f5199;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        loop0: while (true) {
            jMo3304 = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                jMo3304 = abstractC1770.mo3304(abstractC1794, jMo3304);
                abstractC1794 = abstractC1794.f5255;
                abstractC1794.getClass();
                if (abstractC1794.equals(abstractC1770.f5198.mo3162())) {
                    break loop0;
                }
            } while (!abstractC1770.mo3303(abstractC1794).containsKey(abstractC1689));
            float fMo3302 = abstractC1770.mo3302(abstractC1794, abstractC1689);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fMo3302);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fMo3302);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
        int iRound = Math.round(abstractC1689 instanceof C1697 ? Float.intBitsToFloat((int) (jMo3304 & 4294967295L)) : Float.intBitsToFloat((int) (jMo3304 >> 32)));
        if (map.containsKey(abstractC1689)) {
            int iIntValue = ((Number) AbstractC4338.m8780(abstractC1689, map)).intValue();
            C1697 c1697 = AbstractC1688.f4951;
            iRound = ((Number) abstractC1689.f4952.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
        }
        map.put(abstractC1689, Integer.valueOf(iRound));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m3311() {
        m3315();
        return this.f5193 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m3312() {
        return this.f5196 || this.f5195 || this.f5194;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract int mo3302(AbstractC1794 abstractC1794, AbstractC1689 abstractC1689);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract Map mo3303(AbstractC1794 abstractC1794);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract long mo3304(AbstractC1794 abstractC1794, long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m3313() {
        HashMap map = this.f5199;
        map.clear();
        InterfaceC6557 interfaceC6557 = new InterfaceC6557() { // from class: androidx.compose.ui.node.AlignmentLines$recalculate$1
            {
                super(1);
            }

            public final void invoke(InterfaceC1769 interfaceC1769) {
                if (interfaceC1769.mo3164() == Integer.MAX_VALUE) {
                    return;
                }
                if (interfaceC1769.mo3163().f5197) {
                    interfaceC1769.mo3157();
                }
                HashMap map2 = interfaceC1769.mo3163().f5199;
                AbstractC1770 abstractC1770 = this.this$0;
                for (Map.Entry entry : map2.entrySet()) {
                    AbstractC1770.m3310(abstractC1770, (AbstractC1689) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC1769.mo3162());
                }
                AbstractC1794 abstractC1794 = interfaceC1769.mo3162().f5255;
                abstractC1794.getClass();
                while (!abstractC1794.equals(this.this$0.f5198.mo3162())) {
                    Set<AbstractC1689> setKeySet = this.this$0.mo3303(abstractC1794).keySet();
                    AbstractC1770 abstractC17702 = this.this$0;
                    for (AbstractC1689 abstractC1689 : setKeySet) {
                        AbstractC1770.m3310(abstractC17702, abstractC1689, abstractC17702.mo3302(abstractC1794, abstractC1689), abstractC1794);
                    }
                    abstractC1794 = abstractC1794.f5255;
                    abstractC1794.getClass();
                }
            }

            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1769) obj);
                return C5175.f14739;
            }
        };
        InterfaceC1769 interfaceC1769 = this.f5198;
        interfaceC1769.mo3156(interfaceC6557);
        map.putAll(mo3303(interfaceC1769.mo3162()));
        this.f5197 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3314() {
        this.f5197 = true;
        InterfaceC1769 interfaceC1769 = this.f5198;
        InterfaceC1769 interfaceC1769Mo3165 = interfaceC1769.mo3165();
        if (interfaceC1769Mo3165 == null) {
            return;
        }
        if (this.f5196) {
            interfaceC1769Mo3165.requestLayout();
        }
        if (this.f5195) {
            interfaceC1769.mo3155();
        }
        if (this.f5194) {
            interfaceC1769.requestLayout();
        }
        interfaceC1769Mo3165.mo3163().m3314();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m3315() {
        AbstractC1770 abstractC1770Mo3163;
        AbstractC1770 abstractC1770Mo31632;
        boolean zM3312 = m3312();
        InterfaceC1769 interfaceC1769 = this.f5198;
        if (!zM3312) {
            InterfaceC1769 interfaceC1769Mo3165 = interfaceC1769.mo3165();
            if (interfaceC1769Mo3165 == null) {
                return;
            }
            interfaceC1769 = interfaceC1769Mo3165.mo3163().f5193;
            if (interfaceC1769 == null || !interfaceC1769.mo3163().m3312()) {
                InterfaceC1769 interfaceC17692 = this.f5193;
                if (interfaceC17692 == null || interfaceC17692.mo3163().m3312()) {
                    return;
                }
                InterfaceC1769 interfaceC1769Mo31652 = interfaceC17692.mo3165();
                if (interfaceC1769Mo31652 != null && (abstractC1770Mo31632 = interfaceC1769Mo31652.mo3163()) != null) {
                    abstractC1770Mo31632.m3315();
                }
                InterfaceC1769 interfaceC1769Mo31653 = interfaceC17692.mo3165();
                interfaceC1769 = (interfaceC1769Mo31653 == null || (abstractC1770Mo3163 = interfaceC1769Mo31653.mo3163()) == null) ? null : abstractC1770Mo3163.f5193;
            }
        }
        this.f5193 = interfaceC1769;
    }
}
