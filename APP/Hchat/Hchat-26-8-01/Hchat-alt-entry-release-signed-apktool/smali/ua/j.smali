.class public final synthetic Lua/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lua/k;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lk8/o;

.field public final synthetic k:Lua/d;

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:J

.field public final synthetic n:I

.field public final synthetic o:Lna/h;


# direct methods
.method public synthetic constructor <init>(Lua/k;Ljava/lang/String;Ljava/lang/String;Lk8/o;Lua/d;Ljava/util/List;JILna/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lua/j;->g:Lua/k;

    .line 5
    .line 6
    iput-object p2, p0, Lua/j;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lua/j;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lua/j;->j:Lk8/o;

    .line 11
    .line 12
    iput-object p5, p0, Lua/j;->k:Lua/d;

    .line 13
    .line 14
    iput-object p6, p0, Lua/j;->l:Ljava/util/List;

    .line 15
    .line 16
    iput-wide p7, p0, Lua/j;->m:J

    .line 17
    .line 18
    iput p9, p0, Lua/j;->n:I

    .line 19
    .line 20
    iput-object p10, p0, Lua/j;->o:Lna/h;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-object v1, p0, Lua/j;->g:Lua/k;

    .line 2
    .line 3
    iget-object v2, p0, Lua/j;->h:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v3, p0, Lua/j;->i:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v4, p0, Lua/j;->j:Lk8/o;

    .line 8
    .line 9
    iget-object v5, p0, Lua/j;->k:Lua/d;

    .line 10
    .line 11
    iget-wide v7, p0, Lua/j;->m:J

    .line 12
    .line 13
    iget-object v6, p0, Lua/j;->o:Lna/h;

    .line 14
    .line 15
    :try_start_0
    invoke-virtual/range {v1 .. v8}, Lua/k;->c(Ljava/lang/String;Ljava/lang/String;Lk8/o;Lua/d;Lna/h;J)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    new-instance v6, Lsf/f;

    .line 26
    .line 27
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    move-object v0, v6

    .line 31
    :goto_0
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    iget-object v6, v1, Lua/k;->b:Lia/t;

    .line 38
    .line 39
    const-string v9, "\u81ea\u52a8\u6536\u6b3e\u56de\u590d\u5931\u8d25"

    .line 40
    .line 41
    invoke-virtual {v6, v9, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_0
    iget v0, p0, Lua/j;->n:I

    .line 45
    .line 46
    add-int/lit8 v9, v0, 0x1

    .line 47
    .line 48
    iget-object v6, p0, Lua/j;->l:Ljava/util/List;

    .line 49
    .line 50
    invoke-virtual/range {v1 .. v9}, Lua/k;->b(Ljava/lang/String;Ljava/lang/String;Lk8/o;Lua/d;Ljava/util/List;JI)V

    .line 51
    .line 52
    .line 53
    return-void
.end method
