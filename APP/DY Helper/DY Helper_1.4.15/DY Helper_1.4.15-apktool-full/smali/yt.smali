.class public final Lyt;
.super Lpp;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Lzt;

.field public κ:I


# direct methods
.method public constructor <init>(Lzt;Lop;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyt;->ι:Lzt;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lpp;-><init>(Lop;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final κ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lyt;->θ:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lyt;->κ:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lyt;->κ:I

    .line 9
    .line 10
    iget-object p1, p0, Lyt;->ι:Lzt;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lzt;->δ(Ljava/lang/Object;Lop;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
