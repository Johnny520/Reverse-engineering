package p000;

import java.io.IOException;

/* JADX INFO: renamed from: Sj */
/* JADX INFO: loaded from: classes.dex */
public final class C0799Sj implements Appendable {

    /* JADX INFO: renamed from: a */
    public final Appendable f2503a;

    /* JADX INFO: renamed from: b */
    public boolean f2504b = true;

    public C0799Sj(Appendable appendable) {
        this.f2503a = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) throws IOException {
        boolean z = this.f2504b;
        Appendable appendable = this.f2503a;
        if (z) {
            this.f2504b = false;
            appendable.append("  ");
        }
        this.f2504b = c == '\n';
        appendable.append(c);
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
    public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z = this.f2504b;
        Appendable appendable = this.f2503a;
        boolean z2 = false;
        if (z) {
            this.f2504b = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
            z2 = true;
        }
        this.f2504b = z2;
        appendable.append(charSequence, i, i2);
        return this;
    }
}
