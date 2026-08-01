package p010;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.reader.C2699;
import com.bumptech.glide.AbstractC3056;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.google.protobuf.AbstractC3461;
import com.google.protobuf.AbstractC3473;
import com.google.protobuf.AbstractC3476;
import com.google.protobuf.C3465;
import com.google.protobuf.CodedInputStream$VarintExperiment;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C6158 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f16780 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static byte[] m11577(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (bArr.length >= 4 && bArr[0] == 0) ? Arrays.copyOfRange(bArr, 4, bArr.length) : bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m11578(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format(AbstractC3056.m6668(-3937634538273113511L), Integer.valueOf(b & DefaultClassResolver.NAME)));
        }
        return sb.toString();
    }

    public final String toString() {
        try {
            return m11583().toJSONString(JSONWriter$Feature.PrettyFormat);
        } catch (Exception unused) {
            return AbstractC3056.m6668(-3937634078711612839L);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final byte[] m11579() {
        HashMap map = this.f16780;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z = AbstractC3461.f11124;
        C3465 c3465 = new C3465(byteArrayOutputStream, 4096);
        try {
            for (Integer num : map.keySet()) {
                for (Object obj : (List) map.get(num)) {
                    if (obj instanceof Long) {
                        c3465.mo7661(num.intValue(), ((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        int iIntValue = num.intValue();
                        byte[] bytes = ((String) obj).getBytes();
                        int length = bytes.length;
                        c3465.mo7668(iIntValue, 2);
                        c3465.mo7675(bytes, length);
                    } else if (obj instanceof C6158) {
                        byte[] bArrM11579 = ((C6158) obj).m11579();
                        int iIntValue2 = num.intValue();
                        int length2 = bArrM11579.length;
                        c3465.mo7668(iIntValue2, 2);
                        c3465.mo7675(bArrM11579, length2);
                    } else if (obj instanceof Integer) {
                        c3465.mo7664(num.intValue(), ((Integer) obj).intValue());
                    } else {
                        AbstractC6157.m11574(AbstractC3056.m6668(-3937634383654290855L), AbstractC3056.m6668(-3937634302049912231L) + obj.getClass().getName(), new RuntimeException(), true);
                    }
                }
            }
            if (c3465.f11133 > 0) {
                c3465.m7695();
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            String strM6668 = AbstractC3056.m6668(-3937634229035468199L);
            String str = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
            return new byte[0];
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m11580(int i, Object obj) {
        ((List) this.f16780.computeIfAbsent(Integer.valueOf(i), new C2699(14))).add(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11581(JSONObject jSONObject) {
        try {
            for (String str : jSONObject.keySet()) {
                int i = Integer.parseInt(str);
                Object obj = jSONObject.get(str);
                if (obj instanceof JSONObject) {
                    C6158 c6158 = new C6158();
                    c6158.m11581((JSONObject) obj);
                    m11580(i, c6158);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                        Object obj2 = jSONArray.get(i2);
                        if (obj2 instanceof JSONObject) {
                            C6158 c61582 = new C6158();
                            c61582.m11581((JSONObject) obj2);
                            m11580(i, c61582);
                        } else {
                            m11580(i, obj2);
                        }
                    }
                } else {
                    m11580(i, obj);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11582(byte[] bArr) {
        CodedInputStream$VarintExperiment codedInputStream$VarintExperiment = AbstractC3473.f11147;
        AbstractC3476 abstractC3476M7707 = AbstractC3473.m7707(bArr, 0, bArr.length, false);
        while (abstractC3476M7707.mo7723() > 0) {
            int iMo7718 = abstractC3476M7707.mo7718();
            int i = iMo7718 >>> 3;
            int i2 = iMo7718 & 7;
            if (i2 == 4 || i2 == 3 || i2 > 5) {
                throw new IOException(AbstractC3056.m6668(-3937634594107688359L) + i2);
            }
            if (i2 == 0) {
                m11580(i, Long.valueOf(abstractC3476M7707.m7754()));
            } else if (i2 == 1) {
                m11580(i, Long.valueOf(abstractC3476M7707.m7754()));
            } else if (i2 == 2) {
                byte[] bArrM7761 = abstractC3476M7707.m7761(abstractC3476M7707.mo7752());
                try {
                    C6158 c6158 = new C6158();
                    c6158.m11582(bArrM7761);
                    m11580(i, c6158);
                } catch (Exception unused) {
                    try {
                        Charset charset = StandardCharsets.UTF_8;
                        String str = new String(bArrM7761, charset);
                        byte[] bytes = str.getBytes(charset);
                        if (bArrM7761.length == bytes.length) {
                            for (int i3 = 0; i3 < bArrM7761.length; i3++) {
                                if (bArrM7761[i3] == bytes[i3]) {
                                }
                            }
                            m11580(i, str);
                        }
                        m11580(i, AbstractC3056.m6668(-3937634516798277031L) + m11578(bArrM7761));
                        break;
                    } catch (Exception unused2) {
                        m11580(i, AbstractC3056.m6668(-3937634516798277031L).concat(m11578(bArrM7761)));
                    }
                }
            } else if (i2 != 5) {
                m11580(i, AbstractC3056.m6668(-3937634405129127335L) + i2);
            } else {
                m11580(i, Integer.valueOf(abstractC3476M7707.m7760()));
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final JSONObject m11583() {
        JSONObject jSONObject = new JSONObject();
        HashMap map = this.f16780;
        for (Integer num : map.keySet()) {
            List list = (List) map.get(num);
            if (list.size() > 1) {
                JSONArray jSONArray = new JSONArray();
                for (Object objM11583 : list) {
                    if (objM11583 instanceof C6158) {
                        objM11583 = ((C6158) objM11583).m11583();
                    }
                    jSONArray.add(objM11583);
                }
                jSONObject.put(String.valueOf(num), jSONArray);
            } else {
                for (Object objM115832 : list) {
                    String strValueOf = String.valueOf(num);
                    if (objM115832 instanceof C6158) {
                        objM115832 = ((C6158) objM115832).m11583();
                    }
                    jSONObject.put(strValueOf, objM115832);
                }
            }
        }
        return jSONObject;
    }
}
