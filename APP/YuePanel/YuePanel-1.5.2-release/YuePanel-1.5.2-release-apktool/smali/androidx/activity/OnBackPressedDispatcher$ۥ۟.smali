.class public final Landroidx/activity/OnBackPressedDispatcher$ۥ۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/OnBackPressedDispatcher;-><init>(Ljava/lang/Runnable;LYue/ۥ۟ۧ۠ۧ;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "LYue/\u06e5\u06df\u06e2\u06e4\u06e5;",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroidx/activity/OnBackPressedDispatcher;


# direct methods
.method public constructor <init>(Landroidx/activity/OnBackPressedDispatcher;)V
    .locals 0

    iput-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟;->ۥۣ۟۟۠:Landroidx/activity/OnBackPressedDispatcher;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥ۟ۢۤۥ;

    invoke-virtual {p0, p1}, Landroidx/activity/OnBackPressedDispatcher$ۥ۟;->ۥ۟۟(LYue/ۥ۟ۢۤۥ;)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public final ۥ۟۟(LYue/ۥ۟ۢۤۥ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۢۤۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "backEvent"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$ۥ۟;->ۥۣ۟۟۠:Landroidx/activity/OnBackPressedDispatcher;

    invoke-static {v0, p1}, Landroidx/activity/OnBackPressedDispatcher;->ۥ۟۟۟(Landroidx/activity/OnBackPressedDispatcher;LYue/ۥ۟ۢۤۥ;)V

    return-void
.end method
