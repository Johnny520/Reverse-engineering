package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2896;
import java.io.Reader;
import java.lang.reflect.Type;
import java.sql.Clob;
import java.sql.SQLException;
import p291.InterfaceC8531;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2850 implements InterfaceC8531 {
    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        try {
            Reader characterStream = ((Clob) obj).getCharacterStream();
            char c = abstractC2896.f9172;
            abstractC2896.mo5967(c);
            try {
                char[] cArr = new char[2048];
                while (true) {
                    int i = characterStream.read(cArr, 0, 2048);
                    if (i < 0) {
                        abstractC2896.mo5967(c);
                        return;
                    } else if (i > 0) {
                        abstractC2896.mo5970(i, cArr);
                    }
                }
            } catch (Exception e) {
                C0276.m842("read string from reader error", e);
            }
        } catch (SQLException e2) {
            C0276.m842("Clob.getCharacterStream error", e2);
        }
    }
}
