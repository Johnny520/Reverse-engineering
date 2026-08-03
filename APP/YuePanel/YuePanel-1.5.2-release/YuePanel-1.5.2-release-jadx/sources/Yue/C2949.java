package Yue;

import com.google.flatbuffers.reflection.BaseType;
import java.util.Arrays;
import net.bytebuddy.asm.Advice;

/* JADX INFO: renamed from: Yue.ۥ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Utf8.kt\nokio/Utf8\n*L\n1#1,363:1\n131#1,2:369\n133#1,9:372\n68#2:364\n74#2:365\n74#2:367\n74#2:368\n68#2:396\n74#2:408\n1#3:366\n1#3:371\n212#4,7:381\n122#4:388\n219#4,5:389\n122#4:394\n226#4:395\n228#4:397\n397#4,2:398\n122#4:400\n400#4,6:401\n127#4:407\n406#4:409\n122#4:410\n407#4,13:411\n122#4:424\n422#4:425\n122#4:426\n425#4:427\n230#4,3:428\n440#4,3:431\n122#4:434\n443#4:435\n127#4:436\n446#4,10:437\n127#4:447\n456#4:448\n122#4:449\n457#4,4:450\n127#4:454\n461#4:455\n122#4:456\n462#4,14:457\n122#4:471\n477#4,2:472\n122#4:474\n481#4:475\n122#4:476\n484#4:477\n234#4,3:478\n500#4,3:481\n122#4:484\n503#4:485\n127#4:486\n506#4,2:487\n127#4:489\n510#4,10:490\n127#4:500\n520#4:501\n122#4:502\n521#4,4:503\n127#4:507\n525#4:508\n122#4:509\n526#4,4:510\n127#4:514\n530#4:515\n122#4:516\n531#4,15:517\n122#4:532\n547#4,2:533\n122#4:535\n550#4,2:536\n122#4:538\n554#4:539\n122#4:540\n557#4:541\n241#4:542\n122#4:543\n242#4,5:544\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n*L\n329#1:369,2\n329#1:372,9\n67#1:364\n68#1:365\n258#1:367\n259#1:368\n348#1:396\n348#1:408\n329#1:371\n348#1:381,7\n353#1:388\n348#1:389,5\n353#1:394\n348#1:395\n348#1:397\n348#1:398,2\n353#1:400\n348#1:401,6\n348#1:407\n348#1:409\n353#1:410\n348#1:411,13\n353#1:424\n348#1:425\n353#1:426\n348#1:427\n348#1:428,3\n348#1:431,3\n353#1:434\n348#1:435\n348#1:436\n348#1:437,10\n348#1:447\n348#1:448\n353#1:449\n348#1:450,4\n348#1:454\n348#1:455\n353#1:456\n348#1:457,14\n353#1:471\n348#1:472,2\n353#1:474\n348#1:475\n353#1:476\n348#1:477\n348#1:478,3\n348#1:481,3\n353#1:484\n348#1:485\n348#1:486\n348#1:487,2\n348#1:489\n348#1:490,10\n348#1:500\n348#1:501\n353#1:502\n348#1:503,4\n348#1:507\n348#1:508\n353#1:509\n348#1:510,4\n348#1:514\n348#1:515\n353#1:516\n348#1:517,15\n353#1:532\n348#1:533,2\n353#1:535\n348#1:536,2\n353#1:538\n348#1:539\n353#1:540\n348#1:541\n348#1:542\n353#1:543\n348#1:544,5\n*E\n"})
@InterfaceC5572(name = "-ByteString")
public final class C2949 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final char[] f4 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', Advice.OffsetMapping.ForOrigin.Renderer.ForDescriptor.SYMBOL, 'e', 'f'};

    /* JADX WARN: Code restructure failed: missing block: B:39:0x005c, code lost:
    
        return -1;
     */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m5512(byte[] bArr, int i) {
        byte b;
        int i2;
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        loop0: while (i3 < length) {
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                int i6 = i5 + 1;
                if (i5 == i) {
                    return i4;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (127 <= b2 && b2 < 160))) || b2 == 65533) {
                    return -1;
                }
                i4 += b2 < 65536 ? 1 : 2;
                i3++;
                while (true) {
                    i5 = i6;
                    if (i3 < length && (b = bArr[i3]) >= 0) {
                        i3++;
                        i6 = i5 + 1;
                        if (i5 != i) {
                            if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (127 <= b && b < 160))) || b == 65533) {
                                break loop0;
                            }
                            i4 += b < 65536 ? 1 : 2;
                        } else {
                            return i4;
                        }
                    } else {
                        break;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i7 = i3 + 1;
                if (length <= i7) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                byte b3 = bArr[i7];
                if ((b3 & C4750.f10617) != 128) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                int i8 = (b2 << 6) ^ (b3 ^ C3626.f423);
                if (i8 < 128) {
                    if (i5 == i) {
                        return i4;
                    }
                    return -1;
                }
                int i9 = i5 + 1;
                if (i5 == i) {
                    return i4;
                }
                if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && i8 < 32) || (127 <= i8 && i8 < 160))) || i8 == 65533) {
                    return -1;
                }
                i4 += i8 < 65536 ? 1 : 2;
                C8107 c8107 = C8107.f3222;
                i3 += 2;
                i5 = i9;
            } else {
                if ((b2 >> 4) == -2) {
                    int i10 = i3 + 2;
                    if (length <= i10) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    byte b4 = bArr[i3 + 1];
                    if ((b4 & C4750.f10617) != 128) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    byte b5 = bArr[i10];
                    if ((b5 & C4750.f10617) != 128) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    int i11 = (b2 << 12) ^ ((b5 ^ C3626.f423) ^ (b4 << 6));
                    if (i11 < 2048) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    if (55296 <= i11 && i11 < 57344) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    i2 = i5 + 1;
                    if (i5 == i) {
                        return i4;
                    }
                    if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                        return -1;
                    }
                    i4 += i11 < 65536 ? 1 : 2;
                    C8107 c81072 = C8107.f3222;
                    i3 += 3;
                } else {
                    if ((b2 >> 3) != -2) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    int i12 = i3 + 3;
                    if (length <= i12) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    byte b6 = bArr[i3 + 1];
                    if ((b6 & C4750.f10617) != 128) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    byte b7 = bArr[i3 + 2];
                    if ((b7 & C4750.f10617) != 128) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    byte b8 = bArr[i12];
                    if ((b8 & C4750.f10617) != 128) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    int i13 = (b2 << BaseType.Vector64) ^ (((b8 ^ C3626.f423) ^ (b7 << 6)) ^ (b6 << 12));
                    if (i13 > 1114111) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    if (55296 <= i13 && i13 < 57344) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    if (i13 < 65536) {
                        if (i5 == i) {
                            return i4;
                        }
                        return -1;
                    }
                    i2 = i5 + 1;
                    if (i5 == i) {
                        return i4;
                    }
                    if ((i13 != 10 && i13 != 13 && ((i13 >= 0 && i13 < 32) || (127 <= i13 && i13 < 160))) || i13 == 65533) {
                        return -1;
                    }
                    i4 += i13 < 65536 ? 1 : 2;
                    C8107 c81073 = C8107.f3222;
                    i3 += 4;
                }
                i5 = i2;
            }
        }
        return i4;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String m5513(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "<this>");
        return C0000.m5444(c3630.m9824(), null, 1, null);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String m5514(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "<this>");
        return C0000.m1(c3630.m9824(), C0000.m5447());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int m5515(@InterfaceC6399 C3630 c3630, @InterfaceC6399 C3630 c36302) {
        C5499.m17103(c3630, "<this>");
        C5499.m17103(c36302, "other");
        int iM9852 = c3630.m9852();
        int iM98522 = c36302.m9852();
        int iMin = Math.min(iM9852, iM98522);
        for (int i = 0; i < iMin; i++) {
            int iM9823 = c3630.m9823(i) & 255;
            int iM98232 = c36302.m9823(i) & 255;
            if (iM9823 != iM98232) {
                return iM9823 < iM98232 ? -1 : 1;
            }
        }
        if (iM9852 == iM98522) {
            return 0;
        }
        return iM9852 < iM98522 ? -1 : 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final void m5516(@InterfaceC6399 C3630 c3630, int i, @InterfaceC6399 byte[] bArr, int i2, int i3) {
        C5499.m17103(c3630, "<this>");
        C5499.m17103(bArr, "target");
        C3404.m7123(c3630.m9824(), bArr, i2, i, i3 + i);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final C3630 m5517(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        byte[] bArrM0 = C0000.m0(str);
        if (bArrM0 != null) {
            return new C3630(bArrM0);
        }
        return null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final C3630 m5518(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((m5544(str.charAt(i2)) << 4) + m5544(str.charAt(i2 + 1)));
        }
        return new C3630(bArr);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final C3630 m5519(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        C3630 c3630 = new C3630(C8582.m4551(str));
        c3630.m9848(str);
        return c3630;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final boolean m5520(@InterfaceC6399 C3630 c3630, @InterfaceC6399 C3630 c36302) {
        C5499.m17103(c3630, "<this>");
        C5499.m17103(c36302, "suffix");
        return c3630.mo9844(c3630.m9852() - c36302.m9852(), c36302, 0, c36302.m9852());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final boolean m5521(@InterfaceC6399 C3630 c3630, @InterfaceC6399 byte[] bArr) {
        C5499.m17103(c3630, "<this>");
        C5499.m17103(bArr, "suffix");
        return c3630.mo9845(c3630.m9852() - bArr.length, bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final boolean m5522(@InterfaceC6399 C3630 c3630, @InterfaceC6489 Object obj) {
        C5499.m17103(c3630, "<this>");
        if (obj == c3630) {
            return true;
        }
        if (obj instanceof C3630) {
            C3630 c36302 = (C3630) obj;
            if (c36302.m9852() == c3630.m9824().length && c36302.mo9845(0, c3630.m9824(), 0, c3630.m9824().length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final byte m5523(@InterfaceC6399 C3630 c3630, int i) {
        C5499.m17103(c3630, "<this>");
        return c3630.m9824()[i];
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int m5524(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "<this>");
        return c3630.m9824().length;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int m5525(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "<this>");
        int iM9825 = c3630.m9825();
        if (iM9825 != 0) {
            return iM9825;
        }
        int iHashCode = Arrays.hashCode(c3630.m9824());
        c3630.m9847(iHashCode);
        return iHashCode;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final String m5526(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "<this>");
        char[] cArr = new char[c3630.m9824().length * 2];
        int i = 0;
        for (byte b : c3630.m9824()) {
            int i2 = i + 1;
            cArr[i] = m5545()[(b >> 4) & 15];
            i += 2;
            cArr[i2] = m5545()[b & 15];
        }
        return C7627.m23957(cArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int m5527(@InterfaceC6399 C3630 c3630, @InterfaceC6399 byte[] bArr, int i) {
        C5499.m17103(c3630, "<this>");
        C5499.m17103(bArr, "other");
        int length = c3630.m9824().length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!C2963.m5676(c3630.m9824(), iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final byte[] m5528(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "<this>");
        return c3630.m9824();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int m5529(@InterfaceC6399 C3630 c3630, @InterfaceC6399 C3630 c36302, int i) {
        C5499.m17103(c3630, "<this>");
        C5499.m17103(c36302, "other");
        return c3630.mo9842(c36302.mo9837(), i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int m5530(@InterfaceC6399 C3630 c3630, @InterfaceC6399 byte[] bArr, int i) {
        C5499.m17103(c3630, "<this>");
        C5499.m17103(bArr, "other");
        for (int iMin = Math.min(C2963.m5684(c3630, i), c3630.m9824().length - bArr.length); -1 < iMin; iMin--) {
            if (C2963.m5676(c3630.m9824(), iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final C3630 m5531(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "data");
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        C5499.m17102(bArrCopyOf, "copyOf(this, size)");
        return new C3630(bArrCopyOf);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final boolean m5532(@InterfaceC6399 C3630 c3630, int i, @InterfaceC6399 C3630 c36302, int i2, int i3) {
        C5499.m17103(c3630, "<this>");
        C5499.m17103(c36302, "other");
        return c36302.mo9845(i2, c3630.m9824(), i, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final boolean m5533(@InterfaceC6399 C3630 c3630, int i, @InterfaceC6399 byte[] bArr, int i2, int i3) {
        C5499.m17103(c3630, "<this>");
        C5499.m17103(bArr, "other");
        return i >= 0 && i <= c3630.m9824().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C2963.m5676(c3630.m9824(), i, bArr, i2, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final boolean m5534(@InterfaceC6399 C3630 c3630, @InterfaceC6399 C3630 c36302) {
        C5499.m17103(c3630, "<this>");
        C5499.m17103(c36302, "prefix");
        return c3630.mo9844(0, c36302, 0, c36302.m9852());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final boolean m5535(@InterfaceC6399 C3630 c3630, @InterfaceC6399 byte[] bArr) {
        C5499.m17103(c3630, "<this>");
        C5499.m17103(bArr, "prefix");
        return c3630.mo9845(0, bArr, 0, bArr.length);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final C3630 m5536(@InterfaceC6399 C3630 c3630, int i, int i2) {
        C5499.m17103(c3630, "<this>");
        int iM5684 = C2963.m5684(c3630, i2);
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (iM5684 <= c3630.m9824().length) {
            if (iM5684 - i >= 0) {
                return (i == 0 && iM5684 == c3630.m9824().length) ? c3630 : new C3630(C3404.m7159(c3630.m9824(), i, iM5684));
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        throw new IllegalArgumentException(("endIndex > length(" + c3630.m9824().length + ')').toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final C3630 m5537(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "<this>");
        for (int i = 0; i < c3630.m9824().length; i++) {
            byte b = c3630.m9824()[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrM9824 = c3630.m9824();
                byte[] bArrCopyOf = Arrays.copyOf(bArrM9824, bArrM9824.length);
                C5499.m17102(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C3630(bArrCopyOf);
            }
        }
        return c3630;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final C3630 m5538(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "<this>");
        for (int i = 0; i < c3630.m9824().length; i++) {
            byte b = c3630.m9824()[i];
            if (b >= 97 && b <= 122) {
                byte[] bArrM9824 = c3630.m9824();
                byte[] bArrCopyOf = Arrays.copyOf(bArrM9824, bArrM9824.length);
                C5499.m17102(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i] = (byte) (b - 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 97 && b2 <= 122) {
                        bArrCopyOf[i2] = (byte) (b2 - 32);
                    }
                }
                return new C3630(bArrCopyOf);
            }
        }
        return c3630;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final byte[] m5539(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "<this>");
        byte[] bArrM9824 = c3630.m9824();
        byte[] bArrCopyOf = Arrays.copyOf(bArrM9824, bArrM9824.length);
        C5499.m17102(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final C3630 m5540(@InterfaceC6399 byte[] bArr, int i, int i2) {
        C5499.m17103(bArr, "<this>");
        int iM5685 = C2963.m5685(bArr, i2);
        C2963.m5677(bArr.length, i, iM5685);
        return new C3630(C3404.m7159(bArr, i, iM5685 + i));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final String m5541(@InterfaceC6399 C3630 c3630) {
        C3630 c36302 = c3630;
        C5499.m17103(c36302, "<this>");
        if (c3630.m9824().length == 0) {
            return "[size=0]";
        }
        int iM5512 = m5512(c3630.m9824(), 64);
        if (iM5512 != -1) {
            String strM9862 = c3630.m9862();
            String strSubstring = strM9862.substring(0, iM5512);
            C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strM23998 = C7627.m23998(C7627.m23998(C7627.m23998(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iM5512 >= strM9862.length()) {
                return "[text=" + strM23998 + ']';
            }
            return "[size=" + c3630.m9824().length + " text=" + strM23998 + "…]";
        }
        if (c3630.m9824().length <= 64) {
            return "[hex=" + c3630.mo9828() + ']';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[size=");
        sb.append(c3630.m9824().length);
        sb.append(" hex=");
        int iM5684 = C2963.m5684(c36302, 64);
        if (iM5684 > c3630.m9824().length) {
            throw new IllegalArgumentException(("endIndex > length(" + c3630.m9824().length + ')').toString());
        }
        if (iM5684 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        if (iM5684 != c3630.m9824().length) {
            c36302 = new C3630(C3404.m7159(c3630.m9824(), 0, iM5684));
        }
        sb.append(c36302.mo9828());
        sb.append("…]");
        return sb.toString();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final String m5542(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "<this>");
        String strM9827 = c3630.m9827();
        if (strM9827 != null) {
            return strM9827;
        }
        String strM28586 = C8582.m28586(c3630.mo9837());
        c3630.m9848(strM28586);
        return strM28586;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final void m5543(@InterfaceC6399 C3630 c3630, @InterfaceC6399 C3600 c3600, int i, int i2) {
        C5499.m17103(c3630, "<this>");
        C5499.m17103(c3600, "buffer");
        c3600.write(c3630.m9824(), i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int m5544(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final char[] m5545() {
        return f4;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m5546() {
    }
}
