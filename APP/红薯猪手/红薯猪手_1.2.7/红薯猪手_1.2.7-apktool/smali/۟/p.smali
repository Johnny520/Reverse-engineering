.class public final L۟/p;
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

.field public final synthetic ۥ۟:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, L۟/p;->ۥ:Ljava/lang/String;

    iput p2, p0, L۟/p;->ۥ۟:I

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

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
    sget-object p1, L۟/l3;->ۥ:Landroid/content/Context;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, L۟/p;->ۥ:Ljava/lang/String;

    .line 27
    .line 28
    iget v1, p0, L۟/p;->ۥ۟:I

    .line 29
    .line 30
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 35
    .line 36
    .line 37
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_0
    const/4 p1, 0x7

    .line 41
    new-array p1, p1, [B

    .line 42
    .line 43
    fill-array-data p1, :array_2

    .line 44
    .line 45
    .line 46
    new-array v0, v1, [B

    .line 47
    .line 48
    fill-array-data v0, :array_3

    .line 49
    .line 50
    .line 51
    invoke-static {p1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    throw p1

    .line 60
    nop

    .line 61
    :array_0
    .array-data 1
        -0xet
        -0x11t
    .end array-data

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    nop

    .line 67
    :array_1
    .array-data 1
        -0x65t
        -0x65t
        0x19t
        -0x2ct
        -0x75t
        0x21t
    .end array-data

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    nop

    .line 75
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

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
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
