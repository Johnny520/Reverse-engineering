package com.bumptech.glide.load.engine;

import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3003 implements Appendable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f9529 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Appendable f9530;

    public C3003(Appendable appendable) {
        this.f9530 = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z = this.f9529;
        Appendable appendable = this.f9530;
        boolean z2 = false;
        if (z) {
            this.f9529 = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
            z2 = true;
        }
        this.f9529 = z2;
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
        boolean z = this.f9529;
        Appendable appendable = this.f9530;
        if (z) {
            this.f9529 = false;
            appendable.append("  ");
        }
        this.f9529 = c == '\n';
        appendable.append(c);
        return this;
    }
}
