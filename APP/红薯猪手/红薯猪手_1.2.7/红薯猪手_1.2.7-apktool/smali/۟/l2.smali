.class public final L۟/l2;
.super L۟/o4;

# interfaces
.implements L۟/f3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/f3",
        "<",
        "L\u06df/vb;",
        ">;"
    }
.end annotation


# instance fields
.field public final ۥ:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, L۟/l2;->ۥ:Landroid/app/Activity;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 4

    const-string v0, "\u06df\u06e1\u06e5\u06e8\u06eb\u06ec\u06ec\u06da\u06d6\u06d8\u06df\u06e2\u06d8\u06d8\u06da\u06ec\u06d7\u06d8\u06e4\u06dc\u06e1\u06eb\u06df\u06d9\u06d9\u06d8\u06d8\u06dc\u06e2\u06d8\u06d8\u06da\u06ec\u06d8\u06d8\u06e0\u06db\u06e5\u06d8\u06dc\u06e5\u06e7\u06e0\u06da\u06df\u06e4\u06d9\u06d6\u06d8\u06e2\u06d8\u06e0\u06e0\u06dc\u06dc\u06d8\u06d9\u06db\u06d6\u06eb\u06e5\u06d7\u06df\u06e4\u06d7\u06e1\u06ec\u06e1\u06d8\u06eb\u06df\u06d6\u06d8\u06e0\u06eb\u06df\u06eb\u06e5\u06e8\u06d9\u06db\u06d9"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x26a

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x29a

    const/16 v2, 0x2e5

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2c4

    const/16 v2, 0x184

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1f0

    const/16 v2, 0x8

    const v3, -0x4c13a456

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06eb\u06e6\u06e5\u06d8\u06dc\u06d7\u06dc\u06d8\u06e8\u06e0\u06e5\u06d8\u06dc\u06d9\u06d7\u06da\u06e1\u06eb\u06e6\u06db\u06d6\u06d8\u06db\u06e2\u06d8\u06d7\u06e1\u06e4\u06e1\u06db\u06e1\u06d6\u06e5\u06e1\u06d8\u06e8\u06e6\u06dc\u06d8\u06db\u06d9\u06d7\u06d9\u06d7\u06e4\u06e2\u06d8\u06e6\u06d8\u06e6\u06ec\u06d8\u06df\u06dc\u06df\u06df\u06df\u06da\u06da\u06d9\u06dc\u06d8\u06e7\u06ec\u06e8\u06db\u06e1\u06e7\u06d8\u06e7\u06d9\u06dc\u06d8\u06d8\u06d8\u06e1\u06d9\u06d6\u06d6\u06d8\u06e5\u06db\u06e1"

    goto :goto_0

    :sswitch_1
    new-instance v0, L۟/m5;

    iget-object v1, p0, L۟/l2;->ۥ:Landroid/app/Activity;

    invoke-direct {v0, v1}, L۟/m5;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, L۟/ya;->ۥ۟ۤ(Z)V

    const-string v0, "\u06e7\u06e2\u06e8\u06d8\u06e2\u06ec\u06e7\u06e6\u06e8\u06d6\u06ec\u06e1\u06e4\u06e7\u06d6\u06d9\u06da\u06d8\u06d6\u06d8\u06d6\u06db\u06da\u06e7\u06e2\u06d6\u06d8\u06eb\u06da\u06d8\u06eb\u06e6\u06eb\u06ec\u06da\u06d6\u06eb\u06eb\u06ec\u06e4\u06d7\u06d6\u06d8\u06eb\u06ec\u06e0\u06e8\u06ec\u06e1"

    goto :goto_0

    :sswitch_2
    sget-object v0, L۟/vb;->ۥ:L۟/vb;

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x75b12b7 -> :sswitch_1
        0x28d85b4e -> :sswitch_0
        0x2d7973f4 -> :sswitch_2
    .end sparse-switch
.end method
