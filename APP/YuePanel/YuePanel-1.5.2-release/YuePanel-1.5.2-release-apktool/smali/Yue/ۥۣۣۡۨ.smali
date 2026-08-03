.class public LYue/ۥۣۣۡۨ;
.super LYue/ۥ۠ۥ۟;


# static fields
.field public static volatile synthetic ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۠:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x160

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۥ۟;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method


# virtual methods
.method public native info()Lcom/yuexin/panel/myClass/itemInfo;
.end method

.method public load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
    .locals 2

    const/4 p1, 0x4

    invoke-static {p1}, LYue/ۥۣۣۡۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1

    const/4 p2, 0x5

    invoke-static {p2}, LYue/ۥۣۣۡۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p2

    new-instance v0, LYue/ۥۣۣۡۨ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۣۣۡۨ$ۥ;-><init>(LYue/ۥۣۣۡۨ;)V

    const-class v1, Landroid/view/WindowManager$LayoutParams;

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, p2, v0}, LYue/ۥ۠ۤۦۢ;->ۥ۟۟۟(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)LYue/ۥ۠ۤۦۢ$ۥ۟;

    return-void
.end method
