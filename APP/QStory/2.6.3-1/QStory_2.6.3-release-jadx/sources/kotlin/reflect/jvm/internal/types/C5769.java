package kotlin.reflect.jvm.internal.types;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5177;
import kotlin.reflect.C5917;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.KVariance;
import kotlin.reflect.full.AbstractC5238;
import kotlin.reflect.jvm.internal.AbstractC5905;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import p113.InterfaceC8048;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5769 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5769 f14634 = new C5769(AbstractC5171.m9335());

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Map f14635;

    public C5769(Map map) {
        this.f14635 = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0123  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C5917 m10487(InterfaceC5919 interfaceC5919, KVariance kVariance) {
        AbstractC5758 c5771;
        AbstractC5758 abstractC5758Mo10472;
        AbstractC5758 abstractC5758Mo10475;
        interfaceC5919.getClass();
        kVariance.getClass();
        Map map = this.f14635;
        if (map.isEmpty()) {
            return new C5917(interfaceC5919, kVariance);
        }
        boolean z = interfaceC5919 instanceof AbstractC5758;
        AbstractC5758 abstractC5758 = z ? (AbstractC5758) interfaceC5919 : null;
        AbstractC5758 abstractC5758Mo104752 = abstractC5758 != null ? abstractC5758.mo10475() : null;
        AbstractC5758 abstractC57582 = z ? (AbstractC5758) interfaceC5919 : null;
        AbstractC5758 abstractC5758Mo104722 = abstractC57582 != null ? abstractC57582.mo10472() : null;
        boolean z2 = false;
        if (abstractC5758Mo104752 != null && abstractC5758Mo104722 != null) {
            C5917 c5917M10487 = m10487(abstractC5758Mo104752, kVariance);
            InterfaceC5919 interfaceC59192 = c5917M10487.f14982;
            AbstractC5758 abstractC57583 = interfaceC59192 instanceof AbstractC5758 ? (AbstractC5758) interfaceC59192 : null;
            if (abstractC57583 != null && (abstractC5758Mo10475 = abstractC57583.mo10475()) != null) {
                c5917M10487 = new C5917(abstractC5758Mo10475, c5917M10487.f14983);
            }
            C5917 c5917M104872 = m10487(abstractC5758Mo104722, kVariance);
            InterfaceC5919 interfaceC59193 = c5917M104872.f14982;
            AbstractC5758 abstractC57584 = interfaceC59193 instanceof AbstractC5758 ? (AbstractC5758) interfaceC59193 : null;
            if (abstractC57584 != null && (abstractC5758Mo10472 = abstractC57584.mo10472()) != null) {
                c5917M104872 = new C5917(abstractC5758Mo10472, c5917M104872.f14983);
            }
            InterfaceC5919 interfaceC59194 = c5917M104872.f14982;
            InterfaceC5919 interfaceC59195 = c5917M10487.f14982;
            if (interfaceC59194 == null || interfaceC59195 == null) {
                return C5917.f14981;
            }
            KVariance kVariance2 = c5917M10487.f14983;
            if (AbstractC5905.f14967) {
                AbstractC5714 abstractC5714 = ((C5770) interfaceC59195).f14639;
                abstractC5714.getClass();
                AbstractC5714 abstractC57142 = ((C5770) interfaceC59194).f14639;
                abstractC57142.getClass();
                c5771 = new C5770(AbstractC5725.m10368((AbstractC5710) abstractC5714, (AbstractC5710) abstractC57142), null, false);
            } else {
                AbstractC5758 abstractC57585 = (AbstractC5758) interfaceC59195;
                AbstractC5758 abstractC57586 = (AbstractC5758) interfaceC59194;
                c5771 = abstractC57585.equals(abstractC57586) ? abstractC57585 : new C5771(abstractC57585, abstractC57586, false, null);
            }
            return new C5917(c5771, kVariance2);
        }
        InterfaceC5924 interfaceC5924Mo9458 = interfaceC5919.mo9458();
        if (interfaceC5924Mo9458 == null) {
            return new C5917(interfaceC5919, kVariance);
        }
        C5917 c5917 = (C5917) map.get(interfaceC5924Mo9458);
        if (c5917 == null) {
            if (!interfaceC5919.mo9457().isEmpty()) {
                List<C5917> listMo9457 = interfaceC5919.mo9457();
                ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listMo9457, 10));
                for (C5917 c59172 : listMo9457) {
                    KVariance kVariance3 = c59172.f14983;
                    InterfaceC5919 interfaceC59196 = c59172.f14982;
                    arrayList.add((interfaceC59196 == null || kVariance3 == null) ? C5917.f14981 : m10487(interfaceC59196, kVariance3));
                }
                boolean zMo9455 = interfaceC5919.mo9455();
                List annotations = interfaceC5919.getAnnotations();
                AbstractC5758 abstractC57587 = z ? (AbstractC5758) interfaceC5919 : null;
                interfaceC5919 = AbstractC5238.m9488(interfaceC5924Mo9458, arrayList, zMo9455, annotations, abstractC57587 != null ? abstractC57587.mo10480() : null);
            }
            return new C5917(interfaceC5919, kVariance);
        }
        InterfaceC5919 interfaceC59197 = c5917.f14982;
        KVariance kVariance4 = c5917.f14983;
        if (interfaceC59197 == null || kVariance4 == null) {
            return c5917;
        }
        KVariance kVariance5 = KVariance.INVARIANT;
        if (kVariance4 != kVariance5) {
            if (kVariance != kVariance5 && kVariance4 != kVariance) {
                C6755.m11870("CONFLICTING_PROJECTION");
                return null;
            }
            kVariance = kVariance4;
        }
        InterfaceC8048 interfaceC8048 = (InterfaceC8048) interfaceC59197;
        AbstractC5758 abstractC5758Mo10473 = ((AbstractC5758) interfaceC8048).mo10473(interfaceC5919.mo9455() || interfaceC59197.mo9455());
        AbstractC5758 abstractC57588 = z ? (AbstractC5758) interfaceC5919 : null;
        if (abstractC57588 == null || !abstractC57588.mo10481()) {
            AbstractC5758 abstractC57589 = interfaceC8048 instanceof AbstractC5758 ? (AbstractC5758) interfaceC8048 : null;
            if (abstractC57589 != null && abstractC57589.mo10481() && !interfaceC5919.mo9455()) {
                z2 = true;
            }
        }
        return new C5917(abstractC5758Mo10473.mo10474(z2), kVariance);
    }
}
