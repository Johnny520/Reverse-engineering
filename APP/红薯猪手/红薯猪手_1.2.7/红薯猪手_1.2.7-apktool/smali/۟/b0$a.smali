.class public final L۟/b0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static ۥ(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/16 v2, -0x76

    .line 6
    .line 7
    aput-byte v2, v0, v1

    .line 8
    .line 9
    const/4 v2, 0x6

    .line 10
    new-array v3, v2, [B

    .line 11
    .line 12
    fill-array-data v3, :array_0

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x7

    .line 19
    new-array v0, v0, [B

    .line 20
    .line 21
    fill-array-data v0, :array_1

    .line 22
    .line 23
    .line 24
    new-array v2, v2, [B

    .line 25
    .line 26
    fill-array-data v2, :array_2

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    sget-object v0, L۟/b0;->ۥ:Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    move v0, v1

    .line 45
    :goto_0
    const/4 v2, 0x3

    .line 46
    if-ge v0, v2, :cond_0

    .line 47
    .line 48
    sget-object v2, L۟/b0;->ۥ:Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const/16 v3, 0xa

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    aget-object v3, v3, v0

    .line 60
    .line 61
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    add-int/lit8 v0, v0, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p0}, L۟/h4;->ۥ۟(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    array-length v0, p0

    .line 79
    :goto_1
    if-ge v1, v0, :cond_1

    .line 80
    .line 81
    aget-object v2, p0, v1

    .line 82
    .line 83
    add-int/lit8 v1, v1, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_1
    return-void

    .line 87
    :array_0
    .array-data 1
        -0x11t
        0x6et
        0x30t
        0x34t
        -0x10t
        0x1ct
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
    :array_1
    .array-data 1
        -0x38t
        0x4ft
        -0x3bt
        -0x41t
        -0x5ft
        -0x41t
        -0x36t
    .end array-data

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    :array_2
    .array-data 1
        -0xct
        0x3ct
        -0x60t
        -0x35t
        -0x74t
        -0x80t
    .end array-data
.end method
