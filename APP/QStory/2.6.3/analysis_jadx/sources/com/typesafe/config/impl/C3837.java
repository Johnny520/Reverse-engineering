package com.typesafe.config.impl;

import p250.InterfaceC8161;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3837 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8161 f12051;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f12052;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TokenType f12053;

    public C3837(TokenType tokenType, InterfaceC8161 interfaceC8161, String str, String str2) {
        this.f12053 = tokenType;
        this.f12051 = interfaceC8161;
        this.f12052 = str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3837 m8204(TokenType tokenType, String str, String str2) {
        return new C3837(tokenType, null, str2, str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3837)) {
            return false;
        }
        C3837 c3837 = (C3837) obj;
        return mo8197(c3837) && this.f12053 == c3837.f12053;
    }

    public int hashCode() {
        return this.f12053.hashCode();
    }

    public String toString() {
        String str = this.f12052;
        return str != null ? str : this.f12053.name();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo8197(C3837 c3837) {
        return true;
    }
}
