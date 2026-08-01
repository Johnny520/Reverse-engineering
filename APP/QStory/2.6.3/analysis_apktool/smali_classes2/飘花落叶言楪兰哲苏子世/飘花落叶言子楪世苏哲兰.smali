.class public final L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世苏哲兰;
.super Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;-><init>(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 7
    .line 8
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
    instance-of v1, p1, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世苏哲兰;

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
    check-cast p1, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    iget-object p0, p0, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 14
    .line 15
    iget-object p1, p1, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

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
    iget-object p0, p0, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "PluginName("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, L飘花落叶言楪兰哲苏子世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 9
    .line 10
    const/16 v1, 0x29

    .line 11
    .line 12
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
