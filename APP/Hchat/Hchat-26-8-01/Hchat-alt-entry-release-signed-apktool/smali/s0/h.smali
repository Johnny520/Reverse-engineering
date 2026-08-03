.class public final Ls0/h;
.super Lp0/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li0/t;


# static fields
.field public static final j:Ls0/h;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ls0/h;

    .line 2
    .line 3
    sget-object v1, Lp0/j;->e:Lp0/j;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lp0/b;-><init>(Lp0/j;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ls0/h;->j:Ls0/h;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final c(Li0/p1;Li0/p2;)Ls0/h;
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
    iget-object v2, p0, Lp0/b;->g:Lp0/j;

    .line 7
    .line 8
    invoke-virtual {v2, v0, p1, p2, v1}, Lp0/j;->u(ILjava/lang/Object;Ljava/lang/Object;I)La5/a;

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
    new-instance p2, Ls0/h;

    .line 16
    .line 17
    iget-object v0, p1, La5/a;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lp0/j;

    .line 20
    .line 21
    iget v1, p0, Lp0/b;->h:I

    .line 22
    .line 23
    iget p1, p1, La5/a;->h:I

    .line 24
    .line 25
    add-int/2addr v1, p1

    .line 26
    invoke-direct {p2, v0, v1}, Lp0/b;-><init>(Lp0/j;I)V

    .line 27
    .line 28
    .line 29
    return-object p2
.end method

.method public final bridge containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Li0/p1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Li0/p1;

    .line 8
    .line 9
    invoke-super {p0, p1}, Lp0/b;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final bridge containsValue(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Li0/p2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Li0/p2;

    .line 8
    .line 9
    invoke-super {p0, p1}, Lp0/b;->containsValue(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final bridge get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Li0/p1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_0
    check-cast p1, Li0/p1;

    .line 8
    .line 9
    invoke-super {p0, p1}, Lp0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Li0/p2;

    .line 14
    .line 15
    return-object p1
.end method

.method public final bridge getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Li0/p1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object p2

    .line 6
    :cond_0
    check-cast p1, Li0/p1;

    .line 7
    .line 8
    check-cast p2, Li0/p2;

    .line 9
    .line 10
    invoke-super {p0, p1, p2}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Li0/p2;

    .line 15
    .line 16
    return-object p1
.end method
