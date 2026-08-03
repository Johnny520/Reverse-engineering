.class public final Lr/u;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lr/z;

.field public final synthetic k:I


# direct methods
.method public constructor <init>(Lr/z;ILwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr/u;->j:Lr/z;

    .line 2
    .line 3
    iput p2, p0, Lr/u;->k:I

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
    .locals 3

    .line 1
    new-instance v0, Lr/u;

    .line 2
    .line 3
    iget-object v1, p0, Lr/u;->j:Lr/z;

    .line 4
    .line 5
    iget v2, p0, Lr/u;->k:I

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lr/u;-><init>(Lr/z;ILwf/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lr/u;->i:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lm/u1;

    .line 2
    .line 3
    check-cast p2, Lwf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lr/u;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lr/u;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lr/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lr/u;->h:I

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
    iget-object p1, p0, Lr/u;->i:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Lm/u1;

    .line 25
    .line 26
    new-instance v0, Lm/k2;

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    iget-object v3, p0, Lr/u;->j:Lr/z;

    .line 30
    .line 31
    invoke-direct {v0, p1, v2, v3}, Lm/k2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, v3, Lr/z;->f:Li0/j1;

    .line 35
    .line 36
    invoke-virtual {p1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lr/p;

    .line 41
    .line 42
    iget-object p1, p1, Lr/p;->i:Lu2/c;

    .line 43
    .line 44
    iput v1, p0, Lr/u;->h:I

    .line 45
    .line 46
    iget v1, p0, Lr/u;->k:I

    .line 47
    .line 48
    const/16 v2, 0x64

    .line 49
    .line 50
    invoke-static {v0, v1, v2, p1, p0}, Ls/r0;->a(Lm/k2;IILu2/c;Lyf/c;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 55
    .line 56
    if-ne p1, v0, :cond_2

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_2
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 60
    .line 61
    return-object p1
.end method
