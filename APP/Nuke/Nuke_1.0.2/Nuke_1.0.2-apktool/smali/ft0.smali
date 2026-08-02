.class public final synthetic Lft0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:F

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(FII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lft0;->h:F

    .line 5
    .line 6
    iput p2, p0, Lft0;->i:I

    .line 7
    .line 8
    iput p3, p0, Lft0;->j:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lpx;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget p2, p0, Lft0;->i:I

    .line 9
    .line 10
    or-int/lit8 p2, p2, 0x1

    .line 11
    .line 12
    invoke-static {p2}, Lpp0;->N(I)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    iget v0, p0, Lft0;->h:F

    .line 17
    .line 18
    iget p0, p0, Lft0;->j:I

    .line 19
    .line 20
    invoke-static {v0, p1, p2, p0}, Lci0;->f(FLpx;II)V

    .line 21
    .line 22
    .line 23
    sget-object p0, La83;->a:La83;

    .line 24
    .line 25
    return-object p0
.end method
