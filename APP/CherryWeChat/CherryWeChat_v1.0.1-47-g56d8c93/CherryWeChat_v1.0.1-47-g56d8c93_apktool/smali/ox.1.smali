.class public Lox;
.super Lu;
.source ""

# interfaces
.implements Lhc;


# instance fields
.field public final d:LEb;


# direct methods
.method public constructor <init>(LEb;Lac;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p2, v0}, Lu;-><init>(Lac;Z)V

    iput-object p1, p0, Lox;->d:LEb;

    return-void
.end method


# virtual methods
.method public final D()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public O()V
    .locals 0

    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lox;->d:LEb;

    invoke-static {v0}, LOj;->E(LEb;)LEb;

    move-result-object v0

    invoke-static {p1}, LQj;->C(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, LfG;->k0(LEb;Ljava/lang/Object;)V

    return-void
.end method

.method public final c()Lhc;
    .locals 2

    iget-object v0, p0, Lox;->d:LEb;

    instance-of v1, v0, Lhc;

    if-eqz v1, :cond_0

    check-cast v0, Lhc;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public g(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lox;->d:LEb;

    invoke-static {p1}, LQj;->C(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, LEb;->f(Ljava/lang/Object;)V

    return-void
.end method
