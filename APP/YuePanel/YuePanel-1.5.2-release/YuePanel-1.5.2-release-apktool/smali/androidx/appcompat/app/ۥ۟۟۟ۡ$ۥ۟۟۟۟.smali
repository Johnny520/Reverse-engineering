.class public Landroidx/appcompat/app/ۥ۟۟۟ۡ$ۥ۟۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/app/ۥ۟۟۟۟$ۥۣ۟۟۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/ۥ۟۟۟ۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final synthetic ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۡ;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/ۥ۟۟۟ۡ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۡ$ۥ۟۟۟۟;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۡ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreatePanelView(I)Landroid/view/View;
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Landroid/view/View;

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟۟۟ۡ$ۥ۟۟۟۟;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۡ;

    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟۟۟ۡ;->ۥۣ۟۟۟:LYue/ۥ۟ۨۤۨ;

    invoke-interface {v0}, LYue/ۥ۟ۨۤۨ;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public ۥ(I)Z
    .locals 1

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۡ$ۥ۟۟۟۟;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۡ;

    iget-boolean v0, p1, Landroidx/appcompat/app/ۥ۟۟۟ۡ;->ۥ۟۟۟ۦ:Z

    if-nez v0, :cond_0

    iget-object p1, p1, Landroidx/appcompat/app/ۥ۟۟۟ۡ;->ۥۣ۟۟۟:LYue/ۥ۟ۨۤۨ;

    invoke-interface {p1}, LYue/ۥ۟ۨۤۨ;->ۥ۟۟()V

    iget-object p1, p0, Landroidx/appcompat/app/ۥ۟۟۟ۡ$ۥ۟۟۟۟;->ۥ:Landroidx/appcompat/app/ۥ۟۟۟ۡ;

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroidx/appcompat/app/ۥ۟۟۟ۡ;->ۥ۟۟۟ۦ:Z

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
