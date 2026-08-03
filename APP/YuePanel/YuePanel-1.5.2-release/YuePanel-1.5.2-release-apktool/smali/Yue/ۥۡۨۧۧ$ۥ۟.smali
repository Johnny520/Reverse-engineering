.class public LYue/ۥۡۨۧۧ$ۥ۟;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۨۧۧ;->ۥ۟۟۟۟(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۨ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/Class;

.field public final synthetic ۥ۟۟۠ۤ:Ljava/lang/Class;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۡۨۧۧ;


# direct methods
.method public constructor <init>(LYue/ۥۡۨۧۧ;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۨۧۧ$ۥ۟;->ۥ۟۟۠ۥ:LYue/ۥۡۨۧۧ;

    iput-object p2, p0, LYue/ۥۡۨۧۧ$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/Class;

    iput-object p3, p0, LYue/ۥۡۨۧۧ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/Class;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥۡۨۧۧ$ۥ۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, -0x18b174636e93ed98L    # -4.2529718339848424E189

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۨۧۧ$ۥ۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥۡۨۧۧ$ۥ۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, -0x6d2d3f438b33885aL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۨۧۧ$ۥ۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥۡۨۧۧ$ۥ۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, 0x1bdba506b62544d1L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۨۧۧ$ۥ۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_5
    return-object p0
.end method

.method public static synthetic ۥ(Landroid/widget/Button;)V
    .locals 0

    invoke-static {p0}, LYue/ۥۡۨۧۧ$ۥ۟;->ۥ۟۟۟(Landroid/widget/Button;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟(Landroid/widget/Button;)V
    .locals 1

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-static {p0}, LYue/ۥۡۨۧۧ;->ۥ۟۟۟(Landroid/widget/Button;)Landroid/widget/Button;

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥۡۨۧۧ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    invoke-static {v0}, LYue/ۥۡۨۧۧ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    iget-object v1, p0, LYue/ۥۡۨۧۧ$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/Class;

    iget-object v2, p0, LYue/ۥۡۨۧۧ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/Class;

    invoke-static {v1, v2, v0}, LYue/ۥ۠ۡۧۤ;->ۥ(Ljava/lang/Class;Ljava/lang/Class;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Field;

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    check-cast v1, Landroid/widget/Button;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v3}, LYue/ۥۡۨۧۧ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, LYue/ۥۡۨۧۨ;

    invoke-direct {v0, v1}, LYue/ۥۡۨۧۨ;-><init>(Landroid/widget/Button;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_3
    :goto_1
    return-void
.end method
