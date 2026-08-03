.class public final Ls/v0;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public h:I

.field public final synthetic i:Ls/w0;

.field public final synthetic j:I


# direct methods
.method public constructor <init>(Ls/w0;ILwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls/v0;->i:Ls/w0;

    .line 2
    .line 3
    iput p2, p0, Ls/v0;->j:I

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 2

    .line 1
    new-instance p1, Ls/v0;

    .line 2
    .line 3
    iget-object v0, p0, Ls/v0;->i:Ls/w0;

    .line 4
    .line 5
    iget v1, p0, Ls/v0;->j:I

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Ls/v0;-><init>(Ls/w0;ILwf/c;)V

    .line 8
    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, Ls/v0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ls/v0;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Ls/v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Ls/v0;->h:I

    .line 2
    .line 3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    return-object p1

    .line 21
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Ls/v0;->i:Ls/w0;

    .line 25
    .line 26
    iget-object p1, p1, Ls/w0;->v:Lr/f;

    .line 27
    .line 28
    iput v2, p0, Ls/v0;->h:I

    .line 29
    .line 30
    iget-object p1, p1, Lr/f;->b:Lr/z;

    .line 31
    .line 32
    iget v0, p0, Ls/v0;->j:I

    .line 33
    .line 34
    invoke-static {p1, v0, p0}, Lr/z;->m(Lr/z;ILyf/i;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 39
    .line 40
    if-ne p1, v0, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move-object p1, v1

    .line 44
    :goto_0
    if-ne p1, v0, :cond_3

    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_3
    return-object v1
.end method
