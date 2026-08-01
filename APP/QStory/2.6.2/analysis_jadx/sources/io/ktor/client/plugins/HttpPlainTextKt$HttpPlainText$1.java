package io.ktor.client.plugins;

import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.AbstractC5131;
import net.bytebuddy.description.method.MethodDescription;
import p052.InterfaceC6542;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class HttpPlainTextKt$HttpPlainText$1 extends FunctionReferenceImpl implements InterfaceC6542 {
    public static final HttpPlainTextKt$HttpPlainText$1 INSTANCE = new HttpPlainTextKt$HttpPlainText$1();

    public HttpPlainTextKt$HttpPlainText$1() {
        super(0, C3938.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>()V", 0);
    }

    @Override // p052.InterfaceC6542
    public final C3938 invoke() {
        C3938 c3938 = new C3938();
        new LinkedHashSet();
        new LinkedHashMap();
        Charset charset = AbstractC5131.f14688;
        return c3938;
    }
}
