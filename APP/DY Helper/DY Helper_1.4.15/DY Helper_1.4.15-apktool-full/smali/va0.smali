.class public final Lva0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lfn1;


# instance fields
.field public final ε:Lua0;

.field public final ζ:Lwa0;


# direct methods
.method public constructor <init>(Lua0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lva0;->ε:Lua0;

    .line 5
    .line 6
    invoke-interface {p1}, Lua0;->β()Lwa0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lva0;->ζ:Lwa0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final α()V
    .locals 0

    .line 1
    return-void
.end method

.method public final β()V
    .locals 1

    .line 1
    iget-object v0, p0, Lva0;->ε:Lua0;

    .line 2
    .line 3
    iget-object p0, p0, Lva0;->ζ:Lwa0;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lua0;->α(Lwa0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final γ()V
    .locals 1

    .line 1
    iget-object v0, p0, Lva0;->ε:Lua0;

    .line 2
    .line 3
    iget-object p0, p0, Lva0;->ζ:Lwa0;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lua0;->α(Lwa0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
