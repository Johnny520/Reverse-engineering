.class public LYue/ۥۣ۟ۢۥ;
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

    const/16 v0, 0x210

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

    sget p1, Lcom/yuexin/panel/R$ۥ۟۟;->ۥ۟۟۟۠:I

    invoke-virtual {p0, p1}, LYue/ۥۣ۟ۢۥ;->ۥ(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/4 v0, 0x4

    invoke-static {v0}, LYue/ۥۣ۟ۢۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p2

    const/4 v0, 0x5

    invoke-static {v0}, LYue/ۥۣ۟ۢۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LYue/ۥۣ۟ۢۥ$ۥ;

    invoke-direct {v1, p0, p1}, LYue/ۥۣ۟ۢۥ$ۥ;-><init>(LYue/ۥۣ۟ۢۥ;Landroid/graphics/drawable/Drawable;)V

    const-class p1, Landroid/graphics/drawable/Drawable;

    filled-new-array {p1, v1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, v0, p1}, LYue/ۥ۠ۤۦۢ;->ۥ۟۟۟(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)LYue/ۥ۠ۤۦۢ$ۥ۟;

    return-void
.end method

.method public native ۥ(I)Landroid/graphics/drawable/Drawable;
.end method
