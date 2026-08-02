.class public final synthetic Lqr;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Lzq;

.field public final synthetic i:I

.field public final synthetic j:Z

.field public final synthetic k:Z

.field public final synthetic l:Lxm0;

.field public final synthetic m:Lxm0;

.field public final synthetic n:Lxm0;

.field public final synthetic o:Lin0;

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Lzq;IZZLxm0;Lxm0;Lxm0;Lin0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqr;->h:Lzq;

    .line 5
    .line 6
    iput p2, p0, Lqr;->i:I

    .line 7
    .line 8
    iput-boolean p3, p0, Lqr;->j:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Lqr;->k:Z

    .line 11
    .line 12
    iput-object p5, p0, Lqr;->l:Lxm0;

    .line 13
    .line 14
    iput-object p6, p0, Lqr;->m:Lxm0;

    .line 15
    .line 16
    iput-object p7, p0, Lqr;->n:Lxm0;

    .line 17
    .line 18
    iput-object p8, p0, Lqr;->o:Lin0;

    .line 19
    .line 20
    iput p9, p0, Lqr;->p:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, Lpx;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lqr;->p:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lpp0;->N(I)I

    .line 14
    .line 15
    .line 16
    move-result v9

    .line 17
    iget-object v0, p0, Lqr;->h:Lzq;

    .line 18
    .line 19
    iget v1, p0, Lqr;->i:I

    .line 20
    .line 21
    iget-boolean v2, p0, Lqr;->j:Z

    .line 22
    .line 23
    iget-boolean v3, p0, Lqr;->k:Z

    .line 24
    .line 25
    iget-object v4, p0, Lqr;->l:Lxm0;

    .line 26
    .line 27
    iget-object v5, p0, Lqr;->m:Lxm0;

    .line 28
    .line 29
    iget-object v6, p0, Lqr;->n:Lxm0;

    .line 30
    .line 31
    iget-object v7, p0, Lqr;->o:Lin0;

    .line 32
    .line 33
    invoke-static/range {v0 .. v9}, Lyr;->c(Lzq;IZZLxm0;Lxm0;Lxm0;Lin0;Lpx;I)V

    .line 34
    .line 35
    .line 36
    sget-object p0, La83;->a:La83;

    .line 37
    .line 38
    return-object p0
.end method
