.class public final Lm/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lm/i2;


# instance fields
.field public final a:Lfg/l;

.field public final b:Lm/q;

.field public final c:Lk/h1;

.field public final d:Li0/j1;

.field public final e:Li0/j1;

.field public final f:Li0/j1;


# direct methods
.method public constructor <init>(Lfg/l;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm/r;->a:Lfg/l;

    .line 5
    .line 6
    new-instance p1, Lm/q;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Lm/q;-><init>(Lm/r;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lm/r;->b:Lm/q;

    .line 12
    .line 13
    new-instance p1, Lk/h1;

    .line 14
    .line 15
    invoke-direct {p1}, Lk/h1;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lm/r;->c:Lk/h1;

    .line 19
    .line 20
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lm/r;->d:Li0/j1;

    .line 27
    .line 28
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lm/r;->e:Li0/j1;

    .line 33
    .line 34
    invoke-static {p1}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lm/r;->f:Li0/j1;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lm/r;->d:Li0/j1;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final b(Lk/d1;Lfg/p;Lyf/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Lc0/m;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/16 v5, 0xa

    .line 5
    .line 6
    move-object v1, p0

    .line 7
    move-object v2, p1

    .line 8
    move-object v3, p2

    .line 9
    invoke-direct/range {v0 .. v5}, Lc0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, p3}, Lqg/v;->e(Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 17
    .line 18
    if-ne p1, p2, :cond_0

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 22
    .line 23
    return-object p1
.end method

.method public final e(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lm/r;->a:Lfg/l;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method
