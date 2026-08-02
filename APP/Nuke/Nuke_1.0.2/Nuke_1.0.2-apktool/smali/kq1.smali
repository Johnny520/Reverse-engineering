.class public final Lkq1;
.super Lu00;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public k:Ljava/lang/String;

.field public l:Lz80;

.field public m:Llf2;

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:Lsq1;

.field public p:I


# direct methods
.method public constructor <init>(Lsq1;Lu00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkq1;->o:Lsq1;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lu00;-><init>(Lt00;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lkq1;->n:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lkq1;->p:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lkq1;->p:I

    .line 9
    .line 10
    iget-object p1, p0, Lkq1;->o:Lsq1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lsq1;->e(Ljava/lang/String;Lu00;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
