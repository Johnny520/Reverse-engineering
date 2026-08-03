.class public LYue/ۥۡۧ۟ۦ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۧ۟ۦ;->load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡۧ۟ۦ;


# direct methods
.method public constructor <init>(LYue/ۥۡۧ۟ۦ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۧ۟ۦ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۧ۟ۦ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LYue/ۥۡۧ۟ۦ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۧ۟ۦ;

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object p1, p1, v1

    check-cast p1, Ljava/util/Set;

    invoke-static {v0, p1}, LYue/ۥۡۧ۟ۦ;->ۥ۟۟۟ۢ(LYue/ۥۡۧ۟ۦ;Ljava/util/Set;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
