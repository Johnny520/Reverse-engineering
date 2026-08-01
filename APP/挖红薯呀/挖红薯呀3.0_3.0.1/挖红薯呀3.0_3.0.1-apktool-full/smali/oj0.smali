.class public final Loj0;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# instance fields
.field public final synthetic d:Lqj0;

.field public final synthetic e:Loe0;

.field public final synthetic f:Lr3;

.field public final synthetic g:J

.field public final synthetic h:Lpy;

.field public final synthetic i:I

.field public final synthetic j:Z

.field public final synthetic k:F

.field public final synthetic l:Z


# direct methods
.method public constructor <init>(Lqj0;Loe0;Lr3;JLpy;IZFZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Loj0;->d:Lqj0;

    .line 2
    .line 3
    iput-object p2, p0, Loj0;->e:Loe0;

    .line 4
    .line 5
    iput-object p3, p0, Loj0;->f:Lr3;

    .line 6
    .line 7
    iput-wide p4, p0, Loj0;->g:J

    .line 8
    .line 9
    iput-object p6, p0, Loj0;->h:Lpy;

    .line 10
    .line 11
    iput p7, p0, Loj0;->i:I

    .line 12
    .line 13
    iput-boolean p8, p0, Loj0;->j:Z

    .line 14
    .line 15
    iput p9, p0, Loj0;->k:F

    .line 16
    .line 17
    iput-boolean p10, p0, Loj0;->l:Z

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Loj0;->f:Lr3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lr3;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Loj0;->e:Loe0;

    .line 8
    .line 9
    invoke-static {v1, v0}, Lv50;->d(Lrm;I)Loe0;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget v10, p0, Loj0;->k:F

    .line 14
    .line 15
    iget-boolean v11, p0, Loj0;->l:Z

    .line 16
    .line 17
    iget-object v2, p0, Loj0;->d:Lqj0;

    .line 18
    .line 19
    iget-object v4, p0, Loj0;->f:Lr3;

    .line 20
    .line 21
    iget-wide v5, p0, Loj0;->g:J

    .line 22
    .line 23
    iget-object v7, p0, Loj0;->h:Lpy;

    .line 24
    .line 25
    iget v8, p0, Loj0;->i:I

    .line 26
    .line 27
    iget-boolean v9, p0, Loj0;->j:Z

    .line 28
    .line 29
    invoke-virtual/range {v2 .. v11}, Lqj0;->V0(Loe0;Lr3;JLpy;IZFZ)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lna1;->a:Lna1;

    .line 33
    .line 34
    return-object p0
.end method
