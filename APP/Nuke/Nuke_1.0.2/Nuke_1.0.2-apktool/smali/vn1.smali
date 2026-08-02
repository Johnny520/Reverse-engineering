.class public final Lvn1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lr61;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lvn1;->a:I

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvn1;->b:Ljava/lang/Object;

    .line 74
    new-instance v0, Lun1;

    .line 75
    invoke-direct {v0}, Lth1;-><init>()V

    const/4 v1, -0x1

    .line 76
    iput v1, v0, Lth1;->k:I

    .line 77
    iput-object v0, p0, Lvn1;->c:Ljava/lang/Object;

    .line 78
    new-instance v0, Lqz0;

    invoke-direct {v0, p1}, Lqz0;-><init>(Lr61;)V

    iput-object v0, p0, Lvn1;->d:Ljava/lang/Object;

    .line 79
    iput-object v0, p0, Lvn1;->e:Ljava/lang/Object;

    .line 80
    iget-object p1, v0, Lqz0;->Y:Lqx2;

    iput-object p1, p0, Lvn1;->f:Ljava/lang/Object;

    .line 81
    iput-object p1, p0, Lvn1;->g:Ljava/lang/Object;

    .line 82
    new-instance p1, Lzk1;

    const/16 v0, 0x10

    new-array v0, v0, [Luh1;

    invoke-direct {p1, v0}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 83
    iput-object p1, p0, Lvn1;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu22;Leg2;Ldf2;Ljava/lang/String;Ld41;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lvn1;->a:I

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lvn1;->b:Ljava/lang/Object;

    .line 23
    .line 24
    iput-object p2, p0, Lvn1;->c:Ljava/lang/Object;

    .line 25
    .line 26
    iput-object p3, p0, Lvn1;->d:Ljava/lang/Object;

    .line 27
    .line 28
    iput-object p4, p0, Lvn1;->e:Ljava/lang/Object;

    .line 29
    .line 30
    iput-object p5, p0, Lvn1;->f:Ljava/lang/Object;

    .line 31
    .line 32
    iget-object p2, p3, Ldf2;->c:Lqi2;

    .line 33
    .line 34
    iget-object p1, p1, Lu22;->a:Lth2;

    .line 35
    .line 36
    invoke-interface {p2, p1}, Lqi2;->l(Lth2;)Lpi2;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    iput-object p2, p0, Lvn1;->g:Ljava/lang/Object;

    .line 41
    .line 42
    new-instance p4, Lpn1;

    .line 43
    .line 44
    iget-object p1, p1, Lth2;->k:Lri2;

    .line 45
    .line 46
    iget-object p1, p1, Lri2;->a:Lji2;

    .line 47
    .line 48
    invoke-direct {p4, p1, p2}, Lpn1;-><init>(Lji2;Lpi2;)V

    .line 49
    .line 50
    .line 51
    iput-object p4, p0, Lvn1;->h:Ljava/lang/Object;

    .line 52
    .line 53
    new-instance p1, Ljh2;

    .line 54
    .line 55
    iget-object p2, p3, Ldf2;->a:Lbf2;

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-direct {p1}, Ljh2;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lvn1;->i:Ljava/lang/Object;

    .line 64
    .line 65
    new-instance p1, Ljava/lang/Object;

    .line 66
    .line 67
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Lvn1;->j:Ljava/lang/Object;

    .line 71
    .line 72
    return-void
.end method

.method public static B(Lsh1;Lsh1;Lth1;)V
    .locals 2

    .line 1
    instance-of p0, p0, Lyh1;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    instance-of p0, p1, Lyh1;

    .line 7
    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    check-cast p1, Lyh1;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lyh1;->g(Lth1;)V

    .line 16
    .line 17
    .line 18
    iget-boolean p0, p2, Lth1;->u:Z

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-static {p2}, Lao1;->c(Lth1;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iput-boolean v0, p2, Lth1;->q:Z

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    instance-of p0, p2, Loj;

    .line 30
    .line 31
    if-eqz p0, :cond_6

    .line 32
    .line 33
    move-object p0, p2

    .line 34
    check-cast p0, Loj;

    .line 35
    .line 36
    iget-boolean v1, p0, Lth1;->u:Z

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    const-string v1, "unInitializeModifier called on unattached node"

    .line 43
    .line 44
    invoke-static {v1}, Lkz0;->b(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    iget v1, p0, Lth1;->j:I

    .line 48
    .line 49
    and-int/lit8 v1, v1, 0x8

    .line 50
    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    invoke-static {p0}, Lsp0;->f0(Lt60;)Lzv1;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Lb7;

    .line 58
    .line 59
    invoke-virtual {v1}, Lb7;->C()V

    .line 60
    .line 61
    .line 62
    :cond_3
    iput-object p1, p0, Loj;->v:Lsh1;

    .line 63
    .line 64
    invoke-static {p1}, Lao1;->d(Lsh1;)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    iput p1, p0, Lth1;->j:I

    .line 69
    .line 70
    iget-boolean p1, p0, Lth1;->u:Z

    .line 71
    .line 72
    if-eqz p1, :cond_4

    .line 73
    .line 74
    const/4 p1, 0x0

    .line 75
    invoke-virtual {p0, p1}, Loj;->M0(Z)V

    .line 76
    .line 77
    .line 78
    :cond_4
    iget-boolean p0, p2, Lth1;->u:Z

    .line 79
    .line 80
    if-eqz p0, :cond_5

    .line 81
    .line 82
    invoke-static {p2}, Lao1;->c(Lth1;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_5
    iput-boolean v0, p2, Lth1;->q:Z

    .line 87
    .line 88
    return-void

    .line 89
    :cond_6
    const-string p0, "Unknown Modifier.Node type"

    .line 90
    .line 91
    invoke-static {p0}, Lkz0;->b(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public static final a(Lvn1;Lth1;Lzn1;)V
    .locals 1

    .line 1
    iget-object p1, p1, Lth1;->l:Lth1;

    .line 2
    .line 3
    :goto_0
    if-eqz p1, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lvn1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lun1;

    .line 8
    .line 9
    if-ne p1, v0, :cond_1

    .line 10
    .line 11
    iget-object p1, p0, Lvn1;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lr61;

    .line 14
    .line 15
    invoke-virtual {p1}, Lr61;->u()Lr61;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object p1, p1, Lr61;->M:Lvn1;

    .line 22
    .line 23
    iget-object p1, p1, Lvn1;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Lqz0;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_1
    iput-object p1, p2, Lzn1;->x:Lzn1;

    .line 30
    .line 31
    iput-object p2, p0, Lvn1;->e:Ljava/lang/Object;

    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    iget v0, p1, Lth1;->j:I

    .line 35
    .line 36
    and-int/lit8 v0, v0, 0x2

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    invoke-virtual {p1, p2}, Lth1;->L0(Lzn1;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p1, Lth1;->l:Lth1;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    :goto_2
    return-void
.end method

.method public static i(Lsh1;Lth1;)Lth1;
    .locals 2

    .line 1
    instance-of v0, p0, Lyh1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lyh1;

    .line 6
    .line 7
    invoke-virtual {p0}, Lyh1;->f()Lth1;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lao1;->f(Lth1;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Lth1;->j:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Loj;

    .line 19
    .line 20
    invoke-direct {v0}, Lth1;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, Lao1;->d(Lsh1;)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iput v1, v0, Lth1;->j:I

    .line 28
    .line 29
    iput-object p0, v0, Loj;->v:Lsh1;

    .line 30
    .line 31
    new-instance p0, Ljava/util/HashSet;

    .line 32
    .line 33
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 34
    .line 35
    .line 36
    move-object p0, v0

    .line 37
    :goto_0
    iget-boolean v0, p0, Lth1;->u:Z

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    const-string v0, "A ModifierNodeElement cannot return an already attached node from create() "

    .line 42
    .line 43
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    const/4 v0, 0x1

    .line 47
    iput-boolean v0, p0, Lth1;->p:Z

    .line 48
    .line 49
    iget-object v0, p1, Lth1;->m:Lth1;

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    iput-object p0, v0, Lth1;->l:Lth1;

    .line 54
    .line 55
    iput-object v0, p0, Lth1;->m:Lth1;

    .line 56
    .line 57
    :cond_2
    iput-object p0, p1, Lth1;->m:Lth1;

    .line 58
    .line 59
    iput-object p1, p0, Lth1;->l:Lth1;

    .line 60
    .line 61
    return-object p0
.end method

.method public static j(Lth1;)Lth1;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lth1;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object v1, Lao1;->a:Lgk1;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "autoInvalidateRemovedNode called on unattached node"

    .line 10
    .line 11
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, -0x1

    .line 15
    const/4 v1, 0x2

    .line 16
    invoke-static {p0, v0, v1}, Lao1;->a(Lth1;II)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lth1;->J0()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lth1;->D0()V

    .line 23
    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lth1;->m:Lth1;

    .line 26
    .line 27
    iget-object v1, p0, Lth1;->l:Lth1;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    iput-object v1, v0, Lth1;->l:Lth1;

    .line 33
    .line 34
    iput-object v2, p0, Lth1;->m:Lth1;

    .line 35
    .line 36
    :cond_2
    if-eqz v1, :cond_3

    .line 37
    .line 38
    iput-object v0, v1, Lth1;->m:Lth1;

    .line 39
    .line 40
    iput-object v2, p0, Lth1;->l:Lth1;

    .line 41
    .line 42
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    return-object v1
.end method


# virtual methods
.method public A()V
    .locals 6

    .line 1
    iget-object v0, p0, Lvn1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr61;

    .line 4
    .line 5
    iget-object v1, p0, Lvn1;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lqz0;

    .line 8
    .line 9
    iget-object v2, p0, Lvn1;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lqx2;

    .line 12
    .line 13
    iget-object v2, v2, Lth1;->l:Lth1;

    .line 14
    .line 15
    :goto_0
    if-eqz v2, :cond_3

    .line 16
    .line 17
    invoke-static {v2}, Lsp0;->n(Lth1;)Lj61;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    if-eqz v3, :cond_2

    .line 22
    .line 23
    iget-object v4, v2, Lth1;->o:Lzn1;

    .line 24
    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    check-cast v4, Ll61;

    .line 28
    .line 29
    iget-object v5, v4, Ll61;->Y:Lj61;

    .line 30
    .line 31
    invoke-virtual {v4, v3}, Ll61;->u1(Lj61;)V

    .line 32
    .line 33
    .line 34
    if-eq v5, v2, :cond_1

    .line 35
    .line 36
    iget-object v3, v4, Lzn1;->S:Lyv1;

    .line 37
    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    check-cast v3, Lsq0;

    .line 41
    .line 42
    invoke-virtual {v3}, Lsq0;->c()V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    new-instance v4, Ll61;

    .line 47
    .line 48
    invoke-direct {v4, v0, v3}, Ll61;-><init>(Lr61;Lj61;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v4}, Lth1;->L0(Lzn1;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_1
    iput-object v4, v1, Lzn1;->x:Lzn1;

    .line 55
    .line 56
    iput-object v1, v4, Lzn1;->w:Lzn1;

    .line 57
    .line 58
    move-object v1, v4

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    invoke-virtual {v2, v1}, Lth1;->L0(Lzn1;)V

    .line 61
    .line 62
    .line 63
    :goto_2
    iget-object v2, v2, Lth1;->l:Lth1;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    invoke-virtual {v0}, Lr61;->u()Lr61;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    iget-object v0, v0, Lr61;->M:Lvn1;

    .line 73
    .line 74
    iget-object v0, v0, Lvn1;->d:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Lqz0;

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_4
    const/4 v0, 0x0

    .line 80
    :goto_3
    iput-object v0, v1, Lzn1;->x:Lzn1;

    .line 81
    .line 82
    iput-object v1, p0, Lvn1;->e:Ljava/lang/Object;

    .line 83
    .line 84
    return-void
.end method

.method public b(Lin0;Lu00;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lkd2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lkd2;

    .line 7
    .line 8
    iget v1, v0, Lkd2;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lkd2;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkd2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lkd2;-><init>(Lvn1;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Lkd2;->k:Ljava/lang/Object;

    .line 26
    .line 27
    iget p2, v0, Lkd2;->m:I

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x1

    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    if-ne p2, v2, :cond_1

    .line 34
    .line 35
    :try_start_0
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Leh2; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :catch_0
    move-exception v0

    .line 40
    move-object p0, v0

    .line 41
    move-object v6, p0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_2
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :try_start_1
    iput v2, v0, Lkd2;->m:I

    .line 53
    .line 54
    invoke-interface {p1, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0
    :try_end_1
    .catch Leh2; {:try_start_1 .. :try_end_1} :catch_0

    .line 58
    sget-object p1, Lk20;->h:Lk20;

    .line 59
    .line 60
    if-ne p0, p1, :cond_3

    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_3
    return-object p0

    .line 64
    :goto_1
    const/4 v5, 0x0

    .line 65
    const/16 v7, 0x8

    .line 66
    .line 67
    iget-object v2, v6, Leh2;->h:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v3, v6, Leh2;->i:Ljava/lang/String;

    .line 70
    .line 71
    iget-boolean v4, v6, Leh2;->j:Z

    .line 72
    .line 73
    invoke-static/range {v2 .. v7}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 74
    .line 75
    .line 76
    return-object v1
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lu00;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    iget-object v2, p0, Lvn1;->i:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v7, v2

    .line 6
    check-cast v7, Ljh2;

    .line 7
    .line 8
    iget-object v2, p0, Lvn1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v8, v2

    .line 11
    check-cast v8, Ldf2;

    .line 12
    .line 13
    instance-of v2, v0, Lld2;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    move-object v2, v0

    .line 18
    check-cast v2, Lld2;

    .line 19
    .line 20
    iget v3, v2, Lld2;->m:I

    .line 21
    .line 22
    const/high16 v4, -0x80000000

    .line 23
    .line 24
    and-int v5, v3, v4

    .line 25
    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    sub-int/2addr v3, v4

    .line 29
    iput v3, v2, Lld2;->m:I

    .line 30
    .line 31
    :goto_0
    move-object v9, v2

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    new-instance v2, Lld2;

    .line 34
    .line 35
    invoke-direct {v2, p0, v0}, Lld2;-><init>(Lvn1;Lu00;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :goto_1
    iget-object v0, v9, Lld2;->k:Ljava/lang/Object;

    .line 40
    .line 41
    iget v2, v9, Lld2;->m:I

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v10, 0x0

    .line 45
    const/4 v11, 0x1

    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    if-ne v2, v11, :cond_1

    .line 49
    .line 50
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v3

    .line 60
    :cond_2
    invoke-static {v0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lvn1;->v()V

    .line 64
    .line 65
    .line 66
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v2, v8, Ldf2;->a:Lbf2;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    const/16 v2, 0x40

    .line 76
    .line 77
    if-gt v0, v2, :cond_5

    .line 78
    .line 79
    invoke-virtual {v7, p1}, Ljh2;->b(Ljava/lang/String;)Lih2;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    new-instance v4, Ljava/util/ArrayList;

    .line 84
    .line 85
    const/16 v0, 0xa

    .line 86
    .line 87
    invoke-static {p3, v0}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_3

    .line 103
    .line 104
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    iget-object v5, v8, Ldf2;->a:Lbf2;

    .line 109
    .line 110
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-static {v3, v7, v10}, Lt11;->v(Ljava/lang/Object;Ljh2;I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    new-instance v0, Lcw0;

    .line 122
    .line 123
    const/4 v5, 0x0

    .line 124
    const/4 v6, 0x1

    .line 125
    move-object v1, p0

    .line 126
    move-object v3, p2

    .line 127
    invoke-direct/range {v0 .. v6}, Lcw0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 128
    .line 129
    .line 130
    iput v11, v9, Lld2;->m:I

    .line 131
    .line 132
    invoke-virtual {p0, v0, v9}, Lvn1;->b(Lin0;Lu00;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    sget-object v1, Lk20;->h:Lk20;

    .line 137
    .line 138
    if-ne v0, v1, :cond_4

    .line 139
    .line 140
    return-object v1

    .line 141
    :cond_4
    :goto_3
    iget-object v1, v8, Ldf2;->a:Lbf2;

    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-static {v0, v7, v10}, Lt11;->V(Ljava/lang/Object;Ljh2;I)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    return-object v0

    .line 151
    :cond_5
    const/4 v8, 0x0

    .line 152
    const/16 v9, 0x1c

    .line 153
    .line 154
    const-string v4, "INVALID_ARGUMENT"

    .line 155
    .line 156
    const-string v5, "Host calls accept at most 64 arguments."

    .line 157
    .line 158
    const/4 v6, 0x0

    .line 159
    const/4 v7, 0x0

    .line 160
    invoke-static/range {v4 .. v9}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 161
    .line 162
    .line 163
    return-object v3
.end method

.method public d(Lin0;Lu00;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lmd2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lmd2;

    .line 7
    .line 8
    iget v1, v0, Lmd2;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lmd2;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lmd2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lmd2;-><init>(Lvn1;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Lmd2;->k:Ljava/lang/Object;

    .line 26
    .line 27
    iget p2, v0, Lmd2;->m:I

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x1

    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    if-ne p2, v2, :cond_1

    .line 34
    .line 35
    :try_start_0
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Lfi2; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :catch_0
    move-exception v0

    .line 40
    move-object p0, v0

    .line 41
    move-object v6, p0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_2
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :try_start_1
    iput v2, v0, Lmd2;->m:I

    .line 53
    .line 54
    invoke-interface {p1, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0
    :try_end_1
    .catch Lfi2; {:try_start_1 .. :try_end_1} :catch_0

    .line 58
    sget-object p1, Lk20;->h:Lk20;

    .line 59
    .line 60
    if-ne p0, p1, :cond_3

    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_3
    return-object p0

    .line 64
    :goto_1
    const/4 v5, 0x0

    .line 65
    const/16 v7, 0x8

    .line 66
    .line 67
    iget-object v2, v6, Lfi2;->h:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v3, v6, Lfi2;->i:Ljava/lang/String;

    .line 70
    .line 71
    iget-boolean v4, v6, Lfi2;->j:Z

    .line 72
    .line 73
    invoke-static/range {v2 .. v7}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 74
    .line 75
    .line 76
    return-object v1
.end method

.method public e(Lin0;Lu00;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lnd2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lnd2;

    .line 7
    .line 8
    iget v1, v0, Lnd2;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lnd2;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lnd2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lnd2;-><init>(Lvn1;Lu00;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Lnd2;->k:Ljava/lang/Object;

    .line 26
    .line 27
    iget p2, v0, Lnd2;->m:I

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x1

    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    if-ne p2, v2, :cond_1

    .line 34
    .line 35
    :try_start_0
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Lzk2; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :catch_0
    move-exception v0

    .line 40
    move-object p0, v0

    .line 41
    move-object v6, p0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_2
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :try_start_1
    iput v2, v0, Lnd2;->m:I

    .line 53
    .line 54
    invoke-interface {p1, v0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0
    :try_end_1
    .catch Lzk2; {:try_start_1 .. :try_end_1} :catch_0

    .line 58
    sget-object p1, Lk20;->h:Lk20;

    .line 59
    .line 60
    if-ne p0, p1, :cond_3

    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_3
    return-object p0

    .line 64
    :goto_1
    const/4 v5, 0x0

    .line 65
    const/16 v7, 0x8

    .line 66
    .line 67
    iget-object v2, v6, Lzk2;->h:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v3, v6, Lzk2;->i:Ljava/lang/String;

    .line 70
    .line 71
    iget-boolean v4, v6, Lzk2;->j:Z

    .line 72
    .line 73
    invoke-static/range {v2 .. v7}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 74
    .line 75
    .line 76
    return-object v1
.end method

.method public f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lvn1;->j:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-object v1, p0, Lvn1;->k:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    .line 7
    monitor-exit v0

    .line 8
    iget-object p0, p0, Lvn1;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Ljh2;

    .line 11
    .line 12
    iget-object v0, p0, Ljh2;->a:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_1
    iget-object v1, p0, Ljh2;->b:Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    iput-boolean v1, p0, Ljh2;->d:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    monitor-exit v0

    .line 27
    throw p0

    .line 28
    :catchall_1
    move-exception p0

    .line 29
    monitor-exit v0

    .line 30
    throw p0
.end method

.method public g()Lcom/dokar/quickjs/binding/JsObject;
    .locals 3

    .line 1
    iget-object p0, p0, Lvn1;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ld41;

    .line 4
    .line 5
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v1}, Lxe1;->U(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljava/lang/Iterable;

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/util/Map$Entry;

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lj31;

    .line 49
    .line 50
    invoke-static {v1}, Lt11;->U(Lj31;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    new-instance p0, Lcom/dokar/quickjs/binding/JsObject;

    .line 59
    .line 60
    invoke-direct {p0, v0}, Lcom/dokar/quickjs/binding/JsObject;-><init>(Ljava/util/Map;)V

    .line 61
    .line 62
    .line 63
    return-object p0
.end method

.method public h(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 9

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lvn1;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ldf2;

    .line 8
    .line 9
    iget-object v2, v1, Ldf2;->a:Lbf2;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/16 v2, 0x40

    .line 15
    .line 16
    if-gt v0, v2, :cond_1

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/16 v2, 0xa

    .line 21
    .line 22
    invoke-static {p1, v2}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget-object v3, p0, Lvn1;->i:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, Ljh2;

    .line 46
    .line 47
    iget-object v4, v1, Ldf2;->a:Lbf2;

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-static {v2, v3, v4}, Lt11;->v(Ljava/lang/Object;Ljh2;I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    return-object v0

    .line 62
    :cond_1
    const/4 v7, 0x0

    .line 63
    const/16 v8, 0x1c

    .line 64
    .line 65
    const-string v3, "INVALID_ARGUMENT"

    .line 66
    .line 67
    const-string v4, "Host calls accept at most 64 arguments."

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    const/4 v6, 0x0

    .line 71
    invoke-static/range {v3 .. v8}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 72
    .line 73
    .line 74
    const/4 p0, 0x0

    .line 75
    return-object p0
.end method

.method public k(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lvn1;->j:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lvn1;->k:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lci2;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v1, v1, Lci2;->a:Ljava/lang/String;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    move-object v1, v2

    .line 20
    :goto_0
    invoke-static {v1, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iput-object v2, p0, Lvn1;->k:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    :cond_1
    monitor-exit v0

    .line 29
    return-void

    .line 30
    :goto_1
    monitor-exit v0

    .line 31
    throw p0
.end method

.method public l(Ljava/lang/String;Ljava/lang/String;Lu00;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lvn1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljh2;

    .line 4
    .line 5
    instance-of v1, p3, Lod2;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p3

    .line 10
    check-cast v1, Lod2;

    .line 11
    .line 12
    iget v2, v1, Lod2;->m:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, Lod2;->m:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Lod2;

    .line 25
    .line 26
    invoke-direct {v1, p0, p3}, Lod2;-><init>(Lvn1;Lu00;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p3, v1, Lod2;->k:Ljava/lang/Object;

    .line 30
    .line 31
    iget v2, v1, Lod2;->m:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object v5, p0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :cond_2
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lvn1;->v()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljh2;->b(Ljava/lang/String;)Lih2;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    new-instance v4, Lhw0;

    .line 61
    .line 62
    const/4 v9, 0x1

    .line 63
    const/4 v8, 0x0

    .line 64
    move-object v5, p0

    .line 65
    move-object v7, p2

    .line 66
    invoke-direct/range {v4 .. v9}, Lhw0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 67
    .line 68
    .line 69
    iput v3, v1, Lod2;->m:I

    .line 70
    .line 71
    invoke-virtual {v5, v4, v1}, Lvn1;->b(Lin0;Lu00;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    sget-object p0, Lk20;->h:Lk20;

    .line 76
    .line 77
    if-ne p3, p0, :cond_3

    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_3
    :goto_1
    iget-object p0, v5, Lvn1;->d:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, Ldf2;

    .line 83
    .line 84
    iget-object p0, p0, Ldf2;->a:Lbf2;

    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    const/4 p0, 0x0

    .line 90
    invoke-static {p3, v0, p0}, Lt11;->V(Ljava/lang/Object;Ljh2;I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0
.end method

.method public m(I)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lvn1;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lth1;

    .line 4
    .line 5
    iget p0, p0, Lth1;->k:I

    .line 6
    .line 7
    and-int/2addr p0, p1

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public n(Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lvn1;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lpn1;

    .line 4
    .line 5
    iget-object p0, p0, Lvn1;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lpi2;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sparse-switch v1, :sswitch_data_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :sswitch_0
    const-string p0, "network"

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_4

    .line 24
    .line 25
    iget-boolean p0, v0, Lpn1;->d:Z

    .line 26
    .line 27
    return p0

    .line 28
    :sswitch_1
    const-string v0, "filesystem.external"

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-boolean p0, p0, Lpi2;->e:Z

    .line 38
    .line 39
    return p0

    .line 40
    :sswitch_2
    const-string p0, "network.private"

    .line 41
    .line 42
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-nez p0, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-boolean p0, v0, Lpn1;->e:Z

    .line 50
    .line 51
    return p0

    .line 52
    :sswitch_3
    const-string v0, "host"

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-nez p1, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    iget-boolean p0, p0, Lpi2;->d:Z

    .line 62
    .line 63
    return p0

    .line 64
    :sswitch_4
    const-string v0, "filesystem.host"

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-nez p1, :cond_3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    iget-boolean p0, p0, Lpi2;->f:Z

    .line 74
    .line 75
    return p0

    .line 76
    :sswitch_5
    const-string v0, "host.reflect"

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_5

    .line 83
    .line 84
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 85
    return p0

    .line 86
    :cond_5
    iget-boolean p0, p0, Lpi2;->d:Z

    .line 87
    .line 88
    return p0

    .line 89
    :sswitch_data_0
    .sparse-switch
        -0x79854b89 -> :sswitch_5
        -0x447738f5 -> :sswitch_4
        0x30f5a8 -> :sswitch_3
        0x47ea81c3 -> :sswitch_2
        0x51f3cbae -> :sswitch_1
        0x6de15a2e -> :sswitch_0
    .end sparse-switch
.end method

.method public o(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lu00;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lvn1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldf2;

    .line 4
    .line 5
    instance-of v1, p4, Lpd2;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p4

    .line 10
    check-cast v1, Lpd2;

    .line 11
    .line 12
    iget v2, v1, Lpd2;->m:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, Lpd2;->m:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Lpd2;

    .line 25
    .line 26
    invoke-direct {v1, p0, p4}, Lpd2;-><init>(Lvn1;Lu00;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p4, v1, Lpd2;->k:Ljava/lang/Object;

    .line 30
    .line 31
    iget v2, v1, Lpd2;->m:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p4}, Lfg1;->T(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v4

    .line 49
    :cond_2
    invoke-static {p4}, Lfg1;->T(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Lrp0;->Q(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p1}, Lvn1;->w(Ljava/lang/String;)Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p0, p3}, Lvn1;->h(Ljava/util/List;)Ljava/util/ArrayList;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    sget-object p4, Luu0;->a:Ljava/util/Map;

    .line 64
    .line 65
    const-string p4, "method"

    .line 66
    .line 67
    invoke-static {p2, p4}, Lrp0;->R(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {p1, p2, p3, v3}, Luu0;->d(Ljava/lang/Class;Ljava/lang/String;Ljava/util/ArrayList;Z)Lru0;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-eqz p1, :cond_4

    .line 78
    .line 79
    iget-object p2, v0, Ldf2;->j:Lc20;

    .line 80
    .line 81
    new-instance p3, Lu30;

    .line 82
    .line 83
    const/4 p4, 0x3

    .line 84
    invoke-direct {p3, p1, p0, v4, p4}, Lu30;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 85
    .line 86
    .line 87
    iput v3, v1, Lpd2;->m:I

    .line 88
    .line 89
    invoke-static {p2, p3, v1}, Lp7;->R(La20;Lmn0;Lt00;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p4

    .line 93
    sget-object p1, Lk20;->h:Lk20;

    .line 94
    .line 95
    if-ne p4, p1, :cond_3

    .line 96
    .line 97
    return-object p1

    .line 98
    :cond_3
    :goto_1
    iget-object p0, p0, Lvn1;->i:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p0, Ljh2;

    .line 101
    .line 102
    iget-object p1, v0, Ldf2;->a:Lbf2;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    const/4 p1, 0x0

    .line 108
    invoke-static {p4, p0, p1}, Lt11;->V(Ljava/lang/Object;Ljh2;I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0

    .line 113
    :cond_4
    const/4 v9, 0x0

    .line 114
    const/16 v10, 0x1c

    .line 115
    .line 116
    const-string v5, "NOT_FOUND"

    .line 117
    .line 118
    const-string v6, "No matching static method named the requested name was found."

    .line 119
    .line 120
    const/4 v7, 0x0

    .line 121
    const/4 v8, 0x0

    .line 122
    invoke-static/range {v5 .. v10}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 123
    .line 124
    .line 125
    return-object v4
.end method

.method public p()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lvn1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldf2;

    .line 4
    .line 5
    invoke-virtual {p0}, Lvn1;->v()V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :try_start_0
    iget-object v2, v0, Ldf2;->i:Lnh2;

    .line 10
    .line 11
    new-instance v3, Llh2;

    .line 12
    .line 13
    iget-object v4, p0, Lvn1;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Lu22;

    .line 16
    .line 17
    iget-object v4, v4, Lu22;->a:Lth2;

    .line 18
    .line 19
    iget-object v5, v4, Lth2;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, v4, Lth2;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-direct {v3, v5, v4}, Llh2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v2, v3}, Lnh2;->d(Llh2;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2
    :try_end_0
    .catch Leh2; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    iget-object p0, p0, Lvn1;->i:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Ljh2;

    .line 35
    .line 36
    iget-object v0, v0, Ldf2;->a:Lbf2;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-static {v2, p0, v0}, Lt11;->V(Ljava/lang/Object;Ljh2;I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_0
    const/4 v6, 0x0

    .line 48
    const/16 v7, 0x1c

    .line 49
    .line 50
    const-string v2, "NOT_FOUND"

    .line 51
    .line 52
    const-string v3, "The host class loader is unavailable."

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    const/4 v5, 0x0

    .line 56
    invoke-static/range {v2 .. v7}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :catch_0
    move-exception v0

    .line 61
    move-object p0, v0

    .line 62
    move-object v6, p0

    .line 63
    const/4 v5, 0x0

    .line 64
    const/16 v7, 0x8

    .line 65
    .line 66
    iget-object v2, v6, Leh2;->h:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v3, v6, Leh2;->i:Ljava/lang/String;

    .line 69
    .line 70
    iget-boolean v4, v6, Leh2;->j:Z

    .line 71
    .line 72
    invoke-static/range {v2 .. v7}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 73
    .line 74
    .line 75
    return-object v1
.end method

.method public q(Ljava/lang/String;Ljava/util/List;Lu00;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lvn1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldf2;

    .line 4
    .line 5
    instance-of v1, p3, Lqd2;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p3

    .line 10
    check-cast v1, Lqd2;

    .line 11
    .line 12
    iget v2, v1, Lqd2;->m:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, Lqd2;->m:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Lqd2;

    .line 25
    .line 26
    invoke-direct {v1, p0, p3}, Lqd2;-><init>(Lvn1;Lu00;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p3, v1, Lqd2;->k:Ljava/lang/Object;

    .line 30
    .line 31
    iget v2, v1, Lqd2;->m:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    const/4 v5, 0x0

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_6

    .line 44
    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v5

    .line 51
    :cond_2
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, Lrp0;->Q(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1}, Lvn1;->w(Ljava/lang/String;)Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p0, p2}, Lvn1;->h(Ljava/util/List;)Ljava/util/ArrayList;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    sget-object p3, Luu0;->a:Ljava/util/Map;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-instance p3, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    array-length v2, p1

    .line 83
    move v6, v3

    .line 84
    :goto_1
    if-ge v6, v2, :cond_4

    .line 85
    .line 86
    aget-object v7, p1, v6

    .line 87
    .line 88
    invoke-virtual {v7}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    if-ne v8, v9, :cond_3

    .line 97
    .line 98
    invoke-virtual {p3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    :cond_5
    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_7

    .line 118
    .line 119
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast v2, Ljava/lang/reflect/Constructor;

    .line 124
    .line 125
    sget-object v6, Luu0;->a:Ljava/util/Map;

    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-static {v6, p2}, Luu0;->a([Ljava/lang/Class;Ljava/util/ArrayList;)Lpu0;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    if-eqz v6, :cond_6

    .line 139
    .line 140
    new-instance v7, Lsu0;

    .line 141
    .line 142
    iget-object v8, v6, Lpu0;->a:[Ljava/lang/Object;

    .line 143
    .line 144
    iget v6, v6, Lpu0;->b:I

    .line 145
    .line 146
    invoke-direct {v7, v2, v8, v6}, Lsu0;-><init>(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;I)V

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_6
    move-object v7, v5

    .line 151
    :goto_3
    if-eqz v7, :cond_5

    .line 152
    .line 153
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_7
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    if-nez p2, :cond_8

    .line 166
    .line 167
    move-object p2, v5

    .line 168
    goto :goto_4

    .line 169
    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result p3

    .line 177
    if-nez p3, :cond_9

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_9
    move-object p3, p2

    .line 181
    check-cast p3, Lsu0;

    .line 182
    .line 183
    iget p3, p3, Lsu0;->c:I

    .line 184
    .line 185
    :cond_a
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    move-object v6, v2

    .line 190
    check-cast v6, Lsu0;

    .line 191
    .line 192
    iget v6, v6, Lsu0;->c:I

    .line 193
    .line 194
    if-le p3, v6, :cond_b

    .line 195
    .line 196
    move-object p2, v2

    .line 197
    move p3, v6

    .line 198
    :cond_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-nez v2, :cond_a

    .line 203
    .line 204
    :goto_4
    check-cast p2, Lsu0;

    .line 205
    .line 206
    if-eqz p2, :cond_c

    .line 207
    .line 208
    new-instance p1, Lqu0;

    .line 209
    .line 210
    iget-object p3, p2, Lsu0;->a:Ljava/lang/reflect/Constructor;

    .line 211
    .line 212
    iget-object p2, p2, Lsu0;->b:[Ljava/lang/Object;

    .line 213
    .line 214
    invoke-direct {p1, p3, p2}, Lqu0;-><init>(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_c
    move-object p1, v5

    .line 219
    :goto_5
    if-eqz p1, :cond_e

    .line 220
    .line 221
    iget-object p2, v0, Ldf2;->j:Lc20;

    .line 222
    .line 223
    new-instance p3, Lu30;

    .line 224
    .line 225
    const/4 v2, 0x4

    .line 226
    invoke-direct {p3, p1, p0, v5, v2}, Lu30;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 227
    .line 228
    .line 229
    iput v4, v1, Lqd2;->m:I

    .line 230
    .line 231
    invoke-static {p2, p3, v1}, Lp7;->R(La20;Lmn0;Lt00;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p3

    .line 235
    sget-object p1, Lk20;->h:Lk20;

    .line 236
    .line 237
    if-ne p3, p1, :cond_d

    .line 238
    .line 239
    return-object p1

    .line 240
    :cond_d
    :goto_6
    iget-object p0, p0, Lvn1;->i:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast p0, Ljh2;

    .line 243
    .line 244
    iget-object p1, v0, Ldf2;->a:Lbf2;

    .line 245
    .line 246
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-static {p3, p0, v3}, Lt11;->V(Ljava/lang/Object;Ljh2;I)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    return-object p0

    .line 254
    :cond_e
    const/4 v10, 0x0

    .line 255
    const/16 v11, 0x1c

    .line 256
    .line 257
    const-string v6, "NOT_FOUND"

    .line 258
    .line 259
    const-string v7, "No matching constructor was found."

    .line 260
    .line 261
    const/4 v8, 0x0

    .line 262
    const/4 v9, 0x0

    .line 263
    invoke-static/range {v6 .. v11}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 264
    .line 265
    .line 266
    return-object v5
.end method

.method public r()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lvn1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldf2;

    .line 4
    .line 5
    invoke-virtual {p0}, Lvn1;->v()V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :try_start_0
    iget-object v2, v0, Ldf2;->i:Lnh2;

    .line 10
    .line 11
    new-instance v3, Llh2;

    .line 12
    .line 13
    iget-object v4, p0, Lvn1;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Lu22;

    .line 16
    .line 17
    iget-object v4, v4, Lu22;->a:Lth2;

    .line 18
    .line 19
    iget-object v5, v4, Lth2;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, v4, Lth2;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-direct {v3, v5, v4}, Llh2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v2, v3}, Lnh2;->b(Llh2;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2
    :try_end_0
    .catch Leh2; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    iget-object p0, p0, Lvn1;->i:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Ljh2;

    .line 35
    .line 36
    iget-object v0, v0, Ldf2;->a:Lbf2;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-static {v2, p0, v0}, Lt11;->V(Ljava/lang/Object;Ljh2;I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_0
    const/4 v6, 0x0

    .line 48
    const/16 v7, 0x1c

    .line 49
    .line 50
    const-string v2, "NOT_FOUND"

    .line 51
    .line 52
    const-string v3, "The host application context is unavailable."

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    const/4 v5, 0x0

    .line 56
    invoke-static/range {v2 .. v7}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :catch_0
    move-exception v0

    .line 61
    move-object p0, v0

    .line 62
    move-object v6, p0

    .line 63
    const/4 v5, 0x0

    .line 64
    const/16 v7, 0x8

    .line 65
    .line 66
    iget-object v2, v6, Leh2;->h:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v3, v6, Leh2;->i:Ljava/lang/String;

    .line 69
    .line 70
    iget-boolean v4, v6, Leh2;->j:Z

    .line 71
    .line 72
    invoke-static/range {v2 .. v7}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 73
    .line 74
    .line 75
    return-object v1
.end method

.method public s(Ljava/lang/String;Ljava/lang/String;Lu00;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lvn1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldf2;

    .line 4
    .line 5
    instance-of v1, p3, Lrd2;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p3

    .line 10
    check-cast v1, Lrd2;

    .line 11
    .line 12
    iget v2, v1, Lrd2;->m:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, Lrd2;->m:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Lrd2;

    .line 25
    .line 26
    invoke-direct {v1, p0, p3}, Lrd2;-><init>(Lvn1;Lu00;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p3, v1, Lrd2;->k:Ljava/lang/Object;

    .line 30
    .line 31
    iget v2, v1, Lrd2;->m:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v4

    .line 49
    :cond_2
    invoke-static {p3}, Lfg1;->T(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Lrp0;->Q(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p1}, Lvn1;->w(Ljava/lang/String;)Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    sget-object p3, Luu0;->a:Ljava/util/Map;

    .line 60
    .line 61
    const-string p3, "field"

    .line 62
    .line 63
    invoke-static {p2, p3}, Lrp0;->R(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {p1, p2, v3}, Luu0;->b(Ljava/lang/Class;Ljava/lang/String;Z)Ljava/lang/reflect/Field;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-eqz p1, :cond_4

    .line 74
    .line 75
    iget-object p2, v0, Ldf2;->j:Lc20;

    .line 76
    .line 77
    new-instance p3, Lu30;

    .line 78
    .line 79
    const/4 v2, 0x5

    .line 80
    invoke-direct {p3, p0, p1, v4, v2}, Lu30;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 81
    .line 82
    .line 83
    iput v3, v1, Lrd2;->m:I

    .line 84
    .line 85
    invoke-static {p2, p3, v1}, Lp7;->R(La20;Lmn0;Lt00;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    sget-object p1, Lk20;->h:Lk20;

    .line 90
    .line 91
    if-ne p3, p1, :cond_3

    .line 92
    .line 93
    return-object p1

    .line 94
    :cond_3
    :goto_1
    iget-object p0, p0, Lvn1;->i:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p0, Ljh2;

    .line 97
    .line 98
    iget-object p1, v0, Ldf2;->a:Lbf2;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    const/4 p1, 0x0

    .line 104
    invoke-static {p3, p0, p1}, Lt11;->V(Ljava/lang/Object;Ljh2;I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0

    .line 109
    :cond_4
    const/4 v9, 0x0

    .line 110
    const/16 v10, 0x1c

    .line 111
    .line 112
    const-string v5, "NOT_FOUND"

    .line 113
    .line 114
    const-string v6, "No static field named the requested name was found."

    .line 115
    .line 116
    const/4 v7, 0x0

    .line 117
    const/4 v8, 0x0

    .line 118
    invoke-static/range {v5 .. v10}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 119
    .line 120
    .line 121
    return-object v4
.end method

.method public t(Lph2;Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lvn1;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ldf2;

    .line 7
    .line 8
    iget-object v0, v0, Ldf2;->b:Lrh2;

    .line 9
    .line 10
    new-instance v1, Lqh2;

    .line 11
    .line 12
    invoke-static {}, Ljava/time/Instant;->now()Ljava/time/Instant;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/16 v3, 0x4000

    .line 20
    .line 21
    invoke-static {p2, v3}, Lpv2;->H0(Ljava/lang/String;I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    iget-object p0, p0, Lvn1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Lu22;

    .line 28
    .line 29
    iget-object p0, p0, Lu22;->a:Lth2;

    .line 30
    .line 31
    iget-object v6, p0, Lth2;->c:Ljava/lang/String;

    .line 32
    .line 33
    const/4 v8, 0x0

    .line 34
    const/4 v7, 0x0

    .line 35
    sget-object v4, Lsh2;->j:Lsh2;

    .line 36
    .line 37
    move-object v3, p1

    .line 38
    invoke-direct/range {v1 .. v8}, Lqh2;-><init>(Ljava/time/Instant;Lph2;Lsh2;Ljava/lang/String;Ljava/lang/String;Lsi2;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v1}, Lrh2;->f(Lqh2;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lvn1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "["

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lvn1;->g:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lth1;

    .line 21
    .line 22
    iget-object p0, p0, Lvn1;->f:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Lqx2;

    .line 25
    .line 26
    const-string v2, "]"

    .line 27
    .line 28
    if-ne v1, p0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    if-eqz v1, :cond_2

    .line 35
    .line 36
    if-eq v1, p0, :cond_2

    .line 37
    .line 38
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v3, v1, Lth1;->m:Lth1;

    .line 46
    .line 47
    if-ne v3, p0, :cond_1

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const-string v3, ","

    .line 54
    .line 55
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, v1, Lth1;->m:Lth1;

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public u(Lci2;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Lvn1;->j:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v1

    .line 7
    :try_start_0
    iget-object v0, p1, Lci2;->f:Lti2;

    .line 8
    .line 9
    iget-object v0, v0, Lti2;->d:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v2, p0, Lvn1;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Ldf2;

    .line 18
    .line 19
    iget-object v2, v2, Ldf2;->a:Lbf2;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const/16 v2, 0x80

    .line 25
    .line 26
    if-gt v0, v2, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lvn1;->k:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lci2;

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    iput-object p1, p0, Lvn1;->k:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    monitor-exit v1

    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    move-object p0, v0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    :try_start_1
    const-string p0, "A message event is already pending dispatch."

    .line 42
    .line 43
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_1
    new-instance v2, Lsd2;

    .line 50
    .line 51
    const-string v3, "INVALID_ARGUMENT"

    .line 52
    .line 53
    const-string v4, "Message events may contain at most 128 segments."

    .line 54
    .line 55
    const/4 v7, 0x0

    .line 56
    const/16 v8, 0x1c

    .line 57
    .line 58
    const/4 v5, 0x0

    .line 59
    const/4 v6, 0x0

    .line 60
    invoke-direct/range {v2 .. v8}, Lsd2;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/Throwable;I)V

    .line 61
    .line 62
    .line 63
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    :goto_0
    monitor-exit v1

    .line 65
    throw p0
.end method

.method public v()V
    .locals 6

    .line 1
    iget-object p0, p0, Lvn1;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lpi2;

    .line 4
    .line 5
    iget-boolean p0, p0, Lpi2;->d:Z

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v4, 0x0

    .line 11
    const/16 v5, 0x1c

    .line 12
    .line 13
    const-string v0, "PERMISSION_DENIED"

    .line 14
    .line 15
    const-string v1, "Host reflection access has not been granted."

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-static/range {v0 .. v5}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public w(Ljava/lang/String;)Ljava/lang/Class;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Lvn1;->v()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lvn1;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Lu22;

    .line 11
    .line 12
    iget-object v3, v2, Lu22;->a:Lth2;

    .line 13
    .line 14
    iget-object v3, v3, Lth2;->k:Lri2;

    .line 15
    .line 16
    iget-object v3, v3, Lri2;->b:Lkh2;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    iget-object v3, v3, Lkh2;->c:Ljava/util/List;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v3, v4

    .line 25
    :goto_0
    if-nez v3, :cond_1

    .line 26
    .line 27
    sget-object v3, Lbe0;->h:Lbe0;

    .line 28
    .line 29
    :cond_1
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const/4 v6, 0x0

    .line 34
    if-eqz v5, :cond_2

    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_2
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_8

    .line 46
    .line 47
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Ljava/lang/String;

    .line 52
    .line 53
    const-string v7, "*"

    .line 54
    .line 55
    invoke-static {v5, v7}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    const/4 v8, 0x1

    .line 60
    if-eqz v7, :cond_5

    .line 61
    .line 62
    :cond_4
    :goto_1
    move v5, v8

    .line 63
    goto :goto_2

    .line 64
    :cond_5
    const-string v7, ".*"

    .line 65
    .line 66
    invoke-static {v5, v7, v6}, Lwv2;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    if-eqz v9, :cond_7

    .line 71
    .line 72
    invoke-static {v5, v7}, Lpv2;->z0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-static {v1, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-nez v7, :cond_4

    .line 81
    .line 82
    const-string v7, "."

    .line 83
    .line 84
    invoke-virtual {v5, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-static {v1, v5, v6}, Lwv2;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_6

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_6
    move v5, v6

    .line 96
    goto :goto_2

    .line 97
    :cond_7
    invoke-static {v1, v5}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    :goto_2
    if-eqz v5, :cond_3

    .line 102
    .line 103
    move v6, v8

    .line 104
    :cond_8
    :goto_3
    if-eqz v6, :cond_9

    .line 105
    .line 106
    :try_start_0
    iget-object v0, v0, Lvn1;->d:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, Ldf2;

    .line 109
    .line 110
    iget-object v0, v0, Ldf2;->i:Lnh2;

    .line 111
    .line 112
    new-instance v3, Llh2;

    .line 113
    .line 114
    iget-object v2, v2, Lu22;->a:Lth2;

    .line 115
    .line 116
    iget-object v5, v2, Lth2;->c:Ljava/lang/String;

    .line 117
    .line 118
    iget-object v2, v2, Lth2;->d:Ljava/lang/String;

    .line 119
    .line 120
    invoke-direct {v3, v5, v2}, Llh2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {v0, v3, v1}, Lnh2;->e(Llh2;Ljava/lang/String;)Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    move-result-object v0
    :try_end_0
    .catch Leh2; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    return-object v0

    .line 128
    :catch_0
    move-exception v0

    .line 129
    move-object v9, v0

    .line 130
    goto :goto_4

    .line 131
    :catch_1
    move-exception v0

    .line 132
    move-object v9, v0

    .line 133
    goto :goto_5

    .line 134
    :catch_2
    move-exception v0

    .line 135
    move-object v9, v0

    .line 136
    goto :goto_6

    .line 137
    :goto_4
    const/4 v8, 0x0

    .line 138
    const/16 v10, 0xc

    .line 139
    .line 140
    const-string v5, "INTERNAL_ERROR"

    .line 141
    .line 142
    const-string v6, "The host class could not be loaded."

    .line 143
    .line 144
    const/4 v7, 0x0

    .line 145
    invoke-static/range {v5 .. v10}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 146
    .line 147
    .line 148
    return-object v4

    .line 149
    :goto_5
    const/4 v8, 0x0

    .line 150
    const/16 v10, 0xc

    .line 151
    .line 152
    const-string v5, "NOT_FOUND"

    .line 153
    .line 154
    const-string v6, "The requested host class was not found."

    .line 155
    .line 156
    const/4 v7, 0x0

    .line 157
    invoke-static/range {v5 .. v10}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 158
    .line 159
    .line 160
    return-object v4

    .line 161
    :goto_6
    const/4 v8, 0x0

    .line 162
    const/16 v10, 0x8

    .line 163
    .line 164
    iget-object v5, v9, Leh2;->h:Ljava/lang/String;

    .line 165
    .line 166
    iget-object v6, v9, Leh2;->i:Ljava/lang/String;

    .line 167
    .line 168
    iget-boolean v7, v9, Leh2;->j:Z

    .line 169
    .line 170
    invoke-static/range {v5 .. v10}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 171
    .line 172
    .line 173
    return-object v4

    .line 174
    :cond_9
    const/4 v15, 0x0

    .line 175
    const/16 v16, 0x1c

    .line 176
    .line 177
    const-string v11, "PERMISSION_DENIED"

    .line 178
    .line 179
    const-string v12, "The class is outside the declared host class scope."

    .line 180
    .line 181
    const/4 v13, 0x0

    .line 182
    const/4 v14, 0x0

    .line 183
    invoke-static/range {v11 .. v16}, Lc80;->p(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/Throwable;I)V

    .line 184
    .line 185
    .line 186
    return-object v4
.end method

.method public x()V
    .locals 2

    .line 1
    iget-object p0, p0, Lvn1;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lth1;

    .line 4
    .line 5
    :goto_0
    if-eqz p0, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Lth1;->I0()V

    .line 8
    .line 9
    .line 10
    iget-boolean v0, p0, Lth1;->p:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    sget-object v0, Lao1;->a:Lgk1;

    .line 15
    .line 16
    iget-boolean v0, p0, Lth1;->u:Z

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    const-string v0, "autoInvalidateInsertedNode called on unattached node"

    .line 21
    .line 22
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    const/4 v0, -0x1

    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-static {p0, v0, v1}, Lao1;->a(Lth1;II)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-boolean v0, p0, Lth1;->q:Z

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-static {p0}, Lao1;->c(Lth1;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    const/4 v0, 0x0

    .line 38
    iput-boolean v0, p0, Lth1;->p:Z

    .line 39
    .line 40
    iput-boolean v0, p0, Lth1;->q:Z

    .line 41
    .line 42
    iget-object p0, p0, Lth1;->m:Lth1;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    return-void
.end method

.method public y()Lcom/dokar/quickjs/binding/JsObject;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lvn1;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ldf2;

    .line 6
    .line 7
    iget-object v1, v1, Ldf2;->a:Lbf2;

    .line 8
    .line 9
    iget-object v2, v0, Lvn1;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lu22;

    .line 12
    .line 13
    iget-object v3, v2, Lu22;->a:Lth2;

    .line 14
    .line 15
    iget v3, v3, Lth2;->b:I

    .line 16
    .line 17
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    new-instance v4, Low1;

    .line 22
    .line 23
    const-string v5, "apiVersion"

    .line 24
    .line 25
    invoke-direct {v4, v5, v3}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v3, v0, Lvn1;->e:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v3, Ljava/lang/String;

    .line 31
    .line 32
    new-instance v5, Low1;

    .line 33
    .line 34
    const-string v6, "quickJsVersion"

    .line 35
    .line 36
    invoke-direct {v5, v6, v3}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v2, v2, Lu22;->a:Lth2;

    .line 40
    .line 41
    iget-object v3, v2, Lth2;->c:Ljava/lang/String;

    .line 42
    .line 43
    new-instance v6, Low1;

    .line 44
    .line 45
    const-string v7, "id"

    .line 46
    .line 47
    invoke-direct {v6, v7, v3}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v3, v2, Lth2;->d:Ljava/lang/String;

    .line 51
    .line 52
    new-instance v7, Low1;

    .line 53
    .line 54
    const-string v8, "name"

    .line 55
    .line 56
    invoke-direct {v7, v8, v3}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object v3, v2, Lth2;->e:Ljava/lang/String;

    .line 60
    .line 61
    new-instance v8, Low1;

    .line 62
    .line 63
    const-string v9, "version"

    .line 64
    .line 65
    invoke-direct {v8, v9, v3}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-wide v2, v2, Lth2;->f:J

    .line 69
    .line 70
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    new-instance v3, Low1;

    .line 75
    .line 76
    const-string v9, "versionCode"

    .line 77
    .line 78
    invoke-direct {v3, v9, v2}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    filled-new-array {v6, v7, v8, v3}, [Low1;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-static {v2}, Lwe1;->q0([Low1;)Ljava/util/Map;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    new-instance v3, Lcom/dokar/quickjs/binding/JsObject;

    .line 90
    .line 91
    invoke-direct {v3, v2}, Lcom/dokar/quickjs/binding/JsObject;-><init>(Ljava/util/Map;)V

    .line 92
    .line 93
    .line 94
    new-instance v2, Low1;

    .line 95
    .line 96
    const-string v6, "script"

    .line 97
    .line 98
    invoke-direct {v2, v6, v3}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object v0, v0, Lvn1;->c:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Leg2;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    new-instance v6, Low1;

    .line 109
    .line 110
    const-string v0, "memoryBytes"

    .line 111
    .line 112
    const/4 v3, 0x0

    .line 113
    invoke-direct {v6, v0, v3}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    const/16 v0, 0x80

    .line 120
    .line 121
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    new-instance v7, Low1;

    .line 126
    .line 127
    const-string v1, "maxActiveTimers"

    .line 128
    .line 129
    invoke-direct {v7, v1, v0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    const-wide/16 v8, 0xa

    .line 133
    .line 134
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    new-instance v8, Low1;

    .line 139
    .line 140
    const-string v3, "minIntervalMs"

    .line 141
    .line 142
    invoke-direct {v8, v3, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    const/16 v1, 0x8

    .line 146
    .line 147
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    new-instance v9, Low1;

    .line 152
    .line 153
    const-string v3, "maxHttpConcurrency"

    .line 154
    .line 155
    invoke-direct {v9, v3, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    const-wide/16 v10, 0x7530

    .line 159
    .line 160
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    new-instance v10, Low1;

    .line 165
    .line 166
    const-string v3, "httpTimeoutMs"

    .line 167
    .line 168
    invoke-direct {v10, v3, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    const/16 v1, 0xa

    .line 172
    .line 173
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    new-instance v11, Low1;

    .line 178
    .line 179
    const-string v3, "maxHttpRedirects"

    .line 180
    .line 181
    invoke-direct {v11, v3, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    const-wide/32 v12, 0x1000000

    .line 185
    .line 186
    .line 187
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    new-instance v12, Low1;

    .line 192
    .line 193
    const-string v3, "maxHttpRequestBytes"

    .line 194
    .line 195
    invoke-direct {v12, v3, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    new-instance v13, Low1;

    .line 199
    .line 200
    const-string v3, "maxHttpResponseBytes"

    .line 201
    .line 202
    invoke-direct {v13, v3, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    const-wide/32 v14, 0x4000000

    .line 206
    .line 207
    .line 208
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    new-instance v14, Low1;

    .line 213
    .line 214
    const-string v15, "maxHttpDownloadBytes"

    .line 215
    .line 216
    invoke-direct {v14, v15, v3}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    new-instance v15, Low1;

    .line 220
    .line 221
    const-string v3, "maxFileReadBytes"

    .line 222
    .line 223
    invoke-direct {v15, v3, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    const-wide/32 v16, 0x8000000

    .line 227
    .line 228
    .line 229
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    new-instance v3, Low1;

    .line 234
    .line 235
    move-object/from16 p0, v6

    .line 236
    .line 237
    const-string v6, "maxDataStorageBytes"

    .line 238
    .line 239
    invoke-direct {v3, v6, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    const-wide/32 v16, 0x10000000

    .line 243
    .line 244
    .line 245
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    new-instance v6, Low1;

    .line 250
    .line 251
    move-object/from16 v16, v3

    .line 252
    .line 253
    const-string v3, "maxCacheStorageBytes"

    .line 254
    .line 255
    invoke-direct {v6, v3, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    const-wide/32 v17, 0x40000000

    .line 259
    .line 260
    .line 261
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    new-instance v3, Low1;

    .line 266
    .line 267
    move-object/from16 v17, v6

    .line 268
    .line 269
    const-string v6, "maxExternalStorageBytes"

    .line 270
    .line 271
    invoke-direct {v3, v6, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    new-instance v1, Low1;

    .line 275
    .line 276
    const-string v6, "maxMessageSegments"

    .line 277
    .line 278
    invoke-direct {v1, v6, v0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    const/16 v0, 0x100

    .line 282
    .line 283
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    new-instance v6, Low1;

    .line 288
    .line 289
    move-object/from16 v19, v1

    .line 290
    .line 291
    const-string v1, "maxHostObjectReferences"

    .line 292
    .line 293
    invoke-direct {v6, v1, v0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    const/16 v0, 0x40

    .line 297
    .line 298
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    new-instance v1, Low1;

    .line 303
    .line 304
    move-object/from16 v18, v3

    .line 305
    .line 306
    const-string v3, "maxHostCallArguments"

    .line 307
    .line 308
    invoke-direct {v1, v3, v0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    const/16 v0, 0x10

    .line 312
    .line 313
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    new-instance v3, Low1;

    .line 318
    .line 319
    move-object/from16 v21, v1

    .line 320
    .line 321
    const-string v1, "maxHostValueDepth"

    .line 322
    .line 323
    invoke-direct {v3, v1, v0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    move-object/from16 v22, v3

    .line 327
    .line 328
    move-object/from16 v20, v6

    .line 329
    .line 330
    move-object/from16 v6, p0

    .line 331
    .line 332
    filled-new-array/range {v6 .. v22}, [Low1;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-static {v0}, Lwe1;->q0([Low1;)Ljava/util/Map;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    new-instance v1, Lcom/dokar/quickjs/binding/JsObject;

    .line 341
    .line 342
    invoke-direct {v1, v0}, Lcom/dokar/quickjs/binding/JsObject;-><init>(Ljava/util/Map;)V

    .line 343
    .line 344
    .line 345
    new-instance v0, Low1;

    .line 346
    .line 347
    const-string v3, "limits"

    .line 348
    .line 349
    invoke-direct {v0, v3, v1}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    filled-new-array {v4, v5, v2, v0}, [Low1;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-static {v0}, Lwe1;->q0([Low1;)Ljava/util/Map;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    new-instance v1, Lcom/dokar/quickjs/binding/JsObject;

    .line 361
    .line 362
    invoke-direct {v1, v0}, Lcom/dokar/quickjs/binding/JsObject;-><init>(Ljava/util/Map;)V

    .line 363
    .line 364
    .line 365
    return-object v1
.end method

.method public z(ILzk1;Lzk1;Lth1;Z)V
    .locals 31

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lvn1;->k:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ltn1;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ltn1;

    .line 10
    .line 11
    move/from16 v3, p1

    .line 12
    .line 13
    move-object/from16 v4, p2

    .line 14
    .line 15
    move-object/from16 v5, p3

    .line 16
    .line 17
    move-object/from16 v2, p4

    .line 18
    .line 19
    move/from16 v6, p5

    .line 20
    .line 21
    invoke-direct/range {v0 .. v6}, Ltn1;-><init>(Lvn1;Lth1;ILzk1;Lzk1;Z)V

    .line 22
    .line 23
    .line 24
    iput-object v0, v1, Lvn1;->k:Ljava/lang/Object;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move/from16 v3, p1

    .line 28
    .line 29
    move-object/from16 v4, p2

    .line 30
    .line 31
    move-object/from16 v5, p3

    .line 32
    .line 33
    move-object/from16 v2, p4

    .line 34
    .line 35
    iput-object v2, v0, Ltn1;->a:Lth1;

    .line 36
    .line 37
    iput v3, v0, Ltn1;->b:I

    .line 38
    .line 39
    iput-object v4, v0, Ltn1;->c:Lzk1;

    .line 40
    .line 41
    iput-object v5, v0, Ltn1;->d:Lzk1;

    .line 42
    .line 43
    move/from16 v6, p5

    .line 44
    .line 45
    iput-boolean v6, v0, Ltn1;->e:Z

    .line 46
    .line 47
    :goto_0
    iget-object v2, v0, Ltn1;->f:Lvn1;

    .line 48
    .line 49
    iget v4, v4, Lzk1;->j:I

    .line 50
    .line 51
    sub-int/2addr v4, v3

    .line 52
    iget v5, v5, Lzk1;->j:I

    .line 53
    .line 54
    sub-int/2addr v5, v3

    .line 55
    add-int v3, v4, v5

    .line 56
    .line 57
    const/4 v6, 0x1

    .line 58
    add-int/2addr v3, v6

    .line 59
    const/4 v7, 0x2

    .line 60
    div-int/2addr v3, v7

    .line 61
    new-instance v8, Li11;

    .line 62
    .line 63
    mul-int/lit8 v9, v3, 0x3

    .line 64
    .line 65
    invoke-direct {v8, v9}, Li11;-><init>(I)V

    .line 66
    .line 67
    .line 68
    new-instance v9, Li11;

    .line 69
    .line 70
    mul-int/lit8 v10, v3, 0x4

    .line 71
    .line 72
    invoke-direct {v9, v10}, Li11;-><init>(I)V

    .line 73
    .line 74
    .line 75
    const/4 v10, 0x0

    .line 76
    invoke-virtual {v9, v10, v4, v10, v5}, Li11;->e(IIII)V

    .line 77
    .line 78
    .line 79
    mul-int/2addr v3, v7

    .line 80
    add-int/2addr v3, v6

    .line 81
    new-array v11, v3, [I

    .line 82
    .line 83
    new-array v12, v3, [I

    .line 84
    .line 85
    const/4 v13, 0x5

    .line 86
    new-array v13, v13, [I

    .line 87
    .line 88
    :goto_1
    iget v14, v9, Li11;->b:I

    .line 89
    .line 90
    if-eqz v14, :cond_1d

    .line 91
    .line 92
    move/from16 p1, v7

    .line 93
    .line 94
    iget-object v7, v9, Li11;->a:[I

    .line 95
    .line 96
    move/from16 p2, v10

    .line 97
    .line 98
    add-int/lit8 v10, v14, -0x1

    .line 99
    .line 100
    iput v10, v9, Li11;->b:I

    .line 101
    .line 102
    aget v10, v7, v10

    .line 103
    .line 104
    const/16 p3, 0x3

    .line 105
    .line 106
    add-int/lit8 v15, v14, -0x2

    .line 107
    .line 108
    iput v15, v9, Li11;->b:I

    .line 109
    .line 110
    aget v15, v7, v15

    .line 111
    .line 112
    add-int/lit8 v6, v14, -0x3

    .line 113
    .line 114
    iput v6, v9, Li11;->b:I

    .line 115
    .line 116
    aget v6, v7, v6

    .line 117
    .line 118
    add-int/lit8 v14, v14, -0x4

    .line 119
    .line 120
    iput v14, v9, Li11;->b:I

    .line 121
    .line 122
    aget v7, v7, v14

    .line 123
    .line 124
    sub-int v14, v6, v7

    .line 125
    .line 126
    move/from16 p5, v3

    .line 127
    .line 128
    sub-int v3, v10, v15

    .line 129
    .line 130
    move-object/from16 v16, v11

    .line 131
    .line 132
    const/4 v11, 0x1

    .line 133
    if-lt v14, v11, :cond_1c

    .line 134
    .line 135
    if-ge v3, v11, :cond_1

    .line 136
    .line 137
    goto/16 :goto_19

    .line 138
    .line 139
    :cond_1
    add-int v17, v14, v3

    .line 140
    .line 141
    add-int/lit8 v17, v17, 0x1

    .line 142
    .line 143
    move/from16 p4, v11

    .line 144
    .line 145
    div-int/lit8 v11, v17, 0x2

    .line 146
    .line 147
    div-int/lit8 v17, p5, 0x2

    .line 148
    .line 149
    add-int/lit8 v18, v17, 0x1

    .line 150
    .line 151
    aput v7, v16, v18

    .line 152
    .line 153
    aput v6, v12, v18

    .line 154
    .line 155
    move/from16 v18, v3

    .line 156
    .line 157
    move/from16 v3, p2

    .line 158
    .line 159
    :goto_2
    if-ge v3, v11, :cond_1c

    .line 160
    .line 161
    sub-int v19, v14, v18

    .line 162
    .line 163
    invoke-static/range {v19 .. v19}, Ljava/lang/Math;->abs(I)I

    .line 164
    .line 165
    .line 166
    move-result v20

    .line 167
    move/from16 v21, v11

    .line 168
    .line 169
    and-int/lit8 v11, v20, 0x1

    .line 170
    .line 171
    move-object/from16 v20, v12

    .line 172
    .line 173
    move/from16 v12, p4

    .line 174
    .line 175
    if-ne v11, v12, :cond_2

    .line 176
    .line 177
    const/4 v11, 0x1

    .line 178
    goto :goto_3

    .line 179
    :cond_2
    move/from16 v11, p2

    .line 180
    .line 181
    :goto_3
    neg-int v12, v3

    .line 182
    move/from16 v22, v11

    .line 183
    .line 184
    move v11, v12

    .line 185
    :goto_4
    const/16 v23, 0x4

    .line 186
    .line 187
    if-gt v11, v3, :cond_b

    .line 188
    .line 189
    if-eq v11, v12, :cond_5

    .line 190
    .line 191
    if-eq v11, v3, :cond_3

    .line 192
    .line 193
    add-int/lit8 v24, v11, 0x1

    .line 194
    .line 195
    add-int v24, v24, v17

    .line 196
    .line 197
    move/from16 v25, v11

    .line 198
    .line 199
    aget v11, v16, v24

    .line 200
    .line 201
    add-int/lit8 v24, v25, -0x1

    .line 202
    .line 203
    add-int v24, v24, v17

    .line 204
    .line 205
    move-object/from16 v26, v13

    .line 206
    .line 207
    aget v13, v16, v24

    .line 208
    .line 209
    if-le v11, v13, :cond_4

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_3
    move/from16 v25, v11

    .line 213
    .line 214
    move-object/from16 v26, v13

    .line 215
    .line 216
    :cond_4
    add-int/lit8 v11, v25, -0x1

    .line 217
    .line 218
    add-int v11, v11, v17

    .line 219
    .line 220
    aget v11, v16, v11

    .line 221
    .line 222
    add-int/lit8 v13, v11, 0x1

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_5
    move/from16 v25, v11

    .line 226
    .line 227
    move-object/from16 v26, v13

    .line 228
    .line 229
    :goto_5
    add-int/lit8 v11, v25, 0x1

    .line 230
    .line 231
    add-int v11, v11, v17

    .line 232
    .line 233
    aget v11, v16, v11

    .line 234
    .line 235
    move v13, v11

    .line 236
    :goto_6
    sub-int v24, v13, v7

    .line 237
    .line 238
    add-int v24, v24, v15

    .line 239
    .line 240
    sub-int v24, v24, v25

    .line 241
    .line 242
    if-eqz v3, :cond_6

    .line 243
    .line 244
    const/16 v27, 0x1

    .line 245
    .line 246
    goto :goto_7

    .line 247
    :cond_6
    move/from16 v27, p2

    .line 248
    .line 249
    :goto_7
    if-ne v13, v11, :cond_7

    .line 250
    .line 251
    const/16 v28, 0x1

    .line 252
    .line 253
    goto :goto_8

    .line 254
    :cond_7
    move/from16 v28, p2

    .line 255
    .line 256
    :goto_8
    and-int v27, v27, v28

    .line 257
    .line 258
    sub-int v27, v24, v27

    .line 259
    .line 260
    move/from16 v30, v24

    .line 261
    .line 262
    move/from16 v24, v11

    .line 263
    .line 264
    move/from16 v11, v30

    .line 265
    .line 266
    :goto_9
    if-ge v13, v6, :cond_8

    .line 267
    .line 268
    if-ge v11, v10, :cond_8

    .line 269
    .line 270
    invoke-virtual {v0, v13, v11}, Ltn1;->a(II)Z

    .line 271
    .line 272
    .line 273
    move-result v28

    .line 274
    if-eqz v28, :cond_8

    .line 275
    .line 276
    add-int/lit8 v13, v13, 0x1

    .line 277
    .line 278
    add-int/lit8 v11, v11, 0x1

    .line 279
    .line 280
    goto :goto_9

    .line 281
    :cond_8
    add-int v28, v17, v25

    .line 282
    .line 283
    aput v13, v16, v28

    .line 284
    .line 285
    if-eqz v22, :cond_9

    .line 286
    .line 287
    move/from16 v28, v11

    .line 288
    .line 289
    sub-int v11, v19, v25

    .line 290
    .line 291
    move/from16 v29, v14

    .line 292
    .line 293
    add-int/lit8 v14, v12, 0x1

    .line 294
    .line 295
    if-lt v11, v14, :cond_a

    .line 296
    .line 297
    add-int/lit8 v14, v3, -0x1

    .line 298
    .line 299
    if-gt v11, v14, :cond_a

    .line 300
    .line 301
    add-int v11, v17, v11

    .line 302
    .line 303
    aget v11, v20, v11

    .line 304
    .line 305
    if-gt v11, v13, :cond_a

    .line 306
    .line 307
    aput v24, v26, p2

    .line 308
    .line 309
    const/4 v11, 0x1

    .line 310
    aput v27, v26, v11

    .line 311
    .line 312
    aput v13, v26, p1

    .line 313
    .line 314
    aput v28, v26, p3

    .line 315
    .line 316
    aput p2, v26, v23

    .line 317
    .line 318
    const/4 v11, 0x1

    .line 319
    goto/16 :goto_11

    .line 320
    .line 321
    :cond_9
    move/from16 v29, v14

    .line 322
    .line 323
    :cond_a
    add-int/lit8 v11, v25, 0x2

    .line 324
    .line 325
    move-object/from16 v13, v26

    .line 326
    .line 327
    move/from16 v14, v29

    .line 328
    .line 329
    goto/16 :goto_4

    .line 330
    .line 331
    :cond_b
    move-object/from16 v26, v13

    .line 332
    .line 333
    move/from16 v29, v14

    .line 334
    .line 335
    and-int/lit8 v11, v19, 0x1

    .line 336
    .line 337
    if-nez v11, :cond_c

    .line 338
    .line 339
    const/4 v11, 0x1

    .line 340
    goto :goto_a

    .line 341
    :cond_c
    move/from16 v11, p2

    .line 342
    .line 343
    :goto_a
    move v13, v12

    .line 344
    :goto_b
    if-gt v13, v3, :cond_1b

    .line 345
    .line 346
    if-eq v13, v12, :cond_f

    .line 347
    .line 348
    if-eq v13, v3, :cond_d

    .line 349
    .line 350
    add-int/lit8 v14, v13, 0x1

    .line 351
    .line 352
    add-int v14, v14, v17

    .line 353
    .line 354
    aget v14, v20, v14

    .line 355
    .line 356
    add-int/lit8 v22, v13, -0x1

    .line 357
    .line 358
    add-int v22, v22, v17

    .line 359
    .line 360
    move/from16 v24, v11

    .line 361
    .line 362
    aget v11, v20, v22

    .line 363
    .line 364
    if-ge v14, v11, :cond_e

    .line 365
    .line 366
    goto :goto_c

    .line 367
    :cond_d
    move/from16 v24, v11

    .line 368
    .line 369
    :cond_e
    add-int/lit8 v11, v13, -0x1

    .line 370
    .line 371
    add-int v11, v11, v17

    .line 372
    .line 373
    aget v11, v20, v11

    .line 374
    .line 375
    add-int/lit8 v14, v11, -0x1

    .line 376
    .line 377
    goto :goto_d

    .line 378
    :cond_f
    move/from16 v24, v11

    .line 379
    .line 380
    :goto_c
    add-int/lit8 v11, v13, 0x1

    .line 381
    .line 382
    add-int v11, v11, v17

    .line 383
    .line 384
    aget v11, v20, v11

    .line 385
    .line 386
    move v14, v11

    .line 387
    :goto_d
    sub-int v22, v6, v14

    .line 388
    .line 389
    sub-int v22, v22, v13

    .line 390
    .line 391
    sub-int v22, v10, v22

    .line 392
    .line 393
    if-eqz v3, :cond_10

    .line 394
    .line 395
    const/16 v25, 0x1

    .line 396
    .line 397
    goto :goto_e

    .line 398
    :cond_10
    move/from16 v25, p2

    .line 399
    .line 400
    :goto_e
    if-ne v14, v11, :cond_11

    .line 401
    .line 402
    const/16 v27, 0x1

    .line 403
    .line 404
    goto :goto_f

    .line 405
    :cond_11
    move/from16 v27, p2

    .line 406
    .line 407
    :goto_f
    and-int v25, v25, v27

    .line 408
    .line 409
    add-int v25, v22, v25

    .line 410
    .line 411
    move/from16 v30, v22

    .line 412
    .line 413
    move/from16 v22, v11

    .line 414
    .line 415
    move/from16 v11, v30

    .line 416
    .line 417
    :goto_10
    if-le v14, v7, :cond_12

    .line 418
    .line 419
    if-le v11, v15, :cond_12

    .line 420
    .line 421
    move/from16 v27, v11

    .line 422
    .line 423
    add-int/lit8 v11, v14, -0x1

    .line 424
    .line 425
    move/from16 v28, v13

    .line 426
    .line 427
    add-int/lit8 v13, v27, -0x1

    .line 428
    .line 429
    invoke-virtual {v0, v11, v13}, Ltn1;->a(II)Z

    .line 430
    .line 431
    .line 432
    move-result v11

    .line 433
    if-eqz v11, :cond_13

    .line 434
    .line 435
    add-int/lit8 v14, v14, -0x1

    .line 436
    .line 437
    add-int/lit8 v11, v27, -0x1

    .line 438
    .line 439
    move/from16 v13, v28

    .line 440
    .line 441
    goto :goto_10

    .line 442
    :cond_12
    move/from16 v27, v11

    .line 443
    .line 444
    move/from16 v28, v13

    .line 445
    .line 446
    :cond_13
    add-int v13, v17, v28

    .line 447
    .line 448
    aput v14, v20, v13

    .line 449
    .line 450
    if-eqz v24, :cond_1a

    .line 451
    .line 452
    sub-int v11, v19, v28

    .line 453
    .line 454
    if-lt v11, v12, :cond_1a

    .line 455
    .line 456
    if-gt v11, v3, :cond_1a

    .line 457
    .line 458
    add-int v11, v17, v11

    .line 459
    .line 460
    aget v11, v16, v11

    .line 461
    .line 462
    if-lt v11, v14, :cond_1a

    .line 463
    .line 464
    aput v14, v26, p2

    .line 465
    .line 466
    const/4 v11, 0x1

    .line 467
    aput v27, v26, v11

    .line 468
    .line 469
    aput v22, v26, p1

    .line 470
    .line 471
    aput v25, v26, p3

    .line 472
    .line 473
    aput v11, v26, v23

    .line 474
    .line 475
    :goto_11
    aget v3, v26, p1

    .line 476
    .line 477
    aget v12, v26, p2

    .line 478
    .line 479
    sub-int/2addr v3, v12

    .line 480
    aget v12, v26, p3

    .line 481
    .line 482
    aget v13, v26, v11

    .line 483
    .line 484
    sub-int/2addr v12, v13

    .line 485
    invoke-static {v3, v12}, Ljava/lang/Math;->min(II)I

    .line 486
    .line 487
    .line 488
    move-result v3

    .line 489
    if-lez v3, :cond_19

    .line 490
    .line 491
    aget v3, v26, p2

    .line 492
    .line 493
    aget v12, v26, v11

    .line 494
    .line 495
    aget v11, v26, p3

    .line 496
    .line 497
    sub-int/2addr v11, v12

    .line 498
    aget v13, v26, p1

    .line 499
    .line 500
    sub-int/2addr v13, v3

    .line 501
    if-eq v11, v13, :cond_18

    .line 502
    .line 503
    invoke-static {v13, v11}, Ljava/lang/Math;->min(II)I

    .line 504
    .line 505
    .line 506
    move-result v13

    .line 507
    aget v11, v26, v23

    .line 508
    .line 509
    if-eqz v11, :cond_14

    .line 510
    .line 511
    const/4 v14, 0x1

    .line 512
    goto :goto_12

    .line 513
    :cond_14
    move/from16 v14, p2

    .line 514
    .line 515
    :goto_12
    aget v17, v26, p3

    .line 516
    .line 517
    const/16 v18, 0x1

    .line 518
    .line 519
    aget v19, v26, v18

    .line 520
    .line 521
    move/from16 p4, v3

    .line 522
    .line 523
    sub-int v3, v17, v19

    .line 524
    .line 525
    aget v21, v26, p1

    .line 526
    .line 527
    aget v22, v26, p2

    .line 528
    .line 529
    move/from16 v23, v11

    .line 530
    .line 531
    sub-int v11, v21, v22

    .line 532
    .line 533
    if-le v3, v11, :cond_15

    .line 534
    .line 535
    move/from16 v3, v18

    .line 536
    .line 537
    goto :goto_13

    .line 538
    :cond_15
    move/from16 v3, p2

    .line 539
    .line 540
    :goto_13
    or-int/2addr v3, v14

    .line 541
    xor-int/lit8 v3, v3, 0x1

    .line 542
    .line 543
    add-int v3, p4, v3

    .line 544
    .line 545
    if-eqz v23, :cond_16

    .line 546
    .line 547
    move/from16 v11, v18

    .line 548
    .line 549
    goto :goto_14

    .line 550
    :cond_16
    move/from16 v11, p2

    .line 551
    .line 552
    :goto_14
    sub-int v14, v17, v19

    .line 553
    .line 554
    move/from16 p4, v3

    .line 555
    .line 556
    sub-int v3, v21, v22

    .line 557
    .line 558
    if-le v14, v3, :cond_17

    .line 559
    .line 560
    move/from16 v3, v18

    .line 561
    .line 562
    goto :goto_15

    .line 563
    :cond_17
    move/from16 v3, p2

    .line 564
    .line 565
    :goto_15
    xor-int/lit8 v3, v3, 0x1

    .line 566
    .line 567
    or-int/2addr v3, v11

    .line 568
    xor-int/lit8 v3, v3, 0x1

    .line 569
    .line 570
    add-int/2addr v12, v3

    .line 571
    move/from16 v3, p4

    .line 572
    .line 573
    goto :goto_16

    .line 574
    :cond_18
    move/from16 p4, v3

    .line 575
    .line 576
    const/16 v18, 0x1

    .line 577
    .line 578
    :goto_16
    invoke-virtual {v8, v3, v12, v13}, Li11;->d(III)V

    .line 579
    .line 580
    .line 581
    goto :goto_17

    .line 582
    :cond_19
    move/from16 v18, v11

    .line 583
    .line 584
    :goto_17
    aget v3, v26, p2

    .line 585
    .line 586
    aget v11, v26, v18

    .line 587
    .line 588
    invoke-virtual {v9, v7, v3, v15, v11}, Li11;->e(IIII)V

    .line 589
    .line 590
    .line 591
    aget v3, v26, p1

    .line 592
    .line 593
    aget v7, v26, p3

    .line 594
    .line 595
    invoke-virtual {v9, v3, v6, v7, v10}, Li11;->e(IIII)V

    .line 596
    .line 597
    .line 598
    :goto_18
    move/from16 v7, p1

    .line 599
    .line 600
    move/from16 v10, p2

    .line 601
    .line 602
    move/from16 v3, p5

    .line 603
    .line 604
    move-object/from16 v11, v16

    .line 605
    .line 606
    move-object/from16 v12, v20

    .line 607
    .line 608
    move-object/from16 v13, v26

    .line 609
    .line 610
    const/4 v6, 0x1

    .line 611
    goto/16 :goto_1

    .line 612
    .line 613
    :cond_1a
    add-int/lit8 v13, v28, 0x2

    .line 614
    .line 615
    move/from16 v11, v24

    .line 616
    .line 617
    goto/16 :goto_b

    .line 618
    .line 619
    :cond_1b
    add-int/lit8 v3, v3, 0x1

    .line 620
    .line 621
    move-object/from16 v12, v20

    .line 622
    .line 623
    move/from16 v11, v21

    .line 624
    .line 625
    move-object/from16 v13, v26

    .line 626
    .line 627
    move/from16 v14, v29

    .line 628
    .line 629
    const/16 p4, 0x1

    .line 630
    .line 631
    goto/16 :goto_2

    .line 632
    .line 633
    :cond_1c
    :goto_19
    move-object/from16 v20, v12

    .line 634
    .line 635
    move-object/from16 v26, v13

    .line 636
    .line 637
    goto :goto_18

    .line 638
    :cond_1d
    move/from16 p1, v7

    .line 639
    .line 640
    move/from16 p2, v10

    .line 641
    .line 642
    const/16 p3, 0x3

    .line 643
    .line 644
    iget v3, v8, Li11;->b:I

    .line 645
    .line 646
    rem-int/lit8 v6, v3, 0x3

    .line 647
    .line 648
    if-nez v6, :cond_1e

    .line 649
    .line 650
    :goto_1a
    move/from16 v6, p3

    .line 651
    .line 652
    goto :goto_1b

    .line 653
    :cond_1e
    const-string v6, "Array size not a multiple of 3"

    .line 654
    .line 655
    invoke-static {v6}, Lkz0;->b(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    goto :goto_1a

    .line 659
    :goto_1b
    if-le v3, v6, :cond_1f

    .line 660
    .line 661
    sub-int/2addr v3, v6

    .line 662
    move/from16 v6, p2

    .line 663
    .line 664
    invoke-virtual {v8, v6, v3}, Li11;->f(II)V

    .line 665
    .line 666
    .line 667
    goto :goto_1c

    .line 668
    :cond_1f
    move/from16 v6, p2

    .line 669
    .line 670
    :goto_1c
    invoke-virtual {v8, v4, v5, v6}, Li11;->d(III)V

    .line 671
    .line 672
    .line 673
    move v3, v6

    .line 674
    move v4, v3

    .line 675
    move v5, v4

    .line 676
    :cond_20
    iget v7, v8, Li11;->b:I

    .line 677
    .line 678
    if-ge v3, v7, :cond_29

    .line 679
    .line 680
    iget-object v7, v8, Li11;->a:[I

    .line 681
    .line 682
    aget v9, v7, v3

    .line 683
    .line 684
    add-int/lit8 v10, v3, 0x2

    .line 685
    .line 686
    aget v10, v7, v10

    .line 687
    .line 688
    sub-int/2addr v9, v10

    .line 689
    add-int/lit8 v11, v3, 0x1

    .line 690
    .line 691
    aget v7, v7, v11

    .line 692
    .line 693
    sub-int/2addr v7, v10

    .line 694
    add-int/lit8 v3, v3, 0x3

    .line 695
    .line 696
    :goto_1d
    if-ge v4, v9, :cond_23

    .line 697
    .line 698
    iget-object v11, v0, Ltn1;->a:Lth1;

    .line 699
    .line 700
    iget-object v11, v11, Lth1;->m:Lth1;

    .line 701
    .line 702
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 703
    .line 704
    .line 705
    iget v12, v11, Lth1;->j:I

    .line 706
    .line 707
    and-int/lit8 v12, v12, 0x2

    .line 708
    .line 709
    if-eqz v12, :cond_22

    .line 710
    .line 711
    iget-object v12, v11, Lth1;->o:Lzn1;

    .line 712
    .line 713
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 714
    .line 715
    .line 716
    iget-object v13, v12, Lzn1;->x:Lzn1;

    .line 717
    .line 718
    iget-object v12, v12, Lzn1;->w:Lzn1;

    .line 719
    .line 720
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 721
    .line 722
    .line 723
    if-eqz v13, :cond_21

    .line 724
    .line 725
    iput-object v12, v13, Lzn1;->w:Lzn1;

    .line 726
    .line 727
    :cond_21
    iput-object v13, v12, Lzn1;->x:Lzn1;

    .line 728
    .line 729
    iget-object v13, v0, Ltn1;->a:Lth1;

    .line 730
    .line 731
    invoke-static {v2, v13, v12}, Lvn1;->a(Lvn1;Lth1;Lzn1;)V

    .line 732
    .line 733
    .line 734
    :cond_22
    invoke-static {v11}, Lvn1;->j(Lth1;)Lth1;

    .line 735
    .line 736
    .line 737
    move-result-object v11

    .line 738
    iput-object v11, v0, Ltn1;->a:Lth1;

    .line 739
    .line 740
    add-int/lit8 v4, v4, 0x1

    .line 741
    .line 742
    goto :goto_1d

    .line 743
    :cond_23
    :goto_1e
    if-ge v5, v7, :cond_27

    .line 744
    .line 745
    iget v9, v0, Ltn1;->b:I

    .line 746
    .line 747
    add-int/2addr v9, v5

    .line 748
    iget-object v11, v0, Ltn1;->a:Lth1;

    .line 749
    .line 750
    iget-object v12, v0, Ltn1;->d:Lzk1;

    .line 751
    .line 752
    iget-object v12, v12, Lzk1;->h:[Ljava/lang/Object;

    .line 753
    .line 754
    aget-object v9, v12, v9

    .line 755
    .line 756
    check-cast v9, Lsh1;

    .line 757
    .line 758
    invoke-static {v9, v11}, Lvn1;->i(Lsh1;Lth1;)Lth1;

    .line 759
    .line 760
    .line 761
    move-result-object v9

    .line 762
    iput-object v9, v0, Ltn1;->a:Lth1;

    .line 763
    .line 764
    iget-boolean v11, v0, Ltn1;->e:Z

    .line 765
    .line 766
    if-eqz v11, :cond_26

    .line 767
    .line 768
    iget-object v9, v9, Lth1;->m:Lth1;

    .line 769
    .line 770
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 771
    .line 772
    .line 773
    iget-object v9, v9, Lth1;->o:Lzn1;

    .line 774
    .line 775
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    iget-object v11, v0, Ltn1;->a:Lth1;

    .line 779
    .line 780
    invoke-static {v11}, Lsp0;->n(Lth1;)Lj61;

    .line 781
    .line 782
    .line 783
    move-result-object v11

    .line 784
    if-eqz v11, :cond_24

    .line 785
    .line 786
    new-instance v12, Ll61;

    .line 787
    .line 788
    iget-object v13, v2, Lvn1;->b:Ljava/lang/Object;

    .line 789
    .line 790
    check-cast v13, Lr61;

    .line 791
    .line 792
    invoke-direct {v12, v13, v11}, Ll61;-><init>(Lr61;Lj61;)V

    .line 793
    .line 794
    .line 795
    iget-object v11, v0, Ltn1;->a:Lth1;

    .line 796
    .line 797
    invoke-virtual {v11, v12}, Lth1;->L0(Lzn1;)V

    .line 798
    .line 799
    .line 800
    iget-object v11, v0, Ltn1;->a:Lth1;

    .line 801
    .line 802
    invoke-static {v2, v11, v12}, Lvn1;->a(Lvn1;Lth1;Lzn1;)V

    .line 803
    .line 804
    .line 805
    iget-object v11, v9, Lzn1;->x:Lzn1;

    .line 806
    .line 807
    iput-object v11, v12, Lzn1;->x:Lzn1;

    .line 808
    .line 809
    iput-object v9, v12, Lzn1;->w:Lzn1;

    .line 810
    .line 811
    iput-object v12, v9, Lzn1;->x:Lzn1;

    .line 812
    .line 813
    goto :goto_1f

    .line 814
    :cond_24
    iget-object v11, v0, Ltn1;->a:Lth1;

    .line 815
    .line 816
    invoke-virtual {v11, v9}, Lth1;->L0(Lzn1;)V

    .line 817
    .line 818
    .line 819
    :goto_1f
    iget-object v9, v0, Ltn1;->a:Lth1;

    .line 820
    .line 821
    invoke-virtual {v9}, Lth1;->C0()V

    .line 822
    .line 823
    .line 824
    iget-object v9, v0, Ltn1;->a:Lth1;

    .line 825
    .line 826
    invoke-virtual {v9}, Lth1;->I0()V

    .line 827
    .line 828
    .line 829
    iget-object v9, v0, Ltn1;->a:Lth1;

    .line 830
    .line 831
    sget-object v11, Lao1;->a:Lgk1;

    .line 832
    .line 833
    iget-boolean v11, v9, Lth1;->u:Z

    .line 834
    .line 835
    if-nez v11, :cond_25

    .line 836
    .line 837
    const-string v11, "autoInvalidateInsertedNode called on unattached node"

    .line 838
    .line 839
    invoke-static {v11}, Lkz0;->b(Ljava/lang/String;)V

    .line 840
    .line 841
    .line 842
    :cond_25
    const/4 v11, -0x1

    .line 843
    const/4 v12, 0x1

    .line 844
    invoke-static {v9, v11, v12}, Lao1;->a(Lth1;II)V

    .line 845
    .line 846
    .line 847
    goto :goto_20

    .line 848
    :cond_26
    const/4 v12, 0x1

    .line 849
    iput-boolean v12, v9, Lth1;->p:Z

    .line 850
    .line 851
    :goto_20
    add-int/lit8 v5, v5, 0x1

    .line 852
    .line 853
    goto :goto_1e

    .line 854
    :cond_27
    const/4 v12, 0x1

    .line 855
    :goto_21
    add-int/lit8 v7, v10, -0x1

    .line 856
    .line 857
    if-lez v10, :cond_20

    .line 858
    .line 859
    iget-object v9, v0, Ltn1;->a:Lth1;

    .line 860
    .line 861
    iget-object v9, v9, Lth1;->m:Lth1;

    .line 862
    .line 863
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 864
    .line 865
    .line 866
    iput-object v9, v0, Ltn1;->a:Lth1;

    .line 867
    .line 868
    iget-object v9, v0, Ltn1;->c:Lzk1;

    .line 869
    .line 870
    iget v10, v0, Ltn1;->b:I

    .line 871
    .line 872
    add-int v11, v10, v4

    .line 873
    .line 874
    iget-object v9, v9, Lzk1;->h:[Ljava/lang/Object;

    .line 875
    .line 876
    aget-object v9, v9, v11

    .line 877
    .line 878
    check-cast v9, Lsh1;

    .line 879
    .line 880
    iget-object v11, v0, Ltn1;->d:Lzk1;

    .line 881
    .line 882
    add-int/2addr v10, v5

    .line 883
    iget-object v11, v11, Lzk1;->h:[Ljava/lang/Object;

    .line 884
    .line 885
    aget-object v10, v11, v10

    .line 886
    .line 887
    check-cast v10, Lsh1;

    .line 888
    .line 889
    invoke-static {v9, v10}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 890
    .line 891
    .line 892
    move-result v11

    .line 893
    if-nez v11, :cond_28

    .line 894
    .line 895
    iget-object v11, v0, Ltn1;->a:Lth1;

    .line 896
    .line 897
    invoke-static {v9, v10, v11}, Lvn1;->B(Lsh1;Lsh1;Lth1;)V

    .line 898
    .line 899
    .line 900
    :cond_28
    add-int/lit8 v4, v4, 0x1

    .line 901
    .line 902
    add-int/lit8 v5, v5, 0x1

    .line 903
    .line 904
    move v10, v7

    .line 905
    goto :goto_21

    .line 906
    :cond_29
    iget-object v0, v1, Lvn1;->f:Ljava/lang/Object;

    .line 907
    .line 908
    check-cast v0, Lqx2;

    .line 909
    .line 910
    iget-object v0, v0, Lth1;->l:Lth1;

    .line 911
    .line 912
    move v10, v6

    .line 913
    :goto_22
    if-eqz v0, :cond_2a

    .line 914
    .line 915
    iget-object v2, v1, Lvn1;->c:Ljava/lang/Object;

    .line 916
    .line 917
    check-cast v2, Lun1;

    .line 918
    .line 919
    if-eq v0, v2, :cond_2a

    .line 920
    .line 921
    iget v2, v0, Lth1;->j:I

    .line 922
    .line 923
    or-int/2addr v10, v2

    .line 924
    iput v10, v0, Lth1;->k:I

    .line 925
    .line 926
    iget-object v0, v0, Lth1;->l:Lth1;

    .line 927
    .line 928
    goto :goto_22

    .line 929
    :cond_2a
    return-void
.end method
