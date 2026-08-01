package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2897;
import java.io.Reader;
import java.lang.reflect.Type;
import java.sql.Clob;
import java.sql.SQLException;
import p291.InterfaceC8523;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2851 implements InterfaceC8523 {
    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        try {
            Reader characterStream = ((Clob) obj).getCharacterStream();
            char c = abstractC2897.f9174;
            abstractC2897.mo6012(c);
            try {
                char[] cArr = new char[2048];
                while (true) {
                    int i = characterStream.read(cArr, 0, 2048);
                    if (i < 0) {
                        abstractC2897.mo6012(c);
                        return;
                    } else if (i > 0) {
                        abstractC2897.mo6015(i, cArr);
                    }
                }
            } catch (Exception e) {
                C0276.m843("read string from reader error", e);
            }
        } catch (SQLException e2) {
            C0276.m843("Clob.getCharacterStream error", e2);
        }
    }
}
