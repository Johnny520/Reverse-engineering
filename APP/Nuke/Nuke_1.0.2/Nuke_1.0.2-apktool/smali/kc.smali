.class public final Lkc;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic i:Lin0;

.field public final synthetic j:Luh1;

.field public final synthetic k:Lin0;

.field public final synthetic l:I

.field public final synthetic m:I


# direct methods
.method public constructor <init>(Lin0;Luh1;Lin0;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkc;->i:Lin0;

    .line 2
    .line 3
    iput-object p2, p0, Lkc;->j:Luh1;

    .line 4
    .line 5
    iput-object p3, p0, Lkc;->k:Lin0;

    .line 6
    .line 7
    iput p4, p0, Lkc;->l:I

    .line 8
    .line 9
    iput p5, p0, Lkc;->m:I

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v3, p1

    .line 2
    check-cast v3, Lpx;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lkc;->l:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lpp0;->N(I)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    iget v5, p0, Lkc;->m:I

    .line 18
    .line 19
    iget-object v0, p0, Lkc;->i:Lin0;

    .line 20
    .line 21
    iget-object v1, p0, Lkc;->j:Luh1;

    .line 22
    .line 23
    iget-object v2, p0, Lkc;->k:Lin0;

    .line 24
    .line 25
    invoke-static/range {v0 .. v5}, Lpp0;->b(Lin0;Luh1;Lin0;Lpx;II)V

    .line 26
    .line 27
    .line 28
    sget-object p0, La83;->a:La83;

    .line 29
    .line 30
    return-object p0
.end method
