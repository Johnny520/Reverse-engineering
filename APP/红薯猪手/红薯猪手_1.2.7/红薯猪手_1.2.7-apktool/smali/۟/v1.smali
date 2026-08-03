.class public final L۟/v1;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "Landroid/app/Activity;",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, L۟/v1;->ۥ:Ljava/lang/String;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Landroid/app/Activity;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    new-array v0, v0, [B

    .line 5
    .line 6
    fill-array-data v0, :array_0

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x6

    .line 10
    new-array v2, v1, [B

    .line 11
    .line 12
    fill-array-data v2, :array_1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget p1, L۟/o;->ۥ:I

    .line 23
    .line 24
    iget-object p1, p0, L۟/v1;->ۥ:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v0, 0x4

    .line 27
    new-array v0, v0, [B

    .line 28
    .line 29
    fill-array-data v0, :array_2

    .line 30
    .line 31
    .line 32
    new-array v2, v1, [B

    .line 33
    .line 34
    fill-array-data v2, :array_3

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    sget-object v0, L۟/l3;->ۥ:Landroid/content/Context;

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    new-array v1, v1, [Ljava/lang/String;

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    aput-object p1, v1, v3

    .line 54
    .line 55
    invoke-static {v0, v1, v2, v2}, Landroid/media/MediaScannerConnection;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V

    .line 56
    .line 57
    .line 58
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_0
    const/4 p1, 0x7

    .line 62
    new-array p1, p1, [B

    .line 63
    .line 64
    fill-array-data p1, :array_4

    .line 65
    .line 66
    .line 67
    new-array v0, v1, [B

    .line 68
    .line 69
    fill-array-data v0, :array_5

    .line 70
    .line 71
    .line 72
    invoke-static {p1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {p1}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v2

    .line 80
    nop

    .line 81
    :array_0
    .array-data 1
        -0xft
        -0x73t
    .end array-data

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    nop

    .line 87
    :array_1
    .array-data 1
        -0x68t
        -0x7t
        -0x3bt
        0x5at
        -0x13t
        -0x4dt
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
        -0x16t
        0x70t
        0x43t
        -0x21t
    .end array-data

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    :array_3
    .array-data 1
        -0x66t
        0x11t
        0x37t
        -0x49t
        -0xet
        -0x11t
    .end array-data

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    nop

    .line 109
    :array_4
    .array-data 1
        -0x79t
        -0x69t
        0xft
        -0x3t
        -0x9t
        0x4et
        -0x70t
    .end array-data

    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    :array_5
    .array-data 1
        -0x1ct
        -0x8t
        0x61t
        -0x77t
        -0x6et
        0x36t
    .end array-data
.end method
