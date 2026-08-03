.class public Landroidx/appcompat/widget/ۥ۟۟۟۠$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/widget/ۥ۟$ۥ۟۟۟۠;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ۥ۟۟۟۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final synthetic ۥ:Landroidx/appcompat/widget/ۥ۟۟۟۠;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ۥ۟۟۟۠;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠$ۥ۟;->ۥ:Landroidx/appcompat/widget/ۥ۟۟۟۠;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(Landroidx/appcompat/widget/ۥ۟;Landroid/content/Intent;)Z
    .locals 1

    iget-object p1, p0, Landroidx/appcompat/widget/ۥ۟۟۟۠$ۥ۟;->ۥ:Landroidx/appcompat/widget/ۥ۟۟۟۠;

    iget-object v0, p1, Landroidx/appcompat/widget/ۥ۟۟۟۠;->ۥۣ۟۟۟:Landroidx/appcompat/widget/ۥ۟۟۟۠$ۥ;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Landroidx/appcompat/widget/ۥ۟۟۟۠$ۥ;->ۥ(Landroidx/appcompat/widget/ۥ۟۟۟۠;Landroid/content/Intent;)Z

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
