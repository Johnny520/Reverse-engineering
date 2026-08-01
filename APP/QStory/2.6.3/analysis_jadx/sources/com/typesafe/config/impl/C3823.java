package com.typesafe.config.impl;

import androidx.activity.AbstractC0053;
import p250.InterfaceC8161;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3823 extends C3837 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f12024;

    public C3823(InterfaceC8161 interfaceC8161, String str) {
        super(TokenType.UNQUOTED_TEXT, interfaceC8161, null, null);
        this.f12024 = str;
    }

    @Override // com.typesafe.config.impl.C3837
    public final boolean equals(Object obj) {
        return super.equals(obj) && ((C3823) obj).f12024.equals(this.f12024);
    }

    @Override // com.typesafe.config.impl.C3837
    public final int hashCode() {
        return this.f12024.hashCode() + ((this.f12053.hashCode() + 41) * 41);
    }

    @Override // com.typesafe.config.impl.C3837
    public final String toString() {
        return AbstractC0053.m151(new StringBuilder("'"), this.f12024, "'");
    }

    @Override // com.typesafe.config.impl.C3837
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo8197(C3837 c3837) {
        return c3837 instanceof C3823;
    }
}
