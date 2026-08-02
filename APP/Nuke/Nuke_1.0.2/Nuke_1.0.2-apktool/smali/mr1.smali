.class public final synthetic Lmr1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Z

.field public final synthetic i:Lin0;

.field public final synthetic j:Luh1;

.field public final synthetic k:Z

.field public final synthetic l:I

.field public final synthetic m:I

.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(ZLin0;Luh1;ZIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lmr1;->h:Z

    .line 5
    .line 6
    iput-object p2, p0, Lmr1;->i:Lin0;

    .line 7
    .line 8
    iput-object p3, p0, Lmr1;->j:Luh1;

    .line 9
    .line 10
    iput-boolean p4, p0, Lmr1;->k:Z

    .line 11
    .line 12
    iput p5, p0, Lmr1;->l:I

    .line 13
    .line 14
    iput p6, p0, Lmr1;->m:I

    .line 15
    .line 16
    iput p7, p0, Lmr1;->n:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

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
    iget p1, p0, Lmr1;->m:I

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
    iget-boolean v0, p0, Lmr1;->h:Z

    .line 18
    .line 19
    iget-object v1, p0, Lmr1;->i:Lin0;

    .line 20
    .line 21
    iget-object v2, p0, Lmr1;->j:Luh1;

    .line 22
    .line 23
    iget-boolean v3, p0, Lmr1;->k:Z

    .line 24
    .line 25
    iget v4, p0, Lmr1;->l:I

    .line 26
    .line 27
    iget v7, p0, Lmr1;->n:I

    .line 28
    .line 29
    invoke-static/range {v0 .. v7}, Lsp0;->i(ZLin0;Luh1;ZILpx;II)V

    .line 30
    .line 31
    .line 32
    sget-object p0, La83;->a:La83;

    .line 33
    .line 34
    return-object p0
.end method
