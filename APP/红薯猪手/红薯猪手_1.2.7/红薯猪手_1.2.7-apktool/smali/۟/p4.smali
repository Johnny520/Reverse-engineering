.class public abstract L۟/p4;
.super L۟/ya;
.source "SourceFile"


# instance fields
.field public ۥ۠ۤ:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 2

    const/4 v0, 0x3

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2}, L۟/ya;-><init>(Landroid/content/Context;I)V

    return-void

    nop

    :array_0
    .array-data 1
        0x9t
        0x1at
        -0x20t
    .end array-data

    :array_1
    .array-data 1
        0x6at
        0x62t
        -0x6ct
        -0x5bt
        -0x60t
        0x76t
    .end array-data
.end method


# virtual methods
.method public final ۥۣ۟()Landroid/view/View;
    .locals 12

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, L۟/ya;->ۥ۟۟()Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {p0}, L۟/p4;->ۥ۟ۨ()Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-virtual {p0}, L۟/p4;->ۥ۟ۦ()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    new-instance v2, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, L۟/ya;->ۥ۟ۢ()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, L۟/ya;->ۥ۟ۢ()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance v3, L۟/j8;

    invoke-direct {v3}, L۟/j8;-><init>()V

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x1

    invoke-direct {v3, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v4, 0x3f800000    # 1.0f

    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iput-object v2, p0, L۟/p4;->ۥ۠ۤ:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v3, L۟/r1;

    invoke-virtual {p0}, L۟/p4;->ۥ۟ۧ()Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v4}, L۟/r1;-><init>(Ljava/util/List;)V

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iget-object v2, p0, L۟/p4;->ۥ۠ۤ:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v2, :cond_3

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, L۟/p4;->ۥ۟ۥ()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_1

    :cond_2
    return-object v1

    :cond_3
    const/16 v1, 0xd

    new-array v1, v1, [B

    const/16 v2, 0x55

    const/4 v3, 0x0

    aput-byte v2, v1, v3

    const/16 v2, -0x7b

    const/4 v4, 0x1

    aput-byte v2, v1, v4

    const/16 v2, -0x65

    const/4 v5, 0x2

    aput-byte v2, v1, v5

    const/16 v2, -0x56

    const/4 v6, 0x3

    aput-byte v2, v1, v6

    const/16 v2, -0x55

    const/4 v7, 0x4

    aput-byte v2, v1, v7

    const/16 v2, 0x3e

    const/4 v8, 0x5

    aput-byte v2, v1, v8

    const/16 v2, 0x54

    const/4 v9, 0x6

    aput-byte v2, v1, v9

    const/4 v2, 0x7

    const/16 v10, -0x4e

    aput-byte v10, v1, v2

    const/16 v2, 0x8

    const/16 v10, -0x74

    aput-byte v10, v1, v2

    const/16 v2, 0x9

    const/16 v10, -0x61

    aput-byte v10, v1, v2

    const/16 v2, 0xa

    const/16 v10, -0x45

    aput-byte v10, v1, v2

    const/16 v2, 0xb

    const/16 v10, 0x38

    aput-byte v10, v1, v2

    const/16 v2, 0xc

    const/16 v11, 0x4f

    aput-byte v11, v1, v2

    new-array v2, v9, [B

    aput-byte v10, v2, v3

    const/16 v3, -0x29

    aput-byte v3, v2, v4

    const/4 v3, -0x2

    aput-byte v3, v2, v5

    const/16 v3, -0x37

    aput-byte v3, v2, v6

    const/16 v3, -0x2e

    aput-byte v3, v2, v7

    const/16 v3, 0x5d

    aput-byte v3, v2, v8

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public abstract ۥ۟ۥ()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end method

.method public ۥ۟ۦ()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract ۥ۟ۧ()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "L\u06df/p0;",
            ">;"
        }
    .end annotation
.end method

.method public abstract ۥ۟ۨ()Landroid/view/View;
.end method
