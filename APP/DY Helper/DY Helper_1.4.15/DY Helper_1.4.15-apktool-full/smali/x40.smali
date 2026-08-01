.class public final Lx40;
.super Lbp0;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:Lum1;

.field public final synthetic ζ:I


# direct methods
.method public constructor <init>(Lum1;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx40;->ε:Lum1;

    .line 2
    .line 3
    iput p2, p0, Lx40;->ζ:I

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lbp0;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lc50;

    .line 2
    .line 3
    iget v0, p0, Lx40;->ζ:I

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lc50;->И(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p0, p0, Lx40;->ε:Lum1;

    .line 14
    .line 15
    iput-object p1, p0, Lum1;->ε:Ljava/lang/Object;

    .line 16
    .line 17
    return-object p1
.end method
