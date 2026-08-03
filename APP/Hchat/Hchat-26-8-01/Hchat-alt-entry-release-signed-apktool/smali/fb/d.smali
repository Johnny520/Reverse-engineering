.class public final synthetic Lfb/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lfb/s0;

.field public final synthetic b:Ljava/util/LinkedHashMap;

.field public final synthetic c:Lfb/b;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/util/ArrayList;

.field public final synthetic f:Landroid/content/Context;

.field public final synthetic g:Ljava/util/ArrayList;

.field public final synthetic h:Lfb/v;

.field public final synthetic i:Lb/e;

.field public final synthetic j:Lgg/u;

.field public final synthetic k:Lgg/s;

.field public final synthetic l:Lgg/u;

.field public final synthetic m:Leb/o;

.field public final synthetic n:Lfb/b1;

.field public final synthetic o:Lwb/qb;

.field public final synthetic p:Lgg/u;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Lgg/u;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lb/e;Leb/o;Lfb/b;Lfb/v;Lfb/s0;Lfb/b1;Lgg/s;Lgg/u;Lgg/u;Lgg/u;Lgg/u;Ljava/lang/Object;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Lwb/qb;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p6, p0, Lfb/d;->a:Lfb/s0;

    .line 5
    .line 6
    move-object/from16 p6, p17

    .line 7
    .line 8
    iput-object p6, p0, Lfb/d;->b:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    iput-object p4, p0, Lfb/d;->c:Lfb/b;

    .line 11
    .line 12
    iput-object p13, p0, Lfb/d;->d:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p15, p0, Lfb/d;->e:Ljava/util/ArrayList;

    .line 15
    .line 16
    iput-object p1, p0, Lfb/d;->f:Landroid/content/Context;

    .line 17
    .line 18
    move-object/from16 p1, p16

    .line 19
    .line 20
    iput-object p1, p0, Lfb/d;->g:Ljava/util/ArrayList;

    .line 21
    .line 22
    iput-object p5, p0, Lfb/d;->h:Lfb/v;

    .line 23
    .line 24
    iput-object p2, p0, Lfb/d;->i:Lb/e;

    .line 25
    .line 26
    iput-object p9, p0, Lfb/d;->j:Lgg/u;

    .line 27
    .line 28
    iput-object p8, p0, Lfb/d;->k:Lgg/s;

    .line 29
    .line 30
    iput-object p10, p0, Lfb/d;->l:Lgg/u;

    .line 31
    .line 32
    iput-object p3, p0, Lfb/d;->m:Leb/o;

    .line 33
    .line 34
    iput-object p7, p0, Lfb/d;->n:Lfb/b1;

    .line 35
    .line 36
    move-object/from16 p1, p18

    .line 37
    .line 38
    iput-object p1, p0, Lfb/d;->o:Lwb/qb;

    .line 39
    .line 40
    iput-object p11, p0, Lfb/d;->p:Lgg/u;

    .line 41
    .line 42
    iput-object p14, p0, Lfb/d;->q:Ljava/lang/String;

    .line 43
    .line 44
    iput-object p12, p0, Lfb/d;->r:Lgg/u;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v14, v0, Lfb/d;->q:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v12, v0, Lfb/d;->r:Lgg/u;

    .line 6
    .line 7
    iget-object v1, v0, Lfb/d;->f:Landroid/content/Context;

    .line 8
    .line 9
    iget-object v2, v0, Lfb/d;->i:Lb/e;

    .line 10
    .line 11
    iget-object v3, v0, Lfb/d;->m:Leb/o;

    .line 12
    .line 13
    iget-object v4, v0, Lfb/d;->c:Lfb/b;

    .line 14
    .line 15
    iget-object v5, v0, Lfb/d;->h:Lfb/v;

    .line 16
    .line 17
    iget-object v6, v0, Lfb/d;->a:Lfb/s0;

    .line 18
    .line 19
    iget-object v7, v0, Lfb/d;->n:Lfb/b1;

    .line 20
    .line 21
    iget-object v8, v0, Lfb/d;->k:Lgg/s;

    .line 22
    .line 23
    iget-object v9, v0, Lfb/d;->j:Lgg/u;

    .line 24
    .line 25
    iget-object v10, v0, Lfb/d;->l:Lgg/u;

    .line 26
    .line 27
    iget-object v11, v0, Lfb/d;->p:Lgg/u;

    .line 28
    .line 29
    iget-object v13, v0, Lfb/d;->d:Ljava/lang/Object;

    .line 30
    .line 31
    iget-object v15, v0, Lfb/d;->e:Ljava/util/ArrayList;

    .line 32
    .line 33
    move-object/from16 v16, v1

    .line 34
    .line 35
    iget-object v1, v0, Lfb/d;->g:Ljava/util/ArrayList;

    .line 36
    .line 37
    move-object/from16 v17, v1

    .line 38
    .line 39
    iget-object v1, v0, Lfb/d;->b:Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    move-object/from16 v18, v1

    .line 42
    .line 43
    iget-object v1, v0, Lfb/d;->o:Lwb/qb;

    .line 44
    .line 45
    move-object/from16 v19, v18

    .line 46
    .line 47
    move-object/from16 v18, v1

    .line 48
    .line 49
    move-object/from16 v1, v16

    .line 50
    .line 51
    move-object/from16 v16, v17

    .line 52
    .line 53
    move-object/from16 v17, v19

    .line 54
    .line 55
    invoke-static/range {v1 .. v18}, Lfb/u;->I(Landroid/content/Context;Lb/e;Leb/o;Lfb/b;Lfb/v;Lfb/s0;Lfb/b1;Lgg/s;Lgg/u;Lgg/u;Lgg/u;Lgg/u;Ljava/lang/Object;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Lwb/qb;)Lfb/l;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    return-object v1
.end method
