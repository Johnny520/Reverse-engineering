.class public final Ll7/m;
.super Ll7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/lang/Comparable;


# instance fields
.field public final o:Ls7/b;

.field public p:Lr7/y;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Lp7/k;

    .line 2
    .line 3
    invoke-direct {v0}, Lp7/k;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {p0, v0, v1}, Ll7/a;-><init>(Lp7/a;I)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ls7/c;

    .line 11
    .line 12
    iget-object v2, v0, Lp7/k;->t:Lr7/f;

    .line 13
    .line 14
    invoke-direct {v1, v2}, Lo7/c;-><init>(Lr7/f;)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Ls7/b;

    .line 18
    .line 19
    invoke-direct {v2, v0, v1}, Ls7/b;-><init>(Lp7/k;Ls7/c;)V

    .line 20
    .line 21
    .line 22
    iput-object v2, p0, Ll7/m;->o:Ls7/b;

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lo7/d;->P(Lk7/a;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v2}, Lo7/d;->P(Lk7/a;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static W(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v1, 0x2a

    .line 13
    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    const/16 v1, 0x2b

    .line 17
    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    const/16 v1, 0x5e

    .line 21
    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const/4 v0, 0x1

    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    :goto_1
    return-object p0
.end method


# virtual methods
.method public final M()V
    .locals 1

    .line 1
    iget-object v0, p0, Ll7/a;->m:Lp7/a;

    .line 2
    .line 3
    check-cast v0, Lp7/k;

    .line 4
    .line 5
    iget-object v0, v0, Lp7/k;->v:Lv7/y;

    .line 6
    .line 7
    invoke-virtual {v0}, Lk7/c;->c()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final S()V
    .locals 0

    .line 1
    return-void
.end method

.method public final U(Ll7/m;)I
    .locals 6

    .line 1
    iget-object v0, p0, Ll7/a;->m:Lp7/a;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lp7/k;

    .line 5
    .line 6
    iget-object v1, v1, Lp7/k;->r:Lr7/c;

    .line 7
    .line 8
    invoke-virtual {v1}, Lr7/c;->get()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iget-object v2, p1, Ll7/a;->m:Lp7/a;

    .line 13
    .line 14
    iget-object p1, p1, Ll7/a;->m:Lp7/a;

    .line 15
    .line 16
    check-cast v2, Lp7/k;

    .line 17
    .line 18
    iget-object v2, v2, Lp7/k;->r:Lr7/c;

    .line 19
    .line 20
    invoke-virtual {v2}, Lr7/c;->get()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eq v1, v2, :cond_0

    .line 25
    .line 26
    invoke-static {v1, v2}, Ly7/a;->b(II)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    move-object v2, v0

    .line 37
    check-cast v2, Lp7/k;

    .line 38
    .line 39
    iget-object v2, v2, Lp7/k;->s:Lr7/c;

    .line 40
    .line 41
    invoke-virtual {v2}, Lr7/c;->get()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    and-int/lit8 v2, v2, 0x3

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    const-string v4, "0"

    .line 49
    .line 50
    const-string v5, "1"

    .line 51
    .line 52
    if-ne v2, v3, :cond_1

    .line 53
    .line 54
    move-object v2, v5

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move-object v2, v4

    .line 57
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    check-cast v0, Lp7/k;

    .line 61
    .line 62
    iget-object v0, v0, Lp7/k;->v:Lv7/y;

    .line 63
    .line 64
    invoke-virtual {v0}, Lv7/y;->T()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    new-instance v1, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    move-object v2, p1

    .line 81
    check-cast v2, Lp7/k;

    .line 82
    .line 83
    iget-object v2, v2, Lp7/k;->s:Lr7/c;

    .line 84
    .line 85
    invoke-virtual {v2}, Lr7/c;->get()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    and-int/lit8 v2, v2, 0x3

    .line 90
    .line 91
    if-ne v2, v3, :cond_2

    .line 92
    .line 93
    move-object v4, v5

    .line 94
    :cond_2
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    check-cast p1, Lp7/k;

    .line 98
    .line 99
    iget-object p1, p1, Lp7/k;->v:Lv7/y;

    .line 100
    .line 101
    invoke-virtual {p1}, Lv7/y;->T()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    return p1
.end method

.method public final V()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Ll7/m;->p:Lr7/y;

    .line 2
    .line 3
    iget-object v1, p0, Ll7/a;->m:Lp7/a;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    const-class v3, Lu7/d;

    .line 9
    .line 10
    invoke-virtual {v0, v3}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Lu7/d;

    .line 15
    .line 16
    iget v0, v0, Lk7/a;->g:I

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    iget-object v3, v3, Lu7/d;->t:Lr7/f;

    .line 23
    .line 24
    iget v3, v3, Lr7/f;->n:I

    .line 25
    .line 26
    add-int/2addr v0, v3

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    :goto_0
    move-object v3, v1

    .line 31
    check-cast v3, Lp7/k;

    .line 32
    .line 33
    iget-object v3, v3, Lp7/k;->r:Lr7/c;

    .line 34
    .line 35
    iget-object v3, v3, Lr7/b;->k:[B

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    aget-byte v3, v3, v4

    .line 39
    .line 40
    if-ne v0, v3, :cond_1

    .line 41
    .line 42
    iget-object v0, p0, Ll7/m;->p:Lr7/y;

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    iput-object v2, p0, Ll7/m;->p:Lr7/y;

    .line 46
    .line 47
    :cond_2
    const-class v0, Lo7/j;

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lo7/j;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    const-class v3, Ll7/f;

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Ll7/f;

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    move-object v0, v2

    .line 67
    :goto_1
    if-nez v0, :cond_4

    .line 68
    .line 69
    move-object v0, v2

    .line 70
    goto :goto_2

    .line 71
    :cond_4
    iget-object v0, v0, Ll7/f;->o:Lu7/d;

    .line 72
    .line 73
    check-cast v1, Lp7/k;

    .line 74
    .line 75
    iget-object v1, v1, Lp7/k;->r:Lr7/c;

    .line 76
    .line 77
    invoke-virtual {v1}, Lr7/c;->get()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-virtual {v0, v1}, Lu7/d;->c0(I)Lr7/y;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, Ll7/m;->p:Lr7/y;

    .line 86
    .line 87
    :goto_2
    if-eqz v0, :cond_5

    .line 88
    .line 89
    iget-object v0, v0, Lr7/r;->m:Ljava/lang/String;

    .line 90
    .line 91
    return-object v0

    .line 92
    :cond_5
    return-object v2
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Ll7/m;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ll7/m;->U(Ll7/m;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget-object v0, p0, Ll7/m;->o:Ls7/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ls7/b;->n0(Z)Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public final r()[B
    .locals 1

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0, v0}, Lk7/a;->K(Ljava/io/ByteArrayOutputStream;)I

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    :catch_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ll7/m;->V()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x7b

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Ll7/a;->m:Lp7/a;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 v1, 0x7d

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
.end method
