package Yue;

import com.android.p001dx.p004io.Opcodes;
import com.google.flatbuffers.reflection.BaseType;

/* JADX INFO: renamed from: Yue.ۥۣۢۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nUtf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utf8.kt\nokio/Utf8\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,559:1\n397#1,9:563\n127#1:572\n406#1,20:574\n440#1,4:595\n127#1:599\n446#1,10:601\n127#1:611\n456#1,5:612\n127#1:617\n461#1,24:618\n500#1,4:643\n127#1:647\n506#1,2:649\n127#1:651\n510#1,10:652\n127#1:662\n520#1,5:663\n127#1:668\n525#1,5:669\n127#1:674\n530#1,28:675\n397#1,9:704\n127#1:713\n406#1,20:715\n440#1,4:736\n127#1:740\n446#1,10:742\n127#1:752\n456#1,5:753\n127#1:758\n461#1,24:759\n500#1,4:784\n127#1:788\n506#1,2:790\n127#1:792\n510#1,10:793\n127#1:803\n520#1,5:804\n127#1:809\n525#1,5:810\n127#1:815\n530#1,28:816\n127#1:844\n127#1:846\n127#1:848\n127#1:850\n127#1:852\n127#1:854\n127#1:856\n127#1:858\n127#1:860\n1#2:560\n74#3:561\n68#3:562\n74#3:573\n68#3:594\n74#3:600\n68#3:642\n74#3:648\n68#3:703\n74#3:714\n68#3:735\n74#3:741\n68#3:783\n74#3:789\n74#3:845\n74#3:847\n74#3:849\n74#3:851\n74#3:853\n74#3:855\n74#3:857\n74#3:859\n74#3:861\n*S KotlinDebug\n*F\n+ 1 Utf8.kt\nokio/Utf8\n*L\n228#1:563,9\n228#1:572\n228#1:574,20\n232#1:595,4\n232#1:599\n232#1:601,10\n232#1:611\n232#1:612,5\n232#1:617\n232#1:618,24\n236#1:643,4\n236#1:647\n236#1:649,2\n236#1:651\n236#1:652,10\n236#1:662\n236#1:663,5\n236#1:668\n236#1:669,5\n236#1:674\n236#1:675,28\n277#1:704,9\n277#1:713\n277#1:715,20\n281#1:736,4\n281#1:740\n281#1:742,10\n281#1:752\n281#1:753,5\n281#1:758\n281#1:759,24\n285#1:784,4\n285#1:788\n285#1:790,2\n285#1:792\n285#1:793,10\n285#1:803\n285#1:804,5\n285#1:809\n285#1:810,5\n285#1:815\n285#1:816,28\n405#1:844\n443#1:846\n455#1:848\n460#1:850\n503#1:852\n507#1:854\n519#1:856\n524#1:858\n529#1:860\n127#1:561\n226#1:562\n228#1:573\n230#1:594\n232#1:600\n234#1:642\n236#1:648\n275#1:703\n277#1:714\n279#1:735\n281#1:741\n283#1:783\n285#1:789\n405#1:845\n443#1:847\n455#1:849\n460#1:851\n503#1:853\n507#1:855\n519#1:857\n524#1:859\n529#1:861\n*E\n"})
@InterfaceC5572(name = "Utf8")
public final class C8149 {

    /* JADX INFO: renamed from: ۥ */
    public static final byte f3255 = 63;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final char f3256 = 65533;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f24169 = 65533;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f24170 = 55232;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f24171 = 56320;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f24172 = 3968;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f24173 = -123008;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f24174 = 3678080;

    /* JADX INFO: renamed from: ۥ */
    public static final boolean m4179(int i) {
        return (i >= 0 && i < 32) || (127 <= i && i < 160);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean m4180(byte b) {
        return (b & C4750.f10617) == 128;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int m26809(@InterfaceC6399 byte[] bArr, int i, int i2, @InterfaceC6399 InterfaceC5124<? super Integer, C8107> interfaceC5124) {
        C5499.m17103(bArr, "<this>");
        C5499.m17103(interfaceC5124, "yield");
        int i3 = i + 1;
        Integer numValueOf = Integer.valueOf(f24169);
        if (i2 <= i3) {
            interfaceC5124.invoke(numValueOf);
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i3];
        if ((b2 & C4750.f10617) != 128) {
            interfaceC5124.invoke(numValueOf);
            return 1;
        }
        int i4 = (b2 ^ C3626.f423) ^ (b << 6);
        if (i4 < 128) {
            interfaceC5124.invoke(numValueOf);
            return 2;
        }
        interfaceC5124.invoke(Integer.valueOf(i4));
        return 2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int m26810(@InterfaceC6399 byte[] bArr, int i, int i2, @InterfaceC6399 InterfaceC5124<? super Integer, C8107> interfaceC5124) {
        C5499.m17103(bArr, "<this>");
        C5499.m17103(interfaceC5124, "yield");
        int i3 = i + 2;
        Integer numValueOf = Integer.valueOf(f24169);
        if (i2 <= i3) {
            interfaceC5124.invoke(numValueOf);
            int i4 = i + 1;
            return (i2 <= i4 || (bArr[i4] & C4750.f10617) != 128) ? 1 : 2;
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if ((b2 & C4750.f10617) != 128) {
            interfaceC5124.invoke(numValueOf);
            return 1;
        }
        byte b3 = bArr[i3];
        if ((b3 & C4750.f10617) != 128) {
            interfaceC5124.invoke(numValueOf);
            return 2;
        }
        int i5 = ((b3 ^ C3626.f423) ^ (b2 << 6)) ^ (b << 12);
        if (i5 < 2048) {
            interfaceC5124.invoke(numValueOf);
            return 3;
        }
        if (55296 > i5 || i5 >= 57344) {
            interfaceC5124.invoke(Integer.valueOf(i5));
            return 3;
        }
        interfaceC5124.invoke(numValueOf);
        return 3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int m26811(@InterfaceC6399 byte[] bArr, int i, int i2, @InterfaceC6399 InterfaceC5124<? super Integer, C8107> interfaceC5124) {
        C5499.m17103(bArr, "<this>");
        C5499.m17103(interfaceC5124, "yield");
        int i3 = i + 3;
        Integer numValueOf = Integer.valueOf(f24169);
        if (i2 <= i3) {
            interfaceC5124.invoke(numValueOf);
            int i4 = i + 1;
            if (i2 <= i4 || (bArr[i4] & C4750.f10617) != 128) {
                return 1;
            }
            int i5 = i + 2;
            return (i2 <= i5 || (bArr[i5] & C4750.f10617) != 128) ? 2 : 3;
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if ((b2 & C4750.f10617) != 128) {
            interfaceC5124.invoke(numValueOf);
            return 1;
        }
        byte b3 = bArr[i + 2];
        if ((b3 & C4750.f10617) != 128) {
            interfaceC5124.invoke(numValueOf);
            return 2;
        }
        byte b4 = bArr[i3];
        if ((b4 & C4750.f10617) != 128) {
            interfaceC5124.invoke(numValueOf);
            return 3;
        }
        int i6 = (((b4 ^ C3626.f423) ^ (b3 << 6)) ^ (b2 << 12)) ^ (b << BaseType.Vector64);
        if (i6 > 1114111) {
            interfaceC5124.invoke(numValueOf);
            return 4;
        }
        if (55296 <= i6 && i6 < 57344) {
            interfaceC5124.invoke(numValueOf);
            return 4;
        }
        if (i6 < 65536) {
            interfaceC5124.invoke(numValueOf);
            return 4;
        }
        interfaceC5124.invoke(Integer.valueOf(i6));
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m26812(@InterfaceC6399 byte[] bArr, int i, int i2, @InterfaceC6399 InterfaceC5124<? super Character, C8107> interfaceC5124) {
        C5499.m17103(bArr, "<this>");
        C5499.m17103(interfaceC5124, "yield");
        while (i < i2) {
            byte b = bArr[i];
            if (b >= 0) {
                interfaceC5124.invoke(Character.valueOf((char) b));
                i++;
                while (i < i2) {
                    byte b2 = bArr[i];
                    if (b2 >= 0) {
                        i++;
                        interfaceC5124.invoke(Character.valueOf((char) b2));
                    }
                }
            } else {
                int i3 = 2;
                if ((b >> 5) == -2) {
                    int i4 = i + 1;
                    if (i2 > i4) {
                        byte b3 = bArr[i4];
                        if ((b3 & C4750.f10617) == 128) {
                            int i5 = (b << 6) ^ (b3 ^ C3626.f423);
                            interfaceC5124.invoke(Character.valueOf(i5 < 128 ? (char) f24169 : (char) i5));
                            C8107 c8107 = C8107.f3222;
                            i += i3;
                        }
                    }
                    interfaceC5124.invoke(Character.valueOf((char) f24169));
                    C8107 c81072 = C8107.f3222;
                    i3 = 1;
                    i += i3;
                } else if ((b >> 4) == -2) {
                    int i6 = i + 2;
                    if (i2 <= i6) {
                        interfaceC5124.invoke(Character.valueOf((char) f24169));
                        C8107 c81073 = C8107.f3222;
                        int i7 = i + 1;
                        if (i2 <= i7 || (bArr[i7] & C4750.f10617) != 128) {
                            i3 = 1;
                        }
                        i += i3;
                    } else {
                        byte b4 = bArr[i + 1];
                        if ((b4 & C4750.f10617) == 128) {
                            byte b5 = bArr[i6];
                            if ((b5 & C4750.f10617) == 128) {
                                int i8 = (b << 12) ^ ((b5 ^ C3626.f423) ^ (b4 << 6));
                                interfaceC5124.invoke(Character.valueOf((i8 >= 2048 && (55296 > i8 || i8 >= 57344)) ? (char) i8 : (char) f24169));
                                C8107 c81074 = C8107.f3222;
                                i3 = 3;
                                i += i3;
                            } else {
                                interfaceC5124.invoke(Character.valueOf((char) f24169));
                                C8107 c81075 = C8107.f3222;
                                i += i3;
                            }
                        } else {
                            interfaceC5124.invoke(Character.valueOf((char) f24169));
                            C8107 c81076 = C8107.f3222;
                            i3 = 1;
                            i += i3;
                        }
                    }
                } else if ((b >> 3) == -2) {
                    int i9 = i + 3;
                    if (i2 <= i9) {
                        interfaceC5124.invoke((char) 65533);
                        C8107 c81077 = C8107.f3222;
                        int i10 = i + 1;
                        if (i2 > i10 && (bArr[i10] & C4750.f10617) == 128) {
                            int i11 = i + 2;
                            if (i2 > i11 && (bArr[i11] & C4750.f10617) == 128) {
                                i3 = 3;
                            }
                        }
                        i += i3;
                    } else {
                        byte b6 = bArr[i + 1];
                        if ((b6 & C4750.f10617) == 128) {
                            byte b7 = bArr[i + 2];
                            if ((b7 & C4750.f10617) == 128) {
                                byte b8 = bArr[i9];
                                if ((b8 & C4750.f10617) == 128) {
                                    int i12 = (b << BaseType.Vector64) ^ (((b8 ^ C3626.f423) ^ (b7 << 6)) ^ (b6 << 12));
                                    if (i12 <= 1114111 && ((55296 > i12 || i12 >= 57344) && i12 >= 65536 && i12 != 65533)) {
                                        interfaceC5124.invoke(Character.valueOf((char) ((i12 >>> 10) + f24170)));
                                        interfaceC5124.invoke(Character.valueOf((char) ((i12 & 1023) + f24171)));
                                    } else {
                                        interfaceC5124.invoke((char) 65533);
                                    }
                                    C8107 c81078 = C8107.f3222;
                                    i3 = 4;
                                } else {
                                    interfaceC5124.invoke((char) 65533);
                                    C8107 c81079 = C8107.f3222;
                                    i3 = 3;
                                }
                            } else {
                                interfaceC5124.invoke((char) 65533);
                                C8107 c810710 = C8107.f3222;
                            }
                            i += i3;
                        } else {
                            interfaceC5124.invoke((char) 65533);
                            C8107 c810711 = C8107.f3222;
                            i3 = 1;
                            i += i3;
                        }
                    }
                } else {
                    interfaceC5124.invoke((char) 65533);
                    i++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final void m26813(@InterfaceC6399 String str, int i, int i2, @InterfaceC6399 InterfaceC5124<? super Byte, C8107> interfaceC5124) {
        int i3;
        char cCharAt;
        C5499.m17103(str, "<this>");
        C5499.m17103(interfaceC5124, "yield");
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (C5499.m17107(cCharAt2, 128) < 0) {
                interfaceC5124.invoke(Byte.valueOf((byte) cCharAt2));
                i++;
                while (i < i2 && C5499.m17107(str.charAt(i), 128) < 0) {
                    interfaceC5124.invoke(Byte.valueOf((byte) str.charAt(i)));
                    i++;
                }
            } else {
                if (C5499.m17107(cCharAt2, 2048) < 0) {
                    interfaceC5124.invoke(Byte.valueOf((byte) ((cCharAt2 >> 6) | 192)));
                    interfaceC5124.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (55296 > cCharAt2 || cCharAt2 >= 57344) {
                    interfaceC5124.invoke(Byte.valueOf((byte) ((cCharAt2 >> '\f') | Opcodes.SHL_INT_LIT8)));
                    interfaceC5124.invoke(Byte.valueOf((byte) (((cCharAt2 >> 6) & 63) | 128)));
                    interfaceC5124.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (C5499.m17107(cCharAt2, 56319) > 0 || i2 <= (i3 = i + 1) || 56320 > (cCharAt = str.charAt(i3)) || cCharAt >= 57344) {
                    interfaceC5124.invoke(Byte.valueOf(f3255));
                } else {
                    int iCharAt = ((cCharAt2 << '\n') + str.charAt(i3)) - 56613888;
                    interfaceC5124.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | C3464.f305)));
                    interfaceC5124.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                    interfaceC5124.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                    interfaceC5124.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                    i += 2;
                }
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m26814(@InterfaceC6399 byte[] bArr, int i, int i2, @InterfaceC6399 InterfaceC5124<? super Integer, C8107> interfaceC5124) {
        C5499.m17103(bArr, "<this>");
        C5499.m17103(interfaceC5124, "yield");
        while (i < i2) {
            byte b = bArr[i];
            if (b >= 0) {
                interfaceC5124.invoke(Integer.valueOf(b));
                i++;
                while (i < i2) {
                    byte b2 = bArr[i];
                    if (b2 >= 0) {
                        i++;
                        interfaceC5124.invoke(Integer.valueOf(b2));
                    }
                }
            } else {
                int i3 = 2;
                if ((b >> 5) == -2) {
                    int i4 = i + 1;
                    if (i2 > i4) {
                        byte b3 = bArr[i4];
                        if ((b3 & C4750.f10617) == 128) {
                            int i5 = (b << 6) ^ (b3 ^ C3626.f423);
                            interfaceC5124.invoke(i5 < 128 ? Integer.valueOf(f24169) : Integer.valueOf(i5));
                            C8107 c8107 = C8107.f3222;
                            i += i3;
                        }
                    }
                    interfaceC5124.invoke(Integer.valueOf(f24169));
                    C8107 c81072 = C8107.f3222;
                    i3 = 1;
                    i += i3;
                } else if ((b >> 4) == -2) {
                    int i6 = i + 2;
                    if (i2 <= i6) {
                        interfaceC5124.invoke(Integer.valueOf(f24169));
                        C8107 c81073 = C8107.f3222;
                        int i7 = i + 1;
                        if (i2 <= i7 || (bArr[i7] & C4750.f10617) != 128) {
                            i3 = 1;
                        }
                        i += i3;
                    } else {
                        byte b4 = bArr[i + 1];
                        if ((b4 & C4750.f10617) == 128) {
                            byte b5 = bArr[i6];
                            if ((b5 & C4750.f10617) == 128) {
                                int i8 = (b << 12) ^ ((b5 ^ C3626.f423) ^ (b4 << 6));
                                interfaceC5124.invoke((i8 >= 2048 && (55296 > i8 || i8 >= 57344)) ? Integer.valueOf(i8) : Integer.valueOf(f24169));
                                C8107 c81074 = C8107.f3222;
                                i3 = 3;
                                i += i3;
                            } else {
                                interfaceC5124.invoke(Integer.valueOf(f24169));
                                C8107 c81075 = C8107.f3222;
                                i += i3;
                            }
                        } else {
                            interfaceC5124.invoke(Integer.valueOf(f24169));
                            C8107 c81076 = C8107.f3222;
                            i3 = 1;
                            i += i3;
                        }
                    }
                } else if ((b >> 3) == -2) {
                    int i9 = i + 3;
                    if (i2 <= i9) {
                        interfaceC5124.invoke(Integer.valueOf(f24169));
                        C8107 c81077 = C8107.f3222;
                        int i10 = i + 1;
                        if (i2 > i10 && (bArr[i10] & C4750.f10617) == 128) {
                            int i11 = i + 2;
                            if (i2 > i11 && (bArr[i11] & C4750.f10617) == 128) {
                                i3 = 3;
                            }
                        }
                        i += i3;
                    } else {
                        byte b6 = bArr[i + 1];
                        if ((b6 & C4750.f10617) == 128) {
                            byte b7 = bArr[i + 2];
                            if ((b7 & C4750.f10617) == 128) {
                                byte b8 = bArr[i9];
                                if ((b8 & C4750.f10617) == 128) {
                                    int i12 = (b << BaseType.Vector64) ^ (((b8 ^ C3626.f423) ^ (b7 << 6)) ^ (b6 << 12));
                                    interfaceC5124.invoke((i12 <= 1114111 && (55296 > i12 || i12 >= 57344) && i12 >= 65536) ? Integer.valueOf(i12) : Integer.valueOf(f24169));
                                    C8107 c81078 = C8107.f3222;
                                    i3 = 4;
                                } else {
                                    interfaceC5124.invoke(Integer.valueOf(f24169));
                                    C8107 c81079 = C8107.f3222;
                                    i3 = 3;
                                }
                            } else {
                                interfaceC5124.invoke(Integer.valueOf(f24169));
                                C8107 c810710 = C8107.f3222;
                            }
                            i += i3;
                        } else {
                            interfaceC5124.invoke(Integer.valueOf(f24169));
                            C8107 c810711 = C8107.f3222;
                            i3 = 1;
                            i += i3;
                        }
                    }
                } else {
                    interfaceC5124.invoke(Integer.valueOf(f24169));
                    i++;
                }
            }
        }
    }

    @InterfaceC5573
    @InterfaceC5572(name = "size")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final long m26815(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        return m26818(str, 0, 0, 3, null);
    }

    @InterfaceC5573
    @InterfaceC5572(name = "size")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final long m26816(@InterfaceC6399 String str, int i) {
        C5499.m17103(str, "<this>");
        return m26818(str, i, 0, 2, null);
    }

    @InterfaceC5573
    @InterfaceC5572(name = "size")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final long m26817(@InterfaceC6399 String str, int i, int i2) {
        int i3;
        C5499.m17103(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        long j = 0;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i3 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i3 = 3;
                } else {
                    int i4 = i + 1;
                    char cCharAt2 = i4 < i2 ? str.charAt(i4) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i = i4;
                    } else {
                        j += (long) 4;
                        i += 2;
                    }
                }
                j += (long) i3;
            }
            i++;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ long m26818(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m26817(str, i, i2);
    }
}
