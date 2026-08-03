.class public final Lqe/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lqe/e;


# instance fields
.field public final a:Lud/u;

.field public final b:Lpd/n;

.field public final c:Lqd/j;


# direct methods
.method public constructor <init>(Lud/u;Lpd/n;Lqd/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqe/i;->a:Lud/u;

    .line 5
    .line 6
    iput-object p2, p0, Lqe/i;->b:Lpd/n;

    .line 7
    .line 8
    iput-object p3, p0, Lqe/i;->c:Lqd/j;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lf5/g;)Lqd/j;
    .locals 2

    .line 1
    iget-object v0, p0, Lqe/i;->b:Lpd/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lud/p;->S(I)Lqd/l;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1, v0}, Lf5/g;->b(Lqd/l;)Lqd/j;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p0, p1}, Lqe/i;->c(Lqd/j;)Lqd/j;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final b()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final c(Lqd/j;)Lqd/j;
    .locals 4

    .line 1
    iget-object v0, p0, Lqe/i;->a:Lud/u;

    .line 2
    .line 3
    iget-object v1, v0, Lud/u;->h:Lfe/a;

    .line 4
    .line 5
    iget-object v2, p0, Lqe/i;->b:Lpd/n;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lfe/a;->g(Lpd/b;)Lud/m;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v1}, Lud/m;->q()Lod/d;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v1, v1, Lod/d;->j:Lod/a;

    .line 18
    .line 19
    iget-object v1, v1, Lod/a;->g:Lqd/j;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, p1

    .line 23
    :goto_0
    iget-object v0, v0, Lud/u;->i:Lfe/a;

    .line 24
    .line 25
    iget-object v3, p0, Lqe/i;->c:Lqd/j;

    .line 26
    .line 27
    invoke-virtual {v0, p1, v1, v3}, Lfe/a;->l(Lqd/j;Lqd/j;Lqd/j;)Lqd/j;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    instance-of v0, p1, Lqd/i;

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    invoke-virtual {p1}, Lqd/j;->r()Lqd/j;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :goto_1
    if-eqz p1, :cond_3

    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_3
    iget-object p1, v2, Lpd/n;->p:Lod/d;

    .line 48
    .line 49
    iget-object p1, p1, Lod/d;->h:Lqd/j;

    .line 50
    .line 51
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    const-class v0, Lqe/i;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    check-cast p1, Lqe/i;

    .line 17
    .line 18
    iget-object v0, p0, Lqe/i;->b:Lpd/n;

    .line 19
    .line 20
    iget-object p1, p1, Lqe/i;->b:Lpd/n;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method public final getType()Lqd/j;
    .locals 2

    .line 1
    iget-object v0, p0, Lqe/i;->b:Lpd/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lud/p;->S(I)Lqd/l;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lqd/l;->I()Lqd/j;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, v0}, Lqe/i;->c(Lqd/j;)Lqd/j;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lqe/i;->b:Lpd/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Lqe/i;->b:Lpd/n;

    .line 2
    .line 3
    iget-object v1, v0, Lpd/n;->p:Lod/d;

    .line 4
    .line 5
    iget-object v1, v1, Lod/d;->k:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lqe/i;->c:Lqd/j;

    .line 8
    .line 9
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Lqe/i;->getType()Lqd/j;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-virtual {v0, v4}, Lud/p;->S(I)Lqd/l;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v4, ", returnType="

    .line 31
    .line 32
    const-string v5, ", currentType="

    .line 33
    .line 34
    const-string v6, "InvokeAssign{"

    .line 35
    .line 36
    invoke-static {v6, v1, v4, v2, v5}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-string v2, ", instanceArg="

    .line 41
    .line 42
    const-string v4, "}"

    .line 43
    .line 44
    invoke-static {v1, v3, v2, v0, v4}, Lj8/b;->k(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0
.end method
