.class public final synthetic Lqc0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Z

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Llf1;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Landroid/content/Context;

.field public final synthetic n:Z

.field public final synthetic o:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Llf1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;ZLjava/util/List;)V
    .locals 1

    .line 1
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-boolean p1, p0, Lqc0;->d:Z

    .line 7
    .line 8
    iput-object p2, p0, Lqc0;->e:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p3, p0, Lqc0;->f:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p4, p0, Lqc0;->g:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p5, p0, Lqc0;->h:Llf1;

    .line 15
    .line 16
    iput-object p6, p0, Lqc0;->i:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p7, p0, Lqc0;->j:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p8, p0, Lqc0;->k:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p9, p0, Lqc0;->l:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p10, p0, Lqc0;->m:Landroid/content/Context;

    .line 25
    .line 26
    iput-boolean p11, p0, Lqc0;->n:Z

    .line 27
    .line 28
    iput-object p12, p0, Lqc0;->o:Ljava/util/List;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 4
    .line 5
    move-object/from16 v14, p1

    .line 6
    .line 7
    check-cast v14, Lji;

    .line 8
    .line 9
    move-object/from16 v1, p2

    .line 10
    .line 11
    check-cast v1, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v15

    .line 17
    iget-boolean v2, v0, Lqc0;->d:Z

    .line 18
    .line 19
    iget-object v3, v0, Lqc0;->e:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, v0, Lqc0;->f:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v5, v0, Lqc0;->g:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v6, v0, Lqc0;->h:Llf1;

    .line 26
    .line 27
    iget-object v7, v0, Lqc0;->i:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v8, v0, Lqc0;->j:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v9, v0, Lqc0;->k:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v10, v0, Lqc0;->l:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v11, v0, Lqc0;->m:Landroid/content/Context;

    .line 36
    .line 37
    iget-boolean v12, v0, Lqc0;->n:Z

    .line 38
    .line 39
    iget-object v13, v0, Lqc0;->o:Ljava/util/List;

    .line 40
    .line 41
    invoke-static/range {v2 .. v15}, Lzc0;->c(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Llf1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;ZLjava/util/List;Lji;I)Lna1;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method
