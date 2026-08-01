.class public final Lqz1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lop;
.implements Ldq;


# instance fields
.field public final ε:Lop;

.field public final ζ:Lup;


# direct methods
.method public constructor <init>(Lop;Lup;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqz1;->ε:Lop;

    .line 5
    .line 6
    iput-object p2, p0, Lqz1;->ζ:Lup;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final β()Ldq;
    .locals 1

    .line 1
    iget-object p0, p0, Lqz1;->ε:Lop;

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

.method public final γ()Lup;
    .locals 0

    .line 1
    iget-object p0, p0, Lqz1;->ζ:Lup;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ζ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lqz1;->ε:Lop;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lop;->ζ(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
