package Yue;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: Yue.ۥۡۤ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6652 extends AbstractC4069 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f17086 = "permessage-deflate";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f17087 = "server_no_context_takeover";

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String f17088 = "client_no_context_takeover";

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final String f17089 = "server_max_window_bits";

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final String f17090 = "client_max_window_bits";

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f17091 = 32768;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f17092 = 32768;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final byte[] f17093 = {0, 0, -1, -1};

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f17094 = 1024;

    /* JADX INFO: renamed from: ۥ */
    public int f2208 = 1024;

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean f2209 = true;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f17095 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Map<String, String> f17096 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Inflater f17097 = new Inflater(true);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Deflater f17098 = new Deflater(-1, true);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m21263(byte[] bArr) {
        if (bArr.length < 4) {
            return false;
        }
        int length = bArr.length;
        int i = 0;
        while (true) {
            byte[] bArr2 = f17093;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr2[i] != bArr[(length - bArr2.length) + i]) {
                return false;
            }
            i++;
        }
    }

    @Override // Yue.C4339, Yue.InterfaceC5392
    public String toString() {
        return "PerMessageDeflateExtension";
    }

    @Override // Yue.C4339, Yue.InterfaceC5392
    /* JADX INFO: renamed from: ۥ */
    public InterfaceC5392 mo1305() {
        return new C6652();
    }

    @Override // Yue.C4339, Yue.InterfaceC5392
    /* JADX INFO: renamed from: ۥ۟ */
    public boolean mo1306(String str) {
        for (String str2 : str.split(",")) {
            C4782 c4782M14454 = C4782.m14454(str2);
            if (f17086.equalsIgnoreCase(c4782M14454.m1686())) {
                this.f17096.putAll(c4782M14454.m1687());
                if (this.f17096.containsKey(f17088)) {
                    this.f17095 = true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // Yue.C4339, Yue.InterfaceC5392
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo12599(InterfaceC5114 interfaceC5114) {
        if (interfaceC5114 instanceof AbstractC4298) {
            byte[] bArrArray = interfaceC5114.mo10645().array();
            if (bArrArray.length < this.f2208) {
                return;
            }
            if (!(interfaceC5114 instanceof C4209)) {
                ((AbstractC4298) interfaceC5114).m15787(true);
            }
            this.f17098.setInput(bArrArray);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int iDeflate = this.f17098.deflate(bArr, 0, 1024, 2);
                if (iDeflate <= 0) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, iDeflate);
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int length = byteArray.length;
            if (interfaceC5114.mo15784()) {
                if (m21263(byteArray)) {
                    length -= f17093.length;
                }
                if (this.f2209) {
                    this.f17098.end();
                    this.f17098 = new Deflater(-1, true);
                }
            }
            ((AbstractC5115) interfaceC5114).mo10647(ByteBuffer.wrap(byteArray, 0, length));
        }
    }

    @Override // Yue.C4339, Yue.InterfaceC5392
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo12600(InterfaceC5114 interfaceC5114) throws C5509 {
        if (interfaceC5114 instanceof AbstractC4298) {
            if (interfaceC5114.mo1929() || interfaceC5114.mo15781() == EnumC6568.CONTINUOUS) {
                if (interfaceC5114.mo15781() == EnumC6568.CONTINUOUS && interfaceC5114.mo1929()) {
                    throw new C5509(1008, "RSV1 bit can only be set for the first frame.");
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    m21264(interfaceC5114.mo10645().array(), byteArrayOutputStream);
                    if (this.f17097.getRemaining() > 0) {
                        this.f17097 = new Inflater(true);
                        m21264(interfaceC5114.mo10645().array(), byteArrayOutputStream);
                    }
                    if (interfaceC5114.mo15784()) {
                        m21264(f17093, byteArrayOutputStream);
                        if (this.f17095) {
                            this.f17097 = new Inflater(true);
                        }
                    }
                    ((AbstractC5115) interfaceC5114).mo10647(ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size()));
                } catch (DataFormatException e) {
                    throw new C5509(1008, e.getMessage());
                }
            }
        }
    }

    @Override // Yue.C4339, Yue.InterfaceC5392
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public boolean mo12601(String str) {
        for (String str2 : str.split(",")) {
            C4782 c4782M14454 = C4782.m14454(str2);
            if (f17086.equalsIgnoreCase(c4782M14454.m1686())) {
                c4782M14454.m1687();
                return true;
            }
        }
        return false;
    }

    @Override // Yue.AbstractC4069, Yue.C4339, Yue.InterfaceC5392
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo11506(InterfaceC5114 interfaceC5114) throws C5509 {
        if (!(interfaceC5114 instanceof C4209) || (!interfaceC5114.mo1929() && !interfaceC5114.mo15780() && !interfaceC5114.mo15783())) {
            super.mo11506(interfaceC5114);
            return;
        }
        throw new C5511("bad rsv RSV1: " + interfaceC5114.mo1929() + " RSV2: " + interfaceC5114.mo15780() + " RSV3: " + interfaceC5114.mo15783());
    }

    @Override // Yue.C4339, Yue.InterfaceC5392
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public String mo12602() {
        this.f17096.put(f17088, "");
        this.f17096.put(f17087, "");
        return "permessage-deflate; server_no_context_takeover; client_no_context_takeover";
    }

    @Override // Yue.C4339, Yue.InterfaceC5392
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public String mo12603() {
        StringBuilder sb = new StringBuilder();
        sb.append("permessage-deflate; server_no_context_takeover");
        sb.append(this.f17095 ? "; client_no_context_takeover" : "");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m21264(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream) throws DataFormatException {
        this.f17097.setInput(bArr);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int iInflate = this.f17097.inflate(bArr2);
            if (iInflate <= 0) {
                return;
            } else {
                byteArrayOutputStream.write(bArr2, 0, iInflate);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public Deflater m21265() {
        return this.f17098;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public Inflater m21266() {
        return this.f17097;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int m21267() {
        return this.f2208;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean m21268() {
        return this.f17095;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean m21269() {
        return this.f2209;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m21270(boolean z) {
        this.f17095 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m21271(Deflater deflater) {
        this.f17098 = deflater;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m21272(Inflater inflater) {
        this.f17097 = inflater;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m21273(boolean z) {
        this.f2209 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m21274(int i) {
        this.f2208 = i;
    }
}
