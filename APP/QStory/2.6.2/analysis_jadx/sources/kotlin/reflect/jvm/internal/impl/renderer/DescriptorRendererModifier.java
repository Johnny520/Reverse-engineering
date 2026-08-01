package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4346;
import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorRendererModifier {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ DescriptorRendererModifier[] $VALUES;
    public static final Set<DescriptorRendererModifier> ALL;
    public static final Set<DescriptorRendererModifier> ALL_EXCEPT_ANNOTATIONS;
    public static final C4744 Companion;
    private final boolean includeByDefault;
    public static final DescriptorRendererModifier VISIBILITY = new DescriptorRendererModifier("VISIBILITY", 0, true);
    public static final DescriptorRendererModifier MODALITY = new DescriptorRendererModifier("MODALITY", 1, true);
    public static final DescriptorRendererModifier OVERRIDE = new DescriptorRendererModifier("OVERRIDE", 2, true);
    public static final DescriptorRendererModifier ANNOTATIONS = new DescriptorRendererModifier("ANNOTATIONS", 3, false);
    public static final DescriptorRendererModifier INNER = new DescriptorRendererModifier("INNER", 4, true);
    public static final DescriptorRendererModifier MEMBER_KIND = new DescriptorRendererModifier("MEMBER_KIND", 5, true);
    public static final DescriptorRendererModifier DATA = new DescriptorRendererModifier("DATA", 6, true);
    public static final DescriptorRendererModifier INLINE = new DescriptorRendererModifier("INLINE", 7, true);
    public static final DescriptorRendererModifier EXPECT = new DescriptorRendererModifier("EXPECT", 8, true);
    public static final DescriptorRendererModifier ACTUAL = new DescriptorRendererModifier("ACTUAL", 9, true);
    public static final DescriptorRendererModifier CONST = new DescriptorRendererModifier("CONST", 10, true);
    public static final DescriptorRendererModifier LATEINIT = new DescriptorRendererModifier("LATEINIT", 11, true);
    public static final DescriptorRendererModifier FUN = new DescriptorRendererModifier("FUN", 12, true);
    public static final DescriptorRendererModifier VALUE = new DescriptorRendererModifier("VALUE", 13, true);

    private static final /* synthetic */ DescriptorRendererModifier[] $values() {
        return new DescriptorRendererModifier[]{VISIBILITY, MODALITY, OVERRIDE, ANNOTATIONS, INNER, MEMBER_KIND, DATA, INLINE, EXPECT, ACTUAL, CONST, LATEINIT, FUN, VALUE};
    }

    static {
        DescriptorRendererModifier[] descriptorRendererModifierArr$values = $values();
        $VALUES = descriptorRendererModifierArr$values;
        $ENTRIES = AbstractC4363.m8876(descriptorRendererModifierArr$values);
        Companion = new C4744();
        DescriptorRendererModifier[] descriptorRendererModifierArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (DescriptorRendererModifier descriptorRendererModifier : descriptorRendererModifierArrValues) {
            if (descriptorRendererModifier.includeByDefault) {
                arrayList.add(descriptorRendererModifier);
            }
        }
        ALL_EXCEPT_ANNOTATIONS = AbstractC4343.m8800(arrayList);
        ALL = AbstractC4346.m8852(values());
    }

    private DescriptorRendererModifier(String str, int i, boolean z) {
        this.includeByDefault = z;
    }

    public static DescriptorRendererModifier valueOf(String str) {
        return (DescriptorRendererModifier) Enum.valueOf(DescriptorRendererModifier.class, str);
    }

    public static DescriptorRendererModifier[] values() {
        return (DescriptorRendererModifier[]) $VALUES.clone();
    }
}
