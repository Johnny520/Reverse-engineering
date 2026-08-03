.class public LYue/ۥۣۡۤۥ$ۥ۟۟;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۡۤۥ;->load(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:[I

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۣۡۤۥ;


# direct methods
.method public constructor <init>(LYue/ۥۣۡۤۥ;[I)V
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

    iput-object p1, p0, LYue/ۥۣۡۤۥ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣۡۤۥ;

    iput-object p2, p0, LYue/ۥۣۡۤۥ$ۥ۟۟;->ۥۣ۟۟۠:[I

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    iget-object p1, p0, LYue/ۥۣۡۤۥ$ۥ۟۟;->ۥۣ۟۟۠:[I

    const/4 v0, 0x0

    aput v0, p1, v0

    const/4 v1, 0x1

    aput v0, p1, v1

    return-void
.end method
