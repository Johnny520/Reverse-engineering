.class public final Lz01;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lsp;


# instance fields
.field public final ε:Landroid/content/Context;

.field public ζ:Lmp;

.field public final η:Lt91;

.field public θ:Lxz1;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz01;->ε:Landroid/content/Context;

    .line 5
    .line 6
    new-instance p1, Lt91;

    .line 7
    .line 8
    const/high16 v0, 0x3f800000    # 1.0f

    .line 9
    .line 10
    invoke-direct {p1, v0}, Lt91;-><init>(F)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lz01;->η:Lt91;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public getKey()Ltp;
    .locals 0

    .line 1
    sget-object p0, Lxn0;->θ:Lxn0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final η(Lup;)Lup;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lpd2;->Θ(Lsp;Lup;)Lup;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final θ(Ltp;)Lsp;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lpd2;->υ(Lsp;Ltp;)Lsp;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final λ(Le80;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p2, p0}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final ξ(Ltp;)Lup;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lpd2;->Δ(Lsp;Ltp;)Lup;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
