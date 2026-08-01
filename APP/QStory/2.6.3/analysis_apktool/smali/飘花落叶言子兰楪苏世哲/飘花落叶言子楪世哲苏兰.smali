.class public L飘花落叶言子兰楪苏世哲/飘花落叶言子楪世哲苏兰;
.super Landroidx/lifecycle/飘花落叶言子苏哲世楪兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:L飘花落叶言子兰楪苏世哲/飘花落叶言子楪世苏兰哲;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子苏世兰楪哲;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言子兰楪苏世哲/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言子兰楪苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言子兰楪苏世哲/飘花落叶言子楪世苏兰哲;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/飘花落叶言子苏哲世楪兰;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/collection/飘花落叶言子苏世兰楪哲;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Landroidx/collection/飘花落叶言子苏世兰楪哲;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, L飘花落叶言子兰楪苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子苏世兰楪哲;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲()V
    .locals 5

    .line 1
    iget-object p0, p0, L飘花落叶言子兰楪苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子苏世兰楪哲;

    .line 2
    .line 3
    iget v0, p0, Landroidx/collection/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪哲兰苏世:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-gtz v0, :cond_1

    .line 7
    .line 8
    iget-object v2, p0, Landroidx/collection/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪哲兰世苏:[Ljava/lang/Object;

    .line 9
    .line 10
    move v3, v1

    .line 11
    :goto_0
    if-ge v3, v0, :cond_0

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    aput-object v4, v2, v3

    .line 15
    .line 16
    add-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iput v1, p0, Landroidx/collection/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪哲兰苏世:I

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    invoke-virtual {p0, v1}, Landroidx/collection/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪世兰苏哲(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 30
    .line 31
    .line 32
    return-void
.end method
