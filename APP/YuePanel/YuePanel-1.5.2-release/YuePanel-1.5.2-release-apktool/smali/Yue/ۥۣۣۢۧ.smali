.class public LYue/ۥۣۣۢۧ;
.super Ljava/lang/Object;


# static fields
.field public static ۥ:Z

.field public static volatile synthetic ۥ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۠:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8e

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static ۥ(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥۣۣۢۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LYue/ۥ۠۟ۥ۠;->ۥ۟۟۠ۧ:LYue/ۥ۠۟ۥ۠;

    invoke-virtual {v0}, LYue/ۥ۠۟ۥ۠;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۡۢۡ;->ۥ۟۟۠(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    invoke-static {v0}, LYue/ۥۣۣۢۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static ۥ۟(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 1

    invoke-static {}, LYue/ۥ۟ۤۨ۠;->ۥ۟۟۠ۨ()V

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥۣۣۢۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LYue/ۥ۠۟ۥ۠;->ۥ۟۟۠ۦ:LYue/ۥ۠۟ۥ۠;

    invoke-virtual {v0}, LYue/ۥ۠۟ۥ۠;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۡۢۡ;->ۥ۟۟۠(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v0}, LYue/ۥۣۣۢۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static ۥ۟۟(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x3

    invoke-static {v0}, LYue/ۥۣۣۢۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    invoke-static {v0}, LYue/ۥۣۣۢۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    invoke-static {v0}, LYue/ۥۣۣۢۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method
