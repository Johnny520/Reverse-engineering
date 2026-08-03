.class public LYue/ۥۣۡۤۦ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۡۤۦ;->load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
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


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣۡۤۦ;


# direct methods
.method public constructor <init>(LYue/ۥۣۡۤۦ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣۡۤۦ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣۡۤۦ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_8

    const/4 v0, 0x1

    if-eq p0, v0, :cond_6

    const/4 v0, 0x2

    if-eq p0, v0, :cond_4

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥۣۡۤۦ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, -0x3055a36aef72701fL    # -5.961856399798789E75

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۦ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥۣۡۤۦ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x631580a313e89bb6L    # 2.0287395786440918E169

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۦ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥۣۡۤۦ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, -0x11ba35037c20ba9aL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۦ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_5
    return-object p0

    :cond_6
    sget-object p0, LYue/ۥۣۡۤۦ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, -0x65d43ad2e1129ff2L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۦ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_7
    return-object p0

    :cond_8
    sget-object p0, LYue/ۥۣۡۤۦ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_9

    const-wide v0, 0x642df5413d69afbdL    # 3.704765389456504E174

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۡۤۦ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_9
    return-object p0
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const-class v0, Ljava/lang/String;

    const/4 v1, 0x3

    const/4 v2, 0x1

    :try_start_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object p1, p1, v2

    check-cast p1, Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v5, v0, v0, v5}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-static {}, LYue/ۥۣۡۤۦ;->ۥ()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3}, LYue/ۥۣۡۤۦ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2}, LYue/ۥۣۡۤۦ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v4, v5, v6, v7}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۡ()Landroid/content/Context;

    move-result-object v4

    sget v5, Lcom/yuexin/panel/R$ۥ۟۟;->ۥ۟۟:I

    invoke-virtual {v4, v5}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    const/4 v5, 0x2

    invoke-static {v5}, LYue/ۥۣۡۤۦ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5, v4}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟ۦ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p1, v3, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1}, LYue/ۥۣۡۤۦ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۨۡۢ;->ۥ(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x4

    invoke-static {v1}, LYue/ۥۣۡۤۦ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۢ(Ljava/lang/String;I)V

    :goto_0
    return-void
.end method
