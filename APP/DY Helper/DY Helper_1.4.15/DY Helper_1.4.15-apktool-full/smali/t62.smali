.class public final Lt62;
.super Lkotlinx/coroutines/α;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final η:Lt62;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lt62;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlinx/coroutines/α;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lt62;->η:Lt62;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Dispatchers.IO"

    .line 2
    .line 3
    return-object p0
.end method

.method public final ρ(Lup;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object p0, Ljr;->θ:Ljr;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iget-object p0, p0, Ljr;->η:Laq;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, p2, p1, v0}, Laq;->η(Ljava/lang/Runnable;ZZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final τ(I)Lkotlinx/coroutines/α;
    .locals 1

    .line 1
    invoke-static {p1}, Lh62;->ω(I)V

    .line 2
    .line 3
    .line 4
    sget v0, Ly22;->δ:I

    .line 5
    .line 6
    if-lt p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lkotlinx/coroutines/α;->τ(I)Lkotlinx/coroutines/α;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
