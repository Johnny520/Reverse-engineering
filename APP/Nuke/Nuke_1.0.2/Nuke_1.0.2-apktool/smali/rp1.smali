.class public final synthetic Lrp1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Lxm0;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Lxm0;

.field public final synthetic m:Luh1;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Ln80;

.field public final synthetic p:I

.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(Lxm0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxm0;Luh1;Ljava/lang/String;Ln80;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrp1;->h:Lxm0;

    .line 5
    .line 6
    iput-object p2, p0, Lrp1;->i:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lrp1;->j:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lrp1;->k:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lrp1;->l:Lxm0;

    .line 13
    .line 14
    iput-object p6, p0, Lrp1;->m:Luh1;

    .line 15
    .line 16
    iput-object p7, p0, Lrp1;->n:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p8, p0, Lrp1;->o:Ln80;

    .line 19
    .line 20
    iput p9, p0, Lrp1;->p:I

    .line 21
    .line 22
    iput p10, p0, Lrp1;->q:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, Lpx;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lrp1;->p:I

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
    iget-object v0, p0, Lrp1;->h:Lxm0;

    .line 18
    .line 19
    iget-object v1, p0, Lrp1;->i:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v2, p0, Lrp1;->j:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v3, p0, Lrp1;->k:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v4, p0, Lrp1;->l:Lxm0;

    .line 26
    .line 27
    iget-object v5, p0, Lrp1;->m:Luh1;

    .line 28
    .line 29
    iget-object v6, p0, Lrp1;->n:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v7, p0, Lrp1;->o:Ln80;

    .line 32
    .line 33
    iget v10, p0, Lrp1;->q:I

    .line 34
    .line 35
    invoke-static/range {v0 .. v10}, Lqp0;->c(Lxm0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxm0;Luh1;Ljava/lang/String;Ln80;Lpx;II)V

    .line 36
    .line 37
    .line 38
    sget-object p0, La83;->a:La83;

    .line 39
    .line 40
    return-object p0
.end method
