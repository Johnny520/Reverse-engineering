.class public final L۟/s3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, L۟/s3$a;

    invoke-direct {v0}, L۟/s3$a;-><init>()V

    return-void
.end method

.method public static final ۥ(L۟/g3;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u06df/g3<",
            "-",
            "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x6

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    new-array v2, v0, [B

    fill-array-data v2, :array_1

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v1, 0x5

    new-array v2, v1, [B

    fill-array-data v2, :array_2

    new-array v3, v0, [B

    fill-array-data v3, :array_3

    invoke-static {v2, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p0, p1}, L۟/g3;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const/16 v2, 0x10

    const/4 v3, 0x4

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    new-array v5, v2, [B

    fill-array-data v5, :array_4

    new-array v6, v0, [B

    fill-array-data v6, :array_5

    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-array v4, v3, [B

    fill-array-data v4, :array_6

    new-array v5, v0, [B

    fill-array-data v5, :array_7

    invoke-static {v4, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v4

    :goto_0
    iget-object v5, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    const/16 v6, 0x3d

    new-array v6, v6, [B

    fill-array-data v6, :array_8

    new-array v7, v0, [B

    fill-array-data v7, :array_9

    invoke-static {v6, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v5}, L۟/h4;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v5, Ljava/lang/reflect/Method;

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x12

    new-array v6, v6, [B

    fill-array-data v6, :array_a

    new-array v7, v0, [B

    fill-array-data v7, :array_b

    invoke-static {v6, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    new-array v2, v2, [B

    fill-array-data v2, :array_c

    new-array v6, v0, [B

    fill-array-data v6, :array_d

    invoke-static {v2, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v6, 0x7

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    new-array v1, v1, [B

    fill-array-data v1, :array_e

    new-array v0, v0, [B

    fill-array-data v0, :array_f

    invoke-static {v1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_2

    :sswitch_1
    new-array v1, v6, [B

    fill-array-data v1, :array_10

    new-array v0, v0, [B

    fill-array-data v0, :array_11

    invoke-static {v1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-static {v4, v5}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_1

    :sswitch_2
    new-array v1, v3, [B

    fill-array-data v1, :array_12

    new-array v0, v0, [B

    fill-array-data v0, :array_13

    invoke-static {v1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :sswitch_3
    const/4 v1, 0x3

    new-array v2, v1, [B

    fill-array-data v2, :array_14

    new-array v3, v0, [B

    fill-array-data v3, :array_15

    invoke-static {v2, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    new-array v1, v1, [B

    fill-array-data v1, :array_16

    new-array v2, v0, [B

    fill-array-data v2, :array_17

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    new-array v1, v6, [B

    fill-array-data v1, :array_18

    new-array v0, v0, [B

    fill-array-data v0, :array_19

    invoke-static {v1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :sswitch_4
    new-array v1, v0, [B

    fill-array-data v1, :array_1a

    new-array v0, v0, [B

    fill-array-data v0, :array_1b

    invoke-static {v1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v4, v5}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    :goto_1
    invoke-static {}, L۟/b6;->ۥ۟ۤ()V

    invoke-static {p1}, L۟/r3;->ۥ۠ۥ(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Ljava/lang/Object;

    move-result-object p0

    :cond_4
    :goto_2
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4f08842f -> :sswitch_4
        0x197ef -> :sswitch_3
        0x32c67c -> :sswitch_2
        0x3db6c28 -> :sswitch_1
        0x5d0225c -> :sswitch_0
    .end sparse-switch

    :array_0
    .array-data 1
        0x55t
        -0x6ct
        0x22t
        -0x6ft
        0x4et
        0x5bt
    .end array-data

    nop

    :array_1
    .array-data 1
        0x3dt
        -0x5t
        0x4dt
        -0x6t
        0x2bt
        0x29t
    .end array-data

    nop

    :array_2
    .array-data 1
        0x3bt
        0x3ct
        -0x10t
        0x12t
        -0x58t
    .end array-data

    nop

    :array_3
    .array-data 1
        0x4bt
        0x5dt
        -0x7et
        0x73t
        -0x3bt
        0x20t
    .end array-data

    nop

    :array_4
    .array-data 1
        0x68t
        -0xct
        0x31t
        0x5bt
        0x29t
        0x7dt
        0x6et
        -0x28t
        0x1ct
        0x47t
        0x3bt
        0x30t
        0x32t
        -0x4bt
        0x53t
        0x1dt
    .end array-data

    :array_5
    .array-data 1
        0x1ct
        -0x65t
        0x7dt
        0x34t
        0x5et
        0x18t
    .end array-data

    nop

    :array_6
    .array-data 1
        0x20t
        0x2et
        -0x7bt
        0xbt
    .end array-data

    :array_7
    .array-data 1
        0x4et
        0x5bt
        -0x17t
        0x67t
        -0x6bt
        0x69t
    .end array-data

    nop

    :array_8
    .array-data 1
        -0x14t
        0x31t
        0x4ft
        -0x2t
        -0x32t
        0x5bt
        -0x1dt
        0x2at
        0x4dt
        -0x3t
        -0x66t
        0x18t
        -0x20t
        0x21t
        0x3t
        -0xft
        -0x71t
        0x4bt
        -0xat
        0x64t
        0x57t
        -0x3t
        -0x32t
        0x56t
        -0x13t
        0x2at
        0xet
        -0x4t
        -0x65t
        0x54t
        -0x12t
        0x64t
        0x57t
        -0x15t
        -0x62t
        0x5dt
        -0x5et
        0x2et
        0x42t
        -0x1ct
        -0x71t
        0x16t
        -0x12t
        0x25t
        0x4dt
        -0xbt
        -0x40t
        0x4at
        -0x19t
        0x22t
        0x4ft
        -0x9t
        -0x73t
        0x4ct
        -0x54t
        0x9t
        0x46t
        -0x1at
        -0x7at
        0x57t
        -0x1at
    .end array-data

    nop

    :array_9
    .array-data 1
        -0x7et
        0x44t
        0x23t
        -0x6et
        -0x12t
        0x38t
    .end array-data

    nop

    :array_a
    .array-data 1
        0x40t
        0x22t
        -0x41t
        0x69t
        0x1dt
        0x13t
        0x57t
        0x2bt
        -0x52t
        0x74t
        0x15t
        0x13t
        0x42t
        0x6ft
        -0x1bt
        0x14t
        0x5at
        0x57t
    .end array-data

    nop

    :array_b
    .array-data 1
        0x27t
        0x47t
        -0x35t
        0x3at
        0x74t
        0x7et
    .end array-data

    nop

    :array_c
    .array-data 1
        0x5t
        0x1et
        -0x57t
        0xet
        -0x3et
        -0x20t
        0x3t
        0x32t
        -0x7ct
        0x12t
        -0x30t
        -0x53t
        0x5ft
        0x5ft
        -0x35t
        0x48t
    .end array-data

    :array_d
    .array-data 1
        0x71t
        0x71t
        -0x1bt
        0x61t
        -0x4bt
        -0x7bt
    .end array-data

    nop

    :array_e
    .array-data 1
        0x4dt
        0x34t
        -0x2ct
        0x2at
        0x6dt
    .end array-data

    nop

    :array_f
    .array-data 1
        0x2bt
        0x58t
        -0x45t
        0x4bt
        0x19t
        -0x53t
    .end array-data

    nop

    :array_10
    .array-data 1
        0x6dt
        0x27t
        -0x6ct
        -0x66t
        -0xdt
        0x55t
        0x61t
    .end array-data

    :array_11
    .array-data 1
        0xft
        0x48t
        -0x5t
        -0xat
        -0x6at
        0x34t
    .end array-data

    nop

    :array_12
    .array-data 1
        0x48t
        -0x42t
        0x7bt
        -0x5bt
    .end array-data

    :array_13
    .array-data 1
        0x24t
        -0x2ft
        0x15t
        -0x3et
        -0x2dt
        0x53t
    .end array-data

    nop

    :array_14
    .array-data 1
        0xbt
        0x2t
        0x14t
    .end array-data

    :array_15
    .array-data 1
        0x62t
        0x6ct
        0x60t
        -0x2et
        0x78t
        0x14t
    .end array-data

    nop

    :array_16
    .array-data 1
        -0x75t
        0x5at
        0x10t
    .end array-data

    :array_17
    .array-data 1
        -0x1et
        0x34t
        0x64t
        -0x37t
        -0x5ft
        -0x4ct
    .end array-data

    nop

    :array_18
    .array-data 1
        -0x4ft
        0x55t
        -0x1dt
        0x68t
        0x1ft
        0x4ft
        -0x56t
    .end array-data

    :array_19
    .array-data 1
        -0x28t
        0x3bt
        -0x69t
        0xdt
        0x78t
        0x2at
    .end array-data

    nop

    :array_1a
    .array-data 1
        0x4et
        -0x10t
        -0x6ft
        0x1ct
        0x1bt
        -0x72t
    .end array-data

    nop

    :array_1b
    .array-data 1
        0x2at
        -0x61t
        -0x1ct
        0x7et
        0x77t
        -0x15t
    .end array-data
.end method

.method public static final ۥ۟(Ljava/lang/reflect/Method;L۟/g3;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    .locals 3

    const/4 v0, 0x6

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    new-array v2, v0, [B

    fill-array-data v2, :array_1

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    new-array v1, v0, [B

    fill-array-data v1, :array_2

    new-array v0, v0, [B

    fill-array-data v0, :array_3

    invoke-static {v1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    new-instance v0, L۟/t3;

    invoke-direct {v0, p1}, L۟/t3;-><init>(L۟/g3;)V

    invoke-static {p0, v0}, L۟/r3;->ۥ۠ۤ(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    move-result-object p0

    return-object p0

    nop

    :array_0
    .array-data 1
        0x7et
        0x71t
        -0x3ct
        -0x7ct
        -0x64t
        0x1at
    .end array-data

    nop

    :array_1
    .array-data 1
        0x42t
        0x5t
        -0x54t
        -0x13t
        -0x11t
        0x24t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x60t
        -0xet
        -0x4ft
        -0x60t
        -0x6ft
        0x7ft
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x38t
        -0x63t
        -0x22t
        -0x35t
        -0xct
        0xdt
    .end array-data
.end method

.method public static ۥ۟۟(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;L۟/g3;)V
    .locals 12

    invoke-static {}, L۟/l3;->ۥ۟۟()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x6

    new-array v2, v1, [B

    .line 1
    fill-array-data v2, :array_0

    new-array v3, v1, [B

    fill-array-data v3, :array_1

    invoke-static {v2, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const/4 v2, 0x4

    new-array v3, v2, [B

    fill-array-data v3, :array_2

    new-array v4, v1, [B

    fill-array-data v4, :array_3

    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const/4 v3, 0x2

    new-array v4, v3, [B

    fill-array-data v4, :array_4

    new-array v5, v1, [B

    fill-array-data v5, :array_5

    invoke-static {v4, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    new-array v4, v1, [B

    fill-array-data v4, :array_6

    new-array v5, v1, [B

    fill-array-data v5, :array_7

    invoke-static {v4, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const/4 v4, 0x0

    invoke-static {p0, v0, v3}, L۟/r3;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/ClassLoader;I)Ljava/lang/Class;

    move-result-object p0

    if-eqz p0, :cond_3

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    new-array v0, v1, [B

    .line 2
    fill-array-data v0, :array_8

    new-array v5, v1, [B

    fill-array-data v5, :array_9

    invoke-static {v0, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    new-array v0, v2, [B

    fill-array-data v0, :array_a

    new-array v5, v1, [B

    fill-array-data v5, :array_b

    invoke-static {v0, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v1, [B

    fill-array-data v0, :array_c

    new-array v5, v1, [B

    fill-array-data v5, :array_d

    invoke-static {v0, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    move v5, v4

    goto :goto_1

    :cond_1
    :goto_0
    move v5, v0

    :goto_1
    if-eqz v5, :cond_2

    goto/16 :goto_2

    :cond_2
    array-length v5, p2

    invoke-static {p2, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lde/robv/android/xposed/XposedHelpers;->findMethodExact(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    move-result-object p0

    const/16 p1, 0x14

    new-array p2, p1, [B

    const/16 v5, 0x1a

    aput-byte v5, p2, v4

    const/16 v5, 0x65

    aput-byte v5, p2, v0

    const/16 v5, 0x16

    aput-byte v5, p2, v3

    const/16 v5, -0x6c

    const/4 v6, 0x3

    aput-byte v5, p2, v6

    const/16 v7, 0xe

    aput-byte v7, p2, v2

    const/16 v8, 0x71

    const/4 v9, 0x5

    aput-byte v8, p2, v9

    const/16 v8, 0x8

    aput-byte v8, p2, v1

    const/4 v10, 0x7

    const/16 v11, 0x64

    aput-byte v11, p2, v10

    const/16 v10, 0x17

    aput-byte v10, p2, v8

    const/16 v8, 0x9

    aput-byte v5, p2, v8

    const/16 v5, 0xa

    aput-byte v1, p2, v5

    const/16 v5, 0xb

    const/16 v8, 0x6c

    aput-byte v8, p2, v5

    const/16 v5, 0x1d

    const/16 v8, 0xc

    aput-byte v5, p2, v8

    const/16 v5, 0xd

    const/16 v10, 0x6f

    aput-byte v10, p2, v5

    aput-byte v8, p2, v7

    const/16 v5, 0xf

    const/16 v7, -0x28

    aput-byte v7, p2, v5

    const/16 v5, 0x10

    const/16 v7, 0x6d

    aput-byte v7, p2, v5

    const/16 v5, 0x11

    const/16 v7, 0x3a

    aput-byte v7, p2, v5

    const/16 v5, 0x12

    const/16 v7, 0x52

    aput-byte v7, p2, v5

    const/16 v5, 0x13

    const/16 v7, 0x25

    aput-byte v7, p2, v5

    new-array v1, v1, [B

    const/16 v5, 0x7c

    aput-byte v5, v1, v4

    aput-byte v8, v1, v0

    const/16 v0, 0x78

    aput-byte v0, v1, v3

    const/16 v0, -0x10

    aput-byte v0, v1, v6

    const/16 v0, 0x43

    aput-byte v0, v1, v2

    aput-byte p1, v1, v9

    invoke-static {p2, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {p0, p3}, L۟/s3;->ۥ۟(Ljava/lang/reflect/Method;L۟/g3;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    sget-object p1, L۟/b0;->ۥ:Ljava/lang/StringBuilder;

    invoke-static {p0}, L۟/b0$a;->ۥ(Ljava/lang/Throwable;)V

    :cond_3
    :goto_2
    return-void

    nop

    :array_0
    .array-data 1
        -0x65t
        -0x6ft
        -0x2dt
        -0x7et
        0x22t
        0x3at
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x59t
        -0x1bt
        -0x45t
        -0x15t
        0x51t
        0x4t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x2ct
        0x24t
        -0x20t
        -0x4et
    .end array-data

    :array_3
    .array-data 1
        -0x4bt
        0x56t
        -0x79t
        -0x3ft
        -0x53t
        -0x15t
    .end array-data

    nop

    :array_4
    .array-data 1
        0x7bt
        -0x6ft
    .end array-data

    nop

    :array_5
    .array-data 1
        0x18t
        -0x3t
        -0x30t
        -0x33t
        0x1ft
        0x70t
    .end array-data

    nop

    :array_6
    .array-data 1
        0x44t
        0x68t
        -0x5at
        -0x4ft
        -0x32t
        0x3at
    .end array-data

    nop

    :array_7
    .array-data 1
        0x2ct
        0x7t
        -0x37t
        -0x26t
        -0x55t
        0x48t
    .end array-data

    nop

    :array_8
    .array-data 1
        -0x58t
        0x46t
        0x1et
        0x6ct
        0x54t
        0x68t
    .end array-data

    nop

    :array_9
    .array-data 1
        -0x6ct
        0x32t
        0x76t
        0x5t
        0x27t
        0x56t
    .end array-data

    nop

    :array_a
    .array-data 1
        -0x21t
        0xft
        0x42t
        0x2ft
    .end array-data

    :array_b
    .array-data 1
        -0x42t
        0x7dt
        0x25t
        0x5ct
        0x12t
        0x36t
    .end array-data

    nop

    :array_c
    .array-data 1
        0x68t
        0x35t
        0x5bt
        -0x3t
        0x58t
        -0x51t
    .end array-data

    nop

    :array_d
    .array-data 1
        0x0t
        0x5at
        0x34t
        -0x6at
        0x3dt
        -0x23t
    .end array-data
.end method
