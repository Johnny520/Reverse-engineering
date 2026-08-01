.class public final Lvs;
.super Lxb;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic φ:Ll60;

.field public final synthetic χ:Lws;


# direct methods
.method public constructor <init>(Lws;Ll60;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvs;->χ:Lws;

    .line 5
    .line 6
    iput-object p2, p0, Lvs;->φ:Ll60;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final Ρ(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lvs;->φ:Ll60;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll60;->Σ()Z

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lvs;->χ:Lws;

    .line 7
    .line 8
    iget-object p0, p0, Lws;->и:Lxm;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public final Σ()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lvs;->φ:Ll60;

    .line 2
    .line 3
    invoke-virtual {v0}, Ll60;->Σ()Z

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lvs;->χ:Lws;

    .line 7
    .line 8
    iget-boolean p0, p0, Lws;->л:Z

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method
