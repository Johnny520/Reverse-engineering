.class public final L۟/l1;
.super Landroid/text/style/ClickableSpan;


# instance fields
.field public final ۥ:Ljava/lang/String;

.field public final ۥ۟:L۟/h3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u06df/h3",
            "<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            "L\u06df/vb;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;L۟/o$a;)V
    .locals 3

    const/4 v2, 0x6

    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    new-array v1, v2, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const/4 v0, 0x5

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    new-array v1, v2, [B

    fill-array-data v1, :array_3

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    iput-object p1, p0, L۟/l1;->ۥ:Ljava/lang/String;

    iput-object p2, p0, L۟/l1;->ۥ۟:L۟/h3;

    return-void

    nop

    :array_0
    .array-data 1
        0x11t
        0x61t
        0x4ct
        0x7at
    .end array-data

    :array_1
    .array-data 1
        0x65t
        0x4t
        0x34t
        0xet
        -0x1et
        0x7bt
    .end array-data

    nop

    :array_2
    .array-data 1
        0x39t
        -0x69t
        -0x39t
        -0x39t
        -0x7at
    .end array-data

    nop

    :array_3
    .array-data 1
        0x5at
        -0x5t
        -0x52t
        -0x5ct
        -0x13t
        0x48t
    .end array-data
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    const-string v0, "\u06e7\u06da\u06d8\u06e6\u06d8\u06e6\u06d8\u06e5\u06d6\u06d9\u06d9\u06e1\u06d8\u06e0\u06da\u06d8\u06e1\u06df\u06e8\u06d8\u06d7\u06d8\u06e7\u06d7\u06ec\u06e1\u06e0\u06e8\u06dc\u06e4\u06e7\u06da\u06e8\u06e5\u06db\u06e8\u06db\u06df\u06e7\u06dc\u06d6\u06ec\u06d7\u06e2\u06d8\u06e5\u06e5\u06d8"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x1f4

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x86

    const/16 v2, 0xfe

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xde

    const/16 v2, 0x365

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x14

    const/16 v2, 0xf5

    const v3, 0x57693c2a

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06d8\u06e6\u06e7\u06d8\u06df\u06ec\u06d9\u06eb\u06d7\u06d8\u06d8\u06d8\u06e8\u06dc\u06e5\u06eb\u06dc\u06ec\u06da\u06d6\u06d8\u06d7\u06eb\u06e6\u06d8\u06e1\u06d8\u06e6\u06d8\u06df\u06e5\u06db\u06e0\u06e1\u06e0\u06e6\u06e7\u06e4\u06df\u06d8\u06e7\u06eb\u06db\u06d9\u06da\u06dc\u06e5\u06d8\u06df\u06e7\u06eb\u06e0\u06e8\u06e2\u06e0\u06e7\u06e7\u06d9\u06ec\u06d9\u06db\u06e0\u06db\u06d9\u06d8\u06e7\u06e1\u06d9\u06dc\u06df\u06e8\u06eb\u06e8\u06dc\u06e5\u06df\u06da"

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06e6\u06db\u06db\u06e1\u06d9\u06e1\u06d8\u06d6\u06d8\u06d8\u06d8\u06dc\u06eb\u06e7\u06e2\u06d7\u06e2\u06db\u06d6\u06ec\u06df\u06ec\u06d8\u06d8\u06ec\u06d8\u06d9\u06ec\u06e0\u06dc\u06d6\u06db\u06e0\u06ec\u06e8\u06d8\u06dc\u06e2\u06da\u06e0\u06ec\u06db\u06d8\u06d6\u06eb\u06e7\u06da\u06e8\u06d8\u06e4\u06d6\u06e6\u06d8\u06d8\u06e7\u06e7\u06d6\u06e1\u06e0"

    goto :goto_0

    :sswitch_2
    const/4 v0, 0x2

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "\u06e7\u06dc\u06e7\u06d8\u06e7\u06e4\u06dc\u06db\u06e8\u06e6\u06e8\u06e8\u06e4\u06eb\u06e1\u06e2\u06e1\u06ec\u06d6\u06d8\u06e1\u06e6\u06e6\u06d8\u06e6\u06dc\u06e1\u06e6\u06eb\u06e8\u06d8\u06d8\u06e6\u06dc\u06ec\u06dc\u06d6\u06dc\u06e6\u06e6\u06d8\u06e6\u06e1\u06e2\u06dc\u06db\u06d9\u06eb\u06ec\u06e0\u06e2\u06e6\u06dc\u06e5\u06e6\u06d8\u06e2\u06e8\u06e8\u06e5\u06d7\u06d9\u06e8\u06da\u06df\u06e0\u06e6\u06d8\u06ec\u06d9\u06df\u06e0\u06eb\u06e4\u06e4\u06d8\u06d8"

    goto :goto_0

    :sswitch_3
    iget-object v0, p0, L۟/l1;->ۥ۟:L۟/h3;

    iget-object v1, p0, L۟/l1;->ۥ:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, L۟/h3;->ۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "\u06dc\u06eb\u06e1\u06db\u06e4\u06ec\u06e5\u06e7\u06e7\u06e0\u06e5\u06eb\u06d6\u06d6\u06d6\u06ec\u06d7\u06e1\u06d8\u06d8\u06d7\u06e1\u06d8\u06d6\u06da\u06e6\u06d8\u06db\u06e1\u06d6\u06d8\u06e7\u06dc\u06e4\u06e5\u06d7\u06e6\u06e2\u06d8\u06e4\u06e2\u06e4\u06d7\u06e2\u06d7\u06d6\u06df\u06e6"

    goto :goto_0

    :sswitch_4
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6ab3e57c -> :sswitch_1
        -0x35605682 -> :sswitch_4
        -0xe5a2b4 -> :sswitch_3
        0x12d40034 -> :sswitch_0
        0x2f508974 -> :sswitch_2
    .end sparse-switch

    :array_0
    .array-data 1
        -0x3bt
        0x10t
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x4bt
        0x20t
        -0x3ft
        -0x4dt
        0x3t
        -0x30t
    .end array-data
.end method

.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 4

    const-string v0, "\u06e6\u06e8\u06df\u06da\u06da\u06d6\u06d8\u06da\u06dc\u06da\u06eb\u06e4\u06d9\u06e2\u06e2\u06da\u06d8\u06d9\u06e5\u06d8\u06e2\u06e1\u06da\u06d8\u06d7\u06ec\u06e5\u06db\u06e8\u06d8\u06e4\u06e8\u06e6\u06db\u06d7\u06dc\u06e1\u06e7\u06e2\u06d8\u06e6\u06dc\u06d9\u06e5\u06d7\u06da\u06db\u06d8\u06e8\u06e7\u06e0\u06db\u06d6\u06da\u06e8\u06e6\u06d8\u06d8\u06d7\u06d8\u06e7\u06d8\u06e5\u06e1\u06eb\u06e8\u06e8\u06d6\u06e2\u06d6\u06d9\u06dc\u06db\u06dc\u06d8\u06db\u06e0\u06eb"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x12a

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x3e

    const/16 v2, 0x36

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x16b

    const/16 v2, 0x3cf

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x5f

    const/16 v2, 0x3b9

    const v3, 0x784c383e

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06ec\u06e4\u06e6\u06e5\u06d7\u06e5\u06e0\u06df\u06df\u06d9\u06df\u06d8\u06d8\u06e7\u06d8\u06e7\u06dc\u06d8\u06d7\u06e2\u06d7\u06dc\u06ec\u06e2\u06e2\u06e7\u06d8\u06db\u06d8\u06da\u06e4\u06d7\u06e8\u06d6\u06e1\u06e5\u06db\u06e1\u06da\u06dc\u06e1\u06d8\u06db\u06d9\u06d8"

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06e1\u06d9\u06dc\u06d8\u06d9\u06d6\u06eb\u06da\u06d6\u06e6\u06d8\u06e7\u06eb\u06e1\u06d8\u06da\u06d6\u06e1\u06e5\u06d6\u06e5\u06e6\u06d8\u06dc\u06df\u06da\u06ec\u06df\u06dc\u06e2\u06d8\u06e6\u06e1\u06d8\u06d7\u06da\u06d6\u06e0\u06da\u06df\u06e1\u06e4\u06d8\u06d8\u06e2\u06da\u06e0\u06e1\u06e8\u06e2\u06d6\u06e1\u06d6\u06d8\u06e8\u06d7\u06da\u06e1\u06d8\u06e7\u06d8\u06ec\u06e4\u06e2\u06d6\u06e5\u06e5\u06d8\u06eb\u06e5\u06e6\u06d7\u06ec\u06e7\u06ec\u06e8\u06d8\u06e0\u06db\u06e1\u06eb\u06e0\u06da\u06eb\u06e0\u06e4\u06e1"

    goto :goto_0

    :sswitch_2
    const/4 v0, 0x2

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "\u06eb\u06df\u06e8\u06d8\u06e4\u06e1\u06dc\u06ec\u06d8\u06e4\u06e0\u06e5\u06e6\u06e1\u06db\u06e2\u06e4\u06db\u06e7\u06eb\u06e4\u06e5\u06eb\u06e0\u06e1\u06ec\u06ec\u06e5\u06ec\u06df\u06d6\u06d8\u06e1\u06d8\u06d9\u06da\u06df\u06d6\u06db\u06d6\u06d8\u06da\u06d6\u06e2\u06d6\u06e7\u06eb\u06dc\u06e1\u06d6\u06d8\u06ec\u06e6\u06e1\u06db\u06e2\u06ec\u06e1\u06e7\u06e2\u06dc\u06db\u06e8\u06d8\u06d7\u06d9\u06db"

    goto :goto_0

    :sswitch_3
    invoke-super {p0, p1}, Landroid/text/style/ClickableSpan;->updateDrawState(Landroid/text/TextPaint;)V

    const-string v0, "\u06eb\u06dc\u06e7\u06e4\u06e6\u06d6\u06e4\u06d6\u06df\u06eb\u06ec\u06d8\u06d8\u06e8\u06db\u06dc\u06d8\u06e2\u06ec\u06d6\u06d8\u06db\u06d8\u06e7\u06d8\u06e7\u06da\u06e8\u06eb\u06df\u06e6\u06d8\u06e5\u06d7\u06dc\u06e4\u06e8\u06d8\u06e1\u06d7\u06e6\u06da\u06e0\u06e5\u06d8\u06db\u06dc\u06d8\u06d7\u06e7\u06d7\u06e0\u06ec\u06d8\u06df\u06e6\u06e1\u06e7\u06e5\u06d8\u06e0\u06e0\u06d8\u06d8\u06ec\u06e8\u06e8\u06d8\u06e2\u06eb\u06da\u06e2\u06e4\u06e1\u06e4\u06d8\u06db\u06d6\u06eb\u06e6"

    goto :goto_0

    :sswitch_4
    const v0, -0xff0100

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    const-string v0, "\u06db\u06db\u06e0\u06e7\u06e2\u06e6\u06e1\u06e5\u06da\u06e2\u06dc\u06e8\u06db\u06e1\u06df\u06db\u06d6\u06e0\u06e7\u06d8\u06d8\u06ec\u06d6\u06d7\u06d8\u06da\u06e5\u06d8\u06d7\u06e5\u06e5\u06d8\u06eb\u06e8\u06ec\u06e5\u06e1\u06e0\u06d7\u06ec\u06e1\u06d8\u06e8\u06e1\u06e5\u06eb\u06e1\u06d6\u06da\u06d7\u06dc\u06d8\u06d8\u06e7\u06eb\u06d7\u06d7\u06e0\u06e0\u06eb\u06df\u06e8\u06e0\u06e1\u06d8\u06dc\u06db\u06d6\u06d7\u06d8\u06e5\u06e2\u06eb\u06d9\u06eb\u06da"

    goto :goto_0

    :sswitch_5
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    const-string v0, "\u06db\u06e8\u06e4\u06dc\u06dc\u06db\u06db\u06e4\u06e1\u06d8\u06eb\u06e7\u06d6\u06d8\u06df\u06e2\u06dc\u06db\u06df\u06da\u06da\u06d9\u06e8\u06e2\u06d8\u06d8\u06d8\u06d8\u06e0\u06e5\u06d8\u06d7\u06e4\u06e2\u06e0\u06df\u06e2\u06d6\u06e6\u06e8\u06d8\u06e0\u06e5\u06d8\u06da\u06dc\u06ec\u06db\u06d8\u06e1\u06d8"

    goto :goto_0

    :sswitch_6
    invoke-virtual {p1}, Landroid/graphics/Paint;->clearShadowLayer()V

    const-string v0, "\u06e4\u06df\u06e2\u06eb\u06e6\u06da\u06e0\u06d6\u06dc\u06d8\u06dc\u06df\u06e1\u06e4\u06df\u06e2\u06d9\u06eb\u06e8\u06db\u06eb\u06d9\u06e1\u06d6\u06e8\u06d8\u06e4\u06dc\u06ec\u06ec\u06e7\u06d9\u06e7\u06d7\u06e7\u06e6\u06e2\u06e1\u06da\u06dc\u06e5\u06e2\u06e4\u06dc\u06df\u06e7\u06e1\u06ec\u06d6\u06e0\u06ec\u06e1\u06e4\u06df\u06d8\u06d6\u06dc\u06e0\u06da\u06e7\u06e1\u06eb\u06e4\u06e6\u06e1\u06d8\u06df\u06db\u06d9\u06eb\u06e2\u06d6\u06d8\u06e8\u06d8\u06dc"

    goto :goto_0

    :sswitch_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x73890ce7 -> :sswitch_3
        -0x5e3efb83 -> :sswitch_4
        -0x5cb94d8f -> :sswitch_7
        -0x57598b76 -> :sswitch_6
        -0x2d2b7aae -> :sswitch_5
        -0x1d373138 -> :sswitch_0
        -0x1863e735 -> :sswitch_1
        0x7951d136 -> :sswitch_2
    .end sparse-switch

    :array_0
    .array-data 1
        0x32t
        0x15t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x56t
        0x66t
        0x1at
        -0x2et
        -0x40t
        0x3t
    .end array-data
.end method
