.class public final L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世哲苏兰;
.super Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏世兰哲;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, v1}, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏世兰哲;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏世兰哲;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏世兰哲;

    .line 7
    .line 8
    invoke-direct {p0, v1}, Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;-><init>(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世哲苏兰;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世哲苏兰;

    .line 12
    .line 13
    iget-object p0, p0, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 14
    .line 15
    iget-object p1, p1, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {p0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "PluginsTrace("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v6, 0x0

    .line 9
    const/16 v7, 0x3f

    .line 10
    .line 11
    iget-object v2, p0, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Ljava/util/List;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-static/range {v2 .. v7}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲兰楪苏世(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/16 v1, 0x29

    .line 21
    .line 22
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
