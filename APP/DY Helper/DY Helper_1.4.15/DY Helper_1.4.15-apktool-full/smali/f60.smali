.class public final Lf60;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Landroid/net/Uri;

.field public final β:I

.field public final γ:I

.field public final δ:Z

.field public final ε:Ljava/lang/String;

.field public final ζ:I


# direct methods
.method public constructor <init>(Landroid/net/Uri;IIZI)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    iput-object p1, p0, Lf60;->α:Landroid/net/Uri;

    .line 42
    iput p2, p0, Lf60;->β:I

    .line 43
    iput p3, p0, Lf60;->γ:I

    .line 44
    iput-boolean p4, p0, Lf60;->δ:Z

    const/4 p1, 0x0

    .line 45
    iput-object p1, p0, Lf60;->ε:Ljava/lang/String;

    .line 46
    iput p5, p0, Lf60;->ζ:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/net/Uri$Builder;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "systemfont"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lf60;->α:Landroid/net/Uri;

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    iput p1, p0, Lf60;->β:I

    .line 27
    .line 28
    const/16 v0, 0x190

    .line 29
    .line 30
    iput v0, p0, Lf60;->γ:I

    .line 31
    .line 32
    iput-boolean p1, p0, Lf60;->δ:Z

    .line 33
    .line 34
    iput-object p2, p0, Lf60;->ε:Ljava/lang/String;

    .line 35
    .line 36
    iput p1, p0, Lf60;->ζ:I

    .line 37
    .line 38
    return-void
.end method
