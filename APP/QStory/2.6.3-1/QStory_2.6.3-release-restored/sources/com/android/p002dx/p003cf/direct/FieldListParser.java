package com.android.p002dx.p003cf.direct;

import com.android.p002dx.p003cf.iface.AttributeList;
import com.android.p002dx.p003cf.iface.Member;
import com.android.p002dx.p003cf.iface.StdField;
import com.android.p002dx.p003cf.iface.StdFieldList;
import com.android.p002dx.rop.code.AccessFlags;
import com.android.p002dx.rop.cst.CstNat;
import com.android.p002dx.rop.cst.CstType;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class FieldListParser extends MemberListParser {
    private final StdFieldList fields;

    public FieldListParser(DirectClassFile directClassFile, CstType cstType, int i, AttributeFactory attributeFactory) {
        super(directClassFile, cstType, i, attributeFactory);
        this.fields = new StdFieldList(getCount());
    }

    @Override // com.android.p002dx.p003cf.direct.MemberListParser
    public int getAttributeContext() {
        return 1;
    }

    public StdFieldList getList() {
        parseIfNecessary();
        return this.fields;
    }

    @Override // com.android.p002dx.p003cf.direct.MemberListParser
    public String humanAccessFlags(int i) {
        return AccessFlags.fieldString(i);
    }

    @Override // com.android.p002dx.p003cf.direct.MemberListParser
    public String humanName() {
        return "field";
    }

    @Override // com.android.p002dx.p003cf.direct.MemberListParser
    public Member set(int i, int i2, CstNat cstNat, AttributeList attributeList) {
        StdField stdField = new StdField(getDefiner(), i2, cstNat, attributeList);
        this.fields.set(i, stdField);
        return stdField;
    }
}
