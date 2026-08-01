.class public final Lau;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lf40;


# instance fields
.field public final ε:Lf40;


# direct methods
.method public constructor <init>(Lf40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lau;->ε:Lf40;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final γ(Lg40;Lop;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lum1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lxb;->ο:Luy;

    .line 7
    .line 8
    iput-object v1, v0, Lum1;->ε:Ljava/lang/Object;

    .line 9
    .line 10
    new-instance v1, Lzt;

    .line 11
    .line 12
    invoke-direct {v1, p0, v0, p1}, Lzt;-><init>(Lau;Lum1;Lg40;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lau;->ε:Lf40;

    .line 16
    .line 17
    invoke-interface {p0, v1, p2}, Lf40;->γ(Lg40;Lop;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object p1, Lcq;->ε:Lcq;

    .line 22
    .line 23
    if-ne p0, p1, :cond_0

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    sget-object p0, Ls62;->α:Ls62;

    .line 27
    .line 28
    return-object p0
.end method
