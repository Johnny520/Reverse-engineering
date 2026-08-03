package com.alibaba.fastjson2.util;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class IOUtils {
    static final char[] CA = null;
    public static final int[] DIGITS_K = null;
    static final int[] IA = null;
    private static final byte[] MIN_INT_BYTES = null;
    private static final char[] MIN_INT_CHARS = null;
    private static final byte[] MIN_LONG = null;
    public static final short[] PACKED_DIGITS = null;
    public static final int[] PACKED_DIGITS_UTF16 = null;
    static final int[] sizeTable = null;

    static {
            r0 = 10
            int[] r1 = new int[r0]
            r1 = {x055e: FILL_ARRAY_DATA , data: [9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 2147483647} // fill-array
            com.alibaba.fastjson2.util.IOUtils.sizeTable = r1
            r1 = 1000(0x3e8, float:1.401E-42)
            int[] r1 = new int[r1]
            com.alibaba.fastjson2.util.IOUtils.DIGITS_K = r1
            java.lang.String r1 = "-2147483648"
            byte[] r2 = r1.getBytes()
            com.alibaba.fastjson2.util.IOUtils.MIN_INT_BYTES = r2
            char[] r1 = r1.toCharArray()
            com.alibaba.fastjson2.util.IOUtils.MIN_INT_CHARS = r1
            java.lang.String r1 = "-9223372036854775808"
            byte[] r1 = r1.getBytes()
            com.alibaba.fastjson2.util.IOUtils.MIN_LONG = r1
            java.lang.String r1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
            char[] r1 = r1.toCharArray()
            com.alibaba.fastjson2.util.IOUtils.CA = r1
            r1 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r1]
            com.alibaba.fastjson2.util.IOUtils.IA = r1
            r1 = 100
            short[] r2 = new short[r1]
            r3 = 12336(0x3030, float:1.7286E-41)
            r4 = 0
            r2[r4] = r3
            r3 = 12592(0x3130, float:1.7645E-41)
            r5 = 1
            r2[r5] = r3
            r3 = 12848(0x3230, float:1.8004E-41)
            r6 = 2
            r2[r6] = r3
            r3 = 13104(0x3330, float:1.8363E-41)
            r7 = 3
            r2[r7] = r3
            r3 = 13360(0x3430, float:1.8721E-41)
            r8 = 4
            r2[r8] = r3
            r3 = 13616(0x3530, float:1.908E-41)
            r9 = 5
            r2[r9] = r3
            r3 = 13872(0x3630, float:1.9439E-41)
            r10 = 6
            r2[r10] = r3
            r3 = 14128(0x3730, float:1.9798E-41)
            r11 = 7
            r2[r11] = r3
            r3 = 14384(0x3830, float:2.0156E-41)
            r12 = 8
            r2[r12] = r3
            r3 = 14640(0x3930, float:2.0515E-41)
            r13 = 9
            r2[r13] = r3
            r3 = 12337(0x3031, float:1.7288E-41)
            r2[r0] = r3
            r3 = 12593(0x3131, float:1.7647E-41)
            r14 = 11
            r2[r14] = r3
            r3 = 12849(0x3231, float:1.8005E-41)
            r15 = 12
            r2[r15] = r3
            r3 = 13105(0x3331, float:1.8364E-41)
            r16 = 13
            r2[r16] = r3
            r3 = 13361(0x3431, float:1.8723E-41)
            r17 = 14
            r2[r17] = r3
            r3 = 13617(0x3531, float:1.9081E-41)
            r18 = 15
            r2[r18] = r3
            r3 = 13873(0x3631, float:1.944E-41)
            r19 = 16
            r2[r19] = r3
            r3 = 14129(0x3731, float:1.9799E-41)
            r20 = 17
            r2[r20] = r3
            r3 = 14385(0x3831, float:2.0158E-41)
            r21 = 18
            r2[r21] = r3
            r3 = 14641(0x3931, float:2.0516E-41)
            r22 = 19
            r2[r22] = r3
            r3 = 12338(0x3032, float:1.7289E-41)
            r23 = 20
            r2[r23] = r3
            r3 = 12594(0x3132, float:1.7648E-41)
            r24 = 21
            r2[r24] = r3
            r3 = 12850(0x3232, float:1.8007E-41)
            r25 = 22
            r2[r25] = r3
            r3 = 13106(0x3332, float:1.8365E-41)
            r26 = 23
            r2[r26] = r3
            r3 = 13362(0x3432, float:1.8724E-41)
            r27 = 24
            r2[r27] = r3
            r3 = 13618(0x3532, float:1.9083E-41)
            r28 = 25
            r2[r28] = r3
            r3 = 13874(0x3632, float:1.9442E-41)
            r29 = 26
            r2[r29] = r3
            r3 = 14130(0x3732, float:1.98E-41)
            r30 = 27
            r2[r30] = r3
            r3 = 14386(0x3832, float:2.0159E-41)
            r31 = 28
            r2[r31] = r3
            r3 = 14642(0x3932, float:2.0518E-41)
            r32 = 29
            r2[r32] = r3
            r3 = 12339(0x3033, float:1.729E-41)
            r33 = 30
            r2[r33] = r3
            r3 = 12595(0x3133, float:1.765E-41)
            r34 = 31
            r2[r34] = r3
            r3 = 12851(0x3233, float:1.8008E-41)
            r35 = 32
            r2[r35] = r3
            r3 = 13107(0x3333, float:1.8367E-41)
            r36 = 33
            r2[r36] = r3
            r3 = 13363(0x3433, float:1.8726E-41)
            r37 = 34
            r2[r37] = r3
            r3 = 13619(0x3533, float:1.9084E-41)
            r38 = 35
            r2[r38] = r3
            r3 = 13875(0x3633, float:1.9443E-41)
            r39 = 36
            r2[r39] = r3
            r3 = 37
            r40 = 14131(0x3733, float:1.9802E-41)
            r2[r3] = r40
            r3 = 38
            r40 = 14387(0x3833, float:2.016E-41)
            r2[r3] = r40
            r3 = 39
            r40 = 14643(0x3933, float:2.0519E-41)
            r2[r3] = r40
            r3 = 40
            r40 = 12340(0x3034, float:1.7292E-41)
            r2[r3] = r40
            r3 = 41
            r40 = 12596(0x3134, float:1.7651E-41)
            r2[r3] = r40
            r3 = 42
            r40 = 12852(0x3234, float:1.801E-41)
            r2[r3] = r40
            r3 = 43
            r40 = 13108(0x3334, float:1.8368E-41)
            r2[r3] = r40
            r3 = 44
            r40 = 13364(0x3434, float:1.8727E-41)
            r2[r3] = r40
            r3 = 45
            r40 = 13620(0x3534, float:1.9086E-41)
            r2[r3] = r40
            r3 = 46
            r40 = 13876(0x3634, float:1.9444E-41)
            r2[r3] = r40
            r3 = 47
            r40 = 14132(0x3734, float:1.9803E-41)
            r2[r3] = r40
            r3 = 14388(0x3834, float:2.0162E-41)
            r40 = 48
            r2[r40] = r3
            r3 = 49
            r41 = 14644(0x3934, float:2.052E-41)
            r2[r3] = r41
            r3 = 50
            r41 = 12341(0x3035, float:1.7293E-41)
            r2[r3] = r41
            r3 = 51
            r41 = 12597(0x3135, float:1.7652E-41)
            r2[r3] = r41
            r3 = 52
            r41 = 12853(0x3235, float:1.8011E-41)
            r2[r3] = r41
            r3 = 53
            r41 = 13109(0x3335, float:1.837E-41)
            r2[r3] = r41
            r3 = 54
            r41 = 13365(0x3435, float:1.8728E-41)
            r2[r3] = r41
            r3 = 55
            r41 = 13621(0x3535, float:1.9087E-41)
            r2[r3] = r41
            r3 = 56
            r41 = 13877(0x3635, float:1.9446E-41)
            r2[r3] = r41
            r3 = 57
            r41 = 14133(0x3735, float:1.9805E-41)
            r2[r3] = r41
            r3 = 58
            r41 = 14389(0x3835, float:2.0163E-41)
            r2[r3] = r41
            r3 = 59
            r41 = 14645(0x3935, float:2.0522E-41)
            r2[r3] = r41
            r3 = 60
            r41 = 12342(0x3036, float:1.7295E-41)
            r2[r3] = r41
            r3 = 12598(0x3136, float:1.7654E-41)
            r41 = 61
            r2[r41] = r3
            r3 = 62
            r42 = 12854(0x3236, float:1.8012E-41)
            r2[r3] = r42
            r3 = 63
            r42 = 13110(0x3336, float:1.8371E-41)
            r2[r3] = r42
            r3 = 64
            r42 = 13366(0x3436, float:1.873E-41)
            r2[r3] = r42
            r3 = 65
            r42 = 13622(0x3536, float:1.9088E-41)
            r2[r3] = r42
            r3 = 66
            r42 = 13878(0x3636, float:1.9447E-41)
            r2[r3] = r42
            r3 = 67
            r42 = 14134(0x3736, float:1.9806E-41)
            r2[r3] = r42
            r3 = 68
            r42 = 14390(0x3836, float:2.0165E-41)
            r2[r3] = r42
            r3 = 69
            r42 = 14646(0x3936, float:2.0523E-41)
            r2[r3] = r42
            r3 = 70
            r42 = 12343(0x3037, float:1.7296E-41)
            r2[r3] = r42
            r3 = 71
            r42 = 12599(0x3137, float:1.7655E-41)
            r2[r3] = r42
            r3 = 72
            r42 = 12855(0x3237, float:1.8014E-41)
            r2[r3] = r42
            r3 = 73
            r42 = 13111(0x3337, float:1.8372E-41)
            r2[r3] = r42
            r3 = 74
            r42 = 13367(0x3437, float:1.8731E-41)
            r2[r3] = r42
            r3 = 75
            r42 = 13623(0x3537, float:1.909E-41)
            r2[r3] = r42
            r3 = 76
            r42 = 13879(0x3637, float:1.9449E-41)
            r2[r3] = r42
            r3 = 77
            r42 = 14135(0x3737, float:1.9807E-41)
            r2[r3] = r42
            r3 = 78
            r42 = 14391(0x3837, float:2.0166E-41)
            r2[r3] = r42
            r3 = 79
            r42 = 14647(0x3937, float:2.0525E-41)
            r2[r3] = r42
            r3 = 80
            r42 = 12344(0x3038, float:1.7298E-41)
            r2[r3] = r42
            r3 = 81
            r42 = 12600(0x3138, float:1.7656E-41)
            r2[r3] = r42
            r3 = 82
            r42 = 12856(0x3238, float:1.8015E-41)
            r2[r3] = r42
            r3 = 83
            r42 = 13112(0x3338, float:1.8374E-41)
            r2[r3] = r42
            r3 = 84
            r42 = 13368(0x3438, float:1.8733E-41)
            r2[r3] = r42
            r3 = 85
            r42 = 13624(0x3538, float:1.9091E-41)
            r2[r3] = r42
            r3 = 86
            r42 = 13880(0x3638, float:1.945E-41)
            r2[r3] = r42
            r3 = 87
            r42 = 14136(0x3738, float:1.9809E-41)
            r2[r3] = r42
            r3 = 88
            r42 = 14392(0x3838, float:2.0167E-41)
            r2[r3] = r42
            r3 = 89
            r42 = 14648(0x3938, float:2.0526E-41)
            r2[r3] = r42
            r3 = 90
            r42 = 12345(0x3039, float:1.7299E-41)
            r2[r3] = r42
            r3 = 91
            r42 = 12601(0x3139, float:1.7658E-41)
            r2[r3] = r42
            r3 = 92
            r42 = 12857(0x3239, float:1.8016E-41)
            r2[r3] = r42
            r3 = 93
            r42 = 13113(0x3339, float:1.8375E-41)
            r2[r3] = r42
            r3 = 94
            r42 = 13369(0x3439, float:1.8734E-41)
            r2[r3] = r42
            r3 = 95
            r42 = 13625(0x3539, float:1.9093E-41)
            r2[r3] = r42
            r3 = 96
            r42 = 13881(0x3639, float:1.9451E-41)
            r2[r3] = r42
            r3 = 97
            r42 = 14137(0x3739, float:1.981E-41)
            r2[r3] = r42
            r3 = 98
            r42 = 14393(0x3839, float:2.0169E-41)
            r2[r3] = r42
            r3 = 14649(0x3939, float:2.0528E-41)
            r42 = 99
            r2[r42] = r3
            int[] r3 = new int[r1]
            r43 = 3145776(0x300030, float:4.408171E-39)
            r3[r4] = r43
            r43 = 3211312(0x310030, float:4.500007E-39)
            r3[r5] = r43
            r5 = 3276848(0x320030, float:4.591842E-39)
            r3[r6] = r5
            r5 = 3342384(0x330030, float:4.683678E-39)
            r3[r7] = r5
            r5 = 3407920(0x340030, float:4.775513E-39)
            r3[r8] = r5
            r5 = 3473456(0x350030, float:4.867349E-39)
            r3[r9] = r5
            r5 = 3538992(0x360030, float:4.959184E-39)
            r3[r10] = r5
            r5 = 3604528(0x370030, float:5.05102E-39)
            r3[r11] = r5
            r5 = 3670064(0x380030, float:5.142855E-39)
            r3[r12] = r5
            r5 = 3735600(0x390030, float:5.23469E-39)
            r3[r13] = r5
            r5 = 3145777(0x300031, float:4.408172E-39)
            r3[r0] = r5
            r5 = 3211313(0x310031, float:4.500008E-39)
            r3[r14] = r5
            r5 = 3276849(0x320031, float:4.591843E-39)
            r3[r15] = r5
            r5 = 3342385(0x330031, float:4.683679E-39)
            r3[r16] = r5
            r5 = 3407921(0x340031, float:4.775514E-39)
            r3[r17] = r5
            r5 = 3473457(0x350031, float:4.86735E-39)
            r3[r18] = r5
            r5 = 3538993(0x360031, float:4.959185E-39)
            r3[r19] = r5
            r5 = 3604529(0x370031, float:5.051021E-39)
            r3[r20] = r5
            r5 = 3670065(0x380031, float:5.142856E-39)
            r3[r21] = r5
            r5 = 3735601(0x390031, float:5.234692E-39)
            r3[r22] = r5
            r5 = 3145778(0x300032, float:4.408174E-39)
            r3[r23] = r5
            r5 = 3211314(0x310032, float:4.50001E-39)
            r3[r24] = r5
            r5 = 3276850(0x320032, float:4.591845E-39)
            r3[r25] = r5
            r5 = 3342386(0x330032, float:4.68368E-39)
            r3[r26] = r5
            r5 = 3407922(0x340032, float:4.775516E-39)
            r3[r27] = r5
            r5 = 3473458(0x350032, float:4.867351E-39)
            r3[r28] = r5
            r5 = 3538994(0x360032, float:4.959187E-39)
            r3[r29] = r5
            r5 = 3604530(0x370032, float:5.051022E-39)
            r3[r30] = r5
            r5 = 3670066(0x380032, float:5.142858E-39)
            r3[r31] = r5
            r5 = 3735602(0x390032, float:5.234693E-39)
            r3[r32] = r5
            r5 = 3145779(0x300033, float:4.408175E-39)
            r3[r33] = r5
            r5 = 3211315(0x310033, float:4.500011E-39)
            r3[r34] = r5
            r5 = 3276851(0x320033, float:4.591846E-39)
            r3[r35] = r5
            r5 = 3342387(0x330033, float:4.683682E-39)
            r3[r36] = r5
            r5 = 3407923(0x340033, float:4.775517E-39)
            r3[r37] = r5
            r5 = 3473459(0x350033, float:4.867353E-39)
            r3[r38] = r5
            r5 = 3538995(0x360033, float:4.959188E-39)
            r3[r39] = r5
            r5 = 37
            r6 = 3604531(0x370033, float:5.051024E-39)
            r3[r5] = r6
            r5 = 38
            r6 = 3670067(0x380033, float:5.142859E-39)
            r3[r5] = r6
            r5 = 39
            r6 = 3735603(0x390033, float:5.234695E-39)
            r3[r5] = r6
            r5 = 40
            r6 = 3145780(0x300034, float:4.408177E-39)
            r3[r5] = r6
            r5 = 41
            r6 = 3211316(0x310034, float:4.500012E-39)
            r3[r5] = r6
            r5 = 42
            r6 = 3276852(0x320034, float:4.591848E-39)
            r3[r5] = r6
            r5 = 43
            r6 = 3342388(0x330034, float:4.683683E-39)
            r3[r5] = r6
            r5 = 44
            r6 = 3407924(0x340034, float:4.775519E-39)
            r3[r5] = r6
            r5 = 45
            r6 = 3473460(0x350034, float:4.867354E-39)
            r3[r5] = r6
            r5 = 46
            r6 = 3538996(0x360034, float:4.95919E-39)
            r3[r5] = r6
            r5 = 47
            r6 = 3604532(0x370034, float:5.051025E-39)
            r3[r5] = r6
            r5 = 3670068(0x380034, float:5.14286E-39)
            r3[r40] = r5
            r5 = 49
            r6 = 3735604(0x390034, float:5.234696E-39)
            r3[r5] = r6
            r5 = 50
            r6 = 3145781(0x300035, float:4.408178E-39)
            r3[r5] = r6
            r5 = 51
            r6 = 3211317(0x310035, float:4.500014E-39)
            r3[r5] = r6
            r5 = 52
            r6 = 3276853(0x320035, float:4.591849E-39)
            r3[r5] = r6
            r5 = 53
            r6 = 3342389(0x330035, float:4.683685E-39)
            r3[r5] = r6
            r5 = 54
            r6 = 3407925(0x340035, float:4.77552E-39)
            r3[r5] = r6
            r5 = 55
            r6 = 3473461(0x350035, float:4.867356E-39)
            r3[r5] = r6
            r5 = 56
            r6 = 3538997(0x360035, float:4.959191E-39)
            r3[r5] = r6
            r5 = 57
            r6 = 3604533(0x370035, float:5.051027E-39)
            r3[r5] = r6
            r5 = 58
            r6 = 3670069(0x380035, float:5.142862E-39)
            r3[r5] = r6
            r5 = 59
            r6 = 3735605(0x390035, float:5.234698E-39)
            r3[r5] = r6
            r5 = 60
            r6 = 3145782(0x300036, float:4.40818E-39)
            r3[r5] = r6
            r5 = 3211318(0x310036, float:4.500015E-39)
            r3[r41] = r5
            r5 = 62
            r6 = 3276854(0x320036, float:4.59185E-39)
            r3[r5] = r6
            r5 = 63
            r6 = 3342390(0x330036, float:4.683686E-39)
            r3[r5] = r6
            r5 = 64
            r6 = 3407926(0x340036, float:4.775521E-39)
            r3[r5] = r6
            r5 = 65
            r6 = 3473462(0x350036, float:4.867357E-39)
            r3[r5] = r6
            r5 = 66
            r6 = 3538998(0x360036, float:4.959192E-39)
            r3[r5] = r6
            r5 = 67
            r6 = 3604534(0x370036, float:5.051028E-39)
            r3[r5] = r6
            r5 = 68
            r6 = 3670070(0x380036, float:5.142863E-39)
            r3[r5] = r6
            r5 = 69
            r6 = 3735606(0x390036, float:5.234699E-39)
            r3[r5] = r6
            r5 = 70
            r6 = 3145783(0x300037, float:4.408181E-39)
            r3[r5] = r6
            r5 = 71
            r6 = 3211319(0x310037, float:4.500016E-39)
            r3[r5] = r6
            r5 = 72
            r6 = 3276855(0x320037, float:4.591852E-39)
            r3[r5] = r6
            r5 = 73
            r6 = 3342391(0x330037, float:4.683687E-39)
            r3[r5] = r6
            r5 = 74
            r6 = 3407927(0x340037, float:4.775523E-39)
            r3[r5] = r6
            r5 = 75
            r6 = 3473463(0x350037, float:4.867358E-39)
            r3[r5] = r6
            r5 = 76
            r6 = 3538999(0x360037, float:4.959194E-39)
            r3[r5] = r6
            r5 = 77
            r6 = 3604535(0x370037, float:5.05103E-39)
            r3[r5] = r6
            r5 = 78
            r6 = 3670071(0x380037, float:5.142865E-39)
            r3[r5] = r6
            r5 = 79
            r6 = 3735607(0x390037, float:5.2347E-39)
            r3[r5] = r6
            r5 = 80
            r6 = 3145784(0x300038, float:4.408182E-39)
            r3[r5] = r6
            r5 = 81
            r6 = 3211320(0x310038, float:4.500018E-39)
            r3[r5] = r6
            r5 = 82
            r6 = 3276856(0x320038, float:4.591853E-39)
            r3[r5] = r6
            r5 = 83
            r6 = 3342392(0x330038, float:4.683689E-39)
            r3[r5] = r6
            r5 = 84
            r6 = 3407928(0x340038, float:4.775524E-39)
            r3[r5] = r6
            r5 = 85
            r6 = 3473464(0x350038, float:4.86736E-39)
            r3[r5] = r6
            r5 = 86
            r6 = 3539000(0x360038, float:4.959195E-39)
            r3[r5] = r6
            r5 = 87
            r6 = 3604536(0x370038, float:5.051031E-39)
            r3[r5] = r6
            r5 = 88
            r6 = 3670072(0x380038, float:5.142866E-39)
            r3[r5] = r6
            r5 = 89
            r6 = 3735608(0x390038, float:5.234702E-39)
            r3[r5] = r6
            r5 = 90
            r6 = 3145785(0x300039, float:4.408184E-39)
            r3[r5] = r6
            r5 = 91
            r6 = 3211321(0x310039, float:4.500019E-39)
            r3[r5] = r6
            r5 = 92
            r6 = 3276857(0x320039, float:4.591855E-39)
            r3[r5] = r6
            r5 = 93
            r6 = 3342393(0x330039, float:4.68369E-39)
            r3[r5] = r6
            r5 = 94
            r6 = 3407929(0x340039, float:4.775526E-39)
            r3[r5] = r6
            r5 = 95
            r6 = 3473465(0x350039, float:4.867361E-39)
            r3[r5] = r6
            r5 = 96
            r6 = 3539001(0x360039, float:4.959197E-39)
            r3[r5] = r6
            r5 = 97
            r6 = 3604537(0x370039, float:5.051032E-39)
            r3[r5] = r6
            r5 = 98
            r6 = 3670073(0x380039, float:5.142868E-39)
            r3[r5] = r6
            r5 = 3735609(0x390039, float:5.234703E-39)
            r3[r42] = r5
            boolean r5 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r5 == 0) goto L514
            r5 = r4
        L4f8:
            if (r5 >= r1) goto L505
            short r6 = r2[r5]
            short r6 = java.lang.Short.reverseBytes(r6)
            r2[r5] = r6
            int r5 = r5 + 1
            goto L4f8
        L505:
            r5 = r4
        L506:
            if (r5 >= r1) goto L514
            r6 = r3[r5]
            int r6 = r6 << r12
            int r6 = java.lang.Integer.reverseBytes(r6)
            r3[r5] = r6
            int r5 = r5 + 1
            goto L506
        L514:
            com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS = r2
            com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS_UTF16 = r3
            int[] r2 = com.alibaba.fastjson2.util.IOUtils.IA
            r3 = -1
            java.util.Arrays.fill(r2, r3)
            char[] r2 = com.alibaba.fastjson2.util.IOUtils.CA
            int r2 = r2.length
            r3 = r4
        L522:
            if (r3 >= r2) goto L52f
            int[] r5 = com.alibaba.fastjson2.util.IOUtils.IA
            char[] r6 = com.alibaba.fastjson2.util.IOUtils.CA
            char r6 = r6[r3]
            r5[r6] = r3
            int r3 = r3 + 1
            goto L522
        L52f:
            int[] r2 = com.alibaba.fastjson2.util.IOUtils.IA
            r2[r41] = r4
            r2 = r4
        L534:
            int[] r3 = com.alibaba.fastjson2.util.IOUtils.DIGITS_K
            int r5 = r3.length
            if (r2 >= r5) goto L55c
            if (r2 >= r0) goto L53e
            r5 = 33554432(0x2000000, float:9.403955E-38)
            goto L544
        L53e:
            if (r2 >= r1) goto L543
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            goto L544
        L543:
            r5 = r4
        L544:
            int r6 = r2 / 100
            int r6 = r6 + 48
            int r6 = r6 << 16
            int r5 = r5 + r6
            int r6 = r2 / 10
            int r6 = r6 % r0
            int r6 = r6 + 48
            int r6 = r6 << r12
            int r5 = r5 + r6
            int r6 = r2 % 10
            int r6 = r6 + r5
            int r6 = r6 + 48
            r3[r2] = r6
            int r2 = r2 + 1
            goto L534
        L55c:
            return
    }

    public IOUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void close(java.io.Closeable r0) {
            if (r0 != 0) goto L3
            return
        L3:
            r0.close()     // Catch: java.lang.Exception -> L6
        L6:
            return
    }

    public static byte[] decodeBase64(java.lang.String r15) {
            int r0 = r15.length()
            r1 = 0
            if (r0 != 0) goto La
            byte[] r15 = new byte[r1]
            return r15
        La:
            int r2 = r0 + (-1)
            r3 = r1
        Ld:
            if (r3 >= r2) goto L1e
            int[] r4 = com.alibaba.fastjson2.util.IOUtils.IA
            char r5 = r15.charAt(r3)
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4 = r4[r5]
            if (r4 >= 0) goto L1e
            int r3 = r3 + 1
            goto Ld
        L1e:
            if (r2 <= 0) goto L2f
            int[] r4 = com.alibaba.fastjson2.util.IOUtils.IA
            char r5 = r15.charAt(r2)
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4 = r4[r5]
            if (r4 >= 0) goto L2f
            int r2 = r2 + (-1)
            goto L1e
        L2f:
            char r4 = r15.charAt(r2)
            r5 = 61
            r6 = 1
            if (r4 != r5) goto L44
            int r4 = r2 + (-1)
            char r4 = r15.charAt(r4)
            if (r4 != r5) goto L42
            r4 = 2
            goto L45
        L42:
            r4 = r6
            goto L45
        L44:
            r4 = r1
        L45:
            int r5 = r2 - r3
            int r5 = r5 + r6
            r7 = 76
            if (r0 <= r7) goto L5a
            char r0 = r15.charAt(r7)
            r7 = 13
            if (r0 != r7) goto L57
            int r0 = r5 / 78
            goto L58
        L57:
            r0 = r1
        L58:
            int r0 = r0 << r6
            goto L5b
        L5a:
            r0 = r1
        L5b:
            int r5 = r5 - r0
            int r5 = r5 * 6
            int r5 = r5 >> 3
            int r5 = r5 - r4
            byte[] r7 = new byte[r5]
            int r8 = r5 / 3
            int r8 = r8 * 3
            r9 = r1
            r10 = r9
        L69:
            if (r9 >= r8) goto Lb7
            int[] r11 = com.alibaba.fastjson2.util.IOUtils.IA
            char r12 = r15.charAt(r3)
            r12 = r11[r12]
            int r12 = r12 << 18
            int r13 = r3 + 1
            char r13 = r15.charAt(r13)
            r13 = r11[r13]
            int r13 = r13 << 12
            r12 = r12 | r13
            int r13 = r3 + 2
            char r13 = r15.charAt(r13)
            r13 = r11[r13]
            int r13 = r13 << 6
            r12 = r12 | r13
            int r13 = r3 + 3
            char r13 = r15.charAt(r13)
            r11 = r11[r13]
            r11 = r11 | r12
            int r12 = r3 + 4
            int r13 = r11 >> 16
            byte r13 = (byte) r13
            r7[r9] = r13
            int r13 = r9 + 1
            int r14 = r11 >> 8
            byte r14 = (byte) r14
            r7[r13] = r14
            int r13 = r9 + 2
            byte r11 = (byte) r11
            r7[r13] = r11
            int r9 = r9 + 3
            if (r0 <= 0) goto Lb5
            int r10 = r10 + 1
            r11 = 19
            if (r10 != r11) goto Lb5
            int r3 = r3 + 6
            r10 = r1
            goto L69
        Lb5:
            r3 = r12
            goto L69
        Lb7:
            if (r9 >= r5) goto Le0
            r0 = r1
        Lba:
            int r8 = r2 - r4
            if (r3 > r8) goto Ld1
            int[] r8 = com.alibaba.fastjson2.util.IOUtils.IA
            int r10 = r3 + 1
            char r3 = r15.charAt(r3)
            r3 = r8[r3]
            int r8 = r0 * 6
            int r8 = 18 - r8
            int r3 = r3 << r8
            r1 = r1 | r3
            int r0 = r0 + r6
            r3 = r10
            goto Lba
        Ld1:
            r15 = 16
        Ld3:
            if (r9 >= r5) goto Le0
            int r0 = r9 + 1
            int r2 = r1 >> r15
            byte r2 = (byte) r2
            r7[r9] = r2
            int r15 = r15 + (-8)
            r9 = r0
            goto Ld3
        Le0:
            return r7
    }

    public static int digit2(byte[] r3, int r4) {
            r0 = r3[r4]
            int r4 = r4 + 1
            r3 = r3[r4]
            int r3 = r3 << 8
            r3 = r3 | r0
            r4 = 61680(0xf0f0, float:8.6432E-41)
            r0 = r3 & r4
            int r0 = r0 + (-12336)
            r1 = r3 & 3855(0xf0f, float:5.402E-42)
            int r2 = r1 + 1542
            r4 = r4 & r2
            r4 = r4 | r0
            if (r4 == 0) goto L1a
            r3 = -1
            return r3
        L1a:
            r3 = r3 & 15
            int r3 = r3 * 10
            int r4 = r1 >> 8
            int r3 = r3 + r4
            return r3
    }

    public static int digit2(char[] r3, int r4) {
            char r0 = r3[r4]
            int r4 = r4 + 1
            char r3 = r3[r4]
            int r3 = r3 << 16
            r3 = r3 | r0
            r4 = -983056(0xfffffffffff0fff0, float:NaN)
            r4 = r4 & r3
            r0 = 3145776(0x300030, float:4.408171E-39)
            int r4 = r4 - r0
            r0 = 983055(0xf000f, float:1.377553E-39)
            r0 = r0 & r3
            r1 = 393222(0x60006, float:5.51021E-40)
            int r1 = r1 + r0
            r2 = 15728880(0xf000f0, float:2.2040855E-38)
            r1 = r1 & r2
            r4 = r4 | r1
            if (r4 == 0) goto L22
            r3 = -1
            return r3
        L22:
            r3 = r3 & 15
            int r3 = r3 * 10
            int r4 = r0 >> 16
            int r3 = r3 + r4
            return r3
    }

    public static int digit4(char[] r8, int r9) {
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_CHAR_BASE_OFFSET
            long r3 = (long) r9
            r9 = 1
            long r3 = r3 << r9
            long r1 = r1 + r3
            long r8 = r0.getLong(r8, r1)
            boolean r0 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r0 == 0) goto L14
            long r8 = java.lang.Long.reverseBytes(r8)
        L14:
            r0 = -4222189076152336(0xfff0fff0fff0fff0, double:NaN)
            long r0 = r0 & r8
            r2 = 13511005043687472(0x30003000300030, double:8.90070286343755E-308)
            long r0 = r0 - r2
            r2 = 4222189076152335(0xf000f000f000f, double:2.0860385727730595E-308)
            long r2 = r2 & r8
            r4 = 1688875630460934(0x6000600060006, double:8.34415429109224E-309)
            long r4 = r4 + r2
            r6 = 67555025218437360(0xf000f000f000f0, double:3.646395425207308E-304)
            long r4 = r4 & r6
            long r0 = r0 | r4
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L3b
            r8 = -1
            return r8
        L3b:
            r0 = 15
            long r8 = r8 & r0
            r4 = 10
            long r8 = r8 * r4
            r6 = 16
            long r6 = r2 >> r6
            long r6 = r6 & r0
            long r8 = r8 + r6
            long r8 = r8 * r4
            r6 = 32
            long r6 = r2 >> r6
            long r0 = r0 & r6
            long r8 = r8 + r0
            long r8 = r8 * r4
            r0 = 48
            long r0 = r2 >> r0
            long r8 = r8 + r0
            int r8 = (int) r8
            return r8
    }

    public static int encodeUTF8(byte[] r8, int r9, int r10, byte[] r11, int r12) {
            int r10 = r10 + r9
        L1:
            if (r9 >= r10) goto Lbc
            r0 = r8[r9]
            int r1 = r9 + 1
            r1 = r8[r1]
            int r2 = r9 + 2
            if (r1 != 0) goto L16
            if (r0 < 0) goto L16
            int r9 = r12 + 1
            r11[r12] = r0
        L13:
            r12 = r9
        L14:
            r9 = r2
            goto L1
        L16:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            char r0 = (char) r0
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 >= r1) goto L35
            int r9 = r0 >> 6
            r9 = r9 | 192(0xc0, float:2.69E-43)
            byte r9 = (byte) r9
            r11[r12] = r9
            int r9 = r12 + 1
            r0 = r0 & 63
            r0 = r0 | 128(0x80, float:1.8E-43)
            byte r0 = (byte) r0
            r11[r9] = r0
            int r12 = r12 + 2
            goto L14
        L35:
            r1 = 55296(0xd800, float:7.7486E-41)
            r3 = 63
            if (r0 < r1) goto L9e
            r1 = 57344(0xe000, float:8.0356E-41)
            if (r0 >= r1) goto L9e
            int r4 = r9 + 1
            r5 = 56320(0xdc00, float:7.8921E-41)
            r6 = -1
            if (r0 >= r5) goto L9d
            int r4 = r10 - r4
            r7 = 2
            if (r4 >= r7) goto L4f
            goto L6e
        L4f:
            int r2 = r9 + 2
            r2 = r8[r2]
            int r4 = r9 + 3
            r4 = r8[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r2 = r2 | r4
            char r2 = (char) r2
            if (r2 < r5) goto L9d
            if (r2 >= r1) goto L9d
            int r9 = r9 + 4
            int r0 = r0 << 10
            int r0 = r0 + r2
            r1 = -56613888(0xfffffffffca02400, float:-6.651981E36)
            int r6 = r0 + r1
            r2 = r9
        L6e:
            if (r6 >= 0) goto L75
            int r9 = r12 + 1
            r11[r12] = r3
            goto L13
        L75:
            int r9 = r6 >> 18
            r9 = r9 | 240(0xf0, float:3.36E-43)
            byte r9 = (byte) r9
            r11[r12] = r9
            int r9 = r12 + 1
            int r0 = r6 >> 12
            r0 = r0 & r3
            r0 = r0 | 128(0x80, float:1.8E-43)
            byte r0 = (byte) r0
            r11[r9] = r0
            int r9 = r12 + 2
            int r0 = r6 >> 6
            r0 = r0 & r3
            r0 = r0 | 128(0x80, float:1.8E-43)
            byte r0 = (byte) r0
            r11[r9] = r0
            int r9 = r12 + 3
            r0 = r6 & 63
            r0 = r0 | 128(0x80, float:1.8E-43)
            byte r0 = (byte) r0
            r11[r9] = r0
            int r9 = r12 + 4
            goto L13
        L9d:
            return r6
        L9e:
            int r9 = r0 >> 12
            r9 = r9 | 224(0xe0, float:3.14E-43)
            byte r9 = (byte) r9
            r11[r12] = r9
            int r9 = r12 + 1
            int r1 = r0 >> 6
            r1 = r1 & r3
            r1 = r1 | 128(0x80, float:1.8E-43)
            byte r1 = (byte) r1
            r11[r9] = r1
            int r9 = r12 + 2
            r0 = r0 & 63
            r0 = r0 | 128(0x80, float:1.8E-43)
            byte r0 = (byte) r0
            r11[r9] = r0
            int r12 = r12 + 3
            goto L14
        Lbc:
            return r12
    }

    public static int encodeUTF8(char[] r9, int r10, int r11, byte[] r12, int r13) {
            int r0 = r10 + r11
            int r1 = r12.length
            int r11 = java.lang.Math.min(r11, r1)
            int r11 = r11 + r13
        L8:
            r1 = 128(0x80, float:1.8E-43)
            if (r13 >= r11) goto L19
            char r2 = r9[r10]
            if (r2 >= r1) goto L19
            int r1 = r13 + 1
            int r10 = r10 + 1
            byte r2 = (byte) r2
            r12[r13] = r2
            r13 = r1
            goto L8
        L19:
            if (r10 >= r0) goto Lbd
            int r11 = r10 + 1
            char r2 = r9[r10]
            if (r2 >= r1) goto L28
            int r10 = r13 + 1
            byte r2 = (byte) r2
            r12[r13] = r2
            goto L99
        L28:
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 >= r3) goto L3e
            int r10 = r2 >> 6
            r10 = r10 | 192(0xc0, float:2.69E-43)
            byte r10 = (byte) r10
            r12[r13] = r10
            int r10 = r13 + 1
            r2 = r2 & 63
            r2 = r2 | r1
            byte r2 = (byte) r2
            r12[r10] = r2
            int r13 = r13 + 2
            goto L9a
        L3e:
            r3 = 55296(0xd800, float:7.7486E-41)
            r4 = 63
            if (r2 < r3) goto La2
            r3 = 57344(0xe000, float:8.0356E-41)
            if (r2 >= r3) goto La2
            r5 = 56320(0xdc00, float:7.8921E-41)
            if (r2 >= r5) goto L9d
            int r6 = r0 - r10
            r7 = 2
            if (r6 >= r7) goto L56
            r2 = -1
            goto L65
        L56:
            int r6 = r10 + 1
            char r6 = r9[r6]
            if (r6 < r5) goto L95
            if (r6 >= r3) goto L95
            int r2 = r2 << 10
            int r2 = r2 + r6
            r3 = -56613888(0xfffffffffca02400, float:-6.651981E36)
            int r2 = r2 + r3
        L65:
            if (r2 >= 0) goto L6c
            int r10 = r13 + 1
            r12[r13] = r4
            goto L99
        L6c:
            int r11 = r2 >> 18
            r11 = r11 | 240(0xf0, float:3.36E-43)
            byte r11 = (byte) r11
            r12[r13] = r11
            int r11 = r13 + 1
            int r3 = r2 >> 12
            r3 = r3 & r4
            r3 = r3 | r1
            byte r3 = (byte) r3
            r12[r11] = r3
            int r11 = r13 + 2
            int r3 = r2 >> 6
            r3 = r3 & r4
            r3 = r3 | r1
            byte r3 = (byte) r3
            r12[r11] = r3
            int r11 = r13 + 3
            r2 = r2 & 63
            r2 = r2 | r1
            byte r2 = (byte) r2
            r12[r11] = r2
            int r11 = r13 + 4
            int r10 = r10 + 2
            r8 = r11
            r11 = r10
            r10 = r8
            goto L99
        L95:
            int r10 = r13 + 1
            r12[r13] = r4
        L99:
            r13 = r10
        L9a:
            r10 = r11
            goto L19
        L9d:
            int r10 = r13 + 1
            r12[r13] = r4
            goto L99
        La2:
            int r10 = r2 >> 12
            r10 = r10 | 224(0xe0, float:3.14E-43)
            byte r10 = (byte) r10
            r12[r13] = r10
            int r10 = r13 + 1
            int r3 = r2 >> 6
            r3 = r3 & r4
            r3 = r3 | r1
            byte r3 = (byte) r3
            r12[r10] = r3
            int r10 = r13 + 2
            r2 = r2 & 63
            r2 = r2 | r1
            byte r2 = (byte) r2
            r12[r10] = r2
            int r13 = r13 + 3
            goto L9a
        Lbd:
            return r13
    }

    public static void getChars(int r8, int r9, byte[] r10) {
            r0 = 1
            if (r8 >= 0) goto L5
            r1 = r0
            goto L6
        L5:
            r1 = 0
        L6:
            if (r1 != 0) goto L9
            int r8 = -r8
        L9:
            r2 = -100
            if (r8 > r2) goto L23
            int r2 = r8 / 100
            int r3 = r2 * 100
            int r3 = r3 - r8
            int r9 = r9 + (-2)
            sun.misc.Unsafe r8 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r6 = (long) r9
            long r4 = r4 + r6
            short[] r6 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS
            short r3 = r6[r3]
            r8.putShort(r10, r4, r3)
            r8 = r2
            goto L9
        L23:
            r2 = -9
            if (r8 >= r2) goto L38
            int r9 = r9 + (-2)
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r9
            long r3 = r3 + r5
            short[] r5 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS
            int r8 = -r8
            short r8 = r5[r8]
            r2.putShort(r10, r3, r8)
            goto L3f
        L38:
            int r9 = r9 + (-1)
            int r8 = 48 - r8
            byte r8 = (byte) r8
            r10[r9] = r8
        L3f:
            if (r1 == 0) goto L46
            int r9 = r9 - r0
            r8 = 45
            r10[r9] = r8
        L46:
            return
    }

    public static void getChars(int r8, int r9, char[] r10) {
            r0 = 1
            if (r8 >= 0) goto L5
            r1 = r0
            goto L6
        L5:
            r1 = 0
        L6:
            if (r1 != 0) goto L9
            int r8 = -r8
        L9:
            r2 = -100
            if (r8 > r2) goto L25
            int r2 = r8 / 100
            int r3 = r2 * 100
            int r3 = r3 - r8
            int r9 = r9 + (-2)
            sun.misc.Unsafe r8 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_CHAR_BASE_OFFSET
            int r6 = r9 << 1
            long r6 = (long) r6
            long r4 = r4 + r6
            int[] r6 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS_UTF16
            r3 = r6[r3]
            r8.putInt(r10, r4, r3)
            r8 = r2
            goto L9
        L25:
            r2 = -9
            if (r8 >= r2) goto L3c
            int r9 = r9 + (-2)
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_CHAR_BASE_OFFSET
            int r5 = r9 << 1
            long r5 = (long) r5
            long r3 = r3 + r5
            int[] r5 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS_UTF16
            int r8 = -r8
            r8 = r5[r8]
            r2.putInt(r10, r3, r8)
            goto L43
        L3c:
            int r9 = r9 + (-1)
            int r8 = 48 - r8
            char r8 = (char) r8
            r10[r9] = r8
        L43:
            if (r1 == 0) goto L4a
            int r9 = r9 - r0
            r8 = 45
            r10[r9] = r8
        L4a:
            return
    }

    public static void getChars(long r11, int r13, byte[] r14) {
            r0 = 0
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r1 = 1
            if (r0 >= 0) goto L9
            r0 = r1
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto Ld
            long r11 = -r11
        Ld:
            r2 = -2147483648(0xffffffff80000000, double:NaN)
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 > 0) goto L2c
            r2 = 100
            long r4 = r11 / r2
            int r13 = r13 + (-2)
            sun.misc.Unsafe r6 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r7 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r9 = (long) r13
            long r7 = r7 + r9
            short[] r9 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS
            long r2 = r2 * r4
            long r2 = r2 - r11
            int r11 = (int) r2
            short r11 = r9[r11]
            r6.putShort(r14, r7, r11)
            r11 = r4
            goto Ld
        L2c:
            int r11 = (int) r11
        L2d:
            r12 = -100
            if (r11 > r12) goto L47
            int r12 = r11 / 100
            int r13 = r13 + (-2)
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r13
            long r3 = r3 + r5
            short[] r5 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS
            int r6 = r12 * 100
            int r6 = r6 - r11
            short r11 = r5[r6]
            r2.putShort(r14, r3, r11)
            r11 = r12
            goto L2d
        L47:
            r12 = -9
            if (r11 >= r12) goto L5c
            int r13 = r13 + (-2)
            sun.misc.Unsafe r12 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r2 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r4 = (long) r13
            long r2 = r2 + r4
            short[] r4 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS
            int r11 = -r11
            short r11 = r4[r11]
            r12.putShort(r14, r2, r11)
            goto L63
        L5c:
            int r13 = r13 + (-1)
            int r11 = 48 - r11
            byte r11 = (byte) r11
            r14[r13] = r11
        L63:
            if (r0 == 0) goto L6a
            int r13 = r13 - r1
            r11 = 45
            r14[r13] = r11
        L6a:
            return
    }

    public static void getChars(long r10, int r12, char[] r13) {
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 != 0) goto Lc
            long r10 = -r10
        Lc:
            r1 = -2147483648(0xffffffff80000000, double:NaN)
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 > 0) goto L2d
            r1 = 100
            long r3 = r10 / r1
            int r12 = r12 + (-2)
            sun.misc.Unsafe r5 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r6 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_CHAR_BASE_OFFSET
            int r8 = r12 << 1
            long r8 = (long) r8
            long r6 = r6 + r8
            int[] r8 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS_UTF16
            long r1 = r1 * r3
            long r1 = r1 - r10
            int r10 = (int) r1
            r10 = r8[r10]
            r5.putInt(r13, r6, r10)
            r10 = r3
            goto Lc
        L2d:
            int r10 = (int) r10
        L2e:
            r11 = -100
            if (r10 > r11) goto L4a
            int r11 = r10 / 100
            int r12 = r12 + (-2)
            sun.misc.Unsafe r1 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r2 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_CHAR_BASE_OFFSET
            int r4 = r12 << 1
            long r4 = (long) r4
            long r2 = r2 + r4
            int[] r4 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS_UTF16
            int r5 = r11 * 100
            int r5 = r5 - r10
            r10 = r4[r5]
            r1.putInt(r13, r2, r10)
            r10 = r11
            goto L2e
        L4a:
            r11 = -9
            if (r10 >= r11) goto L61
            int r12 = r12 + (-2)
            sun.misc.Unsafe r11 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_CHAR_BASE_OFFSET
            int r3 = r12 << 1
            long r3 = (long) r3
            long r1 = r1 + r3
            int[] r3 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS_UTF16
            int r10 = -r10
            r10 = r3[r10]
            r11.putInt(r13, r1, r10)
            goto L68
        L61:
            int r12 = r12 + (-1)
            int r10 = 48 - r10
            char r10 = (char) r10
            r13[r12] = r10
        L68:
            if (r0 == 0) goto L70
            int r12 = r12 + (-1)
            r10 = 45
            r13[r12] = r10
        L70:
            return
    }

    public static int getInt(byte[] r5, int r6) {
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r3 = (long) r6
            long r1 = r1 + r3
            int r5 = r0.getInt(r5, r1)
            boolean r6 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r6 == 0) goto Lf
            return r5
        Lf:
            int r5 = java.lang.Integer.reverseBytes(r5)
            return r5
    }

    public static int indexOfChar(byte[] r1, int r2, int r3, int r4) {
        L0:
            if (r3 >= r4) goto La
            r0 = r1[r3]
            if (r0 != r2) goto L7
            return r3
        L7:
            int r3 = r3 + 1
            goto L0
        La:
            r1 = -1
            return r1
    }

    public static int indexOfChar(char[] r1, int r2, int r3, int r4) {
        L0:
            if (r3 >= r4) goto La
            char r0 = r1[r3]
            if (r0 != r2) goto L7
            return r3
        L7:
            int r3 = r3 + 1
            goto L0
        La:
            r1 = -1
            return r1
    }

    public static boolean isNumber(java.lang.String r6) {
            int r0 = r6.length()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r2 = r1
        L9:
            r3 = 1
            if (r2 >= r0) goto L2b
            char r4 = r6.charAt(r2)
            r5 = 43
            if (r4 == r5) goto L22
            r5 = 45
            if (r4 != r5) goto L19
            goto L22
        L19:
            r3 = 48
            if (r4 < r3) goto L21
            r3 = 57
            if (r4 <= r3) goto L27
        L21:
            return r1
        L22:
            if (r2 != 0) goto L2a
            if (r0 != r3) goto L27
            goto L2a
        L27:
            int r2 = r2 + 1
            goto L9
        L2a:
            return r1
        L2b:
            return r3
    }

    public static boolean isNumber(byte[] r6, int r7, int r8) {
            r0 = 0
            if (r8 > 0) goto L4
            return r0
        L4:
            int r1 = r7 + r8
            r2 = r7
        L7:
            r3 = 1
            if (r2 >= r1) goto L28
            r4 = r6[r2]
            char r4 = (char) r4
            r5 = 43
            if (r4 == r5) goto L1f
            r5 = 45
            if (r4 != r5) goto L16
            goto L1f
        L16:
            r3 = 48
            if (r4 < r3) goto L1e
            r3 = 57
            if (r4 <= r3) goto L24
        L1e:
            return r0
        L1f:
            if (r2 != r7) goto L27
            if (r8 != r3) goto L24
            goto L27
        L24:
            int r2 = r2 + 1
            goto L7
        L27:
            return r0
        L28:
            return r3
    }

    public static boolean isNumber(char[] r6, int r7, int r8) {
            r0 = 0
            if (r8 > 0) goto L4
            return r0
        L4:
            int r1 = r7 + r8
            r2 = r7
        L7:
            r3 = 1
            if (r2 >= r1) goto L27
            char r4 = r6[r2]
            r5 = 43
            if (r4 == r5) goto L1e
            r5 = 45
            if (r4 != r5) goto L15
            goto L1e
        L15:
            r3 = 48
            if (r4 < r3) goto L1d
            r3 = 57
            if (r4 <= r3) goto L23
        L1d:
            return r0
        L1e:
            if (r2 != r7) goto L26
            if (r8 != r3) goto L23
            goto L26
        L23:
            int r2 = r2 + 1
            goto L7
        L26:
            return r0
        L27:
            return r3
    }

    public static int stringSize(int r2) {
            r0 = 0
        L1:
            int[] r1 = com.alibaba.fastjson2.util.IOUtils.sizeTable
            r1 = r1[r0]
            if (r2 > r1) goto La
            int r0 = r0 + 1
            return r0
        La:
            int r0 = r0 + 1
            goto L1
    }

    public static int stringSize(long r6) {
            r0 = 10
            r2 = 1
            r3 = r0
        L4:
            r5 = 19
            if (r2 >= r5) goto L11
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 >= 0) goto Ld
            return r2
        Ld:
            long r3 = r3 * r0
            int r2 = r2 + 1
            goto L4
        L11:
            return r5
    }

    public static int writeDecimal(byte[] r5, int r6, long r7, int r9) {
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto Le
            int r0 = r6 + 1
            r1 = 45
            r5[r6] = r1
            long r7 = -r7
            r6 = r0
        Le:
            if (r9 != 0) goto L15
            int r5 = writeInt64(r5, r6, r7)
            return r5
        L15:
            int r0 = stringSize(r7)
            int r0 = r0 - r9
            r1 = 46
            r2 = 48
            if (r0 != 0) goto L29
            r5[r6] = r2
            int r2 = r6 + 1
            r5[r2] = r1
            int r6 = r6 + 2
            goto L3f
        L29:
            if (r0 >= 0) goto L3f
            r5[r6] = r2
            int r3 = r6 + 1
            r5[r3] = r1
            int r6 = r6 + 2
            r3 = 0
        L34:
            int r4 = -r0
            if (r3 >= r4) goto L3f
            int r4 = r6 + 1
            r5[r6] = r2
            int r3 = r3 + 1
            r6 = r4
            goto L34
        L3f:
            int r6 = writeInt64(r5, r6, r7)
            if (r0 <= 0) goto L50
            int r7 = r6 - r9
            int r8 = r7 + 1
            java.lang.System.arraycopy(r5, r7, r5, r8, r9)
            r5[r7] = r1
            int r6 = r6 + 1
        L50:
            return r6
    }

    public static int writeDecimal(char[] r5, int r6, long r7, int r9) {
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto Le
            int r0 = r6 + 1
            r1 = 45
            r5[r6] = r1
            long r7 = -r7
            r6 = r0
        Le:
            if (r9 != 0) goto L15
            int r5 = writeInt64(r5, r6, r7)
            return r5
        L15:
            int r0 = stringSize(r7)
            int r0 = r0 - r9
            r1 = 46
            r2 = 48
            if (r0 != 0) goto L29
            r5[r6] = r2
            int r2 = r6 + 1
            r5[r2] = r1
            int r6 = r6 + 2
            goto L3f
        L29:
            if (r0 >= 0) goto L3f
            r5[r6] = r2
            int r3 = r6 + 1
            r5[r3] = r1
            int r6 = r6 + 2
            r3 = 0
        L34:
            int r4 = -r0
            if (r3 >= r4) goto L3f
            int r4 = r6 + 1
            r5[r6] = r2
            int r3 = r3 + 1
            r6 = r4
            goto L34
        L3f:
            int r6 = writeInt64(r5, r6, r7)
            if (r0 <= 0) goto L50
            int r7 = r6 - r9
            int r8 = r7 + 1
            java.lang.System.arraycopy(r5, r7, r5, r8, r9)
            r5[r7] = r1
            int r6 = r6 + 1
        L50:
            return r6
    }

    public static int writeInt32(byte[] r5, int r6, int r7) {
            if (r7 >= 0) goto L18
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 != r0) goto L10
            byte[] r7 = com.alibaba.fastjson2.util.IOUtils.MIN_INT_BYTES
            r0 = 0
            int r1 = r7.length
            java.lang.System.arraycopy(r7, r0, r5, r6, r1)
            int r5 = r7.length
            int r6 = r6 + r5
            return r6
        L10:
            int r7 = -r7
            int r0 = r6 + 1
            r1 = 45
            r5[r6] = r1
            r6 = r0
        L18:
            r0 = 1000(0x3e8, float:1.401E-42)
            r1 = 1
            if (r7 >= r0) goto L44
            int[] r0 = com.alibaba.fastjson2.util.IOUtils.DIGITS_K
            r7 = r0[r7]
            int r0 = r7 >> 24
            if (r0 != 0) goto L34
            int r0 = r7 >> 16
            byte r0 = (byte) r0
            r5[r6] = r0
            int r0 = r6 + 1
            int r1 = r7 >> 8
            byte r1 = (byte) r1
            r5[r0] = r1
            int r6 = r6 + 2
            goto L3e
        L34:
            if (r0 != r1) goto L3e
            int r0 = r6 + 1
            int r1 = r7 >> 8
            byte r1 = (byte) r1
            r5[r6] = r1
            r6 = r0
        L3e:
            int r0 = r6 + 1
            byte r7 = (byte) r7
            r5[r6] = r7
            return r0
        L44:
            int r0 = r7 / 1000
            int r2 = r0 * 1000
            int r2 = r7 - r2
            int[] r3 = com.alibaba.fastjson2.util.IOUtils.DIGITS_K
            r2 = r3[r2]
            r4 = 1000000(0xf4240, float:1.401298E-39)
            if (r7 >= r4) goto L8b
            r7 = r3[r0]
            int r0 = r7 >> 24
            if (r0 != 0) goto L68
            int r0 = r7 >> 16
            byte r0 = (byte) r0
            r5[r6] = r0
            int r0 = r6 + 1
            int r1 = r7 >> 8
            byte r1 = (byte) r1
            r5[r0] = r1
            int r6 = r6 + 2
            goto L72
        L68:
            if (r0 != r1) goto L72
            int r0 = r6 + 1
            int r1 = r7 >> 8
            byte r1 = (byte) r1
            r5[r6] = r1
            r6 = r0
        L72:
            byte r7 = (byte) r7
            r5[r6] = r7
            int r7 = r6 + 1
            int r0 = r2 >> 16
            byte r0 = (byte) r0
            r5[r7] = r0
            int r7 = r6 + 2
            int r0 = r2 >> 8
            byte r0 = (byte) r0
            r5[r7] = r0
            int r7 = r6 + 3
            byte r0 = (byte) r2
            r5[r7] = r0
            int r6 = r6 + 4
            return r6
        L8b:
            int r7 = r0 / 1000
            int r4 = r7 * 1000
            int r0 = r0 - r4
            int r4 = r7 / 1000
            r0 = r3[r0]
            if (r4 != 0) goto Lbb
            r7 = r3[r7]
            int r3 = r7 >> 24
            if (r3 != 0) goto Lab
            int r1 = r7 >> 16
            byte r1 = (byte) r1
            r5[r6] = r1
            int r1 = r6 + 1
            int r3 = r7 >> 8
            byte r3 = (byte) r3
            r5[r1] = r3
            int r6 = r6 + 2
            goto Lb5
        Lab:
            if (r3 != r1) goto Lb5
            int r1 = r6 + 1
            int r3 = r7 >> 8
            byte r3 = (byte) r3
            r5[r6] = r3
            r6 = r1
        Lb5:
            int r1 = r6 + 1
            byte r7 = (byte) r7
            r5[r6] = r7
            goto Lda
        Lbb:
            int r1 = r4 * 1000
            int r7 = r7 - r1
            int r4 = r4 + 48
            byte r1 = (byte) r4
            r5[r6] = r1
            r7 = r3[r7]
            int r1 = r6 + 1
            int r3 = r7 >> 16
            byte r3 = (byte) r3
            r5[r1] = r3
            int r1 = r6 + 2
            int r3 = r7 >> 8
            byte r3 = (byte) r3
            r5[r1] = r3
            int r1 = r6 + 3
            byte r7 = (byte) r7
            r5[r1] = r7
            int r1 = r6 + 4
        Lda:
            int r6 = r0 >> 16
            byte r6 = (byte) r6
            r5[r1] = r6
            int r6 = r1 + 1
            int r7 = r0 >> 8
            byte r7 = (byte) r7
            r5[r6] = r7
            int r6 = r1 + 2
            byte r7 = (byte) r0
            r5[r6] = r7
            int r6 = r1 + 3
            int r7 = r2 >> 16
            byte r7 = (byte) r7
            r5[r6] = r7
            int r6 = r1 + 4
            int r7 = r2 >> 8
            byte r7 = (byte) r7
            r5[r6] = r7
            int r6 = r1 + 5
            byte r7 = (byte) r2
            r5[r6] = r7
            int r1 = r1 + 6
            return r1
    }

    public static int writeInt32(char[] r5, int r6, int r7) {
            if (r7 >= 0) goto L18
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 != r0) goto L10
            char[] r7 = com.alibaba.fastjson2.util.IOUtils.MIN_INT_CHARS
            r0 = 0
            int r1 = r7.length
            java.lang.System.arraycopy(r7, r0, r5, r6, r1)
            int r5 = r7.length
            int r6 = r6 + r5
            return r6
        L10:
            int r7 = -r7
            int r0 = r6 + 1
            r1 = 45
            r5[r6] = r1
            r6 = r0
        L18:
            r0 = 1000(0x3e8, float:1.401E-42)
            r1 = 1
            if (r7 >= r0) goto L48
            int[] r0 = com.alibaba.fastjson2.util.IOUtils.DIGITS_K
            r7 = r0[r7]
            int r0 = r7 >> 24
            if (r0 != 0) goto L36
            int r0 = r7 >> 16
            byte r0 = (byte) r0
            char r0 = (char) r0
            r5[r6] = r0
            int r0 = r6 + 1
            int r1 = r7 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r5[r0] = r1
            int r6 = r6 + 2
            goto L41
        L36:
            if (r0 != r1) goto L41
            int r0 = r6 + 1
            int r1 = r7 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r5[r6] = r1
            r6 = r0
        L41:
            int r0 = r6 + 1
            byte r7 = (byte) r7
            char r7 = (char) r7
            r5[r6] = r7
            return r0
        L48:
            int r0 = r7 / 1000
            int r2 = r0 * 1000
            int r2 = r7 - r2
            int[] r3 = com.alibaba.fastjson2.util.IOUtils.DIGITS_K
            r2 = r3[r2]
            r4 = 1000000(0xf4240, float:1.401298E-39)
            if (r7 >= r4) goto L96
            r7 = r3[r0]
            int r0 = r7 >> 24
            if (r0 != 0) goto L6e
            int r0 = r7 >> 16
            byte r0 = (byte) r0
            char r0 = (char) r0
            r5[r6] = r0
            int r0 = r6 + 1
            int r1 = r7 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r5[r0] = r1
            int r6 = r6 + 2
            goto L79
        L6e:
            if (r0 != r1) goto L79
            int r0 = r6 + 1
            int r1 = r7 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r5[r6] = r1
            r6 = r0
        L79:
            byte r7 = (byte) r7
            char r7 = (char) r7
            r5[r6] = r7
            int r7 = r6 + 1
            int r0 = r2 >> 16
            byte r0 = (byte) r0
            char r0 = (char) r0
            r5[r7] = r0
            int r7 = r6 + 2
            int r0 = r2 >> 8
            byte r0 = (byte) r0
            char r0 = (char) r0
            r5[r7] = r0
            int r7 = r6 + 3
            byte r0 = (byte) r2
            char r0 = (char) r0
            r5[r7] = r0
            int r6 = r6 + 4
            return r6
        L96:
            int r7 = r0 / 1000
            int r4 = r7 * 1000
            int r0 = r0 - r4
            int r4 = r7 / 1000
            r0 = r3[r0]
            if (r4 != 0) goto Lca
            r7 = r3[r7]
            int r3 = r7 >> 24
            if (r3 != 0) goto Lb8
            int r1 = r7 >> 16
            byte r1 = (byte) r1
            char r1 = (char) r1
            r5[r6] = r1
            int r1 = r6 + 1
            int r3 = r7 >> 8
            byte r3 = (byte) r3
            char r3 = (char) r3
            r5[r1] = r3
            int r6 = r6 + 2
            goto Lc3
        Lb8:
            if (r3 != r1) goto Lc3
            int r1 = r6 + 1
            int r3 = r7 >> 8
            byte r3 = (byte) r3
            char r3 = (char) r3
            r5[r6] = r3
            r6 = r1
        Lc3:
            int r1 = r6 + 1
            byte r7 = (byte) r7
            char r7 = (char) r7
            r5[r6] = r7
            goto Led
        Lca:
            int r1 = r4 * 1000
            int r7 = r7 - r1
            int r4 = r4 + 48
            byte r1 = (byte) r4
            char r1 = (char) r1
            r5[r6] = r1
            r7 = r3[r7]
            int r1 = r6 + 1
            int r3 = r7 >> 16
            byte r3 = (byte) r3
            char r3 = (char) r3
            r5[r1] = r3
            int r1 = r6 + 2
            int r3 = r7 >> 8
            byte r3 = (byte) r3
            char r3 = (char) r3
            r5[r1] = r3
            int r1 = r6 + 3
            byte r7 = (byte) r7
            char r7 = (char) r7
            r5[r1] = r7
            int r1 = r6 + 4
        Led:
            int r6 = r0 >> 16
            byte r6 = (byte) r6
            char r6 = (char) r6
            r5[r1] = r6
            int r6 = r1 + 1
            int r7 = r0 >> 8
            byte r7 = (byte) r7
            char r7 = (char) r7
            r5[r6] = r7
            int r6 = r1 + 2
            byte r7 = (byte) r0
            char r7 = (char) r7
            r5[r6] = r7
            int r6 = r1 + 3
            int r7 = r2 >> 16
            byte r7 = (byte) r7
            char r7 = (char) r7
            r5[r6] = r7
            int r6 = r1 + 4
            int r7 = r2 >> 8
            byte r7 = (byte) r7
            char r7 = (char) r7
            r5[r6] = r7
            int r6 = r1 + 5
            byte r7 = (byte) r2
            char r7 = (char) r7
            r5[r6] = r7
            int r1 = r1 + 6
            return r1
    }

    public static int writeInt64(byte[] r17, int r18, long r19) {
            r0 = r17
            r1 = r18
            r2 = r19
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto L24
            r4 = -9223372036854775808
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L1c
            byte[] r2 = com.alibaba.fastjson2.util.IOUtils.MIN_LONG
            r3 = 0
            int r4 = r2.length
            java.lang.System.arraycopy(r2, r3, r0, r1, r4)
            int r0 = r2.length
            int r0 = r0 + r1
            return r0
        L1c:
            long r2 = -r2
            int r4 = r1 + 1
            r5 = 45
            r0[r1] = r5
            r1 = r4
        L24:
            r4 = 1000(0x3e8, double:4.94E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r7 = 1
            if (r6 >= 0) goto L53
            int[] r4 = com.alibaba.fastjson2.util.IOUtils.DIGITS_K
            int r2 = (int) r2
            r2 = r4[r2]
            int r3 = r2 >> 24
            if (r3 != 0) goto L43
            int r3 = r2 >> 16
            byte r3 = (byte) r3
            r0[r1] = r3
            int r3 = r1 + 1
            int r4 = r2 >> 8
            byte r4 = (byte) r4
            r0[r3] = r4
            int r1 = r1 + 2
            goto L4d
        L43:
            if (r3 != r7) goto L4d
            int r3 = r1 + 1
            int r4 = r2 >> 8
            byte r4 = (byte) r4
            r0[r1] = r4
            r1 = r3
        L4d:
            int r3 = r1 + 1
            byte r2 = (byte) r2
            r0[r1] = r2
            return r3
        L53:
            long r8 = r2 / r4
            long r10 = r8 * r4
            long r10 = r2 - r10
            int r6 = (int) r10
            int[] r10 = com.alibaba.fastjson2.util.IOUtils.DIGITS_K
            r6 = r10[r6]
            r11 = 1000000(0xf4240, double:4.940656E-318)
            int r11 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r11 >= 0) goto L9e
            int r2 = (int) r8
            r2 = r10[r2]
            int r3 = r2 >> 24
            if (r3 != 0) goto L7b
            int r3 = r2 >> 16
            byte r3 = (byte) r3
            r0[r1] = r3
            int r3 = r1 + 1
            int r4 = r2 >> 8
            byte r4 = (byte) r4
            r0[r3] = r4
            int r1 = r1 + 2
            goto L85
        L7b:
            if (r3 != r7) goto L85
            int r3 = r1 + 1
            int r4 = r2 >> 8
            byte r4 = (byte) r4
            r0[r1] = r4
            r1 = r3
        L85:
            byte r2 = (byte) r2
            r0[r1] = r2
            int r2 = r1 + 1
            int r3 = r6 >> 16
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 2
            int r3 = r6 >> 8
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 3
            byte r3 = (byte) r6
            r0[r2] = r3
            int r1 = r1 + 4
            return r1
        L9e:
            long r11 = r8 / r4
            long r13 = r11 * r4
            long r8 = r8 - r13
            int r8 = (int) r8
            r8 = r10[r8]
            r13 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r9 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r9 >= 0) goto Lf9
            int r2 = (int) r11
            r2 = r10[r2]
            int r3 = r2 >> 24
            if (r3 != 0) goto Lc3
            int r3 = r2 >> 16
            byte r3 = (byte) r3
            r0[r1] = r3
            int r3 = r1 + 1
            int r4 = r2 >> 8
            byte r4 = (byte) r4
            r0[r3] = r4
            int r1 = r1 + 2
            goto Lcd
        Lc3:
            if (r3 != r7) goto Lcd
            int r3 = r1 + 1
            int r4 = r2 >> 8
            byte r4 = (byte) r4
            r0[r1] = r4
            r1 = r3
        Lcd:
            byte r2 = (byte) r2
            r0[r1] = r2
            int r2 = r1 + 1
            int r3 = r8 >> 16
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 2
            int r3 = r8 >> 8
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 3
            byte r3 = (byte) r8
            r0[r2] = r3
            int r2 = r1 + 4
            int r3 = r6 >> 16
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 5
            int r3 = r6 >> 8
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 6
            byte r3 = (byte) r6
            r0[r2] = r3
            int r1 = r1 + 7
            return r1
        Lf9:
            long r13 = r11 / r4
            long r15 = r13 * r4
            long r11 = r11 - r15
            int r9 = (int) r11
            r9 = r10[r9]
            r11 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r11 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r11 >= 0) goto L169
            int r2 = (int) r13
            r2 = r10[r2]
            int r3 = r2 >> 24
            if (r3 != 0) goto L120
            int r3 = r2 >> 16
            byte r3 = (byte) r3
            r0[r1] = r3
            int r3 = r1 + 1
            int r4 = r2 >> 8
            byte r4 = (byte) r4
            r0[r3] = r4
            int r1 = r1 + 2
            goto L12a
        L120:
            if (r3 != r7) goto L12a
            int r3 = r1 + 1
            int r4 = r2 >> 8
            byte r4 = (byte) r4
            r0[r1] = r4
            r1 = r3
        L12a:
            byte r2 = (byte) r2
            r0[r1] = r2
            int r2 = r1 + 1
            int r3 = r9 >> 16
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 2
            int r3 = r9 >> 8
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 3
            byte r3 = (byte) r9
            r0[r2] = r3
            int r2 = r1 + 4
            int r3 = r8 >> 16
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 5
            int r3 = r8 >> 8
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 6
            byte r3 = (byte) r8
            r0[r2] = r3
            int r2 = r1 + 7
            int r3 = r6 >> 16
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 8
            int r3 = r6 >> 8
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 9
            byte r3 = (byte) r6
            r0[r2] = r3
            int r1 = r1 + 10
            return r1
        L169:
            long r4 = r13 / r4
            int r4 = (int) r4
            int r5 = r4 * 1000
            long r11 = (long) r5
            long r13 = r13 - r11
            int r5 = (int) r13
            r5 = r10[r5]
            r11 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 >= 0) goto L1ed
            r2 = r10[r4]
            int r3 = r2 >> 24
            if (r3 != 0) goto L191
            int r3 = r2 >> 16
            byte r3 = (byte) r3
            r0[r1] = r3
            int r3 = r1 + 1
            int r4 = r2 >> 8
            byte r4 = (byte) r4
            r0[r3] = r4
            int r1 = r1 + 2
            goto L19b
        L191:
            if (r3 != r7) goto L19b
            int r3 = r1 + 1
            int r4 = r2 >> 8
            byte r4 = (byte) r4
            r0[r1] = r4
            r1 = r3
        L19b:
            byte r2 = (byte) r2
            r0[r1] = r2
            int r2 = r1 + 1
            int r3 = r5 >> 16
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 2
            int r3 = r5 >> 8
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 3
            byte r3 = (byte) r5
            r0[r2] = r3
            int r2 = r1 + 4
            int r3 = r9 >> 16
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 5
            int r3 = r9 >> 8
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 6
            byte r3 = (byte) r9
            r0[r2] = r3
            int r2 = r1 + 7
            int r3 = r8 >> 16
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 8
            int r3 = r8 >> 8
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 9
            byte r3 = (byte) r8
            r0[r2] = r3
            int r2 = r1 + 10
            int r3 = r6 >> 16
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 11
            int r3 = r6 >> 8
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r1 + 12
            byte r3 = (byte) r6
            r0[r2] = r3
            int r1 = r1 + 13
            return r1
        L1ed:
            int r2 = r4 / 1000
            int r3 = r2 * 1000
            int r4 = r4 - r3
            int r3 = r2 / 1000
            r4 = r10[r4]
            if (r3 != 0) goto L21d
            r2 = r10[r2]
            int r3 = r2 >> 24
            if (r3 != 0) goto L20d
            int r3 = r2 >> 16
            byte r3 = (byte) r3
            r0[r1] = r3
            int r3 = r1 + 1
            int r7 = r2 >> 8
            byte r7 = (byte) r7
            r0[r3] = r7
            int r1 = r1 + 2
            goto L217
        L20d:
            if (r3 != r7) goto L217
            int r3 = r1 + 1
            int r7 = r2 >> 8
            byte r7 = (byte) r7
            r0[r1] = r7
            r1 = r3
        L217:
            int r3 = r1 + 1
            byte r2 = (byte) r2
            r0[r1] = r2
            goto L23c
        L21d:
            int r7 = r3 * 1000
            int r2 = r2 - r7
            int r3 = r3 + 48
            byte r3 = (byte) r3
            r0[r1] = r3
            r2 = r10[r2]
            int r3 = r1 + 1
            int r7 = r2 >> 16
            byte r7 = (byte) r7
            r0[r3] = r7
            int r3 = r1 + 2
            int r7 = r2 >> 8
            byte r7 = (byte) r7
            r0[r3] = r7
            int r3 = r1 + 3
            byte r2 = (byte) r2
            r0[r3] = r2
            int r3 = r1 + 4
        L23c:
            int r1 = r4 >> 16
            byte r1 = (byte) r1
            r0[r3] = r1
            int r1 = r3 + 1
            int r2 = r4 >> 8
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r3 + 2
            byte r2 = (byte) r4
            r0[r1] = r2
            int r1 = r3 + 3
            int r2 = r5 >> 16
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r3 + 4
            int r2 = r5 >> 8
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r3 + 5
            byte r2 = (byte) r5
            r0[r1] = r2
            int r1 = r3 + 6
            int r2 = r9 >> 16
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r3 + 7
            int r2 = r9 >> 8
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r3 + 8
            byte r2 = (byte) r9
            r0[r1] = r2
            int r1 = r3 + 9
            int r2 = r8 >> 16
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r3 + 10
            int r2 = r8 >> 8
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r3 + 11
            byte r2 = (byte) r8
            r0[r1] = r2
            int r1 = r3 + 12
            int r2 = r6 >> 16
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r3 + 13
            int r2 = r6 >> 8
            byte r2 = (byte) r2
            r0[r1] = r2
            int r1 = r3 + 14
            byte r2 = (byte) r6
            r0[r1] = r2
            int r3 = r3 + 15
            return r3
    }

    public static int writeInt64(char[] r16, int r17, long r18) {
            r0 = r18
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L2a
            r2 = -9223372036854775808
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L22
            r0 = 0
        Lf:
            byte[] r1 = com.alibaba.fastjson2.util.IOUtils.MIN_LONG
            int r2 = r1.length
            if (r0 >= r2) goto L1e
            int r2 = r17 + r0
            r1 = r1[r0]
            char r1 = (char) r1
            r16[r2] = r1
            int r0 = r0 + 1
            goto Lf
        L1e:
            int r0 = r1.length
            int r0 = r17 + r0
            return r0
        L22:
            long r0 = -r0
            int r2 = r17 + 1
            r3 = 45
            r16[r17] = r3
            goto L2c
        L2a:
            r2 = r17
        L2c:
            r3 = 1000(0x3e8, double:4.94E-321)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r6 = 1
            if (r5 >= 0) goto L5f
            int[] r3 = com.alibaba.fastjson2.util.IOUtils.DIGITS_K
            int r0 = (int) r0
            r0 = r3[r0]
            int r1 = r0 >> 24
            if (r1 != 0) goto L4d
            int r1 = r0 >> 16
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r2] = r1
            int r1 = r2 + 1
            int r3 = r0 >> 8
            byte r3 = (byte) r3
            char r3 = (char) r3
            r16[r1] = r3
            int r2 = r2 + 2
            goto L58
        L4d:
            if (r1 != r6) goto L58
            int r1 = r2 + 1
            int r3 = r0 >> 8
            byte r3 = (byte) r3
            char r3 = (char) r3
            r16[r2] = r3
            r2 = r1
        L58:
            int r1 = r2 + 1
            byte r0 = (byte) r0
            char r0 = (char) r0
            r16[r2] = r0
            return r1
        L5f:
            long r7 = r0 / r3
            long r9 = r7 * r3
            long r9 = r0 - r9
            int r5 = (int) r9
            int[] r9 = com.alibaba.fastjson2.util.IOUtils.DIGITS_K
            r5 = r9[r5]
            r10 = 1000000(0xf4240, double:4.940656E-318)
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 >= 0) goto Lb1
            int r0 = (int) r7
            r0 = r9[r0]
            int r1 = r0 >> 24
            if (r1 != 0) goto L89
            int r1 = r0 >> 16
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r2] = r1
            int r1 = r2 + 1
            int r3 = r0 >> 8
            byte r3 = (byte) r3
            char r3 = (char) r3
            r16[r1] = r3
            int r2 = r2 + 2
            goto L94
        L89:
            if (r1 != r6) goto L94
            int r1 = r2 + 1
            int r3 = r0 >> 8
            byte r3 = (byte) r3
            char r3 = (char) r3
            r16[r2] = r3
            r2 = r1
        L94:
            byte r0 = (byte) r0
            char r0 = (char) r0
            r16[r2] = r0
            int r0 = r2 + 1
            int r1 = r5 >> 16
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 2
            int r1 = r5 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 3
            byte r1 = (byte) r5
            char r1 = (char) r1
            r16[r0] = r1
            int r2 = r2 + 4
            return r2
        Lb1:
            long r10 = r7 / r3
            long r12 = r10 * r3
            long r7 = r7 - r12
            int r7 = (int) r7
            r7 = r9[r7]
            r12 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r8 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r8 >= 0) goto L116
            int r0 = (int) r10
            r0 = r9[r0]
            int r1 = r0 >> 24
            if (r1 != 0) goto Ld8
            int r1 = r0 >> 16
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r2] = r1
            int r1 = r2 + 1
            int r3 = r0 >> 8
            byte r3 = (byte) r3
            char r3 = (char) r3
            r16[r1] = r3
            int r2 = r2 + 2
            goto Le3
        Ld8:
            if (r1 != r6) goto Le3
            int r1 = r2 + 1
            int r3 = r0 >> 8
            byte r3 = (byte) r3
            char r3 = (char) r3
            r16[r2] = r3
            r2 = r1
        Le3:
            byte r0 = (byte) r0
            char r0 = (char) r0
            r16[r2] = r0
            int r0 = r2 + 1
            int r1 = r7 >> 16
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 2
            int r1 = r7 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 3
            byte r1 = (byte) r7
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 4
            int r1 = r5 >> 16
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 5
            int r1 = r5 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 6
            byte r1 = (byte) r5
            char r1 = (char) r1
            r16[r0] = r1
            int r2 = r2 + 7
            return r2
        L116:
            long r12 = r10 / r3
            long r14 = r12 * r3
            long r10 = r10 - r14
            int r8 = (int) r10
            r8 = r9[r8]
            r10 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 >= 0) goto L193
            int r0 = (int) r12
            r0 = r9[r0]
            int r1 = r0 >> 24
            if (r1 != 0) goto L13f
            int r1 = r0 >> 16
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r2] = r1
            int r1 = r2 + 1
            int r3 = r0 >> 8
            byte r3 = (byte) r3
            char r3 = (char) r3
            r16[r1] = r3
            int r2 = r2 + 2
            goto L14a
        L13f:
            if (r1 != r6) goto L14a
            int r1 = r2 + 1
            int r3 = r0 >> 8
            byte r3 = (byte) r3
            char r3 = (char) r3
            r16[r2] = r3
            r2 = r1
        L14a:
            byte r0 = (byte) r0
            char r0 = (char) r0
            r16[r2] = r0
            int r0 = r2 + 1
            int r1 = r8 >> 16
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 2
            int r1 = r8 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 3
            byte r1 = (byte) r8
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 4
            int r1 = r7 >> 16
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 5
            int r1 = r7 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 6
            byte r1 = (byte) r7
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 7
            int r1 = r5 >> 16
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 8
            int r1 = r5 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 9
            byte r1 = (byte) r5
            char r1 = (char) r1
            r16[r0] = r1
            int r2 = r2 + 10
            return r2
        L193:
            long r3 = r12 / r3
            int r3 = (int) r3
            int r4 = r3 * 1000
            long r10 = (long) r4
            long r12 = r12 - r10
            int r4 = (int) r12
            r4 = r9[r4]
            r10 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 >= 0) goto L227
            r0 = r9[r3]
            int r1 = r0 >> 24
            if (r1 != 0) goto L1bd
            int r1 = r0 >> 16
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r2] = r1
            int r1 = r2 + 1
            int r3 = r0 >> 8
            byte r3 = (byte) r3
            char r3 = (char) r3
            r16[r1] = r3
            int r2 = r2 + 2
            goto L1c8
        L1bd:
            if (r1 != r6) goto L1c8
            int r1 = r2 + 1
            int r3 = r0 >> 8
            byte r3 = (byte) r3
            char r3 = (char) r3
            r16[r2] = r3
            r2 = r1
        L1c8:
            byte r0 = (byte) r0
            char r0 = (char) r0
            r16[r2] = r0
            int r0 = r2 + 1
            int r1 = r4 >> 16
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 2
            int r1 = r4 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 3
            byte r1 = (byte) r4
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 4
            int r1 = r8 >> 16
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 5
            int r1 = r8 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 6
            byte r1 = (byte) r8
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 7
            int r1 = r7 >> 16
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 8
            int r1 = r7 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 9
            byte r1 = (byte) r7
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 10
            int r1 = r5 >> 16
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 11
            int r1 = r5 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r2 + 12
            byte r1 = (byte) r5
            char r1 = (char) r1
            r16[r0] = r1
            int r2 = r2 + 13
            return r2
        L227:
            int r0 = r3 / 1000
            int r1 = r0 * 1000
            int r3 = r3 - r1
            int r1 = r0 / 1000
            r3 = r9[r3]
            if (r1 != 0) goto L25b
            r0 = r9[r0]
            int r1 = r0 >> 24
            if (r1 != 0) goto L249
            int r1 = r0 >> 16
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r2] = r1
            int r1 = r2 + 1
            int r6 = r0 >> 8
            byte r6 = (byte) r6
            char r6 = (char) r6
            r16[r1] = r6
            int r2 = r2 + 2
            goto L254
        L249:
            if (r1 != r6) goto L254
            int r1 = r2 + 1
            int r6 = r0 >> 8
            byte r6 = (byte) r6
            char r6 = (char) r6
            r16[r2] = r6
            r2 = r1
        L254:
            int r1 = r2 + 1
            byte r0 = (byte) r0
            char r0 = (char) r0
            r16[r2] = r0
            goto L27e
        L25b:
            int r6 = r1 * 1000
            int r0 = r0 - r6
            int r1 = r1 + 48
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r2] = r1
            r0 = r9[r0]
            int r1 = r2 + 1
            int r6 = r0 >> 16
            byte r6 = (byte) r6
            char r6 = (char) r6
            r16[r1] = r6
            int r1 = r2 + 2
            int r6 = r0 >> 8
            byte r6 = (byte) r6
            char r6 = (char) r6
            r16[r1] = r6
            int r1 = r2 + 3
            byte r0 = (byte) r0
            char r0 = (char) r0
            r16[r1] = r0
            int r1 = r2 + 4
        L27e:
            int r0 = r3 >> 16
            byte r0 = (byte) r0
            char r0 = (char) r0
            r16[r1] = r0
            int r0 = r1 + 1
            int r2 = r3 >> 8
            byte r2 = (byte) r2
            char r2 = (char) r2
            r16[r0] = r2
            int r0 = r1 + 2
            byte r2 = (byte) r3
            char r2 = (char) r2
            r16[r0] = r2
            int r0 = r1 + 3
            int r2 = r4 >> 16
            byte r2 = (byte) r2
            char r2 = (char) r2
            r16[r0] = r2
            int r0 = r1 + 4
            int r2 = r4 >> 8
            byte r2 = (byte) r2
            char r2 = (char) r2
            r16[r0] = r2
            int r0 = r1 + 5
            byte r2 = (byte) r4
            char r2 = (char) r2
            r16[r0] = r2
            int r0 = r1 + 6
            int r2 = r8 >> 16
            byte r2 = (byte) r2
            char r2 = (char) r2
            r16[r0] = r2
            int r0 = r1 + 7
            int r2 = r8 >> 8
            byte r2 = (byte) r2
            char r2 = (char) r2
            r16[r0] = r2
            int r0 = r1 + 8
            byte r2 = (byte) r8
            char r2 = (char) r2
            r16[r0] = r2
            int r0 = r1 + 9
            int r2 = r7 >> 16
            byte r2 = (byte) r2
            char r2 = (char) r2
            r16[r0] = r2
            int r0 = r1 + 10
            int r2 = r7 >> 8
            byte r2 = (byte) r2
            char r2 = (char) r2
            r16[r0] = r2
            int r0 = r1 + 11
            byte r2 = (byte) r7
            char r2 = (char) r2
            r16[r0] = r2
            int r0 = r1 + 12
            int r2 = r5 >> 16
            byte r2 = (byte) r2
            char r2 = (char) r2
            r16[r0] = r2
            int r0 = r1 + 13
            int r2 = r5 >> 8
            byte r2 = (byte) r2
            char r2 = (char) r2
            r16[r0] = r2
            int r0 = r1 + 14
            byte r2 = (byte) r5
            char r2 = (char) r2
            r16[r0] = r2
            int r1 = r1 + 15
            return r1
    }

    public static int writeLocalDate(byte[] r10, int r11, int r12, int r13, int r14) {
            r0 = 45
            if (r12 >= 0) goto Lb
            int r1 = r11 + 1
            r10[r11] = r0
            int r12 = -r12
        L9:
            r11 = r1
            goto L16
        Lb:
            r1 = 9999(0x270f, float:1.4012E-41)
            if (r12 <= r1) goto L16
            int r1 = r11 + 1
            r2 = 43
            r10[r11] = r2
            goto L9
        L16:
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r12 >= r1) goto L39
            int r1 = r12 / 100
            int r2 = r1 * 100
            int r12 = r12 - r2
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r11
            long r7 = r3 + r5
            short[] r9 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS
            short r1 = r9[r1]
            r2.putShort(r10, r7, r1)
            long r3 = r3 + r5
            r5 = 2
            long r3 = r3 + r5
            short r12 = r9[r12]
            r2.putShort(r10, r3, r12)
            int r11 = r11 + 4
            goto L3d
        L39:
            int r11 = writeInt32(r10, r11, r12)
        L3d:
            r10[r11] = r0
            sun.misc.Unsafe r12 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r3 = (long) r11
            long r5 = r1 + r3
            r7 = 1
            long r5 = r5 + r7
            short[] r7 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS
            short r13 = r7[r13]
            r12.putShort(r10, r5, r13)
            int r13 = r11 + 3
            r10[r13] = r0
            long r1 = r1 + r3
            r3 = 4
            long r1 = r1 + r3
            short r13 = r7[r14]
            r12.putShort(r10, r1, r13)
            int r11 = r11 + 6
            return r11
    }

    public static int writeLocalDate(char[] r8, int r9, int r10, int r11, int r12) {
            r0 = 45
            if (r10 >= 0) goto Lb
            int r1 = r9 + 1
            r8[r9] = r0
            int r10 = -r10
        L9:
            r9 = r1
            goto L16
        Lb:
            r1 = 9999(0x270f, float:1.4012E-41)
            if (r10 <= r1) goto L16
            int r1 = r9 + 1
            r2 = 43
            r8[r9] = r2
            goto L9
        L16:
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r10 >= r1) goto L3c
            int r1 = r10 / 100
            int r2 = r1 * 100
            int r10 = r10 - r2
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_CHAR_BASE_OFFSET
            int r5 = r9 << 1
            long r5 = (long) r5
            long r5 = r5 + r3
            int[] r7 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS_UTF16
            r1 = r7[r1]
            r2.putInt(r8, r5, r1)
            int r1 = r9 + 2
            int r1 = r1 << 1
            long r5 = (long) r1
            long r3 = r3 + r5
            r10 = r7[r10]
            r2.putInt(r8, r3, r10)
            int r9 = r9 + 4
            goto L40
        L3c:
            int r9 = writeInt32(r8, r9, r10)
        L40:
            r8[r9] = r0
            sun.misc.Unsafe r10 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_CHAR_BASE_OFFSET
            int r3 = r9 + 1
            int r3 = r3 << 1
            long r3 = (long) r3
            long r3 = r3 + r1
            int[] r5 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS_UTF16
            r11 = r5[r11]
            r10.putInt(r8, r3, r11)
            int r11 = r9 + 3
            r8[r11] = r0
            int r11 = r9 + 4
            int r11 = r11 << 1
            long r3 = (long) r11
            long r1 = r1 + r3
            r11 = r5[r12]
            r10.putInt(r8, r1, r11)
            int r9 = r9 + 6
            return r9
    }

    public static int writeLocalTime(byte[] r6, int r7, java.time.LocalTime r8) {
            int[] r0 = com.alibaba.fastjson2.util.IOUtils.DIGITS_K
            int r1 = r8.getHour()
            r1 = r0[r1]
            int r2 = r1 >> 8
            byte r2 = (byte) r2
            r6[r7] = r2
            int r2 = r7 + 1
            byte r1 = (byte) r1
            r6[r2] = r1
            int r1 = r7 + 2
            r2 = 58
            r6[r1] = r2
            int r1 = r8.getMinute()
            r1 = r0[r1]
            int r3 = r7 + 3
            int r4 = r1 >> 8
            byte r4 = (byte) r4
            r6[r3] = r4
            int r3 = r7 + 4
            byte r1 = (byte) r1
            r6[r3] = r1
            int r1 = r7 + 5
            r6[r1] = r2
            int r1 = r8.getSecond()
            r1 = r0[r1]
            int r2 = r7 + 6
            int r3 = r1 >> 8
            byte r3 = (byte) r3
            r6[r2] = r3
            int r2 = r7 + 7
            byte r1 = (byte) r1
            r6[r2] = r1
            int r1 = r7 + 8
            int r8 = r8.getNano()
            if (r8 == 0) goto La6
            int r2 = r8 / 1000
            int r3 = r2 / 1000
            int r4 = r2 * 1000
            int r8 = r8 - r4
            r4 = 46
            r6[r1] = r4
            r1 = r0[r3]
            int r4 = r7 + 9
            int r5 = r1 >> 16
            byte r5 = (byte) r5
            r6[r4] = r5
            int r4 = r7 + 10
            int r5 = r1 >> 8
            byte r5 = (byte) r5
            r6[r4] = r5
            int r4 = r7 + 11
            byte r1 = (byte) r1
            r6[r4] = r1
            int r1 = r7 + 12
            if (r8 != 0) goto L75
            int r3 = r3 * 1000
            int r2 = r2 - r3
            if (r2 != 0) goto L72
            return r1
        L72:
            r2 = r0[r2]
            goto L7a
        L75:
            int r3 = r3 * 1000
            int r2 = r2 - r3
            r2 = r0[r2]
        L7a:
            int r3 = r2 >> 16
            byte r3 = (byte) r3
            r6[r1] = r3
            int r1 = r7 + 13
            int r3 = r2 >> 8
            byte r3 = (byte) r3
            r6[r1] = r3
            int r1 = r7 + 14
            byte r2 = (byte) r2
            r6[r1] = r2
            int r1 = r7 + 15
            if (r8 != 0) goto L90
            return r1
        L90:
            r8 = r0[r8]
            int r0 = r8 >> 16
            byte r0 = (byte) r0
            r6[r1] = r0
            int r0 = r7 + 16
            int r1 = r8 >> 8
            byte r1 = (byte) r1
            r6[r0] = r1
            int r0 = r7 + 17
            byte r8 = (byte) r8
            r6[r0] = r8
            int r7 = r7 + 18
            return r7
        La6:
            return r1
    }

    public static int writeLocalTime(char[] r6, int r7, java.time.LocalTime r8) {
            int[] r0 = com.alibaba.fastjson2.util.IOUtils.DIGITS_K
            int r1 = r8.getHour()
            r1 = r0[r1]
            int r2 = r1 >> 8
            byte r2 = (byte) r2
            char r2 = (char) r2
            r6[r7] = r2
            int r2 = r7 + 1
            byte r1 = (byte) r1
            char r1 = (char) r1
            r6[r2] = r1
            int r1 = r7 + 2
            r2 = 58
            r6[r1] = r2
            int r1 = r8.getMinute()
            r1 = r0[r1]
            int r3 = r7 + 3
            int r4 = r1 >> 8
            byte r4 = (byte) r4
            char r4 = (char) r4
            r6[r3] = r4
            int r3 = r7 + 4
            byte r1 = (byte) r1
            char r1 = (char) r1
            r6[r3] = r1
            int r1 = r7 + 5
            r6[r1] = r2
            int r1 = r8.getSecond()
            r1 = r0[r1]
            int r2 = r7 + 6
            int r3 = r1 >> 8
            byte r3 = (byte) r3
            char r3 = (char) r3
            r6[r2] = r3
            int r2 = r7 + 7
            byte r1 = (byte) r1
            char r1 = (char) r1
            r6[r2] = r1
            int r1 = r7 + 8
            int r8 = r8.getNano()
            if (r8 == 0) goto Lb5
            int r2 = r8 / 1000
            int r3 = r2 / 1000
            int r4 = r2 * 1000
            int r8 = r8 - r4
            r4 = 46
            r6[r1] = r4
            r1 = r0[r3]
            int r4 = r7 + 9
            int r5 = r1 >> 16
            byte r5 = (byte) r5
            char r5 = (char) r5
            r6[r4] = r5
            int r4 = r7 + 10
            int r5 = r1 >> 8
            byte r5 = (byte) r5
            char r5 = (char) r5
            r6[r4] = r5
            int r4 = r7 + 11
            byte r1 = (byte) r1
            char r1 = (char) r1
            r6[r4] = r1
            int r1 = r7 + 12
            if (r8 != 0) goto L7e
            int r3 = r3 * 1000
            int r2 = r2 - r3
            if (r2 != 0) goto L7b
            return r1
        L7b:
            r2 = r0[r2]
            goto L83
        L7e:
            int r3 = r3 * 1000
            int r2 = r2 - r3
            r2 = r0[r2]
        L83:
            int r3 = r2 >> 16
            byte r3 = (byte) r3
            char r3 = (char) r3
            r6[r1] = r3
            int r1 = r7 + 13
            int r3 = r2 >> 8
            byte r3 = (byte) r3
            char r3 = (char) r3
            r6[r1] = r3
            int r1 = r7 + 14
            byte r2 = (byte) r2
            char r2 = (char) r2
            r6[r1] = r2
            int r1 = r7 + 15
            if (r8 != 0) goto L9c
            return r1
        L9c:
            r8 = r0[r8]
            int r0 = r8 >> 16
            byte r0 = (byte) r0
            char r0 = (char) r0
            r6[r1] = r0
            int r0 = r7 + 16
            int r1 = r8 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r6[r0] = r1
            int r0 = r7 + 17
            byte r8 = (byte) r8
            char r8 = (char) r8
            r6[r0] = r8
            int r7 = r7 + 18
            return r7
        Lb5:
            return r1
    }

    public static void writeLocalTime(byte[] r12, int r13, int r14, int r15, int r16) {
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r3 = (long) r13
            long r5 = r1 + r3
            short[] r7 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS
            short r14 = r7[r14]
            r0.putShort(r12, r5, r14)
            int r14 = r13 + 2
            r5 = 58
            r12[r14] = r5
            long r8 = r1 + r3
            r10 = 3
            long r8 = r8 + r10
            short r14 = r7[r15]
            r0.putShort(r12, r8, r14)
            int r13 = r13 + 5
            r12[r13] = r5
            long r1 = r1 + r3
            r13 = 6
            long r1 = r1 + r13
            short r13 = r7[r16]
            r0.putShort(r12, r1, r13)
            return
    }

    public static void writeLocalTime(char[] r8, int r9, int r10, int r11, int r12) {
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_CHAR_BASE_OFFSET
            int r3 = r9 << 1
            long r3 = (long) r3
            long r3 = r3 + r1
            int[] r5 = com.alibaba.fastjson2.util.IOUtils.PACKED_DIGITS_UTF16
            r10 = r5[r10]
            r0.putInt(r8, r3, r10)
            int r10 = r9 + 2
            r3 = 58
            r8[r10] = r3
            int r10 = r9 + 3
            int r10 = r10 << 1
            long r6 = (long) r10
            long r6 = r6 + r1
            r10 = r5[r11]
            r0.putInt(r8, r6, r10)
            int r10 = r9 + 5
            r8[r10] = r3
            int r9 = r9 + 6
            int r9 = r9 << 1
            long r9 = (long) r9
            long r1 = r1 + r9
            r9 = r5[r12]
            r0.putInt(r8, r1, r9)
            return
    }
}
