.class public final Lr7/p;
.super Lr7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lq7/a;


# instance fields
.field public final m:Lr7/f;


# direct methods
.method public constructor <init>(Lr7/f;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lr7/b;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lr7/p;->m:Lr7/f;

    .line 6
    .line 7
    iput-object p0, p1, Lk7/a;->j:Lk7/a;

    .line 8
    .line 9
    iput-object p0, p0, Lk7/a;->j:Lk7/a;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final N(I)V
    .locals 3

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    :cond_0
    mul-int/lit8 v0, p1, 0x4

    .line 5
    .line 6
    if-ltz v0, :cond_1

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    invoke-virtual {p0, v0, p1}, Lr7/b;->M(IZ)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 14
    .line 15
    const-string v1, "Huge integers size = "

    .line 16
    .line 17
    const-string v2, ", parent = "

    .line 18
    .line 19
    invoke-static {p1, v1, v2}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v1, p0, Lk7/a;->h:Lk7/a;

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0
.end method

.method public final m(Lk7/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr7/p;->m:Lr7/f;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget p1, v0, Lr7/f;->n:I

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lr7/p;->N(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "size="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lr7/b;->k:[B

    .line 9
    .line 10
    array-length v1, v1

    .line 11
    div-int/lit8 v1, v1, 0x4

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const/16 v2, 0xa

    .line 17
    .line 18
    if-le v1, v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v2, v1

    .line 22
    :goto_0
    const/4 v3, 0x0

    .line 23
    move v4, v3

    .line 24
    :goto_1
    if-ge v4, v2, :cond_4

    .line 25
    .line 26
    if-nez v4, :cond_1

    .line 27
    .line 28
    const-string v5, " ["

    .line 29
    .line 30
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_1
    const-string v5, ", "

    .line 35
    .line 36
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    :goto_2
    const v5, 0xffff

    .line 40
    .line 41
    .line 42
    and-int/2addr v5, v4

    .line 43
    if-ltz v5, :cond_3

    .line 44
    .line 45
    iget-object v6, p0, Lr7/b;->k:[B

    .line 46
    .line 47
    array-length v7, v6

    .line 48
    div-int/lit8 v7, v7, 0x4

    .line 49
    .line 50
    if-lt v5, v7, :cond_2

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_2
    mul-int/lit8 v5, v5, 0x4

    .line 54
    .line 55
    invoke-static {v6, v5}, Lk7/a;->s([BI)I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    goto :goto_4

    .line 60
    :cond_3
    :goto_3
    move v5, v3

    .line 61
    :goto_4
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    add-int/lit8 v4, v4, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_4
    if-le v1, v2, :cond_5

    .line 68
    .line 69
    const-string v3, ", +"

    .line 70
    .line 71
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    sub-int v2, v1, v2

    .line 75
    .line 76
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v2, " more"

    .line 80
    .line 81
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    :cond_5
    if-lez v1, :cond_6

    .line 85
    .line 86
    const/16 v1, 0x5d

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    :cond_6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    return-object v0
.end method
