.class public final Lrq1;
.super Lu00;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public k:Ljava/lang/String;

.field public l:Lil1;

.field public m:Lz80;

.field public n:Z

.field public o:I

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:Lsq1;

.field public r:I


# direct methods
.method public constructor <init>(Lsq1;Lu00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrq1;->q:Lsq1;

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
    .locals 2

    .line 1
    iput-object p1, p0, Lrq1;->p:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lrq1;->r:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lrq1;->r:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, Lrq1;->q:Lsq1;

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0, p0}, Lsq1;->n(Ljava/lang/String;ZLu00;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
