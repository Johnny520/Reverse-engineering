.class public final Lm/t2;
.super Lyf/h;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public g:I

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lqg/t;

.field public final synthetic j:Lm/t1;

.field public final synthetic k:Lfg/l;

.field public final synthetic l:Lfg/l;

.field public final synthetic m:Lfg/q;

.field public final synthetic n:Lfg/l;


# direct methods
.method public constructor <init>(Lqg/t;Lm/t1;Lfg/l;Lfg/l;Lfg/q;Lfg/l;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm/t2;->i:Lqg/t;

    .line 2
    .line 3
    iput-object p2, p0, Lm/t2;->j:Lm/t1;

    .line 4
    .line 5
    iput-object p3, p0, Lm/t2;->k:Lfg/l;

    .line 6
    .line 7
    iput-object p4, p0, Lm/t2;->l:Lfg/l;

    .line 8
    .line 9
    iput-object p5, p0, Lm/t2;->m:Lfg/q;

    .line 10
    .line 11
    iput-object p6, p0, Lm/t2;->n:Lfg/l;

    .line 12
    .line 13
    invoke-direct {p0, p7}, Lyf/h;-><init>(Lwf/c;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 8

    .line 1
    new-instance v0, Lm/t2;

    .line 2
    .line 3
    iget-object v5, p0, Lm/t2;->m:Lfg/q;

    .line 4
    .line 5
    iget-object v6, p0, Lm/t2;->n:Lfg/l;

    .line 6
    .line 7
    iget-object v1, p0, Lm/t2;->i:Lqg/t;

    .line 8
    .line 9
    iget-object v2, p0, Lm/t2;->j:Lm/t1;

    .line 10
    .line 11
    iget-object v3, p0, Lm/t2;->k:Lfg/l;

    .line 12
    .line 13
    iget-object v4, p0, Lm/t2;->l:Lfg/l;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, Lm/t2;-><init>(Lqg/t;Lm/t1;Lfg/l;Lfg/l;Lfg/q;Lfg/l;Lwf/c;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, Lm/t2;->h:Ljava/lang/Object;

    .line 20
    .line 21
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ls1/k0;

    .line 2
    .line 3
    check-cast p2, Lwf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lm/t2;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lm/t2;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lm/t2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lm/t2;->g:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return-object p1

    .line 19
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lm/t2;->h:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v2, p1

    .line 25
    check-cast v2, Ls1/k0;

    .line 26
    .line 27
    iput v1, p0, Lm/t2;->g:I

    .line 28
    .line 29
    iget-object v3, p0, Lm/t2;->i:Lqg/t;

    .line 30
    .line 31
    iget-object v4, p0, Lm/t2;->j:Lm/t1;

    .line 32
    .line 33
    iget-object v5, p0, Lm/t2;->k:Lfg/l;

    .line 34
    .line 35
    iget-object v6, p0, Lm/t2;->l:Lfg/l;

    .line 36
    .line 37
    iget-object v7, p0, Lm/t2;->m:Lfg/q;

    .line 38
    .line 39
    iget-object v8, p0, Lm/t2;->n:Lfg/l;

    .line 40
    .line 41
    move-object v9, p0

    .line 42
    invoke-static/range {v2 .. v9}, Lm/y2;->g(Ls1/k0;Lqg/t;Lm/t1;Lfg/l;Lfg/l;Lfg/q;Lfg/l;Lyf/a;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 47
    .line 48
    if-ne p1, v0, :cond_2

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_2
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 52
    .line 53
    return-object p1
.end method
