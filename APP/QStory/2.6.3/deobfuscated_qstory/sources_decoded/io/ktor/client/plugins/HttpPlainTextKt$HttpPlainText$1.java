package io.ktor.client.plugins;

import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.AbstractC5132;
import net.bytebuddy.description.method.MethodDescription;
import p052.InterfaceC6543;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class HttpPlainTextKt$HttpPlainText$1 extends FunctionReferenceImpl implements InterfaceC6543 {
    public static final HttpPlainTextKt$HttpPlainText$1 INSTANCE = new HttpPlainTextKt$HttpPlainText$1();

    public HttpPlainTextKt$HttpPlainText$1() {
        super(0, C3939.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>()V", 0);
    }

    @Override // p052.InterfaceC6543
    public final C3939 invoke() {
        C3939 c3939 = new C3939();
        new LinkedHashSet();
        new LinkedHashMap();
        Charset charset = AbstractC5132.f14688;
        return c3939;
    }
}
