.class public final Lix1;
.super Lqp0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public t:Ljava/util/List;

.field public u:Lp3;


# virtual methods
.method public final D(Lmj0;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lix1;->t:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    new-instance v2, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/16 v3, 0xa

    .line 9
    .line 10
    invoke-static {v0, v3}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lhx1;

    .line 32
    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    :goto_1
    invoke-virtual {v3, p1}, Lhx1;->D(Lmj0;)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    goto :goto_2

    .line 40
    :cond_0
    new-instance v3, Lhx1;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-static {v2}, Ldu;->E0(Ljava/util/ArrayList;)[I

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p1, v0}, Lmj0;->f([I)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    goto :goto_3

    .line 63
    :cond_2
    move v0, v1

    .line 64
    :goto_3
    iget-object p0, p0, Lix1;->u:Lp3;

    .line 65
    .line 66
    if-eqz p0, :cond_3

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Lp3;->D(Lmj0;)I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    goto :goto_4

    .line 73
    :cond_3
    move p0, v1

    .line 74
    :goto_4
    const/4 v2, 0x2

    .line 75
    invoke-virtual {p1, v2}, Lmj0;->m(I)V

    .line 76
    .line 77
    .line 78
    const/4 v2, 0x1

    .line 79
    invoke-virtual {p1, v2, p0}, Lmj0;->c(II)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v1, v0}, Lmj0;->c(II)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Lmj0;->g()I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    invoke-virtual {p1, p0}, Lmj0;->i(I)V

    .line 90
    .line 91
    .line 92
    return p0
.end method
