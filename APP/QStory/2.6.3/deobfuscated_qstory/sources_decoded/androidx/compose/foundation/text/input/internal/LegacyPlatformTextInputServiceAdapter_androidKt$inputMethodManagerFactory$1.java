package androidx.compose.foundation.text.input.internal;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import net.bytebuddy.description.method.MethodDescription;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 extends FunctionReferenceImpl implements InterfaceC6558 {
    public static final LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 INSTANCE = new LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1();

    public LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1() {
        super(1, C0867.class, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "<init>(Landroid/view/View;)V", 0);
    }

    @Override // p052.InterfaceC6558
    public final C0867 invoke(View view) {
        return new C0867(view);
    }
}
