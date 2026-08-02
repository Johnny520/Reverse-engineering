.class final Ljt;
.super Lyh1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lyh1;"
    }
.end annotation


# instance fields
.field public final a:Lbk1;

.field public final b:Z

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final e:Lxm0;


# direct methods
.method public constructor <init>(Lbk1;ZZLjava/lang/String;Lxm0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljt;->a:Lbk1;

    .line 5
    .line 6
    iput-boolean p2, p0, Ljt;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Ljt;->c:Z

    .line 9
    .line 10
    iput-object p4, p0, Ljt;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Ljt;->e:Lxm0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    if-nez p1, :cond_1

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_1
    const-class v0, Ljt;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_2
    check-cast p1, Ljt;

    .line 17
    .line 18
    iget-object v0, p0, Ljt;->a:Lbk1;

    .line 19
    .line 20
    iget-object v1, p1, Ljt;->a:Lbk1;

    .line 21
    .line 22
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-boolean v0, p0, Ljt;->b:Z

    .line 30
    .line 31
    iget-boolean v1, p1, Ljt;->b:Z

    .line 32
    .line 33
    if-eq v0, v1, :cond_4

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_4
    iget-boolean v0, p0, Ljt;->c:Z

    .line 37
    .line 38
    iget-boolean v1, p1, Ljt;->c:Z

    .line 39
    .line 40
    if-eq v0, v1, :cond_5

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_5
    iget-object v0, p0, Ljt;->d:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v1, p1, Ljt;->d:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v0, v1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_6

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_6
    iget-object p0, p0, Ljt;->e:Lxm0;

    .line 55
    .line 56
    iget-object p1, p1, Ljt;->e:Lxm0;

    .line 57
    .line 58
    if-eq p0, p1, :cond_7

    .line 59
    .line 60
    :goto_0
    const/4 p0, 0x0

    .line 61
    return p0

    .line 62
    :cond_7
    :goto_1
    const/4 p0, 0x1

    .line 63
    return p0
.end method

.method public final f()Lth1;
    .locals 6

    .line 1
    new-instance v0, Lkt;

    .line 2
    .line 3
    iget-object v4, p0, Ljt;->d:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v5, p0, Ljt;->e:Lxm0;

    .line 6
    .line 7
    iget-object v1, p0, Ljt;->a:Lbk1;

    .line 8
    .line 9
    iget-boolean v2, p0, Ljt;->b:Z

    .line 10
    .line 11
    iget-boolean v3, p0, Ljt;->c:Z

    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, Lkt;-><init>(Lbk1;ZZLjava/lang/String;Lxm0;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final g(Lth1;)V
    .locals 6

    .line 1
    check-cast p1, Lkt;

    .line 2
    .line 3
    iget-object v0, p1, Lkt;->C:Lul0;

    .line 4
    .line 5
    iget-object v1, p1, Lkt;->L:Lbk1;

    .line 6
    .line 7
    iget-object v2, p0, Ljt;->a:Lbk1;

    .line 8
    .line 9
    invoke-static {v1, v2}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, 0x0

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Lkt;->Q0()V

    .line 18
    .line 19
    .line 20
    iput-object v2, p1, Lkt;->L:Lbk1;

    .line 21
    .line 22
    iput-object v2, p1, Lkt;->x:Lbk1;

    .line 23
    .line 24
    move v1, v3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v1, v4

    .line 27
    :goto_0
    iget-boolean v2, p1, Lkt;->y:Z

    .line 28
    .line 29
    iget-boolean v5, p0, Ljt;->b:Z

    .line 30
    .line 31
    if-eq v2, v5, :cond_2

    .line 32
    .line 33
    iput-boolean v5, p1, Lkt;->y:Z

    .line 34
    .line 35
    if-eqz v5, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Lkt;->L()V

    .line 38
    .line 39
    .line 40
    :cond_1
    move v1, v3

    .line 41
    :cond_2
    iget-boolean v2, p1, Lkt;->A:Z

    .line 42
    .line 43
    iget-boolean v5, p0, Ljt;->c:Z

    .line 44
    .line 45
    if-eq v2, v5, :cond_4

    .line 46
    .line 47
    if-eqz v5, :cond_3

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Lu60;->M0(Lt60;)Lt60;

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    invoke-virtual {p1, v0}, Lu60;->N0(Lt60;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lkt;->Q0()V

    .line 57
    .line 58
    .line 59
    :goto_1
    invoke-static {p1}, Lqp0;->E(Lon2;)V

    .line 60
    .line 61
    .line 62
    iput-boolean v5, p1, Lkt;->A:Z

    .line 63
    .line 64
    :cond_4
    iget-object v2, p1, Lkt;->z:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v5, p0, Ljt;->d:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v2, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-nez v2, :cond_5

    .line 73
    .line 74
    iput-object v5, p1, Lkt;->z:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {p1}, Lqp0;->E(Lon2;)V

    .line 77
    .line 78
    .line 79
    :cond_5
    iget-object p0, p0, Ljt;->e:Lxm0;

    .line 80
    .line 81
    iput-object p0, p1, Lkt;->B:Lxm0;

    .line 82
    .line 83
    iget-boolean p0, p1, Lkt;->M:Z

    .line 84
    .line 85
    iget-object v2, p1, Lkt;->L:Lbk1;

    .line 86
    .line 87
    if-nez v2, :cond_6

    .line 88
    .line 89
    move v5, v3

    .line 90
    goto :goto_2

    .line 91
    :cond_6
    move v5, v4

    .line 92
    :goto_2
    if-eq p0, v5, :cond_8

    .line 93
    .line 94
    if-nez v2, :cond_7

    .line 95
    .line 96
    move v4, v3

    .line 97
    :cond_7
    iput-boolean v4, p1, Lkt;->M:Z

    .line 98
    .line 99
    if-nez v4, :cond_8

    .line 100
    .line 101
    iget-object p0, p1, Lkt;->F:Lt60;

    .line 102
    .line 103
    if-nez p0, :cond_8

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_8
    move v3, v1

    .line 107
    :goto_3
    if-eqz v3, :cond_b

    .line 108
    .line 109
    iget-object p0, p1, Lkt;->F:Lt60;

    .line 110
    .line 111
    if-nez p0, :cond_9

    .line 112
    .line 113
    iget-boolean v1, p1, Lkt;->M:Z

    .line 114
    .line 115
    if-nez v1, :cond_b

    .line 116
    .line 117
    :cond_9
    if-eqz p0, :cond_a

    .line 118
    .line 119
    invoke-virtual {p1, p0}, Lu60;->N0(Lt60;)V

    .line 120
    .line 121
    .line 122
    :cond_a
    const/4 p0, 0x0

    .line 123
    iput-object p0, p1, Lkt;->F:Lt60;

    .line 124
    .line 125
    invoke-virtual {p1}, Lkt;->S0()V

    .line 126
    .line 127
    .line 128
    :cond_b
    iget-object p0, p1, Lkt;->x:Lbk1;

    .line 129
    .line 130
    invoke-virtual {v0, p0}, Lul0;->Q0(Lbk1;)V

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Ljt;->a:Lbk1;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v0

    .line 12
    :goto_0
    mul-int/lit16 v1, v1, 0x3c1

    .line 13
    .line 14
    iget-boolean v2, p0, Ljt;->b:Z

    .line 15
    .line 16
    const/16 v3, 0x1f

    .line 17
    .line 18
    invoke-static {v1, v3, v2}, Lhk1;->d(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-boolean v2, p0, Ljt;->c:Z

    .line 23
    .line 24
    invoke-static {v1, v3, v2}, Lhk1;->d(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    iget-object v2, p0, Ljt;->d:Ljava/lang/String;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    :cond_1
    add-int/2addr v1, v0

    .line 37
    mul-int/lit16 v1, v1, 0x3c1

    .line 38
    .line 39
    iget-object p0, p0, Ljt;->e:Lxm0;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    add-int/2addr p0, v1

    .line 46
    return p0
.end method
