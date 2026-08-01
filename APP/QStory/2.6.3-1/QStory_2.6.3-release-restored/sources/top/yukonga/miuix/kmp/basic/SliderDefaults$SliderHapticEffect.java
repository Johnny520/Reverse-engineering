package top.yukonga.miuix.kmp.basic;

import kotlin.Metadata;
import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import net.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m151d2 = {"top/yukonga/miuix/kmp/basic/SliderDefaults$SliderHapticEffect", "", "Ltop/yukonga/miuix/kmp/basic/SliderDefaults$SliderHapticEffect;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "None", "Edge", "Step", "miuix"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class SliderDefaults$SliderHapticEffect {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ SliderDefaults$SliderHapticEffect[] $VALUES;
    public static final SliderDefaults$SliderHapticEffect None = new SliderDefaults$SliderHapticEffect("None", 0);
    public static final SliderDefaults$SliderHapticEffect Edge = new SliderDefaults$SliderHapticEffect("Edge", 1);
    public static final SliderDefaults$SliderHapticEffect Step = new SliderDefaults$SliderHapticEffect("Step", 2);

    private static final /* synthetic */ SliderDefaults$SliderHapticEffect[] $values() {
        return new SliderDefaults$SliderHapticEffect[]{None, Edge, Step};
    }

    static {
        SliderDefaults$SliderHapticEffect[] sliderDefaults$SliderHapticEffectArr$values = $values();
        $VALUES = sliderDefaults$SliderHapticEffectArr$values;
        $ENTRIES = AbstractC5196.m9425(sliderDefaults$SliderHapticEffectArr$values);
    }

    private SliderDefaults$SliderHapticEffect(String str, int i) {
    }

    public static InterfaceC5197 getEntries() {
        return $ENTRIES;
    }

    public static SliderDefaults$SliderHapticEffect valueOf(String str) {
        return (SliderDefaults$SliderHapticEffect) Enum.valueOf(SliderDefaults$SliderHapticEffect.class, str);
    }

    public static SliderDefaults$SliderHapticEffect[] values() {
        return (SliderDefaults$SliderHapticEffect[]) $VALUES.clone();
    }
}
