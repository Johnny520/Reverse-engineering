.class public final Ll7/j;
.super Ll7/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic o:I

.field public final p:Lr7/b;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    iput p1, p0, Ll7/j;->o:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lp7/g;

    .line 7
    .line 8
    invoke-direct {p1}, Lp7/g;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-direct {p0, p1, v0}, Ll7/a;-><init>(Lp7/a;I)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lr7/p;

    .line 16
    .line 17
    iget-object p1, p1, Lp7/g;->s:Lr7/f;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Lr7/p;-><init>(Lr7/f;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Ll7/j;->p:Lr7/b;

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lo7/d;->P(Lk7/a;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    new-instance p1, Lp7/a;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-direct {p1, v0}, Lp7/a;-><init>(S)V

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    invoke-direct {p0, p1, v1}, Ll7/a;-><init>(Lp7/a;I)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Lr7/c;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-direct {v1, v0, v2}, Lr7/c;-><init>(II)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Ll7/j;->p:Lr7/b;

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Lo7/d;->P(Lk7/a;)V

    .line 47
    .line 48
    .line 49
    iput-object p0, p1, Lp7/a;->p:Ll7/j;

    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method private final U(Lp7/b;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final W()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public Q(Lp7/b;)V
    .locals 1

    .line 1
    iget v0, p0, Ll7/j;->o:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ll7/a;->Q(Lp7/b;)V

    .line 7
    .line 8
    .line 9
    :pswitch_0
    return-void

    .line 10
    nop

    .line 11
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final S()V
    .locals 2

    .line 1
    iget v0, p0, Ll7/j;->o:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, Ll7/j;->p:Lr7/b;

    .line 8
    .line 9
    check-cast v0, Lr7/p;

    .line 10
    .line 11
    iget-object v1, v0, Lr7/p;->m:Lr7/f;

    .line 12
    .line 13
    iget-object v0, v0, Lr7/b;->k:[B

    .line 14
    .line 15
    array-length v0, v0

    .line 16
    div-int/lit8 v0, v0, 0x4

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lr7/f;->k(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public V()B
    .locals 2

    .line 1
    iget-object v0, p0, Ll7/a;->m:Lp7/a;

    .line 2
    .line 3
    check-cast v0, Lp7/g;

    .line 4
    .line 5
    iget-object v0, v0, Lp7/g;->r:Lr7/c;

    .line 6
    .line 7
    iget-object v0, v0, Lr7/b;->k:[B

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    aget-byte v0, v0, v1

    .line 11
    .line 12
    return v0
.end method

.method public r()[B
    .locals 2

    .line 1
    iget v0, p0, Ll7/j;->o:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lk7/c;->r()[B

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Lx7/b;

    .line 12
    .line 13
    iget-object v1, p0, Ll7/a;->m:Lp7/a;

    .line 14
    .line 15
    iget-object v1, v1, Lp7/a;->o:Lr7/f;

    .line 16
    .line 17
    iget v1, v1, Lr7/f;->n:I

    .line 18
    .line 19
    invoke-direct {v0, v1}, Lx7/b;-><init>(I)V

    .line 20
    .line 21
    .line 22
    :try_start_0
    invoke-virtual {p0, v0}, Lk7/a;->K(Ljava/io/ByteArrayOutputStream;)I

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lx7/b;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    :catch_0
    invoke-virtual {v0}, Lx7/b;->toByteArray()[B

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Ll7/j;->o:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Ll7/a;->m:Lp7/a;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, " {Body="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Ll7/j;->p:Lr7/b;

    .line 22
    .line 23
    check-cast v1, Lr7/c;

    .line 24
    .line 25
    iget-object v1, v1, Lr7/b;->k:[B

    .line 26
    .line 27
    array-length v1, v1

    .line 28
    const-string v2, "}"

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Lj8/b;->j(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-super {p0}, Ll7/a;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-class v1, Lo7/j;

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Lo7/j;

    .line 54
    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    iget-object v1, v1, Lo7/j;->m:Lj7/e;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const/4 v1, 0x0

    .line 61
    :goto_0
    if-eqz v1, :cond_1

    .line 62
    .line 63
    const-string v2, ", typesCount="

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, v1, Lo7/b;->k:Lz7/c;

    .line 69
    .line 70
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    return-object v0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
