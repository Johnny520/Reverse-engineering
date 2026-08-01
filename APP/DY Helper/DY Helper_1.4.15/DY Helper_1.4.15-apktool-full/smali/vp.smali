.class public final Lvp;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ltp;


# instance fields
.field public final ε:La80;

.field public final ζ:Ltp;


# direct methods
.method public constructor <init>(Ltp;La80;)V
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
    iput-object p2, p0, Lvp;->ε:La80;

    .line 8
    .line 9
    instance-of p2, p1, Lvp;

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    check-cast p1, Lvp;

    .line 14
    .line 15
    iget-object p1, p1, Lvp;->ζ:Ltp;

    .line 16
    .line 17
    :cond_0
    iput-object p1, p0, Lvp;->ζ:Ltp;

    .line 18
    .line 19
    return-void
.end method
