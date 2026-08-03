.class public LYue/ۥۣۡۤۥ$ۥ;
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
.field public static volatile synthetic ۥ۟۟۠ۨ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/String;

.field public final synthetic ۥ۟۟۠ۤ:Ljava/lang/ClassLoader;

.field public final synthetic ۥ۟۟۠ۥ:[I

.field public final synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public final synthetic ۥ۟۟۠ۧ:LYue/ۥۣۡۤۥ;


# direct methods
.method public constructor <init>(LYue/ۥۣۡۤۥ;Ljava/lang/String;Ljava/lang/ClassLoader;[ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010,
            0x1010,
            0x1010
        }
        names = {
            null,
            null,
            null,
            null,
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣۡۤۥ$ۥ;->ۥ۟۟۠ۧ:LYue/ۥۣۡۤۥ;

    iput-object p2, p0, LYue/ۥۣۡۤۥ$ۥ;->ۥۣ۟۟۠:Ljava/lang/String;

    iput-object p3, p0, LYue/ۥۣۡۤۥ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/ClassLoader;

    iput-object p4, p0, LYue/ۥۣۡۤۥ$ۥ;->ۥ۟۟۠ۥ:[I

    iput-object p5, p0, LYue/ۥۣۡۤۥ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥۣۡۤۥ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, -0x1823c1812f4eadd1L    # -2.0134708111739172E192

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۥ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_1
    return-object p0
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۤۥ$ۥ;->ۥۣ۟۟۠:Ljava/lang/String;

    iget-object v1, p0, LYue/ۥۣۡۤۥ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/ClassLoader;

    const/4 v2, 0x0

    invoke-static {v2}, LYue/ۥۣۡۤۥ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    new-instance v4, LYue/ۥۣۡۤۥ$ۥ$ۥ;

    invoke-direct {v4, p0, p1}, LYue/ۥۣۡۤۥ$ۥ$ۥ;-><init>(LYue/ۥۣۡۤۥ$ۥ;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    const-class p1, Landroid/view/View;

    const-class v5, Landroid/view/ViewGroup;

    filled-new-array {v3, p1, v5, v4}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, v1, v2, p1}, LYue/ۥ۠ۤۦۢ;->ۥ۟۟۟۟(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;[Ljava/lang/Object;)LYue/ۥ۠ۤۦۢ$ۥ۟;

    return-void
.end method
