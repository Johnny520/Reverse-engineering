.class public final synthetic Lnt0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Lin0;

.field public final synthetic l:Z

.field public final synthetic m:Lin0;

.field public final synthetic n:Lrs2;

.field public final synthetic o:Lmn0;

.field public final synthetic p:Lmn0;

.field public final synthetic q:Lmn0;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lin0;ZLin0;Lrs2;Lmn0;Lmn0;Lmn0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnt0;->h:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Lnt0;->i:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Lnt0;->j:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lnt0;->k:Lin0;

    .line 11
    .line 12
    iput-boolean p5, p0, Lnt0;->l:Z

    .line 13
    .line 14
    iput-object p6, p0, Lnt0;->m:Lin0;

    .line 15
    .line 16
    iput-object p7, p0, Lnt0;->n:Lrs2;

    .line 17
    .line 18
    iput-object p8, p0, Lnt0;->o:Lmn0;

    .line 19
    .line 20
    iput-object p9, p0, Lnt0;->p:Lmn0;

    .line 21
    .line 22
    iput-object p10, p0, Lnt0;->q:Lmn0;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v10, p1

    .line 2
    check-cast v10, Lpx;

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
    move-result v11

    .line 14
    iget-object v0, p0, Lnt0;->h:Ljava/util/List;

    .line 15
    .line 16
    iget-object v1, p0, Lnt0;->i:Ljava/util/List;

    .line 17
    .line 18
    iget-object v2, p0, Lnt0;->j:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v3, p0, Lnt0;->k:Lin0;

    .line 21
    .line 22
    iget-boolean v4, p0, Lnt0;->l:Z

    .line 23
    .line 24
    iget-object v5, p0, Lnt0;->m:Lin0;

    .line 25
    .line 26
    iget-object v6, p0, Lnt0;->n:Lrs2;

    .line 27
    .line 28
    iget-object v7, p0, Lnt0;->o:Lmn0;

    .line 29
    .line 30
    iget-object v8, p0, Lnt0;->p:Lmn0;

    .line 31
    .line 32
    iget-object v9, p0, Lnt0;->q:Lmn0;

    .line 33
    .line 34
    invoke-static/range {v0 .. v11}, Leu;->e(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lin0;ZLin0;Lrs2;Lmn0;Lmn0;Lmn0;Lpx;I)V

    .line 35
    .line 36
    .line 37
    sget-object p0, La83;->a:La83;

    .line 38
    .line 39
    return-object p0
.end method
