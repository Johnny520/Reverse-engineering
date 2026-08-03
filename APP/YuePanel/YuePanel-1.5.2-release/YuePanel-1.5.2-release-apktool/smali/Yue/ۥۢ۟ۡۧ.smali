.class public LYue/ۥۢ۟ۡۧ;
.super LYue/ۥ۠ۥ۟;


# static fields
.field public static final ۥ۟:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final ۥ۟۟:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

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

.field public static volatile synthetic ۥ۟۟۠ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;


# instance fields
.field public ۥ:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x98

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, LYue/ۥۢ۟ۡۧ;->ۥ۟:Ljava/util/HashMap;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, LYue/ۥۢ۟ۡۧ;->ۥ۟۟:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LYue/ۥ۠ۥ۟;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, LYue/ۥۢ۟ۡۧ;->ۥ:J

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ(LYue/ۥۢ۟ۡۧ;Ljava/lang/Object;JLjava/lang/Object;)V
.end method


# virtual methods
.method public native dexKit(Lorg/luckypray/dexkit/DexKitBridge;)Lorg/luckypray/dexkit/result/MethodDataList;
.end method

.method public native info()Lcom/yuexin/panel/myClass/itemInfo;
.end method

.method public native load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end method

.method public final native ۥ۟(Ljava/lang/String;I)Z
.end method

.method public final native ۥ۟۟(Ljava/lang/String;I)V
.end method

