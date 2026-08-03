.class public final Lw/e1;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public h:I

.field public synthetic i:Lm/q1;

.field public synthetic j:J

.field public final synthetic k:Lqg/t;

.field public final synthetic l:Li0/a1;


# direct methods
.method public constructor <init>(Lqg/t;Li0/a1;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/e1;->k:Lqg/t;

    .line 2
    .line 3
    iput-object p2, p0, Lw/e1;->l:Li0/a1;

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Lm/q1;

    .line 2
    .line 3
    check-cast p2, Le1/b;

    .line 4
    .line 5
    iget-wide v0, p2, Le1/b;->a:J

    .line 6
    .line 7
    check-cast p3, Lwf/c;

    .line 8
    .line 9
    new-instance p2, Lw/e1;

    .line 10
    .line 11
    iget-object v2, p0, Lw/e1;->k:Lqg/t;

    .line 12
    .line 13
    iget-object v3, p0, Lw/e1;->l:Li0/a1;

    .line 14
    .line 15
    invoke-direct {p2, v2, v3, p3}, Lw/e1;-><init>(Lqg/t;Li0/a1;Lwf/c;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p2, Lw/e1;->i:Lm/q1;

    .line 19
    .line 20
    iput-wide v0, p2, Lw/e1;->j:J

    .line 21
    .line 22
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Lw/e1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lw/e1;->h:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    iget-object v2, p0, Lw/e1;->l:Li0/a1;

    .line 5
    .line 6
    iget-object v3, p0, Lw/e1;->k:Lqg/t;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-ne v0, v5, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    return-object p1

    .line 25
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lw/e1;->i:Lm/q1;

    .line 29
    .line 30
    iget-wide v6, p0, Lw/e1;->j:J

    .line 31
    .line 32
    new-instance v0, Lm/e2;

    .line 33
    .line 34
    invoke-direct {v0, v2, v6, v7, v4}, Lm/e2;-><init>(Li0/a1;JLwf/c;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v3, v4, v0, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 38
    .line 39
    .line 40
    iput v5, p0, Lw/e1;->h:I

    .line 41
    .line 42
    invoke-interface {p1, p0}, Lm/q1;->T(Lyf/c;)Ljava/lang/Object;

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
    check-cast p1, Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    new-instance v0, Lw/d1;

    .line 58
    .line 59
    invoke-direct {v0, v2, v4, p1}, Lw/d1;-><init>(Li0/a1;Lwf/c;Z)V

    .line 60
    .line 61
    .line 62
    invoke-static {v3, v4, v0, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 63
    .line 64
    .line 65
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 66
    .line 67
    return-object p1
.end method
