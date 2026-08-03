.class public LYue/ۥ۠ۦۧ۠$ۥ۟۟;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۦۧ۠;->ۥ۟(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/reflect/Method;

.field public final synthetic ۥ۟۟۠ۤ:Ljava/lang/ClassLoader;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥ۠ۦۧ۠;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۦۧ۠;Ljava/lang/reflect/Method;Ljava/lang/ClassLoader;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۦۧ۠$ۥ۟۟;->ۥ۟۟۠ۥ:LYue/ۥ۠ۦۧ۠;

    iput-object p2, p0, LYue/ۥ۠ۦۧ۠$ۥ۟۟;->ۥۣ۟۟۠:Ljava/lang/reflect/Method;

    iput-object p3, p0, LYue/ۥ۠ۦۧ۠$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/ClassLoader;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۦۧ۠$ۥ۟۟;->ۥۣ۟۟۠:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LYue/ۥ۠ۦۧ۠$ۥ۟۟;->ۥ۟۟۠ۥ:LYue/ۥ۠ۦۧ۠;

    iget-object v2, p0, LYue/ۥ۠ۦۧ۠$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/ClassLoader;

    invoke-static {v1, p1, v2, v0}, LYue/ۥ۠ۦۧ۠;->ۥ(LYue/ۥ۠ۦۧ۠;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/ClassLoader;Ljava/lang/String;)V

    return-void
.end method
