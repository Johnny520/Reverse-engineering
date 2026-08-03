.class public LYue/ۥۣ۟۠ۨ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟۠ۨ;->load(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣ۟۠ۨ;


# direct methods
.method public constructor <init>(LYue/ۥۣ۟۠ۨ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣ۟۠ۨ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۟۠ۨ;

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
    sget-object p0, LYue/ۥۣ۟۠ۨ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, -0x2b0450a44588e0bcL    # -2.4221608764157175E101

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣ۟۠ۨ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥۣ۟۠ۨ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, -0x625f4f7b6571c92L    # -9.233122569922842E278

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣ۟۠ۨ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥۣ۟۠ۨ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, 0x6e1d5907b77ea044L    # 2.6521127497349827E222

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣ۟۠ۨ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_5
    return-object p0
.end method

.method public static synthetic ۥ(Landroid/view/View;)Z
    .locals 0

    invoke-static {p0}, LYue/ۥۣ۟۠ۨ$ۥ;->ۥ۟۟۟(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟(Landroid/view/View;)Z
    .locals 0

    invoke-static {}, LYue/ۥ۠ۨۦ۠;->ۥ۟۟۟ۨ()V

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, LYue/ۥۣ۟۠ۨ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v0}, LYue/ۥۣ۟۠ۨ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-static {v0}, LYue/ۥۣ۟۠ۨ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LYue/ۥۣ۟۠ۧ;

    invoke-direct {v0}, LYue/ۥۣ۟۠ۧ;-><init>()V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_0
    return-void
.end method
