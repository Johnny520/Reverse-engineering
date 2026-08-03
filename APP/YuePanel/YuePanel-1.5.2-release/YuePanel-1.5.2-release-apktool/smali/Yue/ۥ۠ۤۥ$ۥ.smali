.class public LYue/ۥ۠ۤۥ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۤۥ;->ۥ(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟ۤۧ۠;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۠ۤۥ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۤۥ;LYue/ۥ۟ۤۧ۠;)V
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

    iput-object p1, p0, LYue/ۥ۠ۤۥ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۤۥ;

    iput-object p2, p0, LYue/ۥ۠ۤۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۧ۠;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 2

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    iget-object v0, p0, LYue/ۥ۠ۤۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۧ۠;

    invoke-virtual {v0}, LYue/ۥ۟ۤۧ۠;->ۥ۟۟۟۟()Ljava/util/List;

    move-result-object v0

    const-class v1, Ljava/lang/String;

    invoke-static {v0, v1}, LYue/ۥۡۡۨۧ;->ۥ(Ljava/util/List;Ljava/lang/Class;)I

    move-result v0

    aget-object p1, p1, v0

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    return-void

    :cond_0
    sput-object p1, LYue/ۥ۟ۦۣۨ;->ۥ۟۟۟۟:Ljava/lang/String;

    return-void
.end method
