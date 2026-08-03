.class public LYue/ۥ۠ۤۥۢ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۤۥۢ;->load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
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
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۠ۤۥۢ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۤۥۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۤۥۢ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠ۤۥۢ;

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
    sget-object p0, LYue/ۥ۠ۤۥۢ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, -0x36303f4cdcede84dL    # -3.6255212401354138E47

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۤۥۢ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥ۠ۤۥۢ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, -0x14ab66604bfa5a47L    # -1.0581961858963978E209

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۤۥۢ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥ۠ۤۥۢ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, 0x4787fcf3bcd40471L    # 3.985705787181034E36

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۤۥۢ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_5
    return-object p0

    :cond_6
    sget-object p0, LYue/ۥ۠ۤۥۢ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, 0x74baa8cff01e4e74L    # 1.9545514250892047E254

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۤۥۢ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_7
    return-object p0
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v3}, LYue/ۥ۠ۤۥۢ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v3}, LYue/ۥ۠ۤۥۢ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_1
    const/4 v3, 0x1

    invoke-static {v3}, LYue/ۥ۠ۤۥۢ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {v3}, LYue/ۥ۠ۤۥۢ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_2
    const/4 v3, 0x2

    invoke-static {v3}, LYue/ۥ۠ۤۥۢ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {v3}, LYue/ۥ۠ۤۥۢ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_3
    const/4 v3, 0x3

    invoke-static {v3}, LYue/ۥ۠ۤۥۢ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v3}, LYue/ۥ۠ۤۥۢ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    return-void
.end method
