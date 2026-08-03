.class public final L۟/o7$a;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/f3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/o7;
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
.field public static final ۥ:L۟/o7$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, L۟/o7$a;

    invoke-direct {v0}, L۟/o7$a;-><init>()V

    sput-object v0, L۟/o7$a;->ۥ:L۟/o7$a;

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
    const/16 v2, 0x12

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
        -0x4ft
        -0x78t
        0x34t
        -0x38t
        0x68t
        -0x51t
        -0x55t
        -0x71t
        0x38t
        -0x78t
        0x7ft
        -0x16t
        -0x60t
        -0x7et
        0x3at
        -0x77t
        0x69t
        -0x60t
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
    nop

    .line 63
    :array_1
    .array-data 1
        -0x2et
        -0x19t
        0x59t
        -0x1at
        0x1bt
        -0x3ct
    .end array-data

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    nop

    .line 71
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

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
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
