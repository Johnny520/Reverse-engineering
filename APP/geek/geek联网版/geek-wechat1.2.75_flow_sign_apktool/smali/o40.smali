.class public final Lo40;
.super Ljava/lang/Object;


# static fields
.field public static final m:Lsh;

.field public static final n:Lsh;

.field public static final o:Lsh;

.field public static final p:Lsh;

.field public static final q:Lsh;

.field public static final r:Lsh;

.field public static final s:Lsh;

.field public static final t:Lsh;


# instance fields
.field public a:F

.field public b:F

.field public final c:Ljava/lang/Object;

.field public final d:Lgf;

.field public e:Z

.field public final f:F

.field public g:J

.field public h:F

.field public final i:Ljava/util/ArrayList;

.field public final j:Ljava/util/ArrayList;

.field public k:Lp40;

.field public l:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lsh;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lsh;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lo40;->m:Lsh;

    .line 8
    .line 9
    new-instance v0, Lsh;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {v0, v1}, Lsh;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lo40;->n:Lsh;

    .line 16
    .line 17
    new-instance v0, Lsh;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, v1}, Lsh;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lo40;->o:Lsh;

    .line 24
    .line 25
    new-instance v0, Lsh;

    .line 26
    .line 27
    const/4 v1, 0x4

    .line 28
    invoke-direct {v0, v1}, Lsh;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lo40;->p:Lsh;

    .line 32
    .line 33
    new-instance v0, Lsh;

    .line 34
    .line 35
    const/4 v1, 0x5

    .line 36
    invoke-direct {v0, v1}, Lsh;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lo40;->q:Lsh;

    .line 40
    .line 41
    new-instance v0, Lsh;

    .line 42
    .line 43
    const/4 v1, 0x6

    .line 44
    invoke-direct {v0, v1}, Lsh;-><init>(I)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lo40;->r:Lsh;

    .line 48
    .line 49
    new-instance v0, Lsh;

    .line 50
    .line 51
    const/4 v1, 0x7

    .line 52
    invoke-direct {v0, v1}, Lsh;-><init>(I)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lo40;->s:Lsh;

    .line 56
    .line 57
    new-instance v0, Lsh;

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    invoke-direct {v0, v1}, Lsh;-><init>(I)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lo40;->t:Lsh;

    .line 64
    .line 65
    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lgf;F)V
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, p2, v0}, Lo40;-><init>(Ljava/lang/Object;Lgf;I)V

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lo40;->k:Lp40;

    const p1, 0x7f7fffff    # Float.MAX_VALUE

    .line 6
    iput p1, p0, Lo40;->l:F

    .line 7
    new-instance p1, Lp40;

    invoke-direct {p1, p3}, Lp40;-><init>(F)V

    iput-object p1, p0, Lo40;->k:Lp40;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lgf;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lo40;-><init>(Ljava/lang/Object;Lgf;I)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lo40;->k:Lp40;

    const p1, 0x7f7fffff    # Float.MAX_VALUE

    .line 3
    iput p1, p0, Lo40;->l:F

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lgf;I)V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p3, 0x0

    .line 9
    iput p3, p0, Lo40;->a:F

    const p3, 0x7f7fffff    # Float.MAX_VALUE

    .line 10
    iput p3, p0, Lo40;->b:F

    const/4 p3, 0x0

    .line 11
    iput-boolean p3, p0, Lo40;->e:Z

    const p3, -0x800001

    .line 12
    iput p3, p0, Lo40;->f:F

    const-wide/16 v0, 0x0

    .line 13
    iput-wide v0, p0, Lo40;->g:J

    .line 14
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lo40;->i:Ljava/util/ArrayList;

    .line 15
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lo40;->j:Ljava/util/ArrayList;

    .line 16
    iput-object p1, p0, Lo40;->c:Ljava/lang/Object;

    .line 17
    iput-object p2, p0, Lo40;->d:Lgf;

    .line 18
    sget-object p1, Lo40;->q:Lsh;

    if-eq p2, p1, :cond_4

    sget-object p1, Lo40;->r:Lsh;

    if-eq p2, p1, :cond_4

    sget-object p1, Lo40;->s:Lsh;

    if-ne p2, p1, :cond_0

    goto :goto_1

    .line 19
    :cond_0
    sget-object p1, Lo40;->t:Lsh;

    const/high16 p3, 0x3b800000    # 0.00390625f

    if-ne p2, p1, :cond_1

    .line 20
    iput p3, p0, Lo40;->h:F

    return-void

    .line 21
    :cond_1
    sget-object p1, Lo40;->o:Lsh;

    if-eq p2, p1, :cond_3

    sget-object p1, Lo40;->p:Lsh;

    if-ne p2, p1, :cond_2

    goto :goto_0

    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 22
    iput p1, p0, Lo40;->h:F

    return-void

    .line 23
    :cond_3
    :goto_0
    iput p3, p0, Lo40;->h:F

    return-void

    :cond_4
    :goto_1
    const p1, 0x3dcccccd    # 0.1f

    .line 24
    iput p1, p0, Lo40;->h:F

    return-void
