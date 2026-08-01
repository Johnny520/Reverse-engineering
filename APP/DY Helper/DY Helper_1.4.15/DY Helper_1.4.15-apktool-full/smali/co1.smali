.class public abstract Lco1;
.super Lq8;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# direct methods
.method public constructor <init>(Lop;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lq8;-><init>(Lop;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    invoke-interface {p1}, Lop;->γ()Lup;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object p1, Lhz;->ε:Lhz;

    .line 11
    .line 12
    if-ne p0, p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "Coroutines with restricted suspension must have EmptyCoroutineContext"

    .line 16
    .line 17
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    throw p0

    .line 22
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final γ()Lup;
    .locals 0

    .line 1
    sget-object p0, Lhz;->ε:Lhz;

    .line 2
    .line 3
    return-object p0
.end method
