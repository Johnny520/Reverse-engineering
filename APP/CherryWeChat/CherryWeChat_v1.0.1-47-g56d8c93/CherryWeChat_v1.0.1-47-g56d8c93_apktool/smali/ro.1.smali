.class public final Lro;
.super Lt;
.source ""


# instance fields
.field public final a:Lqo;


# direct methods
.method public constructor <init>()V
    .locals 3

    sget-object v0, Lsz;->a:Lsz;

    sget-object v0, Lvm;->a:Lvm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lqo;

    sget-object v1, Lsz;->b:Lru;

    sget-object v2, Lvm;->b:LEx;

    invoke-direct {v0, v1, v2}, Lqo;-><init>(LCx;LCx;)V

    iput-object v0, p0, Lro;->a:Lqo;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    return-object v0
.end method

.method public final b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/util/AbstractMap;->size()I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    return p1
.end method

.method public final c(Ljava/lang/Object;)I
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final e(LVa;ILjava/lang/Object;)V
    .locals 6

    check-cast p3, Ljava/util/Map;

    sget-object v0, Lvm;->a:Lvm;

    sget-object v1, Lsz;->a:Lsz;

    iget-object v2, p0, Lro;->a:Lqo;

    const/4 v3, 0x0

    invoke-interface {p1, v2, p2, v1, v3}, LVa;->v(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v2}, LVa;->j(LCx;)I

    move-result v4

    add-int/lit8 v5, p2, 0x1

    if-ne v4, v5, :cond_1

    invoke-interface {p3, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lvm;->b:LEx;

    iget-object p2, p2, LEx;->b:LfG;

    instance-of p2, p2, Lnu;

    if-nez p2, :cond_0

    invoke-static {p3, v1}, Luq;->J(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1, v2, v4, v0, p2}, LVa;->v(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-interface {p1, v2, v4, v0, v3}, LVa;->v(LCx;ILQm;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-interface {p3, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "Value must follow key in a map, index for key: "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", returned index for value: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance p1, Ljava/util/LinkedHashMap;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    return-object p1
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/LinkedHashMap;

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    iget-object v0, p0, Lro;->a:Lqo;

    return-object v0
.end method

.method public final serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    const/4 p1, 0x0

    throw p1
.end method
