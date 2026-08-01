package com.android.dx.cf.direct;

import bsh.C2633;
import com.android.dx.cf.attrib.RawAttribute;
import com.android.dx.cf.iface.Attribute;
import com.android.dx.cf.iface.ParseException;
import com.android.dx.cf.iface.ParseObserver;
import com.android.dx.rop.cst.ConstantPool;
import com.android.dx.rop.cst.CstString;
import com.android.dx.util.ByteArray;
import com.android.dx.util.Hex;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class AttributeFactory {
    public static final int CTX_CLASS = 0;
    public static final int CTX_CODE = 3;
    public static final int CTX_COUNT = 4;
    public static final int CTX_FIELD = 1;
    public static final int CTX_METHOD = 2;

    public final Attribute parse(DirectClassFile directClassFile, int i, int i2, ParseObserver parseObserver) {
        String str;
        CstString cstString = null;
        if (directClassFile == null) {
            C2633.m5343("cf == null");
            return null;
        }
        if (i < 0 || i >= 4) {
            C5925.m11310("bad context");
            return null;
        }
        try {
            ByteArray bytes = directClassFile.getBytes();
            ConstantPool constantPool = directClassFile.getConstantPool();
            int unsignedShort = bytes.getUnsignedShort(i2);
            int i3 = i2 + 2;
            int i4 = bytes.getInt(i3);
            CstString cstString2 = (CstString) constantPool.get(unsignedShort);
            if (parseObserver != null) {
                try {
                    parseObserver.parsed(bytes, i2, 2, "name: " + cstString2.toHuman());
                    parseObserver.parsed(bytes, i3, 4, "length: " + Hex.u4(i4));
                } catch (ParseException e) {
                    e = e;
                    cstString = cstString2;
                    StringBuilder sb = new StringBuilder("...while parsing ");
                    if (cstString != null) {
                        str = cstString.toHuman() + " ";
                    } else {
                        str = "";
                    }
                    sb.append(str);
                    sb.append("attribute at offset ");
                    sb.append(Hex.u4(i2));
                    e.addContext(sb.toString());
                    throw e;
                }
            }
            return parse0(directClassFile, i, cstString2.getString(), i2 + 6, i4, parseObserver);
        } catch (ParseException e2) {
            e = e2;
        }
    }

    public Attribute parse0(DirectClassFile directClassFile, int i, String str, int i2, int i3, ParseObserver parseObserver) {
        ByteArray bytes = directClassFile.getBytes();
        RawAttribute rawAttribute = new RawAttribute(str, bytes, i2, i3, directClassFile.getConstantPool());
        if (parseObserver != null) {
            parseObserver.parsed(bytes, i2, i3, "attribute data");
        }
        return rawAttribute;
    }
}
