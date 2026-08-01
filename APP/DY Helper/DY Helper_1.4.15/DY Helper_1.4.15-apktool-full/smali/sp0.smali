.class public final Lsp0;
.super Lq31;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final Ω:Lq2;


# instance fields
.field public Χ:Lqp0;

.field public Ψ:Lrp0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lpd2;->α()Lq2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-wide v1, Lci;->ε:J

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lq2;->ε(J)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lq2;->β:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/graphics/Paint;

    .line 13
    .line 14
    const/high16 v2, 0x3f800000    # 1.0f

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0, v1}, Lq2;->η(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lsp0;->Ω:Lq2;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Lyp0;Lqp0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lq31;-><init>(Lyp0;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lsp0;->Χ:Lqp0;

    .line 5
    .line 6
    iget-object p1, p1, Lyp0;->μ:Lyp0;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-instance p1, Lrp0;

    .line 11
    .line 12
    invoke-direct {p1, p0}, Lrp0;-><init>(Lsp0;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    iput-object p1, p0, Lsp0;->Ψ:Lrp0;

    .line 18
    .line 19
    check-cast p2, Lq01;

    .line 20
    .line 21
    iget-object p0, p2, Lq01;->ε:Lq01;

    .line 22
    .line 23
    iget p0, p0, Lq01;->η:I

    .line 24
    .line 25
    and-int/lit16 p0, p0, 0x200

    .line 26
    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    invoke-static {}, Lγ;->β()V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    throw p0
.end method


# virtual methods
.method public final ζ(J)Lch1;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lch1;->х(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lsp0;->Χ:Lqp0;

    .line 5
    .line 6
    iget-object v1, p0, Lq31;->τ:Lq31;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p0, v1, p1, p2}, Lqp0;->Φ(Ldw0;Lkx0;J)Lqx0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Lq31;->ｍ(Lqx0;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lq31;->ｄ()V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public final Р()V
    .locals 1

    .line 1
    iget-object v0, p0, Lsp0;->Ψ:Lrp0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lrp0;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lrp0;-><init>(Lsp0;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lsp0;->Ψ:Lrp0;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final У()Lfw0;
    .locals 0

    .line 1
    iget-object p0, p0, Lsp0;->Ψ:Lrp0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final Х()Lq01;
    .locals 0

    .line 1
    iget-object p0, p0, Lsp0;->Χ:Lqp0;

    .line 2
    .line 3
    check-cast p0, Lq01;

    .line 4
    .line 5
    iget-object p0, p0, Lq01;->ε:Lq01;

    .line 6
    .line 7
    return-object p0
.end method

.method public final у(JFLa80;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lq31;->ｊ(JFLa80;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Ldw0;->ν:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lq31;->ｅ()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lq31;->τ:Lq31;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-boolean p2, p0, Ldw0;->ξ:Z

    .line 18
    .line 19
    iput-boolean p2, p1, Ldw0;->ξ:Z

    .line 20
    .line 21
    invoke-virtual {p0}, Lq31;->В()Lqx0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, Lqx0;->α()V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    iput-boolean p0, p1, Ldw0;->ξ:Z

    .line 30
    .line 31
    :goto_0
    return-void
.end method

.method public final ч(Lre0;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lsp0;->Ψ:Lrp0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object p0, v0, Lfw0;->ψ:Lu11;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lu11;->γ(Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-ltz p1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lu11;->γ:[I

    .line 14
    .line 15
    aget p0, p0, p1

    .line 16
    .line 17
    return p0

    .line 18
    :cond_0
    const/high16 p0, -0x80000000

    .line 19
    .line 20
    return p0

    .line 21
    :cond_1
    invoke-static {p0, p1}, Lxb;->θ(Ldw0;Lre0;)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0
.end method

.method public final ｉ(Lde;Lwa0;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lq31;->τ:Lq31;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Lq31;->О(Lde;Lwa0;)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lq31;->σ:Lyp0;

    .line 10
    .line 11
    invoke-static {p2}, Lln0;->д(Lyp0;)Landroidx/compose/ui/platform/AndroidComposeView;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Landroidx/compose/ui/platform/AndroidComposeView;->getShowLayoutBounds()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    iget-object p2, p0, Lq31;->τ:Lq31;

    .line 22
    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    iget-wide v0, p0, Lch1;->η:J

    .line 26
    .line 27
    iget-wide v2, p2, Lch1;->η:J

    .line 28
    .line 29
    invoke-static {v0, v1, v2, v3}, Lbn0;->α(JJ)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    iget-wide v0, p2, Lq31;->Ε:J

    .line 36
    .line 37
    const-wide/16 v2, 0x0

    .line 38
    .line 39
    invoke-static {v0, v1, v2, v3}, Lum0;->α(JJ)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-nez p2, :cond_1

    .line 44
    .line 45
    :cond_0
    iget-wide v0, p0, Lch1;->η:J

    .line 46
    .line 47
    const/16 p0, 0x20

    .line 48
    .line 49
    shr-long v2, v0, p0

    .line 50
    .line 51
    long-to-int p0, v2

    .line 52
    int-to-float p0, p0

    .line 53
    const/high16 p2, 0x3f000000    # 0.5f

    .line 54
    .line 55
    sub-float v5, p0, p2

    .line 56
    .line 57
    const-wide v2, 0xffffffffL

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    and-long/2addr v0, v2

    .line 63
    long-to-int p0, v0

    .line 64
    int-to-float p0, p0

    .line 65
    sub-float v6, p0, p2

    .line 66
    .line 67
    const/high16 v3, 0x3f000000    # 0.5f

    .line 68
    .line 69
    const/high16 v4, 0x3f000000    # 0.5f

    .line 70
    .line 71
    sget-object v7, Lsp0;->Ω:Lq2;

    .line 72
    .line 73
    move-object v2, p1

    .line 74
    invoke-interface/range {v2 .. v7}, Lde;->κ(FFFFLq2;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    return-void
.end method

.method public final ｓ(Lqp0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lsp0;->Χ:Lqp0;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    move-object v0, p1

    .line 10
    check-cast v0, Lq01;

    .line 11
    .line 12
    iget-object v0, v0, Lq01;->ε:Lq01;

    .line 13
    .line 14
    iget v0, v0, Lq01;->η:I

    .line 15
    .line 16
    and-int/lit16 v0, v0, 0x200

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, Lγ;->β()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    :goto_0
    iput-object p1, p0, Lsp0;->Χ:Lqp0;

    .line 26
    .line 27
    return-void
.end method
