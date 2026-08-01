.class public final Ly01;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lg40;


# instance fields
.field public final synthetic ε:Lz01;


# direct methods
.method public constructor <init>(Lz01;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly01;->ε:Lz01;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final δ(Ljava/lang/Object;Lop;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object p0, p0, Ly01;->ε:Lz01;

    .line 8
    .line 9
    iget-object p0, p0, Lz01;->η:Lt91;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lt91;->θ(F)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Ls62;->α:Ls62;

    .line 15
    .line 16
    return-object p0
.end method
