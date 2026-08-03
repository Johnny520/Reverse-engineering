.class public LYue/ۥۣۣۡ$ۥ;
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

    iput-object p1, p0, LYue/ۥۣۣۡ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣۣۡ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥۣۣۡ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, -0x488c9cf83ad7b93eL    # -1.3909373621680352E-41

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣۣۡ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_1
    return-object p0
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, LYue/ۥۢۤۧۧ;->ۥ۟۟۟ۢ(Landroid/view/View;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, LYue/ۥۣۣۡ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    check-cast v1, Landroid/widget/TextView;

    iget-object p1, p0, LYue/ۥۣۣۡ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣۣۡ;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, LYue/ۥۣۣۡ;->ۥ۟۟(LYue/ۥۣۣۡ;Ljava/lang/String;)V

    :cond_1
    return-void
.end method
