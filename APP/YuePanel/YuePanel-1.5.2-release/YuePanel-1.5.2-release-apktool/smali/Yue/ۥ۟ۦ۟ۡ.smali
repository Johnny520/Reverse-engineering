.class public LYue/ۥ۟ۦ۟ۡ;
.super LYue/ۥ۠ۥ۟;


# static fields
.field public static final ۥ:[Ljava/lang/String;

.field public static volatile synthetic ۥ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠۠:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x27b

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    const/16 v0, 0xe

    invoke-static {v0}, LYue/ۥ۟ۦ۟ۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xf

    invoke-static {v1}, LYue/ۥ۟ۦ۟ۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۦ۟ۡ;->ۥ:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۥ۟;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ(Lcom/kongzue/dialogx/dialogs/BottomMenu;Ljava/lang/CharSequence;I)Z
.end method

.method public static native synthetic ۥ۟(Lcom/kongzue/dialogx/dialogs/BottomMenu;Ljava/lang/CharSequence;I)Z
.end method

.method public static ۥ۟۟(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/ClassLoader;)V
    .locals 1

    invoke-static {}, LYue/ۥۡۡۤۤ;->ۥ۟()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p0, :cond_1

    iget-object p0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    if-eqz p0, :cond_1

    array-length v0, p0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    aget-object p0, p0, v0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    invoke-static {p0, p1}, LYue/ۥ۟ۦ۟ۡ;->ۥ۟۟۟(Ljava/lang/Object;Ljava/lang/ClassLoader;)V

    return-void
.end method

.method public static ۥ۟۟۟(Ljava/lang/Object;Ljava/lang/ClassLoader;)V
    .locals 9

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v2, 0x5

    invoke-static {v2}, LYue/ۥ۟ۦ۟ۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟۟۟(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x6

    invoke-static {v3}, LYue/ۥ۟ۦ۟ۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-class v3, Ljava/lang/CharSequence;

    invoke-static {v1, v3, v0}, LYue/ۥ۠ۡۧۤ;->ۥ(Ljava/lang/Class;Ljava/lang/Class;I)Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Field;

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {p0, v3}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {p0}, LYue/ۥ۟ۥۨۦ;->ۥ(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    return-void

    :cond_1
    const/4 v6, 0x2

    invoke-static {v6}, LYue/ۥ۟ۦ۟ۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_2

    return-void

    :cond_2
    if-ne v2, v0, :cond_3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v7, 0x7

    invoke-static {v7}, LYue/ۥ۟ۦ۟ۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {p0, v3, v5}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟ۦ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto/16 :goto_3

    :cond_3
    :goto_0
    if-eqz v5, :cond_8

    const-class v3, Ljava/util/List;

    const/16 v6, 0x11

    invoke-static {v1, v3, v6}, LYue/ۥ۠ۡۧۤ;->ۥ(Ljava/lang/Class;Ljava/lang/Class;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Field;

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/16 v3, 0x9

    const/16 v6, 0xa

    const/16 v7, 0x8

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    if-nez v2, :cond_4

    invoke-static {v7}, LYue/ۥ۟ۦ۟ۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {p1, v1, v8}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟ۦ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v3}, LYue/ۥ۟ۦ۟ۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {p1, v1, v8}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟ۦ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, LYue/ۥ۟ۦ۟ۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {p1, v1, v8}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟ۦ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_4
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    if-nez v2, :cond_6

    invoke-static {v6}, LYue/ۥ۟ۦ۟ۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {p1, v1, v8}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟ۦ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v7}, LYue/ۥ۟ۦ۟ۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {p1, v1, v8}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟ۦ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    if-ne v2, v0, :cond_7

    invoke-static {v6}, LYue/ۥ۟ۦ۟ۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {p1, v1, v8}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟ۦ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v7}, LYue/ۥ۟ۦ۟ۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    const/16 v8, 0x21

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {p1, v1, v8}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟ۦ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_7
    :goto_2
    invoke-static {v3}, LYue/ۥ۟ۦ۟ۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {p1, v1, v8}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟ۦ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0xb

    invoke-static {v1}, LYue/ۥ۟ۦ۟ۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, LYue/ۥۡۢ۟ۡ;->ۥۣ۟۟۟(Ljava/lang/String;I)V

    :cond_8
    return-void
.end method


# virtual methods
.method public native info()Lcom/yuexin/panel/myClass/itemInfo;
.end method

.method public native onClick()V
.end method
