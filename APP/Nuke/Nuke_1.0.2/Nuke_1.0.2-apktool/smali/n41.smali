.class public final Ln41;
.super Lu00;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public k:Lz40;

.field public l:Ldk;

.field public m:Ljava/util/LinkedHashMap;

.field public n:Ljava/lang/String;

.field public o:I

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ldk;

.field public r:I


# direct methods
.method public constructor <init>(Ldk;Lrj;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln41;->q:Ldk;

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
    iput-object p1, p0, Ln41;->p:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Ln41;->r:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Ln41;->r:I

    .line 9
    .line 10
    iget-object p1, p0, Ln41;->q:Ldk;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, p0}, Ldk;->c(Ldk;Lz40;Lrj;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
