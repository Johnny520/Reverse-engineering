package com.typesafe.config.impl;

import p266.InterfaceC8990;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C4669 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8990 f12396;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f12397;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TokenType f12398;

    public C4669(TokenType tokenType, InterfaceC8990 interfaceC8990, String str, String str2) {
        this.f12398 = tokenType;
        this.f12396 = interfaceC8990;
        this.f12397 = str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C4669 m8763(TokenType tokenType, String str, String str2) {
        return new C4669(tokenType, null, str2, str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4669)) {
            return false;
        }
        C4669 c4669 = (C4669) obj;
        return mo8756(c4669) && this.f12398 == c4669.f12398;
    }

    public int hashCode() {
        return this.f12398.hashCode();
    }

    public String toString() {
        String str = this.f12397;
        return str != null ? str : this.f12398.name();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo8756(C4669 c4669) {
        return true;
    }
}
