package p101U0;

import com.bumptech.glide.AbstractC1922d;
import java.text.BreakIterator;

/* JADX INFO: renamed from: U0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1468c extends AbstractC1922d {

    /* JADX INFO: renamed from: f */
    public final BreakIterator f5147f;

    public C1468c(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f5147f = characterInstance;
    }

    @Override // com.bumptech.glide.AbstractC1922d
    /* JADX INFO: renamed from: A */
    public final int mo2735A(int i5) {
        return this.f5147f.preceding(i5);
    }

    @Override // com.bumptech.glide.AbstractC1922d
    /* JADX INFO: renamed from: x */
    public final int mo2736x(int i5) {
        return this.f5147f.following(i5);
    }
}
