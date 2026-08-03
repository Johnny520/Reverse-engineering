.class public final Lcom/skyhand/redbookhelper/MainActivity$f;
.super L۟/o4;

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/skyhand/redbookhelper/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3",
        "<",
        "Ljava/lang/CharSequence;",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# instance fields
.field public final ۥ:Lcom/skyhand/redbookhelper/MainActivity;


# direct methods
.method public constructor <init>(Lcom/skyhand/redbookhelper/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/skyhand/redbookhelper/MainActivity$f;->ۥ:Lcom/skyhand/redbookhelper/MainActivity;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    const/4 v2, 0x0

    const-string v0, "\u06e7\u06dc\u06e6\u06d8\u06ec\u06e2\u06da\u06d8\u06e4\u06e2\u06e2\u06e6\u06d6\u06d8\u06e0\u06e5\u06e1\u06df\u06e1\u06da\u06d7\u06e6\u06d6\u06e1\u06e8\u06d8\u06dc\u06e6\u06e5\u06d8\u06e6\u06da\u06e8\u06d9\u06d8\u06da\u06e5\u06d8\u06e2\u06db\u06eb\u06ec\u06e5\u06dc\u06eb\u06df\u06e0\u06dc\u06d8\u06dc\u06e5\u06e6\u06e1\u06d6\u06d8\u06d8\u06e8\u06e8\u06df\u06e7\u06e6\u06d8\u06df\u06d6\u06df\u06eb\u06d7\u06db\u06e5\u06d6\u06d8\u06da\u06eb\u06e5\u06d8\u06dc\u06ec\u06e5"

    move-object v1, v0

    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v3, 0x156

    xor-int/2addr v0, v3

    xor-int/lit16 v0, v0, 0x1a5

    const/16 v3, 0x31a

    xor-int/2addr v0, v3

    xor-int/lit16 v0, v0, 0x1c7

    const/16 v3, 0x1d9

    xor-int/2addr v0, v3

    xor-int/lit8 v0, v0, 0x5f

    const/16 v3, 0x2aa

    const v4, -0x78e91ecc

    xor-int/2addr v0, v3

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e6\u06d9\u06eb\u06e8\u06e1\u06e5\u06df\u06e2\u06e7\u06eb\u06dc\u06d8\u06d6\u06e8\u06e0\u06d7\u06d7\u06d9\u06e2\u06d6\u06e1\u06e5\u06df\u06eb\u06e4\u06e8\u06e5\u06d8\u06dc\u06e6\u06dc\u06da\u06e2\u06d9\u06db\u06da\u06d6\u06e7\u06d7\u06eb\u06e6\u06ec\u06e6\u06e2\u06e7\u06d9"

    move-object v1, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06eb\u06e0\u06e1\u06da\u06e7\u06d9\u06df\u06e5\u06d8\u06db\u06e6\u06d8\u06d8\u06dc\u06d6\u06eb\u06e6\u06ec\u06e5\u06d8\u06d8\u06d6\u06e2\u06e6\u06df\u06e6\u06d8\u06ec\u06e5\u06e6\u06e8\u06eb\u06e4\u06eb\u06e1\u06d8\u06e7\u06df\u06d8\u06e7\u06d7\u06eb\u06d9\u06d7\u06d6\u06d8\u06e0\u06da\u06e2\u06e2\u06e7\u06d9\u06df\u06e1\u06df\u06ec\u06e2\u06e2\u06df\u06e5\u06d8\u06e6\u06eb\u06e0\u06e5\u06e5"

    move-object v1, v0

    goto :goto_0

    :sswitch_2
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    const-string v1, "\u06d9\u06e6\u06d6\u06d8\u06da\u06d9\u06e5\u06d8\u06db\u06e6\u06d6\u06db\u06e2\u06e6\u06da\u06dc\u06e5\u06dc\u06dc\u06e5\u06d8\u06dc\u06df\u06e7\u06df\u06e5\u06e6\u06d8\u06d9\u06e7\u06e7\u06eb\u06dc\u06e8\u06d9\u06dc\u06e5\u06d9\u06e7\u06ec\u06da\u06d9\u06e1\u06d7\u06d7\u06e6\u06e0\u06e4\u06dc\u06e5\u06d7\u06d7\u06d9\u06d9\u06d8\u06e0\u06e5\u06d7\u06dc\u06e6\u06d8\u06d9\u06d6\u06dc\u06d8\u06d7\u06d6\u06e7\u06e4\u06df\u06dc\u06da\u06e6\u06e7\u06d8\u06d9\u06da\u06df"

    move-object v2, v0

    goto :goto_0

    :sswitch_3
    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "\u06e0\u06e6\u06d7\u06d7\u06e0\u06df\u06e0\u06e2\u06db\u06e6\u06d6\u06d9\u06dc\u06db\u06d8\u06da\u06df\u06db\u06e0\u06e2\u06e6\u06db\u06e1\u06e1\u06d8\u06e5\u06e1\u06e7\u06d8\u06e2\u06d8\u06e4\u06df\u06eb\u06e8\u06dc\u06e8\u06d8\u06e6\u06e4\u06e6\u06d8\u06d8\u06e2\u06e0\u06e8\u06e2\u06e1"

    move-object v1, v0

    goto :goto_0

    :sswitch_4
    new-instance v0, Lcom/skyhand/redbookhelper/a;

    iget-object v1, p0, Lcom/skyhand/redbookhelper/MainActivity$f;->ۥ:Lcom/skyhand/redbookhelper/MainActivity;

    invoke-direct {v0, v2, v1}, Lcom/skyhand/redbookhelper/a;-><init>(Ljava/lang/CharSequence;Lcom/skyhand/redbookhelper/MainActivity;)V

    invoke-static {v0}, L۟/l3;->ۥۣ۟(L۟/g3;)V

    const-string v0, "\u06e5\u06dc\u06e0\u06d9\u06dc\u06e8\u06d7\u06dc\u06e6\u06e4\u06d7\u06db\u06da\u06dc\u06e1\u06d8\u06e2\u06e7\u06e8\u06d8\u06e6\u06ec\u06e5\u06d8\u06d8\u06db\u06e8\u06db\u06e8\u06d9\u06e1\u06e5\u06d8\u06ec\u06e2\u06d8\u06d8\u06e4\u06da\u06d7\u06e6\u06dc\u06d9\u06ec\u06e8\u06d6\u06d8\u06dc\u06e6\u06df\u06e1\u06da\u06ec\u06ec\u06d9\u06e1\u06d8\u06e8\u06db\u06ec\u06db\u06ec\u06e7\u06e7\u06dc\u06e1\u06d8\u06db\u06e0\u06e6\u06d8\u06d6\u06d8\u06d8\u06d9\u06e5\u06e1\u06d8\u06d7\u06e0\u06e2"

    move-object v1, v0

    goto :goto_0

    :sswitch_5
    sget-object v0, L۟/vb;->ۥ:L۟/vb;

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x646597e9 -> :sswitch_3
        -0x19e17fbe -> :sswitch_1
        0x10c0678d -> :sswitch_5
        0x148c2455 -> :sswitch_4
        0x20989494 -> :sswitch_0
        0x521a857d -> :sswitch_2
    .end sparse-switch

    :array_0
    .array-data 1
        0x66t
        -0x9t
        -0x58t
    .end array-data

    :array_1
    .array-data 1
        0x15t
        -0x7dt
        -0x26t
        -0x2bt
        0x34t
        -0x50t
    .end array-data
.end method
