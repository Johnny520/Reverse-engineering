package com.typesafe.config.impl;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class Tokenizer$ProblemException extends Exception {
    private static final long serialVersionUID = 1;
    private final C4669 problem;

    public Tokenizer$ProblemException(C4669 c4669) {
        this.problem = c4669;
    }

    public C4669 problem() {
        return this.problem;
    }
}
