.class public abstract Lv7/z;
.super Lo7/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lq7/a;


# instance fields
.field public final m:Lr7/f;

.field public final n:Lv7/a0;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lo7/e;-><init>(I)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lr7/f;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Lr7/f;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lv7/z;->m:Lr7/f;

    .line 11
    .line 12
    new-instance v1, Lv7/a0;

    .line 13
    .line 14
    add-int/lit8 p1, p1, -0x4

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p1, v2}, Lr7/c;-><init>(II)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lv7/z;->n:Lv7/a0;

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p1, v0}, Lo7/e;->P(ILk7/a;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    invoke-virtual {p0, p1, v1}, Lo7/e;->P(ILk7/a;)V

    .line 28
    .line 29
    .line 30
    iput-object p0, v0, Lk7/a;->j:Lk7/a;

    .line 31
    .line 32
    return-void
.end method

.method public static Q(ILjava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lt v0, p0, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    sub-int/2addr p0, v0

    .line 17
    const/4 p1, 0x0

    .line 18
    :goto_0
    if-ge p1, p0, :cond_1

    .line 19
    .line 20
    const/16 v0, 0x23

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    add-int/lit8 p1, p1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static R([B)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    array-length v3, p0

    .line 8
    if-ge v2, v3, :cond_2

    .line 9
    .line 10
    aget-byte v3, p0, v2

    .line 11
    .line 12
    if-eqz v3, :cond_1

    .line 13
    .line 14
    return v1

    .line 15
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    return v0
.end method

.method public static S([C)[C
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    move v4, v1

    .line 8
    move v3, v2

    .line 9
    :goto_0
    array-length v5, p0

    .line 10
    if-ge v3, v5, :cond_2

    .line 11
    .line 12
    aget-char v5, p0, v3

    .line 13
    .line 14
    if-eqz v5, :cond_1

    .line 15
    .line 16
    move v4, v3

    .line 17
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    if-ne v4, v1, :cond_3

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 24
    .line 25
    array-length v0, p0

    .line 26
    if-ne v4, v0, :cond_4

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_4
    new-array v0, v4, [C

    .line 30
    .line 31
    invoke-static {p0, v2, v0, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method


# virtual methods
.method public final M()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lk7/c;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lv7/z;->m:Lr7/f;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lr7/f;->k(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final N()V
    .locals 0

    .line 1
    return-void
.end method

.method public final m(Lk7/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv7/z;->m:Lr7/f;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget p1, v0, Lr7/f;->n:I

    .line 6
    .line 7
    add-int/lit8 p1, p1, -0x4

    .line 8
    .line 9
    iget-object v0, p0, Lv7/z;->n:Lv7/a0;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lr7/c;->Q(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
