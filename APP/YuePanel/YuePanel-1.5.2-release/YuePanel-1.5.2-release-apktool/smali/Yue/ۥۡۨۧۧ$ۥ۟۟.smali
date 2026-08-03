.class public LYue/ۥۡۨۧۧ$ۥ۟۟;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۨۧۧ;->ۥ۟(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟ۡ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡۨۧۧ;


# direct methods
.method public constructor <init>(LYue/ۥۡۨۧۧ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۡۨۧۧ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥۣ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_0

    const-wide v0, 0x631580a313e89bb6L    # 2.0287395786440918E169

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥۣ۟۟ۡ:Ljava/lang/String;

    :cond_0
    return-object p0

    :pswitch_1
    sget-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥ۟۟ۡۢ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, -0x36272def5d74867bL    # -5.6680153639670234E47

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥ۟۟ۡۢ:Ljava/lang/String;

    :cond_1
    return-object p0

    :pswitch_2
    sget-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥ۟۟ۡۡ:Ljava/lang/String;

    if-nez p0, :cond_2

    const-wide v0, -0x341a67b42903f62eL    # -4.236044675206691E57

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥ۟۟ۡۡ:Ljava/lang/String;

    :cond_2
    return-object p0

    :pswitch_3
    sget-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥ۟۟ۡ۠:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x2a0fe85389f39361L    # 4.347550680811395E-106

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥ۟۟ۡ۠:Ljava/lang/String;

    :cond_3
    return-object p0

    :pswitch_4
    sget-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥ۟۟ۡ۟:Ljava/lang/String;

    if-nez p0, :cond_4

    const-wide v0, -0x647c0f16eb66efa3L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥ۟۟ۡ۟:Ljava/lang/String;

    :cond_4
    return-object p0

    :pswitch_5
    sget-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, -0x4dcf5b5c1e0b5194L    # -6.173278402998623E-67

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥ۟۟ۡ:Ljava/lang/String;

    :cond_5
    return-object p0

    :pswitch_6
    sget-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_6

    const-wide v0, 0x44d050f7e530bb92L    # 3.0820586395556116E23

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_6
    return-object p0

    :pswitch_7
    sget-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, -0x260a66c4a94d4d31L    # -2.2844572991873364E125

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_7
    return-object p0

    :pswitch_8
    sget-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_8

    const-wide v0, 0x1acb47e76edec255L    # 1.314894458680457E-179

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_8
    return-object p0

    :pswitch_9
    sget-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_9

    const-wide v0, 0x3c740d2a048db153L    # 1.739183657380669E-17

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_9
    return-object p0

    :pswitch_a
    sget-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_a

    const-wide v0, -0x6d2d3f438b33885aL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۨۧۧ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_a
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x3

    :try_start_0
    sget-object v1, LYue/ۥۡۨۧۧ;->ۥ۟:Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    invoke-static {v2}, LYue/ۥۡۨۧۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object p1, p1, v2

    check-cast p1, Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v4}, LYue/ۥۡۨۧۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    const/4 v5, 0x2

    invoke-static {v5}, LYue/ۥۡۨۧۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    new-array v6, v2, [Ljava/lang/Object;

    invoke-static {v4, v5, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {}, LYue/ۥۡۢ۟ۤ;->ۥ۟۟۟ۢ()Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v6, :cond_2

    :try_start_1
    invoke-static {v0}, LYue/ۥۡۨۧۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v6

    new-array v7, v2, [Ljava/lang/Object;

    invoke-static {v4, v6, v7}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    const/4 v4, 0x4

    :try_start_2
    invoke-static {v4}, LYue/ۥۡۨۧۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    :goto_1
    sget-object v6, LYue/ۥۡۨۧۧ;->ۥ۟:Ljava/lang/StringBuilder;

    const/4 v7, 0x5

    invoke-static {v7}, LYue/ۥۡۨۧۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v7, 0x6

    invoke-static {v7}, LYue/ۥۡۨۧۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v4, 0x7

    invoke-static {v4}, LYue/ۥۡۨۧۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x8

    invoke-static {v4}, LYue/ۥۡۨۧۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v6, 0x9

    invoke-static {v6}, LYue/ۥۡۨۧۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p1, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto/16 :goto_0

    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-static {p1}, LYue/ۥۡۨۧۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۢ(Ljava/lang/String;I)V

    :cond_3
    return-void
.end method
