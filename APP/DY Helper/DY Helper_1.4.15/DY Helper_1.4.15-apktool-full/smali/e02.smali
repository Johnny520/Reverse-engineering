.class public final Le02;
.super Lpp;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public θ:Lf02;

.field public ι:Lg40;

.field public κ:Lg02;

.field public λ:Lfo0;

.field public μ:Ljava/lang/Object;

.field public synthetic ν:Ljava/lang/Object;

.field public final synthetic ξ:Lf02;

.field public ο:I


# direct methods
.method public constructor <init>(Lf02;Lop;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le02;->ξ:Lf02;

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
    iput-object p1, p0, Le02;->ν:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Le02;->ο:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Le02;->ο:I

    .line 9
    .line 10
    iget-object p1, p0, Le02;->ξ:Lf02;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lf02;->γ(Lg40;Lop;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p0, Lcq;->ε:Lcq;

    .line 17
    .line 18
    return-object p0
.end method
