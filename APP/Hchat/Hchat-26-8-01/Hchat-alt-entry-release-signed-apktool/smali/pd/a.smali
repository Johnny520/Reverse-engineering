.class public final Lpd/a;
.super Lud/p;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final synthetic p:I


# instance fields
.field public final o:I


# direct methods
.method public constructor <init>(ILqd/r;Lqd/l;Lqd/l;)V
    .locals 2

    .line 1
    sget-object v0, Lpd/k;->j:Lpd/k;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {p0, v0, v1}, Lud/p;-><init>(Lpd/k;I)V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lpd/a;->o:I

    .line 8
    .line 9
    invoke-virtual {p0, p2}, Lud/p;->d0(Lqd/r;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p3}, Lud/p;->I(Lqd/l;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p4}, Lud/p;->I(Lqd/l;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final O()Lud/p;
    .locals 5

    .line 1
    new-instance v0, Lpd/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v1}, Lud/p;->S(I)Lqd/l;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Lqd/l;->H()Lqd/l;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {p0, v2}, Lud/p;->S(I)Lqd/l;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Lqd/l;->H()Lqd/l;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget v3, p0, Lpd/a;->o:I

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-direct {v0, v3, v4, v1, v2}, Lpd/a;-><init>(ILqd/r;Lqd/l;Lqd/l;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lud/p;->P(Lud/p;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public final Y(Lud/p;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    instance-of v1, p1, Lpd/a;

    .line 6
    .line 7
    if-eqz v1, :cond_4

    .line 8
    .line 9
    invoke-super {p0, p1}, Lud/p;->Y(Lud/p;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    check-cast p1, Lpd/a;

    .line 17
    .line 18
    iget v1, p0, Lpd/a;->o:I

    .line 19
    .line 20
    iget v2, p1, Lpd/a;->o:I

    .line 21
    .line 22
    if-ne v1, v2, :cond_4

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lud/p;->S(I)Lqd/l;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p1, v0}, Lud/p;->S(I)Lqd/l;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    instance-of v2, v1, Lqd/n;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    instance-of v3, p1, Lqd/n;

    .line 41
    .line 42
    if-eq v2, v3, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    if-nez v2, :cond_3

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    check-cast v1, Lqd/n;

    .line 49
    .line 50
    iget-wide v1, v1, Lqd/n;->l:J

    .line 51
    .line 52
    check-cast p1, Lqd/n;

    .line 53
    .line 54
    iget-wide v3, p1, Lqd/n;->l:J

    .line 55
    .line 56
    cmp-long p1, v1, v3

    .line 57
    .line 58
    if-nez p1, :cond_4

    .line 59
    .line 60
    :goto_0
    return v0

    .line 61
    :cond_4
    :goto_1
    const/4 p1, 0x0

    .line 62
    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lud/p;->n:I

    .line 7
    .line 8
    invoke-static {v1}, Lxe/m;->d(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ": ARITH "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    sget-object v1, Lmd/a;->T:Lmd/a;

    .line 21
    .line 22
    iget-object v2, p0, Lmd/e;->g:Lmd/f;

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Lmd/f;->a(Lmd/a;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x1

    .line 29
    iget v3, p0, Lpd/a;->o:I

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    const/16 v5, 0x20

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {p0, v4}, Lud/p;->S(I)Lqd/l;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-static {v3}, Lp/a;->e(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, "= "

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v2}, Lud/p;->S(I)Lqd/l;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    iget-object v1, p0, Lud/p;->l:Lqd/r;

    .line 67
    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, " = "

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    :cond_1
    invoke-virtual {p0, v4}, Lud/p;->S(I)Lqd/l;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-static {v3}, Lp/a;->e(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, v2}, Lud/p;->S(I)Lqd/l;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    :goto_0
    invoke-virtual {p0, v0}, Lud/p;->K(Ljava/lang/StringBuilder;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    return-object v0
.end method
