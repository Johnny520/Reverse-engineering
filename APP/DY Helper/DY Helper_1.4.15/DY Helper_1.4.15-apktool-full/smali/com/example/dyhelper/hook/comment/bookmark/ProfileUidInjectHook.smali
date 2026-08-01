.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;

.field private static final MAX_RETRY:I = 0xa

.field private static final PAD_USER_FRAGMENT_CLASS:Ljava/lang/String;

.field private static final RETRY_DELAY_MS:J = 0xb4L

.field private static final TAG:Ljava/lang/String; = "ProfileUidInjectHook"

.field private static final UID_TAG:Ljava/lang/String; = "dyhelper_profile_uid_view"

.field private static final USER_FIELD_CANDIDATES:[Ljava/lang/String;

.field private static final USER_FRAGMENT_CLASS:Ljava/lang/String;

.field private static final WRAPPER_TAG:Ljava/lang/String; = "dyhelper_profile_wrapper"

.field private static final injectedByFragment:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/widget/TextView;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final installed:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final mainHandler:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;

    .line 7
    .line 8
    const-string v0, "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22A325AEF903414FAFE45A7E3E2147D4EB64C679F2AFDEF96783477651D7DF068CED"

    .line 9
    .line 10
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->USER_FRAGMENT_CLASS:Ljava/lang/String;

    .line 15
    .line 16
    const-string v0, "~7960BFBA0FA02BB4BD37AD83E4D6EDE425E18DDCF451803836217D34BD7D72D16231458ADC81F3BB67CF752648FD34F650B7E71CDB9B002211E983EBC3"

    .line 17
    .line 18
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->PAD_USER_FRAGMENT_CLASS:Ljava/lang/String;

    .line 23
    .line 24
    const-string v0, "n"

    .line 25
    .line 26
    const-string v1, "w"

    .line 27
    .line 28
    const-string v2, "B"

    .line 29
    .line 30
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->USER_FIELD_CANDIDATES:[Ljava/lang/String;

    .line 35
    .line 36
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->installed:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 43
    .line 44
    new-instance v0, Landroid/os/Handler;

    .line 45
    .line 46
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->mainHandler:Landroid/os/Handler;

    .line 54
    .line 55
    new-instance v0, Ljava/util/WeakHashMap;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 58
    .line 59
    .line 60
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->injectedByFragment:Ljava/util/WeakHashMap;

    .line 61
    .line 62
    const/16 v0, 0x8

    .line 63
    .line 64
    sput v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->$stable:I

    .line 65
    .line 66
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

.method public static final synthetic access$cleanup(Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->cleanup(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final cleanup(Ljava/lang/Object;)V
    .locals 3

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->injectedByFragment:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Landroid/widget/TextView;

    .line 17
    .line 18
    if-eqz p0, :cond_6

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    check-cast p1, Landroid/view/ViewGroup;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move-object p1, v1

    .line 33
    :goto_0
    if-eqz p1, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move-object v0, v1

    .line 41
    :goto_1
    const-string v2, "dyhelper_profile_wrapper"

    .line 42
    .line 43
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_4

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    move-object v1, p0

    .line 58
    check-cast v1, Landroid/view/ViewGroup;

    .line 59
    .line 60
    :cond_3
    if-eqz v1, :cond_6

    .line 61
    .line 62
    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 71
    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    move-object v1, p1

    .line 75
    check-cast v1, Landroid/view/ViewGroup;

    .line 76
    .line 77
    :cond_5
    if-eqz v1, :cond_6

    .line 78
    .line 79
    invoke-virtual {v1, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    :catchall_0
    :cond_6
    :goto_2
    return-void
.end method

.method private final cloneLayoutParams(Landroid/view/ViewGroup;Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 3

    .line 1
    const/4 p0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    if-eqz v0, :cond_2

    .line 10
    .line 11
    :try_start_0
    const-string v1, "generateLayoutParams"

    .line 12
    .line 13
    const-class v2, Landroid/view/ViewGroup$LayoutParams;

    .line 14
    .line 15
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 25
    .line 26
    .line 27
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    instance-of v2, v1, Landroid/view/ViewGroup$LayoutParams;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    check-cast v1, Landroid/view/ViewGroup$LayoutParams;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    return-object v1

    .line 42
    :catchall_0
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    return-object p0
.end method

.method private final createUidView(Landroid/app/Activity;Ljava/lang/String;)Landroid/widget/TextView;
    .locals 4

    .line 1
    new-instance p0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "dyhelper_profile_uid_view"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "UID: "

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "#99FFFFFF"

    .line 29
    .line 30
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 35
    .line 36
    .line 37
    const/high16 v0, 0x41400000    # 12.0f

    .line 38
    .line 39
    const/4 v1, 0x2

    .line 40
    invoke-virtual {p0, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 45
    .line 46
    .line 47
    const v2, 0x800003

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 51
    .line 52
    .line 53
    const/4 v2, 0x1

    .line 54
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 55
    .line 56
    .line 57
    const v3, 0x3f733333    # 0.95f

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 61
    .line 62
    .line 63
    sget-object v3, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;

    .line 64
    .line 65
    invoke-direct {v3, p1, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->dp(Landroid/app/Activity;I)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-virtual {p0, v0, v1, v0, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v2}, Landroid/view/View;->setClickable(Z)V

    .line 76
    .line 77
    .line 78
    new-instance v0, Lc9;

    .line 79
    .line 80
    invoke-direct {v0, p0, p1, p2}, Lc9;-><init>(Landroid/widget/TextView;Landroid/app/Activity;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    .line 85
    .line 86
    return-object p0
.end method

.method private static final createUidView$lambda$29$lambda$28(Landroid/widget/TextView;Landroid/app/Activity;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    .line 1
    :try_start_0
    const-string p0, "clipboard"

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of p3, p0, Landroid/content/ClipboardManager;

    .line 8
    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    check-cast p0, Landroid/content/ClipboardManager;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    :goto_0
    if-eqz p0, :cond_1

    .line 16
    .line 17
    const-string p3, "UID"

    .line 18
    .line 19
    invoke-static {p3, p2}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p0, p2}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 24
    .line 25
    .line 26
    const-string p0, "UID\u5df2\u590d\u5236\u5230\u526a\u8d34\u677f"

    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-static {p1, p0, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 34
    .line 35
    .line 36
    :cond_1
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    new-instance p1, Leo1;

    .line 41
    .line 42
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    move-object p0, p1

    .line 46
    :goto_1
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    const-string p1, "ProfileUidInjectHook"

    .line 53
    .line 54
    const-string p2, "copy uid failed"

    .line 55
    .line 56
    invoke-static {p1, p2, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    return-void
.end method

.method private final dp(Landroid/app/Activity;I)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

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
    int-to-float p1, p2

    .line 12
    mul-float/2addr p1, p0

    .line 13
    const/high16 p0, 0x3f000000    # 0.5f

    .line 14
    .line 15
    add-float/2addr p1, p0

    .line 16
    float-to-int p0, p1

    .line 17
    return p0
.end method

.method private final findActivity(Ljava/lang/Object;)Landroid/app/Activity;
    .locals 1

    .line 1
    :try_start_0
    const-string p0, "getActivity"

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    new-array v0, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    invoke-static {p1, p0, v0}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    instance-of p1, p0, Landroid/app/Activity;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    check-cast p0, Landroid/app/Activity;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :catchall_0
    :cond_0
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method private final findBooleanMethod(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Method;"
        }
    .end annotation

    .line 1
    :goto_0
    const/4 p0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    const-class v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    array-length v1, v0

    .line 20
    const/4 v2, 0x0

    .line 21
    move v3, v2

    .line 22
    :goto_1
    if-ge v3, v1, :cond_1

    .line 23
    .line 24
    aget-object v4, v0, v3

    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-static {v5, p2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    array-length v5, v5

    .line 41
    const/4 v6, 0x1

    .line 42
    if-ne v5, v6, :cond_0

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    aget-object v5, v5, v2

    .line 49
    .line 50
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    invoke-static {v5, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_0

    .line 57
    .line 58
    move-object p0, v4

    .line 59
    goto :goto_2

    .line 60
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    :goto_2
    if-eqz p0, :cond_2

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    goto :goto_0

    .line 71
    :cond_3
    return-object p0
.end method

.method private final findHostFragment(Landroid/view/ViewGroup;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method private final findInjectedView(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 0

    .line 1
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->injectedByFragment:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroid/widget/TextView;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method private final findUniqueIdTextView(Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    .line 1
    new-instance p0, Ljava/util/IdentityHashMap;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->findUniqueIdTextView$dfs(Ljava/util/IdentityHashMap;Landroid/view/View;)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final findUniqueIdTextView$dfs(Ljava/util/IdentityHashMap;Landroid/view/View;)Landroid/view/View;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/IdentityHashMap<",
            "Landroid/view/View;",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroid/view/View;",
            ")",
            "Landroid/view/View;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_4

    .line 5
    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    goto/16 :goto_4

    .line 13
    .line 14
    :cond_1
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-interface {p0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    instance-of v1, p1, Landroid/widget/TextView;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_7

    .line 23
    .line 24
    move-object v1, p1

    .line 25
    check-cast v1, Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move-object v3, v0

    .line 39
    :goto_0
    const-string v4, ""

    .line 40
    .line 41
    if-nez v3, :cond_3

    .line 42
    .line 43
    move-object v3, v4

    .line 44
    :cond_3
    invoke-static {v3}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v1}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    goto :goto_1

    .line 63
    :cond_4
    move-object v1, v0

    .line 64
    :goto_1
    if-nez v1, :cond_5

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_5
    move-object v4, v1

    .line 68
    :goto_2
    invoke-static {v4}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const-string v4, "\u6296\u97f3\u53f7"

    .line 77
    .line 78
    invoke-static {v3, v4, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-nez v5, :cond_6

    .line 83
    .line 84
    const-string v5, "UID"

    .line 85
    .line 86
    const/4 v6, 0x1

    .line 87
    invoke-static {v3, v5, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    if-nez v7, :cond_6

    .line 92
    .line 93
    const-string v7, "unique"

    .line 94
    .line 95
    invoke-static {v3, v7, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-nez v3, :cond_6

    .line 100
    .line 101
    invoke-static {v1, v4, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-nez v3, :cond_6

    .line 106
    .line 107
    invoke-static {v1, v5, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-nez v3, :cond_6

    .line 112
    .line 113
    invoke-static {v1, v7, v6}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_7

    .line 118
    .line 119
    :cond_6
    return-object p1

    .line 120
    :cond_7
    instance-of v1, p1, Landroid/view/ViewGroup;

    .line 121
    .line 122
    if-eqz v1, :cond_9

    .line 123
    .line 124
    check-cast p1, Landroid/view/ViewGroup;

    .line 125
    .line 126
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    :goto_3
    if-ge v2, v1, :cond_9

    .line 131
    .line 132
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-static {p0, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->findUniqueIdTextView$dfs(Ljava/util/IdentityHashMap;Landroid/view/View;)Landroid/view/View;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    if-eqz v3, :cond_8

    .line 141
    .line 142
    return-object v3

    .line 143
    :cond_8
    add-int/lit8 v2, v2, 0x1

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_9
    :goto_4
    return-object v0
.end method

.method private final hookFragment(Ljava/lang/ClassLoader;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {p1, p2}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_3

    .line 8
    .line 9
    :cond_0
    :try_start_0
    const-string v0, "onViewCreated"

    .line 10
    .line 11
    const-class v1, Landroid/view/View;

    .line 12
    .line 13
    const-class v2, Landroid/os/Bundle;

    .line 14
    .line 15
    new-instance v3, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook$hookFragment$1$1;

    .line 16
    .line 17
    invoke-direct {v3, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook$hookFragment$1$1;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;)V

    .line 18
    .line 19
    .line 20
    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {p1, v0, v1}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 25
    .line 26
    .line 27
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    new-instance v1, Leo1;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    move-object v0, v1

    .line 36
    :goto_0
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "ProfileUidInjectHook"

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    const-string v2, "hook onViewCreated failed: "

    .line 45
    .line 46
    invoke-virtual {v2, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    :try_start_1
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 54
    .line 55
    const-string v0, "onResume"

    .line 56
    .line 57
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook$hookFragment$3$1;

    .line 58
    .line 59
    invoke-direct {v2, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook$hookFragment$3$1;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;)V

    .line 60
    .line 61
    .line 62
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-static {p1, v0, v2}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 67
    .line 68
    .line 69
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    goto :goto_1

    .line 71
    :catchall_1
    move-exception v0

    .line 72
    new-instance v2, Leo1;

    .line 73
    .line 74
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    move-object v0, v2

    .line 78
    :goto_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    const-string v2, "hook onResume failed: "

    .line 85
    .line 86
    invoke-virtual {v2, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    new-instance v0, Lgy0;

    .line 94
    .line 95
    const/4 v2, 0x1

    .line 96
    invoke-direct {v0, v2}, Lgy0;-><init>(I)V

    .line 97
    .line 98
    .line 99
    const-string v2, "setUserVisibleHint"

    .line 100
    .line 101
    invoke-direct {p0, p1, v2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->hookOptionalBooleanMethod(Ljava/lang/Class;Ljava/lang/String;Le80;)V

    .line 102
    .line 103
    .line 104
    new-instance v0, Lgy0;

    .line 105
    .line 106
    const/4 v2, 0x2

    .line 107
    invoke-direct {v0, v2}, Lgy0;-><init>(I)V

    .line 108
    .line 109
    .line 110
    const-string v2, "onHiddenChanged"

    .line 111
    .line 112
    invoke-direct {p0, p1, v2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->hookOptionalBooleanMethod(Ljava/lang/Class;Ljava/lang/String;Le80;)V

    .line 113
    .line 114
    .line 115
    :try_start_2
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 116
    .line 117
    const-string v0, "onDestroyView"

    .line 118
    .line 119
    new-instance v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook$hookFragment$7$1;

    .line 120
    .line 121
    invoke-direct {v2, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook$hookFragment$7$1;-><init>(Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;)V

    .line 122
    .line 123
    .line 124
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-static {p1, v0, p0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 129
    .line 130
    .line 131
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 132
    goto :goto_2

    .line 133
    :catchall_2
    move-exception p0

    .line 134
    new-instance p1, Leo1;

    .line 135
    .line 136
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    move-object p0, p1

    .line 140
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    if-eqz p0, :cond_3

    .line 145
    .line 146
    const-string p1, "hook onDestroyView failed: "

    .line 147
    .line 148
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-static {v1, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    :cond_3
    :goto_3
    return-void
.end method

.method private static final hookFragment$lambda$4(Lk01;Z)Ls62;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    sget-object p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;

    .line 7
    .line 8
    iget-object p0, p0, Lk01;->β:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {p1, p0, v2, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->scheduleInject$default(Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;Ljava/lang/Object;IILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    sget-object p0, Ls62;->α:Ls62;

    .line 20
    .line 21
    return-object p0
.end method

.method private static final hookFragment$lambda$5(Lk01;Z)Ls62;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    sget-object p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;

    .line 7
    .line 8
    iget-object p0, p0, Lk01;->β:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {p1, p0, v2, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->scheduleInject$default(Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;Ljava/lang/Object;IILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    sget-object p0, Ls62;->α:Ls62;

    .line 20
    .line 21
    return-object p0
.end method

.method private final hookOptionalBooleanMethod(Ljava/lang/Class;Ljava/lang/String;Le80;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Le80;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->findBooleanMethod(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "(boolean)"

    .line 6
    .line 7
    const-string v1, "#"

    .line 8
    .line 9
    const-string v2, "ProfileUidInjectHook"

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string p1, "optional method missing: "

    .line 18
    .line 19
    invoke-static {p1, p0, v1, p2, v0}, Llz1;->ξ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {v2, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const/4 v3, 0x1

    .line 28
    :try_start_0
    invoke-virtual {p0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 29
    .line 30
    .line 31
    sget-object v3, Lxq0;->α:Lxq0;

    .line 32
    .line 33
    new-instance v4, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook$hookOptionalBooleanMethod$1$1;

    .line 34
    .line 35
    invoke-direct {v4, p3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook$hookOptionalBooleanMethod$1$1;-><init>(Le80;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, p0, v4}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 39
    .line 40
    .line 41
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    new-instance p3, Leo1;

    .line 45
    .line 46
    invoke-direct {p3, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    move-object p0, p3

    .line 50
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string p3, "hook optional method failed: "

    .line 61
    .line 62
    invoke-static {p3, p1, v1, p2, v0}, Llz1;->ξ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {v2, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    return-void
.end method

.method private final isConstraintLayoutParent(Landroid/view/ViewGroup;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v0, "androidx.constraintlayout.widget.ConstraintLayout"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method private final resolveUid(Ljava/lang/Object;)Ljava/lang/String;
    .locals 7

    .line 1
    const/4 p0, 0x0

    .line 2
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->USER_FIELD_CANDIDATES:[Ljava/lang/String;

    .line 3
    .line 4
    array-length v1, v0

    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    if-ge v3, v1, :cond_7

    .line 8
    .line 9
    aget-object v4, v0, v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    .line 11
    :try_start_1
    invoke-static {p1, v4}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    if-nez v4, :cond_1

    .line 16
    .line 17
    :cond_0
    :goto_1
    move-object v4, p0

    .line 18
    goto :goto_5

    .line 19
    :cond_1
    instance-of v5, v4, Ljava/lang/Boolean;

    .line 20
    .line 21
    if-nez v5, :cond_0

    .line 22
    .line 23
    instance-of v5, v4, Ljava/lang/Number;

    .line 24
    .line 25
    if-nez v5, :cond_0

    .line 26
    .line 27
    instance-of v5, v4, Ljava/lang/String;

    .line 28
    .line 29
    if-eqz v5, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    const-string v5, "uid"

    .line 33
    .line 34
    invoke-static {v4, v5}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    instance-of v5, v4, Ljava/lang/String;

    .line 39
    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    check-cast v4, Ljava/lang/String;

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :catchall_0
    move-exception v4

    .line 46
    goto :goto_4

    .line 47
    :cond_3
    move-object v4, p0

    .line 48
    :goto_2
    if-eqz v4, :cond_0

    .line 49
    .line 50
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-nez v5, :cond_0

    .line 55
    .line 56
    move v5, v2

    .line 57
    :goto_3
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-ge v5, v6, :cond_5

    .line 62
    .line 63
    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    invoke-static {v6}, Ljava/lang/Character;->isDigit(C)Z

    .line 68
    .line 69
    .line 70
    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    if-nez v6, :cond_4

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :goto_4
    :try_start_2
    new-instance v5, Leo1;

    .line 78
    .line 79
    invoke-direct {v5, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    move-object v4, v5

    .line 83
    :cond_5
    :goto_5
    instance-of v5, v4, Leo1;

    .line 84
    .line 85
    if-eqz v5, :cond_6

    .line 86
    .line 87
    move-object v4, p0

    .line 88
    :cond_6
    check-cast v4, Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 89
    .line 90
    if-nez v4, :cond_8

    .line 91
    .line 92
    add-int/lit8 v3, v3, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :catchall_1
    move-exception p1

    .line 96
    goto :goto_6

    .line 97
    :cond_7
    move-object v4, p0

    .line 98
    goto :goto_7

    .line 99
    :goto_6
    new-instance v4, Leo1;

    .line 100
    .line 101
    invoke-direct {v4, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    :cond_8
    :goto_7
    instance-of p1, v4, Leo1;

    .line 105
    .line 106
    if-eqz p1, :cond_9

    .line 107
    .line 108
    move-object v4, p0

    .line 109
    :cond_9
    check-cast v4, Ljava/lang/String;

    .line 110
    .line 111
    if-eqz v4, :cond_b

    .line 112
    .line 113
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-eqz p1, :cond_a

    .line 118
    .line 119
    goto :goto_8

    .line 120
    :cond_a
    return-object v4

    .line 121
    :cond_b
    :goto_8
    sget-object p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;

    .line 122
    .line 123
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkProfileHook;->getLastProfileRecord()Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-eqz p1, :cond_c

    .line 128
    .line 129
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->getUid()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    if-eqz p1, :cond_c

    .line 134
    .line 135
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-nez v0, :cond_c

    .line 140
    .line 141
    goto :goto_9

    .line 142
    :cond_c
    move-object p1, p0

    .line 143
    :goto_9
    if-eqz p1, :cond_e

    .line 144
    .line 145
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_d

    .line 150
    .line 151
    goto :goto_a

    .line 152
    :cond_d
    return-object p1

    .line 153
    :cond_e
    :goto_a
    sget-object p1, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 154
    .line 155
    sget-object p1, Lb10;->γ:Ljava/lang/String;

    .line 156
    .line 157
    if-eqz p1, :cond_f

    .line 158
    .line 159
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-nez v0, :cond_f

    .line 164
    .line 165
    move-object p0, p1

    .line 166
    :cond_f
    return-object p0
.end method

.method private final scheduleInject(Ljava/lang/Object;I)V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-direct {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->tryInject(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    sget-object p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->mainHandler:Landroid/os/Handler;

    .line 20
    .line 21
    new-instance v0, Ljj1;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, p2, v1, p1}, Ljj1;-><init>(IILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static synthetic scheduleInject$default(Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;Ljava/lang/Object;IILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->scheduleInject(Ljava/lang/Object;I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final scheduleInject$lambda$11(Ljava/lang/Object;I)V
    .locals 1

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->tryInject(Ljava/lang/Object;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final tryInject(Ljava/lang/Object;I)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    invoke-direct/range {p0 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->findActivity(Ljava/lang/Object;)Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    goto/16 :goto_8

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    if-eqz v4, :cond_1

    .line 20
    .line 21
    invoke-virtual {v4}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v4, 0x0

    .line 27
    :goto_0
    instance-of v6, v4, Landroid/view/ViewGroup;

    .line 28
    .line 29
    if-eqz v6, :cond_2

    .line 30
    .line 31
    check-cast v4, Landroid/view/ViewGroup;

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    const/4 v4, 0x0

    .line 35
    :goto_1
    if-nez v4, :cond_3

    .line 36
    .line 37
    goto/16 :goto_8

    .line 38
    .line 39
    :cond_3
    invoke-direct/range {p0 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->resolveUid(Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    const-wide/16 v7, 0xb4

    .line 44
    .line 45
    const/16 v9, 0xa

    .line 46
    .line 47
    if-eqz v6, :cond_13

    .line 48
    .line 49
    invoke-static {v6}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    if-eqz v10, :cond_4

    .line 54
    .line 55
    goto/16 :goto_7

    .line 56
    .line 57
    :cond_4
    invoke-direct {v0, v4}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->findUniqueIdTextView(Landroid/view/ViewGroup;)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    if-nez v4, :cond_5

    .line 62
    .line 63
    if-ge v2, v9, :cond_14

    .line 64
    .line 65
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->mainHandler:Landroid/os/Handler;

    .line 66
    .line 67
    new-instance v3, Ljj1;

    .line 68
    .line 69
    const/4 v4, 0x2

    .line 70
    invoke-direct {v3, v2, v4, v1}, Ljj1;-><init>(IILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v3, v7, v8}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_5
    const-string v2, "profile_uid_show_enabled"

    .line 78
    .line 79
    const/4 v7, 0x0

    .line 80
    invoke-static {v2, v7}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    const-string v8, "profile_bookmark_hook_enabled"

    .line 85
    .line 86
    invoke-static {v8, v7}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    const/4 v9, 0x1

    .line 91
    if-eqz v8, :cond_6

    .line 92
    .line 93
    const-string v8, "profile_bookmark_show_enabled"

    .line 94
    .line 95
    invoke-static {v8, v7}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-eqz v8, :cond_6

    .line 100
    .line 101
    move v8, v9

    .line 102
    goto :goto_2

    .line 103
    :cond_6
    move v8, v7

    .line 104
    :goto_2
    if-nez v2, :cond_7

    .line 105
    .line 106
    if-nez v8, :cond_7

    .line 107
    .line 108
    goto/16 :goto_8

    .line 109
    .line 110
    :cond_7
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    instance-of v11, v10, Landroid/view/ViewGroup;

    .line 115
    .line 116
    if-eqz v11, :cond_8

    .line 117
    .line 118
    check-cast v10, Landroid/view/ViewGroup;

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_8
    const/4 v10, 0x0

    .line 122
    :goto_3
    if-nez v10, :cond_9

    .line 123
    .line 124
    goto/16 :goto_8

    .line 125
    .line 126
    :cond_9
    invoke-virtual {v10}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    const-string v12, "dyhelper_profile_wrapper"

    .line 131
    .line 132
    invoke-static {v11, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    if-eqz v11, :cond_a

    .line 137
    .line 138
    goto/16 :goto_8

    .line 139
    .line 140
    :cond_a
    invoke-virtual {v10, v12}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object v11

    .line 144
    if-eqz v11, :cond_b

    .line 145
    .line 146
    goto/16 :goto_8

    .line 147
    .line 148
    :cond_b
    invoke-direct/range {p0 .. p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->findInjectedView(Ljava/lang/Object;)Landroid/widget/TextView;

    .line 149
    .line 150
    .line 151
    move-result-object v11

    .line 152
    const/16 v13, 0x8

    .line 153
    .line 154
    if-eqz v11, :cond_d

    .line 155
    .line 156
    invoke-virtual {v11}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    const-string v1, "dyhelper_profile_uid_view"

    .line 161
    .line 162
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_14

    .line 167
    .line 168
    if-eqz v2, :cond_c

    .line 169
    .line 170
    const-string v0, "UID: "

    .line 171
    .line 172
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v11, v7}, Landroid/view/View;->setVisibility(I)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_c
    invoke-virtual {v11, v13}, Landroid/view/View;->setVisibility(I)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :cond_d
    invoke-virtual {v10, v4}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 188
    .line 189
    .line 190
    move-result v11

    .line 191
    if-gez v11, :cond_e

    .line 192
    .line 193
    goto/16 :goto_8

    .line 194
    .line 195
    :cond_e
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 196
    .line 197
    .line 198
    move-result-object v14

    .line 199
    invoke-direct {v0, v10, v14}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->cloneLayoutParams(Landroid/view/ViewGroup;Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    .line 200
    .line 201
    .line 202
    move-result-object v14

    .line 203
    const-string v15, "ProfileUidInjectHook"

    .line 204
    .line 205
    if-nez v14, :cond_f

    .line 206
    .line 207
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    const-string v1, "skip inject: unsupported parent="

    .line 216
    .line 217
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-static {v15, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :cond_f
    :try_start_0
    new-instance v5, Landroid/widget/LinearLayout;

    .line 226
    .line 227
    invoke-direct {v5, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v5, v12}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v5, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 234
    .line 235
    .line 236
    const v9, 0x800003

    .line 237
    .line 238
    .line 239
    invoke-virtual {v5, v9}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 246
    .line 247
    .line 248
    invoke-direct {v0, v10}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->isConstraintLayoutParent(Landroid/view/ViewGroup;)Z

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    if-eqz v7, :cond_10

    .line 253
    .line 254
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    const/4 v9, -0x1

    .line 259
    if-eq v7, v9, :cond_10

    .line 260
    .line 261
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 262
    .line 263
    .line 264
    move-result v7

    .line 265
    invoke-virtual {v5, v7}, Landroid/view/View;->setId(I)V

    .line 266
    .line 267
    .line 268
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 269
    .line 270
    .line 271
    move-result v7

    .line 272
    invoke-virtual {v4, v7}, Landroid/view/View;->setId(I)V

    .line 273
    .line 274
    .line 275
    goto :goto_4

    .line 276
    :catchall_0
    move-exception v0

    .line 277
    goto :goto_6

    .line 278
    :cond_10
    :goto_4
    invoke-virtual {v10, v11}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 279
    .line 280
    .line 281
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 282
    .line 283
    const/4 v9, -0x2

    .line 284
    invoke-direct {v7, v9, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v5, v4, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 288
    .line 289
    .line 290
    if-eqz v2, :cond_11

    .line 291
    .line 292
    invoke-direct {v0, v3, v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->createUidView(Landroid/app/Activity;Ljava/lang/String;)Landroid/widget/TextView;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 297
    .line 298
    invoke-direct {v2, v9, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 299
    .line 300
    .line 301
    sget-object v4, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;

    .line 302
    .line 303
    const/4 v6, 0x4

    .line 304
    invoke-direct {v4, v3, v6}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->dp(Landroid/app/Activity;I)I

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    iput v4, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 309
    .line 310
    invoke-virtual {v5, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 311
    .line 312
    .line 313
    goto :goto_5

    .line 314
    :cond_11
    const/4 v0, 0x0

    .line 315
    :goto_5
    if-eqz v8, :cond_12

    .line 316
    .line 317
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;

    .line 318
    .line 319
    invoke-virtual {v2, v3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->getOrCreateInfoButton(Landroid/content/Context;)Landroid/widget/TextView;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 324
    .line 325
    invoke-direct {v4, v9, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 326
    .line 327
    .line 328
    sget-object v6, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;

    .line 329
    .line 330
    invoke-direct {v6, v3, v13}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->dp(Landroid/app/Activity;I)I

    .line 331
    .line 332
    .line 333
    move-result v3

    .line 334
    iput v3, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 335
    .line 336
    invoke-virtual {v5, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 337
    .line 338
    .line 339
    if-nez v0, :cond_12

    .line 340
    .line 341
    move-object v0, v2

    .line 342
    :cond_12
    invoke-virtual {v10, v5, v11, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 343
    .line 344
    .line 345
    if-eqz v0, :cond_14

    .line 346
    .line 347
    sget-object v2, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->injectedByFragment:Ljava/util/WeakHashMap;

    .line 348
    .line 349
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 350
    .line 351
    invoke-direct {v3, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 355
    .line 356
    .line 357
    return-void

    .line 358
    :goto_6
    const-string v1, "inject uid wrapper failed"

    .line 359
    .line 360
    invoke-static {v15, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 361
    .line 362
    .line 363
    return-void

    .line 364
    :cond_13
    :goto_7
    if-ge v2, v9, :cond_14

    .line 365
    .line 366
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->mainHandler:Landroid/os/Handler;

    .line 367
    .line 368
    new-instance v3, Ljj1;

    .line 369
    .line 370
    const/4 v4, 0x1

    .line 371
    invoke-direct {v3, v2, v4, v1}, Ljj1;-><init>(IILjava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0, v3, v7, v8}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 375
    .line 376
    .line 377
    :cond_14
    :goto_8
    return-void
.end method

.method private static final tryInject$lambda$12(Ljava/lang/Object;I)V
    .locals 1

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->tryInject(Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static final tryInject$lambda$13(Ljava/lang/Object;I)V
    .locals 1

    .line 1
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->tryInject(Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic α(Landroid/widget/TextView;Landroid/app/Activity;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->createUidView$lambda$29$lambda$28(Landroid/widget/TextView;Landroid/app/Activity;Ljava/lang/String;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic β(Lk01;Z)Ls62;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->hookFragment$lambda$5(Lk01;Z)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic γ(Lk01;Z)Ls62;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->hookFragment$lambda$4(Lk01;Z)Ls62;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic δ(ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->tryInject$lambda$12(Ljava/lang/Object;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic ε(ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->tryInject$lambda$13(Ljava/lang/Object;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic ζ(ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->scheduleInject$lambda$11(Ljava/lang/Object;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final init(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->installed:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->USER_FRAGMENT_CLASS:Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {p0, p1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->hookFragment(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->PAD_USER_FRAGMENT_CLASS:Ljava/lang/String;

    .line 21
    .line 22
    invoke-direct {p0, p1, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->hookFragment(Ljava/lang/ClassLoader;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string p0, "ProfileUidInjectHook"

    .line 26
    .line 27
    const-string p1, "installed"

    .line 28
    .line 29
    invoke-static {p0, p1}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final requestInject(Landroid/app/Activity;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move-object p1, v0

    .line 17
    :goto_0
    instance-of v1, p1, Landroid/view/ViewGroup;

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    check-cast p1, Landroid/view/ViewGroup;

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_2
    move-object p1, v0

    .line 25
    :goto_1
    if-nez p1, :cond_3

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_3
    invoke-direct {p0, p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->findHostFragment(Landroid/view/ViewGroup;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-nez p1, :cond_4

    .line 33
    .line 34
    :goto_2
    return-void

    .line 35
    :cond_4
    const/4 v1, 0x0

    .line 36
    const/4 v2, 0x2

    .line 37
    invoke-static {p0, p1, v1, v2, v0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->scheduleInject$default(Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;Ljava/lang/Object;IILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method
