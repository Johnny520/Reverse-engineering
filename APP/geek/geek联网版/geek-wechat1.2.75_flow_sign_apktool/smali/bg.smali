.class public final Lbg;
.super Lo3;


# instance fields
.field public c:Z

.field public d:Z

.field public e:Ld4;


# virtual methods
.method public final j(Landroid/content/Context;)Ld4;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lbg;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lbg;->e:Ld4;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object v0, p0, Lo3;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ln40;

    .line 11
    .line 12
    iget-object v1, v0, Ln40;->c:Lol;

    .line 13
    .line 14
    iget v0, v0, Ln40;->a:I

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    const/4 v3, 0x1

    .line 18
    if-ne v0, v2, :cond_1

    .line 19
    .line 20
    move v0, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    :goto_0
    iget-boolean v2, p0, Lbg;->c:Z

    .line 24
    .line 25
    invoke-static {p1, v1, v0, v2}, Lg80;->x(Landroid/content/Context;Lol;ZZ)Ld4;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lbg;->e:Ld4;

    .line 30
    .line 31
    iput-boolean v3, p0, Lbg;->d:Z

    .line 32
    .line 33
    return-object p1
.end method
