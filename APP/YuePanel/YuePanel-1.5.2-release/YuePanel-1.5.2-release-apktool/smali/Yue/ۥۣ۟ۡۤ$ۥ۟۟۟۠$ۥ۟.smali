.class public LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;->ۥ۟۟۟ۦ(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    iget-object v0, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;

    iget-object v1, v0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;->ۥ۟۟ۤۨ:LYue/ۥۣ۟ۡۤ;

    invoke-virtual {v0, v1}, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;->ۥ۟۟ۤۧ(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;

    invoke-virtual {v0}, LYue/ۥ۠ۧۢۤ;->dismiss()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;

    invoke-virtual {v0}, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;->ۥ۟۟ۤۦ()V

    iget-object v0, p0, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;

    invoke-static {v0}, LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;->ۥ۟۟ۤۥ(LYue/ۥۣ۟ۡۤ$ۥ۟۟۟۠;)V

    :goto_0
    return-void
.end method
