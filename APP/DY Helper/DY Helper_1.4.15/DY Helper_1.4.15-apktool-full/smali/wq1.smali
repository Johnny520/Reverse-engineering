.class public Lwq1;
.super Lο;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ldq;


# instance fields
.field public final θ:Lop;


# direct methods
.method public constructor <init>(Lop;Lup;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p2, v0}, Lο;-><init>(Lup;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lwq1;->θ:Lop;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final Ν()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final β()Ldq;
    .locals 1

    .line 1
    iget-object p0, p0, Lwq1;->θ:Lop;

    .line 2
    .line 3
    instance-of v0, p0, Ldq;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Ldq;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public ο(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lwq1;->θ:Lop;

    .line 2
    .line 3
    invoke-static {p0}, Lxb;->Θ(Lop;)Lop;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1}, Lyh;->о(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p0, p1}, Ljx0;->Ψ(Lop;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public π(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lwq1;->θ:Lop;

    .line 2
    .line 3
    invoke-static {p1}, Lyh;->о(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, p1}, Lop;->ζ(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
