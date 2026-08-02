.class public final Lcj0;
.super Luj;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public t:Ljava/util/List;

.field public u:Lat;


# virtual methods
.method public final D(Lmj0;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lcj0;->t:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

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
    if-eqz v3, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p1, v3}, Lmj0;->e(Ljava/lang/CharSequence;)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {v2}, Ldu;->E0(Ljava/util/ArrayList;)[I

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p1, v0}, Lmj0;->f([I)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move v0, v1

    .line 55
    :goto_1
    iget-object p0, p0, Lcj0;->u:Lat;

    .line 56
    .line 57
    if-eqz p0, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Lat;->D(Lmj0;)I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    goto :goto_2

    .line 64
    :cond_2
    move p0, v1

    .line 65
    :goto_2
    const/4 v2, 0x6

    .line 66
    invoke-virtual {p1, v2}, Lmj0;->m(I)V

    .line 67
    .line 68
    .line 69
    const/4 v2, 0x5

    .line 70
    invoke-virtual {p1, v2, p0}, Lmj0;->c(II)V

    .line 71
    .line 72
    .line 73
    const/4 p0, 0x3

    .line 74
    invoke-virtual {p1, p0, v1}, Lmj0;->c(II)V

    .line 75
    .line 76
    .line 77
    const/4 p0, 0x1

    .line 78
    invoke-virtual {p1, p0, v1}, Lmj0;->c(II)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v1, v0}, Lmj0;->c(II)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lmj0;->g()I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    invoke-virtual {p1, p0}, Lmj0;->i(I)V

    .line 89
    .line 90
    .line 91
    return p0
.end method

.method public final c0(Lin0;)V
    .locals 1

    .line 1
    new-instance v0, Lat;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcj0;->u:Lat;

    .line 10
    .line 11
    return-void
.end method
