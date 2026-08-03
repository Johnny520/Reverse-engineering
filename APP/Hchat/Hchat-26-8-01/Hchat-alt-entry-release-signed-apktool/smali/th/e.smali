.class public final Lth/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:Li1/b;

.field public final b:Ljava/util/ArrayList;

.field public c:Li1/b;

.field public d:I

.field public final e:Li0/f1;

.field public f:I

.field public final g:[Ljava/lang/String;

.field public final h:[I

.field public final i:[I

.field public final j:[Lf1/n0;

.field public final synthetic k:Lth/i;


# direct methods
.method public constructor <init>(Lth/i;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lth/e;->k:Lth/i;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lth/e;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput p1, p0, Lth/e;->d:I

    .line 15
    .line 16
    new-instance v0, Li0/f1;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, v1}, Li0/f1;-><init>(F)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lth/e;->e:Li0/f1;

    .line 23
    .line 24
    iput p1, p0, Lth/e;->f:I

    .line 25
    .line 26
    const-string p1, ""

    .line 27
    .line 28
    filled-new-array {p1, p1}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lth/e;->g:[Ljava/lang/String;

    .line 33
    .line 34
    const/4 p1, -0x1

    .line 35
    filled-new-array {p1, p1}, [I

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lth/e;->h:[I

    .line 40
    .line 41
    filled-new-array {p1, p1}, [I

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lth/e;->i:[I

    .line 46
    .line 47
    const/4 p1, 0x2

    .line 48
    new-array p1, p1, [Lf1/n0;

    .line 49
    .line 50
    iput-object p1, p0, Lth/e;->j:[Lf1/n0;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final a(I)Li1/b;
    .locals 3

    .line 1
    iget-object v0, p0, Lth/e;->k:Lth/i;

    .line 2
    .line 3
    invoke-static {v0}, Lx1/k;->u(Ly0/n;)Lf1/z;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    iget-object v1, p0, Lth/e;->b:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-gt v2, p1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Lf1/z;->c()Li1/b;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Li1/b;

    .line 28
    .line 29
    return-object p1
.end method

.method public final b()V
    .locals 5

    .line 1
    iget-object v0, p0, Lth/e;->k:Lth/i;

    .line 2
    .line 3
    invoke-static {v0}, Lx1/k;->u(Ly0/n;)Lf1/z;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lth/e;->a:Li1/b;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, v1}, Lf1/z;->a(Li1/b;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    iput-object v1, p0, Lth/e;->a:Li1/b;

    .line 16
    .line 17
    iget-object v2, p0, Lth/e;->b:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Li1/b;

    .line 34
    .line 35
    invoke-interface {v0, v4}, Lf1/z;->a(Li1/b;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, Lth/e;->c:Li1/b;

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-interface {v0, v2}, Lf1/z;->a(Li1/b;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    iput-object v1, p0, Lth/e;->c:Li1/b;

    .line 50
    .line 51
    iget-object v0, p0, Lth/e;->j:[Lf1/n0;

    .line 52
    .line 53
    invoke-static {v1, v0}, Ltf/l;->x0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lth/e;->g:[Ljava/lang/String;

    .line 57
    .line 58
    const-string v1, ""

    .line 59
    .line 60
    invoke-static {v1, v0}, Ltf/l;->x0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lth/e;->h:[I

    .line 64
    .line 65
    const/4 v1, -0x1

    .line 66
    invoke-static {v0, v1}, Ltf/l;->y0([II)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lth/e;->i:[I

    .line 70
    .line 71
    invoke-static {v0, v1}, Ltf/l;->y0([II)V

    .line 72
    .line 73
    .line 74
    return-void
.end method
