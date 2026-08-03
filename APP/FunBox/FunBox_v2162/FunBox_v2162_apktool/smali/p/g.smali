.class final Lp/g;
.super Lfun/box001/shared/hook/XHooker$HookParam;
.source "SourceFile"


# instance fields
.field final synthetic a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

.field final synthetic b:Lp/h;


# direct methods
.method constructor <init>(Lp/h;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 0

    iput-object p1, p0, Lp/g;->b:Lp/h;

    iput-object p2, p0, Lp/g;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-direct {p0}, Lfun/box001/shared/hook/XHooker$HookParam;-><init>()V

    return-void
.end method


# virtual methods
.method public final getResult()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp/g;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-virtual {v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getThrowable()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lp/g;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-virtual {v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getThrowable()Ljava/lang/Throwable;

    move-result-object v0

    return-object v0
.end method

.method public final setResult(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lp/g;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-virtual {v0, p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    return-void
.end method

.method public final setThrowable(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lp/g;->a:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-virtual {v0, p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setThrowable(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final unhook()V
    .locals 1

    iget-object v0, p0, Lp/g;->b:Lp/h;

    iget-object v0, v0, Lp/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lde/robv/android/xposed/XC_MethodHook$Unhook;

    invoke-virtual {v0}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V

    return-void
.end method
