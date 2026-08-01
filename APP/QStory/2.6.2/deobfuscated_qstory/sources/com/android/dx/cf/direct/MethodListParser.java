package com.android.dx.cf.direct;

import com.android.dx.cf.iface.AttributeList;
import com.android.dx.cf.iface.Member;
import com.android.dx.cf.iface.StdMethod;
import com.android.dx.cf.iface.StdMethodList;
import com.android.dx.rop.code.AccessFlags;
import com.android.dx.rop.cst.CstNat;
import com.android.dx.rop.cst.CstType;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
final class MethodListParser extends MemberListParser {
    private final StdMethodList methods;

    public MethodListParser(DirectClassFile directClassFile, CstType cstType, int i, AttributeFactory attributeFactory) {
        super(directClassFile, cstType, i, attributeFactory);
        this.methods = new StdMethodList(getCount());
    }

    @Override // com.android.dx.cf.direct.MemberListParser
    public int getAttributeContext() {
        return 2;
    }

    public StdMethodList getList() {
        parseIfNecessary();
        return this.methods;
    }

    @Override // com.android.dx.cf.direct.MemberListParser
    public String humanAccessFlags(int i) {
        return AccessFlags.methodString(i);
    }

    @Override // com.android.dx.cf.direct.MemberListParser
    public String humanName() {
        return "method";
    }

    @Override // com.android.dx.cf.direct.MemberListParser
    public Member set(int i, int i2, CstNat cstNat, AttributeList attributeList) {
        StdMethod stdMethod = new StdMethod(getDefiner(), i2, cstNat, attributeList);
        this.methods.set(i, stdMethod);
        return stdMethod;
    }
}
