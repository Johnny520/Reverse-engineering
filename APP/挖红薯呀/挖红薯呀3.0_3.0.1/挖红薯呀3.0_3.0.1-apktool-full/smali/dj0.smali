.class final Ldj0;
.super Lte0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lte0;"
    }
.end annotation


# instance fields
.field public final a:Laj0;


# direct methods
.method public constructor <init>(Laj0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldj0;->a:Laj0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final e()Loe0;
    .locals 2

    .line 1
    new-instance v0, Lgj0;

    .line 2
    .line 3
    iget-object p0, p0, Ldj0;->a:Laj0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p0, v1}, Lgj0;-><init>(Laj0;Ly2;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Ldj0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    check-cast p1, Ldj0;

    .line 7
    .line 8
    iget-object p1, p1, Ldj0;->a:Laj0;

    .line 9
    .line 10
    iget-object p0, p0, Ldj0;->a:Laj0;

    .line 11
    .line 12
    invoke-static {p1, p0}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    :goto_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public final f(Loe0;)V
    .locals 2

    .line 1
    check-cast p1, Lgj0;

    .line 2
    .line 3
    iget-object p0, p0, Ldj0;->a:Laj0;

    .line 4
    .line 5
    iput-object p0, p1, Lgj0;->r:Laj0;

    .line 6
    .line 7
    iget-object p0, p1, Lgj0;->s:Ly2;

    .line 8
    .line 9
    iget-object v0, p0, Ly2;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lgj0;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-ne v0, p1, :cond_0

    .line 15
    .line 16
    iput-object v1, p0, Ly2;->d:Ljava/lang/Object;

    .line 17
    .line 18
    :cond_0
    new-instance p0, Ly2;

    .line 19
    .line 20
    invoke-direct {p0}, Ly2;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p0, p1, Lgj0;->s:Ly2;

    .line 24
    .line 25
    iget-boolean v0, p1, Loe0;->q:Z

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iput-object p1, p0, Ly2;->d:Ljava/lang/Object;

    .line 30
    .line 31
    iput-object v1, p0, Ly2;->e:Ljava/lang/Object;

    .line 32
    .line 33
    iput-object v1, p1, Lgj0;->t:Lgj0;

    .line 34
    .line 35
    new-instance v0, Li7;

    .line 36
    .line 37
    const/4 v1, 0x7

    .line 38
    invoke-direct {v0, v1, p1}, Li7;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Ly2;->f:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-virtual {p1}, Loe0;->k0()Lyk;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, Ly2;->g:Ljava/lang/Object;

    .line 48
    .line 49
    :cond_1
    return-void
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldj0;->a:Laj0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-int/lit8 p0, p0, 0x1f

    .line 8
    .line 9
    return p0
.end method
