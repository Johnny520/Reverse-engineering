.class public final Liw0;
.super Lu00;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public k:Ltw0;

.field public l:Lnn0;

.field public m:Lk82;

.field public n:La72;

.field public o:Lr92;

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljw0;

.field public r:I


# direct methods
.method public constructor <init>(Ljw0;Lu00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Liw0;->q:Ljw0;

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
    iput-object p1, p0, Liw0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Liw0;->r:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Liw0;->r:I

    .line 9
    .line 10
    iget-object p1, p0, Liw0;->q:Ljw0;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, v0, v0, p0}, Ljw0;->a(Ljw0;Lk82;Ltw0;Lnn0;Lu00;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
