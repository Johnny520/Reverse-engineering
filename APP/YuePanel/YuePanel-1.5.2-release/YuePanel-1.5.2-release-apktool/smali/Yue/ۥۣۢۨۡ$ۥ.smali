.class public LYue/ۥۣۢۨۡ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۢۨۡ;->load(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟ۤۧ۠;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۣۢۨۡ;


# direct methods
.method public constructor <init>(LYue/ۥۣۢۨۡ;LYue/ۥ۟ۤۧ۠;)V
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

    iput-object p1, p0, LYue/ۥۣۢۨۡ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣۢۨۡ;

    iput-object p2, p0, LYue/ۥۣۢۨۡ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۧ۠;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣۢۨۡ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۧ۠;

    invoke-virtual {v0}, LYue/ۥ۟ۤۧ۠;->ۥ۟۟۟۠()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, LYue/ۥۣۣۢۧ;->ۥ۟۟(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/String;)V

    return-void
.end method