.method public final ۥ۟۟۟(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 12

    const/4 v0, -0x1

    if-ne p3, v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-wide v0, p0, LYue/ۥۢ۟ۡۧ;->ۥ:J

    const-wide/16 v2, 0x7d0

    add-long/2addr v0, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    return-void

    :cond_1
    const/16 v0, 0xa

    invoke-static {v0}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/16 v0, 0xb

    invoke-static {v0}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const/16 v3, 0xc

    invoke-static {v3}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    const-class v4, Ljava/util/List;

    invoke-static {v0, v3, v4}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_2

    return-void

    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    const/4 v4, 0x1

    if-le v0, v4, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v4, :cond_4

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v1, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_4
    move v4, v1

    :goto_0
    move v0, v1

    :goto_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    if-ge v0, v5, :cond_7

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    add-int/lit8 v7, v6, 0x1

    add-int/2addr v7, v4

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/2addr v6, v4

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    const/16 v9, 0xd

    invoke-static {v9}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v10

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v7, v10, v11}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static {v9}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9, v11}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-ne p3, v6, :cond_5

    const/16 p3, 0x8

    invoke-static {p3}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p3

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, p3, v0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/16 p3, 0x14

    invoke-static {p3}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p3, v11}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    add-int/lit16 p3, v7, 0x3e8

    int-to-float p3, p3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-float p1, p1

    div-float/2addr p3, p1

    const/high16 p1, 0x42c80000    # 100.0f

    mul-float/2addr p3, p1

    const/16 p1, 0x10

    invoke-static {p1}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-static {p2, p1, p3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 p2, 0x11

    invoke-static {p2}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-long p2, v8

    invoke-static {p2, p3}, LYue/ۥۣۢۡۨ;->ۥ۟۟۟(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x12

    invoke-static {p2}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    int-to-long p2, v7

    invoke-static {p2, p3}, LYue/ۥۣۢۡۨ;->ۥ۟۟۟(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x13

    invoke-static {p2}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, LYue/ۥۢ۟ۡۧ;->ۥ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_1

    :catchall_0
    :cond_7
    :goto_2
    return-void
.end method

.method public final ۥ۟۟۟۟(Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/16 v2, 0x8

    :try_start_0
    invoke-static {v2}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    new-instance v4, LYue/ۥۣ۠ۡۧ;

    invoke-direct {v4}, LYue/ۥۣ۠ۡۧ;-><init>()V

    invoke-virtual {v4, v1}, LYue/ۥۣ۠ۡۧ;->ۥۣ۟۟۟(Ljava/lang/Object;)LYue/ۥۣ۠ۡۧ;

    move-result-object v4

    new-instance v5, LYue/ۥۣ۠ۡۧ;

    invoke-direct {v5}, LYue/ۥۣ۠ۡۧ;-><init>()V

    invoke-virtual {v5, v2}, LYue/ۥۣ۠ۡۧ;->ۥۣ۟۟۟(Ljava/lang/Object;)LYue/ۥۣ۠ۡۧ;

    move-result-object v2

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ()Landroid/app/Activity;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    const-class v6, Ljava/lang/String;

    invoke-virtual {v4, v6}, LYue/ۥۣ۠ۡۧ;->ۥ۟۟۟ۥ(Ljava/lang/Class;)LYue/ۥۣ۠ۡۧ;

    move-result-object v4

    const/16 v6, 0x9

    invoke-static {v6}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, LYue/ۥۣ۠ۡۧ;->ۥ۟(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const/16 v6, 0xa

    invoke-static {v6}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v6

    new-array v7, v3, [Ljava/lang/Object;

    invoke-static {v1, v6, v7}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    const/16 v7, 0xb

    invoke-static {v7}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const/16 v7, 0xc

    invoke-static {v7}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v7

    const-class v8, Ljava/util/List;

    invoke-static {v1, v7, v8}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_9

    if-nez v6, :cond_0

    goto/16 :goto_5

    :cond_0
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move v8, v3

    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v9

    const/16 v10, 0xd

    if-ge v8, v9, :cond_2

    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v10}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v10

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v9, v10, v11}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-nez v10, :cond_1

    invoke-interface {v6, v9}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    sget-object v9, LYue/ۥۢ۟ۡۧ;->ۥ۟:Ljava/util/HashMap;

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v9, v4, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    if-ge v3, v7, :cond_9

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v8, v3, 0x1

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v9

    if-lt v8, v9, :cond_3

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    goto :goto_2

    :cond_3
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    :goto_2
    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v11}, LYue/ۥۣ۠ۡۧ;->ۥ۟۟۟ۥ(Ljava/lang/Class;)LYue/ۥۣ۠ۡۧ;

    move-result-object v12

    const/16 v13, 0xe

    invoke-static {v13}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, LYue/ۥۣ۠ۡۧ;->ۥ۟(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-static {v10}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v14

    invoke-static {v7, v14, v11}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static {v10}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v14

    invoke-static {v9, v14, v11}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-ne v9, v7, :cond_4

    goto :goto_3

    :cond_4
    move v13, v9

    :goto_3
    int-to-long v14, v7

    cmp-long v7, p2, v14

    if-ltz v7, :cond_8

    int-to-long v10, v13

    cmp-long v7, p2, v10

    if-gtz v7, :cond_8

    sget-object v2, LYue/ۥۢ۟ۡۧ;->ۥ۟:Ljava/util/HashMap;

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/16 v2, 0xf

    invoke-static {v2}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    move v3, v8

    :cond_5
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v3, :cond_7

    invoke-virtual {v0, v4, v3}, LYue/ۥۢ۟ۡۧ;->ۥ۟(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_6

    return-void

    :cond_6
    int-to-float v2, v13

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v2, v5

    const/high16 v5, 0x42c80000    # 100.0f

    mul-float/2addr v2, v5

    const/16 v5, 0x10

    invoke-static {v5}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v7, p4

    invoke-static {v7, v5, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v5, 0x11

    invoke-static {v5}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v14, v15}, LYue/ۥۣۢۡۨ;->ۥ۟۟۟(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x12

    invoke-static {v5}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10, v11}, LYue/ۥۣۢۡۨ;->ۥ۟۟۟(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x13

    invoke-static {v5}, LYue/ۥۢ۟ۡۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۦ(Ljava/lang/String;)V

    invoke-virtual {v0, v4, v3}, LYue/ۥۢ۟ۡۧ;->ۥ۟۟(Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :cond_7
    move-object/from16 v7, p4

    goto :goto_4

    :cond_8
    move-object/from16 v7, p4

    move v3, v8

    const/16 v10, 0xd

    goto/16 :goto_1

    :catchall_0
    :cond_9
    :goto_5
    return-void
.end method
