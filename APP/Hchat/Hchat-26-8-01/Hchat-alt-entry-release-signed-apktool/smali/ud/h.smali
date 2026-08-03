.class public interface abstract Lud/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lud/j;


# virtual methods
.method public b(Lfd/i;Lfc/f;)V
    .locals 5

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Lmd/e;

    .line 3
    .line 4
    iget-object v1, v0, Lmd/e;->g:Lmd/f;

    .line 5
    .line 6
    sget-object v2, Lmd/a;->s:Lmd/a;

    .line 7
    .line 8
    invoke-virtual {v1, v2}, Lmd/f;->a(Lmd/a;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-interface {p0}, Lud/h;->g()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Lud/p;

    .line 34
    .line 35
    iget-object v4, v3, Lmd/e;->g:Lmd/f;

    .line 36
    .line 37
    invoke-virtual {v4, v2}, Lmd/f;->a(Lmd/a;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-nez v4, :cond_1

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-virtual {p1, v3, p2, v4}, Lfd/e;->j(Lud/p;Lfc/f;Lfd/d;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    sget-object p1, Lmd/b;->y:Lmd/b;

    .line 49
    .line 50
    iget-object p2, v0, Lmd/e;->g:Lmd/f;

    .line 51
    .line 52
    invoke-virtual {p2, p1}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-nez p1, :cond_3

    .line 57
    .line 58
    :goto_1
    return-void

    .line 59
    :cond_3
    invoke-static {}, Lah/a;->d()V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public abstract g()Ljava/util/List;
.end method
