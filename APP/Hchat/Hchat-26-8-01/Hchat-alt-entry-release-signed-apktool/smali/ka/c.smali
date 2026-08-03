.class public final synthetic Lka/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lka/f;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:J

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Lka/d;


# direct methods
.method public synthetic constructor <init>(Lka/f;Ljava/lang/String;JLjava/lang/String;Lka/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lka/c;->g:Lka/f;

    .line 5
    .line 6
    iput-object p2, p0, Lka/c;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p3, p0, Lka/c;->i:J

    .line 9
    .line 10
    iput-object p5, p0, Lka/c;->j:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p6, p0, Lka/c;->k:Lka/d;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v1, p0, Lka/c;->g:Lka/f;

    .line 2
    .line 3
    iget-object v2, p0, Lka/c;->h:Ljava/lang/String;

    .line 4
    .line 5
    iget-wide v3, p0, Lka/c;->i:J

    .line 6
    .line 7
    iget-object v5, p0, Lka/c;->j:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v6, p0, Lka/c;->k:Lka/d;

    .line 10
    .line 11
    :try_start_0
    invoke-virtual/range {v1 .. v6}, Lka/f;->d(Ljava/lang/String;JLjava/lang/String;Lka/d;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    new-instance v5, Lsf/f;

    .line 19
    .line 20
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    move-object v0, v5

    .line 24
    :goto_0
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object v1, v1, Lka/f;->a:Lia/t;

    .line 31
    .line 32
    const-string v5, "QQ\u70b9\u6b4c\u5904\u7406\u5f02\u5e38"

    .line 33
    .line 34
    invoke-virtual {v1, v5, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    const-string v0, "\u5904\u7406\u5931\u8d25"

    .line 38
    .line 39
    invoke-static {v3, v4, v2, v0}, Lka/f;->e(JLjava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method
