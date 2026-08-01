.class public final Lh40;
.super Ljava/lang/Object;


# static fields
.field public static final l:Lqh;

.field public static final m:Lqh;

.field public static final n:Lqh;

.field public static final o:Lqh;

.field public static final p:Lqh;

.field public static final q:Lqh;

.field public static final r:Lqh;

.field public static final s:Lqh;


# instance fields
.field public a:F

.field public b:F

.field public final c:Ljava/lang/Object;

.field public final d:Lip;

.field public e:Z

.field public f:J

.field public g:F

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/ArrayList;

.field public j:Li40;

.field public k:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lqh;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lqh;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lh40;->l:Lqh;

    .line 8
    .line 9
    new-instance v0, Lqh;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {v0, v1}, Lqh;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lh40;->m:Lqh;

    .line 16
    .line 17
    new-instance v0, Lqh;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, v1}, Lqh;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lh40;->n:Lqh;

    .line 24
    .line 25
    new-instance v0, Lqh;

    .line 26
    .line 27
    const/4 v1, 0x4

    .line 28
    invoke-direct {v0, v1}, Lqh;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lh40;->o:Lqh;

    .line 32
    .line 33
    new-instance v0, Lqh;

    .line 34
    .line 35
    const/4 v1, 0x5

    .line 36
    invoke-direct {v0, v1}, Lqh;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lh40;->p:Lqh;

    .line 40
    .line 41
    new-instance v0, Lqh;

    .line 42
    .line 43
    const/4 v1, 0x6

    .line 44
    invoke-direct {v0, v1}, Lqh;-><init>(I)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lh40;->q:Lqh;

    .line 48
    .line 49
    new-instance v0, Lqh;

    .line 50
    .line 51
    const/4 v1, 0x7

    .line 52
    invoke-direct {v0, v1}, Lqh;-><init>(I)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lh40;->r:Lqh;

    .line 56
    .line 57
    new-instance v0, Lqh;

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    invoke-direct {v0, v1}, Lqh;-><init>(I)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lh40;->s:Lqh;

    .line 64
    .line 65
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lip;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lh40;->a:F

    .line 6
    .line 7
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 8
    .line 9
    .line 10
    iput v0, p0, Lh40;->b:F

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-boolean v1, p0, Lh40;->e:Z

    .line 14
    .line 15
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    iput-wide v1, p0, Lh40;->f:J

    .line 18
    .line 19
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lh40;->h:Ljava/util/ArrayList;

    .line 25
    .line 26
    new-instance v1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lh40;->i:Ljava/util/ArrayList;

    .line 32
    .line 33
    iput-object p1, p0, Lh40;->c:Ljava/lang/Object;

    .line 34
    .line 35
    iput-object p2, p0, Lh40;->d:Lip;

    .line 36
    .line 37
    sget-object p1, Lh40;->p:Lqh;

    .line 38
    .line 39
    if-eq p2, p1, :cond_4

    .line 40
    .line 41
    sget-object p1, Lh40;->q:Lqh;

    .line 42
    .line 43
    if-eq p2, p1, :cond_4

    .line 44
    .line 45
    sget-object p1, Lh40;->r:Lqh;

    .line 46
    .line 47
    if-ne p2, p1, :cond_0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    sget-object p1, Lh40;->s:Lqh;

    .line 51
    .line 52
    const/high16 v1, 0x3b800000    # 0.00390625f

    .line 53
    .line 54
    if-ne p2, p1, :cond_1

    .line 55
    .line 56
    iput v1, p0, Lh40;->g:F

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_1
    sget-object p1, Lh40;->n:Lqh;

    .line 60
    .line 61
    if-eq p2, p1, :cond_3

    .line 62
    .line 63
    sget-object p1, Lh40;->o:Lqh;

    .line 64
    .line 65
    if-ne p2, p1, :cond_2

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 69
    .line 70
    iput p1, p0, Lh40;->g:F

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    :goto_0
    iput v1, p0, Lh40;->g:F

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    :goto_1
    const p1, 0x3dcccccd    # 0.1f

    .line 77
    .line 78
    .line 79
    iput p1, p0, Lh40;->g:F

    .line 80
    .line 81
    :goto_2
    const/4 p1, 0x0

    .line 82
    iput-object p1, p0, Lh40;->j:Li40;

    .line 83
    .line 84
    iput v0, p0, Lh40;->k:F

    .line 85
    .line 86
    return-void
.end method


