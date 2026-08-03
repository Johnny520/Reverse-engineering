package s4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j8.x[] f12363a = null;

    static {
            j8.x r0 = new j8.x
            r1 = -1
            java.lang.String r2 = "<special>"
            r0.<init>(r1, r2)
            j8.x r1 = new j8.x
            r2 = 256(0x100, float:3.59E-43)
            java.lang.String r3 = "packed-switch-payload"
            r1.<init>(r2, r3)
            j8.x r2 = new j8.x
            r3 = 512(0x200, float:7.17E-43)
            java.lang.String r4 = "sparse-switch-payload"
            r2.<init>(r3, r4)
            j8.x r3 = new j8.x
            r4 = 768(0x300, float:1.076E-42)
            java.lang.String r5 = "fill-array-data-payload"
            r3.<init>(r4, r5)
            j8.x r4 = new j8.x
            r5 = 0
            java.lang.String r6 = "nop"
            r4.<init>(r5, r6)
            j8.x r5 = new j8.x
            r6 = 1
            java.lang.String r7 = "move"
            r5.<init>(r6, r7)
            j8.x r6 = new j8.x
            r7 = 2
            java.lang.String r8 = "move/from16"
            r6.<init>(r7, r8)
            j8.x r7 = new j8.x
            r8 = 3
            java.lang.String r9 = "move/16"
            r7.<init>(r8, r9)
            j8.x r8 = new j8.x
            r9 = 4
            java.lang.String r10 = "move-wide"
            r8.<init>(r9, r10)
            j8.x r9 = new j8.x
            r10 = 5
            java.lang.String r11 = "move-wide/from16"
            r9.<init>(r10, r11)
            j8.x r10 = new j8.x
            r11 = 6
            java.lang.String r12 = "move-wide/16"
            r10.<init>(r11, r12)
            j8.x r11 = new j8.x
            r12 = 7
            java.lang.String r13 = "move-object"
            r11.<init>(r12, r13)
            j8.x r12 = new j8.x
            r13 = 8
            java.lang.String r14 = "move-object/from16"
            r12.<init>(r13, r14)
            j8.x r13 = new j8.x
            r14 = 9
            java.lang.String r15 = "move-object/16"
            r13.<init>(r14, r15)
            j8.x r14 = new j8.x
            r15 = 10
            r16 = r10
            java.lang.String r10 = "move-result"
            r14.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 11
            r17 = r11
            java.lang.String r11 = "move-result-wide"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 12
            r18 = r10
            java.lang.String r10 = "move-result-object"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 13
            r19 = r11
            java.lang.String r11 = "move-exception"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 14
            r20 = r10
            java.lang.String r10 = "return-void"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 15
            r21 = r11
            java.lang.String r11 = "return"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 16
            r22 = r10
            java.lang.String r10 = "return-wide"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 17
            r23 = r11
            java.lang.String r11 = "return-object"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 18
            r24 = r10
            java.lang.String r10 = "const/4"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 19
            r25 = r11
            java.lang.String r11 = "const/16"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 20
            r26 = r10
            java.lang.String r10 = "const"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 21
            r27 = r11
            java.lang.String r11 = "const/high16"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 22
            r28 = r10
            java.lang.String r10 = "const-wide/16"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 23
            r29 = r11
            java.lang.String r11 = "const-wide/32"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 24
            r30 = r10
            java.lang.String r10 = "const-wide"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 25
            r31 = r11
            java.lang.String r11 = "const-wide/high16"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 26
            r32 = r10
            java.lang.String r10 = "const-string"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 27
            r33 = r11
            java.lang.String r11 = "const-string/jumbo"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 28
            r34 = r10
            java.lang.String r10 = "const-class"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 29
            r35 = r11
            java.lang.String r11 = "monitor-enter"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 30
            r36 = r10
            java.lang.String r10 = "monitor-exit"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 31
            r37 = r11
            java.lang.String r11 = "check-cast"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 32
            r38 = r10
            java.lang.String r10 = "instance-of"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 33
            r39 = r11
            java.lang.String r11 = "array-length"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 34
            r40 = r10
            java.lang.String r10 = "new-instance"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 35
            r41 = r11
            java.lang.String r11 = "new-array"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 36
            r42 = r10
            java.lang.String r10 = "filled-new-array"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 37
            r43 = r11
            java.lang.String r11 = "filled-new-array/range"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 38
            r44 = r10
            java.lang.String r10 = "fill-array-data"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 39
            r45 = r11
            java.lang.String r11 = "throw"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 40
            r46 = r10
            java.lang.String r10 = "goto"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 41
            r47 = r11
            java.lang.String r11 = "goto/16"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 42
            r48 = r10
            java.lang.String r10 = "goto/32"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 43
            r49 = r11
            java.lang.String r11 = "packed-switch"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 44
            r50 = r10
            java.lang.String r10 = "sparse-switch"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 45
            r51 = r11
            java.lang.String r11 = "cmpl-float"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 46
            r52 = r10
            java.lang.String r10 = "cmpg-float"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 47
            r53 = r11
            java.lang.String r11 = "cmpl-double"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 48
            r54 = r10
            java.lang.String r10 = "cmpg-double"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 49
            r55 = r11
            java.lang.String r11 = "cmp-long"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 50
            r56 = r10
            java.lang.String r10 = "if-eq"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 51
            r57 = r11
            java.lang.String r11 = "if-ne"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 52
            r58 = r10
            java.lang.String r10 = "if-lt"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 53
            r59 = r11
            java.lang.String r11 = "if-ge"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 54
            r60 = r10
            java.lang.String r10 = "if-gt"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 55
            r61 = r11
            java.lang.String r11 = "if-le"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 56
            r62 = r10
            java.lang.String r10 = "if-eqz"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 57
            r63 = r11
            java.lang.String r11 = "if-nez"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 58
            r64 = r10
            java.lang.String r10 = "if-ltz"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 59
            r65 = r11
            java.lang.String r11 = "if-gez"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 60
            r66 = r10
            java.lang.String r10 = "if-gtz"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 61
            r67 = r11
            java.lang.String r11 = "if-lez"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 68
            r68 = r10
            java.lang.String r10 = "aget"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 69
            r69 = r11
            java.lang.String r11 = "aget-wide"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 70
            r70 = r10
            java.lang.String r10 = "aget-object"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 71
            r71 = r11
            java.lang.String r11 = "aget-boolean"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 72
            r72 = r10
            java.lang.String r10 = "aget-byte"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 73
            r73 = r11
            java.lang.String r11 = "aget-char"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 74
            r74 = r10
            java.lang.String r10 = "aget-short"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 75
            r75 = r11
            java.lang.String r11 = "aput"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 76
            r76 = r10
            java.lang.String r10 = "aput-wide"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 77
            r77 = r11
            java.lang.String r11 = "aput-object"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 78
            r78 = r10
            java.lang.String r10 = "aput-boolean"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 79
            r79 = r11
            java.lang.String r11 = "aput-byte"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 80
            r80 = r10
            java.lang.String r10 = "aput-char"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 81
            r81 = r11
            java.lang.String r11 = "aput-short"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 82
            r82 = r10
            java.lang.String r10 = "iget"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 83
            r83 = r11
            java.lang.String r11 = "iget-wide"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 84
            r84 = r10
            java.lang.String r10 = "iget-object"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 85
            r85 = r11
            java.lang.String r11 = "iget-boolean"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 86
            r86 = r10
            java.lang.String r10 = "iget-byte"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 87
            r87 = r11
            java.lang.String r11 = "iget-char"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 88
            r88 = r10
            java.lang.String r10 = "iget-short"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 89
            r89 = r11
            java.lang.String r11 = "iput"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 90
            r90 = r10
            java.lang.String r10 = "iput-wide"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 91
            r91 = r11
            java.lang.String r11 = "iput-object"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 92
            r92 = r10
            java.lang.String r10 = "iput-boolean"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 93
            r93 = r11
            java.lang.String r11 = "iput-byte"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 94
            r94 = r10
            java.lang.String r10 = "iput-char"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 95
            r95 = r11
            java.lang.String r11 = "iput-short"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 96
            r96 = r10
            java.lang.String r10 = "sget"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 97
            r97 = r11
            java.lang.String r11 = "sget-wide"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 98
            r98 = r10
            java.lang.String r10 = "sget-object"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 99
            r99 = r11
            java.lang.String r11 = "sget-boolean"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 100
            r100 = r10
            java.lang.String r10 = "sget-byte"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 101(0x65, float:1.42E-43)
            r101 = r11
            java.lang.String r11 = "sget-char"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 102(0x66, float:1.43E-43)
            r102 = r10
            java.lang.String r10 = "sget-short"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 103(0x67, float:1.44E-43)
            r103 = r11
            java.lang.String r11 = "sput"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 104(0x68, float:1.46E-43)
            r104 = r10
            java.lang.String r10 = "sput-wide"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 105(0x69, float:1.47E-43)
            r105 = r11
            java.lang.String r11 = "sput-object"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 106(0x6a, float:1.49E-43)
            r106 = r10
            java.lang.String r10 = "sput-boolean"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 107(0x6b, float:1.5E-43)
            r107 = r11
            java.lang.String r11 = "sput-byte"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 108(0x6c, float:1.51E-43)
            r108 = r10
            java.lang.String r10 = "sput-char"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 109(0x6d, float:1.53E-43)
            r109 = r11
            java.lang.String r11 = "sput-short"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 110(0x6e, float:1.54E-43)
            r110 = r10
            java.lang.String r10 = "invoke-virtual"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 111(0x6f, float:1.56E-43)
            r111 = r11
            java.lang.String r11 = "invoke-super"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 112(0x70, float:1.57E-43)
            r112 = r10
            java.lang.String r10 = "invoke-direct"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 113(0x71, float:1.58E-43)
            r113 = r11
            java.lang.String r11 = "invoke-static"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 114(0x72, float:1.6E-43)
            r114 = r10
            java.lang.String r10 = "invoke-interface"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 116(0x74, float:1.63E-43)
            r115 = r11
            java.lang.String r11 = "invoke-virtual/range"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 117(0x75, float:1.64E-43)
            r116 = r10
            java.lang.String r10 = "invoke-super/range"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 118(0x76, float:1.65E-43)
            r117 = r11
            java.lang.String r11 = "invoke-direct/range"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 119(0x77, float:1.67E-43)
            r118 = r10
            java.lang.String r10 = "invoke-static/range"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 120(0x78, float:1.68E-43)
            r119 = r11
            java.lang.String r11 = "invoke-interface/range"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 123(0x7b, float:1.72E-43)
            r120 = r10
            java.lang.String r10 = "neg-int"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 124(0x7c, float:1.74E-43)
            r121 = r11
            java.lang.String r11 = "not-int"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 125(0x7d, float:1.75E-43)
            r122 = r10
            java.lang.String r10 = "neg-long"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 126(0x7e, float:1.77E-43)
            r123 = r11
            java.lang.String r11 = "not-long"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 127(0x7f, float:1.78E-43)
            r124 = r10
            java.lang.String r10 = "neg-float"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 128(0x80, float:1.8E-43)
            r125 = r11
            java.lang.String r11 = "neg-double"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 129(0x81, float:1.81E-43)
            r126 = r10
            java.lang.String r10 = "int-to-long"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 130(0x82, float:1.82E-43)
            r127 = r11
            java.lang.String r11 = "int-to-float"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 131(0x83, float:1.84E-43)
            r128 = r10
            java.lang.String r10 = "int-to-double"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 132(0x84, float:1.85E-43)
            r129 = r11
            java.lang.String r11 = "long-to-int"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 133(0x85, float:1.86E-43)
            r130 = r10
            java.lang.String r10 = "long-to-float"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 134(0x86, float:1.88E-43)
            r131 = r11
            java.lang.String r11 = "long-to-double"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 135(0x87, float:1.89E-43)
            r132 = r10
            java.lang.String r10 = "float-to-int"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 136(0x88, float:1.9E-43)
            r133 = r11
            java.lang.String r11 = "float-to-long"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 137(0x89, float:1.92E-43)
            r134 = r10
            java.lang.String r10 = "float-to-double"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 138(0x8a, float:1.93E-43)
            r135 = r11
            java.lang.String r11 = "double-to-int"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 139(0x8b, float:1.95E-43)
            r136 = r10
            java.lang.String r10 = "double-to-long"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 140(0x8c, float:1.96E-43)
            r137 = r11
            java.lang.String r11 = "double-to-float"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 141(0x8d, float:1.98E-43)
            r138 = r10
            java.lang.String r10 = "int-to-byte"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 142(0x8e, float:1.99E-43)
            r139 = r11
            java.lang.String r11 = "int-to-char"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 143(0x8f, float:2.0E-43)
            r140 = r10
            java.lang.String r10 = "int-to-short"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 144(0x90, float:2.02E-43)
            r141 = r11
            java.lang.String r11 = "add-int"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 145(0x91, float:2.03E-43)
            r142 = r10
            java.lang.String r10 = "sub-int"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 146(0x92, float:2.05E-43)
            r143 = r11
            java.lang.String r11 = "mul-int"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 147(0x93, float:2.06E-43)
            r144 = r10
            java.lang.String r10 = "div-int"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 148(0x94, float:2.07E-43)
            r145 = r11
            java.lang.String r11 = "rem-int"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 149(0x95, float:2.09E-43)
            r146 = r10
            java.lang.String r10 = "and-int"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 150(0x96, float:2.1E-43)
            r147 = r11
            java.lang.String r11 = "or-int"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 151(0x97, float:2.12E-43)
            r148 = r10
            java.lang.String r10 = "xor-int"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 152(0x98, float:2.13E-43)
            r149 = r11
            java.lang.String r11 = "shl-int"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 153(0x99, float:2.14E-43)
            r150 = r10
            java.lang.String r10 = "shr-int"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 154(0x9a, float:2.16E-43)
            r151 = r11
            java.lang.String r11 = "ushr-int"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 155(0x9b, float:2.17E-43)
            r152 = r10
            java.lang.String r10 = "add-long"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 156(0x9c, float:2.19E-43)
            r153 = r11
            java.lang.String r11 = "sub-long"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 157(0x9d, float:2.2E-43)
            r154 = r10
            java.lang.String r10 = "mul-long"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 158(0x9e, float:2.21E-43)
            r155 = r11
            java.lang.String r11 = "div-long"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 159(0x9f, float:2.23E-43)
            r156 = r10
            java.lang.String r10 = "rem-long"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 160(0xa0, float:2.24E-43)
            r157 = r11
            java.lang.String r11 = "and-long"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 161(0xa1, float:2.26E-43)
            r158 = r10
            java.lang.String r10 = "or-long"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 162(0xa2, float:2.27E-43)
            r159 = r11
            java.lang.String r11 = "xor-long"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 163(0xa3, float:2.28E-43)
            r160 = r10
            java.lang.String r10 = "shl-long"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 164(0xa4, float:2.3E-43)
            r161 = r11
            java.lang.String r11 = "shr-long"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 165(0xa5, float:2.31E-43)
            r162 = r10
            java.lang.String r10 = "ushr-long"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 166(0xa6, float:2.33E-43)
            r163 = r11
            java.lang.String r11 = "add-float"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 167(0xa7, float:2.34E-43)
            r164 = r10
            java.lang.String r10 = "sub-float"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 168(0xa8, float:2.35E-43)
            r165 = r11
            java.lang.String r11 = "mul-float"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 169(0xa9, float:2.37E-43)
            r166 = r10
            java.lang.String r10 = "div-float"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 170(0xaa, float:2.38E-43)
            r167 = r11
            java.lang.String r11 = "rem-float"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 171(0xab, float:2.4E-43)
            r168 = r10
            java.lang.String r10 = "add-double"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 172(0xac, float:2.41E-43)
            r169 = r11
            java.lang.String r11 = "sub-double"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 173(0xad, float:2.42E-43)
            r170 = r10
            java.lang.String r10 = "mul-double"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 174(0xae, float:2.44E-43)
            r171 = r11
            java.lang.String r11 = "div-double"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 175(0xaf, float:2.45E-43)
            r172 = r10
            java.lang.String r10 = "rem-double"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 176(0xb0, float:2.47E-43)
            r173 = r11
            java.lang.String r11 = "add-int/2addr"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 177(0xb1, float:2.48E-43)
            r174 = r10
            java.lang.String r10 = "sub-int/2addr"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 178(0xb2, float:2.5E-43)
            r175 = r11
            java.lang.String r11 = "mul-int/2addr"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 179(0xb3, float:2.51E-43)
            r176 = r10
            java.lang.String r10 = "div-int/2addr"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 180(0xb4, float:2.52E-43)
            r177 = r11
            java.lang.String r11 = "rem-int/2addr"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 181(0xb5, float:2.54E-43)
            r178 = r10
            java.lang.String r10 = "and-int/2addr"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 182(0xb6, float:2.55E-43)
            r179 = r11
            java.lang.String r11 = "or-int/2addr"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 183(0xb7, float:2.56E-43)
            r180 = r10
            java.lang.String r10 = "xor-int/2addr"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 184(0xb8, float:2.58E-43)
            r181 = r11
            java.lang.String r11 = "shl-int/2addr"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 185(0xb9, float:2.59E-43)
            r182 = r10
            java.lang.String r10 = "shr-int/2addr"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 186(0xba, float:2.6E-43)
            r183 = r11
            java.lang.String r11 = "ushr-int/2addr"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 187(0xbb, float:2.62E-43)
            r184 = r10
            java.lang.String r10 = "add-long/2addr"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 188(0xbc, float:2.63E-43)
            r185 = r11
            java.lang.String r11 = "sub-long/2addr"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 189(0xbd, float:2.65E-43)
            r186 = r10
            java.lang.String r10 = "mul-long/2addr"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 190(0xbe, float:2.66E-43)
            r187 = r11
            java.lang.String r11 = "div-long/2addr"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 191(0xbf, float:2.68E-43)
            r188 = r10
            java.lang.String r10 = "rem-long/2addr"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 192(0xc0, float:2.69E-43)
            r189 = r11
            java.lang.String r11 = "and-long/2addr"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 193(0xc1, float:2.7E-43)
            r190 = r10
            java.lang.String r10 = "or-long/2addr"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 194(0xc2, float:2.72E-43)
            r191 = r11
            java.lang.String r11 = "xor-long/2addr"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 195(0xc3, float:2.73E-43)
            r192 = r10
            java.lang.String r10 = "shl-long/2addr"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 196(0xc4, float:2.75E-43)
            r193 = r11
            java.lang.String r11 = "shr-long/2addr"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 197(0xc5, float:2.76E-43)
            r194 = r10
            java.lang.String r10 = "ushr-long/2addr"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 198(0xc6, float:2.77E-43)
            r195 = r11
            java.lang.String r11 = "add-float/2addr"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 199(0xc7, float:2.79E-43)
            r196 = r10
            java.lang.String r10 = "sub-float/2addr"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 200(0xc8, float:2.8E-43)
            r197 = r11
            java.lang.String r11 = "mul-float/2addr"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 201(0xc9, float:2.82E-43)
            r198 = r10
            java.lang.String r10 = "div-float/2addr"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 202(0xca, float:2.83E-43)
            r199 = r11
            java.lang.String r11 = "rem-float/2addr"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 203(0xcb, float:2.84E-43)
            r200 = r10
            java.lang.String r10 = "add-double/2addr"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 204(0xcc, float:2.86E-43)
            r201 = r11
            java.lang.String r11 = "sub-double/2addr"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 205(0xcd, float:2.87E-43)
            r202 = r10
            java.lang.String r10 = "mul-double/2addr"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 206(0xce, float:2.89E-43)
            r203 = r11
            java.lang.String r11 = "div-double/2addr"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 207(0xcf, float:2.9E-43)
            r204 = r10
            java.lang.String r10 = "rem-double/2addr"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 208(0xd0, float:2.91E-43)
            r205 = r11
            java.lang.String r11 = "add-int/lit16"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 209(0xd1, float:2.93E-43)
            r206 = r10
            java.lang.String r10 = "rsub-int"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 210(0xd2, float:2.94E-43)
            r207 = r11
            java.lang.String r11 = "mul-int/lit16"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 211(0xd3, float:2.96E-43)
            r208 = r10
            java.lang.String r10 = "div-int/lit16"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 212(0xd4, float:2.97E-43)
            r209 = r11
            java.lang.String r11 = "rem-int/lit16"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 213(0xd5, float:2.98E-43)
            r210 = r10
            java.lang.String r10 = "and-int/lit16"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 214(0xd6, float:3.0E-43)
            r211 = r11
            java.lang.String r11 = "or-int/lit16"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 215(0xd7, float:3.01E-43)
            r212 = r10
            java.lang.String r10 = "xor-int/lit16"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 216(0xd8, float:3.03E-43)
            r213 = r11
            java.lang.String r11 = "add-int/lit8"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 217(0xd9, float:3.04E-43)
            r214 = r10
            java.lang.String r10 = "rsub-int/lit8"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 218(0xda, float:3.05E-43)
            r215 = r11
            java.lang.String r11 = "mul-int/lit8"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 219(0xdb, float:3.07E-43)
            r216 = r10
            java.lang.String r10 = "div-int/lit8"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 220(0xdc, float:3.08E-43)
            r217 = r11
            java.lang.String r11 = "rem-int/lit8"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 221(0xdd, float:3.1E-43)
            r218 = r10
            java.lang.String r10 = "and-int/lit8"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 222(0xde, float:3.11E-43)
            r219 = r11
            java.lang.String r11 = "or-int/lit8"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 223(0xdf, float:3.12E-43)
            r220 = r10
            java.lang.String r10 = "xor-int/lit8"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 224(0xe0, float:3.14E-43)
            r221 = r11
            java.lang.String r11 = "shl-int/lit8"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 225(0xe1, float:3.15E-43)
            r222 = r10
            java.lang.String r10 = "shr-int/lit8"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 226(0xe2, float:3.17E-43)
            r223 = r11
            java.lang.String r11 = "ushr-int/lit8"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 250(0xfa, float:3.5E-43)
            r224 = r10
            java.lang.String r10 = "invoke-polymorphic"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 251(0xfb, float:3.52E-43)
            r225 = r11
            java.lang.String r11 = "invoke-polymorphic/range"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 252(0xfc, float:3.53E-43)
            r226 = r10
            java.lang.String r10 = "invoke-custom"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 253(0xfd, float:3.55E-43)
            r227 = r11
            java.lang.String r11 = "invoke-custom/range"
            r10.<init>(r15, r11)
            j8.x r11 = new j8.x
            r15 = 254(0xfe, float:3.56E-43)
            r228 = r10
            java.lang.String r10 = "const-method-handle"
            r11.<init>(r15, r10)
            j8.x r10 = new j8.x
            r15 = 255(0xff, float:3.57E-43)
            r229 = r11
            java.lang.String r11 = "const-method-type"
            r10.<init>(r15, r11)
            r11 = 65537(0x10001, float:9.1837E-41)
            j8.x[] r11 = new j8.x[r11]
            s4.a.f12363a = r11
            p.a.s(r0, r1, r2, r3, r4)
            p.a.s(r5, r6, r7, r8, r9)
            r0 = r16
            r1 = r17
            p.a.s(r0, r1, r12, r13, r14)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r33
            r1 = r34
            r2 = r35
            r3 = r36
            r4 = r37
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r38
            r1 = r39
            r2 = r40
            r3 = r41
            r4 = r42
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r43
            r1 = r44
            r2 = r45
            r3 = r46
            r4 = r47
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r48
            r1 = r49
            r2 = r50
            r3 = r51
            r4 = r52
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r53
            r1 = r54
            r2 = r55
            r3 = r56
            r4 = r57
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r58
            r1 = r59
            r2 = r60
            r3 = r61
            r4 = r62
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r63
            r1 = r64
            r2 = r65
            r3 = r66
            r4 = r67
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r68
            r1 = r69
            r2 = r70
            r3 = r71
            r4 = r72
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r73
            r1 = r74
            r2 = r75
            r3 = r76
            r4 = r77
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r78
            r1 = r79
            r2 = r80
            r3 = r81
            r4 = r82
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r83
            r1 = r84
            r2 = r85
            r3 = r86
            r4 = r87
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r88
            r1 = r89
            r2 = r90
            r3 = r91
            r4 = r92
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r93
            r1 = r94
            r2 = r95
            r3 = r96
            r4 = r97
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r98
            r1 = r99
            r2 = r100
            r3 = r101
            r4 = r102
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r103
            r1 = r104
            r2 = r105
            r3 = r106
            r4 = r107
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r108
            r1 = r109
            r2 = r110
            r3 = r111
            r4 = r112
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r113
            r1 = r114
            r2 = r115
            r3 = r116
            r4 = r117
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r118
            r1 = r119
            r2 = r120
            r3 = r121
            r4 = r122
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r123
            r1 = r124
            r2 = r125
            r3 = r126
            r4 = r127
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r128
            r1 = r129
            r2 = r130
            r3 = r131
            r4 = r132
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r133
            r1 = r134
            r2 = r135
            r3 = r136
            r4 = r137
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r138
            r1 = r139
            r2 = r140
            r3 = r141
            r4 = r142
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r143
            r1 = r144
            r2 = r145
            r3 = r146
            r4 = r147
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r148
            r1 = r149
            r2 = r150
            r3 = r151
            r4 = r152
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r153
            r1 = r154
            r2 = r155
            r3 = r156
            r4 = r157
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r158
            r1 = r159
            r2 = r160
            r3 = r161
            r4 = r162
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r163
            r1 = r164
            r2 = r165
            r3 = r166
            r4 = r167
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r168
            r1 = r169
            r2 = r170
            r3 = r171
            r4 = r172
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r173
            r1 = r174
            r2 = r175
            r3 = r176
            r4 = r177
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r178
            r1 = r179
            r2 = r180
            r3 = r181
            r4 = r182
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r183
            r1 = r184
            r2 = r185
            r3 = r186
            r4 = r187
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r188
            r1 = r189
            r2 = r190
            r3 = r191
            r4 = r192
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r193
            r1 = r194
            r2 = r195
            r3 = r196
            r4 = r197
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r198
            r1 = r199
            r2 = r200
            r3 = r201
            r4 = r202
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r203
            r1 = r204
            r2 = r205
            r3 = r206
            r4 = r207
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r208
            r1 = r209
            r2 = r210
            r3 = r211
            r4 = r212
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r213
            r1 = r214
            r2 = r215
            r3 = r216
            r4 = r217
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r218
            r1 = r219
            r2 = r220
            r3 = r221
            r4 = r222
            p.a.s(r0, r1, r2, r3, r4)
            r0 = r223
            r1 = r224
            r2 = r225
            r3 = r226
            r4 = r227
            p.a.s(r0, r1, r2, r3, r4)
            a(r228)
            a(r229)
            a(r10)
            return
    }

    public static void a(j8.x r2) {
            int r0 = r2.f6838a
            int r0 = r0 + 1
            j8.x[] r1 = s4.a.f12363a
            r1[r0] = r2
            return
    }
}
