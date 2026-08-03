.class public LYue/ۥ۟ۤ۠;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public ۥ:LYue/ۥ۟ۧ۟ۢ;

.field public ۥ۟:LYue/ۥ۟ۧ۟ۢ;

.field public ۥ۟۟:LYue/ۥ۟ۧ۟ۢ;

.field public ۥ۟۟۟:LYue/ۥ۟ۧ۟ۢ;

.field public ۥ۟۟۟۟:LYue/ۥ۟ۧ۟ۢ;

.field public ۥ۟۟۟۠:LYue/ۥ۟ۧ۟ۢ;

.field public ۥ۟۟۟ۡ:LYue/ۥ۟ۧ۟ۢ;

.field public ۥ۟۟۟ۢ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "LYue/\u06e5\u06df\u06e7\u06df\u06e2;",
            ">;"
        }
    .end annotation
.end field

.field public ۥۣ۟۟۟:I

.field public ۥ۟۟۟ۤ:I

.field public ۥ۟۟۟ۥ:F

.field public ۥ۟۟۟ۦ:I

.field public ۥ۟۟۟ۧ:I

.field public ۥ۟۟۟ۨ:I

.field public ۥ۟۟۠:Z

.field public ۥ۟۟۠۟:I

.field public ۥ۟۟۠۠:Z

.field public ۥ۟۟۠ۡ:Z

.field public ۥ۟۟۠ۢ:Z

.field public ۥۣ۟۟۠:Z

.field public ۥ۟۟۠ۤ:Z

.field public ۥ۟۟۠ۥ:Z


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧ۟ۢ;IZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۥ:F

    iput-object p1, p0, LYue/ۥ۟ۤ۠;->ۥ:LYue/ۥ۟ۧ۟ۢ;

    iput p2, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠۟:I

    iput-boolean p3, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠۠:Z

    return-void
.end method

