.class public LYue/ۥۢ۠ۧۢ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢ۠ۧۢ;->load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۢ۠ۧۢ;


# direct methods
.method public constructor <init>(LYue/ۥۢ۠ۧۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۢ۠ۧۢ$ۥ;->ۥۣ۟۟۠:LYue/ۥۢ۠ۧۢ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, LYue/ۥۢ۠ۧۢ$ۥ۟۟;

    invoke-direct {v1}, LYue/ۥۢ۠ۧۢ$ۥ۟۟;-><init>()V

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    iput-object p1, v1, LYue/ۥۢ۠ۧۢ$ۥ۟۟;->ۥ۟:Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, LYue/ۥۢ۠ۧۢ$ۥ۟۟;->ۥ:J

    sget-object p1, LYue/ۥ۟ۦۣۨ;->ۥۣ۟۟۟:Ljava/util/Map;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LYue/ۥۢ۠ۧۢ;->ۥ()V

    return-void
.end method
