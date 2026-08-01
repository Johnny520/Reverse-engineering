package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6554;
import p120.AbstractC7384;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class TextFieldSelectionState$observeTextChanges$3 extends FunctionReferenceImpl implements InterfaceC6554 {
    public static final TextFieldSelectionState$observeTextChanges$3 INSTANCE = new TextFieldSelectionState$observeTextChanges$3();

    public TextFieldSelectionState$observeTextChanges$3() {
        super(2, AbstractC7384.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
    }

    @Override // p052.InterfaceC6554
    public final Boolean invoke(AbstractC7384 abstractC7384, CharSequence charSequence) {
        abstractC7384.getClass();
        return Boolean.valueOf(charSequence == null);
    }
}
