.class public LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۥۧۧ;->ۥ۟۟ۡۧ(Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡۢ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/ClassLoader;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۟ۥۧۧ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۥۧۧ;Ljava/lang/ClassLoader;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            null,
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۥۧۧ;

    iput-object p2, p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥ۟۟ۡۢ:Ljava/lang/String;

    if-nez p0, :cond_0

    const-wide v0, 0x77ec2fabeaf3d9daL    # 4.653320093219656E269

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥ۟۟ۡۢ:Ljava/lang/String;

    :cond_0
    return-object p0

    :pswitch_1
    sget-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥ۟۟ۡۡ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x23ba4f57c177adc6L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥ۟۟ۡۡ:Ljava/lang/String;

    :cond_1
    return-object p0

    :pswitch_2
    sget-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥ۟۟ۡ۠:Ljava/lang/String;

    if-nez p0, :cond_2

    const-wide v0, -0x13f589394f004af6L    # -2.7840814992158646E212

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥ۟۟ۡ۠:Ljava/lang/String;

    :cond_2
    return-object p0

    :pswitch_3
    sget-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥ۟۟ۡ۟:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x59a8fc6762be835dL    # 8.258556531531258E123

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥ۟۟ۡ۟:Ljava/lang/String;

    :cond_3
    return-object p0

    :pswitch_4
    sget-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_4

    const-wide v0, -0x12c3fd60f55e1576L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥ۟۟ۡ:Ljava/lang/String;

    :cond_4
    return-object p0

    :pswitch_5
    sget-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, 0x19a3c54a4102a570L    # 3.635079695384694E-185

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_5
    return-object p0

    :pswitch_6
    sget-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_6

    const-wide v0, 0x403b7b50c1964e02L    # 27.481700991816986

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_6
    return-object p0

    :pswitch_7
    sget-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, 0x25eb7f91bbc1bf33L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_7
    return-object p0

    :pswitch_8
    sget-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_8

    const-wide v0, -0x2e5fe8bd0644fd56L    # -1.5629612136927377E85

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_8
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    const/4 v3, 0x1

    aget-object v0, v0, v3

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    invoke-static {v1}, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v5, v0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v5, 0x3

    if-ne v0, v5, :cond_0

    invoke-static {}, LYue/ۥ۟ۥۧۧ;->ۥ۟۟۠()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LYue/ۥ۟ۥۧۧ;->ۥ۟۟۠()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    sget v2, Lcom/yuexin/panel/R$ۥ۟۟۟;->ۥ۟۟ۢۥ:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    sget v6, Lcom/yuexin/panel/R$ۥ۟۟۟;->ۥ۟۟ۢۧ:I

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v3}, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, LYue/ۥۡۡۤۤ;->ۥۣ۟۟۟()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v3, Lcom/yuexin/panel/R$ۥ۟۟۟;->ۥ۟۟ۢۤ:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/4 v3, 0x2

    invoke-static {v3}, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v3, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    invoke-static {v5}, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-static {p1, v1}, LYue/ۥ۠ۡۧۤ;->ۥ۟(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    iget-object v3, p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    const/4 v4, 0x4

    invoke-static {v4}, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    invoke-static {p1, v3}, LYue/ۥ۠ۡۧۤ;->ۥ۟(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    new-instance v3, LYue/ۥۣ۠ۡۧ;

    invoke-direct {v3}, LYue/ۥۣ۠ۡۧ;-><init>()V

    invoke-virtual {v3, p1}, LYue/ۥۣ۠ۡۧ;->ۥۣ۟۟۟(Ljava/lang/Object;)LYue/ۥۣ۠ۡۧ;

    move-result-object p1

    const-class v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, LYue/ۥۣ۠ۡۧ;->ۥ۟۟۟ۥ(Ljava/lang/Class;)LYue/ۥۣ۠ۡۧ;

    move-result-object v4

    const/4 v5, 0x5

    invoke-static {v5}, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, LYue/ۥۣ۠ۡۧ;->ۥ۟(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const/4 v5, 0x0

    invoke-virtual {p1, v5}, LYue/ۥۣ۠ۡۧ;->ۥ۟۟۟ۥ(Ljava/lang/Class;)LYue/ۥۣ۠ۡۧ;

    move-result-object p1

    const/4 v5, 0x6

    invoke-static {v5}, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, LYue/ۥۣ۠ۡۧ;->ۥ۟(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    new-instance p1, LYue/ۥۣ۠ۡۧ;

    invoke-direct {p1}, LYue/ۥۣ۠ۡۧ;-><init>()V

    invoke-virtual {p1, v1}, LYue/ۥۣ۠ۡۧ;->ۥۣ۟۟۟(Ljava/lang/Object;)LYue/ۥۣ۠ۡۧ;

    move-result-object p1

    invoke-virtual {p1, v3}, LYue/ۥۣ۠ۡۧ;->ۥ۟۟۟ۥ(Ljava/lang/Class;)LYue/ۥۣ۠ۡۧ;

    move-result-object p1

    const/4 v1, 0x7

    invoke-static {v1}, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, LYue/ۥۣ۠ۡۧ;->ۥ۟(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v3, 0x8

    invoke-static {v3}, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۨ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۥۧۧ;

    invoke-static {v1, p1, v4, v0}, LYue/ۥ۟ۥۧۧ;->ۥ۟۟۠۟(LYue/ۥ۟ۥۧۧ;Ljava/lang/String;Ljava/lang/String;Landroid/widget/TextView;)V

    :cond_0
    return-void
.end method
