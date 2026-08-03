.class public LYue/ۥ۠ۦۧ۠$ۥ۟;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۦۧ۠;->ۥ۟۟(Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/ClassLoader;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۠ۦۧ۠;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۦۧ۠;Ljava/lang/ClassLoader;)V
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

    iput-object p1, p0, LYue/ۥ۠ۦۧ۠$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۦۧ۠;

    iput-object p2, p0, LYue/ۥ۠ۦۧ۠$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥ۠ۦۧ۠$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x26d003df7e2b9be5L    # 9.690634219433993E-122

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۦۧ۠$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_1
    return-object p0
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۦۧ۠$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۠ۦۧ۠;

    iget-object v1, p0, LYue/ۥ۠ۦۧ۠$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    const/4 v2, 0x0

    invoke-static {v2}, LYue/ۥ۠ۦۧ۠$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, p1, v1, v2}, LYue/ۥ۠ۦۧ۠;->ۥ(LYue/ۥ۠ۦۧ۠;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/ClassLoader;Ljava/lang/String;)V

    return-void
.end method
