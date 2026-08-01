package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.AbstractC4363;
import kotlin.enums.InterfaceC4364;
import kotlin.jvm.internal.AbstractC4384;
import kotlin.text.AbstractC5138;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class RenderingFormat {
    private static final /* synthetic */ InterfaceC4364 $ENTRIES;
    private static final /* synthetic */ RenderingFormat[] $VALUES;
    public static final RenderingFormat PLAIN = new RenderingFormat("PLAIN", 0) { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.PLAIN
        {
            AbstractC4384 abstractC4384 = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        public String escape(String str) {
            str.getClass();
            return str;
        }
    };
    public static final RenderingFormat HTML = new RenderingFormat("HTML", 1) { // from class: kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat.HTML
        {
            AbstractC4384 abstractC4384 = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        public String escape(String str) {
            str.getClass();
            return AbstractC5138.m10128(AbstractC5138.m10128(str, "<", "&lt;"), ">", "&gt;");
        }
    };

    private static final /* synthetic */ RenderingFormat[] $values() {
        return new RenderingFormat[]{PLAIN, HTML};
    }

    static {
        RenderingFormat[] renderingFormatArr$values = $values();
        $VALUES = renderingFormatArr$values;
        $ENTRIES = AbstractC4363.m8876(renderingFormatArr$values);
    }

    public /* synthetic */ RenderingFormat(String str, int i, AbstractC4384 abstractC4384) {
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
