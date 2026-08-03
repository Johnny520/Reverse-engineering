.class public LYue/ۥۣۡۤۦ$ۥ۟;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۡۤۦ;->load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣۡۤۦ;


# direct methods
.method public constructor <init>(LYue/ۥۣۡۤۦ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣۡۤۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣۡۤۦ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-static {}, LYue/ۥۣۡۤۦ;->ۥ()I

    move-result v0

    if-ne p1, v0, :cond_0

    invoke-static {}, Lcom/yuexin/panel/ۥ;->ۥ۟۟ۡ۟()V

    :cond_0
    return-void
.end method
