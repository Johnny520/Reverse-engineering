.class public final Lp;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/ClassLoader;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/io/File;

.field public final synthetic d:Ljava/io/File;

.field public final synthetic e:J

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:J

.field public final synthetic h:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/io/File;Ljava/io/File;JLjava/lang/String;JLandroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp;->a:Ljava/lang/ClassLoader;

    .line 5
    .line 6
    iput-object p2, p0, Lp;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lp;->c:Ljava/io/File;

    .line 9
    .line 10
    iput-object p4, p0, Lp;->d:Ljava/io/File;

    .line 11
    .line 12
    iput-wide p5, p0, Lp;->e:J

    .line 13
    .line 14
    iput-object p7, p0, Lp;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput-wide p8, p0, Lp;->g:J

    .line 17
    .line 18
    iput-object p10, p0, Lp;->h:Landroid/app/Activity;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    const-string v0, "album video bubble send dispatched duration_ms="

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lp;->a:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    iget-object v2, p0, Lp;->b:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Lp;->c:Ljava/io/File;

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, p0, Lp;->d:Ljava/io/File;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    iget-wide v5, p0, Lp;->e:J

    .line 20
    .line 21
    iget-object v7, p0, Lp;->f:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static/range {v1 .. v7}, Ls;->a(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-wide v2, p0, Lp;->e:J

    .line 32
    .line 33
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v0, " bytes="

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-wide v2, p0, Lp;->g:J

    .line 42
    .line 43
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    const-string v1, "album-video-bubble"

    .line 56
    .line 57
    const-string v2, "dispatch"

    .line 58
    .line 59
    invoke-static {v1, v2, v0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, Lp;->h:Landroid/app/Activity;

    .line 63
    .line 64
    const-string v0, "\u89c6\u9891\u6ce1\u6ce1\u53d1\u9001\u5931\u8d25"

    .line 65
    .line 66
    invoke-static {p0, v0}, Ls;->i(Landroid/app/Activity;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method
