package com.android.p001dx.p002cf.direct;

import com.android.p001dx.p002cf.iface.AttributeList;
import com.android.p001dx.p002cf.iface.Member;
import com.android.p001dx.p002cf.iface.ParseException;
import com.android.p001dx.p002cf.iface.ParseObserver;
import com.android.p001dx.p002cf.iface.StdAttributeList;
import com.android.p001dx.rop.cst.ConstantPool;
import com.android.p001dx.rop.cst.CstNat;
import com.android.p001dx.rop.cst.CstString;
import com.android.p001dx.rop.cst.CstType;
import com.android.p001dx.util.ByteArray;
import com.android.p001dx.util.Hex;

/* JADX INFO: loaded from: classes.dex */
abstract class MemberListParser {
    private final AttributeFactory attributeFactory;

    /* JADX INFO: renamed from: cf */
    private final DirectClassFile f4018cf;
    private final CstType definer;
    private int endOffset;
    private ParseObserver observer;
    private final int offset;

    public MemberListParser(DirectClassFile directClassFile, CstType cstType, int i, AttributeFactory attributeFactory) {
        if (directClassFile == null) {
            throw new NullPointerException("cf == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset < 0");
        }
        if (attributeFactory == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        this.f4018cf = directClassFile;
        this.definer = cstType;
        this.offset = i;
        this.attributeFactory = attributeFactory;
        this.endOffset = -1;
    }

    private void parse() {
        int i;
        int i2;
        ConstantPool constantPool;
        char c;
        int attributeContext = getAttributeContext();
        int count = getCount();
        int endOffset = this.offset + 2;
        ByteArray bytes = this.f4018cf.getBytes();
        ConstantPool constantPool2 = this.f4018cf.getConstantPool();
        ParseObserver parseObserver = this.observer;
        if (parseObserver != null) {
            parseObserver.parsed(bytes, this.offset, 2, humanName() + "s_count: " + Hex.m5035u2(count));
        }
        int i3 = 0;
        while (i3 < count) {
            try {
                int unsignedShort = bytes.getUnsignedShort(endOffset);
                int i4 = endOffset + 2;
                int unsignedShort2 = bytes.getUnsignedShort(i4);
                int i5 = endOffset + 4;
                int unsignedShort3 = bytes.getUnsignedShort(i5);
                CstString cstString = (CstString) constantPool2.get(unsignedShort2);
                CstString cstString2 = (CstString) constantPool2.get(unsignedShort3);
                ParseObserver parseObserver2 = this.observer;
                if (parseObserver2 != null) {
                    i2 = count;
                    constantPool = constantPool2;
                    parseObserver2.startParsingMember(bytes, endOffset, cstString.getString(), cstString2.getString());
                    this.observer.parsed(bytes, endOffset, 0, "\n" + humanName() + "s[" + i3 + "]:\n");
                    this.observer.changeIndent(1);
                    ParseObserver parseObserver3 = this.observer;
                    StringBuilder sb = new StringBuilder();
                    sb.append("access_flags: ");
                    sb.append(humanAccessFlags(unsignedShort));
                    parseObserver3.parsed(bytes, endOffset, 2, sb.toString());
                    this.observer.parsed(bytes, i4, 2, "name: " + cstString.toHuman());
                    c = 2;
                    this.observer.parsed(bytes, i5, 2, "descriptor: " + cstString2.toHuman());
                } else {
                    i2 = count;
                    constantPool = constantPool2;
                    c = 2;
                }
                AttributeListParser attributeListParser = new AttributeListParser(this.f4018cf, attributeContext, endOffset + 6, this.attributeFactory);
                attributeListParser.setObserver(this.observer);
                endOffset = attributeListParser.getEndOffset();
                StdAttributeList list = attributeListParser.getList();
                list.setImmutable();
                Member member = set(i3, unsignedShort, new CstNat(cstString, cstString2), list);
                ParseObserver parseObserver4 = this.observer;
                if (parseObserver4 != null) {
                    parseObserver4.changeIndent(-1);
                    this.observer.parsed(bytes, endOffset, 0, "end " + humanName() + "s[" + i3 + "]\n");
                    i = i3;
                    try {
                        this.observer.endParsingMember(bytes, endOffset, cstString.getString(), cstString2.getString(), member);
                    } catch (ParseException e) {
                        e = e;
                        e.addContext("...while parsing " + humanName() + "s[" + i + "]");
                        throw e;
                    } catch (RuntimeException e2) {
                        e = e2;
                        ParseException parseException = new ParseException(e);
                        parseException.addContext("...while parsing " + humanName() + "s[" + i + "]");
                        throw parseException;
                    }
                } else {
                    i = i3;
                }
                i3 = i + 1;
                count = i2;
                constantPool2 = constantPool;
            } catch (ParseException e3) {
                e = e3;
                i = i3;
            } catch (RuntimeException e4) {
                e = e4;
                i = i3;
            }
        }
        this.endOffset = endOffset;
    }

    public abstract int getAttributeContext();

    public final int getCount() {
        return this.f4018cf.getBytes().getUnsignedShort(this.offset);
    }

    public final CstType getDefiner() {
        return this.definer;
    }

    public int getEndOffset() {
        parseIfNecessary();
        return this.endOffset;
    }

    public abstract String humanAccessFlags(int i);

    public abstract String humanName();

    public final void parseIfNecessary() {
        if (this.endOffset < 0) {
            parse();
        }
    }

    public abstract Member set(int i, int i2, CstNat cstNat, AttributeList attributeList);

    public final void setObserver(ParseObserver parseObserver) {
        this.observer = parseObserver;
    }
}
