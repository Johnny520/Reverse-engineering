.class public final Lqd/p;
.super Lqd/l;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lqd/o;


# instance fields
.field public l:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lqd/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lmd/e;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqd/p;->l:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lqd/l;->i:Lqd/j;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final H()Lqd/l;
    .locals 3

    .line 1
    new-instance v0, Lqd/p;

    .line 2
    .line 3
    iget-object v1, p0, Lqd/p;->l:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lqd/l;->i:Lqd/j;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lqd/p;-><init>(Ljava/lang/String;Lqd/j;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lmd/e;->B(Lmd/e;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lqd/l;->j:Lud/p;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lqd/l;->V(Lud/p;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final X()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/p;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Lqd/p;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    iget-object v0, p0, Lqd/p;->l:Ljava/lang/String;

    .line 12
    .line 13
    check-cast p1, Lqd/p;

    .line 14
    .line 15
    iget-object p1, p1, Lqd/p;->l:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/p;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lqd/p;->l:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final p(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqd/p;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lqd/p;->l:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lqd/l;->i:Lqd/j;

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, " "

    .line 10
    .line 11
    const-string v3, ")"

    .line 12
    .line 13
    const-string v4, "("

    .line 14
    .line 15
    invoke-static {v4, v0, v2, v1, v3}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method
