.class public LYue/ۥ۠ۦۨۢ;
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

    const/16 v0, 0x23f

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

.method public static synthetic ۥ(LYue/ۥ۠ۦۨۢ;Landroid/view/KeyEvent;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۦۨۢ;->ۥ۟(Landroid/view/KeyEvent;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    return-void
.end method


# virtual methods
.method public native info()Lcom/yuexin/panel/myClass/itemInfo;
.end method

.method public native load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end method

.method public final ۥ۟(Landroid/view/KeyEvent;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    invoke-static {p2}, LYue/ۥۣ۠ۧ۟;->ۥ۟۟۟ۡ(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    :cond_0
    return-void
.end method
