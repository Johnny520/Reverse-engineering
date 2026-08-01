.class public final Lfm0;
.super Lfw0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# virtual methods
.method public final ζ(J)Lch1;
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, Lch1;->х(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lfw0;->σ:Lq31;

    .line 5
    .line 6
    iget-object v1, v0, Lq31;->σ:Lyp0;

    .line 7
    .line 8
    invoke-virtual {v1}, Lyp0;->ψ()Lk21;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, v1, Lk21;->ε:[Ljava/lang/Object;

    .line 13
    .line 14
    iget v1, v1, Lk21;->η:I

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_0
    if-ge v3, v1, :cond_0

    .line 18
    .line 19
    aget-object v4, v2, v3

    .line 20
    .line 21
    check-cast v4, Lyp0;

    .line 22
    .line 23
    iget-object v4, v4, Lyp0;->Λ:Lbq0;

    .line 24
    .line 25
    iget-object v4, v4, Lbq0;->ρ:Ljw0;

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    sget-object v5, Lwp0;->η:Lwp0;

    .line 31
    .line 32
    iput-object v5, v4, Ljw0;->ξ:Lwp0;

    .line 33
    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v0, v0, Lq31;->σ:Lyp0;

    .line 38
    .line 39
    iget-object v1, v0, Lyp0;->Β:Lpx0;

    .line 40
    .line 41
    invoke-virtual {v0}, Lyp0;->λ()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v1, p0, v0, p1, p2}, Lpx0;->ε(Lrx0;Ljava/util/List;J)Lqx0;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p0, p1}, Lfw0;->К(Lfw0;Lqx0;)V

    .line 50
    .line 51
    .line 52
    return-object p0
.end method

.method public final Л()V
    .locals 0

    .line 1
    iget-object p0, p0, Lfw0;->σ:Lq31;

    .line 2
    .line 3
    iget-object p0, p0, Lq31;->σ:Lyp0;

    .line 4
    .line 5
    iget-object p0, p0, Lyp0;->Λ:Lbq0;

    .line 6
    .line 7
    iget-object p0, p0, Lbq0;->ρ:Ljw0;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljw0;->э()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final ч(Lre0;)I
    .locals 6

    .line 1
    iget-object v0, p0, Lfw0;->σ:Lq31;

    .line 2
    .line 3
    iget-object v0, v0, Lq31;->σ:Lyp0;

    .line 4
    .line 5
    iget-object v0, v0, Lyp0;->Λ:Lbq0;

    .line 6
    .line 7
    iget-object v0, v0, Lbq0;->ρ:Ljw0;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Ljw0;->κ:Lbq0;

    .line 13
    .line 14
    iget-object v2, v1, Lbq0;->δ:Lup0;

    .line 15
    .line 16
    iget-object v3, v0, Ljw0;->φ:Lzp0;

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    sget-object v5, Lup0;->ζ:Lup0;

    .line 20
    .line 21
    if-ne v2, v5, :cond_0

    .line 22
    .line 23
    iput-boolean v4, v3, Lzp0;->δ:Z

    .line 24
    .line 25
    iget-boolean v2, v3, Lzp0;->β:Z

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    iput-boolean v4, v1, Lbq0;->ζ:Z

    .line 30
    .line 31
    iput-boolean v4, v1, Lbq0;->η:Z

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iput-boolean v4, v3, Lzp0;->ε:Z

    .line 35
    .line 36
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljw0;->Ζ()Lgm0;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v1, v1, Lgm0;->Ψ:Lfm0;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    iput-boolean v4, v1, Ldw0;->ξ:Z

    .line 45
    .line 46
    :cond_2
    invoke-virtual {v0}, Ljw0;->Υ()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljw0;->Ζ()Lgm0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v0, v0, Lgm0;->Ψ:Lfm0;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    iput-boolean v1, v0, Ldw0;->ξ:Z

    .line 59
    .line 60
    :cond_3
    iget-object v0, v3, Lzp0;->η:Ljava/util/HashMap;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ljava/lang/Integer;

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    goto :goto_1

    .line 75
    :cond_4
    const/high16 v0, -0x80000000

    .line 76
    .line 77
    :goto_1
    iget-object p0, p0, Lfw0;->ψ:Lu11;

    .line 78
    .line 79
    invoke-virtual {p0, v0, p1}, Lu11;->ζ(ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return v0
.end method
