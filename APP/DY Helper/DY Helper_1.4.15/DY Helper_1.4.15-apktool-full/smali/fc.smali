.class public final synthetic Lfc;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:Lch1;

.field public final synthetic ζ:Lkx0;

.field public final synthetic η:Lrx0;

.field public final synthetic θ:I

.field public final synthetic ι:I

.field public final synthetic κ:Lhc;


# direct methods
.method public synthetic constructor <init>(Lch1;Lkx0;Lrx0;IILhc;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfc;->ε:Lch1;

    .line 5
    .line 6
    iput-object p2, p0, Lfc;->ζ:Lkx0;

    .line 7
    .line 8
    iput-object p3, p0, Lfc;->η:Lrx0;

    .line 9
    .line 10
    iput p4, p0, Lfc;->θ:I

    .line 11
    .line 12
    iput p5, p0, Lfc;->ι:I

    .line 13
    .line 14
    iput-object p6, p0, Lfc;->κ:Lhc;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lbh1;

    .line 3
    .line 4
    iget-object p1, p0, Lfc;->η:Lrx0;

    .line 5
    .line 6
    invoke-interface {p1}, Lrx0;->getLayoutDirection()Lnp0;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    iget-object p1, p0, Lfc;->κ:Lhc;

    .line 11
    .line 12
    iget-object v6, p1, Lhc;->α:Laa;

    .line 13
    .line 14
    iget-object v1, p0, Lfc;->ε:Lch1;

    .line 15
    .line 16
    iget-object v2, p0, Lfc;->ζ:Lkx0;

    .line 17
    .line 18
    iget v4, p0, Lfc;->θ:I

    .line 19
    .line 20
    iget v5, p0, Lfc;->ι:I

    .line 21
    .line 22
    invoke-static/range {v0 .. v6}, Lec;->β(Lbh1;Lch1;Lkx0;Lnp0;IILaa;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Ls62;->α:Ls62;

    .line 26
    .line 27
    return-object p0
.end method
