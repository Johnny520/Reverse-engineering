.class public LYue/ۥ۠۟ۥۨ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠۟ۥۨ;->load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۠۟ۥۨ;


# direct methods
.method public constructor <init>(LYue/ۥ۠۟ۥۨ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠۟ۥۨ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠۟ۥۨ;

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

    iget-object v0, p0, LYue/ۥ۠۟ۥۨ$ۥ;->ۥۣ۟۟۠:LYue/ۥ۠۟ۥۨ;

    invoke-static {v0, p1}, LYue/ۥ۠۟ۥۨ;->ۥ۟۟۟۠(LYue/ۥ۠۟ۥۨ;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    return-void
.end method
