.class public final synthetic LYue/ۥۡۨۥۢ;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡۨۥۥ$ۥ;

.field public final synthetic ۥ۟۟۠ۤ:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;


# direct methods
.method public synthetic constructor <init>(LYue/ۥۡۨۥۥ$ۥ;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۨۥۢ;->ۥۣ۟۟۠:LYue/ۥۡۨۥۥ$ۥ;

    iput-object p2, p0, LYue/ۥۡۨۥۢ;->ۥ۟۟۠ۤ:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LYue/ۥۡۨۥۢ;->ۥۣ۟۟۠:LYue/ۥۡۨۥۥ$ۥ;

    iget-object v1, p0, LYue/ۥۡۨۥۢ;->ۥ۟۟۠ۤ:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-static {v0, v1}, LYue/ۥۡۨۥۥ$ۥ;->ۥ(LYue/ۥۡۨۥۥ$ۥ;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    return-void
.end method
