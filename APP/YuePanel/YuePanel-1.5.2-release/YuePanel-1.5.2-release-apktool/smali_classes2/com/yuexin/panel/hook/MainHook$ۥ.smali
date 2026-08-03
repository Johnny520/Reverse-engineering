.class public Lcom/yuexin/panel/hook/MainHook$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yuexin/panel/hook/MainHook;->handleLoadPackage(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public ۥۣ۟۟۠:Z

.field public final synthetic ۥ۟۟۠ۤ:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

.field public final synthetic ۥ۟۟۠ۥ:Lcom/yuexin/panel/hook/MainHook;


# direct methods
.method public constructor <init>(Lcom/yuexin/panel/hook/MainHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            null,
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/yuexin/panel/hook/MainHook$ۥ;->ۥ۟۟۠ۥ:Lcom/yuexin/panel/hook/MainHook;

    iput-object p2, p0, Lcom/yuexin/panel/hook/MainHook$ۥ;->ۥ۟۟۠ۤ:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 1

    iget-boolean v0, p0, Lcom/yuexin/panel/hook/MainHook$ۥ;->ۥۣ۟۟۠:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/yuexin/panel/hook/MainHook$ۥ;->ۥۣ۟۟۠:Z

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    check-cast p1, Landroid/content/Context;

    invoke-static {}, Lcom/yuexin/panel/hook/MainHook;->ۥ()V

    iget-object p1, p0, Lcom/yuexin/panel/hook/MainHook$ۥ;->ۥ۟۟۠ۤ:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {p1}, Lcom/yuexin/panel/hook/MainHook;->ۥ۟(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    return-void
.end method
