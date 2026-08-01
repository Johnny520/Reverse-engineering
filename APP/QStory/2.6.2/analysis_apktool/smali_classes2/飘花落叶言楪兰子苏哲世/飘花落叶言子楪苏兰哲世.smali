.class public final L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ConcurrentHashMap;


# instance fields
.field public 飘花落叶言子楪世哲苏兰:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_2

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    const-string v0, "/"

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :goto_0
    iput-object p1, p0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 33
    .line 34
    iput-object p2, p0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    const-string p0, "name is empty"

    .line 38
    .line 39
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :cond_2
    const-string p0, "path is empty"

    .line 44
    .line 45
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰()L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;
    .locals 10

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

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
    sget-object v1, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;

    .line 27
    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    const-class v3, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰哲世;

    .line 31
    .line 32
    monitor-enter v3

    .line 33
    :try_start_0
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;

    .line 38
    .line 39
    if-nez v2, :cond_0

    .line 40
    .line 41
    new-instance v4, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;

    .line 42
    .line 43
    iget-object v5, p0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v6, p0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v8, p0, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 48
    .line 49
    const/4 v9, 0x0

    .line 50
    const/4 v7, 0x0

    .line 51
    invoke-direct/range {v4 .. v9}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;-><init>(Ljava/lang/String;Ljava/lang/String;[L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲兰世苏;Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v0, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-object v2, v4

    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    move-object p0, v0

    .line 61
    goto :goto_1

    .line 62
    :cond_0
    :goto_0
    monitor-exit v3

    .line 63
    return-object v2

    .line 64
    :goto_1
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    throw p0

    .line 66
    :cond_1
    return-object v2
.end method
