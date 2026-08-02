.class public final Lvl2;
.super Lu00;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public k:J

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lox;

.field public n:I


# direct methods
.method public constructor <init>(Lox;Lu00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvl2;->m:Lox;

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
    iput-object p1, p0, Lvl2;->l:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lvl2;->n:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lvl2;->n:I

    .line 9
    .line 10
    const-wide/16 v1, 0x0

    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    iget-object v0, p0, Lvl2;->m:Lox;

    .line 15
    .line 16
    move-object v5, p0

    .line 17
    invoke-virtual/range {v0 .. v5}, Lox;->k0(JJLt00;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
