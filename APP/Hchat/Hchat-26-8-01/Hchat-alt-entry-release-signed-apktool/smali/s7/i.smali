.class public final Ls7/i;
.super Lr7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lk7/e;


# instance fields
.field public final m:Lr7/g;


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
    iput-object p1, p0, Ls7/i;->m:Lr7/g;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final B(Lq7/b;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ls7/i;->N()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1}, Lr7/b;->B(Lq7/b;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final N()Z
    .locals 4

    .line 1
    iget-object v0, p0, Ls7/i;->m:Lr7/g;

    .line 2
    .line 3
    invoke-interface {v0}, Lr7/g;->get()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/16 v0, 0x8

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, v1

    .line 14
    :goto_0
    invoke-virtual {p0, v0, v1}, Lr7/b;->M(IZ)V

    .line 15
    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v2, p0, Lr7/b;->k:[B

    .line 20
    .line 21
    :goto_1
    if-ge v1, v0, :cond_1

    .line 22
    .line 23
    const/4 v3, -0x1

    .line 24
    aput-byte v3, v2, v1

    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/4 v0, 0x1

    .line 30
    return v0

    .line 31
    :cond_2
    return v1
.end method

.method public final c()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ls7/i;->N()Z

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    mul-int/lit8 v3, v1, 0x2

    .line 7
    .line 8
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v3

    .line 13
    :goto_0
    if-ge v4, v1, :cond_4

    .line 14
    .line 15
    aget-byte v5, v0, v4

    .line 16
    .line 17
    shr-int/lit8 v6, v5, 0x4

    .line 18
    .line 19
    and-int/lit8 v6, v6, 0xf

    .line 20
    .line 21
    const/16 v7, 0x10

    .line 22
    .line 23
    const/16 v8, 0xa

    .line 24
    .line 25
    if-ltz v6, :cond_1

    .line 26
    .line 27
    if-ge v6, v8, :cond_0

    .line 28
    .line 29
    add-int/lit8 v6, v6, 0x30

    .line 30
    .line 31
    :goto_1
    int-to-char v6, v6

    .line 32
    goto :goto_2

    .line 33
    :cond_0
    if-gt v6, v7, :cond_1

    .line 34
    .line 35
    add-int/lit8 v6, v6, 0x57

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v6, v3

    .line 39
    :goto_2
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    and-int/lit8 v5, v5, 0xf

    .line 43
    .line 44
    if-ltz v5, :cond_3

    .line 45
    .line 46
    if-ge v5, v8, :cond_2

    .line 47
    .line 48
    add-int/lit8 v5, v5, 0x30

    .line 49
    .line 50
    :goto_3
    int-to-char v5, v5

    .line 51
    goto :goto_4

    .line 52
    :cond_2
    if-gt v5, v7, :cond_3

    .line 53
    .line 54
    add-int/lit8 v5, v5, 0x57

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_3
    move v5, v3

    .line 58
    :goto_4
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    add-int/lit8 v4, v4, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_4
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0
.end method
