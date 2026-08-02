package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wp0 implements Appendable {

    /* JADX INFO: renamed from: h */
    public final Appendable f12604h;

    /* JADX INFO: renamed from: i */
    public boolean f12605i = true;

    public wp0(Appendable appendable) {
        this.f12604h = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z = this.f12605i;
        Appendable appendable = this.f12604h;
        boolean z2 = false;
        if (z) {
            this.f12605i = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
            z2 = true;
        }
        this.f12605i = z2;
        appendable.append(charSequence, i, i2);
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
    public final Appendable append(char c) throws IOException {
        boolean z = this.f12605i;
        Appendable appendable = this.f12604h;
        if (z) {
            this.f12605i = false;
            appendable.append("  ");
        }
        this.f12605i = c == '\n';
        appendable.append(c);
        return this;
    }
}
