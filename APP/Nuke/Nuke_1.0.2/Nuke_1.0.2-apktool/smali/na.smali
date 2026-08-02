.class public final Lna;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic i:Lg22;

.field public final synthetic j:Lxm0;

.field public final synthetic k:Lh22;

.field public final synthetic l:Lkw;

.field public final synthetic m:I

.field public final synthetic n:I


# direct methods
.method public constructor <init>(Lg22;Lxm0;Lh22;Lkw;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lna;->i:Lg22;

    .line 2
    .line 3
    iput-object p2, p0, Lna;->j:Lxm0;

    .line 4
    .line 5
    iput-object p3, p0, Lna;->k:Lh22;

    .line 6
    .line 7
    iput-object p4, p0, Lna;->l:Lkw;

    .line 8
    .line 9
    iput p5, p0, Lna;->m:I

    .line 10
    .line 11
    iput p6, p0, Lna;->n:I

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 15
    .line 16
    .line 17
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
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lna;->m:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lpp0;->N(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    iget v6, p0, Lna;->n:I

    .line 18
    .line 19
    iget-object v0, p0, Lna;->i:Lg22;

    .line 20
    .line 21
    iget-object v1, p0, Lna;->j:Lxm0;

    .line 22
    .line 23
    iget-object v2, p0, Lna;->k:Lh22;

    .line 24
    .line 25
    iget-object v3, p0, Lna;->l:Lkw;

    .line 26
    .line 27
    invoke-static/range {v0 .. v6}, Lpa;->a(Lg22;Lxm0;Lh22;Lkw;Lpx;II)V

    .line 28
    .line 29
    .line 30
    sget-object p0, La83;->a:La83;

    .line 31
    .line 32
    return-object p0
.end method
