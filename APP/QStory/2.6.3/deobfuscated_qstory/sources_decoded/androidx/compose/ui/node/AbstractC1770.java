package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC1688;
import androidx.compose.ui.layout.AbstractC1689;
import androidx.compose.ui.layout.C1697;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.C5176;
import kotlin.collections.AbstractC4339;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.ui.node.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1770 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC1769 f5194;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f5195;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f5196;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f5197;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1769 f5199;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f5198 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final HashMap f5200 = new HashMap();

    public AbstractC1770(InterfaceC1769 interfaceC1769) {
        this.f5199 = interfaceC1769;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3320(AbstractC1770 abstractC1770, AbstractC1689 abstractC1689, int i, AbstractC1794 abstractC1794) {
        long jMo3314;
        HashMap map = abstractC1770.f5200;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        loop0: while (true) {
            jMo3314 = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                jMo3314 = abstractC1770.mo3314(abstractC1794, jMo3314);
                abstractC1794 = abstractC1794.f5256;
                abstractC1794.getClass();
                if (abstractC1794.equals(abstractC1770.f5199.mo3172())) {
                    break loop0;
                }
            } while (!abstractC1770.mo3313(abstractC1794).containsKey(abstractC1689));
            float fMo3312 = abstractC1770.mo3312(abstractC1794, abstractC1689);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fMo3312);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fMo3312);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
        int iRound = Math.round(abstractC1689 instanceof C1697 ? Float.intBitsToFloat((int) (jMo3314 & 4294967295L)) : Float.intBitsToFloat((int) (jMo3314 >> 32)));
        if (map.containsKey(abstractC1689)) {
            int iIntValue = ((Number) AbstractC4339.m8773(abstractC1689, map)).intValue();
            C1697 c1697 = AbstractC1688.f4952;
            iRound = ((Number) abstractC1689.f4953.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
        }
        map.put(abstractC1689, Integer.valueOf(iRound));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m3321() {
        m3325();
        return this.f5194 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m3322() {
        return this.f5197 || this.f5196 || this.f5195;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract int mo3312(AbstractC1794 abstractC1794, AbstractC1689 abstractC1689);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract Map mo3313(AbstractC1794 abstractC1794);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract long mo3314(AbstractC1794 abstractC1794, long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m3323() {
        HashMap map = this.f5200;
        map.clear();
        InterfaceC6558 interfaceC6558 = new InterfaceC6558() { // from class: androidx.compose.ui.node.AlignmentLines$recalculate$1
            {
                super(1);
            }

            public final void invoke(InterfaceC1769 interfaceC1769) {
                if (interfaceC1769.mo3174() == Integer.MAX_VALUE) {
                    return;
                }
                if (interfaceC1769.mo3173().f5198) {
                    interfaceC1769.mo3167();
                }
                HashMap map2 = interfaceC1769.mo3173().f5200;
                AbstractC1770 abstractC1770 = this.this$0;
                for (Map.Entry entry : map2.entrySet()) {
                    AbstractC1770.m3320(abstractC1770, (AbstractC1689) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC1769.mo3172());
                }
                AbstractC1794 abstractC1794 = interfaceC1769.mo3172().f5256;
                abstractC1794.getClass();
                while (!abstractC1794.equals(this.this$0.f5199.mo3172())) {
                    Set<AbstractC1689> setKeySet = this.this$0.mo3313(abstractC1794).keySet();
                    AbstractC1770 abstractC17702 = this.this$0;
                    for (AbstractC1689 abstractC1689 : setKeySet) {
                        AbstractC1770.m3320(abstractC17702, abstractC1689, abstractC17702.mo3312(abstractC1794, abstractC1689), abstractC1794);
                    }
                    abstractC1794 = abstractC1794.f5256;
                    abstractC1794.getClass();
                }
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC1769) obj);
                return C5176.f14739;
            }
        };
        InterfaceC1769 interfaceC1769 = this.f5199;
        interfaceC1769.mo3166(interfaceC6558);
        map.putAll(mo3313(interfaceC1769.mo3172()));
        this.f5198 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3324() {
        this.f5198 = true;
        InterfaceC1769 interfaceC1769 = this.f5199;
        InterfaceC1769 interfaceC1769Mo3175 = interfaceC1769.mo3175();
        if (interfaceC1769Mo3175 == null) {
            return;
        }
        if (this.f5197) {
            interfaceC1769Mo3175.requestLayout();
        }
        if (this.f5196) {
            interfaceC1769.mo3165();
        }
        if (this.f5195) {
            interfaceC1769.requestLayout();
        }
        interfaceC1769Mo3175.mo3173().m3324();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m3325() {
        AbstractC1770 abstractC1770Mo3173;
        AbstractC1770 abstractC1770Mo31732;
        boolean zM3322 = m3322();
        InterfaceC1769 interfaceC1769 = this.f5199;
        if (!zM3322) {
            InterfaceC1769 interfaceC1769Mo3175 = interfaceC1769.mo3175();
            if (interfaceC1769Mo3175 == null) {
                return;
            }
            interfaceC1769 = interfaceC1769Mo3175.mo3173().f5194;
            if (interfaceC1769 == null || !interfaceC1769.mo3173().m3322()) {
                InterfaceC1769 interfaceC17692 = this.f5194;
                if (interfaceC17692 == null || interfaceC17692.mo3173().m3322()) {
                    return;
                }
                InterfaceC1769 interfaceC1769Mo31752 = interfaceC17692.mo3175();
                if (interfaceC1769Mo31752 != null && (abstractC1770Mo31732 = interfaceC1769Mo31752.mo3173()) != null) {
                    abstractC1770Mo31732.m3325();
                }
                InterfaceC1769 interfaceC1769Mo31753 = interfaceC17692.mo3175();
                interfaceC1769 = (interfaceC1769Mo31753 == null || (abstractC1770Mo3173 = interfaceC1769Mo31753.mo3173()) == null) ? null : abstractC1770Mo3173.f5194;
            }
        }
        this.f5194 = interfaceC1769;
    }
}
