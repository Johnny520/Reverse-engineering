.class public final L۟/b6;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static ۥ()Z
    .locals 17

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    invoke-static {v1}, L۟/h4;->ۥ۟(Ljava/lang/Object;)V

    array-length v2, v1

    move v3, v0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x1f

    new-array v5, v5, [B

    const/16 v6, 0x27

    aput-byte v6, v5, v0

    const/16 v6, -0x2e

    const/4 v7, 0x1

    aput-byte v6, v5, v7

    const/4 v6, -0x6

    const/4 v8, 0x2

    aput-byte v6, v5, v8

    const/16 v9, 0x64

    const/4 v10, 0x3

    aput-byte v9, v5, v10

    const/16 v11, -0x28

    const/4 v12, 0x4

    aput-byte v11, v5, v12

    const/16 v11, -0x66

    const/4 v13, 0x5

    aput-byte v11, v5, v13

    const/16 v11, 0x2b

    const/4 v14, 0x6

    aput-byte v11, v5, v14

    const/4 v11, 0x7

    const/16 v15, -0x31

    aput-byte v15, v5, v11

    const/16 v11, 0x8

    const/4 v15, -0x4

    aput-byte v15, v5, v11

    const/16 v11, 0x9

    aput-byte v9, v5, v11

    const/16 v9, 0xa

    const/16 v11, -0x40

    aput-byte v11, v5, v9

    const/16 v9, 0xb

    const/16 v11, -0x72

    aput-byte v11, v5, v9

    const/16 v9, 0xc

    const/16 v11, 0x31

    aput-byte v11, v5, v9

    const/16 v9, 0xd

    const/16 v16, -0x37

    aput-byte v16, v5, v9

    const/16 v9, 0xe

    const/16 v16, -0xa

    aput-byte v16, v5, v9

    const/16 v9, 0xf

    const/16 v16, 0x26

    aput-byte v16, v5, v9

    const/16 v9, 0x10

    const/16 v16, -0x74

    aput-byte v16, v5, v9

    const/16 v9, 0x11

    const/16 v16, -0x4f

    aput-byte v16, v5, v9

    const/16 v9, 0x12

    aput-byte v11, v5, v9

    const/16 v9, 0x13

    const/16 v11, -0x2d

    aput-byte v11, v5, v9

    const/16 v9, 0x14

    const/16 v11, -0xd

    aput-byte v11, v5, v9

    const/16 v9, 0x15

    const/16 v11, 0x25

    aput-byte v11, v5, v9

    const/16 v9, 0x16

    aput-byte v6, v5, v9

    const/16 v6, 0x17

    const/16 v9, -0x41

    aput-byte v9, v5, v6

    const/16 v6, 0x18

    aput-byte v11, v5, v6

    const/16 v6, 0x19

    const/16 v9, -0x2f

    aput-byte v9, v5, v6

    const/16 v6, 0x1a

    const/4 v9, -0x5

    aput-byte v9, v5, v6

    const/16 v6, 0x1b

    const/16 v9, 0x28

    aput-byte v9, v5, v6

    const/16 v6, 0x1c

    const/16 v9, -0x3d

    aput-byte v9, v5, v6

    const/16 v6, 0x1d

    const/16 v9, -0x61

    aput-byte v9, v5, v6

    const/16 v6, 0x1e

    const/16 v9, 0x2f

    aput-byte v9, v5, v6

    new-array v6, v14, [B

    const/16 v9, 0x44

    aput-byte v9, v6, v0

    const/16 v9, -0x43

    aput-byte v9, v6, v7

    const/16 v9, -0x69

    aput-byte v9, v6, v8

    const/16 v8, 0x4a

    aput-byte v8, v6, v10

    const/16 v8, -0x5e

    aput-byte v8, v6, v12

    aput-byte v15, v6, v13

    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v4, :cond_0

    return v7

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :catch_0
    :cond_1
    return v0
.end method

.method public static ۥ۟()Z
    .locals 15

    const/16 v0, 0x21

    const/4 v1, 0x0

    :try_start_0
    new-array v2, v0, [B

    const/16 v3, -0x47

    aput-byte v3, v2, v1

    const/16 v3, -0x14

    const/4 v4, 0x1

    aput-byte v3, v2, v4

    const/16 v3, 0x2b

    const/4 v5, 0x2

    aput-byte v3, v2, v5

    const/4 v6, 0x3

    const/16 v7, 0x4a

    aput-byte v7, v2, v6

    const/16 v8, -0x44

    const/4 v9, 0x4

    aput-byte v8, v2, v9

    const/16 v10, 0x50

    const/4 v11, 0x5

    aput-byte v10, v2, v11

    const/16 v10, -0x4b

    const/4 v12, 0x6

    aput-byte v10, v2, v12

    const/4 v10, 0x7

    const/16 v13, -0xf

    aput-byte v13, v2, v10

    const/16 v10, 0x8

    aput-byte v3, v2, v10

    const/16 v3, 0x9

    aput-byte v7, v2, v3

    const/16 v3, 0xa

    const/16 v10, -0x48

    aput-byte v10, v2, v3

    const/16 v3, 0xb

    const/16 v10, 0x4d

    aput-byte v10, v2, v3

    const/16 v3, 0xc

    const/16 v10, -0x4c

    aput-byte v10, v2, v3

    const/16 v3, 0xd

    const/16 v10, -0x19

    aput-byte v10, v2, v3

    const/16 v3, 0xe

    const/16 v10, 0x68

    aput-byte v10, v2, v3

    const/16 v3, 0xf

    const/16 v10, 0x1c

    aput-byte v10, v2, v3

    const/16 v3, 0x10

    const/16 v13, -0x41

    aput-byte v13, v2, v3

    const/16 v3, 0x11

    const/16 v13, 0x4b

    aput-byte v13, v2, v3

    const/16 v3, 0x12

    const/16 v13, -0x57

    aput-byte v13, v2, v3

    const/16 v3, 0x13

    const/16 v13, -0x1a

    aput-byte v13, v2, v3

    const/16 v3, 0x14

    const/16 v13, 0x22

    aput-byte v13, v2, v3

    const/16 v3, 0x15

    aput-byte v7, v2, v3

    const/16 v3, 0x16

    const/16 v14, -0x73

    aput-byte v14, v2, v3

    const/16 v3, 0x17

    const/16 v14, 0x51

    aput-byte v14, v2, v3

    const/16 v3, 0x18

    const/16 v14, -0x4d

    aput-byte v14, v2, v3

    const/16 v3, 0x19

    const/16 v14, -0x11

    aput-byte v14, v2, v3

    const/16 v3, 0x1a

    aput-byte v13, v2, v3

    const/16 v3, 0x1b

    const/16 v13, 0x27

    aput-byte v13, v2, v3

    const/16 v3, -0x60

    aput-byte v3, v2, v10

    const/16 v3, 0x1d

    aput-byte v7, v2, v3

    const/16 v3, 0x1e

    aput-byte v8, v2, v3

    const/16 v3, 0x1f

    const/16 v7, -0x16

    aput-byte v7, v2, v3

    const/16 v3, 0x20

    aput-byte v0, v2, v3

    new-array v0, v12, [B

    const/16 v3, -0x26

    aput-byte v3, v0, v1

    const/16 v3, -0x7d

    aput-byte v3, v0, v4

    const/16 v3, 0x46

    aput-byte v3, v0, v5

    const/16 v3, 0x64

    aput-byte v3, v0, v6

    const/16 v3, -0x31

    aput-byte v3, v0, v9

    const/16 v3, 0x24

    aput-byte v3, v0, v11

    invoke-static {v2, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, L۟/r3;->ۥ۟ۢ(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    move v1, v4

    :catch_0
    :cond_0
    return v1
.end method

.method public static ۥ۟۟()Ljava/lang/String;
    .locals 3

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x6

    .line 9
    new-array v1, v1, [B

    .line 10
    .line 11
    fill-array-data v1, :array_1

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "compile(...)"

    .line 23
    .line 24
    invoke-static {v1, v0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object v1, L۟/m3;->ۥ:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v2, "matcher(...)"

    .line 34
    .line 35
    invoke-static {v2, v0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-virtual {v0, v2}, Ljava/util/regex/Matcher;->find(I)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_0

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance v2, L۟/r5;

    .line 48
    .line 49
    invoke-direct {v2, v0, v1}, L۟/r5;-><init>(Ljava/util/regex/Matcher;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    move-object v0, v2

    .line 53
    :goto_0
    if-eqz v0, :cond_2

    .line 54
    .line 55
    iget-object v1, v0, L۟/r5;->ۥ۟:L۟/q5;

    .line 56
    .line 57
    if-nez v1, :cond_1

    .line 58
    .line 59
    new-instance v1, L۟/q5;

    .line 60
    .line 61
    invoke-direct {v1, v0}, L۟/q5;-><init>(L۟/r5;)V

    .line 62
    .line 63
    .line 64
    iput-object v1, v0, L۟/r5;->ۥ۟:L۟/q5;

    .line 65
    .line 66
    :cond_1
    iget-object v0, v0, L۟/r5;->ۥ۟:L۟/q5;

    .line 67
    .line 68
    invoke-static {v0}, L۟/h4;->ۥ۟(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    invoke-virtual {v0, v1}, L۟/q5;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Ljava/lang/String;

    .line 77
    .line 78
    return-object v0

    .line 79
    :cond_2
    const-string v0, ""

    .line 80
    .line 81
    return-object v0

    .line 82
    nop

    .line 83
    :array_0
    .array-data 1
        0x47t
        -0x40t
        -0x7t
        0x60t
        -0x25t
        0x6ft
        0x47t
        -0x75t
        -0x4at
        0x29t
        -0x74t
        0x23t
        0x47t
    .end array-data

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    nop

    .line 95
    :array_1
    .array-data 1
        0x68t
        -0x5dt
        -0x68t
        0x3t
        -0x4dt
        0xat
    .end array-data
.end method

.method public static ۥ۟۠()Ljava/lang/String;
    .locals 2

    invoke-static {}, L۟/b6;->ۥ۟۟()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, L۟/b6;->ۥ۟()Z

    move-result v0

    const/4 v1, 0x6

    if-eqz v0, :cond_2

    new-array v0, v1, [B

    fill-array-data v0, :array_0

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-static {}, L۟/b6;->ۥ()Z

    move-result v0

    if-eqz v0, :cond_3

    new-array v0, v1, [B

    fill-array-data v0, :array_2

    new-array v1, v1, [B

    fill-array-data v1, :array_3

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    invoke-static {}, L۟/b6;->ۥ۟ۢ()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_4

    new-array v1, v1, [B

    fill-array-data v1, :array_5

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    invoke-static {}, L۟/b6;->ۥ۟ۡ()Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v0, 0xc

    new-array v0, v0, [B

    fill-array-data v0, :array_6

    new-array v1, v1, [B

    fill-array-data v1, :array_7

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_5
    invoke-static {}, L۟/b6;->ۥۣ۟()Z

    move-result v0

    if-eqz v0, :cond_6

    new-array v0, v1, [B

    fill-array-data v0, :array_8

    new-array v1, v1, [B

    fill-array-data v1, :array_9

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_6
    new-array v0, v1, [B

    fill-array-data v0, :array_a

    new-array v1, v1, [B

    fill-array-data v1, :array_b

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :array_0
    .array-data 1
        -0x2et
        -0x5t
        0x60t
        0x2dt
        0x6et
        0x45t
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x76t
        -0x55t
        0x1t
        0x59t
        0xdt
        0x2dt
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x48t
        -0x71t
        0xct
        0x26t
        -0x60t
        -0x2at
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x15t
        -0x21t
        0x6dt
        0x52t
        -0x3dt
        -0x42t
    .end array-data

    nop

    :array_4
    .array-data 1
        0x14t
        -0x47t
        0x1at
    .end array-data

    :array_5
    .array-data 1
        0x52t
        -0x17t
        0x5bt
        0x4t
        0x6at
        -0x24t
    .end array-data

    nop

    :array_6
    .array-data 1
        -0x67t
        -0x4dt
        -0x26t
        0x16t
        -0x63t
        -0x73t
        -0x6ct
        -0x4ct
        -0x1et
        0x16t
        -0x63t
        -0x46t
    .end array-data

    :array_7
    .array-data 1
        0x7ct
        0x9t
        0x4et
        -0xft
        0x9t
        0x25t
    .end array-data

    nop

    :array_8
    .array-data 1
        -0x35t
        -0x26t
        -0x26t
        -0xct
        0x19t
        0x75t
    .end array-data

    nop

    :array_9
    .array-data 1
        0x2et
        0x7et
        0x70t
        0x12t
        -0x79t
        -0xct
    .end array-data

    nop

    :array_a
    .array-data 1
        -0x28t
        0x55t
        -0x27t
        -0x10t
        -0x5et
        0x1ft
    .end array-data

    nop

    :array_b
    .array-data 1
        -0x60t
        0x25t
        -0x4at
        -0x7dt
        -0x39t
        0x7bt
    .end array-data
.end method

.method public static ۥ۟ۡ()Z
    .locals 12

    const/16 v0, 0x1d

    const/4 v1, 0x0

    :try_start_0
    new-array v0, v0, [B

    const/16 v2, 0x7d

    aput-byte v2, v0, v1

    const/16 v2, -0x13

    const/4 v3, 0x1

    aput-byte v2, v0, v3

    const/16 v2, -0x3e

    const/4 v4, 0x2

    aput-byte v2, v0, v4

    const/16 v2, -0x1a

    const/4 v5, 0x3

    aput-byte v2, v0, v5

    const/16 v2, -0x49

    const/4 v6, 0x4

    aput-byte v2, v0, v6

    const/16 v2, -0x22

    const/4 v7, 0x5

    aput-byte v2, v0, v7

    const/16 v2, 0x79

    const/4 v8, 0x6

    aput-byte v2, v0, v8

    const/4 v2, 0x7

    const/16 v9, -0x54

    aput-byte v9, v0, v2

    const/16 v2, 0x8

    const/16 v9, -0x3d

    aput-byte v9, v0, v2

    const/16 v2, 0x9

    const/16 v9, -0x59

    aput-byte v9, v0, v2

    const/16 v2, 0xa

    const/16 v10, -0x4c

    aput-byte v10, v0, v2

    const/16 v2, 0xb

    const/16 v10, -0x31

    aput-byte v10, v0, v2

    const/16 v2, 0xc

    const/16 v10, 0x30

    aput-byte v10, v0, v2

    const/16 v2, 0xd

    const/16 v10, -0x2e

    aput-byte v10, v0, v2

    const/16 v2, 0xe

    const/16 v11, -0x23

    aput-byte v11, v0, v2

    const/16 v2, 0xf

    aput-byte v9, v0, v2

    const/16 v2, 0x10

    const/16 v11, -0x53

    aput-byte v11, v0, v2

    const/16 v2, 0x11

    aput-byte v10, v0, v2

    const/16 v2, 0x12

    const/16 v10, 0x5f

    aput-byte v10, v0, v2

    const/16 v2, 0x13

    const/16 v10, -0xe

    aput-byte v10, v0, v2

    const/16 v2, 0x14

    const/16 v10, -0x21

    aput-byte v10, v0, v2

    const/16 v2, 0x15

    const/16 v10, -0x5c

    aput-byte v10, v0, v2

    const/16 v2, 0x16

    const/16 v10, -0x44

    aput-byte v10, v0, v2

    const/16 v2, 0x17

    const/16 v10, -0x38

    aput-byte v10, v0, v2

    const/16 v2, 0x18

    const/16 v11, 0x7f

    aput-byte v11, v0, v2

    const/16 v2, 0x19

    const/16 v11, -0xa

    aput-byte v11, v0, v2

    const/16 v2, 0x1a

    const/16 v11, -0x3a

    aput-byte v11, v0, v2

    const/16 v2, 0x1b

    aput-byte v9, v0, v2

    const/16 v2, 0x1c

    const/16 v9, -0x45

    aput-byte v9, v0, v2

    new-array v2, v8, [B

    const/16 v8, 0x1e

    aput-byte v8, v2, v1

    const/16 v8, -0x7e

    aput-byte v8, v2, v3

    const/16 v8, -0x51

    aput-byte v8, v2, v4

    aput-byte v10, v2, v5

    const/16 v4, -0x2b

    aput-byte v4, v2, v6

    const/16 v4, -0x55

    aput-byte v4, v2, v7

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, L۟/l3;->ۥ۟۟()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    move v1, v3

    :catchall_0
    :cond_0
    return v1
.end method

.method public static ۥ۟ۢ()Z
    .locals 13

    const/16 v0, 0xe

    const/4 v1, 0x0

    :try_start_0
    new-array v0, v0, [B

    const/16 v2, 0x4f

    aput-byte v2, v0, v1

    const/16 v3, -0x4b

    const/4 v4, 0x1

    aput-byte v3, v0, v4

    const/16 v3, 0x21

    const/4 v5, 0x2

    aput-byte v3, v0, v5

    const/16 v6, 0x72

    const/4 v7, 0x3

    aput-byte v6, v0, v7

    const/16 v6, 0x47

    const/4 v8, 0x4

    aput-byte v6, v0, v8

    const/16 v6, -0x65

    const/4 v9, 0x5

    aput-byte v6, v0, v9

    const/16 v10, 0x48

    const/4 v11, 0x6

    aput-byte v10, v0, v11

    const/16 v10, -0x12

    const/4 v12, 0x7

    aput-byte v10, v0, v12

    const/16 v10, 0x8

    aput-byte v12, v0, v10

    const/16 v10, 0x9

    const/16 v12, 0x39

    aput-byte v12, v0, v10

    const/16 v10, 0xa

    const/16 v12, 0x4d

    aput-byte v12, v0, v10

    const/16 v10, 0xb

    aput-byte v6, v0, v10

    const/16 v6, 0xc

    const/16 v10, 0x4c

    aput-byte v10, v0, v6

    const/16 v6, 0xd

    const/16 v10, -0x4e

    aput-byte v10, v0, v6

    new-array v6, v11, [B

    const/16 v10, 0x29

    aput-byte v10, v6, v1

    const/16 v10, -0x40

    aput-byte v10, v6, v4

    aput-byte v2, v6, v5

    const/16 v2, 0x5c

    aput-byte v2, v6, v7

    aput-byte v3, v6, v8

    const/16 v2, -0x15

    aput-byte v2, v6, v9

    invoke-static {v0, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, L۟/l3;->ۥ۟۟()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    move v1, v4

    :catchall_0
    :cond_0
    return v1
.end method

.method public static ۥۣ۟()Z
    .locals 13

    const/16 v0, 0x24

    const/4 v1, 0x0

    :try_start_0
    new-array v0, v0, [B

    const/16 v2, 0x4a

    aput-byte v2, v0, v1

    const/16 v2, 0x6b

    const/4 v3, 0x1

    aput-byte v2, v0, v3

    const/16 v2, -0x66

    const/4 v4, 0x2

    aput-byte v2, v0, v4

    const/16 v2, -0x3b

    const/4 v5, 0x3

    aput-byte v2, v0, v5

    const/16 v2, -0x1c

    const/4 v6, 0x4

    aput-byte v2, v0, v6

    const/16 v7, 0x68

    const/4 v8, 0x5

    aput-byte v7, v0, v8

    const/16 v9, 0x54

    const/4 v10, 0x6

    aput-byte v9, v0, v10

    const/4 v9, 0x7

    const/16 v11, 0x66

    aput-byte v11, v0, v9

    const/16 v9, 0x8

    const/16 v11, -0x3f

    aput-byte v11, v0, v9

    const/16 v9, 0x9

    const/16 v11, -0x64

    aput-byte v11, v0, v9

    const/16 v9, 0xa

    aput-byte v2, v0, v9

    const/16 v2, 0xb

    const/16 v9, 0x79

    aput-byte v9, v0, v2

    const/16 v2, 0xc

    const/16 v9, 0x57

    aput-byte v9, v0, v2

    const/16 v2, 0xd

    const/16 v9, 0x61

    aput-byte v9, v0, v2

    const/16 v2, -0x39

    const/16 v9, 0xe

    aput-byte v2, v0, v9

    const/16 v2, 0xf

    const/16 v11, -0x29

    aput-byte v11, v0, v2

    const/16 v2, 0x10

    const/16 v11, -0x1b

    aput-byte v11, v0, v2

    const/16 v2, 0x11

    const/16 v11, 0x2f

    aput-byte v11, v0, v2

    const/16 v2, 0x12

    const/16 v11, 0x62

    aput-byte v11, v0, v2

    const/16 v2, 0x13

    const/16 v11, 0x76

    aput-byte v11, v0, v2

    const/16 v2, 0x14

    const/16 v11, -0x3c

    aput-byte v11, v0, v2

    const/16 v2, 0x15

    const/16 v12, -0x23

    aput-byte v12, v0, v2

    const/16 v2, 0x16

    const/16 v12, -0xe

    aput-byte v12, v0, v2

    const/16 v2, 0x17

    const/16 v12, 0x64

    aput-byte v12, v0, v2

    const/16 v2, 0x18

    const/16 v12, 0x43

    aput-byte v12, v0, v2

    const/16 v2, 0x19

    const/16 v12, 0x4f

    aput-byte v12, v0, v2

    const/16 v2, 0x1a

    aput-byte v11, v0, v2

    const/16 v2, 0x1b

    const/16 v11, -0x3e

    aput-byte v11, v0, v2

    const/16 v2, 0x1c

    const/16 v11, -0x13

    aput-byte v11, v0, v2

    const/16 v2, 0x1d

    aput-byte v7, v0, v2

    const/16 v2, 0x1e

    const/16 v7, 0x44

    aput-byte v7, v0, v2

    const/16 v2, 0x1f

    const/16 v7, 0x6f

    aput-byte v7, v0, v2

    const/16 v2, 0x20

    const/16 v11, -0x40

    aput-byte v11, v0, v2

    const/16 v2, 0x21

    const/16 v11, -0x25

    aput-byte v11, v0, v2

    const/16 v2, 0x22

    const/16 v11, -0x12

    aput-byte v11, v0, v2

    const/16 v2, 0x23

    aput-byte v7, v0, v2

    new-array v2, v10, [B

    const/16 v7, 0x27

    aput-byte v7, v2, v1

    aput-byte v9, v2, v3

    const/16 v7, -0x4c

    aput-byte v7, v2, v4

    const/16 v4, -0x4e

    aput-byte v4, v2, v5

    const/16 v4, -0x7f

    aput-byte v4, v2, v6

    aput-byte v3, v2, v8

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, L۟/l3;->ۥ۟۟()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    move v1, v3

    :catchall_0
    :cond_0
    return v1
.end method

.method public static ۥ۟ۤ()V
    .locals 4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    invoke-static {v0}, L۟/h4;->ۥ۟(Ljava/lang/Object;)V

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
