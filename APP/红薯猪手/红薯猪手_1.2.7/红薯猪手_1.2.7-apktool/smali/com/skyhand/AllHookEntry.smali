.class public final Lcom/skyhand/AllHookEntry;
.super L۟/m3;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, L۟/m3;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/util/ArrayList;
    .locals 4

    const-string v0, "\u06e6\u06df\u06e8\u06d8\u06e5\u06d9\u06e8\u06d8\u06e7\u06db\u06e2\u06d6\u06db\u06d6\u06df\u06ec\u06eb\u06da\u06dc\u06e6\u06d8\u06d7\u06ec\u06e6\u06d6\u06e1\u06e1\u06e6\u06ec\u06d8\u06d7\u06e7\u06d9\u06d8\u06d7\u06d6\u06dc\u06d8\u06dc\u06d8\u06e7\u06e8\u06e7\u06e8\u06d7\u06d6\u06d8\u06e1\u06e4\u06d8\u06d8"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x135

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1ba

    const/16 v2, 0x388

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1e6

    const/16 v2, 0x32a

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x39b

    const/16 v2, 0x17d

    const v3, 0x7db7d0ac

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06d9\u06d9\u06e8\u06dc\u06ec\u06e6\u06da\u06da\u06e6\u06d8\u06e8\u06d9\u06d6\u06e0\u06e1\u06e7\u06d8\u06d9\u06da\u06db\u06d7\u06df\u06d7\u06e4\u06e5\u06e7\u06d8\u06dc\u06e5\u06e1\u06dc\u06eb\u06da\u06db\u06ec\u06e6\u06da\u06d8\u06e1\u06d8\u06e6\u06e5\u06dc\u06d8\u06db\u06df\u06e8\u06dc\u06e1\u06e6\u06d8\u06e1\u06e4\u06e1\u06eb\u06da\u06db\u06e6\u06db\u06d8\u06d8\u06e8\u06e1\u06e8\u06d8\u06d9\u06dc\u06d8\u06d8\u06ec\u06db\u06db\u06e7\u06dc\u06df\u06e0\u06e5\u06e5\u06eb\u06e8"

    goto :goto_0

    :sswitch_1
    const/4 v0, 0x1

    new-array v0, v0, [L۟/v3;

    const/4 v1, 0x0

    new-instance v2, L۟/k8;

    invoke-direct {v2}, L۟/k8;-><init>()V

    aput-object v2, v0, v1

    invoke-static {v0}, L۟/jb;->ۥ۟ۨ([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7cd98278 -> :sswitch_1
        0x5de570c8 -> :sswitch_0
    .end sparse-switch
.end method
