.class public abstract Lf0/Z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static volatile b:Landroid/content/Context;

.field public static volatile c:Ljava/lang/ClassLoader;

.field public static volatile d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lf0/Z;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 14

    const/16 v0, 0x9

    const/16 v1, 0x8

    const/4 v2, 0x7

    const/4 v3, 0x6

    const/4 v4, 0x5

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x4

    sget-object v8, Lf0/Z;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-virtual {v8, v9, v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v8

    if-nez v8, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "features already installed, skip ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lf0/Z;->c(Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object v8, Lf0/Z;->b:Landroid/content/Context;

    if-nez v8, :cond_1

    return-void

    :cond_1
    sget-object v11, Lf0/Z;->c:Ljava/lang/ClassLoader;

    if-nez v11, :cond_2

    return-void

    :cond_2
    sget-object v12, Lf0/Z;->d:Ljava/lang/String;

    const-string v13, "install features via "

    invoke-virtual {v13, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lf0/Z;->c(Ljava/lang/String;)V

    new-instance p0, Lf0/W;

    invoke-direct {p0, v8, v11, v12, v9}, Lf0/W;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    const-string v13, "HideHomeDivider"

    invoke-static {v13, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/W;

    invoke-direct {p0, v8, v11, v12, v10}, Lf0/W;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    const-string v13, "FoldBannerPin"

    invoke-static {v13, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/W;

    invoke-direct {p0, v8, v11, v12, v7}, Lf0/W;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    const-string v13, "BottomTabIcon"

    invoke-static {v13, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/X;

    invoke-direct {p0, v8, v11, v12, v10}, Lf0/X;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    const-string v13, "BottomTabFloating"

    invoke-static {v13, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/X;

    invoke-direct {p0, v8, v11, v12, v6}, Lf0/X;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    const-string v13, "RoundAvatar"

    invoke-static {v13, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/X;

    invoke-direct {p0, v8, v11, v12, v5}, Lf0/X;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    const-string v13, "HomeAvatar"

    invoke-static {v13, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/W;

    invoke-direct {p0, v8, v11, v12, v4}, Lf0/W;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    const-string v13, "ThemeWallpaper"

    invoke-static {v13, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/X;

    invoke-direct {p0, v8, v11, v12, v4}, Lf0/X;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    const-string v4, "AntiRevoke"

    invoke-static {v4, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/X;

    invoke-direct {p0, v8, v11, v12, v3}, Lf0/X;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    const-string v4, "ChatEnhance"

    invoke-static {v4, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/X;

    invoke-direct {p0, v8, v11, v12, v2}, Lf0/X;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    const-string v4, "QuoteDeleteClear"

    invoke-static {v4, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/X;

    invoke-direct {p0, v8, v11, v12, v7}, Lf0/X;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    const-string v4, "EditMessage"

    invoke-static {v4, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/W;

    invoke-direct {p0, v8, v11, v3}, Lf0/W;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;I)V

    const-string v3, "InputStats"

    invoke-static {v3, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/X;

    invoke-direct {p0, v8, v11, v12, v1}, Lf0/X;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    const-string v3, "AntiMomentsDelete"

    invoke-static {v3, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/X;

    invoke-direct {p0, v8, v11, v12, v0}, Lf0/X;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    const-string v3, "AntiMomentsComment"

    invoke-static {v3, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/W;

    invoke-direct {p0, v8, v11, v12, v2}, Lf0/W;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    const-string v2, "MomentsAdBlock"

    invoke-static {v2, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/W;

    invoke-direct {p0, v8, v11, v12, v1}, Lf0/W;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    const-string v1, "ProfileId"

    invoke-static {v1, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/X;

    const/16 v1, 0xa

    invoke-direct {p0, v8, v11, v12, v1}, Lf0/X;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    const-string v1, "RealNameTail"

    invoke-static {v1, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/X;

    const/16 v1, 0xb

    invoke-direct {p0, v8, v11, v12, v1}, Lf0/X;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    const-string v1, "MemberTitle"

    invoke-static {v1, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/W;

    invoke-direct {p0, v8, v11, v12, v0}, Lf0/W;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    const-string v0, "DisableHotUpdate"

    invoke-static {v0, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/X;

    invoke-direct {p0, v8, v11, v12, v9}, Lf0/X;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    const-string v0, "VirtualLocation"

    invoke-static {v0, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/W;

    invoke-direct {p0, v8, v11, v12, v6}, Lf0/W;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    const-string v0, "AutoLoginWin"

    invoke-static {v0, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/s;

    invoke-direct {p0, v10, v11}, Lf0/s;-><init>(ILjava/lang/Object;)V

    const-string v0, "MapPickBridge"

    invoke-static {v0, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    new-instance p0, Lf0/W;

    invoke-direct {p0, v8, v11, v12, v5}, Lf0/W;-><init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;I)V

    const-string v0, "DownloadRedirect"

    invoke-static {v0, p0}, Lf0/Z;->b(Ljava/lang/String;LP0/a;)V

    sget-object p0, Le0/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {}, Le0/c;->f()V

    invoke-static {}, Le0/c;->i()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "features done "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lf0/Z;->c(Ljava/lang/String;)V

    return-void
.end method

.method public static b(Ljava/lang/String;LP0/a;)V
    .locals 6

    sget-object v0, LU/S;->g:Lb0/a;

    if-eqz v0, :cond_4

    invoke-virtual {v0, p0}, Lb0/a;->a(Ljava/lang/String;)Lb0/n;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    sget-object v1, Lb0/m;->c:Lb0/m;

    iget-object v0, v0, Lb0/n;->c:Lb0/m;

    if-eq v0, v1, :cond_1

    goto/16 :goto_1

    :cond_1
    sget-object p1, LU/S;->g:Lb0/a;

    if-eqz p1, :cond_2

    invoke-virtual {p1, p0}, Lb0/a;->a(Ljava/lang/String;)Lb0/n;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p1, Lb0/n;->d:Ljava/lang/String;

    if-nez p1, :cond_3

    :cond_2
    const-string p1, "compat FAIL"

    :cond_3
    sget-object v0, Le0/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v0, "\u4e0d\u9002\u914d: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u529f\u80fd\u8df3\u8fc7: "

    const-string v2, "reason"

    invoke-static {v0, v2}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Le0/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v3, Le0/a;

    sget-object v4, Le0/b;->c:Le0/b;

    invoke-direct {v3, p0, v4, v0}, Le0/a;-><init>(Ljava/lang/String;Le0/b;Ljava/lang/String;)V

    invoke-virtual {v2, p0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "SKIP "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ")"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Le0/c;->j(Ljava/lang/String;)V

    :try_start_0
    sget-object v2, Lcom/abc/core/hooks/ModuleLog;->INSTANCE:Lcom/abc/core/hooks/ModuleLog;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " \u00b7 "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/abc/core/hooks/ModuleLog;->w(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "skip "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lf0/Z;->c(Ljava/lang/String;)V

    return-void

    :cond_4
    :goto_1
    sget-object v0, Le0/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p0, p1}, Le0/c;->b(Ljava/lang/String;LP0/a;)V

    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 2

    const-string v0, "[OKK-FeatureGate] "

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lde/robv/android/xposed/d;->d(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_0
    return-void
.end method
