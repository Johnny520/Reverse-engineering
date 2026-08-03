.class public final Lwb/bq;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public h:I

.field public final synthetic i:Lgb/o;

.field public final synthetic j:Landroid/content/Context;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Lqg/t;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Li0/a1;

.field public final synthetic r:Li0/a1;


# direct methods
.method public constructor <init>(Lgb/o;Landroid/content/Context;Li0/a1;Li0/a1;Lqg/t;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwb/bq;->i:Lgb/o;

    .line 2
    .line 3
    iput-object p2, p0, Lwb/bq;->j:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, Lwb/bq;->k:Li0/a1;

    .line 6
    .line 7
    iput-object p4, p0, Lwb/bq;->l:Li0/a1;

    .line 8
    .line 9
    iput-object p5, p0, Lwb/bq;->m:Lqg/t;

    .line 10
    .line 11
    iput-object p6, p0, Lwb/bq;->n:Li0/a1;

    .line 12
    .line 13
    iput-object p7, p0, Lwb/bq;->o:Li0/a1;

    .line 14
    .line 15
    iput-object p8, p0, Lwb/bq;->p:Li0/a1;

    .line 16
    .line 17
    iput-object p9, p0, Lwb/bq;->q:Li0/a1;

    .line 18
    .line 19
    iput-object p10, p0, Lwb/bq;->r:Li0/a1;

    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-direct {p0, p1, p11}, Lyf/i;-><init>(ILwf/c;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 12

    .line 1
    new-instance v0, Lwb/bq;

    .line 2
    .line 3
    iget-object v9, p0, Lwb/bq;->q:Li0/a1;

    .line 4
    .line 5
    iget-object v10, p0, Lwb/bq;->r:Li0/a1;

    .line 6
    .line 7
    iget-object v1, p0, Lwb/bq;->i:Lgb/o;

    .line 8
    .line 9
    iget-object v2, p0, Lwb/bq;->j:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v3, p0, Lwb/bq;->k:Li0/a1;

    .line 12
    .line 13
    iget-object v4, p0, Lwb/bq;->l:Li0/a1;

    .line 14
    .line 15
    iget-object v5, p0, Lwb/bq;->m:Lqg/t;

    .line 16
    .line 17
    iget-object v6, p0, Lwb/bq;->n:Li0/a1;

    .line 18
    .line 19
    iget-object v7, p0, Lwb/bq;->o:Li0/a1;

    .line 20
    .line 21
    iget-object v8, p0, Lwb/bq;->p:Li0/a1;

    .line 22
    .line 23
    move-object v11, p2

    .line 24
    invoke-direct/range {v0 .. v11}, Lwb/bq;-><init>(Lgb/o;Landroid/content/Context;Li0/a1;Li0/a1;Lqg/t;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V

    .line 25
    .line 26
    .line 27
    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lwb/bq;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lwb/bq;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lwb/bq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lwb/bq;->h:I

    .line 2
    .line 3
    iget-object v4, p0, Lwb/bq;->j:Landroid/content/Context;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object v2, p0, Lwb/bq;->i:Lgb/o;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-ne v0, v3, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    sget-object p1, Lqg/c0;->a:Lxg/e;

    .line 27
    .line 28
    sget-object p1, Lxg/d;->i:Lxg/d;

    .line 29
    .line 30
    new-instance v0, Lwb/up;

    .line 31
    .line 32
    const/4 v5, 0x3

    .line 33
    invoke-direct {v0, v4, v2, v1, v5}, Lwb/up;-><init>(Landroid/content/Context;Lgb/o;Lwf/c;I)V

    .line 34
    .line 35
    .line 36
    iput v3, p0, Lwb/bq;->h:I

    .line 37
    .line 38
    invoke-static {p1, v0, p0}, Lqg/v;->x(Lwf/g;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 43
    .line 44
    if-ne p1, v0, :cond_2

    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    move-object v0, v2

    .line 54
    iget-object v2, p0, Lwb/bq;->k:Li0/a1;

    .line 55
    .line 56
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    iget-object p1, p0, Lwb/bq;->l:Li0/a1;

    .line 62
    .line 63
    invoke-interface {p1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    iget-object v9, p0, Lwb/bq;->i:Lgb/o;

    .line 68
    .line 69
    const/4 v10, 0x0

    .line 70
    iget-object v1, p0, Lwb/bq;->m:Lqg/t;

    .line 71
    .line 72
    iget-object v3, p0, Lwb/bq;->n:Li0/a1;

    .line 73
    .line 74
    iget-object v5, p0, Lwb/bq;->o:Li0/a1;

    .line 75
    .line 76
    iget-object v6, p0, Lwb/bq;->p:Li0/a1;

    .line 77
    .line 78
    iget-object v7, p0, Lwb/bq;->q:Li0/a1;

    .line 79
    .line 80
    iget-object v8, p0, Lwb/bq;->r:Li0/a1;

    .line 81
    .line 82
    invoke-static/range {v1 .. v10}, Lwb/y2;->z1(Lqg/t;Li0/a1;Li0/a1;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lgb/o;Z)V

    .line 83
    .line 84
    .line 85
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 86
    .line 87
    return-object p1
.end method
