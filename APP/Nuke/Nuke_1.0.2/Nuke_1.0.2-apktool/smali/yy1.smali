.class public final Lyy1;
.super Lzy1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Liy;


# static fields
.field public static final k:Lyy1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lyy1;

    .line 2
    .line 3
    sget-object v1, Lh43;->e:Lh43;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lzy1;-><init>(Lh43;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lyy1;->k:Lyy1;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Lbz1;
    .locals 1

    .line 1
    new-instance v0, Lxy1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lbz1;-><init>(Lzy1;)V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, Lxy1;->n:Lyy1;

    .line 7
    .line 8
    return-object v0
.end method

.method public final b()Lbz1;
    .locals 1

    .line 1
    new-instance v0, Lxy1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lbz1;-><init>(Lzy1;)V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, Lxy1;->n:Lyy1;

    .line 7
    .line 8
    return-object v0
.end method

.method public final bridge containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Le42;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Le42;

    .line 8
    .line 9
    invoke-super {p0, p1}, Lzy1;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final bridge containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lm93;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lm93;

    .line 8
    .line 9
    invoke-super {p0, p1}, Lzy1;->containsValue(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final d(Le42;Lm93;)Lyy1;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object v2, p0, Lzy1;->h:Lh43;

    .line 7
    .line 8
    invoke-virtual {v2, v0, v1, p1, p2}, Lh43;->u(IILjava/lang/Object;Ljava/lang/Object;)Ldk;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    new-instance p2, Lyy1;

    .line 16
    .line 17
    iget-object v0, p1, Ldk;->j:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lh43;

    .line 20
    .line 21
    iget p0, p0, Lzy1;->i:I

    .line 22
    .line 23
    iget p1, p1, Ldk;->i:I

    .line 24
    .line 25
    add-int/2addr p0, p1

    .line 26
    invoke-direct {p2, v0, p0}, Lzy1;-><init>(Lh43;I)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method

.method public final bridge get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Le42;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    check-cast p1, Le42;

    .line 8
    .line 9
    invoke-super {p0, p1}, Lzy1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lm93;

    .line 14
    .line 15
    return-object p0
.end method

.method public final bridge getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Le42;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object p2

    .line 6
    :cond_0
    check-cast p1, Le42;

    .line 7
    .line 8
    check-cast p2, Lm93;

    .line 9
    .line 10
    invoke-super {p0, p1, p2}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lm93;

    .line 15
    .line 16
    return-object p0
.end method
