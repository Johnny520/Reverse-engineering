.class public abstract Lti0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public a:Lri0;

.field public b:Z


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget-object v0, p0, Lti0;->a:Lri0;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    iget-boolean v1, p0, Lti0;->b:Z

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p0, v2}, Lri0;->c(Lti0;Lqi0;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, v0, Lri0;->b:Lui0;

    .line 14
    .line 15
    iget-object v0, v0, Lri0;->a:Lyk0;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v3, v1, Lui0;->h:Lti0;

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
    iget v3, v1, Lui0;->g:I

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
    iget-object v3, v1, Lui0;->f:Lvk0;

    .line 36
    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    invoke-virtual {v1, v5}, Lui0;->c(I)Lvk0;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    :cond_2
    iput-object v2, v1, Lui0;->f:Lvk0;

    .line 44
    .line 45
    iput v4, v1, Lui0;->g:I

    .line 46
    .line 47
    iput-object v2, v1, Lui0;->h:Lti0;

    .line 48
    .line 49
    if-nez v3, :cond_3

    .line 50
    .line 51
    iget-object v0, v0, Lyk0;->a:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lbl0;

    .line 54
    .line 55
    iget-object v0, v0, Lbl0;->a:Ljava/lang/Runnable;

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    iget-object v0, v3, Lvk0;->d:Lcl0;

    .line 62
    .line 63
    iget-object v3, v0, Lcl0;->d:Ly4;

    .line 64
    .line 65
    invoke-virtual {v3, v0}, Ly4;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    :goto_0
    iget-object v0, v1, Lui0;->a:Lz31;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    sget-object v1, Lvi0;->f:Lvi0;

    .line 74
    .line 75
    invoke-virtual {v0, v2, v1}, Lz31;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_4
    :goto_1
    iput-boolean v4, p0, Lti0;->b:Z

    .line 79
    .line 80
    return-void

    .line 81
    :cond_5
    const-string p0, "This input is not added to any dispatcher."

    .line 82
    .line 83
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 1
    return-void
.end method
