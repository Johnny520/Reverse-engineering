.class public final synthetic Lnb/c0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/speech/tts/TextToSpeech$OnInitListener;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic b:J

.field public final synthetic c:Lgg/t;

.field public final synthetic d:Lgg/u;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/util/ArrayList;

.field public final synthetic i:Lgg/s;

.field public final synthetic j:Ljava/util/List;

.field public final synthetic k:Lgg/u;

.field public final synthetic l:Lgg/u;

.field public final synthetic m:Landroid/content/Context;

.field public final synthetic n:Lfg/l;


# direct methods
.method public synthetic constructor <init>(JLandroid/content/Context;Lfg/l;Lgg/s;Lgg/t;Lgg/u;Lgg/u;Lgg/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    move-object/from16 v0, p15

    .line 5
    .line 6
    iput-object v0, p0, Lnb/c0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    .line 8
    iput-wide p1, p0, Lnb/c0;->b:J

    .line 9
    .line 10
    iput-object p6, p0, Lnb/c0;->c:Lgg/t;

    .line 11
    .line 12
    iput-object p7, p0, Lnb/c0;->d:Lgg/u;

    .line 13
    .line 14
    iput-object p10, p0, Lnb/c0;->e:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p11, p0, Lnb/c0;->f:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p12, p0, Lnb/c0;->g:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p13, p0, Lnb/c0;->h:Ljava/util/ArrayList;

    .line 21
    .line 22
    iput-object p5, p0, Lnb/c0;->i:Lgg/s;

    .line 23
    .line 24
    iput-object p14, p0, Lnb/c0;->j:Ljava/util/List;

    .line 25
    .line 26
    iput-object p8, p0, Lnb/c0;->k:Lgg/u;

    .line 27
    .line 28
    iput-object p9, p0, Lnb/c0;->l:Lgg/u;

    .line 29
    .line 30
    iput-object p3, p0, Lnb/c0;->m:Landroid/content/Context;

    .line 31
    .line 32
    iput-object p4, p0, Lnb/c0;->n:Lfg/l;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final onInit(I)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lnb/f0;->a:Landroid/os/Handler;

    .line 4
    .line 5
    new-instance v2, Lnb/e0;

    .line 6
    .line 7
    iget-object v3, v0, Lnb/c0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    iget-wide v4, v0, Lnb/c0;->b:J

    .line 10
    .line 11
    iget-object v6, v0, Lnb/c0;->c:Lgg/t;

    .line 12
    .line 13
    iget-object v7, v0, Lnb/c0;->d:Lgg/u;

    .line 14
    .line 15
    iget-object v9, v0, Lnb/c0;->e:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v10, v0, Lnb/c0;->f:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v11, v0, Lnb/c0;->g:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v12, v0, Lnb/c0;->h:Ljava/util/ArrayList;

    .line 22
    .line 23
    iget-object v13, v0, Lnb/c0;->i:Lgg/s;

    .line 24
    .line 25
    iget-object v14, v0, Lnb/c0;->j:Ljava/util/List;

    .line 26
    .line 27
    iget-object v15, v0, Lnb/c0;->k:Lgg/u;

    .line 28
    .line 29
    iget-object v8, v0, Lnb/c0;->l:Lgg/u;

    .line 30
    .line 31
    move-object/from16 v16, v2

    .line 32
    .line 33
    iget-object v2, v0, Lnb/c0;->m:Landroid/content/Context;

    .line 34
    .line 35
    move-object/from16 v17, v2

    .line 36
    .line 37
    iget-object v2, v0, Lnb/c0;->n:Lfg/l;

    .line 38
    .line 39
    move-object/from16 v18, v2

    .line 40
    .line 41
    move-object/from16 v2, v16

    .line 42
    .line 43
    move-object/from16 v16, v8

    .line 44
    .line 45
    move/from16 v8, p1

    .line 46
    .line 47
    invoke-direct/range {v2 .. v18}, Lnb/e0;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;JLgg/t;Lgg/u;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lgg/s;Ljava/util/List;Lgg/u;Lgg/u;Landroid/content/Context;Lfg/l;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 51
    .line 52
    .line 53
    return-void
.end method
