.class public final Le7;
.super Lu00;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public k:Lak1;

.field public l:Lin;

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Lh7;

.field public o:I


# direct methods
.method public constructor <init>(Lh7;Lu00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le7;->n:Lh7;

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
    iput-object p1, p0, Le7;->m:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Le7;->o:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Le7;->o:I

    .line 9
    .line 10
    iget-object p1, p0, Le7;->n:Lh7;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Lh7;->e(Lu00;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
