.class public LYue/ۥ۟ۤۨ۠$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۤۨ۠;->load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟ۤۨ۠;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۤۨ۠;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۤۨ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۤۨ۠;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_qaq()V
    .locals 0

    return-void
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-static {}, LYue/ۥۢۤ۠ۧ;->ۥ۟۟۟ۡ()V

    const/4 p1, 0x0

    invoke-static {p1}, LYue/ۥ۟ۤۨ۠;->ۥ۟۟۟۟(Z)Z

    invoke-static {p1}, LYue/ۥ۟ۤۨ۠;->ۥ۟۟۟۠(Z)V

    return-void
.end method
