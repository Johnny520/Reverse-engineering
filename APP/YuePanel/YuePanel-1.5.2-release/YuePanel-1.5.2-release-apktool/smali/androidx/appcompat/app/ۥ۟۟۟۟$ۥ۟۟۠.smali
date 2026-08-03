.class public Landroidx/appcompat/app/ۥ۟۟۟۟$ۥ۟۟۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x21
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/ۥ۟۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06e0"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-static {p0}, LYue/ۥ۟ۡ۠ۨ;->ۥ(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟(Ljava/lang/Object;Landroidx/appcompat/app/ۥ۟۟۟۟;)Landroid/window/OnBackInvokedCallback;
    .locals 1
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LYue/ۥ۟ۡۡ۟;

    invoke-direct {v0, p1}, LYue/ۥ۟ۡۡ۟;-><init>(Landroidx/appcompat/app/ۥ۟۟۟۟;)V

    invoke-static {p0}, LYue/ۥ۟ۡ۠ۦ;->ۥ(Ljava/lang/Object;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object p0

    const p1, 0xf4240

    invoke-static {p0, p1, v0}, LYue/ۥ۟ۡۡ;->ۥ(Landroid/window/OnBackInvokedDispatcher;ILandroid/window/OnBackInvokedCallback;)V

    return-object v0
.end method

.method public static ۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation build LYue/ۥ۠۟ۧۤ;
    .end annotation

    invoke-static {p1}, LYue/ۥ۟ۡ۠ۥ;->ۥ(Ljava/lang/Object;)Landroid/window/OnBackInvokedCallback;

    move-result-object p1

    invoke-static {p0}, LYue/ۥ۟ۡ۠ۦ;->ۥ(Ljava/lang/Object;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object p0

    invoke-static {p0, p1}, LYue/ۥ۟ۡ۠ۧ;->ۥ(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V

    return-void
.end method
