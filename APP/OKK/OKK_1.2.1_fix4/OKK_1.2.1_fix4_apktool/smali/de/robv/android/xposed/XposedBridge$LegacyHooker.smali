.class final Lde/robv/android/xposed/XposedBridge$LegacyHooker;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/github/libxposed/api/XposedInterface$Hooker;


# annotations
.annotation build La/a;
.end annotation


# instance fields
.field private final callback:Lde/robv/android/xposed/c;

.field private final executable:Ljava/lang/reflect/Executable;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Executable;Lde/robv/android/xposed/c;)V
    .locals 1

    const-string v0, "executable"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde/robv/android/xposed/XposedBridge$LegacyHooker;->executable:Ljava/lang/reflect/Executable;

    iput-object p2, p0, Lde/robv/android/xposed/XposedBridge$LegacyHooker;->callback:Lde/robv/android/xposed/c;

    return-void
.end method


# virtual methods
.method public intercept(Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 3
    .annotation build La/a;
    .end annotation

    const-string v0, "chain"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lde/robv/android/xposed/b;

    invoke-direct {v0}, Lde/robv/android/xposed/b;-><init>()V

    iget-object v1, p0, Lde/robv/android/xposed/XposedBridge$LegacyHooker;->executable:Ljava/lang/reflect/Executable;

    iput-object v1, v0, Lde/robv/android/xposed/b;->a:Ljava/lang/reflect/Executable;

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    move-result-object v1

    const-string v2, "getArgs(...)"

    invoke-static {v1, v2}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    :try_start_0
    iget-object v1, p0, Lde/robv/android/xposed/XposedBridge$LegacyHooker;->callback:Lde/robv/android/xposed/c;

    invoke-virtual {v1, v0}, Lde/robv/android/xposed/c;->d(Lde/robv/android/xposed/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lde/robv/android/xposed/d;->e(Ljava/lang/Throwable;)V

    :goto_0
    iget-boolean v1, v0, Lde/robv/android/xposed/b;->d:Z

    if-nez v1, :cond_0

    :try_start_1
    iget-object v1, v0, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-interface {p1, v1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lde/robv/android/xposed/b;->d(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    invoke-virtual {v0, p1}, Lde/robv/android/xposed/b;->e(Ljava/lang/Throwable;)V

    :cond_0
    :goto_1
    :try_start_2
    iget-object p1, p0, Lde/robv/android/xposed/XposedBridge$LegacyHooker;->callback:Lde/robv/android/xposed/c;

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/c;->c(Lde/robv/android/xposed/b;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p1

    invoke-static {p1}, Lde/robv/android/xposed/d;->e(Ljava/lang/Throwable;)V

    :goto_2
    invoke-virtual {v0}, Lde/robv/android/xposed/b;->b()Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-virtual {v0}, Lde/robv/android/xposed/b;->a()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    throw p1
.end method
