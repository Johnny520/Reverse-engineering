.class public final Lqe/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lqe/e;


# instance fields
.field public final a:Lud/u;

.field public final b:Lpd/j;

.field public final c:Lod/c;

.field public final d:Lqd/j;


# direct methods
.method public constructor <init>(Lud/u;Lpd/j;Lqd/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqe/h;->a:Lud/u;

    .line 5
    .line 6
    iput-object p2, p0, Lqe/h;->b:Lpd/j;

    .line 7
    .line 8
    iget-object p1, p2, Lpd/j;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lod/c;

    .line 11
    .line 12
    iput-object p1, p0, Lqe/h;->c:Lod/c;

    .line 13
    .line 14
    iput-object p3, p0, Lqe/h;->d:Lqd/j;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Lf5/g;)Lqd/j;
    .locals 2

    .line 1
    iget-object v0, p0, Lqe/h;->b:Lpd/j;

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
    iget-object v0, p0, Lqe/h;->a:Lud/u;

    .line 13
    .line 14
    iget-object v0, v0, Lud/u;->i:Lfe/a;

    .line 15
    .line 16
    iget-object v1, p0, Lqe/h;->d:Lqd/j;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p1, v1}, Lfe/a;->l(Lqd/j;Lqd/j;Lqd/j;)Lqd/j;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    instance-of v0, p1, Lqd/i;

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_0
    return-object v1
.end method

.method public final b()I
    .locals 1

    .line 1
    const/4 v0, 0x1

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
    const-class v0, Lqe/h;

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
    check-cast p1, Lqe/h;

    .line 17
    .line 18
    iget-object v0, p0, Lqe/h;->b:Lpd/j;

    .line 19
    .line 20
    iget-object p1, p1, Lqe/h;->b:Lpd/j;

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
    .locals 3

    .line 1
    iget-object v0, p0, Lqe/h;->b:Lpd/j;

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
    iget-object v1, p0, Lqe/h;->a:Lud/u;

    .line 13
    .line 14
    iget-object v1, v1, Lud/u;->i:Lfe/a;

    .line 15
    .line 16
    iget-object v2, p0, Lqe/h;->d:Lqd/j;

    .line 17
    .line 18
    invoke-virtual {v1, v0, v0, v2}, Lfe/a;->l(Lqd/j;Lqd/j;Lqd/j;)Lqd/j;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    instance-of v1, v0, Lqd/i;

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_0
    return-object v2
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lqe/h;->b:Lpd/j;

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
    .locals 6

    .line 1
    iget-object v0, p0, Lqe/h;->c:Lod/c;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lqe/h;->getType()Lqd/j;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, Lqe/h;->b:Lpd/j;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v2, v3}, Lud/p;->S(I)Lqd/l;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, ", type="

    .line 27
    .line 28
    const-string v4, ", instanceArg="

    .line 29
    .line 30
    const-string v5, "FieldGetAssign{"

    .line 31
    .line 32
    invoke-static {v5, v0, v3, v1, v4}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "}"

    .line 37
    .line 38
    invoke-static {v0, v2, v1}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    return-object v0
.end method
