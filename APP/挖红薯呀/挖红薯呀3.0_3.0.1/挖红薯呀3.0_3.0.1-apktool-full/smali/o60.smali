.class public final Lo60;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lv41;


# instance fields
.field public final a:Lvg0;

.field public final synthetic b:Lq60;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq60;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo60;->b:Lq60;

    .line 5
    .line 6
    iput-object p2, p0, Lo60;->c:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object p1, Lc30;->a:[I

    .line 9
    .line 10
    new-instance p1, Lvg0;

    .line 11
    .line 12
    invoke-direct {p1}, Lvg0;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lo60;->a:Lvg0;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lo60;->b:Lq60;

    .line 2
    .line 3
    iget-object p0, p0, Lo60;->c:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lq60;->c(Lq60;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final b()I
    .locals 1

    .line 1
    iget-object v0, p0, Lo60;->b:Lq60;

    .line 2
    .line 3
    iget-object v0, v0, Lq60;->m:Ljh0;

    .line 4
    .line 5
    iget-object p0, p0, Lo60;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lb60;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lb60;->n()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lph0;

    .line 20
    .line 21
    iget-object p0, p0, Lph0;->d:Lsh0;

    .line 22
    .line 23
    iget p0, p0, Lsh0;->f:I

    .line 24
    .line 25
    return p0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public final c(IJ)V
    .locals 5

    .line 1
    iget-object v0, p0, Lo60;->b:Lq60;

    .line 2
    .line 3
    iget-object v1, v0, Lq60;->m:Ljh0;

    .line 4
    .line 5
    iget-object v2, p0, Lo60;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lb60;

    .line 12
    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    invoke-virtual {v1}, Lb60;->H()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_3

    .line 20
    .line 21
    invoke-virtual {v1}, Lb60;->n()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lph0;

    .line 26
    .line 27
    iget-object v2, v2, Lph0;->d:Lsh0;

    .line 28
    .line 29
    iget v2, v2, Lsh0;->f:I

    .line 30
    .line 31
    if-ltz p1, :cond_0

    .line 32
    .line 33
    if-lt p1, v2, :cond_1

    .line 34
    .line 35
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v4, "Index ("

    .line 38
    .line 39
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v4, ") is out of bound of [0, "

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const/16 v2, 0x29

    .line 54
    .line 55
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {v2}, Lw10;->d(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    invoke-virtual {v1}, Lb60;->I()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_2

    .line 70
    .line 71
    const-string v2, "Pre-measure called on node that is not placed"

    .line 72
    .line 73
    invoke-static {v2}, Lw10;->a(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    iget-object v0, v0, Lq60;->d:Lb60;

    .line 77
    .line 78
    const/4 v2, 0x1

    .line 79
    iput-boolean v2, v0, Lb60;->t:Z

    .line 80
    .line 81
    invoke-static {v1}, Le60;->a(Lb60;)Ldn0;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v1}, Lb60;->n()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Lph0;

    .line 90
    .line 91
    invoke-virtual {v1, p1}, Lph0;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v1, Lb60;

    .line 96
    .line 97
    check-cast v2, Lw3;

    .line 98
    .line 99
    invoke-virtual {v2, v1, p2, p3}, Lw3;->t(Lb60;J)V

    .line 100
    .line 101
    .line 102
    const/4 p2, 0x0

    .line 103
    iput-boolean p2, v0, Lb60;->t:Z

    .line 104
    .line 105
    iget-object p0, p0, Lo60;->a:Lvg0;

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Lvg0;->a(I)Z

    .line 108
    .line 109
    .line 110
    :cond_3
    return-void
.end method

.method public final d(Lo;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo60;->b:Lq60;

    .line 2
    .line 3
    iget-object v0, v0, Lq60;->m:Ljh0;

    .line 4
    .line 5
    iget-object p0, p0, Lo60;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lb60;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lb60;->I:Lmj0;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    iget-object p0, p0, Lmj0;->f:Loe0;

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const-string v0, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode"

    .line 24
    .line 25
    invoke-static {p0, v0, p1}, Lr60;->E(Lrm;Ljava/lang/String;Lsw;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method
