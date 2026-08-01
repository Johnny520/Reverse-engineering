.class final Lcom/mr/elaris/MessageRepeater;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field private static final AIO_MSG_ITEM_CLASS:Ljava/lang/String; = "com.tencent.mobileqq.aio.msg.AIOMsgItem"

.field private static final AIO_MSG_RECORDS:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final AIO_MSG_RECORD_BY_ID:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final AIO_PARAM_CLASS:Ljava/lang/String; = "com.tencent.aio.data.AIOParam"

.field private static final AIO_PARAM_HOST_CLASSES:[Ljava/lang/String;

.field private static final DEFAULT_REPEATER_ICON_COLOR:I = -0xed570b

.field private static final FOLLOW_COMPONENT_CLASS:Ljava/lang/String; = "com.tencent.mobileqq.aio.msglist.holder.component.msgfollow.AIOMsgFollowComponent"

.field private static final FOLLOW_PROBE_LOGS:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private static final FOLLOW_UNHOOKS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;",
            ">;"
        }
    .end annotation
.end field

.field private static final KERNEL_MSG_SERVICE_CLASSES:[Ljava/lang/String;

.field private static final MAX_MSG_RECORD_ID_CACHE_SIZE:I = 0x300

.field private static final PLAIN_TEXT_CALLBACK_WAIT_MS:J = 0x1388L

.field private static final REPEATER_ICON_CACHE:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/ImageView;",
            ">;>;"
        }
    .end annotation
.end field

.field static final REPEATER_ICON_TAG:Ljava/lang/String; = "ELARIS_REPEATER_ICON"

.field private static final SEND_CONTACT_HOOKED:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile sAioParam:Ljava/lang/Object;

.field private static volatile sAioParamCaptureInstalled:Z

.field private static volatile sBindSuccessLogCount:I

.field private static volatile sBindSuccessLogWindowAt:J

.field private static volatile sCustomIconBitmap:Landroid/graphics/Bitmap;

.field private static volatile sCustomIconPath:Ljava/lang/String;

.field private static volatile sDefaultIconLogged:Z

.field private static volatile sFollowHookInstalled:Z

.field private static volatile sInstalled:Z

.field private static volatile sLastSendContact:Ljava/lang/Object;

.field private static volatile sLastSendContactLogAt:J

