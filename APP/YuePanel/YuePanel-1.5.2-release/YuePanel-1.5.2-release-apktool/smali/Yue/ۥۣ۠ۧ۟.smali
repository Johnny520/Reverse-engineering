.class public LYue/ۥۣ۠ۧ۟;
.super Ljava/lang/Object;


# static fields
.field public static ۥ:LYue/ۥ۟ۡۥۡ;

.field public static final ۥ۟:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field public static volatile synthetic ۥ۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۠:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x3b8

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, LYue/ۥۣ۠ۧ۟;->ۥ۟:Ljava/util/HashMap;

    const/16 v1, 0x208

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, LYue/ۥۣۣۢۢ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget v1, LYue/ۥ۠ۧۦۢ;->ۥ۟۟۟:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, LYue/ۥ۠ۧۦۢ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0x1bf52

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, Lcom/yuexin/panel/hook/dy/utils/VideoReplace;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v1, 0xa9b639

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-class v2, LYue/ۥ۟ۥۥۦ;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ(ILandroid/content/Intent;Ljava/util/List;I)V
.end method

.method public static native ۥ۟(Ljava/lang/String;)V
.end method

.method public static native ۥ۟۟(Landroid/view/View;)V
.end method

.method public static native ۥ۟۟۟(Ljava/lang/String;)V
.end method

.method public static native synthetic ۥ۟۟۟۟(ILandroid/content/Intent;Ljava/util/List;I)V
.end method

.method public static native ۥ۟۟۟۠(Landroid/content/Intent;II)V
.end method

.method public static ۥ۟۟۟ۡ(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 0

    return-void
.end method

.method public static native ۥ۟۟۟ۢ(Ljava/lang/String;)V
.end method
