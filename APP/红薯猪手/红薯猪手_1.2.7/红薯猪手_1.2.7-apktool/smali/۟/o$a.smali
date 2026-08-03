.class public final L۟/o$a;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/h3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/o;->ۥ۟ۧ(Landroid/widget/TextView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/h3<",
        "Ljava/lang/String;",
        "Landroid/view/View;",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 0

    iput-object p1, p0, L۟/o$a;->ۥ:Landroid/widget/TextView;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    check-cast p2, Landroid/view/View;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/16 v2, 0xe

    .line 10
    .line 11
    aput-byte v2, v0, v1

    .line 12
    .line 13
    const/4 v2, 0x6

    .line 14
    new-array v3, v2, [B

    .line 15
    .line 16
    fill-array-data v3, :array_0

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const/16 v0, 0x17

    .line 27
    .line 28
    new-array v0, v0, [B

    .line 29
    .line 30
    fill-array-data v0, :array_1

    .line 31
    .line 32
    .line 33
    new-array v2, v2, [B

    .line 34
    .line 35
    fill-array-data v2, :array_2

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0, p2}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p2, p0, L۟/o$a;->ۥ:Landroid/widget/TextView;

    .line 46
    .line 47
    sget v0, L۟/o;->ۥ:I

    .line 48
    .line 49
    invoke-static {p1}, L۟/o;->ۥ(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setHighlightColor(I)V

    .line 53
    .line 54
    .line 55
    sget-object p1, L۟/vb;->ۥ:L۟/vb;

    .line 56
    .line 57
    return-object p1

    .line 58
    nop

    .line 59
    :array_0
    .array-data 1
        0x7at
        -0x35t
        0x62t
        -0x23t
        -0xet
        0xet
    .end array-data

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    nop

    .line 67
    :array_1
    .array-data 1
        -0x25t
        0x70t
        -0x67t
        -0x22t
        -0x1ct
        0x47t
        -0x76t
        0x7et
        -0x7et
        -0x3et
        -0x56t
        0x4et
        -0x7at
        0x63t
        -0x6at
        -0x24t
        -0x11t
        0x4at
        -0x7et
        0x63t
        -0x29t
        -0x80t
        -0x4ct
    .end array-data

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    :array_2
    .array-data 1
        -0x19t
        0x11t
        -0x9t
        -0x4ft
        -0x76t
        0x3et
    .end array-data
.end method
