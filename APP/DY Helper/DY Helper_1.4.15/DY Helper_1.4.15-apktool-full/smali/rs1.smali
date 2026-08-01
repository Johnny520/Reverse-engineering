.class public final Lrs1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lg40;


# instance fields
.field public final ε:Lqs1;


# direct methods
.method public constructor <init>(Lxi1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrs1;->ε:Lqs1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final δ(Ljava/lang/Object;Lop;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lrs1;->ε:Lqs1;

    .line 2
    .line 3
    invoke-interface {p0, p2, p1}, Lqs1;->α(Lop;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lcq;->ε:Lcq;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Ls62;->α:Ls62;

    .line 13
    .line 14
    return-object p0
.end method
