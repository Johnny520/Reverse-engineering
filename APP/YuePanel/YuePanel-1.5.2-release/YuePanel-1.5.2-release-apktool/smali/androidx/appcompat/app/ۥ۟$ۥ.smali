.class public Landroidx/appcompat/app/ۥ۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/app/ۥ۟;-><init>(Landroid/app/Activity;Landroidx/appcompat/widget/Toolbar;LYue/ۥ۠۠ۢ;LYue/ۥ۠۠ۡۨ;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/ۥ۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Landroidx/appcompat/app/ۥ۟$ۥ;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/ۥ۟$ۥ;->ۥۣ۟۟۠:Landroidx/appcompat/app/ۥ۟;

    iget-boolean v1, v0, Landroidx/appcompat/app/ۥ۟;->ۥ۟۟۟۠:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/appcompat/app/ۥ۟;->ۥ۟۟۠ۡ()V

    goto :goto_0

    :cond_0
    iget-object v0, v0, Landroidx/appcompat/app/ۥ۟;->ۥ۟۟۟ۤ:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_1
    :goto_0
    return-void
.end method
