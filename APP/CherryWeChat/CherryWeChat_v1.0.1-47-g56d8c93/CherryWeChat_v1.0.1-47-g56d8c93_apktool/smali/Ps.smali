.class public final LPs;
.super LZk;
.source ""


# static fields
.field public static final b:LPs;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, LPs;

    new-instance v1, LZz;

    const-wide v2, -0x38efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x393fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x3a3fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0x3aafffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    const/16 v8, 0x64

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, LZz;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lvx;I)V

    invoke-direct {v0, v1}, LZk;-><init>(LZz;)V

    sput-object v0, LPs;->b:LPs;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    const-wide v0, -0x249fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LOs;

    invoke-direct {v1}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    const-class v2, Landroid/content/Intent;

    filled-new-array {v2, v1}, [Ljava/lang/Object;

    move-result-object v1

    const-class v2, Landroid/app/Activity;

    invoke-static {v2, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    const-wide v0, -0x3bafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
