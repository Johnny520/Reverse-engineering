package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6553;
import p120.AbstractC7383;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class TextFieldSelectionState$observeTextChanges$3 extends FunctionReferenceImpl implements InterfaceC6553 {
    public static final TextFieldSelectionState$observeTextChanges$3 INSTANCE = new TextFieldSelectionState$observeTextChanges$3();

    public TextFieldSelectionState$observeTextChanges$3() {
        super(2, AbstractC7383.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
    }

    @Override // p052.InterfaceC6553
    public final Boolean invoke(AbstractC7383 abstractC7383, CharSequence charSequence) {
        abstractC7383.getClass();
        return Boolean.valueOf(charSequence == null);
    }
}
