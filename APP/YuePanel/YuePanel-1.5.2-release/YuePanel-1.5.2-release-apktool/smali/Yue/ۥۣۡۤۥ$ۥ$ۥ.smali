.class public LYue/ۥۣۡۤۥ$ۥ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۡۤۥ$ۥ;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۣۡۤۥ$ۥ;


# direct methods
.method public constructor <init>(LYue/ۥۣۡۤۥ$ۥ;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
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

    iput-object p1, p0, LYue/ۥۣۡۤۥ$ۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۤۥ$ۥ;

    iput-object p2, p0, LYue/ۥۣۡۤۥ$ۥ$ۥ;->ۥۣ۟۟۠:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

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
    sget-object p0, LYue/ۥۣۡۤۥ$ۥ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x631580a313e89bb6L    # 2.0287395786440918E169

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۥ$ۥ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥۣۡۤۥ$ۥ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x62fc047257d86dfbL    # 6.608531289584401E168

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۥ$ۥ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥۣۡۤۥ$ۥ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, 0x4f027e067fb846d3L    # 4.084130301981824E72

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۥ$ۥ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_5
    return-object p0
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const-class v0, Ljava/lang/String;

    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    :try_start_0
    iget-object p1, p0, LYue/ۥۣۡۤۥ$ۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۤۥ$ۥ;

    iget-object v1, p1, LYue/ۥۣۡۤۥ$ۥ;->ۥ۟۟۠ۥ:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, LYue/ۥۣۡۤۥ$ۥ$ۥ;->ۥۣ۟۟۠:Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object v1, v1, v2

    iget-object p1, p1, LYue/ۥۣۡۤۥ$ۥ;->ۥ۟۟۠ۧ:LYue/ۥۣۡۤۥ;

    invoke-static {v2}, LYue/ۥۣۡۤۥ$ۥ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    const-class v4, Landroid/util/SparseArray;

    invoke-static {v1, v3, v4}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/SparseArray;

    iput-object v1, p1, LYue/ۥۣۡۤۥ;->ۥ:Landroid/util/SparseArray;

    iget-object p1, p0, LYue/ۥۣۡۤۥ$ۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۤۥ$ۥ;

    iget-object p1, p1, LYue/ۥۣۡۤۥ$ۥ;->ۥ۟۟۠ۧ:LYue/ۥۣۡۤۥ;

    iget-object p1, p1, LYue/ۥۣۡۤۥ;->ۥ:Landroid/util/SparseArray;

    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    iget-object v1, p0, LYue/ۥۣۡۤۥ$ۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۤۥ$ۥ;

    iget-object v3, v1, LYue/ۥۣۡۤۥ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    iget-object v1, v1, LYue/ۥۣۡۤۥ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/ClassLoader;

    invoke-static {v3, v1}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v3, v0, v0, v3, v3}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    const/16 v3, 0x3e7

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v4}, LYue/ۥۣۡۤۥ$ۥ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    invoke-static {v6}, LYue/ۥۣۡۤۥ$ۥ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v6

    sget v7, Lcom/yuexin/panel/R$ۥ۟۟;->ۥ۟۟:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v3, v5, v6, v7, v8}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LYue/ۥۣۡۤۥ$ۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۤۥ$ۥ;

    iget-object v0, v0, LYue/ۥۣۡۤۥ$ۥ;->ۥ۟۟۠ۧ:LYue/ۥۣۡۤۥ;

    iget-object v0, v0, LYue/ۥۣۡۤۥ;->ۥ:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    iget-object p1, p0, LYue/ۥۣۡۤۥ$ۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣۡۤۥ$ۥ;

    iget-object p1, p1, LYue/ۥۣۡۤۥ$ۥ;->ۥ۟۟۠ۥ:[I

    aget v0, p1, v2

    add-int/2addr v0, v4

    aput v0, p1, v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