.method public static ۥ۟۟۟ۥ(LYue/ۥ۟ۧ۟ۢ;I)Z
    .locals 2

    invoke-virtual {p0}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۤ۠()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_1

    iget-object v0, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۨ:[LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    aget-object v0, v0, p1

    sget-object v1, LYue/ۥ۟ۧ۟ۢ$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    if-ne v0, v1, :cond_1

    iget-object p0, p0, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۡ:[I

    aget p0, p0, p1

    if-eqz p0, :cond_0

    const/4 p1, 0x3

    if-ne p0, p1, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public ۥ()V
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠ۥ:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥ۟ۤ۠;->ۥ۟()V

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠ۥ:Z

    return-void
.end method

.method public final ۥ۟()V
    .locals 12

    iget v0, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠۟:I

    const/4 v1, 0x2

    mul-int/2addr v0, v1

    iget-object v2, p0, LYue/ۥ۟ۤ۠;->ۥ:LYue/ۥ۟ۧ۟ۢ;

    const/4 v3, 0x1

    iput-boolean v3, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠:Z

    const/4 v4, 0x0

    move-object v5, v2

    move v6, v4

    :goto_0
    if-nez v6, :cond_15

    iget v7, p0, LYue/ۥ۟ۤ۠;->ۥۣ۟۟۟:I

    add-int/2addr v7, v3

    iput v7, p0, LYue/ۥ۟ۤ۠;->ۥۣ۟۟۟:I

    iget-object v7, v2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۦۣ:[LYue/ۥ۟ۧ۟ۢ;

    iget v8, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠۟:I

    const/4 v9, 0x0

    aput-object v9, v7, v8

    iget-object v7, v2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۦۢ:[LYue/ۥ۟ۧ۟ۢ;

    aput-object v9, v7, v8

    invoke-virtual {v2}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۤ۠()I

    move-result v7

    const/16 v8, 0x8

    if-eq v7, v8, :cond_10

    iget v7, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۦ:I

    add-int/2addr v7, v3

    iput v7, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۦ:I

    iget v7, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠۟:I

    invoke-virtual {v2, v7}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۡ(I)LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    move-result-object v7

    sget-object v8, LYue/ۥ۟ۧ۟ۢ$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    if-eq v7, v8, :cond_0

    iget v7, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۧ:I

    iget v10, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠۟:I

    invoke-virtual {v2, v10}, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢ۠(I)I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۧ:I

    :cond_0
    iget v7, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۧ:I

    iget-object v10, v2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۥ:[LYue/ۥ۟ۧ۟۠;

    aget-object v10, v10, v0

    invoke-virtual {v10}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟ۡ()I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۧ:I

    iget-object v10, v2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۥ:[LYue/ۥ۟ۧ۟۠;

    add-int/lit8 v11, v0, 0x1

    aget-object v10, v10, v11

    invoke-virtual {v10}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟ۡ()I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۧ:I

    iget v7, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۨ:I

    iget-object v10, v2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۥ:[LYue/ۥ۟ۧ۟۠;

    aget-object v10, v10, v0

    invoke-virtual {v10}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟ۡ()I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۨ:I

    iget-object v10, v2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۥ:[LYue/ۥ۟ۧ۟۠;

    aget-object v10, v10, v11

    invoke-virtual {v10}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟ۡ()I

    move-result v10

    add-int/2addr v7, v10

    iput v7, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۨ:I

    iget-object v7, p0, LYue/ۥ۟ۤ۠;->ۥ۟:LYue/ۥ۟ۧ۟ۢ;

    if-nez v7, :cond_1

    iput-object v2, p0, LYue/ۥ۟ۤ۠;->ۥ۟:LYue/ۥ۟ۧ۟ۢ;

    :cond_1
    iput-object v2, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟:LYue/ۥ۟ۧ۟ۢ;

    iget-object v7, v2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۨ:[LYue/ۥ۟ۧ۟ۢ$ۥ۟;

    iget v10, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠۟:I

    aget-object v7, v7, v10

    if-ne v7, v8, :cond_10

    iget-object v7, v2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۡ:[I

    aget v7, v7, v10

    const/4 v8, 0x0

    if-eqz v7, :cond_2

    const/4 v11, 0x3

    if-eq v7, v11, :cond_2

    if-ne v7, v1, :cond_9

    :cond_2
    iget v7, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۤ:I

    add-int/2addr v7, v3

    iput v7, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۤ:I

    iget-object v7, v2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۦۡ:[F

    aget v7, v7, v10

    cmpl-float v11, v7, v8

    if-lez v11, :cond_3

    iget v11, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۥ:F

    add-float/2addr v11, v7

    iput v11, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۥ:F

    :cond_3
    invoke-static {v2, v10}, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۥ(LYue/ۥ۟ۧ۟ۢ;I)Z

    move-result v10

    if-eqz v10, :cond_6

    cmpg-float v7, v7, v8

    if-gez v7, :cond_4

    iput-boolean v3, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠ۡ:Z

    goto :goto_1

    :cond_4
    iput-boolean v3, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠ۢ:Z

    :goto_1
    iget-object v7, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۢ:Ljava/util/ArrayList;

    if-nez v7, :cond_5

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۢ:Ljava/util/ArrayList;

    :cond_5
    iget-object v7, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۢ:Ljava/util/ArrayList;

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    iget-object v7, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟۠:LYue/ۥ۟ۧ۟ۢ;

    if-nez v7, :cond_7

    iput-object v2, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟۠:LYue/ۥ۟ۧ۟ۢ;

    :cond_7
    iget-object v7, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۡ:LYue/ۥ۟ۧ۟ۢ;

    if-eqz v7, :cond_8

    iget-object v7, v7, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۦۢ:[LYue/ۥ۟ۧ۟ۢ;

    iget v10, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠۟:I

    aput-object v2, v7, v10

    :cond_8
    iput-object v2, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۡ:LYue/ۥ۟ۧ۟ۢ;

    :cond_9
    iget v7, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠۟:I

    if-nez v7, :cond_c

    iget v7, v2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠۟:I

    if-eqz v7, :cond_a

    iput-boolean v4, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠:Z

    goto :goto_2

    :cond_a
    iget v7, v2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۢ:I

    if-nez v7, :cond_b

    iget v7, v2, LYue/ۥ۟ۧ۟ۢ;->ۥۣ۟۟۠:I

    if-eqz v7, :cond_f

    :cond_b
    iput-boolean v4, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠:Z

    goto :goto_2

    :cond_c
    iget v7, v2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠۠:I

    if-eqz v7, :cond_d

    iput-boolean v4, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠:Z

    goto :goto_2

    :cond_d
    iget v7, v2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۥ:I

    if-nez v7, :cond_e

    iget v7, v2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟۠ۦ:I

    if-eqz v7, :cond_f

    :cond_e
    iput-boolean v4, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠:Z

    :cond_f
    :goto_2
    iget v7, v2, LYue/ۥ۟ۧ۟ۢ;->ۥۣ۟۟ۡ:F

    cmpl-float v7, v7, v8

    if-eqz v7, :cond_10

    iput-boolean v4, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠:Z

    iput-boolean v3, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠ۤ:Z

    :cond_10
    if-eq v5, v2, :cond_11

    iget-object v5, v5, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۦۣ:[LYue/ۥ۟ۧ۟ۢ;

    iget v7, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠۟:I

    aput-object v2, v5, v7

    :cond_11
    iget-object v5, v2, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۥ:[LYue/ۥ۟ۧ۟۠;

    add-int/lit8 v7, v0, 0x1

    aget-object v5, v5, v7

    iget-object v5, v5, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۠:LYue/ۥ۟ۧ۟۠;

    if-eqz v5, :cond_13

    iget-object v5, v5, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟:LYue/ۥ۟ۧ۟ۢ;

    iget-object v7, v5, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۥ:[LYue/ۥ۟ۧ۟۠;

    aget-object v7, v7, v0

    iget-object v7, v7, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟۠:LYue/ۥ۟ۧ۟۠;

    if-eqz v7, :cond_13

    iget-object v7, v7, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟:LYue/ۥ۟ۧ۟ۢ;

    if-eq v7, v2, :cond_12

    goto :goto_3

    :cond_12
    move-object v9, v5

    :cond_13
    :goto_3
    if-eqz v9, :cond_14

    goto :goto_4

    :cond_14
    move-object v9, v2

    move v6, v3

    :goto_4
    move-object v5, v2

    move-object v2, v9

    goto/16 :goto_0

    :cond_15
    iget-object v1, p0, LYue/ۥ۟ۤ۠;->ۥ۟:LYue/ۥ۟ۧ۟ۢ;

    if-eqz v1, :cond_16

    iget v5, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۧ:I

    iget-object v1, v1, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۥ:[LYue/ۥ۟ۧ۟۠;

    aget-object v1, v1, v0

    invoke-virtual {v1}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟ۡ()I

    move-result v1

    sub-int/2addr v5, v1

    iput v5, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۧ:I

    :cond_16
    iget-object v1, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟:LYue/ۥ۟ۧ۟ۢ;

    if-eqz v1, :cond_17

    iget v5, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۧ:I

    iget-object v1, v1, LYue/ۥ۟ۧ۟ۢ;->ۥ۟۟ۢۥ:[LYue/ۥ۟ۧ۟۠;

    add-int/2addr v0, v3

    aget-object v0, v1, v0

    invoke-virtual {v0}, LYue/ۥ۟ۧ۟۠;->ۥ۟۟۟ۡ()I

    move-result v0

    sub-int/2addr v5, v0

    iput v5, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۧ:I

    :cond_17
    iput-object v2, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟:LYue/ۥ۟ۧ۟ۢ;

    iget v0, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠۟:I

    if-nez v0, :cond_18

    iget-boolean v0, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠۠:Z

    if-eqz v0, :cond_18

    iput-object v2, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟۟:LYue/ۥ۟ۧ۟ۢ;

    goto :goto_5

    :cond_18
    iget-object v0, p0, LYue/ۥ۟ۤ۠;->ۥ:LYue/ۥ۟ۧ۟ۢ;

    iput-object v0, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟۟:LYue/ۥ۟ۧ۟ۢ;

    :goto_5
    iget-boolean v0, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠ۢ:Z

    if-eqz v0, :cond_19

    iget-boolean v0, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۠ۡ:Z

    if-eqz v0, :cond_19

    goto :goto_6

    :cond_19
    move v3, v4

    :goto_6
    iput-boolean v3, p0, LYue/ۥ۟ۤ۠;->ۥۣ۟۟۠:Z

    return-void
.end method

.method public ۥ۟۟()LYue/ۥ۟ۧ۟ۢ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۤ۠;->ۥ:LYue/ۥ۟ۧ۟ۢ;

    return-object v0
.end method

.method public ۥ۟۟۟()LYue/ۥ۟ۧ۟ۢ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟۠:LYue/ۥ۟ۧ۟ۢ;

    return-object v0
.end method

.method public ۥ۟۟۟۟()LYue/ۥ۟ۧ۟ۢ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۤ۠;->ۥ۟:LYue/ۥ۟ۧ۟ۢ;

    return-object v0
.end method

.method public ۥ۟۟۟۠()LYue/ۥ۟ۧ۟ۢ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟۟:LYue/ۥ۟ۧ۟ۢ;

    return-object v0
.end method

.method public ۥ۟۟۟ۡ()LYue/ۥ۟ۧ۟ۢ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟:LYue/ۥ۟ۧ۟ۢ;

    return-object v0
.end method

.method public ۥ۟۟۟ۢ()LYue/ۥ۟ۧ۟ۢ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۡ:LYue/ۥ۟ۧ۟ۢ;

    return-object v0
.end method

.method public ۥۣ۟۟۟()LYue/ۥ۟ۧ۟ۢ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟:LYue/ۥ۟ۧ۟ۢ;

    return-object v0
.end method

.method public ۥ۟۟۟ۤ()F
    .locals 1

    iget v0, p0, LYue/ۥ۟ۤ۠;->ۥ۟۟۟ۥ:F

    return v0
.end method
