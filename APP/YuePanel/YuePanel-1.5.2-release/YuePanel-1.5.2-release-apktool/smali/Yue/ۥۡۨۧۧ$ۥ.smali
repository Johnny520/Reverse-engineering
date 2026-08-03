.class public LYue/ۥۡۨۧۧ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۨۧۧ;->ۥ۟۟۟۟(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡۨۧۧ;


# direct methods
.method public constructor <init>(LYue/ۥۡۨۧۧ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۨۧۧ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۨۧۧ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 1

    invoke-static {}, LYue/ۥۡۨۧۧ;->ۥ۟۟()Landroid/widget/Button;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {}, LYue/ۥۡۨۧۧ;->ۥ۟۟()Landroid/widget/Button;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method
