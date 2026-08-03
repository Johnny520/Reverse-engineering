.class public final LNr;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lmx;


# instance fields
.field public final a:LB;

.field public final b:LYC;

.field public final c:LUg;


# direct methods
.method public constructor <init>(LYC;LUg;LB;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNr;->b:LYC;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p2, p0, LNr;->c:LUg;

    iput-object p3, p0, LNr;->a:LB;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;LD2;)V
    .locals 0

    iget-object p2, p0, LNr;->c:LUg;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, LEy;->o(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final b(Lvj;)I
    .locals 1

    iget-object v0, p0, LNr;->b:LYC;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lvj;->unknownFields:LXC;

    invoke-virtual {p1}, LXC;->hashCode()I

    move-result p1

    return p1
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LNr;->b:LYC;

    invoke-static {v0, p1, p2}, Lnx;->w(LYC;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, LNr;->b:LYC;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v0, p1

    check-cast v0, Lvj;

    iget-object v0, v0, Lvj;->unknownFields:LXC;

    const/4 v1, 0x0

    iput-boolean v1, v0, LXC;->e:Z

    iget-object v0, p0, LNr;->c:LUg;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, LEy;->o(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final e(Lvj;)I
    .locals 7

    iget-object v0, p0, LNr;->b:LYC;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lvj;->unknownFields:LXC;

    iget v0, p1, LXC;->d:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p1, LXC;->a:I

    if-ge v0, v2, :cond_1

    iget-object v2, p1, LXC;->b:[I

    aget v2, v2, v0

    const/4 v3, 0x3

    ushr-int/2addr v2, v3

    iget-object v4, p1, LXC;->c:[Ljava/lang/Object;

    aget-object v4, v4, v0

    check-cast v4, Ly6;

    const/4 v5, 0x1

    invoke-static {v5}, Lma;->Q(I)I

    move-result v5

    const/4 v6, 0x2

    mul-int/2addr v5, v6

    invoke-static {v6}, Lma;->Q(I)I

    move-result v6

    invoke-static {v2}, Lma;->R(I)I

    move-result v2

    add-int/2addr v2, v6

    add-int/2addr v2, v5

    invoke-static {v3, v4}, Lma;->J(ILy6;)I

    move-result v3

    add-int/2addr v3, v2

    add-int/2addr v1, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iput v1, p1, LXC;->d:I

    return v1
.end method

.method public final f(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LNr;->c:LUg;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, LEy;->o(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final g(Ljava/lang/Object;[BIILC4;)V
    .locals 0

    move-object p2, p1

    check-cast p2, Lvj;

    iget-object p3, p2, Lvj;->unknownFields:LXC;

    sget-object p4, LXC;->f:LXC;

    if-ne p3, p4, :cond_0

    invoke-static {}, LXC;->c()LXC;

    move-result-object p3

    iput-object p3, p2, Lvj;->unknownFields:LXC;

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method

.method public final h(Lvj;Lvj;)Z
    .locals 1

    iget-object v0, p0, LNr;->b:LYC;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lvj;->unknownFields:LXC;

    iget-object p2, p2, Lvj;->unknownFields:LXC;

    invoke-virtual {p1, p2}, LXC;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final i(Ljava/lang/Object;Lla;LTg;)V
    .locals 0

    iget-object p2, p0, LNr;->b:LYC;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, LYC;->a(Ljava/lang/Object;)LXC;

    iget-object p2, p0, LNr;->c:LUg;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method

.method public final j()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LNr;->a:LB;

    instance-of v1, v0, Lvj;

    if-eqz v1, :cond_0

    check-cast v0, Lvj;

    invoke-virtual {v0}, Lvj;->q()Lvj;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v0}, LB;->d()Ltj;

    move-result-object v0

    invoke-virtual {v0}, Ltj;->c()Lvj;

    move-result-object v0

    return-object v0
.end method
