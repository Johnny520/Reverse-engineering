.class public final Lyc;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic i:Ly33;

.field public final synthetic j:Lin0;

.field public final synthetic k:Luh1;

.field public final synthetic l:Lsf0;

.field public final synthetic m:Lph0;

.field public final synthetic n:Lmn0;

.field public final synthetic o:Lkw;

.field public final synthetic p:I


# direct methods
.method public constructor <init>(Ly33;Lin0;Luh1;Lsf0;Lph0;Lmn0;Lkw;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyc;->i:Ly33;

    .line 2
    .line 3
    iput-object p2, p0, Lyc;->j:Lin0;

    .line 4
    .line 5
    iput-object p3, p0, Lyc;->k:Luh1;

    .line 6
    .line 7
    iput-object p4, p0, Lyc;->l:Lsf0;

    .line 8
    .line 9
    iput-object p5, p0, Lyc;->m:Lph0;

    .line 10
    .line 11
    iput-object p6, p0, Lyc;->n:Lmn0;

    .line 12
    .line 13
    iput-object p7, p0, Lyc;->o:Lkw;

    .line 14
    .line 15
    iput p8, p0, Lyc;->p:I

    .line 16
    .line 17
    const/4 p1, 0x2

    .line 18
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, Lpx;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lyc;->p:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lpp0;->N(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget-object v0, p0, Lyc;->i:Ly33;

    .line 18
    .line 19
    iget-object v1, p0, Lyc;->j:Lin0;

    .line 20
    .line 21
    iget-object v2, p0, Lyc;->k:Luh1;

    .line 22
    .line 23
    iget-object v3, p0, Lyc;->l:Lsf0;

    .line 24
    .line 25
    iget-object v4, p0, Lyc;->m:Lph0;

    .line 26
    .line 27
    iget-object v5, p0, Lyc;->n:Lmn0;

    .line 28
    .line 29
    iget-object v6, p0, Lyc;->o:Lkw;

    .line 30
    .line 31
    invoke-static/range {v0 .. v8}, Lrp0;->C(Ly33;Lin0;Luh1;Lsf0;Lph0;Lmn0;Lkw;Lpx;I)V

    .line 32
    .line 33
    .line 34
    sget-object p0, La83;->a:La83;

    .line 35
    .line 36
    return-object p0
.end method
