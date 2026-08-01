.class final Lcom/typesafe/config/impl/SimpleConfigObject;
.super Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/typesafe/config/impl/SimpleConfigObject$RenderComparator;
    }
.end annotation


# static fields
.field private static final EMPTY_NAME:Ljava/lang/String; = "empty config"

.field private static final emptyInstance:Lcom/typesafe/config/impl/SimpleConfigObject;

.field private static final serialVersionUID:J = 0x2L


# instance fields
.field private final ignoresFallbacks:Z

.field private final resolved:Z

.field private final value:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "empty config"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/typesafe/config/impl/SimpleConfigObject;->empty(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/typesafe/config/impl/SimpleConfigObject;->emptyInstance:Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u5b50\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            ">;)V"
        }
    .end annotation

    .line 43
    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lcom/typesafe/config/impl/ResolveStatus;->fromValues(Ljava/util/Collection;)Lcom/typesafe/config/impl/ResolveStatus;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/typesafe/config/impl/SimpleConfigObject;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/util/Map;Lcom/typesafe/config/impl/ResolveStatus;Z)V

    return-void
.end method

.method public constructor <init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/util/Map;Lcom/typesafe/config/impl/ResolveStatus;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u5b50\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/typesafe/config/impl/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            ">;",
            "Lcom/typesafe/config/impl/ResolveStatus;",
            "Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    if-eqz p2, :cond_2

    .line 6
    .line 7
    iput-object p2, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 8
    .line 9
    sget-object v0, Lcom/typesafe/config/impl/ResolveStatus;->RESOLVED:Lcom/typesafe/config/impl/ResolveStatus;

    .line 10
    .line 11
    if-ne p3, v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    iput-boolean v0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->resolved:Z

    .line 17
    .line 18
    iput-boolean p4, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->ignoresFallbacks:Z

    .line 19
    .line 20
    invoke-interface {p2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-static {p2}, Lcom/typesafe/config/impl/ResolveStatus;->fromValues(Ljava/util/Collection;)Lcom/typesafe/config/impl/ResolveStatus;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    if-ne p3, p2, :cond_1

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    const-string p2, "Wrong resolved status on "

    .line 32
    .line 33
    invoke-static {p0, p2}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_2
    const-string p0, "creating config object with null map"

    .line 38
    .line 39
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1
.end method

.method public static final empty()Lcom/typesafe/config/impl/SimpleConfigObject;
    .locals 1

    .line 16
    sget-object v0, Lcom/typesafe/config/impl/SimpleConfigObject;->emptyInstance:Lcom/typesafe/config/impl/SimpleConfigObject;

    return-object v0
.end method

.method public static final empty(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/SimpleConfigObject;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    invoke-static {}, Lcom/typesafe/config/impl/SimpleConfigObject;->empty()Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v0, Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 9
    .line 10
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, Lcom/typesafe/config/impl/SimpleConfigObject;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/util/Map;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public static final emptyMissing(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/SimpleConfigObject;
    .locals 2

    .line 1
    new-instance v0, Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string p0, " (not found)"

    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 31
    .line 32
    invoke-direct {v0, p0, v1}, Lcom/typesafe/config/impl/SimpleConfigObject;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/util/Map;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method private static mapEquals(Ljava/util/Map;Ljava/util/Map;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u5b50\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u5b50\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v1, v2}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    return v3

    .line 21
    :cond_1
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_3

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;

    .line 42
    .line 43
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v4, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_2

    .line 52
    .line 53
    return v3

    .line 54
    :cond_3
    return v0
.end method

.method private static mapHash(Ljava/util/Map;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u5b50\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            ">;)I"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/lang/String;

    .line 32
    .line 33
    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    add-int/2addr v2, v3

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    add-int/lit8 p0, p0, 0x29

    .line 50
    .line 51
    mul-int/lit8 p0, p0, 0x29

    .line 52
    .line 53
    add-int/2addr p0, v2

    .line 54
    return p0
.end method

.method private modify(Lcom/typesafe/config/impl/飘花落叶言子楪世哲苏兰;)Lcom/typesafe/config/impl/SimpleConfigObject;
    .locals 1

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigObject;->modifyMayThrow(Lcom/typesafe/config/impl/飘花落叶言子楪世苏兰哲;)Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception p0

    .line 7
    new-instance p1, Lcom/typesafe/config/ConfigException$BugOrBroken;

    .line 8
    .line 9
    const-string v0, "unexpected checked exception"

    .line 10
    .line 11
    invoke-direct {p1, v0, p0}, Lcom/typesafe/config/ConfigException$BugOrBroken;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    throw p1

    .line 15
    :catch_1
    move-exception p0

    .line 16
    throw p0
.end method

.method private modifyMayThrow(Lcom/typesafe/config/impl/飘花落叶言子楪世苏兰哲;)Lcom/typesafe/config/impl/SimpleConfigObject;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/SimpleConfigObject;->keySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ljava/lang/String;

    .line 21
    .line 22
    iget-object v3, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 23
    .line 24
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 29
    .line 30
    invoke-interface {p1, v3, v2}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    if-eq v4, v3, :cond_0

    .line 35
    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    new-instance v1, Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 41
    .line 42
    .line 43
    :cond_1
    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    if-nez v1, :cond_3

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_3
    new-instance p1, Ljava/util/HashMap;

    .line 51
    .line 52
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/typesafe/config/impl/SimpleConfigObject;->keySet()Ljava/util/Set;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const/4 v2, 0x0

    .line 64
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_6

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Ljava/lang/String;

    .line 75
    .line 76
    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    const/4 v5, 0x1

    .line 81
    if-eqz v4, :cond_5

    .line 82
    .line 83
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    check-cast v4, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 88
    .line 89
    if-eqz v4, :cond_4

    .line 90
    .line 91
    invoke-virtual {p1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->resolveStatus()Lcom/typesafe/config/impl/ResolveStatus;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    sget-object v4, Lcom/typesafe/config/impl/ResolveStatus;->UNRESOLVED:Lcom/typesafe/config/impl/ResolveStatus;

    .line 99
    .line 100
    if-ne v3, v4, :cond_4

    .line 101
    .line 102
    :goto_2
    move v2, v5

    .line 103
    goto :goto_1

    .line 104
    :cond_5
    iget-object v4, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 105
    .line 106
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    check-cast v4, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 111
    .line 112
    invoke-virtual {p1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->resolveStatus()Lcom/typesafe/config/impl/ResolveStatus;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    sget-object v4, Lcom/typesafe/config/impl/ResolveStatus;->UNRESOLVED:Lcom/typesafe/config/impl/ResolveStatus;

    .line 120
    .line 121
    if-ne v3, v4, :cond_4

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_6
    new-instance v0, Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 125
    .line 126
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    if-eqz v2, :cond_7

    .line 131
    .line 132
    sget-object v2, Lcom/typesafe/config/impl/ResolveStatus;->UNRESOLVED:Lcom/typesafe/config/impl/ResolveStatus;

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_7
    sget-object v2, Lcom/typesafe/config/impl/ResolveStatus;->RESOLVED:Lcom/typesafe/config/impl/ResolveStatus;

    .line 136
    .line 137
    :goto_3
    invoke-virtual {p0}, Lcom/typesafe/config/impl/SimpleConfigObject;->ignoresFallbacks()Z

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    invoke-direct {v0, v1, p1, v2, p0}, Lcom/typesafe/config/impl/SimpleConfigObject;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/util/Map;Lcom/typesafe/config/impl/ResolveStatus;Z)V

    .line 142
    .line 143
    .line 144
    return-object v0
.end method

.method private newCopy(Lcom/typesafe/config/impl/ResolveStatus;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Z)Lcom/typesafe/config/impl/SimpleConfigObject;
    .locals 1

    .line 1
    new-instance v0, Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 4
    .line 5
    invoke-direct {v0, p2, p0, p1, p3}, Lcom/typesafe/config/impl/SimpleConfigObject;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/util/Map;Lcom/typesafe/config/impl/ResolveStatus;Z)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/typesafe/config/impl/SerializedConfigValue;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/typesafe/config/impl/SerializedConfigValue;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public attemptPeekWithPartialResolve(Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 8
    .line 9
    return-object p0
.end method

.method public canEqual(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p0, p1, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    return p0
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public entrySet()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u5b50\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            ">;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/util/Map$Entry;

    .line 27
    .line 28
    new-instance v2, Ljava/util/AbstractMap$SimpleImmutableEntry;

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-direct {v2, v3, v1}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigObject;->canEqual(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p1, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰苏哲;

    .line 13
    .line 14
    invoke-static {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigObject;->mapEquals(Ljava/util/Map;Ljava/util/Map;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    return v1
.end method

.method public get(Ljava/lang/Object;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 8
    .line 9
    return-object p0
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 11
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigObject;->get(Ljava/lang/Object;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic get(Ljava/lang/Object;)L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 10
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigObject;->get(Ljava/lang/Object;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    move-result-object p0

    return-object p0
.end method

.method public hasDescendant(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 23
    .line 24
    if-ne v1, p1, :cond_0

    .line 25
    .line 26
    return v2

    .line 27
    :cond_1
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 48
    .line 49
    instance-of v1, v0, Lcom/typesafe/config/impl/飘花落叶言子楪苏兰世哲;

    .line 50
    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    check-cast v0, Lcom/typesafe/config/impl/飘花落叶言子楪苏兰世哲;

    .line 54
    .line 55
    invoke-interface {v0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪苏兰世哲;->hasDescendant(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    return v2

    .line 62
    :cond_3
    const/4 p0, 0x0

    .line 63
    return p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/typesafe/config/impl/SimpleConfigObject;->mapHash(Ljava/util/Map;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public ignoresFallbacks()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->ignoresFallbacks:Z

    .line 2
    .line 3
    return p0
.end method

.method public isEmpty()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public keySet()Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public mergedWithObject(Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;)Lcom/typesafe/config/impl/SimpleConfigObject;
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->requireNotIgnoringFallbacks()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 5
    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    check-cast p1, Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 9
    .line 10
    new-instance v0, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v1, Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/typesafe/config/impl/SimpleConfigObject;->keySet()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/typesafe/config/impl/SimpleConfigObject;->keySet()Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const/4 v2, 0x1

    .line 39
    const/4 v3, 0x0

    .line 40
    move v4, v2

    .line 41
    move v5, v3

    .line 42
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eqz v6, :cond_4

    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    check-cast v6, Ljava/lang/String;

    .line 53
    .line 54
    iget-object v7, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 55
    .line 56
    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    check-cast v7, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 61
    .line 62
    iget-object v8, p1, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 63
    .line 64
    invoke-interface {v8, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    check-cast v8, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 69
    .line 70
    if-nez v7, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    if-nez v8, :cond_2

    .line 74
    .line 75
    move-object v8, v7

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    invoke-virtual {v7, v8}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->withFallback(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    :goto_1
    invoke-virtual {v0, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    if-eq v7, v8, :cond_3

    .line 85
    .line 86
    move v5, v2

    .line 87
    :cond_3
    invoke-virtual {v8}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->resolveStatus()Lcom/typesafe/config/impl/ResolveStatus;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    sget-object v7, Lcom/typesafe/config/impl/ResolveStatus;->UNRESOLVED:Lcom/typesafe/config/impl/ResolveStatus;

    .line 92
    .line 93
    if-ne v6, v7, :cond_0

    .line 94
    .line 95
    move v4, v3

    .line 96
    goto :goto_0

    .line 97
    :cond_4
    invoke-static {v4}, Lcom/typesafe/config/impl/ResolveStatus;->fromBoolean(Z)Lcom/typesafe/config/impl/ResolveStatus;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {p1}, Lcom/typesafe/config/impl/SimpleConfigObject;->ignoresFallbacks()Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-eqz v5, :cond_5

    .line 106
    .line 107
    new-instance v5, Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 108
    .line 109
    const/4 v6, 0x2

    .line 110
    new-array v6, v6, [Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 111
    .line 112
    aput-object p0, v6, v3

    .line 113
    .line 114
    aput-object p1, v6, v2

    .line 115
    .line 116
    invoke-static {v6}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->mergeOrigins([Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;)L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-direct {v5, p0, v0, v1, v4}, Lcom/typesafe/config/impl/SimpleConfigObject;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/util/Map;Lcom/typesafe/config/impl/ResolveStatus;Z)V

    .line 121
    .line 122
    .line 123
    return-object v5

    .line 124
    :cond_5
    invoke-virtual {p0}, Lcom/typesafe/config/impl/SimpleConfigObject;->resolveStatus()Lcom/typesafe/config/impl/ResolveStatus;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-ne v1, p1, :cond_7

    .line 129
    .line 130
    invoke-virtual {p0}, Lcom/typesafe/config/impl/SimpleConfigObject;->ignoresFallbacks()Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-eq v4, p1, :cond_6

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_6
    return-object p0

    .line 138
    :cond_7
    :goto_2
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-direct {p0, v1, p1, v4}, Lcom/typesafe/config/impl/SimpleConfigObject;->newCopy(Lcom/typesafe/config/impl/ResolveStatus;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Z)Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    return-object p0

    .line 147
    :cond_8
    const-string p0, "should not be reached (merging non-SimpleConfigObject)"

    .line 148
    .line 149
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    const/4 p0, 0x0

    .line 153
    return-object p0
.end method

.method public bridge synthetic mergedWithObject(Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 154
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigObject;->mergedWithObject(Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;)Lcom/typesafe/config/impl/SimpleConfigObject;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic mergedWithObject(Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 155
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigObject;->mergedWithObject(Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;)Lcom/typesafe/config/impl/SimpleConfigObject;

    move-result-object p0

    return-object p0
.end method

.method public newCopy(Lcom/typesafe/config/impl/ResolveStatus;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/SimpleConfigObject;
    .locals 1

    .line 10
    iget-boolean v0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->ignoresFallbacks:Z

    invoke-direct {p0, p1, p2, v0}, Lcom/typesafe/config/impl/SimpleConfigObject;->newCopy(Lcom/typesafe/config/impl/ResolveStatus;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Z)Lcom/typesafe/config/impl/SimpleConfigObject;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic newCopy(Lcom/typesafe/config/impl/ResolveStatus;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/typesafe/config/impl/SimpleConfigObject;->newCopy(Lcom/typesafe/config/impl/ResolveStatus;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/SimpleConfigObject;

    move-result-object p0

    return-object p0
.end method

.method public relativized(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/SimpleConfigObject;
    .locals 1

    .line 1
    new-instance v0, Lcom/typesafe/config/impl/飘花落叶言子世苏楪哲兰;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/typesafe/config/impl/飘花落叶言子世苏楪哲兰;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/typesafe/config/impl/SimpleConfigObject;->modify(Lcom/typesafe/config/impl/飘花落叶言子楪世哲苏兰;)Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public bridge synthetic relativized(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 11
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigObject;->relativized(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/SimpleConfigObject;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic relativized(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 12
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigObject;->relativized(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/SimpleConfigObject;

    move-result-object p0

    return-object p0
.end method

.method public render(Ljava/lang/StringBuilder;IZL飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;)V
    .locals 17

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move/from16 v6, p2

    .line 4
    .line 5
    move-object/from16 v5, p4

    .line 6
    .line 7
    invoke-virtual/range {p0 .. p0}, Lcom/typesafe/config/impl/SimpleConfigObject;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v7, 0xa

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-string v0, "{}"

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move v0, v7

    .line 21
    goto/16 :goto_6

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-boolean v8, v5, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Z

    .line 27
    .line 28
    add-int/lit8 v2, v6, 0x1

    .line 29
    .line 30
    const-string v0, "{"

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    if-eqz v8, :cond_1

    .line 36
    .line 37
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/typesafe/config/impl/SimpleConfigObject;->keySet()Ljava/util/Set;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual/range {p0 .. p0}, Lcom/typesafe/config/impl/SimpleConfigObject;->size()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    new-array v3, v3, [Ljava/lang/String;

    .line 49
    .line 50
    invoke-interface {v0, v3}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    move-object v9, v0

    .line 55
    check-cast v9, [Ljava/lang/String;

    .line 56
    .line 57
    new-instance v0, Lcom/typesafe/config/impl/SimpleConfigObject$RenderComparator;

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    invoke-direct {v0, v3}, Lcom/typesafe/config/impl/SimpleConfigObject$RenderComparator;-><init>(Lcom/typesafe/config/impl/飘花落叶言子世苏楪哲兰;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v9, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 64
    .line 65
    .line 66
    array-length v10, v9

    .line 67
    const/4 v0, 0x0

    .line 68
    const/4 v12, 0x0

    .line 69
    :goto_0
    if-ge v12, v10, :cond_8

    .line 70
    .line 71
    aget-object v4, v9, v12

    .line 72
    .line 73
    move-object/from16 v13, p0

    .line 74
    .line 75
    iget-object v0, v13, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 76
    .line 77
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 82
    .line 83
    iget-boolean v3, v5, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Z

    .line 84
    .line 85
    const-string v15, "\n"

    .line 86
    .line 87
    if-eqz v3, :cond_3

    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v3}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3, v15}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    array-length v11, v3

    .line 102
    const/4 v7, 0x0

    .line 103
    :goto_1
    if-ge v7, v11, :cond_3

    .line 104
    .line 105
    aget-object v14, v3, v7

    .line 106
    .line 107
    invoke-static {v1, v2, v5}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->indent(Ljava/lang/StringBuilder;IL飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;)V

    .line 108
    .line 109
    .line 110
    move-object/from16 v16, v0

    .line 111
    .line 112
    const/16 v0, 0x23

    .line 113
    .line 114
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v14}, Ljava/lang/String;->isEmpty()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_2

    .line 122
    .line 123
    const/16 v0, 0x20

    .line 124
    .line 125
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    :cond_2
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    add-int/lit8 v7, v7, 0x1

    .line 135
    .line 136
    move-object/from16 v0, v16

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_3
    move-object/from16 v16, v0

    .line 140
    .line 141
    iget-boolean v0, v5, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Z

    .line 142
    .line 143
    if-eqz v0, :cond_6

    .line 144
    .line 145
    invoke-virtual/range {v16 .. v16}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    iget-object v0, v0, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世哲兰:Ljava/util/List;

    .line 150
    .line 151
    if-eqz v0, :cond_4

    .line 152
    .line 153
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    goto :goto_2

    .line 158
    :cond_4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 159
    .line 160
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    if-eqz v3, :cond_6

    .line 169
    .line 170
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    check-cast v3, Ljava/lang/String;

    .line 175
    .line 176
    invoke-static {v1, v2, v5}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->indent(Ljava/lang/StringBuilder;IL飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;)V

    .line 177
    .line 178
    .line 179
    const-string v7, "#"

    .line 180
    .line 181
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string v7, " "

    .line 185
    .line 186
    invoke-virtual {v3, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    if-nez v7, :cond_5

    .line 191
    .line 192
    const/16 v7, 0x20

    .line 193
    .line 194
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_5
    const/16 v7, 0x20

    .line 199
    .line 200
    :goto_4
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_6
    invoke-static {v1, v2, v5}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->indent(Ljava/lang/StringBuilder;IL飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;)V

    .line 208
    .line 209
    .line 210
    const/4 v3, 0x0

    .line 211
    move-object/from16 v0, v16

    .line 212
    .line 213
    invoke-virtual/range {v0 .. v5}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->render(Ljava/lang/StringBuilder;IZLjava/lang/String;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;)V

    .line 214
    .line 215
    .line 216
    const-string v0, ","

    .line 217
    .line 218
    if-eqz v8, :cond_7

    .line 219
    .line 220
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    const/16 v0, 0xa

    .line 224
    .line 225
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    const/4 v0, 0x2

    .line 229
    goto :goto_5

    .line 230
    :cond_7
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const/4 v0, 0x1

    .line 234
    :goto_5
    add-int/lit8 v12, v12, 0x1

    .line 235
    .line 236
    const/16 v7, 0xa

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :cond_8
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    sub-int/2addr v2, v0

    .line 245
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 246
    .line 247
    .line 248
    const/16 v0, 0xa

    .line 249
    .line 250
    if-eqz v8, :cond_9

    .line 251
    .line 252
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-static {v1, v6, v5}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->indent(Ljava/lang/StringBuilder;IL飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;)V

    .line 256
    .line 257
    .line 258
    :cond_9
    const-string v2, "}"

    .line 259
    .line 260
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    :goto_6
    if-eqz p3, :cond_a

    .line 264
    .line 265
    iget-boolean v2, v5, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰:Z

    .line 266
    .line 267
    if-eqz v2, :cond_a

    .line 268
    .line 269
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    :cond_a
    return-void
.end method

.method public replaceChild(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/SimpleConfigObject;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/util/Map$Entry;

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    if-ne v3, p1, :cond_0

    .line 33
    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    invoke-interface {v2, p2}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    :goto_0
    new-instance p1, Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v1}, Lcom/typesafe/config/impl/ResolveStatus;->fromValues(Ljava/util/Collection;)Lcom/typesafe/config/impl/ResolveStatus;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iget-boolean p0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->ignoresFallbacks:Z

    .line 62
    .line 63
    invoke-direct {p1, p2, v0, v1, p0}, Lcom/typesafe/config/impl/SimpleConfigObject;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/util/Map;Lcom/typesafe/config/impl/ResolveStatus;Z)V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_2
    const-string p2, "SimpleConfigObject.replaceChild did not find "

    .line 68
    .line 69
    const-string v0, " in "

    .line 70
    .line 71
    invoke-static {p2, p1, v0, p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    const/4 p0, 0x0

    .line 75
    return-object p0
.end method

.method public bridge synthetic replaceChild(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 76
    invoke-virtual {p0, p1, p2}, Lcom/typesafe/config/impl/SimpleConfigObject;->replaceChild(Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)Lcom/typesafe/config/impl/SimpleConfigObject;

    move-result-object p0

    return-object p0
.end method

.method public resolveStatus()Lcom/typesafe/config/impl/ResolveStatus;
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->resolved:Z

    .line 2
    .line 3
    invoke-static {p0}, Lcom/typesafe/config/impl/ResolveStatus;->fromBoolean(Z)Lcom/typesafe/config/impl/ResolveStatus;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public resolveSubstitutions(Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;)Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;
    .locals 2
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
    invoke-virtual {p0}, Lcom/typesafe/config/impl/SimpleConfigObject;->resolveStatus()Lcom/typesafe/config/impl/ResolveStatus;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/typesafe/config/impl/ResolveStatus;->RESOLVED:Lcom/typesafe/config/impl/ResolveStatus;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    new-instance p2, Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;

    .line 10
    .line 11
    invoke-direct {p2, p1, p0}, Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)V

    .line 12
    .line 13
    .line 14
    return-object p2

    .line 15
    :cond_0
    invoke-virtual {p2, p0}, Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰(Lcom/typesafe/config/impl/飘花落叶言子楪苏兰世哲;)Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :try_start_0
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 20
    .line 21
    invoke-direct {v0, p1, p2}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;Lcom/typesafe/config/impl/飘花落叶言子楪兰哲世苏;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, v0}, Lcom/typesafe/config/impl/SimpleConfigObject;->modifyMayThrow(Lcom/typesafe/config/impl/飘花落叶言子楪世苏兰哲;)Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iget-object p1, v0, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;

    .line 31
    .line 32
    new-instance p2, Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;

    .line 33
    .line 34
    invoke-direct {p2, p1, p0}, Lcom/typesafe/config/impl/飘花落叶言子楪兰苏哲世;-><init>(Lcom/typesafe/config/impl/飘花落叶言子楪兰世哲苏;Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;)V

    .line 35
    .line 36
    .line 37
    instance-of p1, p0, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 38
    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    return-object p2

    .line 42
    :cond_1
    new-instance p1, Lcom/typesafe/config/ConfigException$BugOrBroken;

    .line 43
    .line 44
    new-instance p2, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v0, "Expecting a resolve result to be an object, but it was "

    .line 47
    .line 48
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-direct {p1, p0}, Lcom/typesafe/config/ConfigException$BugOrBroken;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1
    :try_end_0
    .catch Lcom/typesafe/config/impl/AbstractConfigValue$NotPossibleToResolve; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    :catch_0
    move-exception p0

    .line 63
    new-instance p1, Lcom/typesafe/config/ConfigException$BugOrBroken;

    .line 64
    .line 65
    const-string p2, "unexpected checked exception"

    .line 66
    .line 67
    invoke-direct {p1, p2, p0}, Lcom/typesafe/config/ConfigException$BugOrBroken;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :catch_1
    move-exception p0

    .line 72
    throw p0

    .line 73
    :catch_2
    move-exception p0

    .line 74
    throw p0
.end method

.method public size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public bridge synthetic unwrapped()Ljava/lang/Object;
    .locals 0

    .line 47
    invoke-virtual {p0}, Lcom/typesafe/config/impl/SimpleConfigObject;->unwrapped()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public unwrapped()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/util/Map$Entry;

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 37
    .line 38
    invoke-interface {v1}, L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;->unwrapped()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    return-object v0
.end method

.method public values()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u5b50\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public withFallbacksIgnored()Lcom/typesafe/config/impl/SimpleConfigObject;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->ignoresFallbacks:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/typesafe/config/impl/SimpleConfigObject;->resolveStatus()Lcom/typesafe/config/impl/ResolveStatus;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-direct {p0, v0, v1, v2}, Lcom/typesafe/config/impl/SimpleConfigObject;->newCopy(Lcom/typesafe/config/impl/ResolveStatus;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Z)Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public bridge synthetic withFallbacksIgnored()Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 20
    invoke-virtual {p0}, Lcom/typesafe/config/impl/SimpleConfigObject;->withFallbacksIgnored()Lcom/typesafe/config/impl/SimpleConfigObject;

    move-result-object p0

    return-object p0
.end method

.method public withOnlyKey(Ljava/lang/String;)Lcom/typesafe/config/impl/SimpleConfigObject;
    .locals 2

    .line 1
    new-instance v0, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;-><init>(Ljava/lang/String;Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/typesafe/config/impl/SimpleConfigObject;->withOnlyPath(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public bridge synthetic withOnlyKey(Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 13
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigObject;->withOnlyKey(Ljava/lang/String;)Lcom/typesafe/config/impl/SimpleConfigObject;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic withOnlyKey(Ljava/lang/String;)L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 12
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigObject;->withOnlyKey(Ljava/lang/String;)Lcom/typesafe/config/impl/SimpleConfigObject;

    move-result-object p0

    return-object p0
.end method

.method public withOnlyPath(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/SimpleConfigObject;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigObject;->withOnlyPathOrNull(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    new-instance p1, Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 14
    .line 15
    sget-object v2, Lcom/typesafe/config/impl/ResolveStatus;->RESOLVED:Lcom/typesafe/config/impl/ResolveStatus;

    .line 16
    .line 17
    iget-boolean p0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->ignoresFallbacks:Z

    .line 18
    .line 19
    invoke-direct {p1, v0, v1, v2, p0}, Lcom/typesafe/config/impl/SimpleConfigObject;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/util/Map;Lcom/typesafe/config/impl/ResolveStatus;Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object p1
.end method

.method public bridge synthetic withOnlyPath(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigObject;->withOnlyPath(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/SimpleConfigObject;

    move-result-object p0

    return-object p0
.end method

.method public withOnlyPathOrNull(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/SimpleConfigObject;
    .locals 4

    .line 1
    iget-object v0, p1, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    instance-of v3, v1, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    check-cast v1, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->withOnlyPathOrNull(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v1, v2

    .line 30
    :cond_1
    :goto_0
    if-nez v1, :cond_2

    .line 31
    .line 32
    return-object v2

    .line 33
    :cond_2
    new-instance p1, Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v0, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->resolveStatus()Lcom/typesafe/config/impl/ResolveStatus;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget-boolean p0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->ignoresFallbacks:Z

    .line 48
    .line 49
    invoke-direct {p1, v2, v0, v1, p0}, Lcom/typesafe/config/impl/SimpleConfigObject;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/util/Map;Lcom/typesafe/config/impl/ResolveStatus;Z)V

    .line 50
    .line 51
    .line 52
    return-object p1
.end method

.method public bridge synthetic withOnlyPathOrNull(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 53
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigObject;->withOnlyPathOrNull(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/SimpleConfigObject;

    move-result-object p0

    return-object p0
.end method

.method public withValue(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;)Lcom/typesafe/config/impl/SimpleConfigObject;
    .locals 3

    .line 1
    iget-object v0, p1, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v0, p2}, Lcom/typesafe/config/impl/SimpleConfigObject;->withValue(Ljava/lang/String;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;)Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object v1, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 13
    .line 14
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    instance-of v2, v1, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    check-cast v1, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 27
    .line 28
    invoke-virtual {v1, p1, p2}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->withValue(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0, v0, p1}, Lcom/typesafe/config/impl/SimpleConfigObject;->withValue(Ljava/lang/String;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;)Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_1
    check-cast p2, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 38
    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v2, "withValue("

    .line 42
    .line 43
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v2, ")"

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-static {v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {p2, v1, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->atPath(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/SimpleConfig;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Lcom/typesafe/config/impl/SimpleConfig;->root()Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p0, v0, p1}, Lcom/typesafe/config/impl/SimpleConfigObject;->withValue(Ljava/lang/String;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;)Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public withValue(Ljava/lang/String;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;)Lcom/typesafe/config/impl/SimpleConfigObject;
    .locals 2

    if-eqz p2, :cond_1

    .line 82
    iget-object v0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    check-cast p2, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    invoke-static {p1, p2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    goto :goto_0

    .line 84
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 85
    check-cast p2, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p1, v0

    .line 86
    :goto_0
    new-instance p2, Lcom/typesafe/config/impl/SimpleConfigObject;

    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-static {v1}, Lcom/typesafe/config/impl/ResolveStatus;->fromValues(Ljava/util/Collection;)Lcom/typesafe/config/impl/ResolveStatus;

    move-result-object v1

    iget-boolean p0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->ignoresFallbacks:Z

    invoke-direct {p2, v0, p1, v1, p0}, Lcom/typesafe/config/impl/SimpleConfigObject;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/util/Map;Lcom/typesafe/config/impl/ResolveStatus;Z)V

    return-object p2

    .line 87
    :cond_1
    const-string p0, "Trying to store null ConfigValue in a ConfigObject"

    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public bridge synthetic withValue(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 81
    invoke-virtual {p0, p1, p2}, Lcom/typesafe/config/impl/SimpleConfigObject;->withValue(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;)Lcom/typesafe/config/impl/SimpleConfigObject;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic withValue(Ljava/lang/String;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 79
    invoke-virtual {p0, p1, p2}, Lcom/typesafe/config/impl/SimpleConfigObject;->withValue(Ljava/lang/String;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;)Lcom/typesafe/config/impl/SimpleConfigObject;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic withValue(Ljava/lang/String;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;)L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 80
    invoke-virtual {p0, p1, p2}, Lcom/typesafe/config/impl/SimpleConfigObject;->withValue(Ljava/lang/String;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪苏世兰哲;)Lcom/typesafe/config/impl/SimpleConfigObject;

    move-result-object p0

    return-object p0
.end method

.method public withoutKey(Ljava/lang/String;)Lcom/typesafe/config/impl/SimpleConfigObject;
    .locals 2

    .line 1
    new-instance v0, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;-><init>(Ljava/lang/String;Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/typesafe/config/impl/SimpleConfigObject;->withoutPath(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public bridge synthetic withoutKey(Ljava/lang/String;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 13
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigObject;->withoutKey(Ljava/lang/String;)Lcom/typesafe/config/impl/SimpleConfigObject;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic withoutKey(Ljava/lang/String;)L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰苏哲;
    .locals 0

    .line 12
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigObject;->withoutKey(Ljava/lang/String;)Lcom/typesafe/config/impl/SimpleConfigObject;

    move-result-object p0

    return-object p0
.end method

.method public withoutPath(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/SimpleConfigObject;
    .locals 4

    .line 1
    iget-object v0, p1, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    instance-of v2, v1, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    check-cast v1, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;->withoutPath(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-instance v1, Ljava/util/HashMap;

    .line 28
    .line 29
    iget-object v2, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 30
    .line 31
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    new-instance p1, Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v2}, Lcom/typesafe/config/impl/ResolveStatus;->fromValues(Ljava/util/Collection;)Lcom/typesafe/config/impl/ResolveStatus;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iget-boolean p0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->ignoresFallbacks:Z

    .line 52
    .line 53
    invoke-direct {p1, v0, v1, v2, p0}, Lcom/typesafe/config/impl/SimpleConfigObject;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/util/Map;Lcom/typesafe/config/impl/ResolveStatus;Z)V

    .line 54
    .line 55
    .line 56
    return-object p1

    .line 57
    :cond_0
    if-nez p1, :cond_4

    .line 58
    .line 59
    if-nez v1, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    new-instance p1, Ljava/util/HashMap;

    .line 63
    .line 64
    iget-object v1, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    add-int/lit8 v1, v1, -0x1

    .line 71
    .line 72
    invoke-direct {p1, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->value:Ljava/util/Map;

    .line 76
    .line 77
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_3

    .line 90
    .line 91
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Ljava/util/Map$Entry;

    .line 96
    .line 97
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-nez v3, :cond_2

    .line 108
    .line 109
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {p1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_3
    new-instance v0, Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 122
    .line 123
    invoke-virtual {p0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->origin()Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-static {v2}, Lcom/typesafe/config/impl/ResolveStatus;->fromValues(Ljava/util/Collection;)Lcom/typesafe/config/impl/ResolveStatus;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    iget-boolean p0, p0, Lcom/typesafe/config/impl/SimpleConfigObject;->ignoresFallbacks:Z

    .line 136
    .line 137
    invoke-direct {v0, v1, p1, v2, p0}, Lcom/typesafe/config/impl/SimpleConfigObject;-><init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/util/Map;Lcom/typesafe/config/impl/ResolveStatus;Z)V

    .line 138
    .line 139
    .line 140
    return-object v0

    .line 141
    :cond_4
    :goto_1
    return-object p0
.end method

.method public bridge synthetic withoutPath(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 142
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SimpleConfigObject;->withoutPath(Lcom/typesafe/config/impl/飘花落叶言子楪哲苏兰世;)Lcom/typesafe/config/impl/SimpleConfigObject;

    move-result-object p0

    return-object p0
.end method
