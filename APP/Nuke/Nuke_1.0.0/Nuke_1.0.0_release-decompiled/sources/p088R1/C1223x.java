package p088R1;

import java.io.IOException;

/* JADX INFO: renamed from: R1.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1223x implements Appendable {

    /* JADX INFO: renamed from: d */
    public final Appendable f4086d;

    /* JADX INFO: renamed from: e */
    public boolean f4087e = true;

    public C1223x(Appendable appendable) {
        this.f4086d = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c5) throws IOException {
        boolean z5 = this.f4087e;
        Appendable appendable = this.f4086d;
        if (z5) {
            this.f4087e = false;
            appendable.append("  ");
        }
        this.f4087e = c5 == '\n';
        appendable.append(c5);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i5, int i6) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z5 = this.f4087e;
        Appendable appendable = this.f4086d;
        boolean z6 = false;
        if (z5) {
            this.f4087e = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i6 - 1) == '\n') {
            z6 = true;
        }
        this.f4087e = z6;
        appendable.append(charSequence, i5, i6);
        return this;
    }
}
