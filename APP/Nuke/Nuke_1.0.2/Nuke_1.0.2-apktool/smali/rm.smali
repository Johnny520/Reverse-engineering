.class public final Lrm;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lsm;

.field public final synthetic n:Lzn1;

.field public final synthetic o:Lt6;

.field public final synthetic p:Ls1;


# direct methods
.method public constructor <init>(Lsm;Lzn1;Lt6;Ls1;Lt00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrm;->m:Lsm;

    .line 2
    .line 3
    iput-object p2, p0, Lrm;->n:Lzn1;

    .line 4
    .line 5
    iput-object p3, p0, Lrm;->o:Lt6;

    .line 6
    .line 7
    iput-object p4, p0, Lrm;->p:Ls1;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Ltw2;-><init>(ILt00;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lj20;

    .line 2
    .line 3
    check-cast p2, Lt00;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lrm;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lrm;

    .line 10
    .line 11
    sget-object p1, La83;->a:La83;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lrm;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 6

    .line 1
    new-instance v0, Lrm;

    .line 2
    .line 3
    iget-object v3, p0, Lrm;->o:Lt6;

    .line 4
    .line 5
    iget-object v4, p0, Lrm;->p:Ls1;

    .line 6
    .line 7
    iget-object v1, p0, Lrm;->m:Lsm;

    .line 8
    .line 9
    iget-object v2, p0, Lrm;->n:Lzn1;

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Lrm;-><init>(Lsm;Lzn1;Lt6;Ls1;Lt00;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, v0, Lrm;->l:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lrm;->l:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, Lj20;

    .line 7
    .line 8
    new-instance v0, Lb2;

    .line 9
    .line 10
    iget-object v3, p0, Lrm;->o:Lt6;

    .line 11
    .line 12
    const/4 v5, 0x3

    .line 13
    iget-object v1, p0, Lrm;->m:Lsm;

    .line 14
    .line 15
    iget-object v2, p0, Lrm;->n:Lzn1;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-direct/range {v0 .. v5}, Lb2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    invoke-static {p1, v4, v0, v2}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 23
    .line 24
    .line 25
    new-instance v0, La2;

    .line 26
    .line 27
    iget-object p0, p0, Lrm;->p:Ls1;

    .line 28
    .line 29
    const/4 v3, 0x7

    .line 30
    invoke-direct {v0, v1, p0, v4, v3}, La2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lt00;I)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v4, v0, v2}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method
