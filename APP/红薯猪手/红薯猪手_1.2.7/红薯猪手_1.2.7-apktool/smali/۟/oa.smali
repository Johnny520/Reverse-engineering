.class public final L۟/oa;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ([B[B)Ljava/lang/String;
    .locals 9

    .line 1
    sget v0, L۟/pa;->ۥ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    sput v1, L۟/pa;->ۥ:I

    .line 10
    .line 11
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    array-length v4, v0

    .line 20
    move v5, v3

    .line 21
    :goto_0
    if-ge v5, v4, :cond_2

    .line 22
    .line 23
    aget-object v6, v0, v5

    .line 24
    .line 25
    invoke-virtual {v6}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    const-class v7, L۟/oa;

    .line 30
    .line 31
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_1

    .line 40
    .line 41
    sput v2, L۟/pa;->ۥ:I

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    :goto_1
    sget v0, L۟/pa;->ۥ:I

    .line 48
    .line 49
    if-eq v0, v2, :cond_3

    .line 50
    .line 51
    new-instance p1, Ljava/lang/String;

    .line 52
    .line 53
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 54
    .line 55
    invoke-direct {p1, p0, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 56
    .line 57
    .line 58
    goto :goto_4

    .line 59
    :cond_3
    new-instance v0, Ljava/lang/String;

    .line 60
    .line 61
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 62
    .line 63
    add-int/lit8 v2, v2, 0x63

    .line 64
    .line 65
    const/16 v4, 0x78

    .line 66
    .line 67
    if-ge v2, v4, :cond_4

    .line 68
    .line 69
    new-array p0, v3, [B

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    array-length v4, p0

    .line 73
    array-length v5, p1

    .line 74
    move v6, v3

    .line 75
    :goto_2
    if-ge v6, v4, :cond_6

    .line 76
    .line 77
    if-lt v2, v5, :cond_5

    .line 78
    .line 79
    move v2, v3

    .line 80
    :cond_5
    aget-byte v7, p0, v6

    .line 81
    .line 82
    aget-byte v8, p1, v2

    .line 83
    .line 84
    xor-int/2addr v7, v8

    .line 85
    int-to-byte v7, v7

    .line 86
    aput-byte v7, p0, v6

    .line 87
    .line 88
    add-int/lit8 v6, v6, 0x1

    .line 89
    .line 90
    add-int/2addr v2, v1

    .line 91
    goto :goto_2

    .line 92
    :cond_6
    :goto_3
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 93
    .line 94
    invoke-direct {v0, p0, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 95
    .line 96
    .line 97
    move-object p1, v0

    .line 98
    :goto_4
    return-object p1
.end method
