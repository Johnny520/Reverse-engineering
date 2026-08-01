.class final Lfp0;
.super Lv01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv01;"
    }
.end annotation


# instance fields
.field public final α:Lep0;


# direct methods
.method public constructor <init>(Lep0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lfp0;->α:Lep0;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Lfp0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    check-cast p1, Lfp0;

    .line 12
    .line 13
    iget-object p1, p1, Lfp0;->α:Lep0;

    .line 14
    .line 15
    iget-object p0, p0, Lfp0;->α:Lep0;

    .line 16
    .line 17
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lfp0;->α:Lep0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final δ()Lq01;
    .locals 1

    .line 1
    new-instance v0, Lip0;

    .line 2
    .line 3
    iget-object p0, p0, Lfp0;->α:Lep0;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lq01;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p0, v0, Lip0;->τ:Lep0;

    .line 12
    .line 13
    return-object v0
.end method

.method public final ε(Lq01;)V
    .locals 2

    .line 1
    check-cast p1, Lip0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lip0;->τ:Lep0;

    .line 7
    .line 8
    iget-object p0, p0, Lfp0;->α:Lep0;

    .line 9
    .line 10
    if-eq v0, p0, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iget-object v0, v0, Lep0;->γ:Lx91;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iput-object p0, p1, Lip0;->τ:Lep0;

    .line 22
    .line 23
    :cond_0
    invoke-static {p1}, Lyh;->Σ(Lbw;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
