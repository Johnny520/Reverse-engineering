.class public final Lk5/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final g:Lk5/u;

.field public final h:I

.field public final i:I

.field public final j:I


# direct methods
.method public constructor <init>(Lk5/u;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk5/b;->g:Lk5/u;

    .line 5
    .line 6
    iget-object p1, p1, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, La5/a;

    .line 12
    .line 13
    const/4 v1, 0x5

    .line 14
    invoke-direct {v0, p2, v1, p1}, La5/a;-><init>(IILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, La5/a;->n()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iput p1, p0, Lk5/b;->h:I

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-virtual {v0, p1}, La5/a;->o(Z)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iput p1, p0, Lk5/b;->i:I

    .line 29
    .line 30
    iget p1, v0, La5/a;->h:I

    .line 31
    .line 32
    iput p1, p0, Lk5/b;->j:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a()Lk5/a;
    .locals 7

    .line 1
    iget-object v0, p0, Lk5/b;->g:Lk5/u;

    .line 2
    .line 3
    iget-object v3, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 4
    .line 5
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v0, La5/a;

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    iget v2, p0, Lk5/b;->j:I

    .line 12
    .line 13
    invoke-direct {v0, v2, v1, v3}, La5/a;-><init>(IILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, La5/a;->o(Z)I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    new-instance v1, Lk5/a;

    .line 22
    .line 23
    iget v4, v0, La5/a;->h:I

    .line 24
    .line 25
    const/4 v6, 0x0

    .line 26
    move-object v2, p0

    .line 27
    invoke-direct/range {v1 .. v6}, Lk5/a;-><init>(Ljava/lang/Comparable;Landroidx/lifecycle/x;III)V

    .line 28
    .line 29
    .line 30
    return-object v1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1
    check-cast p1, Lk5/b;

    .line 2
    .line 3
    iget v0, p1, Lk5/b;->h:I

    .line 4
    .line 5
    iget v1, p0, Lk5/b;->h:I

    .line 6
    .line 7
    invoke-static {v1, v0}, Ljava/lang/Integer;->compare(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lk5/b;->getType()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p1}, Lk5/b;->getType()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    return v0

    .line 29
    :cond_1
    invoke-virtual {p0}, Lk5/b;->a()Lk5/a;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1}, Lk5/b;->a()Lk5/a;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {v0, p1}, Ld6/d;->c(Ljava/util/Set;Ljava/util/Set;)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lk5/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lk5/b;

    .line 6
    .line 7
    iget v0, p1, Lk5/b;->h:I

    .line 8
    .line 9
    iget v1, p0, Lk5/b;->h:I

    .line 10
    .line 11
    if-ne v1, v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lk5/b;->getType()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1}, Lk5/b;->getType()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Lk5/b;->a()Lk5/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1}, Lk5/b;->a()Lk5/a;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, p1}, Ljava/util/AbstractSet;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    return p1

    .line 43
    :cond_0
    const/4 p1, 0x0

    .line 44
    return p1
.end method

.method public final getType()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lk5/b;->g:Lk5/u;

    .line 2
    .line 3
    iget-object v0, v0, Lk5/u;->s:Lk5/s;

    .line 4
    .line 5
    iget v1, p0, Lk5/b;->i:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lk5/s;->b(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lk5/b;->h:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    invoke-virtual {p0}, Lk5/b;->getType()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v1, v0

    .line 14
    mul-int/lit8 v1, v1, 0x1f

    .line 15
    .line 16
    invoke-virtual {p0}, Lk5/b;->a()Lk5/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/util/AbstractSet;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    return v0
.end method
