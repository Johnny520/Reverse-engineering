.class public final L۟/l9;
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
.field public final ۥ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, L۟/l9;->ۥ:Ljava/util/ArrayList;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 4

    const-string v0, "\u06eb\u06d6\u06da\u06ec\u06e6\u06e2\u06e8\u06e5\u06e7\u06d8\u06df\u06e5\u06d9\u06df\u06e0\u06e5\u06eb\u06e5\u06e6\u06e6\u06e0\u06d8\u06d8\u06da\u06d9\u06e6\u06d8\u06da\u06dc\u06e8\u06da\u06d9\u06d6\u06eb\u06db\u06d9\u06da\u06e4\u06df\u06eb\u06d7\u06dc\u06d8\u06e0\u06e7\u06d8\u06d8\u06e7\u06d7\u06d6\u06d8\u06e0\u06e1\u06dc\u06d8\u06e6\u06ec\u06e8\u06d8\u06e5\u06d9\u06d7\u06ec\u06db\u06df\u06d8\u06dc\u06d6\u06d8\u06ec\u06d7\u06e6\u06da\u06d8\u06e7\u06e0\u06d8\u06eb\u06e5\u06e5\u06d7"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0xe7

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x33e

    const/16 v2, 0x19

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3d0

    const/16 v2, 0x105

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x9e

    const/16 v2, 0x1cf

    const v3, -0x797a8e31

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06db\u06e4\u06e7\u06e1\u06e8\u06e8\u06d6\u06e7\u06d8\u06d8\u06d9\u06e2\u06d8\u06d6\u06e6\u06e7\u06d8\u06d6\u06e6\u06e2\u06e0\u06d9\u06dc\u06d8\u06df\u06e4\u06d6\u06e6\u06db\u06e4\u06df\u06da\u06d9\u06e7\u06e5\u06e0\u06d8\u06d8\u06da\u06e2\u06d6\u06e0\u06e1\u06e8\u06e1\u06d8\u06eb\u06df\u06dc\u06d8\u06da\u06da\u06e8\u06d8\u06e8\u06e8\u06e4\u06d9\u06d8\u06e1\u06d8"

    goto :goto_0

    :sswitch_1
    sget-object v0, L۟/w1;->ۥ:Ljava/lang/String;

    const-string v0, "\u06e8\u06d7\u06e8\u06d8\u06e1\u06e0\u06e0\u06e7\u06e5\u06d6\u06d8\u06e5\u06e4\u06e8\u06dc\u06e0\u06df\u06d7\u06e1\u06d8\u06d6\u06e5\u06df\u06ec\u06df\u06da\u06d7\u06d6\u06e5\u06d8\u06e4\u06e4\u06e5\u06d8\u06e2\u06e1\u06d8\u06e0\u06dc\u06d9\u06da\u06df\u06d8\u06d8\u06e2\u06e1\u06e4\u06d9\u06e2\u06e6\u06db\u06d6\u06d8\u06d8\u06e2\u06e8\u06e1\u06d8\u06da\u06ec\u06d6\u06dc\u06e7\u06e8\u06d8\u06d8\u06d8\u06d6\u06d6\u06dc\u06e5\u06e0\u06da\u06d6\u06d8\u06d9\u06e5\u06dc\u06dc\u06d8"

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, L۟/l9;->ۥ:Ljava/util/ArrayList;

    invoke-static {v0}, L۟/w1;->ۥ۟۟(Ljava/util/List;)V

    const-string v0, "\u06e5\u06dc\u06d6\u06d8\u06e6\u06da\u06d6\u06d8\u06e4\u06e8\u06d6\u06d8\u06e5\u06ec\u06e6\u06d8\u06e0\u06e2\u06db\u06d9\u06ec\u06d6\u06d8\u06dc\u06eb\u06d7\u06e4\u06df\u06d9\u06df\u06d7\u06e2\u06e2\u06e8\u06e0\u06dc\u06e1\u06d8\u06e5\u06d8\u06e5\u06dc\u06ec\u06e7\u06e0\u06e5\u06d8\u06d7\u06dc\u06e1\u06da\u06d9\u06d6\u06da\u06d7\u06e5\u06e1\u06e2\u06dc"

    goto :goto_0

    :sswitch_3
    sget-object v0, L۟/vb;->ۥ:L۟/vb;

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x342f24a4 -> :sswitch_2
        0x55122ef6 -> :sswitch_1
        0x578e195e -> :sswitch_0
        0x584bc4c4 -> :sswitch_3
    .end sparse-switch
.end method
