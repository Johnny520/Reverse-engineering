.class public final L۟/ea$a;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/f3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/ea;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/f3<",
        "Landroid/content/SharedPreferences;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥ:L۟/ea$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, L۟/ea$a;

    invoke-direct {v0}, L۟/ea$a;-><init>()V

    sput-object v0, L۟/ea$a;->ۥ:L۟/ea$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, L۟/l3;->ۥ:Landroid/content/Context;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/16 v2, 0x1d

    .line 7
    .line 8
    new-array v2, v2, [B

    .line 9
    .line 10
    fill-array-data v2, :array_0

    .line 11
    .line 12
    .line 13
    new-array v1, v1, [B

    .line 14
    .line 15
    fill-array-data v1, :array_1

    .line 16
    .line 17
    .line 18
    invoke-static {v2, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :cond_0
    const/4 v0, 0x7

    .line 29
    new-array v0, v0, [B

    .line 30
    .line 31
    fill-array-data v0, :array_2

    .line 32
    .line 33
    .line 34
    new-array v1, v1, [B

    .line 35
    .line 36
    fill-array-data v1, :array_3

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    throw v0

    .line 48
    nop

    .line 49
    :array_0
    .array-data 1
        0x7dt
        0x2bt
        -0x1t
        0x33t
        0x55t
        0x38t
        0x67t
        0x2ct
        -0xdt
        0x73t
        0x42t
        0x7dt
        0x7ct
        0x25t
        -0x1ft
        0x78t
        0x5et
        0x23t
        0x76t
        0x21t
        -0x2t
        0x6dt
        0x43t
        0x21t
        0x30t
        0x27t
        -0x3t
        0x73t
        0x40t
    .end array-data

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    nop

    .line 69
    :array_1
    .array-data 1
        0x1et
        0x44t
        -0x6et
        0x1dt
        0x26t
        0x53t
    .end array-data

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    nop

    .line 77
    :array_2
    .array-data 1
        -0x79t
        -0x69t
        0xft
        -0x3t
        -0x9t
        0x4et
        -0x70t
    .end array-data

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    :array_3
    .array-data 1
        -0x1ct
        -0x8t
        0x61t
        -0x77t
        -0x6et
        0x36t
    .end array-data
.end method
