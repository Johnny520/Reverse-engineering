.class public final Lcom/skyhand/redbookhelper/MainActivity$b;
.super L۟/o4;

# interfaces
.implements L۟/f3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/skyhand/redbookhelper/MainActivity;-><init>()V
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
        "Landroid/content/SharedPreferences;",
        ">;"
    }
.end annotation


# instance fields
.field public final ۥ:Lcom/skyhand/redbookhelper/MainActivity;


# direct methods
.method public constructor <init>(Lcom/skyhand/redbookhelper/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/skyhand/redbookhelper/MainActivity$b;->ۥ:Lcom/skyhand/redbookhelper/MainActivity;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 4

    const-string v0, "\u06dc\u06d7\u06e6\u06d8\u06d9\u06d7\u06dc\u06db\u06e5\u06e6\u06d6\u06d8\u06e2\u06e7\u06d8\u06da\u06db\u06eb\u06dc\u06df\u06e0\u06e1\u06d8\u06da\u06eb\u06d6\u06d8\u06e1\u06da\u06dc\u06da\u06d8\u06e5\u06d7\u06e2\u06ec\u06e6\u06d6\u06e5\u06d8\u06ec\u06ec\u06d6\u06d8\u06e0\u06e6\u06e5\u06d8\u06da\u06e8\u06d8\u06df\u06da\u06e8\u06d8\u06e2\u06db\u06e0\u06d9\u06db\u06e8\u06d8\u06e8\u06db\u06eb\u06e4\u06e2\u06d8\u06e0\u06e4\u06e5\u06d8\u06e5\u06e1\u06d7\u06d8\u06e0\u06e5\u06dc\u06e5\u06e0"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x310

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x346

    const/16 v2, 0x14c

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x90

    const/16 v2, 0x2f2

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x142

    const/16 v2, 0x1de

    const v3, 0x5cce57be

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e8\u06ec\u06d6\u06ec\u06d6\u06e5\u06e7\u06dc\u06e2\u06d6\u06e6\u06dc\u06d8\u06d8\u06e2\u06e8\u06e8\u06da\u06e4\u06e1\u06d8\u06dc\u06d8\u06ec\u06db\u06dc\u06d8\u06dc\u06e6\u06d6\u06d9\u06df\u06d8\u06e5\u06db\u06e4\u06d9\u06da\u06d7\u06d6\u06d7\u06d8\u06d8\u06e2\u06e8\u06e1\u06d8\u06ec\u06d7\u06e5"

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lcom/skyhand/redbookhelper/MainActivity$b;->ۥ:Lcom/skyhand/redbookhelper/MainActivity;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x3a2a4946 -> :sswitch_0
        -0xe0ff1ea -> :sswitch_1
    .end sparse-switch
.end method
