.class public abstract Lp4/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:I

.field public final b:Lp4/j;

.field public final c:Lu4/t;

.field public final d:Lu4/p;


# direct methods
.method public constructor <init>(Lp4/j;Lu4/t;Lu4/p;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_2

    .line 5
    .line 6
    if-eqz p2, :cond_1

    .line 7
    .line 8
    if-eqz p3, :cond_0

    .line 9
    .line 10
    const/4 v0, -0x1

    .line 11
    iput v0, p0, Lp4/h;->a:I

    .line 12
    .line 13
    iput-object p1, p0, Lp4/h;->b:Lp4/j;

    .line 14
    .line 15
    iput-object p2, p0, Lp4/h;->c:Lu4/t;

    .line 16
    .line 17
    iput-object p3, p0, Lp4/h;->d:Lu4/p;

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p1, "registers == null"

    .line 21
    .line 22
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    throw p1

    .line 27
    :cond_1
    const-string p1, "position == null"

    .line 28
    .line 29
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    throw p1

    .line 34
    :cond_2
    const-string p1, "opcode == null"

    .line 35
    .line 36
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    throw p1
.end method

.method public static h(Lu4/t;Lu4/o;Lu4/o;)Lp4/z;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lu4/o;->j()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    iget-object v0, p1, Lu4/o;->h:Lw4/d;

    .line 11
    .line 12
    invoke-interface {v0}, Lw4/d;->getType()Lw4/c;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lw4/c;->t()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget v2, p1, Lu4/o;->g:I

    .line 21
    .line 22
    iget v3, p2, Lu4/o;->g:I

    .line 23
    .line 24
    or-int/2addr v3, v2

    .line 25
    const/16 v4, 0x10

    .line 26
    .line 27
    if-ge v3, v4, :cond_3

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    sget-object v0, Lp4/k;->j:Lp4/j;

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    if-eqz v1, :cond_2

    .line 35
    .line 36
    sget-object v0, Lp4/k;->d:Lp4/j;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    sget-object v0, Lp4/k;->g:Lp4/j;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_3
    const/16 v3, 0x100

    .line 43
    .line 44
    if-ge v2, v3, :cond_6

    .line 45
    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    sget-object v0, Lp4/k;->k:Lp4/j;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_4
    if-eqz v1, :cond_5

    .line 52
    .line 53
    sget-object v0, Lp4/k;->e:Lp4/j;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_5
    sget-object v0, Lp4/k;->h:Lp4/j;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_6
    if-eqz v0, :cond_7

    .line 60
    .line 61
    sget-object v0, Lp4/k;->l:Lp4/j;

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_7
    if-eqz v1, :cond_8

    .line 65
    .line 66
    sget-object v0, Lp4/k;->f:Lp4/j;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_8
    sget-object v0, Lp4/k;->i:Lp4/j;

    .line 70
    .line 71
    :goto_1
    new-instance v1, Lp4/z;

    .line 72
    .line 73
    invoke-static {p1, p2}, Lu4/p;->q(Lu4/o;Lu4/o;)Lu4/p;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {v1, v0, p0, p1}, Lp4/l;-><init>(Lp4/j;Lu4/t;Lu4/p;)V

    .line 78
    .line 79
    .line 80
    return-object v1
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public abstract b()I
.end method

.method public c()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Not supported."

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public d()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Not supported."

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final e()I
    .locals 1

    .line 1
    iget v0, p0, Lp4/h;->a:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    const-string v0, "address not yet known"

    .line 7
    .line 8
    invoke-static {v0}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lp4/h;->a:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "%04x"

    .line 15
    .line 16
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0

    .line 21
    :cond_0
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {v0}, La/a;->Y0(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public abstract i(Lp4/j;)Lp4/h;
.end method

.method public abstract j(I)Lp4/h;
.end method

.method public abstract k(Lu4/p;)Lp4/h;
.end method

.method public abstract l(Lz4/d;)V
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lp4/h;->f()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x20

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, Lp4/h;->c:Lu4/t;

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, ": "

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lp4/h;->b:Lp4/j;

    .line 31
    .line 32
    invoke-virtual {v2}, Lp4/j;->a()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v2, p0, Lp4/h;->d:Lu4/p;

    .line 40
    .line 41
    iget-object v3, v2, Lz4/e;->h:[Ljava/lang/Object;

    .line 42
    .line 43
    array-length v3, v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    const-string v3, " "

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    const/4 v5, 0x1

    .line 50
    invoke-virtual {v2, v3, v4, v5}, Lz4/e;->n(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    const/4 v5, 0x0

    .line 59
    :goto_0
    invoke-virtual {p0}, Lp4/h;->a()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    if-eqz v5, :cond_1

    .line 66
    .line 67
    const/16 v3, 0x2c

    .line 68
    .line 69
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0
.end method
