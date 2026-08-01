.class public final Ldo0;
.super Lco0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final ι:Lfo0;

.field public final κ:Leo0;

.field public final λ:Lqf;

.field public final μ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lfo0;Leo0;Lqf;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlinx/coroutines/internal/α;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldo0;->ι:Lfo0;

    .line 5
    .line 6
    iput-object p2, p0, Ldo0;->κ:Leo0;

    .line 7
    .line 8
    iput-object p3, p0, Ldo0;->λ:Lqf;

    .line 9
    .line 10
    iput-object p4, p0, Ldo0;->μ:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final λ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final μ(Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    iget-object p1, p0, Ldo0;->λ:Lqf;

    .line 2
    .line 3
    invoke-static {p1}, Lfo0;->Ο(Lkotlinx/coroutines/internal/α;)Lqf;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Ldo0;->ι:Lfo0;

    .line 8
    .line 9
    iget-object v2, p0, Ldo0;->κ:Leo0;

    .line 10
    .line 11
    iget-object p0, p0, Ldo0;->μ:Ljava/lang/Object;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, v2, v0, p0}, Lfo0;->Ω(Leo0;Lqf;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, v2, Leo0;->ε:Ls31;

    .line 23
    .line 24
    new-instance v3, Lau0;

    .line 25
    .line 26
    const/4 v4, 0x2

    .line 27
    invoke-direct {v3, v4}, Lau0;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v3, v4}, Lkotlinx/coroutines/internal/α;->ε(Lkotlinx/coroutines/internal/α;I)Z

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Lfo0;->Ο(Lkotlinx/coroutines/internal/α;)Lqf;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    invoke-virtual {v1, v2, p1, p0}, Lfo0;->Ω(Leo0;Lqf;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    :goto_0
    return-void

    .line 46
    :cond_1
    invoke-virtual {v1, v2, p0}, Lfo0;->Α(Leo0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {v1, p0}, Lfo0;->ο(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method
