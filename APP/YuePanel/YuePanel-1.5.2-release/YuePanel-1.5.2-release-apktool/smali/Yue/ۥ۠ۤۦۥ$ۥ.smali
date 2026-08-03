.class public LYue/ۥ۠ۤۦۥ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۤۦۥ;->load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۠ۤۦۥ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۤۦۥ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۤۦۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۤۦۥ;

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
    sget-object p0, LYue/ۥ۠ۤۦۥ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x5a17345e7b556e01L    # 9.817291075397724E125

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۤۦۥ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥ۠ۤۦۥ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, -0x2a344e0461f5e9f0L    # -1.9849689847684825E105

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۤۦۥ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥ۠ۤۦۥ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, 0x798a677b7872a574L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۤۦۥ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_5
    return-object p0

    :cond_6
    sget-object p0, LYue/ۥ۠ۤۦۥ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, -0x3a4f19d72a7511dfL    # -5.230005929479664E27

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۤۦۥ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_7
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

    const/4 v0, 0x1

    :try_start_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p1, v3

    instance-of v5, v4, [Ljava/lang/String;

    if-eqz v5, :cond_0

    check-cast v4, [Ljava/lang/String;

    aget-object p1, v4, v2

    invoke-static {v2}, LYue/ۥ۠ۤۦۥ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, LYue/ۥ۠ۤۦۥ;->ۥ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, LYue/ۥ۠ۤۦۥ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, LYue/ۥ۠ۤۦۥ;->ۥ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz v1, :cond_1

    if-eqz p1, :cond_1

    const/4 v2, 0x2

    invoke-static {v2}, LYue/ۥ۠ۤۦۥ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, LYue/ۥ۟ۦۣۨ;->ۥ۟۟۟ۢ:Ljava/util/HashMap;

    const/4 v3, 0x3

    invoke-static {v3}, LYue/ۥ۠ۤۦۥ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, LYue/ۥۡۢ۟ۡ;->ۥۣ۟۟۟(Ljava/lang/String;I)V

    :cond_1
    :goto_2
    return-void
.end method
