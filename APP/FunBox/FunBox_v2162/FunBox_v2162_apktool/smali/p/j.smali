.class final Lp/j;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/util/concurrent/atomic/AtomicReference;

.field final synthetic b:Lfun/box001/shared/hook/XHooker$HookCallback;


# direct methods
.method constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Lfun/box001/shared/hook/XHooker$HookCallback;)V
    .locals 0

    iput-object p1, p0, Lp/j;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p2, p0, Lp/j;->b:Lfun/box001/shared/hook/XHooker$HookCallback;

    const/16 p1, 0x2710

    invoke-direct {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 2

    new-instance v0, Lp/i;

    invoke-direct {v0, p0, p1}, Lp/i;-><init>(Lp/j;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    iput-object v1, v0, Lfun/box001/shared/hook/XHooker$HookParam;->method:Ljava/lang/reflect/Member;

    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    iput-object v1, v0, Lfun/box001/shared/hook/XHooker$HookParam;->obj:Ljava/lang/Object;

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    iput-object p1, v0, Lfun/box001/shared/hook/XHooker$HookParam;->args:[Ljava/lang/Object;

    :try_start_0
    iget-object p1, p0, Lp/j;->b:Lfun/box001/shared/hook/XHooker$HookCallback;

    invoke-interface {p1, v0}, Lfun/box001/shared/hook/XHooker$HookCallback;->onInvoke(Lfun/box001/shared/hook/XHooker$HookParam;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[FunBox]"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
