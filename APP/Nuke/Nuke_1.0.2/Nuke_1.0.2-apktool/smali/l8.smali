.class public final Ll8;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic i:Luh1;

.field public final synthetic j:Lmn0;

.field public final synthetic k:I


# direct methods
.method public constructor <init>(Luh1;Lmn0;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll8;->i:Luh1;

    .line 2
    .line 3
    iput-object p2, p0, Ll8;->j:Lmn0;

    .line 4
    .line 5
    iput p3, p0, Ll8;->k:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lpx;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    iget p2, p0, Ll8;->k:I

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
    iget-object v0, p0, Ll8;->i:Luh1;

    .line 17
    .line 18
    iget-object p0, p0, Ll8;->j:Lmn0;

    .line 19
    .line 20
    invoke-static {v0, p0, p1, p2}, Lte;->k(Luh1;Lmn0;Lpx;I)V

    .line 21
    .line 22
    .line 23
    sget-object p0, La83;->a:La83;

    .line 24
    .line 25
    return-object p0
.end method
