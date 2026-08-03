.class public final synthetic Lsh/x1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ly0/o;

.field public final synthetic i:J

.field public final synthetic j:J

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:J

.field public final synthetic m:Ls0/d;

.field public final synthetic n:Lfg/q;

.field public final synthetic o:Lsh/x;

.field public final synthetic p:F


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ly0/o;JJLjava/lang/String;JLs0/d;Lfg/q;Lsh/x;FI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsh/x1;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lsh/x1;->h:Ly0/o;

    .line 7
    .line 8
    iput-wide p3, p0, Lsh/x1;->i:J

    .line 9
    .line 10
    iput-wide p5, p0, Lsh/x1;->j:J

    .line 11
    .line 12
    iput-object p7, p0, Lsh/x1;->k:Ljava/lang/String;

    .line 13
    .line 14
    iput-wide p8, p0, Lsh/x1;->l:J

    .line 15
    .line 16
    iput-object p10, p0, Lsh/x1;->m:Ls0/d;

    .line 17
    .line 18
    iput-object p11, p0, Lsh/x1;->n:Lfg/q;

    .line 19
    .line 20
    iput-object p12, p0, Lsh/x1;->o:Lsh/x;

    .line 21
    .line 22
    iput p13, p0, Lsh/x1;->p:F

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v14, p1

    .line 4
    .line 5
    check-cast v14, Li0/h0;

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
    const v1, 0x30180001

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Li0/r;->C(I)I

    .line 18
    .line 19
    .line 20
    move-result v15

    .line 21
    iget-object v1, v0, Lsh/x1;->g:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v2, v0, Lsh/x1;->h:Ly0/o;

    .line 24
    .line 25
    iget-wide v3, v0, Lsh/x1;->i:J

    .line 26
    .line 27
    iget-wide v5, v0, Lsh/x1;->j:J

    .line 28
    .line 29
    iget-object v7, v0, Lsh/x1;->k:Ljava/lang/String;

    .line 30
    .line 31
    iget-wide v8, v0, Lsh/x1;->l:J

    .line 32
    .line 33
    iget-object v10, v0, Lsh/x1;->m:Ls0/d;

    .line 34
    .line 35
    iget-object v11, v0, Lsh/x1;->n:Lfg/q;

    .line 36
    .line 37
    iget-object v12, v0, Lsh/x1;->o:Lsh/x;

    .line 38
    .line 39
    iget v13, v0, Lsh/x1;->p:F

    .line 40
    .line 41
    invoke-static/range {v1 .. v15}, Lsh/s;->p(Ljava/lang/String;Ly0/o;JJLjava/lang/String;JLs0/d;Lfg/q;Lsh/x;FLi0/h0;I)V

    .line 42
    .line 43
    .line 44
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 45
    .line 46
    return-object v1
.end method
