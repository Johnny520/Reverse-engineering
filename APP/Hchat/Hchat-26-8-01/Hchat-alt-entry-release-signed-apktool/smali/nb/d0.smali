.class public final synthetic Lnb/d0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:J

.field public final synthetic i:Lgg/t;

.field public final synthetic j:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic k:Ljava/util/ArrayList;

.field public final synthetic l:Lgg/s;

.field public final synthetic m:Ljava/util/List;

.field public final synthetic n:Lgg/u;

.field public final synthetic o:Lgg/u;

.field public final synthetic p:Lgg/u;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Landroid/content/Context;

.field public final synthetic s:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JLgg/t;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/ArrayList;Lgg/s;Ljava/util/List;Lgg/u;Lgg/u;Lgg/u;Ljava/lang/String;Landroid/content/Context;Lfg/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnb/d0;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Lnb/d0;->h:J

    .line 7
    .line 8
    iput-object p4, p0, Lnb/d0;->i:Lgg/t;

    .line 9
    .line 10
    iput-object p5, p0, Lnb/d0;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    iput-object p6, p0, Lnb/d0;->k:Ljava/util/ArrayList;

    .line 13
    .line 14
    iput-object p7, p0, Lnb/d0;->l:Lgg/s;

    .line 15
    .line 16
    iput-object p8, p0, Lnb/d0;->m:Ljava/util/List;

    .line 17
    .line 18
    iput-object p9, p0, Lnb/d0;->n:Lgg/u;

    .line 19
    .line 20
    iput-object p10, p0, Lnb/d0;->o:Lgg/u;

    .line 21
    .line 22
    iput-object p11, p0, Lnb/d0;->p:Lgg/u;

    .line 23
    .line 24
    iput-object p12, p0, Lnb/d0;->q:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p13, p0, Lnb/d0;->r:Landroid/content/Context;

    .line 27
    .line 28
    iput-object p14, p0, Lnb/d0;->s:Lfg/l;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget-object v3, p0, Lnb/d0;->s:Lfg/l;

    .line 2
    .line 3
    const-string v11, "\u8fde\u63a5\u8d85\u65f6"

    .line 4
    .line 5
    iget-wide v0, p0, Lnb/d0;->h:J

    .line 6
    .line 7
    iget-object v2, p0, Lnb/d0;->r:Landroid/content/Context;

    .line 8
    .line 9
    iget-object v4, p0, Lnb/d0;->l:Lgg/s;

    .line 10
    .line 11
    iget-object v5, p0, Lnb/d0;->i:Lgg/t;

    .line 12
    .line 13
    iget-object v6, p0, Lnb/d0;->n:Lgg/u;

    .line 14
    .line 15
    iget-object v7, p0, Lnb/d0;->o:Lgg/u;

    .line 16
    .line 17
    iget-object v8, p0, Lnb/d0;->p:Lgg/u;

    .line 18
    .line 19
    iget-object v9, p0, Lnb/d0;->q:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v10, p0, Lnb/d0;->g:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v12, p0, Lnb/d0;->k:Ljava/util/ArrayList;

    .line 24
    .line 25
    iget-object v13, p0, Lnb/d0;->m:Ljava/util/List;

    .line 26
    .line 27
    iget-object v14, p0, Lnb/d0;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    .line 29
    invoke-static/range {v0 .. v14}, Lnb/f0;->b(JLandroid/content/Context;Lfg/l;Lgg/s;Lgg/t;Lgg/u;Lgg/u;Lgg/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
