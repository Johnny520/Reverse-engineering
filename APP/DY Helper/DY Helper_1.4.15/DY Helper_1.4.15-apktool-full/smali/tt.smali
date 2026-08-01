.class public final Ltt;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lfn1;


# instance fields
.field public final ε:La80;

.field public ζ:Lmn;


# direct methods
.method public constructor <init>(La80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltt;->ε:La80;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final α()V
    .locals 2

    .line 1
    iget-object v0, p0, Ltt;->ε:La80;

    .line 2
    .line 3
    sget-object v1, Lxb;->η:Lut;

    .line 4
    .line 5
    invoke-interface {v0, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lmn;

    .line 10
    .line 11
    iput-object v0, p0, Ltt;->ζ:Lmn;

    .line 12
    .line 13
    return-void
.end method

.method public final β()V
    .locals 0

    .line 1
    return-void
.end method

.method public final γ()V
    .locals 1

    .line 1
    iget-object v0, p0, Ltt;->ζ:Lmn;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lmn;->α:Lwt;

    .line 6
    .line 7
    iget-object v0, v0, Lwt;->α:Lxt;

    .line 8
    .line 9
    invoke-virtual {v0}, Lxt;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Ltt;->ζ:Lmn;

    .line 14
    .line 15
    return-void
.end method
