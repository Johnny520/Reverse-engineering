.class public final Lcom/skyhand/redbookhelper/MainActivity$d;
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
        "Landroid/widget/TextView;",
        ">;"
    }
.end annotation


# instance fields
.field public final ۥ:Lcom/skyhand/redbookhelper/MainActivity;


# direct methods
.method public constructor <init>(Lcom/skyhand/redbookhelper/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/skyhand/redbookhelper/MainActivity$d;->ۥ:Lcom/skyhand/redbookhelper/MainActivity;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 4

    const-string v0, "\u06e0\u06e6\u06d9\u06d8\u06e4\u06e8\u06d8\u06df\u06e5\u06d7\u06e5\u06db\u06d7\u06eb\u06da\u06d7\u06dc\u06df\u06e4\u06e8\u06e0\u06e5\u06db\u06d6\u06dc\u06d8\u06e4\u06ec\u06e8\u06d8\u06e6\u06e2\u06e1\u06d8\u06db\u06df\u06ec\u06dc\u06e7\u06e5\u06e4\u06da\u06e2\u06ec\u06da\u06e2\u06eb\u06e2\u06e2\u06e4\u06dc\u06e8\u06e7\u06da\u06d9\u06e6\u06db\u06df\u06ec\u06e5\u06d9\u06e0\u06e5\u06d8\u06d7\u06e7\u06e6\u06d8\u06e6\u06ec\u06db\u06da\u06d7\u06e2\u06e2\u06d9\u06e2\u06e5\u06e8\u06da\u06db\u06e5\u06ec\u06e4\u06e4\u06df"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x1bc

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2ed

    const/16 v2, 0x12a

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x22e

    const/16 v2, 0x3c5

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x9c

    const/16 v2, 0x2ed

    const v3, -0x70f5f450

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06db\u06e5\u06ec\u06db\u06db\u06d8\u06e8\u06ec\u06e2\u06d6\u06db\u06df\u06d7\u06e0\u06e6\u06d8\u06eb\u06ec\u06e6\u06d6\u06e4\u06e4\u06d8\u06e4\u06e6\u06db\u06d8\u06e7\u06d8\u06ec\u06df\u06e7\u06e8\u06e2\u06d9\u06e0\u06d9\u06da\u06e5\u06df\u06eb\u06d7\u06d6\u06d8\u06df\u06e0\u06df\u06e8\u06e0\u06e2\u06eb\u06eb\u06eb\u06da\u06dc\u06e6\u06d8"

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lcom/skyhand/redbookhelper/MainActivity$d;->ۥ:Lcom/skyhand/redbookhelper/MainActivity;

    const v1, 0x7f010006

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4199b6d2 -> :sswitch_1
        0x730a65f9 -> :sswitch_0
    .end sparse-switch
.end method
