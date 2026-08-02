.class final Li03;
.super Lyh1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lyh1;"
    }
.end annotation


# instance fields
.field public final a:Lm13;


# direct methods
.method public constructor <init>(Lm13;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li03;->a:Lm13;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Li03;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    check-cast p1, Li03;

    .line 12
    .line 13
    iget-object p1, p1, Li03;->a:Lm13;

    .line 14
    .line 15
    iget-object p0, p0, Li03;->a:Lm13;

    .line 16
    .line 17
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final f()Lth1;
    .locals 1

    .line 1
    new-instance v0, Lj03;

    .line 2
    .line 3
    iget-object p0, p0, Li03;->a:Lm13;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lj03;-><init>(Lm13;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final g(Lth1;)V
    .locals 3

    .line 1
    check-cast p1, Lj03;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lsp0;->c0(Lt60;)Lr61;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Lr61;->G:Ld61;

    .line 11
    .line 12
    iget-object p0, p0, Li03;->a:Lm13;

    .line 13
    .line 14
    invoke-static {p0, v0}, Lxe1;->k0(Lm13;Ld61;)Lm13;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object v0, Lly;->k:Ltu2;

    .line 19
    .line 20
    invoke-static {p1, v0}, Lp40;->p(Lgy;Le42;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lxl0;

    .line 25
    .line 26
    invoke-virtual {p1, p0, v0}, Lj03;->M0(Lm13;Lxl0;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p1, Lj03;->x:Lh03;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    const/16 v1, 0x17

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-static {v0, v2, v2, p0, v1}, Lh03;->a(Lh03;Ld61;Le70;Lm13;I)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lgf1;->A(Lj61;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    const-string p0, "Min size state is not set."

    .line 44
    .line 45
    invoke-static {p0}, Lnz0;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 46
    .line 47
    .line 48
    invoke-static {}, Ls;->b()V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Li03;->a:Lm13;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm13;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
