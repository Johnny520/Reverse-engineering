.class public final L۟/q$a;
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
        "Landroid/os/Handler;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥ:L۟/q$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "\u06e7\u06e6\u06e0\u06e0\u06e8\u06db\u06e6\u06e7\u06e6\u06d9\u06db\u06e6\u06e8\u06e8\u06df\u06dc\u06d8\u06e8\u06e1\u06d6\u06db\u06d8\u06e2\u06db\u06e4\u06e6\u06d8\u06ec\u06e8\u06e1\u06dc\u06eb\u06da\u06e1\u06e1\u06e1\u06d8\u06e2\u06eb\u06e8\u06d8\u06e5\u06ec\u06e6\u06d9\u06e4\u06ec\u06dc\u06e7\u06d6\u06d8\u06d7\u06df\u06e6\u06ec\u06d8\u06ec"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x2ed

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x4e

    const/16 v2, 0xfa

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1f0

    const/16 v2, 0x392

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3f3

    const/16 v2, 0xbf

    const v3, 0x525c094a

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v0, L۟/q$a;

    invoke-direct {v0}, L۟/q$a;-><init>()V

    sput-object v0, L۟/q$a;->ۥ:L۟/q$a;

    const-string v0, "\u06d6\u06e1\u06e4\u06e5\u06d9\u06e8\u06d8\u06d6\u06db\u06df\u06dc\u06e4\u06e2\u06e4\u06e8\u06e6\u06e2\u06e6\u06da\u06eb\u06d6\u06e4\u06ec\u06e8\u06da\u06da\u06d6\u06eb\u06e2\u06d8\u06d8\u06e4\u06e8\u06dc\u06d9\u06db\u06ec\u06e8\u06d8\u06e8\u06d8\u06e1\u06ec\u06ec\u06e2\u06e7\u06e8\u06d7\u06d9\u06ec\u06e6\u06dc\u06e5\u06e6\u06d6\u06e7\u06e1\u06d6\u06dc\u06e2\u06eb\u06df\u06da\u06e2\u06dc\u06d8\u06d8\u06ec\u06e5\u06e7\u06e7\u06e5\u06d8\u06d9\u06d9\u06d7\u06e6\u06d9\u06eb\u06e2\u06e2\u06da\u06e1\u06db\u06e8\u06d8"

    goto :goto_0

    :sswitch_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x2968be06 -> :sswitch_1
        0x75a86949 -> :sswitch_0
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

    const-string v0, "\u06db\u06e8\u06ec\u06e6\u06d7\u06da\u06e7\u06e2\u06e6\u06d9\u06e7\u06d6\u06e2\u06e5\u06d8\u06e6\u06e4\u06d7\u06dc\u06d7\u06e7\u06da\u06e7\u06e5\u06d8\u06e6\u06e4\u06e5\u06e0\u06e5\u06da\u06e7\u06db\u06dc\u06d8\u06e7\u06e0\u06d8\u06e8\u06e2\u06d6\u06d8\u06e6\u06e0\u06e5\u06d8\u06ec\u06df\u06da\u06e2\u06d9\u06e7\u06e5\u06d6\u06d8\u06e0\u06e7\u06e5"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x137

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x346

    const/16 v2, 0x20c

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x44

    const/16 v2, 0x53

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x19a

    const/16 v2, 0x327

    const v3, -0x809db9f    # -9.98471E33f

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06d9\u06d6\u06e7\u06eb\u06df\u06e8\u06e7\u06e5\u06db\u06e4\u06ec\u06d6\u06d8\u06eb\u06db\u06e1\u06e0\u06e2\u06d8\u06e0\u06e5\u06e0\u06e1\u06e4\u06db\u06dc\u06e7\u06e8\u06d8\u06e5\u06eb\u06e1\u06d6\u06e7\u06e5\u06d8\u06dc\u06e1\u06da\u06e1\u06d7\u06d6\u06d8\u06d8\u06db\u06e2\u06df\u06e8\u06e4"

    goto :goto_0

    :sswitch_1
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7499318e -> :sswitch_1
        0x37b1c13f -> :sswitch_0
    .end sparse-switch
.end method
