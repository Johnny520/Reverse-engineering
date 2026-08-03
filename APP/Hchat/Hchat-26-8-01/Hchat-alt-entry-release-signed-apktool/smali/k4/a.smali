.class public final Lk4/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lk4/b;IILk4/d;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    if-eqz p4, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, Lk4/b;->b:Lg8/b;

    .line 9
    .line 10
    invoke-virtual {v0, p3}, Lg8/b;->g(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput-object p1, p0, Lk4/a;->d:Ljava/lang/Object;

    .line 15
    .line 16
    iput p2, p0, Lk4/a;->a:I

    .line 17
    .line 18
    iput p3, p0, Lk4/a;->b:I

    .line 19
    .line 20
    iput-object p4, p0, Lk4/a;->e:Ljava/lang/Object;

    .line 21
    .line 22
    new-instance p1, Lh4/u;

    .line 23
    .line 24
    invoke-direct {p1, v0}, Lz4/e;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lk4/a;->f:Ljava/lang/Object;

    .line 28
    .line 29
    const/4 p1, -0x1

    .line 30
    iput p1, p0, Lk4/a;->c:I

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    const-string p1, "attributeFactory == null"

    .line 34
    .line 35
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    throw p1

    .line 40
    :cond_1
    const-string p1, "cf == null"

    .line 41
    .line 42
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    throw p1
.end method

.method public constructor <init>(Ll3/t;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 48
    iput v0, p0, Lk4/a;->a:I

    .line 49
    iput-object p1, p0, Lk4/a;->d:Ljava/lang/Object;

    .line 50
    iput-object p1, p0, Lk4/a;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 9

    .line 1
    iget v0, p0, Lk4/a;->c:I

    .line 2
    .line 3
    if-gez v0, :cond_1

    .line 4
    .line 5
    const-string v0, "]"

    .line 6
    .line 7
    const-string v1, "...while parsing attributes["

    .line 8
    .line 9
    iget-object v2, p0, Lk4/a;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lh4/u;

    .line 12
    .line 13
    iget-object v3, v2, Lz4/e;->h:[Ljava/lang/Object;

    .line 14
    .line 15
    array-length v3, v3

    .line 16
    iget v4, p0, Lk4/a;->b:I

    .line 17
    .line 18
    add-int/lit8 v4, v4, 0x2

    .line 19
    .line 20
    iget-object v5, p0, Lk4/a;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v5, Lk4/b;

    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    :goto_0
    if-ge v6, v3, :cond_0

    .line 29
    .line 30
    :try_start_0
    iget-object v7, p0, Lk4/a;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v7, Lk4/d;

    .line 33
    .line 34
    iget v8, p0, Lk4/a;->a:I

    .line 35
    .line 36
    invoke-virtual {v7, v5, v8, v4}, Lk4/d;->a(Lk4/b;II)Lh4/s;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    invoke-virtual {v7}, Lh4/s;->a()I

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    add-int/2addr v4, v8

    .line 45
    invoke-virtual {v2, v6, v7}, Lz4/e;->m(ILjava/lang/Object;)V
    :try_end_0
    .catch Ll4/c; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    add-int/lit8 v6, v6, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catch_0
    move-exception v2

    .line 52
    goto :goto_1

    .line 53
    :catch_1
    move-exception v2

    .line 54
    goto :goto_2

    .line 55
    :goto_1
    new-instance v3, Ll4/c;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-direct {v3, v4, v2}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 59
    .line 60
    .line 61
    new-instance v2, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v3, v0}, Lf4/a;->a(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v3

    .line 80
    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v2, v0}, Lf4/a;->a(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw v2

    .line 99
    :cond_0
    iput v4, p0, Lk4/a;->c:I

    .line 100
    .line 101
    :cond_1
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lk4/a;->a:I

    .line 3
    .line 4
    iget-object v0, p0, Lk4/a;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ll3/t;

    .line 7
    .line 8
    iput-object v0, p0, Lk4/a;->e:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput v0, p0, Lk4/a;->c:I

    .line 12
    .line 13
    return-void
.end method

.method public c()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lk4/a;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ll3/t;

    .line 4
    .line 5
    iget-object v0, v0, Ll3/t;->b:Ll3/u;

    .line 6
    .line 7
    invoke-virtual {v0}, Ll3/u;->b()Lm3/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x6

    .line 12
    invoke-virtual {v0, v1}, Lm3/c;->a(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v3, v0, Lm3/c;->j:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    iget v0, v0, Lm3/c;->g:I

    .line 24
    .line 25
    add-int/2addr v1, v0

    .line 26
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    return v2

    .line 33
    :cond_0
    iget v0, p0, Lk4/a;->b:I

    .line 34
    .line 35
    const v1, 0xfe0f

    .line 36
    .line 37
    .line 38
    if-ne v0, v1, :cond_1

    .line 39
    .line 40
    return v2

    .line 41
    :cond_1
    const/4 v0, 0x0

    .line 42
    return v0
.end method
