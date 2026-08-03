.class public LYue/ۥ۟ۥۥۦ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۥۥۦ;->ۥ۟۟۠۟(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/ClassLoader;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۟ۥۥۦ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۥۥۦ;Ljava/lang/ClassLoader;)V
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

    iput-object p1, p0, LYue/ۥ۟ۥۥۦ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۥۥۦ;

    iput-object p2, p0, LYue/ۥ۟ۥۥۦ$ۥ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

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

    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, LYue/ۥ۟ۥۥۦ;->ۥ۟۟۟ۤ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, LYue/ۥ۟ۥۥۦ;->ۥ۟۟۟ۤ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LYue/ۥ۟ۥۥۦ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۥۥۦ;

    iget-object v1, p0, LYue/ۥ۟ۥۥۦ$ۥ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    invoke-static {v0, p1, v1}, LYue/ۥ۟ۥۥۦ;->ۥ۟۟۟ۥ(LYue/ۥ۟ۥۥۦ;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    :cond_1
    return-void
.end method
