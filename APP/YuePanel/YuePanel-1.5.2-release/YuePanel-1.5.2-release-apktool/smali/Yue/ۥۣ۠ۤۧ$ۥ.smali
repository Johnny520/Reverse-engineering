.class public LYue/ۥۣ۠ۤۧ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۠ۤۧ;->ۥ۟۟۟ۧ(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣ۠ۤۧ;


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۤۧ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣ۠ۤۧ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۤۧ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    check-cast v1, Landroid/view/MotionEvent;

    invoke-static {v1}, LYue/ۥۣ۠ۤۧ;->ۥ۟۟۟ۢ(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    invoke-static {v0}, LYue/ۥۣ۠ۤۧ;->ۥۣ۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, LYue/ۥۣ۠ۤۧ;->ۥ۟۟۟ۤ(Landroid/view/View;)Landroid/view/View;

    return-void
.end method
