.class public final Lh4/c;
.super Lh4/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final b:I

.field public final c:I

.field public final d:Li4/l;

.field public final e:Li4/g;

.field public final f:Lh4/u;


# direct methods
.method public constructor <init>(IILi4/l;Li4/g;Lh4/u;)V
    .locals 2

    .line 1
    const-string v0, "Code"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lh4/s;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-ltz p1, :cond_3

    .line 7
    .line 8
    if-ltz p2, :cond_2

    .line 9
    .line 10
    :try_start_0
    iget-boolean v0, p4, Lz4/j;->g:Z
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    :try_start_1
    iget-boolean v0, p5, Lz4/j;->g:Z
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iput p1, p0, Lh4/c;->b:I

    .line 20
    .line 21
    iput p2, p0, Lh4/c;->c:I

    .line 22
    .line 23
    iput-object p3, p0, Lh4/c;->d:Li4/l;

    .line 24
    .line 25
    iput-object p4, p0, Lh4/c;->e:Li4/g;

    .line 26
    .line 27
    iput-object p5, p0, Lh4/c;->f:Lh4/u;

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    :try_start_2
    new-instance p1, Le4/a;

    .line 31
    .line 32
    const-string p2, "attributes.isMutable()"

    .line 33
    .line 34
    invoke-direct {p1, p2, v1}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 35
    .line 36
    .line 37
    throw p1
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_0

    .line 38
    :catch_0
    const-string p1, "attributes == null"

    .line 39
    .line 40
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    throw p1

    .line 45
    :cond_1
    :try_start_3
    new-instance p1, Le4/a;

    .line 46
    .line 47
    const-string p2, "catches.isMutable()"

    .line 48
    .line 49
    invoke-direct {p1, p2, v1}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 50
    .line 51
    .line 52
    throw p1
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_1

    .line 53
    :catch_1
    const-string p1, "catches == null"

    .line 54
    .line 55
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    throw p1

    .line 60
    :cond_2
    const-string p1, "maxLocals < 0"

    .line 61
    .line 62
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    throw p1

    .line 67
    :cond_3
    const-string p1, "maxStack < 0"

    .line 68
    .line 69
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    throw p1
.end method


# virtual methods
.method public final a()I
    .locals 6

    .line 1
    iget-object v0, p0, Lh4/c;->d:Li4/l;

    .line 2
    .line 3
    iget-object v0, v0, Li4/l;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lg8/b;

    .line 6
    .line 7
    iget v0, v0, Lg8/b;->c:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0xe

    .line 10
    .line 11
    iget-object v1, p0, Lh4/c;->e:Li4/g;

    .line 12
    .line 13
    iget-object v1, v1, Lz4/e;->h:[Ljava/lang/Object;

    .line 14
    .line 15
    array-length v1, v1

    .line 16
    const/16 v2, 0x8

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    invoke-static {v1, v2, v3, v0}, Lp/a;->g(IIII)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v1, p0, Lh4/c;->f:Lh4/u;

    .line 24
    .line 25
    iget-object v2, v1, Lz4/e;->h:[Ljava/lang/Object;

    .line 26
    .line 27
    array-length v2, v2

    .line 28
    const/4 v4, 0x0

    .line 29
    :goto_0
    if-ge v4, v2, :cond_0

    .line 30
    .line 31
    invoke-virtual {v1, v4}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    check-cast v5, Lh4/s;

    .line 36
    .line 37
    invoke-virtual {v5}, Lh4/s;->a()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    add-int/2addr v3, v5

    .line 42
    add-int/lit8 v4, v4, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    add-int/2addr v0, v3

    .line 46
    return v0
.end method
