package com.typesafe.config.impl;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class Tokenizer$ProblemException extends Exception {
    private static final long serialVersionUID = 1;
    private final C3836 problem;

    public Tokenizer$ProblemException(C3836 c3836) {
        this.problem = c3836;
    }

    public C3836 problem() {
        return this.problem;
    }
}
