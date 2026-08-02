.class public final Lww2;
.super Lu00;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public k:Lzt2;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lyw2;

.field public n:I


# direct methods
.method public constructor <init>(Lyw2;Lu00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lww2;->m:Lyw2;

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
    .locals 3

    .line 1
    iput-object p1, p0, Lww2;->l:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lww2;->n:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lww2;->n:I

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iget-object v2, p0, Lww2;->m:Lyw2;

    .line 14
    .line 15
    invoke-virtual {v2, v0, v1, p1, p0}, Lyw2;->g(JLmn0;Lu00;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
