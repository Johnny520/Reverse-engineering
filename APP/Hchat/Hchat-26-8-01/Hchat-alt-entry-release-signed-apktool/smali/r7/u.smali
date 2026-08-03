.class public final Lr7/u;
.super Lo7/e;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/lang/Iterable;


# static fields
.field public static final q:Lokio/a;


# instance fields
.field public final m:Lo7/b;

.field public final n:Lr7/f;

.field public o:Lr7/t;

.field public p:Lr7/s;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lokio/a;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lokio/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lr7/u;->q:Lokio/a;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lo7/e;-><init>(I)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lo7/b;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, v1}, Lo7/b;-><init>(Lk7/f;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lr7/u;->m:Lo7/b;

    .line 12
    .line 13
    new-instance v1, Lr7/f;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, v2}, Lr7/f;-><init>(Z)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lr7/u;->n:Lr7/f;

    .line 20
    .line 21
    invoke-virtual {p0, v2, v0}, Lo7/e;->P(ILk7/a;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-virtual {p0, v0, v1}, Lo7/e;->P(ILk7/a;)V

    .line 26
    .line 27
    .line 28
    const/4 v0, -0x1

    .line 29
    invoke-virtual {v1, v0}, Lr7/f;->k(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final B(Lq7/b;)V
    .locals 3

    .line 1
    :goto_0
    iget v0, p1, Lq7/b;->k:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    new-array v2, v1, [B

    .line 5
    .line 6
    invoke-virtual {p1, v2, v1}, Lq7/b;->e([BI)I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lq7/b;->g(I)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    aget-byte v0, v2, v0

    .line 14
    .line 15
    and-int/lit16 v0, v0, 0xff

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    aget-byte v1, v2, v1

    .line 19
    .line 20
    and-int/lit16 v1, v1, 0xff

    .line 21
    .line 22
    shl-int/lit8 v1, v1, 0x8

    .line 23
    .line 24
    or-int/2addr v0, v1

    .line 25
    const/4 v1, 0x2

    .line 26
    aget-byte v1, v2, v1

    .line 27
    .line 28
    and-int/lit16 v1, v1, 0xff

    .line 29
    .line 30
    shl-int/lit8 v1, v1, 0x10

    .line 31
    .line 32
    or-int/2addr v0, v1

    .line 33
    const/4 v1, 0x3

    .line 34
    aget-byte v1, v2, v1

    .line 35
    .line 36
    and-int/lit16 v1, v1, 0xff

    .line 37
    .line 38
    shl-int/lit8 v1, v1, 0x18

    .line 39
    .line 40
    or-int/2addr v0, v1

    .line 41
    const/4 v1, -0x1

    .line 42
    if-eq v0, v1, :cond_0

    .line 43
    .line 44
    new-instance v0, Lr7/w;

    .line 45
    .line 46
    invoke-direct {v0}, Lr7/w;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lr7/u;->m:Lo7/b;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Lo7/b;->M(Lk7/a;)Z

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p1}, Lr7/b;->B(Lq7/b;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    iget-object v0, p0, Lr7/u;->n:Lr7/f;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Lr7/b;->B(Lq7/b;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final I(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Lr7/u;->R()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final Q(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    :try_start_0
    invoke-static {p1, p0}, Landroidx/lifecycle/x;->k(Ljava/lang/String;Lr7/u;)[Landroidx/lifecycle/x;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lb8/e;

    .line 10
    .line 11
    invoke-direct {v2}, Lb8/e;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v3, Lb5/c;

    .line 15
    .line 16
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v2, v3, Lb5/c;->a:Ljava/lang/Object;

    .line 20
    .line 21
    new-instance v4, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v4, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v4, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    array-length v4, v1

    .line 37
    const/4 v5, 0x0

    .line 38
    :goto_0
    if-ge v5, v4, :cond_1

    .line 39
    .line 40
    aget-object v6, v1, v5

    .line 41
    .line 42
    invoke-virtual {v6, v3}, Landroidx/lifecycle/x;->V(Lb5/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    add-int/lit8 v5, v5, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move-object v0, v2

    .line 49
    :catch_0
    if-nez v0, :cond_2

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_2
    invoke-virtual {v0, p2}, Lb8/j;->i(Z)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1
.end method

.method public final R()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr7/u;->p:Lr7/s;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, v0, Lr7/s;->q:Lr7/u;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-ne p0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-object v1, v0, Lr7/s;->q:Lr7/u;

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lr7/u;->S(Lr7/s;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const-string v0, "Wrong style item"

    .line 20
    .line 21
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    :goto_0
    iget-object v0, p0, Lk7/a;->h:Lk7/a;

    .line 26
    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    return-void

    .line 30
    :cond_3
    invoke-virtual {p0}, Lr7/u;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_5

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lr7/w;

    .line 45
    .line 46
    iget-object v1, v1, Lr7/w;->m:Lr7/v;

    .line 47
    .line 48
    invoke-virtual {v1}, Lr7/v;->a()Lr7/s;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    if-eqz v2, :cond_4

    .line 53
    .line 54
    invoke-virtual {v2, v1}, Lr7/s;->a0(Lr7/m;)V

    .line 55
    .line 56
    .line 57
    :cond_4
    const/4 v2, -0x1

    .line 58
    invoke-virtual {v1, v2}, Lr7/l;->k(I)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_5
    iget-object v0, p0, Lr7/u;->m:Lo7/b;

    .line 63
    .line 64
    invoke-virtual {v0}, Lo7/b;->N()V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final S(Lr7/s;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr7/u;->p:Lr7/s;

    .line 2
    .line 3
    if-nez p1, :cond_2

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lr7/u;->p:Lr7/s;

    .line 7
    .line 8
    iget-object v1, p0, Lr7/u;->o:Lr7/t;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iput-object p1, p0, Lr7/u;->o:Lr7/t;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {v0, v1}, Lr7/s;->a0(Lr7/m;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_2
    if-eqz v0, :cond_4

    .line 23
    .line 24
    if-ne p1, v0, :cond_3

    .line 25
    .line 26
    :goto_0
    return-void

    .line 27
    :cond_3
    const-string p1, "Different string item"

    .line 28
    .line 29
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_4
    iput-object p1, p0, Lr7/u;->p:Lr7/s;

    .line 34
    .line 35
    new-instance v0, Lr7/t;

    .line 36
    .line 37
    invoke-direct {v0, p0}, Lr7/t;-><init>(Lr7/u;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lr7/s;->P(Lr7/m;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lr7/u;->o:Lr7/t;

    .line 44
    .line 45
    return-void
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 4

    .line 1
    check-cast p1, Lr7/u;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-ne p1, p0, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    if-nez p1, :cond_1

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    return p1

    .line 11
    :cond_1
    iget-object v1, p0, Lr7/u;->p:Lr7/s;

    .line 12
    .line 13
    iget-object p1, p1, Lr7/u;->p:Lr7/s;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-nez v1, :cond_2

    .line 17
    .line 18
    move v3, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_2
    move v3, v0

    .line 21
    :goto_0
    if-nez p1, :cond_3

    .line 22
    .line 23
    move v0, v2

    .line 24
    :cond_3
    invoke-static {v3, v0}, Ly7/a;->d(ZZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_5

    .line 29
    .line 30
    if-eqz v1, :cond_5

    .line 31
    .line 32
    if-nez p1, :cond_4

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_4
    iget v0, v1, Lk7/a;->g:I

    .line 36
    .line 37
    iget p1, p1, Lk7/a;->g:I

    .line 38
    .line 39
    invoke-static {v0, p1}, Ly7/a;->e(II)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1

    .line 44
    :cond_5
    :goto_1
    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Lr7/u;->m:Lo7/b;

    .line 2
    .line 3
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lz7/c;->b()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Spans count = "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lr7/u;->m:Lo7/b;

    .line 9
    .line 10
    iget-object v1, v1, Lo7/b;->k:Lz7/c;

    .line 11
    .line 12
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method
