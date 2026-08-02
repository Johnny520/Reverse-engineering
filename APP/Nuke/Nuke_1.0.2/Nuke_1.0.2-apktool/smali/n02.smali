.class public final Ln02;
.super Lu00;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public k:Ljava/lang/CharSequence;

.field public l:Ljava/lang/Object;

.field public m:Lkl1;

.field public n:J

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Lp02;

.field public q:I


# direct methods
.method public constructor <init>(Lp02;Lu00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln02;->p:Lp02;

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
    .locals 6

    .line 1
    iput-object p1, p0, Ln02;->o:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Ln02;->q:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Ln02;->q:I

    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    iget-object v0, p0, Ln02;->p:Lp02;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    move-object v5, p0

    .line 17
    invoke-static/range {v0 .. v5}, Lp02;->a(Lp02;Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassifier;Lu00;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
