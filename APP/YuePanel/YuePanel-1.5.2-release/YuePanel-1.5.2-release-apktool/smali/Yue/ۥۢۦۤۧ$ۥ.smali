.class public LYue/ۥۢۦۤۧ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۦۤۧ;->ۥ۟۟۟۟()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥۣ۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥۢۦۤۧ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, -0x6572fd52e13a2316L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۢۦۤۧ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥۢۦۤۧ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, -0x1befdbb1a5bf380aL    # -9.980907402150299E173

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۢۦۤۧ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥۢۦۤۧ$ۥ;->ۥۣ۟۟۠:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, -0x4026ecc6168d9b0bL    # -0.39179847524208294

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۢۦۤۧ$ۥ;->ۥۣ۟۟۠:Ljava/lang/String;

    :cond_5
    return-object p0
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    sget-object p1, LYue/ۥۢۦۤۧ;->ۥ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    invoke-static {p1}, LYue/ۥۢۦۤۧ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠ۨۡۢ;->ۥ(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-static {v1}, LYue/ۥۢۦۤۧ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۨۡۢ;->ۥ(Ljava/lang/String;)V

    invoke-static {}, LYue/ۥۢۦۤۧ;->ۥ()V

    invoke-static {}, LYue/ۥۣۣۢۧ;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۡۤۤ;->ۥ۟۟۠ۧ(Ljava/lang/String;)V

    invoke-static {}, LYue/ۥۣۣۢۧ;->ۥ۟()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۡۤۤ;->ۥ۟۟۠ۦ(Ljava/lang/String;)V

    invoke-static {}, LYue/ۥۣۣۢۧ;->ۥ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۡۤۤ;->ۥ۟۟۠ۢ(Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥ۟ۦۦۨ;->ۥۣ۟۟۟(Ljava/util/List;)V

    invoke-static {p1}, LYue/ۥ۠۟۟ۥ;->ۥ۟۟۟ۢ(Ljava/util/List;)V

    invoke-static {v1}, Lcom/yuexin/panel/ۥ;->ۥ۟۟۠(Z)V

    invoke-static {}, LYue/ۥۡۢۢۥ;->ۥ۟۟۟()Z

    invoke-static {}, LYue/ۥ۟ۡۤۧ;->ۥ()V

    const/4 p1, 0x2

    invoke-static {p1}, LYue/ۥۢۦۤۧ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠ۨۡۢ;->ۥ(Ljava/lang/String;)V

    return-void
.end method
