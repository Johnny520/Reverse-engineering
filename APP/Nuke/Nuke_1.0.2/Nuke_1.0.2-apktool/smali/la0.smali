.class public final synthetic Lla0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Luh1;

.field public final synthetic i:F

.field public final synthetic j:J

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Luh1;FJII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lla0;->h:Luh1;

    .line 5
    .line 6
    iput p2, p0, Lla0;->i:F

    .line 7
    .line 8
    iput-wide p3, p0, Lla0;->j:J

    .line 9
    .line 10
    iput p6, p0, Lla0;->k:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, Lpx;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/16 p1, 0x31

    .line 10
    .line 11
    invoke-static {p1}, Lpp0;->N(I)I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    iget-object v0, p0, Lla0;->h:Luh1;

    .line 16
    .line 17
    iget v1, p0, Lla0;->i:F

    .line 18
    .line 19
    iget-wide v2, p0, Lla0;->j:J

    .line 20
    .line 21
    iget v6, p0, Lla0;->k:I

    .line 22
    .line 23
    invoke-static/range {v0 .. v6}, Lop0;->a(Luh1;FJLpx;II)V

    .line 24
    .line 25
    .line 26
    sget-object p0, La83;->a:La83;

    .line 27
    .line 28
    return-object p0
.end method
