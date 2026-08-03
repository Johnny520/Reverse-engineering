.class public final Lqe/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lqe/e;


# instance fields
.field public final a:Lud/u;

.field public final b:Lpd/b;

.field public final c:Lqd/r;

.field public final d:Lqd/j;


# direct methods
.method public constructor <init>(Lud/u;Lpd/b;Lqd/r;Lqd/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqe/j;->a:Lud/u;

    .line 5
    .line 6
    iput-object p2, p0, Lqe/j;->b:Lpd/b;

    .line 7
    .line 8
    iput-object p3, p0, Lqe/j;->c:Lqd/r;

    .line 9
    .line 10
    iput-object p4, p0, Lqe/j;->d:Lqd/j;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Lf5/g;)Lqd/j;
    .locals 3

    .line 1
    iget-object v0, p0, Lqe/j;->b:Lpd/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lpd/b;->k0()Lqd/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Lf5/g;->b(Lqd/l;)Lqd/j;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lqe/j;->c:Lqd/r;

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Lf5/g;->b(Lqd/l;)Lqd/j;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v1, p0, Lqe/j;->a:Lud/u;

    .line 18
    .line 19
    iget-object v1, v1, Lud/u;->i:Lfe/a;

    .line 20
    .line 21
    iget-object v2, p0, Lqe/j;->d:Lqd/j;

    .line 22
    .line 23
    invoke-virtual {v1, v0, v0, v2}, Lfe/a;->l(Lqd/j;Lqd/j;Lqd/j;)Lqd/j;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    return-object p1
.end method

.method public final b()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
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
    const-class v0, Lqe/j;

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
    check-cast p1, Lqe/j;

    .line 17
    .line 18
    iget-object v0, p0, Lqe/j;->b:Lpd/b;

    .line 19
    .line 20
    iget-object p1, p1, Lqe/j;->b:Lpd/b;

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
    .locals 4

    .line 1
    iget-object v0, p0, Lqe/j;->b:Lpd/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lpd/b;->k0()Lqd/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lqd/l;->I()Lqd/j;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lqe/j;->c:Lqd/r;

    .line 12
    .line 13
    invoke-virtual {v1}, Lqd/r;->I()Lqd/j;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Lqe/j;->a:Lud/u;

    .line 18
    .line 19
    iget-object v2, v2, Lud/u;->i:Lfe/a;

    .line 20
    .line 21
    iget-object v3, p0, Lqe/j;->d:Lqd/j;

    .line 22
    .line 23
    invoke-virtual {v2, v0, v0, v3}, Lfe/a;->l(Lqd/j;Lqd/j;Lqd/j;)Lqd/j;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    return-object v1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lqe/j;->b:Lpd/b;

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
    iget-object v0, p0, Lqe/j;->b:Lpd/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lpd/b;->i0()Lod/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, Lod/d;->k:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Lqe/j;->d:Lqd/j;

    .line 10
    .line 11
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0}, Lqe/j;->getType()Lqd/j;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v0}, Lpd/b;->k0()Lqd/l;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v4, ", argType="

    .line 32
    .line 33
    const-string v5, ", currentType="

    .line 34
    .line 35
    const-string v6, "InvokeAssign{"

    .line 36
    .line 37
    invoke-static {v6, v1, v4, v2, v5}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v2, ", instanceArg="

    .line 42
    .line 43
    const-string v4, "}"

    .line 44
    .line 45
    invoke-static {v1, v3, v2, v0, v4}, Lj8/b;->k(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0
.end method
