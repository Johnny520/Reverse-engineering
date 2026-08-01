package com.bumptech.glide.load.engine;

import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3002 implements Appendable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f9527 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Appendable f9528;

    public C3002(Appendable appendable) {
        this.f9528 = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z = this.f9527;
        Appendable appendable = this.f9528;
        boolean z2 = false;
        if (z) {
            this.f9527 = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
            z2 = true;
        }
        this.f9527 = z2;
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
        boolean z = this.f9527;
        Appendable appendable = this.f9528;
        if (z) {
            this.f9527 = false;
            appendable.append("  ");
        }
        this.f9527 = c == '\n';
        appendable.append(c);
        return this;
    }
}
