.class public final Li4/a0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final E:Lv4/y;


# instance fields
.field public A:Z

.field public B:Li4/v;

.field public C:Lu4/r;

.field public D:Lu4/t;

.field public final a:Lw4/a;

.field public b:[Lw4/d;

.field public c:I

.field public d:Lw4/c;

.field public e:I

.field public f:Lv4/a;

.field public g:I

.field public h:Li4/n;

.field public i:Ljava/util/ArrayList;

.field public j:I

.field public k:Z

.field public l:Lu4/o;

.field public final m:[Lw4/d;

.field public n:I

.field public final o:Li4/z;

.field public final p:Li4/m;

.field public final q:Lh4/u;

.field public final r:Lu4/e;

.field public final s:I

.field public final t:Ljava/util/ArrayList;

.field public u:Lw4/b;

.field public v:Z

.field public w:Z

.field public x:I

.field public y:I

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lv4/d0;

    .line 2
    .line 3
    const-string v1, "java/lang/reflect/Array"

    .line 4
    .line 5
    invoke-static {v1}, Lw4/c;->n(Ljava/lang/String;)Lw4/c;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lv4/d0;-><init>(Lw4/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lv4/y;

    .line 13
    .line 14
    new-instance v2, Lv4/z;

    .line 15
    .line 16
    new-instance v3, Lv4/c0;

    .line 17
    .line 18
    const-string v4, "newInstance"

    .line 19
    .line 20
    invoke-direct {v3, v4}, Lv4/c0;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v4, Lv4/c0;

    .line 24
    .line 25
    const-string v5, "(Ljava/lang/Class;[I)Ljava/lang/Object;"

    .line 26
    .line 27
    invoke-direct {v4, v5}, Lv4/c0;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v2, v3, v4}, Lv4/z;-><init>(Lv4/c0;Lv4/c0;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v1, v0, v2}, Lv4/e;-><init>(Lv4/d0;Lv4/z;)V

    .line 34
    .line 35
    .line 36
    sput-object v1, Li4/a0;->E:Lv4/y;

    .line 37
    .line 38
    return-void
.end method

.method public constructor <init>(Li4/z;Li4/m;Lh4/u;)V
    .locals 1

    .line 1
    iget-object v0, p2, Li4/m;->a:Ll4/b;

    .line 2
    .line 3
    invoke-interface {v0}, Ll4/b;->a()Lw4/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iput-object v0, p0, Li4/a0;->a:Lw4/a;

    .line 13
    .line 14
    const/16 v0, 0xa

    .line 15
    .line 16
    new-array v0, v0, [Lw4/d;

    .line 17
    .line 18
    iput-object v0, p0, Li4/a0;->b:[Lw4/d;

    .line 19
    .line 20
    const/4 v0, 0x6

    .line 21
    new-array v0, v0, [Lw4/d;

    .line 22
    .line 23
    iput-object v0, p0, Li4/a0;->m:[Lw4/d;

    .line 24
    .line 25
    invoke-virtual {p0}, Li4/a0;->b()V

    .line 26
    .line 27
    .line 28
    if-eqz p3, :cond_0

    .line 29
    .line 30
    iput-object p1, p0, Li4/a0;->o:Li4/z;

    .line 31
    .line 32
    iput-object p2, p0, Li4/a0;->p:Li4/m;

    .line 33
    .line 34
    iput-object p3, p0, Li4/a0;->q:Lh4/u;

    .line 35
    .line 36
    sget-object p1, Lu4/e;->a:Lu4/e;

    .line 37
    .line 38
    iput-object p1, p0, Li4/a0;->r:Lu4/e;

    .line 39
    .line 40
    iget-object p1, p2, Li4/m;->c:Lh4/c;

    .line 41
    .line 42
    iget p1, p1, Lh4/c;->c:I

    .line 43
    .line 44
    iput p1, p0, Li4/a0;->s:I

    .line 45
    .line 46
    new-instance p1, Ljava/util/ArrayList;

    .line 47
    .line 48
    const/16 p2, 0x19

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Li4/a0;->t:Ljava/util/ArrayList;

    .line 54
    .line 55
    const/4 p1, 0x0

    .line 56
    iput-object p1, p0, Li4/a0;->u:Lw4/b;

    .line 57
    .line 58
    const/4 p2, 0x0

    .line 59
    iput-boolean p2, p0, Li4/a0;->v:Z

    .line 60
    .line 61
    iput-boolean p2, p0, Li4/a0;->w:Z

    .line 62
    .line 63
    const/4 p3, -0x1

    .line 64
    iput p3, p0, Li4/a0;->x:I

    .line 65
    .line 66
    iput p2, p0, Li4/a0;->y:I

    .line 67
    .line 68
    iput-boolean p2, p0, Li4/a0;->A:Z

    .line 69
    .line 70
    iput-object p1, p0, Li4/a0;->C:Lu4/r;

    .line 71
    .line 72
    iput-object p1, p0, Li4/a0;->D:Lu4/t;

    .line 73
    .line 74
    return-void

    .line 75
    :cond_0
    const-string p1, "methods == null"

    .line 76
    .line 77
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    throw p1

    .line 82
    :cond_1
    const-string p1, "prototype == null"

    .line 83
    .line 84
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const/4 p1, 0x0

    .line 88
    throw p1
.end method


# virtual methods
.method public final a(I)Lw4/d;
    .locals 1

    .line 1
    iget v0, p0, Li4/a0;->c:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, Li4/a0;->b:[Lw4/d;

    .line 6
    .line 7
    aget-object p1, v0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :catch_0
    const-string p1, "n < 0"

    .line 11
    .line 12
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :goto_0
    const/4 p1, 0x0

    .line 16
    return-object p1

    .line 17
    :cond_0
    const-string p1, "n >= argCount"

    .line 18
    .line 19
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0
.end method

.method public final b()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Li4/a0;->c:I

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput-object v1, p0, Li4/a0;->d:Lw4/c;

    .line 6
    .line 7
    iput v0, p0, Li4/a0;->e:I

    .line 8
    .line 9
    iput-object v1, p0, Li4/a0;->f:Lv4/a;

    .line 10
    .line 11
    iput v0, p0, Li4/a0;->g:I

    .line 12
    .line 13
    iput-object v1, p0, Li4/a0;->h:Li4/n;

    .line 14
    .line 15
    iput-object v1, p0, Li4/a0;->i:Ljava/util/ArrayList;

    .line 16
    .line 17
    const/4 v2, -0x1

    .line 18
    iput v2, p0, Li4/a0;->j:I

    .line 19
    .line 20
    iput-boolean v0, p0, Li4/a0;->k:Z

    .line 21
    .line 22
    iput-object v1, p0, Li4/a0;->l:Lu4/o;

    .line 23
    .line 24
    iput v2, p0, Li4/a0;->n:I

    .line 25
    .line 26
    return-void
.end method

.method public final c(Z)Lu4/o;
    .locals 5

    .line 1
    iget-object v0, p0, Li4/a0;->l:Lu4/o;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    iget v0, p0, Li4/a0;->n:I

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eq v0, v2, :cond_2

    .line 11
    .line 12
    new-instance p1, Li4/b0;

    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "local target with "

    .line 17
    .line 18
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget v2, p0, Li4/a0;->n:I

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    const-string v2, "no"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const-string v2, "multiple"

    .line 29
    .line 30
    :goto_0
    const-string v3, " results"

    .line 31
    .line 32
    invoke-static {v0, v2, v3}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-direct {p1, v0, v1}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_2
    iget-object v0, p0, Li4/a0;->m:[Lw4/d;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    aget-object v0, v0, v2

    .line 44
    .line 45
    invoke-interface {v0}, Lw4/d;->getType()Lw4/c;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object v3, p0, Li4/a0;->l:Lu4/o;

    .line 50
    .line 51
    iget-object v3, v3, Lu4/o;->h:Lw4/d;

    .line 52
    .line 53
    invoke-interface {v3}, Lw4/d;->getType()Lw4/c;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-ne v2, v3, :cond_4

    .line 58
    .line 59
    iget-object v1, p0, Li4/a0;->l:Lu4/o;

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Lu4/o;->p(Lw4/d;)Lu4/o;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    return-object p1

    .line 68
    :cond_3
    return-object v1

    .line 69
    :cond_4
    invoke-static {v3, v2}, Lx6/d;->I(Lw4/d;Lw4/d;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_6

    .line 74
    .line 75
    sget-object p1, Lw4/c;->E:Lw4/c;

    .line 76
    .line 77
    if-ne v3, p1, :cond_5

    .line 78
    .line 79
    iget-object p1, p0, Li4/a0;->l:Lu4/o;

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Lu4/o;->p(Lw4/d;)Lu4/o;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, Li4/a0;->l:Lu4/o;

    .line 86
    .line 87
    :cond_5
    iget-object p1, p0, Li4/a0;->l:Lu4/o;

    .line 88
    .line 89
    return-object p1

    .line 90
    :cond_6
    new-instance p1, Li4/b0;

    .line 91
    .line 92
    invoke-virtual {v2}, Lw4/c;->a()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v3}, Lw4/c;->a()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    new-instance v3, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v4, "local variable type mismatch: attempt to set or access a value of type "

    .line 103
    .line 104
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v0, " using a local variable of type "

    .line 111
    .line 112
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v0, ". This is symptomatic of .class transformation tools that ignore local variable information."

    .line 119
    .line 120
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-direct {p1, v0, v1}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 128
    .line 129
    .line 130
    throw p1
.end method

.method public final d(ILb5/c;)V
    .locals 8

    .line 1
    iget-object p2, p2, Lb5/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, Li4/n;

    .line 4
    .line 5
    invoke-virtual {p0}, Li4/a0;->b()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Li4/a0;->b:[Lw4/d;

    .line 9
    .line 10
    array-length v0, v0

    .line 11
    if-le p1, v0, :cond_0

    .line 12
    .line 13
    add-int/lit8 v0, p1, 0xa

    .line 14
    .line 15
    new-array v0, v0, [Lw4/d;

    .line 16
    .line 17
    iput-object v0, p0, Li4/a0;->b:[Lw4/d;

    .line 18
    .line 19
    :cond_0
    add-int/lit8 v0, p1, -0x1

    .line 20
    .line 21
    :goto_0
    if-ltz v0, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Li4/a0;->b:[Lw4/d;

    .line 24
    .line 25
    invoke-virtual {p2}, Lz4/j;->j()V

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {p2, v2}, Li4/n;->o(I)Lw4/d;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-object v4, p2, Li4/n;->j:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v4, [Lw4/d;

    .line 36
    .line 37
    iget v5, p2, Li4/n;->i:I

    .line 38
    .line 39
    add-int/lit8 v6, v5, -0x1

    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    aput-object v7, v4, v6

    .line 43
    .line 44
    iget-object v4, p2, Li4/n;->k:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, [Z

    .line 47
    .line 48
    aput-boolean v2, v4, v6

    .line 49
    .line 50
    invoke-interface {v3}, Lw4/d;->getType()Lw4/c;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Lw4/c;->i()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    sub-int/2addr v5, v2

    .line 59
    iput v5, p2, Li4/n;->i:I

    .line 60
    .line 61
    aput-object v3, v1, v0

    .line 62
    .line 63
    add-int/lit8 v0, v0, -0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    iput p1, p0, Li4/a0;->c:I

    .line 67
    .line 68
    return-void
.end method

.method public final e(Lb5/c;Lw4/a;)V
    .locals 4

    .line 1
    iget-object p2, p2, Lw4/a;->i:Lw4/b;

    .line 2
    .line 3
    iget-object v0, p2, Lz4/e;->h:[Ljava/lang/Object;

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    invoke-virtual {p0, v0, p1}, Li4/a0;->d(ILb5/c;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    :goto_0
    if-ge p1, v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p2, p1}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lw4/c;

    .line 17
    .line 18
    iget-object v2, p0, Li4/a0;->b:[Lw4/d;

    .line 19
    .line 20
    aget-object v2, v2, p1

    .line 21
    .line 22
    invoke-static {v1, v2}, Lx6/d;->I(Lw4/d;Lw4/d;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    add-int/lit8 p1, p1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v1, Li4/b0;

    .line 32
    .line 33
    add-int/lit8 v0, v0, -0x1

    .line 34
    .line 35
    sub-int/2addr v0, p1

    .line 36
    invoke-virtual {p2, p1}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    check-cast p2, Lw4/c;

    .line 41
    .line 42
    invoke-virtual {p2}, Lw4/c;->a()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    iget-object v2, p0, Li4/a0;->b:[Lw4/d;

    .line 47
    .line 48
    aget-object p1, v2, p1

    .line 49
    .line 50
    invoke-interface {p1}, Lw4/d;->getType()Lw4/c;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Lw4/c;->a()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance v2, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v3, "at stack depth "

    .line 61
    .line 62
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v0, ", expected type "

    .line 69
    .line 70
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string p2, " but found "

    .line 77
    .line 78
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    const/4 p2, 0x0

    .line 89
    invoke-direct {v1, p1, p2}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 90
    .line 91
    .line 92
    throw v1

    .line 93
    :cond_1
    return-void
.end method

.method public final f(Lb5/c;Lw4/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0, p1}, Li4/a0;->d(ILb5/c;)V

    .line 3
    .line 4
    .line 5
    iget-object p1, p0, Li4/a0;->b:[Lw4/d;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    aget-object p1, p1, v0

    .line 9
    .line 10
    invoke-static {p2, p1}, Lx6/d;->I(Lw4/d;Lw4/d;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {p2}, Lw4/c;->a()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p2, p0, Li4/a0;->b:[Lw4/d;

    .line 22
    .line 23
    aget-object p2, p2, v0

    .line 24
    .line 25
    invoke-interface {p2}, Lw4/d;->getType()Lw4/c;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p2}, Lw4/c;->a()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-static {p1, p2}, Lg1/d;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final g(Lb5/c;Lw4/c;Lw4/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0, p1}, Li4/a0;->d(ILb5/c;)V

    .line 3
    .line 4
    .line 5
    iget-object p1, p0, Li4/a0;->b:[Lw4/d;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    aget-object p1, p1, v0

    .line 9
    .line 10
    invoke-static {p2, p1}, Lx6/d;->I(Lw4/d;Lw4/d;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Li4/a0;->b:[Lw4/d;

    .line 17
    .line 18
    const/4 p2, 0x1

    .line 19
    aget-object p1, p1, p2

    .line 20
    .line 21
    invoke-static {p3, p1}, Lx6/d;->I(Lw4/d;Lw4/d;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual {p3}, Lw4/c;->a()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object p3, p0, Li4/a0;->b:[Lw4/d;

    .line 33
    .line 34
    aget-object p2, p3, p2

    .line 35
    .line 36
    invoke-interface {p2}, Lw4/d;->getType()Lw4/c;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p2}, Lw4/c;->a()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-static {p1, p2}, Lg1/d;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    invoke-virtual {p2}, Lw4/c;->a()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object p2, p0, Li4/a0;->b:[Lw4/d;

    .line 53
    .line 54
    aget-object p2, p2, v0

    .line 55
    .line 56
    invoke-interface {p2}, Lw4/d;->getType()Lw4/c;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p2}, Lw4/c;->a()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-static {p1, p2}, Lg1/d;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final h(IILb5/c;)V
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v3, Lb5/c;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v4, Li4/n;

    .line 12
    .line 13
    iget-object v3, v3, Lb5/c;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Li4/s;

    .line 16
    .line 17
    iget v5, v4, Li4/n;->i:I

    .line 18
    .line 19
    iget v6, v1, Li4/a0;->s:I

    .line 20
    .line 21
    add-int/2addr v6, v5

    .line 22
    iget v5, v1, Li4/a0;->c:I

    .line 23
    .line 24
    const-string v7, "shouldn\'t happen"

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    const/4 v9, 0x2

    .line 28
    const/4 v10, 0x1

    .line 29
    const/4 v11, 0x0

    .line 30
    if-nez v5, :cond_0

    .line 31
    .line 32
    sget-object v5, Lu4/p;->i:Lu4/p;

    .line 33
    .line 34
    :goto_0
    move-object v15, v5

    .line 35
    goto/16 :goto_4

    .line 36
    .line 37
    :cond_0
    iget v12, v1, Li4/a0;->j:I

    .line 38
    .line 39
    if-ltz v12, :cond_1

    .line 40
    .line 41
    new-instance v5, Lu4/p;

    .line 42
    .line 43
    invoke-direct {v5, v10}, Lz4/e;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v11}, Li4/a0;->a(I)Lw4/d;

    .line 47
    .line 48
    .line 49
    move-result-object v13

    .line 50
    invoke-static {v12, v13, v8}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 51
    .line 52
    .line 53
    move-result-object v12

    .line 54
    invoke-virtual {v5, v11, v12}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_1
    new-instance v12, Lu4/p;

    .line 59
    .line 60
    invoke-direct {v12, v5}, Lz4/e;-><init>(I)V

    .line 61
    .line 62
    .line 63
    move v14, v6

    .line 64
    move v13, v11

    .line 65
    :goto_1
    if-ge v13, v5, :cond_2

    .line 66
    .line 67
    invoke-virtual {v1, v13}, Li4/a0;->a(I)Lw4/d;

    .line 68
    .line 69
    .line 70
    move-result-object v15

    .line 71
    invoke-static {v14, v15, v8}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 72
    .line 73
    .line 74
    move-result-object v15

    .line 75
    invoke-virtual {v12, v13, v15}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v15}, Lu4/o;->j()I

    .line 79
    .line 80
    .line 81
    move-result v15

    .line 82
    add-int/2addr v14, v15

    .line 83
    add-int/lit8 v13, v13, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    const/16 v13, 0x4f

    .line 87
    .line 88
    if-eq v2, v13, :cond_5

    .line 89
    .line 90
    const/16 v13, 0xb5

    .line 91
    .line 92
    if-eq v2, v13, :cond_3

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    if-ne v5, v9, :cond_4

    .line 96
    .line 97
    invoke-virtual {v12, v11}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    check-cast v5, Lu4/o;

    .line 102
    .line 103
    invoke-virtual {v12, v10}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v13

    .line 107
    check-cast v13, Lu4/o;

    .line 108
    .line 109
    invoke-virtual {v12, v11, v13}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12, v10, v5}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    invoke-static {v7}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_5
    const/4 v13, 0x3

    .line 121
    if-ne v5, v13, :cond_51

    .line 122
    .line 123
    invoke-virtual {v12, v11}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    check-cast v5, Lu4/o;

    .line 128
    .line 129
    invoke-virtual {v12, v10}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v13

    .line 133
    check-cast v13, Lu4/o;

    .line 134
    .line 135
    invoke-virtual {v12, v9}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v14

    .line 139
    check-cast v14, Lu4/o;

    .line 140
    .line 141
    invoke-virtual {v12, v11, v14}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12, v10, v5}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12, v9, v13}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :goto_2
    move-object v5, v12

    .line 151
    :goto_3
    iput-boolean v11, v5, Lz4/j;->g:Z

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :goto_4
    iget-object v5, v15, Lz4/e;->h:[Ljava/lang/Object;

    .line 155
    .line 156
    array-length v5, v5

    .line 157
    const/16 v12, 0xac

    .line 158
    .line 159
    const/16 v13, 0xab

    .line 160
    .line 161
    const/16 v14, 0x15

    .line 162
    .line 163
    move/from16 p3, v9

    .line 164
    .line 165
    const/16 v9, 0x14

    .line 166
    .line 167
    iget-object v8, v1, Li4/a0;->m:[Lw4/d;

    .line 168
    .line 169
    if-eqz v2, :cond_6

    .line 170
    .line 171
    if-eq v2, v9, :cond_f

    .line 172
    .line 173
    if-eq v2, v14, :cond_e

    .line 174
    .line 175
    if-eq v2, v13, :cond_6

    .line 176
    .line 177
    if-eq v2, v12, :cond_6

    .line 178
    .line 179
    sparse-switch v2, :sswitch_data_0

    .line 180
    .line 181
    .line 182
    packed-switch v2, :pswitch_data_0

    .line 183
    .line 184
    .line 185
    packed-switch v2, :pswitch_data_1

    .line 186
    .line 187
    .line 188
    packed-switch v2, :pswitch_data_2

    .line 189
    .line 190
    .line 191
    packed-switch v2, :pswitch_data_3

    .line 192
    .line 193
    .line 194
    invoke-static {v2}, La/a;->W0(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    const-string v2, "shouldn\'t happen: "

    .line 199
    .line 200
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {v0}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :cond_6
    :pswitch_0
    :sswitch_0
    move/from16 v20, v10

    .line 209
    .line 210
    goto/16 :goto_c

    .line 211
    .line 212
    :pswitch_1
    sget-object v12, Lw4/c;->t:Lw4/c;

    .line 213
    .line 214
    invoke-virtual {v1, v12}, Li4/a0;->i(Lw4/d;)V

    .line 215
    .line 216
    .line 217
    :goto_5
    move/from16 v20, v10

    .line 218
    .line 219
    goto/16 :goto_d

    .line 220
    .line 221
    :pswitch_2
    :sswitch_1
    move/from16 v20, v10

    .line 222
    .line 223
    goto/16 :goto_9

    .line 224
    .line 225
    :pswitch_3
    iget-object v12, v1, Li4/a0;->f:Lv4/a;

    .line 226
    .line 227
    check-cast v12, Lv4/d0;

    .line 228
    .line 229
    iget-object v12, v12, Lv4/d0;->g:Lw4/c;

    .line 230
    .line 231
    invoke-virtual {v12}, Lw4/c;->e()Lw4/c;

    .line 232
    .line 233
    .line 234
    move-result-object v12

    .line 235
    invoke-virtual {v1, v12}, Li4/a0;->i(Lw4/d;)V

    .line 236
    .line 237
    .line 238
    goto :goto_5

    .line 239
    :pswitch_4
    iget-object v12, v1, Li4/a0;->f:Lv4/a;

    .line 240
    .line 241
    check-cast v12, Lv4/d0;

    .line 242
    .line 243
    iget-object v12, v12, Lv4/d0;->g:Lw4/c;

    .line 244
    .line 245
    invoke-virtual {v1, v12}, Li4/a0;->i(Lw4/d;)V

    .line 246
    .line 247
    .line 248
    goto :goto_5

    .line 249
    :pswitch_5
    iget-object v12, v1, Li4/a0;->f:Lv4/a;

    .line 250
    .line 251
    check-cast v12, Lv4/d0;

    .line 252
    .line 253
    iget-object v12, v12, Lv4/d0;->g:Lw4/c;

    .line 254
    .line 255
    invoke-virtual {v12, v0}, Lw4/c;->d(I)Lw4/c;

    .line 256
    .line 257
    .line 258
    move-result-object v12

    .line 259
    invoke-virtual {v1, v12}, Li4/a0;->i(Lw4/d;)V

    .line 260
    .line 261
    .line 262
    goto :goto_5

    .line 263
    :pswitch_6
    iget-object v12, v1, Li4/a0;->f:Lv4/a;

    .line 264
    .line 265
    check-cast v12, Lv4/i;

    .line 266
    .line 267
    iget-object v12, v12, Lv4/i;->g:Lv4/q;

    .line 268
    .line 269
    iget-object v12, v12, Lv4/q;->i:Lw4/a;

    .line 270
    .line 271
    iget-object v12, v12, Lw4/a;->h:Lw4/c;

    .line 272
    .line 273
    sget-object v13, Lw4/c;->w:Lw4/c;

    .line 274
    .line 275
    if-ne v12, v13, :cond_7

    .line 276
    .line 277
    iput v11, v1, Li4/a0;->n:I

    .line 278
    .line 279
    goto :goto_5

    .line 280
    :cond_7
    invoke-virtual {v1, v12}, Li4/a0;->i(Lw4/d;)V

    .line 281
    .line 282
    .line 283
    goto :goto_5

    .line 284
    :pswitch_7
    invoke-virtual {v1, v11}, Li4/a0;->a(I)Lw4/d;

    .line 285
    .line 286
    .line 287
    move-result-object v12

    .line 288
    invoke-interface {v12}, Lw4/d;->getType()Lw4/c;

    .line 289
    .line 290
    .line 291
    move-result-object v12

    .line 292
    iget v13, v12, Lw4/c;->i:I

    .line 293
    .line 294
    if-ltz v13, :cond_a

    .line 295
    .line 296
    invoke-virtual {v3, v12}, Li4/s;->p(Lw4/c;)V

    .line 297
    .line 298
    .line 299
    iget v13, v4, Li4/n;->i:I

    .line 300
    .line 301
    if-nez v13, :cond_8

    .line 302
    .line 303
    goto :goto_7

    .line 304
    :cond_8
    invoke-virtual {v4}, Lz4/j;->j()V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v12}, Lw4/c;->l()Lw4/c;

    .line 308
    .line 309
    .line 310
    move-result-object v13

    .line 311
    move v14, v11

    .line 312
    :goto_6
    iget v9, v4, Li4/n;->i:I

    .line 313
    .line 314
    if-ge v14, v9, :cond_a

    .line 315
    .line 316
    iget-object v9, v4, Li4/n;->j:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v9, [Lw4/d;

    .line 319
    .line 320
    move/from16 v20, v10

    .line 321
    .line 322
    aget-object v10, v9, v14

    .line 323
    .line 324
    if-ne v10, v12, :cond_9

    .line 325
    .line 326
    aput-object v13, v9, v14

    .line 327
    .line 328
    :cond_9
    add-int/lit8 v14, v14, 0x1

    .line 329
    .line 330
    move/from16 v10, v20

    .line 331
    .line 332
    goto :goto_6

    .line 333
    :cond_a
    :goto_7
    move/from16 v20, v10

    .line 334
    .line 335
    iget-object v9, v1, Li4/a0;->f:Lv4/a;

    .line 336
    .line 337
    check-cast v9, Lw4/d;

    .line 338
    .line 339
    invoke-interface {v9}, Lw4/d;->getType()Lw4/c;

    .line 340
    .line 341
    .line 342
    move-result-object v9

    .line 343
    sget-object v10, Lw4/c;->w:Lw4/c;

    .line 344
    .line 345
    if-ne v9, v10, :cond_b

    .line 346
    .line 347
    iput v11, v1, Li4/a0;->n:I

    .line 348
    .line 349
    goto/16 :goto_d

    .line 350
    .line 351
    :cond_b
    invoke-virtual {v1, v9}, Li4/a0;->i(Lw4/d;)V

    .line 352
    .line 353
    .line 354
    goto/16 :goto_d

    .line 355
    .line 356
    :pswitch_8
    move/from16 v20, v10

    .line 357
    .line 358
    iget-object v9, v1, Li4/a0;->f:Lv4/a;

    .line 359
    .line 360
    check-cast v9, Lw4/d;

    .line 361
    .line 362
    invoke-interface {v9}, Lw4/d;->getType()Lw4/c;

    .line 363
    .line 364
    .line 365
    move-result-object v9

    .line 366
    sget-object v10, Lw4/c;->w:Lw4/c;

    .line 367
    .line 368
    if-ne v9, v10, :cond_c

    .line 369
    .line 370
    iput v11, v1, Li4/a0;->n:I

    .line 371
    .line 372
    goto :goto_d

    .line 373
    :cond_c
    invoke-virtual {v1, v9}, Li4/a0;->i(Lw4/d;)V

    .line 374
    .line 375
    .line 376
    goto :goto_d

    .line 377
    :pswitch_9
    move/from16 v20, v10

    .line 378
    .line 379
    new-instance v9, Li4/v;

    .line 380
    .line 381
    iget v10, v1, Li4/a0;->g:I

    .line 382
    .line 383
    invoke-direct {v9, v10}, Li4/v;-><init>(I)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1, v9}, Li4/a0;->i(Lw4/d;)V

    .line 387
    .line 388
    .line 389
    goto :goto_d

    .line 390
    :pswitch_a
    move/from16 v20, v10

    .line 391
    .line 392
    iput v11, v1, Li4/a0;->n:I

    .line 393
    .line 394
    iget v9, v1, Li4/a0;->e:I

    .line 395
    .line 396
    :goto_8
    if-eqz v9, :cond_10

    .line 397
    .line 398
    and-int/lit8 v10, v9, 0xf

    .line 399
    .line 400
    add-int/lit8 v10, v10, -0x1

    .line 401
    .line 402
    invoke-virtual {v1, v10}, Li4/a0;->a(I)Lw4/d;

    .line 403
    .line 404
    .line 405
    move-result-object v10

    .line 406
    if-eqz v10, :cond_d

    .line 407
    .line 408
    iget v12, v1, Li4/a0;->n:I

    .line 409
    .line 410
    aput-object v10, v8, v12

    .line 411
    .line 412
    add-int/lit8 v12, v12, 0x1

    .line 413
    .line 414
    iput v12, v1, Li4/a0;->n:I

    .line 415
    .line 416
    shr-int/lit8 v9, v9, 0x4

    .line 417
    .line 418
    goto :goto_8

    .line 419
    :cond_d
    const-string v0, "result == null"

    .line 420
    .line 421
    invoke-static {v0}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    return-void

    .line 425
    :cond_e
    :sswitch_2
    move/from16 v20, v10

    .line 426
    .line 427
    goto :goto_a

    .line 428
    :goto_9
    iget-object v9, v1, Li4/a0;->d:Lw4/c;

    .line 429
    .line 430
    invoke-virtual {v1, v9}, Li4/a0;->i(Lw4/d;)V

    .line 431
    .line 432
    .line 433
    goto :goto_d

    .line 434
    :cond_f
    :sswitch_3
    move/from16 v20, v10

    .line 435
    .line 436
    goto :goto_b

    .line 437
    :goto_a
    invoke-virtual {v1, v11}, Li4/a0;->a(I)Lw4/d;

    .line 438
    .line 439
    .line 440
    move-result-object v9

    .line 441
    invoke-virtual {v1, v9}, Li4/a0;->i(Lw4/d;)V

    .line 442
    .line 443
    .line 444
    goto :goto_d

    .line 445
    :goto_b
    iget-object v9, v1, Li4/a0;->f:Lv4/a;

    .line 446
    .line 447
    check-cast v9, Lw4/d;

    .line 448
    .line 449
    invoke-virtual {v1, v9}, Li4/a0;->i(Lw4/d;)V

    .line 450
    .line 451
    .line 452
    goto :goto_d

    .line 453
    :goto_c
    iput v11, v1, Li4/a0;->n:I

    .line 454
    .line 455
    :cond_10
    :goto_d
    iget v9, v1, Li4/a0;->n:I

    .line 456
    .line 457
    const-string v10, "results never set"

    .line 458
    .line 459
    if-ltz v9, :cond_50

    .line 460
    .line 461
    if-nez v9, :cond_11

    .line 462
    .line 463
    goto :goto_f

    .line 464
    :cond_11
    iget-object v9, v1, Li4/a0;->l:Lu4/o;

    .line 465
    .line 466
    if-eqz v9, :cond_12

    .line 467
    .line 468
    invoke-virtual {v1, v11}, Li4/a0;->c(Z)Lu4/o;

    .line 469
    .line 470
    .line 471
    move-result-object v4

    .line 472
    invoke-virtual {v3, v4}, Li4/s;->t(Lu4/o;)V

    .line 473
    .line 474
    .line 475
    goto :goto_f

    .line 476
    :cond_12
    move v3, v11

    .line 477
    :goto_e
    iget v9, v1, Li4/a0;->n:I

    .line 478
    .line 479
    if-ge v3, v9, :cond_14

    .line 480
    .line 481
    iget-boolean v9, v1, Li4/a0;->k:Z

    .line 482
    .line 483
    if-eqz v9, :cond_13

    .line 484
    .line 485
    invoke-virtual {v4}, Lz4/j;->j()V

    .line 486
    .line 487
    .line 488
    iget-object v9, v4, Li4/n;->k:Ljava/lang/Object;

    .line 489
    .line 490
    check-cast v9, [Z

    .line 491
    .line 492
    iget v12, v4, Li4/n;->i:I

    .line 493
    .line 494
    aput-boolean v20, v9, v12

    .line 495
    .line 496
    :cond_13
    aget-object v9, v8, v3

    .line 497
    .line 498
    invoke-virtual {v4, v9}, Li4/n;->q(Lw4/d;)V

    .line 499
    .line 500
    .line 501
    add-int/lit8 v3, v3, 0x1

    .line 502
    .line 503
    goto :goto_e

    .line 504
    :cond_14
    :goto_f
    iget-object v3, v1, Li4/a0;->p:Li4/m;

    .line 505
    .line 506
    invoke-virtual {v3, v0}, Li4/m;->f(I)Lu4/t;

    .line 507
    .line 508
    .line 509
    move-result-object v23

    .line 510
    iget-object v0, v3, Li4/m;->a:Ll4/b;

    .line 511
    .line 512
    const/16 v3, 0x36

    .line 513
    .line 514
    if-ne v2, v3, :cond_15

    .line 515
    .line 516
    move/from16 v3, v20

    .line 517
    .line 518
    goto :goto_10

    .line 519
    :cond_15
    move v3, v11

    .line 520
    :goto_10
    invoke-virtual {v1, v3}, Li4/a0;->c(Z)Lu4/o;

    .line 521
    .line 522
    .line 523
    move-result-object v3

    .line 524
    iget v4, v1, Li4/a0;->n:I

    .line 525
    .line 526
    if-ltz v4, :cond_4f

    .line 527
    .line 528
    iget-object v9, v1, Li4/a0;->t:Ljava/util/ArrayList;

    .line 529
    .line 530
    if-nez v4, :cond_16

    .line 531
    .line 532
    const/16 v3, 0x57

    .line 533
    .line 534
    if-eq v2, v3, :cond_4e

    .line 535
    .line 536
    const/16 v3, 0x58

    .line 537
    .line 538
    if-eq v2, v3, :cond_4e

    .line 539
    .line 540
    const/4 v3, 0x0

    .line 541
    goto :goto_11

    .line 542
    :cond_16
    if-eqz v3, :cond_17

    .line 543
    .line 544
    goto :goto_11

    .line 545
    :cond_17
    move/from16 v3, v20

    .line 546
    .line 547
    if-ne v4, v3, :cond_4b

    .line 548
    .line 549
    if-lez v4, :cond_4a

    .line 550
    .line 551
    :try_start_0
    aget-object v3, v8, v11
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    .line 552
    .line 553
    const/4 v4, 0x0

    .line 554
    invoke-static {v6, v3, v4}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 555
    .line 556
    .line 557
    move-result-object v3

    .line 558
    :goto_11
    if-eqz v3, :cond_18

    .line 559
    .line 560
    move-object v4, v3

    .line 561
    goto :goto_12

    .line 562
    :cond_18
    sget-object v4, Lw4/c;->w:Lw4/c;

    .line 563
    .line 564
    :goto_12
    iget-object v6, v1, Li4/a0;->f:Lv4/a;

    .line 565
    .line 566
    const/16 v8, 0xc5

    .line 567
    .line 568
    const/4 v12, 0x6

    .line 569
    if-ne v2, v8, :cond_1d

    .line 570
    .line 571
    const/4 v8, 0x1

    .line 572
    iput-boolean v8, v1, Li4/a0;->A:Z

    .line 573
    .line 574
    iput v12, v1, Li4/a0;->y:I

    .line 575
    .line 576
    iget v2, v3, Lu4/o;->g:I

    .line 577
    .line 578
    invoke-virtual {v3}, Lu4/o;->j()I

    .line 579
    .line 580
    .line 581
    move-result v8

    .line 582
    add-int/2addr v8, v2

    .line 583
    iget v2, v3, Lu4/o;->g:I

    .line 584
    .line 585
    sget-object v13, Lw4/c;->W:Lw4/c;

    .line 586
    .line 587
    const/4 v14, 0x0

    .line 588
    invoke-static {v8, v13, v14}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 589
    .line 590
    .line 591
    move-result-object v8

    .line 592
    sget-object v14, Lu4/s;->a:Lu4/r;

    .line 593
    .line 594
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v13}, Lw4/c;->k()Lw4/c;

    .line 598
    .line 599
    .line 600
    move-result-object v14

    .line 601
    invoke-virtual {v14}, Lw4/c;->r()Z

    .line 602
    .line 603
    .line 604
    move-result v21

    .line 605
    if-nez v21, :cond_1c

    .line 606
    .line 607
    if-ltz v5, :cond_1b

    .line 608
    .line 609
    new-instance v13, Lw4/b;

    .line 610
    .line 611
    invoke-direct {v13, v5}, Lz4/e;-><init>(I)V

    .line 612
    .line 613
    .line 614
    move v12, v11

    .line 615
    :goto_13
    if-ge v12, v5, :cond_19

    .line 616
    .line 617
    invoke-virtual {v13, v12, v14}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 618
    .line 619
    .line 620
    add-int/lit8 v12, v12, 0x1

    .line 621
    .line 622
    goto :goto_13

    .line 623
    :cond_19
    new-instance v12, Lu4/r;

    .line 624
    .line 625
    const/16 v14, 0x2a

    .line 626
    .line 627
    sget-object v11, Lu4/f;->a:Lw4/b;

    .line 628
    .line 629
    invoke-direct {v12, v14, v13, v11}, Lu4/r;-><init>(ILw4/b;Lw4/e;)V

    .line 630
    .line 631
    .line 632
    move-object v13, v12

    .line 633
    new-instance v12, Lu4/v;

    .line 634
    .line 635
    iget-object v11, v1, Li4/a0;->u:Lw4/b;

    .line 636
    .line 637
    const/16 v14, 0xab

    .line 638
    .line 639
    sget-object v17, Lv4/d0;->z:Lv4/d0;

    .line 640
    .line 641
    move-object/from16 v16, v11

    .line 642
    .line 643
    move-object/from16 v14, v23

    .line 644
    .line 645
    const/16 v11, 0x15

    .line 646
    .line 647
    const/16 v19, 0x6

    .line 648
    .line 649
    invoke-direct/range {v12 .. v17}, Lu4/v;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;Lv4/a;)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    sget-object v12, Lw4/c;->W:Lw4/c;

    .line 656
    .line 657
    invoke-static {v12}, Lu4/s;->i(Lw4/d;)Lu4/r;

    .line 658
    .line 659
    .line 660
    move-result-object v12

    .line 661
    new-instance v13, Lu4/m;

    .line 662
    .line 663
    sget-object v15, Lu4/p;->i:Lu4/p;

    .line 664
    .line 665
    invoke-direct {v13, v12, v14, v8, v15}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    move-object v12, v6

    .line 672
    check-cast v12, Lv4/d0;

    .line 673
    .line 674
    iget-object v12, v12, Lv4/d0;->g:Lw4/c;

    .line 675
    .line 676
    const/4 v13, 0x0

    .line 677
    :goto_14
    if-ge v13, v5, :cond_1a

    .line 678
    .line 679
    invoke-virtual {v12}, Lw4/c;->k()Lw4/c;

    .line 680
    .line 681
    .line 682
    move-result-object v12

    .line 683
    add-int/lit8 v13, v13, 0x1

    .line 684
    .line 685
    goto :goto_14

    .line 686
    :cond_1a
    sget-object v13, Lw4/c;->z:Lw4/c;

    .line 687
    .line 688
    const/4 v15, 0x0

    .line 689
    invoke-static {v2, v13, v15}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 690
    .line 691
    .line 692
    move-result-object v13

    .line 693
    iget v15, v12, Lw4/c;->h:I

    .line 694
    .line 695
    packed-switch v15, :pswitch_data_4

    .line 696
    .line 697
    .line 698
    new-instance v21, Lu4/v;

    .line 699
    .line 700
    sget-object v22, Lu4/s;->q:Lu4/r;

    .line 701
    .line 702
    sget-object v24, Lu4/p;->i:Lu4/p;

    .line 703
    .line 704
    iget-object v15, v1, Li4/a0;->u:Lw4/b;

    .line 705
    .line 706
    new-instance v11, Lv4/d0;

    .line 707
    .line 708
    invoke-direct {v11, v12}, Lv4/d0;-><init>(Lw4/c;)V

    .line 709
    .line 710
    .line 711
    move-object/from16 v26, v11

    .line 712
    .line 713
    move-object/from16 v23, v14

    .line 714
    .line 715
    move-object/from16 v25, v15

    .line 716
    .line 717
    invoke-direct/range {v21 .. v26}, Lu4/v;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;Lv4/a;)V

    .line 718
    .line 719
    .line 720
    :goto_15
    move-object/from16 v11, v21

    .line 721
    .line 722
    goto :goto_17

    .line 723
    :pswitch_b
    move-object/from16 v23, v14

    .line 724
    .line 725
    new-instance v11, Lv4/m;

    .line 726
    .line 727
    sget-object v14, Lv4/d0;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 728
    .line 729
    packed-switch v15, :pswitch_data_5

    .line 730
    .line 731
    .line 732
    const-string v0, "not primitive: "

    .line 733
    .line 734
    invoke-static {v12, v0}, Lg1/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 735
    .line 736
    .line 737
    return-void

    .line 738
    :pswitch_c
    sget-object v12, Lv4/d0;->r:Lv4/d0;

    .line 739
    .line 740
    goto :goto_16

    .line 741
    :pswitch_d
    sget-object v12, Lv4/d0;->p:Lv4/d0;

    .line 742
    .line 743
    goto :goto_16

    .line 744
    :pswitch_e
    sget-object v12, Lv4/d0;->q:Lv4/d0;

    .line 745
    .line 746
    goto :goto_16

    .line 747
    :pswitch_f
    sget-object v12, Lv4/d0;->o:Lv4/d0;

    .line 748
    .line 749
    goto :goto_16

    .line 750
    :pswitch_10
    sget-object v12, Lv4/d0;->n:Lv4/d0;

    .line 751
    .line 752
    goto :goto_16

    .line 753
    :pswitch_11
    sget-object v12, Lv4/d0;->m:Lv4/d0;

    .line 754
    .line 755
    goto :goto_16

    .line 756
    :pswitch_12
    sget-object v12, Lv4/d0;->l:Lv4/d0;

    .line 757
    .line 758
    goto :goto_16

    .line 759
    :pswitch_13
    sget-object v12, Lv4/d0;->k:Lv4/d0;

    .line 760
    .line 761
    goto :goto_16

    .line 762
    :pswitch_14
    sget-object v12, Lv4/d0;->s:Lv4/d0;

    .line 763
    .line 764
    :goto_16
    sget-object v14, Lv4/z;->i:Lv4/z;

    .line 765
    .line 766
    invoke-direct {v11, v12, v14}, Lv4/w;-><init>(Lv4/d0;Lv4/z;)V

    .line 767
    .line 768
    .line 769
    new-instance v21, Lu4/v;

    .line 770
    .line 771
    sget-object v22, Lu4/s;->w2:Lu4/r;

    .line 772
    .line 773
    sget-object v24, Lu4/p;->i:Lu4/p;

    .line 774
    .line 775
    iget-object v12, v1, Li4/a0;->u:Lw4/b;

    .line 776
    .line 777
    move-object/from16 v26, v11

    .line 778
    .line 779
    move-object/from16 v25, v12

    .line 780
    .line 781
    invoke-direct/range {v21 .. v26}, Lu4/v;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;Lv4/a;)V

    .line 782
    .line 783
    .line 784
    move-object/from16 v14, v23

    .line 785
    .line 786
    goto :goto_15

    .line 787
    :goto_17
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 788
    .line 789
    .line 790
    iget-object v11, v13, Lu4/o;->h:Lw4/d;

    .line 791
    .line 792
    invoke-interface {v11}, Lw4/d;->getType()Lw4/c;

    .line 793
    .line 794
    .line 795
    move-result-object v11

    .line 796
    invoke-static {v11}, Lu4/s;->j(Lw4/d;)Lu4/r;

    .line 797
    .line 798
    .line 799
    move-result-object v11

    .line 800
    new-instance v12, Lu4/m;

    .line 801
    .line 802
    sget-object v15, Lu4/p;->i:Lu4/p;

    .line 803
    .line 804
    invoke-direct {v12, v11, v14, v13, v15}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 808
    .line 809
    .line 810
    sget-object v11, Lw4/c;->E:Lw4/c;

    .line 811
    .line 812
    const/4 v12, 0x0

    .line 813
    invoke-static {v2, v11, v12}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 814
    .line 815
    .line 816
    move-result-object v2

    .line 817
    new-instance v21, Lu4/v;

    .line 818
    .line 819
    sget-object v11, Li4/a0;->E:Lv4/y;

    .line 820
    .line 821
    iget-object v12, v11, Lv4/e;->i:Lw4/a;

    .line 822
    .line 823
    new-instance v10, Lu4/r;

    .line 824
    .line 825
    invoke-virtual {v12}, Lw4/a;->c()Lw4/b;

    .line 826
    .line 827
    .line 828
    move-result-object v12

    .line 829
    move-object/from16 v17, v0

    .line 830
    .line 831
    sget-object v0, Lw4/b;->p:Lw4/b;

    .line 832
    .line 833
    move-object/from16 v27, v7

    .line 834
    .line 835
    const/16 v7, 0x31

    .line 836
    .line 837
    invoke-direct {v10, v7, v12, v0}, Lu4/r;-><init>(ILw4/b;Lw4/e;)V

    .line 838
    .line 839
    .line 840
    invoke-static {v13, v8}, Lu4/p;->q(Lu4/o;Lu4/o;)Lu4/p;

    .line 841
    .line 842
    .line 843
    move-result-object v24

    .line 844
    iget-object v0, v1, Li4/a0;->u:Lw4/b;

    .line 845
    .line 846
    move-object/from16 v25, v0

    .line 847
    .line 848
    move-object/from16 v22, v10

    .line 849
    .line 850
    move-object/from16 v26, v11

    .line 851
    .line 852
    move-object/from16 v23, v14

    .line 853
    .line 854
    invoke-direct/range {v21 .. v26}, Lu4/v;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;Lv4/a;)V

    .line 855
    .line 856
    .line 857
    move-object/from16 v0, v21

    .line 858
    .line 859
    move-object/from16 v8, v26

    .line 860
    .line 861
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 862
    .line 863
    .line 864
    iget-object v0, v8, Lv4/e;->i:Lw4/a;

    .line 865
    .line 866
    iget-object v0, v0, Lw4/a;->h:Lw4/c;

    .line 867
    .line 868
    invoke-static {v0}, Lu4/s;->i(Lw4/d;)Lu4/r;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    new-instance v8, Lu4/m;

    .line 873
    .line 874
    invoke-direct {v8, v0, v14, v2, v15}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 875
    .line 876
    .line 877
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 878
    .line 879
    .line 880
    invoke-static {v2}, Lu4/p;->p(Lu4/o;)Lu4/p;

    .line 881
    .line 882
    .line 883
    move-result-object v15

    .line 884
    const/16 v0, 0xc0

    .line 885
    .line 886
    goto :goto_18

    .line 887
    :cond_1b
    const-string v0, "count < 0"

    .line 888
    .line 889
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 890
    .line 891
    .line 892
    return-void

    .line 893
    :cond_1c
    invoke-static {v13}, Lu4/s;->p(Lw4/d;)V

    .line 894
    .line 895
    .line 896
    const/16 v18, 0x0

    .line 897
    .line 898
    throw v18

    .line 899
    :cond_1d
    move-object/from16 v17, v0

    .line 900
    .line 901
    move-object/from16 v27, v7

    .line 902
    .line 903
    move/from16 v19, v12

    .line 904
    .line 905
    move-object/from16 v14, v23

    .line 906
    .line 907
    const/16 v7, 0x31

    .line 908
    .line 909
    const/16 v0, 0xa8

    .line 910
    .line 911
    if-ne v2, v0, :cond_1e

    .line 912
    .line 913
    const/4 v8, 0x1

    .line 914
    iput-boolean v8, v1, Li4/a0;->z:Z

    .line 915
    .line 916
    return-void

    .line 917
    :cond_1e
    const/16 v0, 0xa9

    .line 918
    .line 919
    if-ne v2, v0, :cond_1f

    .line 920
    .line 921
    const/4 v0, 0x0

    .line 922
    :try_start_1
    invoke-virtual {v1, v0}, Li4/a0;->a(I)Lw4/d;

    .line 923
    .line 924
    .line 925
    move-result-object v0

    .line 926
    check-cast v0, Li4/v;

    .line 927
    .line 928
    iput-object v0, v1, Li4/a0;->B:Li4/v;
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0

    .line 929
    .line 930
    return-void

    .line 931
    :catch_0
    move-exception v0

    .line 932
    const-string v2, "Argument to RET was not a ReturnAddress"

    .line 933
    .line 934
    invoke-static {v2, v0}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 935
    .line 936
    .line 937
    return-void

    .line 938
    :cond_1f
    move v0, v2

    .line 939
    :goto_18
    const/16 v11, 0x3b

    .line 940
    .line 941
    const/16 v12, 0x29

    .line 942
    .line 943
    if-eqz v0, :cond_2b

    .line 944
    .line 945
    const/16 v7, 0x14

    .line 946
    .line 947
    if-eq v0, v7, :cond_2a

    .line 948
    .line 949
    const/16 v7, 0x15

    .line 950
    .line 951
    if-eq v0, v7, :cond_29

    .line 952
    .line 953
    const/16 v7, 0xab

    .line 954
    .line 955
    if-eq v0, v7, :cond_28

    .line 956
    .line 957
    const/16 v7, 0xac

    .line 958
    .line 959
    if-eq v0, v7, :cond_27

    .line 960
    .line 961
    const/16 v7, 0xc6

    .line 962
    .line 963
    if-eq v0, v7, :cond_26

    .line 964
    .line 965
    const/16 v7, 0xc7

    .line 966
    .line 967
    if-eq v0, v7, :cond_25

    .line 968
    .line 969
    sparse-switch v0, :sswitch_data_1

    .line 970
    .line 971
    .line 972
    packed-switch v0, :pswitch_data_6

    .line 973
    .line 974
    .line 975
    packed-switch v0, :pswitch_data_7

    .line 976
    .line 977
    .line 978
    invoke-static/range {v27 .. v27}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 979
    .line 980
    .line 981
    return-void

    .line 982
    :pswitch_15
    const/16 v7, 0x25

    .line 983
    .line 984
    :goto_19
    move v2, v7

    .line 985
    goto/16 :goto_1c

    .line 986
    .line 987
    :pswitch_16
    const/16 v7, 0x24

    .line 988
    .line 989
    goto :goto_19

    .line 990
    :pswitch_17
    const/16 v7, 0x2c

    .line 991
    .line 992
    goto :goto_19

    .line 993
    :pswitch_18
    const/16 v7, 0x2b

    .line 994
    .line 995
    goto :goto_19

    .line 996
    :pswitch_19
    const/16 v7, 0x23

    .line 997
    .line 998
    goto :goto_19

    .line 999
    :pswitch_1a
    const/16 v7, 0x22

    .line 1000
    .line 1001
    goto :goto_19

    .line 1002
    :pswitch_1b
    move v2, v12

    .line 1003
    goto/16 :goto_1c

    .line 1004
    .line 1005
    :pswitch_1c
    const/16 v7, 0x28

    .line 1006
    .line 1007
    goto :goto_19

    .line 1008
    :pswitch_1d
    move v2, v11

    .line 1009
    goto/16 :goto_1c

    .line 1010
    .line 1011
    :pswitch_1e
    const/16 v7, 0x35

    .line 1012
    .line 1013
    goto :goto_19

    .line 1014
    :pswitch_1f
    const/16 v2, 0x31

    .line 1015
    .line 1016
    goto/16 :goto_1c

    .line 1017
    .line 1018
    :pswitch_20
    move-object v7, v6

    .line 1019
    check-cast v7, Lv4/y;

    .line 1020
    .line 1021
    iget-object v8, v7, Lv4/w;->h:Lv4/z;

    .line 1022
    .line 1023
    iget-object v8, v8, Lv4/z;->g:Lv4/c0;

    .line 1024
    .line 1025
    iget-object v8, v8, Lv4/c0;->g:Ljava/lang/String;

    .line 1026
    .line 1027
    const-string v10, "<init>"

    .line 1028
    .line 1029
    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1030
    .line 1031
    .line 1032
    move-result v8

    .line 1033
    if-nez v8, :cond_21

    .line 1034
    .line 1035
    iget-object v7, v7, Lv4/w;->g:Lv4/d0;

    .line 1036
    .line 1037
    invoke-interface/range {v17 .. v17}, Ll4/a;->b()Lv4/d0;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v8

    .line 1041
    invoke-virtual {v7, v8}, Lv4/d0;->equals(Ljava/lang/Object;)Z

    .line 1042
    .line 1043
    .line 1044
    move-result v7

    .line 1045
    if-eqz v7, :cond_20

    .line 1046
    .line 1047
    goto :goto_1a

    .line 1048
    :cond_20
    const/16 v7, 0x33

    .line 1049
    .line 1050
    goto :goto_19

    .line 1051
    :cond_21
    :goto_1a
    const/16 v2, 0x34

    .line 1052
    .line 1053
    goto/16 :goto_1c

    .line 1054
    .line 1055
    :pswitch_21
    move-object v7, v6

    .line 1056
    check-cast v7, Lv4/y;

    .line 1057
    .line 1058
    iget-object v8, v7, Lv4/w;->g:Lv4/d0;

    .line 1059
    .line 1060
    invoke-interface/range {v17 .. v17}, Ll4/a;->b()Lv4/d0;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v10

    .line 1064
    invoke-virtual {v8, v10}, Lv4/d0;->equals(Ljava/lang/Object;)Z

    .line 1065
    .line 1066
    .line 1067
    move-result v8

    .line 1068
    if-eqz v8, :cond_23

    .line 1069
    .line 1070
    const/4 v8, 0x0

    .line 1071
    :goto_1b
    iget-object v10, v1, Li4/a0;->q:Lh4/u;

    .line 1072
    .line 1073
    iget-object v2, v10, Lz4/e;->h:[Ljava/lang/Object;

    .line 1074
    .line 1075
    array-length v2, v2

    .line 1076
    if-ge v8, v2, :cond_23

    .line 1077
    .line 1078
    invoke-virtual {v10, v8}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v2

    .line 1082
    check-cast v2, Ll4/b;

    .line 1083
    .line 1084
    invoke-interface {v2}, Ll4/a;->c()I

    .line 1085
    .line 1086
    .line 1087
    move-result v10

    .line 1088
    and-int/lit8 v10, v10, 0x2

    .line 1089
    .line 1090
    if-eqz v10, :cond_22

    .line 1091
    .line 1092
    iget-object v10, v7, Lv4/w;->h:Lv4/z;

    .line 1093
    .line 1094
    invoke-interface {v2}, Ll4/a;->d()Lv4/z;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v2

    .line 1098
    invoke-virtual {v10, v2}, Lv4/z;->equals(Ljava/lang/Object;)Z

    .line 1099
    .line 1100
    .line 1101
    move-result v2

    .line 1102
    if-eqz v2, :cond_22

    .line 1103
    .line 1104
    goto :goto_1a

    .line 1105
    :cond_22
    add-int/lit8 v8, v8, 0x1

    .line 1106
    .line 1107
    goto :goto_1b

    .line 1108
    :cond_23
    invoke-virtual {v7}, Lv4/e;->k()Z

    .line 1109
    .line 1110
    .line 1111
    move-result v2

    .line 1112
    if-eqz v2, :cond_24

    .line 1113
    .line 1114
    const/16 v2, 0x3a

    .line 1115
    .line 1116
    goto/16 :goto_1c

    .line 1117
    .line 1118
    :cond_24
    const/16 v2, 0x32

    .line 1119
    .line 1120
    goto/16 :goto_1c

    .line 1121
    .line 1122
    :pswitch_22
    const/16 v2, 0x2f

    .line 1123
    .line 1124
    goto/16 :goto_1c

    .line 1125
    .line 1126
    :pswitch_23
    const/16 v2, 0x2d

    .line 1127
    .line 1128
    goto/16 :goto_1c

    .line 1129
    .line 1130
    :pswitch_24
    const/16 v2, 0x30

    .line 1131
    .line 1132
    goto/16 :goto_1c

    .line 1133
    .line 1134
    :pswitch_25
    const/16 v2, 0x2e

    .line 1135
    .line 1136
    goto/16 :goto_1c

    .line 1137
    .line 1138
    :pswitch_26
    move/from16 v2, v19

    .line 1139
    .line 1140
    goto/16 :goto_1c

    .line 1141
    .line 1142
    :pswitch_27
    const/16 v2, 0xb

    .line 1143
    .line 1144
    goto/16 :goto_1c

    .line 1145
    .line 1146
    :pswitch_28
    const/16 v2, 0xc

    .line 1147
    .line 1148
    goto/16 :goto_1c

    .line 1149
    .line 1150
    :pswitch_29
    const/16 v2, 0xa

    .line 1151
    .line 1152
    goto/16 :goto_1c

    .line 1153
    .line 1154
    :pswitch_2a
    const/16 v2, 0x9

    .line 1155
    .line 1156
    goto/16 :goto_1c

    .line 1157
    .line 1158
    :pswitch_2b
    const/16 v2, 0x1c

    .line 1159
    .line 1160
    goto/16 :goto_1c

    .line 1161
    .line 1162
    :pswitch_2c
    const/16 v2, 0x1b

    .line 1163
    .line 1164
    goto :goto_1c

    .line 1165
    :pswitch_2d
    const/16 v2, 0x20

    .line 1166
    .line 1167
    goto :goto_1c

    .line 1168
    :pswitch_2e
    const/16 v2, 0x1f

    .line 1169
    .line 1170
    goto :goto_1c

    .line 1171
    :pswitch_2f
    const/16 v2, 0x1e

    .line 1172
    .line 1173
    goto :goto_1c

    .line 1174
    :pswitch_30
    const/16 v2, 0x1d

    .line 1175
    .line 1176
    goto :goto_1c

    .line 1177
    :sswitch_4
    const/16 v2, 0x16

    .line 1178
    .line 1179
    goto :goto_1c

    .line 1180
    :sswitch_5
    const/16 v2, 0x15

    .line 1181
    .line 1182
    goto :goto_1c

    .line 1183
    :sswitch_6
    const/16 v2, 0x14

    .line 1184
    .line 1185
    goto :goto_1c

    .line 1186
    :sswitch_7
    const/16 v2, 0x19

    .line 1187
    .line 1188
    goto :goto_1c

    .line 1189
    :sswitch_8
    const/16 v2, 0x18

    .line 1190
    .line 1191
    goto :goto_1c

    .line 1192
    :sswitch_9
    const/16 v2, 0x17

    .line 1193
    .line 1194
    goto :goto_1c

    .line 1195
    :sswitch_a
    const/16 v2, 0x13

    .line 1196
    .line 1197
    goto :goto_1c

    .line 1198
    :sswitch_b
    const/16 v2, 0x12

    .line 1199
    .line 1200
    goto :goto_1c

    .line 1201
    :sswitch_c
    const/16 v2, 0x11

    .line 1202
    .line 1203
    goto :goto_1c

    .line 1204
    :sswitch_d
    const/16 v2, 0x10

    .line 1205
    .line 1206
    goto :goto_1c

    .line 1207
    :sswitch_e
    const/16 v2, 0xf

    .line 1208
    .line 1209
    goto :goto_1c

    .line 1210
    :pswitch_31
    :sswitch_f
    const/16 v2, 0xe

    .line 1211
    .line 1212
    goto :goto_1c

    .line 1213
    :sswitch_10
    const/16 v2, 0x27

    .line 1214
    .line 1215
    goto :goto_1c

    .line 1216
    :sswitch_11
    const/16 v2, 0x26

    .line 1217
    .line 1218
    goto :goto_1c

    .line 1219
    :cond_25
    :pswitch_32
    const/16 v2, 0x8

    .line 1220
    .line 1221
    goto :goto_1c

    .line 1222
    :cond_26
    :pswitch_33
    const/4 v2, 0x7

    .line 1223
    goto :goto_1c

    .line 1224
    :cond_27
    :pswitch_34
    const/16 v2, 0x21

    .line 1225
    .line 1226
    goto :goto_1c

    .line 1227
    :cond_28
    const/16 v2, 0xd

    .line 1228
    .line 1229
    goto :goto_1c

    .line 1230
    :cond_29
    :sswitch_12
    move/from16 v2, p3

    .line 1231
    .line 1232
    goto :goto_1c

    .line 1233
    :cond_2a
    :sswitch_13
    const/4 v2, 0x5

    .line 1234
    goto :goto_1c

    .line 1235
    :cond_2b
    :sswitch_14
    const/4 v2, 0x1

    .line 1236
    :goto_1c
    invoke-static {v2, v4, v15, v6}, Lu4/s;->o(ILw4/d;Lu4/p;Lv4/a;)Lu4/r;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v7

    .line 1240
    if-eqz v3, :cond_2d

    .line 1241
    .line 1242
    iget-boolean v8, v7, Lu4/r;->f:Z

    .line 1243
    .line 1244
    if-eqz v8, :cond_2d

    .line 1245
    .line 1246
    iget v8, v1, Li4/a0;->y:I

    .line 1247
    .line 1248
    const/16 v20, 0x1

    .line 1249
    .line 1250
    add-int/lit8 v8, v8, 0x1

    .line 1251
    .line 1252
    iput v8, v1, Li4/a0;->y:I

    .line 1253
    .line 1254
    iget v8, v7, Lu4/r;->a:I

    .line 1255
    .line 1256
    if-ne v8, v11, :cond_2c

    .line 1257
    .line 1258
    move-object v8, v6

    .line 1259
    check-cast v8, Lv4/i;

    .line 1260
    .line 1261
    iget-object v8, v8, Lv4/i;->g:Lv4/q;

    .line 1262
    .line 1263
    iget-object v8, v8, Lv4/q;->i:Lw4/a;

    .line 1264
    .line 1265
    iget-object v8, v8, Lw4/a;->h:Lw4/c;

    .line 1266
    .line 1267
    goto :goto_1d

    .line 1268
    :cond_2c
    move-object v8, v6

    .line 1269
    check-cast v8, Lv4/y;

    .line 1270
    .line 1271
    iget-object v8, v8, Lv4/e;->i:Lw4/a;

    .line 1272
    .line 1273
    iget-object v8, v8, Lw4/a;->h:Lw4/c;

    .line 1274
    .line 1275
    :goto_1d
    new-instance v10, Lu4/m;

    .line 1276
    .line 1277
    invoke-static {v8}, Lu4/s;->i(Lw4/d;)Lu4/r;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v8

    .line 1281
    sget-object v11, Lu4/p;->i:Lu4/p;

    .line 1282
    .line 1283
    invoke-direct {v10, v8, v14, v3, v11}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 1284
    .line 1285
    .line 1286
    move-object v8, v10

    .line 1287
    :goto_1e
    const/16 v24, 0x0

    .line 1288
    .line 1289
    goto :goto_1f

    .line 1290
    :cond_2d
    if-eqz v3, :cond_2e

    .line 1291
    .line 1292
    invoke-virtual {v7}, Lu4/r;->a()Z

    .line 1293
    .line 1294
    .line 1295
    move-result v8

    .line 1296
    if-eqz v8, :cond_2e

    .line 1297
    .line 1298
    iget v8, v1, Li4/a0;->y:I

    .line 1299
    .line 1300
    const/16 v20, 0x1

    .line 1301
    .line 1302
    add-int/lit8 v8, v8, 0x1

    .line 1303
    .line 1304
    iput v8, v1, Li4/a0;->y:I

    .line 1305
    .line 1306
    new-instance v8, Lu4/m;

    .line 1307
    .line 1308
    iget-object v10, v3, Lu4/o;->h:Lw4/d;

    .line 1309
    .line 1310
    invoke-static {v10}, Lu4/s;->j(Lw4/d;)Lu4/r;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v10

    .line 1314
    sget-object v11, Lu4/p;->i:Lu4/p;

    .line 1315
    .line 1316
    invoke-direct {v8, v10, v14, v3, v11}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 1317
    .line 1318
    .line 1319
    goto :goto_1e

    .line 1320
    :cond_2e
    move-object/from16 v24, v3

    .line 1321
    .line 1322
    const/4 v8, 0x0

    .line 1323
    :goto_1f
    if-ne v2, v12, :cond_30

    .line 1324
    .line 1325
    iget-object v3, v7, Lu4/r;->b:Lw4/c;

    .line 1326
    .line 1327
    invoke-static {v3}, Lv4/d0;->l(Lw4/c;)Lv4/d0;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v6

    .line 1331
    :cond_2f
    :goto_20
    move-object/from16 v22, v7

    .line 1332
    .line 1333
    move-object/from16 v25, v15

    .line 1334
    .line 1335
    goto/16 :goto_29

    .line 1336
    .line 1337
    :cond_30
    if-nez v6, :cond_2f

    .line 1338
    .line 1339
    move/from16 v3, p3

    .line 1340
    .line 1341
    if-ne v5, v3, :cond_2f

    .line 1342
    .line 1343
    const/4 v3, 0x0

    .line 1344
    invoke-virtual {v15, v3}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v5

    .line 1348
    check-cast v5, Lu4/o;

    .line 1349
    .line 1350
    iget-object v3, v5, Lu4/o;->h:Lw4/d;

    .line 1351
    .line 1352
    const/4 v5, 0x1

    .line 1353
    invoke-virtual {v15, v5}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v10

    .line 1357
    check-cast v10, Lu4/o;

    .line 1358
    .line 1359
    iget-object v5, v10, Lu4/o;->h:Lw4/d;

    .line 1360
    .line 1361
    invoke-interface {v5}, Lw4/d;->c()Z

    .line 1362
    .line 1363
    .line 1364
    move-result v10

    .line 1365
    if-nez v10, :cond_31

    .line 1366
    .line 1367
    invoke-interface {v3}, Lw4/d;->c()Z

    .line 1368
    .line 1369
    .line 1370
    move-result v10

    .line 1371
    if-eqz v10, :cond_2f

    .line 1372
    .line 1373
    :cond_31
    const/4 v10, 0x0

    .line 1374
    invoke-virtual {v15, v10}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v11

    .line 1378
    check-cast v11, Lu4/o;

    .line 1379
    .line 1380
    const/4 v10, 0x1

    .line 1381
    invoke-virtual {v15, v10}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v12

    .line 1385
    check-cast v12, Lu4/o;

    .line 1386
    .line 1387
    iget-object v10, v1, Li4/a0;->r:Lu4/e;

    .line 1388
    .line 1389
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1390
    .line 1391
    .line 1392
    iget-object v10, v11, Lu4/o;->h:Lw4/d;

    .line 1393
    .line 1394
    invoke-interface {v10}, Lw4/d;->getType()Lw4/c;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v11

    .line 1398
    sget-object v13, Lw4/c;->t:Lw4/c;

    .line 1399
    .line 1400
    if-eq v11, v13, :cond_32

    .line 1401
    .line 1402
    goto :goto_22

    .line 1403
    :cond_32
    iget-object v11, v12, Lu4/o;->h:Lw4/d;

    .line 1404
    .line 1405
    instance-of v12, v11, Lv4/o;

    .line 1406
    .line 1407
    if-nez v12, :cond_34

    .line 1408
    .line 1409
    instance-of v11, v10, Lv4/o;

    .line 1410
    .line 1411
    if-eqz v11, :cond_33

    .line 1412
    .line 1413
    iget v11, v7, Lu4/r;->a:I

    .line 1414
    .line 1415
    const/16 v12, 0xf

    .line 1416
    .line 1417
    if-ne v11, v12, :cond_33

    .line 1418
    .line 1419
    check-cast v10, Lv4/o;

    .line 1420
    .line 1421
    invoke-virtual {v10}, Lv4/s;->l()I

    .line 1422
    .line 1423
    .line 1424
    move-result v10

    .line 1425
    int-to-short v11, v10

    .line 1426
    if-ne v11, v10, :cond_33

    .line 1427
    .line 1428
    :goto_21
    const/4 v10, 0x1

    .line 1429
    goto :goto_23

    .line 1430
    :cond_33
    :goto_22
    const/4 v10, 0x0

    .line 1431
    goto :goto_23

    .line 1432
    :cond_34
    check-cast v11, Lv4/o;

    .line 1433
    .line 1434
    iget v10, v11, Lv4/s;->g:I

    .line 1435
    .line 1436
    iget v12, v7, Lu4/r;->a:I

    .line 1437
    .line 1438
    packed-switch v12, :pswitch_data_8

    .line 1439
    .line 1440
    .line 1441
    :pswitch_35
    goto :goto_22

    .line 1442
    :pswitch_36
    int-to-byte v11, v10

    .line 1443
    if-ne v11, v10, :cond_33

    .line 1444
    .line 1445
    goto :goto_21

    .line 1446
    :pswitch_37
    neg-int v10, v10

    .line 1447
    invoke-static {v10}, Lv4/o;->o(I)Lv4/o;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v10

    .line 1451
    invoke-virtual {v10}, Lv4/s;->l()I

    .line 1452
    .line 1453
    .line 1454
    move-result v10

    .line 1455
    int-to-short v11, v10

    .line 1456
    if-ne v11, v10, :cond_33

    .line 1457
    .line 1458
    goto :goto_21

    .line 1459
    :pswitch_38
    invoke-virtual {v11}, Lv4/s;->l()I

    .line 1460
    .line 1461
    .line 1462
    move-result v10

    .line 1463
    int-to-short v11, v10

    .line 1464
    if-ne v11, v10, :cond_33

    .line 1465
    .line 1466
    goto :goto_21

    .line 1467
    :goto_23
    if-eqz v10, :cond_2f

    .line 1468
    .line 1469
    invoke-interface {v5}, Lw4/d;->c()Z

    .line 1470
    .line 1471
    .line 1472
    move-result v6

    .line 1473
    if-eqz v6, :cond_39

    .line 1474
    .line 1475
    move-object v3, v5

    .line 1476
    check-cast v3, Lv4/a;

    .line 1477
    .line 1478
    iget-object v6, v15, Lz4/e;->h:[Ljava/lang/Object;

    .line 1479
    .line 1480
    array-length v6, v6

    .line 1481
    const/16 v20, 0x1

    .line 1482
    .line 1483
    add-int/lit8 v6, v6, -0x1

    .line 1484
    .line 1485
    if-nez v6, :cond_35

    .line 1486
    .line 1487
    sget-object v6, Lu4/p;->i:Lu4/p;

    .line 1488
    .line 1489
    goto :goto_25

    .line 1490
    :cond_35
    new-instance v10, Lu4/p;

    .line 1491
    .line 1492
    invoke-direct {v10, v6}, Lz4/e;-><init>(I)V

    .line 1493
    .line 1494
    .line 1495
    const/4 v11, 0x0

    .line 1496
    :goto_24
    if-ge v11, v6, :cond_36

    .line 1497
    .line 1498
    invoke-virtual {v15, v11}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v12

    .line 1502
    invoke-virtual {v10, v11, v12}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 1503
    .line 1504
    .line 1505
    add-int/lit8 v11, v11, 0x1

    .line 1506
    .line 1507
    goto :goto_24

    .line 1508
    :cond_36
    iget-boolean v6, v15, Lz4/j;->g:Z

    .line 1509
    .line 1510
    if-nez v6, :cond_37

    .line 1511
    .line 1512
    const/4 v6, 0x0

    .line 1513
    iput-boolean v6, v10, Lz4/j;->g:Z

    .line 1514
    .line 1515
    :cond_37
    move-object v6, v10

    .line 1516
    :goto_25
    iget v7, v7, Lu4/r;->a:I

    .line 1517
    .line 1518
    const/16 v12, 0xf

    .line 1519
    .line 1520
    if-ne v7, v12, :cond_38

    .line 1521
    .line 1522
    check-cast v5, Lv4/o;

    .line 1523
    .line 1524
    iget v2, v5, Lv4/s;->g:I

    .line 1525
    .line 1526
    neg-int v2, v2

    .line 1527
    invoke-static {v2}, Lv4/o;->o(I)Lv4/o;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v2

    .line 1531
    move-object v15, v6

    .line 1532
    move-object v6, v2

    .line 1533
    const/16 v2, 0xe

    .line 1534
    .line 1535
    goto :goto_28

    .line 1536
    :cond_38
    move-object v15, v6

    .line 1537
    move-object v6, v3

    .line 1538
    goto :goto_28

    .line 1539
    :cond_39
    check-cast v3, Lv4/a;

    .line 1540
    .line 1541
    iget-object v5, v15, Lz4/e;->h:[Ljava/lang/Object;

    .line 1542
    .line 1543
    array-length v5, v5

    .line 1544
    const/16 v20, 0x1

    .line 1545
    .line 1546
    add-int/lit8 v5, v5, -0x1

    .line 1547
    .line 1548
    if-nez v5, :cond_3a

    .line 1549
    .line 1550
    sget-object v5, Lu4/p;->i:Lu4/p;

    .line 1551
    .line 1552
    goto :goto_27

    .line 1553
    :cond_3a
    new-instance v6, Lu4/p;

    .line 1554
    .line 1555
    invoke-direct {v6, v5}, Lz4/e;-><init>(I)V

    .line 1556
    .line 1557
    .line 1558
    const/4 v7, 0x0

    .line 1559
    :goto_26
    if-ge v7, v5, :cond_3b

    .line 1560
    .line 1561
    add-int/lit8 v10, v7, 0x1

    .line 1562
    .line 1563
    invoke-virtual {v15, v10}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v11

    .line 1567
    invoke-virtual {v6, v7, v11}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 1568
    .line 1569
    .line 1570
    move v7, v10

    .line 1571
    goto :goto_26

    .line 1572
    :cond_3b
    iget-boolean v5, v15, Lz4/j;->g:Z

    .line 1573
    .line 1574
    if-nez v5, :cond_3c

    .line 1575
    .line 1576
    const/4 v10, 0x0

    .line 1577
    iput-boolean v10, v6, Lz4/j;->g:Z

    .line 1578
    .line 1579
    :cond_3c
    move-object v5, v6

    .line 1580
    :goto_27
    move-object v6, v3

    .line 1581
    move-object v15, v5

    .line 1582
    :goto_28
    invoke-static {v2, v4, v15, v6}, Lu4/s;->o(ILw4/d;Lu4/p;Lv4/a;)Lu4/r;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v7

    .line 1586
    goto/16 :goto_20

    .line 1587
    .line 1588
    :goto_29
    iget-object v3, v1, Li4/a0;->h:Li4/n;

    .line 1589
    .line 1590
    iget-object v4, v1, Li4/a0;->i:Ljava/util/ArrayList;

    .line 1591
    .line 1592
    invoke-virtual/range {v22 .. v22}, Lu4/r;->a()Z

    .line 1593
    .line 1594
    .line 1595
    move-result v5

    .line 1596
    iget-boolean v7, v1, Li4/a0;->A:Z

    .line 1597
    .line 1598
    or-int/2addr v7, v5

    .line 1599
    iput-boolean v7, v1, Li4/a0;->A:Z

    .line 1600
    .line 1601
    if-eqz v3, :cond_3e

    .line 1602
    .line 1603
    iget v0, v3, Li4/n;->i:I

    .line 1604
    .line 1605
    if-nez v0, :cond_3d

    .line 1606
    .line 1607
    new-instance v0, Lu4/m;

    .line 1608
    .line 1609
    sget-object v2, Lu4/s;->s:Lu4/r;

    .line 1610
    .line 1611
    sget-object v3, Lu4/p;->i:Lu4/p;

    .line 1612
    .line 1613
    const/4 v12, 0x0

    .line 1614
    invoke-direct {v0, v2, v14, v12, v3}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 1615
    .line 1616
    .line 1617
    const/4 v10, 0x0

    .line 1618
    iput v10, v1, Li4/a0;->x:I

    .line 1619
    .line 1620
    :goto_2a
    move-object/from16 v26, v6

    .line 1621
    .line 1622
    goto/16 :goto_32

    .line 1623
    .line 1624
    :cond_3d
    iget-object v0, v3, Li4/n;->j:Ljava/lang/Object;

    .line 1625
    .line 1626
    move-object/from16 v26, v0

    .line 1627
    .line 1628
    check-cast v26, Lz4/g;

    .line 1629
    .line 1630
    new-instance v21, Lu4/u;

    .line 1631
    .line 1632
    move-object/from16 v23, v14

    .line 1633
    .line 1634
    invoke-direct/range {v21 .. v26}, Lu4/u;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;Lz4/g;)V

    .line 1635
    .line 1636
    .line 1637
    move-object/from16 v0, v26

    .line 1638
    .line 1639
    iget v0, v0, Lz4/g;->i:I

    .line 1640
    .line 1641
    iput v0, v1, Li4/a0;->x:I

    .line 1642
    .line 1643
    move-object/from16 v26, v6

    .line 1644
    .line 1645
    :goto_2b
    move-object/from16 v0, v21

    .line 1646
    .line 1647
    goto/16 :goto_32

    .line 1648
    .line 1649
    :cond_3e
    move-object/from16 v7, v22

    .line 1650
    .line 1651
    move-object/from16 v15, v25

    .line 1652
    .line 1653
    const/16 v3, 0x21

    .line 1654
    .line 1655
    if-ne v2, v3, :cond_43

    .line 1656
    .line 1657
    iget-object v0, v15, Lz4/e;->h:[Ljava/lang/Object;

    .line 1658
    .line 1659
    array-length v0, v0

    .line 1660
    const/4 v10, 0x0

    .line 1661
    if-eqz v0, :cond_3f

    .line 1662
    .line 1663
    invoke-virtual {v15, v10}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v0

    .line 1667
    check-cast v0, Lu4/o;

    .line 1668
    .line 1669
    iget-object v2, v0, Lu4/o;->h:Lw4/d;

    .line 1670
    .line 1671
    iget v3, v0, Lu4/o;->g:I

    .line 1672
    .line 1673
    if-eqz v3, :cond_3f

    .line 1674
    .line 1675
    new-instance v3, Lu4/m;

    .line 1676
    .line 1677
    invoke-static {v2}, Lu4/s;->g(Lw4/d;)Lu4/r;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v5

    .line 1681
    const/4 v12, 0x0

    .line 1682
    invoke-static {v10, v2, v12}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v2

    .line 1686
    invoke-direct {v3, v5, v14, v2, v0}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/o;)V

    .line 1687
    .line 1688
    .line 1689
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1690
    .line 1691
    .line 1692
    goto :goto_2c

    .line 1693
    :cond_3f
    const/4 v12, 0x0

    .line 1694
    :goto_2c
    new-instance v0, Lu4/m;

    .line 1695
    .line 1696
    sget-object v2, Lu4/s;->s:Lu4/r;

    .line 1697
    .line 1698
    sget-object v3, Lu4/p;->i:Lu4/p;

    .line 1699
    .line 1700
    invoke-direct {v0, v2, v14, v12, v3}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 1701
    .line 1702
    .line 1703
    iput v10, v1, Li4/a0;->x:I

    .line 1704
    .line 1705
    iget-object v2, v1, Li4/a0;->C:Lu4/r;

    .line 1706
    .line 1707
    if-nez v2, :cond_41

    .line 1708
    .line 1709
    iput-object v7, v1, Li4/a0;->C:Lu4/r;

    .line 1710
    .line 1711
    iput-object v14, v1, Li4/a0;->D:Lu4/t;

    .line 1712
    .line 1713
    :cond_40
    :goto_2d
    const/4 v3, 0x1

    .line 1714
    goto :goto_2e

    .line 1715
    :cond_41
    if-ne v2, v7, :cond_42

    .line 1716
    .line 1717
    iget v2, v14, Lu4/t;->c:I

    .line 1718
    .line 1719
    iget-object v3, v1, Li4/a0;->D:Lu4/t;

    .line 1720
    .line 1721
    iget v3, v3, Lu4/t;->c:I

    .line 1722
    .line 1723
    if-le v2, v3, :cond_40

    .line 1724
    .line 1725
    iput-object v14, v1, Li4/a0;->D:Lu4/t;

    .line 1726
    .line 1727
    goto :goto_2d

    .line 1728
    :goto_2e
    iput-boolean v3, v1, Li4/a0;->w:Z

    .line 1729
    .line 1730
    goto :goto_2a

    .line 1731
    :cond_42
    new-instance v0, Li4/b0;

    .line 1732
    .line 1733
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1734
    .line 1735
    const-string v3, "return op mismatch: "

    .line 1736
    .line 1737
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1738
    .line 1739
    .line 1740
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1741
    .line 1742
    .line 1743
    iget-object v3, v1, Li4/a0;->C:Lu4/r;

    .line 1744
    .line 1745
    const-string v4, ", "

    .line 1746
    .line 1747
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1748
    .line 1749
    .line 1750
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1751
    .line 1752
    .line 1753
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v2

    .line 1757
    const/4 v12, 0x0

    .line 1758
    invoke-direct {v0, v2, v12}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1759
    .line 1760
    .line 1761
    throw v0

    .line 1762
    :cond_43
    if-eqz v6, :cond_46

    .line 1763
    .line 1764
    if-eqz v5, :cond_45

    .line 1765
    .line 1766
    iget v0, v7, Lu4/r;->a:I

    .line 1767
    .line 1768
    iget-object v2, v1, Li4/a0;->u:Lw4/b;

    .line 1769
    .line 1770
    const/16 v3, 0x3a

    .line 1771
    .line 1772
    if-ne v0, v3, :cond_44

    .line 1773
    .line 1774
    move-object/from16 v26, v6

    .line 1775
    .line 1776
    check-cast v26, Lv4/y;

    .line 1777
    .line 1778
    new-instance v21, Lu4/j;

    .line 1779
    .line 1780
    move-object/from16 v25, v2

    .line 1781
    .line 1782
    move-object/from16 v22, v7

    .line 1783
    .line 1784
    move-object/from16 v23, v14

    .line 1785
    .line 1786
    move-object/from16 v24, v15

    .line 1787
    .line 1788
    invoke-direct/range {v21 .. v26}, Lu4/j;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;Lv4/y;)V

    .line 1789
    .line 1790
    .line 1791
    move-object/from16 v26, v6

    .line 1792
    .line 1793
    :goto_2f
    move-object/from16 v0, v21

    .line 1794
    .line 1795
    const/4 v3, 0x1

    .line 1796
    goto :goto_30

    .line 1797
    :cond_44
    move-object/from16 v25, v2

    .line 1798
    .line 1799
    move-object/from16 v22, v7

    .line 1800
    .line 1801
    move-object/from16 v23, v14

    .line 1802
    .line 1803
    move-object/from16 v24, v15

    .line 1804
    .line 1805
    new-instance v21, Lu4/v;

    .line 1806
    .line 1807
    move-object/from16 v26, v6

    .line 1808
    .line 1809
    invoke-direct/range {v21 .. v26}, Lu4/v;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;Lv4/a;)V

    .line 1810
    .line 1811
    .line 1812
    goto :goto_2f

    .line 1813
    :goto_30
    iput-boolean v3, v1, Li4/a0;->v:Z

    .line 1814
    .line 1815
    iget-object v2, v1, Li4/a0;->u:Lw4/b;

    .line 1816
    .line 1817
    iget-object v2, v2, Lz4/e;->h:[Ljava/lang/Object;

    .line 1818
    .line 1819
    array-length v2, v2

    .line 1820
    iput v2, v1, Li4/a0;->x:I

    .line 1821
    .line 1822
    move-object/from16 v14, v23

    .line 1823
    .line 1824
    goto :goto_32

    .line 1825
    :cond_45
    move-object/from16 v26, v6

    .line 1826
    .line 1827
    move-object/from16 v22, v7

    .line 1828
    .line 1829
    move-object/from16 v23, v14

    .line 1830
    .line 1831
    move-object/from16 v25, v15

    .line 1832
    .line 1833
    new-instance v21, Lu4/l;

    .line 1834
    .line 1835
    invoke-direct/range {v21 .. v26}, Lu4/l;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;Lv4/a;)V

    .line 1836
    .line 1837
    .line 1838
    goto/16 :goto_2b

    .line 1839
    .line 1840
    :cond_46
    move-object/from16 v26, v6

    .line 1841
    .line 1842
    move-object/from16 v3, v24

    .line 1843
    .line 1844
    if-eqz v5, :cond_48

    .line 1845
    .line 1846
    new-instance v2, Lu4/u;

    .line 1847
    .line 1848
    iget-object v3, v1, Li4/a0;->u:Lw4/b;

    .line 1849
    .line 1850
    invoke-direct {v2, v7, v14, v15, v3}, Lu4/u;-><init>(Lu4/r;Lu4/t;Lu4/p;Lw4/e;)V

    .line 1851
    .line 1852
    .line 1853
    const/4 v3, 0x1

    .line 1854
    iput-boolean v3, v1, Li4/a0;->v:Z

    .line 1855
    .line 1856
    const/16 v3, 0xbf

    .line 1857
    .line 1858
    if-ne v0, v3, :cond_47

    .line 1859
    .line 1860
    const/4 v0, -0x1

    .line 1861
    iput v0, v1, Li4/a0;->x:I

    .line 1862
    .line 1863
    goto :goto_31

    .line 1864
    :cond_47
    iget-object v0, v1, Li4/a0;->u:Lw4/b;

    .line 1865
    .line 1866
    iget-object v0, v0, Lz4/e;->h:[Ljava/lang/Object;

    .line 1867
    .line 1868
    array-length v0, v0

    .line 1869
    iput v0, v1, Li4/a0;->x:I

    .line 1870
    .line 1871
    :goto_31
    move-object v0, v2

    .line 1872
    goto :goto_32

    .line 1873
    :cond_48
    new-instance v0, Lu4/m;

    .line 1874
    .line 1875
    invoke-direct {v0, v7, v14, v3, v15}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/p;)V

    .line 1876
    .line 1877
    .line 1878
    :goto_32
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1879
    .line 1880
    .line 1881
    if-eqz v8, :cond_49

    .line 1882
    .line 1883
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1884
    .line 1885
    .line 1886
    :cond_49
    if-eqz v4, :cond_4e

    .line 1887
    .line 1888
    iget v0, v1, Li4/a0;->y:I

    .line 1889
    .line 1890
    const/16 v20, 0x1

    .line 1891
    .line 1892
    add-int/lit8 v0, v0, 0x1

    .line 1893
    .line 1894
    iput v0, v1, Li4/a0;->y:I

    .line 1895
    .line 1896
    new-instance v21, Lu4/g;

    .line 1897
    .line 1898
    sget-object v22, Lu4/s;->T2:Lu4/r;

    .line 1899
    .line 1900
    iget-object v0, v8, Lu4/i;->i:Lu4/o;

    .line 1901
    .line 1902
    invoke-static {v0}, Lu4/p;->p(Lu4/o;)Lu4/p;

    .line 1903
    .line 1904
    .line 1905
    move-result-object v24

    .line 1906
    move-object/from16 v25, v4

    .line 1907
    .line 1908
    move-object/from16 v23, v14

    .line 1909
    .line 1910
    invoke-direct/range {v21 .. v26}, Lu4/g;-><init>(Lu4/r;Lu4/t;Lu4/p;Ljava/util/ArrayList;Lv4/a;)V

    .line 1911
    .line 1912
    .line 1913
    move-object/from16 v0, v21

    .line 1914
    .line 1915
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1916
    .line 1917
    .line 1918
    return-void

    .line 1919
    :catch_1
    const-string v0, "n < 0"

    .line 1920
    .line 1921
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 1922
    .line 1923
    .line 1924
    return-void

    .line 1925
    :cond_4a
    const-string v0, "n >= resultCount"

    .line 1926
    .line 1927
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 1928
    .line 1929
    .line 1930
    return-void

    .line 1931
    :cond_4b
    move v10, v11

    .line 1932
    move-object/from16 v14, v23

    .line 1933
    .line 1934
    iget-object v0, v1, Li4/a0;->o:Li4/z;

    .line 1935
    .line 1936
    iget v2, v0, Li4/z;->c:I

    .line 1937
    .line 1938
    iget-object v3, v0, Li4/z;->a:Li4/m;

    .line 1939
    .line 1940
    iget-object v3, v3, Li4/m;->c:Lh4/c;

    .line 1941
    .line 1942
    iget v3, v3, Lh4/c;->b:I

    .line 1943
    .line 1944
    add-int/2addr v2, v3

    .line 1945
    invoke-virtual {v0}, Li4/z;->i()Z

    .line 1946
    .line 1947
    .line 1948
    move-result v0

    .line 1949
    if-eqz v0, :cond_4c

    .line 1950
    .line 1951
    add-int/lit8 v2, v2, 0x1

    .line 1952
    .line 1953
    :cond_4c
    new-array v0, v5, [Lu4/o;

    .line 1954
    .line 1955
    move v11, v10

    .line 1956
    :goto_33
    if-ge v11, v5, :cond_4d

    .line 1957
    .line 1958
    invoke-virtual {v15, v11}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 1959
    .line 1960
    .line 1961
    move-result-object v3

    .line 1962
    check-cast v3, Lu4/o;

    .line 1963
    .line 1964
    iget-object v4, v3, Lu4/o;->h:Lw4/d;

    .line 1965
    .line 1966
    invoke-virtual {v3, v2}, Lu4/o;->o(I)Lu4/o;

    .line 1967
    .line 1968
    .line 1969
    move-result-object v7

    .line 1970
    new-instance v8, Lu4/m;

    .line 1971
    .line 1972
    invoke-static {v4}, Lu4/s;->g(Lw4/d;)Lu4/r;

    .line 1973
    .line 1974
    .line 1975
    move-result-object v4

    .line 1976
    invoke-direct {v8, v4, v14, v7, v3}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/o;)V

    .line 1977
    .line 1978
    .line 1979
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1980
    .line 1981
    .line 1982
    aput-object v7, v0, v11

    .line 1983
    .line 1984
    invoke-virtual {v3}, Lu4/o;->j()I

    .line 1985
    .line 1986
    .line 1987
    move-result v3

    .line 1988
    add-int/2addr v2, v3

    .line 1989
    add-int/lit8 v11, v11, 0x1

    .line 1990
    .line 1991
    goto :goto_33

    .line 1992
    :cond_4d
    iget v2, v1, Li4/a0;->e:I

    .line 1993
    .line 1994
    :goto_34
    if-eqz v2, :cond_4e

    .line 1995
    .line 1996
    and-int/lit8 v3, v2, 0xf

    .line 1997
    .line 1998
    const/16 v20, 0x1

    .line 1999
    .line 2000
    add-int/lit8 v3, v3, -0x1

    .line 2001
    .line 2002
    aget-object v3, v0, v3

    .line 2003
    .line 2004
    iget-object v4, v3, Lu4/o;->h:Lw4/d;

    .line 2005
    .line 2006
    new-instance v5, Lu4/m;

    .line 2007
    .line 2008
    invoke-static {v4}, Lu4/s;->g(Lw4/d;)Lu4/r;

    .line 2009
    .line 2010
    .line 2011
    move-result-object v7

    .line 2012
    invoke-virtual {v3, v6}, Lu4/o;->o(I)Lu4/o;

    .line 2013
    .line 2014
    .line 2015
    move-result-object v8

    .line 2016
    invoke-direct {v5, v7, v14, v8, v3}, Lu4/m;-><init>(Lu4/r;Lu4/t;Lu4/o;Lu4/o;)V

    .line 2017
    .line 2018
    .line 2019
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2020
    .line 2021
    .line 2022
    invoke-interface {v4}, Lw4/d;->getType()Lw4/c;

    .line 2023
    .line 2024
    .line 2025
    move-result-object v3

    .line 2026
    invoke-virtual {v3}, Lw4/c;->i()I

    .line 2027
    .line 2028
    .line 2029
    move-result v3

    .line 2030
    add-int/2addr v6, v3

    .line 2031
    shr-int/lit8 v2, v2, 0x4

    .line 2032
    .line 2033
    goto :goto_34

    .line 2034
    :cond_4e
    return-void

    .line 2035
    :cond_4f
    new-instance v0, Li4/b0;

    .line 2036
    .line 2037
    const/4 v12, 0x0

    .line 2038
    invoke-direct {v0, v10, v12}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 2039
    .line 2040
    .line 2041
    throw v0

    .line 2042
    :cond_50
    const/4 v12, 0x0

    .line 2043
    new-instance v0, Li4/b0;

    .line 2044
    .line 2045
    invoke-direct {v0, v10, v12}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 2046
    .line 2047
    .line 2048
    throw v0

    .line 2049
    :cond_51
    move-object/from16 v27, v7

    .line 2050
    .line 2051
    invoke-static/range {v27 .. v27}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 2052
    .line 2053
    .line 2054
    return-void

    .line 2055
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x12 -> :sswitch_3
        0x2e -> :sswitch_1
        0x36 -> :sswitch_2
        0x4f -> :sswitch_0
        0x64 -> :sswitch_1
        0x68 -> :sswitch_1
        0x6c -> :sswitch_1
        0x70 -> :sswitch_1
        0x74 -> :sswitch_1
        0x78 -> :sswitch_1
        0x7a -> :sswitch_1
        0x7c -> :sswitch_1
        0x7e -> :sswitch_1
        0x80 -> :sswitch_1
        0x82 -> :sswitch_1
    .end sparse-switch

    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    :pswitch_data_0
    .packed-switch 0x57
        :pswitch_0
        :pswitch_0
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_2
    .end packed-switch

    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    :pswitch_data_1
    .packed-switch 0x84
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_9
        :pswitch_0
    .end packed-switch

    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    :pswitch_data_2
    .packed-switch 0xb1
        :pswitch_0
        :pswitch_8
        :pswitch_0
        :pswitch_8
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_8
        :pswitch_8
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_4
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    :pswitch_data_3
    .packed-switch 0xc5
        :pswitch_4
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
    .end packed-switch

    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
    .end packed-switch

    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    :sswitch_data_1
    .sparse-switch
        0x0 -> :sswitch_14
        0x12 -> :sswitch_13
        0x2e -> :sswitch_11
        0x36 -> :sswitch_12
        0x4f -> :sswitch_10
        0x60 -> :sswitch_f
        0x64 -> :sswitch_e
        0x68 -> :sswitch_d
        0x6c -> :sswitch_c
        0x70 -> :sswitch_b
        0x74 -> :sswitch_a
        0x78 -> :sswitch_9
        0x7a -> :sswitch_8
        0x7c -> :sswitch_7
        0x7e -> :sswitch_6
        0x80 -> :sswitch_5
        0x82 -> :sswitch_4
    .end sparse-switch

    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    :pswitch_data_6
    .packed-switch 0x84
        :pswitch_31
        :pswitch_30
        :pswitch_30
        :pswitch_30
        :pswitch_30
        :pswitch_30
        :pswitch_30
        :pswitch_30
        :pswitch_30
        :pswitch_30
        :pswitch_30
        :pswitch_30
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2c
        :pswitch_2b
        :pswitch_2c
        :pswitch_2b
        :pswitch_33
        :pswitch_32
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_33
        :pswitch_32
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_33
        :pswitch_32
        :pswitch_26
    .end packed-switch

    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    :pswitch_data_7
    .packed-switch 0xb1
        :pswitch_34
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
    .end packed-switch

    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    :pswitch_data_8
    .packed-switch 0xe
        :pswitch_38
        :pswitch_37
        :pswitch_38
        :pswitch_38
        :pswitch_38
        :pswitch_35
        :pswitch_38
        :pswitch_38
        :pswitch_38
        :pswitch_36
        :pswitch_36
        :pswitch_36
    .end packed-switch
.end method

.method public final i(Lw4/d;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Li4/a0;->m:[Lw4/d;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    aput-object p1, v0, v1

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput p1, p0, Li4/a0;->n:I

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string p1, "result == null"

    .line 13
    .line 14
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
