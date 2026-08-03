.class public final Lcom/skyhand/redbookhelper/MainActivity$a;
.super L۟/o4;

# interfaces
.implements L۟/f3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/skyhand/redbookhelper/MainActivity;
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
.field public static final ۥ:Lcom/skyhand/redbookhelper/MainActivity$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "\u06d7\u06e0\u06e5\u06d8\u06df\u06e6\u06e1\u06d8\u06d6\u06dc\u06e2\u06d9\u06d6\u06df\u06d6\u06e8\u06e6\u06dc\u06d9\u06d9\u06e6\u06df\u06e8\u06d8\u06d6\u06dc\u06d8\u06d9\u06eb\u06e6\u06eb\u06e7\u06df\u06e6\u06d9\u06eb\u06e8\u06dc\u06e5\u06d6\u06db\u06d9\u06df\u06d8\u06df\u06da\u06eb\u06eb\u06e5\u06e0\u06eb\u06d7\u06d7\u06e0\u06e8\u06e0\u06d9\u06ec\u06e2\u06e6\u06d8\u06d9\u06d7\u06e5\u06e6\u06d8\u06d7\u06e5\u06ec\u06e5\u06e5\u06db\u06e8\u06d8\u06eb\u06d7\u06e7"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0xe6

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1b1

    const/16 v2, 0x160

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x3b

    const/16 v2, 0x372

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x32c

    const/16 v2, 0x36a

    const v3, 0x1f2d5c22

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v0, Lcom/skyhand/redbookhelper/MainActivity$a;

    invoke-direct {v0}, Lcom/skyhand/redbookhelper/MainActivity$a;-><init>()V

    sput-object v0, Lcom/skyhand/redbookhelper/MainActivity$a;->ۥ:Lcom/skyhand/redbookhelper/MainActivity$a;

    const-string v0, "\u06e4\u06e5\u06eb\u06db\u06dc\u06e5\u06d8\u06d7\u06e4\u06d6\u06e8\u06da\u06e2\u06e1\u06dc\u06e1\u06e2\u06e8\u06e1\u06e2\u06e1\u06d8\u06d8\u06d8\u06dc\u06d8\u06da\u06e1\u06e0\u06e4\u06e4\u06d7\u06e5\u06d7\u06e6\u06d8\u06e5\u06e2\u06d6\u06da\u06e1\u06d8\u06e8\u06db\u06e5\u06d8\u06da\u06db\u06e0\u06d8\u06e4\u06e4\u06d7\u06e2\u06e0\u06e4\u06d7\u06dc\u06e7\u06e4\u06e4\u06e1\u06e2\u06e6"

    goto :goto_0

    :sswitch_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x75656144 -> :sswitch_1
        -0x67ba4dcb -> :sswitch_0
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

    const-string v0, "\u06e2\u06eb\u06e7\u06df\u06e5\u06d9\u06d7\u06e7\u06da\u06d9\u06e1\u06d8\u06da\u06e5\u06e2\u06d9\u06e1\u06e5\u06d8\u06da\u06d9\u06dc\u06d9\u06da\u06df\u06e8\u06d7\u06e6\u06d8\u06dc\u06e5\u06d8\u06ec\u06ec\u06d6\u06d6\u06df\u06dc\u06d8\u06eb\u06eb\u06eb\u06d9\u06e8\u06eb\u06dc\u06db\u06e1\u06e0\u06e7\u06e4\u06eb\u06e1\u06d9\u06e8\u06e5\u06e4\u06e5\u06ec\u06d6\u06d8\u06e4\u06df\u06e6\u06d8\u06dc\u06e8\u06db\u06d8\u06db\u06e6\u06d8\u06d7\u06e1\u06e6\u06d8\u06e2\u06e2\u06e4"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x24e

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x208

    const/16 v2, 0x23f

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x37

    const/16 v2, 0x32c

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x319

    const/16 v2, 0x269

    const v3, -0x4a664c37

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06d6\u06d6\u06d9\u06d9\u06d9\u06e1\u06e1\u06e5\u06db\u06e8\u06e1\u06e0\u06e8\u06d9\u06e5\u06d8\u06ec\u06e6\u06ec\u06e8\u06d8\u06db\u06eb\u06db\u06d7\u06eb\u06e0\u06e5\u06d6\u06d7\u06e8\u06d8\u06d7\u06d8\u06d6\u06d8\u06e7\u06e0\u06e7\u06e1\u06e0\u06e1\u06d9\u06e0\u06e5\u06e0\u06d7\u06e8\u06d8"

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
        0x6ea60e34 -> :sswitch_0
        0x76aebce4 -> :sswitch_1
    .end sparse-switch
.end method
