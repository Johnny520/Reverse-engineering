.class public final Lad;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic i:Lyk1;

.field public final synthetic j:Luh1;

.field public final synthetic k:Lsf0;

.field public final synthetic l:Lph0;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Lkw;


# direct methods
.method public constructor <init>(Lyk1;Luh1;Lsf0;Lph0;Ljava/lang/String;Lkw;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lad;->i:Lyk1;

    .line 2
    .line 3
    iput-object p2, p0, Lad;->j:Luh1;

    .line 4
    .line 5
    iput-object p3, p0, Lad;->k:Lsf0;

    .line 6
    .line 7
    iput-object p4, p0, Lad;->l:Lph0;

    .line 8
    .line 9
    iput-object p5, p0, Lad;->m:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, Lad;->n:Lkw;

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
    .locals 8

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, Lpx;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    const p1, 0x30181

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lpp0;->N(I)I

    .line 13
    .line 14
    .line 15
    move-result v7

    .line 16
    iget-object v0, p0, Lad;->i:Lyk1;

    .line 17
    .line 18
    iget-object v1, p0, Lad;->j:Luh1;

    .line 19
    .line 20
    iget-object v2, p0, Lad;->k:Lsf0;

    .line 21
    .line 22
    iget-object v3, p0, Lad;->l:Lph0;

    .line 23
    .line 24
    iget-object v4, p0, Lad;->m:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v5, p0, Lad;->n:Lkw;

    .line 27
    .line 28
    invoke-static/range {v0 .. v7}, Lrp0;->D(Lyk1;Luh1;Lsf0;Lph0;Ljava/lang/String;Lkw;Lpx;I)V

    .line 29
    .line 30
    .line 31
    sget-object p0, La83;->a:La83;

    .line 32
    .line 33
    return-object p0
.end method