.end method


# virtual methods
.method public final a(Luh;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo40;->i:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final b(F)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lo40;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lo40;->l:F

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lo40;->k:Lp40;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    new-instance v0, Lp40;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lp40;-><init>(F)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lo40;->k:Lp40;

    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, Lo40;->k:Lp40;

    .line 20
    .line 21
    float-to-double v1, p1

    .line 22
    iput-wide v1, v0, Lp40;->i:D

    .line 23
    .line 24
    invoke-virtual {p0}, Lo40;->h()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, Lo40;->e:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-virtual {p0, v0}, Lo40;->d(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :cond_1
    new-instance v0, Landroid/util/AndroidRuntimeException;

    .line 21
    .line 22
    const-string v1, "Animations may only be canceled on the main thread"

    .line 23
    .line 24
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0
.end method

.method public final d(Z)V
    .locals 5

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lo40;->e:Z

    .line 3
    .line 4
    sget-object v0, Lp2;->f:Ljava/lang/ThreadLocal;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lp2;

    .line 13
    .line 14
    invoke-direct {v1}, Lp2;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lp2;

    .line 25
    .line 26
    iget-object v1, v0, Lp2;->a:Lb40;

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Lb40;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, Lp2;->b:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const/4 v3, 0x1

    .line 38
    if-ltz v2, :cond_1

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-virtual {v1, v2, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    iput-boolean v3, v0, Lp2;->e:Z

    .line 45
    .line 46
    :cond_1
    const-wide/16 v0, 0x0

    .line 47
    .line 48
    iput-wide v0, p0, Lo40;->g:J

    .line 49
    .line 50
    :goto_0
    iget-object v0, p0, Lo40;->i:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-ge p1, v1, :cond_3

    .line 57
    .line 58
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Luh;

    .line 69
    .line 70
    invoke-interface {v0}, Luh;->a()V

    .line 71
    .line 72
    .line 73
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    sub-int/2addr p1, v3

    .line 81
    :goto_1
    if-ltz p1, :cond_5

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    if-nez v1, :cond_4

    .line 88
    .line 89
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    :cond_4
    add-int/lit8 p1, p1, -0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_5
    return-void
.end method

.method public final e(Luh;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo40;->i:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-ltz p1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, p1, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final f(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p1, v0

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lo40;->h:F

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    const-string v0, "Minimum visible change must be positive."

    .line 12
    .line 13
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p1
.end method

.method public final g(F)V
    .locals 4

    .line 1
    iget-object v0, p0, Lo40;->d:Lgf;

    .line 2
    .line 3
    iget-object v1, p0, Lo40;->c:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lgf;->U(Ljava/lang/Object;F)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    :goto_0
    iget-object v0, p0, Lo40;->j:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-ge p1, v1, :cond_2

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lw9;

    .line 28
    .line 29
    iget v1, p0, Lo40;->b:F

    .line 30
    .line 31
    iget v2, p0, Lo40;->a:F

    .line 32
    .line 33
    iget v3, v0, Lw9;->a:I

    .line 34
    .line 35
    iget-object v0, v0, Lw9;->b:Ljava/lang/Object;

    .line 36
    .line 37
    packed-switch v3, :pswitch_data_0

    .line 38
    .line 39
    .line 40
    check-cast v0, Landroid/view/View;

    .line 41
    .line 42
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const v2, 0x455ac000    # 3500.0f

    .line 47
    .line 48
    .line 49
    div-float/2addr v1, v2

    .line 50
    const/high16 v2, 0x3f800000    # 1.0f

    .line 51
    .line 52
    add-float/2addr v1, v2

    .line 53
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 54
    .line 55
    cmpl-float v3, v1, v2

    .line 56
    .line 57
    if-lez v3, :cond_0

    .line 58
    .line 59
    move v1, v2

    .line 60
    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleX(F)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :pswitch_0
    check-cast v0, Lp00;

    .line 65
    .line 66
    iget-object v0, v0, Lp00;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Landroid/view/View;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleY(F)V

    .line 71
    .line 72
    .line 73
    :cond_1
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    add-int/lit8 p1, p1, -0x1

    .line 81
    .line 82
    :goto_2
    if-ltz p1, :cond_4

    .line 83
    .line 84
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-nez v1, :cond_3

    .line 89
    .line 90
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    :cond_3
    add-int/lit8 p1, p1, -0x1

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    return-void

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h()V
    .locals 7

    .line 1
    iget-object v0, p0, Lo40;->k:Lp40;

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    iget-wide v1, v0, Lp40;->i:D

    .line 6
    .line 7
    double-to-float v1, v1

    .line 8
    float-to-double v1, v1

    .line 9
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 10
    .line 11
    .line 12
    float-to-double v4, v3

    .line 13
    cmpl-double v4, v1, v4

    .line 14
    .line 15
    if-gtz v4, :cond_7

    .line 16
    .line 17
    iget v4, p0, Lo40;->f:F

    .line 18
    .line 19
    float-to-double v5, v4

    .line 20
    cmpg-double v1, v1, v5

    .line 21
    .line 22
    if-ltz v1, :cond_6

    .line 23
    .line 24
    iget v1, p0, Lo40;->h:F

    .line 25
    .line 26
    const/high16 v2, 0x3f400000    # 0.75f

    .line 27
    .line 28
    mul-float/2addr v1, v2

    .line 29
    float-to-double v1, v1

    .line 30
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    iput-wide v1, v0, Lp40;->d:D

    .line 35
    .line 36
    const-wide v5, 0x404f400000000000L    # 62.5

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    mul-double/2addr v1, v5

    .line 42
    iput-wide v1, v0, Lp40;->e:D

    .line 43
    .line 44
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    if-ne v0, v1, :cond_5

    .line 53
    .line 54
    iget-boolean v0, p0, Lo40;->e:Z

    .line 55
    .line 56
    if-nez v0, :cond_4

    .line 57
    .line 58
    if-nez v0, :cond_4

    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    iput-boolean v0, p0, Lo40;->e:Z

    .line 62
    .line 63
    iget-object v0, p0, Lo40;->d:Lgf;

    .line 64
    .line 65
    iget-object v1, p0, Lo40;->c:Ljava/lang/Object;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Lgf;->z(Ljava/lang/Object;)F

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iput v0, p0, Lo40;->b:F

    .line 72
    .line 73
    cmpl-float v1, v0, v3

    .line 74
    .line 75
    if-gtz v1, :cond_3

    .line 76
    .line 77
    cmpg-float v0, v0, v4

    .line 78
    .line 79
    if-ltz v0, :cond_3

    .line 80
    .line 81
    sget-object v0, Lp2;->f:Ljava/lang/ThreadLocal;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    if-nez v1, :cond_0

    .line 88
    .line 89
    new-instance v1, Lp2;

    .line 90
    .line 91
    invoke-direct {v1}, Lp2;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Lp2;

    .line 102
    .line 103
    iget-object v1, v0, Lp2;->b:Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-nez v2, :cond_2

    .line 110
    .line 111
    iget-object v2, v0, Lp2;->d:Lr5;

    .line 112
    .line 113
    if-nez v2, :cond_1

    .line 114
    .line 115
    new-instance v2, Lr5;

    .line 116
    .line 117
    iget-object v3, v0, Lp2;->c:Ll0;

    .line 118
    .line 119
    invoke-direct {v2, v3}, Lr5;-><init>(Ll0;)V

    .line 120
    .line 121
    .line 122
    iput-object v2, v0, Lp2;->d:Lr5;

    .line 123
    .line 124
    :cond_1
    iget-object v0, v0, Lp2;->d:Lr5;

    .line 125
    .line 126
    iget-object v2, v0, Lr5;->c:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v2, Landroid/view/Choreographer;

    .line 129
    .line 130
    iget-object v0, v0, Lr5;->d:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, Lo2;

    .line 133
    .line 134
    invoke-virtual {v2, v0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 135
    .line 136
    .line 137
    :cond_2
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-nez v0, :cond_4

    .line 142
    .line 143
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 148
    .line 149
    const-string v1, "Starting value need to be in between min value and max value"

    .line 150
    .line 151
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw v0

    .line 155
    :cond_4
    return-void

    .line 156
    :cond_5
    new-instance v0, Landroid/util/AndroidRuntimeException;

    .line 157
    .line 158
    const-string v1, "Animations may only be started on the main thread"

    .line 159
    .line 160
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw v0

    .line 164
    :cond_6
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 165
    .line 166
    const-string v1, "Final position of the spring cannot be less than the min value."

    .line 167
    .line 168
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw v0

    .line 172
    :cond_7
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 173
    .line 174
    const-string v1, "Final position of the spring cannot be greater than the max value."

    .line 175
    .line 176
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw v0

    .line 180
    :cond_8
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 181
    .line 182
    const-string v1, "Incomplete SpringAnimation: Either final position or a spring force needs to be set."

    .line 183
    .line 184
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw v0
.end method
