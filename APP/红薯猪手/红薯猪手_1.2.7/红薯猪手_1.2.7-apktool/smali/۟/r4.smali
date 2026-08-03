.class public final L۟/r4;
.super L۟/gb;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/r4$a;,
        L۟/r4$b;
    }
.end annotation


# static fields
.field public static final ۥۣۡ:I


# instance fields
.field public final ۥۡ۠:I

.field public final ۥۡۡ:I

.field public final ۥۡۢ:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;Ljava/util/List;)V
    .locals 4

    const/4 v2, 0x6

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    new-array v1, v2, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x5

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    new-array v1, v2, [B

    fill-array-data v1, :array_3

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const/16 v0, 0x8

    new-array v0, v0, [B

    fill-array-data v0, :array_4

    new-array v1, v2, [B

    fill-array-data v1, :array_5

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    invoke-direct {p0, p1, p2}, L۟/gb;-><init>(Landroid/content/Context;Ljava/lang/CharSequence;)V

    iput v2, p0, L۟/r4;->ۥۡ۠:I

    const/16 v0, 0x66

    iput v0, p0, L۟/r4;->ۥۡۡ:I

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, L۟/j8;

    invoke-direct {v1}, L۟/j8;-><init>()V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    new-instance v1, L۟/r4$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p3, v2}, L۟/r4$a;-><init>(L۟/r4;Ljava/util/List;L۟/g3;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iput-object v0, p0, L۟/r4;->ۥۡۢ:Landroidx/recyclerview/widget/RecyclerView;

    return-void

    :array_0
    .array-data 1
        -0x2et
        0x2ft
        -0x2ft
    .end array-data

    :array_1
    .array-data 1
        -0x4ft
        0x57t
        -0x5bt
        0x75t
        0x1at
        0x2bt
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x49t
        -0x46t
        -0x48t
        -0x56t
        0x16t
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x3dt
        -0x2dt
        -0x34t
        -0x3at
        0x73t
        -0x62t
    .end array-data

    nop

    :array_4
    .array-data 1
        -0x36t
        -0x58t
        -0x7ft
        -0x12t
        -0x14t
        -0x80t
        -0x2et
        -0x60t
    .end array-data

    :array_5
    .array-data 1
        -0x5at
        -0x3ft
        -0xet
        -0x66t
        -0x58t
        -0x1ft
    .end array-data
.end method


# virtual methods
.method public final ۥ۟ۥ()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    const-string v0, "\u06dc\u06d8\u06d7\u06da\u06e2\u06e4\u06e5\u06e1\u06d8\u06e4\u06d8\u06d8\u06da\u06d7\u06e4\u06e5\u06df\u06d9\u06df\u06e2\u06d6\u06d8\u06e7\u06d7\u06e7\u06eb\u06e0\u06df\u06e5\u06e4\u06eb\u06d7\u06e6\u06d7\u06e4\u06d7\u06dc\u06d8\u06e0\u06e4\u06e0\u06d8\u06df\u06eb\u06dc\u06d8"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x297

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x14d

    const/16 v2, 0x3a6

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xaf

    const/16 v2, 0x392

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x19d

    const/16 v2, 0x35d

    const v3, 0x6bfe4000

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06da\u06df\u06df\u06eb\u06dc\u06ec\u06e5\u06e1\u06e1\u06e1\u06e8\u06e4\u06e7\u06ec\u06df\u06e2\u06d6\u06d6\u06db\u06e2\u06e1\u06d8\u06e5\u06df\u06d8\u06d6\u06dc\u06e1\u06d8\u06db\u06e2\u06e2\u06e5\u06e2\u06e8\u06e4\u06df\u06db\u06d8\u06e6\u06dc\u06e5\u06e1\u06d7\u06e5\u06d9\u06e8\u06d8\u06e7\u06ec\u06dc\u06d8\u06db\u06d7\u06e6\u06e6\u06db\u06e8\u06e8\u06d7\u06d7\u06ec\u06e2\u06d9\u06d8\u06eb\u06e7\u06da\u06d8\u06d8\u06d9\u06d7\u06e2\u06e4\u06e4\u06d7\u06eb\u06e8\u06df\u06e7\u06e8\u06e5\u06d8\u06d9\u06e7\u06e7"

    goto :goto_0

    :sswitch_1
    invoke-virtual {p0}, L۟/ya;->ۥ۟()Landroid/widget/TextView;

    move-result-object v0

    invoke-static {v0}, L۟/jb;->ۥ۟ۦ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x811e467 -> :sswitch_1
        0x4edafe69 -> :sswitch_0
    .end sparse-switch
.end method

.method public final ۥ۟ۦ()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    const-string v0, "\u06db\u06d7\u06e1\u06dc\u06e8\u06e7\u06d8\u06da\u06e1\u06d6\u06d8\u06e6\u06d8\u06e8\u06e2\u06e7\u06ec\u06eb\u06da\u06eb\u06e0\u06d6\u06d6\u06eb\u06db\u06e8\u06d8\u06e6\u06dc\u06d7\u06e2\u06e1\u06e6\u06d8\u06df\u06e5\u06da\u06d6\u06eb\u06d7\u06e4\u06d6\u06e5\u06ec\u06d7\u06db\u06e7\u06e6\u06d8"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x21f

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x83

    const/16 v2, 0x123

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x6e

    const/16 v2, 0x124

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x297

    const/16 v2, 0x37c

    const v3, 0x50eacce7

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e7\u06df\u06e2\u06da\u06d6\u06d8\u06d8\u06eb\u06e0\u06d9\u06db\u06e4\u06d8\u06da\u06e1\u06e7\u06e6\u06ec\u06db\u06e5\u06e4\u06da\u06e8\u06d6\u06d6\u06e2\u06e5\u06e2\u06da\u06e7\u06e7\u06df\u06ec\u06ec\u06e0\u06e4\u06ec\u06e8\u06ec\u06d9\u06eb\u06df\u06d7\u06e8\u06e8\u06e6\u06d9\u06e4\u06eb\u06e4\u06eb\u06dc\u06d7\u06e8\u06d8"

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, L۟/r4;->ۥۡۢ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0}, L۟/jb;->ۥ۟ۦ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x496eca78 -> :sswitch_1
        0x2576b525 -> :sswitch_0
    .end sparse-switch
.end method

.method public final ۥۣ۠()I
    .locals 4

    const-string v0, "\u06da\u06e5\u06e6\u06d8\u06df\u06df\u06d8\u06d7\u06e6\u06e5\u06e1\u06e1\u06d8\u06e8\u06e6\u06dc\u06e5\u06d9\u06e1\u06d8\u06ec\u06e6\u06e7\u06e6\u06e8\u06e4\u06e8\u06e1\u06da\u06d9\u06e7\u06dc\u06dc\u06e2\u06e1\u06e1\u06da\u06dc\u06e0\u06da\u06e1\u06d8\u06da\u06dc\u06e7\u06d8\u06d8\u06da\u06da\u06e4\u06e6\u06d8\u06e5\u06e8\u06da\u06e2\u06eb\u06e7\u06e0\u06eb\u06e5\u06d8\u06df\u06da\u06e6\u06d8\u06dc\u06db\u06db\u06eb\u06d9\u06e8\u06d8\u06eb\u06e2\u06da\u06e5\u06d9\u06d8"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x377

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1a8

    const/16 v2, 0x3a8

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x363

    const/16 v2, 0x160

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x33a

    const/16 v2, 0xa4

    const v3, -0x72bd3257

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e6\u06e0\u06e1\u06d8\u06e2\u06e4\u06da\u06d7\u06e7\u06e1\u06e4\u06e2\u06e7\u06d9\u06e0\u06d9\u06e1\u06d9\u06e8\u06e2\u06e7\u06eb\u06e8\u06eb\u06d8\u06e6\u06e7\u06d6\u06e0\u06d6\u06d8\u06e4\u06e4\u06e6\u06db\u06d6\u06dc\u06d8\u06e6\u06d9\u06d9\u06eb\u06d6\u06e8\u06d7\u06dc\u06e7\u06da\u06e6\u06e7\u06d8\u06db\u06dc\u06e7\u06e8\u06df\u06eb\u06e5\u06e0\u06d7\u06da\u06e7\u06da\u06d7\u06e8\u06df\u06e1\u06e8\u06d6\u06d8\u06da\u06d6\u06d6\u06e6\u06e7\u06d8\u06d8"

    goto :goto_0

    :sswitch_1
    iget v0, p0, L۟/r4;->ۥۡۡ:I

    return v0

    :sswitch_data_0
    .sparse-switch
        -0x33164ffc -> :sswitch_1
        -0x1697464e -> :sswitch_0
    .end sparse-switch
.end method

.method public final ۥ۠ۤ()I
    .locals 4

    const-string v0, "\u06d9\u06e2\u06e4\u06e0\u06df\u06dc\u06d8\u06d7\u06df\u06e1\u06da\u06d9\u06dc\u06df\u06ec\u06d7\u06df\u06e6\u06e7\u06eb\u06d8\u06e6\u06d9\u06e5\u06e1\u06d8\u06e8\u06e5\u06e4\u06df\u06dc\u06d8\u06e4\u06d7\u06ec\u06e8\u06e7\u06df\u06e1\u06d8\u06df\u06e8\u06d8\u06e4\u06d6\u06e1\u06d8\u06e1\u06d7\u06da\u06e5\u06e7\u06e0\u06db\u06eb\u06db"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x362

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1eb

    const/16 v2, 0x202

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xf3

    const/16 v2, 0x1bc

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x1e8

    const/16 v2, 0x2b5

    const v3, 0x3b29b2e3

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06df\u06e7\u06ec\u06dc\u06d8\u06e5\u06e1\u06e1\u06d8\u06e0\u06eb\u06e2\u06eb\u06e0\u06d8\u06d8\u06dc\u06d9\u06da\u06e6\u06e0\u06dc\u06d8\u06d6\u06e6\u06e5\u06df\u06d9\u06d6\u06d8\u06e2\u06df\u06ec\u06df\u06d9\u06e6\u06d8\u06e0\u06eb\u06df\u06da\u06ec\u06e5\u06d8\u06d6\u06d8\u06e1\u06d8\u06d8\u06e8\u06df\u06d8\u06e4\u06dc\u06d8\u06e8\u06d9\u06d8\u06da\u06e7"

    goto :goto_0

    :sswitch_1
    iget v0, p0, L۟/r4;->ۥۡ۠:I

    return v0

    :sswitch_data_0
    .sparse-switch
        -0x5bb6aad3 -> :sswitch_0
        0x2a5b1bd1 -> :sswitch_1
    .end sparse-switch
.end method
