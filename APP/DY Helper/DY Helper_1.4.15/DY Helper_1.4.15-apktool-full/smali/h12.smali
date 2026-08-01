.class public final Lh12;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:Lkq0;

.field public final β:Lg12;

.field public final γ:Lg12;

.field public final δ:Lg12;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lg12;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, p0, v1}, Lg12;-><init>(Lh12;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lh12;->β:Lg12;

    .line 11
    .line 12
    new-instance v0, Lg12;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, p0, v1}, Lg12;-><init>(Lh12;I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lh12;->γ:Lg12;

    .line 19
    .line 20
    new-instance v0, Lg12;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-direct {v0, p0, v1}, Lg12;-><init>(Lh12;I)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lh12;->δ:Lg12;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final α()Lkq0;
    .locals 0

    .line 1
    iget-object p0, p0, Lh12;->α:Lkq0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "SubcomposeLayoutState is not attached to SubcomposeLayout"

    .line 7
    .line 8
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method
