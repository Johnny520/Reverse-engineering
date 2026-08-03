.class public final Lqe/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lqe/e;


# instance fields
.field public final a:Lud/u;

.field public final b:Lpd/j;


# direct methods
.method public constructor <init>(Lud/u;Lpd/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqe/f;->a:Lud/u;

    .line 5
    .line 6
    iput-object p2, p0, Lqe/f;->b:Lpd/j;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lf5/g;)Lqd/j;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lqe/f;->b:Lpd/j;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, Lud/p;->S(I)Lqd/l;

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
    iget-object v0, v1, Lpd/j;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lqd/j;

    .line 15
    .line 16
    iget-object v1, p0, Lqe/f;->a:Lud/u;

    .line 17
    .line 18
    iget-object v1, v1, Lud/u;->g:Lqe/x;

    .line 19
    .line 20
    iget-object v1, v1, Lqe/x;->c:Lqe/k;

    .line 21
    .line 22
    invoke-virtual {v1, p1, v0}, Lqe/k;->d(Lqd/j;Lqd/j;)Lqe/l;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Lqe/l;->c()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_0
    return-object v0
.end method

.method public final b()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final getType()Lqd/j;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lqe/f;->b:Lpd/j;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, Lud/p;->S(I)Lqd/l;

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
    iget-object v1, v1, Lpd/j;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lqd/j;

    .line 15
    .line 16
    iget-object v2, p0, Lqe/f;->a:Lud/u;

    .line 17
    .line 18
    iget-object v2, v2, Lud/u;->g:Lqe/x;

    .line 19
    .line 20
    iget-object v2, v2, Lqe/x;->c:Lqe/k;

    .line 21
    .line 22
    invoke-virtual {v2, v0, v1}, Lqe/k;->d(Lqd/j;Lqd/j;)Lqe/l;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Lqe/l;->c()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_0
    return-object v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lqe/f;->b:Lpd/j;

    .line 2
    .line 3
    iget-object v1, v0, Lpd/j;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v2}, Lud/p;->S(I)Lqd/l;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lqd/l;->I()Lqd/j;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v2, ") "

    .line 23
    .line 24
    const-string v3, "}"

    .line 25
    .line 26
    const-string v4, "CHECK_CAST_ASSIGN{("

    .line 27
    .line 28
    invoke-static {v4, v1, v2, v0, v3}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
.end method
