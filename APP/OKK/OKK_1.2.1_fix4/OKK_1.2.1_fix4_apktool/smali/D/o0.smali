.class public LD/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LD/q0;


# instance fields
.field public final a:LD/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, LD/h0;

    invoke-direct {v0}, LD/h0;-><init>()V

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, LD/g0;

    invoke-direct {v0}, LD/g0;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v0, LD/f0;

    invoke-direct {v0}, LD/f0;-><init>()V

    :goto_0
    invoke-virtual {v0}, LD/i0;->b()LD/q0;

    move-result-object v0

    iget-object v0, v0, LD/q0;->a:LD/o0;

    invoke-virtual {v0}, LD/o0;->a()LD/q0;

    move-result-object v0

    iget-object v0, v0, LD/q0;->a:LD/o0;

    invoke-virtual {v0}, LD/o0;->b()LD/q0;

    move-result-object v0

    iget-object v0, v0, LD/q0;->a:LD/o0;

    invoke-virtual {v0}, LD/o0;->c()LD/q0;

    move-result-object v0

    sput-object v0, LD/o0;->b:LD/q0;

    return-void
.end method

.method public constructor <init>(LD/q0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD/o0;->a:LD/q0;

    return-void
.end method


# virtual methods
.method public a()LD/q0;
    .locals 1

    iget-object v0, p0, LD/o0;->a:LD/q0;

    return-object v0
.end method

.method public b()LD/q0;
    .locals 1

    iget-object v0, p0, LD/o0;->a:LD/q0;

    return-object v0
.end method

.method public c()LD/q0;
    .locals 1

    iget-object v0, p0, LD/o0;->a:LD/q0;

    return-object v0
.end method

.method public d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public e()LD/k;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LD/o0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LD/o0;

    invoke-virtual {p0}, LD/o0;->n()Z

    move-result v1

    invoke-virtual {p1}, LD/o0;->n()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, LD/o0;->m()Z

    move-result v1

    invoke-virtual {p1}, LD/o0;->m()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, LD/o0;->j()Lv/c;

    move-result-object v1

    invoke-virtual {p1}, LD/o0;->j()Lv/c;

    move-result-object v3

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, LD/o0;->h()Lv/c;

    move-result-object v1

    invoke-virtual {p1}, LD/o0;->h()Lv/c;

    move-result-object v3

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, LD/o0;->e()LD/k;

    move-result-object v1

    invoke-virtual {p1}, LD/o0;->e()LD/k;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public f(I)Lv/c;
    .locals 0

    sget-object p1, Lv/c;->e:Lv/c;

    return-object p1
.end method

.method public g()Lv/c;
    .locals 1

    invoke-virtual {p0}, LD/o0;->j()Lv/c;

    move-result-object v0

    return-object v0
.end method

.method public h()Lv/c;
    .locals 1

    sget-object v0, Lv/c;->e:Lv/c;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    invoke-virtual {p0}, LD/o0;->n()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0}, LD/o0;->m()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0}, LD/o0;->j()Lv/c;

    move-result-object v2

    invoke-virtual {p0}, LD/o0;->h()Lv/c;

    move-result-object v3

    invoke-virtual {p0}, LD/o0;->e()LD/k;

    move-result-object v4

    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()Lv/c;
    .locals 1

    invoke-virtual {p0}, LD/o0;->j()Lv/c;

    move-result-object v0

    return-object v0
.end method

.method public j()Lv/c;
    .locals 1

    sget-object v0, Lv/c;->e:Lv/c;

    return-object v0
.end method

.method public k()Lv/c;
    .locals 1

    invoke-virtual {p0}, LD/o0;->j()Lv/c;

    move-result-object v0

    return-object v0
.end method

.method public l(IIII)LD/q0;
    .locals 0

    sget-object p1, LD/o0;->b:LD/q0;

    return-object p1
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public n()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o([Lv/c;)V
    .locals 0

    return-void
.end method

.method public p(LD/q0;)V
    .locals 0

    return-void
.end method

.method public q(Lv/c;)V
    .locals 0

    return-void
.end method
