.class public final synthetic Lta/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lta/c;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lta/b;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Lo8/j;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Ljava/util/ArrayList;

.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(Lta/c;Ljava/lang/String;Lta/b;Ljava/lang/String;Lo8/j;Ljava/lang/String;Ljava/util/ArrayList;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lta/a;->g:Lta/c;

    .line 5
    .line 6
    iput-object p2, p0, Lta/a;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lta/a;->i:Lta/b;

    .line 9
    .line 10
    iput-object p4, p0, Lta/a;->j:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lta/a;->k:Lo8/j;

    .line 13
    .line 14
    iput-object p6, p0, Lta/a;->l:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lta/a;->m:Ljava/util/ArrayList;

    .line 17
    .line 18
    iput p8, p0, Lta/a;->n:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget-object v0, p0, Lta/a;->g:Lta/c;

    .line 2
    .line 3
    iget-object v8, v0, Lta/c;->a:Ll3/l;

    .line 4
    .line 5
    const-string v9, "hb_reply_enable"

    .line 6
    .line 7
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v10, 0x0

    .line 11
    :try_start_0
    invoke-virtual {v8}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1, v9, v10}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move v1, v10

    .line 21
    :goto_0
    if-nez v1, :cond_0

    .line 22
    .line 23
    const-string v1, "\u81ea\u52a8\u56de\u590d\u8df3\u8fc7: \u5168\u5c40\u5f00\u5173\u5df2\u5173\u95ed"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lta/c;->b(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    iget-object v1, p0, Lta/a;->i:Lta/b;

    .line 30
    .line 31
    iget-object v5, v1, Lta/b;->b:Ljava/lang/String;

    .line 32
    .line 33
    iget-boolean v7, v1, Lta/b;->c:Z

    .line 34
    .line 35
    move-object v2, v1

    .line 36
    iget v1, v2, Lta/b;->a:I

    .line 37
    .line 38
    iget-wide v2, v2, Lta/b;->d:J

    .line 39
    .line 40
    iget-object v4, p0, Lta/a;->h:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v6, p0, Lta/a;->j:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual/range {v0 .. v7}, Lta/c;->g(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    move-object v3, v4

    .line 48
    move-object v4, v6

    .line 49
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    :try_start_1
    invoke-virtual {v8}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {v1, v9, v10}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 60
    :catchall_1
    if-eqz v10, :cond_1

    .line 61
    .line 62
    iget v1, p0, Lta/a;->n:I

    .line 63
    .line 64
    add-int/lit8 v6, v1, 0x1

    .line 65
    .line 66
    iget-object v1, p0, Lta/a;->k:Lo8/j;

    .line 67
    .line 68
    iget-object v2, p0, Lta/a;->l:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v5, p0, Lta/a;->m:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual/range {v0 .. v6}, Lta/c;->e(Lo8/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;I)V

    .line 73
    .line 74
    .line 75
    :cond_1
    return-void
.end method
