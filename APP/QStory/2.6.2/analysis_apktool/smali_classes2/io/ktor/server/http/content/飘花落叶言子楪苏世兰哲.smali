.class public final Lio/ktor/server/http/content/飘花落叶言子楪苏世兰哲;
.super Lio/ktor/http/content/飘花落叶言子楪苏兰世哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/nio/file/Path;


# direct methods
.method public constructor <init>(Ljava/nio/file/Path;L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lio/ktor/server/http/content/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/file/Path;

    .line 11
    .line 12
    iput-object p2, p0, Lio/ktor/server/http/content/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    new-array v0, p2, [Ljava/nio/file/LinkOption;

    .line 16
    .line 17
    invoke-static {p1, v0}, Ljava/nio/file/Files;->exists(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-array p2, p2, [Ljava/nio/file/LinkOption;

    .line 24
    .line 25
    invoke-static {p1, p2}, Ljava/nio/file/Files;->getLastModifiedTime(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileTime;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    sget-object p2, Lio/ktor/http/content/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 30
    .line 31
    invoke-virtual {p0, p2}, Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏(Lio/ktor/util/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/util/List;

    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 40
    .line 41
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance v1, Lio/ktor/http/content/飘花落叶言子楪世哲兰苏;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/nio/file/attribute/FileTime;->toMillis()J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, L飘花落叶言楪兰哲世苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Long;)L飘花落叶言楪兰哲世苏子/飘花落叶言子楪世哲兰苏;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-direct {v1, p1}, Lio/ktor/http/content/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言楪兰哲世苏子/飘花落叶言子楪世哲兰苏;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏哲世楪兰(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p0, p2, p1}, Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰哲苏(Lio/ktor/util/飘花落叶言子楪世苏哲兰;Ljava/util/ArrayList;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_1
    const-string p0, "No such path "

    .line 70
    .line 71
    invoke-static {p1, p0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 p0, 0x0

    .line 75
    throw p0
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲()L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/server/http/content/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Ljava/lang/Long;
    .locals 2

    .line 1
    iget-object p0, p0, Lio/ktor/server/http/content/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/file/Path;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/nio/file/Files;->size(Ljava/nio/file/Path;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰()Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/server/http/content/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Ljava/nio/file/Path;

    .line 2
    .line 3
    invoke-static {p0}, Lio/ktor/util/cio/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/nio/file/Path;)Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
