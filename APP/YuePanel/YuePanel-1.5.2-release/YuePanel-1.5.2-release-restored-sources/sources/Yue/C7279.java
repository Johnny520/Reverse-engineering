package Yue;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: Yue.ۥۡۧۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n+ 2 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n63#2,12:141\n63#2,12:153\n104#2,2:165\n106#2,26:168\n135#2,5:194\n142#2:199\n145#2,3:200\n63#2,8:203\n148#2,8:211\n71#2,4:219\n156#2:223\n63#2,12:224\n160#2:236\n85#2,10:237\n161#2,9:247\n95#2,4:256\n170#2,2:260\n179#2,4:262\n85#2,10:266\n183#2,3:276\n95#2,4:279\n186#2:283\n195#2,8:284\n85#2,10:292\n203#2,3:302\n95#2,4:305\n206#2:309\n215#2,5:310\n85#2,10:315\n220#2,3:325\n95#2,4:328\n223#2:332\n226#2,4:333\n234#2,6:337\n63#2,8:343\n240#2,7:351\n71#2,4:358\n247#2,2:362\n1#3:167\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n*L\n54#1:141,12\n66#1:153,12\n78#1:165,2\n78#1:168,26\n80#1:194,5\n82#1:199\n84#1:200,3\n84#1:203,8\n84#1:211,8\n84#1:219,4\n84#1:223\n90#1:224,12\n96#1:236\n96#1:237,10\n96#1:247,9\n96#1:256,4\n96#1:260,2\n103#1:262,4\n103#1:266,10\n103#1:276,3\n103#1:279,4\n103#1:283\n110#1:284,8\n110#1:292,10\n110#1:302,3\n110#1:305,4\n110#1:309\n117#1:310,5\n117#1:315,10\n117#1:325,3\n117#1:328,4\n117#1:332\n131#1:333,4\n133#1:337,6\n133#1:343,8\n133#1:351,7\n133#1:358,4\n133#1:362,2\n78#1:167\n*E\n"})
public final class C7279 extends C3630 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final transient byte[][] f21960;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    @InterfaceC6399
    public final transient int[] f21961;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7279(@InterfaceC6399 byte[][] bArr, @InterfaceC6399 int[] iArr) {
        super(C3630.f6372.m9824());
        C5499.m17103(bArr, "segments");
        C5499.m17103(iArr, "directory");
        this.f21960 = bArr;
        this.f21961 = iArr;
    }

    @Override // Yue.C3630
    public boolean equals(@InterfaceC6489 Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3630) {
            C3630 c3630 = (C3630) obj;
            if (c3630.m9852() == m9852() && mo9844(0, c3630, 0, m9852())) {
                return true;
            }
        }
        return false;
    }

    @Override // Yue.C3630
    public int hashCode() {
        int iM9825 = m9825();
        if (iM9825 != 0) {
            return iM9825;
        }
        int length = m22748().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = m22747()[length + i];
            int i5 = m22747()[i];
            byte[] bArr = m22748()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        m9847(i2);
        return i2;
    }

    @Override // Yue.C3630
    @InterfaceC6399
    public String toString() {
        return m22749().toString();
    }

    @Override // Yue.C3630
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public ByteBuffer mo9815() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(mo9861()).asReadOnlyBuffer();
        C5499.m17102(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    @Override // Yue.C3630
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public String mo9816() {
        return m22749().mo9816();
    }

    @Override // Yue.C3630
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public String mo9817() {
        return m22749().mo9817();
    }

    @Override // Yue.C3630
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo9819(int i, @InterfaceC6399 byte[] bArr, int i2, int i3) {
        C5499.m17103(bArr, "target");
        long j = i3;
        C2963.m5677(m9852(), i, j);
        C2963.m5677(bArr.length, i2, j);
        int i4 = i3 + i;
        int iM5674 = C2962.m5674(this, i);
        while (i < i4) {
            int i5 = iM5674 == 0 ? 0 : m22747()[iM5674 - 1];
            int i6 = m22747()[iM5674] - i5;
            int i7 = m22747()[m22748().length + iM5674];
            int iMin = Math.min(i4, i6 + i5) - i;
            int i8 = i7 + (i - i5);
            C3404.m7123(m22748()[iM5674], bArr, i2, i8, i8 + iMin);
            i2 += iMin;
            i += iMin;
            iM5674++;
        }
    }

    @Override // Yue.C3630
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public C3630 mo9820(@InterfaceC6399 String str) throws NoSuchAlgorithmException {
        C5499.m17103(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = m22748().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = m22747()[length + i];
            int i4 = m22747()[i];
            messageDigest.update(m22748()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        C5499.m17100(bArrDigest);
        return new C3630(bArrDigest);
    }

    @Override // Yue.C3630
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public int mo9826() {
        return m22747()[m22748().length - 1];
    }

    @Override // Yue.C3630
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public String mo9828() {
        return m22749().mo9828();
    }

    @Override // Yue.C3630
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public C3630 mo9829(@InterfaceC6399 String str, @InterfaceC6399 C3630 c3630) throws NoSuchAlgorithmException {
        C5499.m17103(str, "algorithm");
        C5499.m17103(c3630, C6659.f17103);
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(c3630.mo9861(), str));
            int length = m22748().length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = m22747()[length + i];
                int i4 = m22747()[i];
                mac.update(m22748()[i], i3, i4 - i2);
                i++;
                i2 = i4;
            }
            byte[] bArrDoFinal = mac.doFinal();
            C5499.m17102(bArrDoFinal, "doFinal(...)");
            return new C3630(bArrDoFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // Yue.C3630
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public int mo9836(@InterfaceC6399 byte[] bArr, int i) {
        C5499.m17103(bArr, "other");
        return m22749().mo9836(bArr, i);
    }

    @Override // Yue.C3630
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public byte[] mo9837() {
        return mo9861();
    }

    @Override // Yue.C3630
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public byte mo9838(int i) {
        C2963.m5677(m22747()[m22748().length - 1], i, 1L);
        int iM5674 = C2962.m5674(this, i);
        return m22748()[iM5674][(i - (iM5674 == 0 ? 0 : m22747()[iM5674 - 1])) + m22747()[m22748().length + iM5674]];
    }

    @Override // Yue.C3630
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
    public int mo9842(@InterfaceC6399 byte[] bArr, int i) {
        C5499.m17103(bArr, "other");
        return m22749().mo9842(bArr, i);
    }

    @Override // Yue.C3630
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public boolean mo9844(int i, @InterfaceC6399 C3630 c3630, int i2, int i3) {
        C5499.m17103(c3630, "other");
        if (i < 0 || i > m9852() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iM5674 = C2962.m5674(this, i);
        while (i < i4) {
            int i5 = iM5674 == 0 ? 0 : m22747()[iM5674 - 1];
            int i6 = m22747()[iM5674] - i5;
            int i7 = m22747()[m22748().length + iM5674];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!c3630.mo9845(i2, m22748()[iM5674], i7 + (i - i5), iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iM5674++;
        }
        return true;
    }

    @Override // Yue.C3630
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public boolean mo9845(int i, @InterfaceC6399 byte[] bArr, int i2, int i3) {
        C5499.m17103(bArr, "other");
        if (i < 0 || i > m9852() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iM5674 = C2962.m5674(this, i);
        while (i < i4) {
            int i5 = iM5674 == 0 ? 0 : m22747()[iM5674 - 1];
            int i6 = m22747()[iM5674] - i5;
            int i7 = m22747()[m22748().length + iM5674];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!C2963.m5676(m22748()[iM5674], i7 + (i - i5), bArr, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iM5674++;
        }
        return true;
    }

    @Override // Yue.C3630
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public String mo9855(@InterfaceC6399 Charset charset) {
        C5499.m17103(charset, "charset");
        return m22749().mo9855(charset);
    }

    @Override // Yue.C3630
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public C3630 mo9858(int i, int i2) {
        int iM5684 = C2963.m5684(this, i2);
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i + " < 0").toString());
        }
        if (iM5684 > m9852()) {
            throw new IllegalArgumentException(("endIndex=" + iM5684 + " > length(" + m9852() + ')').toString());
        }
        int i3 = iM5684 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iM5684 + " < beginIndex=" + i).toString());
        }
        if (i == 0 && iM5684 == m9852()) {
            return this;
        }
        if (i == iM5684) {
            return C3630.f6372;
        }
        int iM5674 = C2962.m5674(this, i);
        int iM56742 = C2962.m5674(this, iM5684 - 1);
        byte[][] bArr = (byte[][]) C3404.m7165(m22748(), iM5674, iM56742 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iM5674 <= iM56742) {
            int i4 = iM5674;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(m22747()[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr.length] = m22747()[m22748().length + i4];
                if (i4 == iM56742) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iM5674 != 0 ? m22747()[iM5674 - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i - i7);
        return new C7279(bArr, iArr);
    }

    @Override // Yue.C3630
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥ */
    public C3630 mo9859() {
        return m22749().mo9859();
    }

    @Override // Yue.C3630
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟ */
    public C3630 mo9860() {
        return m22749().mo9860();
    }

    @Override // Yue.C3630
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠ */
    public byte[] mo9861() {
        byte[] bArr = new byte[m9852()];
        int length = m22748().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = m22747()[length + i];
            int i5 = m22747()[i];
            int i6 = i5 - i2;
            C3404.m7123(m22748()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // Yue.C3630
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ */
    public void mo9863(@InterfaceC6399 OutputStream outputStream) throws IOException {
        C5499.m17103(outputStream, "out");
        int length = m22748().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = m22747()[length + i];
            int i4 = m22747()[i];
            outputStream.write(m22748()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
    }

    @Override // Yue.C3630
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ */
    public void mo9864(@InterfaceC6399 C3600 c3600, int i, int i2) {
        C5499.m17103(c3600, "buffer");
        int i3 = i + i2;
        int iM5674 = C2962.m5674(this, i);
        while (i < i3) {
            int i4 = iM5674 == 0 ? 0 : m22747()[iM5674 - 1];
            int i5 = m22747()[iM5674] - i4;
            int i6 = m22747()[m22748().length + iM5674];
            int iMin = Math.min(i3, i5 + i4) - i;
            int i7 = i6 + (i - i4);
            C7275 c7275 = new C7275(m22748()[iM5674], i7, i7 + iMin, true, false);
            C7275 c72752 = c3600.f6209;
            if (c72752 == null) {
                c7275.f21954 = c7275;
                c7275.f21953 = c7275;
                c3600.f6209 = c7275;
            } else {
                C5499.m17100(c72752);
                C7275 c72753 = c72752.f21954;
                C5499.m17100(c72753);
                c72753.m22726(c7275);
            }
            i += iMin;
            iM5674++;
        }
        c3600.m9680(c3600.m9684() + ((long) i2));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public final int[] m22747() {
        return this.f21961;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public final byte[][] m22748() {
        return this.f21960;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public final C3630 m22749() {
        return new C3630(mo9861());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public final Object m22750() {
        C3630 c3630M22749 = m22749();
        C5499.m17101(c3630M22749, "null cannot be cast to non-null type java.lang.Object");
        return c3630M22749;
    }
}