# virtual methods
.method public final a(Lsh;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lh40;->h:Ljava/util/ArrayList;

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
    iget-boolean v0, p0, Lh40;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lh40;->k:F

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lh40;->j:Li40;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    new-instance v0, Li40;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Li40;-><init>(F)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lh40;->j:Li40;

    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, Lh40;->j:Li40;

    .line 20
    .line 21
    float-to-double v1, p1

    .line 22
    iput-wide v1, v0, Li40;->i:D

    .line 23
    .line 24
    invoke-virtual {p0}, Lh40;->h()V

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
    iget-boolean v0, p0, Lh40;->e:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-virtual {p0, v0}, Lh40;->d(Z)V

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
    iput-boolean p1, p0, Lh40;->e:Z

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
    iget-object v1, v0, Lp2;->a:Lu30;

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Lu30;->remove(Ljava/lang/Object;)Ljava/lang/Object;

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
    iput-wide v0, p0, Lh40;->f:J

    .line 49
    .line 50
    :goto_0
    iget-object v0, p0, Lh40;->h:Ljava/util/ArrayList;

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
    check-cast v0, Lsh;

    .line 69
    .line 70
    invoke-interface {v0}, Lsh;->a()V

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

.method public final e(Lsh;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lh40;->h:Ljava/util/ArrayList;

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
    iput p1, p0, Lh40;->g:F

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
    iget-object v0, p0, Lh40;->d:Lip;

    .line 2
    .line 3
    iget-object v1, p0, Lh40;->c:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lip;->V(Ljava/lang/Object;F)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    :goto_0
    iget-object v0, p0, Lh40;->i:Ljava/util/ArrayList;

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
    check-cast v0, Ll9;

    .line 28
    .line 29
    iget v1, p0, Lh40;->b:F

    .line 30
    .line 31
    iget v2, p0, Lh40;->a:F

    .line 32
    .line 33
    iget v3, v0, Ll9;->a:I

    .line 34
    .line 35
    iget-object v0, v0, Ll9;->b:Ljava/lang/Object;

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
    check-cast v0, Li00;

    .line 65
    .line 66
    iget-object v0, v0, Li00;->b:Ljava/lang/Object;

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
    iget-object v0, p0, Lh40;->j:Li40;

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    iget-wide v1, v0, Li40;->i:D

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
    const v4, -0x800001

    .line 18
    .line 19
    .line 20
    float-to-double v5, v4

    .line 21
    cmpg-double v1, v1, v5

    .line 22
    .line 23
    if-ltz v1, :cond_6

    .line 24
    .line 25
    iget v1, p0, Lh40;->g:F

    .line 26
    .line 27
    const/high16 v2, 0x3f400000    # 0.75f

    .line 28
    .line 29
    mul-float/2addr v1, v2

    .line 30
    float-to-double v1, v1

    .line 31
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    iput-wide v1, v0, Li40;->d:D

    .line 36
    .line 37
    const-wide v5, 0x404f400000000000L    # 62.5

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    mul-double/2addr v1, v5

    .line 43
    iput-wide v1, v0, Li40;->e:D

    .line 44
    .line 45
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-ne v0, v1, :cond_5

    .line 54
    .line 55
    iget-boolean v0, p0, Lh40;->e:Z

    .line 56
    .line 57
    if-nez v0, :cond_4

    .line 58
    .line 59
    if-nez v0, :cond_4

    .line 60
    .line 61
    const/4 v0, 0x1

    .line 62
    iput-boolean v0, p0, Lh40;->e:Z

    .line 63
    .line 64
    iget-object v0, p0, Lh40;->d:Lip;

    .line 65
    .line 66
    iget-object v1, p0, Lh40;->c:Ljava/lang/Object;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Lip;->y(Ljava/lang/Object;)F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iput v0, p0, Lh40;->b:F

    .line 73
    .line 74
    cmpl-float v1, v0, v3

    .line 75
    .line 76
    if-gtz v1, :cond_3

    .line 77
    .line 78
    cmpg-float v0, v0, v4

    .line 79
    .line 80
    if-ltz v0, :cond_3

    .line 81
    .line 82
    sget-object v0, Lp2;->f:Ljava/lang/ThreadLocal;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-nez v1, :cond_0

    .line 89
    .line 90
    new-instance v1, Lp2;

    .line 91
    .line 92
    invoke-direct {v1}, Lp2;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Lp2;

    .line 103
    .line 104
    iget-object v1, v0, Lp2;->b:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-nez v2, :cond_2

    .line 111
    .line 112
    iget-object v2, v0, Lp2;->d:Lr5;

    .line 113
    .line 114
    if-nez v2, :cond_1

    .line 115
    .line 116
    new-instance v2, Lr5;

    .line 117
    .line 118
    iget-object v3, v0, Lp2;->c:Ll0;

    .line 119
    .line 120
    invoke-direct {v2, v3}, Lr5;-><init>(Ll0;)V

    .line 121
    .line 122
    .line 123
    iput-object v2, v0, Lp2;->d:Lr5;

    .line 124
    .line 125
    :cond_1
    iget-object v0, v0, Lp2;->d:Lr5;

    .line 126
    .line 127
    iget-object v2, v0, Lr5;->c:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v2, Landroid/view/Choreographer;

    .line 130
    .line 131
    iget-object v0, v0, Lr5;->d:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, Lo2;

    .line 134
    .line 135
    invoke-virtual {v2, v0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 136
    .line 137
    .line 138
    :cond_2
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-nez v0, :cond_4

    .line 143
    .line 144
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 149
    .line 150
    const-string v1, "Starting value need to be in between min value and max value"

    .line 151
    .line 152
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v0

    .line 156
    :cond_4
    return-void

    .line 157
    :cond_5
    new-instance v0, Landroid/util/AndroidRuntimeException;

    .line 158
    .line 159
    const-string v1, "Animations may only be started on the main thread"

    .line 160
    .line 161
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v0

    .line 165
    :cond_6
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 166
    .line 167
    const-string v1, "Final position of the spring cannot be less than the min value."

    .line 168
    .line 169
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v0

    .line 173
    :cond_7
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 174
    .line 175
    const-string v1, "Final position of the spring cannot be greater than the max value."

    .line 176
    .line 177
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw v0

    .line 181
    :cond_8
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 182
    .line 183
    const-string v1, "Incomplete SpringAnimation: Either final position or a spring force needs to be set."

    .line 184
    .line 185
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    throw v0
.end method
