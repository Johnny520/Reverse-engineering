.class public final synthetic Lu32;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic h:Lxm0;

.field public final synthetic i:Luh1;

.field public final synthetic j:J

.field public final synthetic k:J

.field public final synthetic l:I

.field public final synthetic m:F

.field public final synthetic n:Lin0;


# direct methods
.method public synthetic constructor <init>(Lxm0;Luh1;JJIFLin0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu32;->h:Lxm0;

    .line 5
    .line 6
    iput-object p2, p0, Lu32;->i:Luh1;

    .line 7
    .line 8
    iput-wide p3, p0, Lu32;->j:J

    .line 9
    .line 10
    iput-wide p5, p0, Lu32;->k:J

    .line 11
    .line 12
    iput p7, p0, Lu32;->l:I

    .line 13
    .line 14
    iput p8, p0, Lu32;->m:F

    .line 15
    .line 16
    iput-object p9, p0, Lu32;->n:Lin0;

    .line 17
    .line 18
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
    const/16 p1, 0x31

    .line 10
    .line 11
    invoke-static {p1}, Lpp0;->N(I)I

    .line 12
    .line 13
    .line 14
    move-result v10

    .line 15
    iget-object v0, p0, Lu32;->h:Lxm0;

    .line 16
    .line 17
    iget-object v1, p0, Lu32;->i:Luh1;

    .line 18
    .line 19
    iget-wide v2, p0, Lu32;->j:J

    .line 20
    .line 21
    iget-wide v4, p0, Lu32;->k:J

    .line 22
    .line 23
    iget v6, p0, Lu32;->l:I

    .line 24
    .line 25
    iget v7, p0, Lu32;->m:F

    .line 26
    .line 27
    iget-object v8, p0, Lu32;->n:Lin0;

    .line 28
    .line 29
    invoke-static/range {v0 .. v10}, Lx32;->b(Lxm0;Luh1;JJIFLin0;Lpx;I)V

    .line 30
    .line 31
    .line 32
    sget-object p0, La83;->a:La83;

    .line 33
    .line 34
    return-object p0
.end method
