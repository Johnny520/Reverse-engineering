.class public final Lmr;
.super Lin;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final β:Z

.field public γ:Z

.field public δ:Ln;


# direct methods
.method public constructor <init>(Lmz1;Li2;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lin;->α:Ljava/lang/Object;

    .line 5
    .line 6
    iput-boolean p3, p0, Lmr;->β:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final θ(Landroid/content/Context;)Ln;
    .locals 0

    .line 1
    iget-boolean p1, p0, Lmr;->γ:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lmr;->δ:Ln;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    throw p0
.end method
