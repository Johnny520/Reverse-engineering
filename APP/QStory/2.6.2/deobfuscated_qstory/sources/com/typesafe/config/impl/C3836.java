package com.typesafe.config.impl;

import p250.InterfaceC8160;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C3836 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8160 f12046;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f12047;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TokenType f12048;

    public C3836(TokenType tokenType, InterfaceC8160 interfaceC8160, String str, String str2) {
        this.f12048 = tokenType;
        this.f12046 = interfaceC8160;
        this.f12047 = str2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3836 m8217(TokenType tokenType, String str, String str2) {
        return new C3836(tokenType, null, str2, str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3836)) {
            return false;
        }
        C3836 c3836 = (C3836) obj;
        return mo8210(c3836) && this.f12048 == c3836.f12048;
    }

    public int hashCode() {
        return this.f12048.hashCode();
    }

    public String toString() {
        String str = this.f12047;
        return str != null ? str : this.f12048.name();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo8210(C3836 c3836) {
        return true;
    }
}
