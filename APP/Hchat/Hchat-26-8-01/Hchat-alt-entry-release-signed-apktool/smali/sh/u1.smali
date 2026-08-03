.class public final synthetic Lsh/u1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:J

.field public final synthetic i:J

.field public final synthetic j:J

.field public final synthetic k:Ls0/d;

.field public final synthetic l:Ls0/d;

.field public final synthetic m:F

.field public final synthetic n:Lsh/w1;

.field public final synthetic o:F

.field public final synthetic p:Li0/a1;

.field public final synthetic q:Ly0/o;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:I

.field public final synthetic t:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JJJLs0/d;Ls0/d;FLsh/w1;FLi0/a1;Ly0/o;Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsh/u1;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Lsh/u1;->h:J

    .line 7
    .line 8
    iput-wide p4, p0, Lsh/u1;->i:J

    .line 9
    .line 10
    iput-wide p6, p0, Lsh/u1;->j:J

    .line 11
    .line 12
    iput-object p8, p0, Lsh/u1;->k:Ls0/d;

    .line 13
    .line 14
    iput-object p9, p0, Lsh/u1;->l:Ls0/d;

    .line 15
    .line 16
    iput p10, p0, Lsh/u1;->m:F

    .line 17
    .line 18
    iput-object p11, p0, Lsh/u1;->n:Lsh/w1;

    .line 19
    .line 20
    iput p12, p0, Lsh/u1;->o:F

    .line 21
    .line 22
    iput-object p13, p0, Lsh/u1;->p:Li0/a1;

    .line 23
    .line 24
    iput-object p14, p0, Lsh/u1;->q:Ly0/o;

    .line 25
    .line 26
    iput-object p15, p0, Lsh/u1;->r:Ljava/lang/String;

    .line 27
    .line 28
    move/from16 p1, p16

    .line 29
    .line 30
    iput p1, p0, Lsh/u1;->s:I

    .line 31
    .line 32
    move/from16 p1, p17

    .line 33
    .line 34
    iput p1, p0, Lsh/u1;->t:I

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v16, p1

    .line 4
    .line 5
    check-cast v16, Li0/h0;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget v1, v0, Lsh/u1;->s:I

    .line 15
    .line 16
    or-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    invoke-static {v1}, Li0/r;->C(I)I

    .line 19
    .line 20
    .line 21
    move-result v17

    .line 22
    iget v1, v0, Lsh/u1;->t:I

    .line 23
    .line 24
    invoke-static {v1}, Li0/r;->C(I)I

    .line 25
    .line 26
    .line 27
    move-result v18

    .line 28
    iget-object v1, v0, Lsh/u1;->g:Ljava/lang/String;

    .line 29
    .line 30
    iget-wide v2, v0, Lsh/u1;->h:J

    .line 31
    .line 32
    iget-wide v4, v0, Lsh/u1;->i:J

    .line 33
    .line 34
    iget-wide v6, v0, Lsh/u1;->j:J

    .line 35
    .line 36
    iget-object v8, v0, Lsh/u1;->k:Ls0/d;

    .line 37
    .line 38
    iget-object v9, v0, Lsh/u1;->l:Ls0/d;

    .line 39
    .line 40
    iget v10, v0, Lsh/u1;->m:F

    .line 41
    .line 42
    iget-object v11, v0, Lsh/u1;->n:Lsh/w1;

    .line 43
    .line 44
    iget v12, v0, Lsh/u1;->o:F

    .line 45
    .line 46
    iget-object v13, v0, Lsh/u1;->p:Li0/a1;

    .line 47
    .line 48
    iget-object v14, v0, Lsh/u1;->q:Ly0/o;

    .line 49
    .line 50
    iget-object v15, v0, Lsh/u1;->r:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static/range {v1 .. v18}, Lsh/s;->q(Ljava/lang/String;JJJLs0/d;Ls0/d;FLsh/w1;FLi0/a1;Ly0/o;Ljava/lang/String;Li0/h0;II)V

    .line 53
    .line 54
    .line 55
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 56
    .line 57
    return-object v1
.end method
