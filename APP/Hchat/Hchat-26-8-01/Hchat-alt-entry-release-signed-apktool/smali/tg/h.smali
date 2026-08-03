.class public final Ltg/h;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public h:I

.field public synthetic i:Ltg/e;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lyf/i;


# direct methods
.method public constructor <init>(Lfg/p;Lwf/c;)V
    .locals 0

    .line 1
    check-cast p1, Lyf/i;

    .line 2
    .line 3
    iput-object p1, p0, Ltg/h;->k:Lyf/i;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ltg/e;

    .line 2
    .line 3
    check-cast p3, Lwf/c;

    .line 4
    .line 5
    new-instance v0, Ltg/h;

    .line 6
    .line 7
    iget-object v1, p0, Ltg/h;->k:Lyf/i;

    .line 8
    .line 9
    invoke-direct {v0, v1, p3}, Ltg/h;-><init>(Lfg/p;Lwf/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Ltg/h;->i:Ltg/e;

    .line 13
    .line 14
    iput-object p2, v0, Ltg/h;->j:Ljava/lang/Object;

    .line 15
    .line 16
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ltg/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Ltg/h;->h:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    sget-object v3, Lxf/a;->g:Lxf/a;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    if-eq v0, v2, :cond_1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    return-object p1

    .line 24
    :cond_1
    iget-object v0, p0, Ltg/h;->i:Ltg/e;

    .line 25
    .line 26
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Ltg/h;->i:Ltg/e;

    .line 34
    .line 35
    iget-object p1, p0, Ltg/h;->j:Ljava/lang/Object;

    .line 36
    .line 37
    iput-object v0, p0, Ltg/h;->i:Ltg/e;

    .line 38
    .line 39
    iput v2, p0, Ltg/h;->h:I

    .line 40
    .line 41
    iget-object v2, p0, Ltg/h;->k:Lyf/i;

    .line 42
    .line 43
    invoke-interface {v2, p1, p0}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-ne p1, v3, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    :goto_0
    const/4 v2, 0x0

    .line 51
    iput-object v2, p0, Ltg/h;->i:Ltg/e;

    .line 52
    .line 53
    iput v1, p0, Ltg/h;->h:I

    .line 54
    .line 55
    invoke-interface {v0, p1, p0}, Ltg/e;->e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v3, :cond_4

    .line 60
    .line 61
    :goto_1
    return-object v3

    .line 62
    :cond_4
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 63
    .line 64
    return-object p1
.end method
