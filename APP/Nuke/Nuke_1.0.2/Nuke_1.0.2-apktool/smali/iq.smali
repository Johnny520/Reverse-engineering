.class public final Liq;
.super Lu00;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public k:Ljava/lang/Object;

.field public l:La20;

.field public m:Ljava/lang/Object;

.field public synthetic n:Ljava/lang/Object;

.field public o:I


# virtual methods
.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Liq;->n:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Liq;->o:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Liq;->o:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-static {p1, p1, p1, p1, p0}, Lgf1;->c0(La20;Ljava/lang/Object;Ljava/lang/Object;Lmn0;Lt00;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
