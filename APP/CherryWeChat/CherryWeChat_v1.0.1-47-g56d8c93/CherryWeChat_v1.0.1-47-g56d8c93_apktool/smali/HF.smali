.class public LHF;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:LLF;


# instance fields
.field public final a:LLF;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    new-instance v0, LyF;

    invoke-direct {v0}, LyF;-><init>()V

    goto :goto_0

    :cond_0
    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    new-instance v0, LxF;

    invoke-direct {v0}, LxF;-><init>()V

    goto :goto_0

    :cond_1
    const/16 v1, 0x1e

    if-lt v0, v1, :cond_2

    new-instance v0, LwF;

    invoke-direct {v0}, LwF;-><init>()V

    goto :goto_0

    :cond_2
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_3

    new-instance v0, LvF;

    invoke-direct {v0}, LvF;-><init>()V

    goto :goto_0

    :cond_3
    new-instance v0, LuF;

    invoke-direct {v0}, LuF;-><init>()V

    :goto_0
    invoke-virtual {v0}, LzF;->b()LLF;

    move-result-object v0

    iget-object v0, v0, LLF;->a:LHF;

    invoke-virtual {v0}, LHF;->a()LLF;

    move-result-object v0

    iget-object v0, v0, LLF;->a:LHF;

    invoke-virtual {v0}, LHF;->b()LLF;

    move-result-object v0

    iget-object v0, v0, LLF;->a:LHF;

    invoke-virtual {v0}, LHF;->c()LLF;

    move-result-object v0

    sput-object v0, LHF;->b:LLF;

    return-void
.end method

.method public constructor <init>(LLF;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHF;->a:LLF;

    return-void
.end method


# virtual methods
.method public a()LLF;
    .locals 1

    iget-object v0, p0, LHF;->a:LLF;

    return-object v0
.end method

.method public b()LLF;
    .locals 1

    iget-object v0, p0, LHF;->a:LLF;

    return-object v0
.end method

.method public c()LLF;
    .locals 1

    iget-object v0, p0, LHF;->a:LLF;

    return-object v0
.end method

.method public d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public e(LLF;)V
    .locals 0

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LHF;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LHF;

    invoke-virtual {p0}, LHF;->o()Z

    move-result v1

    invoke-virtual {p1}, LHF;->o()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, LHF;->n()Z

    move-result v1

    invoke-virtual {p1}, LHF;->n()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, LHF;->k()Lyl;

    move-result-object v1

    invoke-virtual {p1}, LHF;->k()Lyl;

    move-result-object v3

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, LHF;->i()Lyl;

    move-result-object v1

    invoke-virtual {p1}, LHF;->i()Lyl;

    move-result-object v3

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, LHF;->f()Lie;

    move-result-object v1

    invoke-virtual {p1}, LHF;->f()Lie;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public f()Lie;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public g(I)Lyl;
    .locals 0

    sget-object p1, Lyl;->e:Lyl;

    return-object p1
.end method

.method public h()Lyl;
    .locals 1

    invoke-virtual {p0}, LHF;->k()Lyl;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    invoke-virtual {p0}, LHF;->o()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0}, LHF;->n()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0}, LHF;->k()Lyl;

    move-result-object v2

    invoke-virtual {p0}, LHF;->i()Lyl;

    move-result-object v3

    invoke-virtual {p0}, LHF;->f()Lie;

    move-result-object v4

    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()Lyl;
    .locals 1

    sget-object v0, Lyl;->e:Lyl;

    return-object v0
.end method

.method public j()Lyl;
    .locals 1

    invoke-virtual {p0}, LHF;->k()Lyl;

    move-result-object v0

    return-object v0
.end method

.method public k()Lyl;
    .locals 1

    sget-object v0, Lyl;->e:Lyl;

    return-object v0
.end method

.method public l()Lyl;
    .locals 1

    invoke-virtual {p0}, LHF;->k()Lyl;

    move-result-object v0

    return-object v0
.end method

.method public m(IIII)LLF;
    .locals 0

    sget-object p1, LHF;->b:LLF;

    return-object p1
.end method

.method public n()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public p([Lyl;)V
    .locals 0

    return-void
.end method

.method public q(Lyl;)V
    .locals 0

    return-void
.end method

.method public r(LLF;)V
    .locals 0

    return-void
.end method

.method public s(Lyl;)V
    .locals 0

    return-void
.end method

.method public t(I)V
    .locals 0

    return-void
.end method
