package androidx.compose.foundation.text.input.internal;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import net.bytebuddy.description.method.MethodDescription;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final /* synthetic */ class C0103xe9f87565 extends FunctionReferenceImpl implements InterfaceC7387 {
    public static final C0103xe9f87565 INSTANCE = new C0103xe9f87565();

    public C0103xe9f87565() {
        super(1, C1705.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>(Landroid/view/View;)V", 0);
    }

    @Override // p068.InterfaceC7387
    public final C1705 invoke(View view) {
        return new C1705(view);
    }
}
