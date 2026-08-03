.class public final Lw/i1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lm/i2;


# instance fields
.field public final synthetic a:Lm/i2;

.field public final b:Li0/x;

.field public final c:Li0/x;


# direct methods
.method public constructor <init>(Lm/i2;Lw/j1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw/i1;->a:Lm/i2;

    .line 5
    .line 6
    new-instance p1, Lw/h1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, p2, v0}, Lw/h1;-><init>(Lw/j1;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lw/i1;->b:Li0/x;

    .line 17
    .line 18
    new-instance p1, Lw/h1;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-direct {p1, p2, v0}, Lw/h1;-><init>(Lw/j1;I)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Li0/r;->p(Lfg/a;)Li0/x;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lw/i1;->c:Li0/x;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lw/i1;->a:Lm/i2;

    .line 2
    .line 3
    invoke-interface {v0}, Lm/i2;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final b(Lk/d1;Lfg/p;Lyf/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lw/i1;->a:Lm/i2;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lm/i2;->b(Lk/d1;Lfg/p;Lyf/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lw/i1;->c:Li0/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/x;->getValue()Ljava/lang/Object;

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

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lw/i1;->b:Li0/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Li0/x;->getValue()Ljava/lang/Object;

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

.method public final e(F)F
    .locals 1

    .line 1
    iget-object v0, p0, Lw/i1;->a:Lm/i2;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lm/i2;->e(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
