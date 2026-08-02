.class public final Ldw0;
.super Lu00;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljw0;

.field public m:I


# direct methods
.method public constructor <init>(Ljw0;Lu00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldw0;->l:Ljw0;

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
    iput-object p1, p0, Ldw0;->k:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Ldw0;->m:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Ldw0;->m:I

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iget-object v2, p0, Ldw0;->l:Ljw0;

    .line 14
    .line 15
    invoke-virtual {v2, v0, v1, p1, p0}, Ljw0;->e(JLin0;Lu00;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
