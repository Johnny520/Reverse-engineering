.class public final Lc0/e;
.super Lde/robv/android/xposed/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lc0/g;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z


# direct methods
.method public constructor <init>(Lc0/g;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Lc0/e;->b:Lc0/g;

    iput-object p2, p0, Lc0/e;->c:Ljava/lang/String;

    iput-boolean p3, p0, Lc0/e;->d:Z

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lde/robv/android/xposed/b;)V
    .locals 4

    iget-object v0, p0, Lc0/e;->b:Lc0/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lc0/g;->j()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-boolean v1, p0, Lc0/e;->d:Z

    :try_start_0
    invoke-static {v0, p1, v1}, Lc0/g;->a(Lc0/g;Lde/robv/android/xposed/b;Z)V

    sget-object v0, LD0/l;->a:LD0/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    move-result-object v0

    :goto_0
    invoke-static {v0}, LD0/g;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    iget-object v1, p0, Lc0/e;->c:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "markAndBlockDelete fail "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc0/g;->r(Ljava/lang/String;)V

    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "BLOCKED "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " + marked"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc0/g;->r(Ljava/lang/String;)V

    sget-object p1, Lcom/abc/core/hooks/ModuleLog;->INSTANCE:Lcom/abc/core/hooks/ModuleLog;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "\u62e6\u622a\u670b\u53cb\u5708\u8bc4\u8bba\u5220\u9664\u5e76\u6807\u8bb0[\u5df2\u5220\u9664]("

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/abc/core/hooks/ModuleLog;->i(Ljava/lang/String;)V

    return-void
.end method
