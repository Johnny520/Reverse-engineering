.class public final synthetic Ldf1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Lpu;

.field public final synthetic i:Lli1;

.field public final synthetic j:Lhq2;

.field public final synthetic k:Lo63;

.field public final synthetic l:Lkw;

.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(Lpu;Lli1;Lhq2;Lo63;Lkw;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldf1;->h:Lpu;

    .line 5
    .line 6
    iput-object p2, p0, Ldf1;->i:Lli1;

    .line 7
    .line 8
    iput-object p3, p0, Ldf1;->j:Lhq2;

    .line 9
    .line 10
    iput-object p4, p0, Ldf1;->k:Lo63;

    .line 11
    .line 12
    iput-object p5, p0, Ldf1;->l:Lkw;

    .line 13
    .line 14
    iput p6, p0, Ldf1;->m:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, Lpx;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Ldf1;->m:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lpp0;->N(I)I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget-object v0, p0, Ldf1;->h:Lpu;

    .line 18
    .line 19
    iget-object v1, p0, Ldf1;->i:Lli1;

    .line 20
    .line 21
    iget-object v2, p0, Ldf1;->j:Lhq2;

    .line 22
    .line 23
    iget-object v3, p0, Ldf1;->k:Lo63;

    .line 24
    .line 25
    iget-object v4, p0, Ldf1;->l:Lkw;

    .line 26
    .line 27
    invoke-static/range {v0 .. v6}, Lff1;->a(Lpu;Lli1;Lhq2;Lo63;Lkw;Lpx;I)V

    .line 28
    .line 29
    .line 30
    sget-object p0, La83;->a:La83;

    .line 31
    .line 32
    return-object p0
.end method
