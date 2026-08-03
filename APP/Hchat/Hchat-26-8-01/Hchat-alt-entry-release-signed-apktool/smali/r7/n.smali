.class public final Lr7/n;
.super Lr7/f;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final q:Lokio/a;


# instance fields
.field public o:Ljava/lang/Object;

.field public p:Lr7/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lokio/a;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lokio/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lr7/n;->q:Lokio/a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final N()Lr7/o;
    .locals 2

    .line 1
    iget-object v0, p0, Lr7/n;->p:Lr7/o;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Lk7/a;->h:Lk7/a;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-object v0

    .line 11
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final O()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lr7/n;->o:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-class v3, Ly7/b;

    .line 13
    .line 14
    if-ne v2, v3, :cond_1

    .line 15
    .line 16
    check-cast v0, Ly7/b;

    .line 17
    .line 18
    invoke-virtual {v0}, Lz7/c;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    :goto_0
    xor-int/2addr v0, v1

    .line 25
    return v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    .line 1
    check-cast p1, Lr7/n;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p1, -0x1

    .line 6
    return p1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    if-ne p1, p0, :cond_1

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_1
    invoke-virtual {p0}, Lr7/n;->N()Lr7/o;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p1}, Lr7/n;->N()Lr7/o;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 v2, 0x1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    move v3, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_2
    move v3, v0

    .line 25
    :goto_0
    if-nez p1, :cond_3

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_3
    move v2, v0

    .line 29
    :goto_1
    invoke-static {v3, v2}, Ly7/a;->d(ZZ)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_4

    .line 34
    .line 35
    return v2

    .line 36
    :cond_4
    if-eqz v1, :cond_6

    .line 37
    .line 38
    if-nez p1, :cond_5

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_5
    iget v0, v1, Lk7/a;->g:I

    .line 42
    .line 43
    iget p1, p1, Lk7/a;->g:I

    .line 44
    .line 45
    invoke-static {v0, p1}, Ly7/a;->b(II)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    return p1

    .line 50
    :cond_6
    :goto_2
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "USED-BY="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lr7/n;->o:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {v1}, Ly7/a;->j(Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x7b

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lr7/n;->N()Lr7/o;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v2, 0x0

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v3, v1, Lr7/r;->m:Ljava/lang/String;

    .line 31
    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v1, v1, Lr7/s;->q:Lr7/u;

    .line 36
    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    move-object v2, v3

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const/4 v2, 0x0

    .line 42
    invoke-virtual {v1, v3, v2}, Lr7/u;->Q(Ljava/lang/String;Z)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    :goto_0
    if-eqz v2, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    iget v1, p0, Lk7/a;->g:I

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    :goto_1
    const/16 v1, 0x3a

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget v1, p0, Lr7/f;->n:I

    .line 63
    .line 64
    const/16 v2, 0x8

    .line 65
    .line 66
    invoke-static {v1, v2}, Ly7/a;->k(II)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const/16 v1, 0x7d

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0
.end method
