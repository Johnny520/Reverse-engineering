.class public final synthetic Lt13;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:Z

.field public final synthetic n:Lin0;

.field public final synthetic o:Lxm0;

.field public final synthetic p:Lxm0;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLin0;Lxm0;Lxm0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lt13;->h:Z

    .line 5
    .line 6
    iput-object p2, p0, Lt13;->i:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lt13;->j:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lt13;->k:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lt13;->l:Ljava/util/List;

    .line 13
    .line 14
    iput-boolean p6, p0, Lt13;->m:Z

    .line 15
    .line 16
    iput-object p7, p0, Lt13;->n:Lin0;

    .line 17
    .line 18
    iput-object p8, p0, Lt13;->o:Lxm0;

    .line 19
    .line 20
    iput-object p9, p0, Lt13;->p:Lxm0;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, Lpx;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, Lpp0;->N(I)I

    .line 11
    .line 12
    .line 13
    move-result v10

    .line 14
    iget-boolean v0, p0, Lt13;->h:Z

    .line 15
    .line 16
    iget-object v1, p0, Lt13;->i:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v2, p0, Lt13;->j:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v3, p0, Lt13;->k:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v4, p0, Lt13;->l:Ljava/util/List;

    .line 23
    .line 24
    iget-boolean v5, p0, Lt13;->m:Z

    .line 25
    .line 26
    iget-object v6, p0, Lt13;->n:Lin0;

    .line 27
    .line 28
    iget-object v7, p0, Lt13;->o:Lxm0;

    .line 29
    .line 30
    iget-object v8, p0, Lt13;->p:Lxm0;

    .line 31
    .line 32
    invoke-static/range {v0 .. v10}, Lgf1;->e(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLin0;Lxm0;Lxm0;Lpx;I)V

    .line 33
    .line 34
    .line 35
    sget-object p0, La83;->a:La83;

    .line 36
    .line 37
    return-object p0
.end method
