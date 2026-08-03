.class public LYue/ۥۣۡۤۥ$ۥ۟;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۡۤۥ;->load(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/String;

.field public final synthetic ۥ۟۟۠ۤ:Ljava/lang/ClassLoader;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۣۡۤۥ;


# direct methods
.method public constructor <init>(LYue/ۥۣۡۤۥ;Ljava/lang/String;Ljava/lang/ClassLoader;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣۡۤۥ$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥۣۡۤۥ;

    iput-object p2, p0, LYue/ۥۣۡۤۥ$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/String;

    iput-object p3, p0, LYue/ۥۣۡۤۥ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/ClassLoader;

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
    sget-object p0, LYue/ۥۣۡۤۥ$ۥ۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, -0x939299e799e0b71L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۥ$ۥ۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥۣۡۤۥ$ۥ۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x3850c2941bb74207L    # 1.970137048760892E-37

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۥ$ۥ۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_3
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

    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    :try_start_0
    iget-object v0, p0, LYue/ۥۣۡۤۥ$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥۣۡۤۥ;

    iget-object v0, v0, LYue/ۥۣۡۤۥ;->ۥ:Landroid/util/SparseArray;

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v1, 0x2

    aget-object p1, p1, v1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥۣۡۤۥ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۣۡۤۥ$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/String;

    iget-object v2, p0, LYue/ۥۣۡۤۥ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/ClassLoader;

    invoke-static {v1, v2}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    invoke-static {p1, v0, v1}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {v0}, LYue/ۥۣۡۤۥ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v0, v1}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v0, 0x3e7

    if-ne p1, v0, :cond_0

    invoke-static {}, Lcom/yuexin/panel/ۥ;->ۥ۟۟ۡ۟()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method
