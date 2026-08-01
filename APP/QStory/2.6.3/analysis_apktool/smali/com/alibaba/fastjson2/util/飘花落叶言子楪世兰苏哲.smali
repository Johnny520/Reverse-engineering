.class public final synthetic Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;

.field public final synthetic 飘花落叶言子楪哲兰苏世:I

.field public final synthetic 飘花落叶言子楪哲苏兰世:Ljava/lang/annotation/Annotation;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/annotation/Annotation;L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/annotation/Annotation;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    iput p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/annotation/Annotation;

    .line 2
    .line 3
    check-cast p1, Ljava/lang/reflect/Method;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :try_start_0
    invoke-virtual {p1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    const v2, 0x337a8b

    .line 19
    .line 20
    .line 21
    iget-object v3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    iget p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:I

    .line 24
    .line 25
    if-eq v0, v2, :cond_1

    .line 26
    .line 27
    const v2, 0x6ac9171

    .line 28
    .line 29
    .line 30
    if-eq v0, v2, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    :try_start_1
    const-string v0, "value"

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    check-cast p1, Ljava/lang/Class;

    .line 42
    .line 43
    iget-object v0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:[Ljava/lang/Class;

    .line 44
    .line 45
    aput-object p1, v0, p0

    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    const-string v0, "name"

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    check-cast p1, Ljava/lang/String;

    .line 57
    .line 58
    iget-object v0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

    .line 59
    .line 60
    aput-object p1, v0, p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method
