.class public LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۥۧۧ;->ۥ۟۟ۢ۟(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟ۥۧۧ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۥۧۧ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۥۧۧ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x293527118fdda363L    # 3.518241063833272E-110

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_1
    return-object p0
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۟ۥۧۧ;->ۥ۟۟۠ۦ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۥۧۧ;

    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object v0, v2, v0

    const/4 v2, 0x1

    invoke-static {v1, v0, v2}, LYue/ۥ۟ۥۧۧ;->ۥ۟۟۟ۦ(LYue/ۥ۟ۥۧۧ;Ljava/lang/Object;I)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
