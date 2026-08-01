package io.ktor.client.plugins;

import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.AbstractC5964;
import net.bytebuddy.description.method.MethodDescription;
import p068.InterfaceC7372;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final /* synthetic */ class HttpPlainTextKt$HttpPlainText$1 extends FunctionReferenceImpl implements InterfaceC7372 {
    public static final HttpPlainTextKt$HttpPlainText$1 INSTANCE = new HttpPlainTextKt$HttpPlainText$1();

    public HttpPlainTextKt$HttpPlainText$1() {
        super(0, C4771.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>()V", 0);
    }

    @Override // p068.InterfaceC7372
    public final C4771 invoke() {
        C4771 c4771 = new C4771();
        new LinkedHashSet();
        new LinkedHashMap();
        Charset charset = AbstractC5964.f15033;
        return c4771;
    }
}
