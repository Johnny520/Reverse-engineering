.class public final Ln01;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static θ:Ln01;


# instance fields
.field public final α:Lnp0;

.field public final β:Lw32;

.field public final γ:Lzr;

.field public final δ:Lf50;

.field public final ε:Lw32;

.field public ζ:F

.field public η:F


# direct methods
.method public constructor <init>(Lnp0;Lw32;Lzr;Lf50;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln01;->α:Lnp0;

    .line 5
    .line 6
    iput-object p2, p0, Ln01;->β:Lw32;

    .line 7
    .line 8
    iput-object p3, p0, Ln01;->γ:Lzr;

    .line 9
    .line 10
    iput-object p4, p0, Ln01;->δ:Lf50;

    .line 11
    .line 12
    invoke-static {p2, p1}, Lj81;->Μ(Lw32;Lnp0;)Lw32;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Ln01;->ε:Lw32;

    .line 17
    .line 18
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 19
    .line 20
    iput p1, p0, Ln01;->ζ:F

    .line 21
    .line 22
    iput p1, p0, Ln01;->η:F

    .line 23
    .line 24
    return-void
.end method
