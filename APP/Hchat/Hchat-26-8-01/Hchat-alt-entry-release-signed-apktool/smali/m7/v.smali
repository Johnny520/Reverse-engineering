.class public final Lm7/v;
.super Ld7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final n:Ld7/b;


# direct methods
.method public constructor <init>(Ld7/b;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-direct {p0, v0, v1}, Ld7/b;-><init>(Lk7/f;I)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lm7/v;->n:Ld7/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final W(Lk7/a;)V
    .locals 1

    .line 1
    check-cast p1, Lm7/u;

    .line 2
    .line 3
    invoke-virtual {p1}, Lm7/u;->Z()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm7/v;->n:Ld7/b;

    .line 7
    .line 8
    iget-object p1, p1, Lm7/u;->s:Lm7/m;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lo7/b;->a0(Lk7/a;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final X()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lo7/b;->U()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lce/n;

    .line 5
    .line 6
    const/16 v1, 0x12

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lce/n;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lo7/b;->removeIf(Ljava/util/function/Predicate;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final j0(Lm7/b;)V
    .locals 1

    .line 1
    check-cast p1, Lm7/u;

    .line 2
    .line 3
    invoke-virtual {p1}, Lm7/u;->Z()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm7/v;->n:Ld7/b;

    .line 7
    .line 8
    iget-object p1, p1, Lm7/u;->s:Lm7/m;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lo7/b;->a0(Lk7/a;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
