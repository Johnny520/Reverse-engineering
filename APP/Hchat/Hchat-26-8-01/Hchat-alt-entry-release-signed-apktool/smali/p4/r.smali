.class public final Lp4/r;
.super Lp4/l;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final f:[Lv4/a;

.field public final g:[I

.field public h:I


# direct methods
.method public constructor <init>(Lp4/j;Lu4/t;Lu4/p;[Lv4/a;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lp4/l;-><init>(Lp4/j;Lu4/t;Lu4/p;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lp4/r;->f:[Lv4/a;

    .line 5
    .line 6
    array-length p1, p4

    .line 7
    new-array p1, p1, [I

    .line 8
    .line 9
    iput-object p1, p0, Lp4/r;->g:[I

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    :goto_0
    iget-object p2, p0, Lp4/r;->g:[I

    .line 13
    .line 14
    array-length p3, p2

    .line 15
    const/4 v0, -0x1

    .line 16
    if-ge p1, p3, :cond_1

    .line 17
    .line 18
    aget-object p3, p4, p1

    .line 19
    .line 20
    if-eqz p3, :cond_0

    .line 21
    .line 22
    aput v0, p2, p1

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string p1, "constants[i] == null"

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
    :cond_1
    iput v0, p0, Lp4/r;->h:I

    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>(Lp4/j;Lu4/t;Lu4/p;[Lv4/a;[II)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2, p3}, Lp4/l;-><init>(Lp4/j;Lu4/t;Lu4/p;)V

    .line 38
    iput-object p4, p0, Lp4/r;->f:[Lv4/a;

    .line 39
    iput-object p5, p0, Lp4/r;->g:[I

    .line 40
    iput p6, p0, Lp4/r;->h:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    iget-object v2, p0, Lp4/r;->f:[Lv4/a;

    .line 8
    .line 9
    array-length v3, v2

    .line 10
    if-ge v1, v3, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-lez v3, :cond_0

    .line 17
    .line 18
    const-string v3, ", "

    .line 19
    .line 20
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    :cond_0
    aget-object v2, v2, v1

    .line 24
    .line 25
    invoke-interface {v2}, Lz4/k;->a()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    iget-object v2, p0, Lp4/r;->f:[Lv4/a;

    .line 8
    .line 9
    array-length v3, v2

    .line 10
    if-ge v1, v3, :cond_3

    .line 11
    .line 12
    iget-object v3, p0, Lp4/r;->g:[I

    .line 13
    .line 14
    aget v3, v3, v1

    .line 15
    .line 16
    const/4 v4, -0x1

    .line 17
    if-eq v3, v4, :cond_2

    .line 18
    .line 19
    if-lez v1, :cond_0

    .line 20
    .line 21
    const-string v3, ", "

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    :cond_0
    aget-object v2, v2, v1

    .line 27
    .line 28
    invoke-virtual {v2}, Lv4/a;->j()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const/16 v2, 0x40

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v1}, Lp4/r;->m(I)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const/high16 v3, 0x10000

    .line 45
    .line 46
    if-ge v2, v3, :cond_1

    .line 47
    .line 48
    invoke-static {v2}, La/a;->X0(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-static {v2}, La/a;->Y0(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    const-string v0, ""

    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lp4/r;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final i(Lp4/j;)Lp4/h;
    .locals 7

    .line 1
    new-instance v0, Lp4/r;

    .line 2
    .line 3
    iget-object v5, p0, Lp4/r;->g:[I

    .line 4
    .line 5
    iget v6, p0, Lp4/r;->h:I

    .line 6
    .line 7
    iget-object v2, p0, Lp4/h;->c:Lu4/t;

    .line 8
    .line 9
    iget-object v3, p0, Lp4/h;->d:Lu4/p;

    .line 10
    .line 11
    iget-object v4, p0, Lp4/r;->f:[Lv4/a;

    .line 12
    .line 13
    move-object v1, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Lp4/r;-><init>(Lp4/j;Lu4/t;Lu4/p;[Lv4/a;[II)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final k(Lu4/p;)Lp4/h;
    .locals 7

    .line 1
    new-instance v0, Lp4/r;

    .line 2
    .line 3
    iget-object v5, p0, Lp4/r;->g:[I

    .line 4
    .line 5
    iget v6, p0, Lp4/r;->h:I

    .line 6
    .line 7
    iget-object v1, p0, Lp4/h;->b:Lp4/j;

    .line 8
    .line 9
    iget-object v2, p0, Lp4/h;->c:Lu4/t;

    .line 10
    .line 11
    iget-object v4, p0, Lp4/r;->f:[Lv4/a;

    .line 12
    .line 13
    move-object v3, p1

    .line 14
    invoke-direct/range {v0 .. v6}, Lp4/r;-><init>(Lp4/j;Lu4/t;Lu4/p;[Lv4/a;[II)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final m(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lp4/r;->g:[I

    .line 2
    .line 3
    aget v0, v0, p1

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string v1, "index not yet set for constant "

    .line 12
    .line 13
    const-string v2, " value = "

    .line 14
    .line 15
    invoke-static {p1, v1, v2}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p0, Lp4/r;->f:[Lv4/a;

    .line 20
    .line 21
    aget-object p1, v2, p1

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0
.end method
