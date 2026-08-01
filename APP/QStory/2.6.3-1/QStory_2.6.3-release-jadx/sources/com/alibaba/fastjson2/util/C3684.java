package com.alibaba.fastjson2.util;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3730;
import java.io.Reader;
import java.lang.reflect.Type;
import java.sql.Clob;
import java.sql.SQLException;
import p307.InterfaceC9352;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3684 implements InterfaceC9352 {
    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        try {
            Reader characterStream = ((Clob) obj).getCharacterStream();
            char c = abstractC3730.f9519;
            abstractC3730.mo6572(c);
            try {
                char[] cArr = new char[2048];
                while (true) {
                    int i = characterStream.read(cArr, 0, 2048);
                    if (i < 0) {
                        abstractC3730.mo6572(c);
                        return;
                    } else if (i > 0) {
                        abstractC3730.mo6575(i, cArr);
                    }
                }
            } catch (Exception e) {
                C1123.m1403("read string from reader error", e);
            }
        } catch (SQLException e2) {
            C1123.m1403("Clob.getCharacterStream error", e2);
        }
    }
}
