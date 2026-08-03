.class public final Lcom/skyhand/redbookhelper/MainActivity;
.super Landroid/app/Activity;


# static fields
.field public static final ۥۣ۟:L۟/kb;


# instance fields
.field public final ۥ:L۟/kb;

.field public final ۥ۟:L۟/kb;

.field public final ۥ۟۟:L۟/kb;

.field public final ۥ۟۠:L۟/kb;

.field public ۥ۟ۡ:I

.field public ۥ۟ۢ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "\u06da\u06e2\u06e1\u06d9\u06d8\u06e6\u06d8\u06e4\u06e0\u06d6\u06d7\u06e2\u06e2\u06e0\u06df\u06dc\u06d8\u06da\u06d7\u06eb\u06e0\u06da\u06db\u06e0\u06e0\u06dc\u06d8\u06e1\u06d8\u06d7\u06d8\u06e0\u06e6\u06d7\u06e5\u06e1\u06e8\u06dc\u06dc\u06e5\u06df\u06e5\u06e1\u06dc\u06e6\u06d6\u06db\u06e4\u06db\u06e8\u06da\u06dc\u06dc\u06ec\u06e5\u06e5\u06e0\u06da\u06ec\u06d6\u06d8\u06d8\u06eb\u06e5\u06d6\u06d6\u06e5\u06d8\u06db\u06e1\u06e5\u06d7\u06e2\u06e7\u06df\u06e6\u06e5\u06d8"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x3b0

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xf4

    const/16 v2, 0x2fd

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x3fd

    const/16 v2, 0x10d

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x81

    const/16 v2, 0x5a

    const v3, 0x39e71037

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    new-instance v0, L۟/kb;

    sget-object v1, Lcom/skyhand/redbookhelper/MainActivity$a;->ۥ:Lcom/skyhand/redbookhelper/MainActivity$a;

    invoke-direct {v0, v1}, L۟/kb;-><init>(L۟/f3;)V

    sput-object v0, Lcom/skyhand/redbookhelper/MainActivity;->ۥۣ۟:L۟/kb;

    const-string v0, "\u06e2\u06df\u06dc\u06d8\u06d6\u06df\u06dc\u06d9\u06e2\u06db\u06e6\u06e6\u06d8\u06d7\u06da\u06e8\u06d8\u06ec\u06da\u06e6\u06d8\u06d8\u06e2\u06e2\u06da\u06e7\u06e0\u06d9\u06ec\u06df\u06e0\u06e6\u06e6\u06d8\u06dc\u06e5\u06e5\u06e1\u06e8\u06e0\u06da\u06dc\u06e1\u06d8\u06e2\u06e0\u06eb\u06d6\u06e8\u06e8\u06db\u06dc\u06ec\u06ec\u06dc\u06da\u06d6\u06da\u06d7\u06eb\u06d8\u06d6\u06d8\u06e5\u06dc\u06d9\u06e4\u06e2\u06d9"

    goto :goto_0

    :sswitch_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x37d6d8f9 -> :sswitch_0
        0x66c2ffc2 -> :sswitch_1
    .end sparse-switch
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    new-instance v0, L۟/kb;

    new-instance v1, Lcom/skyhand/redbookhelper/MainActivity$b;

    invoke-direct {v1, p0}, Lcom/skyhand/redbookhelper/MainActivity$b;-><init>(Lcom/skyhand/redbookhelper/MainActivity;)V

    invoke-direct {v0, v1}, L۟/kb;-><init>(L۟/f3;)V

    iput-object v0, p0, Lcom/skyhand/redbookhelper/MainActivity;->ۥ:L۟/kb;

    new-instance v0, L۟/kb;

    new-instance v1, Lcom/skyhand/redbookhelper/MainActivity$c;

    invoke-direct {v1, p0}, Lcom/skyhand/redbookhelper/MainActivity$c;-><init>(Lcom/skyhand/redbookhelper/MainActivity;)V

    invoke-direct {v0, v1}, L۟/kb;-><init>(L۟/f3;)V

    iput-object v0, p0, Lcom/skyhand/redbookhelper/MainActivity;->ۥ۟:L۟/kb;

    new-instance v0, L۟/kb;

    new-instance v1, Lcom/skyhand/redbookhelper/MainActivity$e;

    invoke-direct {v1, p0}, Lcom/skyhand/redbookhelper/MainActivity$e;-><init>(Lcom/skyhand/redbookhelper/MainActivity;)V

    invoke-direct {v0, v1}, L۟/kb;-><init>(L۟/f3;)V

    iput-object v0, p0, Lcom/skyhand/redbookhelper/MainActivity;->ۥ۟۟:L۟/kb;

    new-instance v0, L۟/kb;

    new-instance v1, Lcom/skyhand/redbookhelper/MainActivity$d;

    invoke-direct {v1, p0}, Lcom/skyhand/redbookhelper/MainActivity$d;-><init>(Lcom/skyhand/redbookhelper/MainActivity;)V

    invoke-direct {v0, v1}, L۟/kb;-><init>(L۟/f3;)V

    iput-object v0, p0, Lcom/skyhand/redbookhelper/MainActivity;->ۥ۟۠:L۟/kb;

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 10

    const/4 v9, 0x3

    const/4 v8, 0x6

    const/4 v7, 0x0

    const/4 v2, 0x0

    const-string v0, "\u06d8\u06d7\u06d6\u06e4\u06e0\u06d6\u06da\u06d7\u06e6\u06d8\u06d9\u06ec\u06e1\u06d8\u06df\u06e4\u06e5\u06dc\u06eb\u06db\u06e6\u06e4\u06e4\u06e4\u06eb\u06e4\u06e8\u06e7\u06e6\u06d8\u06d6\u06d6\u06d6\u06d8\u06ec\u06d9\u06da\u06e8\u06d9\u06dc\u06d8\u06eb\u06d7\u06dc\u06e1\u06e0\u06e4\u06db\u06da\u06e0\u06d8\u06e5\u06e1\u06e0\u06e7\u06e4\u06d7\u06e1\u06d8\u06e6\u06e5\u06eb\u06ec\u06e1\u06e8\u06d8\u06db\u06e6\u06e4"

    move-object v1, v0

    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v3, 0xc1

    xor-int/2addr v0, v3

    xor-int/lit16 v0, v0, 0xe4

    const/16 v3, 0x162

    xor-int/2addr v0, v3

    xor-int/lit16 v0, v0, 0x32d

    const/16 v3, 0x34e

    xor-int/2addr v0, v3

    xor-int/lit16 v0, v0, 0x29f

    const/16 v3, 0xeb

    const v4, 0x947de73

    xor-int/2addr v0, v3

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06d8\u06e8\u06e6\u06e4\u06e7\u06eb\u06e0\u06e7\u06e8\u06e1\u06eb\u06d8\u06d8\u06e6\u06e7\u06d8\u06e0\u06d8\u06e6\u06d8\u06d9\u06e4\u06d7\u06ec\u06dc\u06dc\u06e5\u06e7\u06e6\u06d8\u06e7\u06d7\u06e7\u06d8\u06ec\u06e5\u06d6\u06da\u06e5\u06d7\u06e6\u06e8\u06d8\u06eb\u06df\u06eb\u06d6\u06e2\u06dc\u06d8\u06e1\u06db\u06d8\u06d8\u06e6\u06db\u06e1\u06d6\u06eb\u06d7\u06db\u06e2\u06e2\u06e1\u06eb\u06ec\u06eb\u06e7\u06ec\u06d6\u06ec\u06e5\u06e8\u06e5\u06e6\u06d8\u06df\u06e2\u06e0"

    move-object v1, v0

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06e8\u06d9\u06e8\u06d7\u06e0\u06e5\u06d8\u06da\u06e1\u06ec\u06df\u06e2\u06e2\u06da\u06dc\u06e0\u06e6\u06e2\u06e1\u06d8\u06e5\u06e0\u06e6\u06d8\u06d9\u06da\u06df\u06dc\u06e2\u06db\u06e8\u06d9\u06d6\u06e1\u06df\u06dc\u06db\u06e7\u06d7\u06d6\u06e8\u06e8\u06d8\u06df\u06e5\u06d8\u06d8\u06e8\u06dc\u06d7\u06d9\u06d6\u06e7\u06e1\u06e8\u06df\u06e1\u06ec\u06dc\u06e5\u06d8\u06e7\u06da\u06d8\u06e5\u06db\u06d7\u06db\u06eb\u06ec\u06df\u06df\u06e0\u06da\u06ec\u06e5\u06ec\u06e0\u06e5\u06d8\u06df\u06dc\u06d9\u06e8\u06db"

    move-object v1, v0

    goto :goto_0

    :sswitch_2
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const-string v0, "\u06db\u06ec\u06e6\u06d8\u06d9\u06d7\u06d6\u06d6\u06e0\u06d6\u06d8\u06e2\u06e2\u06d6\u06e1\u06d7\u06e1\u06d8\u06e0\u06e5\u06e0\u06e1\u06e8\u06dc\u06d8\u06db\u06e0\u06da\u06d7\u06e4\u06da\u06e0\u06d9\u06d6\u06e4\u06dc\u06df\u06e7\u06d9\u06e8\u06e5\u06d6\u06e1\u06e2\u06d6\u06e5\u06d8\u06d8\u06e1\u06d6\u06df\u06e2\u06ec\u06e6\u06dc\u06d8\u06e7\u06e5\u06d7\u06dc\u06e2\u06e0\u06e6\u06e4\u06e7\u06d7\u06eb\u06d7\u06eb\u06e2\u06e1\u06ec\u06e4\u06d6\u06df\u06da\u06e2\u06e0\u06d6\u06d7\u06eb\u06e2\u06db\u06e1\u06dc\u06d8"

    move-object v1, v0

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, L۟/l3;->ۥ۟ۥ(Landroid/content/Context;)V

    const-string v0, "\u06eb\u06db\u06e8\u06d8\u06e2\u06e4\u06e6\u06df\u06e4\u06e5\u06e2\u06e6\u06e6\u06d8\u06e4\u06e7\u06e8\u06d8\u06da\u06d8\u06e2\u06e7\u06e5\u06dc\u06e6\u06e2\u06e6\u06ec\u06dc\u06d7\u06e4\u06d6\u06e0\u06e0\u06d8\u06e5\u06e5\u06eb\u06db\u06e0\u06e0\u06d6\u06d8\u06ec\u06e6\u06e6\u06d8\u06eb\u06ec\u06e5\u06d8\u06e7\u06db\u06d9\u06e0\u06d7\u06da\u06e4\u06da\u06e1\u06d8"

    move-object v1, v0

    goto :goto_0

    :sswitch_4
    sget-object v0, L۟/q;->ۥ۟۠:Ljava/util/Stack;

    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    const-string v0, "\u06e6\u06d6\u06e7\u06d8\u06d6\u06e5\u06d9\u06e7\u06d7\u06e1\u06db\u06e1\u06e2\u06d8\u06d7\u06e5\u06e4\u06e6\u06e7\u06e6\u06d8\u06e6\u06d7\u06d8\u06e5\u06eb\u06d6\u06db\u06e5\u06e6\u06e5\u06d8\u06d9\u06d7\u06e5\u06d6\u06e7\u06e5\u06d8\u06db\u06d9\u06d8\u06e5\u06df\u06db\u06d6\u06e6\u06e8\u06d8\u06d9\u06e5\u06e6\u06d8\u06dc\u06d9\u06e8\u06d8\u06e0\u06df\u06e6\u06d8\u06e4\u06e0\u06e0\u06eb\u06d9\u06e5\u06d8\u06e7\u06e1\u06da\u06d9\u06d8\u06e7\u06d8\u06e8\u06e0\u06e1\u06df\u06da\u06e6\u06ec\u06dc\u06e5\u06d7\u06ec\u06d8\u06d8\u06d9\u06e6\u06d8"

    move-object v1, v0

    goto :goto_0

    :sswitch_5
    const/4 v0, 0x5

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    new-array v1, v8, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, L۟/l3;->ۥ۟ۦ(Ljava/lang/String;)V

    const-string v0, "\u06da\u06d7\u06e8\u06da\u06e7\u06e4\u06e4\u06e0\u06d6\u06da\u06e5\u06d8\u06e7\u06e2\u06e5\u06e0\u06da\u06e7\u06dc\u06d9\u06e4\u06d9\u06e0\u06d8\u06e8\u06dc\u06e4\u06e6\u06e7\u06d6\u06e0\u06e5\u06d8\u06d8\u06e7\u06e2\u06e2\u06d7\u06e7\u06d8\u06da\u06da\u06d6\u06e4\u06df"

    move-object v1, v0

    goto :goto_0

    :sswitch_6
    const/16 v0, 0x20

    sput v0, L۟/l3;->ۥ۟۠:I

    const-string v0, "\u06d7\u06e0\u06d7\u06e4\u06df\u06e6\u06d8\u06e6\u06e8\u06d9\u06dc\u06df\u06ec\u06e2\u06df\u06e8\u06e5\u06e1\u06dc\u06ec\u06d7\u06e1\u06d9\u06eb\u06ec\u06e0\u06e8\u06df\u06d7\u06e0\u06e1\u06eb\u06ec\u06e2\u06e2\u06df\u06df\u06d6\u06dc\u06e2\u06e8\u06d6\u06e0\u06d7\u06e1\u06d8\u06d7\u06e6\u06eb\u06e2\u06d7\u06eb\u06e6\u06e6\u06d8\u06d6\u06e5\u06e5\u06ec\u06df\u06e5\u06d8\u06e5\u06ec\u06dc\u06d8\u06e2\u06eb\u06d6\u06d8\u06df\u06dc\u06d8\u06d8\u06e6\u06df\u06eb\u06d7\u06ec\u06db\u06ec\u06d6\u06e1\u06dc\u06d9"

    move-object v1, v0

    goto :goto_0

    :sswitch_7
    const/high16 v0, 0x7f020000

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setContentView(I)V

    const-string v0, "\u06d9\u06e4\u06e0\u06e2\u06e7\u06dc\u06d8\u06d8\u06e4\u06d9\u06e7\u06d8\u06e6\u06d8\u06e4\u06e8\u06e7\u06d8\u06df\u06dc\u06d8\u06e5\u06e2\u06e1\u06e6\u06e5\u06e8\u06d6\u06d6\u06dc\u06d8\u06d6\u06d9\u06df\u06d8\u06e8\u06e6\u06d8\u06d9\u06db\u06e8\u06dc\u06d9\u06e6\u06d8\u06db\u06e6\u06e2\u06e1\u06e6\u06d8\u06d8\u06d8\u06d9\u06e0\u06df\u06da\u06df\u06e8\u06e7\u06dc\u06d8\u06df\u06e5\u06e0\u06e0\u06e2\u06dc\u06d8\u06e6"

    move-object v1, v0

    goto :goto_0

    :sswitch_8
    invoke-static {}, L۟/q$c;->ۥ۟()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, L۟/i5;

    invoke-direct {v1, p0, v7}, L۟/i5;-><init>(Lcom/skyhand/redbookhelper/MainActivity;I)V

    const-wide/16 v4, 0x64

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const-string v0, "\u06dc\u06d8\u06ec\u06e2\u06eb\u06df\u06d9\u06e0\u06e7\u06df\u06da\u06e6\u06d8\u06e2\u06d7\u06e8\u06ec\u06eb\u06e6\u06d8\u06e1\u06e7\u06e2\u06dc\u06e7\u06e7\u06d6\u06e0\u06d8\u06e4\u06e4\u06dc\u06d9\u06da\u06e6\u06d8\u06dc\u06e6\u06e5\u06d8\u06df\u06d8\u06d8\u06eb\u06e8\u06d7\u06dc\u06e4\u06eb\u06e7\u06d7\u06d7\u06db\u06e6\u06e4\u06e5\u06e6\u06e5\u06e8\u06e0\u06e5\u06e2\u06e8\u06e1\u06e5\u06e6\u06e7\u06e7\u06e6\u06e1\u06d9\u06e0\u06eb\u06d7\u06e5\u06d7"

    move-object v1, v0

    goto :goto_0

    :sswitch_9
    sget-object v0, Lcom/skyhand/redbookhelper/MainActivity;->ۥۣ۟:L۟/kb;

    invoke-virtual {v0}, L۟/kb;->ۥ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    new-instance v1, L۟/i5;

    const/4 v3, 0x1

    invoke-direct {v1, p0, v3}, L۟/i5;-><init>(Lcom/skyhand/redbookhelper/MainActivity;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const-string v0, "\u06da\u06df\u06d7\u06dc\u06d6\u06db\u06da\u06e8\u06dc\u06d8\u06dc\u06e6\u06e6\u06e4\u06e7\u06dc\u06e4\u06eb\u06e4\u06e4\u06df\u06d9\u06e2\u06e4\u06e4\u06e6\u06d6\u06dc\u06d8\u06e4\u06eb\u06e7\u06e4\u06d6\u06e5\u06d8\u06ec\u06da\u06da\u06da\u06e5\u06e8\u06e8\u06d6\u06e6\u06d8\u06db\u06e7\u06e2\u06eb\u06d6\u06d7\u06eb\u06df\u06e7\u06da\u06ec\u06e8\u06db\u06eb\u06d6\u06df\u06d8\u06df\u06e6\u06d8\u06e7\u06d8\u06e4\u06d7\u06e7\u06e4\u06e6\u06d6\u06ec\u06e2\u06d6"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_a
    new-instance v0, Lcom/skyhand/redbookhelper/MainActivity$f;

    invoke-direct {v0, p0}, Lcom/skyhand/redbookhelper/MainActivity$f;-><init>(Lcom/skyhand/redbookhelper/MainActivity;)V

    invoke-virtual {p0, v0}, Lcom/skyhand/redbookhelper/MainActivity;->ۥ۟(L۟/g3;)V

    const-string v0, "\u06da\u06d7\u06e8\u06d7\u06d8\u06e5\u06da\u06db\u06e5\u06d8\u06e7\u06d8\u06e8\u06dc\u06d6\u06e7\u06eb\u06dc\u06d8\u06e4\u06d9\u06dc\u06d8\u06eb\u06da\u06e0\u06db\u06e1\u06e1\u06d6\u06e5\u06df\u06e8\u06dc\u06d9\u06eb\u06e5\u06dc\u06d8\u06d9\u06da\u06e8\u06df\u06e5\u06d8\u06e2\u06e1\u06e0\u06e2\u06e2\u06e6\u06e2\u06ec\u06e1\u06d8\u06df\u06dc\u06e1\u06d8\u06ec\u06da\u06e8\u06d8\u06e2\u06d6\u06e4\u06e7\u06df\u06e6\u06d8"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_b
    iget-object v0, p0, Lcom/skyhand/redbookhelper/MainActivity;->ۥ۟۟:L۟/kb;

    invoke-virtual {v0}, L۟/kb;->ۥ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/16 v1, 0xe

    new-array v1, v1, [B

    fill-array-data v1, :array_2

    new-array v3, v8, [B

    fill-array-data v3, :array_3

    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v0, "\u06df\u06e0\u06e8\u06d8\u06d8\u06df\u06d9\u06ec\u06db\u06e1\u06d8\u06e7\u06d7\u06e0\u06eb\u06d8\u06da\u06e6\u06e4\u06d6\u06d8\u06d8\u06db\u06d6\u06e1\u06d7\u06e5\u06d8\u06e0\u06da\u06e1\u06d8\u06df\u06da\u06eb\u06e2\u06d7\u06d7\u06e7\u06db\u06e1\u06e6\u06e6\u06d8\u06df\u06e0\u06e1\u06d8\u06e7\u06d6\u06d6\u06d8"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_c
    const v0, 0x7f010005

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/16 v1, 0x29

    new-array v1, v1, [B

    fill-array-data v1, :array_4

    new-array v3, v8, [B

    fill-array-data v3, :array_5

    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v0, "\u06e5\u06e7\u06d8\u06d8\u06e2\u06d8\u06d8\u06e1\u06ec\u06d8\u06e2\u06df\u06e7\u06d9\u06da\u06d8\u06e8\u06d9\u06e6\u06e5\u06e1\u06e7\u06d8\u06e2\u06e4\u06e2\u06dc\u06db\u06e2\u06e8\u06e2\u06eb\u06eb\u06e1\u06e1\u06e5\u06e0\u06da\u06dc\u06db\u06e2\u06e5\u06eb\u06da\u06eb\u06d8\u06d8\u06da\u06d6\u06db\u06e6\u06d8\u06e1\u06d8\u06d6\u06e2\u06dc"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_d
    const v0, 0x7f010003

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;

    const-string v1, "\u06e8\u06d9\u06da\u06d8\u06e5\u06e6\u06ec\u06e6\u06d8\u06d7\u06d7\u06d7\u06dc\u06d7\u06e8\u06d8\u06e7\u06e8\u06e7\u06d8\u06e2\u06e1\u06e2\u06ec\u06e0\u06e0\u06e0\u06e2\u06d6\u06d8\u06db\u06da\u06d9\u06d6\u06db\u06d6\u06e5\u06d9\u06e1\u06d8\u06dc\u06d9\u06dc\u06dc\u06e5\u06e7\u06dc\u06eb\u06e6\u06e0\u06e0\u06db\u06e2\u06e2\u06e7\u06db\u06e1\u06e6\u06e7\u06df\u06d6\u06d8\u06e5\u06eb\u06e4\u06e0\u06dc\u06d8\u06d8"

    move-object v2, v0

    goto/16 :goto_0

    :sswitch_e
    const v1, -0xd8dbde4

    const-string v0, "\u06db\u06d7\u06e5\u06d8\u06eb\u06e5\u06e2\u06e7\u06d8\u06d6\u06d6\u06d9\u06e5\u06d8\u06d9\u06e1\u06e6\u06d8\u06e0\u06d7\u06d7\u06eb\u06d8\u06db\u06df\u06e0\u06e4\u06ec\u06d7\u06d6\u06d8\u06e0\u06e6\u06e2\u06d6\u06da\u06e1\u06d8\u06e0\u06e4\u06e4\u06e6\u06d9\u06df\u06d8\u06db\u06d6\u06d9\u06d6\u06e1\u06e4\u06e5\u06eb\u06eb\u06e4\u06e1\u06db\u06df\u06e0"

    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    xor-int/2addr v3, v1

    sparse-switch v3, :sswitch_data_1

    goto :goto_1

    :sswitch_f
    const-string v0, "\u06ec\u06e7\u06e5\u06d8\u06e1\u06e4\u06d9\u06eb\u06e2\u06eb\u06e6\u06e5\u06d6\u06d8\u06e1\u06eb\u06d6\u06d8\u06e1\u06eb\u06ec\u06df\u06e4\u06d7\u06e8\u06e2\u06e8\u06d8\u06e4\u06d9\u06e1\u06d8\u06e8\u06eb\u06e5\u06d7\u06eb\u06dc\u06eb\u06d6\u06db\u06dc\u06da\u06e7\u06db\u06d7\u06e8\u06e2\u06e4\u06dc\u06d8\u06da\u06e6\u06d8\u06e7\u06d6\u06e8\u06d8\u06eb\u06d8\u06d6\u06e4\u06e2\u06ec\u06da\u06d6\u06d8\u06e6\u06d9\u06e4\u06ec\u06df\u06df\u06e2\u06df\u06e1\u06e2\u06db\u06e1"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_10
    const-string v0, "\u06e1\u06df\u06e2\u06e6\u06e6\u06d8\u06d8\u06e2\u06d7\u06e2\u06db\u06da\u06e8\u06d8\u06e5\u06d8\u06e7\u06d8\u06eb\u06e5\u06dc\u06df\u06e4\u06d7\u06dc\u06d8\u06e5\u06d8\u06e4\u06e2\u06e4\u06e2\u06e1\u06d6\u06e6\u06e7\u06d6\u06d8\u06e5\u06e4\u06da\u06d8\u06d8\u06dc\u06d9\u06ec\u06eb\u06ec\u06e1"

    goto :goto_1

    :sswitch_11
    const v3, 0x57d8487a

    const-string v0, "\u06e7\u06e7\u06dc\u06e2\u06e0\u06d7\u06e4\u06d8\u06e4\u06dc\u06e1\u06e5\u06e5\u06e1\u06e8\u06e0\u06df\u06ec\u06e6\u06e8\u06d8\u06d9\u06e6\u06e6\u06d7\u06e6\u06dc\u06d8\u06d6\u06d8\u06d8\u06df\u06ec\u06eb\u06d8\u06e2\u06e8\u06d8\u06e5\u06e4\u06e8\u06d8\u06e1\u06df\u06e4\u06db\u06e7\u06e0\u06e6\u06dc\u06d8\u06ec\u06e1\u06dc\u06d8\u06d6\u06dc\u06e0\u06df\u06e6\u06d8\u06d8\u06e2\u06eb\u06dc\u06d8\u06d8\u06d8\u06e1\u06e2\u06db\u06e1\u06d8\u06e8\u06dc\u06e7\u06ec\u06e6\u06e1\u06d6\u06d6\u06e6\u06d8\u06db\u06e0\u06d8\u06e5\u06e8\u06d8"

    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v4, v3

    sparse-switch v4, :sswitch_data_2

    goto :goto_2

    :sswitch_12
    const-string v0, "\u06e8\u06e6\u06e4\u06d6\u06da\u06e7\u06eb\u06e0\u06da\u06df\u06e7\u06e6\u06ec\u06e0\u06db\u06e1\u06e2\u06e6\u06d8\u06d9\u06d7\u06d6\u06e8\u06d7\u06d7\u06e0\u06e8\u06ec\u06e5\u06df\u06e6\u06d6\u06db\u06d8\u06eb\u06dc\u06eb\u06e1\u06d7\u06d8\u06e5\u06d8\u06ec\u06eb\u06d6"

    goto :goto_2

    :sswitch_13
    const-string v0, "\u06e0\u06df\u06e8\u06d8\u06e2\u06dc\u06d7\u06d7\u06df\u06dc\u06d8\u06d9\u06d7\u06d7\u06df\u06e7\u06df\u06e5\u06e0\u06d8\u06d8\u06e8\u06df\u06d6\u06d8\u06e5\u06e5\u06e7\u06d8\u06db\u06e7\u06df\u06db\u06d6\u06e8\u06d8\u06e4\u06e0\u06e4\u06dc\u06e7\u06db\u06d7\u06df\u06e8\u06eb\u06df\u06e4\u06df\u06e8\u06db\u06ec\u06d9\u06e1\u06e0\u06d7\u06e0\u06ec\u06dc\u06d8\u06e4\u06e0\u06dc\u06e1\u06d8\u06e4\u06e6\u06e6\u06e0\u06e1\u06d9\u06df\u06d9\u06db\u06e6\u06e1\u06dc\u06e8\u06d8\u06db\u06d6\u06e6\u06d8\u06db\u06e5\u06e0\u06e0\u06ec"

    goto :goto_2

    :sswitch_14
    const v4, -0x7947631b

    const-string v0, "\u06d7\u06eb\u06e2\u06d8\u06d7\u06e8\u06eb\u06e1\u06ec\u06e8\u06d7\u06e2\u06e2\u06e2\u06dc\u06db\u06d6\u06e2\u06eb\u06da\u06e4\u06e0\u06e6\u06e6\u06d8\u06e1\u06e2\u06e5\u06d8\u06e2\u06eb\u06db\u06df\u06e4\u06d6\u06d6\u06e4\u06e5\u06e6\u06d9\u06e8\u06e2\u06df\u06e2\u06df\u06e7\u06e4\u06e7\u06e6\u06d9\u06e0\u06e0\u06dc\u06d9\u06da\u06e4\u06e6\u06d6\u06eb\u06e4\u06e1\u06e5\u06d8\u06e7\u06e6\u06e6\u06d8\u06e1\u06e1\u06d6\u06d8\u06d6\u06da\u06e6\u06e1\u06df\u06e5\u06d8\u06e8\u06da\u06dc\u06d8\u06e4\u06e6\u06e2\u06e2\u06e1"

    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v5

    xor-int/2addr v5, v4

    sparse-switch v5, :sswitch_data_3

    goto :goto_3

    :sswitch_15
    const-string v0, "\u06eb\u06d8\u06d6\u06d8\u06e2\u06d9\u06e7\u06dc\u06e0\u06dc\u06d8\u06da\u06eb\u06e8\u06e8\u06e5\u06eb\u06d7\u06e2\u06e1\u06d6\u06d8\u06e5\u06e4\u06ec\u06dc\u06dc\u06d9\u06ec\u06d6\u06e8\u06e1\u06d9\u06df\u06e2\u06e2\u06dc\u06e1\u06db\u06e7\u06d9\u06d6\u06e1\u06d8\u06d7\u06ec\u06e5\u06d8\u06e1\u06e8\u06d8\u06d8\u06e7\u06e0\u06d8\u06d7\u06eb\u06e7\u06df\u06e8\u06e8\u06d8\u06e0\u06ec\u06dc\u06d8\u06e8\u06e5\u06d6\u06d8\u06dc\u06d9\u06dc\u06d9\u06e1\u06d6\u06e5\u06d9\u06da\u06e7\u06dc\u06e8\u06db\u06eb\u06ec\u06da\u06db\u06e4"

    goto :goto_3

    :cond_0
    const-string v0, "\u06db\u06ec\u06e1\u06d9\u06e1\u06e4\u06e5\u06e6\u06db\u06e2\u06e1\u06e6\u06e6\u06d8\u06da\u06d7\u06dc\u06e6\u06e7\u06e2\u06d6\u06d8\u06d9\u06df\u06d6\u06e4\u06e5\u06e6\u06d8\u06d8\u06dc\u06da\u06e5\u06e6\u06db\u06e2\u06d8\u06df\u06ec\u06e0\u06e7\u06ec\u06dc\u06e2\u06da\u06d8"

    goto :goto_3

    :sswitch_16
    iget-object v0, p0, Lcom/skyhand/redbookhelper/MainActivity;->ۥ:L۟/kb;

    invoke-virtual {v0}, L۟/kb;->ۥ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/SharedPreferences;

    const/16 v5, 0x9

    new-array v5, v5, [B

    fill-array-data v5, :array_6

    new-array v6, v8, [B

    fill-array-data v6, :array_7

    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v2}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->isChecked()Z

    move-result v5

    if-ne v0, v5, :cond_0

    const-string v0, "\u06df\u06d9\u06e6\u06e5\u06d7\u06d7\u06eb\u06eb\u06e5\u06e6\u06d7\u06df\u06d9\u06dc\u06e1\u06d9\u06eb\u06e6\u06d8\u06e2\u06dc\u06d6\u06d8\u06ec\u06e2\u06d8\u06d8\u06eb\u06e1\u06e4\u06e7\u06e5\u06dc\u06ec\u06d6\u06ec\u06da\u06d8\u06e6\u06da\u06e8\u06d8\u06d7\u06df\u06dc\u06d8\u06d9\u06d7\u06e6\u06d8"

    goto :goto_3

    :sswitch_17
    const-string v0, "\u06d7\u06e7\u06eb\u06d6\u06d8\u06e8\u06d8\u06e8\u06dc\u06e5\u06d9\u06d7\u06d6\u06d8\u06d8\u06e0\u06e8\u06d8\u06db\u06dc\u06e8\u06eb\u06da\u06d6\u06ec\u06e6\u06eb\u06d9\u06e6\u06e7\u06e7\u06e7\u06d8\u06dc\u06d8\u06dc\u06d9\u06ec\u06e4\u06df\u06eb\u06db\u06e6\u06e8\u06d9\u06eb\u06db\u06e7\u06db\u06d6\u06d8\u06e0\u06e8\u06e7\u06e1\u06d7\u06e2\u06e1\u06d9\u06e8\u06e6\u06e2\u06e4\u06e7\u06e8\u06e6\u06df\u06db\u06d9\u06dc\u06e6\u06e6\u06ec\u06da\u06df\u06d7\u06eb\u06d6\u06e2\u06e8\u06e1"

    goto :goto_2

    :sswitch_18
    const-string v0, "\u06e2\u06e8\u06e4\u06eb\u06d8\u06d8\u06ec\u06e6\u06db\u06da\u06e8\u06e4\u06e5\u06ec\u06df\u06df\u06e0\u06e5\u06e0\u06d7\u06d9\u06d8\u06db\u06e4\u06e0\u06e2\u06dc\u06d8\u06d7\u06ec\u06da\u06db\u06e7\u06d8\u06db\u06e8\u06d8\u06d8\u06e0\u06db\u06da\u06e4\u06dc\u06e1\u06d8\u06e1\u06e2\u06e1\u06d8\u06e1\u06db\u06e5\u06e8\u06e5\u06df\u06df\u06e0\u06eb"

    goto :goto_1

    :sswitch_19
    const-string v0, "\u06e1\u06eb\u06d8\u06d9\u06e7\u06d6\u06e7\u06eb\u06e5\u06d8\u06e2\u06dc\u06d8\u06e4\u06e0\u06e6\u06eb\u06d6\u06e6\u06e1\u06e5\u06d8\u06d8\u06d9\u06e2\u06d8\u06da\u06d9\u06da\u06ec\u06dc\u06da\u06e8\u06e1\u06e1\u06d8\u06d6\u06d7\u06e4\u06df\u06dc\u06d7\u06df\u06d9\u06e0\u06d6\u06e5\u06d8\u06d9\u06e2\u06e2\u06d8\u06e6\u06d7\u06d9\u06da\u06e1\u06d9\u06e6\u06e5\u06da\u06dc\u06dc\u06e1\u06e5\u06e8\u06d8"

    goto :goto_1

    :sswitch_1a
    invoke-virtual {v2}, Landroid/view/View;->postInvalidate()V

    const-string v0, "\u06e8\u06eb\u06e5\u06d8\u06e1\u06d7\u06e0\u06ec\u06e0\u06e1\u06e2\u06e7\u06dc\u06d8\u06e1\u06e7\u06d6\u06d8\u06db\u06da\u06e2\u06e6\u06d8\u06e1\u06d8\u06e1\u06db\u06df\u06e2\u06e8\u06d7\u06e0\u06d6\u06e7\u06d8\u06e4\u06dc\u06d9\u06e6\u06e2\u06d7\u06d6\u06da\u06e8\u06e6\u06e8\u06da\u06e1\u06d9\u06d8\u06e4\u06eb\u06d9\u06e5\u06d6\u06ec\u06db\u06d6\u06eb\u06dc\u06e2\u06da\u06e6\u06e2\u06d6\u06e8\u06e8\u06e7\u06da\u06e0\u06db\u06e2\u06e2\u06e1\u06d8\u06d8"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_1b
    invoke-virtual {v2, v7, v7}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->ۥ۟ۡ(ZZ)V

    const-string v0, "\u06db\u06e0\u06e1\u06d8\u06dc\u06db\u06d6\u06ec\u06e5\u06e2\u06e2\u06e7\u06dc\u06e4\u06d9\u06e0\u06d9\u06d7\u06ec\u06e6\u06e6\u06ec\u06eb\u06e6\u06dc\u06d8\u06d6\u06e5\u06ec\u06e7\u06d6\u06d7\u06eb\u06e2\u06eb\u06e0\u06e5\u06e1\u06d8\u06e8\u06db\u06e8\u06d8\u06db\u06d8\u06e6\u06e0\u06e4\u06d7\u06e2\u06e7\u06e8\u06d8\u06ec\u06df\u06e6\u06d6\u06e5\u06d8\u06e6\u06da\u06e6\u06e6\u06e4\u06e1\u06d8\u06d7\u06db\u06e5\u06d8\u06e4\u06e8\u06d8\u06d8\u06e7\u06e8\u06e4\u06e8\u06da\u06e8\u06e7\u06d6\u06e6\u06e0\u06df\u06e7\u06e2\u06df\u06df"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_1c
    new-instance v0, L۟/y;

    invoke-direct {v0, v2, p0, v9}, L۟/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v2, v0}, Lcom/skyhand/hookhand/dialog/view/SwitchButton;->setOnCheckedChangeListener(Lcom/skyhand/hookhand/dialog/view/SwitchButton$d;)V

    const-string v0, "\u06e1\u06eb\u06df\u06d7\u06d8\u06da\u06e5\u06e6\u06da\u06e1\u06e0\u06e5\u06d8\u06d7\u06e8\u06d6\u06dc\u06e7\u06e7\u06e1\u06dc\u06d9\u06ec\u06d7\u06e5\u06da\u06d7\u06e0\u06e6\u06e1\u06e6\u06dc\u06e0\u06ec\u06e1\u06e5\u06d8\u06e6\u06e2\u06d8\u06e6\u06e7\u06da\u06d7\u06e4\u06e1\u06d8\u06da\u06ec\u06e1\u06e5\u06d9\u06d7\u06d7\u06d9\u06e6\u06d8\u06db\u06e0\u06e1\u06d8\u06dc\u06d7\u06e5\u06dc\u06d9\u06d7\u06d7\u06e4\u06eb\u06db\u06e0\u06ec\u06dc\u06d8"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_1d
    const v0, 0x7f010002

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    new-instance v1, L۟/q1;

    invoke-direct {v1, v9, v2}, L۟/q1;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const-string v0, "\u06d8\u06ec\u06e4\u06e4\u06ec\u06e5\u06d8\u06e2\u06da\u06e1\u06d8\u06e2\u06e0\u06d6\u06d8\u06e7\u06e1\u06e7\u06d8\u06e1\u06db\u06da\u06e0\u06d8\u06e8\u06e2\u06e4\u06d6\u06d9\u06e5\u06d8\u06d7\u06e7\u06ec\u06d7\u06e0\u06d8\u06d8\u06d7\u06ec\u06dc\u06ec\u06e7\u06eb\u06ec\u06dc\u06d8\u06dc\u06e5\u06e8\u06d8\u06ec\u06e0\u06e5\u06e0\u06db\u06eb\u06dc\u06d7\u06dc\u06d8"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_1e
    const-string v0, "\u06e0\u06eb\u06e4\u06e0\u06ec\u06df\u06db\u06e7\u06e5\u06d8\u06eb\u06e8\u06e7\u06e0\u06e2\u06e0\u06e0\u06d7\u06d6\u06e6\u06d8\u06eb\u06dc\u06e8\u06d8\u06e6\u06d8\u06d8\u06d9\u06eb\u06d9\u06eb\u06e6\u06e0\u06dc\u06eb\u06eb\u06d9\u06e0\u06d7\u06d7\u06d7\u06db\u06e0\u06e4\u06d6\u06d6\u06e2\u06dc\u06dc\u06db\u06e5\u06db\u06dc\u06e8\u06e5\u06d8\u06e7\u06e4\u06d8\u06d8\u06df\u06d7\u06e7\u06e4\u06dc\u06ec\u06e8\u06dc\u06d8\u06ec\u06df\u06e5\u06d8"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_1f
    const-string v0, "\u06db\u06e0\u06e1\u06d8\u06dc\u06db\u06d6\u06ec\u06e5\u06e2\u06e2\u06e7\u06dc\u06e4\u06d9\u06e0\u06d9\u06d7\u06ec\u06e6\u06e6\u06ec\u06eb\u06e6\u06dc\u06d8\u06d6\u06e5\u06ec\u06e7\u06d6\u06d7\u06eb\u06e2\u06eb\u06e0\u06e5\u06e1\u06d8\u06e8\u06db\u06e8\u06d8\u06db\u06d8\u06e6\u06e0\u06e4\u06d7\u06e2\u06e7\u06e8\u06d8\u06ec\u06df\u06e6\u06d6\u06e5\u06d8\u06e6\u06da\u06e6\u06e6\u06e4\u06e1\u06d8\u06d7\u06db\u06e5\u06d8\u06e4\u06e8\u06d8\u06d8\u06e7\u06e8\u06e4\u06e8\u06da\u06e8\u06e7\u06d6\u06e6\u06e0\u06df\u06e7\u06e2\u06df\u06df"

    move-object v1, v0

    goto/16 :goto_0

    :sswitch_20
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x61f3d37f -> :sswitch_1c
        -0x54323cd5 -> :sswitch_1d
        -0x4aea75eb -> :sswitch_20
        -0x42c1b068 -> :sswitch_1f
        -0x41972c8c -> :sswitch_1a
        -0x3cb567d6 -> :sswitch_3
        -0x17723ea8 -> :sswitch_5
        -0xf57af94 -> :sswitch_e
        -0x6993620 -> :sswitch_1
        0x8ab6d44 -> :sswitch_4
        0x15500559 -> :sswitch_6
        0x161822ce -> :sswitch_b
        0x34a0856a -> :sswitch_0
        0x397239c5 -> :sswitch_8
        0x42796e37 -> :sswitch_9
        0x499526a4 -> :sswitch_7
        0x4fc48a2c -> :sswitch_c
        0x510013d9 -> :sswitch_2
        0x556821cb -> :sswitch_d
        0x5a95f02d -> :sswitch_1b
        0x7ea50266 -> :sswitch_a
    .end sparse-switch

    :array_0
    .array-data 1
        0x77t
        0x2bt
        -0x76t
        0x61t
        -0x7at
    .end array-data

    nop

    :array_1
    .array-data 1
        0x46t
        0x5t
        -0x48t
        0x4ft
        -0x4ft
        -0x79t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x1bt
        -0x15t
        -0x1ct
        -0x1at
        0x26t
        -0x4bt
        0x7ct
        0x66t
        0x42t
        -0x19t
        0x3at
        0x6dt
        0x2ft
        0x53t
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x6dt
        -0x26t
        -0x36t
        -0x2ct
        0x8t
        -0x7et
    .end array-data

    nop

    :array_4
    .array-data 1
        0x68t
        -0x2ct
        0x6bt
        0x5dt
        -0x38t
        -0x5bt
        0x65t
        -0x17t
        0x6bt
        0x53t
        -0x6t
        -0x67t
        0x6bt
        -0x3et
        0x66t
        0x53t
        -0x3ft
        -0x51t
        0x63t
        -0x30t
        0x6at
        0x52t
        -0x2ct
        -0x59t
        0x68t
        -0x2ft
        0x55t
        0x5dt
        -0x38t
        -0x5bt
        0x65t
        -0x17t
        0x6bt
        -0x72t
        0x3et
        0x1ft
        -0x5et
        0x59t
        -0x2ft
        -0x66t
        0x78t
    .end array-data

    nop

    :array_5
    .array-data 1
        -0x74t
        0x6ct
        -0x1at
        -0x4ct
        0x48t
        0x27t
    .end array-data

    nop

    :sswitch_data_1
    .sparse-switch
        -0x65bccb9f -> :sswitch_1e
        -0x642ffdc4 -> :sswitch_f
        -0x52d4a4b4 -> :sswitch_11
        -0xc70dd70 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        -0x25258faf -> :sswitch_14
        -0x186618a1 -> :sswitch_18
        0x195a4486 -> :sswitch_10
        0x6201a6c7 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        -0x23908b35 -> :sswitch_13
        0x37fe833 -> :sswitch_15
        0x47c27ea5 -> :sswitch_17
        0x6fd6b288 -> :sswitch_16
    .end sparse-switch

    :array_6
    .array-data 1
        -0x2et
        0x49t
        -0x79t
        -0x4bt
        0x54t
        -0x49t
        -0x27t
        0x4ft
        -0x73t
    .end array-data

    nop

    :array_7
    .array-data 1
        -0x46t
        0x20t
        -0x1dt
        -0x30t
        0xbt
        -0x22t
    .end array-data
.end method

.method public final ۥ(Z)V
    .locals 13

    const/4 v3, 0x1

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v12, 0x6

    const-string v0, "\u06e5\u06ec\u06e5\u06d8\u06d6\u06e6\u06da\u06d7\u06e2\u06dc\u06d8\u06d6\u06dc\u06ec\u06e4\u06dc\u06e8\u06d8\u06e1\u06e2\u06e6\u06d8\u06e1\u06db\u06e8\u06d8\u06e4\u06e2\u06dc\u06d8\u06df\u06e0\u06e1\u06d8\u06e4\u06e8\u06e4\u06eb\u06e1\u06e5\u06d8\u06df\u06dc\u06e8\u06d8\u06e8\u06e2\u06d7\u06eb\u06eb\u06e5\u06d6\u06d8\u06df\u06eb\u06e1\u06d8\u06e2\u06e2\u06d9\u06dc\u06e4\u06e1"

    move v1, v2

    move v4, v2

    move v5, v2

    move-object v6, v7

    move-object v8, v7

    move-object v9, v7

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/16 v7, 0x2f1

    xor-int/2addr v2, v7

    xor-int/lit16 v2, v2, 0x36e

    const/16 v7, 0x2ae

    xor-int/2addr v2, v7

    xor-int/lit16 v2, v2, 0x280

    const/16 v7, 0x13

    xor-int/2addr v2, v7

    xor-int/lit16 v2, v2, 0x110

    const/16 v7, 0x2f

    const v10, -0x4bbbddd4

    xor-int/2addr v2, v7

    xor-int/2addr v2, v10

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e0\u06ec\u06df\u06ec\u06df\u06e7\u06e6\u06e1\u06e5\u06d6\u06d7\u06e4\u06e0\u06e1\u06d6\u06d8\u06e1\u06e4\u06ec\u06d6\u06e5\u06e6\u06e8\u06e4\u06e7\u06d6\u06d8\u06d6\u06d8\u06ec\u06e6\u06d8\u06d8\u06da\u06df\u06eb\u06d9\u06e6\u06d8\u06e2\u06d8\u06d8\u06d8\u06e6\u06d8\u06e2\u06e5\u06e7\u06d9\u06df\u06e1\u06df\u06e4\u06e1\u06d8\u06e8\u06e5\u06e8\u06e1\u06eb\u06e6\u06e4\u06d9\u06dc\u06d8\u06d7\u06df\u06e6\u06d8"

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06e6\u06d6\u06d8\u06d8\u06e2\u06dc\u06df\u06db\u06e1\u06df\u06eb\u06e8\u06d8\u06da\u06eb\u06d6\u06d8\u06d8\u06d6\u06ec\u06d6\u06ec\u06eb\u06e5\u06d7\u06e8\u06e4\u06eb\u06e6\u06e6\u06e2\u06d8\u06da\u06d9\u06e0\u06dc\u06dc\u06d6\u06da\u06d8\u06e5\u06ec\u06e1\u06d8\u06da\u06ec\u06d8"

    goto :goto_0

    :sswitch_2
    iget-object v0, p0, Lcom/skyhand/redbookhelper/MainActivity;->ۥ۟:L۟/kb;

    invoke-virtual {v0}, L۟/kb;->ۥ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/SharedPreferences$Editor;

    const/16 v2, 0x9

    new-array v2, v2, [B

    fill-array-data v2, :array_0

    new-array v7, v12, [B

    fill-array-data v7, :array_1

    invoke-static {v2, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    const-string v0, "\u06e2\u06df\u06d8\u06d8\u06e6\u06e8\u06eb\u06e4\u06d9\u06e0\u06da\u06e4\u06e6\u06e1\u06d6\u06e8\u06e7\u06e5\u06d6\u06d8\u06d7\u06df\u06e1\u06da\u06e5\u06e5\u06e8\u06e1\u06d6\u06dc\u06db\u06d6\u06d8\u06db\u06e5\u06d7\u06d9\u06df\u06e6\u06d8\u06da\u06eb\u06dc\u06d8\u06e8\u06d7\u06e2\u06df\u06e6\u06ec\u06e2\u06e6\u06e2\u06e8\u06d6\u06d6\u06d8\u06e1\u06db\u06dc\u06e0\u06e7\u06e1\u06e2\u06db\u06db\u06db\u06eb\u06dc\u06da\u06e6\u06d8\u06eb\u06df\u06db\u06e8\u06d6\u06d6\u06e6\u06d8\u06dc\u06e6\u06d9\u06e0\u06e2\u06d6\u06e1"

    goto :goto_0

    :sswitch_3
    const/16 v0, 0x2b

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    new-array v2, v12, [B

    fill-array-data v2, :array_3

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v7

    const-string v0, "\u06e1\u06e1\u06e6\u06d8\u06e6\u06e7\u06dc\u06d8\u06e0\u06d9\u06e5\u06d6\u06e6\u06e7\u06d7\u06eb\u06ec\u06d9\u06d7\u06e2\u06da\u06df\u06df\u06db\u06e5\u06d8\u06e5\u06db\u06e8\u06e7\u06e2\u06dc\u06d8\u06db\u06d6\u06d8\u06df\u06eb\u06d8\u06e7\u06e2\u06e6\u06d8\u06e0\u06e4\u06e8\u06d7\u06e2\u06dc\u06d8\u06e8\u06e2\u06e5\u06d8\u06eb\u06e1\u06e1\u06ec\u06e4\u06d9\u06df\u06d8\u06ec\u06eb\u06eb\u06d7\u06e5\u06e7\u06d8\u06eb\u06e2\u06d9\u06d9\u06d8\u06eb\u06e1\u06d8\u06e8\u06d8\u06d6\u06e0\u06d7\u06e1\u06dc\u06e6\u06e4\u06d9\u06dc\u06d8"

    move-object v9, v7

    goto :goto_0

    :sswitch_4
    const/4 v0, 0x7

    new-array v0, v0, [B

    fill-array-data v0, :array_4

    new-array v2, v12, [B

    fill-array-data v2, :array_5

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const-string v0, "\u06d7\u06d7\u06e8\u06d8\u06e0\u06ec\u06dc\u06eb\u06e8\u06e5\u06d8\u06dc\u06e2\u06df\u06df\u06e8\u06e8\u06e6\u06d6\u06d8\u06e1\u06da\u06ec\u06d7\u06e8\u06e8\u06d7\u06e0\u06e1\u06d8\u06db\u06e0\u06d9\u06ec\u06e0\u06d7\u06dc\u06da\u06e2\u06d6\u06d8\u06e8\u06e4\u06df\u06eb\u06db\u06e2\u06df\u06d8\u06e6\u06d8\u06e2\u06dc\u06d9\u06e8\u06d9\u06da"

    goto :goto_0

    :sswitch_5
    const/4 v0, 0x5

    new-array v0, v0, [B

    fill-array-data v0, :array_6

    new-array v2, v12, [B

    fill-array-data v2, :array_7

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const-string v0, "\u06e8\u06e4\u06e7\u06d6\u06df\u06d8\u06d8\u06e4\u06e2\u06e6\u06d7\u06da\u06ec\u06dc\u06eb\u06e5\u06e0\u06e6\u06eb\u06e4\u06e5\u06dc\u06d8\u06d9\u06df\u06db\u06eb\u06da\u06e8\u06e7\u06ec\u06e0\u06e8\u06e1\u06d6\u06e6\u06e2\u06ec\u06e6\u06d8\u06d8\u06d8\u06e8\u06dc\u06df\u06e5\u06e6\u06d6\u06db\u06e1\u06e4\u06e7\u06e1\u06e6\u06e6\u06e8\u06da"

    goto :goto_0

    :sswitch_6
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v7

    const-string v0, "\u06e8\u06ec\u06db\u06d9\u06dc\u06d6\u06d6\u06da\u06e7\u06d8\u06e8\u06ec\u06ec\u06e1\u06e1\u06d6\u06e8\u06e5\u06d8\u06e0\u06e7\u06e5\u06d8\u06d9\u06dc\u06d9\u06d7\u06e6\u06db\u06dc\u06e4\u06dc\u06d8\u06d8\u06e5\u06dc\u06df\u06db\u06e0\u06ec\u06e0\u06da\u06d9\u06db\u06d9\u06e0\u06e6\u06da\u06e2\u06e8\u06e1\u06e0\u06dc\u06d8\u06d9\u06e6\u06df\u06d8\u06db\u06d6\u06d8\u06e7\u06d6\u06e4\u06e6\u06e1\u06eb\u06db\u06e2\u06d9\u06e2\u06e6\u06e1\u06e4\u06e5\u06ec"

    move-object v8, v7

    goto/16 :goto_0

    :sswitch_7
    new-instance v2, Landroid/content/ComponentName;

    invoke-direct {v2, p0, v9}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const-string v0, "\u06db\u06d9\u06e8\u06d8\u06e2\u06d9\u06e0\u06d6\u06e2\u06d9\u06dc\u06eb\u06d7\u06eb\u06e1\u06e6\u06e8\u06e6\u06e4\u06e5\u06df\u06d7\u06ec\u06e8\u06e4\u06d8\u06ec\u06da\u06e8\u06eb\u06e5\u06e1\u06e7\u06d8\u06d8\u06e0\u06dc\u06e8\u06da\u06e4\u06e6\u06d8\u06e4\u06e8\u06dc\u06dc\u06e7\u06e5\u06d8\u06e5\u06df\u06d6\u06d8\u06ec\u06ec\u06d9\u06d6\u06df\u06e1\u06e2\u06e1\u06dc\u06e2\u06e6\u06e6\u06d7\u06e0\u06e5\u06d8"

    move-object v6, v2

    goto/16 :goto_0

    :sswitch_8
    const v2, 0x5085fb69

    const-string v0, "\u06d7\u06eb\u06d7\u06e8\u06ec\u06dc\u06d8\u06ec\u06d9\u06eb\u06e2\u06e8\u06e6\u06d8\u06e1\u06db\u06e5\u06d8\u06e7\u06ec\u06e0\u06e2\u06df\u06df\u06e6\u06e7\u06e1\u06d8\u06e6\u06e0\u06e8\u06d8\u06da\u06e0\u06d8\u06d8\u06ec\u06d9\u06e4\u06db\u06dc\u06d8\u06d7\u06e2\u06d7\u06e0\u06e2\u06e2\u06d8\u06e4\u06da\u06dc\u06e1\u06e8\u06d8\u06ec\u06d8\u06d6\u06d8\u06d6\u06db\u06d6\u06eb\u06ec\u06e5\u06d8\u06e8\u06e6\u06dc\u06d8\u06da\u06e0\u06df\u06e7\u06df\u06d8\u06e8\u06d7\u06e5\u06d7\u06db\u06da\u06e4\u06dc\u06e5\u06d8\u06db\u06df\u06e8\u06d8\u06e4\u06eb\u06e7"

    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v7

    xor-int/2addr v7, v2

    sparse-switch v7, :sswitch_data_1

    goto :goto_1

    :sswitch_9
    const-string v0, "\u06e4\u06d7\u06e7\u06d7\u06e1\u06d7\u06e0\u06e0\u06db\u06d8\u06e8\u06e2\u06d6\u06e5\u06e7\u06df\u06e1\u06e6\u06dc\u06df\u06d9\u06e1\u06e6\u06eb\u06e4\u06d7\u06d8\u06d8\u06d9\u06d8\u06e7\u06e2\u06da\u06d6\u06d8\u06e7\u06e4\u06d6\u06e4\u06ec\u06dc\u06d6\u06ec\u06e5\u06e7\u06dc\u06e0"

    goto :goto_1

    :sswitch_a
    const-string v0, "\u06e5\u06df\u06e8\u06d6\u06dc\u06eb\u06dc\u06da\u06d7\u06e1\u06d8\u06e0\u06ec\u06ec\u06e5\u06e0\u06e1\u06e1\u06e2\u06dc\u06e7\u06d8\u06e5\u06df\u06ec\u06e1\u06d8\u06e2\u06eb\u06e5\u06d6\u06d8\u06e1\u06e7\u06d8\u06d8\u06d8\u06e8\u06d8\u06d8\u06df\u06d6\u06df\u06e8\u06d6\u06ec\u06dc\u06e5\u06e7\u06d8\u06dc\u06e2\u06e6\u06d8\u06eb\u06db\u06df\u06da\u06d7\u06dc\u06d8"

    goto :goto_1

    :sswitch_b
    const v7, 0x131b6d59

    const-string v0, "\u06df\u06da\u06eb\u06e7\u06d9\u06e8\u06d8\u06e7\u06da\u06e1\u06d8\u06e5\u06ec\u06e6\u06df\u06e1\u06d7\u06df\u06eb\u06dc\u06e4\u06e6\u06dc\u06db\u06d6\u06d6\u06da\u06e6\u06e7\u06d8\u06e5\u06dc\u06d9\u06df\u06e7\u06eb\u06e4\u06e4\u06d9\u06e1\u06d8\u06d8\u06e6\u06d9\u06e8\u06d7\u06d8\u06d9\u06eb\u06e5\u06d8\u06e5\u06db\u06e0\u06dc\u06e2\u06d8\u06e1\u06d8\u06e6\u06ec\u06d7\u06e0\u06df\u06d7\u06e1\u06e0\u06df\u06eb\u06e6\u06e7\u06d8\u06e8\u06da\u06e5"

    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v10

    xor-int/2addr v10, v7

    sparse-switch v10, :sswitch_data_2

    goto :goto_2

    :sswitch_c
    const v10, -0x4d4ff836

    const-string v0, "\u06e2\u06dc\u06d7\u06e0\u06e8\u06db\u06d7\u06d6\u06e2\u06ec\u06e7\u06dc\u06d8\u06e1\u06e2\u06dc\u06e8\u06dc\u06e5\u06e6\u06d9\u06e7\u06d9\u06e5\u06d8\u06d8\u06db\u06df\u06da\u06d8\u06d7\u06e1\u06dc\u06e4\u06db\u06df\u06df\u06e7\u06e2\u06e4\u06e6\u06d8\u06d8\u06e0\u06da\u06d8\u06d8\u06e7\u06d8\u06d8\u06ec\u06e2\u06e7\u06e0\u06e2\u06e7\u06d8\u06eb\u06d6\u06e6\u06e1\u06d8\u06df\u06dc\u06e2\u06e2\u06d7\u06e4\u06db\u06e6\u06e6\u06e4\u06e2\u06d8\u06d8\u06e0\u06eb\u06e1"

    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v11

    xor-int/2addr v11, v10

    sparse-switch v11, :sswitch_data_3

    goto :goto_3

    :sswitch_d
    const-string v0, "\u06db\u06d8\u06eb\u06e6\u06db\u06e1\u06e5\u06df\u06e5\u06d8\u06e5\u06db\u06d9\u06df\u06e1\u06e8\u06d8\u06e7\u06d7\u06e0\u06e6\u06e1\u06d7\u06e7\u06dc\u06e5\u06e1\u06ec\u06db\u06e4\u06e7\u06ec\u06e4\u06e4\u06d8\u06d8\u06d9\u06da\u06d6\u06e8\u06db\u06ec\u06e7\u06da\u06d8\u06d8\u06df\u06e7\u06df\u06e6\u06e6\u06e1\u06d8\u06dc\u06e8\u06dc\u06d8\u06df\u06e5\u06e7\u06e0\u06df\u06eb\u06eb\u06db\u06eb\u06dc\u06d6\u06e6\u06d8\u06e4\u06db\u06e0\u06da\u06db\u06eb"

    goto :goto_2

    :sswitch_e
    const-string v0, "\u06e1\u06dc\u06e6\u06d8\u06e5\u06e0\u06d9\u06d7\u06d7\u06e7\u06d9\u06e7\u06e5\u06ec\u06e7\u06e6\u06df\u06df\u06e4\u06d8\u06d7\u06d9\u06e6\u06e6\u06dc\u06d8\u06e7\u06e2\u06db\u06db\u06d9\u06e2\u06df\u06d9\u06e5\u06d8\u06db\u06d9\u06dc\u06d8\u06d9\u06d8\u06e6\u06d8\u06ec\u06db\u06eb\u06d8\u06d8\u06d6\u06d7\u06dc\u06e2\u06ec\u06d8\u06e0\u06d6\u06d7\u06eb\u06e5\u06d8\u06eb\u06e6\u06e7\u06d8\u06e1\u06e7\u06ec"

    goto :goto_2

    :cond_0
    const-string v0, "\u06e6\u06e0\u06ec\u06eb\u06e6\u06e7\u06d8\u06d9\u06eb\u06e6\u06d7\u06e4\u06eb\u06da\u06e7\u06dc\u06ec\u06e1\u06e4\u06e2\u06e7\u06dc\u06d7\u06ec\u06e2\u06d8\u06e1\u06e1\u06e1\u06e2\u06e4\u06eb\u06e6\u06e5\u06e0\u06dc\u06dc\u06e8\u06e8\u06e4\u06dc\u06e0\u06dc\u06d6\u06da\u06db\u06d9\u06e8\u06e1\u06db\u06df\u06e2\u06da\u06e5\u06d8\u06e1\u06e5\u06dc\u06e5\u06e0\u06d6\u06e0\u06e1\u06d8\u06d8"

    goto :goto_3

    :sswitch_f
    if-eqz p1, :cond_0

    const-string v0, "\u06d9\u06e8\u06dc\u06d8\u06e5\u06db\u06d8\u06e8\u06df\u06d6\u06e0\u06e8\u06d8\u06d8\u06e6\u06e6\u06e5\u06d8\u06dc\u06d8\u06e8\u06d8\u06ec\u06d9\u06d8\u06eb\u06db\u06dc\u06d8\u06db\u06df\u06e6\u06e7\u06e1\u06dc\u06d8\u06e2\u06e4\u06d6\u06d8\u06e8\u06eb\u06e5\u06d8\u06e5\u06e0\u06eb\u06d8\u06e5\u06d7\u06e6\u06e8\u06e6\u06df\u06ec\u06e0\u06d7\u06e4\u06d6\u06d7\u06eb\u06e7"

    goto :goto_3

    :sswitch_10
    const-string v0, "\u06db\u06df\u06e2\u06ec\u06e5\u06db\u06dc\u06df\u06d8\u06d8\u06dc\u06da\u06e5\u06df\u06db\u06ec\u06e6\u06e8\u06d8\u06e6\u06d6\u06e6\u06d8\u06d9\u06e1\u06eb\u06d7\u06ec\u06da\u06e6\u06e2\u06d7\u06d6\u06e2\u06e6\u06d8\u06d8\u06e2\u06d9\u06db\u06df\u06db\u06da\u06e5\u06e4\u06df\u06df\u06e1\u06d8\u06e6\u06e5\u06e8\u06da\u06df\u06e7\u06df\u06e4"

    goto :goto_3

    :sswitch_11
    const-string v0, "\u06e6\u06ec\u06e6\u06df\u06d7\u06d6\u06d8\u06d9\u06e6\u06eb\u06e5\u06dc\u06eb\u06e2\u06e1\u06e6\u06d7\u06e0\u06d7\u06e7\u06eb\u06e1\u06dc\u06e8\u06d8\u06ec\u06eb\u06e6\u06d8\u06e2\u06e4\u06e8\u06d8\u06ec\u06d7\u06d6\u06d8\u06df\u06ec\u06db\u06d8\u06da\u06d8\u06d8\u06ec\u06df\u06e6\u06e5\u06ec\u06da\u06eb\u06da\u06e4\u06d6\u06d6\u06dc\u06d8\u06df\u06d9\u06e6\u06d8\u06e1\u06d8\u06e7\u06d8\u06e2\u06d9\u06e4\u06e0\u06d6\u06d6\u06e7\u06e4\u06dc\u06d8\u06e0\u06d8\u06da\u06d7\u06dc\u06e6\u06e1\u06e8\u06e8\u06d9\u06d9\u06e8\u06eb\u06e2\u06e8"

    goto :goto_2

    :sswitch_12
    const-string v0, "\u06e1\u06dc\u06dc\u06da\u06e1\u06e5\u06d7\u06e7\u06e6\u06eb\u06d8\u06e7\u06d8\u06d8\u06d6\u06d8\u06d8\u06e8\u06e7\u06e5\u06d6\u06df\u06e1\u06d7\u06dc\u06dc\u06d8\u06e2\u06e5\u06eb\u06e2\u06db\u06e1\u06d8\u06e2\u06dc\u06e8\u06ec\u06ec\u06d6\u06e1\u06e4\u06d7\u06e0\u06d8\u06e2\u06df\u06dc\u06e6\u06e6\u06e1\u06d8\u06e2\u06e6\u06eb\u06dc\u06d6\u06d6\u06df\u06e0\u06d8\u06d8\u06d6\u06db\u06d7\u06eb\u06e1\u06ec"

    goto :goto_1

    :sswitch_13
    const-string v0, "\u06d6\u06e1\u06d9\u06e4\u06dc\u06dc\u06d8\u06e2\u06df\u06d9\u06e2\u06ec\u06e5\u06d8\u06e1\u06e1\u06e1\u06d8\u06e0\u06ec\u06d6\u06e5\u06db\u06d8\u06e8\u06e5\u06eb\u06da\u06dc\u06e6\u06d8\u06e6\u06d9\u06da\u06d7\u06dc\u06d8\u06d9\u06e4\u06db\u06e0\u06e6\u06e8\u06d8\u06d6\u06eb\u06e8\u06df\u06ec\u06e0\u06e8\u06ec\u06d7\u06e5\u06db\u06e5\u06db\u06e0\u06dc\u06d8\u06d6\u06df\u06dc\u06d8\u06e1\u06d6\u06da\u06e0\u06e7\u06d6\u06d8\u06d9\u06eb\u06db\u06e5\u06df\u06e4\u06db\u06e8\u06db"

    goto/16 :goto_0

    :sswitch_14
    const/4 v5, 0x2

    const-string v0, "\u06e5\u06df\u06e1\u06d8\u06e2\u06db\u06d8\u06ec\u06df\u06e6\u06d8\u06d6\u06df\u06e4\u06d7\u06dc\u06eb\u06e1\u06d9\u06e8\u06e5\u06da\u06e1\u06ec\u06d8\u06e8\u06eb\u06da\u06d6\u06d8\u06d9\u06dc\u06e4\u06e6\u06d9\u06e6\u06d6\u06db\u06e8\u06e4\u06d7\u06db\u06d7\u06df\u06dc\u06eb\u06df\u06da\u06e1\u06d9\u06e2\u06e8\u06e8\u06e4\u06e8\u06da\u06d7\u06e5\u06e6\u06e6\u06e1\u06e5\u06e7\u06e6\u06e1\u06df\u06e0\u06d8\u06d6\u06e0\u06e6\u06d8\u06e4\u06dc\u06e7\u06db\u06e2\u06e2\u06e6\u06e5\u06e7\u06e5\u06e7\u06dc"

    goto/16 :goto_0

    :sswitch_15
    const-string v0, "\u06e8\u06e4\u06dc\u06eb\u06d9\u06d8\u06d8\u06e4\u06d8\u06e5\u06d6\u06e6\u06dc\u06e4\u06dc\u06e6\u06d8\u06da\u06df\u06eb\u06e5\u06d8\u06d6\u06d8\u06e5\u06dc\u06e4\u06e2\u06db\u06e2\u06e4\u06e0\u06d8\u06d8\u06e2\u06e4\u06d6\u06eb\u06e7\u06d8\u06d8\u06da\u06d8\u06e0\u06e8\u06e6\u06d7\u06d8\u06d8\u06dc\u06da\u06e4\u06d6\u06e0\u06e0\u06d9\u06eb\u06e8\u06d8\u06e4\u06e8\u06e7\u06d8\u06d9\u06e6\u06e5\u06d8\u06e5\u06db\u06db\u06e2\u06d9\u06e0\u06d9\u06d8\u06dc\u06e8\u06e6\u06d7"

    move v4, v5

    goto/16 :goto_0

    :sswitch_16
    const-string v0, "\u06d7\u06df\u06e5\u06e6\u06eb\u06e2\u06e8\u06e8\u06d6\u06e1\u06e2\u06d6\u06d8\u06da\u06d6\u06dc\u06e5\u06e1\u06d8\u06da\u06d9\u06e6\u06d7\u06e1\u06e1\u06db\u06e6\u06e7\u06e8\u06e8\u06d9\u06d8\u06ec\u06e7\u06d8\u06d9\u06e8\u06e8\u06e7\u06e7\u06e2\u06e1\u06db\u06e5\u06e2\u06d8\u06eb\u06df\u06ec\u06db\u06eb\u06e4\u06e7\u06e6\u06da"

    move v1, v3

    goto/16 :goto_0

    :sswitch_17
    const-string v0, "\u06df\u06e4\u06d8\u06d8\u06d8\u06d6\u06df\u06e5\u06d9\u06e0\u06e7\u06e8\u06e6\u06d8\u06df\u06db\u06d7\u06d8\u06da\u06e0\u06df\u06df\u06e8\u06e1\u06e7\u06d8\u06df\u06e5\u06e1\u06d8\u06e4\u06ec\u06eb\u06e5\u06db\u06d8\u06e6\u06e2\u06d6\u06ec\u06e8\u06e6\u06d8\u06ec\u06e0\u06e8\u06d8\u06e8\u06d6\u06e0"

    move v4, v1

    goto/16 :goto_0

    :sswitch_18
    const v2, 0x6a9a7b0d

    const-string v0, "\u06ec\u06d7\u06d6\u06d8\u06e1\u06e4\u06d6\u06e5\u06dc\u06d9\u06e2\u06d9\u06d9\u06dc\u06e6\u06d6\u06d8\u06e6\u06e1\u06da\u06dc\u06ec\u06dc\u06dc\u06dc\u06ec\u06e6\u06d9\u06e1\u06d8\u06d6\u06e6\u06db\u06e4\u06e1\u06d9\u06da\u06e8\u06d7\u06d6\u06db\u06d8\u06d8\u06e5\u06e2\u06d6\u06d8\u06d8\u06d8\u06db\u06d9\u06d9\u06e7\u06e4\u06db\u06dc\u06e6\u06e0\u06e5\u06d8\u06eb\u06d8\u06d8\u06e0\u06eb\u06e8\u06e2\u06e0\u06e7\u06e4\u06e1\u06d6\u06d8\u06e4\u06d7\u06e6\u06e1\u06e8\u06dc\u06d8"

    :goto_4
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v7

    xor-int/2addr v7, v2

    sparse-switch v7, :sswitch_data_4

    goto :goto_4

    :sswitch_19
    const-string v0, "\u06d6\u06e1\u06db\u06df\u06d6\u06dc\u06e6\u06d9\u06e1\u06d8\u06e2\u06eb\u06e2\u06e0\u06db\u06e4\u06eb\u06e1\u06e4\u06d7\u06d7\u06e4\u06da\u06da\u06dc\u06d8\u06dc\u06da\u06e8\u06dc\u06da\u06db\u06eb\u06e6\u06d9\u06e5\u06e6\u06d8\u06e0\u06dc\u06eb\u06e5\u06d8\u06e7\u06d8\u06d8\u06d6\u06e7\u06d8\u06d6\u06e8\u06e5\u06e0\u06e6\u06d6\u06da\u06d6\u06e8\u06d8\u06e7\u06da\u06d7\u06e8\u06d8\u06e1\u06dc\u06da\u06e8\u06d8"

    goto/16 :goto_0

    :sswitch_1a
    const-string v0, "\u06da\u06d6\u06e5\u06d8\u06e4\u06e0\u06e2\u06e0\u06db\u06dc\u06d8\u06e8\u06e5\u06dc\u06d8\u06e4\u06d6\u06e0\u06e4\u06e7\u06e2\u06e7\u06e6\u06e7\u06d8\u06e4\u06e4\u06e0\u06e8\u06d6\u06e2\u06dc\u06e1\u06d8\u06e1\u06eb\u06e7\u06ec\u06ec\u06d8\u06e4\u06e5\u06df\u06d6\u06e8\u06e8\u06e1\u06e5\u06eb\u06d6\u06e7\u06eb\u06d9\u06d9\u06d9\u06e2\u06d9\u06e5\u06d8\u06db\u06db\u06e5\u06e4\u06da\u06df\u06d9\u06e2\u06e0"

    goto :goto_4

    :sswitch_1b
    const v7, -0x121812d5

    const-string v0, "\u06e7\u06d8\u06ec\u06dc\u06dc\u06e6\u06d8\u06ec\u06e1\u06e6\u06d8\u06e4\u06e2\u06e1\u06e6\u06ec\u06e2\u06d8\u06d9\u06d9\u06e4\u06e0\u06e1\u06dc\u06ec\u06e5\u06e4\u06ec\u06e1\u06d8\u06e2\u06e7\u06dc\u06d8\u06e8\u06d8\u06e6\u06da\u06ec\u06df\u06dc\u06dc\u06e8\u06e6\u06e6\u06d8\u06e1\u06ec\u06e5\u06d8\u06e1\u06e0\u06e2\u06dc\u06dc\u06e1\u06d8\u06e7\u06e6\u06d7\u06e0\u06e4\u06d6\u06e7\u06e8\u06df\u06d6\u06df\u06d6\u06d8"

    :goto_5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v10

    xor-int/2addr v10, v7

    sparse-switch v10, :sswitch_data_5

    goto :goto_5

    :sswitch_1c
    const-string v0, "\u06e8\u06d9\u06e6\u06d8\u06e6\u06da\u06d7\u06e5\u06e0\u06d6\u06e0\u06e0\u06e8\u06d8\u06e2\u06d8\u06e2\u06ec\u06e0\u06e5\u06eb\u06e2\u06d6\u06d8\u06da\u06e1\u06e1\u06d8\u06e0\u06d8\u06e8\u06d6\u06e5\u06d8\u06e5\u06e0\u06e8\u06d7\u06e1\u06dc\u06d8\u06e8\u06e5\u06e5\u06d8\u06e6\u06da\u06d8\u06d8\u06dc\u06df\u06d9\u06db\u06e4\u06e5\u06d8\u06db\u06ec\u06e0\u06eb\u06e5\u06eb\u06e2\u06e0\u06d9\u06e1\u06e4\u06e8\u06d8\u06e8\u06e0\u06d9\u06e0\u06d6\u06db\u06ec\u06eb\u06d6\u06d8\u06ec\u06d7\u06e5\u06d8\u06dc\u06ec\u06e0\u06d6\u06dc\u06dc\u06e2\u06d8\u06d8"

    goto :goto_4

    :sswitch_1d
    const-string v0, "\u06d9\u06eb\u06dc\u06d8\u06e4\u06d8\u06da\u06e5\u06e5\u06d8\u06eb\u06d7\u06e6\u06df\u06e6\u06d6\u06d8\u06e0\u06ec\u06e5\u06e7\u06da\u06d7\u06e7\u06e7\u06e8\u06e8\u06e7\u06eb\u06e4\u06e1\u06e6\u06da\u06e7\u06e5\u06d8\u06eb\u06e7\u06e1\u06ec\u06d6\u06d8\u06e6\u06dc\u06e5\u06d8\u06e1\u06d8\u06df\u06e0\u06eb\u06da\u06e8\u06e6\u06d7\u06d9\u06dc\u06e7\u06d8"

    goto :goto_5

    :sswitch_1e
    const v10, 0x13ef8c1f

    const-string v0, "\u06e0\u06e5\u06d7\u06dc\u06db\u06e8\u06d7\u06e7\u06dc\u06d8\u06e8\u06e6\u06d6\u06d8\u06df\u06d9\u06e0\u06e5\u06d8\u06dc\u06db\u06d7\u06db\u06e7\u06d7\u06dc\u06da\u06d8\u06d6\u06dc\u06d8\u06d6\u06db\u06e4\u06db\u06e6\u06dc\u06dc\u06d8\u06e0\u06ec\u06e0\u06eb\u06df\u06d8\u06ec\u06dc"

    :goto_6
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v11

    xor-int/2addr v11, v10

    sparse-switch v11, :sswitch_data_6

    goto :goto_6

    :sswitch_1f
    const-string v0, "\u06d9\u06da\u06db\u06e8\u06d9\u06da\u06ec\u06e6\u06e5\u06d8\u06d6\u06e8\u06d8\u06e7\u06eb\u06e8\u06db\u06e2\u06e2\u06d8\u06ec\u06dc\u06e4\u06df\u06eb\u06d6\u06da\u06d8\u06e6\u06dc\u06e8\u06d8\u06d9\u06df\u06e0\u06da\u06d7\u06d9\u06e7\u06df\u06eb\u06ec\u06dc\u06d9\u06e2\u06d6\u06e4\u06e8\u06e5\u06e4\u06d7\u06e1\u06d6\u06e7\u06e6\u06db\u06df\u06d8\u06d9\u06db\u06e6\u06da\u06d9\u06dc"

    goto :goto_6

    :cond_1
    const-string v0, "\u06dc\u06db\u06e7\u06d7\u06d7\u06e4\u06e0\u06e0\u06da\u06ec\u06db\u06eb\u06eb\u06df\u06db\u06eb\u06dc\u06db\u06df\u06d6\u06e8\u06d8\u06d9\u06e5\u06e6\u06d7\u06e0\u06e8\u06d8\u06d9\u06e5\u06d6\u06e1\u06ec\u06e1\u06d8\u06ec\u06e6\u06ec\u06db\u06dc\u06e5\u06e1\u06d8\u06d8\u06da\u06d7\u06d8"

    goto :goto_6

    :sswitch_20
    invoke-virtual {v8, v6}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    move-result v0

    if-eq v0, v4, :cond_1

    const-string v0, "\u06db\u06dc\u06df\u06e1\u06e4\u06d8\u06ec\u06e7\u06d6\u06e0\u06d9\u06e8\u06d7\u06e5\u06d8\u06d8\u06d9\u06ec\u06db\u06d6\u06d6\u06d8\u06e6\u06eb\u06e4\u06d9\u06e5\u06eb\u06e7\u06e2\u06e6\u06d6\u06df\u06df\u06e8\u06d6\u06d8\u06e0\u06e2\u06e6\u06e2\u06e2\u06e6\u06d8\u06d9\u06e5\u06d8\u06d8"

    goto :goto_6

    :sswitch_21
    const-string v0, "\u06dc\u06e0\u06e7\u06e5\u06e8\u06dc\u06d8\u06d9\u06d6\u06d6\u06d8\u06d6\u06e8\u06dc\u06e6\u06db\u06da\u06e4\u06e0\u06e2\u06e8\u06df\u06e8\u06d8\u06dc\u06e7\u06e1\u06d9\u06eb\u06dc\u06e5\u06ec\u06d6\u06e4\u06e0\u06d8\u06e7\u06d8\u06e8\u06d8\u06e5\u06e2\u06eb\u06d6\u06d6\u06e0\u06eb\u06d9\u06e0\u06d8\u06e1\u06d8\u06d9\u06e4\u06e7\u06e4\u06da\u06d9"

    goto :goto_5

    :sswitch_22
    const-string v0, "\u06e8\u06db\u06e5\u06d8\u06d8\u06ec\u06dc\u06d8\u06eb\u06e6\u06e1\u06d8\u06e6\u06e8\u06ec\u06d6\u06e4\u06df\u06e4\u06e7\u06e5\u06e6\u06d7\u06e1\u06e0\u06eb\u06e0\u06d7\u06e2\u06d8\u06d9\u06e0\u06da\u06d7\u06d6\u06d8\u06e5\u06db\u06da\u06ec\u06e6\u06d8\u06d7\u06ec\u06e6\u06e7\u06e6\u06d8\u06d8\u06e1\u06d8\u06e7\u06d8\u06e8\u06e8\u06db\u06df\u06e8\u06e2\u06e6\u06d6\u06ec\u06db\u06da\u06df\u06e1\u06e5\u06ec\u06df\u06d8\u06d8\u06e1\u06d6\u06d7\u06e8\u06e7\u06e8"

    goto :goto_5

    :sswitch_23
    const-string v0, "\u06e6\u06e5\u06dc\u06e4\u06da\u06d8\u06e4\u06e8\u06e8\u06d6\u06eb\u06e7\u06dc\u06e0\u06da\u06db\u06e4\u06eb\u06dc\u06d8\u06ec\u06da\u06eb\u06e4\u06eb\u06e5\u06e7\u06eb\u06d8\u06e7\u06ec\u06e0\u06d6\u06e7\u06ec\u06e5\u06d9\u06e2\u06e2\u06e1\u06dc\u06df\u06d6\u06dc\u06ec\u06e1\u06dc\u06d8\u06db\u06d7\u06eb\u06dc\u06e0\u06d6\u06ec\u06e0\u06e6\u06d8\u06d7\u06e5\u06e8\u06d8\u06e6\u06d9"

    goto :goto_4

    :sswitch_24
    invoke-virtual {v8, v6, v4, v3}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    const-string v0, "\u06da\u06eb\u06e6\u06d8\u06eb\u06d6\u06dc\u06ec\u06d8\u06ec\u06e7\u06db\u06df\u06e1\u06e7\u06d8\u06e8\u06d7\u06d6\u06d8\u06dc\u06e4\u06dc\u06d8\u06d9\u06e7\u06e6\u06d8\u06ec\u06d7\u06dc\u06d8\u06d7\u06d6\u06e0\u06d8\u06e6\u06e6\u06d8\u06e7\u06e6\u06e6\u06d8\u06e8\u06e0\u06e1\u06d8\u06db\u06df\u06eb\u06d7\u06d6\u06e2\u06e5\u06db\u06e1\u06d8\u06e7\u06e0\u06e6\u06d8\u06dc\u06d6\u06e4\u06dc\u06df\u06db\u06d7\u06e5\u06d7\u06e5\u06e7\u06e5"

    goto/16 :goto_0

    :sswitch_25
    const-string v0, "\u06e0\u06e7\u06d6\u06d6\u06df\u06dc\u06d8\u06e2\u06d8\u06dc\u06d8\u06da\u06eb\u06e1\u06d6\u06e8\u06e6\u06d8\u06d6\u06e7\u06d7\u06e7\u06e8\u06d8\u06e8\u06e1\u06e7\u06e2\u06e0\u06e8\u06df\u06e6\u06e8\u06d8\u06e5\u06e4\u06d6\u06d8\u06df\u06d9\u06d8\u06d8\u06e6\u06e5\u06d8\u06d8\u06d9\u06db\u06e2\u06db\u06e4\u06e0\u06db\u06e4\u06db\u06dc\u06e0\u06e5\u06d8\u06e8\u06d9\u06e8\u06d8\u06db\u06d8\u06d6\u06eb\u06df\u06d6\u06d8\u06e7\u06db\u06db\u06e2\u06dc\u06e6\u06e7\u06da\u06eb\u06e8\u06e0\u06d8\u06d8\u06d6\u06dc\u06e6\u06dc\u06e1\u06e1\u06e7"

    goto/16 :goto_0

    :sswitch_26
    const-string v0, "\u06df\u06e4\u06d8\u06d8\u06d8\u06d6\u06df\u06e5\u06d9\u06e0\u06e7\u06e8\u06e6\u06d8\u06df\u06db\u06d7\u06d8\u06da\u06e0\u06df\u06df\u06e8\u06e1\u06e7\u06d8\u06df\u06e5\u06e1\u06d8\u06e4\u06ec\u06eb\u06e5\u06db\u06d8\u06e6\u06e2\u06d6\u06ec\u06e8\u06e6\u06d8\u06ec\u06e0\u06e8\u06d8\u06e8\u06d6\u06e0"

    goto/16 :goto_0

    :sswitch_27
    const-string v0, "\u06da\u06eb\u06e6\u06d8\u06eb\u06d6\u06dc\u06ec\u06d8\u06ec\u06e7\u06db\u06df\u06e1\u06e7\u06d8\u06e8\u06d7\u06d6\u06d8\u06dc\u06e4\u06dc\u06d8\u06d9\u06e7\u06e6\u06d8\u06ec\u06d7\u06dc\u06d8\u06d7\u06d6\u06e0\u06d8\u06e6\u06e6\u06d8\u06e7\u06e6\u06e6\u06d8\u06e8\u06e0\u06e1\u06d8\u06db\u06df\u06eb\u06d7\u06d6\u06e2\u06e5\u06db\u06e1\u06d8\u06e7\u06e0\u06e6\u06d8\u06dc\u06d6\u06e4\u06dc\u06df\u06db\u06d7\u06e5\u06d7\u06e5\u06e7\u06e5"

    goto/16 :goto_0

    :sswitch_28
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x55ada9b5 -> :sswitch_1
        -0x54f2442c -> :sswitch_6
        -0x4aece3fd -> :sswitch_18
        -0x32e2ad32 -> :sswitch_14
        -0x2c406bf4 -> :sswitch_0
        -0x27c4e4e1 -> :sswitch_26
        -0x26d4cf84 -> :sswitch_7
        -0x246d3af8 -> :sswitch_24
        -0x237ebe41 -> :sswitch_17
        -0x14d3b70c -> :sswitch_5
        -0x8e7286e -> :sswitch_8
        -0x490482 -> :sswitch_4
        0x2aa94ed8 -> :sswitch_15
        0x44648659 -> :sswitch_28
        0x4805f879 -> :sswitch_16
        0x52f32642 -> :sswitch_2
        0x654a0841 -> :sswitch_3
    .end sparse-switch

    :array_0
    .array-data 1
        0x63t
        0x5dt
        -0x33t
        -0x40t
        0x54t
        0x5et
        0x68t
        0x5bt
        -0x39t
    .end array-data

    nop

    :array_1
    .array-data 1
        0xbt
        0x34t
        -0x57t
        -0x5bt
        0xbt
        0x37t
    .end array-data

    nop

    :array_2
    .array-data 1
        0x44t
        -0x5ct
        -0xet
        -0x37t
        0x30t
        -0x2ct
        0x5et
        -0x5dt
        -0x2t
        -0x77t
        0x27t
        -0x6ft
        0x55t
        -0x52t
        -0x5t
        -0x7bt
        0x2ct
        -0x30t
        0x4ct
        -0x5dt
        -0x6t
        -0x75t
        0x33t
        -0x26t
        0x55t
        -0x1bt
        -0x2et
        -0x7at
        0x2at
        -0x2ft
        0x66t
        -0x58t
        -0x15t
        -0x72t
        0x35t
        -0x2at
        0x53t
        -0x4et
        -0x22t
        -0x75t
        0x2at
        -0x22t
        0x54t
    .end array-data

    :array_3
    .array-data 1
        0x27t
        -0x35t
        -0x61t
        -0x19t
        0x43t
        -0x41t
    .end array-data

    nop

    :array_4
    .array-data 1
        -0x70t
        0x53t
        -0x3et
        -0x4ft
        -0x1et
        -0x13t
        -0x79t
    .end array-data

    :array_5
    .array-data 1
        -0xdt
        0x3ct
        -0x54t
        -0x3bt
        -0x79t
        -0x6bt
    .end array-data

    nop

    :array_6
    .array-data 1
        0x57t
        0x3ft
        -0x7et
        0x7t
        0x30t
    .end array-data

    nop

    :array_7
    .array-data 1
        0x36t
        0x53t
        -0x15t
        0x66t
        0x43t
        -0x24t
    .end array-data

    nop

    :sswitch_data_1
    .sparse-switch
        -0x6569414b -> :sswitch_9
        -0x51c4eded -> :sswitch_13
        -0x3ab986e0 -> :sswitch_b
        0x14127a01 -> :sswitch_25
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        -0x496d7dc1 -> :sswitch_a
        -0x41dd5a46 -> :sswitch_c
        -0x3ae3c133 -> :sswitch_12
        -0x318718f8 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        -0x5e3c2343 -> :sswitch_d
        -0x787bc72 -> :sswitch_f
        0x606d6a4b -> :sswitch_e
        0x720de7d7 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        -0x46579180 -> :sswitch_27
        -0x26cd1734 -> :sswitch_1b
        -0x22dc55db -> :sswitch_23
        -0x1ec4bdc -> :sswitch_19
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        -0x53d1706a -> :sswitch_1a
        -0x2d6009be -> :sswitch_22
        -0x1d1f942 -> :sswitch_1e
        0x1d560ca8 -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        -0x551375ed -> :sswitch_1f
        -0x4c397fe3 -> :sswitch_21
        -0x38f5658e -> :sswitch_1d
        -0x12754ed0 -> :sswitch_20
    .end sparse-switch
.end method

.method public final ۥ۟(L۟/g3;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u06df/g3",
            "<-",
            "Ljava/lang/CharSequence;",
            "L\u06df/vb;",
            ">;)V"
        }
    .end annotation

    const/4 v8, 0x6

    const/4 v7, 0x3

    const/4 v2, 0x0

    const-string v0, "\u06e8\u06e4\u06e8\u06e4\u06eb\u06e6\u06d8\u06d6\u06d7\u06df\u06df\u06e7\u06e7\u06d9\u06e7\u06e7\u06db\u06e6\u06dc\u06d8\u06dc\u06eb\u06dc\u06d8\u06dc\u06db\u06e5\u06d8\u06d8\u06e2\u06ec\u06ec\u06dc\u06d8\u06e0\u06e1\u06df\u06d8\u06dc\u06e1\u06e5\u06e8\u06e2\u06db\u06dc\u06e4\u06dc\u06e8\u06dc\u06d8\u06e1\u06df\u06dc\u06d8\u06e6\u06e6\u06d8\u06e0\u06df\u06d8\u06dc\u06ec\u06e2\u06eb\u06d7\u06e8\u06d8\u06e2\u06d9\u06e5\u06d8\u06e1\u06e4\u06d6\u06d8\u06da\u06d8\u06e6\u06d8\u06df\u06d6\u06eb"

    move v1, v2

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/16 v4, 0x2b1

    xor-int/2addr v3, v4

    xor-int/lit16 v3, v3, 0x2e9

    const/16 v4, 0x268

    xor-int/2addr v3, v4

    xor-int/lit16 v3, v3, 0x166

    const/16 v4, 0x3ae

    xor-int/2addr v3, v4

    xor-int/lit16 v3, v3, 0x3db

    const/16 v4, 0x361

    const v5, -0x6082eb6b

    xor-int/2addr v3, v4

    xor-int/2addr v3, v5

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e1\u06e5\u06d8\u06d8\u06d7\u06d6\u06e6\u06e5\u06da\u06e6\u06d8\u06da\u06eb\u06e6\u06e5\u06dc\u06dc\u06d8\u06d9\u06e1\u06d9\u06d9\u06e5\u06e5\u06d8\u06dc\u06e6\u06eb\u06e2\u06e6\u06e8\u06d8\u06da\u06d6\u06d9\u06e5\u06e5\u06ec\u06da\u06d6\u06d9\u06dc\u06e8\u06d8\u06e1\u06d6\u06e6\u06d8\u06eb\u06dc\u06dc\u06e4\u06e5\u06e6\u06d9\u06e7\u06d8\u06e5\u06e5"

    goto :goto_0

    :sswitch_1
    const-string v0, "\u06e1\u06e2\u06da\u06ec\u06dc\u06e8\u06d8\u06e6\u06e0\u06e8\u06d6\u06e5\u06da\u06e1\u06d6\u06d8\u06db\u06dc\u06e6\u06d8\u06ec\u06e7\u06dc\u06d8\u06db\u06ec\u06da\u06d6\u06dc\u06e2\u06d7\u06d8\u06eb\u06db\u06eb\u06e6\u06e7\u06e4\u06d9\u06e8\u06e0\u06d6\u06d8\u06d9\u06e1\u06d8\u06d8\u06df\u06e8\u06d8\u06d8\u06e1\u06d7\u06da\u06d7\u06eb\u06eb\u06e5\u06e7\u06e0\u06da\u06db\u06d7\u06e5\u06dc\u06e1\u06ec\u06d7\u06e8\u06d8\u06d7\u06e4\u06d6\u06d6\u06e7\u06d6\u06d8\u06da\u06e4\u06eb\u06ec\u06e6\u06d7\u06d6\u06df\u06d6\u06d8\u06e4\u06e4\u06d6\u06d8"

    goto :goto_0

    :sswitch_2
    iget v1, p0, Lcom/skyhand/redbookhelper/MainActivity;->ۥ۟ۢ:I

    const-string v0, "\u06d8\u06e7\u06e5\u06d8\u06d8\u06e7\u06d8\u06d6\u06e2\u06d8\u06d8\u06df\u06e6\u06d9\u06d6\u06e6\u06d8\u06d9\u06e5\u06ec\u06e7\u06e8\u06eb\u06d6\u06e4\u06d9\u06ec\u06e8\u06d8\u06e1\u06e5\u06dc\u06d8\u06e8\u06d6\u06e5\u06d8\u06e0\u06d7\u06e5\u06d8\u06dc\u06d7\u06e1\u06d8\u06dc\u06e0\u06e4\u06e7\u06e6\u06d8\u06d9\u06d7\u06dc\u06d8\u06da\u06e7\u06d9\u06db\u06ec\u06e2\u06d6\u06dc\u06e6\u06d8\u06e5\u06e0\u06df\u06df\u06e4\u06df"

    goto :goto_0

    :sswitch_3
    const v3, 0x56cc34e0

    const-string v0, "\u06e1\u06db\u06e0\u06ec\u06dc\u06d8\u06d8\u06eb\u06e7\u06e4\u06e8\u06d6\u06e7\u06d8\u06d8\u06d7\u06e1\u06d8\u06d9\u06d8\u06e4\u06db\u06e0\u06d8\u06e4\u06eb\u06e6\u06d8\u06d7\u06d8\u06d8\u06d8\u06db\u06e5\u06dc\u06df\u06e1\u06eb\u06e6\u06dc\u06d8\u06df\u06d6\u06e5\u06db\u06e4\u06e4\u06d7\u06e8\u06e2\u06ec\u06e6\u06d7\u06e6\u06d7\u06d9\u06d9\u06e8\u06d8\u06e0\u06d9\u06df\u06d9\u06e0\u06e8\u06d8\u06df\u06d8\u06d8"

    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v4, v3

    sparse-switch v4, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    const-string v0, "\u06e5\u06db\u06d9\u06da\u06e4\u06db\u06e5\u06e0\u06e0\u06e4\u06e8\u06d8\u06db\u06e1\u06da\u06d9\u06dc\u06d8\u06dc\u06e1\u06d6\u06d8\u06db\u06d6\u06da\u06dc\u06e6\u06e4\u06e8\u06e6\u06e2\u06df\u06dc\u06d8\u06e1\u06e6\u06e5\u06e5\u06e5\u06d6\u06d8\u06e7\u06df\u06e1\u06d8\u06e8\u06df\u06e6\u06d6\u06da\u06e8\u06d7\u06da\u06e1\u06d7\u06d8\u06db\u06e1\u06eb\u06e8\u06d8\u06e0\u06e4\u06da\u06e5\u06da\u06e2\u06e1\u06d6\u06d6\u06db\u06df\u06e4\u06e2\u06d8\u06d8"

    goto :goto_0

    :sswitch_5
    const-string v0, "\u06e4\u06d8\u06dc\u06d8\u06df\u06d9\u06d6\u06e1\u06e5\u06d8\u06da\u06d6\u06d8\u06e5\u06e8\u06ec\u06d7\u06e6\u06d6\u06db\u06e8\u06db\u06d6\u06db\u06df\u06d8\u06eb\u06e8\u06eb\u06eb\u06e4\u06ec\u06e8\u06e2\u06e5\u06dc\u06dc\u06e2\u06e5\u06e5\u06d8\u06eb\u06e7\u06e0\u06df\u06e7\u06e1\u06e7\u06d9\u06e6\u06d6\u06e8\u06db\u06ec\u06e7\u06e1\u06d8\u06e2\u06e5\u06e7\u06db\u06d9\u06d8"

    goto :goto_1

    :sswitch_6
    const v4, 0x73a67d11

    const-string v0, "\u06d8\u06e0\u06e0\u06d6\u06e4\u06d6\u06d8\u06ec\u06e1\u06da\u06da\u06db\u06e2\u06e1\u06ec\u06d9\u06e6\u06db\u06da\u06da\u06db\u06eb\u06e6\u06d7\u06d8\u06d8\u06e1\u06e1\u06e2\u06d7\u06e8\u06e0\u06d9\u06d8\u06e6\u06d8\u06e2\u06ec\u06e0\u06e8\u06e7\u06df\u06d8\u06da\u06db\u06d8\u06d7\u06df\u06df\u06e0\u06e6\u06d8\u06ec\u06e6\u06e1\u06d7\u06da\u06d6\u06d8\u06e1\u06db\u06d9\u06ec\u06dc\u06e6\u06d8\u06dc\u06e7\u06e8\u06d8\u06dc\u06e6\u06d8\u06ec\u06e0\u06e8\u06d8\u06e7\u06da\u06db"

    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v5

    xor-int/2addr v5, v4

    sparse-switch v5, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    const v5, -0x4bd6be5b

    const-string v0, "\u06ec\u06eb\u06e1\u06d8\u06e2\u06ec\u06e1\u06d8\u06e1\u06db\u06e5\u06e7\u06d8\u06eb\u06e1\u06e5\u06e0\u06e5\u06df\u06ec\u06da\u06db\u06da\u06da\u06d6\u06d9\u06eb\u06e5\u06e5\u06ec\u06e1\u06db\u06d6\u06e5\u06d8\u06eb\u06dc\u06e8\u06d8\u06ec\u06ec\u06e5\u06d8\u06e2\u06dc\u06e8\u06d8\u06e8\u06d7\u06e1\u06d8\u06da\u06d6\u06e4\u06e0\u06ec\u06e7\u06ec\u06d8\u06eb\u06dc\u06db\u06d8\u06d8\u06e4\u06e0\u06e2\u06e0\u06e7\u06d9"

    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v6

    xor-int/2addr v6, v5

    sparse-switch v6, :sswitch_data_3

    goto :goto_3

    :sswitch_8
    const-string v0, "\u06d7\u06e1\u06dc\u06db\u06db\u06e4\u06da\u06e1\u06da\u06ec\u06db\u06d8\u06d8\u06e6\u06d7\u06e6\u06e1\u06e7\u06d6\u06d8\u06df\u06d9\u06d7\u06dc\u06e5\u06d7\u06d8\u06ec\u06e8\u06d8\u06e6\u06eb\u06d9\u06e5\u06d9\u06d7\u06d6\u06da\u06da\u06ec\u06da\u06e0\u06d8\u06e5\u06d8\u06e0\u06e1\u06e0\u06d8\u06da\u06e5\u06dc\u06e1\u06e7\u06d8\u06df\u06ec\u06d7\u06e8\u06e4\u06d6\u06d8\u06e2\u06d8\u06d8\u06e5\u06e0\u06e2\u06e0\u06d6\u06e5\u06e6\u06d9\u06e1\u06e2\u06df\u06e2"

    goto :goto_2

    :sswitch_9
    const-string v0, "\u06e7\u06dc\u06d9\u06df\u06e2\u06dc\u06d8\u06e7\u06ec\u06dc\u06e5\u06e2\u06e7\u06e4\u06e7\u06eb\u06d6\u06e5\u06d8\u06d8\u06e5\u06d6\u06d8\u06d8\u06ec\u06d8\u06e5\u06d8\u06d6\u06e1\u06e8\u06ec\u06e8\u06e5\u06dc\u06db\u06d8\u06e6\u06e1\u06e2\u06ec\u06dc\u06e7\u06db\u06e5\u06d8\u06e7\u06e7\u06d7\u06e7\u06d9\u06e6\u06e0\u06e6\u06d8\u06d8\u06ec\u06eb\u06db\u06d8\u06d7\u06da\u06e7\u06dc\u06e2\u06dc\u06e6\u06dc\u06e2\u06e2\u06d9\u06d9\u06da\u06e5\u06d8\u06e7\u06e6\u06d8\u06d6\u06df\u06d7\u06ec\u06e7\u06e5\u06d8\u06ec\u06e2\u06e4"

    goto :goto_2

    :cond_0
    const-string v0, "\u06e5\u06e0\u06db\u06e5\u06dc\u06e4\u06d8\u06e7\u06e4\u06db\u06ec\u06eb\u06db\u06d6\u06e5\u06e5\u06e8\u06da\u06e0\u06e7\u06d8\u06d8\u06e6\u06e2\u06d7\u06dc\u06dc\u06d9\u06ec\u06e8\u06d7\u06d8\u06dc\u06d8\u06d8\u06e5\u06db\u06da\u06e2\u06df\u06dc\u06d8\u06eb\u06ec\u06db\u06e6\u06e4\u06db\u06e4\u06d6\u06dc\u06da\u06e2\u06e7\u06ec\u06e4\u06e7\u06e0\u06e4\u06da\u06da\u06e2\u06d7\u06e8\u06d8\u06db\u06e0\u06e0\u06db\u06ec\u06d6\u06d9\u06ec\u06e6\u06df"

    goto :goto_3

    :sswitch_a
    if-le v1, v7, :cond_0

    const-string v0, "\u06d8\u06d6\u06df\u06d7\u06d8\u06e4\u06e8\u06e7\u06d6\u06d8\u06e0\u06db\u06df\u06e7\u06d8\u06e5\u06e4\u06e5\u06e2\u06ec\u06e1\u06e7\u06d8\u06ec\u06e8\u06dc\u06d8\u06d7\u06d6\u06e8\u06eb\u06e8\u06eb\u06e8\u06dc\u06e1\u06d8\u06ec\u06d6\u06e5\u06d9\u06e5\u06d6\u06d8\u06ec\u06e4\u06eb\u06db\u06d9\u06e6\u06d8\u06dc\u06d7\u06db\u06d6\u06e2\u06e1\u06d8\u06ec\u06d6\u06e0\u06db\u06ec\u06df\u06da\u06d8\u06e5\u06d8\u06d9\u06e1\u06d9\u06df\u06d8\u06da\u06da\u06dc\u06dc\u06d8\u06dc\u06d7\u06e4\u06e2\u06e7\u06ec\u06e0\u06ec\u06e2\u06e7\u06e5\u06d6"

    goto :goto_3

    :sswitch_b
    const-string v0, "\u06e2\u06e2\u06d8\u06d8\u06d7\u06d9\u06e1\u06d8\u06e7\u06db\u06eb\u06e5\u06e7\u06d6\u06e1\u06e6\u06d8\u06e4\u06e8\u06db\u06d6\u06d7\u06eb\u06e1\u06dc\u06dc\u06dc\u06d6\u06e4\u06e1\u06db\u06d8\u06d8\u06d9\u06e6\u06db\u06ec\u06d8\u06d8\u06d8\u06d8\u06d9\u06d8\u06d8\u06da\u06e6\u06d6\u06d8\u06e4\u06e2\u06e1\u06d9\u06d9\u06e1\u06d8\u06ec\u06d9\u06db\u06e0"

    goto :goto_3

    :sswitch_c
    const-string v0, "\u06d9\u06e6\u06d8\u06df\u06e1\u06d6\u06e5\u06df\u06d8\u06d8\u06e4\u06dc\u06e5\u06d8\u06e7\u06ec\u06e1\u06d8\u06ec\u06e0\u06ec\u06d9\u06d8\u06e1\u06d8\u06dc\u06e7\u06e7\u06d7\u06d6\u06db\u06e0\u06e5\u06e0\u06e2\u06ec\u06e1\u06e5\u06e1\u06e8\u06e8\u06da\u06e5\u06ec\u06d8\u06eb\u06e6\u06d6"

    goto :goto_2

    :sswitch_d
    const-string v0, "\u06d7\u06e7\u06df\u06d6\u06d7\u06e4\u06d7\u06da\u06d6\u06d8\u06e4\u06e7\u06e1\u06d8\u06e7\u06e0\u06e5\u06d9\u06e1\u06e6\u06e5\u06e5\u06e6\u06d8\u06db\u06e1\u06ec\u06e2\u06eb\u06e4\u06e2\u06e4\u06e4\u06e2\u06e4\u06da\u06d6\u06df\u06e1\u06eb\u06e0\u06df\u06db\u06e7\u06e5\u06d8\u06e8\u06e7\u06e5\u06d8\u06e4\u06e1\u06e1\u06d8\u06df\u06df\u06da\u06d6\u06d7\u06e8\u06d8\u06e5\u06dc\u06d7\u06d8\u06db\u06e8\u06e0\u06e6\u06e4\u06e8\u06eb\u06e5\u06db\u06d6\u06e1\u06d6\u06dc\u06e0"

    goto :goto_1

    :sswitch_e
    const-string v0, "\u06e8\u06e7\u06eb\u06d6\u06e1\u06d8\u06d8\u06e1\u06d7\u06eb\u06e2\u06e8\u06e6\u06df\u06e2\u06e6\u06d7\u06d7\u06db\u06d7\u06d6\u06d8\u06d9\u06d7\u06d9\u06e1\u06e1\u06d8\u06d8\u06e8\u06df\u06d6\u06d8\u06d7\u06e2\u06e1\u06d7\u06d6\u06e6\u06e4\u06e8\u06e5\u06e0\u06e8\u06e7\u06e2\u06e0\u06db\u06d8\u06e2\u06d9\u06ec\u06e6\u06e7\u06d8\u06e0\u06e4\u06d8\u06e1\u06e4\u06e1\u06e4\u06da\u06d8\u06d8\u06e6\u06e5\u06e6\u06d6\u06d9\u06e2\u06dc\u06df\u06d8\u06d8\u06df\u06d9\u06dc\u06e8\u06e1\u06ec\u06e4\u06e6\u06da\u06e0\u06e5\u06e5"

    goto :goto_1

    :sswitch_f
    const-string v0, "\u06e4\u06e6\u06e8\u06dc\u06d6\u06e7\u06d9\u06df\u06e0\u06e8\u06d8\u06df\u06df\u06d6\u06d6\u06d8\u06e8\u06df\u06d7\u06db\u06e8\u06df\u06d6\u06df\u06e2\u06d8\u06d7\u06db\u06df\u06e4\u06e5\u06d9\u06d7\u06e4\u06e7\u06dc\u06e7\u06e4\u06df\u06e5\u06d8\u06dc\u06d9\u06e7\u06d6\u06ec\u06d6\u06e8\u06e0\u06d7\u06e0\u06eb\u06d9\u06d6\u06e2\u06e6\u06da\u06e8\u06db\u06e4\u06ec\u06d9\u06e0\u06e6\u06ec\u06d7\u06ec\u06e6\u06d8\u06e8\u06d6\u06d8\u06e5\u06d9\u06dc\u06d8"

    goto :goto_0

    :sswitch_10
    iput v2, p0, Lcom/skyhand/redbookhelper/MainActivity;->ۥ۟ۢ:I

    const-string v0, "\u06e5\u06e8\u06df\u06d6\u06e1\u06e6\u06d7\u06e4\u06d8\u06d8\u06e0\u06d9\u06d7\u06dc\u06eb\u06e1\u06d8\u06d7\u06e1\u06d8\u06d7\u06d9\u06e6\u06d8\u06e0\u06e6\u06e5\u06d8\u06e5\u06dc\u06e1\u06d8\u06eb\u06e6\u06e1\u06ec\u06dc\u06da\u06df\u06d7\u06d7\u06d6\u06eb\u06e1\u06d6\u06d7\u06e4\u06e4\u06d7\u06d7\u06e5\u06ec\u06e5\u06e8\u06d7\u06da\u06e4\u06e8\u06eb\u06e6\u06da\u06e8\u06e4\u06d9\u06e2\u06dc"

    goto :goto_0

    :sswitch_11
    sget v0, L۟/o;->ۥ:I

    const-string v0, "\u06e1\u06da\u06e5\u06db\u06e7\u06d8\u06d8\u06e6\u06dc\u06d6\u06e7\u06eb\u06e5\u06d7\u06e1\u06e5\u06e1\u06e6\u06dc\u06d8\u06e4\u06eb\u06e8\u06d8\u06da\u06e5\u06d8\u06e8\u06ec\u06dc\u06d8\u06d6\u06e0\u06e1\u06d8\u06d9\u06e5\u06eb\u06df\u06e4\u06e8\u06d6\u06db\u06e6\u06e1\u06e6\u06e4\u06e4\u06da\u06e6\u06e1\u06e4\u06e4\u06d6\u06d8\u06e8\u06dc\u06e2\u06d6"

    goto :goto_0

    :sswitch_12
    const/16 v0, 0x36

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    new-array v3, v8, [B

    fill-array-data v3, :array_1

    invoke-static {v0, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    new-array v3, v7, [B

    fill-array-data v3, :array_2

    new-array v4, v8, [B

    fill-array-data v4, :array_3

    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, L۟/o;->ۥ۠۟(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, L۟/o;->ۥ۠۠(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-interface {p1, v0}, L۟/g3;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "\u06dc\u06df\u06d6\u06e8\u06d8\u06e8\u06ec\u06e4\u06d9\u06e4\u06e8\u06e5\u06da\u06eb\u06df\u06ec\u06ec\u06ec\u06da\u06d6\u06e6\u06d8\u06d6\u06e8\u06e6\u06db\u06ec\u06e8\u06e0\u06e4\u06d9\u06e4\u06d7\u06e5\u06d9\u06e2\u06e2\u06eb\u06e8\u06e0\u06e1\u06e6\u06e0\u06d7\u06d6\u06d8"

    goto/16 :goto_0

    :sswitch_13
    add-int/lit8 v0, v1, 0x1

    iput v0, p0, Lcom/skyhand/redbookhelper/MainActivity;->ۥ۟ۢ:I

    const-string v0, "\u06da\u06e7\u06e8\u06d8\u06e8\u06e4\u06e6\u06d9\u06ec\u06e0\u06d6\u06db\u06d8\u06e6\u06ec\u06e1\u06d8\u06da\u06e6\u06ec\u06e2\u06e1\u06d9\u06e0\u06e1\u06dc\u06d9\u06e5\u06ec\u06e0\u06e1\u06e1\u06d8\u06d8\u06d8\u06e8\u06d8\u06e5\u06d9\u06e2\u06eb\u06df\u06e5\u06d9\u06eb\u06e8\u06e1\u06db\u06d8\u06ec\u06e8\u06e1\u06d8\u06e0\u06da\u06e8\u06e2\u06d8"

    goto/16 :goto_0

    :sswitch_14
    sget-object v0, L۟/q;->ۥ۟:L۟/kb;

    const-string v0, "\u06db\u06e6\u06ec\u06d6\u06e5\u06d8\u06d8\u06e6\u06d9\u06db\u06df\u06e7\u06d6\u06d8\u06e4\u06e4\u06db\u06e1\u06e1\u06e7\u06d8\u06e6\u06da\u06e8\u06e4\u06db\u06ec\u06e2\u06dc\u06e2\u06e6\u06d8\u06e5\u06dc\u06dc\u06e8\u06dc\u06d9\u06e7\u06e1\u06e7\u06db\u06d8\u06d9\u06eb\u06e6\u06e5\u06df\u06d7\u06ec\u06d8\u06dc\u06d9\u06da\u06e7\u06e1\u06d8"

    goto/16 :goto_0

    :sswitch_15
    invoke-static {}, L۟/q$c;->ۥ۟۟()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v3, L۟/ib;

    const/4 v4, 0x1

    invoke-direct {v3, p1, p0, v4}, L۟/ib;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string v0, "\u06d9\u06e4\u06d9\u06d7\u06e0\u06d7\u06e7\u06e1\u06d8\u06e2\u06df\u06d9\u06db\u06d8\u06eb\u06e1\u06d8\u06da\u06ec\u06e4\u06d6\u06e7\u06d8\u06d8\u06ec\u06e2\u06e4\u06da\u06dc\u06da\u06e0\u06e5\u06d8\u06e4\u06e7\u06ec\u06d6\u06e7\u06e5\u06e5\u06e0\u06e5\u06db\u06d8\u06e5\u06d7\u06d8\u06e5\u06da\u06dc\u06e8\u06d8\u06df\u06e2\u06d8\u06d8\u06dc\u06e5\u06e7\u06d8\u06d7\u06d7\u06da\u06eb\u06da\u06dc\u06d8\u06e5\u06e5\u06e2\u06d6\u06e2\u06e1\u06d8\u06eb\u06ec\u06e6\u06d7\u06ec\u06eb\u06d8\u06ec\u06eb\u06e5\u06e0\u06e6\u06d8"

    goto/16 :goto_0

    :sswitch_16
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79d62df2 -> :sswitch_16
        -0x75f55785 -> :sswitch_11
        -0x5f200748 -> :sswitch_14
        -0x41e30fbf -> :sswitch_16
        -0x391e84e3 -> :sswitch_0
        -0x1f4273a1 -> :sswitch_1
        -0x6f1870 -> :sswitch_3
        0x31306d61 -> :sswitch_10
        0x5f2f98a6 -> :sswitch_12
        0x675039e6 -> :sswitch_15
        0x681dbd50 -> :sswitch_13
        0x6c90412b -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x4e9f5ef1 -> :sswitch_e
        -0x1217024c -> :sswitch_4
        -0xa598bab -> :sswitch_f
        0x7e0180d8 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        -0x72630c8a -> :sswitch_5
        -0x1137ee7 -> :sswitch_d
        0x1a3cbe19 -> :sswitch_7
        0x2afc89e0 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        -0x991136f -> :sswitch_9
        -0x462d62d -> :sswitch_8
        0x2e4be640 -> :sswitch_a
        0x3d4cf101 -> :sswitch_b
    .end sparse-switch

    :array_0
    .array-data 1
        -0x65t
        0x7at
        0x24t
        -0x58t
        0x38t
        0x31t
        -0x66t
        0x74t
        0x11t
        -0x5ct
        0x32t
        0x2at
        -0x6ct
        0x7dt
        0x1bt
        -0x55t
        0x2bt
        0xbt
        -0x6at
        0x50t
        0x22t
        -0x5bt
        0x3t
        0x2t
        -0x64t
        0x48t
        0x1ft
        -0x5bt
        0x18t
        0x10t
        -0x6ct
        0x55t
        0x3dt
        -0x5bt
        0x19t
        0x3t
        -0x6at
        0x71t
        0x12t
        -0x5bt
        0x19t
        0x1ft
        -0x6ct
        0x49t
        0x2t
        -0x56t
        0xct
        0x3bt
        -0x6bt
        0x69t
        0x10t
        -0x5ct
        0x2et
        0x37t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x73t
        -0xct
        -0x6dt
        0x4dt
        -0x49t
        -0x59t
    .end array-data

    nop

    :array_2
    .array-data 1
        0x7at
        0x11t
        0x11t
    .end array-data

    :array_3
    .array-data 1
        0x8t
        0x74t
        0x75t
        0x78t
        -0x4ft
        -0x39t
    .end array-data
.end method
