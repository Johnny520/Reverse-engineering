.class public LYue/ۥۣ۟ۢۧ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟ۢۧ;->load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۨ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/String;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۧ;


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۢۧ;Ljava/lang/String;)V
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

    iput-object p1, p0, LYue/ۥۣ۟ۢۧ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣ۟ۢۧ;

    iput-object p2, p0, LYue/ۥۣ۟ۢۧ$ۥ;->ۥۣ۟۟۠:Ljava/lang/String;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_6

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥۣ۟ۢۧ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, -0x15a760901c946688L    # -1.929987664510031E204

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣ۟ۢۧ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥۣ۟ۢۧ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0xf2d57416dbcfd08L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣ۟ۢۧ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥۣ۟ۢۧ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, -0x7a3fd08959e91d1aL    # -5.572853204560614E-281

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣ۟ۢۧ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_5
    return-object p0

    :cond_6
    sget-object p0, LYue/ۥۣ۟ۢۧ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, -0x17f60b246111a09bL    # -1.4803110133405302E193

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣ۟ۢۧ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_7
    return-object p0
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 3

    :try_start_0
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v1}, LYue/ۥۣ۟ۢۧ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۣ۟ۢۧ$ۥ;->ۥۣ۟۟۠:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-static {v0}, LYue/ۥۣ۟ۢۧ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x2

    invoke-static {v2}, LYue/ۥۣ۟ۢۧ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LYue/ۥۣ۟ۢۧ$ۥ;->ۥۣ۟۟۠:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x3

    invoke-static {v2}, LYue/ۥۣ۟ۢۧ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, LYue/ۥۣ۟ۢۧ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method
