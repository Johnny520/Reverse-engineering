.class public final Lci/f;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public h:I

.field public synthetic i:Lm/q1;

.field public synthetic j:J

.field public final synthetic k:Lci/l0;


# direct methods
.method public constructor <init>(Lci/l0;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lci/f;->k:Lci/l0;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

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
    new-instance p2, Lci/f;

    .line 10
    .line 11
    iget-object v2, p0, Lci/f;->k:Lci/l0;

    .line 12
    .line 13
    invoke-direct {p2, v2, p3}, Lci/f;-><init>(Lci/l0;Lwf/c;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p2, Lci/f;->i:Lm/q1;

    .line 17
    .line 18
    iput-wide v0, p2, Lci/f;->j:J

    .line 19
    .line 20
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 21
    .line 22
    invoke-virtual {p2, p1}, Lci/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v1, p0, Lci/f;->i:Lm/q1;

    .line 2
    .line 3
    iget-wide v2, p0, Lci/f;->j:J

    .line 4
    .line 5
    iget v0, p0, Lci/f;->h:I

    .line 6
    .line 7
    sget-object v7, Lsf/n;->a:Lsf/n;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-ne v0, v4, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object v7

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
    iget-object v5, p0, Lci/f;->k:Lci/l0;

    .line 29
    .line 30
    iget-boolean p1, v5, Lci/l0;->y:Z

    .line 31
    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    iput-object p1, p0, Lci/f;->i:Lm/q1;

    .line 36
    .line 37
    iput-wide v2, p0, Lci/f;->j:J

    .line 38
    .line 39
    iput v4, p0, Lci/f;->h:I

    .line 40
    .line 41
    iget-object v4, v5, Lci/l0;->w:Ln/k;

    .line 42
    .line 43
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 44
    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    new-instance v0, Lci/g;

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    invoke-direct/range {v0 .. v6}, Lci/g;-><init>(Lm/q1;JLn/k;Lci/l0;Lwf/c;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0, p0}, Lqg/v;->e(Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-ne v0, p1, :cond_2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move-object v0, v7

    .line 61
    :goto_0
    if-ne v0, p1, :cond_3

    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_3
    return-object v7
.end method
