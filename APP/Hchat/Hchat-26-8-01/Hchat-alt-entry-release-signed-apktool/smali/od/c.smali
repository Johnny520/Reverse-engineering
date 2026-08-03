.class public final Lod/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lud/l;


# instance fields
.field public final g:Lod/a;

.field public final h:Ljava/lang/String;

.field public final i:Lqd/j;

.field public j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lod/a;Ljava/lang/String;Lqd/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lod/c;->g:Lod/a;

    .line 5
    .line 6
    iput-object p2, p0, Lod/c;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lod/c;->i:Lqd/j;

    .line 9
    .line 10
    iput-object p2, p0, Lod/c;->j:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public static a(Lud/u;Ljf/d;)Lod/c;
    .locals 3

    .line 1
    iget-object v0, p1, Ljf/d;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lod/a;->d(Lud/u;Ljava/lang/String;)Lod/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lod/c;

    .line 8
    .line 9
    iget-object v2, p1, Ljf/d;->d:Ljava/lang/String;

    .line 10
    .line 11
    iget-object p1, p1, Ljf/d;->c:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {p1}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {v1, v0, v2, p1}, Lod/c;-><init>(Lod/a;Ljava/lang/String;Lqd/j;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lud/u;->e:Lbe/k;

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lbe/k;->h(Lod/c;)Lod/c;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method


# virtual methods
.method public final b()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lod/c;->h:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lod/c;->j:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    xor-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const-class v2, Lod/c;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lod/c;

    .line 18
    .line 19
    iget-object v2, p0, Lod/c;->h:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v3, p1, Lod/c;->h:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget-object v2, p0, Lod/c;->i:Lqd/j;

    .line 30
    .line 31
    iget-object v3, p1, Lod/c;->i:Lqd/j;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    iget-object v2, p0, Lod/c;->g:Lod/a;

    .line 40
    .line 41
    iget-object p1, p1, Lod/c;->g:Lod/a;

    .line 42
    .line 43
    invoke-virtual {v2, p1}, Lod/a;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    return v0

    .line 50
    :cond_2
    :goto_0
    return v1
.end method

.method public final f()Lod/c;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lod/c;->h:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lod/c;->i:Lqd/j;

    .line 10
    .line 11
    iget v1, v1, Lqd/j;->a:I

    .line 12
    .line 13
    add-int/2addr v0, v1

    .line 14
    mul-int/lit8 v0, v0, 0x1f

    .line 15
    .line 16
    iget-object v1, p0, Lod/c;->g:Lod/a;

    .line 17
    .line 18
    iget-object v1, v1, Lod/a;->g:Lqd/j;

    .line 19
    .line 20
    iget v1, v1, Lqd/j;->a:I

    .line 21
    .line 22
    add-int/2addr v0, v1

    .line 23
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lod/c;->g:Lod/a;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lod/c;->i:Lqd/j;

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "."

    .line 14
    .line 15
    const-string v3, " "

    .line 16
    .line 17
    iget-object v4, p0, Lod/c;->h:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v0, v2, v4, v3, v1}, Lbc/e;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method
