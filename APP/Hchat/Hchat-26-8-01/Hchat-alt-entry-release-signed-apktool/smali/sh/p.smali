.class public final Lsh/p;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public h:I

.field public final synthetic i:Z

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Ln/k;


# direct methods
.method public constructor <init>(ZLi0/a1;Ln/k;Lwf/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lsh/p;->i:Z

    .line 2
    .line 3
    iput-object p2, p0, Lsh/p;->j:Li0/a1;

    .line 4
    .line 5
    iput-object p3, p0, Lsh/p;->k:Ln/k;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lyf/i;-><init>(ILwf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static final f(Li0/a1;Ln/k;Lyf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lsh/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lsh/o;

    .line 7
    .line 8
    iget v1, v0, Lsh/o;->i:I

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
    iput v1, v0, Lsh/o;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lsh/o;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lyf/c;-><init>(Lwf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lsh/o;->h:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lsh/o;->i:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p0, v0, Lsh/o;->g:Li0/a1;

    .line 35
    .line 36
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p2}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    check-cast p2, Lzh/a;

    .line 55
    .line 56
    if-eqz p2, :cond_4

    .line 57
    .line 58
    new-instance p2, Lzh/b;

    .line 59
    .line 60
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p0, v0, Lsh/o;->g:Li0/a1;

    .line 64
    .line 65
    iput v2, v0, Lsh/o;->i:I

    .line 66
    .line 67
    invoke-virtual {p1, p2, v0}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 72
    .line 73
    if-ne p1, p2, :cond_3

    .line 74
    .line 75
    return-object p2

    .line 76
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 77
    invoke-interface {p0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 81
    .line 82
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 3

    .line 1
    new-instance p1, Lsh/p;

    .line 2
    .line 3
    iget-object v0, p0, Lsh/p;->j:Li0/a1;

    .line 4
    .line 5
    iget-object v1, p0, Lsh/p;->k:Ln/k;

    .line 6
    .line 7
    iget-boolean v2, p0, Lsh/p;->i:Z

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, Lsh/p;-><init>(ZLi0/a1;Ln/k;Lwf/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lqg/t;

    .line 2
    .line 3
    check-cast p2, Lwf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lsh/p;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lsh/p;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lsh/p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lsh/p;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lsh/p;->j:Li0/a1;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, p0, Lsh/p;->k:Ln/k;

    .line 9
    .line 10
    sget-object v6, Lxf/a;->g:Lxf/a;

    .line 11
    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    if-eq v0, v4, :cond_2

    .line 15
    .line 16
    if-eq v0, v3, :cond_1

    .line 17
    .line 18
    if-ne v0, v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    return-object p1

    .line 28
    :cond_1
    :goto_0
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_3

    .line 32
    :cond_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_3
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-boolean p1, p0, Lsh/p;->i:Z

    .line 40
    .line 41
    if-eqz p1, :cond_5

    .line 42
    .line 43
    iput v4, p0, Lsh/p;->h:I

    .line 44
    .line 45
    invoke-static {v1, v5, p0}, Lsh/p;->f(Li0/a1;Ln/k;Lyf/c;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p1, v6, :cond_4

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_4
    :goto_1
    new-instance p1, Lzh/a;

    .line 53
    .line 54
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iput v3, p0, Lsh/p;->h:I

    .line 61
    .line 62
    invoke-virtual {v5, p1, p0}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v6, :cond_6

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_5
    iput v2, p0, Lsh/p;->h:I

    .line 70
    .line 71
    invoke-static {v1, v5, p0}, Lsh/p;->f(Li0/a1;Ln/k;Lyf/c;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne p1, v6, :cond_6

    .line 76
    .line 77
    :goto_2
    return-object v6

    .line 78
    :cond_6
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 79
    .line 80
    return-object p1
.end method