.field private static volatile sSendContactCaptureInstalled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lcom/mr/elaris/MessageRepeater;->AIO_MSG_RECORDS:Ljava/util/Map;

    .line 11
    .line 12
    new-instance v0, Lb1;

    .line 13
    .line 14
    invoke-direct {v0}, Lb1;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lcom/mr/elaris/MessageRepeater;->AIO_MSG_RECORD_BY_ID:Ljava/util/Map;

    .line 22
    .line 23
    new-instance v0, Ljava/util/WeakHashMap;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lcom/mr/elaris/MessageRepeater;->REPEATER_ICON_CACHE:Ljava/util/Map;

    .line 33
    .line 34
    new-instance v0, Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Lcom/mr/elaris/MessageRepeater;->FOLLOW_PROBE_LOGS:Ljava/util/Map;

    .line 44
    .line 45
    new-instance v0, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, Lcom/mr/elaris/MessageRepeater;->FOLLOW_UNHOOKS:Ljava/util/List;

    .line 55
    .line 56
    const-string v0, "com.tencent.mobileqq.activity.aio.core.BaseChatPie"

    .line 57
    .line 58
    const-string v1, "com.tencent.mobileqq.aio.core.BaseAIOContext"

    .line 59
    .line 60
    const-string v2, "com.tencent.mobileqq.aio.core.BaseChatPie"

    .line 61
    .line 62
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sput-object v0, Lcom/mr/elaris/MessageRepeater;->AIO_PARAM_HOST_CLASSES:[Ljava/lang/String;

    .line 67
    .line 68
    const-string v0, "com.tencent.qqnt.kernel.nativeinterface.IKernelMsgService$CppProxy"

    .line 69
    .line 70
    const-string v1, "com.tencent.qqnt.kernelpublic.nativeinterface.IKernelMsgService$CppProxy"

    .line 71
    .line 72
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    sput-object v0, Lcom/mr/elaris/MessageRepeater;->KERNEL_MSG_SERVICE_CLASSES:[Ljava/lang/String;

    .line 77
    .line 78
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Lcom/mr/elaris/MessageRepeater;->SEND_CONTACT_HOOKED:Ljava/util/Set;

    .line 88
    .line 89
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic A(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/mr/elaris/MessageRepeater;->sendResolvedMessage(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic B(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    .line 1
    const/4 v5, 0x1

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v4, p4

    .line 7
    invoke-static/range {v0 .. v5}, Lcom/mr/elaris/MessageRepeater;->sendResolvedMessage(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static bridge synthetic C()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/mr/elaris/MessageRepeater;->shouldLogBindSuccess()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public static bridge synthetic D(Landroid/widget/ImageView;Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/MessageRepeater;->shouldTriggerRepeat(Landroid/widget/ImageView;Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static bridge synthetic E(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->unwrap(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static bridge synthetic a(Ljava/lang/ClassLoader;Landroid/widget/ImageView;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/MessageRepeater;->bindIcon(Ljava/lang/ClassLoader;Landroid/widget/ImageView;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static appRuntime(Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 4

    .line 1
    const-string v0, "getRuntime"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    const-string v2, "com.tencent.common.app.BaseApplicationImpl"

    .line 5
    .line 6
    invoke-static {v2, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const-string v3, "getApplication"

    .line 11
    .line 12
    invoke-static {v2, v1, v3}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v2, v0}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    return-object v2

    .line 23
    :catchall_0
    :cond_0
    :try_start_1
    const-string v2, "mqq.app.MobileQQ"

    .line 24
    .line 25
    invoke-static {v2, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v2, "getContext"

    .line 30
    .line 31
    invoke-static {p0, v1, v2}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    return-object p0

    .line 42
    :catchall_1
    :cond_1
    return-object v1
.end method

.method private static applyDefaultRepeaterIconStyle(Landroid/widget/ImageView;)V
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    :try_start_0
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    :catchall_0
    const/4 v0, 0x0

    .line 10
    :try_start_1
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->dp(Landroid/view/View;F)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 15
    .line 16
    .line 17
    :catchall_1
    :try_start_2
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/high16 v1, 0x41c00000    # 24.0f

    .line 25
    .line 26
    invoke-static {p0, v1}, Lcom/mr/elaris/MessageRepeater;->dp(Landroid/view/View;F)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    iget v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 31
    .line 32
    if-eq v2, v1, :cond_2

    .line 33
    .line 34
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 35
    .line 36
    :cond_2
    iget v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 37
    .line 38
    if-eq v2, v1, :cond_3

    .line 39
    .line 40
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 41
    .line 42
    :cond_3
    instance-of v1, v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 43
    .line 44
    const/16 v2, 0x10

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    move-object v1, v0

    .line 50
    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 51
    .line 52
    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 53
    .line 54
    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 55
    .line 56
    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_4
    instance-of v1, v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 60
    .line 61
    if-eqz v1, :cond_5

    .line 62
    .line 63
    move-object v1, v0

    .line 64
    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 65
    .line 66
    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 67
    .line 68
    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 69
    .line 70
    iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 71
    .line 72
    :cond_5
    :goto_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 73
    .line 74
    .line 75
    :catchall_2
    :goto_1
    return-void
.end method

.method private static applyRepeaterPositionAndHitArea(Landroid/widget/ImageView;Z)V
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    if-nez p1, :cond_1

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-nez p1, :cond_2

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_2
    const/high16 v0, 0x42900000    # 72.0f

    .line 15
    .line 16
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->dp(Landroid/view/View;F)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget v1, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 21
    .line 22
    if-ge v1, v0, :cond_3

    .line 23
    .line 24
    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 25
    .line 26
    :cond_3
    iget v1, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 27
    .line 28
    if-ge v1, v0, :cond_4

    .line 29
    .line 30
    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 31
    .line 32
    :cond_4
    instance-of v0, p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 33
    .line 34
    const/16 v1, 0x10

    .line 35
    .line 36
    if-eqz v0, :cond_5

    .line 37
    .line 38
    move-object v0, p1

    .line 39
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 40
    .line 41
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_5
    instance-of v0, p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 45
    .line 46
    if-eqz v0, :cond_6

    .line 47
    .line 48
    move-object v0, p1

    .line 49
    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 50
    .line 51
    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 52
    .line 53
    :cond_6
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    :catchall_0
    :goto_1
    return-void
.end method

.method private static arrayList(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    new-instance p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method private static attrsFromMsg(Ljava/lang/Object;)Ljava/util/Map;
    .locals 4

    .line 1
    const-string v0, "getMsgAttrs"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Ljava/util/Map;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Ljava/util/Map;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    const-string v0, "getAttrs"

    .line 15
    .line 16
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    instance-of v1, v0, Ljava/util/Map;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    check-cast v0, Ljava/util/Map;

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1
    const-string v0, "messageAttrs"

    .line 28
    .line 29
    const-string v1, "mMsgAttrs"

    .line 30
    .line 31
    const-string v2, "msgAttrs"

    .line 32
    .line 33
    const-string v3, "attrs"

    .line 34
    .line 35
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->firstObject(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    instance-of v0, p0, Ljava/util/Map;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    check-cast p0, Ljava/util/Map;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_2
    const/4 p0, 0x0

    .line 51
    return-object p0
.end method

.method private static attrsMap(Ljava/util/Map;)Ljava/util/Map;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    new-instance p0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static bridge synthetic b(Ljava/lang/Object;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->cachedRepeaterImageView(Ljava/lang/Object;)Landroid/widget/ImageView;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static bindIcon(Ljava/lang/ClassLoader;Landroid/widget/ImageView;Ljava/lang/Object;)Z
    .locals 9

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p2, Lyb;->a:Ljava/util/WeakHashMap;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, Lyb;->a:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    invoke-virtual {v0, p1, p2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1e

    .line 13
    :goto_0
    :try_start_1
    const-string p2, "ELARIS_REPEATER_ICON"

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    .line 17
    .line 18
    :catchall_0
    const-string p2, "message_repeater_hide_button"

    .line 19
    .line 20
    invoke-static {p2}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-static {}, Lcom/mr/elaris/MessageRepeater;->currentCustomIconPath()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x1

    .line 34
    if-lez v1, :cond_1

    .line 35
    .line 36
    move v1, v3

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v1, v2

    .line 39
    :goto_1
    invoke-static {p2, v0}, Lcom/mr/elaris/MessageRepeater;->repeaterVisualState(ZLjava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-static {p1, v4, p2}, Lcom/mr/elaris/MessageRepeater;->isIconVisualReady(Landroid/widget/ImageView;Ljava/lang/String;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    const/4 v6, 0x0

    .line 48
    const/4 v7, 0x0

    .line 49
    if-nez v5, :cond_2

    .line 50
    .line 51
    if-eqz p2, :cond_2

    .line 52
    .line 53
    :try_start_2
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 54
    .line 55
    .line 56
    :catchall_1
    :try_start_3
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 59
    .line 60
    .line 61
    :catchall_2
    :try_start_4
    invoke-virtual {p1, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 62
    .line 63
    .line 64
    :catchall_3
    :try_start_5
    invoke-virtual {p1, v6}, Landroid/view/View;->setAlpha(F)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 65
    .line 66
    .line 67
    :catchall_4
    const/high16 v0, 0x42900000    # 72.0f

    .line 68
    .line 69
    :try_start_6
    invoke-static {p1, v0}, Lcom/mr/elaris/MessageRepeater;->dp(Landroid/view/View;F)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-virtual {p1, v1}, Landroid/view/View;->setMinimumWidth(I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 74
    .line 75
    .line 76
    :catchall_5
    :try_start_7
    invoke-static {p1, v0}, Lcom/mr/elaris/MessageRepeater;->dp(Landroid/view/View;F)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-virtual {p1, v0}, Landroid/view/View;->setMinimumHeight(I)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 81
    .line 82
    .line 83
    :catchall_6
    invoke-static {p1, v3}, Lcom/mr/elaris/MessageRepeater;->applyRepeaterPositionAndHitArea(Landroid/widget/ImageView;Z)V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    const/high16 v8, 0x3f800000    # 1.0f

    .line 88
    .line 89
    if-nez v5, :cond_4

    .line 90
    .line 91
    if-eqz v1, :cond_4

    .line 92
    .line 93
    :try_start_8
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 94
    .line 95
    .line 96
    :catchall_7
    :try_start_9
    invoke-virtual {p1, v8}, Landroid/view/View;->setAlpha(F)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 97
    .line 98
    .line 99
    :catchall_8
    :try_start_a
    invoke-virtual {p1, v6}, Landroid/view/View;->setTranslationX(F)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 100
    .line 101
    .line 102
    :catchall_9
    :try_start_b
    invoke-virtual {p1, v6}, Landroid/view/View;->setTranslationY(F)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    .line 103
    .line 104
    .line 105
    :catchall_a
    :try_start_c
    invoke-virtual {p1, v7}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_b

    .line 106
    .line 107
    .line 108
    :catchall_b
    :try_start_d
    invoke-virtual {p1, v7}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_c

    .line 109
    .line 110
    .line 111
    :catchall_c
    :try_start_e
    invoke-virtual {p1, v7}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_d

    .line 112
    .line 113
    .line 114
    :catchall_d
    invoke-static {p1}, Lcom/mr/elaris/MessageRepeater;->applyDefaultRepeaterIconStyle(Landroid/widget/ImageView;)V

    .line 115
    .line 116
    .line 117
    invoke-static {p1, v0}, Lcom/mr/elaris/MessageRepeater;->resolveCustomIcon(Landroid/widget/ImageView;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-eqz v0, :cond_3

    .line 122
    .line 123
    :try_start_f
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_e

    .line 124
    .line 125
    .line 126
    :catchall_e
    :cond_3
    :try_start_10
    invoke-virtual {p1, v3}, Landroid/view/View;->setMinimumWidth(I)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_f

    .line 127
    .line 128
    .line 129
    :catchall_f
    :try_start_11
    invoke-virtual {p1, v3}, Landroid/view/View;->setMinimumHeight(I)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_19

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_4
    if-nez v5, :cond_6

    .line 134
    .line 135
    :try_start_12
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_10

    .line 136
    .line 137
    .line 138
    :catchall_10
    :try_start_13
    invoke-virtual {p1, v8}, Landroid/view/View;->setAlpha(F)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_11

    .line 139
    .line 140
    .line 141
    :catchall_11
    :try_start_14
    invoke-virtual {p1, v6}, Landroid/view/View;->setTranslationX(F)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_12

    .line 142
    .line 143
    .line 144
    :catchall_12
    :try_start_15
    invoke-virtual {p1, v6}, Landroid/view/View;->setTranslationY(F)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_13

    .line 145
    .line 146
    .line 147
    :catchall_13
    :try_start_16
    invoke-virtual {p1, v7}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_14

    .line 148
    .line 149
    .line 150
    :catchall_14
    :try_start_17
    invoke-virtual {p1, v7}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_15

    .line 151
    .line 152
    .line 153
    :catchall_15
    :try_start_18
    invoke-virtual {p1, v7}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_16

    .line 154
    .line 155
    .line 156
    :catchall_16
    invoke-static {p1}, Lcom/mr/elaris/MessageRepeater;->applyDefaultRepeaterIconStyle(Landroid/widget/ImageView;)V

    .line 157
    .line 158
    .line 159
    invoke-static {p1}, Lcom/mr/elaris/MessageRepeater;->resolveDefaultIcon(Landroid/widget/ImageView;)Landroid/graphics/drawable/Drawable;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    if-eqz v0, :cond_5

    .line 164
    .line 165
    :try_start_19
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_17

    .line 166
    .line 167
    .line 168
    :catchall_17
    :cond_5
    :try_start_1a
    invoke-virtual {p1, v3}, Landroid/view/View;->setMinimumWidth(I)V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_18

    .line 169
    .line 170
    .line 171
    :catchall_18
    :try_start_1b
    invoke-virtual {p1, v3}, Landroid/view/View;->setMinimumHeight(I)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_19

    .line 172
    .line 173
    .line 174
    :catchall_19
    :cond_6
    :goto_2
    invoke-static {p1, v4, p2}, Lcom/mr/elaris/MessageRepeater;->rememberIconVisualState(Landroid/widget/ImageView;Ljava/lang/String;Z)V

    .line 175
    .line 176
    .line 177
    :try_start_1c
    invoke-virtual {p1, v3}, Landroid/view/View;->setClickable(Z)V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_1a

    .line 178
    .line 179
    .line 180
    :catchall_1a
    if-nez p1, :cond_7

    .line 181
    .line 182
    sget-object p0, Lyb;->a:Ljava/util/WeakHashMap;

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_7
    sget-object p2, Lyb;->b:Ljava/util/WeakHashMap;

    .line 186
    .line 187
    monitor-enter p2

    .line 188
    :try_start_1d
    invoke-virtual {p2, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_8

    .line 193
    .line 194
    monitor-exit p2

    .line 195
    :goto_3
    return v2

    .line 196
    :catchall_1b
    move-exception p0

    .line 197
    goto :goto_4

    .line 198
    :cond_8
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 199
    .line 200
    invoke-virtual {p2, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    monitor-exit p2
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_1b

    .line 204
    :try_start_1e
    new-instance p2, Lcom/mr/elaris/m;

    .line 205
    .line 206
    invoke-direct {p2, p1, p0}, Lcom/mr/elaris/m;-><init>(Landroid/widget/ImageView;Ljava/lang/ClassLoader;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_1c

    .line 210
    .line 211
    .line 212
    return v3

    .line 213
    :catchall_1c
    move-exception p0

    .line 214
    sget-object v0, Lyb;->b:Ljava/util/WeakHashMap;

    .line 215
    .line 216
    monitor-enter v0

    .line 217
    :try_start_1f
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    monitor-exit v0
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_1d

    .line 221
    new-instance p1, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    const-string p2, "repeater icon skipped reason=click listener "

    .line 224
    .line 225
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    const-string p2, ": "

    .line 229
    .line 230
    invoke-static {p0, p1, p2}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    return v2

    .line 234
    :catchall_1d
    move-exception p0

    .line 235
    :try_start_20
    monitor-exit v0
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_1d

    .line 236
    throw p0

    .line 237
    :goto_4
    :try_start_21
    monitor-exit p2
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_1b

    .line 238
    throw p0

    .line 239
    :catchall_1e
    move-exception p0

    .line 240
    :try_start_22
    monitor-exit v0
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_1e

    .line 241
    throw p0
.end method

.method public static bridge synthetic c(Landroid/widget/ImageView;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/MessageRepeater;->canReuseRepeaterBinding(Landroid/widget/ImageView;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static cacheClassList(Ljava/lang/String;Ljava/lang/Class;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p0}, Lt2;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    invoke-static {p0, p1}, Lt2;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const-string v1, "\\|"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    array-length v2, v1

    .line 31
    const/4 v3, 0x0

    .line 32
    :goto_0
    if-ge v3, v2, :cond_4

    .line 33
    .line 34
    aget-object v4, v1, v3

    .line 35
    .line 36
    if-nez v4, :cond_2

    .line 37
    .line 38
    const-string v4, ""

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    :goto_1
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_3

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, "|"

    .line 64
    .line 65
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {p0, p1}, Lt2;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_5
    :goto_2
    return-void
.end method

.method private static cacheRepeaterImageView(Ljava/lang/Object;Landroid/widget/ImageView;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, Lcom/mr/elaris/MessageRepeater;->REPEATER_ICON_CACHE:Ljava/util/Map;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p0

    .line 22
    :cond_1
    :goto_0
    return-void
.end method

.method public static cachedMsgRecordById(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Lcom/mr/elaris/MessageRepeater;->AIO_MSG_RECORD_BY_ID:Ljava/util/Map;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    monitor-exit v0

    .line 18
    return-object p0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p0

    .line 22
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public static cachedMsgRecordFromAny(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lcom/mr/elaris/MessageRepeater;->AIO_MSG_RECORDS:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-object v1

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_1
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lcom/mr/elaris/MessageRepeater;->findMsgRecordByText(Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_2
    invoke-static {p0}, Lv4;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->rememberAioMsgRecord(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_3
    return-object v0

    .line 40
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    throw p0
.end method

.method private static cachedRepeaterImageView(Ljava/lang/Object;)Landroid/widget/ImageView;
    .locals 1

    .line 1
    sget-object v0, Lcom/mr/elaris/MessageRepeater;->REPEATER_ICON_CACHE:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Landroid/widget/ImageView;

    .line 19
    .line 20
    :goto_0
    monitor-exit v0

    .line 21
    return-object p0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p0
.end method

.method private static call(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p0, p2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    return-object p0

    .line 15
    :catchall_0
    :try_start_1
    invoke-virtual {p0, p2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 26
    return-object p0

    .line 27
    :catchall_1
    return-object v1
.end method

.method private static call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 28
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0, p0, p1}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static callbackArg(Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 112
    invoke-static {p0, p1, v0}, Lcom/mr/elaris/MessageRepeater;->callbackArg(Ljava/lang/ClassLoader;Ljava/lang/Class;Ly9;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static callbackArg(Ljava/lang/ClassLoader;Ljava/lang/Class;Ly9;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/Class<",
            "*>;",
            "Ly9;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-static {p1}, Lcom/mr/elaris/MessageRepeater;->defaultArg(Ljava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    :goto_0
    return-object v0

    .line 23
    :cond_2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    if-nez v1, :cond_4

    .line 28
    .line 29
    if-nez p0, :cond_3

    .line 30
    .line 31
    const-class p0, Lcom/mr/elaris/MessageRepeater;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_2

    .line 40
    :cond_3
    :goto_1
    move-object v1, p0

    .line 41
    :cond_4
    filled-new-array {p1}, [Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance v2, Lcom/mr/elaris/g;

    .line 46
    .line 47
    invoke-direct {v2, p2}, Lcom/mr/elaris/g;-><init>(Ly9;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v1, p0, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    return-object p0

    .line 55
    :goto_2
    const-string p2, "repeater"

    .line 56
    .line 57
    const-string v1, "callback-proxy"

    .line 58
    .line 59
    invoke-static {p2, v1, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    new-instance p2, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v1, "repeater send failed reason=callback proxy "

    .line 65
    .line 66
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string p1, " "

    .line 77
    .line 78
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string p1, ": "

    .line 93
    .line 94
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-object v0
.end method

.method private static canReuseRepeaterBinding(Landroid/widget/ImageView;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->isCachedRepeaterIconCandidate(Landroid/widget/ImageView;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Lyb;->a(Landroid/view/View;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eq v0, p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p1, "message_repeater_hide_button"

    .line 15
    .line 16
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {}, Lcom/mr/elaris/MessageRepeater;->currentCustomIconPath()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {p1, v0}, Lcom/mr/elaris/MessageRepeater;->repeaterVisualState(ZLjava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {p0, v0, p1}, Lcom/mr/elaris/MessageRepeater;->isIconVisualReady(Landroid/widget/ImageView;Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0

    .line 33
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method private static collectImageViews(Ljava/lang/Object;Ljava/util/List;Ljava/util/Set;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/List<",
            "Landroid/widget/ImageView;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Object;",
            ">;I)V"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_a

    .line 2
    .line 3
    if-eqz p1, :cond_a

    .line 4
    .line 5
    if-eqz p2, :cond_a

    .line 6
    .line 7
    if-ltz p3, :cond_a

    .line 8
    .line 9
    invoke-interface {p2, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_6

    .line 16
    .line 17
    :cond_0
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    instance-of v0, p0, Landroid/widget/ImageView;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    check-cast p0, Landroid/widget/ImageView;

    .line 25
    .line 26
    invoke-interface {p1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-nez p2, :cond_a

    .line 31
    .line 32
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    instance-of v0, p0, Ljava/lang/CharSequence;

    .line 37
    .line 38
    if-nez v0, :cond_a

    .line 39
    .line 40
    instance-of v0, p0, Ljava/lang/Number;

    .line 41
    .line 42
    if-nez v0, :cond_a

    .line 43
    .line 44
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    const/4 v2, 0x1

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    move-object v0, p0

    .line 56
    check-cast v0, Landroid/view/ViewGroup;

    .line 57
    .line 58
    :try_start_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    const/16 v4, 0xc

    .line 63
    .line 64
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 65
    .line 66
    .line 67
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move v3, v1

    .line 70
    :goto_0
    move v4, v1

    .line 71
    :goto_1
    if-ge v4, v3, :cond_3

    .line 72
    .line 73
    :try_start_1
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    add-int/lit8 v6, p3, -0x1

    .line 78
    .line 79
    invoke-static {v5, p1, p2, v6}, Lcom/mr/elaris/MessageRepeater;->collectImageViews(Ljava/lang/Object;Ljava/util/List;Ljava/util/Set;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 80
    .line 81
    .line 82
    :catchall_1
    add-int/lit8 v4, v4, 0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    if-gt p3, v2, :cond_5

    .line 86
    .line 87
    goto/16 :goto_6

    .line 88
    .line 89
    :cond_4
    instance-of v0, p0, Landroid/view/View;

    .line 90
    .line 91
    if-eqz v0, :cond_5

    .line 92
    .line 93
    return-void

    .line 94
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const-string v3, "java."

    .line 103
    .line 104
    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_6

    .line 109
    .line 110
    goto :goto_6

    .line 111
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    :goto_2
    if-eqz v0, :cond_a

    .line 116
    .line 117
    const-class v3, Ljava/lang/Object;

    .line 118
    .line 119
    if-eq v0, v3, :cond_a

    .line 120
    .line 121
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 122
    .line 123
    .line 124
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 125
    goto :goto_3

    .line 126
    :catchall_2
    const/4 v3, 0x0

    .line 127
    :goto_3
    if-eqz v3, :cond_9

    .line 128
    .line 129
    move v4, v1

    .line 130
    :goto_4
    array-length v5, v3

    .line 131
    if-ge v4, v5, :cond_9

    .line 132
    .line 133
    aget-object v5, v3, v4

    .line 134
    .line 135
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-eqz v6, :cond_7

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_7
    :try_start_3
    invoke-virtual {v5, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    add-int/lit8 v6, p3, -0x1

    .line 154
    .line 155
    invoke-static {v5, p1, p2, v6}, Lcom/mr/elaris/MessageRepeater;->collectImageViews(Ljava/lang/Object;Ljava/util/List;Ljava/util/Set;I)V

    .line 156
    .line 157
    .line 158
    if-eqz v5, :cond_8

    .line 159
    .line 160
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    const-string v8, "Lazy"

    .line 169
    .line 170
    invoke-virtual {v7, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    if-eqz v7, :cond_8

    .line 175
    .line 176
    const-string v7, "getValue"

    .line 177
    .line 178
    invoke-static {v5, v7}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-static {v5, p1, p2, v6}, Lcom/mr/elaris/MessageRepeater;->collectImageViews(Ljava/lang/Object;Ljava/util/List;Ljava/util/Set;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 183
    .line 184
    .line 185
    :catchall_3
    :cond_8
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    goto :goto_2

    .line 193
    :cond_a
    :goto_6
    return-void
.end method

.method private static contactChatType(Ljava/lang/Object;)I
    .locals 2

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, Lcom/mr/elaris/MessageRepeater;->intField(Ljava/lang/Object;Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const-string v1, "chatType"

    .line 9
    .line 10
    invoke-static {p0, v1, v0}, Lcom/mr/elaris/MessageRepeater;->intField(Ljava/lang/Object;Ljava/lang/String;I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    const-string v0, "getChatType"

    .line 18
    .line 19
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    instance-of v1, v0, Ljava/lang/Number;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Number;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :cond_1
    const-string v0, "getType"

    .line 35
    .line 36
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    instance-of v0, p0, Ljava/lang/Number;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    check-cast p0, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0

    .line 51
    :cond_2
    const/4 p0, 0x1

    .line 52
    return p0
.end method

.method private static contactForParam(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_7

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto/16 :goto_1

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p2, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    invoke-static {p2}, Lcom/mr/elaris/MessageRepeater;->isContactType(Ljava/lang/Class;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_2

    .line 19
    .line 20
    :goto_0
    return-object p1

    .line 21
    :cond_2
    const/4 p0, 0x0

    .line 22
    const-string v0, "type"

    .line 23
    .line 24
    invoke-static {p1, v0, p0}, Lcom/mr/elaris/MessageRepeater;->intField(Ljava/lang/Object;Ljava/lang/String;I)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    const-string v1, "chatType"

    .line 29
    .line 30
    invoke-static {p1, v1, p0}, Lcom/mr/elaris/MessageRepeater;->intField(Ljava/lang/Object;Ljava/lang/String;I)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-gtz p0, :cond_3

    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    :cond_3
    const-string v6, "troopUin"

    .line 38
    .line 39
    const-string v7, "friendUin"

    .line 40
    .line 41
    const-string v2, "peerUid"

    .line 42
    .line 43
    const-string v3, "peerUin"

    .line 44
    .line 45
    const-string v4, "uin"

    .line 46
    .line 47
    const-string v5, "uid"

    .line 48
    .line 49
    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {p1, v2}, Lcom/mr/elaris/MessageRepeater;->firstString(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_4

    .line 62
    .line 63
    const-string v2, "getPeerUid"

    .line 64
    .line 65
    invoke-static {p1, v2}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {v2}, Lcom/mr/elaris/MessageRepeater;->stringOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-nez v3, :cond_5

    .line 78
    .line 79
    const-string v2, "getPeerUin"

    .line 80
    .line 81
    invoke-static {p1, v2}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-static {v2}, Lcom/mr/elaris/MessageRepeater;->stringOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    :cond_5
    const-string v3, "guildId"

    .line 90
    .line 91
    const-string v4, "guildID"

    .line 92
    .line 93
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-static {p1, v5}, Lcom/mr/elaris/MessageRepeater;->firstString(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    :try_start_0
    invoke-static {p2, p0, v2, v5}, Lcom/mr/elaris/MessageRepeater;->newContact(Ljava/lang/Class;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    if-eqz v6, :cond_6

    .line 106
    .line 107
    return-object v6

    .line 108
    :cond_6
    invoke-virtual {p2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    const-string v7, "peerUid"

    .line 113
    .line 114
    const-string v8, "uin"

    .line 115
    .line 116
    const-string v9, "uid"

    .line 117
    .line 118
    const-string v10, "peerUin"

    .line 119
    .line 120
    filled-new-array {v7, v8, v9, v10}, [Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-static {v6, v2, v7}, Lcom/mr/elaris/MessageRepeater;->setAny(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-static {v6, v5, v2}, Lcom/mr/elaris/MessageRepeater;->setAny(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {v6, p0, v0}, Lcom/mr/elaris/MessageRepeater;->setAny(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    .line 144
    .line 145
    return-object v6

    .line 146
    :catchall_0
    move-exception v0

    .line 147
    move-object p0, v0

    .line 148
    new-instance v0, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    const-string v1, "repeater send failed reason=contact convert "

    .line 151
    .line 152
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string p2, " "

    .line 163
    .line 164
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string p2, ": "

    .line 179
    .line 180
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :cond_7
    :goto_1
    return-object p1
.end method

.method private static contactFromAioParam(Ljava/lang/ClassLoader;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const-string v0, "getContact"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_1
    const-string v6, "peer"

    .line 15
    .line 16
    const-string v7, "aioPeer"

    .line 17
    .line 18
    const-string v2, "contact"

    .line 19
    .line 20
    const-string v3, "aioContact"

    .line 21
    .line 22
    const-string v4, "mContact"

    .line 23
    .line 24
    const-string v5, "mAioContact"

    .line 25
    .line 26
    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {p1, v1}, Lcom/mr/elaris/MessageRepeater;->firstObject(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    const-string v1, "getAioContact"

    .line 37
    .line 38
    invoke-static {p1, v1}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :cond_2
    if-nez v1, :cond_3

    .line 43
    .line 44
    const-string v1, "getContactInfo"

    .line 45
    .line 46
    invoke-static {p1, v1}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    :cond_3
    invoke-static {v1, v0}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_4
    const-string v6, "troopUin"

    .line 58
    .line 59
    const-string v7, "friendUin"

    .line 60
    .line 61
    const-string v2, "peerUid"

    .line 62
    .line 63
    const-string v3, "peerUin"

    .line 64
    .line 65
    const-string v4, "uin"

    .line 66
    .line 67
    const-string v5, "uid"

    .line 68
    .line 69
    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v1, v0}, Lcom/mr/elaris/MessageRepeater;->firstString(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_5

    .line 82
    .line 83
    const-string v0, "getPeerUid"

    .line 84
    .line 85
    invoke-static {v1, v0}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-static {v0}, Lcom/mr/elaris/MessageRepeater;->stringOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-nez v2, :cond_6

    .line 98
    .line 99
    const-string v0, "getPeerUin"

    .line 100
    .line 101
    invoke-static {v1, v0}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {v0}, Lcom/mr/elaris/MessageRepeater;->stringOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-nez v2, :cond_7

    .line 114
    .line 115
    const-string v7, "troopUin"

    .line 116
    .line 117
    const-string v8, "friendUin"

    .line 118
    .line 119
    const-string v3, "peerUid"

    .line 120
    .line 121
    const-string v4, "peerUin"

    .line 122
    .line 123
    const-string v5, "uin"

    .line 124
    .line 125
    const-string v6, "uid"

    .line 126
    .line 127
    filled-new-array/range {v3 .. v8}, [Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {p1, v0}, Lcom/mr/elaris/MessageRepeater;->firstString(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    :cond_7
    const-string v2, "guildId"

    .line 136
    .line 137
    const-string v3, "guildID"

    .line 138
    .line 139
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-static {v1, v4}, Lcom/mr/elaris/MessageRepeater;->firstString(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-nez v5, :cond_8

    .line 152
    .line 153
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-static {p1, v2}, Lcom/mr/elaris/MessageRepeater;->firstString(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    :cond_8
    const-string v2, "type"

    .line 162
    .line 163
    const/4 v3, 0x0

    .line 164
    invoke-static {v1, v2, v3}, Lcom/mr/elaris/MessageRepeater;->intField(Ljava/lang/Object;Ljava/lang/String;I)I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    const-string v3, "chatType"

    .line 169
    .line 170
    invoke-static {p1, v3, v2}, Lcom/mr/elaris/MessageRepeater;->intField(Ljava/lang/Object;Ljava/lang/String;I)I

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    invoke-static {v1, v3, p1}, Lcom/mr/elaris/MessageRepeater;->intField(Ljava/lang/Object;Ljava/lang/String;I)I

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-gtz p1, :cond_9

    .line 179
    .line 180
    const/4 p1, 0x1

    .line 181
    :cond_9
    invoke-static {p0, p1, v0, v4}, Lcom/mr/elaris/MessageRepeater;->newContactFromData(Ljava/lang/ClassLoader;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    return-object p0
.end method

.method private static contactFromMsg(Ljava/lang/ClassLoader;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    const-string v0, "mPeer"

    .line 2
    .line 3
    const-string v1, "conversationContact"

    .line 4
    .line 5
    const-string v2, "contact"

    .line 6
    .line 7
    const-string v3, "mContact"

    .line 8
    .line 9
    const-string v4, "peer"

    .line 10
    .line 11
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p1, v0}, Lcom/mr/elaris/MessageRepeater;->firstObject(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lcom/mr/elaris/MessageRepeater;->isLikelyContact(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    invoke-static {p1}, Lcom/mr/elaris/MessageRepeater;->contactTypeFromMessage(Ljava/lang/Object;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x2

    .line 31
    if-ne v0, v1, :cond_1

    .line 32
    .line 33
    const-string v1, "troopUin"

    .line 34
    .line 35
    const-string v2, "groupUin"

    .line 36
    .line 37
    const-string v3, "peerUid"

    .line 38
    .line 39
    const-string v4, "peerUin"

    .line 40
    .line 41
    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {p1, v1}, Lcom/mr/elaris/MessageRepeater;->firstString(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_2

    .line 54
    .line 55
    const-string v1, "frienduin"

    .line 56
    .line 57
    const-string v2, "friendUin"

    .line 58
    .line 59
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {p1, v1}, Lcom/mr/elaris/MessageRepeater;->firstString(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    const-string v6, "troopUin"

    .line 69
    .line 70
    const-string v7, "groupUin"

    .line 71
    .line 72
    const-string v2, "peerUid"

    .line 73
    .line 74
    const-string v3, "peerUin"

    .line 75
    .line 76
    const-string v4, "frienduin"

    .line 77
    .line 78
    const-string v5, "friendUin"

    .line 79
    .line 80
    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {p1, v1}, Lcom/mr/elaris/MessageRepeater;->firstString(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    :cond_2
    :goto_0
    const-string v2, "guildId"

    .line 89
    .line 90
    const-string v3, "guildID"

    .line 91
    .line 92
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-static {p1, v2}, Lcom/mr/elaris/MessageRepeater;->firstString(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-static {p0, v0, v1, p1}, Lcom/mr/elaris/MessageRepeater;->newContactFromData(Ljava/lang/ClassLoader;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0
.end method

.method private static contactGuild(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "guildId"

    .line 2
    .line 3
    const-string v1, "guildID"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->firstString(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method private static contactPeer(Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v4, "troopUin"

    .line 2
    .line 3
    const-string v5, "friendUin"

    .line 4
    .line 5
    const-string v0, "peerUid"

    .line 6
    .line 7
    const-string v1, "peerUin"

    .line 8
    .line 9
    const-string v2, "uin"

    .line 10
    .line 11
    const-string v3, "uid"

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->firstString(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    const-string v0, "getPeerUid"

    .line 28
    .line 29
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Lcom/mr/elaris/MessageRepeater;->stringOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    const-string v0, "getPeerUin"

    .line 44
    .line 45
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->stringOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_1
    return-object v0
.end method

.method private static contactTypeFromMessage(Ljava/lang/Object;)I
    .locals 2

    .line 1
    const-string v0, "chatType"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, Lcom/mr/elaris/MessageRepeater;->intField(Ljava/lang/Object;Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    const-string v0, "istroop"

    .line 12
    .line 13
    const/4 v1, -0x1

    .line 14
    invoke-static {p0, v0, v1}, Lcom/mr/elaris/MessageRepeater;->intField(Ljava/lang/Object;Ljava/lang/String;I)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    const/4 v0, 0x1

    .line 19
    if-ne p0, v0, :cond_1

    .line 20
    .line 21
    const/4 p0, 0x2

    .line 22
    return p0

    .line 23
    :cond_1
    return v0
.end method

.method private static currentCustomIconPath()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "message_repeater_icon_path"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/mr/elaris/HookEntry;->runtimeString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public static bridge synthetic d(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->defaultArg(Ljava/lang/Class;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static defaultArg(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_8

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    if-ne p0, v1, :cond_1

    .line 14
    .line 15
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_1
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-ne p0, v1, :cond_2

    .line 22
    .line 23
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :cond_2
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 29
    .line 30
    if-ne p0, v1, :cond_3

    .line 31
    .line 32
    const-wide/16 v0, 0x0

    .line 33
    .line 34
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_3
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 40
    .line 41
    if-ne p0, v1, :cond_4

    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :cond_4
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    if-ne p0, v1, :cond_5

    .line 52
    .line 53
    const-wide/16 v0, 0x0

    .line 54
    .line 55
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :cond_5
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    if-ne p0, v1, :cond_6

    .line 63
    .line 64
    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :cond_6
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 70
    .line 71
    if-ne p0, v1, :cond_7

    .line 72
    .line 73
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :cond_7
    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 79
    .line 80
    if-ne p0, v1, :cond_8

    .line 81
    .line 82
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :cond_8
    :goto_0
    return-object v0
.end method

.method private static describeArgs([Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "null"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "len="

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    array-length v1, p0

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    array-length v1, p0

    .line 18
    const/4 v2, 0x5

    .line 19
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x0

    .line 24
    :goto_0
    if-ge v2, v1, :cond_2

    .line 25
    .line 26
    const-string v3, " arg"

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const/16 v3, 0x3d

    .line 35
    .line 36
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    aget-object v3, p0, v2

    .line 40
    .line 41
    invoke-static {v3}, Lcom/mr/elaris/MessageRepeater;->describeObject(Ljava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    aget-object v3, p0, v2

    .line 49
    .line 50
    instance-of v3, v3, Ljava/util/List;

    .line 51
    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    const/16 v3, 0x5b

    .line 55
    .line 56
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    aget-object v3, p0, v2

    .line 60
    .line 61
    check-cast v3, Ljava/util/List;

    .line 62
    .line 63
    invoke-static {v3}, Lcom/mr/elaris/MessageRepeater;->describeList(Ljava/util/List;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const/16 v3, 0x5d

    .line 71
    .line 72
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->safeProbe(Ljava/lang/Object;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method

.method private static describeIconCandidate(Landroid/widget/ImageView;I)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "null"

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    const-string v0, "unknown"

    .line 27
    .line 28
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, "score="

    .line 31
    .line 32
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p1, " class="

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p1, " size="

    .line 55
    .line 56
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const/4 p1, 0x1

    .line 60
    invoke-static {p0, p1}, Lcom/mr/elaris/MessageRepeater;->viewSize(Landroid/view/View;Z)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string p1, "x"

    .line 68
    .line 69
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    invoke-static {p0, p1}, Lcom/mr/elaris/MessageRepeater;->viewSize(Landroid/view/View;Z)I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string p1, " visibility="

    .line 81
    .line 82
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string p1, " alpha="

    .line 93
    .line 94
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string p1, " drawable="

    .line 105
    .line 106
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string p1, " chain="

    .line 113
    .line 114
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const/4 p1, 0x4

    .line 118
    invoke-static {p0, p1}, Lcom/mr/elaris/MessageRepeater;->viewChainText(Landroid/view/View;I)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->safeProbe(Ljava/lang/Object;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0
.end method

.method private static describeInterestingFields(Ljava/lang/Object;)Ljava/lang/String;
    .locals 11

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    :goto_0
    if-eqz v1, :cond_5

    .line 18
    .line 19
    const-class v4, Ljava/lang/Object;

    .line 20
    .line 21
    if-eq v1, v4, :cond_5

    .line 22
    .line 23
    const/16 v4, 0xa

    .line 24
    .line 25
    if-ge v3, v4, :cond_5

    .line 26
    .line 27
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 28
    .line 29
    .line 30
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    const/4 v5, 0x0

    .line 33
    :goto_1
    if-eqz v5, :cond_4

    .line 34
    .line 35
    move v6, v2

    .line 36
    :goto_2
    array-length v7, v5

    .line 37
    if-ge v6, v7, :cond_4

    .line 38
    .line 39
    if-ge v3, v4, :cond_4

    .line 40
    .line 41
    aget-object v7, v5, v6

    .line 42
    .line 43
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    if-eqz v8, :cond_1

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_1
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 59
    .line 60
    invoke-virtual {v8, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    const-class v10, Landroid/view/View;

    .line 69
    .line 70
    invoke-virtual {v10, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    if-nez v10, :cond_2

    .line 75
    .line 76
    const-class v10, Ljava/util/List;

    .line 77
    .line 78
    invoke-virtual {v10, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    if-nez v9, :cond_2

    .line 83
    .line 84
    const-string v9, "msg"

    .line 85
    .line 86
    invoke-virtual {v8, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    if-nez v9, :cond_2

    .line 91
    .line 92
    const-string v9, "menu"

    .line 93
    .line 94
    invoke-virtual {v8, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    if-nez v9, :cond_2

    .line 99
    .line 100
    const-string v9, "item"

    .line 101
    .line 102
    invoke-virtual {v8, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    if-nez v9, :cond_2

    .line 107
    .line 108
    const-string v9, "view"

    .line 109
    .line 110
    invoke-virtual {v8, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    if-nez v8, :cond_2

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_2
    const/4 v8, 0x1

    .line 118
    :try_start_1
    invoke-virtual {v7, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v7, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    if-lez v9, :cond_3

    .line 130
    .line 131
    const/16 v9, 0x20

    .line 132
    .line 133
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    :cond_3
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const/16 v7, 0x3d

    .line 144
    .line 145
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-static {v8}, Lcom/mr/elaris/MessageRepeater;->describeObject(Ljava/lang/Object;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 153
    .line 154
    .line 155
    add-int/lit8 v3, v3, 0x1

    .line 156
    .line 157
    :catchall_1
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->safeProbe(Ljava/lang/Object;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    return-object p0
.end method

.method private static describeList(Ljava/util/List;)Ljava/lang/String;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "null"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    const-string v1, "size="

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x6

    .line 25
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x0

    .line 30
    :goto_0
    if-ge v2, v1, :cond_1

    .line 31
    .line 32
    const-string v3, " item"

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const/16 v3, 0x3d

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-static {v3}, Lcom/mr/elaris/MessageRepeater;->describeObject(Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->safeProbe(Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method

.method private static describeObject(Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "null"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    instance-of v1, p0, Landroid/view/View;

    .line 15
    .line 16
    const-string v2, ")"

    .line 17
    .line 18
    const-string v3, "#"

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    move-object v1, p0

    .line 23
    check-cast v1, Landroid/view/View;

    .line 24
    .line 25
    new-instance v4, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p0, "(w="

    .line 48
    .line 49
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p0, ",h="

    .line 60
    .line 61
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string p0, ",tag="

    .line 72
    .line 73
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->safeProbe(Ljava/lang/Object;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0

    .line 95
    :cond_1
    instance-of v1, p0, Ljava/util/List;

    .line 96
    .line 97
    if-eqz v1, :cond_2

    .line 98
    .line 99
    new-instance v1, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    :cond_2
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    new-instance v4, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    if-nez p0, :cond_3

    .line 157
    .line 158
    const-string p0, ""

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    const-string v0, "("

    .line 164
    .line 165
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-static {v1}, Lcom/mr/elaris/MessageRepeater;->safeProbe(Ljava/lang/Object;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    :goto_0
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    return-object p0
.end method

.method private static dp(Landroid/view/View;F)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    mul-float/2addr p1, p0

    .line 12
    const/high16 p0, 0x3f000000    # 0.5f

    .line 13
    .line 14
    add-float/2addr p1, p0

    .line 15
    float-to-int p0, p1

    .line 16
    return p0
.end method

.method public static bridge synthetic e([Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->describeArgs([Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static elementsFromMsg(Ljava/lang/Object;)Ljava/util/List;
    .locals 4

    .line 1
    const-string v0, "getElements"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Ljava/util/List;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Ljava/util/List;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    const-string v0, "msgElementList"

    .line 15
    .line 16
    const-string v1, "elementList"

    .line 17
    .line 18
    const-string v2, "elements"

    .line 19
    .line 20
    const-string v3, "msgElements"

    .line 21
    .line 22
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->firstObject(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    instance-of v0, p0, Ljava/util/List;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    check-cast p0, Ljava/util/List;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    const/4 p0, 0x0

    .line 38
    return-object p0
.end method

.method public static bridge synthetic f(Ljava/lang/Object;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->findRepeaterImageView(Ljava/lang/Object;)Landroid/widget/ImageView;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static field(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    if-eqz v1, :cond_1

    .line 12
    .line 13
    const-class v2, Ljava/lang/Object;

    .line 14
    .line 15
    if-eq v1, v2, :cond_1

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    return-object p0

    .line 30
    :catchall_0
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    :goto_1
    return-object v0
.end method

.method private static varargs findAnyClass(Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/lang/Class;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    array-length v2, p1

    .line 4
    if-ge v1, v2, :cond_1

    .line 5
    .line 6
    aget-object v2, p1, v1

    .line 7
    .line 8
    invoke-static {v2, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    return-object v2

    .line 15
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    new-instance p0, Ljava/lang/ClassNotFoundException;

    .line 19
    .line 20
    array-length v1, p1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    const-string p1, ""

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_2
    aget-object p1, p1, v0

    .line 27
    .line 28
    :goto_1
    invoke-direct {p0, p1}, Ljava/lang/ClassNotFoundException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0
.end method

.method private static findField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Field;"
        }
    .end annotation

    .line 1
    :goto_0
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-class v0, Ljava/lang/Object;

    .line 4
    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return-object p0

    .line 12
    :catchall_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method private static findMethod(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/reflect/Method;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "I)",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    .line 1
    :goto_0
    if-eqz p0, :cond_4

    .line 2
    .line 3
    const-class v0, Ljava/lang/Object;

    .line 4
    .line 5
    if-eq p0, v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_1
    array-length v2, v0

    .line 13
    if-ge v1, v2, :cond_3

    .line 14
    .line 15
    aget-object v2, v0, v1

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_0
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    array-length v3, v3

    .line 44
    if-ne v3, p2, :cond_2

    .line 45
    .line 46
    return-object v2

    .line 47
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    goto :goto_0

    .line 55
    :cond_4
    const/4 p0, 0x0

    .line 56
    return-object p0
.end method

.method private static findMsgRecordByText(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->messageIdFromText(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    sget-object v0, Lcom/mr/elaris/MessageRepeater;->AIO_MSG_RECORD_BY_ID:Ljava/util/Map;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    monitor-exit v0

    .line 21
    return-object p0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p0
.end method

.method private static findMsgRecordLike(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_8

    .line 3
    .line 4
    const/4 v1, 0x3

    .line 5
    if-le p1, v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_5

    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "msgrecord"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_7

    .line 28
    .line 29
    const-string v2, ".messagerecord"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_7

    .line 36
    .line 37
    const-string v2, ".chatmessage"

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    goto :goto_4

    .line 46
    :cond_1
    instance-of v1, p0, Ljava/lang/CharSequence;

    .line 47
    .line 48
    if-nez v1, :cond_6

    .line 49
    .line 50
    instance-of v1, p0, Ljava/lang/Number;

    .line 51
    .line 52
    if-nez v1, :cond_6

    .line 53
    .line 54
    instance-of v1, p0, Ljava/lang/Boolean;

    .line 55
    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    :goto_0
    if-eqz v1, :cond_6

    .line 64
    .line 65
    const-class v2, Ljava/lang/Object;

    .line 66
    .line 67
    if-eq v1, v2, :cond_6

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    const/4 v3, 0x0

    .line 74
    :goto_1
    array-length v4, v2

    .line 75
    if-ge v3, v4, :cond_5

    .line 76
    .line 77
    aget-object v4, v2, v3

    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-nez v5, :cond_4

    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-eqz v5, :cond_3

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    const/4 v5, 0x1

    .line 101
    :try_start_0
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    add-int/2addr v5, p1

    .line 109
    invoke-static {v4, v5}, Lcom/mr/elaris/MessageRepeater;->findMsgRecordLike(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    if-eqz v4, :cond_4

    .line 114
    .line 115
    return-object v4

    .line 116
    :catchall_0
    :cond_4
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    goto :goto_0

    .line 124
    :cond_6
    :goto_3
    return-object v0

    .line 125
    :cond_7
    :goto_4
    return-object p0

    .line 126
    :cond_8
    :goto_5
    return-object v0
.end method

.method private static findObjectByType(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;I)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_b

    .line 3
    .line 4
    if-eqz p1, :cond_b

    .line 5
    .line 6
    if-gez p2, :cond_0

    .line 7
    .line 8
    goto/16 :goto_5

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    instance-of v1, p0, Ljava/lang/CharSequence;

    .line 18
    .line 19
    if-nez v1, :cond_b

    .line 20
    .line 21
    instance-of v1, p0, Ljava/lang/Number;

    .line 22
    .line 23
    if-nez v1, :cond_b

    .line 24
    .line 25
    instance-of v1, p0, Ljava/lang/Boolean;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    goto/16 :goto_5

    .line 30
    .line 31
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "java."

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_b

    .line 46
    .line 47
    const-string v3, "android."

    .line 48
    .line 49
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :goto_0
    if-eqz v1, :cond_b

    .line 62
    .line 63
    const-class v4, Ljava/lang/Object;

    .line 64
    .line 65
    if-eq v1, v4, :cond_b

    .line 66
    .line 67
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 68
    .line 69
    .line 70
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    goto :goto_1

    .line 72
    :catchall_0
    move-object v4, v0

    .line 73
    :goto_1
    if-eqz v4, :cond_a

    .line 74
    .line 75
    const/4 v5, 0x0

    .line 76
    :goto_2
    array-length v6, v4

    .line 77
    if-ge v5, v6, :cond_a

    .line 78
    .line 79
    aget-object v6, v4, v5

    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-eqz v7, :cond_4

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_4
    const/4 v7, 0x1

    .line 93
    :try_start_1
    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-virtual {p1, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-eqz v8, :cond_5

    .line 105
    .line 106
    return-object v6

    .line 107
    :cond_5
    if-eqz v6, :cond_6

    .line 108
    .line 109
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    const-string v9, "Lazy"

    .line 118
    .line 119
    invoke-virtual {v8, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    if-eqz v8, :cond_6

    .line 124
    .line 125
    const-string v8, "getValue"

    .line 126
    .line 127
    invoke-static {v6, v8}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    goto :goto_3

    .line 132
    :cond_6
    move-object v8, v0

    .line 133
    :goto_3
    invoke-virtual {p1, v8}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v9

    .line 137
    if-eqz v9, :cond_7

    .line 138
    .line 139
    return-object v8

    .line 140
    :cond_7
    if-nez v6, :cond_8

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_8
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    invoke-virtual {v8, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    if-nez v9, :cond_9

    .line 156
    .line 157
    invoke-virtual {v8, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    if-nez v8, :cond_9

    .line 162
    .line 163
    add-int/lit8 v7, p2, -0x1

    .line 164
    .line 165
    invoke-static {v6, p1, v7}, Lcom/mr/elaris/MessageRepeater;->findObjectByType(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 169
    if-eqz v6, :cond_9

    .line 170
    .line 171
    return-object v6

    .line 172
    :catchall_1
    :cond_9
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_a
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    goto :goto_0

    .line 180
    :cond_b
    :goto_5
    return-object v0
.end method

.method private static findRepeaterImageView(Ljava/lang/Object;)Landroid/widget/ImageView;
    .locals 7

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->cachedRepeaterImageView(Ljava/lang/Object;)Landroid/widget/ImageView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/mr/elaris/MessageRepeater;->isCachedRepeaterIconCandidate(Landroid/widget/ImageView;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->removeCachedRepeaterImageView(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v2, 0x4

    .line 32
    invoke-static {p0, v0, v1, v2}, Lcom/mr/elaris/MessageRepeater;->collectImageViews(Ljava/lang/Object;Ljava/util/List;Ljava/util/Set;I)V

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    const/high16 v2, -0x80000000

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    move-object v4, v1

    .line 40
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-ge v3, v5, :cond_3

    .line 45
    .line 46
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    check-cast v5, Landroid/widget/ImageView;

    .line 51
    .line 52
    invoke-static {v5}, Lcom/mr/elaris/MessageRepeater;->repeaterIconScore(Landroid/widget/ImageView;)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-le v6, v2, :cond_2

    .line 57
    .line 58
    move-object v4, v5

    .line 59
    move v2, v6

    .line 60
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    if-eqz v4, :cond_4

    .line 64
    .line 65
    invoke-static {v4, v2}, Lcom/mr/elaris/MessageRepeater;->isSafeRepeaterIconCandidate(Landroid/widget/ImageView;I)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_4

    .line 70
    .line 71
    invoke-static {p0, v4}, Lcom/mr/elaris/MessageRepeater;->cacheRepeaterImageView(Ljava/lang/Object;Landroid/widget/ImageView;)V

    .line 72
    .line 73
    .line 74
    return-object v4

    .line 75
    :cond_4
    if-nez p0, :cond_5

    .line 76
    .line 77
    const-string p0, "null"

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    :goto_1
    const-string v3, "icon-candidate|"

    .line 89
    .line 90
    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->shouldLogFollowProbe(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-eqz p0, :cond_6

    .line 99
    .line 100
    new-instance p0, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v3, "repeater icon skipped reason=no safe icon candidate count="

    .line 103
    .line 104
    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v0, " best="

    .line 115
    .line 116
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-static {v4, v2}, Lcom/mr/elaris/MessageRepeater;->describeIconCandidate(Landroid/widget/ImageView;I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_6
    return-object v1
.end method

.method private static findReturnByName(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_4

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto :goto_2

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    array-length v3, v1

    .line 17
    if-ge v2, v3, :cond_4

    .line 18
    .line 19
    aget-object v3, v1, v2

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    array-length v4, v4

    .line 26
    if-nez v4, :cond_3

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    if-eqz v4, :cond_3

    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v4, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    const/4 v4, 0x1

    .line 57
    :try_start_0
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    if-eqz v3, :cond_3

    .line 65
    .line 66
    return-object v3

    .line 67
    :catchall_0
    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    :goto_2
    return-object v0
.end method

.method private static firstContactArg([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    :goto_0
    array-length v2, p0

    .line 7
    if-ge v1, v2, :cond_2

    .line 8
    .line 9
    aget-object v2, p0, v1

    .line 10
    .line 11
    invoke-static {v2}, Lcom/mr/elaris/MessageRepeater;->isLikelyContact(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    return-object v2

    .line 18
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    return-object v0
.end method

.method private static firstIntArg([Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    :goto_0
    array-length v2, p0

    .line 7
    if-ge v1, v2, :cond_2

    .line 8
    .line 9
    aget-object v2, p0, v1

    .line 10
    .line 11
    instance-of v3, v2, Ljava/lang/Number;

    .line 12
    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    check-cast v2, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    return-object v0
.end method

.method private static firstListArg([Ljava/lang/Object;)Ljava/util/List;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    :goto_0
    array-length v2, p0

    .line 7
    if-ge v1, v2, :cond_2

    .line 8
    .line 9
    aget-object v2, p0, v1

    .line 10
    .line 11
    instance-of v3, v2, Ljava/util/List;

    .line 12
    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    check-cast v2, Ljava/util/List;

    .line 16
    .line 17
    return-object v2

    .line 18
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    return-object v0
.end method

.method private static firstMsgRecordArg([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    :goto_0
    array-length v2, p0

    .line 7
    if-ge v1, v2, :cond_2

    .line 8
    .line 9
    aget-object v2, p0, v1

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {v3}, Lcom/mr/elaris/MessageRepeater;->isMsgRecordClass(Ljava/lang/Class;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    return-object v2

    .line 24
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    return-object v0
.end method

.method private static varargs firstObject(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    if-ge v0, v1, :cond_1

    .line 4
    .line 5
    aget-object v1, p1, v0

    .line 6
    .line 7
    invoke-static {p0, v1}, Lcom/mr/elaris/MessageRepeater;->field(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method private static varargs firstString(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/MessageRepeater;->firstObject(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-string p0, ""

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method private static freshTextElements(Ljava/lang/ClassLoader;Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/mr/elaris/MessageRepeater;->isPlainTextMessage(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-static {p1}, Lcom/mr/elaris/MessageRepeater;->msgText(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_1
    const-string v0, "repeater"

    .line 21
    .line 22
    invoke-static {p0, p1, v0}, Lcom/mr/elaris/MessageRepeater;->textElementsFromText(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->firstContactArg([Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static generateMsgUniqueId(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Long;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-static {p1}, Lcom/mr/elaris/MessageRepeater;->contactChatType(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const-string v4, "generateMsgUniqueId"

    .line 18
    .line 19
    invoke-static {v3, v4}, Lcom/mr/elaris/MessageRepeater;->methodsNamed(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const/4 v4, 0x0

    .line 24
    move v5, v4

    .line 25
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-ge v5, v6, :cond_6

    .line 30
    .line 31
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    check-cast v6, Ljava/lang/reflect/Method;

    .line 36
    .line 37
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    const/4 v8, 0x1

    .line 42
    :try_start_0
    invoke-virtual {v6, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 43
    .line 44
    .line 45
    array-length v9, v7

    .line 46
    const/4 v10, 0x2

    .line 47
    if-ne v9, v10, :cond_1

    .line 48
    .line 49
    aget-object v9, v7, v4

    .line 50
    .line 51
    invoke-static {v9}, Lcom/mr/elaris/MessageRepeater;->isIntType(Ljava/lang/Class;)Z

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    if-eqz v9, :cond_1

    .line 56
    .line 57
    aget-object v9, v7, v8

    .line 58
    .line 59
    invoke-static {v9}, Lcom/mr/elaris/MessageRepeater;->isLongType(Ljava/lang/Class;)Z

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    if-eqz v9, :cond_1

    .line 64
    .line 65
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    filled-new-array {v7, v8}, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {v6, p0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    goto :goto_1

    .line 82
    :cond_1
    array-length v9, v7

    .line 83
    if-ne v9, v10, :cond_2

    .line 84
    .line 85
    aget-object v9, v7, v4

    .line 86
    .line 87
    invoke-static {v9}, Lcom/mr/elaris/MessageRepeater;->isLongType(Ljava/lang/Class;)Z

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    if-eqz v9, :cond_2

    .line 92
    .line 93
    aget-object v9, v7, v8

    .line 94
    .line 95
    invoke-static {v9}, Lcom/mr/elaris/MessageRepeater;->isIntType(Ljava/lang/Class;)Z

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    if-eqz v9, :cond_2

    .line 100
    .line 101
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    filled-new-array {v7, v8}, [Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    invoke-virtual {v6, p0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    goto :goto_1

    .line 118
    :cond_2
    array-length v9, v7

    .line 119
    if-ne v9, v8, :cond_3

    .line 120
    .line 121
    aget-object v8, v7, v4

    .line 122
    .line 123
    invoke-static {v8}, Lcom/mr/elaris/MessageRepeater;->isLongType(Ljava/lang/Class;)Z

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    if-eqz v8, :cond_3

    .line 128
    .line 129
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    invoke-virtual {v6, p0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    goto :goto_1

    .line 142
    :cond_3
    array-length v7, v7

    .line 143
    if-nez v7, :cond_4

    .line 144
    .line 145
    invoke-virtual {v6, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    goto :goto_1

    .line 150
    :cond_4
    move-object v6, v0

    .line 151
    :goto_1
    instance-of v7, v6, Ljava/lang/Number;

    .line 152
    .line 153
    if-eqz v7, :cond_5

    .line 154
    .line 155
    check-cast v6, Ljava/lang/Number;

    .line 156
    .line 157
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 158
    .line 159
    .line 160
    move-result-wide v6

    .line 161
    const-wide/16 v8, 0x0

    .line 162
    .line 163
    cmp-long v8, v6, v8

    .line 164
    .line 165
    if-eqz v8, :cond_5

    .line 166
    .line 167
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 168
    .line 169
    .line 170
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 171
    return-object p0

    .line 172
    :catchall_0
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 173
    .line 174
    goto/16 :goto_0

    .line 175
    .line 176
    :cond_6
    return-object v0
.end method

.method public static bridge synthetic h([Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->firstIntArg([Ljava/lang/Object;)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static hasContactParam(Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    move v1, v0

    .line 10
    :goto_0
    array-length v2, p0

    .line 11
    if-ge v1, v2, :cond_2

    .line 12
    .line 13
    aget-object v2, p0, v1

    .line 14
    .line 15
    invoke-static {v2}, Lcom/mr/elaris/MessageRepeater;->isContactType(Ljava/lang/Class;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    return v0
.end method

.method private static hasNonTextElement(Ljava/lang/Object;)Z
    .locals 18

    .line 1
    const-string v16, "getReplyElement"

    .line 2
    .line 3
    const-string v17, "getMultiForwardMsgElement"

    .line 4
    .line 5
    const-string v1, "getPicElement"

    .line 6
    .line 7
    const-string v2, "getMarketFaceElement"

    .line 8
    .line 9
    const-string v3, "getStructMsgElement"

    .line 10
    .line 11
    const-string v4, "getArkElement"

    .line 12
    .line 13
    const-string v5, "getFileElement"

    .line 14
    .line 15
    const-string v6, "getPttElement"

    .line 16
    .line 17
    const-string v7, "getVideoElement"

    .line 18
    .line 19
    const-string v8, "getVoiceElement"

    .line 20
    .line 21
    const-string v9, "getAudioElement"

    .line 22
    .line 23
    const-string v10, "getFaceElement"

    .line 24
    .line 25
    const-string v11, "getEmojiElement"

    .line 26
    .line 27
    const-string v12, "getSysFaceElement"

    .line 28
    .line 29
    const-string v13, "getSmallYellowFaceElement"

    .line 30
    .line 31
    const-string v14, "getFaceBubbleElement"

    .line 32
    .line 33
    const-string v15, "getAniStickerElement"

    .line 34
    .line 35
    filled-new-array/range {v1 .. v17}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/4 v1, 0x0

    .line 40
    move v2, v1

    .line 41
    :goto_0
    const/16 v3, 0x11

    .line 42
    .line 43
    if-ge v2, v3, :cond_1

    .line 44
    .line 45
    aget-object v3, v0, v2

    .line 46
    .line 47
    move-object/from16 v4, p0

    .line 48
    .line 49
    invoke-static {v4, v3}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    return v0

    .line 57
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    return v1
.end method

.method private static hasParam(Ljava/lang/reflect/Method;Ljava/lang/Class;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    :goto_0
    array-length v2, p0

    .line 8
    if-ge v1, v2, :cond_1

    .line 9
    .line 10
    aget-object v2, p0, v1

    .line 11
    .line 12
    invoke-virtual {p1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return v0
.end method

.method private static hasRepeaterCue(Landroid/widget/ImageView;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->viewCueText(Landroid/view/View;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "+1"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    const-string v0, "plus"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    const-string v0, "repeat"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    const-string v0, "repeater"

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    const-string v0, "\u590d\u8bfb"

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 p0, 0x0

    .line 47
    return p0

    .line 48
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 49
    return p0
.end method

.method private static hasReplyElementInElements(Ljava/util/List;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_3

    .line 11
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/16 v2, 0xc

    .line 16
    .line 17
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    move v2, v0

    .line 22
    :goto_0
    if-ge v2, v1, :cond_5

    .line 23
    .line 24
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const-string v4, "getReplyElement"

    .line 32
    .line 33
    invoke-static {v3, v4}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const/4 v5, 0x1

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    return v5

    .line 41
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 50
    .line 51
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const-string v4, "reply"

    .line 56
    .line 57
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-nez v4, :cond_4

    .line 62
    .line 63
    const-string v4, "quote"

    .line 64
    .line 65
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    :goto_2
    return v5

    .line 76
    :cond_5
    :goto_3
    return v0
.end method

.method private static hasReplyMetadata(Ljava/lang/Object;I)Z
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_12

    .line 7
    .line 8
    const/4 v3, 0x3

    .line 9
    if-le v1, v3, :cond_0

    .line 10
    .line 11
    goto/16 :goto_8

    .line 12
    .line 13
    :cond_0
    instance-of v3, v0, Ljava/lang/CharSequence;

    .line 14
    .line 15
    if-nez v3, :cond_12

    .line 16
    .line 17
    instance-of v3, v0, Ljava/lang/Number;

    .line 18
    .line 19
    if-nez v3, :cond_12

    .line 20
    .line 21
    instance-of v3, v0, Ljava/lang/Boolean;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    goto/16 :goto_8

    .line 26
    .line 27
    :cond_1
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 36
    .line 37
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    const-string v3, ""

    .line 43
    .line 44
    :goto_0
    const-string v4, "reply"

    .line 45
    .line 46
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    const/4 v6, 0x1

    .line 51
    if-nez v5, :cond_11

    .line 52
    .line 53
    const-string v5, "quote"

    .line 54
    .line 55
    invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    goto/16 :goto_7

    .line 62
    .line 63
    :cond_2
    invoke-static {v0}, Lcom/mr/elaris/MessageRepeater;->elementsFromMsg(Ljava/lang/Object;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {v3}, Lcom/mr/elaris/MessageRepeater;->hasReplyElementInElements(Ljava/util/List;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_3

    .line 72
    .line 73
    return v6

    .line 74
    :cond_3
    invoke-static {v0}, Lcom/mr/elaris/MessageRepeater;->attrsFromMsg(Ljava/lang/Object;)Ljava/util/Map;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-static {v3}, Lcom/mr/elaris/MessageRepeater;->hasReplyMetadataInMap(Ljava/util/Map;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_4

    .line 83
    .line 84
    return v6

    .line 85
    :cond_4
    const-string v18, "getRefMsg"

    .line 86
    .line 87
    const-string v19, "getRefMsgInfo"

    .line 88
    .line 89
    const-string v7, "getReplyElement"

    .line 90
    .line 91
    const-string v8, "getReplyMsg"

    .line 92
    .line 93
    const-string v9, "getReplyMsgInfo"

    .line 94
    .line 95
    const-string v10, "getReplyMsgMainInfo"

    .line 96
    .line 97
    const-string v11, "getSourceMsg"

    .line 98
    .line 99
    const-string v12, "getSourceMsgInfo"

    .line 100
    .line 101
    const-string v13, "getSrcMsg"

    .line 102
    .line 103
    const-string v14, "getSrcMsgInfo"

    .line 104
    .line 105
    const-string v15, "getQuote"

    .line 106
    .line 107
    const-string v16, "getQuoteInfo"

    .line 108
    .line 109
    const-string v17, "getQuotedMsg"

    .line 110
    .line 111
    filled-new-array/range {v7 .. v19}, [Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    move v7, v2

    .line 116
    :goto_1
    const/16 v8, 0xd

    .line 117
    .line 118
    if-ge v7, v8, :cond_6

    .line 119
    .line 120
    aget-object v8, v3, v7

    .line 121
    .line 122
    invoke-static {v0, v8}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    if-eqz v8, :cond_5

    .line 127
    .line 128
    return v6

    .line 129
    :cond_5
    add-int/lit8 v7, v7, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_6
    const-string v22, "mReplyMsg"

    .line 133
    .line 134
    const-string v23, "mSourceMsg"

    .line 135
    .line 136
    const-string v8, "replyElement"

    .line 137
    .line 138
    const-string v9, "replyInfo"

    .line 139
    .line 140
    const-string v10, "replyMsg"

    .line 141
    .line 142
    const-string v11, "replyMsgInfo"

    .line 143
    .line 144
    const-string v12, "replyMsgMainInfo"

    .line 145
    .line 146
    const-string v13, "sourceMsg"

    .line 147
    .line 148
    const-string v14, "sourceMsgInfo"

    .line 149
    .line 150
    const-string v15, "srcMsg"

    .line 151
    .line 152
    const-string v16, "srcMsgInfo"

    .line 153
    .line 154
    const-string v17, "quote"

    .line 155
    .line 156
    const-string v18, "quoteInfo"

    .line 157
    .line 158
    const-string v19, "quotedMsg"

    .line 159
    .line 160
    const-string v20, "refMsg"

    .line 161
    .line 162
    const-string v21, "refMsgInfo"

    .line 163
    .line 164
    filled-new-array/range {v8 .. v23}, [Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    move v7, v2

    .line 169
    :goto_2
    const/16 v8, 0x10

    .line 170
    .line 171
    if-ge v7, v8, :cond_8

    .line 172
    .line 173
    aget-object v8, v3, v7

    .line 174
    .line 175
    invoke-static {v0, v8}, Lcom/mr/elaris/MessageRepeater;->field(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    if-eqz v8, :cond_7

    .line 180
    .line 181
    return v6

    .line 182
    :cond_7
    add-int/lit8 v7, v7, 0x1

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_8
    const/4 v3, 0x2

    .line 186
    if-lt v1, v3, :cond_9

    .line 187
    .line 188
    return v2

    .line 189
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    :goto_3
    if-eqz v3, :cond_10

    .line 194
    .line 195
    const-class v7, Ljava/lang/Object;

    .line 196
    .line 197
    if-eq v3, v7, :cond_10

    .line 198
    .line 199
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 200
    .line 201
    .line 202
    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 203
    goto :goto_4

    .line 204
    :catchall_1
    const/4 v7, 0x0

    .line 205
    :goto_4
    if-eqz v7, :cond_f

    .line 206
    .line 207
    move v8, v2

    .line 208
    :goto_5
    array-length v9, v7

    .line 209
    if-ge v8, v9, :cond_f

    .line 210
    .line 211
    aget-object v9, v7, v8

    .line 212
    .line 213
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 218
    .line 219
    .line 220
    move-result v10

    .line 221
    if-nez v10, :cond_e

    .line 222
    .line 223
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    move-result-object v10

    .line 227
    invoke-virtual {v10}, Ljava/lang/Class;->isPrimitive()Z

    .line 228
    .line 229
    .line 230
    move-result v10

    .line 231
    if-eqz v10, :cond_a

    .line 232
    .line 233
    goto :goto_6

    .line 234
    :cond_a
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v10

    .line 238
    sget-object v11, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 239
    .line 240
    invoke-virtual {v10, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v10

    .line 244
    invoke-virtual {v10, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 245
    .line 246
    .line 247
    move-result v11

    .line 248
    if-nez v11, :cond_b

    .line 249
    .line 250
    invoke-virtual {v10, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 251
    .line 252
    .line 253
    move-result v10

    .line 254
    if-nez v10, :cond_b

    .line 255
    .line 256
    goto :goto_6

    .line 257
    :cond_b
    :try_start_2
    invoke-virtual {v9, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v9, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v9

    .line 264
    if-nez v9, :cond_c

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_c
    invoke-static {v9}, Lcom/mr/elaris/MessageRepeater;->isMeaningfulReplyValue(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v10

    .line 271
    if-eqz v10, :cond_d

    .line 272
    .line 273
    return v6

    .line 274
    :cond_d
    add-int/lit8 v10, v1, 0x1

    .line 275
    .line 276
    invoke-static {v9, v10}, Lcom/mr/elaris/MessageRepeater;->hasReplyMetadata(Ljava/lang/Object;I)Z

    .line 277
    .line 278
    .line 279
    move-result v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 280
    if-eqz v9, :cond_e

    .line 281
    .line 282
    return v6

    .line 283
    :catchall_2
    :cond_e
    :goto_6
    add-int/lit8 v8, v8, 0x1

    .line 284
    .line 285
    goto :goto_5

    .line 286
    :cond_f
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    goto :goto_3

    .line 291
    :cond_10
    return v2

    .line 292
    :cond_11
    :goto_7
    return v6

    .line 293
    :cond_12
    :goto_8
    return v2
.end method

.method private static hasReplyMetadataInMap(Ljava/util/Map;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    move v1, v0

    .line 20
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_3

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    add-int/lit8 v3, v1, 0x1

    .line 33
    .line 34
    const/16 v4, 0x18

    .line 35
    .line 36
    if-le v1, v4, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    check-cast v2, Ljava/util/Map$Entry;

    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 50
    .line 51
    invoke-virtual {v1, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v1}, Lcom/mr/elaris/MessageRepeater;->isReplyKey(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {v1}, Lcom/mr/elaris/MessageRepeater;->isMeaningfulReplyValue(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    if-eqz v1, :cond_2

    .line 70
    .line 71
    const/4 p0, 0x1

    .line 72
    return p0

    .line 73
    :cond_2
    move v1, v3

    .line 74
    goto :goto_0

    .line 75
    :catchall_0
    :cond_3
    :goto_1
    return v0
.end method

.method private static hasSendableReplyStructure(Ljava/util/List;Ljava/util/Map;)Z
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->hasReplyElementInElements(Ljava/util/List;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_4

    .line 7
    .line 8
    invoke-static {p1}, Lcom/mr/elaris/MessageRepeater;->hasReplyMetadataInMap(Ljava/util/Map;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    if-eqz p0, :cond_3

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/16 v2, 0xc

    .line 30
    .line 31
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    move v2, p1

    .line 36
    :goto_0
    if-ge v2, v0, :cond_3

    .line 37
    .line 38
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {v3, v1}, Lcom/mr/elaris/MessageRepeater;->hasReplyMetadata(Ljava/lang/Object;I)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    return v1

    .line 49
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    :goto_1
    return p1

    .line 53
    :cond_4
    :goto_2
    return v1
.end method

.method private static hasTextElement(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const-string v0, "getTextElement"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "getTextMsgElement"

    .line 10
    .line 11
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method private static hookAioMsgRecordMap(Ljava/lang/ClassLoader;)I
    .locals 7

    .line 1
    const-string v0, ": "

    .line 2
    .line 3
    const-string v1, "com.tencent.mobileqq.aio.msg.AIOMsgItem"

    .line 4
    .line 5
    const-string v2, "target.repeater_menu.msg_class"

    .line 6
    .line 7
    const-string v3, "repeater hook install failed reason=AIOMsgItem ctor "

    .line 8
    .line 9
    const-string v4, "repeater hook installed class="

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    :try_start_0
    invoke-static {p0, v2, v1}, Lt2;->i(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    :try_start_1
    new-instance v1, Lcom/mr/elaris/h;

    .line 19
    .line 20
    const/16 v6, 0x10

    .line 21
    .line 22
    invoke-direct {v1, v6}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v1}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-static {v2, v6}, Lt2;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance v2, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p0, " method=<init>/MsgRecord"

    .line 56
    .line 57
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    .line 66
    .line 67
    return v1

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    return v5

    .line 71
    :catchall_1
    move-exception p0

    .line 72
    move v1, v5

    .line 73
    :goto_0
    :try_start_3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return v1

    .line 107
    :catchall_2
    move-exception p0

    .line 108
    goto :goto_1

    .line 109
    :cond_1
    new-instance p0, Ljava/lang/ClassNotFoundException;

    .line 110
    .line 111
    invoke-direct {p0, v1}, Ljava/lang/ClassNotFoundException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 115
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v2, "repeater hook install failed reason=AIOMsgItem "

    .line 118
    .line 119
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-static {p0, v1, v0}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return v5
.end method

.method private static hookAioParam(Ljava/lang/ClassLoader;)I
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, ": "

    .line 4
    .line 5
    const-string v3, " "

    .line 6
    .line 7
    const-string v4, "repeater hook installed class="

    .line 8
    .line 9
    const-string v0, "com.tencent.aio.data.AIOParam"

    .line 10
    .line 11
    const-string v5, "target.repeater.aio_param_class"

    .line 12
    .line 13
    invoke-static {v1, v5, v0}, Lt2;->i(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    const/4 v7, 0x0

    .line 18
    if-nez v6, :cond_0

    .line 19
    .line 20
    const-string v0, "repeater hook install failed reason=AIOParam missing"

    .line 21
    .line 22
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return v7

    .line 26
    :cond_0
    sget-object v0, Lcom/mr/elaris/MessageRepeater;->AIO_PARAM_HOST_CLASSES:[Ljava/lang/String;

    .line 27
    .line 28
    const-string v8, "target.repeater.aio_param_host_classes"

    .line 29
    .line 30
    invoke-static {v8, v0, v1}, Lt2;->f(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/ClassLoader;)[Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v9

    .line 34
    move v10, v7

    .line 35
    move v11, v10

    .line 36
    :goto_0
    array-length v0, v9

    .line 37
    if-ge v10, v0, :cond_6

    .line 38
    .line 39
    aget-object v0, v9, v10

    .line 40
    .line 41
    invoke-static {v0, v1}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v12

    .line 45
    if-nez v12, :cond_1

    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_1
    :try_start_0
    new-instance v0, Lcom/mr/elaris/j;

    .line 50
    .line 51
    invoke-direct {v0, v6}, Lcom/mr/elaris/j;-><init>(Ljava/lang/Class;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v12, v0}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_2

    .line 63
    .line 64
    add-int/lit8 v11, v11, 0x1

    .line 65
    .line 66
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v5, v0}, Lt2;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v8, v12}, Lcom/mr/elaris/MessageRepeater;->cacheClassList(Ljava/lang/String;Ljava/lang/Class;)V

    .line 74
    .line 75
    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v13

    .line 88
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v13, " method=<init>"

    .line 92
    .line 93
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    new-instance v13, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v14, "repeater hook install failed reason=AIOParam ctor "

    .line 108
    .line 109
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v14

    .line 116
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v14

    .line 126
    invoke-virtual {v14}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v14

    .line 130
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    :cond_2
    :goto_1
    invoke-virtual {v12}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 151
    .line 152
    .line 153
    move-result-object v13

    .line 154
    move v14, v7

    .line 155
    :goto_2
    array-length v0, v13

    .line 156
    if-ge v14, v0, :cond_5

    .line 157
    .line 158
    aget-object v15, v13, v14

    .line 159
    .line 160
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_3

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_3
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v6, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-nez v0, :cond_4

    .line 180
    .line 181
    invoke-static {v15, v6}, Lcom/mr/elaris/MessageRepeater;->hasParam(Ljava/lang/reflect/Method;Ljava/lang/Class;)Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-nez v0, :cond_4

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_4
    const/4 v0, 0x1

    .line 189
    :try_start_1
    invoke-virtual {v15, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 190
    .line 191
    .line 192
    new-instance v0, Lcom/mr/elaris/k;

    .line 193
    .line 194
    invoke-direct {v0, v6}, Lcom/mr/elaris/k;-><init>(Ljava/lang/Class;)V

    .line 195
    .line 196
    .line 197
    invoke-static {v15, v0}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 198
    .line 199
    .line 200
    add-int/lit8 v11, v11, 0x1

    .line 201
    .line 202
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-static {v5, v0}, Lt2;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-static {v8, v12}, Lcom/mr/elaris/MessageRepeater;->cacheClassList(Ljava/lang/String;Ljava/lang/Class;)V

    .line 210
    .line 211
    .line 212
    new-instance v0, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    const-string v7, " method="

    .line 228
    .line 229
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 244
    .line 245
    .line 246
    goto :goto_3

    .line 247
    :catchall_1
    move-exception v0

    .line 248
    new-instance v7, Ljava/lang/StringBuilder;

    .line 249
    .line 250
    const-string v1, "repeater hook install failed reason=AIOParam method "

    .line 251
    .line 252
    invoke-direct {v7, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    const-string v1, "#"

    .line 263
    .line 264
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-static {v0, v7, v2}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    :goto_3
    add-int/lit8 v14, v14, 0x1

    .line 281
    .line 282
    move-object/from16 v1, p0

    .line 283
    .line 284
    const/4 v7, 0x0

    .line 285
    goto/16 :goto_2

    .line 286
    .line 287
    :cond_5
    :goto_4
    add-int/lit8 v10, v10, 0x1

    .line 288
    .line 289
    move-object/from16 v1, p0

    .line 290
    .line 291
    const/4 v7, 0x0

    .line 292
    goto/16 :goto_0

    .line 293
    .line 294
    :cond_6
    return v11
.end method

.method private static hookMessageFollowRepeater(Ljava/lang/ClassLoader;)I
    .locals 11

    .line 1
    const-string v0, "com.tencent.mobileqq.aio.msglist.holder.component.msgfollow.AIOMsgFollowComponent"

    .line 2
    .line 3
    const-string v1, "target.repeater.follow_component_class"

    .line 4
    .line 5
    sget-boolean v2, Lcom/mr/elaris/MessageRepeater;->sFollowHookInstalled:Z

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    return v3

    .line 11
    :cond_0
    :try_start_0
    invoke-static {p0, v1, v0}, Lt2;->i(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_5

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    move v4, v3

    .line 22
    move v5, v4

    .line 23
    :goto_0
    array-length v6, v0

    .line 24
    const/4 v7, 0x1

    .line 25
    if-ge v4, v6, :cond_3

    .line 26
    .line 27
    aget-object v6, v0, v4

    .line 28
    .line 29
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 34
    .line 35
    .line 36
    move-result v9

    .line 37
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    if-nez v9, :cond_2

    .line 42
    .line 43
    array-length v9, v8

    .line 44
    const/4 v10, 0x3

    .line 45
    if-ne v9, v10, :cond_2

    .line 46
    .line 47
    aget-object v9, v8, v3

    .line 48
    .line 49
    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    if-ne v9, v10, :cond_2

    .line 52
    .line 53
    const-class v9, Ljava/util/List;

    .line 54
    .line 55
    const/4 v10, 0x2

    .line 56
    aget-object v8, v8, v10

    .line 57
    .line 58
    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    if-nez v8, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    invoke-virtual {v6, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 66
    .line 67
    .line 68
    new-instance v7, Lcom/mr/elaris/i;

    .line 69
    .line 70
    invoke-direct {v7, p0}, Lcom/mr/elaris/i;-><init>(Ljava/lang/ClassLoader;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v6, v7}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    sget-object v8, Lcom/mr/elaris/MessageRepeater;->FOLLOW_UNHOOKS:Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    add-int/lit8 v5, v5, 0x1

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-static {v1, v7}, Lt2;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    new-instance v7, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    const-string v8, "repeater hook installed class="

    .line 97
    .line 98
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v8, " method="

    .line 109
    .line 110
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    invoke-static {v6}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :catchall_0
    move-exception p0

    .line 129
    goto :goto_2

    .line 130
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_3
    if-lez v5, :cond_4

    .line 134
    .line 135
    sput-boolean v7, Lcom/mr/elaris/MessageRepeater;->sFollowHookInstalled:Z

    .line 136
    .line 137
    const-string p0, "repeater menu hook installed class=com.tencent.mobileqq.aio.msglist.holder.component.msgfollow.AIOMsgFollowComponent method=K1"

    .line 138
    .line 139
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :cond_4
    return v5

    .line 143
    :cond_5
    new-instance p0, Ljava/lang/ClassNotFoundException;

    .line 144
    .line 145
    invoke-direct {p0, v0}, Ljava/lang/ClassNotFoundException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string v1, "repeater hook install failed reason=AIOMsgFollowComponent "

    .line 152
    .line 153
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    const-string v1, ": "

    .line 157
    .line 158
    invoke-static {p0, v0, v1}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    return v3
.end method

.method private static hookRepeaterMenuFallback(Ljava/lang/ClassLoader;)I
    .locals 3

    .line 1
    sget-object v0, Lfc;->a:[Ljava/lang/String;

    .line 2
    .line 3
    const-string v0, "repeater long press menu hook installed count="

    .line 4
    .line 5
    const-class v1, Lfc;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    sget-boolean v2, Lfc;->i:Z

    .line 9
    .line 10
    if-nez v2, :cond_2

    .line 11
    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-static {p0}, Lfc;->M(Ljava/lang/ClassLoader;)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-static {p0}, Lfc;->K(Ljava/lang/ClassLoader;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    add-int/2addr v2, p0

    .line 24
    if-lez v2, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    sput-boolean p0, Lfc;->i:Z

    .line 28
    .line 29
    new-instance p0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const-string p0, "repeater long press menu hook failed reason=no compatible menu target"

    .line 48
    .line 49
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    :goto_0
    monitor-exit v1

    .line 53
    return v2

    .line 54
    :cond_2
    :goto_1
    monitor-exit v1

    .line 55
    const/4 p0, 0x0

    .line 56
    return p0

    .line 57
    :goto_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    throw p0
.end method

.method private static hookSendContactCapture(Ljava/lang/ClassLoader;)I
    .locals 13

    .line 1
    const-string v0, " method="

    .line 2
    .line 3
    sget-object v1, Lcom/mr/elaris/MessageRepeater;->KERNEL_MSG_SERVICE_CLASSES:[Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "target.kernel.msg_service_classes"

    .line 6
    .line 7
    invoke-static {v2, v1, p0}, Lt2;->f(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/ClassLoader;)[Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v3

    .line 13
    move v5, v4

    .line 14
    :goto_0
    array-length v6, v1

    .line 15
    if-ge v4, v6, :cond_5

    .line 16
    .line 17
    aget-object v6, v1, v4

    .line 18
    .line 19
    invoke-static {v6, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    if-nez v6, :cond_0

    .line 24
    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :cond_0
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    move v8, v3

    .line 32
    :goto_1
    array-length v9, v7

    .line 33
    if-ge v8, v9, :cond_4

    .line 34
    .line 35
    aget-object v9, v7, v8

    .line 36
    .line 37
    const-string v10, "sendMsg"

    .line 38
    .line 39
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v11

    .line 43
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    if-eqz v10, :cond_3

    .line 48
    .line 49
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    if-nez v10, :cond_3

    .line 58
    .line 59
    invoke-static {v9}, Lcom/mr/elaris/MessageRepeater;->hasContactParam(Ljava/lang/reflect/Method;)Z

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    if-nez v10, :cond_1

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_1
    invoke-static {v9}, Lcom/mr/elaris/MessageRepeater;->methodSig(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    sget-object v11, Lcom/mr/elaris/MessageRepeater;->SEND_CONTACT_HOOKED:Ljava/util/Set;

    .line 71
    .line 72
    invoke-interface {v11, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    if-nez v10, :cond_2

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    const/4 v10, 0x1

    .line 80
    :try_start_0
    invoke-virtual {v9, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 81
    .line 82
    .line 83
    new-instance v10, Lcom/mr/elaris/l;

    .line 84
    .line 85
    const/16 v11, 0x8

    .line 86
    .line 87
    invoke-direct {v10, v11}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 88
    .line 89
    .line 90
    invoke-static {v9, v10}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 91
    .line 92
    .line 93
    add-int/lit8 v5, v5, 0x1

    .line 94
    .line 95
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    invoke-static {v2, v10}, Lt2;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    new-instance v10, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    const-string v11, "send contact capture hooked class="

    .line 108
    .line 109
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    invoke-static {v10}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :catchall_0
    move-exception v10

    .line 138
    new-instance v11, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v12, "send contact capture failed class="

    .line 141
    .line 142
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v12

    .line 149
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v9, " error="

    .line 163
    .line 164
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string v9, ": "

    .line 168
    .line 169
    invoke-static {v10, v11, v9}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    :cond_3
    :goto_2
    add-int/lit8 v8, v8, 0x1

    .line 173
    .line 174
    goto/16 :goto_1

    .line 175
    .line 176
    :cond_4
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 177
    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :cond_5
    return v5
.end method

.method public static bridge synthetic i([Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->firstListArg([Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static declared-synchronized install(Ljava/lang/ClassLoader;)V
    .locals 5

    .line 1
    const-string v0, "repeater hook installed count="

    .line 2
    .line 3
    const-class v1, Lcom/mr/elaris/MessageRepeater;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    sget-boolean v2, Lcom/mr/elaris/MessageRepeater;->sInstalled:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    monitor-exit v1

    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v2, 0x1

    .line 13
    :try_start_1
    sput-boolean v2, Lcom/mr/elaris/MessageRepeater;->sInstalled:Z

    .line 14
    .line 15
    const-string v3, "repeater hook install start"

    .line 16
    .line 17
    invoke-static {v3}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->hookAioMsgRecordMap(Ljava/lang/ClassLoader;)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    sget-boolean v4, Lcom/mr/elaris/MessageRepeater;->sAioParamCaptureInstalled:Z

    .line 25
    .line 26
    if-nez v4, :cond_1

    .line 27
    .line 28
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->hookAioParam(Ljava/lang/ClassLoader;)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    add-int/2addr v3, v4

    .line 33
    if-lez v4, :cond_1

    .line 34
    .line 35
    sput-boolean v2, Lcom/mr/elaris/MessageRepeater;->sAioParamCaptureInstalled:Z

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :goto_0
    sget-boolean v4, Lcom/mr/elaris/MessageRepeater;->sSendContactCaptureInstalled:Z

    .line 41
    .line 42
    if-nez v4, :cond_2

    .line 43
    .line 44
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->hookSendContactCapture(Ljava/lang/ClassLoader;)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    add-int/2addr v3, v4

    .line 49
    if-lez v4, :cond_2

    .line 50
    .line 51
    sput-boolean v2, Lcom/mr/elaris/MessageRepeater;->sSendContactCaptureInstalled:Z

    .line 52
    .line 53
    :cond_2
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->hookRepeaterMenuFallback(Ljava/lang/ClassLoader;)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    add-int/2addr v3, v2

    .line 58
    const-string v2, "message_repeater"

    .line 59
    .line 60
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->hookMessageFollowRepeater(Ljava/lang/ClassLoader;)I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    add-int/2addr v3, p0

    .line 71
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    .line 85
    .line 86
    monitor-exit v1

    .line 87
    return-void

    .line 88
    :goto_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 89
    throw p0
.end method

.method private static intField(Ljava/lang/Object;Ljava/lang/String;I)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/MessageRepeater;->field(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/Number;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    return p2
.end method

.method private static invokeGetMsgsByMsgId(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;Z)Z
    .locals 8

    .line 1
    new-instance v1, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 7
    .line 8
    .line 9
    move-result-object p4

    .line 10
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-object v2, p0

    .line 14
    move-object v3, p1

    .line 15
    move-object v4, p2

    .line 16
    move-object v5, p3

    .line 17
    move-object v6, p6

    .line 18
    move v7, p7

    .line 19
    invoke-static/range {v2 .. v7}, Lcom/mr/elaris/MessageRepeater;->newGetMsgsCallback(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const/4 p1, 0x0

    .line 24
    if-nez p0, :cond_0

    .line 25
    .line 26
    return p1

    .line 27
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    const-string p3, "getMsgsByMsgId"

    .line 32
    .line 33
    invoke-static {p2, p3}, Lcom/mr/elaris/MessageRepeater;->methodsNamed(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    move p4, p1

    .line 38
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result p5

    .line 42
    if-ge p4, p5, :cond_4

    .line 43
    .line 44
    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p5

    .line 48
    check-cast p5, Ljava/lang/reflect/Method;

    .line 49
    .line 50
    invoke-virtual {p5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p6

    .line 54
    invoke-virtual {p3, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p6

    .line 58
    if-eqz p6, :cond_3

    .line 59
    .line 60
    invoke-virtual {p5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 61
    .line 62
    .line 63
    move-result p6

    .line 64
    invoke-static {p6}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 65
    .line 66
    .line 67
    move-result p6

    .line 68
    if-eqz p6, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {p5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object p6

    .line 75
    array-length p7, p6

    .line 76
    const/4 v0, 0x3

    .line 77
    if-ne p7, v0, :cond_3

    .line 78
    .line 79
    const-class p7, Ljava/util/List;

    .line 80
    .line 81
    const/4 v0, 0x1

    .line 82
    aget-object p6, p6, v0

    .line 83
    .line 84
    invoke-virtual {p7, p6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 85
    .line 86
    .line 87
    move-result p6

    .line 88
    if-nez p6, :cond_2

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    :try_start_0
    invoke-virtual {p5, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 92
    .line 93
    .line 94
    filled-new-array {v5, v1, p0}, [Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p6

    .line 98
    invoke-virtual {p5, v3, p6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    .line 100
    .line 101
    return v0

    .line 102
    :catchall_0
    move-exception v0

    .line 103
    move-object p6, v0

    .line 104
    invoke-static {p6}, Lcom/mr/elaris/MessageRepeater;->unwrap(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 105
    .line 106
    .line 107
    move-result-object p6

    .line 108
    const-string p7, "repeater"

    .line 109
    .line 110
    const-string v0, "get-messages-by-id"

    .line 111
    .line 112
    invoke-static {p7, v0, p6}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    new-instance p7, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v0, "repeater send failed reason=getMsgsByMsgId invoke class="

    .line 118
    .line 119
    invoke-direct {p7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {p7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v0, " method="

    .line 134
    .line 135
    invoke-virtual {p7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-static {p5}, Lcom/mr/elaris/MessageRepeater;->methodSig(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p5

    .line 142
    invoke-virtual {p7, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string p5, " error="

    .line 146
    .line 147
    invoke-virtual {p7, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    move-result-object p5

    .line 154
    invoke-virtual {p5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p5

    .line 158
    invoke-virtual {p7, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string p5, ": "

    .line 162
    .line 163
    invoke-virtual {p7, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p5

    .line 170
    invoke-virtual {p7, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p5

    .line 177
    invoke-static {p5}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    :cond_3
    :goto_1
    add-int/lit8 p4, p4, 0x1

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_4
    const-string p0, "repeater send failed reason=getMsgsByMsgId method unresolved"

    .line 185
    .line 186
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    return p1
.end method

.method private static invokeSend(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;Ljava/util/Map;)Z
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 82
    invoke-static/range {v0 .. v6}, Lcom/mr/elaris/MessageRepeater;->invokeSend(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;Ljava/util/Map;Ly9;)Z

    move-result p0

    return p0
.end method

.method private static invokeSend(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;Ljava/util/Map;Ly9;)Z
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "sendMsg"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/mr/elaris/MessageRepeater;->methodsNamed(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v8

    .line 11
    const/4 v9, 0x2

    .line 12
    move-object v2, p0

    .line 13
    move-object v3, p1

    .line 14
    move-object v4, p2

    .line 15
    move-object v5, p3

    .line 16
    move-object v6, p4

    .line 17
    move-object/from16 v7, p5

    .line 18
    .line 19
    move-object/from16 v10, p6

    .line 20
    .line 21
    invoke-static/range {v2 .. v10}, Lcom/mr/elaris/MessageRepeater;->invokeSendPass(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;Ljava/util/Map;Ljava/util/List;ILy9;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x1

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    return v1

    .line 29
    :cond_0
    const/4 v9, 0x1

    .line 30
    move-object v2, p0

    .line 31
    move-object v3, p1

    .line 32
    move-object v4, p2

    .line 33
    move-object v5, p3

    .line 34
    move-object v6, p4

    .line 35
    move-object/from16 v7, p5

    .line 36
    .line 37
    move-object/from16 v10, p6

    .line 38
    .line 39
    invoke-static/range {v2 .. v10}, Lcom/mr/elaris/MessageRepeater;->invokeSendPass(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;Ljava/util/Map;Ljava/util/List;ILy9;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    return v1

    .line 46
    :cond_1
    const/4 v9, 0x0

    .line 47
    move-object v2, p0

    .line 48
    move-object v3, p1

    .line 49
    move-object v4, p2

    .line 50
    move-object v5, p3

    .line 51
    move-object v6, p4

    .line 52
    move-object/from16 v7, p5

    .line 53
    .line 54
    move-object/from16 v10, p6

    .line 55
    .line 56
    invoke-static/range {v2 .. v10}, Lcom/mr/elaris/MessageRepeater;->invokeSendPass(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;Ljava/util/Map;Ljava/util/List;ILy9;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    return v1

    .line 63
    :cond_2
    const/4 v9, 0x3

    .line 64
    move-object v2, p0

    .line 65
    move-object v3, p1

    .line 66
    move-object v4, p2

    .line 67
    move-object v5, p3

    .line 68
    move-object v6, p4

    .line 69
    move-object/from16 v7, p5

    .line 70
    .line 71
    move-object/from16 v10, p6

    .line 72
    .line 73
    invoke-static/range {v2 .. v10}, Lcom/mr/elaris/MessageRepeater;->invokeSendPass(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;Ljava/util/Map;Ljava/util/List;ILy9;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_3

    .line 78
    .line 79
    return v1

    .line 80
    :cond_3
    const/4 p0, 0x0

    .line 81
    return p0
.end method

.method private static invokeSendPass(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;Ljava/util/Map;Ljava/util/List;ILy9;)Z
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/util/List;",
            "Ljava/util/Map;",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Method;",
            ">;I",
            "Ly9;",
            ")Z"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p7

    move-object/from16 v6, p8

    .line 1
    const-string v7, " method="

    const/4 v9, 0x0

    :goto_0
    invoke-interface/range {p6 .. p6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_d

    move-object/from16 v10, p6

    .line 2
    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/reflect/Method;

    .line 3
    const-string v0, "sendMsg"

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/16 v16, 0x0

    goto/16 :goto_4

    .line 4
    :cond_1
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    const/4 v12, 0x1

    .line 5
    :try_start_0
    invoke-virtual {v11, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    const-string v13, "repeater send invoked class="

    const-class v14, Ljava/util/List;

    const/16 v16, 0x0

    const/4 v8, 0x3

    if-nez v5, :cond_2

    const/16 v17, 0x2

    :try_start_1
    array-length v15, v0

    if-ne v15, v8, :cond_3

    aget-object v15, v0, v16

    invoke-static {v15}, Lcom/mr/elaris/MessageRepeater;->isContactType(Ljava/lang/Class;)Z

    move-result v15

    if-eqz v15, :cond_3

    aget-object v15, v0, v12

    invoke-virtual {v14, v15}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v15

    if-eqz v15, :cond_3

    .line 7
    aget-object v8, v0, v16

    invoke-static {v1, v4, v8}, Lcom/mr/elaris/MessageRepeater;->contactForParam(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    .line 8
    aget-object v0, v0, v17

    invoke-static {v1, v0, v6}, Lcom/mr/elaris/MessageRepeater;->callbackArg(Ljava/lang/ClassLoader;Ljava/lang/Class;Ly9;)Ljava/lang/Object;

    move-result-object v0

    .line 9
    invoke-static/range {p4 .. p4}, Lcom/mr/elaris/MessageRepeater;->arrayList(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v14

    filled-new-array {v8, v14, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v11, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v11}, Lcom/mr/elaris/MessageRepeater;->methodSig(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    return v12

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_2
    const/16 v17, 0x2

    :cond_3
    const/4 v15, 0x4

    if-ne v5, v12, :cond_4

    move/from16 v18, v12

    .line 11
    array-length v12, v0

    if-ne v12, v15, :cond_5

    aget-object v12, v0, v16

    invoke-static {v12}, Lcom/mr/elaris/MessageRepeater;->isContactType(Ljava/lang/Class;)Z

    move-result v12

    if-eqz v12, :cond_5

    aget-object v12, v0, v18

    invoke-static {v12}, Lcom/mr/elaris/MessageRepeater;->isLongType(Ljava/lang/Class;)Z

    move-result v12

    if-eqz v12, :cond_5

    aget-object v12, v0, v17

    invoke-virtual {v14, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v12

    if-eqz v12, :cond_5

    .line 12
    aget-object v12, v0, v16

    invoke-static {v1, v4, v12}, Lcom/mr/elaris/MessageRepeater;->contactForParam(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v12

    .line 13
    aget-object v8, v0, v8

    invoke-static {v1, v8, v6}, Lcom/mr/elaris/MessageRepeater;->callbackArg(Ljava/lang/ClassLoader;Ljava/lang/Class;Ly9;)Ljava/lang/Object;

    move-result-object v8

    .line 14
    aget-object v0, v0, v18

    invoke-static {v0, v3, v2, v12}, Lcom/mr/elaris/MessageRepeater;->uniqueIdArg(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static/range {p4 .. p4}, Lcom/mr/elaris/MessageRepeater;->arrayList(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v14

    filled-new-array {v12, v0, v14, v8}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v11, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v11}, Lcom/mr/elaris/MessageRepeater;->methodSig(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return v18

    :cond_4
    move/from16 v18, v12

    .line 16
    :cond_5
    const-class v12, Ljava/util/Map;

    move/from16 v19, v15

    move/from16 v15, v17

    if-ne v5, v15, :cond_8

    :try_start_2
    array-length v15, v0

    move/from16 v20, v8

    const/4 v8, 0x5

    if-ne v15, v8, :cond_7

    aget-object v8, v0, v16

    invoke-static {v8}, Lcom/mr/elaris/MessageRepeater;->isLongType(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_7

    aget-object v8, v0, v18

    invoke-static {v8}, Lcom/mr/elaris/MessageRepeater;->isContactType(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v17, 0x2

    aget-object v8, v0, v17

    invoke-virtual {v14, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_7

    .line 17
    aget-object v8, v0, v18

    invoke-static {v1, v4, v8}, Lcom/mr/elaris/MessageRepeater;->contactForParam(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    .line 18
    aget-object v14, v0, v20

    invoke-virtual {v12, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-static/range {p5 .. p5}, Lcom/mr/elaris/MessageRepeater;->attrsMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v12

    goto :goto_1

    :cond_6
    aget-object v12, v0, v20

    invoke-static {v12}, Lcom/mr/elaris/MessageRepeater;->defaultArg(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v12

    .line 19
    :goto_1
    aget-object v14, v0, v19

    invoke-static {v1, v14, v6}, Lcom/mr/elaris/MessageRepeater;->callbackArg(Ljava/lang/ClassLoader;Ljava/lang/Class;Ly9;)Ljava/lang/Object;

    move-result-object v14

    .line 20
    aget-object v0, v0, v16

    invoke-static {v0, v3, v2, v8}, Lcom/mr/elaris/MessageRepeater;->uniqueIdArg(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static/range {p4 .. p4}, Lcom/mr/elaris/MessageRepeater;->arrayList(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v15

    filled-new-array {v0, v8, v15, v12, v14}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v11, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v11}, Lcom/mr/elaris/MessageRepeater;->methodSig(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    return v18

    :cond_7
    move/from16 v8, v20

    :cond_8
    if-ne v5, v8, :cond_a

    .line 22
    array-length v8, v0

    const/4 v15, 0x2

    if-ne v8, v15, :cond_9

    aget-object v8, v0, v16

    invoke-static {v8}, Lcom/mr/elaris/MessageRepeater;->isContactType(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_9

    aget-object v8, v0, v18

    invoke-virtual {v14, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_9

    .line 23
    aget-object v0, v0, v16

    invoke-static {v1, v4, v0}, Lcom/mr/elaris/MessageRepeater;->contactForParam(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    .line 24
    invoke-static/range {p4 .. p4}, Lcom/mr/elaris/MessageRepeater;->arrayList(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v8

    filled-new-array {v0, v8}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v11, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v11}, Lcom/mr/elaris/MessageRepeater;->methodSig(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    return v18

    :cond_9
    const/4 v8, 0x3

    :cond_a
    if-ne v5, v8, :cond_c

    .line 26
    array-length v8, v0

    move/from16 v15, v19

    if-ne v8, v15, :cond_c

    aget-object v8, v0, v16

    invoke-static {v8}, Lcom/mr/elaris/MessageRepeater;->isLongType(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_c

    aget-object v8, v0, v18

    invoke-static {v8}, Lcom/mr/elaris/MessageRepeater;->isContactType(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_c

    const/16 v17, 0x2

    aget-object v8, v0, v17

    invoke-virtual {v14, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_c

    .line 27
    aget-object v8, v0, v18

    invoke-static {v1, v4, v8}, Lcom/mr/elaris/MessageRepeater;->contactForParam(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    const/16 v20, 0x3

    .line 28
    aget-object v14, v0, v20

    invoke-virtual {v12, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v12

    if-eqz v12, :cond_b

    invoke-static/range {p5 .. p5}, Lcom/mr/elaris/MessageRepeater;->attrsMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v12

    goto :goto_2

    :cond_b
    aget-object v12, v0, v20

    invoke-static {v1, v12, v6}, Lcom/mr/elaris/MessageRepeater;->callbackArg(Ljava/lang/ClassLoader;Ljava/lang/Class;Ly9;)Ljava/lang/Object;

    move-result-object v12

    .line 29
    :goto_2
    aget-object v0, v0, v16

    invoke-static {v0, v3, v2, v8}, Lcom/mr/elaris/MessageRepeater;->uniqueIdArg(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static/range {p4 .. p4}, Lcom/mr/elaris/MessageRepeater;->arrayList(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v14

    filled-new-array {v0, v8, v14, v12}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v11, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v11}, Lcom/mr/elaris/MessageRepeater;->methodSig(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return v18

    :catchall_1
    move-exception v0

    const/16 v16, 0x0

    .line 31
    :goto_3
    invoke-static {v0}, Lcom/mr/elaris/MessageRepeater;->unwrap(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    .line 32
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v12, "repeater send failed reason=sendMsg invoke class="

    invoke-direct {v8, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    invoke-static {v11}, Lcom/mr/elaris/MessageRepeater;->methodSig(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, " error="

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, ": "

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 35
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    :cond_c
    :goto_4
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    :cond_d
    const/16 v16, 0x0

    return v16
.end method

.method private static isCachedRepeaterIconCandidate(Landroid/widget/ImageView;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->isReasonableRepeaterSize(Landroid/widget/ImageView;)Z

    .line 12
    .line 13
    .line 14
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :catchall_0
    :cond_1
    return v0
.end method

.method private static isContactType(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, ".Contact"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method private static isIconVisualReady(Landroid/widget/ImageView;Ljava/lang/String;Z)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_7

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    sget-object v1, Lyb;->c:Ljava/util/WeakHashMap;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    invoke-virtual {v1, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    return v0

    .line 22
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 23
    .line 24
    .line 25
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    return v0

    .line 29
    :cond_2
    const/4 p1, 0x1

    .line 30
    if-eqz p2, :cond_4

    .line 31
    .line 32
    :try_start_2
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    const p2, 0x3d4ccccd    # 0.05f

    .line 37
    .line 38
    .line 39
    cmpg-float p0, p0, p2

    .line 40
    .line 41
    if-gtz p0, :cond_3

    .line 42
    .line 43
    return p1

    .line 44
    :cond_3
    return v0

    .line 45
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    const v1, 0x3ee66666    # 0.45f

    .line 50
    .line 51
    .line 52
    cmpg-float p2, p2, v1

    .line 53
    .line 54
    if-gez p2, :cond_5

    .line 55
    .line 56
    return v0

    .line 57
    :cond_5
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 58
    .line 59
    .line 60
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 61
    if-eqz p0, :cond_6

    .line 62
    .line 63
    return p1

    .line 64
    :catchall_0
    :cond_6
    return v0

    .line 65
    :catchall_1
    move-exception p0

    .line 66
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 67
    throw p0

    .line 68
    :cond_7
    :goto_0
    return v0
.end method

.method private static isIntType(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    const-class v0, Ljava/lang/Integer;

    .line 6
    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

.method private static isLikelyContact(Ljava/lang/Object;)Z
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p0, Ljava/lang/CharSequence;

    .line 6
    .line 7
    if-nez v1, :cond_3

    .line 8
    .line 9
    instance-of v1, p0, Ljava/lang/Number;

    .line 10
    .line 11
    if-nez v1, :cond_3

    .line 12
    .line 13
    instance-of v1, p0, Ljava/lang/Boolean;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, ".Contact"

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    return v2

    .line 36
    :cond_2
    const-string v1, "type"

    .line 37
    .line 38
    invoke-static {p0, v1, v0}, Lcom/mr/elaris/MessageRepeater;->intField(Ljava/lang/Object;Ljava/lang/String;I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const-string v3, "chatType"

    .line 43
    .line 44
    invoke-static {p0, v3, v1}, Lcom/mr/elaris/MessageRepeater;->intField(Ljava/lang/Object;Ljava/lang/String;I)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-lez v1, :cond_3

    .line 49
    .line 50
    const-string v7, "troopUin"

    .line 51
    .line 52
    const-string v8, "friendUin"

    .line 53
    .line 54
    const-string v3, "peerUid"

    .line 55
    .line 56
    const-string v4, "peerUin"

    .line 57
    .line 58
    const-string v5, "uin"

    .line 59
    .line 60
    const-string v6, "uid"

    .line 61
    .line 62
    filled-new-array/range {v3 .. v8}, [Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {p0, v1}, Lcom/mr/elaris/MessageRepeater;->firstString(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-lez p0, :cond_3

    .line 75
    .line 76
    return v2

    .line 77
    :cond_3
    :goto_0
    return v0
.end method

.method private static isLongType(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    const-class v0, Ljava/lang/Long;

    .line 6
    .line 7
    if-eq p0, v0, :cond_1

    .line 8
    .line 9
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    const-class v0, Ljava/lang/Integer;

    .line 14
    .line 15
    if-eq p0, v0, :cond_1

    .line 16
    .line 17
    const-class v0, Ljava/lang/String;

    .line 18
    .line 19
    if-ne p0, v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 25
    return p0
.end method

.method private static isMeaningfulReplyValue(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    instance-of v1, p0, Ljava/lang/Number;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    check-cast p0, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 24
    .line 25
    .line 26
    move-result-wide v3

    .line 27
    const-wide/16 v5, 0x0

    .line 28
    .line 29
    cmp-long p0, v3, v5

    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    return v2

    .line 34
    :cond_2
    return v0

    .line 35
    :cond_3
    instance-of v1, p0, Ljava/lang/CharSequence;

    .line 36
    .line 37
    if-eqz v1, :cond_5

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-lez p0, :cond_4

    .line 52
    .line 53
    return v2

    .line 54
    :cond_4
    return v0

    .line 55
    :cond_5
    return v2
.end method

.method private static isMsgRecordClass(Ljava/lang/Class;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    const-string v1, "com.tencent.qqnt.kernel.nativeinterface.MsgRecord"

    .line 10
    .line 11
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    const-string v1, "com.tencent.qqnt.kernelpublic.nativeinterface.MsgRecord"

    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    const-string v1, ".MsgRecord"

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return v0

    .line 35
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :catchall_0
    return v0
.end method

.method private static isObjectMethod(Ljava/lang/reflect/Method;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    const-string v0, "toString"

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    const-string v0, "hashCode"

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    const-string v0, "equals"

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return p0

    .line 37
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 38
    return p0
.end method

.method private static isPlainTextMessage(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->elementsFromMsg(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_6

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    move v3, v2

    .line 17
    move v4, v3

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-ge v3, v5, :cond_4

    .line 23
    .line 24
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    if-nez v5, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-static {v5}, Lcom/mr/elaris/MessageRepeater;->hasNonTextElement(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    return v2

    .line 38
    :cond_2
    invoke-static {v5}, Lcom/mr/elaris/MessageRepeater;->hasTextElement(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_3

    .line 43
    .line 44
    move v4, v1

    .line 45
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    return v2

    .line 49
    :cond_4
    if-eqz v4, :cond_5

    .line 50
    .line 51
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->msgText(Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-lez p0, :cond_5

    .line 60
    .line 61
    return v1

    .line 62
    :cond_5
    return v2

    .line 63
    :cond_6
    :goto_2
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->msgText(Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-lez p0, :cond_7

    .line 72
    .line 73
    return v1

    .line 74
    :cond_7
    return v2
.end method

.method private static isReasonableRepeaterSize(Landroid/widget/ImageView;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->viewSize(Landroid/view/View;Z)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {p0, v2}, Lcom/mr/elaris/MessageRepeater;->viewSize(Landroid/view/View;Z)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/high16 v4, 0x41400000    # 12.0f

    .line 12
    .line 13
    invoke-static {p0, v4}, Lcom/mr/elaris/MessageRepeater;->dp(Landroid/view/View;F)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    const/high16 v5, 0x42a00000    # 80.0f

    .line 18
    .line 19
    invoke-static {p0, v5}, Lcom/mr/elaris/MessageRepeater;->dp(Landroid/view/View;F)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-lez v1, :cond_2

    .line 24
    .line 25
    if-gtz v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    if-lt v1, v4, :cond_1

    .line 29
    .line 30
    if-lt v3, v4, :cond_1

    .line 31
    .line 32
    if-gt v1, p0, :cond_1

    .line 33
    .line 34
    if-gt v3, p0, :cond_1

    .line 35
    .line 36
    return v0

    .line 37
    :cond_1
    return v2

    .line 38
    :cond_2
    :goto_0
    return v0
.end method

.method public static isRefreshBindingCurrent(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->refreshBindingKey(Landroid/view/View;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-ne p0, p1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method private static isRepeaterCaptureEnabled()Z
    .locals 1

    .line 1
    const-string v0, "message_repeater"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "message_repeater_long_press_menu"

    .line 10
    .line 11
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    return v0
.end method

.method private static isReplyKey(Ljava/lang/String;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    const-string v0, "reply"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "quote"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    :cond_0
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_1
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method private static isReplyLikeMessage(Ljava/lang/Object;Ljava/lang/Object;Z)Z
    .locals 1

    .line 1
    if-nez p2, :cond_1

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    invoke-static {p1, p2}, Lcom/mr/elaris/MessageRepeater;->hasReplyMetadata(Ljava/lang/Object;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    if-eq p0, p1, :cond_0

    .line 11
    .line 12
    invoke-static {p0, p2}, Lcom/mr/elaris/MessageRepeater;->hasReplyMetadata(Ljava/lang/Object;I)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return p2

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method private static isSafeRepeaterIconCandidate(Landroid/widget/ImageView;I)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->isReasonableRepeaterSize(Landroid/widget/ImageView;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x6

    .line 12
    invoke-static {p0, v1}, Lcom/mr/elaris/MessageRepeater;->viewChainText(Landroid/view/View;I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "bubble"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    const-string v2, "content"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_2

    .line 37
    .line 38
    const-string v2, "text"

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    const-string v2, "pic"

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_2

    .line 53
    .line 54
    const-string v2, "file"

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-nez v2, :cond_2

    .line 61
    .line 62
    const-string v2, "avatar"

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->hasRepeaterCue(Landroid/widget/ImageView;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-eqz p0, :cond_2

    .line 76
    .line 77
    const/16 p0, 0x28

    .line 78
    .line 79
    if-lt p1, p0, :cond_2

    .line 80
    .line 81
    const/4 p0, 0x1

    .line 82
    return p0

    .line 83
    :cond_2
    :goto_0
    return v0
.end method

.method public static bridge synthetic j([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->firstMsgRecordArg([Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static bridge synthetic k(Ljava/lang/reflect/Method;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->isObjectMethod(Ljava/lang/reflect/Method;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static kernelMsgService(Ljava/lang/ClassLoader;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    :try_start_0
    const-string v0, "com.tencent.qqnt.kernel.api.IKernelService"

    .line 6
    .line 7
    invoke-static {v0, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_3

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "getRuntimeService"

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-static {v0, v1, v2}, Lcom/mr/elaris/MessageRepeater;->findMethod(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 28
    .line 29
    .line 30
    const-string v1, ""

    .line 31
    .line 32
    filled-new-array {p0, v1}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {v0, p1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const-string v0, "getMsgService"

    .line 41
    .line 42
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const-string v0, "IKernelMsgService"

    .line 47
    .line 48
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->findReturnByName(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_1
    const-string v0, "getService"

    .line 56
    .line 57
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_2
    if-eqz p0, :cond_3

    .line 65
    .line 66
    return-object p0

    .line 67
    :catchall_0
    move-exception p0

    .line 68
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->unwrap(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v1, "repeater send failed reason=kernel service "

    .line 75
    .line 76
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const-string v1, ": "

    .line 80
    .line 81
    invoke-static {p0, v0, v1}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    invoke-static {p1}, Lcom/mr/elaris/MessageRepeater;->kernelMsgService(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
.end method

.method private static kernelMsgService(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 89
    :cond_0
    const-string v1, "getKernelMsgService"

    invoke-static {p0, v1}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    .line 90
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v2, 0x0

    .line 91
    :goto_0
    array-length v3, v1

    if-ge v2, v3, :cond_3

    .line 92
    aget-object v3, v1, v2

    .line 93
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    array-length v4, v4

    if-nez v4, :cond_2

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    const-string v5, "msgservice"

    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 94
    :try_start_0
    invoke-virtual {v3, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_2

    return-object v3

    :catchall_0
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static bridge synthetic l()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/mr/elaris/MessageRepeater;->isRepeaterCaptureEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method private static logContactDetails(Ljava/lang/Object;)V
    .locals 5

    .line 1
    const-string v0, "repeater contact found class="

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    :try_start_0
    const-string v1, "null"

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->contactPeer(Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->contactGuild(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    new-instance v4, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v0, " chatType="

    .line 33
    .line 34
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->contactChatType(Ljava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p0, " peerUid="

    .line 45
    .line 46
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-static {v2}, Lcom/mr/elaris/MessageRepeater;->safeProbe(Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p0, " guildId="

    .line 57
    .line 58
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-static {v3}, Lcom/mr/elaris/MessageRepeater;->safeProbe(Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :catchall_0
    move-exception p0

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    const-string v1, "repeater contact probe failed reason="

    .line 80
    .line 81
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const-string v1, ": "

    .line 85
    .line 86
    invoke-static {p0, v0, v1}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method private static logFail(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "repeater send failed reason="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private static logFollowProbe(Ljava/lang/Object;[Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .line 1
    const-string v0, "repeater follow probe ownerClass="

    .line 2
    .line 3
    const-string v1, "null"

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    move-object v2, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    :goto_0
    if-nez p2, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v4, "|"

    .line 37
    .line 38
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-static {v3}, Lcom/mr/elaris/MessageRepeater;->shouldLogFollowProbe(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-nez v3, :cond_2

    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, " msgItemClass="

    .line 64
    .line 65
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v0, " args="

    .line 72
    .line 73
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-static {p1}, Lcom/mr/elaris/MessageRepeater;->describeArgs([Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string p1, " ownerFields="

    .line 84
    .line 85
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->describeInterestingFields(Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string p0, " msgFields="

    .line 96
    .line 97
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-static {p2}, Lcom/mr/elaris/MessageRepeater;->describeInterestingFields(Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :catchall_0
    move-exception p0

    .line 116
    new-instance p1, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string p2, "repeater follow probe failed reason="

    .line 119
    .line 120
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    const-string p2, ": "

    .line 124
    .line 125
    invoke-static {p0, p1, p2}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method private static logMsgDetails(Ljava/lang/Object;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "repeater msg found msgId="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->msgId(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, "repeater msg text="

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->msgText(Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->safeProbe(Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method private static logSendCallback(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/mr/elaris/MessageRepeater;->firstIntArg([Ljava/lang/Object;)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v2, "repeater send failed reason=callback "

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p0, " code="

    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p0, " args="

    .line 36
    .line 37
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lcom/mr/elaris/MessageRepeater;->describeArgs([Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    const-string p0, "repeater send success"

    .line 56
    .line 57
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method private static longValue(Ljava/lang/Object;J)J
    .locals 4

    .line 1
    instance-of v0, p0, Ljava/lang/Number;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0

    .line 12
    :cond_0
    if-nez p0, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 31
    .line 32
    .line 33
    move-result-wide p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    return-wide p0

    .line 35
    :catchall_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-ge v1, v2, :cond_4

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const/16 v3, 0x30

    .line 52
    .line 53
    if-lt v2, v3, :cond_3

    .line 54
    .line 55
    const/16 v3, 0x39

    .line 56
    .line 57
    if-gt v2, v3, :cond_3

    .line 58
    .line 59
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-nez p0, :cond_5

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_5
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 77
    .line 78
    .line 79
    move-result-wide p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 80
    return-wide p0

    .line 81
    :catchall_1
    :goto_1
    return-wide p1
.end method

.method public static bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;Z)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/MessageRepeater;->isReplyLikeMessage(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static messageIdFromText(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-eqz p0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const-string v6, "uniseq"

    .line 13
    .line 14
    const-string v7, "msgseq"

    .line 15
    .line 16
    const-string v2, "msgId"

    .line 17
    .line 18
    const-string v3, "msgUid"

    .line 19
    .line 20
    const-string v4, "msgSeq"

    .line 21
    .line 22
    const-string v5, "shmsgseq"

    .line 23
    .line 24
    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x0

    .line 29
    :goto_0
    const/4 v3, 0x6

    .line 30
    if-ge v2, v3, :cond_2

    .line 31
    .line 32
    aget-object v3, v1, v2

    .line 33
    .line 34
    invoke-static {p0, v3}, Lcom/mr/elaris/MessageRepeater;->valueAfterKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-lez v4, :cond_1

    .line 43
    .line 44
    return-object v3

    .line 45
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    :goto_1
    return-object v0
.end method

.method private static methodSig(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const/16 v1, 0x28

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const/4 v1, 0x0

    .line 28
    :goto_0
    array-length v2, p0

    .line 29
    if-ge v1, v2, :cond_2

    .line 30
    .line 31
    if-lez v1, :cond_1

    .line 32
    .line 33
    const/16 v2, 0x2c

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    :cond_1
    aget-object v2, p0, v1

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/16 p0, 0x29

    .line 51
    .line 52
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method

.method private static methodsNamed(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_3

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    if-eq p0, v1, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_1
    array-length v3, v1

    .line 18
    if-ge v2, v3, :cond_2

    .line 19
    .line 20
    aget-object v3, v1, v2

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_0
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    :cond_1
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    goto :goto_0

    .line 54
    :cond_3
    return-object v0
.end method

.method private static msgId(Ljava/lang/Object;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v5, "msgRandom"

    .line 2
    .line 3
    const-string v6, "shmsgseq"

    .line 4
    .line 5
    const-string v0, "msgId"

    .line 6
    .line 7
    const-string v1, "msgUid"

    .line 8
    .line 9
    const-string v2, "uniseq"

    .line 10
    .line 11
    const-string v3, "msgseq"

    .line 12
    .line 13
    const-string v4, "msgSeq"

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->firstString(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-lez v1, :cond_0

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    if-nez p0, :cond_1

    .line 31
    .line 32
    const-string p0, ""

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, "@"

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method

.method private static msgIdLong(Ljava/lang/Object;Ljava/lang/Object;)J
    .locals 8

    .line 1
    const-string v0, "getMsgId"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    invoke-static {v0, v1, v2}, Lcom/mr/elaris/MessageRepeater;->longValue(Ljava/lang/Object;J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    cmp-long v0, v3, v1

    .line 14
    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    return-wide v3

    .line 18
    :cond_0
    const-string v0, "msgId"

    .line 19
    .line 20
    const-string v3, "msgUid"

    .line 21
    .line 22
    const-string v4, "msgSeq"

    .line 23
    .line 24
    const-string v5, "shmsgseq"

    .line 25
    .line 26
    filled-new-array {v0, v3, v4, v5}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-static {p1, v6}, Lcom/mr/elaris/MessageRepeater;->firstObject(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1, v1, v2}, Lcom/mr/elaris/MessageRepeater;->longValue(Ljava/lang/Object;J)J

    .line 35
    .line 36
    .line 37
    move-result-wide v6

    .line 38
    cmp-long p1, v6, v1

    .line 39
    .line 40
    if-lez p1, :cond_1

    .line 41
    .line 42
    return-wide v6

    .line 43
    :cond_1
    filled-new-array {v0, v3, v4, v5}, [Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p0, p1}, Lcom/mr/elaris/MessageRepeater;->firstObject(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0, v1, v2}, Lcom/mr/elaris/MessageRepeater;->longValue(Ljava/lang/Object;J)J

    .line 52
    .line 53
    .line 54
    move-result-wide p0

    .line 55
    return-wide p0
.end method

.method private static msgRecordFromAny(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lcom/mr/elaris/MessageRepeater;->AIO_MSG_RECORDS:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-object v1

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    instance-of v0, p0, Ljava/lang/CharSequence;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lcom/mr/elaris/MessageRepeater;->findMsgRecordByText(Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_1
    invoke-static {p0}, Lv4;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_2
    const/4 v0, 0x0

    .line 38
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->findMsgRecordLike(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    throw p0
.end method

.method private static msgText(Ljava/lang/Object;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v5, "msgContent"

    .line 2
    .line 3
    const-string v6, "text"

    .line 4
    .line 5
    const-string v0, "msg"

    .line 6
    .line 7
    const-string v1, "msgText"

    .line 8
    .line 9
    const-string v2, "message"

    .line 10
    .line 11
    const-string v3, "content"

    .line 12
    .line 13
    const-string v4, "summary"

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->firstString(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-lez v1, :cond_0

    .line 28
    .line 29
    invoke-static {v0}, Lcom/mr/elaris/MessageRepeater;->normalizeExtractedText(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_0
    const-string v0, "getMsg"

    .line 35
    .line 36
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    const-string v0, "getMsgText"

    .line 43
    .line 44
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_1
    if-nez v0, :cond_2

    .line 49
    .line 50
    const-string v0, "getSummary"

    .line 51
    .line 52
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :cond_2
    invoke-static {v0}, Lcom/mr/elaris/MessageRepeater;->stringOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-lez v1, :cond_3

    .line 65
    .line 66
    invoke-static {v0}, Lcom/mr/elaris/MessageRepeater;->normalizeExtractedText(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :cond_3
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->elementsFromMsg(Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    if-eqz p0, :cond_9

    .line 76
    .line 77
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    const/16 v2, 0xc

    .line 94
    .line 95
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    const/4 v2, 0x0

    .line 100
    move v3, v2

    .line 101
    :goto_0
    if-ge v3, v1, :cond_8

    .line 102
    .line 103
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-static {v4, v2}, Lcom/mr/elaris/MessageRepeater;->textFromElement(Ljava/lang/Object;I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-nez v5, :cond_5

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-lez v5, :cond_6

    .line 123
    .line 124
    const/16 v5, 0x20

    .line 125
    .line 126
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    :cond_6
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    const/16 v5, 0xf0

    .line 137
    .line 138
    if-le v4, v5, :cond_7

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_7
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_8
    :goto_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->normalizeExtractedText(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    return-object p0

    .line 153
    :cond_9
    :goto_3
    const-string p0, ""

    .line 154
    .line 155
    return-object p0
.end method

.method public static bridge synthetic n(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->logFail(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static newContact(Ljava/lang/Class;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    :goto_0
    array-length v2, p0

    .line 8
    if-ge v1, v2, :cond_4

    .line 9
    .line 10
    aget-object v2, p0, v1

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const/4 v4, 0x1

    .line 17
    invoke-virtual {v2, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 18
    .line 19
    .line 20
    array-length v5, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    const-string v6, ""

    .line 22
    .line 23
    const/4 v7, 0x2

    .line 24
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 25
    .line 26
    const/4 v9, 0x3

    .line 27
    const-class v10, Ljava/lang/String;

    .line 28
    .line 29
    if-ne v5, v9, :cond_1

    .line 30
    .line 31
    :try_start_1
    aget-object v5, v3, v0

    .line 32
    .line 33
    if-ne v5, v8, :cond_1

    .line 34
    .line 35
    aget-object v5, v3, v4

    .line 36
    .line 37
    if-ne v5, v10, :cond_1

    .line 38
    .line 39
    aget-object v5, v3, v7

    .line 40
    .line 41
    if-ne v5, v10, :cond_1

    .line 42
    .line 43
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-nez p3, :cond_0

    .line 48
    .line 49
    move-object p3, v6

    .line 50
    :cond_0
    filled-new-array {p0, p2, p3}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :cond_1
    array-length v5, v3

    .line 60
    if-ne v5, v9, :cond_3

    .line 61
    .line 62
    aget-object v5, v3, v0

    .line 63
    .line 64
    if-ne v5, v10, :cond_3

    .line 65
    .line 66
    aget-object v4, v3, v4

    .line 67
    .line 68
    if-ne v4, v10, :cond_3

    .line 69
    .line 70
    aget-object v3, v3, v7

    .line 71
    .line 72
    if-ne v3, v8, :cond_3

    .line 73
    .line 74
    if-nez p3, :cond_2

    .line 75
    .line 76
    move-object p3, v6

    .line 77
    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    filled-new-array {p2, p3, p0}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    return-object p0

    .line 90
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :catchall_0
    :cond_4
    const/4 p0, 0x0

    .line 94
    return-object p0
.end method

.method private static newContactFromData(Ljava/lang/ClassLoader;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_2

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    const-string v1, "com.tencent.qqnt.kernel.nativeinterface.Contact"

    .line 12
    .line 13
    const-string v2, "com.tencent.qqnt.kernelpublic.nativeinterface.Contact"

    .line 14
    .line 15
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_0
    const/4 v3, 0x2

    .line 21
    if-ge v2, v3, :cond_2

    .line 22
    .line 23
    :try_start_0
    aget-object v3, v1, v2

    .line 24
    .line 25
    invoke-static {v3, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-static {v3, p1, p2, p3}, Lcom/mr/elaris/MessageRepeater;->newContact(Ljava/lang/Class;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    return-object v4

    .line 36
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const-string v4, "peerUid"

    .line 41
    .line 42
    const-string v5, "uin"

    .line 43
    .line 44
    const-string v6, "uid"

    .line 45
    .line 46
    const-string v7, "peerUin"

    .line 47
    .line 48
    filled-new-array {v4, v5, v6, v7}, [Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-static {v3, p2, v4}, Lcom/mr/elaris/MessageRepeater;->setAny(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const-string v4, "guildId"

    .line 56
    .line 57
    const-string v5, "guildID"

    .line 58
    .line 59
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {v3, p3, v4}, Lcom/mr/elaris/MessageRepeater;->setAny(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    const-string v5, "chatType"

    .line 71
    .line 72
    const-string v6, "type"

    .line 73
    .line 74
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-static {v3, v4, v5}, Lcom/mr/elaris/MessageRepeater;->setAny(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    .line 81
    return-object v3

    .line 82
    :catchall_0
    add-int/lit8 v2, v2, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    :goto_1
    return-object v0
.end method

.method private static newGetMsgsCallback(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 9

    .line 1
    :try_start_0
    const-string v0, "com.tencent.qqnt.kernelpublic.nativeinterface.IMsgOperateCallback"

    .line 2
    .line 3
    const-string v1, "com.tencent.qqnt.kernel.nativeinterface.IMsgOperateCallback"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->findAnyClass(Ljava/lang/ClassLoader;[Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const-class v1, Lcom/mr/elaris/MessageRepeater;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, p0

    .line 23
    :goto_0
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v2, Lcom/mr/elaris/p;

    .line 28
    .line 29
    move-object v3, p0

    .line 30
    move-object v5, p1

    .line 31
    move-object v6, p2

    .line 32
    move-object v7, p3

    .line 33
    move-object v4, p4

    .line 34
    move v8, p5

    .line 35
    invoke-direct/range {v2 .. v8}, Lcom/mr/elaris/p;-><init>(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v0, v2}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    return-object p0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    move-object p0, v0

    .line 45
    new-instance p1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string p2, "repeater send failed reason=getMsgs callback "

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string p2, ": "

    .line 53
    .line 54
    invoke-static {p0, p1, p2}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return-object p0
.end method

.method private static normalizeExtractedText(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    if-eqz p0, :cond_4

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    invoke-static {p0}, Li5;->g1(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x3

    .line 15
    if-ge v0, v1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    :try_start_0
    new-instance v1, Ljava/lang/String;

    .line 19
    .line 20
    const-string v2, "GBK"

    .line 21
    .line 22
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {p0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 31
    .line 32
    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    const v2, 0xfffd

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-ltz v2, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-static {v1}, Li5;->g1(Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-ge v2, v0, :cond_3

    .line 56
    .line 57
    const-string v0, "repeater msg text normalized"

    .line 58
    .line 59
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    return-object v1

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    goto :goto_1

    .line 65
    :cond_3
    :goto_0
    return-object p0

    .line 66
    :goto_1
    const-string v1, "message-repeater"

    .line 67
    .line 68
    const-string v2, "text-normalize"

    .line 69
    .line 70
    invoke-static {v1, v2, v0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_4
    :goto_2
    const-string p0, ""

    .line 75
    .line 76
    return-object p0
.end method

.method public static bridge synthetic o(Ljava/lang/Object;[Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/MessageRepeater;->logFollowProbe(Ljava/lang/Object;[Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static declared-synchronized onRuntimeSettingsChanged(Ljava/lang/ClassLoader;)V
    .locals 2

    .line 1
    const-class v0, Lcom/mr/elaris/MessageRepeater;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-string v1, "message_repeater"

    .line 5
    .line 6
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {}, Lcom/mr/elaris/MessageRepeater;->unhookMessageFollowRepeater()V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    sget-boolean v1, Lcom/mr/elaris/MessageRepeater;->sInstalled:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    sget-boolean v1, Lcom/mr/elaris/MessageRepeater;->sFollowHookInstalled:Z

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->hookMessageFollowRepeater(Ljava/lang/ClassLoader;)I

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    invoke-static {}, Lcom/mr/elaris/MessageRepeater;->isRepeaterCaptureEnabled()Z

    .line 32
    .line 33
    .line 34
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    monitor-exit v0

    .line 38
    return-void

    .line 39
    :cond_2
    :try_start_1
    sget-object p0, Lcom/mr/elaris/MessageRepeater;->AIO_MSG_RECORDS:Ljava/util/Map;

    .line 40
    .line 41
    monitor-enter p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    :try_start_2
    invoke-interface {p0}, Ljava/util/Map;->clear()V

    .line 43
    .line 44
    .line 45
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 46
    :try_start_3
    sget-object p0, Lcom/mr/elaris/MessageRepeater;->AIO_MSG_RECORD_BY_ID:Ljava/util/Map;

    .line 47
    .line 48
    monitor-enter p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 49
    :try_start_4
    invoke-interface {p0}, Ljava/util/Map;->clear()V

    .line 50
    .line 51
    .line 52
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 53
    :try_start_5
    sget-object p0, Lcom/mr/elaris/MessageRepeater;->REPEATER_ICON_CACHE:Ljava/util/Map;

    .line 54
    .line 55
    monitor-enter p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 56
    :try_start_6
    invoke-interface {p0}, Ljava/util/Map;->clear()V

    .line 57
    .line 58
    .line 59
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 60
    :try_start_7
    sget-object p0, Lcom/mr/elaris/MessageRepeater;->FOLLOW_PROBE_LOGS:Ljava/util/Map;

    .line 61
    .line 62
    monitor-enter p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 63
    :try_start_8
    invoke-interface {p0}, Ljava/util/Map;->clear()V

    .line 64
    .line 65
    .line 66
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 67
    const/4 p0, 0x0

    .line 68
    :try_start_9
    sput-object p0, Lcom/mr/elaris/MessageRepeater;->sAioParam:Ljava/lang/Object;

    .line 69
    .line 70
    sput-object p0, Lcom/mr/elaris/MessageRepeater;->sLastSendContact:Ljava/lang/Object;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 71
    .line 72
    monitor-exit v0

    .line 73
    return-void

    .line 74
    :catchall_1
    move-exception v1

    .line 75
    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 76
    :try_start_b
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 77
    :catchall_2
    move-exception v1

    .line 78
    :try_start_c
    monitor-exit p0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 79
    :try_start_d
    throw v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 80
    :catchall_3
    move-exception v1

    .line 81
    :try_start_e
    monitor-exit p0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 82
    :try_start_f
    throw v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 83
    :catchall_4
    move-exception v1

    .line 84
    :try_start_10
    monitor-exit p0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 85
    :try_start_11
    throw v1

    .line 86
    :goto_1
    monitor-exit v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    .line 87
    throw p0
.end method

.method public static bridge synthetic p(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->logMsgDetails(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic q(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/MessageRepeater;->logSendCallback(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static qRouteApi(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "com.tencent.mobileqq.qroute.QRoute"

    .line 3
    .line 4
    invoke-static {v1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-static {p1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string p1, "api"

    .line 13
    .line 14
    const-class v2, Ljava/lang/Class;

    .line 15
    .line 16
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v1, p1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 26
    .line 27
    .line 28
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p1, v0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    return-object p0

    .line 37
    :catchall_0
    return-object v0
.end method

.method private static qRouteMsgService(Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "com.tencent.qqnt.msg.api.IMsgService"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->qRouteApi(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static bridge synthetic r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->msgRecordFromAny(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static refreshBindingKey(Landroid/view/View;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lyb;->a(Landroid/view/View;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static rememberAioMsgRecord(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_3

    .line 6
    :cond_0
    sget-object v0, Lcom/mr/elaris/MessageRepeater;->AIO_MSG_RECORDS:Ljava/util/Map;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v1, p1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 v1, 0x0

    .line 18
    :goto_0
    if-eqz v1, :cond_2

    .line 19
    .line 20
    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_2

    .line 26
    :cond_2
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    if-eqz v1, :cond_3

    .line 28
    .line 29
    invoke-static {p1}, Lcom/mr/elaris/MessageRepeater;->rememberMsgRecordId(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw p0

    .line 35
    :cond_3
    :goto_3
    return-void
.end method

.method private static rememberAioParam(Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    sput-object p0, Lcom/mr/elaris/MessageRepeater;->sAioParam:Ljava/lang/Object;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    const-string v0, "com.tencent.aio.data.AIOParam"

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    invoke-static {p0, v0, v1}, Lv4;->l(Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    sput-object p0, Lcom/mr/elaris/MessageRepeater;->sAioParam:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method

.method private static rememberAioParamFromArgs([Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    :goto_0
    array-length v1, p0

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    aget-object v1, p0, v0

    .line 9
    .line 10
    invoke-static {v1, p1}, Lcom/mr/elaris/MessageRepeater;->rememberAioParam(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    add-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    :goto_1
    return-void
.end method

.method private static rememberIconVisualState(Landroid/widget/ImageView;Ljava/lang/String;Z)V
    .locals 3

    .line 1
    if-eqz p0, :cond_6

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_5

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    move v1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move v1, v0

    .line 17
    :goto_0
    if-eqz v1, :cond_2

    .line 18
    .line 19
    if-eqz p2, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    const v1, 0x3d4ccccd    # 0.05f

    .line 26
    .line 27
    .line 28
    cmpg-float p2, p2, v1

    .line 29
    .line 30
    if-gtz p2, :cond_4

    .line 31
    .line 32
    :goto_1
    move v0, v2

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    const v1, 0x3ee66666    # 0.45f

    .line 41
    .line 42
    .line 43
    cmpl-float p2, p2, v1

    .line 44
    .line 45
    if-ltz p2, :cond_4

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 48
    .line 49
    .line 50
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    if-eqz p2, :cond_4

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    move v0, v1

    .line 55
    :catchall_0
    :cond_4
    :goto_2
    sget-object p2, Lyb;->c:Ljava/util/WeakHashMap;

    .line 56
    .line 57
    monitor-enter p2

    .line 58
    if-eqz v0, :cond_5

    .line 59
    .line 60
    :try_start_1
    invoke-virtual {p2, p0, p1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    goto :goto_3

    .line 64
    :catchall_1
    move-exception p0

    .line 65
    goto :goto_4

    .line 66
    :cond_5
    invoke-virtual {p2, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    :goto_3
    monitor-exit p2

    .line 70
    goto :goto_5

    .line 71
    :goto_4
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 72
    throw p0

    .line 73
    :cond_6
    :goto_5
    return-void
.end method

.method private static rememberMsgRecordId(Ljava/lang/Object;)V
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->msgId(Ljava/lang/Object;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    const/16 v1, 0x40

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-ltz v1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    sget-object v1, Lcom/mr/elaris/MessageRepeater;->AIO_MSG_RECORD_BY_ID:Ljava/util/Map;

    .line 24
    .line 25
    monitor-enter v1

    .line 26
    :try_start_0
    invoke-interface {v1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    monitor-exit v1

    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    throw p0

    .line 34
    :cond_2
    :goto_0
    return-void
.end method

.method private static rememberSendContact(Ljava/lang/Object;)V
    .locals 6

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->isLikelyContact(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sput-object p0, Lcom/mr/elaris/MessageRepeater;->sLastSendContact:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    sget-wide v2, Lcom/mr/elaris/MessageRepeater;->sLastSendContactLogAt:J

    .line 15
    .line 16
    sub-long v2, v0, v2

    .line 17
    .line 18
    const-wide/32 v4, 0xea60

    .line 19
    .line 20
    .line 21
    cmp-long v2, v2, v4

    .line 22
    .line 23
    if-lez v2, :cond_1

    .line 24
    .line 25
    sput-wide v0, Lcom/mr/elaris/MessageRepeater;->sLastSendContactLogAt:J

    .line 26
    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v1, "send contact captured class="

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v1, " chatType="

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->contactChatType(Ljava/lang/Object;)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    :goto_0
    return-void
.end method

.method private static removeCachedRepeaterImageView(Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    sget-object v0, Lcom/mr/elaris/MessageRepeater;->REPEATER_ICON_CACHE:Ljava/util/Map;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw p0
.end method

.method private static repeat(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    .line 179
    invoke-static {p0, p1, p2, v0}, Lcom/mr/elaris/MessageRepeater;->repeat(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;Z)V

    return-void
.end method

.method private static repeat(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;Z)V
    .locals 8

    .line 1
    const-string p1, "repeater send start"

    .line 2
    .line 3
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {p2}, Lcom/mr/elaris/MessageRepeater;->msgRecordFromAny(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v4

    .line 10
    if-nez v4, :cond_0

    .line 11
    .line 12
    const-string p0, "message record null"

    .line 13
    .line 14
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->logFail(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-static {v4}, Lcom/mr/elaris/MessageRepeater;->logMsgDetails(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0, v4}, Lcom/mr/elaris/MessageRepeater;->contactFromMsg(Ljava/lang/ClassLoader;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    sget-object p1, Lcom/mr/elaris/MessageRepeater;->sAioParam:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {p0, p1}, Lcom/mr/elaris/MessageRepeater;->contactFromAioParam(Ljava/lang/ClassLoader;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :cond_1
    move-object v3, p1

    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    const-string p0, "contact unresolved"

    .line 37
    .line 38
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->logFail(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    invoke-static {v3}, Lcom/mr/elaris/MessageRepeater;->logContactDetails(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->appRuntime(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-static {p0, v2}, Lcom/mr/elaris/MessageRepeater;->kernelMsgService(Ljava/lang/ClassLoader;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-nez p1, :cond_3

    .line 54
    .line 55
    invoke-static {v2}, Lcom/mr/elaris/MessageRepeater;->kernelMsgService(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :cond_3
    if-nez p1, :cond_4

    .line 60
    .line 61
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->qRouteMsgService(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :cond_4
    move-object v1, p1

    .line 66
    if-nez v1, :cond_5

    .line 67
    .line 68
    const-string p0, "kernel message service unresolved"

    .line 69
    .line 70
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->logFail(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_5
    invoke-static {p2, v4, p3}, Lcom/mr/elaris/MessageRepeater;->isReplyLikeMessage(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-eqz v7, :cond_6

    .line 79
    .line 80
    const-string p1, "repeater reply message detected, structured resend"

    .line 81
    .line 82
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_6
    invoke-static {v4}, Lcom/mr/elaris/MessageRepeater;->isPlainTextMessage(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-nez v7, :cond_7

    .line 90
    .line 91
    if-eqz p1, :cond_7

    .line 92
    .line 93
    invoke-static {p0, v1, v2, v3, v4}, Lcom/mr/elaris/MessageRepeater;->sendResolvedMessage(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    if-eqz p3, :cond_7

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_7
    invoke-static {p2, v4}, Lcom/mr/elaris/MessageRepeater;->msgIdLong(Ljava/lang/Object;Ljava/lang/Object;)J

    .line 101
    .line 102
    .line 103
    move-result-wide p2

    .line 104
    const-wide/16 v5, 0x0

    .line 105
    .line 106
    cmp-long v0, p2, v5

    .line 107
    .line 108
    if-lez v0, :cond_8

    .line 109
    .line 110
    move-object v0, p0

    .line 111
    move-object v6, v4

    .line 112
    move-wide v4, p2

    .line 113
    invoke-static/range {v0 .. v7}, Lcom/mr/elaris/MessageRepeater;->invokeGetMsgsByMsgId(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;Z)Z

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    move-object v4, v6

    .line 118
    if-eqz p0, :cond_9

    .line 119
    .line 120
    :goto_0
    return-void

    .line 121
    :cond_8
    move-object v0, p0

    .line 122
    :cond_9
    if-eqz v7, :cond_a

    .line 123
    .line 124
    const/4 v5, 0x1

    .line 125
    invoke-static/range {v0 .. v5}, Lcom/mr/elaris/MessageRepeater;->sendResolvedMessage(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)Z

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_a
    if-nez p1, :cond_b

    .line 130
    .line 131
    const-string p0, "non-text message refresh unresolved"

    .line 132
    .line 133
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->logFail(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_b
    invoke-static {v0, v1, v2, v3, v4}, Lcom/mr/elaris/MessageRepeater;->sendResolvedMessage(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :catchall_0
    move-exception v0

    .line 142
    move-object p0, v0

    .line 143
    new-instance p1, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const-string p2, ": "

    .line 160
    .line 161
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->logFail(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    return-void
.end method

.method private static repeat(Ljava/lang/ClassLoader;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    .line 180
    invoke-static {p0, v0, p1}, Lcom/mr/elaris/MessageRepeater;->repeat(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;)V

    return-void
.end method

.method private static repeat(Ljava/lang/ClassLoader;Lx9;)V
    .locals 6

    if-nez p1, :cond_0

    .line 181
    const-string p0, "text snapshot null"

    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->logFail(Ljava/lang/String;)V

    return-void

    .line 182
    :cond_0
    iget-object v2, p1, Lx9;->b:Ljava/lang/String;

    iget-object v4, p1, Lx9;->d:Ljava/lang/String;

    .line 183
    const-string v0, "repeater send start"

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 184
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "repeater msg found msgId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p1, Lx9;->e:Ljava/lang/String;

    invoke-static {v1}, Lcom/mr/elaris/MessageRepeater;->safeProbe(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 185
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "repeater msg text="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Lcom/mr/elaris/MessageRepeater;->safeProbe(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 186
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "repeater contact found class=snapshot chatType="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p1, Lx9;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " peerUid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    invoke-static {v2}, Lcom/mr/elaris/MessageRepeater;->safeProbe(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " guildId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lx9;->c:Ljava/lang/String;

    .line 188
    invoke-static {v1}, Lcom/mr/elaris/MessageRepeater;->safeProbe(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 189
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 190
    iget v1, p1, Lx9;->a:I

    iget-object v3, p1, Lx9;->c:Ljava/lang/String;

    const-string v5, "repeater"

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/mr/elaris/MessageRepeater;->sendPlainText(Ljava/lang/ClassLoader;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    return-void
.end method

.method private static repeatAsync(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    .line 21
    invoke-static {p0, p1, p2, v0}, Lcom/mr/elaris/MessageRepeater;->repeatAsync(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;Z)V

    return-void
.end method

.method private static repeatAsync(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;Z)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    new-instance v1, Lcom/mr/elaris/n;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2, p3}, Lcom/mr/elaris/n;-><init>(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;Z)V

    .line 6
    .line 7
    .line 8
    const-string p0, "Elaris-repeater-send"

    .line 9
    .line 10
    invoke-direct {v0, v1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private static repeatAsync(Ljava/lang/ClassLoader;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    .line 22
    invoke-static {p0, v0, p1}, Lcom/mr/elaris/MessageRepeater;->repeatAsync(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;)V

    return-void
.end method

.method private static repeatAsyncSmart(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    .line 109
    invoke-static {p0, p1, p2, v0}, Lcom/mr/elaris/MessageRepeater;->repeatAsyncSmart(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;Z)V

    return-void
.end method

.method private static repeatAsyncSmart(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;Z)V
    .locals 10

    .line 1
    sget-object v0, Lcom/mr/elaris/MessageRepeater;->sAioParam:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-static {p2}, Lcom/mr/elaris/MessageRepeater;->msgRecordFromAny(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    if-eqz v2, :cond_6

    .line 9
    .line 10
    invoke-static {p2, v2, p3}, Lcom/mr/elaris/MessageRepeater;->isReplyLikeMessage(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-nez v3, :cond_6

    .line 15
    .line 16
    invoke-static {v2}, Lcom/mr/elaris/MessageRepeater;->isPlainTextMessage(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    invoke-static {v2}, Lcom/mr/elaris/MessageRepeater;->msgText(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_1
    invoke-static {p0, v2}, Lcom/mr/elaris/MessageRepeater;->contactFromMsg(Ljava/lang/ClassLoader;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->contactFromAioParam(Ljava/lang/ClassLoader;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    :goto_0
    if-nez v3, :cond_3

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_3
    invoke-static {v3}, Lcom/mr/elaris/MessageRepeater;->contactChatType(Ljava/lang/Object;)I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    const/4 v0, 0x1

    .line 55
    if-eq v5, v0, :cond_4

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    if-eq v5, v0, :cond_4

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_4
    invoke-static {v3}, Lcom/mr/elaris/MessageRepeater;->contactPeer(Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_5

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_5
    invoke-static {v3}, Lcom/mr/elaris/MessageRepeater;->contactGuild(Ljava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    new-instance v4, Lx9;

    .line 77
    .line 78
    invoke-static {v2}, Lcom/mr/elaris/MessageRepeater;->msgId(Ljava/lang/Object;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-direct/range {v4 .. v9}, Lx9;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    move-object v1, v4

    .line 86
    goto :goto_2

    .line 87
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    const-string v3, "repeater text snapshot skipped reason="

    .line 90
    .line 91
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const-string v3, ": "

    .line 95
    .line 96
    invoke-static {v0, v2, v3}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_6
    :goto_2
    if-eqz v1, :cond_7

    .line 100
    .line 101
    invoke-static {p0, v1}, Lcom/mr/elaris/MessageRepeater;->repeatTextAsync(Ljava/lang/ClassLoader;Lx9;)V

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_7
    invoke-static {p0, p1, p2, p3}, Lcom/mr/elaris/MessageRepeater;->repeatAsync(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;Z)V

    .line 106
    .line 107
    .line 108
    :goto_3
    return-void
.end method

.method public static repeatFromLongPressMenu(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, p2, v0}, Lcom/mr/elaris/MessageRepeater;->repeatFromLongPressMenu(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static repeatFromLongPressMenu(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;Z)V
    .locals 0

    .line 6
    invoke-static {p0, p1, p2, p3}, Lcom/mr/elaris/MessageRepeater;->repeatAsyncSmart(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;Z)V

    return-void
.end method

.method private static repeatTextAsync(Ljava/lang/ClassLoader;Lx9;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    new-instance v1, Lcom/mr/elaris/o;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/mr/elaris/o;-><init>(Ljava/lang/ClassLoader;Lx9;)V

    .line 6
    .line 7
    .line 8
    const-string p0, "Elaris-repeater-send"

    .line 9
    .line 10
    invoke-direct {v0, v1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private static repeaterIconScore(Landroid/widget/ImageView;)I
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/high16 p0, -0x80000000

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    const/16 v1, 0x18

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/16 v1, -0x18

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move v1, v0

    .line 20
    :goto_0
    :try_start_1
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 21
    .line 22
    .line 23
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 24
    const v3, 0x3ee66666    # 0.45f

    .line 25
    .line 26
    .line 27
    cmpl-float v2, v2, v3

    .line 28
    .line 29
    if-ltz v2, :cond_2

    .line 30
    .line 31
    const/16 v2, 0xc

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    const/16 v2, -0xc

    .line 35
    .line 36
    :goto_1
    add-int/2addr v1, v2

    .line 37
    :catchall_1
    :try_start_2
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    .line 40
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    const/16 v2, 0x1a

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_3
    const/16 v2, -0x14

    .line 47
    .line 48
    :goto_2
    add-int/2addr v1, v2

    .line 49
    :catchall_2
    const/4 v2, 0x1

    .line 50
    invoke-static {p0, v2}, Lcom/mr/elaris/MessageRepeater;->viewSize(Landroid/view/View;Z)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->viewSize(Landroid/view/View;Z)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const/high16 v3, 0x41600000    # 14.0f

    .line 59
    .line 60
    invoke-static {p0, v3}, Lcom/mr/elaris/MessageRepeater;->dp(Landroid/view/View;F)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    const/high16 v4, 0x42700000    # 60.0f

    .line 65
    .line 66
    invoke-static {p0, v4}, Lcom/mr/elaris/MessageRepeater;->dp(Landroid/view/View;F)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-lt v2, v3, :cond_4

    .line 71
    .line 72
    if-lt v0, v3, :cond_4

    .line 73
    .line 74
    if-gt v2, v4, :cond_4

    .line 75
    .line 76
    if-gt v0, v4, :cond_4

    .line 77
    .line 78
    add-int/lit8 v1, v1, 0xe

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    if-gt v2, v4, :cond_5

    .line 82
    .line 83
    if-le v0, v4, :cond_6

    .line 84
    .line 85
    :cond_5
    add-int/lit8 v1, v1, -0x50

    .line 86
    .line 87
    :cond_6
    :goto_3
    const/4 v0, 0x5

    .line 88
    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->viewChainText(Landroid/view/View;I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 93
    .line 94
    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->viewCueText(Landroid/view/View;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->hasRepeaterCue(Landroid/widget/ImageView;)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-eqz p0, :cond_7

    .line 107
    .line 108
    add-int/lit8 v1, v1, 0x50

    .line 109
    .line 110
    :cond_7
    const-string p0, "follow"

    .line 111
    .line 112
    invoke-virtual {v0, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-nez p0, :cond_8

    .line 117
    .line 118
    const-string p0, "plus"

    .line 119
    .line 120
    invoke-virtual {v0, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-nez p0, :cond_8

    .line 125
    .line 126
    const-string p0, "repeat"

    .line 127
    .line 128
    invoke-virtual {v0, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    if-eqz p0, :cond_9

    .line 133
    .line 134
    :cond_8
    add-int/lit8 v1, v1, 0x12

    .line 135
    .line 136
    :cond_9
    const-string p0, "bubble"

    .line 137
    .line 138
    invoke-virtual {v0, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    const-string v3, "avatar"

    .line 143
    .line 144
    if-nez p0, :cond_a

    .line 145
    .line 146
    const-string p0, "content"

    .line 147
    .line 148
    invoke-virtual {v0, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    if-nez p0, :cond_a

    .line 153
    .line 154
    const-string p0, "text"

    .line 155
    .line 156
    invoke-virtual {v0, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    if-nez p0, :cond_a

    .line 161
    .line 162
    const-string p0, "pic"

    .line 163
    .line 164
    invoke-virtual {v0, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    if-nez p0, :cond_a

    .line 169
    .line 170
    const-string p0, "file"

    .line 171
    .line 172
    invoke-virtual {v0, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    if-nez p0, :cond_a

    .line 177
    .line 178
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    if-eqz p0, :cond_b

    .line 183
    .line 184
    :cond_a
    add-int/lit8 v1, v1, -0x3c

    .line 185
    .line 186
    :cond_b
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    if-nez p0, :cond_c

    .line 191
    .line 192
    const-string p0, "head"

    .line 193
    .line 194
    invoke-virtual {v2, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 195
    .line 196
    .line 197
    move-result p0

    .line 198
    if-eqz p0, :cond_d

    .line 199
    .line 200
    :cond_c
    add-int/lit8 v1, v1, -0x1e

    .line 201
    .line 202
    :cond_d
    return v1
.end method

.method private static repeaterVisualState(ZLjava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-string p0, "hidden"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-lez p0, :cond_1

    .line 13
    .line 14
    const-string p0, "custom:"

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_1
    const-string p0, "default"

    .line 22
    .line 23
    return-object p0
.end method

.method private static resolveCustomIcon(Landroid/widget/ImageView;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 62
    invoke-static {}, Lcom/mr/elaris/MessageRepeater;->currentCustomIconPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/mr/elaris/MessageRepeater;->resolveCustomIcon(Landroid/widget/ImageView;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method private static resolveCustomIcon(Landroid/widget/ImageView;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-lez v1, :cond_1

    .line 9
    .line 10
    sget-object v1, Lcom/mr/elaris/MessageRepeater;->sCustomIconBitmap:Landroid/graphics/Bitmap;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sget-object v2, Lcom/mr/elaris/MessageRepeater;->sCustomIconPath:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {p1, p0, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 29
    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_0
    :try_start_0
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    sput-object p1, Lcom/mr/elaris/MessageRepeater;->sCustomIconPath:Ljava/lang/String;

    .line 39
    .line 40
    sput-object v1, Lcom/mr/elaris/MessageRepeater;->sCustomIconBitmap:Landroid/graphics/Bitmap;

    .line 41
    .line 42
    const-string p1, "repeater icon loaded resource=custom-local"

    .line 43
    .line 44
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-direct {p1, p0, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    return-object p1

    .line 57
    :cond_1
    sput-object v0, Lcom/mr/elaris/MessageRepeater;->sCustomIconPath:Ljava/lang/String;

    .line 58
    .line 59
    sput-object v0, Lcom/mr/elaris/MessageRepeater;->sCustomIconBitmap:Landroid/graphics/Bitmap;

    .line 60
    .line 61
    :catchall_0
    :cond_2
    return-object v0
.end method

.method private static resolveDefaultIcon(Landroid/widget/ImageView;)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/high16 p0, 0x3f800000    # 1.0f

    .line 21
    .line 22
    :goto_0
    sget-boolean v0, Lcom/mr/elaris/MessageRepeater;->sDefaultIconLogged:Z

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    const-class v0, Lcom/mr/elaris/MessageRepeater;

    .line 27
    .line 28
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 29
    :try_start_1
    sget-boolean v1, Lcom/mr/elaris/MessageRepeater;->sDefaultIconLogged:Z

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    sput-boolean v1, Lcom/mr/elaris/MessageRepeater;->sDefaultIconLogged:Z

    .line 35
    .line 36
    const-string v1, "repeater icon loaded resource=elaris-default-plus-one"

    .line 37
    .line 38
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_2

    .line 44
    :cond_1
    :goto_1
    monitor-exit v0

    .line 45
    goto :goto_3

    .line 46
    :goto_2
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    :try_start_2
    throw p0

    .line 48
    :cond_2
    :goto_3
    new-instance v0, Lw9;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lw9;-><init>(F)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :catchall_1
    move-exception p0

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v1, "repeater icon default failed reason="

    .line 58
    .line 59
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v1, ": "

    .line 63
    .line 64
    invoke-static {p0, v0, v1}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    return-object p0
.end method

.method public static bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/MessageRepeater;->rememberAioMsgRecord(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static safeProbe(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    const/16 v0, 0xd

    .line 11
    .line 12
    const/16 v1, 0x20

    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/16 v0, 0xa

    .line 19
    .line 20
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/16 v0, 0x9

    .line 25
    .line 26
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/16 v1, 0xf0

    .line 35
    .line 36
    if-le v0, v1, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-string v0, "..."

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :cond_1
    return-object p0
.end method

.method private static scheduleAioMessageRefresh(Landroid/view/View;)V
    .locals 7

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto/16 :goto_6

    .line 4
    .line 5
    :cond_0
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->refreshBindingKey(Landroid/view/View;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    goto/16 :goto_6

    .line 12
    .line 13
    :cond_1
    const/4 v1, 0x0

    .line 14
    move-object v3, p0

    .line 15
    move v2, v1

    .line 16
    :goto_0
    const/16 v4, 0xe

    .line 17
    .line 18
    if-ge v2, v4, :cond_5

    .line 19
    .line 20
    if-eqz v3, :cond_5

    .line 21
    .line 22
    :try_start_0
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 23
    .line 24
    .line 25
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    instance-of v5, v4, Landroid/view/View;

    .line 27
    .line 28
    if-eqz v5, :cond_2

    .line 29
    .line 30
    move-object v6, v4

    .line 31
    check-cast v6, Landroid/view/View;

    .line 32
    .line 33
    invoke-static {v6}, Lu9;->q(Landroid/view/View;)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    if-nez v5, :cond_3

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    check-cast v4, Landroid/view/View;

    .line 44
    .line 45
    invoke-static {v4}, Lu9;->q(Landroid/view/View;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_4

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    move-object v3, v4

    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    :cond_5
    :goto_1
    if-nez v3, :cond_6

    .line 57
    .line 58
    move-object v3, p0

    .line 59
    :cond_6
    move-object v4, p0

    .line 60
    move v2, v1

    .line 61
    :goto_2
    const/16 v5, 0x10

    .line 62
    .line 63
    const/4 v6, 0x0

    .line 64
    if-ge v2, v5, :cond_9

    .line 65
    .line 66
    if-eqz v4, :cond_9

    .line 67
    .line 68
    invoke-static {v4}, Lu9;->q(Landroid/view/View;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_7

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_7
    :try_start_1
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 76
    .line 77
    .line 78
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 79
    instance-of v5, v4, Landroid/view/View;

    .line 80
    .line 81
    if-nez v5, :cond_8

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_8
    check-cast v4, Landroid/view/View;

    .line 85
    .line 86
    add-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :catchall_1
    :cond_9
    :goto_3
    move-object v4, v6

    .line 90
    :goto_4
    new-instance v2, Lx2;

    .line 91
    .line 92
    invoke-direct {v2}, Lx2;-><init>()V

    .line 93
    .line 94
    .line 95
    new-instance v5, Ljava/util/IdentityHashMap;

    .line 96
    .line 97
    invoke-direct {v5}, Ljava/util/IdentityHashMap;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-static {v5}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-virtual {v2, v3, v1, v5}, Lx2;->b(Landroid/view/View;ILjava/util/Set;)V

    .line 105
    .line 106
    .line 107
    iget-object v1, v2, Lx2;->a:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v1, Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_a

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_a
    move-object v6, v2

    .line 119
    :goto_5
    const/4 v1, 0x7

    .line 120
    new-array v1, v1, [J

    .line 121
    .line 122
    fill-array-data v1, :array_0

    .line 123
    .line 124
    .line 125
    new-instance v2, Lcom/mr/elaris/s;

    .line 126
    .line 127
    invoke-direct {v2, p0, v0}, Lcom/mr/elaris/s;-><init>(Landroid/view/View;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    new-instance v0, Lwb;

    .line 131
    .line 132
    invoke-direct {v0, v6, v3, v4}, Lwb;-><init>(Lx2;Landroid/view/View;Landroid/view/View;)V

    .line 133
    .line 134
    .line 135
    const-string v3, "aio-refresh"

    .line 136
    .line 137
    invoke-static {p0, v3, v1, v2, v0}, Lkc;->b(Landroid/view/View;Ljava/lang/String;[JLjc;Lhc;)V

    .line 138
    .line 139
    .line 140
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 141
    .line 142
    .line 143
    move-result-wide v0

    .line 144
    sget-wide v2, Lu9;->a:J

    .line 145
    .line 146
    sub-long v2, v0, v2

    .line 147
    .line 148
    const-wide/16 v4, 0xbb8

    .line 149
    .line 150
    cmp-long p0, v2, v4

    .line 151
    .line 152
    if-gez p0, :cond_b

    .line 153
    .line 154
    goto :goto_6

    .line 155
    :cond_b
    sput-wide v0, Lu9;->a:J

    .line 156
    .line 157
    const-string p0, "repeater aio row refresh scheduled"

    .line 158
    .line 159
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    :goto_6
    return-void

    .line 163
    :array_0
    .array-data 8
        0x50
        0xdc
        0x208
        0x44c
        0x708
        0xa28
        0xe10
    .end array-data
.end method

.method private static sendGeneratedElements(Ljava/lang/ClassLoader;ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 12

    .line 1
    move-object/from16 v7, p6

    .line 2
    .line 3
    const-string v2, ""

    .line 4
    .line 5
    const-string v8, " send failed reason="

    .line 6
    .line 7
    const/4 v9, 0x0

    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    move-object v3, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    :goto_0
    const/4 v10, 0x1

    .line 17
    if-eq p1, v10, :cond_1

    .line 18
    .line 19
    const/4 v4, 0x2

    .line 20
    if-eq p1, v4, :cond_1

    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v2, " send skipped reason=unsupported chatType="

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return v9

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_2

    .line 54
    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, " send skipped reason=empty target"

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return v9

    .line 76
    :cond_2
    if-eqz p4, :cond_f

    .line 77
    .line 78
    invoke-virtual/range {p4 .. p4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_3

    .line 83
    .line 84
    goto/16 :goto_4

    .line 85
    .line 86
    :cond_3
    move-object v4, v2

    .line 87
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->appRuntime(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    if-nez v2, :cond_4

    .line 92
    .line 93
    new-instance v0, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v1, " send failed reason=runtime null"

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    return v9

    .line 114
    :cond_4
    invoke-static {p0, v2}, Lcom/mr/elaris/MessageRepeater;->kernelMsgService(Ljava/lang/ClassLoader;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    if-nez v5, :cond_5

    .line 119
    .line 120
    invoke-static {v2}, Lcom/mr/elaris/MessageRepeater;->kernelMsgService(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    :cond_5
    if-nez v5, :cond_6

    .line 125
    .line 126
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->qRouteMsgService(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    :cond_6
    if-nez v5, :cond_7

    .line 131
    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v1, " send failed reason=msg service null"

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    return v9

    .line 153
    :cond_7
    if-nez p3, :cond_8

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_8
    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    :goto_1
    invoke-static {p0, p1, v3, v4}, Lcom/mr/elaris/MessageRepeater;->newContactFromData(Ljava/lang/ClassLoader;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    if-nez v4, :cond_9

    .line 165
    .line 166
    new-instance v0, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v2, " send failed reason=contact null chatType="

    .line 175
    .line 176
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    return v9

    .line 190
    :cond_9
    new-instance v6, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string v11, " send start chatType="

    .line 199
    .line 200
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    const-string v1, " peer="

    .line 207
    .line 208
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-static {v3}, Lcom/mr/elaris/MessageRepeater;->safeProbe(Ljava/lang/Object;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    new-instance v6, Ly9;

    .line 226
    .line 227
    invoke-direct {v6, v7}, Ly9;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    move-object v1, v5

    .line 231
    new-instance v5, Ljava/util/HashMap;

    .line 232
    .line 233
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 234
    .line 235
    .line 236
    move-object v0, p0

    .line 237
    move-object v3, v4

    .line 238
    move-object/from16 v4, p4

    .line 239
    .line 240
    invoke-static/range {v0 .. v6}, Lcom/mr/elaris/MessageRepeater;->invokeSend(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;Ljava/util/Map;Ly9;)Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-nez v0, :cond_a

    .line 245
    .line 246
    new-instance v0, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    const-string v1, " send failed reason=sendMsg method unresolved"

    .line 255
    .line 256
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 264
    .line 265
    .line 266
    return v9

    .line 267
    :cond_a
    :try_start_1
    iget-object v0, v6, Ly9;->b:Ljava/util/concurrent/CountDownLatch;

    .line 268
    .line 269
    const-wide/16 v1, 0x1

    .line 270
    .line 271
    const-wide/16 v3, 0x1388

    .line 272
    .line 273
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 274
    .line 275
    .line 276
    move-result-wide v1

    .line 277
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 278
    .line 279
    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 280
    .line 281
    .line 282
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 283
    goto :goto_2

    .line 284
    :catchall_1
    move-exception v0

    .line 285
    :try_start_2
    const-string v1, "callback wait interrupted"

    .line 286
    .line 287
    iput-object v1, v6, Ly9;->e:Ljava/lang/String;

    .line 288
    .line 289
    const-string v1, "repeater"

    .line 290
    .line 291
    const-string v2, "callback-wait"

    .line 292
    .line 293
    invoke-static {v1, v2, v0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 294
    .line 295
    .line 296
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 301
    .line 302
    .line 303
    move v0, v9

    .line 304
    :goto_2
    if-eqz v0, :cond_b

    .line 305
    .line 306
    iget-boolean v1, v6, Ly9;->c:Z

    .line 307
    .line 308
    if-eqz v1, :cond_b

    .line 309
    .line 310
    iget-boolean v1, v6, Ly9;->d:Z

    .line 311
    .line 312
    if-eqz v1, :cond_b

    .line 313
    .line 314
    return v10

    .line 315
    :cond_b
    new-instance v1, Ljava/lang/StringBuilder;

    .line 316
    .line 317
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    if-eqz v0, :cond_e

    .line 327
    .line 328
    iget-object v0, v6, Ly9;->e:Ljava/lang/String;

    .line 329
    .line 330
    if-eqz v0, :cond_c

    .line 331
    .line 332
    iget-object v0, v6, Ly9;->e:Ljava/lang/String;

    .line 333
    .line 334
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    if-lez v0, :cond_c

    .line 339
    .line 340
    iget-object v0, v6, Ly9;->e:Ljava/lang/String;

    .line 341
    .line 342
    goto :goto_3

    .line 343
    :cond_c
    iget-boolean v0, v6, Ly9;->c:Z

    .line 344
    .line 345
    if-eqz v0, :cond_d

    .line 346
    .line 347
    const-string v0, "callback failed"

    .line 348
    .line 349
    goto :goto_3

    .line 350
    :cond_d
    const-string v0, "callback missing"

    .line 351
    .line 352
    goto :goto_3

    .line 353
    :cond_e
    const-string v0, "callback timeout"

    .line 354
    .line 355
    :goto_3
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    goto :goto_6

    .line 366
    :cond_f
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 367
    .line 368
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    move-object/from16 v1, p5

    .line 378
    .line 379
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 387
    .line 388
    .line 389
    return v9

    .line 390
    :goto_5
    invoke-static {v0}, Lcom/mr/elaris/MessageRepeater;->unwrap(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    new-instance v1, Ljava/lang/StringBuilder;

    .line 395
    .line 396
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    const-string v2, ": "

    .line 406
    .line 407
    invoke-static {v0, v1, v2}, La;->d(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    :goto_6
    return v9
.end method

.method public static sendPlainText(Ljava/lang/ClassLoader;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    .line 1
    if-eqz p5, :cond_1

    .line 2
    .line 3
    invoke-virtual {p5}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    :goto_0
    move-object v6, p5

    .line 11
    goto :goto_2

    .line 12
    :cond_1
    :goto_1
    const-string p5, "plain-text"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :goto_2
    if-nez p4, :cond_2

    .line 16
    .line 17
    const-string p4, ""

    .line 18
    .line 19
    :cond_2
    invoke-virtual {p4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p5

    .line 23
    invoke-virtual {p5}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result p5

    .line 27
    if-nez p5, :cond_3

    .line 28
    .line 29
    const-string p0, " send skipped reason=empty text"

    .line 30
    .line 31
    invoke-virtual {v6, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return p0

    .line 40
    :cond_3
    invoke-static {p0, p4, v6}, Lcom/mr/elaris/MessageRepeater;->textElementsFromText(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const-string v5, "text element empty"

    .line 45
    .line 46
    move-object v0, p0

    .line 47
    move v1, p1

    .line 48
    move-object v2, p2

    .line 49
    move-object v3, p3

    .line 50
    invoke-static/range {v0 .. v6}, Lcom/mr/elaris/MessageRepeater;->sendGeneratedElements(Ljava/lang/ClassLoader;ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0
.end method

.method private static sendResolvedMessage(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 113
    invoke-static/range {v0 .. v5}, Lcom/mr/elaris/MessageRepeater;->sendResolvedMessage(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result p0

    return p0
.end method

.method private static sendResolvedMessage(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)Z
    .locals 7

    .line 1
    if-eqz p5, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    :goto_0
    move-object v5, v0

    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-static {p0, p4}, Lcom/mr/elaris/MessageRepeater;->freshTextElements(Ljava/lang/ClassLoader;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    goto :goto_0

    .line 11
    :goto_1
    const/4 v0, 0x1

    .line 12
    if-eqz v5, :cond_1

    .line 13
    .line 14
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    move-object v1, p0

    .line 22
    move-object v2, p1

    .line 23
    move-object v3, p2

    .line 24
    move-object v4, p3

    .line 25
    invoke-static/range {v1 .. v6}, Lcom/mr/elaris/MessageRepeater;->invokeSend(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;Ljava/util/Map;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    return v0

    .line 32
    :cond_1
    move-object v1, p0

    .line 33
    move-object v2, p1

    .line 34
    move-object v3, p2

    .line 35
    move-object v4, p3

    .line 36
    :cond_2
    const/4 p0, 0x0

    .line 37
    if-nez p5, :cond_3

    .line 38
    .line 39
    invoke-static {p4}, Lcom/mr/elaris/MessageRepeater;->isPlainTextMessage(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    const-string p1, "text element unresolved"

    .line 46
    .line 47
    invoke-static {p1}, Lcom/mr/elaris/MessageRepeater;->logFail(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return p0

    .line 51
    :cond_3
    invoke-static {p4}, Lcom/mr/elaris/MessageRepeater;->attrsFromMsg(Ljava/lang/Object;)Ljava/util/Map;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-static {p4}, Lcom/mr/elaris/MessageRepeater;->elementsFromMsg(Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p1, :cond_8

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-eqz p2, :cond_4

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    if-eqz p5, :cond_5

    .line 69
    .line 70
    invoke-static {p1, v6}, Lcom/mr/elaris/MessageRepeater;->hasSendableReplyStructure(Ljava/util/List;Ljava/util/Map;)Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-nez p2, :cond_5

    .line 75
    .line 76
    const-string p1, "reply structure unresolved"

    .line 77
    .line 78
    invoke-static {p1}, Lcom/mr/elaris/MessageRepeater;->logFail(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return p0

    .line 82
    :cond_5
    instance-of p2, p1, Ljava/util/ArrayList;

    .line 83
    .line 84
    if-nez p2, :cond_6

    .line 85
    .line 86
    new-instance p2, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 89
    .line 90
    .line 91
    move-object v5, p2

    .line 92
    goto :goto_2

    .line 93
    :cond_6
    move-object v5, p1

    .line 94
    :goto_2
    invoke-static/range {v1 .. v6}, Lcom/mr/elaris/MessageRepeater;->invokeSend(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;Ljava/util/Map;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_7

    .line 99
    .line 100
    return v0

    .line 101
    :cond_7
    const-string p1, "sendMsg method unresolved"

    .line 102
    .line 103
    invoke-static {p1}, Lcom/mr/elaris/MessageRepeater;->logFail(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return p0

    .line 107
    :cond_8
    :goto_3
    const-string p1, "message elements empty"

    .line 108
    .line 109
    invoke-static {p1}, Lcom/mr/elaris/MessageRepeater;->logFail(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return p0
.end method

.method private static varargs setAny(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    :goto_0
    array-length v1, p2

    .line 6
    if-ge v0, v1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    aget-object v2, p2, v0

    .line 13
    .line 14
    invoke-static {v1, v2}, Lcom/mr/elaris/MessageRepeater;->findField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    const/4 v2, 0x1

    .line 22
    :try_start_0
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    if-ne v2, v3, :cond_2

    .line 32
    .line 33
    instance-of v2, p1, Ljava/lang/Number;

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    move-object v2, p1

    .line 38
    check-cast v2, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    invoke-virtual {v1, p0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :catchall_0
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    :goto_2
    return-void
.end method

.method private static shouldLogBindSuccess()Z
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-class v2, Lcom/mr/elaris/MessageRepeater;

    .line 6
    .line 7
    monitor-enter v2

    .line 8
    :try_start_0
    sget-wide v3, Lcom/mr/elaris/MessageRepeater;->sBindSuccessLogWindowAt:J

    .line 9
    .line 10
    sub-long v3, v0, v3

    .line 11
    .line 12
    const-wide/16 v5, 0x3a98

    .line 13
    .line 14
    cmp-long v3, v3, v5

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    if-lez v3, :cond_0

    .line 18
    .line 19
    sput-wide v0, Lcom/mr/elaris/MessageRepeater;->sBindSuccessLogWindowAt:J

    .line 20
    .line 21
    sput v4, Lcom/mr/elaris/MessageRepeater;->sBindSuccessLogCount:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    sget v0, Lcom/mr/elaris/MessageRepeater;->sBindSuccessLogCount:I

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    if-lt v0, v1, :cond_1

    .line 30
    .line 31
    monitor-exit v2

    .line 32
    return v4

    .line 33
    :cond_1
    sget v0, Lcom/mr/elaris/MessageRepeater;->sBindSuccessLogCount:I

    .line 34
    .line 35
    add-int/2addr v0, v1

    .line 36
    sput v0, Lcom/mr/elaris/MessageRepeater;->sBindSuccessLogCount:I

    .line 37
    .line 38
    monitor-exit v2

    .line 39
    return v1

    .line 40
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    throw v0
.end method

.method private static shouldLogFollowProbe(Ljava/lang/String;)Z
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-object v2, Lcom/mr/elaris/MessageRepeater;->FOLLOW_PROBE_LOGS:Ljava/util/Map;

    .line 6
    .line 7
    monitor-enter v2

    .line 8
    :try_start_0
    invoke-interface {v2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    check-cast v3, Ljava/lang/Long;

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    sub-long v3, v0, v3

    .line 21
    .line 22
    const-wide/16 v5, 0x1388

    .line 23
    .line 24
    cmp-long v3, v3, v5

    .line 25
    .line 26
    if-gez v3, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    monitor-exit v2

    .line 30
    return p0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    monitor-exit v2

    .line 42
    return p0

    .line 43
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw p0
.end method

.method private static shouldTriggerRepeat(Landroid/widget/ImageView;Landroid/view/View;)Z
    .locals 7

    .line 1
    const-string p1, "message_repeater_mode"

    .line 2
    .line 3
    const-string v0, "single"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/mr/elaris/HookEntry;->runtimeString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "double"

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v0, 0x1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    return v0

    .line 19
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    sget-object p1, Lyb;->d:Ljava/util/WeakHashMap;

    .line 24
    .line 25
    monitor-enter p1

    .line 26
    :try_start_0
    invoke-virtual {p1, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/lang/Long;

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    sub-long v3, v1, v3

    .line 39
    .line 40
    const-wide/16 v5, 0x1c2

    .line 41
    .line 42
    cmp-long v3, v3, v5

    .line 43
    .line 44
    if-gtz v3, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    const-string p0, "repeater double click trigger"

    .line 51
    .line 52
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return v0

    .line 56
    :catchall_0
    move-exception p0

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    :try_start_1
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p1, p0, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    const-string p0, "repeater double click armed"

    .line 67
    .line 68
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    return p0

    .line 73
    :goto_0
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    throw p0
.end method

.method private static stringOf(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    const-string v1, "null"

    .line 21
    .line 22
    invoke-virtual {v1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return-object p0

    .line 30
    :cond_2
    :goto_0
    return-object v0
.end method

.method public static bridge synthetic t(Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/MessageRepeater;->rememberAioParam(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static textElementsFromText(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    const-string v0, "text"

    .line 2
    .line 3
    const-string v1, " text element created via IMsgUtilApi"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const-string v3, "com.tencent.qqnt.msg.api.IMsgUtilApi"

    .line 16
    .line 17
    invoke-static {p0, v3}, Lcom/mr/elaris/MessageRepeater;->qRouteApi(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-eqz p0, :cond_3

    .line 22
    .line 23
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-string v4, "createTextElement"

    .line 28
    .line 29
    const-class v5, Ljava/lang/String;

    .line 30
    .line 31
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const/4 v4, 0x1

    .line 40
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 41
    .line 42
    .line 43
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v3, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-eqz p0, :cond_3

    .line 52
    .line 53
    new-instance p1, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    if-nez p2, :cond_1

    .line 62
    .line 63
    move-object p0, v0

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move-object p0, p2

    .line 66
    :goto_0
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    return-object p1

    .line 74
    :catchall_0
    move-exception p0

    .line 75
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->unwrap(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    new-instance p1, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    if-nez p2, :cond_2

    .line 85
    .line 86
    move-object p2, v0

    .line 87
    :cond_2
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string p2, " send failed reason=createTextElement "

    .line 91
    .line 92
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string p2, ": "

    .line 107
    .line 108
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :cond_3
    :goto_1
    return-object v2
.end method

.method private static textFromElement(Ljava/lang/Object;I)Ljava/lang/String;
    .locals 11

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-eqz p0, :cond_b

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    if-le p1, v1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_3

    .line 9
    .line 10
    :cond_0
    instance-of v1, p0, Ljava/lang/CharSequence;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_1
    instance-of v1, p0, Ljava/lang/Number;

    .line 20
    .line 21
    if-nez v1, :cond_b

    .line 22
    .line 23
    instance-of v1, p0, Ljava/lang/Boolean;

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_2
    const-string v1, "getContent"

    .line 30
    .line 31
    invoke-static {p0, v1}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Lcom/mr/elaris/MessageRepeater;->stringOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-lez v2, :cond_3

    .line 44
    .line 45
    return-object v1

    .line 46
    :cond_3
    const-string v1, "getText"

    .line 47
    .line 48
    invoke-static {p0, v1}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1}, Lcom/mr/elaris/MessageRepeater;->stringOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-lez v2, :cond_4

    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_4
    const-string v1, "getTextElement"

    .line 64
    .line 65
    invoke-static {p0, v1}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    const/4 v2, 0x1

    .line 70
    add-int/2addr p1, v2

    .line 71
    invoke-static {v1, p1}, Lcom/mr/elaris/MessageRepeater;->textFromElement(Ljava/lang/Object;I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-lez v3, :cond_5

    .line 80
    .line 81
    return-object v1

    .line 82
    :cond_5
    const-string v9, "arkElement"

    .line 83
    .line 84
    const-string v10, "structMsgElement"

    .line 85
    .line 86
    const-string v4, "textElement"

    .line 87
    .line 88
    const-string v5, "text"

    .line 89
    .line 90
    const-string v6, "content"

    .line 91
    .line 92
    const-string v7, "msg"

    .line 93
    .line 94
    const-string v8, "summary"

    .line 95
    .line 96
    filled-new-array/range {v4 .. v10}, [Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-static {p0, v1}, Lcom/mr/elaris/MessageRepeater;->firstObject(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {v1, p1}, Lcom/mr/elaris/MessageRepeater;->textFromElement(Ljava/lang/Object;I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-lez v3, :cond_6

    .line 113
    .line 114
    return-object v1

    .line 115
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    :goto_0
    if-eqz v1, :cond_b

    .line 120
    .line 121
    const-class v3, Ljava/lang/Object;

    .line 122
    .line 123
    if-eq v1, v3, :cond_b

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    const/4 v4, 0x0

    .line 130
    :goto_1
    array-length v5, v3

    .line 131
    if-ge v4, v5, :cond_a

    .line 132
    .line 133
    aget-object v5, v3, v4

    .line 134
    .line 135
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-nez v6, :cond_9

    .line 144
    .line 145
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    invoke-virtual {v6}, Ljava/lang/Class;->isPrimitive()Z

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    if-eqz v6, :cond_7

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_7
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    const-string v7, "text"

    .line 165
    .line 166
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 167
    .line 168
    .line 169
    move-result v7

    .line 170
    if-nez v7, :cond_8

    .line 171
    .line 172
    const-string v7, "content"

    .line 173
    .line 174
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    if-nez v7, :cond_8

    .line 179
    .line 180
    const-string v7, "summary"

    .line 181
    .line 182
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    if-nez v6, :cond_8

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_8
    :try_start_0
    invoke-virtual {v5, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    invoke-static {v5, p1}, Lcom/mr/elaris/MessageRepeater;->textFromElement(Ljava/lang/Object;I)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 201
    .line 202
    .line 203
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 204
    if-lez v6, :cond_9

    .line 205
    .line 206
    return-object v5

    .line 207
    :catchall_0
    :cond_9
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_a
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    goto :goto_0

    .line 215
    :cond_b
    :goto_3
    return-object v0
.end method

.method public static bridge synthetic u([Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/MessageRepeater;->rememberAioParamFromArgs([Ljava/lang/Object;Ljava/lang/Class;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static unhookMessageFollowRepeater()V
    .locals 7

    .line 1
    sget-boolean v0, Lcom/mr/elaris/MessageRepeater;->sFollowHookInstalled:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/mr/elaris/MessageRepeater;->FOLLOW_UNHOOKS:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    sget-object v0, Lcom/mr/elaris/MessageRepeater;->FOLLOW_UNHOOKS:Ljava/util/List;

    .line 15
    .line 16
    monitor-enter v0

    .line 17
    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v2, 0x0

    .line 22
    move v3, v2

    .line 23
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 34
    .line 35
    :try_start_1
    invoke-virtual {v4}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;->unhook()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v4

    .line 42
    :try_start_2
    const-string v5, "message-repeater"

    .line 43
    .line 44
    const-string v6, "unhook-follow"

    .line 45
    .line 46
    invoke-static {v5, v6, v4}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_1
    move-exception v1

    .line 51
    goto :goto_2

    .line 52
    :cond_1
    sget-object v1, Lcom/mr/elaris/MessageRepeater;->FOLLOW_UNHOOKS:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 55
    .line 56
    .line 57
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 58
    sput-boolean v2, Lcom/mr/elaris/MessageRepeater;->sFollowHookInstalled:Z

    .line 59
    .line 60
    sget-object v1, Lcom/mr/elaris/MessageRepeater;->REPEATER_ICON_CACHE:Ljava/util/Map;

    .line 61
    .line 62
    monitor-enter v1

    .line 63
    :try_start_3
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 64
    .line 65
    .line 66
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 67
    if-lez v3, :cond_2

    .line 68
    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v1, "repeater follow hooks uninstalled count="

    .line 72
    .line 73
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_2
    :goto_1
    return-void

    .line 87
    :catchall_2
    move-exception v0

    .line 88
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 89
    throw v0

    .line 90
    :goto_2
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 91
    throw v1
.end method

.method private static uniqueIdArg(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p1, p2, p3}, Lcom/mr/elaris/MessageRepeater;->uniqueLong(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    sget-object p3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 6
    .line 7
    if-eq p0, p3, :cond_4

    .line 8
    .line 9
    const-class p3, Ljava/lang/Long;

    .line 10
    .line 11
    if-ne p0, p3, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    sget-object p3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 15
    .line 16
    if-eq p0, p3, :cond_3

    .line 17
    .line 18
    const-class p3, Ljava/lang/Integer;

    .line 19
    .line 20
    if-ne p0, p3, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const-class p3, Ljava/lang/String;

    .line 24
    .line 25
    if-ne p0, p3, :cond_2

    .line 26
    .line 27
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_2
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_3
    :goto_0
    const-wide/32 v0, 0x7fffffff

    .line 38
    .line 39
    .line 40
    and-long p0, p1, v0

    .line 41
    .line 42
    long-to-int p0, p0

    .line 43
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_4
    :goto_1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method private static uniqueLong(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)J
    .locals 4

    .line 1
    invoke-static {p1, p2}, Lcom/mr/elaris/MessageRepeater;->generateMsgUniqueId(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    cmp-long p2, v2, v0

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    return-wide p0

    .line 22
    :cond_0
    const-string p1, "getCurrentAccountUin"

    .line 23
    .line 24
    invoke-static {p0, p1}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    const-string p1, "getCurrentAccountUid"

    .line 31
    .line 32
    invoke-static {p0, p1}, Lcom/mr/elaris/MessageRepeater;->call(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :cond_1
    if-nez p1, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    int-to-long v0, p0

    .line 48
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 49
    .line 50
    .line 51
    move-result-wide p0

    .line 52
    const/16 p2, 0x14

    .line 53
    .line 54
    shl-long/2addr p0, p2

    .line 55
    const-wide/32 v2, 0xfffff

    .line 56
    .line 57
    .line 58
    and-long/2addr v0, v2

    .line 59
    xor-long/2addr p0, v0

    .line 60
    return-wide p0
.end method

.method private static unwrap(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 2

    .line 1
    instance-of v0, p0, Ljava/lang/reflect/InvocationTargetException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Ljava/lang/reflect/InvocationTargetException;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    if-nez p0, :cond_1

    .line 20
    .line 21
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "unknown"

    .line 24
    .line 25
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-object p0
.end method

.method public static bridge synthetic v(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->rememberSendContact(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static valueAfterKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-eqz p0, :cond_6

    .line 4
    .line 5
    if-eqz p1, :cond_6

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_3

    .line 14
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-gez v1, :cond_1

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    add-int/2addr p1, v1

    .line 26
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    :goto_0
    if-ge p1, v1, :cond_3

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/16 v3, 0x3a

    .line 37
    .line 38
    if-eq v2, v3, :cond_2

    .line 39
    .line 40
    const/16 v3, 0x3d

    .line 41
    .line 42
    if-eq v2, v3, :cond_2

    .line 43
    .line 44
    invoke-static {v2}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    move v2, p1

    .line 54
    :goto_1
    if-ge v2, v1, :cond_5

    .line 55
    .line 56
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-static {v3}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-nez v4, :cond_4

    .line 65
    .line 66
    const/16 v4, 0x5f

    .line 67
    .line 68
    if-eq v3, v4, :cond_4

    .line 69
    .line 70
    const/16 v4, 0x2d

    .line 71
    .line 72
    if-eq v3, v4, :cond_4

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_5
    :goto_2
    if-le v2, p1, :cond_6

    .line 79
    .line 80
    invoke-virtual {p0, p1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0

    .line 89
    :cond_6
    :goto_3
    return-object v0
.end method

.method private static viewChainText(Landroid/view/View;I)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    instance-of v2, p0, Landroid/view/View;

    .line 8
    .line 9
    if-eqz v2, :cond_3

    .line 10
    .line 11
    add-int/lit8 v2, v1, 0x1

    .line 12
    .line 13
    if-ge v1, p1, :cond_3

    .line 14
    .line 15
    check-cast p0, Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-lez v1, :cond_0

    .line 22
    .line 23
    const-string v1, " <- "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    const-string v3, " tag="

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lcom/mr/elaris/MessageRepeater;->safeProbe(Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    :catchall_0
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    const-string v3, " desc="

    .line 64
    .line 65
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-static {v1}, Lcom/mr/elaris/MessageRepeater;->safeProbe(Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    .line 74
    .line 75
    :catchall_1
    :cond_2
    :try_start_2
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 76
    .line 77
    .line 78
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 79
    move v1, v2

    .line 80
    goto :goto_0

    .line 81
    :catchall_2
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0
.end method

.method private static viewCueText(Landroid/view/View;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x20

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    :catchall_0
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    .line 36
    .line 37
    :catchall_1
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method private static viewSize(Landroid/view/View;Z)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    :goto_0
    if-gtz v1, :cond_3

    .line 17
    .line 18
    if-eqz p1, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    goto :goto_1

    .line 25
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    :cond_3
    :goto_1
    if-gtz v1, :cond_5

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_5

    .line 36
    .line 37
    if-eqz p1, :cond_4

    .line 38
    .line 39
    iget p0, p0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 40
    .line 41
    :goto_2
    move v1, p0

    .line 42
    goto :goto_3

    .line 43
    :cond_4
    iget p0, p0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_5
    :goto_3
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0
.end method

.method public static bridge synthetic w(Ljava/lang/ClassLoader;Lx9;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/MessageRepeater;->repeat(Ljava/lang/ClassLoader;Lx9;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic x(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/mr/elaris/MessageRepeater;->repeat(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic y(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/MessageRepeater;->repeatAsyncSmart(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic z(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->scheduleAioMessageRefresh(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
