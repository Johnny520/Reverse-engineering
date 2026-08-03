.class public final synthetic Lxh/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:J

.field public final synthetic i:J

.field public final synthetic j:J

.field public final synthetic k:J

.field public final synthetic l:J

.field public final synthetic m:Z

.field public final synthetic n:Li/c;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Lfg/a;

.field public final synthetic q:Ly0/o;

.field public final synthetic r:Lu2/f;

.field public final synthetic s:Ls0/d;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JJJJJZLi/c;Li0/a1;Lfg/a;Ly0/o;Lu2/f;Ls0/d;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxh/b;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Lxh/b;->h:J

    .line 7
    .line 8
    iput-wide p4, p0, Lxh/b;->i:J

    .line 9
    .line 10
    iput-wide p6, p0, Lxh/b;->j:J

    .line 11
    .line 12
    iput-wide p8, p0, Lxh/b;->k:J

    .line 13
    .line 14
    iput-wide p10, p0, Lxh/b;->l:J

    .line 15
    .line 16
    iput-boolean p12, p0, Lxh/b;->m:Z

    .line 17
    .line 18
    iput-object p13, p0, Lxh/b;->n:Li/c;

    .line 19
    .line 20
    iput-object p14, p0, Lxh/b;->o:Li0/a1;

    .line 21
    .line 22
    iput-object p15, p0, Lxh/b;->p:Lfg/a;

    .line 23
    .line 24
    move-object/from16 p1, p16

    .line 25
    .line 26
    iput-object p1, p0, Lxh/b;->q:Ly0/o;

    .line 27
    .line 28
    move-object/from16 p1, p17

    .line 29
    .line 30
    iput-object p1, p0, Lxh/b;->r:Lu2/f;

    .line 31
    .line 32
    move-object/from16 p1, p18

    .line 33
    .line 34
    iput-object p1, p0, Lxh/b;->s:Ls0/d;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v19, p1

    .line 4
    .line 5
    check-cast v19, Li0/h0;

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
    const v1, 0x38000001

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Li0/r;->C(I)I

    .line 18
    .line 19
    .line 20
    move-result v20

    .line 21
    iget-object v1, v0, Lxh/b;->g:Ljava/lang/String;

    .line 22
    .line 23
    iget-wide v2, v0, Lxh/b;->h:J

    .line 24
    .line 25
    iget-wide v4, v0, Lxh/b;->i:J

    .line 26
    .line 27
    iget-wide v6, v0, Lxh/b;->j:J

    .line 28
    .line 29
    iget-wide v8, v0, Lxh/b;->k:J

    .line 30
    .line 31
    iget-wide v10, v0, Lxh/b;->l:J

    .line 32
    .line 33
    iget-boolean v12, v0, Lxh/b;->m:Z

    .line 34
    .line 35
    iget-object v13, v0, Lxh/b;->n:Li/c;

    .line 36
    .line 37
    iget-object v14, v0, Lxh/b;->o:Li0/a1;

    .line 38
    .line 39
    iget-object v15, v0, Lxh/b;->p:Lfg/a;

    .line 40
    .line 41
    move-object/from16 v16, v1

    .line 42
    .line 43
    iget-object v1, v0, Lxh/b;->q:Ly0/o;

    .line 44
    .line 45
    move-object/from16 v17, v1

    .line 46
    .line 47
    iget-object v1, v0, Lxh/b;->r:Lu2/f;

    .line 48
    .line 49
    move-object/from16 v18, v1

    .line 50
    .line 51
    iget-object v1, v0, Lxh/b;->s:Ls0/d;

    .line 52
    .line 53
    move-object/from16 v21, v18

    .line 54
    .line 55
    move-object/from16 v18, v1

    .line 56
    .line 57
    move-object/from16 v1, v16

    .line 58
    .line 59
    move-object/from16 v16, v17

    .line 60
    .line 61
    move-object/from16 v17, v21

    .line 62
    .line 63
    invoke-static/range {v1 .. v20}, Lg4/a;->b(Ljava/lang/String;JJJJJZLi/c;Li0/a1;Lfg/a;Ly0/o;Lu2/f;Ls0/d;Li0/h0;I)V

    .line 64
    .line 65
    .line 66
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 67
    .line 68
    return-object v1
.end method
