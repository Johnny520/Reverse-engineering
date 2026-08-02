.class public final Liz2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:Lsd;

.field public final b:Lm13;

.field public final c:I

.field public final d:I

.field public final e:Z

.field public final f:I

.field public final g:Le70;

.field public final h:Lxl0;

.field public final i:Ljava/util/List;

.field public j:Lcj;

.field public k:Ld61;


# direct methods
.method public constructor <init>(Lsd;Lm13;ZLe70;Lxl0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Liz2;->a:Lsd;

    .line 5
    .line 6
    iput-object p2, p0, Liz2;->b:Lm13;

    .line 7
    .line 8
    const p1, 0x7fffffff

    .line 9
    .line 10
    .line 11
    iput p1, p0, Liz2;->c:I

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput p1, p0, Liz2;->d:I

    .line 15
    .line 16
    iput-boolean p3, p0, Liz2;->e:Z

    .line 17
    .line 18
    iput p1, p0, Liz2;->f:I

    .line 19
    .line 20
    iput-object p4, p0, Liz2;->g:Le70;

    .line 21
    .line 22
    iput-object p5, p0, Liz2;->h:Lxl0;

    .line 23
    .line 24
    sget-object p1, Lbe0;->h:Lbe0;

    .line 25
    .line 26
    iput-object p1, p0, Liz2;->i:Ljava/util/List;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a(Ld61;)V
    .locals 7

    .line 1
    iget-object v0, p0, Liz2;->j:Lcj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Liz2;->k:Ld61;

    .line 6
    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcj;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    :cond_0
    iput-object p1, p0, Liz2;->k:Ld61;

    .line 16
    .line 17
    iget-object v0, p0, Liz2;->b:Lm13;

    .line 18
    .line 19
    invoke-static {v0, p1}, Lxe1;->k0(Lm13;Ld61;)Lm13;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    new-instance v1, Lcj;

    .line 24
    .line 25
    iget-object v2, p0, Liz2;->a:Lsd;

    .line 26
    .line 27
    iget-object v4, p0, Liz2;->i:Ljava/util/List;

    .line 28
    .line 29
    iget-object v5, p0, Liz2;->g:Le70;

    .line 30
    .line 31
    iget-object v6, p0, Liz2;->h:Lxl0;

    .line 32
    .line 33
    invoke-direct/range {v1 .. v6}, Lcj;-><init>(Lsd;Lm13;Ljava/util/List;Le70;Lxl0;)V

    .line 34
    .line 35
    .line 36
    move-object v0, v1

    .line 37
    :cond_1
    iput-object v0, p0, Liz2;->j:Lcj;

    .line 38
    .line 39
    return-void
.end method
