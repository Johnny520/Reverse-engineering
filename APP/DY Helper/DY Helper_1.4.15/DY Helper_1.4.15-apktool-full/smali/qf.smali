.class public final Lqf;
.super Lco0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lpf;


# instance fields
.field public final ι:Lfo0;


# direct methods
.method public constructor <init>(Lfo0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlinx/coroutines/internal/α;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqf;->ι:Lfo0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final γ(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lco0;->κ()Lfo0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lfo0;->φ(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final λ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final μ(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lqf;->ι:Lfo0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lco0;->κ()Lfo0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1, p0}, Lfo0;->ρ(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method
