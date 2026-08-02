.class public final Ls60;
.super Lu00;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public synthetic k:Ljava/lang/Object;

.field public l:I


# virtual methods
.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Ls60;->k:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Ls60;->l:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Ls60;->l:I

    .line 9
    .line 10
    invoke-static {p0}, Leu;->x(Lu00;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lk20;->h:Lk20;

    .line 14
    .line 15
    return-object p0
.end method
