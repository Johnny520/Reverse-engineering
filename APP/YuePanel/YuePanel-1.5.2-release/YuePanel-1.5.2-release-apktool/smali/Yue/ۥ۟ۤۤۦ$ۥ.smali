.class public LYue/ۥ۟ۤۤۦ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۤۤۦ;->load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟ۤۤۦ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۤۤۦ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۤۤۦ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۤۦ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥ۟ۤۤۦ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x1fb8e13a92c39dbaL    # 7.248516632059284E-156

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۤۤۦ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_1
    return-object p0
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, LYue/ۥ۟ۤۤۦ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۤۦ;

    invoke-static {v2}, LYue/ۥ۟ۤۤۦ;->ۥ(LYue/ۥ۟ۤۤۦ;)J

    move-result-wide v2

    const-wide/16 v4, 0x1f4

    add-long/2addr v2, v4

    cmp-long v2, v2, v0

    if-lez v2, :cond_0

    return-void

    :cond_0
    iget-object v2, p0, LYue/ۥ۟ۤۤۦ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۤۦ;

    invoke-static {v2, v0, v1}, LYue/ۥ۟ۤۤۦ;->ۥ۟(LYue/ۥ۟ۤۤۦ;J)J

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, LYue/ۥۡۡۤۤ;->ۥ۟۟ۡ(Ljava/lang/String;)V

    invoke-static {v0}, LYue/ۥ۟ۤۤۦ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۡۡۤۤ;->ۥ۟۟ۡ۟(Ljava/lang/String;)V

    return-void
.end method
