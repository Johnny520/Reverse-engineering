.class public final Lqd/b;
.super Lqd/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final L:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lqd/e;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    check-cast p2, Ljava/util/List;

    .line 8
    .line 9
    iput-object p2, p0, Lqd/b;->L:Ljava/util/List;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-interface {p2}, Ljava/util/List;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    mul-int/lit8 p2, p2, 0x1f

    .line 20
    .line 21
    add-int/2addr p2, p1

    .line 22
    iput p2, p0, Lqd/j;->a:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final j()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/b;->L:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lqd/e;->s(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lqd/b;

    .line 8
    .line 9
    iget-object p1, p1, Lqd/b;->L:Ljava/util/List;

    .line 10
    .line 11
    iget-object v0, p0, Lqd/b;->L:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lqd/b;->L:Ljava/util/List;

    .line 2
    .line 3
    const-string v1, ", "

    .line 4
    .line 5
    invoke-static {v0, v1}, Lxe/s;->j(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "<"

    .line 10
    .line 11
    const-string v2, ">"

    .line 12
    .line 13
    iget-object v3, p0, Lqd/e;->K:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v3, v1, v0, v2}, Lwb/en;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method
