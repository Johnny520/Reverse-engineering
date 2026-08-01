package com.typesafe.config.impl;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class Tokenizer$ProblemException extends Exception {
    private static final long serialVersionUID = 1;
    private final C3837 problem;

    public Tokenizer$ProblemException(C3837 c3837) {
        this.problem = c3837;
    }

    public C3837 problem() {
        return this.problem;
    }
}
