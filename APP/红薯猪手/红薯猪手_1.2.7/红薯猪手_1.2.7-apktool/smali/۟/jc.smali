.class public final L۟/jc;
.super L۟/za;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, L۟/za;-><init>()V

    return-void
.end method

.method public static final ۥ۟۟(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 6

    iget-object p0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const/16 v0, 0xa

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, L۟/k8;->ۥۣ۟:L۟/k;

    invoke-static {}, L۟/k8$a;->ۥ۟()L۟/k;

    move-result-object v0

    iget-object v0, v0, L۟/k;->ۥۥۨ:Ljava/lang/String;

    invoke-static {p0, v0}, L۟/r3;->ۥ۟ۥ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, L۟/f6;->ۥ۟ۨ:Ljava/util/ArrayList;

    const/4 v0, 0x5

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    new-array v2, v1, [B

    fill-array-data v2, :array_3

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, L۟/r3;->ۥ۟ۥ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x3

    const-string v3, ""

    if-eqz v0, :cond_1

    new-array v4, v2, [B

    fill-array-data v4, :array_4

    new-array v5, v1, [B

    fill-array-data v5, :array_5

    invoke-static {v4, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, L۟/r3;->ۥ۟ۥ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    move-object v0, v3

    :cond_2
    invoke-static {v0}, L۟/f6$a;->ۥ(Ljava/lang/String;)V

    const/16 v0, 0xb

    new-array v0, v0, [B

    fill-array-data v0, :array_6

    new-array v4, v1, [B

    fill-array-data v4, :array_7

    invoke-static {v0, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, L۟/r3;->ۥ۟ۥ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_4

    new-array v0, v2, [B

    fill-array-data v0, :array_8

    new-array v1, v1, [B

    fill-array-data v1, :array_9

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, L۟/r3;->ۥ۟ۥ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    move-object v3, p0

    :cond_4
    :goto_0
    invoke-static {v3}, L۟/f6$a;->ۥ۟(Ljava/lang/String;)V

    :goto_1
    return-void

    nop

    :array_0
    .array-data 1
        -0x48t
        -0x2t
        0x6t
        -0x3bt
        0x54t
        -0x65t
        -0x5at
        -0xdt
        0xct
        -0x3et
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x34t
        -0x6at
        0x6ft
        -0x4at
        0x1bt
        -0x7t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x23t
        -0x17t
        0x34t
        0x4bt
        -0x69t
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x55t
        -0x80t
        0x50t
        0x2et
        -0x8t
        0x4bt
    .end array-data

    nop

    :array_4
    .array-data 1
        0x9t
        -0x1at
        0x21t
    .end array-data

    :array_5
    .array-data 1
        0x7ct
        -0x6ct
        0x4dt
        0x2ft
        -0x2bt
        -0x6ct
    .end array-data

    nop

    :array_6
    .array-data 1
        -0x6dt
        -0x7t
        0x1dt
        -0x4at
        -0x1et
        -0x52t
        -0x55t
        -0x9t
        0x0t
        -0x44t
        -0xft
    .end array-data

    :array_7
    .array-data 1
        -0x3t
        -0x68t
        0x69t
        -0x21t
        -0x6ct
        -0x35t
    .end array-data

    nop

    :array_8
    .array-data 1
        -0x1et
        0x73t
        -0x78t
    .end array-data

    :array_9
    .array-data 1
        -0x69t
        0x1t
        -0x1ct
        0x79t
        -0x7bt
        -0x45t
    .end array-data
.end method


# virtual methods
.method public final ۥ(Ljava/lang/String;)V
    .locals 4

    .line 1
    const/16 v0, 0xb

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
    new-array v2, v1, [B

    .line 10
    .line 11
    fill-array-data v2, :array_1

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, L۟/k8;->ۥۣ۟:L۟/k;

    .line 22
    .line 23
    iget-object p1, p1, L۟/k;->ۥۥۦ:Ljava/lang/String;

    .line 24
    .line 25
    const/16 v0, 0x1c

    .line 26
    .line 27
    new-array v0, v0, [B

    .line 28
    .line 29
    fill-array-data v0, :array_2

    .line 30
    .line 31
    .line 32
    new-array v1, v1, [B

    .line 33
    .line 34
    fill-array-data v1, :array_3

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0, p1}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    sget-object v0, L۟/k8;->ۥۣ۟:L۟/k;

    .line 45
    .line 46
    iget-object v0, v0, L۟/k;->ۥۥۧ:Ljava/lang/String;

    .line 47
    .line 48
    const/4 v1, 0x4

    .line 49
    new-array v1, v1, [Ljava/lang/Object;

    .line 50
    .line 51
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    aput-object v2, v1, v3

    .line 55
    .line 56
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    const/4 v3, 0x1

    .line 59
    aput-object v2, v1, v3

    .line 60
    .line 61
    const/4 v2, 0x2

    .line 62
    const-class v3, Ljava/lang/Long;

    .line 63
    .line 64
    aput-object v3, v1, v2

    .line 65
    .line 66
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 67
    .line 68
    const/4 v3, 0x3

    .line 69
    aput-object v2, v1, v3

    .line 70
    .line 71
    sget-object v2, L۟/jc$a;->ۥ:L۟/jc$a;

    .line 72
    .line 73
    invoke-static {p1, v0, v1, v2}, L۟/r3;->ۥ۠ۢ(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;L۟/g3;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :array_0
    .array-data 1
        -0x54t
        -0x2ft
        0x3t
        0x39t
        0x4t
        -0x78t
        -0x51t
        -0x13t
        0xdt
        0x37t
        0x4t
    .end array-data

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    :array_1
    .array-data 1
        -0x24t
        -0x5dt
        0x6ct
        0x5at
        0x61t
        -0x5t
    .end array-data

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    nop

    .line 95
    :array_2
    .array-data 1
        -0x47t
        0x45t
        -0x2ft
        0x6bt
        0x60t
        0x30t
        -0x65t
        0x49t
        -0x28t
        0x5et
        0x63t
        0x18t
        -0x6at
        0x49t
        -0x39t
        0x4dt
        0x60t
        0x17t
        -0x65t
        0x5et
        -0x26t
        0x62t
        0x63t
        0x1ct
        -0x63t
        0x6ft
        -0x27t
        0x7dt
    .end array-data

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    :array_3
    .array-data 1
        -0x11t
        0x2ct
        -0x4bt
        0xet
        0xft
        0x79t
    .end array-data
.end method
