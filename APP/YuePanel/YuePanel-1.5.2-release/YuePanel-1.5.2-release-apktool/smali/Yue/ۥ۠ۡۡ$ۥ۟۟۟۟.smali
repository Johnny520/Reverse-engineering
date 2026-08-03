.class public LYue/ۥ۠ۡۡ$ۥ۟۟۟۟;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۡۡ;->ۥ۟۟۠۟(Ljava/lang/ClassLoader;LYue/ۥ۟ۤۧ۠;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۠ۡۡ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۡۡ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۡۡ$ۥ۟۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۡۡ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 1

    invoke-static {}, LYue/ۥ۠ۡۢۡ;->ۥ۟۟۟ۤ()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    invoke-static {p1}, LYue/ۥ۠ۡۢۡ;->ۥ۟۟ۡ۟(Ljava/lang/Object;)V

    return-void
.end method
