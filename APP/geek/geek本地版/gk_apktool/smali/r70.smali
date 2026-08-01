.class public abstract Lr70;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final t:[I

.field public static final u:Liy;

.field public static final v:Ljava/lang/ThreadLocal;


# instance fields
.field public final a:Ljava/lang/String;

.field public b:J

.field public c:J

.field public d:Landroid/animation/TimeInterpolator;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public g:La8;

.field public h:La8;

.field public i:Lz6;

.field public final j:[I

.field public k:Ljava/util/ArrayList;

.field public l:Ljava/util/ArrayList;

.field public final m:Ljava/util/ArrayList;

.field public n:I

.field public o:Z

.field public p:Z

.field public q:Ljava/util/ArrayList;

.field public r:Ljava/util/ArrayList;

.field public s:Liy;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x4

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x1

    .line 5
    filled-new-array {v2, v3, v0, v1}, [I

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lr70;->t:[I

    .line 10
    .line 11
    new-instance v0, Liy;

    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-direct {v0, v1}, Liy;-><init>(I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lr70;->u:Liy;

    .line 19
    .line 20
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lr70;->v:Ljava/lang/ThreadLocal;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lr70;->a:Ljava/lang/String;

    .line 13
    .line 14
    const-wide/16 v0, -0x1

    .line 15
    .line 16
    iput-wide v0, p0, Lr70;->b:J

    .line 17
    .line 18
    iput-wide v0, p0, Lr70;->c:J

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lr70;->d:Landroid/animation/TimeInterpolator;

    .line 22
    .line 23
    new-instance v1, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lr70;->e:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance v1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lr70;->f:Ljava/util/ArrayList;

    .line 36
    .line 37
    new-instance v1, La8;

    .line 38
    .line 39
    const/4 v2, 0x4

    .line 40
    invoke-direct {v1, v2}, La8;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Lr70;->g:La8;

    .line 44
    .line 45
    new-instance v1, La8;

    .line 46
    .line 47
    invoke-direct {v1, v2}, La8;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iput-object v1, p0, Lr70;->h:La8;

    .line 51
    .line 52
    iput-object v0, p0, Lr70;->i:Lz6;

    .line 53
    .line 54
    sget-object v1, Lr70;->t:[I

    .line 55
    .line 56
    iput-object v1, p0, Lr70;->j:[I

    .line 57
    .line 58
    new-instance v1, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v1, p0, Lr70;->m:Ljava/util/ArrayList;

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    iput v1, p0, Lr70;->n:I

    .line 67
    .line 68
    iput-boolean v1, p0, Lr70;->o:Z

    .line 69
    .line 70
    iput-boolean v1, p0, Lr70;->p:Z

    .line 71
    .line 72
    iput-object v0, p0, Lr70;->q:Ljava/util/ArrayList;

    .line 73
    .line 74
    new-instance v0, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Lr70;->r:Ljava/util/ArrayList;

    .line 80
    .line 81
    sget-object v0, Lr70;->u:Liy;

    .line 82
    .line 83
    iput-object v0, p0, Lr70;->s:Liy;

    .line 84
    .line 85
    return-void
.end method

.method public static b(La8;Landroid/view/View;Lx70;)V
    .locals 4

    .line 1
    iget-object v0, p0, La8;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ln6;

    .line 4
    .line 5
    iget-object v1, p0, La8;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ln6;

    .line 8
    .line 9
    iget-object v2, p0, La8;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Landroid/util/SparseArray;

    .line 12
    .line 13
    iget-object p0, p0, La8;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lbs;

    .line 16
    .line 17
    invoke-virtual {v0, p1, p2}, Lu30;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    const/4 v0, 0x0

    .line 25
    if-ltz p2, :cond_1

    .line 26
    .line 27
    invoke-virtual {v2, p2}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-ltz v3, :cond_0

    .line 32
    .line 33
    invoke-virtual {v2, p2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v2, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    sget-object p2, Lja0;->a:Ljava/util/WeakHashMap;

    .line 41
    .line 42
    invoke-static {p1}, Ly90;->k(Landroid/view/View;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    if-eqz p2, :cond_3

    .line 47
    .line 48
    invoke-virtual {v1, p2}, Lu30;->containsKey(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    invoke-virtual {v1, p2, v0}, Lu30;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-virtual {v1, p2, p1}, Lu30;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    :cond_3
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    instance-of p2, p2, Landroid/widget/ListView;

    .line 66
    .line 67
    if-eqz p2, :cond_6

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    check-cast p2, Landroid/widget/ListView;

    .line 74
    .line 75
    invoke-virtual {p2}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-interface {v1}, Landroid/widget/Adapter;->hasStableIds()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_6

    .line 84
    .line 85
    invoke-virtual {p2, p1}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    invoke-virtual {p2, v1}, Landroid/widget/AdapterView;->getItemIdAtPosition(I)J

    .line 90
    .line 91
    .line 92
    move-result-wide v1

    .line 93
    iget-boolean p2, p0, Lbs;->a:Z

    .line 94
    .line 95
    if-eqz p2, :cond_4

    .line 96
    .line 97
    invoke-virtual {p0}, Lbs;->b()V

    .line 98
    .line 99
    .line 100
    :cond_4
    iget-object p2, p0, Lbs;->b:[J

    .line 101
    .line 102
    iget v3, p0, Lbs;->d:I

    .line 103
    .line 104
    invoke-static {p2, v3, v1, v2}, Lff;->d([JIJ)I

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-ltz p2, :cond_5

    .line 109
    .line 110
    invoke-virtual {p0, v1, v2, v0}, Lbs;->c(JLjava/lang/Long;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, Landroid/view/View;

    .line 115
    .line 116
    if-eqz p1, :cond_6

    .line 117
    .line 118
    const/4 p2, 0x0

    .line 119
    invoke-static {p1, p2}, Ls90;->r(Landroid/view/View;Z)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v1, v2, v0}, Lbs;->d(JLjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_5
    const/4 p2, 0x1

    .line 127
    invoke-static {p1, p2}, Ls90;->r(Landroid/view/View;Z)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v1, v2, p1}, Lbs;->d(JLjava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_6
    return-void
.end method

.method public static n()Ln6;
    .locals 2

    .line 1
    sget-object v0, Lr70;->v:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ln6;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    new-instance v1, Ln6;

    .line 12
    .line 13
    invoke-direct {v1}, Lu30;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-object v1
.end method

.method public static s(Lx70;Lx70;Ljava/lang/String;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lx70;->a:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p1, p1, Lx70;->a:Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p2, 0x1

    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    xor-int/2addr p0, p2

    .line 30
    return p0

    .line 31
    :cond_2
    :goto_0
    return p2
.end method


# virtual methods
.method public A(Liy;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lr70;->u:Liy;

    .line 4
    .line 5
    iput-object p1, p0, Lr70;->s:Liy;

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iput-object p1, p0, Lr70;->s:Liy;

    .line 9
    .line 10
    return-void
.end method

.method public B()V
    .locals 0

    .line 1
    return-void
.end method

.method public C(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lr70;->b:J

    .line 2
    .line 3
    return-void
.end method

.method public final D()V
    .locals 5

    .line 1
    iget v0, p0, Lr70;->n:I

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lr70;->q:Ljava/util/ArrayList;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lr70;->q:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    move v3, v1

    .line 29
    :goto_0
    if-ge v3, v2, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Lq70;

    .line 36
    .line 37
    invoke-interface {v4}, Lq70;->b()V

    .line 38
    .line 39
    .line 40
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iput-boolean v1, p0, Lr70;->p:Z

    .line 44
    .line 45
    :cond_1
    iget v0, p0, Lr70;->n:I

    .line 46
    .line 47
    add-int/lit8 v0, v0, 0x1

    .line 48
    .line 49
    iput v0, p0, Lr70;->n:I

    .line 50
    .line 51
    return-void
.end method

.method public E(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p1, "@"

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p1, ": "

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-wide v0, p0, Lr70;->c:J

    .line 46
    .line 47
    const-wide/16 v2, -0x1

    .line 48
    .line 49
    cmp-long v0, v0, v2

    .line 50
    .line 51
    const-string v1, ") "

    .line 52
    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p1, "dur("

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-wide v4, p0, Lr70;->c:J

    .line 69
    .line 70
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    :cond_0
    iget-wide v4, p0, Lr70;->b:J

    .line 81
    .line 82
    cmp-long v0, v4, v2

    .line 83
    .line 84
    if-eqz v0, :cond_1

    .line 85
    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string p1, "dly("

    .line 95
    .line 96
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    iget-wide v2, p0, Lr70;->b:J

    .line 100
    .line 101
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    :cond_1
    iget-object v0, p0, Lr70;->d:Landroid/animation/TimeInterpolator;

    .line 112
    .line 113
    if-eqz v0, :cond_2

    .line 114
    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string p1, "interp("

    .line 124
    .line 125
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, Lr70;->d:Landroid/animation/TimeInterpolator;

    .line 129
    .line 130
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    :cond_2
    iget-object v0, p0, Lr70;->e:Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    iget-object v2, p0, Lr70;->f:Ljava/util/ArrayList;

    .line 147
    .line 148
    if-gtz v1, :cond_4

    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-lez v1, :cond_3

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_3
    return-object p1

    .line 158
    :cond_4
    :goto_0
    const-string v1, "tgts("

    .line 159
    .line 160
    invoke-static {p1, v1}, Lz30;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    const-string v3, ", "

    .line 169
    .line 170
    const/4 v4, 0x0

    .line 171
    if-lez v1, :cond_6

    .line 172
    .line 173
    move v1, v4

    .line 174
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    if-ge v1, v5, :cond_6

    .line 179
    .line 180
    if-lez v1, :cond_5

    .line 181
    .line 182
    invoke-static {p1, v3}, Lz30;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    :cond_5
    new-instance v5, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    add-int/lit8 v1, v1, 0x1

    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-lez v0, :cond_8

    .line 213
    .line 214
    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-ge v4, v0, :cond_8

    .line 219
    .line 220
    if-lez v4, :cond_7

    .line 221
    .line 222
    invoke-static {p1, v3}, Lz30;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    add-int/lit8 v4, v4, 0x1

    .line 246
    .line 247
    goto :goto_2

    .line 248
    :cond_8
    const-string v0, ")"

    .line 249
    .line 250
    invoke-static {p1, v0}, Lz30;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    return-object p1
.end method

.method public a(Lq70;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr70;->q:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lr70;->q:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lr70;->q:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public abstract c(Lx70;)V
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr70;->i()Lr70;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final d(Landroid/view/View;Z)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_3

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v0, v0, Landroid/view/ViewGroup;

    .line 12
    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    new-instance v0, Lx70;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Lx70;-><init>(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lr70;->f(Lx70;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p0, v0}, Lr70;->c(Lx70;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v0, Lx70;->c:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lr70;->e(Lx70;)V

    .line 35
    .line 36
    .line 37
    if-eqz p2, :cond_2

    .line 38
    .line 39
    iget-object v1, p0, Lr70;->g:La8;

    .line 40
    .line 41
    invoke-static {v1, p1, v0}, Lr70;->b(La8;Landroid/view/View;Lx70;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    iget-object v1, p0, Lr70;->h:La8;

    .line 46
    .line 47
    invoke-static {v1, p1, v0}, Lr70;->b(La8;Landroid/view/View;Lx70;)V

    .line 48
    .line 49
    .line 50
    :cond_3
    :goto_1
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 51
    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    check-cast p1, Landroid/view/ViewGroup;

    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    :goto_2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-ge v0, v1, :cond_4

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {p0, v1, p2}, Lr70;->d(Landroid/view/View;Z)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v0, v0, 0x1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    :goto_3
    return-void
.end method

.method public e(Lx70;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract f(Lx70;)V
.end method

.method public final g(Landroid/view/ViewGroup;Z)V
    .locals 7

    .line 1
    invoke-virtual {p0, p2}, Lr70;->h(Z)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lr70;->e:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    iget-object v2, p0, Lr70;->f:Ljava/util/ArrayList;

    .line 11
    .line 12
    if-gtz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-lez v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0, p1, p2}, Lr70;->d(Landroid/view/View;Z)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 26
    move v3, v1

    .line 27
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-ge v3, v4, :cond_5

    .line 32
    .line 33
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    if-eqz v4, :cond_4

    .line 48
    .line 49
    new-instance v5, Lx70;

    .line 50
    .line 51
    invoke-direct {v5, v4}, Lx70;-><init>(Landroid/view/View;)V

    .line 52
    .line 53
    .line 54
    if-eqz p2, :cond_2

    .line 55
    .line 56
    invoke-virtual {p0, v5}, Lr70;->f(Lx70;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    invoke-virtual {p0, v5}, Lr70;->c(Lx70;)V

    .line 61
    .line 62
    .line 63
    :goto_2
    iget-object v6, v5, Lx70;->c:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v6, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v5}, Lr70;->e(Lx70;)V

    .line 69
    .line 70
    .line 71
    if-eqz p2, :cond_3

    .line 72
    .line 73
    iget-object v6, p0, Lr70;->g:La8;

    .line 74
    .line 75
    invoke-static {v6, v4, v5}, Lr70;->b(La8;Landroid/view/View;Lx70;)V

    .line 76
    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_3
    iget-object v6, p0, Lr70;->h:La8;

    .line 80
    .line 81
    invoke-static {v6, v4, v5}, Lr70;->b(La8;Landroid/view/View;Lx70;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    :goto_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-ge v1, p1, :cond_8

    .line 92
    .line 93
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, Landroid/view/View;

    .line 98
    .line 99
    new-instance v0, Lx70;

    .line 100
    .line 101
    invoke-direct {v0, p1}, Lx70;-><init>(Landroid/view/View;)V

    .line 102
    .line 103
    .line 104
    if-eqz p2, :cond_6

    .line 105
    .line 106
    invoke-virtual {p0, v0}, Lr70;->f(Lx70;)V

    .line 107
    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_6
    invoke-virtual {p0, v0}, Lr70;->c(Lx70;)V

    .line 111
    .line 112
    .line 113
    :goto_5
    iget-object v3, v0, Lx70;->c:Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v0}, Lr70;->e(Lx70;)V

    .line 119
    .line 120
    .line 121
    if-eqz p2, :cond_7

    .line 122
    .line 123
    iget-object v3, p0, Lr70;->g:La8;

    .line 124
    .line 125
    invoke-static {v3, p1, v0}, Lr70;->b(La8;Landroid/view/View;Lx70;)V

    .line 126
    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_7
    iget-object v3, p0, Lr70;->h:La8;

    .line 130
    .line 131
    invoke-static {v3, p1, v0}, Lr70;->b(La8;Landroid/view/View;Lx70;)V

    .line 132
    .line 133
    .line 134
    :goto_6
    add-int/lit8 v1, v1, 0x1

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_8
    return-void
.end method

.method public final h(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lr70;->g:La8;

    .line 4
    .line 5
    iget-object p1, p1, La8;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Ln6;

    .line 8
    .line 9
    invoke-virtual {p1}, Lu30;->clear()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lr70;->g:La8;

    .line 13
    .line 14
    iget-object p1, p1, La8;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Landroid/util/SparseArray;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lr70;->g:La8;

    .line 22
    .line 23
    iget-object p1, p1, La8;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Lbs;

    .line 26
    .line 27
    invoke-virtual {p1}, Lbs;->a()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object p1, p0, Lr70;->h:La8;

    .line 32
    .line 33
    iget-object p1, p1, La8;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ln6;

    .line 36
    .line 37
    invoke-virtual {p1}, Lu30;->clear()V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lr70;->h:La8;

    .line 41
    .line 42
    iget-object p1, p1, La8;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Landroid/util/SparseArray;

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/util/SparseArray;->clear()V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lr70;->h:La8;

    .line 50
    .line 51
    iget-object p1, p1, La8;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Lbs;

    .line 54
    .line 55
    invoke-virtual {p1}, Lbs;->a()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public i()Lr70;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    check-cast v1, Lr70;

    .line 7
    .line 8
    new-instance v2, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v2, v1, Lr70;->r:Ljava/util/ArrayList;

    .line 14
    .line 15
    new-instance v2, La8;

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    invoke-direct {v2, v3}, La8;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object v2, v1, Lr70;->g:La8;

    .line 22
    .line 23
    new-instance v2, La8;

    .line 24
    .line 25
    const/4 v3, 0x4

    .line 26
    invoke-direct {v2, v3}, La8;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object v2, v1, Lr70;->h:La8;

    .line 30
    .line 31
    iput-object v0, v1, Lr70;->k:Ljava/util/ArrayList;

    .line 32
    .line 33
    iput-object v0, v1, Lr70;->l:Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    return-object v1

    .line 36
    :catch_0
    return-object v0
.end method

.method public j(Landroid/view/ViewGroup;Lx70;Lx70;)Landroid/animation/Animator;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public k(Landroid/view/ViewGroup;La8;La8;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-static {}, Lr70;->n()Ln6;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v3, Landroid/util/SparseIntArray;

    .line 10
    .line 11
    invoke-direct {v3}, Landroid/util/SparseIntArray;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual/range {p4 .. p4}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    const/4 v6, 0x0

    .line 19
    :goto_0
    if-ge v6, v4, :cond_b

    .line 20
    .line 21
    move-object/from16 v7, p4

    .line 22
    .line 23
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    check-cast v8, Lx70;

    .line 28
    .line 29
    move-object/from16 v9, p5

    .line 30
    .line 31
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v10

    .line 35
    check-cast v10, Lx70;

    .line 36
    .line 37
    const/4 v11, 0x0

    .line 38
    if-eqz v8, :cond_0

    .line 39
    .line 40
    iget-object v12, v8, Lx70;->c:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v12

    .line 46
    if-nez v12, :cond_0

    .line 47
    .line 48
    move-object v8, v11

    .line 49
    :cond_0
    if-eqz v10, :cond_1

    .line 50
    .line 51
    iget-object v12, v10, Lx70;->c:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v12

    .line 57
    if-nez v12, :cond_1

    .line 58
    .line 59
    move-object v10, v11

    .line 60
    :cond_1
    if-nez v8, :cond_3

    .line 61
    .line 62
    if-nez v10, :cond_3

    .line 63
    .line 64
    :cond_2
    move-object/from16 v15, p3

    .line 65
    .line 66
    move/from16 v16, v4

    .line 67
    .line 68
    move/from16 v17, v6

    .line 69
    .line 70
    goto/16 :goto_6

    .line 71
    .line 72
    :cond_3
    if-eqz v8, :cond_4

    .line 73
    .line 74
    if-eqz v10, :cond_4

    .line 75
    .line 76
    invoke-virtual {v0, v8, v10}, Lr70;->q(Lx70;Lx70;)Z

    .line 77
    .line 78
    .line 79
    move-result v12

    .line 80
    if-eqz v12, :cond_2

    .line 81
    .line 82
    :cond_4
    invoke-virtual {v0, v1, v8, v10}, Lr70;->j(Landroid/view/ViewGroup;Lx70;Lx70;)Landroid/animation/Animator;

    .line 83
    .line 84
    .line 85
    move-result-object v12

    .line 86
    if-eqz v12, :cond_2

    .line 87
    .line 88
    iget-object v13, v0, Lr70;->a:Ljava/lang/String;

    .line 89
    .line 90
    if-eqz v10, :cond_9

    .line 91
    .line 92
    iget-object v8, v10, Lx70;->b:Landroid/view/View;

    .line 93
    .line 94
    invoke-virtual {v0}, Lr70;->o()[Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    if-eqz v10, :cond_8

    .line 99
    .line 100
    array-length v14, v10

    .line 101
    if-lez v14, :cond_8

    .line 102
    .line 103
    new-instance v14, Lx70;

    .line 104
    .line 105
    invoke-direct {v14, v8}, Lx70;-><init>(Landroid/view/View;)V

    .line 106
    .line 107
    .line 108
    move-object/from16 v15, p3

    .line 109
    .line 110
    iget-object v5, v15, La8;->a:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v5, Ln6;

    .line 113
    .line 114
    invoke-virtual {v5, v8, v11}, Lu30;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    check-cast v5, Lx70;

    .line 119
    .line 120
    move/from16 v16, v4

    .line 121
    .line 122
    if-eqz v5, :cond_5

    .line 123
    .line 124
    const/4 v11, 0x0

    .line 125
    :goto_1
    array-length v4, v10

    .line 126
    if-ge v11, v4, :cond_5

    .line 127
    .line 128
    aget-object v4, v10, v11

    .line 129
    .line 130
    move/from16 v17, v6

    .line 131
    .line 132
    iget-object v6, v5, Lx70;->a:Ljava/util/HashMap;

    .line 133
    .line 134
    invoke-virtual {v6, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    move-object/from16 v18, v5

    .line 139
    .line 140
    iget-object v5, v14, Lx70;->a:Ljava/util/HashMap;

    .line 141
    .line 142
    invoke-virtual {v5, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    add-int/lit8 v11, v11, 0x1

    .line 146
    .line 147
    move/from16 v6, v17

    .line 148
    .line 149
    move-object/from16 v5, v18

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_5
    move/from16 v17, v6

    .line 153
    .line 154
    iget v4, v2, Lu30;->c:I

    .line 155
    .line 156
    const/4 v5, 0x0

    .line 157
    :goto_2
    if-ge v5, v4, :cond_7

    .line 158
    .line 159
    invoke-virtual {v2, v5}, Lu30;->h(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    check-cast v6, Landroid/animation/Animator;

    .line 164
    .line 165
    const/4 v10, 0x0

    .line 166
    invoke-virtual {v2, v6, v10}, Lu30;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    check-cast v6, Lp70;

    .line 171
    .line 172
    iget-object v11, v6, Lp70;->c:Lx70;

    .line 173
    .line 174
    if-eqz v11, :cond_6

    .line 175
    .line 176
    iget-object v11, v6, Lp70;->a:Landroid/view/View;

    .line 177
    .line 178
    if-ne v11, v8, :cond_6

    .line 179
    .line 180
    iget-object v11, v6, Lp70;->b:Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v11

    .line 186
    if-eqz v11, :cond_6

    .line 187
    .line 188
    iget-object v6, v6, Lp70;->c:Lx70;

    .line 189
    .line 190
    invoke-virtual {v6, v14}, Lx70;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    if-eqz v6, :cond_6

    .line 195
    .line 196
    move-object v11, v10

    .line 197
    goto :goto_4

    .line 198
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_7
    :goto_3
    move-object v11, v12

    .line 202
    goto :goto_4

    .line 203
    :cond_8
    move-object/from16 v15, p3

    .line 204
    .line 205
    move/from16 v16, v4

    .line 206
    .line 207
    move/from16 v17, v6

    .line 208
    .line 209
    move-object v10, v11

    .line 210
    move-object v14, v10

    .line 211
    goto :goto_3

    .line 212
    :goto_4
    move-object v12, v11

    .line 213
    move-object v11, v14

    .line 214
    goto :goto_5

    .line 215
    :cond_9
    move-object/from16 v15, p3

    .line 216
    .line 217
    move/from16 v16, v4

    .line 218
    .line 219
    move/from16 v17, v6

    .line 220
    .line 221
    move-object v10, v11

    .line 222
    iget-object v8, v8, Lx70;->b:Landroid/view/View;

    .line 223
    .line 224
    :goto_5
    if-eqz v12, :cond_a

    .line 225
    .line 226
    new-instance v4, Lp70;

    .line 227
    .line 228
    sget-object v5, Lbb0;->a:Ldb0;

    .line 229
    .line 230
    new-instance v5, Lzb0;

    .line 231
    .line 232
    invoke-direct {v5, v1}, Lzb0;-><init>(Landroid/view/ViewGroup;)V

    .line 233
    .line 234
    .line 235
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 236
    .line 237
    .line 238
    iput-object v8, v4, Lp70;->a:Landroid/view/View;

    .line 239
    .line 240
    iput-object v13, v4, Lp70;->b:Ljava/lang/String;

    .line 241
    .line 242
    iput-object v11, v4, Lp70;->c:Lx70;

    .line 243
    .line 244
    iput-object v5, v4, Lp70;->d:Lzb0;

    .line 245
    .line 246
    iput-object v0, v4, Lp70;->e:Lr70;

    .line 247
    .line 248
    invoke-virtual {v2, v12, v4}, Lu30;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    iget-object v4, v0, Lr70;->r:Ljava/util/ArrayList;

    .line 252
    .line 253
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    :cond_a
    :goto_6
    add-int/lit8 v6, v17, 0x1

    .line 257
    .line 258
    move/from16 v4, v16

    .line 259
    .line 260
    goto/16 :goto_0

    .line 261
    .line 262
    :cond_b
    invoke-virtual {v3}, Landroid/util/SparseIntArray;->size()I

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    if-eqz v1, :cond_c

    .line 267
    .line 268
    const/4 v5, 0x0

    .line 269
    :goto_7
    invoke-virtual {v3}, Landroid/util/SparseIntArray;->size()I

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    if-ge v5, v1, :cond_c

    .line 274
    .line 275
    invoke-virtual {v3, v5}, Landroid/util/SparseIntArray;->keyAt(I)I

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    iget-object v2, v0, Lr70;->r:Ljava/util/ArrayList;

    .line 280
    .line 281
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    check-cast v1, Landroid/animation/Animator;

    .line 286
    .line 287
    invoke-virtual {v3, v5}, Landroid/util/SparseIntArray;->valueAt(I)I

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    int-to-long v6, v2

    .line 292
    const-wide v8, 0x7fffffffffffffffL

    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    sub-long/2addr v6, v8

    .line 298
    invoke-virtual {v1}, Landroid/animation/Animator;->getStartDelay()J

    .line 299
    .line 300
    .line 301
    move-result-wide v8

    .line 302
    add-long/2addr v8, v6

    .line 303
    invoke-virtual {v1, v8, v9}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 304
    .line 305
    .line 306
    add-int/lit8 v5, v5, 0x1

    .line 307
    .line 308
    goto :goto_7

    .line 309
    :cond_c
    return-void
.end method

.method public final l()V
    .locals 6

    .line 1
    iget v0, p0, Lr70;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sub-int/2addr v0, v1

    .line 5
    iput v0, p0, Lr70;->n:I

    .line 6
    .line 7
    if-nez v0, :cond_5

    .line 8
    .line 9
    iget-object v0, p0, Lr70;->q:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-lez v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lr70;->q:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    move v4, v2

    .line 33
    :goto_0
    if-ge v4, v3, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    check-cast v5, Lq70;

    .line 40
    .line 41
    invoke-interface {v5, p0}, Lq70;->e(Lr70;)V

    .line 42
    .line 43
    .line 44
    add-int/lit8 v4, v4, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v0, v2

    .line 48
    :goto_1
    iget-object v3, p0, Lr70;->g:La8;

    .line 49
    .line 50
    iget-object v3, v3, La8;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v3, Lbs;

    .line 53
    .line 54
    invoke-virtual {v3}, Lbs;->e()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-ge v0, v3, :cond_2

    .line 59
    .line 60
    iget-object v3, p0, Lr70;->g:La8;

    .line 61
    .line 62
    iget-object v3, v3, La8;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v3, Lbs;

    .line 65
    .line 66
    invoke-virtual {v3, v0}, Lbs;->f(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Landroid/view/View;

    .line 71
    .line 72
    if-eqz v3, :cond_1

    .line 73
    .line 74
    sget-object v4, Lja0;->a:Ljava/util/WeakHashMap;

    .line 75
    .line 76
    invoke-static {v3, v2}, Ls90;->r(Landroid/view/View;Z)V

    .line 77
    .line 78
    .line 79
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    move v0, v2

    .line 83
    :goto_2
    iget-object v3, p0, Lr70;->h:La8;

    .line 84
    .line 85
    iget-object v3, v3, La8;->c:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v3, Lbs;

    .line 88
    .line 89
    invoke-virtual {v3}, Lbs;->e()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-ge v0, v3, :cond_4

    .line 94
    .line 95
    iget-object v3, p0, Lr70;->h:La8;

    .line 96
    .line 97
    iget-object v3, v3, La8;->c:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v3, Lbs;

    .line 100
    .line 101
    invoke-virtual {v3, v0}, Lbs;->f(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    check-cast v3, Landroid/view/View;

    .line 106
    .line 107
    if-eqz v3, :cond_3

    .line 108
    .line 109
    sget-object v4, Lja0;->a:Ljava/util/WeakHashMap;

    .line 110
    .line 111
    invoke-static {v3, v2}, Ls90;->r(Landroid/view/View;Z)V

    .line 112
    .line 113
    .line 114
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    iput-boolean v1, p0, Lr70;->p:Z

    .line 118
    .line 119
    :cond_5
    return-void
.end method

.method public final m(Landroid/view/View;Z)Lx70;
    .locals 4

    .line 1
    iget-object v0, p0, Lr70;->i:Lz6;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lr70;->m(Landroid/view/View;Z)Lx70;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    if-eqz p2, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lr70;->k:Ljava/util/ArrayList;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    iget-object v0, p0, Lr70;->l:Ljava/util/ArrayList;

    .line 16
    .line 17
    :goto_0
    if-nez v0, :cond_2

    .line 18
    .line 19
    goto :goto_4

    .line 20
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x0

    .line 25
    :goto_1
    if-ge v2, v1, :cond_5

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lx70;

    .line 32
    .line 33
    if-nez v3, :cond_3

    .line 34
    .line 35
    goto :goto_4

    .line 36
    :cond_3
    iget-object v3, v3, Lx70;->b:Landroid/view/View;

    .line 37
    .line 38
    if-ne v3, p1, :cond_4

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_5
    const/4 v2, -0x1

    .line 45
    :goto_2
    if-ltz v2, :cond_7

    .line 46
    .line 47
    if-eqz p2, :cond_6

    .line 48
    .line 49
    iget-object p1, p0, Lr70;->l:Ljava/util/ArrayList;

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_6
    iget-object p1, p0, Lr70;->k:Ljava/util/ArrayList;

    .line 53
    .line 54
    :goto_3
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lx70;

    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_7
    :goto_4
    const/4 p1, 0x0

    .line 62
    return-object p1
.end method

.method public o()[Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final p(Landroid/view/View;Z)Lx70;
    .locals 1

    .line 1
    iget-object v0, p0, Lr70;->i:Lz6;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lr70;->p(Landroid/view/View;Z)Lx70;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    if-eqz p2, :cond_1

    .line 11
    .line 12
    iget-object p2, p0, Lr70;->g:La8;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    iget-object p2, p0, Lr70;->h:La8;

    .line 16
    .line 17
    :goto_0
    iget-object p2, p2, La8;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p2, Ln6;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p2, p1, v0}, Lu30;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lx70;

    .line 27
    .line 28
    return-object p1
.end method

.method public q(Lx70;Lx70;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    if-eqz p2, :cond_3

    .line 5
    .line 6
    invoke-virtual {p0}, Lr70;->o()[Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    array-length v2, v1

    .line 13
    move v3, v0

    .line 14
    :goto_0
    if-ge v3, v2, :cond_3

    .line 15
    .line 16
    aget-object v4, v1, v3

    .line 17
    .line 18
    invoke-static {p1, p2, v4}, Lr70;->s(Lx70;Lx70;Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-object v1, p1, Lx70;->a:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {p1, p2, v2}, Lr70;->s(Lx70;Lx70;Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    :goto_1
    const/4 p1, 0x1

    .line 57
    return p1

    .line 58
    :cond_3
    return v0
.end method

.method public final r(Landroid/view/View;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lr70;->e:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x1

    .line 12
    iget-object v4, p0, Lr70;->f:Ljava/util/ArrayList;

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    return v3

    .line 23
    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    return p1

    .line 42
    :cond_2
    :goto_0
    return v3
.end method

.method public t(Landroid/view/View;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lr70;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    invoke-static {}, Lr70;->n()Ln6;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v1, v0, Lu30;->c:I

    .line 10
    .line 11
    sget-object v2, Lbb0;->a:Ldb0;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v2, 0x1

    .line 18
    sub-int/2addr v1, v2

    .line 19
    :goto_0
    if-ltz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lu30;->j(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Lp70;

    .line 26
    .line 27
    iget-object v4, v3, Lp70;->a:Landroid/view/View;

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    iget-object v3, v3, Lp70;->d:Lzb0;

    .line 32
    .line 33
    iget-object v3, v3, Lzb0;->a:Landroid/view/WindowId;

    .line 34
    .line 35
    invoke-virtual {v3, p1}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lu30;->h(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Landroid/animation/Animator;

    .line 46
    .line 47
    invoke-virtual {v3}, Landroid/animation/Animator;->pause()V

    .line 48
    .line 49
    .line 50
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget-object p1, p0, Lr70;->q:Ljava/util/ArrayList;

    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-lez p1, :cond_2

    .line 62
    .line 63
    iget-object p1, p0, Lr70;->q:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    const/4 v1, 0x0

    .line 76
    :goto_1
    if-ge v1, v0, :cond_2

    .line 77
    .line 78
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    check-cast v3, Lq70;

    .line 83
    .line 84
    invoke-interface {v3}, Lq70;->c()V

    .line 85
    .line 86
    .line 87
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    iput-boolean v2, p0, Lr70;->o:Z

    .line 91
    .line 92
    :cond_3
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lr70;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public u(Lq70;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr70;->q:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lr70;->q:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Lr70;->q:Ljava/util/ArrayList;

    .line 19
    .line 20
    :cond_1
    :goto_0
    return-void
.end method

.method public v(Landroid/view/View;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lr70;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-boolean v0, p0, Lr70;->p:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_2

    .line 9
    .line 10
    invoke-static {}, Lr70;->n()Ln6;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v2, v0, Lu30;->c:I

    .line 15
    .line 16
    sget-object v3, Lbb0;->a:Ldb0;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    add-int/lit8 v2, v2, -0x1

    .line 23
    .line 24
    :goto_0
    if-ltz v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lu30;->j(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Lp70;

    .line 31
    .line 32
    iget-object v4, v3, Lp70;->a:Landroid/view/View;

    .line 33
    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    iget-object v3, v3, Lp70;->d:Lzb0;

    .line 37
    .line 38
    iget-object v3, v3, Lzb0;->a:Landroid/view/WindowId;

    .line 39
    .line 40
    invoke-virtual {v3, p1}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    invoke-virtual {v0, v2}, Lu30;->h(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Landroid/animation/Animator;

    .line 51
    .line 52
    invoke-virtual {v3}, Landroid/animation/Animator;->resume()V

    .line 53
    .line 54
    .line 55
    :cond_0
    add-int/lit8 v2, v2, -0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object p1, p0, Lr70;->q:Ljava/util/ArrayList;

    .line 59
    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-lez p1, :cond_2

    .line 67
    .line 68
    iget-object p1, p0, Lr70;->q:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    move v2, v1

    .line 81
    :goto_1
    if-ge v2, v0, :cond_2

    .line 82
    .line 83
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    check-cast v3, Lq70;

    .line 88
    .line 89
    invoke-interface {v3}, Lq70;->d()V

    .line 90
    .line 91
    .line 92
    add-int/lit8 v2, v2, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    iput-boolean v1, p0, Lr70;->o:Z

    .line 96
    .line 97
    :cond_3
    return-void
.end method

.method public w()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lr70;->D()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lr70;->n()Ln6;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lr70;->r:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    :cond_0
    :goto_0
    if-ge v3, v2, :cond_4

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    add-int/lit8 v3, v3, 0x1

    .line 22
    .line 23
    check-cast v4, Landroid/animation/Animator;

    .line 24
    .line 25
    invoke-virtual {v0, v4}, Lu30;->containsKey(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Lr70;->D()V

    .line 32
    .line 33
    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    new-instance v5, Lo70;

    .line 37
    .line 38
    invoke-direct {v5, p0, v0}, Lo70;-><init>(Lr70;Ln6;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4, v5}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 42
    .line 43
    .line 44
    iget-wide v5, p0, Lr70;->c:J

    .line 45
    .line 46
    const-wide/16 v7, 0x0

    .line 47
    .line 48
    cmp-long v9, v5, v7

    .line 49
    .line 50
    if-ltz v9, :cond_1

    .line 51
    .line 52
    invoke-virtual {v4, v5, v6}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-wide v5, p0, Lr70;->b:J

    .line 56
    .line 57
    cmp-long v7, v5, v7

    .line 58
    .line 59
    if-ltz v7, :cond_2

    .line 60
    .line 61
    invoke-virtual {v4}, Landroid/animation/Animator;->getStartDelay()J

    .line 62
    .line 63
    .line 64
    move-result-wide v7

    .line 65
    add-long/2addr v7, v5

    .line 66
    invoke-virtual {v4, v7, v8}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 67
    .line 68
    .line 69
    :cond_2
    iget-object v5, p0, Lr70;->d:Landroid/animation/TimeInterpolator;

    .line 70
    .line 71
    if-eqz v5, :cond_3

    .line 72
    .line 73
    invoke-virtual {v4, v5}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    new-instance v5, Ly0;

    .line 77
    .line 78
    const/4 v6, 0x5

    .line 79
    invoke-direct {v5, v6, p0}, Ly0;-><init>(ILjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v5}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Landroid/animation/Animator;->start()V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    iget-object v0, p0, Lr70;->r:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lr70;->l()V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public x(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lr70;->c:J

    .line 2
    .line 3
    return-void
.end method

.method public y(Lgt;)V
    .locals 0

    .line 1
    return-void
.end method

.method public z(Landroid/animation/TimeInterpolator;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr70;->d:Landroid/animation/TimeInterpolator;

    .line 2
    .line 3
    return-void
.end method
