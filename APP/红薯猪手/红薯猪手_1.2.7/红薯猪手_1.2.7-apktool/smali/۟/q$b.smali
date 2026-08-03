.class public final L۟/q$b;
.super L۟/o4;

# interfaces
.implements L۟/f3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/f3",
        "<",
        "Ljava/util/concurrent/ExecutorService;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥ:L۟/q$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/16 v3, 0xe3

    const-string v0, "\u06e8\u06df\u06e5\u06e4\u06e5\u06da\u06d7\u06d8\u06d9\u06dc\u06e2\u06df\u06dc\u06eb\u06e6\u06eb\u06e6\u06e5\u06e7\u06e4\u06e6\u06dc\u06d8\u06e7\u06e4\u06d9\u06da\u06d8\u06e6\u06d8\u06ec\u06e8\u06d8\u06d8\u06e6\u06db\u06e7\u06e8\u06e6\u06dc\u06e7\u06d8\u06e7\u06d8\u06ec\u06e4\u06e8\u06d8\u06df\u06d8\u06e7\u06da\u06e0\u06d8\u06d8\u06e6\u06d7\u06e5\u06e2\u06d9\u06dc\u06e4\u06d6\u06e8\u06d8\u06d8\u06d9\u06e1\u06d8\u06d7\u06e5\u06d9\u06dc\u06e2\u06d8\u06e6\u06e8\u06db\u06e1\u06df\u06d8\u06d8\u06eb\u06d8\u06e1\u06e0\u06df\u06da"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x21f

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x251

    xor-int/2addr v1, v3

    xor-int/lit16 v1, v1, 0x2c5

    const/16 v2, 0x9d

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x276

    const v2, -0x20862406

    xor-int/2addr v1, v3

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v0, L۟/q$b;

    invoke-direct {v0}, L۟/q$b;-><init>()V

    sput-object v0, L۟/q$b;->ۥ:L۟/q$b;

    const-string v0, "\u06e2\u06e8\u06e8\u06d8\u06e0\u06db\u06d9\u06e7\u06d9\u06d6\u06d8\u06e1\u06e1\u06db\u06da\u06e5\u06d6\u06d8\u06d6\u06ec\u06d6\u06d8\u06e8\u06da\u06e6\u06d8\u06e6\u06e4\u06e8\u06d8\u06db\u06e7\u06d7\u06eb\u06dc\u06e5\u06d8\u06da\u06e0\u06e6\u06d8\u06e6\u06db\u06e2\u06e2\u06e4\u06df\u06d9\u06e7\u06e6\u06e0\u06e0\u06e7\u06e7\u06d9\u06e4\u06d7\u06d9\u06eb\u06e2\u06d6\u06d8\u06df\u06d8\u06e1\u06e6\u06da\u06e7\u06da\u06dc\u06d8\u06d8\u06d9\u06d7\u06d9\u06d7\u06e0\u06e6\u06d8\u06e5\u06d8\u06d8"

    goto :goto_0

    :sswitch_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x589cc47d -> :sswitch_1
        0x6d1bc82a -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 4

    const-string v0, "\u06d6\u06d8\u06ec\u06d9\u06e1\u06e7\u06d8\u06e8\u06e4\u06db\u06e1\u06d6\u06e1\u06d8\u06d6\u06eb\u06eb\u06e2\u06e8\u06e8\u06d8\u06df\u06d7\u06e7\u06d7\u06e6\u06e7\u06e8\u06df\u06e1\u06e6\u06e0\u06db\u06d9\u06d9\u06e5\u06ec\u06e5\u06db\u06d9\u06df\u06eb\u06db\u06eb\u06d8\u06e0\u06e6\u06dc\u06eb\u06e4\u06df\u06e8\u06e7\u06e7\u06e4\u06db\u06d8\u06e0\u06e2\u06e1\u06da\u06da\u06e1\u06dc\u06e5\u06d8\u06d8\u06da\u06eb\u06e6\u06df\u06db\u06e1\u06d6\u06d7\u06d6"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x256

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1e1

    const/16 v2, 0xb5

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x196

    const/16 v2, 0x2df

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x67

    const/16 v2, 0x3a3

    const v3, -0x6f2524

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06d7\u06e7\u06d8\u06d8\u06e1\u06e2\u06e4\u06dc\u06d6\u06d6\u06d8\u06d9\u06d7\u06d8\u06dc\u06d7\u06eb\u06e6\u06da\u06d6\u06e1\u06da\u06e0\u06dc\u06e5\u06eb\u06da\u06e7\u06e4\u06ec\u06eb\u06e5\u06eb\u06db\u06e5\u06e5\u06e7\u06d8\u06e7\u06d8\u06d9\u06d7\u06d9\u06d6\u06d6\u06db\u06e8"

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x6b2da22 -> :sswitch_0
        0x54e0cd5c -> :sswitch_1
    .end sparse-switch
.end method
