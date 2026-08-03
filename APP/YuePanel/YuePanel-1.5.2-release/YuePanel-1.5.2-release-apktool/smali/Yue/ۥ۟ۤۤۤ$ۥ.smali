.class public LYue/ۥ۟ۤۤۤ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۤۤۤ;->load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/ClassLoader;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۟ۤۤۤ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۤۤۤ;Ljava/lang/ClassLoader;)V
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

    iput-object p1, p0, LYue/ۥ۟ۤۤۤ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۤۤۤ;

    iput-object p2, p0, LYue/ۥ۟ۤۤۤ$ۥ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥ۟ۤۤۤ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x1fb8e13a92c39dbaL    # 7.248516632059284E-156

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۤۤۤ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥ۟ۤۤۤ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x631580a313e89bb6L    # 2.0287395786440918E169

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۤۤۤ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_3
    return-object p0
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, LYue/ۥ۟ۤۤۤ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۤۤۤ;

    invoke-static {v2}, LYue/ۥ۟ۤۤۤ;->ۥ۟۟(LYue/ۥ۟ۤۤۤ;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    cmp-long v0, v2, v0

    if-ltz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۤۤۤ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۤۤۤ;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, LYue/ۥ۟ۤۤۤ;->ۥ۟۟۟(LYue/ۥ۟ۤۤۤ;J)J

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v2}, LYue/ۥ۟ۤۤۤ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۡۤۤ;->ۥ۟۟ۡ(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-static {v0}, LYue/ۥ۟ۤۤۤ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۡۤۤ;->ۥ۟۟ۡ۟(Ljava/lang/String;)V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-static {}, LYue/ۥۡۡۤۤ;->ۥ۟۟۟ۦ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYue/ۥۣ۠ۧ۟;->ۥ۟۟۟(Ljava/lang/String;)V

    iget-object v1, p0, LYue/ۥ۟ۤۤۤ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۤۤۤ;

    invoke-static {v1, p1}, LYue/ۥ۟ۤۤۤ;->ۥ۟۟۟۟(LYue/ۥ۟ۤۤۤ;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    iget-object p1, p0, LYue/ۥ۟ۤۤۤ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۤۤۤ;

    iget-object v1, p0, LYue/ۥ۟ۤۤۤ$ۥ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    invoke-static {p1, v1, v0}, LYue/ۥ۟ۤۤۤ;->ۥ۟۟۟۠(LYue/ۥ۟ۤۤۤ;Ljava/lang/ClassLoader;Landroid/view/View;)V

    return-void
.end method
