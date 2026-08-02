.class public abstract Ljm1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public a:Lfm1;

.field public b:Z


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget-object v0, p0, Ljm1;->a:Lfm1;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    iget-boolean v1, p0, Ljm1;->b:Z

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p0, v2}, Lfm1;->d(Ljm1;Lem1;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, v0, Lfm1;->b:Lkm1;

    .line 14
    .line 15
    iget-object v0, v0, Lfm1;->a:Liz;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v3, v1, Lkm1;->h:Ljm1;

    .line 21
    .line 22
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v4, 0x0

    .line 27
    if-eqz v3, :cond_4

    .line 28
    .line 29
    iget v3, v1, Lkm1;->g:I

    .line 30
    .line 31
    const/4 v5, -0x1

    .line 32
    if-eq v5, v3, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object v3, v1, Lkm1;->f:Lhm1;

    .line 36
    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    invoke-virtual {v1, v5}, Lkm1;->c(I)Lhm1;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    :cond_2
    iput-object v2, v1, Lkm1;->f:Lhm1;

    .line 44
    .line 45
    iput v4, v1, Lkm1;->g:I

    .line 46
    .line 47
    iput-object v2, v1, Lkm1;->h:Ljm1;

    .line 48
    .line 49
    if-nez v3, :cond_3

    .line 50
    .line 51
    iget-object v0, v0, Liz;->i:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lot1;

    .line 54
    .line 55
    iget-object v0, v0, Lot1;->a:Ljava/lang/Runnable;

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-virtual {v3}, Lhm1;->b()V

    .line 62
    .line 63
    .line 64
    :goto_0
    iget-object v0, v1, Lkm1;->a:Lju2;

    .line 65
    .line 66
    sget-object v1, Llm1;->f:Llm1;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v2, v1}, Lju2;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    :cond_4
    :goto_1
    iput-boolean v4, p0, Ljm1;->b:Z

    .line 75
    .line 76
    return-void

    .line 77
    :cond_5
    const-string p0, "This input is not added to any dispatcher."

    .line 78
    .line 79
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 1
    return-void
.end method
