.class public LYue/ۥ۟ۤۤۥ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۤۤۥ;->load(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/ClassLoader;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۟ۤۤۥ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۤۤۥ;Ljava/lang/ClassLoader;)V
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

    iput-object p1, p0, LYue/ۥ۟ۤۤۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۤۤۥ;

    iput-object p2, p0, LYue/ۥ۟ۤۤۥ$ۥ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    :try_start_0
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۟ۤۤۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۤۤۥ;

    iget-object v1, p0, LYue/ۥ۟ۤۤۥ$ۥ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    invoke-static {v0, p1, v1}, LYue/ۥ۟ۤۤۥ;->ۥ(LYue/ۥ۟ۤۤۥ;Ljava/lang/Object;Ljava/lang/ClassLoader;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Field;

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    const-class v1, Ljava/util/ArrayList;

    invoke-static {p1, v0, v1}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    sget-object v0, LYue/ۥ۟ۤۤۥ;->ۥ:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    sget-object v1, LYue/ۥ۟ۤۤۥ;->ۥ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-le v0, v1, :cond_1

    sput-object p1, LYue/ۥ۟ۤۤۥ;->ۥ:Ljava/util/List;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    sput-object p1, LYue/ۥ۟ۤۤۥ;->ۥ:Ljava/util/List;

    :cond_1
    :goto_0
    iget-object p1, p0, LYue/ۥ۟ۤۤۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۤۤۥ;

    invoke-static {p1}, LYue/ۥ۟ۤۤۥ;->ۥ۟(LYue/ۥ۟ۤۤۥ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۡۢ۟ۡ;->ۥ۟۟۟ۤ(Ljava/lang/String;)V

    :goto_2
    return-void
.end method
