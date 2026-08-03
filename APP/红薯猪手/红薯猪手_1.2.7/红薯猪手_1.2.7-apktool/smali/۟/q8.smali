.class public final L۟/q8;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field public ۥ:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    const-string v0, "\u06e2\u06e4\u06dc\u06d8\u06e4\u06eb\u06db\u06db\u06d8\u06e6\u06ec\u06e1\u06d7\u06d9\u06dc\u06d6\u06d8\u06e8\u06db\u06e1\u06d8\u06e2\u06d8\u06e5\u06d8\u06d6\u06db\u06e1\u06d9\u06d9\u06ec\u06d9\u06da\u06e7\u06e2\u06d7\u06eb\u06e0\u06d9\u06d9\u06d7\u06eb\u06d6\u06d8\u06e5\u06d9\u06d9\u06ec\u06e1\u06e6\u06e6\u06da\u06e1\u06d8\u06e8\u06e0\u06d6\u06d9\u06e7\u06df"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x197

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x366

    const/16 v2, 0xa1

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xa6

    const/16 v2, 0x85

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2cf

    const/16 v2, 0x19b

    const v3, 0x143cdeb9

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06ec\u06eb\u06d9\u06e4\u06e4\u06e6\u06d8\u06dc\u06e0\u06d9\u06df\u06dc\u06d7\u06d8\u06e1\u06d8\u06ec\u06eb\u06da\u06da\u06e8\u06d8\u06d8\u06d9\u06e8\u06d7\u06e1\u06e8\u06d7\u06e5\u06da\u06db\u06dc\u06dc\u06e8\u06e5\u06d8\u06e2\u06e8\u06da\u06e5\u06d6\u06da\u06d8\u06d8\u06e0\u06d9\u06df\u06db\u06ec\u06df\u06e7\u06e5\u06d8\u06df\u06d8\u06db\u06d7\u06e5\u06e7\u06d8\u06e0\u06eb\u06e8\u06d8\u06d6\u06dc\u06e1\u06d8\u06ec\u06d7\u06ec\u06eb\u06d7\u06d6\u06d8\u06da\u06e8\u06d8"

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, L۟/q8;->ۥ:Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x6d92f219 -> :sswitch_0
        0x6c209da1 -> :sswitch_1
    .end sparse-switch
.end method
