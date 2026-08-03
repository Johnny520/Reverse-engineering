.class public abstract Lmd/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lmd/i;


# static fields
.field public static final h:Lmd/g;


# instance fields
.field public g:Lmd/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lmd/g;->d:Lmd/g;

    .line 2
    .line 3
    sput-object v0, Lmd/e;->h:Lmd/g;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lmd/e;->h:Lmd/g;

    .line 5
    .line 6
    iput-object v0, p0, Lmd/e;->g:Lmd/f;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final A(Lnd/r;Lmd/b;)V
    .locals 0

    .line 1
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lmd/e;->y(Loc/b;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final B(Lmd/e;)V
    .locals 3

    .line 1
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 2
    .line 3
    invoke-virtual {p1}, Lmd/f;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lmd/e;->C()Lmd/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, v0, Lmd/f;->a:Ljava/util/EnumSet;

    .line 14
    .line 15
    iget-object v2, p1, Lmd/f;->a:Ljava/util/EnumSet;

    .line 16
    .line 17
    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 18
    .line 19
    .line 20
    iget-object v1, p1, Lmd/f;->b:Ljava/util/Map;

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    new-instance v1, Lmd/d;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    invoke-direct {v1, p1, v2}, Lmd/d;-><init>(Lmd/f;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lmd/f;->i(Ljava/util/function/Consumer;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public final C()Lmd/f;
    .locals 2

    .line 1
    iget-object v0, p0, Lmd/e;->g:Lmd/f;

    .line 2
    .line 3
    sget-object v1, Lmd/e;->h:Lmd/g;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lmd/f;

    .line 8
    .line 9
    invoke-direct {v0}, Lmd/f;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lmd/e;->g:Lmd/f;

    .line 13
    .line 14
    :cond_0
    return-object v0
.end method

.method public final D(Lmd/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmd/e;->g:Lmd/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lmd/f;->g(Lmd/a;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lmd/e;->G()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final E(Loc/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lmd/e;->g:Lmd/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lmd/f;->h(Loc/a;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lmd/e;->G()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final F()V
    .locals 3

    .line 1
    iget-object v0, p0, Lmd/e;->g:Lmd/f;

    .line 2
    .line 3
    sget-object v1, Lmd/e;->h:Lmd/g;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, v0, Lmd/f;->b:Ljava/util/Map;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    new-instance v1, Lae/e;

    .line 18
    .line 19
    const/16 v2, 0x17

    .line 20
    .line 21
    invoke-direct {v1, v2}, Lae/e;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lmd/f;->i(Ljava/util/function/Consumer;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, p0, Lmd/e;->g:Lmd/f;

    .line 28
    .line 29
    iget-object v0, v0, Lmd/f;->a:Ljava/util/EnumSet;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lmd/e;->G()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final G()V
    .locals 2

    .line 1
    iget-object v0, p0, Lmd/e;->g:Lmd/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmd/f;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lmd/e;->g:Lmd/f;

    .line 10
    .line 11
    sget-object v1, Lmd/e;->h:Lmd/g;

    .line 12
    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    iput-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final w(Lmd/a;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lmd/e;->C()Lmd/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lmd/f;->a:Ljava/util/EnumSet;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final x(Lmd/b;Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lmd/e;->C()Lmd/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lmd/c;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lmd/c;

    .line 14
    .line 15
    invoke-direct {v1, p1}, Lmd/c;-><init>(Lmd/b;)V

    .line 16
    .line 17
    .line 18
    new-instance p1, Lae/g;

    .line 19
    .line 20
    const/16 v2, 0xc

    .line 21
    .line 22
    invoke-direct {p1, v1, v2}, Lae/g;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lmd/f;->i(Ljava/util/function/Consumer;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object p1, v1, Lmd/c;->h:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final y(Loc/b;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lmd/e;->C()Lmd/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v1, Lae/g;

    .line 9
    .line 10
    const/16 v2, 0xc

    .line 11
    .line 12
    invoke-direct {v1, p1, v2}, Lae/g;-><init>(Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lmd/f;->i(Ljava/util/function/Consumer;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final z(Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Lmd/e;->C()Lmd/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v1, Lbe/m0;

    .line 16
    .line 17
    const/4 v2, 0x4

    .line 18
    invoke-direct {v1, v2, p1}, Lbe/m0;-><init>(ILjava/util/ArrayList;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lmd/f;->i(Ljava/util/function/Consumer;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
