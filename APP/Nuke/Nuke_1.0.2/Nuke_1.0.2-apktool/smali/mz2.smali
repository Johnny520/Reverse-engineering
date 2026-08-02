.class public final Lmz2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Lt91;

.field public final b:Lb03;

.field public final c:Lk03;

.field public final d:Z

.field public final e:Z

.field public final f:Le13;

.field public final g:Lus1;

.field public final h:Lw73;

.field public final i:Ln40;

.field public final j:Lj51;

.field public final k:Lin0;

.field public final l:I


# direct methods
.method public constructor <init>(Lt91;Lb03;Lk03;ZZLe13;Lus1;Lw73;Ln40;Lin0;I)V
    .locals 1

    .line 1
    sget-object v0, Lt11;->d:Lj51;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lmz2;->a:Lt91;

    .line 7
    .line 8
    iput-object p2, p0, Lmz2;->b:Lb03;

    .line 9
    .line 10
    iput-object p3, p0, Lmz2;->c:Lk03;

    .line 11
    .line 12
    iput-boolean p4, p0, Lmz2;->d:Z

    .line 13
    .line 14
    iput-boolean p5, p0, Lmz2;->e:Z

    .line 15
    .line 16
    iput-object p6, p0, Lmz2;->f:Le13;

    .line 17
    .line 18
    iput-object p7, p0, Lmz2;->g:Lus1;

    .line 19
    .line 20
    iput-object p8, p0, Lmz2;->h:Lw73;

    .line 21
    .line 22
    iput-object p9, p0, Lmz2;->i:Ln40;

    .line 23
    .line 24
    iput-object v0, p0, Lmz2;->j:Lj51;

    .line 25
    .line 26
    iput-object p10, p0, Lmz2;->k:Lin0;

    .line 27
    .line 28
    iput p11, p0, Lmz2;->l:I

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lmz2;->a:Lt91;

    .line 2
    .line 3
    iget-object v0, v0, Lt91;->d:Lsz0;

    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Lej0;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lsz0;->q(Ljava/util/List;)Lk03;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object p0, p0, Lmz2;->k:Lin0;

    .line 24
    .line 25
    invoke-interface {p0, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    return-void
.end method
