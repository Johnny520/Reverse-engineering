.class public LYue/ۥۣۣۡ$ۥ۟;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۣۡ;->load(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
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


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣۣۡ;


# direct methods
.method public constructor <init>(LYue/ۥۣۣۡ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣۣۡ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۡ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_6

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥۣۣۡ$ۥ۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x7d937739369c7aa7L    # 7.956574649493708E296

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۣۡ$ۥ۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥۣۣۡ$ۥ۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, -0x5dff76747c09ca1cL    # -6.62180378266675E-145

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۣۡ$ۥ۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥۣۣۡ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, 0x1b3f88a89b2dee01L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۣۡ$ۥ۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_5
    return-object p0

    :cond_6
    sget-object p0, LYue/ۥۣۣۡ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, 0x54b397d80a940ac0L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۣۡ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_7
    return-object p0
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 6

    const/4 v0, 0x1

    :try_start_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object p1, p1, v0

    check-cast p1, Ljava/util/List;

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۡ()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LYue/ۥۡۦۦۧ;->ۥ(Landroid/content/Context;)V

    iget-object v1, p0, LYue/ۥۣۣۡ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۡ;

    invoke-static {v1}, LYue/ۥۣۣۡ;->ۥ۟۟۟(LYue/ۥۣۣۡ;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-static {v1}, LYue/ۥۣۣۡ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, LYue/ۥۣۣۡ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۡ;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0}, LYue/ۥۣۣۡ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    sget v5, Lcom/yuexin/panel/R$ۥ۟۟;->ۥ۟۟:I

    invoke-static {v2, v3, v4, v5}, LYue/ۥۣۣۡ;->ۥ۟۟۟۠(LYue/ۥۣۣۡ;Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v2, p0, LYue/ۥۣۣۡ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۡ;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x2

    invoke-static {v3}, LYue/ۥۣۣۡ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/yuexin/panel/R$ۥ۟۟;->ۥۣ۟۟۠:I

    invoke-static {v2, v1, v3, v4}, LYue/ۥۣۣۡ;->ۥ۟۟۟۠(LYue/ۥۣۣۡ;Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, LYue/ۥۣۣۡ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۣۡ;

    invoke-static {p1, v0}, LYue/ۥۣۣۡ;->ۥ۟۟۟۟(LYue/ۥۣۣۡ;Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x3

    invoke-static {v2}, LYue/ۥۣۣۡ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۢ(Ljava/lang/String;I)V

    :goto_2
    return-void
.end method
