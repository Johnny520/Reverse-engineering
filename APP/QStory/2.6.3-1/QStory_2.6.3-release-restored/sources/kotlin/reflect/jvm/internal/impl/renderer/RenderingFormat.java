package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.AbstractC5196;
import kotlin.enums.InterfaceC5197;
import kotlin.jvm.internal.AbstractC5217;
import kotlin.text.AbstractC5971;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class RenderingFormat {
    private static final /* synthetic */ InterfaceC5197 $ENTRIES;
    private static final /* synthetic */ RenderingFormat[] $VALUES;
    public static final RenderingFormat PLAIN = new RenderingFormat("PLAIN", 0) { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.PLAIN
        {
            AbstractC5217 abstractC5217 = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        public String escape(String str) {
            str.getClass();
            return str;
        }
    };
    public static final RenderingFormat HTML = new RenderingFormat("HTML", 1) { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML
        {
            AbstractC5217 abstractC5217 = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        public String escape(String str) {
            str.getClass();
            return AbstractC5971.m10696(AbstractC5971.m10696(str, "<", "&lt;"), ">", "&gt;");
        }
    };

    private static final /* synthetic */ RenderingFormat[] $values() {
        return new RenderingFormat[]{PLAIN, HTML};
    }

    static {
        RenderingFormat[] renderingFormatArr$values = $values();
        $VALUES = renderingFormatArr$values;
        $ENTRIES = AbstractC5196.m9425(renderingFormatArr$values);
    }

    public /* synthetic */ RenderingFormat(String str, int i, AbstractC5217 abstractC5217) {
        this(str, i);
    }

    public static RenderingFormat valueOf(String str) {
        return (RenderingFormat) Enum.valueOf(RenderingFormat.class, str);
    }

    public static RenderingFormat[] values() {
        return (RenderingFormat[]) $VALUES.clone();
    }

    public abstract String escape(String str);

    private RenderingFormat(String str, int i) {
    }
}
