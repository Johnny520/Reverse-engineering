.class public abstract Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;
.implements Lcom/typesafe/config/impl/飘花落叶言子楪哲苏世兰;


# instance fields
.field private final origin:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;


# direct methods
.method public constructor <init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 7
    .line 8
    return-void
.end method

.method public static hasDescendantInList(Ljava/util/List;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            ">;",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 17
    .line 18
    if-ne v1, p1, :cond_0

    .line 19
    .line 20
    return v2

    .line 21
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 36
    .line 37
    instance-of v1, v0, Lcom/typesafe/config/impl/飘花落叶言子楪苏兰世哲;

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    check-cast v0, Lcom/typesafe/config/impl/飘花落叶言子楪苏兰世哲;

    .line 42
    .line 43
    invoke-interface {v0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪苏兰世哲;->hasDescendant(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    return v2

    .line 50
    :cond_3
    const/4 p0, 0x0

    .line 51
    return p0
.end method

.method public static indent(Ljava/lang/StringBuilder;IL飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;)V
    .locals 0

    .line 1
    iget-boolean p2, p2, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Z

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    :goto_0
    if-lez p1, :cond_0

    .line 6
    .line 7
    const-string p2, "    "

    .line 8
    .line 9
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    add-int/lit8 p1, p1, -0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public static replaceChildInList(Ljava/util/List;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            ">;",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            ")",
            "Ljava/util/List<",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eq v1, p1, :cond_0

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    new-instance p1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 27
    .line 28
    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1, v0, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    return-object p1

    .line 46
    :cond_3
    const-string p2, "tried to replace "

    .line 47
    .line 48
    const-string v0, " which is not in "

    .line 49
    .line 50
    invoke-static {p2, p1, v0, p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-object v2
.end method


# virtual methods
.method public appendHiddenEnvVariableValue(Ljava/lang/StringBuilder;)V
    .locals 0

    .line 1
    const-string p0, "\"<env variable>\""

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public atKey(Ljava/lang/String;)Lcom/typesafe/config/impl/SimpleConfig;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "atKey("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, ")"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0, v0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->atKey(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)Lcom/typesafe/config/impl/SimpleConfig;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public atKey(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)Lcom/typesafe/config/impl/SimpleConfig;
    .locals 0

    .line 29
    invoke-static {p2, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    .line 30
    new-instance p2, Lcom/typesafe/config/impl/SimpleConfigObject;

    invoke-direct {p2, p1, p0}, Lcom/typesafe/config/impl/SimpleConfigObject;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/util/Map;)V

    invoke-virtual {p2}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->toConfig()Lcom/typesafe/config/impl/SimpleConfig;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic atKey(Ljava/lang/String;)L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 31
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->atKey(Ljava/lang/String;)Lcom/typesafe/config/impl/SimpleConfig;

    move-result-object p0

    return-object p0
.end method

.method public atPath(Ljava/lang/String;)Lcom/typesafe/config/impl/SimpleConfig;
    .locals 2

    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "atPath("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    move-result-object v0

    .line 40
    invoke-static {p1}, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->atPath(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/SimpleConfig;

    move-result-object p0

    return-object p0
.end method

.method public atPath(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/SimpleConfig;
    .locals 2

    .line 1
    invoke-virtual {p2}, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰()Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    iget-object v1, p2, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object p2, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p2, p2, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->atKey(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)Lcom/typesafe/config/impl/SimpleConfig;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_1
    if-eqz v0, :cond_2

    .line 18
    .line 19
    move-object p2, v0

    .line 20
    :goto_2
    iget-object v1, p2, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    move-object p2, v1

    .line 25
    goto :goto_2

    .line 26
    :cond_1
    iget-object p2, p2, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, Lcom/typesafe/config/impl/SimpleConfig;->atKey(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)Lcom/typesafe/config/impl/SimpleConfig;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {v0}, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰()Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    return-object p0
.end method

.method public bridge synthetic atPath(Ljava/lang/String;)L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 38
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->atPath(Ljava/lang/String;)Lcom/typesafe/config/impl/SimpleConfig;

    move-result-object p0

    return-object p0
.end method

.method public canEqual(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p0, p1, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    return p0
.end method

.method public constructDelayedMerge(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u5b50\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
            "Ljava/util/List<",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            ">;)",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;"
        }
    .end annotation

    .line 1
    new-instance p0, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/typesafe/config/impl/飘花落叶言子楪世兰哲苏;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->canEqual(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;->valueType()Lcom/typesafe/config/ConfigValueType;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast p1, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;

    .line 16
    .line 17
    invoke-interface {p1}, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;->valueType()Lcom/typesafe/config/ConfigValueType;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    invoke-interface {p0}, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;->unwrapped()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p1}, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;->unwrapped()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_0
    const/4 p0, 0x0

    .line 40
    return p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    invoke-interface {p0}, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;->unwrapped()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public hideEnvVariableValue(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return p0
.end method

.method public ignoresFallbacks()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->resolveStatus()Lcom/typesafe/config/impl/ResolveStatus;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lcom/typesafe/config/impl/ResolveStatus;->RESOLVED:Lcom/typesafe/config/impl/ResolveStatus;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public mergedWithNonObject(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 1

    .line 37
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->requireNotIgnoringFallbacks()V

    .line 38
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->mergedWithNonObject(Ljava/util/Collection;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    move-result-object p0

    return-object p0
.end method

.method public final mergedWithNonObject(Ljava/util/Collection;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            ">;",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            ")",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->requireNotIgnoringFallbacks()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->resolveStatus()Lcom/typesafe/config/impl/ResolveStatus;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Lcom/typesafe/config/impl/ResolveStatus;->RESOLVED:Lcom/typesafe/config/impl/ResolveStatus;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->withFallbacksIgnored()Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->mergeOrigins(Ljava/util/Collection;)L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0, p1, v0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->constructDelayedMerge(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public mergedWithObject(Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 1

    .line 20
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->requireNotIgnoringFallbacks()V

    .line 21
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->mergedWithObject(Ljava/util/Collection;Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    move-result-object p0

    return-object p0
.end method

.method public final mergedWithObject(Ljava/util/Collection;Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            ">;",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            ")",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->requireNotIgnoringFallbacks()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->mergedWithNonObject(Ljava/util/Collection;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    const-string p0, "Objects must reimplement mergedWithObject"

    .line 14
    .line 15
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public mergedWithTheUnmergeable(Lcom/typesafe/config/impl/飘花落叶言子世兰苏楪哲;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->requireNotIgnoringFallbacks()V

    .line 29
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->mergedWithTheUnmergeable(Ljava/util/Collection;Lcom/typesafe/config/impl/飘花落叶言子世兰苏楪哲;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    move-result-object p0

    return-object p0
.end method

.method public final mergedWithTheUnmergeable(Ljava/util/Collection;Lcom/typesafe/config/impl/飘花落叶言子世兰苏楪哲;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            ">;",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u5170\u82cf\u696a\u54f2;",
            ")",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->requireNotIgnoringFallbacks()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 10
    .line 11
    .line 12
    invoke-interface {p2}, Lcom/typesafe/config/impl/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世苏哲兰()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->mergeOrigins(Ljava/util/Collection;)L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1, v0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->constructDelayedMerge(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public abstract newCopy(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
.end method

.method public origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;
    .locals 0

    .line 6
    iget-object p0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    return-object p0
.end method

.method public bridge synthetic origin()L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public relativized(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final render()Ljava/lang/String;
    .locals 2

    .line 32
    new-instance v0, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v1, v1}, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;-><init>(ZZZ)V

    .line 33
    invoke-virtual {p0, v0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->render(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final render(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;)Ljava/lang/String;
    .locals 6

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v5, p1

    .line 39
    invoke-virtual/range {v0 .. v5}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->render(Ljava/lang/StringBuilder;IZLjava/lang/String;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;)V

    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public render(Ljava/lang/StringBuilder;IZLjava/lang/String;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;)V
    .locals 0

    .line 1
    if-eqz p4, :cond_1

    .line 2
    .line 3
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p4}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p4

    .line 10
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-boolean p4, p5, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Z

    .line 14
    .line 15
    if-eqz p4, :cond_0

    .line 16
    .line 17
    const-string p4, " : "

    .line 18
    .line 19
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string p4, ":"

    .line 24
    .line 25
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2, p3, p5}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->render(Ljava/lang/StringBuilder;IZL飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public render(Ljava/lang/StringBuilder;IZL飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;)V
    .locals 0

    .line 34
    invoke-virtual {p0, p4}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->hideEnvVariableValue(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 35
    const-string p0, "<env variable>"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 36
    :cond_0
    invoke-interface {p0}, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;->unwrapped()Ljava/lang/Object;

    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final requireNotIgnoringFallbacks()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->ignoresFallbacks()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "method should not have been called with ignoresFallbacks=true "

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public resolveStatus()Lcom/typesafe/config/impl/ResolveStatus;
    .locals 0

    .line 1
    sget-object p0, Lcom/typesafe/config/impl/ResolveStatus;->RESOLVED:Lcom/typesafe/config/impl/ResolveStatus;

    .line 2
    .line 3
    return-object p0
.end method

.method public resolveSubstitutions(Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;)Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u4e16\u54f2\u82cf;",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u54f2\u4e16\u82cf;",
            ")",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;"
        }
    .end annotation

    .line 1
    new-instance p2, Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    invoke-direct {p2, p1, p0}, Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)V

    .line 4
    .line 5
    .line 6
    return-object p2
.end method

.method public toFallbackValue()Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 6
    return-object p0
.end method

.method public bridge synthetic toFallbackValue()L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->toFallbackValue()Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v5, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v5, v0, v0, v0}, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;-><init>(ZZZ)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, 0x0

    .line 15
    move-object v0, p0

    .line 16
    invoke-virtual/range {v0 .. v5}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->render(Ljava/lang/StringBuilder;IZLjava/lang/String;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v0, "("

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, ")"

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method

.method public transformToString()Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public withFallback(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->ignoresFallbacks()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏世兰;

    .line 9
    .line 10
    invoke-interface {p1}, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏世兰;->toFallbackValue()L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    instance-of v0, p1, Lcom/typesafe/config/impl/飘花落叶言子世兰苏楪哲;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子世兰苏楪哲;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->mergedWithTheUnmergeable(Lcom/typesafe/config/impl/飘花落叶言子世兰苏楪哲;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_1
    instance-of v0, p1, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->mergedWithObject(Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_2
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->mergedWithNonObject(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public bridge synthetic withFallback(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世哲兰苏;)L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 44
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->withFallback(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic withFallback(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世哲兰苏;)L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 43
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->withFallback(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    move-result-object p0

    return-object p0
.end method

.method public withFallbacksIgnored()Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->ignoresFallbacks()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const-string v0, "value class doesn\'t implement forced fallback-ignoring "

    .line 9
    .line 10
    invoke-static {p0, v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method public withOrigin(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin:Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->newCopy(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public bridge synthetic withOrigin(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 11
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->withOrigin(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    move-result-object p0

    return-object p0
.end method
