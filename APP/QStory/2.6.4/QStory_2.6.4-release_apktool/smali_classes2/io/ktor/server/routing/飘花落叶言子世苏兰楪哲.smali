.class public final Lio/ktor/server/routing/飘花落叶言子世苏兰楪哲;
.super Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Lio/ktor/server/routing/飘花落叶言子世苏兰楪哲;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lio/ktor/server/routing/飘花落叶言子世苏兰楪哲;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lio/ktor/server/routing/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰:Lio/ktor/server/routing/飘花落叶言子世苏兰楪哲;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "<slash>"

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰哲世(Lio/ktor/server/routing/飘花落叶言子世楪苏哲兰;I)Lio/ktor/server/routing/飘花落叶言子楪哲世兰苏;
    .locals 2

    .line 1
    iget-object p0, p1, Lio/ktor/server/routing/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏兰哲:Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    iget-object v0, p1, Lio/ktor/server/routing/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 4
    .line 5
    sget-object v1, Lio/ktor/server/routing/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;->getAttributes()Lio/ktor/util/飘花落叶言子楪世兰哲苏;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v1, Lio/ktor/server/routing/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lio/ktor/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰()Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    sget-object p0, Lio/ktor/server/routing/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲:Lio/ktor/server/routing/飘花落叶言子楪哲世苏兰;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    sget-object p0, Lio/ktor/server/routing/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:Lio/ktor/server/routing/飘花落叶言子楪哲世苏兰;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    add-int/lit8 p0, p0, -0x1

    .line 49
    .line 50
    if-ge p2, p0, :cond_2

    .line 51
    .line 52
    sget-object p0, Lio/ktor/server/routing/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲:Lio/ktor/server/routing/飘花落叶言子楪哲世苏兰;

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    add-int/lit8 p0, p0, -0x1

    .line 60
    .line 61
    if-le p2, p0, :cond_3

    .line 62
    .line 63
    sget-object p0, Lio/ktor/server/routing/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Lio/ktor/server/routing/飘花落叶言子楪苏兰哲世;

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_3
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, Ljava/lang/CharSequence;

    .line 71
    .line 72
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-lez p0, :cond_4

    .line 77
    .line 78
    sget-object p0, Lio/ktor/server/routing/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲:Lio/ktor/server/routing/飘花落叶言子楪哲世苏兰;

    .line 79
    .line 80
    return-object p0

    .line 81
    :cond_4
    iget-boolean p0, p1, Lio/ktor/server/routing/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世兰苏哲:Z

    .line 82
    .line 83
    if-eqz p0, :cond_5

    .line 84
    .line 85
    sget-object p0, Lio/ktor/server/routing/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰哲苏:Lio/ktor/server/routing/飘花落叶言子楪哲世苏兰;

    .line 86
    .line 87
    return-object p0

    .line 88
    :cond_5
    sget-object p0, Lio/ktor/server/routing/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Lio/ktor/server/routing/飘花落叶言子楪苏兰哲世;

    .line 89
    .line 90
    return-object p0
.end method
