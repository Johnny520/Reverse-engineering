package io.ktor.client.plugins;

import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import net.bytebuddy.description.method.MethodDescription;
import p068.InterfaceC7372;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final /* synthetic */ class UserAgentKt$UserAgent$1 extends AdaptedFunctionReference implements InterfaceC7372 {
    public static final UserAgentKt$UserAgent$1 INSTANCE = new UserAgentKt$UserAgent$1();

    public UserAgentKt$UserAgent$1() {
        super(0, C4745.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>(Ljava/lang/String;)V", 0);
    }

    @Override // p068.InterfaceC7372
    public final C4745 invoke() {
        return new C4745();
    }
}
