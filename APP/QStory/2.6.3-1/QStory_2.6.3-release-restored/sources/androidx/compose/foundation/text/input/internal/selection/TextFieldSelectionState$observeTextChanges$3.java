package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7383;
import p136.AbstractC8213;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final /* synthetic */ class TextFieldSelectionState$observeTextChanges$3 extends FunctionReferenceImpl implements InterfaceC7383 {
    public static final TextFieldSelectionState$observeTextChanges$3 INSTANCE = new TextFieldSelectionState$observeTextChanges$3();

    public TextFieldSelectionState$observeTextChanges$3() {
        super(2, AbstractC8213.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
    }

    @Override // p068.InterfaceC7383
    public final Boolean invoke(AbstractC8213 abstractC8213, CharSequence charSequence) {
        abstractC8213.getClass();
        return Boolean.valueOf(charSequence == null);
    }
}
