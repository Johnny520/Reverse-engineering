.class public LYue/ۥ۟ۢۢۡ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۢۢۡ;->ۥ۟۟۠(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
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


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟ۢۢۡ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۢۢۡ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۢۢۡ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۢۢۡ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, LYue/ۥ۟ۢۢۡ$ۥ;->ۥ۟۟ۡ۟:Ljava/lang/String;

    if-nez p0, :cond_0

    const-wide v0, -0x67a1b1acc7aeac7fL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۢۢۡ$ۥ;->ۥ۟۟ۡ۟:Ljava/lang/String;

    :cond_0
    return-object p0

    :pswitch_1
    sget-object p0, LYue/ۥ۟ۢۢۡ$ۥ;->ۥ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x1c946ead9181dcd6L    # 5.287136124755402E-171

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۢۢۡ$ۥ;->ۥ۟۟ۡ:Ljava/lang/String;

    :cond_1
    return-object p0

    :pswitch_2
    sget-object p0, LYue/ۥ۟ۢۢۡ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_2

    const-wide v0, 0x194230c2575166f9L    # 5.225844853657083E-187

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۢۢۡ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_2
    return-object p0

    :pswitch_3
    sget-object p0, LYue/ۥ۟ۢۢۡ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x7edf23a6f08e4L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۢۢۡ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_3
    return-object p0

    :pswitch_4
    sget-object p0, LYue/ۥ۟ۢۢۡ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_4

    const-wide v0, -0x145ffb5442938f2eL    # -2.6330671394671704E210

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۢۢۡ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_4
    return-object p0

    :pswitch_5
    sget-object p0, LYue/ۥ۟ۢۢۡ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, 0x1faac898d0c61dfaL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۢۢۡ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_5
    return-object p0

    :pswitch_6
    sget-object p0, LYue/ۥ۟ۢۢۡ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_6

    const-wide v0, -0x32e6b6337ef51cfbL    # -2.6007484133390018E63

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۢۢۡ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_6
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
    .locals 7

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0}, LYue/ۥ۟ۢۢۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    invoke-static {v2}, LYue/ۥ۟ۢۢۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_0

    :cond_0
    const/4 v3, 0x4

    const/4 v4, 0x0

    :try_start_0
    new-instance v5, LYue/ۥۣ۠ۡۧ;

    invoke-direct {v5}, LYue/ۥۣ۠ۡۧ;-><init>()V

    iget-object v6, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object v6, v6, v0

    invoke-virtual {v5, v6}, LYue/ۥۣ۠ۡۧ;->ۥۣ۟۟۟(Ljava/lang/Object;)LYue/ۥۣ۠ۡۧ;

    move-result-object v5

    invoke-virtual {v5, v4}, LYue/ۥۣ۠ۡۧ;->ۥ۟۟۟ۥ(Ljava/lang/Class;)LYue/ۥۣ۠ۡۧ;

    move-result-object v5

    const/4 v6, 0x2

    invoke-static {v6}, LYue/ۥ۟ۢۢۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, LYue/ۥۣ۠ۡۧ;->ۥ۟(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    new-instance v6, LYue/ۥۣ۠ۡۧ;

    invoke-direct {v6}, LYue/ۥۣ۠ۡۧ;-><init>()V

    invoke-virtual {v6, v5}, LYue/ۥۣ۠ۡۧ;->ۥۣ۟۟۟(Ljava/lang/Object;)LYue/ۥۣ۠ۡۧ;

    move-result-object v5

    const/4 v6, 0x3

    invoke-static {v6}, LYue/ۥ۟ۢۢۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, LYue/ۥۣ۠ۡۧ;->ۥ۟۟۟ۡ(Ljava/lang/String;)LYue/ۥۣ۠ۡۧ;

    move-result-object v5

    invoke-virtual {v5, v4}, LYue/ۥۣ۠ۡۧ;->ۥ۟۟۟ۥ(Ljava/lang/Class;)LYue/ۥۣ۠ۡۧ;

    move-result-object v5

    invoke-static {v3}, LYue/ۥ۟ۢۢۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6, v1}, LYue/ۥۣ۠ۡۧ;->ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    :try_start_1
    new-instance v5, LYue/ۥۣ۠ۡۧ;

    invoke-direct {v5}, LYue/ۥۣ۠ۡۧ;-><init>()V

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object p1, p1, v0

    invoke-virtual {v5, p1}, LYue/ۥۣ۠ۡۧ;->ۥۣ۟۟۟(Ljava/lang/Object;)LYue/ۥۣ۠ۡۧ;

    move-result-object p1

    invoke-virtual {p1, v4}, LYue/ۥۣ۠ۡۧ;->ۥ۟۟۟ۥ(Ljava/lang/Class;)LYue/ۥۣ۠ۡۧ;

    move-result-object p1

    const/4 v0, 0x5

    invoke-static {v0}, LYue/ۥ۟ۢۢۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, LYue/ۥۣ۠ۡۧ;->ۥ۟(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    new-instance v0, LYue/ۥۣ۠ۡۧ;

    invoke-direct {v0}, LYue/ۥۣ۠ۡۧ;-><init>()V

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۡۧ;->ۥۣ۟۟۟(Ljava/lang/Object;)LYue/ۥۣ۠ۡۧ;

    move-result-object p1

    invoke-virtual {p1, v4}, LYue/ۥۣ۠ۡۧ;->ۥ۟۟۟ۥ(Ljava/lang/Class;)LYue/ۥۣ۠ۡۧ;

    move-result-object p1

    invoke-static {v3}, LYue/ۥ۟ۢۢۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, LYue/ۥۣ۠ۡۧ;->ۥ۟۟۟ۢ(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x6

    invoke-static {v1}, LYue/ۥ۟ۢۢۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, LYue/ۥۡۢ۟ۡ;->ۥۣ۟۟۟(Ljava/lang/String;I)V

    :cond_1
    :goto_0
    return-void
.end method
